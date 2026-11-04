/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class cr
extends ew
implements ao {
    public static cr a;
    private cl[] f;
    byte b = 0;
    private byte g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    int c;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w = 0;
    private int x = 0;
    private int y;
    private int z;
    private int[] A;
    private int[] B;
    private int[] C;
    private int[] D;
    private short[] E;
    private long F;
    private long G;
    private boolean H;
    private boolean I;
    private boolean J;
    private short K;
    private static int L;
    private static int[] M;
    private static dz N;
    private static dz O;
    private static Image P;
    private static Image Q;
    public static boolean d;
    public static boolean e;
    private byte[] R = new byte[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20};
    private byte[] S;

    static {
        d = false;
        e = false;
    }

    public cr() {
        byte[] byArray = new byte[12];
        byArray[3] = 1;
        byArray[4] = 1;
        byArray[5] = 1;
        byArray[6] = 2;
        byArray[7] = 2;
        byArray[8] = 2;
        byArray[9] = 3;
        byArray[10] = 3;
        byArray[11] = 3;
        this.S = byArray;
        int[] nArray = new int[3];
        M = nArray;
        nArray[0] = 16;
        L = main.a.B - 41;
        cr.M[1] = main.a.A - 40;
        cr.M[2] = (M[0] + M[1]) / 2;
        Image image = ej.b("/e/e_1.png");
        N = new dz(image, 30, 30);
        image = ej.b("/e/e_0.png");
        O = new dz(image, 68, 65);
        image = ej.b("/e/e_2.png");
        new dz(image, 66, 70);
        Q = ej.b("/e/nut2.png");
        P = ej.b("/e/nut3.png");
        this.s = 230;
        this.q = main.a.C - this.s / 2;
        this.t = 40;
        this.r = -this.t;
    }

    public static cr c() {
        if (a == null) {
            a = new cr();
        }
        return a;
    }

    public final void a(short[] sArray, byte by2, int n2, short s2) {
        if (sArray == null || sArray.length <= 0) {
            return;
        }
        this.n = co.m().O - 10;
        Object object = this;
        this.h = main.a.D / 3 + 10;
        if (((cr)object).h > 50) {
            ((cr)object).h = 50;
        }
        ((cr)object).i = 360;
        cw.j = cw.n / 2;
        ((cr)object).j = cw.k + main.a.D / 3 + 30;
        ((cr)object).m = 175;
        ((cr)object).k = 0;
        ((cr)object).l = 360 / ((cr)object).m;
        ((cr)object).A = new int[((cr)object).m];
        ((cr)object).B = new int[((cr)object).m];
        ((cr)object).C = new int[((cr)object).m];
        ((cr)object).D = new int[((cr)object).m];
        cr cr2 = object;
        if (!main.a.a) {
            int n3 = 0;
            while (n3 < cr2.B.length) {
                cr2.B[n3] = dq.g(cr2.h * dq.a(cr2.k) / 1024);
                cr2.A[n3] = dq.g(cr2.h * dq.b(cr2.k) / 1024);
                if (cr2.k < 90) {
                    cr2.C[n3] = cr2.i + cr2.A[n3];
                    cr2.D[n3] = cr2.j - cr2.B[n3];
                } else if (cr2.k >= 90 && cr2.k < 180) {
                    cr2.C[n3] = cr2.i - cr2.A[n3];
                    cr2.D[n3] = cr2.j - cr2.B[n3];
                } else if (cr2.k >= 180 && cr2.k < 270) {
                    cr2.C[n3] = cr2.i - cr2.A[n3];
                    cr2.D[n3] = cr2.j + cr2.B[n3];
                } else {
                    cr2.C[n3] = cr2.i + cr2.A[n3];
                    cr2.D[n3] = cr2.j + cr2.B[n3];
                }
                cr2.k += cr2.l;
                ++n3;
            }
        }
        this.f = new cl[sArray.length];
        int n4 = 0;
        while (n4 < this.f.length) {
            this.f[n4] = new cl();
            this.f[n4].i = sArray[n4];
            this.f[n4].e = n4 * 25;
            this.f[n4].d = -999;
            this.f[n4].g = dq.b(2, 5);
            this.f[n4].h = dq.b(-1, 2);
            object = this.f[n4];
            this.f[n4].m = new co();
            ((cl)object).m.V = dq.b(-999, -800);
            ((cl)object).m.cp = -1;
            ((cl)object).m.cr = -1;
            ((cl)object).m.cq = -1;
            ((cl)object).m.cs = -1;
            ((cl)object).m.au = "";
            ((cl)object).m.aj = 20L;
            ((cl)object).m.ag = 20L;
            ++n4;
        }
        this.I = false;
        this.H = false;
        this.J = false;
        this.F = main.a.b + (long)dq.b(1000, 2000);
        this.b = 0;
        this.o = -1;
        this.c = -1;
        this.g = by2;
        this.u = n2;
        this.v = 0;
        co.m().b(470, 408, 1);
        co.m().U = -1;
        co.m().T = 1;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.r = -this.t;
        this.K = s2;
        this.p = 0;
        this.h();
        this.a();
        es.a();
        es.H();
    }

    public final void a(int n2, Object object) {
    }

    public final void b() {
        try {
            int n2;
            this.v = this.u * this.g();
            this.h();
            cw.l().b();
            if (this.F - main.a.b > 0L) {
                int n3 = 0;
                while (n3 < this.f.length) {
                    this.f[n3].e += 2;
                    if (this.f[n3].e >= this.m) {
                        this.f[n3].e = 0;
                    }
                    this.f[n3].a = this.C[this.f[n3].e];
                    this.f[n3].b = this.D[this.f[n3].e];
                    ++n3;
                }
                return;
            }
            if (this.b == 0) {
                this.b = 1;
            }
            if (this.b == 1) {
                n2 = 0;
                while (n2 < this.f.length) {
                    if (this.f[n2].d != -999 && !this.f[n2].k) {
                        if (this.f[n2].b < this.f[n2].d) {
                            if (this.f[n2].f < 0) {
                                this.f[n2].f = 0;
                            }
                            this.f[n2].b = this.f[n2].b + this.f[n2].f > this.f[n2].d ? this.f[n2].d : (this.f[n2].b += this.f[n2].f);
                            ++this.f[n2].f;
                        } else {
                            if (this.f[n2].f > 0) {
                                this.f[n2].f = 0;
                            }
                            this.f[n2].b += this.f[n2].f;
                            --this.f[n2].f;
                        }
                        if (this.f[n2].b == this.f[n2].d) {
                            i i2 = new i(19, this.f[n2].a - 5, this.f[n2].b + 25, 2, 1, -1);
                            h.a(i2);
                            es.a();
                            es.l();
                            this.f[n2].k = true;
                            if (!this.I) {
                                this.I = true;
                            }
                        }
                    }
                    ++n2;
                }
            }
            if (this.b == 2) {
                n2 = 0;
                while (n2 < this.f.length) {
                    if (!this.f[n2].k) {
                        if (this.f[n2].b > -10) {
                            if (this.f[n2].f > 0) {
                                this.f[n2].f = 0;
                            }
                            this.f[n2].b += this.f[n2].f;
                            --this.f[n2].f;
                            this.f[n2].a += this.f[n2].g * this.f[n2].h;
                            this.f[n2].g -= 3;
                        }
                        if (this.f[n2].b == -10) {
                            this.f[n2].j = false;
                        }
                    }
                    ++n2;
                }
                ++this.w;
                if (this.w > this.R.length - 1) {
                    this.w = this.R.length - 1;
                    this.H = true;
                    es.a();
                    es.X();
                    if (!this.J && this.G - main.a.b < 0L) {
                        cj.a().c((byte)2, (byte)(this.f() + this.g()));
                        this.J = true;
                    }
                }
                co.m().aG = this.R[this.w];
                ++this.x;
                if (this.x > 5) {
                    this.x = 0;
                }
                this.y = this.S[this.x];
            }
            if (this.b == 3) {
                if (this.x <= 5) {
                    this.x = 5;
                }
                ++this.x;
                if (this.x > this.S.length - 1) {
                    this.x = this.S.length - 1;
                    this.b = (byte)4;
                    this.H = false;
                    n2 = 0;
                    int n4 = 0;
                    while (n4 < this.f.length) {
                        if (this.f[n4].k && !this.f[n4].l) {
                            this.f[n4].i = this.E[n2];
                            this.f[n4].l = true;
                            ++n2;
                        }
                        ++n4;
                    }
                }
                this.y = this.S[this.x];
            }
            if (this.b == 4) {
                n2 = 0;
                while (n2 < this.f.length) {
                    if (this.f[n2].j) {
                        this.f[n2].c = co.m().N;
                    }
                    ++n2;
                }
                this.b = (byte)5;
            }
            if (this.b == 5) {
                ++this.z;
                if (this.r < main.a.D / 3) {
                    this.r = this.r + this.z > main.a.D / 3 ? main.a.D / 3 : (this.r += this.z);
                }
                n2 = 0;
                while (n2 < this.f.length) {
                    if (this.f[n2].j) {
                        if (this.f[n2].a < this.f[n2].c) {
                            if (this.f[n2].g < 0) {
                                this.f[n2].g = 0;
                            }
                            this.f[n2].a = this.f[n2].a + this.f[n2].g > this.f[n2].c ? this.f[n2].c : (this.f[n2].a += this.f[n2].g);
                            ++this.f[n2].g;
                        } else {
                            if (this.f[n2].g > 0) {
                                this.f[n2].g = 0;
                            }
                            this.f[n2].a += this.f[n2].g;
                            --this.f[n2].g;
                        }
                        if (this.f[n2].a == this.f[n2].c) {
                            this.f[n2].j = false;
                        }
                    }
                    ++n2;
                }
                return;
            }
        }
        catch (Exception exception) {
            System.out.println("-upd--null: " + exception.toString());
        }
    }

    public final void d() {
        if (da.b) {
            return;
        }
        if (main.a.e && !el.b().b && !main.a.F.a) {
            int n2;
            cr cr2 = this;
            if (cr2.b == 1 && main.a.l) {
                n2 = 0;
                while (n2 < cr2.f.length) {
                    if (main.a.a(cr2.f[n2].a - 20 - cw.j, cr2.f[n2].b - 10 - cw.k, 30, 30) && main.a.l && main.a.m) {
                        cr2.b(n2);
                    }
                    ++n2;
                }
            }
            if (main.a.l) {
                n2 = 0;
                while (n2 < M.length) {
                    if (main.a.a(M[n2], L, 36, 36) && main.a.l && main.a.m) {
                        if (d && n2 != 2) break;
                        cr2.c(n2);
                    }
                    ++n2;
                }
            }
        }
        if (d && !main.a.i[0]) {
            main.a.k();
            main.a.j();
        }
        if (main.a.i[0]) {
            this.c(2);
        }
        int n3 = 1;
        while (n3 < 8) {
            if (main.a.i[n3]) {
                main.a.i[n3] = false;
                this.b(n3 - 1);
            }
            ++n3;
        }
        if (main.a.i[12]) {
            main.a.i[12] = false;
            this.c(0);
        }
        if (main.a.i[13]) {
            main.a.i[13] = false;
            this.c(1);
        }
        main.a.j();
    }

    private void b(int n2) {
        long l2;
        if (this.f[n2].k) {
            return;
        }
        es.a();
        es.z();
        long l3 = l2 = this.g == 0 ? co.m().aH : (long)co.m().ab();
        if (this.f() >= this.p && l2 < (long)(this.v + this.u)) {
            String string = String.valueOf(ch.j) + " " + (this.g == 0 ? ch.bF : ch.bG);
            cw.aO.a(string, 0);
            return;
        }
        this.o = n2;
        this.f[this.o].d = this.n + dq.b(-3, 3);
    }

    private void c(int n2) {
        this.c = n2;
        if (this.c == 2) {
            if (d = !d) {
                Object object = this;
                object = new Thread(new cs((cr)object));
                ((Thread)object).start();
                return;
            }
            e = true;
            return;
        }
        if (n2 == 0) {
            if (this.b < 2) {
                if (this.f() + this.g() > 0) {
                    this.b = (byte)2;
                    es.a();
                    es.R();
                    co.m().a(cw.v[13], 0);
                    this.G = main.a.b + (long)dq.b(2000, 3000);
                    return;
                }
            } else if (this.r == main.a.D / 3) {
                cj.a().c(this.g, (byte)0);
                return;
            }
        } else {
            if (d) {
                this.e();
            }
            cw.l().bn = false;
            cw.l().a();
        }
    }

    public final void a(eh eh2) {
        try {
            int n2;
            cw.l().a(eh2);
            eh2.a(-cw.j, -cw.k);
            eh2.a(0, main.a.ag);
            int n3 = 0;
            while (n3 < this.f.length) {
                if (this.f[n3].j && this.f[n3].b > this.f[n3].d - 20) {
                    eh2.a(dx.y, this.f[n3].a, this.f[n3].d + 7, 3);
                }
                ++n3;
            }
            n3 = 0;
            while (n3 < this.f.length) {
                if (this.f[n3].j) {
                    er.b(eh2, this.f[n3].i, this.f[n3].a, this.f[n3].b, 0, 3);
                }
                ++n3;
            }
            if (this.H) {
                if (N != null) {
                    n3 = co.m().N - cr.N.a - 28;
                    n2 = 0;
                    while (n2 < main.a.A / cr.N.a + 1) {
                        N.a(this.y, n3 - n2 * (cr.N.a - 1), co.m().O - cr.N.b / 2 - 12 + 2, 0, 0, eh2);
                        ++n2;
                    }
                }
                if (O != null) {
                    n3 = co.m().N - cr.O.a - 10;
                    O.a(this.y, n3 - 5, co.m().O - cr.O.b / 2 - 12, 0, 0, eh2);
                }
            }
            cw.c(eh2);
            n2 = main.a.A - 240;
            eh2.a(13524492);
            eh2.d(n2, 0, 240, 15);
            eh2.a(dl.w, n2 + 11, 8, 3);
            eh2.a(dl.y, n2 + 90, 7, 3);
            ev.n.a(eh2, String.valueOf(co.m().z), n2 + 24, 2, 0, ev.o);
            ev.n.a(eh2, String.valueOf(co.m().A), n2 + 100, 2, 0, ev.o);
            eh2.a(dl.z, n2 + 150, 8, 3);
            ev.n.a(eh2, String.valueOf(co.m().B), n2 + 160, 2, 0, ev.o);
            eh2.a(dl.x, n2 + 200, 8, 3);
            ev.n.a(eh2, String.valueOf(this.p), n2 + 210, 2, 0, ev.o);
            if (this.b < 4) {
                n2 = main.a.A - 140;
                eh2.a(11837316);
                eh2.d(n2, 15, 140, 15);
                if (this.g == 0) {
                    eh2.a(dl.w, n2 + 21, 23, 3);
                } else {
                    eh2.a(dl.z, n2 + 21, 22, 3);
                    eh2.a(dl.y, n2 + 18, 22, 3);
                }
                ev.p.a(eh2, "-" + this.v, n2 + 30, 17, 0, ev.o);
                eh2.a(dl.x, n2 + 80, 22, 3);
                ev.p.a(eh2, "-" + this.f(), n2 + 90, 17, 0, ev.o);
            }
            eh2.a(cw.aD, M[0], L, 0);
            if (this.c == 0) {
                eh2.a(cw.aE, M[0], L, 0);
            }
            if (this.b < 3) {
                er.b(eh2, 540, M[0] + 14, L + 14, 0, dv.f);
            } else {
                eh2.a(Q, M[0] + 14 - 10, L + 14 - 10, 0);
            }
            eh2.a(cw.aD, M[1], L, 0);
            if (this.c == 1) {
                eh2.a(cw.aE, M[1], L, 0);
            }
            eh2.a(P, M[1] + 14 - 10, L + 14 - 10, 0);
            if (this.b > 3) {
                bj.c(this.q, this.r, this.s, this.t, eh2);
                n3 = main.a.C - this.E.length * 30 / 2;
                n2 = 0;
                while (n2 < this.E.length) {
                    er.b(eh2, this.E[n2], n3 + 5 + n2 * 30, this.r + 10, 0, 0);
                    ++n2;
                }
            }
            if (d) {
                eh2.a(cw.aE, (M[0] + M[1]) / 2, L, 0);
            } else {
                eh2.a(cw.aD, (M[0] + M[1]) / 2, L, 0);
            }
            er.b(eh2, 4387, (M[0] + M[1]) / 2 + 14, L + 14, 0, dv.f);
            return;
        }
        catch (Exception exception) {
            System.out.println("-paint--null: " + exception.toString());
            return;
        }
    }

    public final void a(short[] sArray) {
        this.b = (byte)3;
        this.E = sArray;
    }

    public final void a() {
        cw.a = true;
        cw.l().bn = true;
        super.a();
    }

    private byte f() {
        byte by2 = 0;
        int n2 = 0;
        while (n2 < this.f.length) {
            if (this.f[n2].k) {
                by2 = (byte)(by2 + 1);
            }
            ++n2;
        }
        if (by2 > this.p) {
            by2 = (byte)this.p;
        }
        return by2;
    }

    private byte g() {
        byte by2 = 0;
        int n2 = 0;
        while (n2 < this.f.length) {
            if (this.f[n2].k) {
                by2 = (byte)(by2 + 1);
            }
            ++n2;
        }
        if ((by2 = (byte)(by2 - this.f())) <= 0) {
            by2 = 0;
        }
        return by2;
    }

    private void h() {
        int n2 = 0;
        while (n2 < co.m().aT.length) {
            if (co.m().aT[n2] != null && co.m().aT[n2].b.a == this.K) {
                this.p = co.m().aT[n2].h;
                return;
            }
            ++n2;
        }
    }

    public final void e() {
        d = false;
        this.c = -1;
        e = false;
    }

    static void a(cr cr2, int n2) {
        cr2.b(n2);
    }

    static void a(cr cr2) {
        if (cr2.b < 2) {
            if (cr2.f() + cr2.g() > 0) {
                cr2.b = (byte)2;
                es.a();
                es.R();
                co.m().a(cw.v[13], 0);
                cr2.G = main.a.b + (long)dq.b(2000, 3000);
                return;
            }
        } else if (cr2.r == main.a.D / 3) {
            cj.a().c(cr2.g, (byte)0);
        }
    }
}

