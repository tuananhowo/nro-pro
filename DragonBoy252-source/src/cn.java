/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class cn
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
    private boolean aq;
    private int ar;
    private int as;
    private co[] at;
    private long[] au;
    private byte av;
    private int[] aw;
    private int[] ax;
    private int[] ay;
    private int[] az;
    private int[] aA;
    private boolean aB;

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

    public cn(int n2, short s2, short s3, int n3, long l2, long l3) {
        int[] nArray = new int[12];
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.aw = nArray;
        int[] nArray2 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        int[] nArray3 = new int[]{1, 1, 2, 2, 3, 3, 2};
        int[] nArray4 = new int[12];
        nArray4[3] = 7;
        nArray4[4] = 7;
        nArray4[5] = 7;
        nArray4[6] = 8;
        nArray4[7] = 8;
        nArray4[8] = 8;
        nArray4[9] = 9;
        nArray4[10] = 9;
        nArray4[11] = 9;
        this.ax = nArray4;
        int[] nArray5 = new int[12];
        nArray5[3] = 10;
        nArray5[4] = 10;
        nArray5[5] = 10;
        nArray5[6] = 11;
        nArray5[7] = 11;
        nArray5[8] = 11;
        nArray5[9] = 12;
        nArray5[10] = 12;
        nArray5[11] = 12;
        this.ay = nArray5;
        int[] nArray6 = new int[24];
        nArray6[2] = 1;
        nArray6[3] = 1;
        nArray6[4] = 4;
        nArray6[5] = 4;
        nArray6[6] = 6;
        nArray6[7] = 6;
        nArray6[8] = 8;
        nArray6[9] = 8;
        nArray6[10] = 25;
        nArray6[11] = 25;
        nArray6[12] = 26;
        nArray6[13] = 26;
        nArray6[14] = 28;
        nArray6[15] = 28;
        nArray6[16] = 30;
        nArray6[17] = 30;
        nArray6[18] = 32;
        nArray6[19] = 32;
        nArray6[20] = 2;
        nArray6[21] = 2;
        nArray6[22] = 1;
        nArray6[23] = 1;
        this.az = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        this.aA = new int[]{6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        byte[] byArray = new byte[]{-1, 1};
        this.B = n2;
        this.a = this.p = s2 + 20;
        short s4 = s3;
        this.q = s4;
        this.b = s4;
        this.x = s3;
        this.m = l2;
        this.n = l3;
        this.H = 72;
        this.Z = 100;
        this.C();
        cn cn2 = this;
        ai = null;
        ai = new k();
        String string = "/x" + eh.b + "/effectdata/" + 109 + "/data";
        try {
            ai.b(string);
            cn.ai.a = ej.c("/effectdata/109/img.png");
        }
        catch (Exception exception) {
            cj.a().h(cn2.H);
        }
        cn2.y = cn.ai.f;
        cn2.z = cn.ai.g;
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
        cn cn2 = this;
        byte by2 = dx.i;
        cn2.aj = cn2.p;
        cn2.am = 0;
        if (cn2.ak > 0 && !dx.a(cn2.aj, cn2.ak, 2)) {
            if (dx.a(cn2.aj / by2, cn2.ak / by2) == 0) {
                cn2.al = true;
            } else if (dx.a(cn2.aj / by2, cn2.ak / by2) != 0 && !dx.a(cn2.aj, cn2.ak, 2)) {
                cn2.aj = cn2.p;
                cn2.ak = cn2.q;
                cn2.al = false;
            }
            while (cn2.al && cn2.am < 10) {
                ++cn2.am;
                cn2.ak += 24;
                if (!dx.a(cn2.aj, cn2.ak, 2)) continue;
                if (cn2.ak % 24 == 0) break;
                cn2.ak -= cn2.ak % 24;
                break;
            }
        }
        switch (this.s) {
            case 2: {
                cn2 = this;
                cn2.a(cn2.aw);
                if (cn2.p != cn2.a || cn2.q != cn2.b) {
                    cn2.p += (cn2.a - cn2.p) / 4;
                    cn2.q += (cn2.b - cn2.q) / 4;
                }
                return;
            }
            case 4: {
                this.A = 0;
                cn2 = this;
                if (cn2.aq) {
                    cn2.p = cn2.a;
                    cn2.ar += 2;
                    cn2.q += cn2.ar;
                    cn2.a(cn2.aA);
                    if (cn2.q > cn2.x) {
                        cn2.q = cn2.x;
                        cn2.aq = false;
                        cn2.ar = 0;
                        cn2.s = 2;
                        cw.bH = 10;
                        cn2.aB = true;
                    }
                }
                return;
            }
            case 3: {
                this.l();
                return;
            }
            case 5: {
                this.A = 0;
                cn cn3 = this;
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
                cn2 = this;
                cn2.a(cn2.aw);
                if (main.a.w % 5 == 0) {
                    cn cn4 = cn2;
                    cn4 = cn2;
                    cn cn5 = cn2;
                    cn4 = cn5;
                    cn4 = cn2;
                    cn cn6 = cn2;
                    cn4 = cn6;
                    cn4 = cn2;
                    u.a(167, dq.b(cn2.p - 50 / 2, cn2.p + 50 / 2), dq.b(cn5.q - 50 + 40 / 2, cn6.q - 50 + 40), 1);
                }
                if (cn2.p == cn2.a && cn2.q == cn2.b) break;
                cn2.p += (cn2.a - cn2.p) / 4;
                cn2.q += (cn2.b - cn2.q) / 4;
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
        this.s = 3;
        this.at = coArray;
        this.au = lArray;
        this.av = by2;
        this.ao = 0;
    }

    public final void l() {
        int n2;
        if (this.av == 0) {
            if (this.ao == this.ax.length - 1) {
                this.s = 2;
            }
            this.r = this.p < this.at[0].N ? 1 : -1;
            this.a(this.ax);
            this.p += (this.at[0].N - this.p) / 4;
            this.q += (this.at[0].O - this.q) / 4;
            this.a = this.p;
            if (this.ao == 8) {
                n2 = 0;
                while (n2 < this.at.length) {
                    this.at[n2].a(this.au[n2], 0L, false, false);
                    u.a(102, this.at[n2].N, this.at[n2].O, 1);
                    ++n2;
                }
            }
        }
        if (this.av == 1) {
            if (this.ao == this.ay.length - 1) {
                this.s = 2;
            }
            this.r = this.p < this.at[0].N ? 1 : -1;
            this.a(this.ay);
            if (this.ao == 8) {
                n2 = 0;
                while (n2 < this.at.length) {
                    t.a(this.p + (this.r == 1 ? 45 : -45), this.q - 25, true, this.au[n2], 0L, this.at[n2], 24);
                    ++n2;
                }
            }
        }
        if (this.av == 2) {
            if (this.ao == this.az.length - 1) {
                this.s = 2;
            }
            this.r = this.p < this.at[0].N ? 1 : -1;
            this.a(this.az);
            this.p += (this.at[0].N - this.p) / 4;
            this.a = this.p;
            this.b = this.q;
            if (this.ao == 12) {
                n2 = 0;
                while (n2 < this.at.length) {
                    this.at[n2].a(this.au[n2], 0L, false, false);
                    u.a(102, this.at[n2].N, this.at[n2].O, 1);
                    ++n2;
                }
            }
        }
    }

    public final void m() {
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

    public final void a(eh object) {
        if (ai == null) {
            return;
        }
        if (this.ad) {
            return;
        }
        if (this.R) {
            if (!this.e) {
                ai.a((eh)object, this.ap, this.S, this.T, this.r == 1 ? 0 : 1, 2);
                return;
            }
            er.b((eh)object, this.f, this.S, this.T, this.r == 1 ? 0 : 2, 33);
            return;
        }
        if (this.an && this.s != 0) {
            eh eh2 = object;
            cn cn2 = this;
            eh2.a(c, cn2.aj, cn2.x, 3);
            eh2.e(cw.j, cw.k - main.a.ag, cw.d, cw.e + 2 * main.a.ag);
        }
        ((eh)object).a(0, main.a.ag);
        if (!this.e) {
            ai.a((eh)object, this.ap, this.p, this.q, this.r == 1 ? 0 : 1, 2);
        } else {
            er.b((eh)object, this.f, this.p, this.q - 9, this.r == 1 ? 0 : 2, 33);
        }
        ((eh)object).a(0, -main.a.ag);
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
        ((eh)object).a(cw.aU, n5, n6, 20);
        ((eh)object).a(cw.aU, n5 + n2, n6, 20);
        ((eh)object).a(this.ac, 0, 0, n4, n3, 0, n5, n6, 20);
        ((eh)object).a(this.ac, 0, 0, n7, n3, 0, n5 + n2, n6, 20);
        if (this.aB) {
            ++this.as;
            object = new i(this.av == 2 ? 19 : 22, this.p + this.as * 50, this.q + 25, 2, 1, -1);
            h.a((i)object);
            object = new i(this.av == 2 ? 19 : 22, this.p - this.as * 50, this.q + 25, 2, 1, -1);
            h.a((i)object);
            if (this.as == 50) {
                this.as = 0;
                this.aB = false;
            }
        }
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
        return this.q - 50;
    }

    public final int d() {
        return 40;
    }

    public final int e() {
        return 50;
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
}

