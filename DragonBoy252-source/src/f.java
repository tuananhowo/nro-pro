/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class f {
    public static eq a = new eq("vBG Effect");
    private int[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private static int[] k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private static Image v;
    private static Image w;
    private static Image x;
    private static Image y;
    private static Image z;
    private static Image A;
    private static Image B;
    private static Image C;
    private int[] D;
    private int E;
    public int b;
    private boolean[] F;
    private int[] G;
    private int[] H;
    private boolean[] I;
    private int J;
    private int K;
    private static int L;
    private static Image M;
    private static Image N;
    private static Image O;
    private static Image P;
    public static short c;
    private static Image Q;
    public static boolean d;
    private static boolean R;
    public static int e;
    private static Image S;
    private static Image T;
    private static int U;
    private static int V;
    public static int f;
    private static int W;
    private int[] X;
    private int[] Y;

    static {
        L = 16;
        M = ej.b("/mainImage/myTexture2dwater1.png");
        N = ej.b("/mainImage/myTexture2dwater2.png");
        Q = null;
    }

    public static void a() {
        dx.I = 0;
    }

    public static boolean b() {
        int n2 = 0;
        while (n2 < a.size()) {
            f f2 = (f)a.elementAt(n2);
            if (f2.b == 0 || f2.b == 12) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private f(int n2) {
        int[] nArray = new int[6];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 1;
        this.X = nArray;
        this.b = n2;
        switch (this.b) {
            case 10: {
                this.l = 30;
                this.g = new int[this.l];
                this.h = new int[this.l];
                k = new int[this.l];
                this.i = new int[this.l];
                n2 = 0;
                int n3 = 0;
                while (n3 < this.l) {
                    this.g[n3] = dq.g(dq.b(0, main.a.A)) + cw.j;
                    if (++n2 > this.l / 2) {
                        this.h[n3] = dq.g(dq.b(20, 60));
                        f.k[n3] = 10;
                    } else {
                        this.h[n3] = dq.g(dq.b(0, 20));
                        f.k[n3] = 7;
                    }
                    this.i[n3] = k[n3] / 2 - 2;
                    ++n3;
                }
                return;
            }
            case 9: {
                if (O == null) {
                    O = ej.a("/bg/cham-tron1.png");
                }
                if (P == null) {
                    P = ej.a("/bg/cham-tron2.png");
                }
                this.l = 20;
                this.g = new int[this.l];
                this.h = new int[this.l];
                k = new int[this.l];
                this.i = new int[this.l];
                int n4 = 0;
                while (n4 < this.l) {
                    this.g[n4] = dq.g(dq.b(0, main.a.A));
                    this.h[n4] = dq.g(dq.b(10, 80));
                    f.k[n4] = dq.g(dq.b(1, 3));
                    this.i[n4] = k[n4];
                    ++n4;
                }
                return;
            }
            case 0: 
            case 12: {
                if (v == null) {
                    v = ej.a("/bg/mua.png");
                }
                if (w == null) {
                    w = ej.a("/bg/mua1.png");
                }
                if (x == null) {
                    x = ej.a("/bg/mua2.png");
                }
                this.E = dq.b(main.a.A / 3, main.a.A / 2);
                this.g = new int[this.E];
                this.h = new int[this.E];
                this.i = new int[this.E];
                this.j = new int[this.E];
                this.D = new int[this.E];
                this.H = new int[this.E];
                this.G = new int[this.E];
                this.F = new boolean[this.E];
                this.I = new boolean[this.E];
                int n5 = 0;
                while (n5 < this.E) {
                    this.h[n5] = dq.b(-10, main.a.B + 100) + cw.k;
                    this.g[n5] = dq.b(-10, main.a.A + 300) + cw.j;
                    this.H[n5] = dq.b(0, 1);
                    this.i[n5] = -12;
                    this.j[n5] = 12;
                    this.D[n5] = dq.b(1, 3);
                    this.F[n5] = false;
                    if (this.D[n5] == 2 && n5 % 2 == 0) {
                        this.F[n5] = true;
                    }
                    this.I[n5] = false;
                    this.G[n5] = dq.b(1, 2);
                    ++n5;
                }
                return;
            }
            case 1: 
            case 2: 
            case 5: 
            case 6: 
            case 7: 
            case 11: 
            case 15: {
                if (this.b == 1) {
                    z = ej.a("/bg/lacay.png");
                    L = 10;
                }
                if (this.b == 2) {
                    z = ej.a("/bg/lacay2.png");
                    L = 18;
                }
                if (this.b == 5) {
                    z = ej.a("/bg/lacay3.png");
                    L = 14;
                }
                if (this.b == 6) {
                    z = ej.a("/bg/lacay4.png");
                    L = 14;
                }
                if (this.b == 7) {
                    z = ej.a("/bg/lacay5.png");
                    L = 12;
                }
                if (this.b == 11) {
                    z = ej.a("/bg/tuyet.png");
                }
                if (this.b == 15) {
                    f.d();
                    L = 16;
                }
                this.E = dq.b(15, 25);
                if (this.b == 11) {
                    this.E = 100;
                }
                this.g = new int[this.E];
                this.h = new int[this.E];
                this.i = new int[this.E];
                this.j = new int[this.E];
                this.H = new int[this.E];
                this.G = new int[this.E];
                this.I = new boolean[this.E];
                int n6 = 0;
                while (n6 < this.E) {
                    this.g[n6] = dq.b(-10, dx.c + 10);
                    this.h[n6] = dq.b(0, dx.d);
                    this.G[n6] = dq.b(0, 1);
                    this.H[n6] = dq.b(0, 1);
                    this.i[n6] = dq.b(-3, 3);
                    this.j[n6] = dq.b(1, 4);
                    if (this.b == 11) {
                        this.G[n6] = dq.b(0, 2);
                        this.i[n6] = dq.g(dq.b(1, 3));
                        this.j[n6] = dq.g(dq.b(1, 3));
                    }
                    if (this.b == 15) {
                        this.G[n6] = dq.b(0, 2);
                        this.i[n6] = dq.g(dq.b(1, 3));
                        this.j[n6] = dq.g(dq.b(1, 3));
                    }
                    ++n6;
                }
                return;
            }
            case 4: {
                this.E = dq.b(5, 10);
                if (y == null) {
                    y = ej.a("/bg/sao.png");
                }
                this.g = new int[this.E];
                this.h = new int[this.E];
                this.G = new int[this.E];
                this.H = new int[this.E];
                this.Y = new int[this.E];
                int n7 = 0;
                while (n7 < this.E) {
                    this.g[n7] = dq.b(0, main.a.A);
                    this.h[n7] = dq.b(0, 50);
                    this.Y[n7] = n7 % 2 == 0 ? 0 : (n7 % 3 == 0 ? 1 : (n7 % 4 == 0 ? 2 : 3));
                    this.H[n7] = dq.b(0, 10);
                    ++n7;
                }
                return;
            }
            case 3: {
                main.a.ae = true;
                return;
            }
            case 8: {
                this.s = dq.b(100, 300);
                if (A == null) {
                    A = ej.a("/bg/ship.png");
                }
                if (B == null) {
                    B = ej.a("/bg/fire1.png");
                }
                if (C == null) {
                    C = ej.a("/bg/fire2.png");
                }
                this.u = false;
                this.f();
                return;
            }
            case 13: {
                int n8 = dq.g(dq.b(0, 2));
                if (n8 != 0) break;
                n2 = dq.g(dq.b(0, 2));
                R = n2 == 0;
                e = dq.g(dq.b(2, 5));
                f.e();
                return;
            }
            case 14: {
                n2 = dq.g(dq.b(0, 2));
                if (n2 != 0) break;
                d = true;
                f.e();
            }
        }
    }

    private static Image d() {
        if (er.c == null || 11120 >= er.c.length) {
            return null;
        }
        bz bz2 = er.c[11120];
        if (bz2 == null) {
            er.a(11120);
            bz2 = er.c[11120];
        }
        if (bz2 == null || bz2.a == null) {
            return null;
        }
        er.a(11120, bz2.a);
        if (bz2.a == er.e || eh.a(bz2.a) <= 1 || eh.b(bz2.a) <= 1) {
            return null;
        }
        z = bz2.a;
        return z;
    }

    private static void e() {
        if (ej.c == 1) {
            S = null;
            T = null;
            return;
        }
        if (main.a.a) {
            S = null;
            T = null;
            return;
        }
        if (e > 0) {
            if (S == null) {
                S = ej.b("/bg/fog1.png");
                U = S.getWidth();
            }
        } else {
            S = null;
        }
        if (!d) {
            T = null;
            return;
        }
        if (T == null) {
            T = ej.b("/bg/fog0.png");
        }
        W = 287;
    }

    private static void g(eh eh2) {
        if (ej.c == 1) {
            return;
        }
        if (main.a.a) {
            return;
        }
        if (e == 0) {
            return;
        }
        if (S != null) {
            int n2 = 0;
            while (n2 < e) {
                eh2.a(S, (float)main.a.ac[n2], (float)main.a.ad[n2], 3);
                ++n2;
            }
        }
    }

    public static void a(eh eh2) {
        if (ej.c == 1) {
            return;
        }
        if (main.a.a) {
            return;
        }
        if (!d) {
            return;
        }
        if (T != null) {
            int n2 = V;
            while (n2 < dx.c) {
                if (n2 >= cw.j - W) {
                    eh2.a(T, (float)n2, (float)f, 0);
                }
                n2 += W;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void f() {
        block7: {
            block5: {
                block6: {
                    block4: {
                        var1_1 = cw.j;
                        var2_2 = cw.k;
                        this.o = dq.b(1, 3);
                        this.u = false;
                        this.t = dq.b(3, 5);
                        if (this.o != 1) break block4;
                        this.m = -50;
                        this.n = dq.b(var2_2, main.a.B - 100 + var2_2);
                        v0 = this;
                        v1 = 0;
                        break block5;
                    }
                    if (this.o != 2) break block6;
                    this.m = dx.c + 50;
                    this.n = dq.b(var2_2, main.a.B - 100 + var2_2);
                    v0 = this;
                    ** GOTO lbl-1000
                }
                if (this.o == 3) {
                    this.m = dq.b(var1_1 + 50, main.a.A - 50 + var1_1);
                    this.n = -50;
                    var1_1 = dq.b(0, 2);
                    this.p = var1_1 == 0 ? 0 : 2;
                    return;
                }
                if (this.o == 4) {
                    this.m = dq.b(var1_1 + 50, main.a.A - 50 + var1_1);
                    this.n = dx.d + 50;
                    var1_1 = dq.b(0, 2);
                    v0 = this;
                    ** if (var1_1 != 0) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        v1 = 0;
                        ** GOTO lbl35
                    }
                }
                break block7;
lbl-1000:
                // 2 sources

                {
                    v1 = 2;
                }
            }
            v0.p = v1;
        }
    }

    public static void a(int n2) {
        if (main.a.a) {
            return;
        }
        f f2 = new f(n2);
        a.addElement(f2);
    }

    public static void a(int n2, int n3) {
        f f2 = new f(10);
        new f(10).K = n2;
        f2.J = n3;
        a.addElement(f2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void b(eh var0) {
        var1_1 = 0;
        while (var1_1 < f.a.size()) {
            block10: {
                block11: {
                    block13: {
                        block12: {
                            var3_3 = var0;
                            var2_2 = (f)f.a.elementAt(var1_1);
                            if (var2_2.b != 10) break block10;
                            var3_3.a(var2_2.K);
                            var4_4 = 0;
                            while (var4_4 < var2_2.l) {
                                var3_3.a(var4_4 < var2_2.l / 2 ? f.N : f.M, var2_2.g[var4_4], var2_2.h[var4_4] + var2_2.J, 0);
                                ++var4_4;
                            }
                            if (f.c == 0) break block11;
                            if (f.c > 0) break block12;
                            v0 = null;
                            break block11;
                        }
                        var4_5 /* !! */  = er.c;
                        if (er.c != null && f.c < var4_5 /* !! */ .length) break block13;
                        v0 = null;
                        break block11;
                    }
                    if ((var4_5 /* !! */  = var4_5 /* !! */ [f.c]) != null) ** GOTO lbl29
                    er.a(f.c);
                    var4_5 /* !! */  = er.c;
                    if (er.c == null || f.c >= var4_5 /* !! */ .length) {
                        v0 = null;
                    } else {
                        var4_5 /* !! */  = var4_5 /* !! */ [f.c];
lbl29:
                        // 2 sources

                        if (var4_5 /* !! */  == null || var4_5 /* !! */ .a == null) {
                            v0 = null;
                        } else if (var4_5 /* !! */ .a == er.e) {
                            er.a(f.c, var4_5 /* !! */ .a);
                            v0 = null;
                        } else {
                            er.a(f.c, var4_5 /* !! */ .a);
                            v0 = f.Q = var4_5 /* !! */ .a;
                        }
                    }
                }
                if (f.Q != null) {
                    var4_6 = 0;
                    while (var4_6 < var2_2.l / 2) {
                        var3_3.a(f.Q, var2_2.g[var4_6], var2_2.h[var4_6] + var2_2.J, 0);
                        ++var4_6;
                    }
                }
            }
            ++var1_1;
        }
    }

    public static void c(eh eh2) {
        int n2 = 0;
        while (n2 < a.size()) {
            eh eh3 = eh2;
            f f2 = (f)a.elementAt(n2);
            switch (f2.b) {
                case 8: {
                    int n3;
                    eh3.a(A, 0, 0, A.getWidth(), A.getHeight(), f2.p, f2.m, f2.n, 3);
                    if (f2.o == 1 || f2.o == 2) {
                        n3 = f2.p == 0 ? -25 : 25;
                        eh3.a(B, 0, f2.q << 3, 20, 8, f2.p, f2.m + n3, f2.n + 5, 3);
                        break;
                    }
                    n3 = f2.p == 0 ? 11 : -11;
                    eh3.a(C, 0, f2.q * 18, 8, 18, f2.p, f2.m + n3, f2.n + 22, 3);
                    break;
                }
                case 13: {
                    if (!R) break;
                    f.g(eh3);
                }
            }
            ++n2;
        }
    }

    public static void d(eh eh2) {
        int n2 = 0;
        while (n2 < a.size()) {
            eh eh3 = eh2;
            f f2 = (f)a.elementAt(n2);
            try {
                switch (f2.b) {
                    case 3: {
                        break;
                    }
                    case 0: 
                    case 12: {
                        int n3 = 0;
                        while (n3 < f2.E) {
                            if (f2.D[n3] == 2 && f2.g[n3] >= cw.j && f2.g[n3] <= main.a.A + cw.j && f2.h[n3] >= cw.k && f2.h[n3] <= main.a.B + cw.k) {
                                if (f2.I[n3]) {
                                    eh3.a(v, 0, 10 * f2.G[n3], 13, 10, 0, f2.g[n3], f2.h[n3] - 10, 0);
                                } else {
                                    eh3.a(w, f2.g[n3], f2.h[n3], 0);
                                }
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 11: 
                    case 15: {
                        if (f2.b == 15 && (z = f.d()) == null) break;
                        Image image = z;
                        int cfr_ignored_0 = f2.b;
                        int cfr_ignored_1 = f2.b;
                        if (f2.b == 11) {
                            L = 5;
                        }
                        try {
                            int n4 = 0;
                            while (n4 < f2.E) {
                                if (n4 % 3 == 0 && f2.g[n4] >= cw.j && f2.g[n4] <= main.a.A + cw.j && f2.h[n4] >= cw.k && f2.h[n4] <= main.a.B + cw.k && image != null) {
                                    eh3.a(image, 0, L * f2.G[n4], image.getWidth(), L, 0, f2.g[n4], f2.h[n4], 0);
                                }
                                ++n4;
                            }
                        }
                        catch (Exception exception) {}
                        break;
                    }
                    case 13: {
                        if (!R) {
                            f.g(eh3);
                        }
                        break;
                    }
                }
            }
            catch (Exception exception) {}
            ++n2;
        }
    }

    public static void e(eh eh2) {
        int n2 = 0;
        while (n2 < a.size()) {
            int n3;
            eh eh3 = eh2;
            f f2 = (f)a.elementAt(n2);
            eh3.a(-eh3.a(), -eh3.b());
            if (f2.b == 4) {
                n3 = 0;
                while (n3 < f2.E) {
                    eh3.a(y, 0, 16 * f2.G[n3], 16, 16, 0, f2.g[n3], f2.h[n3], 0);
                    ++n3;
                }
            }
            if (f2.b == 9) {
                eh3.a(0xFFFFFF);
                n3 = 0;
                while (n3 < f2.l) {
                    eh3.a(k[n3] == 1 ? O : P, f2.g[n3], f2.h[n3], 3);
                    ++n3;
                }
            }
            ++n2;
        }
    }

    public static void f(eh eh2) {
        int n2 = 0;
        while (n2 < a.size()) {
            eh eh3 = eh2;
            f f2 = (f)a.elementAt(n2);
            switch (f2.b) {
                case 3: {
                    break;
                }
                case 0: {
                    eh3.a(10742731);
                    int n3 = 0;
                    while (n3 < f2.E) {
                        if (f2.D[n3] != 2 && f2.g[n3] >= cw.j && f2.g[n3] <= main.a.A + cw.j && f2.h[n3] >= cw.k && f2.h[n3] <= main.a.B + cw.k) {
                            eh3.a(x, f2.g[n3], f2.h[n3], 0);
                        }
                        ++n3;
                    }
                    break;
                }
                case 1: 
                case 2: 
                case 5: 
                case 6: 
                case 7: 
                case 11: 
                case 15: {
                    if (f2.b == 15 && (z = f.d()) == null) break;
                    Image image = z;
                    int cfr_ignored_0 = f2.b;
                    int cfr_ignored_1 = f2.b;
                    if (f2.b == 11) {
                        L = 5;
                    }
                    try {
                        int n4 = 0;
                        while (n4 < f2.E) {
                            if (n4 % 3 != 0 && f2.g[n4] >= cw.j && f2.g[n4] <= main.a.A + cw.j && f2.h[n4] >= cw.k && f2.h[n4] <= main.a.B + cw.k && image != null) {
                                eh3.a(image, 0, L * f2.G[n4], image.getWidth(), L, 0, f2.g[n4], f2.h[n4], 0);
                            }
                            ++n4;
                        }
                        break;
                    }
                    catch (Exception exception) {}
                }
            }
            ++n2;
        }
    }

    public static void c() {
        int n2 = 0;
        while (n2 < a.size()) {
            f f2 = (f)a.elementAt(n2);
            try {
                switch (f2.b) {
                    case 10: {
                        int n3 = 0;
                        while (n3 < f2.l) {
                            int n4 = n3;
                            f2.g[n4] = f2.g[n4] - f2.i[n3];
                            if (f2.g[n3] < -f2.i[n3] + cw.j) {
                                f2.g[n3] = main.a.A + f2.i[n3] + cw.j;
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 9: {
                        int n3 = 0;
                        while (n3 < f2.l) {
                            int n5 = n3;
                            f2.g[n5] = f2.g[n5] - f2.i[n3];
                            if (f2.g[n3] < -f2.i[n3]) {
                                f.k[n3] = dq.g(dq.b(1, 3));
                                f2.i[n3] = k[n3];
                                f2.g[n3] = main.a.A + f2.i[n3];
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 3: {
                        break;
                    }
                    case 0: 
                    case 12: {
                        int n3 = 0;
                        while (n3 < f2.E) {
                            if (n3 % 3 != 0 && f2.b != 12 && dx.a(f2.g[n3], f2.h[n3] - main.a.ag, 2)) {
                                f2.I[n3] = true;
                            }
                            if (n3 % 3 == 0 && f2.h[n3] > main.a.B + cw.k) {
                                f2.g[n3] = dq.b(-10, main.a.A + 300) + cw.j;
                                f2.h[n3] = dq.b(-100, 0) + cw.k;
                            }
                            if (!f2.I[n3]) {
                                int n6 = n3;
                                f2.h[n6] = f2.h[n6] + f2.j[n3];
                                int n7 = n3;
                                f2.g[n7] = f2.g[n7] + f2.i[n3];
                            }
                            if (f2.I[n3]) {
                                int n8 = n3;
                                f2.H[n8] = f2.H[n8] + 1;
                                if (f2.H[n3] > 2) {
                                    int n9 = n3;
                                    f2.G[n9] = f2.G[n9] + 1;
                                    f2.H[n3] = 0;
                                    if (f2.G[n3] > 1) {
                                        f2.G[n3] = 0;
                                        f2.I[n3] = false;
                                        f2.g[n3] = dq.b(-10, main.a.A + 300) + cw.j;
                                        f2.h[n3] = dq.b(-100, 0) + cw.k;
                                    }
                                }
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 11: 
                    case 15: {
                        int n10;
                        int n3 = 0;
                        while (n3 < f2.E) {
                            if (n3 % 3 != 0 && dx.a(f2.g[n3], f2.h[n3] + (dx.e == 15 ? 10 : 0), 2)) {
                                f2.I[n3] = true;
                            }
                            if (n3 % 3 == 0 && f2.h[n3] > dx.d) {
                                f2.g[n3] = dq.b(-10, dx.c + 50);
                                f2.h[n3] = dq.b(-50, 0);
                            }
                            if (!f2.I[n3]) {
                                n10 = 0;
                                while (n10 < cd.a.size()) {
                                    cd cd2 = (cd)cd.a.elementAt(n10);
                                    if (cd2 != null && cd2.e && f2.g[n3] < cd2.b + 80 && f2.g[n3] > cd2.b - 80 && f2.h[n3] < cd2.c + 80 && f2.h[n3] > cd2.c - 80) {
                                        int n11 = n3;
                                        f2.g[n11] = f2.g[n11] + (f2.g[n3] < cd2.b ? -10 : 10);
                                    }
                                    ++n10;
                                }
                                int n12 = n3;
                                f2.h[n12] = f2.h[n12] + f2.j[n3];
                                int n13 = n3;
                                f2.g[n13] = f2.g[n13] + f2.i[n3];
                                int n14 = n3;
                                f2.H[n14] = f2.H[n14] + 1;
                                int cfr_ignored_0 = f2.b;
                                int cfr_ignored_1 = f2.b;
                                if (f2.H[n3] > (f2.b != 2 ? 2 : 4)) {
                                    if (f2.b != 11 && f2.b != 15) {
                                        int n15 = n3;
                                        f2.G[n15] = f2.G[n15] + 1;
                                    }
                                    f2.H[n3] = 0;
                                    if (f2.G[n3] > 3) {
                                        f2.G[n3] = 0;
                                    }
                                }
                            } else {
                                int n16 = n3;
                                f2.H[n16] = f2.H[n16] + 1;
                                if (f2.H[n3] == 100) {
                                    f2.H[n3] = 0;
                                    f2.g[n3] = dq.b(-10, dx.c + 50);
                                    f2.h[n3] = dq.b(-50, 0);
                                    f2.I[n3] = false;
                                }
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 4: {
                        int n3 = 0;
                        while (n3 < f2.E) {
                            int n17 = n3;
                            f2.H[n17] = f2.H[n17] + 1;
                            if (f2.H[n3] > 10) {
                                int n18 = n3;
                                f2.Y[n18] = f2.Y[n18] + 1;
                                f2.H[n3] = 0;
                                if (f2.Y[n3] > 5) {
                                    f2.Y[n3] = 0;
                                }
                                f2.G[n3] = f2.X[f2.Y[n3]];
                            }
                            ++n3;
                        }
                        break;
                    }
                    case 8: {
                        ++f2.r;
                        if (f2.r == 3) {
                            f2.r = 0;
                            ++f2.q;
                            if (f2.q > 1) {
                                f2.q = 0;
                            }
                        }
                        if (main.a.w % f2.s == 0) {
                            f2.u = true;
                        }
                        if (f2.u) {
                            if (f2.o == 1) {
                                f2.m += f2.t;
                                if (f2.m > dx.c + 50) {
                                    f2.f();
                                }
                            } else if (f2.o == 2) {
                                f2.m -= f2.t;
                                if (f2.m < -50) {
                                    f2.f();
                                }
                            } else if (f2.o == 3) {
                                f2.n += f2.t;
                                if (f2.n > dx.d + 50) {
                                    f2.f();
                                }
                            } else if (f2.o == 4) {
                                f2.n -= f2.t;
                                if (f2.n < -50) {
                                    f2.f();
                                }
                            }
                        }
                        break;
                    }
                    case 13: {
                        int n10;
                        int n3;
                        if (ej.c != 1 && !main.a.a && e > 0) {
                            int n19 = main.a.E == cw.l() ? dx.c : cw.j + main.a.A;
                            n3 = 0;
                            while (n3 < e) {
                                n10 = n3 + 1;
                                int n20 = n3;
                                main.a.ac[n20] = main.a.ac[n20] - n10;
                                if (main.a.ac[n3] < -U) {
                                    main.a.ac[n3] = n19 + 100;
                                }
                                ++n3;
                            }
                        }
                        break;
                    }
                    case 14: {
                        if (ej.c != 1 && !main.a.a && d && --V < -W) {
                            V = 0;
                        }
                        break;
                    }
                }
            }
            catch (Exception exception) {}
            ++n2;
        }
    }
}

