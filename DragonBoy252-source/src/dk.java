/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class dk
extends dh
implements cy {
    private static Image c = ej.b("/mainImage/shadowBig.png");
    public int a;
    public int b;
    private int ai;
    private int aj;
    private boolean ak = true;
    private int al;
    private int am;
    private co[] an;
    private long[] ao;
    private byte ap;
    private int aq;
    private int ar = -1;
    private int as = -1;
    private int at = -1;
    private int[][] au;

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

    public dk(int n2, short s2, short s3, int n3, long l2, long l3) {
        byte[] byArray = new byte[]{-1, 1};
        int[][] nArrayArray = new int[17][];
        int[] nArray = new int[8];
        nArray[4] = 1;
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArrayArray[0] = nArray;
        int[] nArray2 = new int[8];
        nArray2[4] = 1;
        nArray2[5] = 1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArrayArray[1] = nArray2;
        int[] nArray3 = new int[8];
        nArray3[4] = 1;
        nArray3[5] = 1;
        nArray3[6] = 1;
        nArray3[7] = 1;
        nArrayArray[2] = nArray3;
        int[] nArray4 = new int[8];
        nArray4[4] = 1;
        nArray4[5] = 1;
        nArray4[6] = 1;
        nArray4[7] = 1;
        nArrayArray[3] = nArray4;
        int[] nArray5 = new int[8];
        nArray5[4] = 1;
        nArray5[5] = 1;
        nArray5[6] = 1;
        nArray5[7] = 1;
        nArrayArray[4] = nArray5;
        int[] nArray6 = new int[8];
        nArray6[4] = 1;
        nArray6[5] = 1;
        nArray6[6] = 1;
        nArray6[7] = 1;
        nArrayArray[5] = nArray6;
        int[] nArray7 = new int[8];
        nArray7[4] = 1;
        nArray7[5] = 1;
        nArray7[6] = 1;
        nArray7[7] = 1;
        nArrayArray[6] = nArray7;
        int[] nArray8 = new int[8];
        nArray8[4] = 1;
        nArray8[5] = 1;
        nArray8[6] = 1;
        nArray8[7] = 1;
        nArrayArray[7] = nArray8;
        int[] nArray9 = new int[8];
        nArray9[4] = 1;
        nArray9[5] = 1;
        nArray9[6] = 1;
        nArray9[7] = 1;
        nArrayArray[8] = nArray9;
        int[] nArray10 = new int[8];
        nArray10[4] = 1;
        nArray10[5] = 1;
        nArray10[6] = 1;
        nArray10[7] = 1;
        nArrayArray[9] = nArray10;
        int[] nArray11 = new int[8];
        nArray11[4] = 1;
        nArray11[5] = 1;
        nArray11[6] = 1;
        nArray11[7] = 1;
        nArrayArray[10] = nArray11;
        int[] nArray12 = new int[8];
        nArray12[4] = 1;
        nArray12[5] = 1;
        nArray12[6] = 1;
        nArray12[7] = 1;
        nArrayArray[11] = nArray12;
        int[] nArray13 = new int[8];
        nArray13[4] = 1;
        nArray13[5] = 1;
        nArray13[6] = 1;
        nArray13[7] = 1;
        nArrayArray[12] = nArray13;
        int[] nArray14 = new int[8];
        nArray14[4] = 1;
        nArray14[5] = 1;
        nArray14[6] = 1;
        nArray14[7] = 1;
        nArrayArray[13] = nArray14;
        int[] nArray15 = new int[8];
        nArray15[4] = 1;
        nArray15[5] = 1;
        nArray15[6] = 1;
        nArray15[7] = 1;
        nArrayArray[14] = nArray15;
        int[] nArray16 = new int[8];
        nArray16[4] = 1;
        nArray16[5] = 1;
        nArray16[6] = 1;
        nArray16[7] = 1;
        nArrayArray[15] = nArray16;
        int[] nArray17 = new int[8];
        nArray17[4] = 1;
        nArray17[5] = 1;
        nArray17[6] = 1;
        nArray17[7] = 1;
        nArrayArray[16] = nArray17;
        this.au = nArrayArray;
        this.B = n2;
        this.p = this.w = s2 + 20;
        short s4 = s3;
        this.x = s4;
        this.q = s4;
        this.a = this.p;
        this.b = this.q;
        this.n = l3;
        this.m = l2;
        this.H = n3;
        this.Z = 100;
        this.C();
        if (dh.d[this.H].f == null) {
            cj.a().h(this.H);
        }
        this.s = 2;
        this.au = null;
    }

    public final void a(int[] nArray) {
        ++this.al;
        if (this.al > nArray.length - 1) {
            this.al = 0;
        }
        this.am = nArray[this.al];
    }

    public final void h() {
    }

    public final void i() {
        if (this.au == null && dh.d[this.H].f != null) {
            this.D();
        }
        if (this.au == null) {
            return;
        }
        if (!this.o()) {
            return;
        }
        dk dk2 = this;
        int n2 = 0;
        dk2.ai = dk2.p;
        if (dx.a(dk2.p, dk2.q, 2)) {
            dk2.aj = dk2.q;
        } else {
            dk2.aj = dk2.q;
            while (n2 < 30) {
                ++n2;
                dk2.aj += 24;
                if (!dx.a(dk2.ai, dk2.aj, 2)) continue;
                if (dk2.aj % 24 == 0) break;
                dk2.aj -= dk2.aj % 24;
                break;
            }
        }
        switch (this.s) {
            case 2: {
                dk2 = this;
                dk2.a(dk2.au[0]);
                if (dk2.p != dk2.a || dk2.q != dk2.b) {
                    dk2.p += (dk2.a - dk2.p) / 4;
                    dk2.q += (dk2.b - dk2.q) / 4;
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
                super.i();
                return;
            }
            case 0: 
            case 1: {
                dk2 = this;
                ++dk2.al;
                if (dk2.al > dk2.au[13].length - 1) {
                    dk2.al = dk2.au[13].length - 1;
                }
                dk2.am = dk2.au[13][dk2.al];
                if (dk2.p == dk2.a && dk2.q == dk2.b) break;
                dk2.p += (dk2.a - dk2.p) / 4;
                dk2.q += (dk2.b - dk2.q) / 4;
            }
        }
    }

    public final void a(co co2) {
        this.I = co2;
        this.t = 0;
        this.u = 0;
        this.s = 3;
        this.al = 0;
        int n2 = co2.N;
        int n3 = co2.O;
        if (dq.g(n2 - this.p) < this.y << 1 && dq.g(n3 - this.q) < this.z << 1) {
            this.p = this.p < n2 ? n2 - this.y : n2 + this.y;
            this.v = 0;
            return;
        }
        this.v = 1;
    }

    public final void u() {
        this.s = 4;
    }

    public final void a(co[] coArray, long[] lArray, byte by2, byte by3) {
        this.an = coArray;
        this.ao = lArray;
        this.ap = by2;
        this.r = by3;
        this.s = 3;
        if (this.p != this.a || this.q != this.b) {
            this.p += (this.a - this.p) / 4;
            this.q += (this.b - this.q) / 4;
        }
    }

    public final void l() {
        if (this.al == this.au[this.ap + 1].length - 1) {
            this.s = 2;
        }
        this.a(this.au[this.ap + 1]);
        if (this.al == this.au[15][this.ap - 1]) {
            int n2 = 0;
            while (n2 < this.an.length) {
                this.an[n2].a(this.ao[n2], 0L, false, false);
                u.a(this.au[16][this.ap - 1], this.an[n2].N, this.an[n2].O, 1);
                ++n2;
            }
        }
    }

    public final void m() {
        int n2;
        this.a(this.au[1]);
        int n3 = n2 = dh.d[this.H].b;
        if (dq.g(this.p - this.a) < n2) {
            n3 = dq.g(this.p - this.a);
        }
        this.p += this.p < this.a ? n3 : -n3;
        this.q = this.b;
        if (this.p < this.a) {
            this.r = 1;
        } else if (this.p > this.a) {
            this.r = -1;
        }
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
        int n2;
        if (dh.d[this.H].f == null) {
            return;
        }
        if (this.ad) {
            return;
        }
        if (this.R) {
            if (!this.e) {
                dh.d[this.H].f.a(eh2, this.am, this.S, this.T, this.r == 1 ? 0 : 1, 2);
                return;
            }
            er.b(eh2, this.f, this.S, this.T, this.r == 1 ? 0 : 2, 33);
            return;
        }
        if (this.ak) {
            eh eh3 = eh2;
            dk dk2 = this;
            n2 = dx.i;
            if ((dx.l < 114 || dx.l > 120) && dx.l != 127 && dx.l != 128) {
                if (dx.a(dk2.ai + n2 / 2, dk2.aj + 1, 4)) {
                    eh3.e(dk2.ai / n2 * n2, (dk2.aj - 30) / n2 * n2, n2, 100);
                } else if (dx.a((dk2.ai - n2 / 2) / n2, (dk2.aj + 1) / n2) == 0) {
                    eh3.e(dk2.ai / n2 * n2, (dk2.aj - 30) / n2 * n2, 100, 100);
                } else if (dx.a((dk2.ai + n2 / 2) / n2, (dk2.aj + 1) / n2) == 0) {
                    eh3.e(dk2.ai / n2 * n2, (dk2.aj - 30) / n2 * n2, n2, 100);
                } else if (dx.a(dk2.ai - n2 / 2, dk2.aj + 1, 8)) {
                    eh3.e(dk2.ai / 24 * n2, (dk2.aj - 30) / n2 * n2, n2, 100);
                }
            }
            eh3.a(c, dk2.ai, dk2.aj - 5, 3);
            eh3.e(cw.j, cw.k - main.a.ag, cw.d, cw.e + 2 * main.a.ag);
        }
        eh2.a(0, main.a.ag);
        if (!this.e) {
            if (this.at == -1) {
                this.at = this.q;
            }
            if (dx.a(this.p + 33, this.q, 4)) {
                this.as = dx.f(this.p + 33) - 33;
                this.ar = dx.f(this.p + 33);
                if (this.p > this.as && this.p < this.ar && this.ar != -1) {
                    this.p = this.as;
                }
            }
            if (this.q < this.at && this.at != -1) {
                this.at = this.q;
                this.p += 33;
            }
            if (this.q > this.at) {
                this.at = this.q;
                this.p -= 33;
            }
            dh.d[this.H].f.a(eh2, this.am, this.p, this.q, this.r == 1 ? 0 : 1, 2);
        } else {
            er.b(eh2, this.f, this.p, this.q - 9, this.r == 1 ? 0 : 2, 33);
        }
        eh2.a(0, -main.a.ag);
        if (this.m > 0L) {
            int n3;
            int n4 = eh.a(this.ac);
            int n5 = eh.b(this.ac);
            n2 = n4;
            int n6 = this.p - n4;
            int n7 = this.q - this.z - 5;
            int n8 = n3 = (n4 << 1) * this.aa / 100;
            if (this.ab >= this.aa) {
                int n9;
                if (main.a.w % 6 > 3) {
                    int n10 = this.aq;
                    n9 = n10;
                    this.aq = n10 + 1;
                } else {
                    n9 = this.aq;
                }
                n8 = n4 * (this.ab -= n9) / 100;
                if (this.ab <= 0) {
                    this.ab = 0;
                }
                if (this.ab < this.aa) {
                    this.ab = this.aa;
                }
                if (this.aq >= 3) {
                    this.aq = 3;
                }
            }
            if (n3 > n4) {
                if ((n3 -= n4) <= 0) {
                    n3 = 0;
                }
            } else {
                n2 = n3;
                n3 = 0;
            }
            eh2.a(cw.aU, n6, n7, 20);
            eh2.a(cw.aU, n6 + n4, n7, 20);
            eh2.a(0xFFFFFF);
            eh2.d(n6, n7, n8, 2);
            eh2.a(this.ac, 0, 0, n2, n5, 0, n6, n7, 20);
            eh2.a(this.ac, 0, 0, n3, n5, 0, n6 + n4, n7, 20);
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
        this.al = 0;
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
        return this.q;
    }

    public final int d() {
        return this.z;
    }

    public final int e() {
        return this.y;
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

    public final void a(short s2, short s3) {
        if (s3 != -1) {
            if (dq.a(this.p, this.q, this.a, this.b) > 100) {
                this.p = s2;
                this.q = s3;
                this.s = 2;
                return;
            }
            this.a = s2;
            this.b = s3;
            this.s = 5;
            return;
        }
        this.a = s2;
        this.s = 5;
    }

    public final void D() {
        try {
            this.au = (int[][])ci.d.get(String.valueOf(this.H));
            this.y = dh.d[this.H].f.f;
            this.z = dh.d[this.H].f.g;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void v() {
        this.s = 0;
    }
}

