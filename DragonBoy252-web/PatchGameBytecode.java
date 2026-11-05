import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

public final class PatchGameBytecode {
    private PatchGameBytecode() {}

    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            throw new IllegalArgumentException("Expected class file, game JAR, and emulator JAR");
        }
        Path classFile = Paths.get(args[0]);
        URL[] classPath = new URL[] {
            Paths.get(args[1]).toUri().toURL(),
            Paths.get(args[2]).toUri().toURL()
        };
        try (URLClassLoader loader = new URLClassLoader(classPath, PatchGameBytecode.class.getClassLoader())) {
            byte[] input = Files.readAllBytes(classFile);
            ClassReader reader = new ClassReader(input);
            ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS) {
                @Override
                protected String getCommonSuperClass(String firstName, String secondName) {
                    try {
                        Class<?> first = Class.forName(firstName.replace('/', '.'), false, loader);
                        Class<?> second = Class.forName(secondName.replace('/', '.'), false, loader);
                        if (first.isAssignableFrom(second)) return firstName;
                        if (second.isAssignableFrom(first)) return secondName;
                        if (first.isInterface() || second.isInterface()) return "java/lang/Object";
                        do {
                            first = first.getSuperclass();
                        } while (first != null && !first.isAssignableFrom(second));
                        return first == null ? "java/lang/Object" : first.getName().replace('.', '/');
                    } catch (Throwable ignored) {
                        return "java/lang/Object";
                    }
                }
            };
            final int[] patchedCalls = {0};
            ClassVisitor visitor = new ClassVisitor(Opcodes.ASM7, writer) {
                @Override
                public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                    MethodVisitor method = super.visitMethod(access, name, descriptor, signature, exceptions);
                    if (method == null || !"a".equals(name) || !"(Leh;)V".equals(descriptor)) return method;
                    return new MethodVisitor(Opcodes.ASM7, method) {
                        @Override
                        public void visitMethodInsn(int opcode, String owner, String methodName, String methodDescriptor, boolean isInterface) {
                            if (!"co".equals(owner) || !"a".equals(methodName) || !"(Leh;)V".equals(methodDescriptor)) {
                                super.visitMethodInsn(opcode, owner, methodName, methodDescriptor, isInterface);
                                return;
                            }
                            Label start = new Label();
                            Label end = new Label();
                            Label handler = new Label();
                            Label next = new Label();
                            super.visitTryCatchBlock(start, end, handler, "java/lang/NullPointerException");
                            super.visitLabel(start);
                            super.visitMethodInsn(opcode, owner, methodName, methodDescriptor, isInterface);
                            super.visitLabel(end);
                            super.visitJumpInsn(Opcodes.GOTO, next);
                            super.visitLabel(handler);
                            super.visitInsn(Opcodes.POP);
                            super.visitLabel(next);
                            patchedCalls[0]++;
                        }
                    };
                }
            };
            reader.accept(visitor, ClassReader.EXPAND_FRAMES);
            if (patchedCalls[0] == 0) throw new IllegalStateException("No remote character draw call was found");
            Files.write(classFile, writer.toByteArray());
            System.out.println("Patched remote character draw calls: " + patchedCalls[0]);
        }
    }
}
