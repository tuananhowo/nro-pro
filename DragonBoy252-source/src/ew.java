/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public class ew {
    public ae cz;
    public ae cA;
    public ae cB;
    public static int cC;
    public static int cD;
    public static int cE;
    public static int cF;

    static {
        cD = 68;
        cE = 26;
        cF = -1;
    }

    public void a() {
        a.j();
        a.k();
        if (a.E != null) {
        }
        a.E = this;
        a.h.setFullScreenMode(true);
    }

    public void a(int n2) {
    }

    public void b() {
    }

    public void d() {
        if (a.i[5] || ew.a(a.E.cA)) {
            a.i[5] = false;
            cF = -1;
            a.m = false;
            if (this.cA != null) {
                this.cA.a();
            }
        }
        if (a.i[12] || ew.a(a.E.cz)) {
            a.i[12] = false;
            cF = -1;
            a.m = false;
            if (el.b().b) {
                if (el.b().d != null) {
                    el.b().d.a();
                }
            } else if (this.cz != null) {
                this.cz.a();
            }
        }
        if (a.i[13] || ew.a(a.E.cB)) {
            a.i[13] = false;
            cF = -1;
            a.m = false;
            if (el.b().b) {
                if (el.b().e != null) {
                    el.b().e.a();
                    return;
                }
            } else if (this.cB != null) {
                this.cB.a();
            }
        }
    }

    public static boolean a(ae ae2) {
        if (ae2 == null) {
            return false;
        }
        if (ae2.j >= 0 && ae2.k != 0) {
            return ae2.c();
        }
        if (a.K != null) {
            if (a.K.b != null && a.a(a.A - cD >> 1, a.B - cE - 5, cD, cE + 10)) {
                cF = 1;
                if (ae2 == a.K.b && a.l && a.m) {
                    return true;
                }
            }
            if (a.K.a != null && a.a(0, a.B - cE - 5, cD, cE + 10)) {
                cF = 0;
                if (ae2 == a.K.a && a.l && a.m) {
                    return true;
                }
            }
            if (a.K.c != null && a.a(a.A - cD, a.B - cE - 5, cD, cE + 10)) {
                cF = 2;
                if ((ae2 == a.K.c || ae2 == el.b().e) && a.l && a.m) {
                    return true;
                }
            }
        } else {
            if (ae2 == a.E.cz && a.a(0, a.B - cE - 5, cD, cE + 10)) {
                cF = 0;
                if (a.l && a.m) {
                    return true;
                }
            }
            if (ae2 == a.E.cB && a.a(a.A - cD, a.B - cE - 5, cD, cE + 10)) {
                cF = 2;
                if (a.l && a.m) {
                    return true;
                }
            }
            if ((ae2 == a.E.cA || g.m != null) && a.a(a.A - cD >> 1, a.B - cE - 5, cD, cE + 10)) {
                cF = 1;
                if (a.l && a.m) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(eh eh2) {
        eh2.a(-eh2.a(), -eh2.b());
        eh2.e(0, 0, a.A, a.B + 1);
        if (!el.b().b && a.K == null && !a.F.a) {
            bj.a(eh2, this.cz, this.cA, this.cB);
        }
    }
}

