/*
 * Decompiled with CFR 0.152.
 */
public final class b {
    public int a;
    public String b;
    public short[] c;
    public int d;
    public int e;
    public static eq f = new eq("vClanImage");
    public static ep g = new ep("h id images");

    public static void a(b b2) {
        cj.a().b((byte)b2.a);
        f.addElement(b2);
    }

    public static b a(short s2) {
        int n2 = 0;
        while (n2 < f.size()) {
            b b2 = (b)f.elementAt(n2);
            if (b2.a == s2) {
                return b2;
            }
            ++n2;
        }
        return null;
    }

    public static boolean a(int n2) {
        int n3 = 0;
        while (n3 < f.size()) {
            b b2 = (b)f.elementAt(n3);
            if (b2.a == n2) {
                return true;
            }
            ++n3;
        }
        return false;
    }
}

