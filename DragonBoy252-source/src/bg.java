/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public class bg
extends co {
    public bh t;
    public static bh[] u;
    public boolean v;
    private int a;
    private int b;
    public static boolean w;
    private static int c;
    public int[] x;
    private int d;
    private long e;
    private long f;
    public int y;

    static {
        int[] nArray = new int[]{1, -1, 1, -1};
        int[] nArray2 = new int[]{1, -1, -1, 1};
    }

    public bg(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.bt = true;
        this.bc = n7;
        dq.c("npc avatar= " + this.bc);
        this.N = n4;
        this.O = n5;
        this.cN = n4;
        this.cO = n5;
        this.T = n3;
        if (n2 != -1) {
            this.t = u[n6];
        }
        if (n6 == 23 || n6 == 42) {
            this.az = 45;
        }
        if (n6 == 51) {
            this.bt = false;
            this.a = n3;
            dq.c("duaHau = " + n3);
        }
        if (this.t != null) {
            if (this.t.b == null) {
                this.t.b = "";
            }
            this.t.b = dq.a(this.t.b);
        }
    }

    public final void a(byte by2, int n2) {
        this.a = by2;
        this.e = this.f = System.currentTimeMillis();
        this.d = n2;
        dq.c("in ra second= " + this.d);
    }

    public static void h() {
        int n2 = 0;
        while (n2 < cw.H.size()) {
            bg bg2 = (bg)cw.H.elementAt(n2);
            ((bg)cw.H.elementAt(n2)).cv = null;
            bg2.cu = -1;
            ++n2;
        }
    }

    public void a() {
        block10: {
            block13: {
                block11: {
                    block12: {
                        if (this.t.a == 51) {
                            this.f = System.currentTimeMillis();
                            if (this.f - this.e >= 1000L) {
                                --this.d;
                                this.e = this.f;
                                if (this.d < 0) {
                                    this.d = 0;
                                }
                            }
                        }
                        if (this.bt) {
                            this.J();
                        }
                        if (this.cv != null) break block10;
                        byte[] byArray = new byte[]{-1, 9, 9, 10, 10, 11, 11};
                        if (co.m().X < 9 || co.m().X > 10 || co.m().aL.a <= 0 || byArray[co.m().aL.a] != this.t.a) break block11;
                        if (co.m().aR != null) break block12;
                        this.cv = cw.z[57];
                        break block13;
                    }
                    if (co.m().aR == null || co.m().aR.a + 1 != co.m().aR.f.length) break block10;
                    this.cv = cw.z[62];
                    break block13;
                }
                cw.l();
                byte by2 = cw.A();
                if (co.m().aR == null && by2 == this.t.a) break block13;
                if (co.m().aR == null || by2 != this.t.a) break block10;
                int cfr_ignored_0 = co.m().aR.a + 1;
                int cfr_ignored_1 = co.m().aR.f.length;
                this.cv = cw.z[98];
            }
            this.cu = 0;
        }
        super.a();
        if (dx.l == 51) {
            this.U = this.N > co.m().N ? -1 : 1;
            if (this.t.a % 2 == 0) {
                if (this.aG == 1) {
                    this.aG = 0;
                    return;
                }
                this.aG = 1;
            }
        }
    }

    public void a(eh eh2) {
        if (co.cd) {
            return;
        }
        if (this.v) {
            return;
        }
        if (!this.I()) {
            return;
        }
        if (this.T == 15) {
            return;
        }
        if (this.bb != 0) {
            super.a(eh2);
            return;
        }
        if (this.t == null) {
            return;
        }
        if (this.t.a != 4 && this.t.a != 51 && this.t.a != 50) {
            eh2.a(dx.y, this.N, this.O, 3);
        }
        if (this.t.a == 3) {
            er.b(eh2, 265, this.N, this.O, 0, 33);
            if (co.m().bh != null && co.m().bh.equals(this) && g.m == null) {
                eh2.a(dh.W, 0, 0, 9, 6, 0, this.N, this.O - this.az + 4, 33);
            }
            this.b = 60;
        } else if (this.t.a != 4) {
            if (this.t.a == 50 || this.t.a == 51) {
                if (this.x != null) {
                    if (this.t.a == 50 && w) {
                        i i2;
                        ++c;
                        if (main.a.w % 3 == 0) {
                            i2 = new i(19, this.N + dq.b(-50, 50), this.O, 2, 1, -1);
                            h.a(i2);
                        }
                        if (main.a.w % 15 == 0) {
                            i2 = new i(18, this.N + dq.b(-5, 5), this.O + dq.b(-90, 0), 2, 1, -1);
                            h.a(i2);
                        }
                        if (c == 100) {
                            cw.l().b(this.N, this.O);
                        }
                        if (c == 110) {
                            w = false;
                            this.t.a = 4;
                        }
                    }
                    int n2 = 0;
                    if (er.c[this.x[this.a]] != null && er.c[this.x[this.a]].a != null) {
                        n2 = eh.b(er.c[this.x[this.a]].a);
                    }
                    er.b(eh2, this.x[this.a], this.N + dq.b(-1, 1), this.O, 0, 33);
                    if (co.m().bh != null && co.m().bh.equals(this)) {
                        if (g.m == null) {
                            eh2.a(dh.W, 0, 0, 9, 6, 0, this.N, this.O - this.az - 9 + 16 - n2, 33);
                        }
                        ev.c.a(eh2, o.b(this.d), this.N, this.O - this.az - 16 - ev.k.a() - 20 - n2 + 16, 2, ev.f);
                    } else {
                        ev.c.a(eh2, o.b(this.d), this.N, this.O - this.az - 8 - ev.k.a() - 20 - n2 + 16, 2, ev.f);
                    }
                }
            } else if (this.t.a == 6) {
                er.b(eh2, 545, this.N, this.O + 5, 0, 33);
                if (co.m().bh != null && co.m().bh.equals(this) && g.m == null) {
                    eh2.a(dh.W, 0, 0, 9, 6, 0, this.N, this.O - this.az - 9, 33);
                }
                ev.c.a(eh2, String.valueOf(dx.n), this.N, this.O - this.az + 19 - ev.k.a(), 2);
            } else {
                int n3 = this.t.c;
                int n4 = this.t.e;
                int n5 = this.t.d;
                bk bk2 = cw.y[n3];
                bk bk3 = cw.y[n4];
                bk bk4 = cw.y[n5];
                if (this.U == 1) {
                    er.b(eh2, bk2.a[co.bT[this.aG][0][0]].a, this.N + co.bT[this.aG][0][1] + bk2.a[co.bT[this.aG][0][0]].b, this.O - co.bT[this.aG][0][2] + bk2.a[co.bT[this.aG][0][0]].c, 0, 0);
                    er.b(eh2, bk3.a[co.bT[this.aG][1][0]].a, this.N + co.bT[this.aG][1][1] + bk3.a[co.bT[this.aG][1][0]].b, this.O - co.bT[this.aG][1][2] + bk3.a[co.bT[this.aG][1][0]].c, 0, 0);
                    er.b(eh2, bk4.a[co.bT[this.aG][2][0]].a, this.N + co.bT[this.aG][2][1] + bk4.a[co.bT[this.aG][2][0]].b, this.O - co.bT[this.aG][2][2] + bk4.a[co.bT[this.aG][2][0]].c, 0, 0);
                } else {
                    er.b(eh2, bk2.a[co.bT[this.aG][0][0]].a, this.N - co.bT[this.aG][0][1] - bk2.a[co.bT[this.aG][0][0]].b, this.O - co.bT[this.aG][0][2] + bk2.a[co.bT[this.aG][0][0]].c, 2, 24);
                    er.b(eh2, bk3.a[co.bT[this.aG][1][0]].a, this.N - co.bT[this.aG][1][1] - bk3.a[co.bT[this.aG][1][0]].b, this.O - co.bT[this.aG][1][2] + bk3.a[co.bT[this.aG][1][0]].c, 2, 24);
                    er.b(eh2, bk4.a[co.bT[this.aG][2][0]].a, this.N - co.bT[this.aG][2][1] - bk4.a[co.bT[this.aG][2][0]].b, this.O - co.bT[this.aG][2][2] + bk4.a[co.bT[this.aG][2][0]].c, 2, 24);
                }
                if (dx.l != 51) {
                    int n6 = 15;
                    if (this.t.a == 47) {
                        n6 = 47;
                    }
                    if (co.m().bh != null && co.m().bh.equals(this)) {
                        if (g.m == null) {
                            int n7 = 0;
                            int n8 = 0;
                            if (co.m().bh.t.a == 28 || co.m().bh.t.a == 41) {
                                n7 = 3;
                                n8 = -12;
                            }
                            eh2.a(dh.W, 0, 0, 9, 6, 0, this.N + n7, this.O - this.az - (n6 - 8) + n8, 33);
                        }
                    } else {
                        int cfr_ignored_0 = this.t.a;
                    }
                }
                this.b = 65;
            }
        }
        if (this.cu >= 0 && this.cv != null && this.bb == 0) {
            er.b(eh2, this.cv.a[this.cu].c, this.N + this.cv.a[this.cu].a, this.O + this.cv.a[this.cu].b - this.b, 0, 3);
            if (main.a.w % 2 == 0) {
                ++this.cu;
                if (this.cu >= this.cv.a.length) {
                    this.cu = 0;
                }
            }
        }
    }

    public final void b(eh eh2) {
        if (co.cd) {
            return;
        }
        if (this.v) {
            return;
        }
        if (!this.I()) {
            return;
        }
        if (this.T == 15) {
            return;
        }
        if (this.t == null) {
            return;
        }
        if (this.t.a == 3) {
            if (co.m().bh != null && co.m().bh.equals(this)) {
                ev.n.a(eh2, this.t.b, this.N, this.O - this.az - ev.k.a() - 5, 2, ev.o);
            } else {
                ev.n.a(eh2, this.t.b, this.N, this.O - this.az - 3 - ev.k.a(), 2, ev.o);
            }
            this.b = 60;
            return;
        }
        if (this.t.a != 4) {
            if (this.t.a == 50 || this.t.a == 51) {
                if (this.x != null) {
                    int n2 = 0;
                    if (er.c[this.x[this.a]] != null && er.c[this.x[this.a]].a != null) {
                        n2 = eh.b(er.c[this.x[this.a]].a);
                    }
                    if (co.m().bh != null && co.m().bh.equals(this)) {
                        ev.n.a(eh2, this.t.b, this.N, this.O - this.az - ev.k.a() - n2, 2, ev.o);
                        return;
                    }
                    ev.n.a(eh2, this.t.b, this.N, this.O - this.az - 8 - ev.k.a() - n2 + 16, 2, ev.o);
                    return;
                }
            } else {
                if (this.t.a == 6) {
                    if (co.m().bh != null && co.m().bh.equals(this)) {
                        ev.n.a(eh2, this.t.b, this.N, this.O - this.az - ev.k.a() - 16, 2, ev.o);
                        return;
                    }
                    ev.n.a(eh2, this.t.b, this.N, this.O - this.az - 8 - ev.k.a(), 2, ev.o);
                    return;
                }
                if (dx.l != 51) {
                    int n3 = 15;
                    if (this.t.a == 47) {
                        n3 = 47;
                    }
                    if (co.m().bh != null && co.m().bh.equals(this)) {
                        if (dx.l != 113) {
                            int n4 = 0;
                            int n5 = 0;
                            if (co.m().bh.t.a == 28 || co.m().bh.t.a == 41) {
                                n4 = 3;
                                n5 = -12;
                            }
                            ev.n.a(eh2, this.t.b, this.N + n4, this.O - this.az - ev.k.a() - n3 + n5, 2, ev.o);
                        }
                    } else {
                        n3 = 8;
                        if (this.t.a == 47) {
                            n3 = 40;
                        }
                        if (dx.l != 113) {
                            int n6 = 0;
                            int n7 = 0;
                            if (this.t.a == 28 || this.t.a == 41) {
                                n6 = 3;
                                n7 = -12;
                            }
                            ev.n.a(eh2, this.t.b, this.N + n6, this.O - this.az - n3 - ev.k.a() + n7, 2, ev.o);
                        }
                    }
                }
                this.b = 65;
            }
        }
    }

    public final void i() {
        this.T = 15;
        co.J = null;
    }
}

