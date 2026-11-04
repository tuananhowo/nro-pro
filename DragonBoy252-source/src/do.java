/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class do
extends ew {
    private static do h;
    private static boolean i;
    private static dz j;
    private static dz k;
    public static dz a;
    private static Image l;
    private static Image m;
    private static Image n;
    private static Image o;
    private static Image p;
    private static Image q;
    private static Image r;
    private static Image s;
    private static Image t;
    private static Image u;
    private static Image v;
    private static Image w;
    private static Image x;
    private static Image y;
    private static Image[] z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;
    public static int b;
    public static int c;
    public static int d;
    private static int G;
    public static int e;
    private static int H;
    private static int[] I;
    private static int[] J;
    private static int[][] K;
    private static int[][] L;
    private static int[] M;
    private int N;
    private int[] O;
    private int P;
    private int Q;
    private int R = 0;
    public static eq f;
    public static eq g;
    private static int S;
    private dd T;
    private int U = 0;
    private int V = 0;
    private int W;
    private int X;
    private int Y;

    static {
        I = new int[0];
        J = new int[0];
        int[] nArray = new int[5];
        nArray[0] = -2;
        nArray[1] = -1;
        nArray[3] = 1;
        nArray[4] = 2;
        M = nArray;
    }

    public static do c() {
        if (h == null) {
            h = new do();
        }
        return h;
    }

    public do() {
        i = true;
        Image image = ej.b("/radar/17.png");
        Image image2 = ej.b("/radar/3.png");
        Image image3 = ej.b("/radar/23.png");
        j = new dz(image, 28, 28);
        k = new dz(image2, 30, 30);
        a = new dz(image3, 11, 11);
        l = ej.b("/radar/0.png");
        n = ej.b("/radar/1.png");
        o = ej.b("/radar/2.png");
        m = ej.b("/radar/17.png");
        p = ej.b("/radar/4.png");
        q = ej.b("/radar/5.png");
        r = ej.b("/radar/6.png");
        z = new Image[7];
        int n2 = 0;
        while (n2 < 7) {
            do.z[n2] = ej.b("/radar/" + (n2 + 7) + ".png");
            ++n2;
        }
        s = ej.b("/radar/14.png");
        t = ej.b("/radar/15.png");
        u = ej.b("/radar/16.png");
        m = ej.b("/radar/18.png");
        w = ej.b("/radar/19.png");
        x = ej.b("/radar/20.png");
        y = ej.b("/radar/21.png");
        v = ej.b("/radar/22.png");
        C = 200;
        D = 219;
        A = main.a.C - (C + 40) / 2;
        B = main.a.D - D / 2;
        b = A + C - 81;
        c = B + 29;
        d = 120;
        e = 80;
        K = new int[][]{{A + 34, B + D - 42}, {A + C / 2 - p.getWidth() / 2, B + D / 2 + 33}, {A + C - 41, B + D - 42}};
        L = new int[][]{{A + 25, B + D - 82}, {A + 57, B + D - 62}, {A + C / 2 - 14, B + D - 102}, {A + C - 57 - 28, B + D - 62}, {A + C - 25 - 28, B + D - 82}};
        this.O = new int[2];
        this.N = 0;
        E = A + 73;
        F = B + D / 2 + 5;
        H = B + D - 22;
        I = new int[]{A + C / 2 - 8 - 80, A + C / 2 - 8, A + C / 2 - 8 + 80};
        J = new int[3];
        this.X = c + 10 + 70;
        this.Y = 0;
        f = new eq("");
        g = new eq("");
        this.P = 1;
        this.Q = 2;
    }

    public final void a(eq eq2, int n2, int n3) {
        f = eq2;
        int n4 = n2;
        n2 = n3;
        n2 = n4;
        S = n4;
        this.P = 1;
        this.R = 2;
        this.f();
        i = true;
        do.e();
        if (i) {
            this.Q = eq2.size() / 5 + (eq2.size() % 5 > 0 ? 1 : 0);
            return;
        }
        this.Q = g.size() / 5 + (g.size() % 5 > 0 ? 1 : 0);
    }

    public static void a(int n2, int n3) {
        S = n2;
    }

    public static void e() {
        g = new eq("");
        int n2 = 0;
        while (n2 < f.size()) {
            dd dd2 = (dd)f.elementAt(n2);
            if (dd2 != null && dd2.k == 1) {
                g.addElement(dd2);
            }
            ++n2;
        }
    }

    private void f() {
        eq eq2 = g;
        if (i) {
            eq2 = f;
        }
        int n2 = (this.P - 1) * 5;
        int n3 = n2 + 5;
        int n4 = n2;
        while (n4 < n3) {
            if (n4 >= eq2.size()) {
                do.M[n4 - n2] = -1;
            } else {
                dd dd2 = (dd)eq2.elementAt(n4);
                if (dd2 != null) {
                    do.M[n4 - n2] = dd2.e;
                }
            }
            ++n4;
        }
        es.a();
        es.Z();
    }

    public final void b() {
        try {
            if (e < 80 && (e += 4) > 80) {
                e = 80;
            }
            this.T = dd.a(g, M[this.R]);
            if (i) {
                this.T = dd.a(f, M[this.R]);
            }
            cw.l().b();
            if (main.a.w % 10 < 6) {
                if (main.a.w % 2 == 0) {
                    --this.N;
                }
            } else {
                this.N = 0;
            }
            if (this.T != null) {
                int n2 = this.T.b * 100 / this.T.c;
                this.Y = n2 * w.getHeight() / 100;
                n2 = S * 100 / f.size();
                this.W = n2 * y.getWidth() / 100;
                return;
            }
        }
        catch (Exception exception) {
            System.out.println("-upd-radaScr-null: " + exception.toString());
        }
    }

    public final void d() {
        if (da.b) {
            return;
        }
        if (main.a.e && !el.b().b && !main.a.F.a) {
            do do_ = this;
            if (main.a.l) {
                int n2 = 0;
                while (n2 < 5) {
                    if (main.a.a(L[n2][0], L[n2][1], 30, 30) && main.a.l && main.a.m && n2 != do_.R) {
                        int n3 = n2;
                        do do_2 = do_;
                        do_.R = n3;
                        do_2.f();
                    }
                    ++n2;
                }
                if (main.a.a(K[0][0] - 5, K[0][1] - 5, 20, 20)) {
                    if (main.a.k) {
                        do_.O[0] = 1;
                    }
                    if (main.a.l && main.a.m) {
                        do_.c(0);
                        do_.O[0] = 0;
                    }
                }
                if (main.a.a(K[2][0] - 5, K[2][1] - 5, 20, 20)) {
                    if (main.a.k) {
                        do_.O[1] = 1;
                    }
                    if (main.a.l && main.a.m) {
                        do_.c(1);
                        do_.O[1] = 0;
                    }
                }
                n2 = 0;
                while (n2 < I.length) {
                    if (main.a.a(I[n2] - 5, H - 5, 20, 20)) {
                        if (main.a.k) {
                            do.J[n2] = 1;
                        }
                        if (main.a.l && main.a.m) {
                            do_.b(n2);
                            do.J[n2] = 0;
                        }
                    }
                    ++n2;
                }
            } else {
                do.J[0] = 0;
                do.J[1] = 0;
                do.J[2] = 0;
                do_.O[0] = 0;
                do_.O[1] = 0;
            }
            if (main.a.a(b, 0, d, c + e)) {
                if (main.a.n) {
                    if (do_.V == 0) {
                        do_.V = main.a.q;
                    }
                    do_.U = do_.V - main.a.q;
                    if (do_.U != 0) {
                        G += do_.U;
                        do_.V = main.a.q;
                    }
                    if (G < 0) {
                        G = 0;
                    }
                    if (G > do_.T.r.h) {
                        G = do_.T.r.h;
                    }
                } else {
                    do_.V = 0;
                    do_.V = 0;
                }
            }
        }
        if (main.a.i[8]) {
            main.a.i[8] = false;
            this.d(1);
        }
        if (main.a.i[2]) {
            main.a.i[2] = false;
            this.d(-1);
        }
        if (main.a.i[4]) {
            main.a.i[4] = false;
            this.e(1);
        }
        if (main.a.i[6]) {
            main.a.i[6] = false;
            this.e(0);
        }
        if (main.a.i[12]) {
            main.a.i[12] = false;
            this.b(0);
        }
        if (main.a.i[5]) {
            main.a.i[5] = false;
            this.b(1);
        }
        if (main.a.i[13]) {
            this.b(2);
        }
        main.a.j();
    }

    private void b(int n2) {
        if (n2 == 0) {
            do do_ = this;
            i = !i;
            do_.P = 1;
            do_.R = 0;
            do_.Q = i ? f.size() / 5 + (f.size() % 5 > 0 ? 1 : 0) : g.size() / 5 + (g.size() % 5 > 0 ? 1 : 0);
            do_.f();
            e = 0;
        } else if (n2 == 1) {
            if (this.T != null) {
                cj.a().b(1, this.T.e);
            }
        } else if (n2 == 2) {
            cw.l().a();
        }
        es.a();
        es.Y();
    }

    private void c(int n2) {
        this.Q = i ? f.size() / 5 + (f.size() % 5 > 0 ? 1 : 0) : g.size() / 5 + (g.size() % 5 > 0 ? 1 : 0);
        int n3 = this.P;
        if (n2 == 0) {
            if (this.P == 1) {
                return;
            }
            if (--n3 <= 0) {
                n3 = 1;
            }
        } else {
            if (this.P == this.Q) {
                return;
            }
            if (++n3 > this.Q) {
                n3 = this.Q;
            }
        }
        if (n3 != this.P) {
            this.P = n3;
            this.f();
        }
    }

    private void d(int n2) {
        if ((G += n2 * 12) < 0) {
            G = 0;
        }
        if (G > this.T.r.h) {
            G = this.T.r.h;
        }
    }

    private void e(int n2) {
        int n3 = this.R;
        int n4 = this.P;
        n3 = n2 == 0 ? ++n3 : --n3;
        if (n3 >= M.length) {
            if (this.P < this.Q) {
                n3 = 0;
                ++n4;
            } else {
                n3 = M.length - 1;
            }
        }
        if (n3 < 0) {
            if (this.P > 1) {
                n3 = M.length - 1;
                --n4;
            } else {
                n3 = 0;
            }
        }
        if (n3 != this.R) {
            this.R = n3;
            G = 0;
            e = 0;
        }
        if (n4 != this.P) {
            this.P = n4;
            this.f();
        }
    }

    public final void a(eh eh2) {
        try {
            int n2;
            int n3;
            cw.l().a(eh2);
            eh2.a(-cw.j, -cw.k);
            eh2.a(0, main.a.ag);
            cw.c(eh2);
            eh2.a(l, A, B, 0);
            eh2.a(x, A + C / 2 - ej.a(x) / 2, B - ej.b(x) / 2 - 2, 0);
            eh2.e(A + C / 2 - ej.a(x) / 2 + 13, B - ej.b(x) / 2 + 3, this.W, ej.b(x));
            eh2.a(y, A + C / 2 - ej.a(x) / 2 + 13, B - ej.b(x) / 2 + 3, 0);
            cw.c(eh2);
            eh2.a(u, I[0], H + J[0], 0);
            eh2.a(r, I[1], H + J[1], 0);
            eh2.a(t, I[2], H + J[2], 0);
            if (i) {
                eh2.a(s, 0, 0, 17, 17, 0, I[1], H + J[1], 0);
            } else {
                eh2.a(s, 0, 0, 17, 17, 1, I[1], H + J[1], 0);
            }
            if (this.T != null) {
                eh2.e(A + 30, B + 13, C - 60, D / 2);
                n3 = F;
                n2 = E;
                eh eh3 = eh2;
                dd dd2 = this.T;
                ++dd2.p;
                if (dd2.p > dd2.o.length - 1) {
                    dd2.p = 0;
                }
                if (dd2.d == 0) {
                    if (dh.d[dd2.m.H] != null) {
                        if (dh.d[dd2.m.H].f != null) {
                            dh.d[dd2.m.H].f.a(eh3, dd2.o[dd2.p], n2, n3, 0, 0);
                        } else if (dd2.q - main.a.b < 0L) {
                            dd2.q = main.a.b + 1500L;
                            dd2.m.x();
                        }
                    }
                } else if (dd2.l != null) {
                    dd2.l.a(eh3, n2, n3, 1, dd2.o[dd2.p], true);
                }
                cw.c(eh2);
                ev.d.a(eh2, String.valueOf(this.T.j > 0 ? "Lv." + this.T.j + " " : "") + this.T.h, A + C / 2, B + 15, 2);
                ev.s.a(eh2, "no." + this.T.f, A + 30, c - 2, 0);
                eh2.a(v, A + 36, c + 10, 0);
                eh2.e(A + 36, this.X - this.Y, 7, this.Y);
                eh2.a(w, A + 36, c + 10, 0);
                cw.c(eh2);
                eh2.a(z[this.T.a], A + 39 - 5 + 14, c + 12, 0);
            }
            eh2.e(b, c, d + 5, e + 8);
            if (this.T != null) {
                eh2.a(m, b, c, 0);
            }
            cw.c(eh2);
            eh2.e(b, c + 1, d, e + 5);
            if (this.T != null && this.T.r != null && this.T.r.d != null) {
                this.T.r.a(eh2, G);
            }
            cw.c(eh2);
            if (!i && g.size() > 5 || i) {
                if (this.P > 1) {
                    eh2.a(n, K[0][0], K[0][1] + this.O[0], 0);
                }
                if (this.P < this.Q) {
                    eh2.a(o, K[2][0], K[2][1] + this.O[1], 0);
                }
            }
            int n4 = 0;
            while (n4 < M.length) {
                int n5 = 0;
                n2 = 0;
                n3 = 0;
                if (n4 == this.R) {
                    n5 = this.N;
                    n2 = -10;
                    n3 = 1;
                    eh2.a(p, L[n4][0] + 10, L[n4][1] + this.N + 29 + -10, 0);
                }
                dd dd3 = dd.a(g, M[n4]);
                if (i) {
                    dd3 = dd.a(f, M[n4]);
                }
                if (dd3 != null) {
                    j.a(dd3.a, L[n4][0], L[n4][1] + n5 + n2, 0, 0, eh2);
                    er.b(eh2, dd3.g, L[n4][0] + 14, L[n4][1] + 14 + n5 + n2, 0, dv.f);
                    dd3.a(eh2, L[n4][0], L[n4][1] + n5 + n2);
                    if (dd3.j == 0) {
                        eh2.a(q, L[n4][0], L[n4][1] + n5 + n2, 0);
                    }
                    if (n4 == this.R) {
                        j.a(7, L[n4][0], L[n4][1] + n5 + n2, 0, 0, eh2);
                    }
                    if (dd3.k == 1) {
                        j.a(8, L[n4][0], L[n4][1] + n5 + n2, 0, 0, eh2);
                    }
                } else {
                    k.a(n3, L[n4][0] - 1, L[n4][1] - 1 + n5 + n2, 0, 0, eh2);
                }
                ++n4;
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("-paint-radaScr-null: " + exception.toString());
            return;
        }
    }

    public final void a() {
        cw.a = true;
        super.a();
    }
}

