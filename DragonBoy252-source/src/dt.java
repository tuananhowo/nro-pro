/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class dt
extends ew
implements ao {
    private int b = 0;
    private eq c = new eq("");
    private ae d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private ae j;
    private ae k;
    private static String l = "area_select";
    private boolean m;
    private boolean n;
    private s o;
    private byte p = 0;
    private byte q = 0;
    private byte r = 0;
    private ae s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V = 15;
    private String[] W;
    private String[] X;
    private String[] Y;
    private String Z;
    private static Image[] aa;
    public static boolean a;

    public final void a() {
        main.a.f();
        es.a();
        es.C();
        super.a();
        if (aa == null) {
            aa = new Image[3];
            int n2 = 0;
            while (n2 < aa.length) {
                dt.aa[n2] = ej.b("/iconHead_" + n2 + ".png");
                ++n2;
            }
        }
        this.b = ds.p;
        this.h = 1;
        this.i = 1;
        dt dt2 = this;
        if (main.a.e) {
            if (ea.b(l) == null) {
                dt2.m = true;
                dt2.s = new ae(ch.bt, dt2, 999, null);
                dt2.s.j = main.a.C - 38;
                dt2.s.k = main.a.D + 50;
                dt2.c = new eq("");
                dt2.c.addElement(dt2.s);
                dt2.O = main.a.D - 30;
                dt2.P = 70;
                dt2.Q = 20;
            } else {
                dt2.m = false;
                dt2.g();
                dt2.a((int)dt2.p, (int)dt2.r);
            }
        }
        if (!this.n && !this.m) {
            this.j = new ae(this.W[0], this, 98, null);
            this.j.j = 0;
            this.j.k = 0;
            this.k = new ae(this.W[1], this, 97, null);
            this.k.j = 50;
            this.k.k = 0;
            this.c = new eq("");
            this.c.addElement(this.j);
            this.c.addElement(this.k);
            this.c();
        }
    }

    public dt() {
        String[] stringArray = new String[]{"Ti\u1ebfng Vi\u1ec7t", "English", "Indo"};
        this.W = new String[]{"VI\u1ec6T NAM", "GLOBAL"};
        this.X = new String[]{"M\u00e1y ch\u1ee7 ti\u00eau chu\u1ea9n", "M\u00e1y ch\u1ee7 Super"};
        this.Y = new String[]{"M\u00e1y ch\u1ee7 ti\u00eau chu\u1ea9n:\nTi\u1ebfn tr\u00ecnh game b\u00ecnh th\u01b0\u1eddng.", "M\u00e1y ch\u1ee7 Super:\n -Kh\u00f4ng th\u1ec3 giao d\u1ecbch v\u00e0ng.\n x3 S\u1ee9c m\u1ea1nh\n x3 Ti\u1ec1m n\u0103ng\n x3 V\u00e0ng\n x3 V\u1eadt ph\u1ea9m kh\u00e1c"};
        this.Z = "Ch\u1ec9 hi\u1ec7n th\u1ecb m\u00e1y ch\u1ee7 \u0111\u00e3 ch\u01a1i.";
        byte by2 = (byte)(System.currentTimeMillis() % 9L);
        dx.o = by2;
        if (by2 == 5 || dx.o == 6) {
            dx.o = 4;
        }
        cw.a(-1, -1);
        cw.j = 100;
        cw.k = 200;
    }

    private void c() {
        this.b = ds.p;
        this.g = 5;
        this.e = 90;
        this.f = ew.cE;
        this.h = 2;
        if (this.c.size() > 2) {
            this.h = main.a.A / (this.e + this.g);
        }
        this.i = this.c.size() / this.h + (this.c.size() % this.h == 0 ? 0 : 1);
        int n2 = 0;
        while (n2 < this.c.size()) {
            ae ae2 = (ae)this.c.elementAt(n2);
            if (ae2 != null) {
                int n3 = main.a.C - this.h * (this.e + this.g) / 2;
                int n4 = main.a.D - this.i * (this.f + this.g) / 2;
                ae2.j = n3 += n2 % this.h * (this.e + this.g);
                ae2.k = n4 += n2 / this.h * (this.f + this.g);
                ae2.l = this.e;
            }
            ++n2;
        }
    }

    public final void b() {
        if (++cw.j > main.a.A * 3 + 100) {
            cw.j = 100;
        }
        if (!this.n) {
            int n2 = 0;
            while (n2 < this.c.size()) {
                ae ae2 = (ae)this.c.elementAt(n2);
                if (!main.a.e) {
                    if (n2 == this.b) {
                        ae2.n = main.a.w % 10 < 4;
                        this.cA = this.d = new ae(ch.by, this, ae2.e, null);
                    } else {
                        ae2.n = false;
                    }
                } else if (ae2 != null && ae2.c()) {
                    dq.c("sellllect      " + this.b + "   " + ae2.b);
                    ae2.a();
                }
                ++n2;
            }
        }
        this.e();
        this.f();
        ds.e();
    }

    public final void a(eh eh2) {
        main.a.c(eh2);
        if (this.m) {
            eh eh3 = eh2;
            dt dt2 = this;
            if (dt2.m) {
                dt2.a(eh3, main.a.C - dt2.P / 2, dt2.O);
                int cfr_ignored_0 = dt2.O;
                dt2.s.a(eh3);
            }
        } else if (this.n) {
            eh eh4 = eh2;
            dt dt3 = this;
            if (dt3.n) {
                int n2;
                eh4.a(14601141);
                eh4.d(dt3.u, dt3.v, dt3.w, dt3.x);
                bo.a(eh4, dt3.y - 50, dt3.z, 100, 20, 0, true);
                ev.f.a(eh4, ch.ac, dt3.y, dt3.z + 5, 2);
                int n3 = 0;
                while (n3 < dt3.R) {
                    n2 = dt3.H + n3 * (dt3.J + 5);
                    bo.a(eh4, dt3.G, n2, dt3.I, dt3.J, dt3.r == n3 ? 1 : 0, true);
                    ev.f.a(eh4, dt3.X[n3], dt3.G + dt3.I / 2, n2 + 5, 2);
                    ++n3;
                }
                eh4.a(10254674);
                eh4.d(dt3.K, dt3.L, dt3.M, dt3.N);
                Object object = ev.k.a(dt3.Y[dt3.r], dt3.M - 10);
                n2 = 0;
                while (n2 < ((String[])object).length) {
                    ev.s.a(eh4, object[n2], dt3.K + 5, dt3.L + 5 + n2 * 11, 0);
                    ++n2;
                }
                Object object2 = eh4;
                object = dt3;
                int n4 = object.K;
                int n5 = object.L + object.N + 2;
                ((eh)object2).a(0xFFFFFF);
                ((eh)object2).d(n4, n5, object.S, object.S);
                if (a) {
                    ((eh)object2).a(3329330);
                    ((eh)object2).d(n4 + 1, n5 + 1, object.S - 2, object.S - 2);
                }
                ev.f.a((eh)object2, object.Z, n4 + object.S + 2, n5, 0);
                dt3.a(eh4, 10, dt3.O);
                int cfr_ignored_1 = dt3.P;
                int cfr_ignored_2 = dt3.O;
                eh4.a(10254674);
                eh4.d(dt3.A, dt3.B, dt3.C, dt3.D);
                eh4.e(dt3.A, dt3.B, dt3.C, dt3.D);
                eh4.a(0, -dt3.o.b);
                int n6 = 0;
                while (n6 < dt3.c.size()) {
                    object2 = (ae)dt3.c.elementAt(n6);
                    if (object2 != null) {
                        ((ae)object2).a(eh4);
                        if (((ae)object2).r && main.a.w % 10 > 1) {
                            eh4.a(dl.v, ((ae)object2).j + 60, ((ae)object2).k, 0);
                        }
                    }
                    ++n6;
                }
                main.a.a(eh4);
            }
            if (ds.j != null) {
                ev.s.a(eh2, ch.gi, main.a.A - 2, main.a.B - 15, 1, ev.o);
            }
        } else {
            int n7 = 0;
            while (n7 < this.c.size()) {
                if (this.c.elementAt(n7) != null) {
                    ((ae)this.c.elementAt(n7)).a(eh2);
                }
                ++n7;
            }
        }
        super.a(eh2);
    }

    public final void d() {
        super.d();
        int n2 = this.b % this.h;
        int n3 = this.b / this.h;
        if (main.a.i[4]) {
            if (n2 > 0) {
                --this.b;
            }
            main.a.i[4] = false;
        } else if (main.a.i[6]) {
            if (n2 < this.h - 1) {
                ++this.b;
            }
            main.a.i[6] = false;
        } else if (main.a.i[2]) {
            if (n3 > 0) {
                this.b -= this.h;
            }
            main.a.i[2] = false;
        } else if (main.a.i[8]) {
            System.out.println("-----------vo mainSelect: " + this.b);
            if (n3 < this.i - 1) {
                this.b += this.h;
            }
            main.a.i[8] = false;
        }
        if (this.b < 0) {
            this.b = 0;
        }
        if (this.b >= this.c.size()) {
            this.b = this.c.size() - 1;
        }
        if (main.a.i[5]) {
            ((ae)this.c.elementAt(n2)).a();
            main.a.i[5] = false;
        }
        main.a.j();
    }

    public final void a(int n2, Object object) {
        dq.c("perform trong ServerScr:" + n2);
        switch (n2) {
            case 999: {
                dt dt2 = this;
                byte[] byArray = new byte[2];
                object = byArray;
                byArray[0] = dt2.p;
                object[1] = dt2.q;
                ea.a(l, (byte[])object);
                this.a((int)this.p, 0);
                return;
            }
            case 97: {
                if (this.n) break;
                this.c.removeAllElements();
                n2 = 0;
                while (n2 < ds.a.length) {
                    if (ds.d[n2] != 0) {
                        this.c.addElement(new ae(ds.a[n2], this, n2 + 100, null));
                    }
                    ++n2;
                }
                this.c();
                return;
            }
            case 98: {
                if (this.n) break;
                this.c.removeAllElements();
                n2 = 0;
                while (n2 < ds.a.length) {
                    if (ds.d[n2] == 0) {
                        this.c.addElement(new ae(ds.a[n2], this, n2 + 100, null));
                    }
                    ++n2;
                }
                this.c();
                return;
            }
            case 99: {
                eb.a().c();
                ds.a(this.b, false);
                if (main.a.ao == null) {
                    main.a.ao = new ds();
                }
                main.a.ao.i();
                main.a.ao.a();
                return;
            }
            default: {
                ds.a(n2 - 100, true);
                if (main.a.ao == null) {
                    main.a.ao = new ds();
                }
                main.a.ao.i();
                main.a.ao.a();
            }
        }
    }

    private void a(int n2, int n3) {
        this.m = false;
        if (ej.c != 1) {
            this.n = true;
        }
        this.S = 10;
        this.w = main.a.A / 3 << 1;
        this.x = main.a.B / 3 << 1;
        this.u = (main.a.A - this.w) / 2;
        this.v = (main.a.B - this.x) / 2 + 20;
        this.y = main.a.A / 2;
        this.z = this.v - 30;
        this.C = this.w / 3 << 1;
        this.I = this.w - this.C - 15;
        if (this.I < 80) {
            this.I = 80;
            this.C = this.w - this.I - 15;
        }
        this.D = this.x - 10 - this.S;
        this.A = this.u + this.w - this.C - 5;
        this.B = this.v + 5;
        this.G = this.u + 5;
        this.H = this.v + 5;
        this.J = 20;
        this.K = this.u + 5;
        this.L = this.v + this.X.length * (this.J + 5) + 5;
        this.M = this.I;
        this.N = this.x - (5 + this.X.length * (this.J + 5) + 5) - this.S;
        this.O = 10;
        this.P = 70;
        this.Q = 20;
        this.a((byte)n2, (byte)n3);
    }

    private void a(byte by2, byte by3) {
        ae ae2;
        int n2;
        this.c.removeAllElements();
        this.R = 1;
        this.p = by2;
        ch.a(by2);
        int n3 = 0;
        while (n3 < ds.a.length) {
            if (by2 == 1) {
                if (ds.d[n3] != 0 && ds.h[n3] == 1) {
                    this.R = 2;
                }
            } else if (ds.h[n3] == 1) {
                this.R = 2;
            }
            ++n3;
        }
        if (by3 > (byte)(this.R - 1)) {
            by3 = (byte)(this.R - 1);
        }
        this.r = by3;
        n3 = 0;
        while (n3 < ds.a.length) {
            if (by2 == 1) {
                if (ds.d[n3] != 0) {
                    if (ds.h[n3] == 1) {
                        this.R = 2;
                    }
                    if (ds.h[n3] == by3) {
                        n2 = -1;
                        if (ds.e != null && n3 < ds.e.length) {
                            n2 = ds.e[n3];
                        }
                        if (!a || n2 != -1) {
                            ae2 = new ae(ds.a[n3], this, n3 + 100, null);
                            boolean bl2 = new ae(ds.a[n3], this, n3 + 100, null).r = ds.i[n3] == 1;
                            if (n2 >= 0) {
                                ae2.i = aa[n2];
                            }
                            this.c.addElement(ae2);
                        }
                    }
                }
            } else {
                if (ds.h[n3] == 1) {
                    this.R = 2;
                }
                if (ds.d[n3] == 0 && ds.h[n3] == by3) {
                    n2 = -1;
                    if (ds.e != null && n3 < ds.e.length) {
                        n2 = ds.e[n3];
                    }
                    if (!a || n2 != -1) {
                        ae2 = new ae(ds.a[n3], this, n3 + 100, null);
                        boolean bl3 = new ae(ds.a[n3], this, n3 + 100, null).r = ds.i[n3] == 1;
                        if (n2 >= 0) {
                            ae2.i = aa[n2];
                        }
                        this.c.addElement(ae2);
                    }
                }
            }
            ++n3;
        }
        dt dt2 = this;
        by3 = 0;
        while (by3 < dt2.c.size() - 1) {
            ae ae3 = (ae)dt2.c.elementAt(by3);
            n2 = by3 + 1;
            while (n2 < dt2.c.size()) {
                ae2 = (ae)dt2.c.elementAt(n2);
                if (ae2.r && !ae3.r) {
                    ae ae4 = ae2;
                    ae2 = ae3;
                    ae3 = ae4;
                    dt2.c.setElementAt(ae3, by3);
                    dt2.c.setElementAt(ae2, n2);
                }
                ++n2;
            }
            by3 = (byte)(by3 + 1);
        }
        dt2 = this;
        this.b = ds.p;
        dt2.g = 5;
        dt2.e = 76;
        dt2.f = ew.cE;
        dt2.h = 1;
        by3 = (byte)(dt2.A + dt2.C / 2 + 3);
        dt2.F = dt2.B + 5;
        dt2.h = dt2.C / (dt2.e + dt2.g);
        if (dt2.h <= 0) {
            dt2.h = 1;
        }
        dt2.i = dt2.c.size() / dt2.h + (dt2.c.size() % dt2.h == 0 ? 0 : 1);
        dt2.E = by3 - dt2.h * (dt2.e + dt2.g) / 2;
        int n4 = 0;
        while (n4 < dt2.c.size()) {
            ae ae5 = (ae)dt2.c.elementAt(n4);
            if (ae5 != null) {
                int n5 = dt2.E + n4 % dt2.h * (dt2.e + dt2.g);
                int n6 = dt2.F + n4 / dt2.h * (dt2.f + dt2.g);
                ae5.j = n5;
                ae5.k = n6;
                ae5.l = dt2.e;
            }
            ++n4;
        }
        dt2.o = new s(dt2.A, dt2.B, dt2.C, dt2.D, 0, 0, 0, true);
        n4 = dt2.i * (dt2.f + dt2.g) - dt2.D;
        s s2 = dt2.o;
        if (n4 < 0) {
            n4 = 0;
        }
        s2.c = n4;
        if (s2.b > s2.c) {
            s2.b = s2.c;
        }
        if (s2.a > s2.c) {
            s2.a = s2.c;
        }
        s2 = dt2.o;
        dt2.o.a = 0;
    }

    private void a(eh eh2, int n2, int n3) {
        this.T = n2 -= 5;
        bo.a(eh2, n2, n3, this.P, this.Q, 0, true);
        ev.f.a(eh2, this.W[this.p], n2 + (this.P - 10) / 2, n3 + 5, 2);
        eh2.a(dh.W, 0, 30, 9, 6, 0, n2 + this.P - 10, n3 + 14, 33);
        if (this.t) {
            this.U = n3 + this.Q + 5;
            eh2.a(10254674);
            eh2.d(n2, this.U, this.P, this.W.length * this.V + 1);
            n3 = 0;
            while (n3 < this.W.length) {
                ev.s.a(eh2, this.W[n3], n2 + this.P / 2, this.U + n3 * this.V + 2, 2);
                if (this.p == n3) {
                    eh2.a(15591444);
                    eh2.c(n2 + 2, this.U + n3 * this.V + 1, this.P - 4, this.V - 2);
                }
                ++n3;
            }
        }
    }

    private void e() {
        int n2;
        byte by2;
        if (!this.n) {
            return;
        }
        int n3 = 0;
        if (this.o != null) {
            this.o.b();
            if (main.a.b(this.A, 0, this.C, main.a.B)) {
                this.o.a();
            }
            n3 = this.o.b;
        }
        if (main.a.b(this.A, this.B, this.C, this.D)) {
            by2 = (main.a.p - this.E) / (this.e + this.g) + (main.a.q - this.F + n3) / (this.f + this.g) * this.h;
            n2 = this.c.size();
            if (by2 >= 0 && by2 < n2) {
                this.b = by2;
                by2 = 0;
                while (by2 < this.c.size()) {
                    ae ae2 = (ae)this.c.elementAt(by2);
                    if (ae2 != null) {
                        if (by2 == this.b) {
                            if (ae2.a(0, n3)) {
                                ae2.a();
                            }
                        } else {
                            ae2.n = false;
                        }
                    }
                    ++by2;
                }
            }
        }
        if (main.a.b(this.K - 2, this.L + this.N, this.S + 4, this.S + 4) && main.a.m) {
            a = !a;
            this.a(this.p, this.r);
        }
        if (this.R == 1) {
            return;
        }
        by2 = 0;
        while (by2 < this.R) {
            n2 = this.H + by2 * (this.J + 5);
            if (main.a.a(this.G, n2, this.I, this.J) && main.a.k) {
                this.a(this.p, by2);
                return;
            }
            by2 = (byte)(by2 + 1);
        }
    }

    private void f() {
        if (main.a.b(this.T, this.O, this.P, this.Q) && main.a.m) {
            this.t = !this.t;
            main.a.m = false;
        }
        if (this.t) {
            int n2 = 0;
            while (n2 < this.W.length) {
                int n3 = this.U + n2 * this.V;
                if (main.a.a(this.T, n3, this.P, this.V) && main.a.k) {
                    if (this.m) {
                        this.p = (byte)n2;
                    } else {
                        this.a(n2, (int)this.r);
                    }
                    this.t = false;
                    return;
                }
                n2 = (byte)(n2 + 1);
            }
        }
    }

    private void g() {
        byte[] byArray = ea.b(l);
        try {
            this.p = byArray[0];
            this.q = byArray[1];
            return;
        }
        catch (Exception exception) {
            this.q = 0;
            this.p = 0;
            return;
        }
    }
}

