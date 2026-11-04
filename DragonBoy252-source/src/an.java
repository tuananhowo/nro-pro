/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class an {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static boolean i;
    public static boolean j;
    public static int k;
    public static boolean l;
    public static boolean m;

    public static boolean a(int n2, int n3) {
        return co.m().aR != null && co.m().aR.c == n2 && co.m().aR.a == 0;
    }

    public static void a() {
        if (main.a.G.a) {
            i = false;
        }
        if (cw.v() != null) {
            a = cw.v().N;
            b = cw.v().O;
            k = 0;
            j = true;
            c = main.a.e ? 1 : 0;
        }
    }

    public static void a(int n2) {
        if (main.a.G.a) {
            return;
        }
        if (bo.a.size() - 1 < n2) {
            return;
        }
        bo bo2 = (bo)bo.a.elementAt(n2);
        a = bo2.d + bo2.b / 2;
        b = bo2.e + 30;
        i = !bo2.k && bo2.j;
        c = 0;
        j = true;
        k = 0;
        if (!main.a.e) {
            i = false;
        }
    }

    public static void b() {
        dh dh2;
        c = 1;
        if (main.a.G.a) {
            i = false;
        }
        boolean bl2 = false;
        int n2 = 0;
        while (n2 < cw.G.size()) {
            dh2 = (dh)cw.G.elementAt(n2);
            if (dh2.g) {
                bl2 = true;
                break;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < cw.G.size()) {
            dh2 = (dh)cw.G.elementAt(n2);
            if (dh2.g) {
                a = dh2.p;
                b = dh2.q + 5;
                j = true;
                if (dh2.s != 0) break;
                dh2.g = false;
                return;
            }
            if (!bl2) {
                if (dh2.s == 0) {
                    dh2.g = false;
                } else {
                    dh2.g = true;
                    return;
                }
            }
            ++n2;
        }
    }

    public static boolean c() {
        if (main.a.G.a) {
            i = false;
        }
        int n2 = 0;
        while (n2 < cw.F.size()) {
            as as2 = (as)cw.F.elementAt(n2);
            if (as2.c == co.m().V && as2.e.a == 73) {
                c = 1;
                a = as2.a;
                b = as2.b + 5;
                j = true;
                return true;
            }
            ++n2;
        }
        return false;
    }
}

