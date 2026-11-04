/*
 * Decompiled with CFR 0.152.
 */
package main;

import java.io.IOException;

public final class c {
    private static String a = "";
    private static boolean b;

    private c() {
    }

    /*
     * Unable to fully structure code
     */
    public static synchronized String a() {
        block19: {
            block20: {
                block18: {
                    block17: {
                        if (c.b) break block19;
                        var0 = null;
                        var0 = "".getClass().getResourceAsStream("/login_codes_generated.txt");
                        if (var0 != null) break block17;
                        if (var0 == null) ** GOTO lbl50
                        try {
                            var0.close();
                        }
                        catch (IOException v0) {}
                        break block20;
                    }
                    try {
                        try {
                            var1_1 = new StringBuffer(96);
                            while ((var2_4 = var0.read()) != -1) {
                                if (var2_4 == 13) continue;
                                if (var2_4 == 10) {
                                    c.a(var1_1.toString());
                                    var1_1.setLength(0);
                                    continue;
                                }
                                if (var2_4 >= 128) continue;
                                var1_1.append((char)var2_4);
                            }
                            if (var1_1.length() <= 0) break block18;
                            c.a(var1_1.toString());
                        }
                        catch (IOException var1_2) {
                            dq.b("Unable to read login_codes_generated.txt: " + var1_2.toString());
                            if (var0 == null) ** GOTO lbl50
                            try {
                                var0.close();
                            }
                            catch (IOException v1) {}
                        }
                    }
                    catch (Throwable var1_3) {
                        if (var0 != null) {
                            try {
                                var0.close();
                            }
                            catch (IOException v2) {}
                        }
                        throw var1_3;
                    }
                }
                if (var0 != null) {
                    try {
                        var0.close();
                    }
                    catch (IOException v3) {}
                }
            }
            c.b = true;
        }
        return c.a;
    }

    private static void a(String string) {
        boolean bl2;
        block6: {
            int n2 = string.indexOf(58);
            if (n2 < 0) {
                return;
            }
            String string2 = string = string.substring(n2 + 1).trim();
            if (string == null || string2.length() != 32) {
                bl2 = false;
            } else {
                int n3 = 0;
                while (n3 < string2.length()) {
                    char c2 = string2.charAt(n3);
                    if (!(c2 >= '0' && c2 <= '9' || c2 >= 'a' && c2 <= 'f' || c2 >= 'A' && c2 <= 'F')) {
                        bl2 = false;
                        break block6;
                    }
                    ++n3;
                }
                bl2 = true;
            }
        }
        if (bl2) {
            a = string;
        }
    }
}

