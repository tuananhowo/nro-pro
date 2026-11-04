/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class df
extends co {
    private static k a;
    private static k b;
    private int c = 0;
    private int d;
    private boolean e;
    private i f;
    private co g;
    private int h;
    private int i;
    private co[] j;
    private long[] k;
    private int l;
    private int[] m;
    private int[] n;
    private int[] o;
    private int[] p;
    private int[][] q;
    private byte r;
    private int s;
    private int t;

    public final void c(int n2) {
        this.f = new i(105, this.N, this.O + 20, 2, 1, -1);
        h.a(this.f);
        if (n2 == co.m().V) {
            this.g = co.m();
            return;
        }
        this.g = cw.b(n2);
    }

    public final void a(int[] nArray) {
        if (this.r == 0) {
            if (this.c == 11) {
                this.e = true;
                i i2 = new i(19, this.N, this.O + 20, 2, 1, -1);
                h.a(i2);
            }
            if (this.c >= nArray.length - 1) {
                this.r = (byte)2;
                return;
            }
        }
        if (this.r == 1 && this.c == nArray.length - 1) {
            this.r = (byte)3;
            this.O -= 15;
            return;
        }
        ++this.c;
        if (this.c > nArray.length - 1) {
            this.c = 0;
        }
        this.s = nArray[this.c];
    }

    public df() {
        int[] nArray = new int[30];
        nArray[2] = 1;
        nArray[3] = 1;
        nArray[4] = 2;
        nArray[5] = 2;
        nArray[6] = 3;
        nArray[7] = 3;
        nArray[8] = 4;
        nArray[9] = 4;
        nArray[10] = 5;
        nArray[11] = 5;
        nArray[12] = 5;
        nArray[13] = 5;
        nArray[14] = 5;
        nArray[15] = 5;
        nArray[16] = 5;
        nArray[17] = 5;
        nArray[18] = 5;
        nArray[19] = 5;
        nArray[20] = 5;
        nArray[21] = 5;
        nArray[22] = 5;
        nArray[23] = 5;
        nArray[24] = 5;
        nArray[25] = 5;
        nArray[26] = 5;
        nArray[27] = 5;
        nArray[28] = 5;
        nArray[29] = 5;
        this.m = nArray;
        int[] nArray2 = new int[15];
        nArray2[2] = 6;
        nArray2[3] = 6;
        nArray2[4] = 7;
        nArray2[5] = 7;
        nArray2[6] = 8;
        nArray2[7] = 8;
        nArray2[8] = 9;
        nArray2[9] = 9;
        nArray2[10] = 9;
        nArray2[11] = 9;
        nArray2[12] = 9;
        nArray2[13] = 10;
        nArray2[14] = 10;
        this.n = nArray2;
        int[] nArray3 = new int[26];
        nArray3[2] = 1;
        nArray3[3] = 1;
        nArray3[4] = 2;
        nArray3[5] = 2;
        nArray3[6] = 3;
        nArray3[7] = 3;
        nArray3[8] = 4;
        nArray3[9] = 4;
        nArray3[10] = 5;
        nArray3[11] = 5;
        nArray3[12] = 6;
        nArray3[13] = 6;
        nArray3[14] = 7;
        nArray3[15] = 7;
        nArray3[16] = 8;
        nArray3[17] = 8;
        nArray3[18] = 9;
        nArray3[19] = 9;
        nArray3[20] = 10;
        nArray3[21] = 10;
        nArray3[22] = 11;
        nArray3[23] = 11;
        nArray3[24] = 12;
        nArray3[25] = 12;
        this.o = nArray3;
        this.p = new int[]{13, 13, 14, 14, 15, 15, 16, 16};
        this.q = new int[][]{this.m, this.n, this.o, this.p};
        this.r = (byte)-1;
        a = null;
        a = new k();
        String string = "/x" + eh.b + "/effectdata/" + 102 + "/data";
        try {
            a.b(string);
            df.a.a = ej.c("/effectdata/102/img.png");
        }
        catch (Exception exception) {}
        b = null;
        b = new k();
        string = "/x" + eh.b + "/effectdata/" + 103 + "/data";
        try {
            b.b(string);
            df.b.a = ej.c("/effectdata/103/img.png");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a(byte by2, short s2, short s3, co[] coArray, long[] lArray) {
        this.r = by2;
        this.h = s2;
        this.i = s3;
        this.d = this.U;
        this.U = this.h > this.N ? 1 : -1;
        this.j = coArray;
        this.k = lArray;
    }

    public final void a() {
        if (this.g != null) {
            if (this.f.e >= 30) {
                this.f.f += (this.N - this.f.f) / 4;
                this.f.g += (this.O - this.f.g) / 4;
                this.g.N = this.f.f;
                this.g.O = this.f.g;
                this.g.cM = true;
            } else {
                this.f.k = this.f.f > this.g.N ? 1 : 0;
                this.f.f += (this.g.N - this.f.f) / 3;
                this.f.g += (this.g.O - this.f.g) / 3;
            }
        }
        if (this.r != -1) {
            i i2;
            if (this.r == 0 && this.e && main.a.w % 2 == 0) {
                this.l += this.h > this.N ? 30 : -30;
                i2 = new i(103, this.N + this.l, this.O + 20, 2, 1, -1);
                new i(103, this.N + this.l, this.O + 20, 2, 1, -1).k = this.h > this.N ? 0 : 1;
                h.a(i2);
                if (this.U == 1 && this.N + this.l >= this.h || this.U == -1 && this.N + this.l <= this.h) {
                    this.e = false;
                    this.r = (byte)-1;
                    this.l = 0;
                    this.c = 0;
                    this.U = this.d;
                    int n2 = 0;
                    while (n2 < this.j.length) {
                        this.j[n2].a(this.k[n2], 0L, false, false);
                        ++n2;
                    }
                }
            }
            if (this.r == 3) {
                this.h = this.j[this.t].N;
                this.i = this.j[this.t].O;
                this.N += (this.h - this.N) / 3;
                this.O += (this.i - this.O) / 3;
                if (main.a.w % 5 == 0) {
                    i2 = new i(19, this.N, this.O, 2, 1, -1);
                    h.a(i2);
                }
                if (dq.g(this.N - this.h) <= 20 && dq.g(this.O - this.i) <= 20) {
                    this.N = this.h;
                    this.O = this.i;
                    this.j[this.t].a(this.k[this.t], 0L, false, false);
                    ++this.t;
                    if (this.t == this.j.length) {
                        this.r = (byte)-1;
                        this.t = 0;
                    }
                }
            }
            return;
        }
        super.a();
    }

    public final void a(eh eh2) {
        if (this.r != -1) {
            this.d(eh2);
            eh2.a(0, main.a.ag);
            this.a(this.q[this.r]);
            if (this.r == 0 || this.r == 1) {
                a.a(eh2, this.s, this.N, this.O + this.cn, this.U == 1 ? 0 : 1, 2);
            } else {
                b.a(eh2, this.s, this.N, this.O + this.cn, this.U == 1 ? 0 : 1, 2);
            }
            eh2.a(0, -main.a.ag);
            return;
        }
        super.a(eh2);
    }
}

