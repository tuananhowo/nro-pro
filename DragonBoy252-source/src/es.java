/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class es {
    public static boolean a = false;
    private static es m;
    public static float b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    private static boolean n;

    static {
        b = 0.5f;
        c = 30;
        d = 31;
        e = 32;
        f = 33;
        g = 34;
        h = 35;
        i = 36;
        j = 37;
        k = 38;
        l = 0;
        n = false;
    }

    public static es a() {
        if (m == null) {
            m = new es();
        }
        return m;
    }

    public final void b() {
        if (co.dz) {
            ea.a("isPaintAura", 0);
            co.dz = false;
        } else {
            ea.a("isPaintAura", 1);
            co.dz = true;
        }
        es.Q();
    }

    public final void c() {
        if (!main.a.e) {
            es es2 = this;
            if (cw.ci = !cw.ci) {
                ea.a("serverchat", 0);
            } else {
                ea.a("serverchat", 1);
            }
            es.Q();
            return;
        }
        es es3 = this;
        if (cw.aZ == 0) {
            cw.aZ = 1;
            ea.a("analog", cw.aZ);
            cw.o();
        } else {
            cw.aZ = 0;
            ea.a("analog", cw.aZ);
            cw.o();
        }
        es.Q();
    }

    public final void d() {
        if (main.a.a) {
            ea.a("lowGraphic", 0);
            main.a.a(ch.cP, 8885, null);
        } else {
            ea.a("lowGraphic", 1);
            main.a.a(ch.cP, 8885, null);
        }
        es.Q();
    }

    public final void e() {
        if (co.dA) {
            ea.a("isPaintAura2", 0);
            co.dA = false;
        } else {
            ea.a("isPaintAura2", 1);
            co.dA = true;
        }
        es.Q();
    }

    public static void f() {
    }

    public static void g() {
    }

    public static void h() {
    }

    public static void i() {
    }

    public static void j() {
    }

    public static void k() {
    }

    public static void l() {
    }

    public static void m() {
    }

    public static void n() {
    }

    public static void o() {
    }

    public static void p() {
    }

    public static void q() {
    }

    public static void r() {
    }

    public static void s() {
    }

    public static void t() {
    }

    public static void u() {
    }

    public static void v() {
    }

    public static void w() {
    }

    public static void x() {
    }

    public static void y() {
    }

    public static void z() {
    }

    public static void A() {
    }

    public static void B() {
    }

    public static void C() {
    }

    public static void D() {
    }

    public static void E() {
    }

    public static void F() {
    }

    public static void G() {
    }

    public static void H() {
    }

    public static boolean I() {
        return false;
    }

    public static void J() {
    }

    public static boolean K() {
        return false;
    }

    public static void L() {
        if (main.a.I.n && co.m().aR != null && co.m().aR.c >= 2) {
            dl.G = new String[]{ch.i, ch.bV, ch.bU, ch.bT, ch.aH, ch.bS, ch.ar, ch.bW, ch.U, ch.J};
            if (co.m().cj) {
                dl.G = new String[]{ch.i, ch.bV, ch.bU, ch.w, ch.bT, ch.aH, ch.bS, ch.ar, ch.bW, ch.U, ch.J};
            }
        } else {
            dl.G = new String[]{ch.i, ch.bV, ch.bU, ch.bT, ch.aH, ch.bS, ch.ar, ch.bW, ch.U};
            if (co.m().cj) {
                dl.G = new String[]{ch.i, ch.bV, ch.bU, ch.w, ch.bT, ch.aH, ch.bS, ch.ar, ch.bW, ch.U};
            }
        }
        if (a) {
            String[] stringArray = new String[dl.G.length + 1];
            int n2 = 0;
            while (n2 < dl.G.length) {
                stringArray[n2] = dl.G[n2];
                ++n2;
            }
            stringArray[dl.G.length] = ch.d;
            dl.G = stringArray;
        }
    }

    public static String M() {
        String string = l == 0 ? "[x]x1" : "[ ]x1";
        String string2 = l == 1 ? "[x]x1.5" : "[ ]x1.5";
        String string3 = l == 2 ? "[x]x2" : "[ ]x2";
        return String.valueOf(string) + "    " + string2 + "    " + string3;
    }

    public static String N() {
        String string = l == 0 ? "[x]x1" : "[ ]x1";
        String string2 = l == 1 ? "[x]x1.5" : "[ ]x1.5";
        String string3 = l == 2 ? "[x]x2" : "[ ]x2";
        return String.valueOf(ch.ca) + "  " + string + " " + string2 + " " + string3;
    }

    public static boolean O() {
        int n2;
        if (main.a.G == null) {
            return false;
        }
        int n3 = ev.f.a(es.N());
        return n3 <= (n2 = main.a.G.ag - 30);
    }

    public final void P() {
        int n2;
        int n3;
        int n4 = main.a.G.ae + 25;
        int n5 = main.a.p;
        String string = l == 0 ? "[x]x1" : "[ ]x1";
        String string2 = l == 1 ? "[x]x1.5" : "[ ]x1.5";
        if (es.O()) {
            String string3 = String.valueOf(ch.ca) + "  ";
            String string4 = " ";
            int n6 = ev.f.a(string3);
            int n7 = ev.f.a(String.valueOf(string) + string4);
            n3 = ev.f.a(String.valueOf(string2) + string4);
            n2 = n4 + n6;
            n4 = n2 + n7;
            n3 = n4 + n3;
        } else {
            String string5 = "    ";
            int n8 = ev.f.a(String.valueOf(string) + string5);
            int n9 = ev.f.a(String.valueOf(string2) + string5);
            n2 = n4;
            n3 = (n4 += n8) + n9;
        }
        l = n5 >= n3 - 6 ? 2 : (n5 >= n4 - 6 ? 1 : (n5 >= n2 - 8 ? 0 : (l + 1) % 3));
        ea.a("gameSpeed", l);
        es.Q();
    }

    public static void Q() {
        String string;
        if (!n) {
            n = true;
            l = ea.d("gameSpeed");
            if (l < 0 || l > 2) {
                l = 0;
            }
        }
        String string2 = "[x]   ";
        String string3 = "[  ]   ";
        String string4 = string = cw.aZ == 0 ? String.valueOf(string3) + ch.G : String.valueOf(string2) + ch.H;
        if (!main.a.e) {
            string = !cw.ci ? String.valueOf(string3) + ch.bZ : String.valueOf(string2) + ch.bZ;
        }
        dl.H = new String[]{co.dz ? String.valueOf(string2) + ch.ce.trim() : String.valueOf(string3) + ch.ce.trim(), co.dA ? String.valueOf(string2) + ch.cf.trim() : String.valueOf(string3) + ch.cf.trim(), main.a.an ? String.valueOf(string2) + ch.fF.trim() : String.valueOf(string3) + ch.fF.trim(), main.a.a ? String.valueOf(string2) + ch.z.trim() : String.valueOf(string3) + ch.z.trim(), string, ch.ca};
    }

    public static void R() {
    }

    public static void S() {
    }

    public static void T() {
    }

    public static void U() {
    }

    public static void V() {
    }

    public static void W() {
        eb.a().f();
        main.a.G.A();
        main.a.I.f();
        main.a.I.a();
    }

    public static void X() {
    }

    public static void Y() {
    }

    public static void Z() {
    }

    public static void aa() {
    }
}

