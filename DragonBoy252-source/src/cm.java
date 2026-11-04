/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class cm
extends dh
implements cy {
    private static Image ai = ej.b("/mainImage/shadowBig.png");
    private static k aj;
    public int a;
    public int b;
    public boolean c;
    private int ak;
    private int al;
    private boolean am;
    private int an;
    private boolean ao = true;
    private int ap;
    private int aq;
    private boolean ar;
    private boolean as;
    private int at;
    private int au;
    private co[] av;
    private long[] aw;
    private byte ax;
    private int[] ay;
    private int[] az;
    private int[] aA;
    private int[] aB;
    private int[] aC;
    private int[] aD;
    private int[] aE;
    private int[] aF;
    private int[] aG;
    private boolean aH;

    public final void u() {
        aj = null;
        aj = new k();
        String string = "/x" + eh.b + "/effectdata/" + 100 + "/data";
        try {
            aj.b(string);
            cm.aj.a = ej.c("/effectdata/100/img.png");
        }
        catch (Exception exception) {
            cj.a().h(this.H);
        }
        this.s = 2;
        this.y = cm.aj.f;
        this.z = cm.aj.g;
    }

    public final void a(short s2) {
        this.e = true;
        this.f = s2;
    }

    public final void a() {
        this.e = false;
    }

    public cm(int n2, short s2, short s3, int n3, long l2, long l3, int n4) {
        int[] nArray = new int[12];
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.ay = nArray;
        this.az = new int[]{37, 37, 37, 38, 38, 38, 39, 39, 40, 40, 40, 39, 39, 39, 38, 38, 38};
        int[] nArray2 = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        int[] nArray3 = new int[]{1, 1, 2, 2, 3, 3, 2};
        int[] nArray4 = new int[12];
        nArray4[2] = 34;
        nArray4[3] = 34;
        nArray4[4] = 35;
        nArray4[5] = 35;
        nArray4[6] = 36;
        nArray4[7] = 36;
        nArray4[8] = 2;
        nArray4[9] = 2;
        nArray4[10] = 1;
        nArray4[11] = 1;
        this.aA = nArray4;
        int[] nArray5 = new int[23];
        nArray5[3] = 4;
        nArray5[4] = 4;
        nArray5[5] = 6;
        nArray5[6] = 6;
        nArray5[7] = 9;
        nArray5[8] = 9;
        nArray5[9] = 10;
        nArray5[10] = 10;
        nArray5[11] = 13;
        nArray5[12] = 13;
        nArray5[13] = 15;
        nArray5[14] = 15;
        nArray5[15] = 17;
        nArray5[16] = 17;
        nArray5[17] = 19;
        nArray5[18] = 19;
        nArray5[19] = 21;
        nArray5[20] = 21;
        nArray5[21] = 23;
        nArray5[22] = 23;
        this.aB = nArray5;
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
        this.aC = nArray6;
        this.aD = new int[]{37, 37, 5, 5, 7, 7, 11, 11, 14, 14, 16, 16, 18, 18, 20, 20, 22, 22, 24, 24};
        this.aE = new int[]{37, 37, 37, 38, 38, 5, 5, 7, 7, 11, 11, 27, 27, 29, 29, 31, 31, 33, 33, 38, 38};
        this.aF = new int[]{8, 8, 9, 9, 10, 10, 12, 12};
        int[] nArray7 = new int[24];
        nArray7[2] = 1;
        nArray7[3] = 1;
        nArray7[4] = 4;
        nArray7[5] = 4;
        nArray7[6] = 6;
        nArray7[7] = 6;
        nArray7[8] = 8;
        nArray7[9] = 8;
        nArray7[10] = 25;
        nArray7[11] = 25;
        nArray7[12] = 26;
        nArray7[13] = 26;
        nArray7[14] = 28;
        nArray7[15] = 28;
        nArray7[16] = 30;
        nArray7[17] = 30;
        nArray7[18] = 32;
        nArray7[19] = 32;
        nArray7[20] = 2;
        nArray7[21] = 2;
        nArray7[22] = 1;
        nArray7[23] = 1;
        this.aG = nArray7;
        byte[] byArray = new byte[]{-1, 1};
        this.w = this.p = s2 + 20;
        short s4 = s3;
        this.q = s4;
        this.x = s4;
        this.B = n2;
        this.m = l2;
        this.n = l3;
        this.H = 70;
        this.Z = 100;
        this.C();
        if (n4 == 0) {
            cm cm2 = this;
            aj = null;
            aj = new k();
            String string = "/x" + eh.b + "/effectdata/" + 101 + "/data";
            try {
                aj.b(string);
                cm.aj.a = ej.c("/effectdata/101/img.png");
            }
            catch (Exception exception) {
                cj.a().h(cm2.H);
            }
            cm2.y = cm.aj.f;
            cm2.z = cm.aj.g;
        }
        if (n4 == 1) {
            this.u();
        }
        if (n4 == 2) {
            this.u();
            this.c = true;
        }
        this.s = 2;
    }

    public final void a(int[] nArray) {
        ++this.ap;
        if (this.ap > nArray.length - 1) {
            this.ap = 0;
        }
        this.aq = nArray[this.ap];
    }

    public final void h() {
    }

    public final void i() {
        if (!this.o()) {
            return;
        }
        cm cm2 = this;
        byte by2 = dx.i;
        cm2.ak = cm2.p;
        cm2.an = 0;
        if (cm2.al > 0 && !dx.a(cm2.ak, cm2.al, 2)) {
            if (dx.a(cm2.ak / by2, cm2.al / by2) == 0) {
                cm2.am = true;
            } else if (dx.a(cm2.ak / by2, cm2.al / by2) != 0 && !dx.a(cm2.ak, cm2.al, 2)) {
                cm2.ak = cm2.p;
                cm2.al = cm2.q;
                cm2.am = false;
            }
            while (cm2.am && cm2.an < 10) {
                ++cm2.an;
                cm2.al += 24;
                if (!dx.a(cm2.ak, cm2.al, 2)) continue;
                if (cm2.al % 24 == 0) break;
                cm2.al -= cm2.al % 24;
                break;
            }
        }
        switch (this.s) {
            case 2: {
                cm2 = this;
                cm2.a(cm2.c ? cm2.az : cm2.ay);
                if (cm2.p != cm2.w || cm2.q != cm2.x) {
                    cm2.p += (cm2.w - cm2.p) / 4;
                    cm2.q += (cm2.x - cm2.q) / 4;
                }
                return;
            }
            case 4: {
                this.A = 0;
                cm2 = this;
                if (cm2.ar) {
                    ++cm2.at;
                    cm2.q -= cm2.at;
                    cm2.a(cm2.aF);
                    if (cm2.q <= -500) {
                        cm2.ar = false;
                        cm2.as = true;
                        cm2.at = 0;
                    }
                }
                if (cm2.as) {
                    cm2.p = cm2.a;
                    cm2.at += 2;
                    cm2.q += cm2.at;
                    cm2.a(cm2.aG);
                    if (cm2.q > cm2.x) {
                        cm2.q = cm2.x;
                        cm2.as = false;
                        cm2.at = 0;
                        cm2.s = 2;
                        cw.bH = 10;
                        cm2.aH = true;
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
                cm cm3 = this;
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
                cm2 = this;
                cm2.a(cm2.c ? cm2.az : cm2.ay);
                if (main.a.w % 5 == 0) {
                    cm cm4 = cm2;
                    cm4 = cm2;
                    cm4 = cm2;
                    cm4 = cm2;
                    u.a(167, dq.b(cm2.p - 60 / 2, cm2.p + 60 / 2), dq.b(cm2.c() + 40 / 2, cm2.c() + 40), 1);
                }
                if (cm2.p == cm2.w && cm2.q == cm2.x) break;
                cm2.p += (cm2.w - cm2.p) / 4;
                cm2.q += (cm2.x - cm2.q) / 4;
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
        this.ap = 0;
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

    public final void v() {
        this.s = 4;
        this.ar = true;
    }

    public final void a(co[] coArray, long[] lArray, byte by2) {
        this.av = coArray;
        this.aw = lArray;
        this.ax = by2;
        this.ap = 0;
        if (by2 < 3) {
            this.s = 3;
        }
        if (by2 == 3) {
            this.ar = true;
            this.s = 4;
        }
        if (by2 == 4) {
            int n2 = 0;
            while (n2 < this.av.length) {
                this.av[n2].a(this.aw[n2], 0L, false, false);
                ++n2;
            }
        }
        if (by2 == 7) {
            this.s = 3;
        }
    }

    public final void l() {
        int n2;
        if (this.ax == 7) {
            if (this.ap > 8) {
                this.ap = 8;
            }
            this.a(this.aA);
            if (main.a.w % 4 == 0) {
                u.a(70, this.p + (this.r == 1 ? 15 : -15), this.q - 40, 1);
            }
        }
        if (this.ax == 0) {
            if (this.ap == this.aA.length - 1) {
                this.s = 2;
            }
            this.r = this.p < this.av[0].N ? 1 : -1;
            this.a(this.aA);
            if (this.ap == 8) {
                n2 = 0;
                while (n2 < this.av.length) {
                    t.a(this.p + (this.r == 1 ? 45 : -45), this.q - 30, true, this.aw[n2], 0L, this.av[n2], 24);
                    ++n2;
                }
            }
        }
        if (this.ax == 1) {
            if (this.ap == (this.c ? this.aD.length - 1 : this.aB.length - 1)) {
                this.s = 2;
            }
            this.r = this.p < this.av[0].N ? 1 : -1;
            this.a(this.c ? this.aD : this.aB);
            this.p += (this.av[0].N - this.p) / 4;
            this.q += (this.av[0].O - this.q) / 4;
            if (this.ap == 18) {
                n2 = 0;
                while (n2 < this.av.length) {
                    this.av[n2].a(this.aw[n2], 0L, false, false);
                    u.a(102, this.av[n2].N, this.av[n2].O, 1);
                    ++n2;
                }
            }
        }
        if (this.ax == 2) {
            if (this.ap == (this.c ? this.aE.length - 1 : this.aC.length - 1)) {
                this.s = 2;
            }
            this.r = this.p < this.av[0].N ? 1 : -1;
            this.a(this.c ? this.aE : this.aC);
            if (this.ap == 13) {
                cw.bH = 10;
                this.aH = true;
                n2 = 0;
                while (n2 < this.av.length) {
                    this.av[n2].a(this.aw[n2], 0L, false, false);
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
        if (aj == null) {
            return;
        }
        if (this.ad) {
            return;
        }
        if (this.R) {
            if (!this.e) {
                aj.a((eh)object, this.aq, this.S, this.T, this.r == 1 ? 0 : 1, 2);
                return;
            }
            er.b((eh)object, this.f, this.S, this.T, this.r == 1 ? 0 : 2, 33);
            return;
        }
        if (this.ao && this.s != 0) {
            eh eh2 = object;
            cm cm2 = this;
            eh2.a(ai, cm2.ak, cm2.x, 3);
            eh2.e(cw.j, cw.k - main.a.ag, cw.d, cw.e + 2 * main.a.ag);
        }
        ((eh)object).a(0, main.a.ag);
        if (!this.e) {
            aj.a((eh)object, this.aq, this.p, this.q, this.r == 1 ? 0 : 1, 2);
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
        if (this.aH) {
            ++this.au;
            object = new i(this.ax == 2 ? 19 : 22, this.p + this.au * 50, this.q + 25, 2, 1, -1);
            h.a((i)object);
            object = new i(this.ax == 2 ? 19 : 22, this.p - this.au * 50, this.q + 25, 2, 1, -1);
            h.a((i)object);
            if (this.au == 50) {
                this.au = 0;
                this.aH = false;
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
        this.ap = 0;
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
        if (this.c) {
            return this.q - 20;
        }
        return this.q - 60;
    }

    public final int d() {
        return 40;
    }

    public final int e() {
        return 60;
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

