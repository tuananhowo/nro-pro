/*
 * Decompiled with CFR 0.152.
 */
public final class h {
    public static eq a = new eq("vEff");

    public static void a(i i2) {
        a.addElement(i2);
    }

    public static void a(int n2) {
        if (h.b(n2) != null) {
            a.removeElement(h.b(n2));
        }
    }

    private static i b(int n2) {
        int n3 = 0;
        while (n3 < a.size()) {
            i i2 = (i)a.elementAt(n3);
            if (i2.a == n2) {
                return i2;
            }
            ++n3;
        }
        return null;
    }

    public static void a(eh eh2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < a.size()) {
            if (((i)h.a.elementAt((int)n5)).h == -n4) {
                ((i)a.elementAt(n5)).a(eh2, n2, n3);
            }
            ++n5;
        }
    }

    public static void a(eh eh2) {
        int n2 = 0;
        while (n2 < a.size()) {
            if (((i)h.a.elementAt((int)n2)).h == 1) {
                ((i)a.elementAt(n2)).a(eh2);
            }
            ++n2;
        }
    }

    public static void b(eh eh2) {
        int n2 = 0;
        while (n2 < a.size()) {
            if (((i)h.a.elementAt((int)n2)).h == 2) {
                ((i)a.elementAt(n2)).a(eh2);
            }
            ++n2;
        }
    }

    public static void c(eh eh2) {
        int n2 = 0;
        while (n2 < a.size()) {
            if (((i)h.a.elementAt((int)n2)).h == 3) {
                ((i)a.elementAt(n2)).a(eh2);
            }
            ++n2;
        }
    }

    public static void d(eh eh2) {
        int n2 = 0;
        while (n2 < a.size()) {
            if (((i)h.a.elementAt((int)n2)).h == 4) {
                ((i)a.elementAt(n2)).a(eh2);
            }
            ++n2;
        }
    }

    public static void a() {
        int n2 = 0;
        while (n2 < a.size()) {
            ((i)a.elementAt(n2)).a();
            ++n2;
        }
    }
}

