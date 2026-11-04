/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class ck
extends dh
implements cy {
    private static Image c = ej.b("/mainImage/shadowBig.png");
    private static k ai;
    public int a;
    public int b;
    private int aj;
    private int ak;
    private boolean al;
    private int am;
    private boolean an = true;
    private int ao;
    private int ap;
    private co[] aq;
    private long[] ar;
    private byte as;
    private int[] at;
    private int[] au;
    private int[] av;
    private int[] aw;

    static {
        ej.b("/mainImage/myTexture2dmobHP.png");
    }

    public final void a(short s2) {
        this.e = true;
        this.f = s2;
    }

    public final void a() {
        this.e = false;
    }

    public ck(int n2, short s2, short s3, int n3, long l2, long l3) {
        int[] nArray = new int[12];
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.at = nArray;
        int[] nArray2 = new int[12];
        nArray2[3] = 2;
        nArray2[4] = 2;
        nArray2[5] = 2;
        nArray2[6] = 3;
        nArray2[7] = 3;
        nArray2[8] = 3;
        nArray2[9] = 4;
        nArray2[10] = 4;
        nArray2[11] = 4;
        this.au = nArray2;
        int[] nArray3 = new int[12];
        nArray3[3] = 4;
        nArray3[4] = 4;
        nArray3[5] = 4;
        nArray3[6] = 5;
        nArray3[7] = 5;
        nArray3[8] = 5;
        nArray3[9] = 6;
        nArray3[10] = 6;
        nArray3[11] = 6;
        this.av = nArray3;
        int[] nArray4 = new int[17];
        nArray4[3] = 7;
        nArray4[4] = 7;
        nArray4[5] = 7;
        nArray4[6] = 8;
        nArray4[7] = 8;
        nArray4[8] = 8;
        nArray4[9] = 9;
        nArray4[10] = 9;
        nArray4[11] = 9;
        nArray4[12] = 10;
        nArray4[13] = 10;
        nArray4[14] = 10;
        nArray4[15] = 11;
        nArray4[16] = 11;
        this.aw = nArray4;
        int[] nArray5 = new int[]{1, 1, 7, 7};
        byte[] byArray = new byte[]{-1, 1};
        this.B = n2;
        this.p = s2 + 20;
        this.q = s3;
        this.a = this.p;
        this.b = this.q;
        this.n = l3;
        this.m = l2;
        this.H = 71;
        this.Z = 100;
        this.C();
        ck ck2 = this;
        ai = null;
        ai = new k();
        String string = "/x" + eh.b + "/effectdata/" + 108 + "/data";
        try {
            ai.b(string);
            ck.ai.a = ej.c("/effectdata/108/img.png");
        }
        catch (Exception exception) {
            cj.a().h(ck2.H);
        }
        ck2.y = ck.ai.f;
        ck2.z = ck.ai.g;
        this.s = 2;
    }

    public final void a(int[] nArray) {
        ++this.ao;
        if (this.ao > nArray.length - 1) {
            this.ao = 0;
        }
        this.ap = nArray[this.ao];
    }

    public final void h() {
    }

    public final void i() {
        if (!this.o()) {
            return;
        }
        ck ck2 = this;
        byte by2 = dx.i;
        ck2.aj = ck2.p;
        ck2.am = 0;
        if (ck2.ak > 0 && !dx.a(ck2.aj, ck2.ak, 2)) {
            if (dx.a(ck2.aj / by2, ck2.ak / by2) == 0) {
                ck2.al = true;
            } else if (dx.a(ck2.aj / by2, ck2.ak / by2) != 0 && !dx.a(ck2.aj, ck2.ak, 2)) {
                ck2.aj = ck2.p;
                ck2.ak = ck2.q;
                ck2.al = false;
            }
            while (ck2.al && ck2.am < 10) {
                ++ck2.am;
                ck2.ak += 24;
                if (!dx.a(ck2.aj, ck2.ak, 2)) continue;
                if (ck2.ak % 24 == 0) break;
                ck2.ak -= ck2.ak % 24;
                break;
            }
        }
        switch (this.s) {
            case 2: {
                ck2 = this;
                ck2.a(ck2.at);
                if (ck2.p != ck2.a || ck2.q != ck2.b) {
                    ck2.p += (ck2.a - ck2.p) / 4;
                    ck2.q += (ck2.b - ck2.q) / 4;
                }
                return;
            }
            case 3: {
                this.l();
                return;
            }
            case 5: {
                this.A = 0;
                this.m();
                return;
            }
            case 6: {
                this.A = 0;
                ++this.t;
                this.q += this.t;
                if (this.q < this.x) break;
                this.q = this.x;
                this.t = 0;
                this.s = 5;
                return;
            }
            case 7: {
                return;
            }
            case 0: 
            case 1: {
                ck2 = this;
                ck2.a(ck2.at);
                if (main.a.w % 5 == 0) {
                    ck ck3 = ck2;
                    ck3 = ck2;
                    ck ck4 = ck2;
                    ck3 = ck4;
                    ck3 = ck2;
                    ck ck5 = ck2;
                    ck3 = ck5;
                    ck3 = ck2;
                    u.a(167, dq.b(ck2.p - 40 / 2, ck2.p + 40 / 2), dq.b(ck4.q - 40 + 40 / 2, ck5.q - 40 + 40), 1);
                }
                if (ck2.p == ck2.a && ck2.q == ck2.b) break;
                ck2.p += (ck2.a - ck2.p) / 4;
                ck2.q += (ck2.b - ck2.q) / 4;
            }
        }
    }

    public final void j() {
    }

    public final void a(co co2) {
        this.I = co2;
        this.t = 0;
        this.u = 0;
        this.s = 3;
        this.ao = 0;
        this.r = co2.N > this.p ? 1 : -1;
        int n2 = co2.N;
        int n3 = co2.O;
        if (dq.g(n2 - this.p) < this.y << 1 && dq.g(n3 - this.q) < this.z << 1) {
            this.p = this.p < n2 ? n2 - this.y : n2 + this.y;
            this.v = 0;
            return;
        }
        this.v = 1;
    }

    final boolean k() {
        return this.H >= 58 && this.H <= 65 || this.H == 67 || this.H == 68;
    }

    public final void a(co[] coArray, long[] lArray, byte by2) {
        this.aq = coArray;
        this.ar = lArray;
        this.as = by2;
        this.s = 3;
    }

    public final void l() {
        int n2;
        if (this.as == 3) {
            if (this.ao == this.av.length - 1) {
                this.s = 2;
            }
            this.r = this.p < this.aq[0].N ? 1 : -1;
            this.a(this.av);
            this.p += (this.aq[0].N - this.p) / 4;
            this.q += (this.aq[0].O - this.q) / 4;
            this.a = this.p;
            if (this.ao == 8) {
                n2 = 0;
                while (n2 < this.aq.length) {
                    this.aq[n2].a(this.ar[n2], 0L, false, false);
                    u.a(102, this.aq[n2].N, this.aq[n2].O, 1);
                    ++n2;
                }
            }
        }
        if (this.as == 4) {
            if (this.ao == this.aw.length - 1) {
                this.s = 2;
            }
            this.r = this.p < this.aq[0].N ? 1 : -1;
            this.a(this.aw);
            if (this.ao == 8) {
                n2 = 0;
                while (n2 < this.aq.length) {
                    this.aq[n2].a(this.ar[n2], 0L, false, false);
                    u.a(102, this.aq[n2].N, this.aq[n2].O, 1);
                    ++n2;
                }
            }
        }
    }

    public final void m() {
        this.a(this.au);
        this.p += this.p < this.a ? 2 : -2;
        this.q = this.b;
        int n2 = this.r = this.p < this.a ? 1 : -1;
        if (dq.g(this.p - this.a) <= 1) {
            this.p = this.a;
            this.s = 2;
        }
    }

    public final boolean n() {
        if (this.p < cw.j) {
            return false;
        }
        if (this.p > cw.j + cw.d) {
            return false;
        }
        if (this.q < cw.k) {
            return false;
        }
        if (this.q > cw.k + cw.e + 30) {
            return false;
        }
        return this.s != 0;
    }

    public final boolean o() {
        return this.s != 0;
    }

    public final boolean p() {
        return this.N || this.M > 0;
    }

    public final void a(eh eh2) {
        if (ai == null) {
            return;
        }
        if (this.ad) {
            return;
        }
        if (this.R) {
            if (!this.e) {
                ai.a(eh2, this.ap, this.S, this.T, this.r == 1 ? 0 : 1, 2);
                return;
            }
            er.b(eh2, this.f, this.S, this.T, this.r == 1 ? 0 : 2, 33);
            return;
        }
        if (this.an && this.s != 0) {
            eh eh3 = eh2;
            ck ck2 = this;
            eh3.a(c, ck2.aj, ck2.x, 3);
            eh3.e(cw.j, cw.k - main.a.ag, cw.d, cw.e + 2 * main.a.ag);
        }
        eh2.a(0, main.a.ag);
        if (!this.e) {
            ai.a(eh2, this.ap, this.p, this.q, this.r == 1 ? 0 : 1, 2);
        } else {
            er.b(eh2, this.f, this.p, this.q - 9, this.r == 1 ? 0 : 2, 33);
        }
        eh2.a(0, -main.a.ag);
        int n2 = eh.a(this.ac);
        int n3 = eh.b(this.ac);
        int n4 = n2;
        int n5 = this.p - n2;
        int n6 = this.q - this.z - 5;
        int n7 = (n2 << 1) * this.aa / 100;
        if (n7 > n2) {
            if ((n7 -= n2) <= 0) {
                n7 = 0;
            }
        } else {
            n4 = n7;
            n7 = 0;
        }
        eh2.a(cw.aU, n5, n6, 20);
        eh2.a(cw.aU, n5 + n2, n6, 20);
        eh2.a(this.ac, 0, 0, n4, n3, 0, n5, n6, 20);
        eh2.a(this.ac, 0, 0, n7, n3, 0, n5 + n2, n6, 20);
    }

    public final void q() {
        this.m = 0L;
        this.m = 0L;
        this.s = 1;
        this.t = -3;
        this.u = -this.r;
        this.v = 0;
    }

    public final void a(dh dh2) {
        this.I = null;
        this.t = 0;
        this.u = 0;
        this.s = 3;
        this.ao = 0;
        this.r = dh2.p > this.p ? 1 : -1;
        int n2 = dh2.p;
        int n3 = dh2.q;
        if (dq.g(n2 - this.p) < this.y << 1 && dq.g(n3 - this.q) < this.z << 1) {
            this.p = this.p < n2 ? n2 - this.y : n2 + this.y;
            this.v = 0;
            return;
        }
        this.v = 1;
    }

    public final int b() {
        return this.p;
    }

    public final int c() {
        return this.q - 40;
    }

    public final int d() {
        return 40;
    }

    public final int e() {
        return 40;
    }

    public final void f() {
        if (this.s == 5) {
            this.s = 2;
            this.v = 0;
            this.u = 0;
            this.t = 0;
        }
    }

    public final boolean g() {
        return this.s == 0 || this.s == 1;
    }

    public final void r() {
        if (this.l != 0) {
            this.l = 0;
        }
    }

    public final void s() {
    }

    public final void t() {
    }

    public final void b(short s2) {
        this.a = s2;
        this.s = 5;
    }
}

