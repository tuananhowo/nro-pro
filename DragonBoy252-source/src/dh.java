/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.a;

public class dh
implements cy {
    public static bd[] d;
    boolean e;
    short f;
    public boolean g;
    public boolean h = false;
    public int i;
    public long j;
    public long k;
    public int l;
    public long m;
    public long n;
    public long o;
    public int p;
    public int q;
    public int r = 1;
    private int a = 1;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    private boolean b;
    private eq c = new eq("vMobMove");
    public int H;
    public co I;
    public long J;
    public long K;
    public int L;
    public byte M;
    public boolean N;
    public boolean O;
    public static eq P;
    public static eq Q;
    public boolean R = false;
    public int S;
    public int T;
    public int U;
    public int V;
    private boolean ai;
    private int aj;
    private boolean ak = true;
    private int al;
    private int am;
    public static Image W;
    private boolean an;
    private int ao;
    private int ap;
    private int aq;
    public int X;
    public boolean Y = true;
    private int[] ar;
    private int[] as;
    private int[] at;
    private int[] au;
    private int[] av;
    private int[] aw;
    public int Z;
    public int aa;
    public int ab;
    public Image ac;
    private int ax;
    public boolean ad;
    public co ae;
    public boolean af;
    private dh ay;
    private int az;
    public boolean ag;
    public boolean ah;
    private int[][] aA;
    private boolean aB;

    static {
        P = new eq("lastMob");
        Q = new eq("newMob");
        W = ej.b("/mainImage/myTexture2dmobHP.png");
    }

    public final boolean w() {
        return this instanceof ck || this instanceof cn || this instanceof cm || this instanceof dk;
    }

    public dh() {
        int[] nArray = new int[12];
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.ar = nArray;
        this.as = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        this.at = new int[]{1, 1, 2, 2, 3, 3, 2};
        this.au = new int[]{4, 5, 6};
        this.av = new int[]{7, 8, 9};
        this.aw = new int[1];
        this.Z = 24;
        this.aa = 100;
        this.ab = 100;
        this.ax = 0;
        this.ad = false;
        byte[] byArray = new byte[]{-1, 1};
        this.af = false;
        int[][] nArrayArray = new int[6][];
        int[] nArray2 = new int[8];
        nArray2[4] = 1;
        nArray2[5] = 1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArrayArray[0] = nArray2;
        int[] nArray3 = new int[8];
        nArray3[4] = 1;
        nArray3[5] = 1;
        nArray3[6] = 1;
        nArray3[7] = 1;
        nArrayArray[1] = nArray3;
        int[] nArray4 = new int[8];
        nArray4[4] = 1;
        nArray4[5] = 1;
        nArray4[6] = 1;
        nArray4[7] = 1;
        nArrayArray[2] = nArray4;
        int[] nArray5 = new int[8];
        nArray5[4] = 1;
        nArray5[5] = 1;
        nArray5[6] = 1;
        nArray5[7] = 1;
        nArrayArray[3] = nArray5;
        int[] nArray6 = new int[8];
        nArray6[4] = 1;
        nArray6[5] = 1;
        nArray6[6] = 1;
        nArray6[7] = 1;
        nArrayArray[4] = nArray6;
        int[] nArray7 = new int[8];
        nArray7[4] = 1;
        nArray7[5] = 1;
        nArray7[6] = 1;
        nArray7[7] = 1;
        nArrayArray[5] = nArray7;
        this.aA = nArrayArray;
        this.aB = true;
    }

    public final void x() {
        if (dh.d[this.H].f == null) {
            dh.d[this.H].f = new k();
            String string = "/Mob/" + this.H;
            InputStream inputStream = "".getClass().getResourceAsStream(string);
            if (inputStream != null) {
                dh.d[this.H].f.a(String.valueOf(string) + "/data");
                dh.d[this.H].f.a = ej.b(String.valueOf(string) + "/img.png");
            } else {
                cj.a().h(this.H);
            }
            if (P.size() > 15) {
                dh.d[Integer.parseInt((String)((String)dh.P.elementAt((int)0)))].f = null;
                P.removeElementAt(0);
            }
            P.addElement(String.valueOf(this.H));
            return;
        }
        this.y = dh.d[this.H].f.f;
        this.z = dh.d[this.H].f.g;
    }

    public void a(short s2) {
        this.e = true;
        this.f = s2;
    }

    public void a() {
        this.e = false;
    }

    public dh(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, int n3, int n4, long l2, byte by2, long l3, short s2, short s3, byte by3, byte by4) {
        int[] nArray = new int[12];
        nArray[8] = 1;
        nArray[9] = 1;
        nArray[10] = 1;
        nArray[11] = 1;
        this.ar = nArray;
        this.as = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
        this.at = new int[]{1, 1, 2, 2, 3, 3, 2};
        this.au = new int[]{4, 5, 6};
        this.av = new int[]{7, 8, 9};
        this.aw = new int[1];
        this.Z = 24;
        this.aa = 100;
        this.ab = 100;
        this.ax = 0;
        this.ad = false;
        byte[] byArray = new byte[]{-1, 1};
        this.af = false;
        int[][] nArrayArray = new int[6][];
        int[] nArray2 = new int[8];
        nArray2[4] = 1;
        nArray2[5] = 1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArrayArray[0] = nArray2;
        int[] nArray3 = new int[8];
        nArray3[4] = 1;
        nArray3[5] = 1;
        nArray3[6] = 1;
        nArray3[7] = 1;
        nArrayArray[1] = nArray3;
        int[] nArray4 = new int[8];
        nArray4[4] = 1;
        nArray4[5] = 1;
        nArray4[6] = 1;
        nArray4[7] = 1;
        nArrayArray[2] = nArray4;
        int[] nArray5 = new int[8];
        nArray5[4] = 1;
        nArray5[5] = 1;
        nArray5[6] = 1;
        nArray5[7] = 1;
        nArrayArray[3] = nArray5;
        int[] nArray6 = new int[8];
        nArray6[4] = 1;
        nArray6[5] = 1;
        nArray6[6] = 1;
        nArray6[7] = 1;
        nArrayArray[4] = nArray6;
        int[] nArray7 = new int[8];
        nArray7[4] = 1;
        nArray7[5] = 1;
        nArray7[6] = 1;
        nArray7[7] = 1;
        nArrayArray[5] = nArray7;
        this.aA = nArrayArray;
        this.aB = true;
        this.D = bl3;
        this.F = bl5;
        this.G = bl6;
        this.L = n4;
        this.B = n2;
        this.H = n3;
        this.m = l2;
        short s4 = s2;
        this.p = s4;
        this.w = s4;
        short s5 = s3;
        this.q = s5;
        this.x = s5;
        this.s = by3;
        if (n3 != 70) {
            dh.u();
            this.x();
        }
        if (!dh.a(String.valueOf(n3))) {
            Q.addElement(String.valueOf(n3));
        }
        this.n = l3;
        this.M = by4;
        this.C();
        this.b = false;
        this.U = s2;
        this.V = s3;
        if (this.v()) {
            int[] nArray8 = new int[17];
            nArray8[5] = 1;
            nArray8[6] = 1;
            nArray8[7] = 1;
            nArray8[8] = 1;
            nArray8[9] = 1;
            nArray8[10] = 2;
            nArray8[11] = 2;
            nArray8[12] = 2;
            nArray8[13] = 2;
            nArray8[14] = 2;
            nArray8[15] = 2;
            nArray8[16] = 2;
            this.ar = nArray8;
            int[] nArray9 = new int[17];
            nArray9[5] = 1;
            nArray9[6] = 1;
            nArray9[7] = 1;
            nArray9[8] = 1;
            nArray9[9] = 1;
            nArray9[10] = 2;
            nArray9[11] = 2;
            nArray9[12] = 2;
            nArray9[13] = 2;
            nArray9[14] = 2;
            nArray9[15] = 2;
            nArray9[16] = 2;
            this.as = nArray9;
            int[] nArray10 = new int[17];
            nArray10[5] = 1;
            nArray10[6] = 1;
            nArray10[7] = 1;
            nArray10[8] = 1;
            nArray10[9] = 1;
            nArray10[10] = 2;
            nArray10[11] = 2;
            nArray10[12] = 2;
            nArray10[13] = 2;
            nArray10[14] = 2;
            nArray10[15] = 2;
            nArray10[16] = 2;
            this.at = nArray10;
            this.au = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
            this.av = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
        } else if (this.E()) {
            int[] nArray11 = new int[12];
            nArray11[8] = 1;
            nArray11[9] = 1;
            nArray11[10] = 1;
            nArray11[11] = 1;
            this.ar = nArray11;
            this.as = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3, 3, 3};
            this.at = new int[]{1, 1, 2, 2, 1, 1, 3, 3};
            this.au = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6};
            this.av = new int[]{7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9};
        } else if (this.k()) {
            int[] nArray12 = new int[12];
            nArray12[8] = 1;
            nArray12[9] = 1;
            nArray12[10] = 1;
            nArray12[11] = 1;
            this.ar = nArray12;
            this.as = new int[]{2, 2, 3, 3, 2, 2, 4, 4, 2, 2, 3, 3, 2, 2, 4, 4};
            this.at = new int[]{2, 2, 3, 3, 2, 2, 4, 4};
            this.au = new int[]{5, 6, 7, 8, 9, 10, 11, 12};
            this.av = new int[]{5, 12, 13, 14};
        } else {
            int[] nArray13 = new int[12];
            nArray13[8] = 1;
            nArray13[9] = 1;
            nArray13[10] = 1;
            nArray13[11] = 1;
            this.ar = nArray13;
            this.as = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
            this.at = new int[]{1, 1, 2, 2, 3, 3, 2};
            this.au = new int[]{4, 5, 6};
            this.av = new int[]{7, 8, 9};
        }
        dq.c("MOB ID= " + n2);
    }

    private static boolean a(String string) {
        int n2 = 0;
        while (n2 < Q.size()) {
            String string2 = (String)Q.elementAt(n2);
            if (string2.equals(string)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static void u() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < d.length) {
            if (dh.d[n3].f != null) {
                ++n2;
            }
            ++n3;
        }
        if (n2 >= 10) {
            n3 = 0;
            while (n3 < d.length) {
                if (dh.d[n3].f != null && n2 > 5) {
                    dh.d[n3].f = null;
                }
                ++n3;
            }
        }
    }

    public void a(int[] nArray) {
        if (this.al > nArray.length - 1) {
            this.al = 0;
        }
        this.am = nArray[this.al];
        ++this.al;
    }

    public void h() {
        if (this.X == 0 && main.a.w % 25 == 0) {
            u.a(114, this, 1);
        }
        if (this.X == 1 && main.a.w % 4 == 0) {
            u.a(132, this, 1);
        }
        if (this.X == 2 && main.a.w % 7 == 0) {
            u.a(131, this, 1);
        }
    }

    public void i() {
        if (this.R) {
            return;
        }
        this.D();
        if (this.ag && main.a.w % 5 == 0) {
            u.a(113, this.p, this.q, 1);
        }
        if (this.ah && main.a.w % 10 == 0) {
            h.a(new i(41, this.p, this.q, 3, 1, 1));
        }
        if (!main.a.a && this.s != 1 && this.s != 0 && !main.a.a && main.a.w % (15 + (this.B << 1)) == 0) {
            int n2 = 0;
            while (n2 < cw.E.size()) {
                co co2 = (co)cw.E.elementAt(n2);
                if (co2 != null && co2.cK && co2.aG == 32) {
                    co co3 = new co();
                    new co().N = co2.N;
                    co3.O = co2.O - co2.az;
                    if (co2.W == 0) {
                        t.a(this.p + this.r * this.y, this.q, this.p(), -100L, -100L, co3, 25);
                    }
                }
                ++n2;
            }
            if (co.m().cK && co.m().aG == 32) {
                co co4 = new co();
                new co().N = co.m().N;
                co4.O = co.m().O - co.m().az;
                if (co.m().W == 0) {
                    t.a(this.p + this.r * this.y, this.q, this.p(), -100L, -100L, co4, 25);
                }
            }
        }
        if (this.l != 0 && main.a.w % 5 == 0) {
            h.a(new i(this.l, this.p, this.q + 24, 3, 5, 1));
        }
        if (this.h) {
            long l2;
            if (main.a.w % 5 == 0) {
                u.a(113, this.p, this.q, 1);
            }
            if ((l2 = System.currentTimeMillis()) - this.j >= 1000L) {
                --this.i;
                this.j = l2;
                if (this.i < 0) {
                    this.h = false;
                    this.i = 0;
                }
            }
            this.am = this.F() ? this.aw[main.a.w % this.aw.length] : (this.v() ? this.au[main.a.w % this.au.length] : (this.E() ? (main.a.w % 20 > 5 ? 11 : 10) : (this.k() ? (main.a.w % 20 > 5 ? 1 : 15) : (main.a.w % 20 > 5 ? 11 : 10))));
        }
        if (!this.o()) {
            return;
        }
        if (this.ak) {
            dh dh2 = this;
            byte by2 = dx.i;
            dh2.U = dh2.p;
            dh2.aj = 0;
            if (dh2.V > 0 && !dx.a(dh2.U, dh2.V, 2)) {
                if (dx.a(dh2.U / by2, dh2.V / by2) == 0) {
                    dh2.ai = true;
                } else if (dx.a(dh2.U / by2, dh2.V / by2) != 0 && !dx.a(dh2.U, dh2.V, 2)) {
                    dh2.U = dh2.p;
                    dh2.V = dh2.q;
                    dh2.ai = false;
                }
                while (dh2.ai && dh2.aj < 10) {
                    ++dh2.aj;
                    dh2.V += 24;
                    if (!dx.a(dh2.U, dh2.V, 2)) continue;
                    if (dh2.V % 24 == 0) break;
                    dh2.V -= dh2.V % 24;
                    break;
                }
            }
        }
        if (this.c == null && dh.d[this.H].a != 0) {
            return;
        }
        if (this.s != 3 && this.Y) {
            if (this.I != null) {
                this.I.a(this.J, this.K, false, true);
            } else if (this.ay != null) {
                this.ay.j();
            }
            this.Y = false;
        }
        if (this.M > 0) {
            this.h();
        }
        switch (this.s) {
            case 1: {
                this.D = false;
                this.F = false;
                this.G = false;
                this.q += this.t;
                if (main.a.w % 2 == 0) {
                    if (this.u > 1) {
                        --this.u;
                    } else if (this.u < -1) {
                        ++this.u;
                    }
                }
                this.p += this.u;
                this.am = this.F() ? this.aw[main.a.w % this.aw.length] : (this.v() ? this.au[main.a.w % this.au.length] : (!this.E() && this.k() ? 15 : 11));
                if (this.b) {
                    this.b = false;
                    if (this.O) {
                        int n3 = 0;
                        while (n3 < cw.G.size()) {
                            if (((dh)cw.G.elementAt((int)n3)).B == this.B) {
                                cw.G.removeElementAt(n3);
                            }
                            ++n3;
                        }
                    }
                    this.t = 0;
                    this.u = 0;
                    this.q = 0;
                    this.p = 0;
                    this.m = this.B().d;
                    this.s = 0;
                    this.A = 0;
                    return;
                }
                if ((dx.b(this.p, this.q) & 2) == 2) {
                    int n4 = this.t = this.t > 4 ? -4 : -this.t;
                    if (this.v == 0) {
                        this.v = 16;
                    }
                } else {
                    ++this.t;
                }
                if (this.v <= 0) break;
                --this.v;
                if (this.v != 0) break;
                this.b = true;
                return;
            }
            case 2: {
                if (this.l != 0) {
                    return;
                }
                if (this.h) {
                    return;
                }
                if (this.ag) {
                    return;
                }
                if (this.ah) {
                    return;
                }
                this.A = 0;
                dh dh3 = this;
                dh3.a(dh3.ar);
                switch (dh.d[dh3.H].c) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: {
                        ++dh3.t;
                        if (dh3.t <= 10 + dh3.B % 10 || dh3.I != null && dq.g(dh3.I.N - dh3.p) <= 80 || dh3.ay != null && dq.g(dh3.ay.p - dh3.p) <= 80) break;
                        dh3.s = 5;
                        break;
                    }
                    case 4: 
                    case 5: {
                        ++dh3.t;
                        if (dh3.t <= dh3.B % 3 || dh3.I != null && dq.g(dh3.I.N - dh3.p) <= 80 || dh3.ay != null && dq.g(dh3.ay.p - dh3.p) <= 80) break;
                        dh3.s = 5;
                    }
                }
                if (dh3.I != null && main.a.w % (10 + dh3.t % 20) == 0) {
                    dh3.r = dh3.I.N > dh3.p ? 1 : -1;
                } else if (dh3.ay != null && main.a.w % (10 + dh3.t % 20) == 0) {
                    dh3.r = dh3.ay.p > dh3.p ? 1 : -1;
                }
                if (dh3.az > 0) {
                    --dh3.az;
                    dh3.s = 2;
                }
                return;
            }
            case 4: {
                if (this.l != 0) {
                    return;
                }
                if (this.ag) {
                    return;
                }
                if (this.ah) {
                    return;
                }
                if (this.h) {
                    return;
                }
                this.A = 0;
                ++this.t;
                if (this.t <= 40 + this.B % 5) break;
                this.q -= 2;
                this.s = 5;
                this.t = 0;
                return;
            }
            case 3: {
                if (this.l != 0) {
                    return;
                }
                if (this.ag) {
                    return;
                }
                if (this.ah) {
                    return;
                }
                if (this.h) {
                    return;
                }
                this.l();
                return;
            }
            case 5: {
                if (this.l != 0) {
                    return;
                }
                if (this.ag) {
                    return;
                }
                if (this.ah) {
                    return;
                }
                if (this.h) {
                    if (dh.d[this.H].c == 4) {
                        ++this.aq;
                        ++this.ao;
                        this.ap += !this.an ? 1 : -1;
                        if (this.ao == 10) {
                            this.ao = 0;
                            this.an = !this.an;
                        }
                    }
                    return;
                }
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
                dh dh4 = this;
                if (!dh4.Y && main.a.w % 4 == 0) {
                    dh4.am = dh4.F() ? dh4.aw[main.a.w % dh4.aw.length] : (dh4.v() ? dh4.au[main.a.w % dh4.au.length] : (dh4.E() ? (dh4.am != 10 ? 10 : 11) : (dh4.k() ? (dh4.am != 1 ? 1 : 15) : (dh4.am != 10 ? 10 : 11))));
                }
                --dh4.A;
                if (dh4.A <= 0 && (dh4.F() || dh4.v() || dh4.E() && dh4.am == 11 || dh4.k() && dh4.am == 15 || dh4.H < 58 && dh4.am == 11)) {
                    if (dh4.ae != null && dh4.af || dh4.m == 0L) {
                        dh4.s = 1;
                        dh4.u = dh4.ae.U << 1;
                        dh4.t = -3;
                        dh4.v = 0;
                    } else {
                        dh4.s = 5;
                        if (dh4.ae != null) {
                            dh4.r = -dh4.ae.U;
                            if (dq.g(dh4.p - dh4.ae.N) < 24) {
                                dh4.s = 2;
                            }
                        }
                        dh4.v = 0;
                        dh4.u = 0;
                        dh4.t = 0;
                        dh4.A = 0;
                    }
                    dh4.ae = null;
                    return;
                }
                if (dh.d[dh4.H].c == 0 || dh4.ae == null) break;
                int n5 = -dh4.ae.U << 1;
                if (dh4.p <= dh4.w - dh.d[dh4.H].a || dh4.p >= dh4.w + dh.d[dh4.H].a) break;
                dh4.p -= n5;
            }
        }
    }

    public void j() {
        if (this.m > 0L && this.s != 3 && this.s != 7) {
            this.A = 4;
            this.s = 7;
            if (this.B().c != 0 && dq.g(this.p - this.w) < 30) {
                this.p -= 10 * this.r;
            }
        }
    }

    public static cm y() {
        int n2 = 0;
        while (n2 < cw.G.size()) {
            dh dh2 = (dh)cw.G.elementAt(n2);
            if (dh2 instanceof cm) {
                return (cm)dh2;
            }
            ++n2;
        }
        return null;
    }

    public static cn z() {
        int n2 = 0;
        while (n2 < cw.G.size()) {
            dh dh2 = (dh)cw.G.elementAt(n2);
            if (dh2 instanceof cn) {
                return (cn)dh2;
            }
            ++n2;
        }
        return null;
    }

    public static ck A() {
        int n2 = 0;
        while (n2 < cw.G.size()) {
            dh dh2 = (dh)cw.G.elementAt(n2);
            if (dh2 instanceof ck) {
                return (ck)dh2;
            }
            ++n2;
        }
        return null;
    }

    public static dk a(byte by2) {
        dh dh2 = (dh)cw.G.elementAt(by2);
        if (dh2 instanceof dk) {
            return (dk)dh2;
        }
        return null;
    }

    public void a(co co2) {
        this.Y = true;
        this.ay = null;
        this.I = co2;
        this.t = 0;
        this.u = 0;
        this.s = 3;
        this.al = 0;
        this.r = co2.N > this.p ? 1 : -1;
        int n2 = co2.N;
        int n3 = co2.O;
        if (dq.g(n2 - this.p) < this.y << 1 && dq.g(n3 - this.q) < this.z << 1) {
            this.v = 0;
            return;
        }
        this.v = 1;
    }

    boolean k() {
        return this.H >= 58 && this.H <= 65 || this.H == 67 || this.H == 68;
    }

    private boolean v() {
        return this.H == 76;
    }

    private boolean E() {
        return this.H >= 73 && !this.v();
    }

    public void l() {
        Object object;
        int[] nArray = object = this.v == 0 ? this.au : this.av;
        if (this.al < ((int[])object).length) {
            this.a((int[])object);
            if (this.p >= cw.j && this.p <= cw.j + main.a.A && this.v == 0 && main.a.w % 2 == 0) {
                es.a();
                es.g();
            }
        }
        if (this.t == 0) {
            int n2;
            int n3 = this.I != null ? this.I.N : this.ay.p;
            int n4 = n2 = this.I != null ? this.I.O : this.ay.q;
            if (!this.E()) {
                if (this.p > this.w + dh.d[this.H].a) {
                    this.t = 1;
                }
                if (this.p < this.w - dh.d[this.H].a) {
                    this.t = 1;
                }
            }
            if (!(dh.d[this.H].c != 4 && dh.d[this.H].c != 5 || this.D)) {
                this.q += (n2 - this.q) / 20;
            }
            ++this.u;
            if (this.u > ((int[])object).length - 1 || this.t == 1) {
                this.t = 1;
                if (this.v == 0) {
                    if (this.I != null) {
                        this.I.a(this.J, this.K, false, true);
                    } else {
                        this.ay.j();
                    }
                    this.Y = false;
                } else {
                    if (this.I != null) {
                        t.a(this.p + this.r * this.y, this.q, this.p(), this.J, this.K, this.I, this.B().g);
                    } else {
                        object = new co();
                        new co().N = this.ay.p;
                        object.O = this.ay.q;
                        object.V = -100;
                        t.a(this.p + this.r * this.y, this.q, this.p(), this.J, this.K, (co)object, this.B().g);
                    }
                    this.Y = false;
                }
            }
            this.r = this.p < n3 ? 1 : -1;
        } else if (this.t == 1) {
            if (dh.d[this.H].c != 0 && !this.D) {
            }
            if (this.al == ((int[])object).length) {
                this.s = 2;
                this.t = 0;
                this.u = 0;
                this.al = 0;
            }
        }
        if (this.al == 5 && this.I != null && this.I.V == co.m().V) {
            if (this.H == 88 && this.v != 0) {
                cw.bH = 2;
            }
            if (this.H == 89) {
                cw.bH = 2;
            }
        }
    }

    public void m() {
        try {
            if (this.af) {
                this.s = 1;
                this.u = this.ae.U << 3;
                this.t = -5;
                this.v = 0;
            }
            if (this.F) {
                return;
            }
            if (this.D || this.G) {
                this.a(this.ar);
                return;
            }
            switch (dh.d[this.H].c) {
                case 0: {
                    if (this.v()) {
                        this.am = this.ar[main.a.w % this.ar.length];
                        break;
                    }
                    this.am = 0;
                    return;
                }
                case 1: 
                case 2: 
                case 3: {
                    byte by2 = dh.d[this.H].b;
                    if (by2 == 1) {
                        if (main.a.w % 2 == 1) {
                            return;
                        }
                    } else if (by2 > 2) {
                        by2 = (byte)(by2 + this.B % 2);
                    } else if (main.a.w % 2 == 1) {
                        by2 = (byte)(by2 - 1);
                    }
                    this.p += by2 * this.r;
                    if (this.p > this.w + dh.d[this.H].a) {
                        this.r = -1;
                    } else if (this.p < this.w - dh.d[this.H].a) {
                        this.r = 1;
                    }
                    if (dq.g(this.p - co.m().N) < 40 && dq.g(this.p - this.w) < dh.d[this.H].a) {
                        int n2 = this.r = this.p > co.m().N ? -1 : 1;
                        if (dq.g(this.p - co.m().N) < 20) {
                            this.p -= this.r * 10;
                        }
                        this.s = 2;
                        this.az = 20;
                    }
                    this.a(this.y > 30 ? this.as : this.at);
                    return;
                }
                case 4: {
                    byte by3 = dh.d[this.H].b;
                    by3 = (byte)(by3 + this.B % 2);
                    this.p += by3 * this.r;
                    if (main.a.w % 10 > 2) {
                        this.q += by3 * this.a;
                    }
                    if (this.p > this.w + dh.d[this.H].a) {
                        this.r = -1;
                        this.s = 2;
                        this.az = main.a.w % 20 + 20;
                        this.t = 0;
                    } else if (this.p < this.w - dh.d[this.H].a) {
                        this.r = 1;
                        this.s = 2;
                        this.az = main.a.w % 20 + 20;
                        this.t = 0;
                    }
                    if (this.q > this.x + 24) {
                        this.a = -1;
                    } else if (this.q < this.x - (20 + main.a.w % 10)) {
                        this.a = 1;
                    }
                    this.a(this.as);
                    return;
                }
                case 5: {
                    byte by4 = dh.d[this.H].b;
                    by4 = (byte)(by4 + this.B % 2);
                    this.p += by4 * this.r;
                    by4 = (byte)(by4 + (main.a.w + this.B) % 2);
                    if (main.a.w % 10 > 2) {
                        this.q += by4 * this.a;
                    }
                    if (this.p > this.w + dh.d[this.H].a) {
                        this.r = -1;
                        this.s = 2;
                        this.az = main.a.w % 20 + 20;
                        this.t = 0;
                    } else if (this.p < this.w - dh.d[this.H].a) {
                        this.r = 1;
                        this.s = 2;
                        this.az = main.a.w % 20 + 20;
                        this.t = 0;
                    }
                    if (this.q > this.x + 24) {
                        this.a = -1;
                    } else if (this.q < this.x - (20 + main.a.w % 10)) {
                        this.a = 1;
                    }
                    if (!dx.a(this.p, this.q, 2)) break;
                    if (main.a.w % 10 > 5) {
                        this.q = dx.e(this.q);
                        this.s = 4;
                        this.t = 0;
                        this.a = -1;
                        return;
                    }
                    this.a = -1;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    public final bd B() {
        return d[this.H];
    }

    public boolean n() {
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
        if (d[this.H] == null) {
            return false;
        }
        if (dh.d[this.H].f == null) {
            return false;
        }
        if (dh.d[this.H].f.a == null) {
            return false;
        }
        return this.s != 0;
    }

    public boolean o() {
        if (d[this.H] == null) {
            return false;
        }
        if (dh.d[this.H].f == null) {
            return false;
        }
        return this.s != 0;
    }

    public boolean p() {
        return this.N || this.M > 0;
    }

    public final void C() {
        this.aa = (int)(this.m * 100L / this.n);
        if (this.aa >= 100) {
            this.ab = this.aa;
        }
        this.ax = 0;
        if (this.aa < 30) {
            this.ac = cw.aS;
            return;
        }
        if (this.aa < 60) {
            this.ac = cw.aT;
            return;
        }
        this.ac = cw.aV;
    }

    public void a(eh eh2) {
        int n2;
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
        if (this.ak && this.s != 0) {
            eh eh3 = eh2;
            dh dh2 = this;
            n2 = dx.i;
            if (dx.a(dh2.U + n2 / 2, dh2.V + 1, 4)) {
                eh3.e(dh2.U / n2 * n2, (dh2.V - 30) / n2 * n2, n2, 100);
            } else if (dx.a((dh2.U - n2 / 2) / n2, (dh2.V + 1) / n2) == 0) {
                eh3.e(dh2.U / n2 * n2, (dh2.V - 30) / n2 * n2, 100, 100);
            } else if (dx.a((dh2.U + n2 / 2) / n2, (dh2.V + 1) / n2) == 0) {
                eh3.e(dh2.U / n2 * n2, (dh2.V - 30) / n2 * n2, n2, 100);
            } else if (dx.a(dh2.U - n2 / 2, dh2.V + 1, 8)) {
                eh3.e(dh2.U / 24 * n2, (dh2.V - 30) / n2 * n2, n2, 100);
            }
            eh3.a(dx.y, dh2.U, dh2.V, 3);
            eh3.e(cw.j, cw.k - main.a.ag, cw.d, cw.e + 2 * main.a.ag);
        }
        if (!this.n()) {
            return;
        }
        if (this.s == 1 && this.v > 0 && main.a.w % 3 == 0) {
            return;
        }
        eh2.a(0, main.a.ag);
        if (!this.e) {
            dh.d[this.H].f.a(eh2, this.am, this.p, this.q + this.ap, this.r == 1 ? 0 : 1, 2);
        } else {
            er.b(eh2, this.f, this.p, this.q + this.ap - 9, this.r == 1 ? 0 : 2, 33);
        }
        eh2.a(0, -main.a.ag);
        if (co.m().be != null && co.m().be.equals(this) && this.s != 1 && this.m > 0L && this.ac != null) {
            int n3 = eh.a(this.ac);
            int n4 = eh.b(this.ac);
            int n5 = n2 = n3 * this.aa / 100;
            if (this.ab >= this.aa) {
                int n6;
                if (main.a.w % 6 > 3) {
                    int n7 = this.ax;
                    n6 = n7;
                    this.ax = n7 + 1;
                } else {
                    n6 = this.ax;
                }
                n5 = n3 * (this.ab -= n6) / 100;
                if (this.ab <= 0) {
                    this.ab = 0;
                }
                if (this.ab < this.aa) {
                    this.ab = this.aa;
                }
                if (this.ax >= 3) {
                    this.ax = 3;
                }
            }
            eh2.a(cw.aU, this.p - (n3 >> 1), this.q - this.z - 5, 20);
            eh2.a(0xFFFFFF);
            eh2.d(this.p - (n3 >> 1), this.q - this.z - 5, n5, 2);
            eh2.a(this.ac, 0, 0, n2, n4, 0, this.p - (n3 >> 1), this.q - this.z - 5, 20);
        }
    }

    public void q() {
        this.m = 0L;
        this.af = true;
        this.m = 0L;
        this.s = 1;
        this.t = -3;
        this.u = -this.r;
        this.v = 0;
    }

    public void a(dh dh2) {
        this.ay = dh2;
        this.Y = true;
        this.I = null;
        this.t = 0;
        this.u = 0;
        this.s = 3;
        this.al = 0;
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

    public int b() {
        return this.p;
    }

    public int c() {
        return this.q;
    }

    public int d() {
        return this.z;
    }

    public int e() {
        return this.y;
    }

    public void f() {
        if (this.s == 5) {
            this.s = 2;
            this.v = 0;
            this.u = 0;
            this.t = 0;
            this.az = 50;
        }
    }

    public boolean g() {
        return this.s == 0 || this.s == 1;
    }

    public void r() {
        if (this.l != 0) {
            this.l = 0;
        }
    }

    public void s() {
        this.ag = false;
    }

    public void t() {
        this.ah = false;
    }

    public void D() {
        if (this.aB && this.F() && dh.d[this.H].f != null) {
            this.aA = (int[][])ci.d.get(String.valueOf(this.H));
            this.ar = this.aA[0];
            this.as = this.aA[1];
            this.at = this.aA[2];
            this.au = this.aA[3];
            this.av = this.aA[4];
            this.aw = this.aA[5];
            this.aB = false;
        }
    }

    private boolean F() {
        return dh.d[this.H].f != null && dh.d[this.H].f.e == 2;
    }
}

