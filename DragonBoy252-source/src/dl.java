/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class dl
implements ao,
cx {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int aD;
    private int aE;
    private int aF;
    public int f;
    public int g;
    private int aG;
    private int aH;
    private int aI;
    private int[] aJ;
    private int aK;
    public int h;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    public static Image i;
    private static Image aQ;
    public dw j;
    public eq k = new eq("");
    private int aR;
    public int l;
    private boolean aS;
    public boolean m;
    private boolean aT;
    public String n;
    public el o;
    public static String p;
    public static short q;
    public static Image r;
    public static Image s;
    public static Image t;
    public static Image u;
    public static Image v;
    public static Image w;
    public static Image x;
    public static Image y;
    public static Image z;
    private static Image aU;
    private static Image aV;
    private ae aW = new ae(ch.by, 0);
    public int A;
    public int B;
    public int C;
    private int[] aX;
    private String[][] aY;
    private int[] aZ;
    public String[][] D;
    public String[] E;
    public String[] F;
    public static String[] G;
    public static String[] H;
    private static String[] ba;
    private static String[] bb;
    public static int I;
    public String[][] J;
    public int[] K;
    public int[] L;
    private static String[][] bc;
    private static String[][] bd;
    private static String[][] be;
    private static String[][] bf;
    private static String[][] bg;
    private static String[][] bh;
    public String[][][] M;
    private static byte bi;
    private static byte bj;
    private static byte bk;
    private static byte bl;
    private static byte bm;
    private static byte bn;
    private static byte bo;
    public int N;
    public int O;
    private int[] bp;
    private static int[] bq;
    private static int[] br;
    private static int[] bs;
    private static int[] bt;
    private static int[] bu;
    private static int[] bv;
    private static int[] bw;
    private static int[] bx;
    private static int[] by;
    private static int[][] bz;
    private static int[][] bA;
    private static int[][] bB;
    private ar bC;
    private a bD;
    private c bE;
    private e bF;
    public a[] P;
    public eq Q;
    public eq R;
    private eq bG;
    public eq S;
    public eq T;
    public eq U;
    public eq V;
    public eq W;
    public eq X;
    public eq Y;
    public eq Z;
    public ae aa;
    public static int ab;
    private int bH;
    public co ac;
    private boolean bI;
    private int bJ;
    public static boolean ad;
    public int ae;
    public int af;
    public int ag;
    public int ah;
    public g ai;
    private int bK;
    private int[] bL;
    private int bM;
    public boolean aj;
    public int ak;
    private int bN;
    private int bO;
    private boolean bP;
    public boolean al;
    public boolean am;
    public boolean an;
    private int bQ;
    private int bR;
    private int[] bS;
    private boolean bT;
    private boolean bU;
    private int bV;
    private int bW;
    private int bX;
    private int bY;
    private boolean bZ;
    private int ca;
    private int cb;
    private int cc;
    private int cd;
    private boolean ce;
    private int cf;
    private String[][] cg;
    private String ch;
    public String ao;
    private br ci;
    private int cj;
    private int ck;
    private boolean cl;
    private String[] cm;
    private int cn;
    private static long[] co;
    private int[] cp;
    public String[] ap;
    public String[] aq;
    private int cq;
    private ar cr;
    public static String ar;
    private int cs;
    private int ct;
    private int cu;
    private int cv;
    private int cw;
    private int cx;
    private int cy;
    private int cz;
    private int cA;
    private int cB;
    private int cC;
    public static boolean as;
    private boolean cD;
    private int cE;
    public static eq at;
    private static String[] cF;
    public boolean au;
    private int cG;
    private co cH;
    private boolean cI;
    private boolean cJ;
    private boolean cK;
    private int cL;
    public byte av;
    public int aw;
    public int ax;
    public int ay;
    private int cM;
    private int cN;
    private int cO;
    private int cP;
    private int cQ;
    private int cR;
    private int[] cS;
    private int[] cT;
    private int[] cU;
    private int[] cV;
    private int cW;
    private int cX;
    private int cY;
    private int cZ;
    private int da;
    private boolean db;
    private boolean dc;
    private boolean dd;
    public boolean az;
    public short aA;
    private short de;
    public short aB;
    private short[] df;
    public String[][] aC;
    private static int[] dg;
    private static int dh;
    private static int[][] di;
    private Image dj;
    private Image dk;
    private Image dl;
    private Image dm;
    private byte dn;
    private boolean do;

    static {
        aQ = ej.b("/img/map" + dx.s + ".png");
        i = ej.b("/mainImage/myTexture2dbantay.png");
        ej.b("/mainImage/myTexture2dbtX.png");
        w = ej.b("/mainImage/myTexture2dimgMoney.png");
        y = ej.b("/mainImage/myTexture2dimgDiamond.png");
        z = ej.b("/mainImage/luongkhoa.png");
        aU = ej.b("/mainImage/myTexture2dup.png");
        aV = ej.b("/mainImage/myTexture2ddown.png");
        r = ej.b("/mainImage/star.png");
        s = ej.b("/mainImage/starE.png");
        t = ej.b("/mainImage/star8.png");
        ej.b("/mainImage/star9.png");
        u = ej.b("/mainImage/starCH.png");
        v = ej.b("/mainImage/new.png");
        x = ej.b("/mainImage/ticket12.png");
        G = new String[]{ch.bU, ch.bT, ch.aH, ch.bS, ch.ar, ch.bW, ch.U};
        H = new String[]{main.a.an ? ch.fF : ch.fG, ch.bX, ch.I, eh.b > 1 ? ch.cc : ch.cb};
        ba = new String[]{ch.ga, ch.bP, ch.bQ, ch.af, ch.fW};
        bb = new String[]{ch.n};
        I = 0;
        bc = new String[][]{ch.ch, ch.ci};
        bd = new String[][]{ch.cj, ch.ci};
        be = new String[][]{ch.cn};
        bf = new String[][]{ch.ck};
        bg = new String[][]{ch.ci, ch.cl, ch.cm};
        bh = ch.aQ;
        bi = 0;
        bj = 1;
        bk = (byte)3;
        bl = (byte)4;
        bm = (byte)5;
        bn = (byte)6;
        bo = (byte)7;
        int[] nArray = new int[16];
        nArray[0] = 21;
        nArray[2] = 1;
        nArray[3] = 2;
        nArray[4] = 24;
        nArray[5] = 3;
        nArray[6] = 4;
        nArray[7] = 5;
        nArray[8] = 6;
        nArray[9] = 27;
        nArray[10] = 28;
        nArray[11] = 29;
        nArray[12] = 30;
        nArray[13] = 42;
        nArray[14] = 47;
        nArray[15] = 46;
        bq = nArray;
        br = new int[]{39, 42, 105, 93, 61, 93, 142, 165, 210, 100, 165, 220, 233, 10, 125, 125};
        bs = new int[]{28, 60, 48, 96, 88, 131, 136, 95, 32, 200, 189, 167, 120, 110, 20, 20};
        bt = new int[]{22, 7, 8, 9, 25, 11, 12, 13, 10, 31, 32, 33, 34, 43};
        bu = new int[]{55, 30, 93, 80, 24, 149, 219, 220, 233, 170, 148, 195, 148, 10};
        bv = new int[]{136, 84, 69, 34, 25, 42, 32, 110, 192, 70, 106, 156, 210, 57};
        bw = new int[]{23, 14, 15, 16, 26, 17, 18, 20, 19, 35, 36, 37, 38, 44};
        bx = new int[]{90, 95, 144, 234, 231, 122, 176, 158, 205, 54, 105, 159, 231, 27};
        by = new int[]{10, 43, 20, 36, 69, 87, 112, 167, 160, 151, 173, 207, 194, 29};
        bz = new int[][]{bq, bt, bw};
        bA = new int[][]{br, bu, bx};
        bB = new int[][]{bs, bv, by};
        ab = 240;
        ad = false;
        co = new long[]{50000000L, 250000000L, 1250000000L, 5000000000L, 15000000000L, 30000000000L, 45000000000L, 60000000000L, 75000000000L, 90000000000L, 110000000000L, 130000000000L, 150000000000L, 170000000000L};
        int[] nArray2 = new int[]{2327248, 8982199, 0xFF0606};
        int[] nArray3 = new int[]{4583423, 0xFF1CFF, 0xFF0C0C};
        ar = "";
        as = true;
        at = new eq("");
        dg = new int[]{2, 1, 1};
        dh = 1;
        di = new int[][]{{0xFFFFFF, 0xE4E4E5, 13487823, 0xB2B2B3, 0x939494, 0x787878}, {61952, 58624, 52224, 45824, 39168, 32768}, {13500671, 12058853, 10682572, 9371827, 7995545, 0x660080}, {0xFF7F00, 15037184, 0xCC6600, 11753728, 10046464, 0x804000}, {37119, 33509, 28108, 24499, 21145, 17536}, {0xFFFC00, 15063040, 0xC0CC00, 11776256, 0x999000, 8290304}, {0xFF0000, 0xE50000, 0xCC0000, 0xB30000, 0x990000, 0x800000}};
    }

    public dl() {
        String[][][] stringArrayArray = new String[27][][];
        stringArrayArray[2] = bc;
        stringArrayArray[3] = be;
        stringArrayArray[4] = bf;
        stringArrayArray[7] = new String[][]{{""}};
        stringArrayArray[8] = new String[][]{{""}};
        stringArrayArray[9] = new String[][]{{""}};
        stringArrayArray[10] = new String[][]{{""}};
        stringArrayArray[11] = new String[][]{{""}};
        stringArrayArray[12] = bd;
        stringArrayArray[13] = bg;
        stringArrayArray[14] = new String[][]{{""}};
        stringArrayArray[15] = new String[][]{{""}};
        stringArrayArray[16] = new String[][]{{""}};
        stringArrayArray[17] = new String[][]{{""}};
        stringArrayArray[18] = new String[][]{{""}};
        stringArrayArray[19] = new String[][]{{""}};
        stringArrayArray[20] = new String[][]{{""}};
        stringArrayArray[21] = bh;
        stringArrayArray[22] = new String[][]{{""}};
        stringArrayArray[23] = new String[][]{{""}};
        stringArrayArray[24] = new String[][]{{""}};
        stringArrayArray[25] = new String[][]{{""}};
        stringArrayArray[26] = new String[][]{{""}};
        this.M = stringArrayArray;
        this.bG = new eq("");
        this.S = new eq("");
        this.T = new eq("");
        this.U = new eq("");
        this.V = new eq("");
        this.W = new eq("");
        this.X = new eq("");
        this.Y = new eq("");
        this.Z = new eq("");
        this.bH = 0;
        this.bJ = -1;
        this.bM = 0;
        this.aj = false;
        this.bS = new int[3];
        this.bY = 0;
        this.bZ = false;
        this.ca = main.a.t + this.aL;
        this.cb = main.a.u + this.aM;
        this.cc = -1;
        this.cd = -1;
        this.cf = -1;
        this.cg = new String[][]{ch.dn, ch.dm};
        this.ch = "";
        this.ao = "";
        this.cm = new String[]{ch.t, ch.s, ch.r, ch.v, ch.go, ch.gp};
        this.cn = 0;
        this.cp = new int[]{43520, 14743570, 0xD80000};
        this.cq = 0;
        this.cr = null;
        this.cu = 140;
        this.cv = -1;
        this.cx = 0;
        this.cy = 0;
        this.av = (byte)-1;
        this.dc = true;
        this.dd = false;
        this.az = true;
        this.dn = 0;
        this.do = false;
        this.a();
        this.aa = new ae("", this, 1003, null);
        this.aa.g = ej.b("/mainImage/myTexture2dbtX.png");
        this.aa.q = true;
        this.bC = null;
    }

    public final void a() {
        this.ca = main.a.t + this.aL;
        this.cb = main.a.u + this.aM;
        this.aX = new int[this.M.length];
        int n2 = 0;
        while (n2 < this.aX.length) {
            this.aX[n2] = -1;
            ++n2;
        }
    }

    private static int G() {
        int n2 = 0;
        while (n2 < bz[dx.s].length) {
            if (dx.l == bz[dx.s][n2]) {
                return bA[dx.s][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int H() {
        int n2 = 0;
        while (n2 < bz[dx.s].length) {
            if (dx.l == bz[dx.s][n2]) {
                return bB[dx.s][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int I() {
        if (co.m().aR == null) {
            return -1;
        }
        int n2 = 0;
        while (n2 < bz[dx.s].length) {
            if (cw.af[co.m().aR.a] == bz[dx.s][n2]) {
                return bA[dx.s][n2];
            }
            ++n2;
        }
        return -1;
    }

    private static int J() {
        if (co.m().aR == null) {
            return -1;
        }
        int n2 = 0;
        while (n2 < bz[dx.s].length) {
            if (cw.af[co.m().aR.a] == bz[dx.s][n2]) {
                return bB[dx.s][n2];
            }
            ++n2;
        }
        return -1;
    }

    private void c(int n2) {
        this.bJ = -1;
        this.d = ab;
        this.e = main.a.B;
        this.b = 0;
        this.c = 0;
        this.aD = 24;
        this.bH = n2;
        if (n2 == 0) {
            this.ae = 2;
            this.af = 80;
            this.ag = this.d - 4;
            this.ah = this.e - 96;
            this.h = this.ag;
            this.aK = 0;
            this.b = 0;
        } else if (n2 == 1) {
            this.ag = this.d - 4;
            this.ae = main.a.A - this.ag;
            this.af = 80;
            this.ah = this.e - 96;
            this.b = this.ae - 2;
            this.h = -(main.a.A + this.d);
            this.aK = main.a.A - this.d;
        }
        this.aE = this.d / 5 - 1;
        this.B = 0;
        this.aY = this.M[this.A];
        if (this.aY.length < 5) {
            this.aE += 5;
        }
        this.C = this.ae + this.ag / 2 - this.aY.length * this.aE / 2;
        this.bp = new int[this.aY.length];
        this.aJ = new int[this.aY.length];
        n2 = 0;
        while (n2 < this.aY.length) {
            this.bp[n2] = main.a.e ? -1 : 0;
            ++n2;
        }
        if (this.aX[this.A] != -1) {
            this.B = this.aX[this.A];
        }
        if (this.B < 0) {
            this.B = 0;
        }
        if (this.B > this.aY.length - 1) {
            this.B = this.aY.length - 1;
        }
        this.ci = null;
    }

    public final void b() {
        this.A = 14;
        this.c(0);
        dl dl2 = this;
        this.aD = 24;
        dl2.O = dl2.E.length;
        dl2.aI = dl2.O * dl2.aD - dl2.ah;
        dl2.f = 0;
        dl2.g = 0;
        dl2.ak = main.a.e ? -1 : 0;
        this.aK = 0;
        this.h = 0;
    }

    private void K() {
        cw.l();
        if (cw.g()) {
            return;
        }
        if (!as) {
            return;
        }
        if (an.a(2, 0)) {
            an.f = true;
            cw.aO.a(ch.ct, 0);
        }
        if (an.a(3, 0)) {
            an.h = true;
        }
        this.A = 4;
        this.aY = this.M[this.A];
        this.C = this.ae + this.ag / 2 - this.aY.length * this.aE / 2;
        this.aK = 0;
        this.h = 0;
        dl dl2 = this;
        if (as) {
            if (dx.t != dx.s) {
                dq.c("LOAD TAM HINH");
                if (eh.b == 1) {
                    er.b = null;
                    cw.bG = false;
                    System.gc();
                }
                aQ = ej.a("/img/map" + dx.s + ".png");
                dx.t = dx.s;
            }
            dl2.aL = dl.G() - dl2.ag / 2;
            dl2.aM = dl.H() + dl2.af - (dl2.af + dl2.ah / 2);
            dl2.bX = dl2.aL;
            dl2.bY = dl2.aM;
            dl2.aN = 250 - dl2.ag;
            dl2.aO = 220 - dl2.ah;
            if (dl2.aN < 0) {
                dl2.aN = 0;
            }
            if (dl2.aO < 0) {
                dl2.aO = 0;
            }
            int n2 = 0;
            while (n2 < bz[dx.s].length) {
                if (dx.l == bz[dx.s][n2]) {
                    dl2.cB = bA[dx.s][n2] + dl2.ae;
                    dl2.cC = bB[dx.s][n2] + dl2.af + 5;
                    break;
                }
                ++n2;
            }
            dl2.cz = dl.G() + dl2.ae;
            dl2.cA = dl.H() + dl2.af;
            dl.I();
            int cfr_ignored_0 = dl2.ae;
            dl.J();
            int cfr_ignored_1 = dl2.af;
        }
    }

    public final void c() {
        this.O = co.m().aS.length;
        this.c(0);
        this.A = 9;
        this.aI = this.O * this.aD - this.ah;
        this.g = this.f = this.aJ[this.B];
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.f = 0;
            this.g = 0;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    public final void d() {
        this.A = 17;
        this.c(1);
        this.e();
        this.bJ = 2;
        this.B = 0;
    }

    public final void e() {
        this.aD = 24;
        this.O = co.m().aX[4].length;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    public final void f() {
        this.A = 7;
        this.c(1);
        this.b(true);
        this.B = 0;
    }

    public final void a(db db2) {
        this.bG.insertElementAt(db2, 0);
        if (this.bG.size() > 20) {
            this.bG.removeElementAt(this.bG.size() - 1);
        }
    }

    public final void g() {
        this.aD = 24;
        this.O = this.S.size();
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    public final void h() {
        this.A = 18;
        this.c(0);
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        dl dl2 = this;
        this.O = dl2.Y.size();
        dl2.aI = dl2.O * dl2.aD - dl2.ah;
        if (dl2.aI < 0) {
            dl2.aI = 0;
        }
        dl2.g = dl2.f = dl2.aJ[dl2.B];
        if (dl2.g < 0) {
            dl2.f = 0;
            dl2.g = 0;
        }
        if (dl2.g > dl2.aI) {
            dl2.g = dl2.f = dl2.aI;
        }
        if (dl2.ak > dl2.O - 1) {
            dl2.ak = dl2.O - 1;
        }
        dl2.aK = 0;
        dl2.h = 0;
    }

    public final void a(co co2) {
        this.A = 10;
        this.c(0);
        this.g();
        this.ac = co2;
    }

    public final void i() {
        this.A = 11;
        this.c(0);
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.k();
    }

    public final void j() {
        this.A = 16;
        this.c(0);
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        dl dl2 = this;
        this.O = dl2.X.size();
        dl2.aI = dl2.O * dl2.aD - dl2.ah;
        if (dl2.aI < 0) {
            dl2.aI = 0;
        }
        dl2.g = dl2.f = dl2.aJ[dl2.B];
        if (dl2.g < 0) {
            dl2.f = 0;
            dl2.g = 0;
        }
        if (dl2.g > dl2.aI) {
            dl2.g = dl2.f = dl2.aI;
        }
        if (dl2.ak > dl2.O - 1) {
            dl2.ak = dl2.O - 1;
        }
        dl2.aK = 0;
        dl2.h = 0;
    }

    public final void a(byte by2) {
        this.A = 15;
        this.c(0);
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        dl dl2 = this;
        this.O = dl2.W.size();
        dl2.aI = dl2.O * dl2.aD - dl2.ah;
        if (dl2.aI < 0) {
            dl2.aI = 0;
        }
        dl2.g = dl2.f = dl2.aJ[dl2.B];
        if (dl2.g < 0) {
            dl2.f = 0;
            dl2.g = 0;
        }
        if (dl2.g > dl2.aI) {
            dl2.g = dl2.f = dl2.aI;
        }
        if (dl2.ak > dl2.O - 1) {
            dl2.ak = dl2.O - 1;
        }
        dl2.aK = 0;
        dl2.h = 0;
        this.bI = by2 != 0;
    }

    public final void k() {
        this.O = this.T.size();
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        if (this.ak > this.O - 1) {
            this.ak = this.O - 1;
        }
        this.aK = 0;
        this.h = 0;
    }

    public final void l() {
        this.A = 8;
        this.c(0);
        dl dl2 = this;
        this.aD = 24;
        dl2.x();
        dl2.ak = main.a.e ? -1 : 0;
        this.B = 0;
    }

    public final void a(int n2) {
        this.A = 1;
        this.c(0);
        this.y();
        this.B = 0;
        this.bJ = n2;
    }

    public final void m() {
        this.A = 2;
        bc = main.a.A > 2 * ab ? new String[][]{ch.ch} : new String[][]{ch.ch, ch.ci};
        this.M[2] = bc;
        this.c(0);
        if (this.B == 0) {
            this.T();
        }
        if (this.B == 1) {
            this.b(true);
        }
        if (main.a.A > 2 * ab) {
            main.a.H = new dl();
            main.a.H.M[7] = new String[][]{{""}};
            main.a.H.f();
            main.a.H.s();
        }
    }

    public final void n() {
        this.A = 12;
        bd = main.a.A > 2 * ab ? new String[][]{ch.cj} : new String[][]{ch.cj, ch.ci};
        this.M[this.A] = bd;
        this.c(0);
        if (this.B == 0) {
            this.o();
        }
        if (this.B == 1) {
            this.b(true);
        }
        if (main.a.A > 2 * ab) {
            main.a.H = new dl();
            main.a.H.M[7] = new String[][]{{""}};
            main.a.H.f();
            main.a.H.s();
        }
        this.av = (byte)-1;
        this.az = true;
    }

    public final void o() {
        this.O = this.k.size() + 1;
        this.aD = 24;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 9;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void L() {
        this.A = 22;
        this.c(0);
        dl dl2 = this;
        this.O = bb.length;
        dl2.aD = 24;
        dl2.ak = main.a.e ? -1 : 0;
        dl2.aI = dl2.O * dl2.aD - dl2.ah;
        if (dl2.aI < 0) {
            dl2.aI = 0;
        }
        dl2.g = dl2.f = dl2.aJ[dl2.B];
        if (dl2.g < 0) {
            dl2.f = 0;
            dl2.g = 0;
        }
        if (dl2.g > dl2.aI) {
            dl2.g = dl2.f = dl2.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    public final void p() {
        this.A = 21;
        bh = main.a.H != null ? ch.aR : ch.aQ;
        this.M[21] = bh;
        this.cm = co.m().W == 1 ? new String[]{ch.t, ch.s, ch.r, ch.v, ch.go, ch.gp} : new String[]{ch.t, ch.s, ch.r, ch.v, ch.go};
        this.c(2);
        if (this.B == 0) {
            this.U();
        }
        if (this.B == 1) {
            this.P();
        }
        if (this.B == 2) {
            this.b(true);
        }
    }

    public final void q() {
        this.A = 0;
        this.c(0);
        if (this.B == 1) {
            this.b(true);
        }
        if (this.B == 2) {
            this.R();
        }
        if (this.B == 3) {
            if (this.D.length == 4) {
                this.Q();
            } else {
                this.w();
            }
        }
        if (this.B == 4) {
            this.Q();
        }
    }

    public final void r() {
        this.A = 3;
        this.c(0);
        this.S();
        this.aK = 0;
        this.h = 0;
    }

    private void b(ar ar2) {
        String string;
        block37: {
            int n2;
            int n3;
            this.ai = new g();
            String string2 = null;
            string = "";
            if (ar2.b.c != co.m().W) {
                if (ar2.b.c == 0) {
                    string = String.valueOf(string) + "\n|7|1|" + ch.cu;
                } else if (ar2.b.c == 1) {
                    string = String.valueOf(string) + "\n|7|1|" + ch.cv;
                } else if (ar2.b.c == 2) {
                    string = String.valueOf(string) + "\n|7|1|" + ch.cw;
                }
            }
            string2 = "";
            if (ar2.a != null) {
                n3 = 0;
                while (n3 < ar2.a.length) {
                    if (ar2.a[n3].c.a == 72) {
                        string2 = " [+" + ar2.a[n3].a + "]";
                    }
                    ++n3;
                }
            }
            n3 = 0;
            if (ar2.a != null) {
                n2 = 0;
                while (n2 < ar2.a.length) {
                    if (ar2.a[n2].c.a == 41) {
                        n3 = 1;
                        if (ar2.a[n2].a == 1) {
                            string = String.valueOf(string) + "|0|1|" + ar2.b.d + string2;
                        }
                        if (ar2.a[n2].a == 2) {
                            string = String.valueOf(string) + "|2|1|" + ar2.b.d + string2;
                        }
                        if (ar2.a[n2].a == 3) {
                            string = String.valueOf(string) + "|8|1|" + ar2.b.d + string2;
                        }
                        if (ar2.a[n2].a == 4) {
                            string = String.valueOf(string) + "|7|1|" + ar2.b.d + string2;
                        }
                    }
                    ++n2;
                }
            }
            if (n3 == 0) {
                string = String.valueOf(string) + "|0|1|" + ar2.b.d + string2;
            }
            if (ar2.a == null) break block37;
            n2 = 0;
            while (n2 < ar2.a.length) {
                block40: {
                    block39: {
                        String string3;
                        block38: {
                            boolean bl2 = ar2.a[n2].c.b.startsWith("$");
                            if (!bl2) break block38;
                            string3 = ar2.a[n2].b();
                            if (ar2.a[n2].a == 1) {
                                string = String.valueOf(string) + "\n|1|1|" + string3;
                            }
                            if (ar2.a[n2].a == 0) {
                                string = String.valueOf(string) + "\n|0|1|" + string3;
                            }
                            break block39;
                        }
                        string3 = ar2.a[n2].a();
                        if (string3.equals("")) break block39;
                        if (ar2.a[n2].c.a == 72) break block40;
                        if (ar2.a[n2].c.a == 102) {
                            this.ai.o = (byte)ar2.a[n2].a;
                        } else if (ar2.a[n2].c.a == 107) {
                            this.ai.p = (byte)ar2.a[n2].a;
                        } else {
                            string = ar2.a[n2].c.c > 0 ? String.valueOf(string) + "\n|" + ar2.a[n2].c.c + "|1|" + string3 : String.valueOf(string) + "\n|1|1|" + string3;
                        }
                    }
                    if (ar2.a[n2].c.a == 228 && ar2.a[n2].a > 7) {
                        int n4 = 0;
                        while (n4 < ar2.a[n2].a - 7) {
                            this.ai.s[n4 + 7] = true;
                            ++n4;
                        }
                    }
                }
                ++n2;
            }
        }
        if (this.bC.b.i > 1) {
            String string4 = String.valueOf(ch.cx) + ": " + this.bC.b.i;
            if ((long)this.bC.b.i > co.m().K) {
                string = String.valueOf(string) + "\n|3|1|" + string4;
                string = String.valueOf(string) + "\n|3|1|" + ch.cy + ": " + co.m().K;
            } else {
                string = String.valueOf(string) + "\n|6|1|" + string4;
            }
        } else {
            string = String.valueOf(string) + "\n|6|1|";
        }
        this.bC.A = this.a(this.bC);
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|6|" + ar2.b.e;
        if (!ar2.z.equals("")) {
            if (!ar2.b.e.equals("")) {
                string = String.valueOf(string) + "\n--";
            }
            string = String.valueOf(string) + "\n|2|" + ar2.z;
        }
        if (this.ai.p > 0) {
            string = String.valueOf(string) + "\n\n";
        }
        this.a(this.ai, string);
        this.bK = ar2.b.f;
        this.bL = null;
        this.cH = null;
    }

    private void a(g g2, String string) {
        g2.v = false;
        g2.a = 180;
        g2.e = 3 + this.b - (this.b == 0 ? 0 : dq.g(g2.a - this.d) + 8);
        g2.d = ev.p.a(string, g2.a - 10);
        g2.b = 10000000;
        g2.i = null;
        g2.c = 7;
        g2.g = 15 - g2.c + g2.d.length * 12 + 10;
        if (g2.g > main.a.B - 80) {
            g2.g = main.a.B - 80;
            g2.h = g2.d.length * 12 - g2.g + 17;
            if (g2.h < 0) {
                g2.h = 0;
            }
            g.w = 0;
            g2.v = true;
        }
        g2.f = main.a.F.d - g2.g;
        while (g2.f < 10) {
            ++g2.f;
            ++main.a.F.d;
        }
        g2.r = 0;
        g2.u = 10;
    }

    private void a(c c2) {
        this.ai = new g();
        String string = "|0|" + c2.d;
        string = String.valueOf(string) + "\n|1|" + e.a(c2.h);
        int n2 = 0;
        while (n2 < this.R.size()) {
            e e2 = (e)this.R.elementAt(n2);
            if (c2.c == e2.a) {
                string = String.valueOf(string) + "\n|5|" + ch.cV + ": " + e2.l;
                string = String.valueOf(string) + "\n|5|" + ch.cW + ": " + e2.k;
                string = String.valueOf(string) + "\n|4|" + ch.cY + ": " + e2.i + ch.db;
                string = String.valueOf(string) + "\n|4|" + ch.cZ + ": " + e2.j + ch.db;
                this.bL = new int[]{e2.b, e2.d, e2.e};
                break;
            }
            ++n2;
        }
        string = String.valueOf(string) + "\n--";
        n2 = 0;
        while (n2 < c2.f.length) {
            string = String.valueOf(string) + "\n" + c2.f[n2];
            ++n2;
        }
        if (c2.b == 1) {
            string = String.valueOf(string) + "\n|6|" + ch.dc + " " + c2.i + "/" + c2.j;
        }
        this.a(this.ai, string);
        this.cH = null;
    }

    private void a(e e2) {
        String string = "|0|1|" + e2.f;
        String string2 = "\n|2|1|";
        if (e2.g == 0) {
            string2 = "\n|7|1|";
        }
        if (e2.g == 1) {
            string2 = "\n|1|1|";
        }
        if (e2.g == 2) {
            string2 = "\n|0|1|";
        }
        string = String.valueOf(string) + string2 + e.a(e2.g);
        string = String.valueOf(string) + "\n|2|1|" + ch.dd + ": " + e2.h;
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + ch.cV + ": " + e2.l;
        string = String.valueOf(string) + "\n|5|" + ch.cW + ": " + e2.k;
        string = String.valueOf(string) + "\n|4|" + ch.cY + ": " + e2.i + ch.db;
        string = String.valueOf(string) + "\n|4|" + ch.cZ + ": " + e2.j + ch.db;
        string = String.valueOf(string) + "\n|6|" + ch.de + ": " + e2.m;
        this.ai = new g();
        this.a(this.ai, string);
        this.bL = new int[]{e2.b, e2.d, e2.e};
        this.bC = null;
        this.cH = null;
    }

    private void a(a a2) {
        try {
            String string = "|0|" + a2.c;
            String[] stringArray = ev.r.a(a2.d, this.ag - 60);
            int n2 = 0;
            while (n2 < stringArray.length) {
                string = String.valueOf(string) + "\n|2|" + stringArray[n2];
                ++n2;
            }
            string = String.valueOf(string) + "\n--";
            string = String.valueOf(string) + "\n|7|" + ch.df + ": " + a2.i;
            string = String.valueOf(string) + "\n|1|" + ch.dh + ": " + a2.f;
            string = String.valueOf(string) + "\n|4|" + ch.di + ": " + a2.g + "/" + a2.h;
            string = String.valueOf(string) + "\n|4|" + ch.dr + ": " + a2.j;
            string = String.valueOf(string) + "\n|4|" + ch.ds + ": " + o.a(a2.e);
            this.ai = new g();
            this.a(this.ai, string);
            this.bK = b.a((short)((short)a2.b)).c[0];
            this.bC = null;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void a(bx bx2, bt bt2, bt bt3) {
        String string = "|0|" + bx2.b;
        int n2 = 0;
        while (n2 < bx2.g.length) {
            string = String.valueOf(string) + "\n|4|" + bx2.g[n2];
            ++n2;
        }
        string = String.valueOf(string) + "\n--";
        if (bt2 != null) {
            string = String.valueOf(string) + "\n|2|" + ch.fg + ": " + bt2.c;
            string = String.valueOf(string) + "\n|5|" + o.a(bx2.i, "#", String.valueOf(bt2.k));
            string = String.valueOf(string) + "\n|5|" + ch.fh + bt2.i + (bx2.d == 1 ? "%" : "");
            string = String.valueOf(string) + "\n|5|" + ch.fi + ": " + bt2.a() + "s";
            string = String.valueOf(string) + "\n--";
            if (bt2.c == bx2.c) {
                string = String.valueOf(string) + "\n|0|" + ch.fj;
            } else {
                if (!bt2.a.c()) {
                    string = String.valueOf(string) + "\n|1|" + ch.fk + dq.a(bt3.d) + " " + ch.fl;
                }
                string = String.valueOf(string) + "\n|4|" + o.a(bx2.i, "#", String.valueOf(bt3.k));
            }
        } else {
            string = String.valueOf(string) + "\n|2|" + ch.fm;
            string = String.valueOf(string) + "\n|1|" + ch.fn + dq.a(bt3.d) + " " + ch.fl;
            string = String.valueOf(string) + "\n|4|" + o.a(bx2.i, "#", String.valueOf(bt3.k));
            string = String.valueOf(string) + "\n|4|" + ch.fh + bt3.i + (bx2.d == 1 ? "%" : "");
            string = String.valueOf(string) + "\n|4|" + ch.fi + ": " + bt3.a() + "s";
        }
        this.bC = null;
        this.bL = null;
        this.cH = null;
        this.ai = new g();
        this.a(this.ai, string);
        this.bK = 0;
    }

    public final void s() {
        if (main.a.e) {
            this.aa.j = 156;
            this.aa.k = 3;
        } else {
            this.aa.j = main.a.A - 19;
            this.aa.k = main.a.B - 19;
        }
        this.aa.f = false;
        g.m = null;
        da.c();
        this.bM = 20;
        this.a = true;
        this.cD = false;
        es.a();
        es.n();
        if (this.F()) {
            co.m().Z();
        }
    }

    public final void t() {
        if (this.o != null && this.o.b) {
            if (this.o.d != null && (main.a.i[12] || ew.a(this.o.d)) && this.o.d != null) {
                this.o.d.a();
            }
            if (this.o.e != null && (main.a.i[13] || ew.a(this.o.e)) && this.o.e != null) {
                this.o.e.a();
            }
            if (this.o.f != null && (main.a.i[5] || ew.a(this.o.f)) && this.o.f != null) {
                this.o.f.a();
            }
            if (this.o.b && main.a.ai != 0) {
                this.o.a(main.a.ai);
                main.a.ai = 0;
            }
            main.a.k();
            main.a.j();
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void u() {
        block146: {
            block148: {
                block147: {
                    block143: {
                        block145: {
                            block144: {
                                if (this.o != null && this.o.b) {
                                    return;
                                }
                                if (!main.a.G.az) {
                                    return;
                                }
                                if (da.a) {
                                    return;
                                }
                                if (this.j == null || !this.j.k) break block143;
                                var1_1 = this.j;
                                if (var1_1.c != null && (main.a.i[12] || ew.a(var1_1.c))) {
                                    var1_1.c.a();
                                }
                                if (var1_1.d != null && (main.a.i[13] || ew.a(var1_1.d))) {
                                    var1_1.d.a();
                                }
                                if (var1_1.l) break block144;
                                if (dw.f == null) break block145;
                                if (main.a.e) {
                                    dw.f.a();
                                    var1_1.n = dw.f.n;
                                }
                                if (main.a.i[2]) {
                                    main.a.i[2] = false;
                                    --var1_1.n;
                                    if (var1_1.n < 0) {
                                        var1_1.n = var1_1.e - 1;
                                    }
                                    dw.f.a(var1_1.n * dw.f.o);
                                }
                                if (main.a.i[8]) {
                                    main.a.i[8] = false;
                                    ++var1_1.n;
                                    if (var1_1.n > var1_1.e - 1) {
                                        var1_1.n = 0;
                                    }
                                    dw.f.a(var1_1.n * dw.f.o);
                                }
                                if (var1_1.n != -1) {
                                    var1_1.o = var1_1.n;
                                }
                            }
                            main.a.k();
                            main.a.j();
                        }
                        return;
                    }
                    if (this.cD) {
                        return;
                    }
                    if (!this.a) {
                        return;
                    }
                    if (this.aa.c()) {
                        this.aa.a();
                        return;
                    }
                    if (main.a.i[13]) {
                        if (this.A == 4) {
                            this.q();
                            this.aK = 0;
                            this.h = 0;
                        } else {
                            this.A();
                            return;
                        }
                    }
                    if (main.a.i[12] || main.a.i[5]) {
                        if (this.aW.e > 0) {
                            this.a(this.aW.e, this.aW.o);
                        } else {
                            this.bV = 2;
                        }
                    }
                    if (this.equals(main.a.G) && main.a.H == null && main.a.m && !main.a.b(this.b, 0, this.d, this.e) && !this.bT) {
                        this.A();
                        return;
                    }
                    if (this.bP) break block146;
                    var1_2 = this;
                    if (var1_2.ci != null && var1_2.ci.m || var1_2.bT) break block146;
                    var2_4 = var1_2.B;
                    var1_2.aw();
                    var4_11 = var1_2;
                    if (var4_11.dn <= 0) ** GOTO lbl-1000
                    if (var4_11.aY.length <= 1) break block147;
                    if (var4_11.ak != 0) ** GOTO lbl-1000
                    v0 = true;
                    break block148;
                }
                if (var4_11.ak >= 0) {
                    v0 = true;
                } else lbl-1000:
                // 3 sources

                {
                    v0 = false;
                }
            }
            if (!v0) {
                if (main.a.i[6]) {
                    if (var1_2.aw()) {
                        if (var1_2.ak >= 0) {
                            var1_2.ax();
                        } else {
                            ++var1_2.B;
                            if (var1_2.B >= var1_2.aY.length) {
                                if (main.a.H != null) {
                                    var1_2.B = var1_2.aY.length - 1;
                                    main.a.W = true;
                                } else {
                                    var1_2.B = 0;
                                }
                            }
                            var1_2.ak = var1_2.bp[var1_2.B];
                            var1_2.aX[var1_2.A] = var1_2.B;
                        }
                    } else {
                        ++var1_2.B;
                        if (var1_2.B >= var1_2.aY.length) {
                            if (main.a.H != null) {
                                var1_2.B = var1_2.aY.length - 1;
                                main.a.W = true;
                            } else {
                                var1_2.B = 0;
                            }
                        }
                        var1_2.ak = var1_2.bp[var1_2.B];
                        var1_2.aX[var1_2.A] = var1_2.B;
                    }
                }
                if (main.a.i[4]) {
                    --var1_2.B;
                    if (var1_2.B < 0) {
                        var1_2.B = var1_2.aY.length - 1;
                    }
                    if (main.a.W) {
                        main.a.W = false;
                    }
                    var1_2.ak = var1_2.bp[var1_2.B];
                    var1_2.aX[var1_2.A] = var1_2.B;
                }
            }
            var1_2.cf = -1;
            var3_13 = 0;
            while (var3_13 < var1_2.aY.length) {
                if (main.a.b(var1_2.C + var3_13 * var1_2.aE, 52, var1_2.aE - 1, 25)) {
                    var1_2.cf = var3_13;
                    if (main.a.m) {
                        var1_2.B = var3_13;
                        var1_2.aX[var1_2.A] = var3_13;
                        main.a.m = false;
                        var1_2.ak = var1_2.bp[var1_2.B];
                        if (var2_4 != var1_2.B || var1_2.bW != 0) break;
                        var1_2.f = 0;
                        var1_2.ak = main.a.e != false ? -1 : 0;
                        break;
                    }
                }
                ++var3_13;
            }
            if (var2_4 != var1_2.B) {
                var1_2.dn = 0;
                es.a();
                es.s();
                switch (var1_2.A) {
                    case 21: {
                        if (var1_2.B == 0) {
                            var1_2.U();
                        }
                        if (var1_2.B == 1) {
                            var1_2.P();
                        }
                        if (var1_2.B != 2) break;
                        var1_2.b(true);
                        break;
                    }
                    case 0: {
                        if (var1_2.B == 0) {
                            var4_11 = var1_2;
                            var1_2.aP = 0;
                        }
                        if (var1_2.B == 1) {
                            var1_2.b(true);
                        }
                        if (var1_2.B == 2) {
                            var1_2.R();
                        }
                        if (var1_2.B == 3) {
                            if (var1_2.D.length > 4) {
                                var1_2.w();
                            } else {
                                var1_2.Q();
                            }
                        }
                        if (var1_2.B != 4) break;
                        var1_2.Q();
                        break;
                    }
                    case 2: {
                        if (var1_2.B == 0) {
                            var1_2.T();
                        }
                        if (var1_2.B != 1) break;
                        var1_2.b(true);
                        break;
                    }
                    case 3: {
                        var1_2.S();
                        break;
                    }
                    case 1: {
                        var1_2.y();
                        break;
                    }
                    case 25: {
                        var1_2.av();
                        break;
                    }
                    case 12: {
                        if (var1_2.B == 0) {
                            var1_2.o();
                        }
                        if (var1_2.B != 1) break;
                        var1_2.b(true);
                        break;
                    }
                    case 13: {
                        if (var1_2.B == 0) {
                            if (var1_2.equals(main.a.G)) {
                                var1_2.b(true);
                            } else if (var1_2.equals(main.a.H)) {
                                var1_2.a(false);
                            }
                        }
                        if (var1_2.B == 1) {
                            var1_2.a(true);
                        }
                        if (var1_2.B != 2) break;
                        var1_2.a(false);
                    }
                }
                var1_2.ak = var1_2.bp[var1_2.B];
            }
        }
        switch (this.A) {
            case 23: 
            case 24: {
                this.O();
                break;
            }
            case 21: {
                if (this.B == 0) {
                    this.O();
                }
                if (this.B == 1) {
                    var1_2 = this;
                    var1_2.O();
                }
                if (this.B != 2) break;
                this.O();
                break;
            }
            case 0: {
                if (this.B == 0) {
                    var1_2 = this;
                    if (main.a.j[2]) {
                        var1_2.aP -= 5;
                    }
                    if (main.a.j[8]) {
                        var1_2.aP += 5;
                    }
                    if (var1_2.aP < 0) {
                        var1_2.aP = 0;
                    }
                    if ((var2_4 = var1_2.cw * 12 - (var1_2.ah - 60)) < 0) {
                        var2_4 = 0;
                    }
                    if (var1_2.aP > var2_4) {
                        var1_2.aP = var2_4;
                    }
                    if (var1_2.ci != null) {
                        if (!main.a.e) {
                            var1_2.ci.d = var1_2.aP;
                        }
                        var1_2.ci.a();
                    }
                    var3_13 = var1_2.ae + var1_2.ag / 2 - 35;
                    var4_12 = main.a.B > 300 ? 20 : 15;
                    var2_4 = var1_2.af + var1_2.ah - var4_12 - 15;
                    var4_12 = main.a.p;
                    var5_14 = main.a.q;
                    var1_2.cd = -1;
                    if (dl.as) {
                        cw.l();
                        if (!(cw.f() || var4_12 < var3_13 || var4_12 > var3_13 + 70 || var5_14 < var2_4 || var5_14 > var2_4 + 30 || var1_2.ci != null && var1_2.ci.m)) {
                            var1_2.cd = 1;
                            if (main.a.m) {
                                es.a();
                                es.p();
                                var1_2.bV = 2;
                                main.a.p();
                            }
                        }
                    }
                    main.a.j();
                    return;
                }
                if (this.B == 1) {
                    this.ay();
                }
                if (this.B == 2) {
                    var1_2 = this;
                    var1_2.O();
                }
                if (this.B == 3) {
                    if (this.D.length == 4) {
                        var2_5 = this;
                        var2_5.O();
                    } else {
                        var1_2 = this;
                        var1_2.O();
                        var2_6 = var1_2;
                        if (var2_6.aZ != null) {
                            if (main.a.i[4]) {
                                var2_6.bE = var2_6.X();
                                --var2_6.bN;
                                if (var2_6.ak == 0 && var2_6.bN < 0) {
                                    var2_6.bN = var2_6.aZ.length - 1;
                                }
                                if (var2_6.ak > 1 && var2_6.am && var2_6.bE.k != null && var2_6.bN < 0) {
                                    var2_6.bN = var2_6.bE.k.length - 1;
                                }
                            } else if (main.a.i[6]) {
                                var2_6.bE = var2_6.X();
                                ++var2_6.bN;
                                if (var2_6.ak == 0 && var2_6.bN > var2_6.aZ.length - 1) {
                                    var2_6.bN = 0;
                                }
                                if (var2_6.ak > 1 && var2_6.am && var2_6.bE.k != null && var2_6.bN > var2_6.bE.k.length - 1) {
                                    var2_6.bN = 0;
                                }
                            }
                        }
                    }
                }
                if (this.B != 4) break;
                ** GOTO lbl388
            }
            case 2: {
                this.ay();
                break;
            }
            case 3: 
            case 26: {
                this.O();
                break;
            }
            case 14: {
                this.O();
                break;
            }
            case 1: 
            case 17: 
            case 25: {
                if (this.B < this.aY.length - (main.a.H != null ? 0 : 1) && this.A != 17) {
                    this.O();
                    break;
                }
                if (this.bJ == 0) {
                    this.ay();
                    break;
                }
                this.O();
                break;
            }
            case 4: {
                var1_2 = this;
                if (main.a.j[2]) {
                    var1_2.cC -= 5;
                    var1_2.aM = var1_2.cC - (var1_2.af + var1_2.ah / 2);
                    if (var1_2.cC < var1_2.af) {
                        var1_2.cC = var1_2.af;
                    }
                }
                if (main.a.j[8]) {
                    var1_2.cC += 5;
                    var1_2.aM = var1_2.cC - (var1_2.af + var1_2.ah / 2);
                    if (var1_2.cC > var1_2.af + 200) {
                        var1_2.cC = var1_2.af + 200;
                    }
                }
                if (main.a.j[4]) {
                    var1_2.cB -= 5;
                    var1_2.aL = var1_2.cB - var1_2.ag / 2;
                    if (var1_2.cB < 16) {
                        var1_2.cB = 16;
                    }
                }
                if (main.a.j[6]) {
                    var1_2.cB += 5;
                    var1_2.aL = var1_2.cB - var1_2.ag / 2;
                    if (var1_2.cB > 250) {
                        var1_2.cB = 250;
                    }
                }
                if (main.a.k) {
                    var1_2.bT = true;
                    if (!var1_2.bZ) {
                        var1_2.bX = var1_2.aL;
                        var1_2.bY = var1_2.aM;
                        var1_2.bZ = true;
                    }
                    var1_2.aL = var1_2.bX + (main.a.t - main.a.p);
                    var1_2.aM = var1_2.bY + (main.a.u - main.a.q);
                }
                if (main.a.m) {
                    var1_2.bZ = false;
                    main.a.t = main.a.p;
                    main.a.u = main.a.q;
                    var1_2.ca = main.a.t + var1_2.aL;
                    var1_2.cb = main.a.u + var1_2.aM;
                }
                if (main.a.l) {
                    var1_2.bT = false;
                }
                if (var1_2.aL < 0) {
                    var1_2.aL = 0;
                }
                if (var1_2.aL > var1_2.aN) {
                    var1_2.aL = var1_2.aN;
                }
                if (var1_2.aM < 0) {
                    var1_2.aM = 0;
                }
                if (var1_2.aM > var1_2.aO) {
                    var1_2.aM = var1_2.aO;
                }
                main.a.j();
                return;
            }
            case 7: {
                this.ay();
                break;
            }
            case 8: {
                this.O();
                break;
            }
            case 9: {
                this.O();
                break;
            }
            case 10: {
                this.O();
                break;
            }
            case 11: 
            case 16: {
                this.O();
                break;
            }
            case 15: {
                this.O();
                break;
            }
            case 12: {
                var1_2 = this;
                if (var1_2.B == 0) {
                    var1_2.O();
                    var1_2.cc = -1;
                    if (var1_2.ak == var1_2.k.size() && main.a.l) {
                        main.a.l = false;
                        var1_2.cc = 1;
                    }
                }
                if (var1_2.B != 1) break;
                var1_2.O();
                break;
            }
            case 13: {
                var1_2 = this;
                if (var1_2.B == 0) {
                    if (var1_2.equals(main.a.G)) {
                        var1_2.ay();
                    }
                    if (var1_2.equals(main.a.H)) {
                        var2_7 = var1_2;
                        var2_7.O();
                    }
                }
                if (var1_2.B != 1 && var1_2.B != 2) break;
                var2_8 = var1_2;
                var2_8.O();
                break;
            }
            case 18: {
                this.O();
                break;
            }
            case 19: {
                var2_9 = this;
                var2_9.O();
                break;
            }
lbl388:
            // 2 sources

            case 20: {
                var2_10 = this;
                var2_10.O();
            }
        }
        main.a.k();
        var1_3 = 0;
        while (var1_3 < main.a.i.length) {
            main.a.i[var1_3] = false;
            ++var1_3;
        }
    }

    public final void a(boolean bl2) {
        this.O = bl2 ? this.U.size() + 3 : this.V.size() + 3;
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    public final void b(co co2) {
        this.A = 13;
        this.M[this.A] = bg;
        this.aT = false;
        this.aS = false;
        this.m = false;
        this.U.removeAllElements();
        this.V.removeAllElements();
        this.aR = 0;
        this.l = 0;
        if (main.a.A > 2 * ab) {
            main.a.H = new dl();
            new dl().A = 13;
            main.a.H.M[this.A] = new String[][]{ch.cm};
            main.a.H.c(1);
            main.a.H.a(false);
            main.a.G.M[this.A] = new String[][]{ch.ci, ch.cl};
            main.a.H.s();
            main.a.H.ac = co2;
        }
        if (this.equals(main.a.G)) {
            this.c(0);
        }
        if (this.B == 0) {
            this.b(true);
        }
        if (this.B == 1) {
            this.a(true);
        }
        if (this.B == 2) {
            this.a(false);
        }
        this.ac = co2;
    }

    private void a(eh eh2, boolean bl2) {
        eh2.a(0xFF0000);
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        eq eq2 = bl2 ? this.U : this.V;
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae + 36;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 36;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                if (n2 == this.O - 1) {
                    if (bl2) {
                        eh2.a(15196114);
                        eh2.b(n7, n4, this.ag, n6);
                        if (!this.aS) {
                            if (!this.m) {
                                ev.o.a(eh2, String.valueOf(ch.dX) + ch.dP, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                            } else {
                                ev.o.a(eh2, String.valueOf(ch.dX) + ch.dR, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                            }
                        } else if (this.m) {
                            eh2.a(15196114);
                            eh2.b(n7, n4, this.ag, n6);
                            eh2.a(n2 == this.ak ? cw.aI : cw.aH, this.ae + this.ag - 5, n4 + 2, dv.b);
                            (n2 == this.ak ? ev.g : ev.f).a(eh2, ch.dW, this.ae + this.ag - 22, n4 + 7, 2);
                            ev.o.a(eh2, String.valueOf(ch.dX) + ch.dR, this.ae + 5, n4 + n6 / 2 - 4, 0);
                        } else {
                            ev.o.a(eh2, String.valueOf(ch.dX) + ch.dP, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                        }
                    }
                } else if (n2 == this.O - 2) {
                    if (bl2) {
                        eh2.a(15196114);
                        eh2.b(n7, n4, this.ag, n6);
                        if (!this.aT) {
                            if (!this.aS) {
                                eh2.a(n2 == this.ak ? cw.aI : cw.aH, this.ae + this.ag - 5, n4 + 2, dv.b);
                                (n2 == this.ak ? ev.g : ev.f).a(eh2, ch.dZ, this.ae + this.ag - 22, n4 + 7, 2);
                                ev.o.a(eh2, String.valueOf(ch.dY) + ch.dP, this.ae + 5, n4 + n6 / 2 - 4, 0);
                            } else {
                                eh2.a(n2 == this.ak ? cw.aI : cw.aH, this.ae + this.ag - 5, n4 + 2, dv.b);
                                (n2 == this.ak ? ev.g : ev.f).a(eh2, ch.bx, this.ae + this.ag - 22, n4 + 7, 2);
                                ev.o.a(eh2, String.valueOf(ch.dY) + ch.dR, this.ae + 5, n4 + n6 / 2 - 4, 0);
                            }
                        }
                    } else if (!this.m) {
                        ev.f.a(eh2, ch.dQ, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                    } else {
                        ev.f.a(eh2, ch.dS, this.ae + this.ag / 2, n4 + n6 / 2 - 4, 2);
                    }
                } else if (n2 == this.O - 3) {
                    int n10;
                    eh eh3;
                    int n11;
                    eh eh4;
                    if (this.aS) {
                        eh4 = eh2;
                        n11 = 13748667;
                    } else {
                        eh4 = eh2;
                        n11 = n2 == this.ak ? 16383818 : 15196114;
                    }
                    eh4.a(n11);
                    eh2.b(n3, n4, n5, n6);
                    if (this.aS) {
                        eh3 = eh2;
                        n10 = 13748667;
                    } else {
                        eh3 = eh2;
                        n10 = n2 == this.ak ? 7300181 : 9993045;
                    }
                    eh3.a(n10);
                    eh2.b(n7, n8, 34, n9);
                    eh2.a(w, n7 + 17, n8 + n9 / 2, 3);
                    ev.m.a(eh2, String.valueOf(o.a((long)(bl2 ? this.aR : this.l))) + " " + ch.bF, n3 + 5, n4 + 11, 0);
                    ev.r.a(eh2, ch.ea, n3 + 5, n4, 0);
                } else {
                    int n12;
                    int n13;
                    eh eh5;
                    int n14;
                    eh eh6;
                    if (eq2.size() == 0) {
                        return;
                    }
                    if (this.aS) {
                        eh6 = eh2;
                        n14 = 13748667;
                    } else {
                        eh6 = eh2;
                        n14 = n2 == this.ak ? 16383818 : 15196114;
                    }
                    eh6.a(n14);
                    eh2.b(n3, n4, n5, n6);
                    if (this.aS) {
                        eh5 = eh2;
                        n13 = 13748667;
                    } else {
                        eh5 = eh2;
                        n13 = n2 == this.ak ? 9541120 : 9993045;
                    }
                    eh5.a(n13);
                    ar ar2 = (ar)eq2.elementAt(n2);
                    if (ar2 != null) {
                        n6 = 0;
                        while (n6 < ar2.a.length) {
                            byte by2;
                            if (ar2.a[n6].c.a == 72 && ar2.a[n6].a > 0 && (n12 = dl.f(by2 = dl.g(ar2.a[n6].a))) != -1) {
                                int n15;
                                eh eh7;
                                if (this.aS) {
                                    eh7 = eh2;
                                    n15 = 13748667;
                                } else {
                                    eh7 = eh2;
                                    n15 = dl.f(by2);
                                }
                                eh7.a(n15);
                            }
                            ++n6;
                        }
                    }
                    eh2.b(n7, n8, 34, n9);
                    if (ar2 != null) {
                        Object object = "";
                        ev ev2 = ev.m;
                        if (ar2.a != null) {
                            n12 = 0;
                            while (n12 < ar2.a.length) {
                                if (ar2.a[n12].c.a == 72) {
                                    object = " [+" + ar2.a[n12].a + "]";
                                }
                                if (ar2.a[n12].c.a == 41) {
                                    if (ar2.a[n12].a == 1) {
                                        ev2 = dl.h(0);
                                    } else if (ar2.a[n12].a == 2) {
                                        ev2 = dl.h(2);
                                    } else if (ar2.a[n12].a == 3) {
                                        ev2 = dl.h(8);
                                    } else if (ar2.a[n12].a == 4) {
                                        ev2 = dl.h(7);
                                    }
                                }
                                ++n12;
                            }
                        }
                        ev2.a(eh2, String.valueOf(ar2.b.d) + (String)object, n3 + 5, n4 + 1, 0);
                        String string = "";
                        if (ar2.a != null) {
                            if (ar2.a.length > 0 && ar2.a[0] != null) {
                                string = String.valueOf(string) + ar2.a[0].a();
                            }
                            object = ev.q;
                            if (ar2.A < 0 && ar2.b.b != 5) {
                                object = ev.p;
                            }
                            if (ar2.a.length > 1) {
                                int n16 = 1;
                                while (n16 < ar2.a.length) {
                                    if (ar2.a[n16] != null && ar2.a[n16].c.a != 102 && ar2.a[n16].c.a != 107) {
                                        string = String.valueOf(string) + "," + ar2.a[n16].a();
                                    }
                                    ++n16;
                                }
                            }
                            ((ev)object).a(eh2, string, n3 + 5, n4 + 11, 0);
                        }
                        er.b(eh2, ar2.b.f, n7 + 17, n8 + n9 / 2, 0, 3);
                        if (ar2.a != null) {
                            int n17 = 0;
                            while (n17 < ar2.a.length) {
                                int cfr_ignored_0 = ar2.a[n17].a;
                                this.a(eh2, ar2.a[n17].c.a, n7, n8, n9);
                                ++n17;
                            }
                            n17 = 0;
                            while (n17 < ar2.a.length) {
                                dl.a(eh2, ar2.a[n17].c.a, ar2.a[n17].a, n7, n8, 34, n9);
                                ++n17;
                            }
                        }
                        if (ar2.h > 1) {
                            ev.n.a(eh2, "" + ar2.h, n7 + 34, n8 + n9 - ev.n.a(), 1);
                        }
                    }
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void M() {
        this.bP = false;
        if (this.A == 0 && this.D.length == 5 && this.B == 3) {
            this.bP = false;
            if (this.ak == 0) {
                this.aZ = new int[this.cg.length];
                int n2 = 0;
                while (n2 < this.aZ.length) {
                    this.aZ[n2] = n2;
                    ++n2;
                }
                if (!this.an) {
                    this.bP = true;
                    return;
                }
            } else if (this.ak != 1) {
                if (this.al) {
                    return;
                }
                if (this.ak > 0) {
                    this.aZ = new int[1];
                    int n3 = 0;
                    while (n3 < this.aZ.length) {
                        this.aZ[n3] = n3;
                        ++n3;
                    }
                    this.bP = true;
                }
            }
        }
    }

    private void N() {
        try {
            if (this.A == 0 && this.B == 3 && this.D.length == 5) {
                if (this.ak == -1) {
                    return;
                }
                int n2 = 0;
                if (this.ak == 0) {
                    n2 = this.ae + this.ag / 2 - this.cg.length * this.aE / 2;
                    this.bN = (main.a.p - n2) / this.aE;
                } else {
                    this.bE = this.X();
                    if (this.bE != null && this.bE.k != null) {
                        n2 = this.ae + this.ag - 2 - this.bE.k.length * 40;
                        this.bN = (main.a.p - n2) / 40;
                    }
                }
                if (main.a.p < n2) {
                    this.bN = -1;
                    return;
                }
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    private void O() {
        int n2;
        if (this.O <= 0) {
            return;
        }
        int n3 = 0;
        if (main.a.i[2]) {
            n3 = 1;
            this.aw();
            --this.ak;
            if (this.A == 24) {
                this.ak -= 2;
                if (this.ak < 0) {
                    this.ak = 0;
                }
            } else if (this.ak < 0) {
                if (this.equals(main.a.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                    da.a();
                    if (this.L[this.B] <= 0) {
                        cj.a().a((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
                        return;
                    }
                    cj.a().a((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
                    return;
                }
                this.ak = this.O - 1;
                if (this.bP) {
                    this.ak = -1;
                }
                if (this.dn > 0) {
                    this.ak = -1;
                }
            }
            this.bp[this.B] = this.ak;
            this.bN = 0;
            this.M();
        } else if (main.a.i[8]) {
            n3 = 1;
            this.aw();
            ++this.ak;
            if (this.A == 24) {
                this.ak += 2;
                if (this.ak > this.O - 1) {
                    this.ak = this.O - 1;
                }
            } else if (this.ak > this.O - 1) {
                if (this.equals(main.a.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                    da.a();
                    if (this.L[this.B] >= this.K[this.B] - 1) {
                        cj.a().a((byte)4, -1, (byte)this.B, 0, -1);
                        return;
                    }
                    cj.a().a((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
                    return;
                }
                this.ak = 0;
            }
            this.bp[this.B] = this.ak;
            this.bN = 0;
            this.M();
        }
        if (n3 != 0) {
            this.f = this.ak * this.aD - this.ah / 2;
            if (this.f > this.aI) {
                this.f = this.aI;
            }
            if (this.f < 0) {
                this.f = 0;
            }
            this.g = this.f;
        }
        if (main.a.k) {
            this.ce = false;
            if (!this.bT && main.a.b(this.ae, this.af, this.ag, this.ah)) {
                n3 = 0;
                while (n3 < this.bS.length) {
                    this.bS[0] = main.a.q;
                    ++n3;
                }
                this.bR = main.a.q;
                this.bT = true;
                this.bU = this.bW != 0;
                this.bW = 0;
            } else if (this.bT) {
                ++this.bQ;
                if (this.bQ > 5 && this.bR == main.a.q && !this.bU) {
                    this.bR = -1000;
                    this.ak = (this.f + main.a.q - this.af) / this.aD;
                    if (this.ak >= this.O) {
                        this.ak = -1;
                    }
                    this.N();
                }
                if ((n3 = main.a.q - this.bS[0]) != 0 && this.ak != -1) {
                    this.ak = -1;
                    this.bN = -1;
                }
                n2 = this.bS.length - 1;
                while (n2 > 0) {
                    this.bS[n2] = this.bS[n2 - 1];
                    --n2;
                }
                this.bS[0] = main.a.q;
                this.f -= n3;
                if (this.f < 0) {
                    this.f = 0;
                }
                if (this.f > this.aI) {
                    this.f = this.aI;
                }
                if (this.g < 0 || this.g > this.aI) {
                    n3 /= 2;
                }
                this.g -= n3;
            }
        }
        if (main.a.m && this.bT) {
            this.ce = true;
            n3 = main.a.q - this.bS[0];
            main.a.m = false;
            if (dq.g(n3) < 20 && dq.g(main.a.q - this.bR) < 20 && !this.bU) {
                this.bW = 0;
                this.f = this.g;
                this.bR = -1000;
                this.ak = (this.f + main.a.q - this.af) / this.aD;
                if (this.ak >= this.O) {
                    this.ak = -1;
                }
                this.N();
                this.bQ = 0;
                this.bV = 10;
                es.a();
                es.s();
            } else if (this.ak != -1 && this.bQ > 5) {
                this.bQ = 0;
                this.bV = 1;
            } else if (this.ak == -1 && !this.bU) {
                if (this.g < 0) {
                    this.f = 0;
                } else if (this.g > this.aI) {
                    this.f = this.aI;
                } else {
                    n2 = main.a.q - this.bS[0] + (this.bS[0] - this.bS[1]) + (this.bS[1] - this.bS[2]);
                    n2 = n2 > 10 ? 10 : (n2 < -10 ? -10 : 0);
                    this.bW = -n2 * 100;
                }
            }
            if ((this.aw() || this.A == 13) && main.a.q < this.af + 21) {
                this.ak = 0;
                this.ax();
            }
            this.bT = false;
            this.bQ = 0;
            main.a.m = false;
        }
    }

    private void P() {
        this.O = this.cm.length;
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    private void Q() {
        es.a();
        es.L();
        this.O = G.length;
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    public final void v() {
        if (this.al) {
            this.O = this.P == null ? 2 : this.P.length + 2;
            this.ch = ch.dt;
        } else if (this.an) {
            this.ao = "";
            this.O = (this.Q == null ? this.R.size() : this.Q.size()) + 2;
            this.ch = String.valueOf(ch.di) + " " + (this.bD != null ? this.bD.c : co.m().aw.c);
        } else if (this.am) {
            this.O = c.l.size() + 2;
            this.ch = ch.af;
            this.ao = "";
        }
        this.cg = co.m().aw == null ? new String[][]{ch.dn, ch.dm} : (!this.an ? (this.R.size() > 1 ? new String[][]{ch.dk, ch.dq, ch.dj} : new String[][]{ch.dj}) : (co.m().ax > 0 ? new String[][]{ch.ag, ch.dl} : (this.R.size() > 1 ? new String[][]{ch.ag, ch.dl, ch.do, ch.dp} : new String[][]{ch.ag, ch.do, ch.dp})));
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
    }

    public final void w() {
        cw.bi = false;
        this.aD = 24;
        if (this.bp != null && this.bp[3] == 0) {
            this.bp[3] = -1;
        }
        this.O = 2;
        if (co.m().aw != null) {
            this.am = true;
            this.an = false;
            this.al = false;
        } else {
            this.am = false;
            this.an = false;
            this.al = true;
        }
        if (co.m().aw != null) {
            this.O = c.l.size() + 2;
        }
        this.v();
        this.bN = -1;
        if (this.o == null) {
            this.o = new el();
            this.o.a.b = main.a.B - 35 - el.b().a.d;
            this.o.a();
            this.o.c = main.a.G;
        }
        if (co.m().aw == null) {
            this.ao = ch.dN;
            cj.a().a("");
        }
        this.ak = this.bp[this.B];
        if (main.a.e) {
            this.ak = -1;
        }
    }

    public final void x() {
        this.O = this.bG.size() + 1;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    public final void y() {
        this.aD = 24;
        this.O = this.B == this.aY.length - 1 && main.a.H == null && this.bJ != 2 ? this.i(co.m().aV.length + co.m().aT.length) : co.m().aX[this.B].length;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void R() {
        this.aD = 30;
        this.O = co.m().aL.b.length + 6;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void S() {
        this.aD = 24;
        this.O = cw.l().U.length;
        this.aI = this.O * this.aD - this.ah;
        this.f = 0;
        this.g = 0;
        this.ak = main.a.e ? -1 : 0;
    }

    private void T() {
        this.O = this.i(co.m().aU.length);
        this.aD = 24;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 9;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void U() {
        this.aD = 30;
        ar[] arArray = co.n().aV;
        bt[] btArray = co.n().aW;
        this.O = arArray.length + btArray.length;
        this.aI = this.O * this.aD - this.ah;
        this.g = this.f = this.aJ[this.B];
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.f = 0;
            this.g = 0;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    private void b(boolean bl2) {
        this.O = this.i(co.m().aV.length + co.m().aT.length);
        this.aD = 24;
        this.aI = this.O * this.aD - this.ah;
        this.g = this.f = this.aJ[this.B];
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.f = 0;
            this.g = 0;
        }
        if (bl2) {
            this.ak = main.a.e ? -1 : 0;
        }
    }

    private void V() {
        if (this.bM > 0) {
            --this.bM;
        }
        if (this.ce && this.equals(main.a.G) && this.bJ == 2 && this.K[this.B] > 1) {
            if (this.g < -50) {
                da.a();
                this.ce = false;
                if (this.L[this.B] <= 0) {
                    cj.a().a((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
                } else {
                    cj.a().a((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
                }
            } else if (this.g > this.aI + 50) {
                this.ce = false;
                da.a();
                if (this.L[this.B] >= this.K[this.B] - 1) {
                    cj.a().a((byte)4, -1, (byte)this.B, 0, -1);
                } else {
                    cj.a().a((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
                }
            }
        }
        if (this.h != this.aK && !this.bT) {
            this.cj = this.aK - this.h << 2;
            this.ck += this.cj;
            this.h += this.ck >> 3;
            this.ck &= 0xF;
        }
        if (Math.abs(this.aK - this.h) < 10) {
            this.h = this.aK;
        }
        if (this.cD) {
            this.cD = false;
            this.aK = this.ag;
        }
        if (this.aK >= this.ag - 10 && this.h >= this.ag - 10 && this.bH == 0) {
            this.a = false;
            this.Z();
            if (this.cI) {
                this.cI = false;
                if (co.m().ag > 0L && co.m().T != 14) {
                    da.a();
                    if (this.A == 3) {
                        cj.a().f(this.ak);
                    } else if (this.A == 14) {
                        cj.a().v(this.ak);
                    }
                }
            }
            if (this.cl) {
                this.cl = false;
                int n2 = this.S.size() - this.Z.size();
                if (co.m().bi != null) {
                    co.m().bi.Y = this.ak - n2 < 0 ? this.ak : (int)Short.parseShort((String)this.Z.elementAt(this.ak - n2));
                }
                ae ae2 = (ae)this.S.elementAt(this.ak);
                ae2.a();
            }
            this.S.removeAllElements();
            this.Z.removeAllElements();
            this.ac = null;
        }
        if (this.bW != 0 && !this.bT) {
            this.f += this.bW / 100;
            if (this.f < 0) {
                this.f = 0;
            } else if (this.f > this.aI) {
                this.f = this.aI;
            } else {
                this.g = this.f;
            }
            this.bW = this.bW * 9 / 10;
            if (this.bW < 100 && this.bW > -100) {
                this.bW = 0;
            }
        }
        if (this.g != this.f && !this.bT) {
            this.aH = this.f - this.g << 2;
            this.aG += this.aH;
            this.g += this.aG >> 4;
            this.aG &= 0xF;
        }
        this.aJ[this.B] = this.g;
    }

    private void b(eh eh2) {
        int n2;
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        eh2.a(0);
        if (this.O == 0) {
            return;
        }
        int n3 = (this.g + this.ah) / 24 + 1;
        if (n3 < this.ah / 24 + 1) {
            n3 = this.ah / 24 + 1;
        }
        if (n3 > this.O) {
            n3 = this.O;
        }
        if ((n2 = this.g / 24) >= n3) {
            n2 = n3 - 1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        while (n2 < n3) {
            int n4 = this.ae;
            int n5 = this.af + n2 * this.aD;
            int n6 = this.aD - 1;
            int n7 = this.ae + 24;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.ag - 24;
            int n10 = this.aD - 1;
            eh2.a(n2 == this.ak ? 16383818 : 15196114);
            eh2.d(n7, n8, n9, n10);
            eh2.a(n2 == this.ak ? 9541120 : 9993045);
            eh2.d(n4, n5, 24, n6);
            cf cf2 = (cf)this.W.elementAt(n2);
            if (cf2.b != -1) {
                er.b(eh2, cf2.b, n4, n5, 0, 0);
            } else {
                bk bk2 = cw.y[cf2.a];
                er.b(eh2, bk2.a[co.bT[0][0][0]].a, n4 + bk2.a[co.bT[0][0][0]].b, n5 + n10 - 1, 0, 36);
            }
            eh2.e(this.ae, this.af + this.g, this.ag, this.ah);
            if (cf2.g != co.m().V) {
                ev.h.a(eh2, cf2.e, n7 + 5, n8, 0);
            } else {
                ev.a.a(eh2, cf2.e, n7 + 5, n8, 0);
            }
            ev.q.a(eh2, cf2.f, n7 + n9 - 5, n8 + 11, 1);
            ev.m.a(eh2, String.valueOf(ch.bN) + ": " + cf2.h, n7 + 5, n8 + 11, 0);
            ++n2;
        }
        this.f(eh2);
    }

    public final void a(eh eh2) {
        block144: {
            Object object;
            Object object2;
            int n2;
            Object object3;
            Object object4;
            eh eh3;
            block143: {
                block149: {
                    dl dl2;
                    eh eh4;
                    block150: {
                        block148: {
                            block147: {
                                block146: {
                                    block145: {
                                        Object object5;
                                        int n3;
                                        eh2.a(-eh2.a(), -eh2.b());
                                        eh2.a(-this.h, 0);
                                        eh2.a(this.b, 0);
                                        if (main.a.G.av == -1) break block143;
                                        if (!this.equals(main.a.G)) break block144;
                                        eh4 = eh2;
                                        dl2 = this;
                                        cw.l();
                                        cw.b(eh4);
                                        eh eh5 = eh4;
                                        dl dl3 = dl2;
                                        eh5.a(-cw.j, -cw.k);
                                        if (dl3.cX < 3) {
                                            n3 = 0;
                                            while (n3 < cw.H.size()) {
                                                object5 = (bg)cw.H.elementAt(n3);
                                                if (((bg)object5).t.a == dl3.aw) {
                                                    ((bg)object5).a(eh5);
                                                    if (((co)object5).L != null) {
                                                        ((co)object5).L.a(eh5, ((co)object5).N, ((co)object5).O - ((co)object5).az - main.a.ag, ((co)object5).U);
                                                    }
                                                }
                                                ++n3;
                                            }
                                        }
                                        main.a.a(eh5);
                                        if (main.a.w % 4 == 0) {
                                            eh5.a(as.f, dl3.ax - 5, dl3.ay + 15, 33);
                                            eh5.a(as.f, dl3.ax + 5, dl3.ay + 15, 33);
                                            eh5.a(as.f, dl3.ax, dl3.ay + 15, 33);
                                        }
                                        n3 = 0;
                                        while (n3 < j.x.size()) {
                                            object5 = (j)j.x.elementAt(n3);
                                            ((j)object5).a(eh5);
                                            ++n3;
                                        }
                                        if (main.a.w % 4 == 0) {
                                            eh4.a(as.f, dl2.ax, dl2.ay + 15, 33);
                                        }
                                        if (dl2.cX != 0) break block145;
                                        int n4 = 0;
                                        while (n4 < dl2.cT.length) {
                                            er.b(eh4, dl2.aA, dl2.ax, dl2.ay, 0, 3);
                                            if (dl2.dd) {
                                                er.b(eh4, dl2.de, dl2.cU[n4], dl2.cV[n4], 0, 3);
                                            }
                                            ++n4;
                                        }
                                        break block144;
                                    }
                                    if (dl2.cX != 1) break block146;
                                    if (!dl2.dd) {
                                        er.b(eh4, dl2.aB, dl2.ax, dl2.ay, 0, 3);
                                    } else {
                                        int n5 = 0;
                                        while (n5 < dl2.cT.length) {
                                            er.b(eh4, dl2.aA, dl2.cU[0], dl2.cV[0], 0, 3);
                                            er.b(eh4, dl2.de, dl2.cU[1], dl2.cV[1], 0, 3);
                                            ++n5;
                                        }
                                    }
                                    break block144;
                                }
                                if (dl2.cX != 2) break block147;
                                if (!dl2.dd) {
                                    er.b(eh4, dl2.aB, dl2.ax, dl2.ay, 0, 3);
                                } else {
                                    int n6 = 0;
                                    while (n6 < dl2.cT.length) {
                                        er.b(eh4, dl2.aA, dl2.cU[n6], dl2.cV[n6], 0, 3);
                                        ++n6;
                                    }
                                }
                                break block144;
                            }
                            if (dl2.cX != 3) break block148;
                            if (!dl2.dd) {
                                er.b(eh4, dl2.aB, dl2.ax, dl2.ay, 0, 3);
                            } else {
                                er.b(eh4, dl2.aA, dl2.ax, dl2.ay, 0, 3);
                            }
                            break block144;
                        }
                        if (dl2.cX != 4) break block149;
                        if (dl2.dd) break block150;
                        if (dl2.aB == -1) break block149;
                        er.b(eh4, dl2.aB, dl2.ax, dl2.ay, 0, 3);
                        break block144;
                    }
                    int n7 = 0;
                    while (n7 < dl2.df.length) {
                        er.b(eh4, dl2.df[n7], dl2.cU[n7], dl2.cV[n7], 0, 3);
                        ++n7;
                    }
                }
                return;
            }
            bj.c(this.b, 0, this.d, this.e, eh2);
            try {
                eh3 = eh2;
                object4 = this;
                eh3.e(((dl)object4).b + 1, 0, ((dl)object4).d - 2, ((dl)object4).af - 2);
                eh3.a(9993045);
                eh3.d(((dl)object4).b, 0, ((dl)object4).d - 2, 50);
                switch (((dl)object4).A) {
                    case 13: {
                        if (((dl)object4).B == 0 || ((dl)object4).B == 1) {
                            if (object4.equals(main.a.G)) {
                                er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                                object3 = eh3;
                                ev.n.a((eh)object3, ch.es, 60, 4, 0, ev.o);
                                ev.n.a((eh)object3, ch.dT, 60, 16, 0, ev.o);
                                ev.n.a((eh)object3, ch.dU, 60, 27, 0, ev.o);
                                ev.n.a((eh)object3, ch.dV, 60, 38, 0, ev.o);
                            }
                            if (object4.equals(main.a.H) && ((dl)object4).ac != null) {
                                er.b(eh3, ((dl)object4).ac.l(), ((dl)object4).b + 25, 50, 0, 33);
                                super.a(eh3, ((dl)object4).ac);
                            }
                        }
                        if (((dl)object4).B == 2 && ((dl)object4).ac != null) {
                            er.b(eh3, ((dl)object4).ac.l(), ((dl)object4).b + 25, 50, 0, 33);
                            super.a(eh3, ((dl)object4).ac);
                        }
                        break;
                    }
                    case 12: {
                        if (((dl)object4).B == 0) {
                            int n8 = 1410;
                            n2 = 0;
                            while (n2 < cw.H.size()) {
                                object2 = (bg)cw.H.elementAt(n2);
                                if (((bg)object2).t.a == ((dl)object4).aw) {
                                    n8 = ((co)object2).bc;
                                }
                                ++n2;
                            }
                            er.b(eh3, n8, ((dl)object4).b + 25, 50, 0, 33);
                            object = eh3;
                            object3 = object4;
                            if (((dl)object3).aq != null) {
                                n8 = 0;
                                while (n8 < ((dl)object3).aq.length) {
                                    ev.s.a((eh)object, ((dl)object3).aq[n8], ((dl)object3).b + 45 + (((dl)object3).d - 50) / 2, 5 + n8 * 14, 2);
                                    ++n8;
                                }
                            }
                        }
                        if (((dl)object4).B == 1) {
                            er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                            super.A(eh3);
                        }
                        break;
                    }
                    case 11: 
                    case 16: 
                    case 23: 
                    case 24: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        ((dl)object4).A(eh3);
                        break;
                    }
                    case 15: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        ((dl)object4).A(eh3);
                        break;
                    }
                    case 9: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        ((dl)object4).A(eh3);
                        break;
                    }
                    case 21: {
                        if (((dl)object4).B == 0) {
                            er.b(eh3, co.n().l(), ((dl)object4).b + 25, 50, 0, 33);
                            object = eh3;
                            object3 = object4;
                            ev.n.a((eh)object, String.valueOf(ch.dd) + ": " + o.a(co.n().K), ((dl)object3).b + 60, 4, 0, ev.o);
                            if (co.n().K > 0L) {
                                ev.n.a((eh)object, co.n().aE ? co.n().k() : co.n().bz, ((dl)object3).b + 60, 16, 0, ev.o);
                            }
                            if (co.n().al > 0L) {
                                ev.n.a((eh)object, String.valueOf(ch.fc) + " :" + co.n().al, ((dl)object3).b + 60, 27, 0, ev.o);
                            }
                            if (co.n().df > 0) {
                                ev.n.a((eh)object, ch.fe, ((dl)object3).b + 60, 38, 0, ev.o);
                                ((eh)object).a(cw.aR, ((dl)object3).b + 100, 41, 0);
                                int n9 = co.n().bv * eh.a(cw.aQ) / co.n().df;
                                ((eh)object).e(100, ((dl)object3).b + 41, n9, 20);
                                ((eh)object).a(cw.aQ, ((dl)object3).b + 100, 41, 0);
                            }
                            ((eh)object).e(0, 0, main.a.A, main.a.B);
                        }
                        if (((dl)object4).B == 1) {
                            er.b(eh3, co.n().l(), ((dl)object4).b + 25, 50, 0, 33);
                            object = eh3;
                            object3 = object4;
                            ev.c.a((eh)object, "HP: " + co.n().ag + "/" + co.n().aj, ((dl)object3).b + 60, 4, 0, ev.f);
                            ev.c.a((eh)object, "MP: " + co.n().af + "/" + co.n().ak, ((dl)object3).b + 60, 16, 0, ev.f);
                            ev.n.a((eh)object, String.valueOf(ch.ff) + ": " + co.n().ab + ", " + ch.fd + ": " + co.n().am, ((dl)object3).b + 60, 27, 0, ev.o);
                            ev.n.a((eh)object, String.valueOf(ch.u) + ": " + ((dl)object3).cm[co.n().M], ((dl)object3).b + 60, 38, 0, ev.o);
                        }
                        if (((dl)object4).B == 2) {
                            er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                            super.C(eh3);
                        }
                        break;
                    }
                    case 0: {
                        if (((dl)object4).B == 0) {
                            er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                            ((dl)object4).A(eh3);
                        }
                        if (((dl)object4).B == 1) {
                            er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                            super.C(eh3);
                        }
                        if (((dl)object4).B == 2) {
                            er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                            object = eh3;
                            object3 = object4;
                            ev.s.a((eh)object, "Top " + co.m().I, ((dl)object3).b + 45 + (((dl)object3).d - 50) / 2, 2, 2);
                            ev.n.a((eh)object, ch.eJ, ((dl)object3).b + 45 + (((dl)object3).d - 50) / 2, 14, 2);
                            ev.s.a((eh)object, o.a(co.m().ao), ((dl)object3).b + (main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0) + 45 + (((dl)object3).d - 50) / 2, 26, 2);
                            ev.n.a((eh)object, String.valueOf(ch.bO) + ": " + o.a(co.m().ap), ((dl)object3).b + (main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0) + 45 + (((dl)object3).d - 50) / 2, 38, 2);
                        }
                        if (((dl)object4).B == 3) {
                            if (((dl)object4).D.length == 5) {
                                a a2;
                                object = eh3;
                                object3 = object4;
                                if (co.m().aw == null) {
                                    er.b((eh)object, co.m().l(), 25, 50, 0, 33);
                                    ev.c.a((eh)object, ch.du, (((dl)object3).ag - 50) / 2 + 50, 20, 2);
                                } else if (!((dl)object3).an) {
                                    a2 = co.m().aw;
                                    if (a2 != null) {
                                        er.b((eh)object, co.m().l(), 25, 50, 0, 33);
                                        ev.c.a((eh)object, a2.c, 60, 4, 0, ev.f);
                                        ev.n.a((eh)object, String.valueOf(ch.eK) + ": " + a2.f, 60, 16, 0, ev.o);
                                        ev.n.a((eh)object, String.valueOf(ch.cX) + ": " + a2.k, 60, 27, 0, ev.o);
                                        ev.n.a((eh)object, String.valueOf(ch.dr) + ": " + a2.j, 60, 38, 0, ev.o);
                                        ce.a((eh)object, a2.d, 60, 38, ((dl)object3).ag - 70, ((dl)object3).aD, ev.n);
                                    }
                                } else {
                                    a2 = ((dl)object3).bD != null ? ((dl)object3).bD : co.m().aw;
                                    er.b((eh)object, co.m().l(), 25, 50, 0, 33);
                                    ev.c.a((eh)object, a2.c, 60, 4, 0, ev.f);
                                    ev.n.a((eh)object, String.valueOf(ch.di) + ": " + a2.g + "/" + a2.h, 60, 16, 0, ev.o);
                                    ev.n.a((eh)object, String.valueOf(ch.df) + ": " + a2.i, 60, 27, 0, ev.o);
                                    ce.a((eh)object, a2.d, 60, 38, ((dl)object3).ag - 70, ((dl)object3).aD, ev.n);
                                }
                            } else {
                                er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                                dl.z(eh3);
                            }
                        }
                        if (((dl)object4).B == 4) {
                            er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                            dl.z(eh3);
                        }
                        break;
                    }
                    case 25: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        ((dl)object4).A(eh3);
                        break;
                    }
                    case 2: {
                        if (((dl)object4).B == 0) {
                            er.b(eh3, 526, ((dl)object4).b + 25, 50, 0, 33);
                            object = eh3;
                            object3 = object4;
                            String string = String.valueOf(ch.cz) + ": " + ((dl)object3).N + "/" + co.m().aU.length + " " + ch.cA;
                            ev.c.a((eh)object, ch.cg, 60, 4, 0);
                            ev.n.a((eh)object, string, 60, 16, 0);
                        }
                        if (((dl)object4).B == 1) {
                            er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                            super.C(eh3);
                        }
                        break;
                    }
                    case 3: {
                        er.b(eh3, 561, ((dl)object4).b + 25, 50, 0, 33);
                        object3 = eh3;
                        ev.c.a((eh)object3, String.valueOf(ch.co) + " " + dx.n, 60, 4, 0, ev.f);
                        ev.n.a((eh)object3, dx.k, 60, 16, 0, ev.o);
                        ev.c.a((eh)object3, String.valueOf(dx.n), 25, 27, 2);
                        break;
                    }
                    case 26: {
                        er.b(eh3, 561, ((dl)object4).b + 25, 50, 0, 33);
                        object = eh3;
                        object3 = object4;
                        er.b((eh)object, co.m().l(), ((dl)object3).b + 25, 50, 0, 33);
                        super.A((eh)object);
                        break;
                    }
                    case 1: {
                        ar ar2;
                        if (((dl)object4).B == ((dl)object4).aY.length - 1 && main.a.H == null) {
                            er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        } else if (co.m().bh != null) {
                            er.b(eh3, co.m().bh.bc, ((dl)object4).b + 25, 50, 0, 33);
                        }
                        object = eh3;
                        object3 = object4;
                        if (((dl)object3).B == ((dl)object3).aY.length - 1 && main.a.H == null) {
                            super.A((eh)object);
                            break;
                        }
                        if (((dl)object3).ak < 0) {
                            if (((dl)object3).bJ != 2) {
                                ev.s.a((eh)object, ch.eu, ((dl)object3).b + 60, 14, 0);
                                ev.s.a((eh)object, ar, ((dl)object3).b + 60, 26, 0);
                                break;
                            }
                            ev.s.a((eh)object, ch.eu, ((dl)object3).b + 60, 5, 0);
                            ev.s.a((eh)object, ar, ((dl)object3).b + 60, 17, 0);
                            ev.s.a((eh)object, String.valueOf(ch.fS) + " " + (((dl)object3).L[((dl)object3).B] + 1) + "/" + ((dl)object3).K[((dl)object3).B], ((dl)object3).b + 60, 29, 0);
                            break;
                        }
                        if (((dl)object3).B >= 0 && ((dl)object3).B <= co.m().aX.length - 1 && ((dl)object3).ak >= 0 && ((dl)object3).ak <= co.m().aX[((dl)object3).B].length - 1 && (ar2 = co.m().aX[((dl)object3).B][((dl)object3).ak]) != null) {
                            if (object3.equals(main.a.G) && ((dl)object3).B <= 3 && ((dl)object3).bJ == 2) {
                                ev.c.a((eh)object, String.valueOf(ch.fS) + " " + (((dl)object3).L[((dl)object3).B] + 1) + "/" + ((dl)object3).K[((dl)object3).B], ((dl)object3).b + 55, 4, 0);
                            }
                            ev.c.a((eh)object, ar2.b.d, ((dl)object3).b + 55, 24, 0);
                            object4 = String.valueOf(ch.cx) + " " + dq.a((long)ar2.b.i);
                            if ((long)ar2.b.i > co.m().K) {
                                ev.n.a((eh)object, (String)object4, ((dl)object3).b + 55, 35, 0);
                                break;
                            }
                            ev.r.a((eh)object, (String)object4, ((dl)object3).b + 55, 35, 0);
                        }
                        break;
                    }
                    case 4: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        dl.B(eh3);
                        break;
                    }
                    case 7: 
                    case 17: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        ((dl)object4).A(eh3);
                        break;
                    }
                    case 8: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        ((dl)object4).A(eh3);
                        break;
                    }
                    case 10: {
                        if (((dl)object4).ac != null) {
                            er.b(eh3, ((dl)object4).ac.l(), ((dl)object4).b + 25, 50, 0, 33);
                            super.a(eh3, ((dl)object4).ac);
                        }
                        break;
                    }
                    case 14: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        dl.B(eh3);
                        break;
                    }
                    case 18: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        ((dl)object4).A(eh3);
                        break;
                    }
                    case 19: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        dl.z(eh3);
                        break;
                    }
                    case 20: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        dl.z(eh3);
                        break;
                    }
                    case 22: {
                        er.b(eh3, co.m().l(), ((dl)object4).b + 25, 50, 0, 33);
                        dl.z(eh3);
                    }
                }
            }
            catch (Exception exception) {}
            eh3 = eh2;
            object4 = this;
            if (((dl)object4).A != 13 || ((dl)object4).B != 2 && !object4.equals(main.a.H)) {
                eh3.e(0, 0, main.a.A, main.a.B);
                eh3.a(11837316);
                eh3.d(((dl)object4).b + 1, ((dl)object4).e - 15, ((dl)object4).d - 2, 14);
                eh3.a(13524492);
                eh3.d(((dl)object4).b + 1, ((dl)object4).e - 15, ((dl)object4).d - 2, 1);
                eh3.a(w, ((dl)object4).b + 11, ((dl)object4).e - 7, 3);
                eh3.a(y, ((dl)object4).b + 75, ((dl)object4).e - 8, 3);
                ev.n.a(eh3, String.valueOf(co.m().z), ((dl)object4).b + 24, ((dl)object4).e - 13, 0, ev.o);
                ev.n.a(eh3, String.valueOf(co.m().A), ((dl)object4).b + 85, ((dl)object4).e - 13, 0, ev.o);
                eh3.a(z, ((dl)object4).b + 130, ((dl)object4).e - 8, 3);
                ev.n.a(eh3, String.valueOf(co.m().B), ((dl)object4).b + 140, ((dl)object4).e - 13, 0, ev.o);
            }
            this.y(eh2);
            switch (this.A) {
                case 9: {
                    this.v(eh2);
                    break;
                }
                case 21: {
                    if (this.B == 0) {
                        this.e(eh2);
                    }
                    if (this.B == 1) {
                        this.d(eh2);
                    }
                    if (this.B != 2) break;
                    this.x(eh2);
                    break;
                }
                case 24: {
                    this.h(eh2);
                    break;
                }
                case 23: {
                    this.i(eh2);
                    break;
                }
                case 0: {
                    if (this.B == 0) {
                        this.E(eh2);
                    }
                    if (this.B == 1) {
                        this.x(eh2);
                    }
                    if (this.B == 2) {
                        this.j(eh2);
                    }
                    if (this.B == 3) {
                        if (this.D.length == 4) {
                            this.g(eh2);
                        } else {
                            this.u(eh2);
                        }
                    }
                    if (this.B != 4) break;
                    this.g(eh2);
                    break;
                }
                case 2: {
                    if (this.B == 0) {
                        this.o(eh2);
                    }
                    if (this.B != 1) break;
                    this.x(eh2);
                    break;
                }
                case 3: {
                    this.m(eh2);
                    break;
                }
                case 26: {
                    this.l(eh2);
                    break;
                }
                case 1: {
                    this.c(eh2);
                    break;
                }
                case 25: {
                    this.n(eh2);
                    break;
                }
                case 4: {
                    this.D(eh2);
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    this.x(eh2);
                    break;
                }
                case 17: {
                    this.c(eh2);
                    break;
                }
                case 8: {
                    this.p(eh2);
                    break;
                }
                case 10: {
                    this.t(eh2);
                    break;
                }
                case 11: {
                    this.s(eh2);
                    break;
                }
                case 16: {
                    this.r(eh2);
                    break;
                }
                case 15: {
                    this.b(eh2);
                    break;
                }
                case 12: {
                    if (this.B == 0) {
                        this.w(eh2);
                    }
                    if (this.B != 1) break;
                    this.x(eh2);
                    break;
                }
                case 13: {
                    if (this.B == 0) {
                        if (this.equals(main.a.G)) {
                            this.x(eh2);
                        } else {
                            this.a(eh2, false);
                        }
                    }
                    if (this.B == 1) {
                        this.a(eh2, true);
                    }
                    if (this.B != 2) break;
                    this.a(eh2, false);
                    break;
                }
                case 14: {
                    this.k(eh2);
                    break;
                }
                case 18: {
                    this.q(eh2);
                    break;
                }
                case 19: {
                    this.F(eh2);
                    break;
                }
                case 20: {
                    this.G(eh2);
                }
            }
            cw.c(eh2);
            eh3 = eh2;
            object4 = this;
            if (((dl)object4).ai != null && ((dl)object4).ai.d != null) {
                ((dl)object4).ai.a(eh3);
                int n10 = ((dl)object4).ai.e + 13;
                n2 = ((dl)object4).ai.f + 11;
                if (((dl)object4).A == 15) {
                    n10 += 5;
                    n2 += 26;
                }
                if (((dl)object4).A == 0 && ((dl)object4).B == 3) {
                    if (((dl)object4).al) {
                        n10 -= 5;
                    } else if (((dl)object4).bL != null || ((dl)object4).cH != null) {
                        n10 = ((dl)object4).ai.e + 21;
                        n2 = ((dl)object4).ai.f + 40;
                    }
                }
                if (((dl)object4).bL != null) {
                    object2 = cw.y[((dl)object4).bL[0]];
                    object3 = cw.y[((dl)object4).bL[1]];
                    object = cw.y[((dl)object4).bL[2]];
                    er.b(eh3, ((bk)object2).a[co.bT[0][0][0]].a, n10 + co.bT[0][0][1] + ((bk)object2).a[co.bT[0][0][0]].b, n2 - co.bT[0][0][2] + ((bk)object2).a[co.bT[0][0][0]].c, 0, 0);
                    er.b(eh3, ((bk)object3).a[co.bT[0][1][0]].a, n10 + co.bT[0][1][1] + ((bk)object3).a[co.bT[0][1][0]].b, n2 - co.bT[0][1][2] + ((bk)object3).a[co.bT[0][1][0]].c, 0, 0);
                    er.b(eh3, ((bk)object).a[co.bT[0][2][0]].a, n10 + co.bT[0][2][1] + ((bk)object).a[co.bT[0][2][0]].b, n2 - co.bT[0][2][2] + ((bk)object).a[co.bT[0][2][0]].c, 0, 0);
                } else if (((dl)object4).cH != null) {
                    ((dl)object4).cH.a(eh3, n10 + 5, n2 + 25, 1, 0, true);
                } else if (((dl)object4).bK != -1) {
                    er.b(eh3, ((dl)object4).bK, ((dl)object4).ai.e + 8, ((dl)object4).ai.f + 2, 0, 20);
                }
                if (((dl)object4).bC != null && ((dl)object4).bC.b.b != 5) {
                    if (((dl)object4).bC.A > 0) {
                        eh3.a(aU, n10 - 7, n2 + 13, 3);
                        ev.h.a(eh3, String.valueOf(dq.g(((dl)object4).bC.A)), n10 + 1, n2 + 8, 0);
                    } else if (((dl)object4).bC.A < 0 && ((dl)object4).bC.A != -1) {
                        eh3.a(aV, n10 - 7, n2 + 13, 3);
                        ev.a.a(eh3, String.valueOf(dq.g(((dl)object4).bC.A)), n10 + 1, n2 + 8, 0);
                    }
                }
            }
            if (this.h == this.aK && !main.a.F.a) {
                this.aa.a(eh2);
            }
            if (this.j != null && this.j.k) {
                eh3 = eh2;
                object4 = this.j;
                ((dw)object4).a(eh3);
            }
        }
    }

    private void c(eh eh2) {
        try {
            if (this.A == 1 && this.B == this.aY.length - 1 && main.a.H == null && this.bJ != 2) {
                this.x(eh2);
                return;
            }
            eh2.a(0xFF0000);
            eh2.e(this.ae, this.af, this.ag, this.ah);
            if (this.bJ == 2 && this.equals(main.a.G)) {
                if (this.B <= 3 && main.a.e) {
                    if (this.g < -50) {
                        main.a.a(this.ae + this.ag / 2, this.af + 30, eh2);
                    } else if (this.g < 0) {
                        ev.o.a(eh2, ch.fT, this.ae + this.ag / 2, this.af + 15, 2);
                    } else if (this.aI >= 0) {
                        if (this.g > this.aI + 50) {
                            main.a.a(this.ae + this.ag / 2, this.af + this.ah - 30, eh2);
                        } else if (this.g > this.aI) {
                            ev.o.a(eh2, ch.fU, this.ae + this.ag / 2, this.af + this.ah - 25, 2);
                        }
                    }
                }
                if (co.m().aX[this.B].length == 0 && this.A != 17) {
                    ev.o.a(eh2, ch.fV, this.ae + this.ag / 2, this.af + this.ah / 2 - 10, 2);
                    return;
                }
            }
            eh2.a(0, -this.g);
            ar[] arArray = co.m().aX[this.B];
            if (this.bJ == 2 && (this.B == 4 || this.A == 17) && (arArray = co.m().aX[4]).length == 0) {
                ev.o.a(eh2, ch.fV, this.ae + this.ag / 2, this.af + this.ah / 2 - 10, 2);
                return;
            }
            int n2 = arArray.length;
            int n3 = 0;
            while (n3 < n2) {
                int n4 = this.ae + 26;
                int n5 = this.af + n3 * this.aD;
                int n6 = this.ag - 26;
                int n7 = this.aD - 1;
                int n8 = this.ae;
                int n9 = this.af + n3 * this.aD;
                int n10 = this.aD - 1;
                if (n5 - this.g <= this.af + this.ah && n5 - this.g >= this.af - this.aD) {
                    eh2.a(n3 == this.ak ? 16383818 : 15196114);
                    eh2.b(n4, n5, n6, n7);
                    eh2.a(n3 == this.ak ? 9541120 : 9993045);
                    eh2.b(n8, n9, 24, n10);
                    ar ar2 = arArray[n3];
                    if (ar2 != null) {
                        Object object = "";
                        ev ev2 = ev.m;
                        if (ar2.B != 0 && this.bJ == 2 && this.B <= 3 && !this.equals(main.a.H) && ar2.b.d.length() < 20) {
                            ev2 = ev.h;
                        }
                        if (ar2.a != null) {
                            int n11 = 0;
                            while (n11 < ar2.a.length) {
                                if (ar2.a[n11].c.a == 72) {
                                    object = " [+" + ar2.a[n11].a + "]";
                                }
                                if (ar2.a[n11].c.a == 41) {
                                    if (ar2.a[n11].a == 1) {
                                        ev2 = dl.h(0);
                                    } else if (ar2.a[n11].a == 2) {
                                        ev2 = dl.h(2);
                                    } else if (ar2.a[n11].a == 3) {
                                        ev2 = dl.h(8);
                                    } else if (ar2.a[n11].a == 4) {
                                        ev2 = dl.h(7);
                                    }
                                }
                                ++n11;
                            }
                        }
                        ev2.a(eh2, String.valueOf(ar2.b.d) + (String)object, n4 + 5, n5 + 1, 0);
                        String string = "";
                        if (ar2.a != null && ar2.a.length > 0) {
                            if (ar2.a[0] != null && ar2.a[0].c.a != 102 && ar2.a[0].c.a != 107) {
                                string = String.valueOf(string) + ar2.a[0].a();
                            }
                            object = ev.q;
                            if (ar2.A < 0 && ar2.b.b != 5) {
                                object = ev.p;
                            }
                            if (this.bJ == 2 && ar2.a.length > 1 && ar2.v != -1) {
                                string = String.valueOf(string);
                            }
                            if (this.bJ != 2 || this.bJ == 2 && ar2.v <= 1) {
                                ((ev)object).a(eh2, string, n4 + 5, n5 + 11, 0);
                            }
                        }
                        if (ar2.s > 0) {
                            er.b(eh2, ar2.u, n4 + n6 - 7, n5 + 9, 0, 3);
                            ev.b.a(eh2, dq.a((long)ar2.s), n4 + n6 - 15, n5 + 1, 1);
                        }
                        if (ar2.n != 0 || ar2.p != 0) {
                            if (this.bJ != 2 && ar2.j == 0L) {
                                if (ar2.n > 0 && ar2.p > 0) {
                                    if (ar2.n > 0) {
                                        eh2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        ev.d.a(eh2, dq.a((long)ar2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (ar2.p > 0) {
                                        eh2.a(y, n4 + n6 - 7, n5 + 7 + 11, 3);
                                        ev.h.a(eh2, dq.a((long)ar2.p), n4 + n6 - 15, n5 + 12, 1);
                                    }
                                } else {
                                    if (ar2.n > 0) {
                                        eh2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        ev.d.a(eh2, dq.a((long)ar2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (ar2.p > 0) {
                                        eh2.a(y, n4 + n6 - 7, n5 + 7, 3);
                                        ev.h.a(eh2, dq.a((long)ar2.p), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                }
                            }
                            if (this.bJ == 2 && this.B <= 3 && !this.equals(main.a.H)) {
                                if (ar2.n > 0 && ar2.p > 0) {
                                    if (ar2.n > 0) {
                                        eh2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        ev2 = co.m().aH < (long)ar2.n ? ev.a : ev.d;
                                        ev2.a(eh2, dq.b((long)ar2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (ar2.p > 0) {
                                        eh2.a(y, n4 + n6 - 7, n5 + 7 + 11, 3);
                                        ev2 = co.m().aJ < ar2.p ? ev.a : ev.h;
                                        ev2.a(eh2, dq.b((long)ar2.p), n4 + n6 - 15, n5 + 12, 1);
                                    }
                                } else {
                                    if (ar2.n > 0) {
                                        eh2.a(w, n4 + n6 - 7, n5 + 7, 3);
                                        ev2 = co.m().aH < (long)ar2.n ? ev.a : ev.d;
                                        ev2.a(eh2, dq.b((long)ar2.n), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    if (ar2.p > 0) {
                                        eh2.a(y, n4 + n6 - 7, n5 + 7, 3);
                                        ev2 = co.m().aJ < ar2.p ? ev.a : ev.h;
                                        ev2.a(eh2, dq.b((long)ar2.p), n4 + n6 - 15, n5 + 1, 1);
                                    }
                                    try {
                                        ev2 = ev.h;
                                        if (!co.m().au.equals(ar2.H)) {
                                            ev2 = ev.h;
                                        }
                                        ev2.a(eh2, ar2.H, n4 + n6, n5 + 1 + ev.a.a(), 1);
                                    }
                                    catch (Exception exception) {}
                                }
                            }
                        }
                        er.b(eh2, ar2.b.f, n8 + 12, n9 + n10 / 2, 0, 3);
                        if (ar2.h > 1) {
                            ev.n.a(eh2, "" + ar2.h, n8 + 24, n9 + n10 - ev.n.a(), 1);
                        }
                        if (ar2.C && main.a.w % 10 > 5) {
                            eh2.a(v, n8 + 12, n5 + 19, 3);
                        }
                    }
                    if (this.bJ == 2 && (this.equals(main.a.H) || this.B == 4) && ar2.v != 0) {
                        if (ar2.v == 1) {
                            ev.r.a(eh2, ch.fP, n4 + n6 - 5, n5 + 1, 1);
                            if (ar2.n != -1) {
                                eh2.a(w, n4 + n6 - 7, n5 + 19, 3);
                                ev.d.a(eh2, dq.b((long)ar2.n), n4 + n6 - 15, n5 + 13, 1);
                            } else if (ar2.p != -1) {
                                eh2.a(z, n4 + n6 - 7, n5 + 17, 3);
                                ev.a.a(eh2, dq.b((long)ar2.p), n4 + n6 - 15, n5 + 11, 1);
                            }
                        } else if (ar2.v == 2) {
                            ev.b.a(eh2, ch.fQ, n4 + n6 - 5, n5 + 1, 1);
                            if (ar2.n != -1) {
                                eh2.a(w, n4 + n6 - 7, n5 + 17, 3);
                                ev.d.a(eh2, dq.b((long)ar2.n), n4 + n6 - 15, n5 + 11, 1);
                            } else if (ar2.p != -1) {
                                eh2.a(z, n4 + n6 - 7, n5 + 17, 3);
                                ev.a.a(eh2, dq.b((long)ar2.p), n4 + n6 - 15, n5 + 11, 1);
                            }
                        }
                    }
                    this.cn = 7;
                }
                ++n3;
            }
            this.cn = 8;
            this.f(eh2);
            this.cn = 9;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            System.out.println("tt >>:" + this.cn);
            return;
        }
    }

    private void d(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int n2 = 0;
        while (n2 < this.cm.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.d(n3, n4, n5, n6);
                ev.f.a(eh2, this.cm[n2], this.ae + this.ag / 2, n4 + 6, 2);
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void e(eh eh2) {
        eh2.a(0xFF0000);
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        ar[] arArray = co.n().aV;
        bt[] btArray = co.n().aW;
        int n2 = 0;
        while (n2 < arArray.length + btArray.length) {
            int n3 = n2 < arArray.length ? 1 : 0;
            int n4 = n2;
            int n5 = n2 - arArray.length;
            int n6 = this.ae + 36;
            int n7 = this.af + n2 * this.aD;
            int n8 = this.ag - 36;
            int n9 = this.aD - 1;
            int n10 = this.ae;
            int n11 = this.af + n2 * this.aD;
            int n12 = this.aD - 1;
            if (n7 - this.g <= this.af + this.ah && n7 - this.g >= this.af - this.aD) {
                int n13;
                ar ar2;
                ar ar3 = ar2 = n3 != 0 ? arArray[n4] : null;
                eh2.a(n2 == this.ak ? 16383818 : (n3 != 0 ? 15196114 : 15723751));
                eh2.b(n6, n7, n8, n9);
                eh2.a(n2 == this.ak ? 9541120 : (n3 != 0 ? 9993045 : 11837316));
                if (ar2 != null) {
                    n8 = 0;
                    while (n8 < ar2.a.length) {
                        if (ar2.a[n8].c.a == 72 && ar2.a[n8].a > 0) {
                            byte by2 = dl.g(ar2.a[n8].a);
                            n9 = by2;
                            n13 = dl.f(by2);
                            if (n13 != -1) {
                                eh2.a(dl.f(n9));
                            }
                        }
                        ++n8;
                    }
                }
                eh2.b(n10, n11, 34, n12);
                if (ar2 != null && ar2.f && main.a.G.A == 12) {
                    eh2.a(n2 == this.ak ? 7040779 : 6047789);
                    eh2.b(n10, n11, 34, n12);
                }
                if (ar2 != null) {
                    String string = "";
                    ev ev2 = ev.m;
                    if (ar2.a != null) {
                        n13 = 0;
                        while (n13 < ar2.a.length) {
                            if (ar2.a[n13].c.a == 72) {
                                string = " [+" + ar2.a[n13].a + "]";
                            }
                            if (ar2.a[n13].c.a == 41) {
                                if (ar2.a[n13].a == 1) {
                                    ev2 = dl.h(0);
                                } else if (ar2.a[n13].a == 2) {
                                    ev2 = dl.h(2);
                                } else if (ar2.a[n13].a == 3) {
                                    ev2 = dl.h(8);
                                } else if (ar2.a[n13].a == 4) {
                                    ev2 = dl.h(7);
                                }
                            }
                            ++n13;
                        }
                    }
                    ev2.a(eh2, String.valueOf(ar2.b.d) + string, n6 + 5, n7 + 1, 0);
                    String string2 = "";
                    if (ar2.a != null) {
                        if (ar2.a.length > 0 && ar2.a[0] != null && ar2.a[0].c.a != 102 && ar2.a[0].c.a != 107) {
                            string2 = String.valueOf(string2) + ar2.a[0].a();
                        }
                        ev ev3 = ev.q;
                        if (ar2.A < 0 && ar2.b.b != 5) {
                            ev3 = ev.p;
                        }
                        if (ar2.a.length > 1) {
                            n5 = 1;
                            while (n5 < 2) {
                                if (ar2.a[n5] != null && ar2.a[n5].c.a != 102 && ar2.a[n5].c.a != 107) {
                                    string2 = String.valueOf(string2) + "," + ar2.a[n5].a();
                                }
                                ++n5;
                            }
                        }
                        ev3.a(eh2, string2, n6 + 5, n7 + 11, 0);
                    }
                    er.b(eh2, ar2.b.f, n10 + 17, n11 + n12 / 2, 0, 3);
                    if (ar2.a != null) {
                        n3 = 0;
                        while (n3 < ar2.a.length) {
                            int cfr_ignored_0 = ar2.a[n3].a;
                            this.a(eh2, ar2.a[n3].c.a, n10, n11, n12);
                            ++n3;
                        }
                        n3 = 0;
                        while (n3 < ar2.a.length) {
                            dl.a(eh2, ar2.a[n3].c.a, ar2.a[n3].a, n10, n11, 34, n12);
                            ++n3;
                        }
                    }
                    if (ar2.h > 1) {
                        ev.n.a(eh2, "" + ar2.h, n10 + 34, n11 + n12 - ev.n.a(), 1);
                    }
                } else if (n3 == 0) {
                    bt bt2 = btArray[n5];
                    eh2.a(cw.aD, n10 + 17, n11 + n12 / 2, 3);
                    if (bt2.a != null) {
                        ev.q.a(eh2, bt2.a.b, n6 + 5, n7 + 1, 0);
                        ev.m.a(eh2, String.valueOf(ch.dr) + ": " + bt2.c, n6 + 5, n7 + 11, 0);
                        er.b(eh2, bt2.a.f, n10 + 17, n11 + n12 / 2, 0, 3);
                    } else {
                        ev.m.a(eh2, bt2.l, n6 + 5, n7 + 5, 0);
                        er.b(eh2, cw.z[98].a[0].c, n10 + 17, n11 + n12 / 2, 0, 3);
                    }
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void f(eh eh2) {
        eh2.a(-eh2.a(), -eh2.b());
        if (this.g > 24 && this.O > 0 || this.equals(main.a.G) && this.bJ == 2 && this.K[this.B] > 1) {
            eh2.a(dh.W, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.af + 3, 0);
        }
        if (this.g < this.aI && this.O > 0 || this.equals(main.a.G) && this.bJ == 2 && this.K[this.B] > 1) {
            eh2.a(dh.W, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.af + this.ah - 8, 0);
        }
    }

    private void g(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int n2 = 0;
        while (n2 < G.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.d(n3, n4, n5, n6);
                ev.f.a(eh2, G[n2], this.ae + this.ag / 2, n4 + 6, 2);
                if (G[n2].equals(ch.bU)) {
                    n5 = 0;
                    while (n5 < at.size()) {
                        cv cv2 = (cv)at.elementAt(n5);
                        if (!cv2.d) {
                            if (main.a.w % 20 <= 10) break;
                            eh2.a(v, n3 + 10, n4 + 10, 3);
                            break;
                        }
                        ++n5;
                    }
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void h(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int n2 = 0;
        while (n2 < cF.length) {
            int n3 = this.af + n2 * 15;
            if (n3 - this.g <= this.af + this.ah && n3 - this.g >= this.af - this.aD) {
                ev.f.a(eh2, cF[n2], this.ae + 5, n3 + 6, 0);
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void i(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int n2 = 0;
        while (n2 < at.size()) {
            cv cv2 = (cv)at.elementAt(n2);
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.d(n3, n4, n5, n6);
                ev.f.a(eh2, cv2.a, this.ae + this.ag / 2, n4 + 6, 2);
                if (!cv2.d && main.a.w % 20 > 10) {
                    eh2.a(v, n3 + 10, n4 + 10, 3);
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void j(eh eh2) {
        eh2.a(0xFF0000);
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int n2 = co.m().aL.b.length;
        int n3 = 0;
        while (n3 < n2 + 6) {
            int n4 = this.ae + 30;
            int n5 = this.af + n3 * this.aD;
            int n6 = this.ag - 30;
            int n7 = this.aD - 1;
            int n8 = this.ae;
            int n9 = this.af + n3 * this.aD;
            if (n5 - this.g <= this.af + this.ah && n5 - this.g >= this.af - this.aD) {
                eh2.a(n3 == this.ak ? 16383818 : 15196114);
                if (n3 == 5) {
                    eh2.a(n3 == this.ak ? 16776068 : 16765060);
                }
                eh2.d(n4, n5, n6, n7);
                eh2.a(cw.aD, n8, n9, 0);
                if (n3 == 0) {
                    er.b(eh2, 567, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(ch.fa) + " " + ch.eo + ": " + o.a((long)co.m().cU);
                    ev.b.a(eh2, string, n4 + 5, n5 + 3, 0);
                    ev.m.a(eh2, String.valueOf(o.a((long)(co.m().cU + 1000))) + " " + ch.fl + ": " + ch.eL + " " + co.m().da, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 1) {
                    er.b(eh2, 569, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(ch.fb) + " " + ch.eo + ": " + o.a((long)co.m().cV);
                    ev.b.a(eh2, string, n4 + 5, n5 + 3, 0);
                    ev.m.a(eh2, String.valueOf(o.a((long)(co.m().cV + 1000))) + " " + ch.fl + ": " + ch.eL + " " + co.m().db, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 2) {
                    er.b(eh2, 568, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(ch.fc) + " " + ch.eo + ": " + o.a((long)co.m().cT);
                    ev.b.a(eh2, string, n4 + 5, n5 + 3, 0);
                    ev.m.a(eh2, String.valueOf(o.a((long)(co.m().cT * 100))) + " " + ch.fl + ": " + ch.eL + " " + co.m().dc, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 3) {
                    er.b(eh2, 721, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(ch.fd) + " " + ch.eo + ": " + o.a((long)co.m().cW);
                    ev.b.a(eh2, string, n4 + 5, n5 + 3, 0);
                    ev.m.a(eh2, String.valueOf(o.a((long)(500000 + co.m().cW * 100000))) + " " + ch.fl + ": " + ch.eL + " " + co.m().dd, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 4) {
                    er.b(eh2, 719, n8 + 4, n9 + 4, 0, 0);
                    String string = String.valueOf(ch.ff) + " " + ch.eo + ": " + co.m().cX + "%";
                    int n10 = co.m().cX;
                    if (n10 > co.length - 1) {
                        n10 = co.length - 1;
                    }
                    long l2 = co[n10];
                    ev.b.a(eh2, string, n4 + 5, n5 + 3, 0);
                    long l3 = l2;
                    ev.m.a(eh2, String.valueOf(dq.b(l3)) + " " + ch.fl + ": " + ch.eL + " " + co.m().de, n4 + 5, n5 + 15, 0);
                }
                if (n3 == 5) {
                    if (p != null) {
                        er.b(eh2, q, n8 + 4, n9 + 4, 0, 0);
                        String[] stringArray = ev.k.a(p, 120);
                        int n11 = 0;
                        while (n11 < stringArray.length) {
                            ev.m.a(eh2, stringArray[n11], n4 + 5, n5 + 3 + n11 * 12, 0);
                            ++n11;
                        }
                    } else {
                        ev.m.a(eh2, "", n4 + 5, n5 + 9, 0);
                    }
                }
                if (n3 >= 6) {
                    n7 = n3 - 6;
                    bx bx2 = co.m().aL.b[n7];
                    er.b(eh2, bx2.f, n8 + 4, n9 + 4, 0, 0);
                    bt bt2 = co.m().a(bx2);
                    if (bt2 != null) {
                        ev.b.a(eh2, bx2.b, n4 + 5, n5 + 3, 0);
                        ev.q.a(eh2, String.valueOf(ch.dr) + ": " + bt2.c, n4 + n6 - 5, n5 + 3, 1);
                        if (bt2.c == bx2.c) {
                            ev.m.a(eh2, ch.fj, n4 + 5, n5 + 15, 0);
                        } else if (bt2.a.c()) {
                            String string;
                            String string2 = String.valueOf(ch.c) + ": ";
                            int n12 = ev.m.a(string2) + n4 + 5;
                            int n13 = n5 + 15;
                            ev.m.a(eh2, string2, n4 + 5, n13, 0);
                            StringBuffer stringBuffer = new StringBuffer("(");
                            bt bt3 = bt2;
                            if (bt3.m / 10 >= 100) {
                                string = "MAX";
                            } else if (bt3.m % 10 == 0) {
                                string = String.valueOf(bt3.m / 10) + "%";
                            } else {
                                n7 = bt3.m % 10;
                                string = String.valueOf(bt3.m / 10) + "." + n7 % 10 + "%";
                            }
                            ev.m.a(eh2, stringBuffer.append(string).append(")").toString(), n4 + n6 - 5, n13, 1);
                            eh2.a(7169134);
                            eh2.d(n12, n13 += 4, 50, 5);
                            n4 = bt2.m * 50 / 1000;
                            eh2.a(11992374);
                            eh2.d(n12, n13, n4, 5);
                            short cfr_ignored_0 = bt2.m;
                        } else {
                            bt bt4 = bx2.h[bt2.c];
                            ev.m.a(eh2, String.valueOf(ch.dr) + " " + (bt2.c + 1) + " " + ch.ep + " " + dq.b(bt4.d) + " " + ch.fl, n4 + 5, n5 + 15, 0);
                        }
                    } else {
                        bt bt5 = bx2.h[0];
                        String string = String.valueOf(ch.eq) + " " + dq.b(bt5.d) + " " + ch.eI;
                        if (bt5.a.a == 24 || bt5.a.a == 25 || bt5.a.a == 26) {
                            string = String.valueOf(ch.eq) + " " + dq.b(bt5.d) + " " + ch.gr;
                        }
                        ev.h.a(eh2, bx2.b, n4 + 5, n5 + 3, 0);
                        ev.m.a(eh2, string, n4 + 5, n5 + 15, 0);
                    }
                }
            }
            ++n3;
        }
        this.f(eh2);
    }

    private void k(eh eh2) {
        eh2.a(0xFF0000);
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int n2 = 0;
        while (n2 < this.E.length) {
            int n3 = this.af + n2 * this.aD;
            int n4 = this.aD - 1;
            if (n3 - this.g <= this.af + this.ah && n3 - this.g >= this.af - this.aD) {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.d(this.ae, n3, this.ag, n4);
                ev.b.a(eh2, this.E[n2], 5, n3 + 1, 0);
                ev.o.a(eh2, this.F[n2], 5, n3 + 11, 0);
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void l(eh eh2) {
        eh2.a(0xFF0000);
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        String[] stringArray = w.b;
        String[] stringArray2 = w.c;
        int n2 = 0;
        while (n2 < stringArray2.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.b(n3, n4, n5, n6);
                ev.o.a(eh2, String.valueOf(stringArray[n2]), n7 + 5, n4 + 6, 0);
                ev.o.a(eh2, stringArray2[n2], n3 + n5 - 2, n4 + 6, 1);
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void m(eh eh2) {
        eh2.a(0xFF0000);
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int[] nArray = cw.l().U;
        int[] nArray2 = cw.l().V;
        int n2 = 0;
        while (n2 < nArray2.length) {
            int n3 = this.ae + 36;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 36;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.b(n3, n4, n5, n6);
                eh2.a(this.cp[nArray2[n2]]);
                eh2.b(n7, n8, 34, n9);
                if (nArray[n2] != -1) {
                    if (nArray2[n2] != 1) {
                        ev.n.a(eh2, String.valueOf(nArray[n2]), n7 + 17, n4 + 6, 2);
                    } else {
                        ev.o.a(eh2, String.valueOf(nArray[n2]), n7 + 17, n4 + 6, 2);
                    }
                    ev.m.a(eh2, String.valueOf(cw.l().W[n2]) + "/" + cw.l().X[n2], n3 + 5, n4 + 6, 0);
                }
                if (cw.l().aa[n2] != null) {
                    ev.o.a(eh2, String.valueOf(cw.l().aa[n2]) + "(Top " + cw.l().Y[n2] + ")", n3 + n5 - 2, n4 + 1, 1);
                    ev.o.a(eh2, String.valueOf(cw.l().ab[n2]) + "(Top " + cw.l().Z[n2] + ")", n3 + n5 - 2, n4 + 11, 1);
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void n(eh eh2) {
        int n2;
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        eh2.a(0);
        if (this.O == 0) {
            return;
        }
        int n3 = (this.g + this.ah) / 24 + 1;
        if (n3 < this.ah / 24 + 1) {
            n3 = this.ah / 24 + 1;
        }
        if (n3 > this.O) {
            n3 = this.O;
        }
        if ((n2 = this.g / 24) >= n3) {
            n2 = n3 - 1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        while (n2 < n3) {
            int n4 = this.ae;
            int n5 = this.af + n2 * this.aD;
            int n6 = this.aD - 1;
            int n7 = this.ae + 24;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.ag - 24;
            int n10 = this.aD - 1;
            eh2.a(n2 == this.ak ? 16383818 : 15196114);
            eh2.b(n7, n8, n9, n10);
            eh2.a(n2 == this.ak ? 9541120 : 9993045);
            eh2.b(n4, n5, 24, n6);
            er.b(eh2, co.m().aZ[this.B][n2], n4 + 12, n5 + n6 / 2, 0, 3);
            String[] stringArray = ev.o.a(co.m().aY[this.B][n2], 140);
            n5 = 0;
            while (n5 < stringArray.length) {
                ev.o.a(eh2, stringArray[n5], n7 + 5, n8 + 1 + n5 * 11, 0);
                ++n5;
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void o(eh eh2) {
        eh2.a(0xFF0000);
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        try {
            ar[] arArray = co.m().aU;
            this.O = this.i(arArray.length);
            int n2 = arArray.length / 20 + (arArray.length % 20 > 0 ? 1 : 0);
            this.aF = this.ag / n2;
            int n3 = 0;
            while (n3 < this.O) {
                int n4 = this.ae + 36;
                int n5 = this.af + n3 * this.aD;
                int n6 = this.ag - 36;
                int n7 = this.aD - 1;
                int n8 = this.ae;
                int n9 = this.af + n3 * this.aD;
                int n10 = this.aD - 1;
                if (n5 - this.g <= this.af + this.ah && n5 - this.g >= this.af - this.aD) {
                    if (n3 == 0) {
                        n6 = 0;
                        while (n6 < n2) {
                            n7 = n6 == this.bO && this.ak == 0 ? (main.a.w % 10 < 7 ? -1 : 0) : 0;
                            eh2.a(n6 == this.bO ? 16383818 : 15723751);
                            eh2.d(this.ae + n6 * this.aF, n5 + 9 + n7, this.aF - 1, 14);
                            ev.o.a(eh2, "" + n6, this.ae + n6 * this.aF + this.aF / 2, this.af + 11 + n7, 2);
                            ++n6;
                        }
                    } else {
                        int n11;
                        eh2.a(n3 == this.ak ? 16383818 : 15196114);
                        eh2.d(n4, n5, n6, n7);
                        eh2.a(n3 == this.ak ? 9541120 : 9993045);
                        n6 = dl.c(n3, this.bO);
                        ar ar2 = arArray[n6];
                        if (ar2 != null) {
                            n6 = 0;
                            while (n6 < ar2.a.length) {
                                byte by2;
                                if (ar2.a[n6].c.a == 72 && ar2.a[n6].a > 0 && (n11 = dl.f(by2 = dl.g(ar2.a[n6].a))) != -1) {
                                    eh2.a(dl.f(by2));
                                }
                                ++n6;
                            }
                        }
                        eh2.b(n8, n9, 34, n10);
                        if (ar2 != null) {
                            Object object = "";
                            ev ev2 = ev.m;
                            if (ar2.a != null) {
                                n11 = 0;
                                while (n11 < ar2.a.length) {
                                    if (ar2.a[n11].c.a == 72) {
                                        object = " [+" + ar2.a[n11].a() + "]";
                                    }
                                    if (ar2.a[n11].c.a == 41) {
                                        if (ar2.a[n11].a == 1) {
                                            ev2 = dl.h(0);
                                        } else if (ar2.a[n11].a == 2) {
                                            ev2 = dl.h(2);
                                        } else if (ar2.a[n11].a == 3) {
                                            ev2 = dl.h(8);
                                        } else if (ar2.a[n11].a == 4) {
                                            ev2 = dl.h(7);
                                        }
                                    }
                                    ++n11;
                                }
                            }
                            ev2.a(eh2, String.valueOf(ar2.b.d) + (String)object, n4 + 5, n5 + 1, 0);
                            String string = "";
                            if (ar2.a != null) {
                                if (ar2.a.length > 0 && ar2.a[0] != null) {
                                    string = String.valueOf(string) + ar2.a[0].a();
                                }
                                object = ev.q;
                                if (ar2.A < 0 && ar2.b.b != 5) {
                                    object = ev.p;
                                }
                                if (ar2.a.length > 1) {
                                    int n12 = 1;
                                    while (n12 < ar2.a.length) {
                                        if (ar2.a[n12] != null && ar2.a[n12].c.a != 102 && ar2.a[n12].c.a != 107) {
                                            string = String.valueOf(string) + "," + ar2.a[n12].a();
                                        }
                                        ++n12;
                                    }
                                }
                                ((ev)object).a(eh2, string, n4 + 5, n5 + 11, 0);
                            }
                            er.b(eh2, ar2.b.f, n8 + 17, n9 + n10 / 2, 0, 3);
                            if (ar2.a != null) {
                                int n13 = 0;
                                while (n13 < ar2.a.length) {
                                    int cfr_ignored_0 = ar2.a[n13].a;
                                    this.a(eh2, ar2.a[n13].c.a, n8, n9, n10);
                                    ++n13;
                                }
                                n13 = 0;
                                while (n13 < ar2.a.length) {
                                    dl.a(eh2, ar2.a[n13].c.a, ar2.a[n13].a, n8, n9, 34, n10);
                                    ++n13;
                                }
                            }
                            if (ar2.h > 1) {
                                ev.n.a(eh2, "" + ar2.h, n8 + 34, n9 + n10 - ev.n.a(), 1);
                            }
                        }
                    }
                }
                ++n3;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.f(eh2);
    }

    private e W() {
        if (this.ak < 2) {
            return null;
        }
        if (this.ak > (this.Q != null ? this.Q.size() : this.R.size()) + 1) {
            return null;
        }
        if (this.Q != null) {
            return (e)this.Q.elementAt(this.ak - 2);
        }
        return (e)this.R.elementAt(this.ak - 2);
    }

    private c X() {
        if (this.ak < 2) {
            return null;
        }
        if (this.ak > c.l.size() + 1) {
            return null;
        }
        return (c)c.l.elementAt(this.ak - 2);
    }

    private a Y() {
        if (this.ak < 2) {
            return null;
        }
        if (this.ak > this.P.length + 1) {
            return null;
        }
        return this.P[this.ak - 2];
    }

    private void p(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        eh2.a(0);
        if (this.bG.size() == 0) {
            ev.m.a(eh2, ch.ah, this.ae + this.ag / 2, this.af + this.ah / 2 - ev.k.a() / 2 + 24, 2);
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.af + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            if (n2 == 0) {
                eh2.a(15196114);
                eh2.b(n3, n7, this.ag, n9);
                eh2.a(n2 == this.ak ? cw.aI : cw.aH, this.ae + this.ag - 5, n7 + 2, dv.b);
                (n2 == this.ak ? ev.g : ev.f).a(eh2, this.au ? ch.fz : ch.fA, this.ae + this.ag - 22, n7 + 7, 2);
                ev.o.a(eh2, this.au ? ch.fC : ch.fD, this.ae + 5, n7 + n9 / 2 - 4, 0);
            } else {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.b(n6, n7, n8, n9);
                eh2.a(n2 == this.ak ? 9541120 : 9993045);
                eh2.b(n3, n4, 24, n5);
                db db2 = (db)this.bG.elementAt(n2 - 1);
                if (db2.c.co != -1) {
                    er.b(eh2, db2.c.co, n3, n4, 0, 0);
                } else {
                    bk bk2 = cw.y[db2.c.cp];
                    er.b(eh2, bk2.a[co.bT[0][0][0]].a, n3 + bk2.a[co.bT[0][0][0]].b, n4 + bk2.a[co.bT[0][0][0]].c, 0, 0);
                }
                eh2.e(this.ae, this.af + this.g, this.ag, this.ah);
                ev ev2 = ev.g;
                ev2.a(eh2, db2.c.au, n6 + 5, n7, 0);
                if (!db2.d) {
                    ev.q.a(eh2, dq.a(db2.a, "|", 0)[2], n6 + 5, n7 + 11, 0);
                } else {
                    ev.p.a(eh2, dq.a(db2.a, "|", 0)[2], n6 + 5, n7 + 11, 0);
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void q(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        eh2.a(0);
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae + 26;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 26;
            int n6 = this.aD - 1;
            int n7 = this.ae;
            int n8 = this.af + n2 * this.aD;
            int n9 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.b(n3, n4, n5, n6);
                eh2.a(n2 == this.ak ? 9541120 : 9993045);
                eh2.b(n7, n8, 24, n9);
                ar ar2 = (ar)this.Y.elementAt(n2);
                if (ar2 != null) {
                    ev.m.a(eh2, ar2.b.d, n3 + 5, n4 + 1, 0);
                    String string = "";
                    if (ar2.a != null && ar2.a.length > 0) {
                        if (ar2.a[0] != null && ar2.a[0].c.a != 102 && ar2.a[0].c.a != 107) {
                            string = String.valueOf(string) + ar2.a[0].a();
                        }
                        ev ev2 = ev.q;
                        ev2.a(eh2, string, n3 + 5, n4 + 11, 0);
                        er.b(eh2, ar2.b.f, n7 + 12, n8 + n9 / 2, 0, 3);
                    }
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void r(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        eh2.a(0);
        if (this.O == 0) {
            ev.m.a(eh2, ch.fH, this.ae + this.ag / 2, this.af + this.ah / 2 - ev.k.a() / 2, 2);
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.af + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            eh2.a(n2 == this.ak ? 16383818 : 15196114);
            eh2.b(n6, n7, n8, n9);
            eh2.a(n2 == this.ak ? 9541120 : 9993045);
            eh2.b(n3, n4, 24, n5);
            db db2 = (db)this.X.elementAt(n2);
            if (db2.c.co != -1) {
                er.b(eh2, db2.c.co, n3, n4, 0, 0);
            } else {
                bk bk2 = cw.y[db2.c.cp];
                er.b(eh2, bk2.a[co.bT[0][0][0]].a, n3 + bk2.a[co.bT[0][0][0]].b, n4 + 3 + bk2.a[co.bT[0][0][0]].c, 0, 0);
            }
            eh2.e(this.ae, this.af + this.g, this.ag, this.ah);
            if (db2.e) {
                ev.h.a(eh2, db2.c.au, n6 + 5, n7, 0);
                ev.q.a(eh2, db2.a, n6 + 5, n7 + 11, 0);
            } else {
                ev.o.a(eh2, db2.c.au, n6 + 5, n7, 0);
                ev.o.a(eh2, db2.a, n6 + 5, n7 + 11, 0);
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void s(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        eh2.a(0);
        if (this.O == 0) {
            ev.m.a(eh2, ch.bR, this.ae + this.ag / 2, this.af + this.ah / 2 - ev.k.a() / 2, 2);
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.aD - 1;
            int n6 = this.ae + 24;
            int n7 = this.af + n2 * this.aD;
            int n8 = this.ag - 24;
            int n9 = this.aD - 1;
            eh2.a(n2 == this.ak ? 16383818 : 15196114);
            eh2.b(n6, n7, n8, n9);
            eh2.a(n2 == this.ak ? 9541120 : 9993045);
            eh2.b(n3, n4, 24, n5);
            db db2 = (db)this.T.elementAt(n2);
            if (db2.c.co != -1) {
                er.b(eh2, db2.c.co, n3, n4, 0, 0);
            } else {
                bk bk2 = cw.y[db2.c.cp];
                er.b(eh2, bk2.a[co.bT[0][0][0]].a, n3 + bk2.a[co.bT[0][0][0]].b, n4 + 3 + bk2.a[co.bT[0][0][0]].c, 0, 0);
            }
            eh2.e(this.ae, this.af + this.g, this.ag, this.ah);
            if (db2.e) {
                ev.h.a(eh2, db2.c.au, n6 + 5, n7, 0);
                ev.q.a(eh2, db2.a, n6 + 5, n7 + 11, 0);
            } else {
                ev.o.a(eh2, db2.c.au, n6 + 5, n7, 0);
                ev.o.a(eh2, db2.a, n6 + 5, n7 + 11, 0);
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void t(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int n2 = 0;
        while (n2 < this.S.size()) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                ae ae2 = (ae)this.S.elementAt(n2);
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.b(n3, n4, n5, n6);
                if (ae2.p.equals("")) {
                    ev.f.a(eh2, ae2.b, this.ae + this.ag / 2, n4 + 6, 2);
                } else {
                    ev.f.a(eh2, ae2.b, this.ae + this.ag / 2, n4 + 1, 2);
                    ev.f.a(eh2, ae2.p, this.ae + this.ag / 2, n4 + 11, 2);
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void u(eh eh2) {
        try {
            int n2;
            eh2.e(this.ae, this.af, this.ag, this.ah);
            eh2.a(-this.h, -this.g);
            eh2.a(0);
            int n3 = this.ae + this.ag / 2 - this.cg.length * this.aE / 2;
            if (this.O == 2) {
                ev.m.a(eh2, this.ao, this.ae + this.ag / 2, this.af + 24 + this.ah / 2 - ev.k.a() / 2, 2);
                if (this.am && this.R.size() == 1) {
                    n2 = 0;
                    while (n2 < ch.dv.length) {
                        ev.f.a(eh2, ch.dv[n2], this.ae + this.ag / 2, this.af + 24 + this.ah / 2 - ch.dv.length * 12 / 2 + n2 * 12, 2);
                        ++n2;
                    }
                }
            }
            if (this.am) {
                this.O = c.l.size() + 2;
            }
            n2 = 0;
            while (n2 < this.O) {
                int n4 = this.ae;
                int n5 = this.af + n2 * this.aD;
                int n6 = this.aD - 1;
                int n7 = this.ae + 24;
                int n8 = this.af + n2 * this.aD;
                int n9 = this.ag - 24;
                int n10 = this.aD - 1;
                if (n8 - this.g <= this.af + this.ah && n8 - this.g >= this.af - this.aD) {
                    if (n2 == 0) {
                        n6 = 0;
                        while (n6 < this.cg.length) {
                            eh2.a(n6 == this.bN && n2 == this.ak ? 16383818 : 15723751);
                            eh2.b(n3 + n6 * this.aE, n8, this.aE - 1, 23);
                            int n11 = 0;
                            while (n11 < this.cg[n6].length) {
                                ev.o.a(eh2, this.cg[n6][n11], n3 + n6 * this.aE + this.aE / 2, this.af + n11 * 11, 2);
                                ++n11;
                            }
                            ++n6;
                        }
                    } else if (n2 == 1) {
                        eh2.a(n2 == this.ak ? 16383818 : 15196114);
                        eh2.b(this.ae, n8, this.ag, n10);
                        if (this.ch != null) {
                            ev.f.a(eh2, this.ch, this.ae + this.ag / 2, n8 + 6, 2);
                        }
                    } else if (this.al) {
                        if (this.P != null && this.P.length != 0) {
                            eh2.a(n2 == this.ak ? 16383818 : 15196114);
                            eh2.b(n7, n8, n9, n10);
                            eh2.a(n2 == this.ak ? 9541120 : 9993045);
                            eh2.b(n4, n5, 24, n6);
                            if (b.a(this.P[n2 - 2].b)) {
                                if (b.a((short)((short)this.P[n2 - 2].b)).c != null) {
                                    er.a(eh2, b.a((short)((short)this.P[n2 - 2].b)).c[0], n4 + 12, n5 + n6 / 2, 0, dv.f);
                                }
                            } else {
                                b b2 = new b();
                                new b().a = this.P[n2 - 2].b;
                                if (!b.a(b2.a)) {
                                    b.a(b2);
                                }
                            }
                            String string = this.P[n2 - 2].c.length() > 17 ? String.valueOf(this.P[n2 - 2].c.substring(0, 17)) + "..." : this.P[n2 - 2].c;
                            ev.g.a(eh2, string, n7 + 5, n8, 0);
                            ev.q.a(eh2, this.P[n2 - 2].d, n7 + 5, n8 + 11, 0);
                            ev.m.a(eh2, String.valueOf(this.P[n2 - 2].g) + "/" + this.P[n2 - 2].h, n7 + n9 - 5, n8, 1);
                        }
                    } else if (this.an) {
                        e e2;
                        eh2.a(n2 == this.ak ? 16383818 : 15196114);
                        eh2.b(n7, n8, n9, n10);
                        eh2.a(n2 == this.ak ? 9541120 : 9993045);
                        eh2.b(n4, n5, 24, n6);
                        if ((e2 = this.Q != null ? (e)this.Q.elementAt((int)(n2 - 2)) : (e)this.R.elementAt((int)(n2 - 2))).c != -1) {
                            er.b(eh2, e2.c, n4, n5, 0, 0);
                        } else {
                            bk bk2 = cw.y[e2.b];
                            er.b(eh2, bk2.a[co.bT[0][0][0]].a, n4 + bk2.a[co.bT[0][0][0]].b, n5 + 3 + bk2.a[co.bT[0][0][0]].c, 0, 0);
                        }
                        eh2.e(this.ae, this.af + this.g, this.ag, this.ah);
                        ev ev2 = ev.f;
                        if (e2.g == 0) {
                            ev2 = ev.a;
                        } else if (e2.g == 1) {
                            ev2 = ev.h;
                        } else if (e2.g == 2) {
                            ev2 = ev.g;
                        }
                        ev2.a(eh2, e2.f, n7 + 5, n8, 0);
                        ev.q.a(eh2, String.valueOf(ch.dd) + ": " + e2.h, n7 + 5, n8 + 11, 0);
                        er.b(eh2, 7223, n7 + n9 - 7, n8 + 12, 0, 3);
                        ev.m.a(eh2, "" + e2.l, n7 + n9 - 15, n8 + 6, 1);
                    } else if (this.am && c.l.size() != 0) {
                        c c2 = (c)c.l.elementAt(n2 - 2);
                        eh2.a(n2 == this.ak && c2.k == null ? 16383818 : 15196114);
                        eh2.b(n4, n5, n9 + 24, n10);
                        c2.a(eh2, n4, n5);
                        if (c2.k != null) {
                            int n12 = this.ae + this.ag - 2 - c2.k.length * 40;
                            n4 = 0;
                            while (n4 < c2.k.length) {
                                if (n4 == this.bN && n2 == this.ak) {
                                    eh2.a(cw.aI, n12 + n4 * 40 + 20, n8 + n10 / 2, dv.f);
                                    ev.g.a(eh2, c2.k[n4], n12 + n4 * 40 + 20, n8 + 6, 2);
                                } else {
                                    eh2.a(cw.aH, n12 + n4 * 40 + 20, n8 + n10 / 2, dv.f);
                                    ev.f.a(eh2, c2.k[n4], n12 + n4 * 40 + 20, n8 + 6, 2);
                                }
                                ++n4;
                            }
                        }
                    }
                }
                ++n2;
            }
            this.f(eh2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private void v(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        eh2.a(0);
        if (this.O == 0) {
            ev.m.a(eh2, ch.fu, this.ae + this.ag / 2, this.af + this.ah / 2 - ev.k.a() / 2, 2);
            return;
        }
        if (co.m().aS == null) {
            return;
        }
        if (co.m().aS.length != this.O) {
            return;
        }
        int n2 = 0;
        while (n2 < this.O) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag;
            int n6 = this.aD - 1;
            ab ab2 = co.m().aS[n2];
            eh2.a(n2 == this.ak && (!ab2.e && !ab2.d || ab2.e && ab2.d) ? 16383818 : 15196114);
            eh2.b(n3, n4, n5, n6);
            if (ab2 != null) {
                if (!ab2.d) {
                    ev.k.a(eh2, ab2.a, n3 + 5, n4, 0);
                    ev.r.a(eh2, String.valueOf(ab2.c) + " " + ch.bH, n3 + n5 - 5, n4, 1);
                    ev.p.a(eh2, ab2.b, n3 + 5, n4 + 11, 0);
                } else if (ab2.d && !ab2.e) {
                    ev.k.a(eh2, ab2.a, n3 + 5, n4, 0);
                    ev.q.a(eh2, String.valueOf(ch.fv) + ab2.c + " " + ch.bH, n3 + 5, n4 + 11, 0);
                    if (n2 == this.ak) {
                        ev.g.a(eh2, ch.cr, n3 + n5 - 20, n4 + 6, 2);
                        ev.f.a(eh2, ch.cr, n3 + n5 - 20, n4 + 6, 2);
                    } else {
                        eh2.a(cw.aH, n3 + n5 - 20, n4 + n6 / 2, dv.f);
                        ev.f.a(eh2, ch.cr, n3 + n5 - 20, n4 + 6, 2);
                    }
                } else if (ab2.d && ab2.e) {
                    ev.r.a(eh2, ab2.a, n3 + 5, n4, 0);
                    ev.r.a(eh2, ab2.b, n3 + 5, n4 + 11, 0);
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void w(eh eh2) {
        eh2.a(0xFF0000);
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        if (this.k.size() == 0) {
            if (this.ap != null) {
                int n2 = 0;
                while (n2 < this.ap.length) {
                    ev.f.a(eh2, this.ap[n2], this.ae + this.ag / 2, this.af + this.ah / 2 - this.ap.length * 14 / 2 + n2 * 14 + 5, 2);
                    ++n2;
                }
            }
            return;
        }
        int n3 = 0;
        while (n3 < this.k.size() + 1) {
            int n4 = this.ae + 36;
            int n5 = this.af + n3 * this.aD;
            int n6 = this.ag - 36;
            int n7 = this.aD - 1;
            int n8 = this.ae;
            int n9 = this.af + n3 * this.aD;
            int n10 = this.aD - 1;
            if (n5 - this.g <= this.af + this.ah && n5 - this.g >= this.af - this.aD) {
                if (n3 == this.k.size()) {
                    if (this.k.size() > 0) {
                        if (!main.a.e && n3 == this.ak) {
                            eh2.a(16383818);
                            eh2.b(n8, n5, this.ag, n7 + 2);
                        }
                        if (n3 == this.ak && this.cc == 1 || !main.a.e && n3 == this.ak) {
                            eh2.a(cw.aG, this.ae + this.ag / 2, n5 + n7 / 2 + 1, dv.f);
                            ev.g.a(eh2, ch.cB, this.ae + this.ag / 2, n5 + n7 / 2 - 4, 2);
                        } else {
                            eh2.a(cw.aF, this.ae + this.ag / 2, n5 + n7 / 2 + 1, dv.f);
                            ev.f.a(eh2, ch.cB, this.ae + this.ag / 2, n5 + n7 / 2 - 4, 2);
                        }
                    }
                } else {
                    int n11;
                    eh2.a(n3 == this.ak ? 16383818 : 15196114);
                    eh2.b(n4, n5, n6, n7);
                    eh2.a(n3 == this.ak ? 9541120 : 9993045);
                    ar ar2 = (ar)this.k.elementAt(n3);
                    if (ar2 != null) {
                        n7 = 0;
                        while (n7 < ar2.a.length) {
                            byte by2;
                            if (ar2.a[n7].c.a == 72 && ar2.a[n7].a > 0 && (n11 = dl.f(by2 = dl.g(ar2.a[n7].a))) != -1) {
                                eh2.a(dl.f(by2));
                            }
                            ++n7;
                        }
                    }
                    eh2.b(n8, n9, 34, n10);
                    if (ar2 != null) {
                        Object object = "";
                        ev ev2 = ev.m;
                        if (ar2.a != null) {
                            n11 = 0;
                            while (n11 < ar2.a.length) {
                                if (ar2.a[n11].c.a == 72) {
                                    object = " [+" + ar2.a[n11].a + "]";
                                }
                                if (ar2.a[n11].c.a == 41) {
                                    if (ar2.a[n11].a == 1) {
                                        ev2 = dl.h(0);
                                    } else if (ar2.a[n11].a == 2) {
                                        ev2 = dl.h(2);
                                    } else if (ar2.a[n11].a == 3) {
                                        ev2 = dl.h(8);
                                    } else if (ar2.a[n11].a == 4) {
                                        ev2 = dl.h(7);
                                    }
                                }
                                ++n11;
                            }
                        }
                        ev2.a(eh2, String.valueOf(ar2.b.d) + (String)object, n4 + 5, n5 + 1, 0);
                        String string = "";
                        if (ar2.a != null) {
                            if (ar2.a.length > 0 && ar2.a[0] != null && ar2.a[0].c.a != 102 && ar2.a[0].c.a != 107) {
                                string = String.valueOf(string) + ar2.a[0].a();
                            }
                            object = ev.q;
                            if (ar2.A < 0 && ar2.b.b != 5) {
                                object = ev.p;
                            }
                            if (ar2.a.length > 1) {
                                int n12 = 1;
                                while (n12 < ar2.a.length) {
                                    if (ar2.a[n12] != null && ar2.a[n12].c.a != 102 && ar2.a[n12].c.a != 107) {
                                        string = String.valueOf(string) + "," + ar2.a[n12].a();
                                    }
                                    ++n12;
                                }
                            }
                            ((ev)object).a(eh2, string, n4 + 5, n5 + 11, 0);
                        }
                        er.b(eh2, ar2.b.f, n8 + 17, n9 + n10 / 2, 0, 3);
                        if (ar2.a != null) {
                            int n13 = 0;
                            while (n13 < ar2.a.length) {
                                int cfr_ignored_0 = ar2.a[n13].a;
                                this.a(eh2, ar2.a[n13].c.a, n8, n9, n10);
                                ++n13;
                            }
                            n13 = 0;
                            while (n13 < ar2.a.length) {
                                dl.a(eh2, ar2.a[n13].c.a, ar2.a[n13].a, n8, n9, 34, n10);
                                ++n13;
                            }
                        }
                        if (ar2.h > 1) {
                            ev.n.a(eh2, "" + ar2.h, n8 + 34, n9 + n10 - ev.n.a(), 1);
                        }
                    }
                }
            }
            ++n3;
        }
        this.f(eh2);
    }

    private void x(eh eh2) {
        int n2;
        int n3;
        eh2.a(0xFF0000);
        ar[] arArray = co.m().aV;
        ar[] arArray2 = co.m().aT;
        this.O = this.i(arArray.length + arArray2.length);
        int n4 = (arArray.length + arArray2.length) / 20 + ((arArray.length + arArray2.length) % 20 > 0 ? 1 : 0);
        this.aF = this.ag / n4;
        int n5 = 0;
        while (n5 < n4) {
            n3 = n5 == this.bO && this.ak == 0 ? (main.a.w % 10 < 7 ? -1 : 0) : 0;
            eh2.a(n5 == this.bO ? 16383818 : 15723751);
            eh2.d(this.ae + n5 * this.aF, n3 + 89 - 10, this.aF - 1, 21);
            if (n5 == this.bO) {
                eh2.a(13524492);
                n2 = this.ae + n5 * this.aF;
                int n6 = n3 + 89 - 10 + 21;
                eh2.d(n2, n6 - 3, this.aF - 1, 3);
            }
            ev.o.a(eh2, "" + (n5 + 1), this.ae + n5 * this.aF + this.aF / 2, n3 + 91 - 10, 2);
            ++n5;
        }
        eh2.e(this.ae, this.af + 21, this.ag, this.ah - 21);
        eh2.a(0, -this.g);
        try {
            n5 = 1;
            while (n5 < this.O) {
                n3 = this.ae + 36;
                n2 = this.af + n5 * this.aD;
                int n7 = this.ag - 36;
                int n8 = this.aD - 1;
                int n9 = this.ae;
                int n10 = this.af + n5 * this.aD;
                int n11 = this.aD - 1;
                if (n2 - this.g <= this.af + this.ah && n2 - this.g >= this.af - this.aD) {
                    byte by2 = dl.a(n5, this.bO, co.m().aV);
                    int n12 = dl.c(n5, this.bO);
                    int n13 = dl.b(n5, this.bO, co.m().aV);
                    eh2.a(n5 == this.ak ? 16383818 : (by2 != 0 ? 15196114 : 15723751));
                    eh2.b(n3, n2, n7, n8);
                    eh2.a(n5 == this.ak ? 9541120 : (by2 != 0 ? 9993045 : 11837316));
                    ar ar2 = by2 != 0 ? arArray[n12] : arArray2[n13];
                    if (ar2 != null) {
                        n7 = 0;
                        while (n7 < ar2.a.length) {
                            if (ar2.a[n7].c.a == 72 && ar2.a[n7].a > 0 && (n12 = dl.f(by2 = dl.g(ar2.a[n7].a))) != -1) {
                                eh2.a(dl.f(by2));
                            }
                            ++n7;
                        }
                    }
                    eh2.b(n9, n10, 34, n11);
                    if (ar2 != null && ar2.f && main.a.G.A == 12) {
                        eh2.a(n5 == this.ak ? 7040779 : 6047789);
                        eh2.b(n9, n10, 34, n11);
                    }
                    if (ar2 != null) {
                        Object object = "";
                        ev ev2 = ev.m;
                        if (ar2.a != null) {
                            n12 = 0;
                            while (n12 < ar2.a.length) {
                                if (ar2.a[n12].c.a == 72) {
                                    object = " [+" + ar2.a[n12].a + "]";
                                }
                                if (ar2.a[n12].c.a == 41) {
                                    if (ar2.a[n12].a == 1) {
                                        ev2 = dl.h(0);
                                    } else if (ar2.a[n12].a == 2) {
                                        ev2 = dl.h(2);
                                    } else if (ar2.a[n12].a == 3) {
                                        ev2 = dl.h(8);
                                    } else if (ar2.a[n12].a == 4) {
                                        ev2 = dl.h(7);
                                    }
                                }
                                ++n12;
                            }
                        }
                        ev2.a(eh2, String.valueOf(ar2.b.d) + (String)object, n3 + 5, n2 + 1, 0);
                        String string = "";
                        if (ar2.a != null) {
                            if (ar2.a.length > 0 && ar2.a[0] != null && ar2.a[0].c.a != 102 && ar2.a[0].c.a != 107) {
                                string = String.valueOf(string) + ar2.a[0].a();
                            }
                            object = ev.q;
                            if (ar2.A < 0 && ar2.b.b != 5) {
                                object = ev.p;
                            }
                            if (ar2.a.length > 1) {
                                int n14 = 1;
                                while (n14 < 2) {
                                    if (ar2.a[n14] != null && ar2.a[n14].c.a != 102 && ar2.a[n14].c.a != 107) {
                                        string = String.valueOf(string) + "," + ar2.a[n14].a();
                                    }
                                    ++n14;
                                }
                            }
                            ((ev)object).a(eh2, string, n3 + 5, n2 + 11, 0);
                        }
                        er.b(eh2, ar2.b.f, n9 + 17, n10 + n11 / 2, 0, 3);
                        if (ar2.a != null) {
                            int n15 = 0;
                            while (n15 < ar2.a.length) {
                                int cfr_ignored_0 = ar2.a[n15].a;
                                this.a(eh2, ar2.a[n15].c.a, n9, n10, n11);
                                ++n15;
                            }
                            n15 = 0;
                            while (n15 < ar2.a.length) {
                                dl.a(eh2, ar2.a[n15].c.a, ar2.a[n15].a, n9, n10, 34, n11);
                                ++n15;
                            }
                        }
                        if (ar2.h > 1) {
                            ev.n.a(eh2, "" + ar2.h, n9 + 34, n10 + n11 - ev.n.a(), 1);
                        }
                    }
                }
                ++n5;
            }
        }
        catch (Exception exception) {}
        this.f(eh2);
    }

    private void y(eh eh2) {
        if (this.A == 23 || this.A == 24) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.bU, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 20) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.ar, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 22) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.o, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 19) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.bW, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 18) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.bT, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 13 && this.equals(main.a.H)) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.cq, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 12 && main.a.H != null) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.cB, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 11) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.bP, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 16) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.bQ, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 15) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, this.n, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 2 && main.a.H != null) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.cg, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 9) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.fw, this.ae + this.ag / 2, 59, 2);
            return;
        }
        if (this.A == 3) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.aI, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 26) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.E, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 14) {
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            ev.f.a(eh2, ch.fB, this.C + this.aE / 2, 59, 2);
            return;
        }
        if (this.A == 4) {
            ev.f.a(eh2, ch.cp, this.C + this.aE / 2, 59, 2);
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 7) {
            ev.f.a(eh2, ch.fx, this.C + this.aE / 2, 59, 2);
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 17) {
            ev.f.a(eh2, ch.fI, this.C + this.aE / 2, 59, 2);
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 8) {
            ev.f.a(eh2, ch.af, this.C + this.aE / 2, 59, 2);
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.A == 10) {
            ev.f.a(eh2, ch.fy, this.C + this.aE / 2, 59, 2);
            eh2.a(13524492);
            eh2.d(this.b + 1, 78, this.d - 2, 1);
            return;
        }
        if (this.B == 3 && this.D.length != 4) {
            eh2.a(-this.h, 0);
        }
        int n2 = 0;
        while (n2 < this.aY.length) {
            ev ev2;
            eh2.a(n2 == this.B ? 6805896 : 0xFFF0B0);
            bo.a(eh2, this.C + n2 * this.aE, 52, this.aE - 1, 25, n2 == this.B ? 1 : 0, true);
            if (n2 == this.cf) {
                eh2.a(as.f, this.C + n2 * this.aE + this.aE / 2, 62, 3);
            }
            ev ev3 = ev2 = n2 == this.B ? ev.m : ev.o;
            if (!this.aY[n2][1].equals("")) {
                ev2.a(eh2, this.aY[n2][0], this.C + n2 * this.aE + this.aE / 2, 53, 2);
                ev2.a(eh2, this.aY[n2][1], this.C + n2 * this.aE + this.aE / 2, 64, 2);
            } else {
                ev2.a(eh2, this.aY[n2][0], this.C + n2 * this.aE + this.aE / 2, 59, 2);
            }
            if (this.A == 0 && this.aY.length == 5 && cw.bi && main.a.w % 4 == 0) {
                eh2.a(as.f, this.C + 3 * this.aE + this.aE / 2, 77, 33);
            }
            ++n2;
        }
        eh2.a(13524492);
        eh2.d(1, 78, this.d - 2, 1);
    }

    private static void z(eh eh2) {
        ev.c.a(eh2, String.valueOf(ch.ap) + " " + "2.5.2", 60, 4, 0, ev.f);
        ev.n.a(eh2, String.valueOf(ch.aq) + ": " + co.m().au, 60, 16, 0, ev.o);
        String string = main.a.I.a.e().equals("") ? ch.gn : main.a.I.a.e();
        ev.n.a(eh2, String.valueOf(ch.as) + " " + ds.a[ds.p] + ": " + string, 60, 27, 0, ev.o);
    }

    private void A(eh eh2) {
        this.a(eh2, co.m());
    }

    private void a(eh eh2, co co2) {
        ev.c.a(eh2, String.valueOf(cw.ck != 1 ? "" : "       ") + co2.au, this.b + 60, 4, 0, ev.f);
        if (cw.ck == 1) {
            er.b(eh2, 5427, this.b + 55, 4, 0, 0);
        }
        if (co2.df > 0) {
            ev.n.a(eh2, ch.fe, this.b + 60, 16, 0, ev.o);
            eh2.a(cw.aR, this.b + 95, 19, 0);
            int n2 = co2.bv * eh.a(cw.aQ) / co2.df;
            eh2.e(95, this.b + 19, n2, 20);
            eh2.a(cw.aQ, this.b + 95, 19, 0);
        }
        eh2.e(0, 0, main.a.A, main.a.B);
        if (co2.K > 0L) {
            ev.n.a(eh2, co2.aE ? co2.k() : co2.bz, this.b + 60, 27, 0, ev.o);
        }
        ev.n.a(eh2, String.valueOf(ch.dd) + ": " + o.a(co2.K), this.b + 60, 38, 0, ev.o);
    }

    public final int a(ar ar2) {
        if (ar2 == null) {
            return -1;
        }
        if (ar2.b()) {
            if (ar2.a == null) {
                return -1;
            }
            au au2 = ar2.a[0];
            if (au2.c.a == 22) {
                au2.c = cw.l().L[6];
                au2.a *= 1000;
            }
            if (au2.c.a == 23) {
                au2.c = cw.l().L[7];
                au2.a *= 1000;
            }
            ar ar3 = null;
            int n2 = 0;
            while (n2 < co.m().aV.length) {
                ar ar4 = co.m().aV[n2];
                if (au2.c.a == 22) {
                    au2.c = cw.l().L[6];
                    au2.a *= 1000;
                }
                if (au2.c.a == 23) {
                    au2.c = cw.l().L[7];
                    au2.a *= 1000;
                }
                if (ar4 != null && ar4.a != null && ar4.b.b == ar2.b.b) {
                    ar3 = ar4;
                    break;
                }
                ++n2;
            }
            if (ar3 == null) {
                dq.c("5");
                return au2.a;
            }
            n2 = ar3 != null && ar3.a != null ? au2.a - ar3.a[0].a : au2.a;
            return n2;
        }
        return 0;
    }

    private static void B(eh eh2) {
        ev.c.a(eh2, ch.aM[dx.s], 60, 4, 0);
        String string = "";
        if (dx.l >= 135 && dx.l <= 138) {
            string = " " + ch.l + dx.n;
        }
        ev.n.a(eh2, String.valueOf(dx.k) + string, 60, 16, 0);
        ev.c.a(eh2, String.valueOf(ch.ft) + ": ", 60, 27, 0);
        if (cw.z() >= 0 && cw.z() <= dx.x.length - 1) {
            ev.n.a(eh2, dx.x[cw.z()], 60, 38, 0);
            return;
        }
        ev.n.a(eh2, ch.et, 60, 38, 0);
    }

    private void C(eh eh2) {
        ev.n.a(eh2, String.valueOf(ch.fa) + ": " + co.m().ag + " / " + co.m().aj, this.b + 60, 2, 0, ev.o);
        ev.n.a(eh2, String.valueOf(ch.fb) + ": " + co.m().af + " / " + co.m().ak, this.b + 60, 14, 0, ev.o);
        ev.n.a(eh2, String.valueOf(ch.fc) + ": " + co.m().al + ", " + ch.ff + ": " + co.m().ab + "%", this.b + 60, 26, 0, ev.o);
        ev.n.a(eh2, String.valueOf(ch.eZ) + ": " + co.m().cY + "%, " + ch.eY + ": " + co.m().cZ + "%", this.b + 60, 38, 0, ev.o);
    }

    private void D(eh eh2) {
        int n2;
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(-this.aL, -this.aM);
        eh2.a(aQ, this.ae, this.af, 0);
        int n3 = co.m().cp;
        bk bk2 = cw.y[n3];
        er.b(eh2, bk2.a[co.bT[0][0][0]].a, this.cz, this.cA + 5, 0, 3);
        int n4 = 2;
        if (this.cz <= 40) {
            n4 = 0;
        }
        if (this.cz >= 220) {
            n4 = 1;
        }
        ev.d.a(eh2, dx.k, this.cz, this.cA - 12, n4, ev.o);
        int n5 = -1;
        if (cw.z() != -1) {
            n2 = 0;
            while (n2 < bz[dx.s].length) {
                if (bz[dx.s][n2] == cw.z()) {
                    n5 = n2;
                    break;
                }
                n5 = 4;
                ++n2;
            }
            if (main.a.w % 4 > 0) {
                eh2.a(as.f, this.ae + bA[dx.s][n5], this.af + bB[dx.s][n5], 3);
            }
        }
        if (!main.a.e) {
            eh2.a(i, this.cB, this.cC, dv.b);
            n2 = 0;
            while (n2 < bA[dx.s].length) {
                int n6 = bA[dx.s][n2] + this.ae;
                int n7 = bB[dx.s][n2] + this.af;
                if (dq.a(n6 - 15, n7 - 15, 30, 30, this.cB, this.cC)) {
                    n4 = 2;
                    if (n6 <= 20) {
                        n4 = 0;
                    }
                    if (n6 >= 220) {
                        n4 = 1;
                    }
                    ev.d.a(eh2, dx.x[bz[dx.s][n2]], n6, n7 - 12, n4, ev.o);
                    break;
                }
                ++n2;
            }
        } else if (!this.bZ) {
            n2 = 0;
            while (n2 < bA[dx.s].length) {
                int n8 = bA[dx.s][n2] + this.ae;
                int n9 = bB[dx.s][n2] + this.af;
                if (dq.a(n8 - 15, n9 - 15, 30, 30, this.ca, this.cb)) {
                    n4 = 2;
                    if (n8 <= 30) {
                        n4 = 0;
                    }
                    if (n8 >= 220) {
                        n4 = 1;
                    }
                    eh2.a(i, n8, n9, dv.b);
                    ev.d.a(eh2, dx.x[bz[dx.s][n2]], n8, n9 - 12, n4, ev.o);
                    break;
                }
                ++n2;
            }
        }
        eh2.a(-eh2.a(), -eh2.b());
        if (n5 != -1) {
            if (bA[dx.s][n5] + this.ae < this.aL) {
                eh2.a(dh.W, 0, 0, 9, 6, 5, this.ae + 5, this.af + this.ah / 2 - 4, 0);
            }
            if (this.aL + this.ag < bA[dx.s][n5] + this.ae) {
                eh2.a(dh.W, 0, 0, 9, 6, 6, this.ae + this.ag - 5, this.af + this.ah / 2 - 4, dv.b);
            }
            if (bB[dx.s][n5] < this.aM) {
                eh2.a(dh.W, 0, 0, 9, 6, 1, this.ae + this.ag / 2, this.af + 5, dv.a);
            }
            if (bB[dx.s][n5] > this.aM + this.ah) {
                eh2.a(dh.W, 0, 0, 9, 6, 0, this.ae + this.ag / 2, this.af + this.ah - 5, dv.c);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void E(eh var1_1) {
        block39: {
            block30: {
                v0 = var2_2 = main.a.B > 300 ? 20 : 15;
                if (dl.as) {
                    cw.l();
                    if (!cw.f()) {
                        cw.l();
                        if (!cw.g()) {
                            var1_1.a(this.cd == 1 ? cw.aG : cw.aF, this.ae + this.ag / 2, this.af + this.ah - var2_2, 3);
                            ev.f.a(var1_1, ch.cp, this.ae + this.ag / 2, this.af + this.ah - (var2_2 + 5), 2);
                        }
                    }
                }
                this.cs = this.ae + 5;
                this.cy = this.ct = this.af + 14;
                var1_1.e(this.ae, this.af, this.ag, this.ah - 35);
                if (this.ci != null) {
                    if (this.ci.d > 0) {
                        var1_1.a(dh.W, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.af + 3, 0);
                    }
                    if (this.ci.d < this.ci.l) {
                        var1_1.a(dh.W, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.af + this.ah - 45, 0);
                    }
                    var1_1.a(0, -this.ci.d);
                }
                this.cw = 0;
                var3_3 = 0;
                if (co.m().aR == null) break block30;
                var4_4 = 0;
                while (var4_4 < co.m().aR.d.length) {
                    ev.o.a(var1_1, co.m().aR.d[var4_4], this.ae + this.ag / 2, this.cy - 5 + var4_4 * 12, 2);
                    ++this.cw;
                    ++var4_4;
                }
                this.cy += (co.m().aR.d.length - 1) * 12;
                var4_4 = 0;
                var5_6 = null;
                var6_8 = 0;
                while (var6_8 < co.m().aR.f.length) {
                    block38: {
                        block31: {
                            block35: {
                                block37: {
                                    block32: {
                                        block36: {
                                            block33: {
                                                block34: {
                                                    if (co.m().aR.f[var6_8] == null) break block31;
                                                    var4_4 = var6_8;
                                                    var5_6 = "- " + co.m().aR.f[var6_8];
                                                    if (co.m().aR.b[var6_8] == -1) break block32;
                                                    if (co.m().aR.a != var6_8) break block33;
                                                    if (co.m().aR.b[var6_8] != 1) {
                                                        var5_6 = String.valueOf(var5_6) + " (" + co.m().aR.h + "/" + co.m().aR.b[var6_8] + ")";
                                                    }
                                                    if (co.m().aR.h != co.m().aR.b[var6_8]) break block34;
                                                    v1 = ev.k;
                                                    v2 = var1_1;
                                                    v3 = var5_6;
                                                    v4 = this.cs;
                                                    v5 = 5;
                                                    ** GOTO lbl95
                                                }
                                                var7_10 = ev.o;
                                                if (var3_3 == 0) {
                                                    var3_3 = 1;
                                                    var7_10.a(var1_1, var5_6, this.cs + 5 + ((var7_10 = ev.q) == ev.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                                } else {
                                                    var7_10.a(var1_1, "- ...", this.cs + 5 + (var7_10 == ev.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                                }
                                                break block35;
                                            }
                                            if (co.m().aR.a <= var6_8) break block36;
                                            if (co.m().aR.b[var6_8] != 1) {
                                                var5_6 = String.valueOf(var5_6) + " (" + co.m().aR.b[var6_8] + "/" + co.m().aR.b[var6_8] + ")";
                                            }
                                            v1 = ev.s;
                                            v2 = var1_1;
                                            v3 = var5_6;
                                            v4 = this.cs;
                                            v5 = 5;
                                            ** GOTO lbl95
                                        }
                                        if (co.m().aR.b[var6_8] != 1) {
                                            var5_6 = String.valueOf(var5_6) + " 0/" + co.m().aR.b[var6_8];
                                        }
                                        var7_10 = ev.o;
                                        if (var3_3 == 0) {
                                            var3_3 = 1;
                                            var7_10.a(var1_1, var5_6, this.cs + 5 + ((var7_10 = ev.q) == ev.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                        } else {
                                            var7_10.a(var1_1, "- ...", this.cs + 5 + (var7_10 == ev.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                        }
                                        break block35;
                                    }
                                    if (co.m().aR.a <= var6_8) break block37;
                                    v1 = ev.s;
                                    v2 = var1_1;
                                    v3 = var5_6;
                                    v4 = this.cs;
                                    v5 = 5;
                                    ** GOTO lbl95
                                }
                                var7_10 = ev.o;
                                if (var3_3 == 0) {
                                    var3_3 = 1;
                                    var7_10.a(var1_1, var5_6, this.cs + 5 + ((var7_10 = ev.q) == ev.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                                } else {
                                    v1 = var7_10;
                                    v2 = var1_1;
                                    v3 = "- ...";
                                    v4 = this.cs + 5;
                                    v5 = var7_10 == ev.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0;
lbl95:
                                    // 4 sources

                                    v1.a(v2, v3, v4 + v5, this.cy += 12, 0);
                                }
                            }
                            ++this.cw;
                            break block38;
                        }
                        if (co.m().aR.a <= var6_8) {
                            var5_6 = "- " + co.m().aR.f[var4_4];
                            var7_10 = ev.o;
                            if (var3_3 == 0) {
                                var3_3 = 1;
                                var7_10 = ev.q;
                            }
                            var7_10.a(var1_1, var5_6, this.cs + 5 + (var7_10 == ev.q && main.a.w % 20 > 10 ? main.a.w % 4 / 2 : 0), this.cy += 12, 0);
                        }
                    }
                    ++var6_8;
                }
                this.cy += 5;
                var6_8 = 0;
                while (var6_8 < co.m().aR.e.length) {
                    ev.m.a(var1_1, co.m().aR.e[var6_8], this.cs + 5, this.cy += 12, 0);
                    ++this.cw;
                    ++var6_8;
                }
                break block39;
            }
            var4_5 = cw.z();
            var5_7 = cw.A();
            if (var4_5 == -3 || var5_7 == -3) {
                var6_9 = ch.aX[3];
            } else if (co.m().aR == null && co.m().X == 9 && co.m().aL.a == 0) {
                var6_9 = ch.ba;
            } else if (var5_7 >= 0 && var4_5 >= 0) {
                var6_9 = String.valueOf(ch.aX[0]) + bg.u[var5_7].b + ch.aX[1] + dx.x[var4_5] + ch.aX[2];
            } else {
                return;
            }
            var7_11 = ev.s.a(var6_9, 150);
            var3_3 = 0;
            while (var3_3 < var7_11.length) {
                if (var3_3 == 0) {
                    this.cy = this.ct;
                    ev.s.a(var1_1, var7_11[var3_3], this.cs + 5, this.cy, 0);
                } else {
                    ev.s.a(var1_1, var7_11[var3_3], this.cs + 5, this.cy += 12, 0);
                }
                ++var3_3;
            }
        }
        if (this.ci == null) {
            this.ci = new br();
            this.ci.a(this.cw, 12, this.ae, this.af, this.ag, this.ah - var2_2 - 40, true, 1);
        }
    }

    private void Z() {
        int n2 = 0;
        while (n2 < this.k.size()) {
            ((ar)this.k.elementAt((int)n2)).f = false;
            ++n2;
        }
        this.k.removeAllElements();
    }

    public final void z() {
        if (this.bM > 0) {
            this.cD = false;
            return;
        }
        this.ai = null;
        if (this.F() || dx.l == 45) {
            co.m().aa();
        }
        if (this.o != null && this.A == 13 && this.o.b) {
            this.o = null;
        }
        if (this.A == 13 && !this.aT) {
            cj.a().a((byte)3, -1, (byte)-1, -1);
        }
        es.a();
        es.o();
        cw.bG = true;
        dx.t = (byte)-1;
        aQ = null;
        System.gc();
        this.bP = false;
        this.cD = true;
        this.Z();
        an.a();
        main.a.H = null;
        main.a.p();
        main.a.j();
        this.bR = 0;
        this.bQ = 0;
        this.bT = false;
        this.a = false;
        if ((co.m().ag <= 0L || co.m().T == 14 || co.m().T == 5) && co.m().dk) {
            ae ae2;
            cw.l().cA = ae2 = new ae(ch.aY[0], 11038, cw.l());
            co.m().ag = 0L;
        }
    }

    public final void A() {
        if (this.bM > 0) {
            this.cD = false;
            return;
        }
        this.ai = null;
        if (this.F() || dx.l == 45) {
            co.m().aa();
        }
        if (this.o != null && this.A == 13 && this.o.b) {
            this.o = null;
        }
        if (this.A == 13 && !this.aT) {
            cj.a().a((byte)3, -1, (byte)-1, -1);
        }
        if (this.A == 15) {
            cj.a().w(-1);
        }
        es.a();
        es.o();
        cw.bG = true;
        dx.t = (byte)-1;
        if (aQ != null) {
            aQ = null;
        }
        System.gc();
        this.bP = false;
        if (this.A != 4) {
            if (this.A == 24) {
                this.ai();
            } else if (this.A == 23) {
                this.q();
            } else if (this.A == 3 || this.A == 14) {
                if (this.cI) {
                    this.cD = true;
                } else {
                    this.q();
                    this.aK = 0;
                    this.h = 0;
                }
            } else if (this.A == 18 || this.A == 19 || this.A == 20 || this.A == 21) {
                this.q();
                this.aK = 0;
                this.h = 0;
            } else if (this.A == 8 || this.A == 11 || this.A == 16) {
                this.at();
                this.aK = 0;
                this.h = 0;
            } else {
                this.cD = true;
            }
        } else {
            this.q();
            this.aK = 0;
            this.h = 0;
        }
        an.a();
        main.a.H = null;
        main.a.p();
        main.a.j();
        main.a.W = false;
        this.bR = 0;
        this.bQ = 0;
        this.bT = false;
        if ((co.m().ag <= 0L || co.m().T == 14 || co.m().T == 5) && co.m().dk) {
            ae ae2;
            cw.l().cA = ae2 = new ae(ch.aY[0], 11038, cw.l());
            co.m().ag = 0L;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void C() {
        block155: {
            if (this.o != null && this.o.b) {
                this.o.c();
                return;
            }
            if (this.cJ) {
                ++this.cL;
                if (this.cL == 10) {
                    this.cL = 0;
                    this.cJ = false;
                    this.o.a.a("");
                    this.o.h = String.valueOf(ch.fL) + " ";
                    this.o.a.i = ch.eg;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.a.c(1);
                    this.o.a.b(10);
                    if (main.a.e) {
                        this.o.a.b();
                    }
                }
                return;
            }
            if (this.cK) {
                ++this.cL;
                if (this.cL == 10) {
                    this.cL = 0;
                    this.cK = false;
                    this.o.a.a("");
                    this.o.h = String.valueOf(ch.fM) + "  ";
                    this.o.a.i = ch.eg;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.a.c(1);
                    this.o.a.b(10);
                    if (main.a.e) {
                        this.o.a.b();
                    }
                }
                return;
            }
            if (this.ci != null) {
                this.ci.b();
            }
            if (this.j != null && this.j.k) {
                var1_1 = this.j;
                if (dw.f != null) {
                    dw.f.b();
                }
                if (var1_1.h != var1_1.g) {
                    var1_1.i = var1_1.g - var1_1.h << 2;
                    var1_1.j += var1_1.i;
                    var1_1.h += var1_1.j >> 3;
                    var1_1.j &= 15;
                }
                if (Math.abs(var1_1.g - var1_1.h) < 10) {
                    var1_1.h = var1_1.g;
                }
                if (var1_1.h >= var1_1.a + var1_1.b - 10 && var1_1.g >= var1_1.a + var1_1.b - 10) {
                    var1_1.k = false;
                }
                return;
            }
            this.V();
            this.aw();
            if (this.bV <= 0) break block155;
            --this.bV;
            if (this.bV != 0) break block155;
            this.bp[this.B] = this.ak;
            switch (this.A) {
                case 23: {
                    var1_2 = this;
                    if (var1_2.ak == -1) break;
                    var1_2.cE = var1_2.ak;
                    ((cv)dl.at.elementAt((int)var1_2.cE)).d = true;
                    ea.a(String.valueOf(((cv)dl.at.elementAt((int)var1_2.cE)).c), 1);
                    var2_4 = var1_2;
                    var3_11 = ((cv)dl.at.elementAt((int)var2_4.cE)).b;
                    dl.cF = ev.o.a((String)var3_11, var2_4.ag - 40);
                    var2_4.O = dl.cF.length;
                    var2_4.aD = 16;
                    var2_4.ak = main.a.e != false ? -1 : 0;
                    var2_4.aI = var2_4.O * var2_4.aD - var2_4.ah;
                    if (var2_4.aI < 0) {
                        var2_4.aI = 0;
                    }
                    if (var2_4.g < 0) {
                        var2_4.f = 0;
                        var2_4.g = 0;
                    }
                    if (var2_4.g > var2_4.aI) {
                        var2_4.g = var2_4.f = var2_4.aI;
                    }
                    var2_4.A = 24;
                    var2_4.c(0);
                    break;
                }
                case 21: {
                    var1_2 = this;
                    if (var1_2.B == 0) {
                        if (var1_2.ak == -1 || var1_2.ak > co.n().aV.length - 1) break;
                        var2_5 = new eq("");
                        var1_2.bC = var3_11 = co.n().aV[var1_2.ak];
                        if (var1_2.bC != null) {
                            var2_5.addElement(new ae(ch.ec, var1_2, 2006, var1_2.bC));
                            main.a.F.a(var2_5, var1_2.b, (var1_2.ak + 1) * var1_2.aD - var1_2.g + var1_2.af);
                            var1_2.b(var1_2.bC);
                        } else {
                            var1_2.ai = null;
                        }
                    }
                    if (var1_2.B == 1) {
                        var5_12 = var1_2;
                        if (var5_12.ak != -1) {
                            if (var5_12.ak == 5) {
                                main.a.a(ch.p, new ae(ch.bo, 888351), new ae(ch.bp, 2001));
                            } else {
                                cj.a().g((byte)var5_12.ak);
                                if (var5_12.ak < 4) {
                                    co.n().M = (byte)var5_12.ak;
                                }
                            }
                        }
                    }
                    if (var1_2.B != 2) break;
                    var1_2.af();
                    break;
                }
                case 0: {
                    var1_2 = this;
                    try {
                        if (var1_2.B == 0) {
                            var1_2.K();
                        }
                        if (var1_2.B == 1) {
                            var1_2.af();
                        }
                        if (var1_2.B != 2) ** GOTO lbl231
                        var3_11 = var1_2;
                        if (var3_11.ak < 0) ** GOTO lbl231
                        if (co.m().T != 14) ** GOTO lbl118
                        main.a.a(ch.eA);
                        ** GOTO lbl231
lbl118:
                        // 1 sources

                        if (var3_11.ak != 0 && var3_11.ak != 1 && var3_11.ak != 2 && var3_11.ak != 3 && var3_11.ak != 4 && var3_11.ak != 5) ** GOTO lbl213
                        var5_13 = co.m().ao;
                        var2_6 = co.m().cU;
                        var4_21 = co.m().cV;
                        var7_23 = co.m().cT;
                        var8_25 = co.m().cW;
                        co.m().cX;
                        if (var3_11.ak != 0) ** GOTO lbl146
                        if (var5_13 >= (long)(co.m().cU + 1000)) ** GOTO lbl130
                        main.a.c(String.valueOf(ch.eN) + co.m().ao + ch.eO + (co.m().cU + 1000));
                        ** GOTO lbl231
lbl130:
                        // 1 sources

                        if (var5_13 <= (long)var2_6 || var5_13 >= (long)(10 * (2 * (var2_6 + 1000) + 180) / 2)) ** GOTO lbl133
                        main.a.a(String.valueOf(ch.eP) + (var2_6 + 1000) + ch.eQ + co.m().da + ch.eR, new ae(ch.eM, (ao)var3_11, 9000, null), new ae(ch.bx, (ao)var3_11, 4007, null));
                        ** GOTO lbl231
lbl133:
                        // 1 sources

                        if (var5_13 >= (long)(10 * (2 * (var2_6 + 1000) + 180) / 2) && var5_13 < (long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)) {
                            var11_26 = new eq("");
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + co.m().da + ch.fa + "\n" + "-" + dq.b((long)(var2_6 + 1000)), (ao)var3_11, 9000, null));
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + 10 * co.m().da + ch.fa + "\n" + "-" + dq.b((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (ao)var3_11, 9006, null));
                            main.a.F.a(var11_26, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                            super.d(var3_11.ak);
                        }
                        if (var5_13 >= (long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)) {
                            var11_26 = new eq("");
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + co.m().da + ch.fa + "\n" + "-" + dq.b((long)(var2_6 + 1000)), (ao)var3_11, 9000, null));
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + 10 * co.m().da + ch.fa + "\n" + "-" + dq.b((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (ao)var3_11, 9006, null));
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + 100 * co.m().da + ch.fa + "\n" + "-" + dq.b((long)(100 * (2 * (var2_6 + 1000) + 1980) / 2)), (ao)var3_11, 9007, null));
                            main.a.F.a(var11_26, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                            super.d(var3_11.ak);
                        }
lbl146:
                        // 4 sources

                        if (var3_11.ak != 1) ** GOTO lbl166
                        if (co.m().ao >= (long)(co.m().cV + 1000)) ** GOTO lbl150
                        main.a.a(String.valueOf(ch.eN) + co.m().ao + ch.eO + (co.m().cV + 1000));
                        ** GOTO lbl231
lbl150:
                        // 1 sources

                        if (var5_13 <= (long)var4_21 || var5_13 >= (long)(10 * (2 * (var4_21 + 1000) + 180) / 2)) ** GOTO lbl153
                        main.a.a(String.valueOf(ch.eP) + (var4_21 + 1000) + ch.eQ + co.m().db + ch.eS, new ae(ch.eM, (ao)var3_11, 9000, null), new ae(ch.bx, (ao)var3_11, 4007, null));
                        ** GOTO lbl231
lbl153:
                        // 1 sources

                        if (var5_13 >= (long)(10 * (2 * (var4_21 + 1000) + 180) / 2) && var5_13 < (long)(100 * (2 * (var4_21 + 1000) + 1980) / 2)) {
                            var11_26 = new eq("");
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + co.m().db + ch.fb + "\n" + "-" + dq.b((long)(var2_6 + 1000)), (ao)var3_11, 9000, null));
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + 10 * co.m().db + ch.fb + "\n" + "-" + dq.b((long)(10 * (2 * (var2_6 + 1000) + 180) / 2)), (ao)var3_11, 9006, null));
                            main.a.F.a(var11_26, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                            super.d(var3_11.ak);
                        }
                        if (var5_13 >= (long)(100 * (2 * (var4_21 + 1000) + 1980) / 2)) {
                            var11_26 = new eq("");
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + co.m().db + ch.fb + "\n" + "-" + dq.b((long)(var4_21 + 1000)), (ao)var3_11, 9000, null));
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + 10 * co.m().db + ch.fb + "\n" + "-" + dq.b((long)(10 * (2 * (var4_21 + 1000) + 180) / 2)), (ao)var3_11, 9006, null));
                            var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + 100 * co.m().db + ch.fb + "\n" + "-" + dq.b((long)(100 * (2 * (var4_21 + 1000) + 1980) / 2)), (ao)var3_11, 9007, null));
                            main.a.F.a(var11_26, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                            super.d(var3_11.ak);
                        }
lbl166:
                        // 4 sources

                        if (var3_11.ak != 2) ** GOTO lbl186
                        if (co.m().ao < (long)(co.m().cT * co.m().dg)) {
                            main.a.a(String.valueOf(ch.eN) + co.m().ao + ch.eO + var7_23 * 100);
                        } else if (var5_13 > (long)var7_23 && var5_13 < (long)(10 * (var7_23 * 2 + 9) / 2 * co.m().dg)) {
                            main.a.a(String.valueOf(ch.eP) + var7_23 * 100 + ch.eQ + co.m().dc + ch.eT, new ae(ch.eM, (ao)var3_11, 9000, null), new ae(ch.bx, (ao)var3_11, 4007, null));
                        } else {
                            if (var5_13 >= (long)(10 * (var7_23 * 2 + 9) / 2 * co.m().dg) && var5_13 < (long)(100 * (var7_23 * 2 + 99) / 2 * co.m().dg)) {
                                var11_26 = new eq("");
                                var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + co.m().dc + "\n" + ch.fc + "\n" + "-" + dq.b((long)(var7_23 * 100)), (ao)var3_11, 9000, null));
                                var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + 10 * co.m().dc + "\n" + ch.fc + "\n" + "-" + dq.b((long)(10 * (var7_23 * 2 + 9) / 2 * co.m().dg)), (ao)var3_11, 9006, null));
                                main.a.F.a(var11_26, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                super.d(var3_11.ak);
                            }
                            if (var5_13 >= (long)(100 * (var7_23 * 2 + 99) / 2 * co.m().dg)) {
                                var11_26 = new eq("");
                                var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + co.m().dc + "\n" + ch.fc + "\n" + "-" + dq.b((long)(var7_23 * 100)), (ao)var3_11, 9000, null));
                                var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + 10 * co.m().dc + "\n" + ch.fc + "\n" + "-" + dq.b((long)(10 * (var7_23 * 2 + 9) / 2 * co.m().dg)), (ao)var3_11, 9006, null));
                                var11_26.addElement(new ae(String.valueOf(ch.eM) + "\n" + 100 * co.m().dc + "\n" + ch.fc + "\n" + "-" + dq.b((long)(100 * (var7_23 * 2 + 99) / 2 * co.m().dg)), (ao)var3_11, 9007, null));
                                main.a.F.a(var11_26, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                super.d(var3_11.ak);
                            }
lbl186:
                            // 4 sources

                            if (var3_11.ak == 3) {
                                if (co.m().ao < (long)(50000 + co.m().cW * 1000)) {
                                    main.a.a(String.valueOf(ch.eN) + o.a(co.m().ao) + ch.eO + o.a((long)(50000 + co.m().cW * 1000)));
                                } else {
                                    var11_27 = 1L * (long)(2 * (var8_25 + 5)) / 2L * 100000L;
                                    var13_29 = 10L * (long)(2 * (var8_25 + 5) + 9) / 2L * 100000L;
                                    var15_31 = 100L * (long)(2 * (var8_25 + 5) + 99) / 2L * 100000L;
                                    ch.eP = ch.eM;
                                    var2_7 = new eq("");
                                    var2_7.addElement(new ae(String.valueOf(ch.eP) + "\n" + "1 " + ch.fd + "\n" + dq.b(var11_27), (ao)var3_11, 9000, null));
                                    var2_7.addElement(new ae(String.valueOf(ch.eP) + "\n" + "10 " + ch.fd + "\n" + dq.b(var13_29), (ao)var3_11, 9006, null));
                                    var2_7.addElement(new ae(String.valueOf(ch.eP) + "\n" + "100 " + ch.fd + "\n" + dq.b(var15_31), (ao)var3_11, 9007, null));
                                    main.a.F.a(var2_7, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                    super.d(var3_11.ak);
                                }
                            } else if (var3_11.ak == 4) {
                                var13_30 = co.m().cX;
                                if (var13_30 > dl.co.length - 1) {
                                    var13_30 = dl.co.length - 1;
                                }
                                if (co.m().ao < (var11_28 = dl.co[var13_30])) {
                                    main.a.a(String.valueOf(ch.eN) + dq.b(co.m().ao) + ch.eO + dq.b(var11_28));
                                } else {
                                    main.a.a(String.valueOf(ch.eP) + dq.a(var11_28) + ch.eQ + co.m().de + ch.eU, new ae(ch.eM, (ao)var3_11, 9000, null), new ae(ch.bx, (ao)var3_11, 4007, null));
                                }
                            } else if (var3_11.ak == 5) {
                                cj.a().a((byte)0);
                            }
                        }
                        ** GOTO lbl231
lbl213:
                        // 1 sources

                        var5_14 = var3_11.ak - 6;
                        var6_32 = co.m().aL.b[var5_14];
                        var2_8 = co.m().a((bx)var6_32);
                        var4_22 = null;
                        var7_24 = new eq("");
                        if (var2_8 != null) {
                            if (var2_8.c == var6_32.c) {
                                var7_24.addElement(new ae(ch.cD, (ao)var3_11, 9003, var2_8.a));
                                var7_24.addElement(new ae(ch.bk, 2));
                            } else {
                                var4_22 = var6_32.h[var2_8.c];
                                var7_24.addElement(new ae(ch.cB, (ao)var3_11, 9002, var4_22));
                                var7_24.addElement(new ae(ch.cD, (ao)var3_11, 9003, var2_8.a));
                            }
                        } else {
                            var4_22 = var6_32.h[0];
                            var7_24.addElement(new ae(ch.fo, (ao)var3_11, 9004, var4_22));
                        }
                        main.a.F.a(var7_24, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                        super.a((bx)var6_32, var2_8, var4_22);
lbl231:
                        // 15 sources

                        if (var1_2.B == 3) {
                            if (var1_2.D.length == 4) {
                                var1_2.ah();
                            } else {
                                var3_11 = var1_2;
                                var1_2.bL = null;
                                var3_11.cH = null;
                                if (var3_11.ak < 0) {
                                    var3_11.bN = -1;
                                } else {
                                    if (co.m().aw == null) {
                                        if (var3_11.ak == 0) {
                                            if (var3_11.bN == 0) {
                                                var6_32 = var3_11;
                                                var3_11.o.h = ch.dw;
                                                var6_32.o.a.i = ch.dx;
                                                var6_32.o.g = "";
                                                var6_32.o.b = true;
                                                var6_32.o.a.e = true;
                                                var6_32.o.a.c(0);
                                                if (main.a.e) {
                                                    var6_32.o.a.b();
                                                }
                                            } else if (var3_11.bN == 1) {
                                                da.a();
                                                var6_32 = var3_11;
                                                var3_11.o.h = ch.dz;
                                                var6_32.o.a.i = ch.dw;
                                                var6_32.o.g = "";
                                                var6_32.o.b = true;
                                                var6_32.o.a.c(0);
                                                if (main.a.e) {
                                                    var6_32.o.a.b();
                                                }
                                                cj.a().a((byte)1, -1, (String)null);
                                            }
                                        } else if (var3_11.ak != -1) {
                                            if (var3_11.ak == 1) {
                                                if (var3_11.al) {
                                                    cj.a().a("");
                                                } else if (var3_11.an && var3_11.bD != null) {
                                                    main.a.a(String.valueOf(ch.dB) + var3_11.bD.c, new ae(ch.bo, (ao)var3_11, 4000, var3_11.bD), new ae(ch.bp, (ao)var3_11, 4005, var3_11.bD));
                                                }
                                            } else if (var3_11.al) {
                                                var3_11.bD = super.Y();
                                                if (var3_11.bD != null) {
                                                    var5_15 = new eq("");
                                                    var5_15.addElement(new ae(ch.dD, (ao)var3_11, 4000, var3_11.bD));
                                                    var5_15.addElement(new ae(ch.dE, (ao)var3_11, 4001, var3_11.bD));
                                                    main.a.F.a(var5_15, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                                    super.a(super.Y());
                                                }
                                            } else if (var3_11.an) {
                                                var3_11.bF = super.W();
                                                if (var3_11.bF != null) {
                                                    var5_16 = new eq("");
                                                    var5_16.addElement(new ae(ch.bk, (ao)var3_11, 8000, var3_11.bD));
                                                    main.a.F.a(var5_16, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                                    main.a.F.a(var5_16, 0, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                                    super.a(var3_11.bF);
                                                }
                                            }
                                        }
                                    } else if (var3_11.ak == 0) {
                                        if (var3_11.am) {
                                            if (var3_11.bN == 0) {
                                                if (var3_11.R.size() > 1) {
                                                    var6_32 = var3_11;
                                                    var3_11.o.h = ch.dy;
                                                    var6_32.o.a.i = ch.br;
                                                    var6_32.o.g = "";
                                                    var6_32.o.b = true;
                                                    var6_32.o.a.e = true;
                                                    var6_32.o.a.c(0);
                                                    if (main.a.e) {
                                                        var6_32.o.a.b();
                                                    }
                                                } else {
                                                    var3_11.Q = null;
                                                    var3_11.al = false;
                                                    var3_11.an = true;
                                                    var3_11.am = false;
                                                    var3_11.O = var3_11.R.size() + 2;
                                                    var3_11.v();
                                                }
                                            }
                                            if (var3_11.bN == 1) {
                                                cj.a().a(1, null, -1);
                                            }
                                            if (var3_11.bN == 2) {
                                                var3_11.Q = null;
                                                var3_11.al = false;
                                                var3_11.an = true;
                                                var3_11.am = false;
                                                var3_11.O = var3_11.R.size() + 2;
                                                var3_11.v();
                                                super.M();
                                            }
                                        } else if (var3_11.an) {
                                            if (var3_11.bN == 0) {
                                                var3_11.al = false;
                                                var3_11.an = false;
                                                var3_11.am = true;
                                                var3_11.O = c.l.size() + 2;
                                                var3_11.v();
                                            }
                                            if (var3_11.bN == 1) {
                                                if (var3_11.R.size() > 1) {
                                                    cj.a().d();
                                                } else {
                                                    super.aj();
                                                }
                                            }
                                            if (var3_11.bN == 2) {
                                                if (var3_11.R.size() > 1) {
                                                    super.aj();
                                                } else {
                                                    cj.a().a((byte)3, -1, (String)null);
                                                }
                                            }
                                            if (var3_11.bN == 3) {
                                                cj.a().a((byte)3, -1, (String)null);
                                            }
                                        }
                                    } else if (var3_11.ak == 1) {
                                        if (var3_11.al) {
                                            cj.a().a("");
                                        }
                                    } else if (var3_11.al) {
                                        var3_11.bD = super.Y();
                                        if (var3_11.bD != null) {
                                            var5_17 = new eq("");
                                            var5_17.addElement(new ae(ch.dE, (ao)var3_11, 4001, var3_11.bD));
                                            main.a.F.a(var5_17, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                            super.a(super.Y());
                                        }
                                    } else if (var3_11.an) {
                                        dq.c("TOI DAY 1");
                                        var3_11.bF = super.W();
                                        if (var3_11.bF != null) {
                                            var5_18 = new eq("");
                                            dq.c("TOI DAY 2");
                                            if (var3_11.Q != null) {
                                                var5_18.addElement(new ae(ch.bk, (ao)var3_11, 8000, null));
                                                dq.c("TOI DAY 3");
                                            } else if (var3_11.R != null) {
                                                dq.c("TOI DAY 4");
                                                dq.c("my role= " + co.m().ax);
                                                if (co.m().V == var3_11.bF.a || co.m().ax == 2) {
                                                    var5_18.addElement(new ae(ch.bk, (ao)var3_11, 8000, var3_11.bF));
                                                }
                                                if (co.m().ax < 2 && co.m().V != var3_11.bF.a) {
                                                    if (var3_11.bF.g == 0 || var3_11.bF.g == 1) {
                                                        var5_18.addElement(new ae(ch.bk, (ao)var3_11, 8000, var3_11.bF));
                                                    }
                                                    if (var3_11.bF.g == 2) {
                                                        var5_18.addElement(new ae(ch.dF, (ao)var3_11, 5002, var3_11.bF));
                                                    }
                                                    if (co.m().ax == 0) {
                                                        var5_18.addElement(new ae(ch.dG, (ao)var3_11, 5001, var3_11.bF));
                                                        if (var3_11.bF.g == 1) {
                                                            var5_18.addElement(new ae(ch.dH, (ao)var3_11, 5003, var3_11.bF));
                                                        }
                                                    }
                                                }
                                                if (co.m().ax < var3_11.bF.g) {
                                                    var5_18.addElement(new ae(ch.dI, (ao)var3_11, 5004, var3_11.bF));
                                                }
                                            }
                                            main.a.F.a(var5_18, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                            super.a(var3_11.bF);
                                        }
                                    } else if (var3_11.am) {
                                        var3_11.bE = super.X();
                                        if (var3_11.bE != null) {
                                            if (var3_11.bE.b == 0) {
                                                var5_19 = new eq("");
                                                var5_19.addElement(new ae(ch.bk, (ao)var3_11, 8000, var3_11.bE));
                                                main.a.F.a(var5_19, var3_11.b, (var3_11.ak + 1) * var3_11.aD - var3_11.g + var3_11.af);
                                                super.a(var3_11.bE);
                                            } else if (var3_11.bE.b == 1) {
                                                if (var3_11.bE.c != co.m().V && var3_11.bN != -1) {
                                                    cj.a().d(var3_11.bE.a);
                                                }
                                            } else if (var3_11.bE.b == 2 && var3_11.bE.k != null) {
                                                if (var3_11.bN == 0) {
                                                    cj.a().a(var3_11.bE.a, (byte)1);
                                                } else if (var3_11.bN == 1) {
                                                    cj.a().a(var3_11.bE.a, (byte)0);
                                                }
                                            }
                                        }
                                    }
                                    if (main.a.e) {
                                        var3_11.bN = -1;
                                        var3_11.ak = -1;
                                    }
                                }
                            }
                        }
                        if (var1_2.B != 4) break;
                        var1_2.ah();
                    }
                    catch (Exception v0) {
                        var2_9 = v0;
                        v0.printStackTrace();
                    }
                    break;
                }
                case 2: {
                    this.ao();
                    break;
                }
                case 26: {
                    var1_2 = this;
                    if (var1_2.ak == -1) break;
                    var1_2.ak;
                    w.a();
                    main.a.G.A();
                    break;
                }
                case 3: {
                    this.an();
                    break;
                }
                case 1: 
                case 17: {
                    this.ad();
                    break;
                }
                case 25: {
                    break;
                }
                case 4: {
                    var1_2 = this;
                    if (dl.aQ != null) {
                        dl.aQ = null;
                    }
                    dx.t = (byte)-1;
                    System.gc();
                    er.a();
                    var1_2.q();
                    var1_2.aK = 0;
                    var1_2.h = 0;
                    break;
                }
                case 14: {
                    var1_2 = this;
                    var1_2.an();
                    break;
                }
                case 7: {
                    if (this.equals(main.a.H) && main.a.G.A == 2) {
                        this.ao();
                        return;
                    }
                    this.af();
                    break;
                }
                case 8: {
                    var1_2 = this;
                    if (var1_2.ak == 0) {
                        var1_2.au = var1_2.au == false;
                        ea.a("viewchat", var1_2.au != false ? 1 : 0);
                        if (!main.a.e) break;
                        var1_2.ak = -1;
                        break;
                    }
                    if (var1_2.ak < 0 || var1_2.bG.size() == 0) break;
                    var2_10 = new eq("");
                    var1_2.cG = var1_2.ak - 1;
                    var2_10.addElement(new ae(ch.br, var1_2, 8001, (db)var1_2.bG.elementAt(var1_2.cG)));
                    var2_10.addElement(new ae(ch.cS, var1_2, 8003, (db)var1_2.bG.elementAt(var1_2.cG)));
                    main.a.F.a(var2_10, var1_2.b, (var1_2.ak + 1) * var1_2.aD - var1_2.g + var1_2.af);
                    var5_20 = (db)var1_2.bG.elementAt(var1_2.ak - 1);
                    var3_11 = var1_2;
                    var6_32 = "|0|1|" + var5_20.c.au;
                    var6_32 = String.valueOf(var6_32) + "\n";
                    var6_32 = String.valueOf(var6_32) + "\n--";
                    var6_32 = String.valueOf(var6_32) + "\n|5|" + dq.a(var5_20.a, "|", 0)[2];
                    var3_11.ai = new g();
                    super.a(var3_11.ai, (String)var6_32);
                    var3_11.cH = var5_20.c;
                    var3_11.bC = null;
                    break;
                }
                case 9: {
                    this.ae();
                    break;
                }
                case 10: {
                    var1_2 = this;
                    if (var1_2.ak == -1) break;
                    var1_2.cl = true;
                    var1_2.A();
                    break;
                }
                case 11: {
                    this.al();
                    break;
                }
                case 16: {
                    this.ak();
                    break;
                }
                case 15: {
                    this.aa();
                    break;
                }
                case 12: {
                    this.ac();
                    break;
                }
                case 13: {
                    this.ab();
                    break;
                }
                case 18: {
                    this.am();
                    break;
                }
                case 19: {
                    this.as();
                    break;
                }
                case 20: {
                    this.au();
                }
            }
        }
        var1_3 = 0;
        while (var1_3 < c.l.size()) {
            ((c)c.l.elementAt(var1_3)).a();
            ++var1_3;
        }
        this.ap();
    }

    private void aa() {
        if (this.ak < -1) {
            return;
        }
        if (this.bI) {
            cj.a().a(this.n, (byte)this.ak);
            return;
        }
        Object object = new eq("");
        ((eq)object).addElement(new ae(ch.aN[0], this, 9999, (cf)this.W.elementAt(this.ak)));
        main.a.F.a((eq)object, this.b, (this.ak + 1) * this.aD - this.g + this.af);
        cf cf2 = (cf)this.W.elementAt(this.ak);
        object = this;
        String string = "|0|1|" + cf2.e;
        string = String.valueOf(string) + "\n|1|Top " + cf2.h;
        string = String.valueOf(string) + "\n|1|" + cf2.f;
        string = String.valueOf(string) + "\n|2|" + cf2.i;
        ((dl)object).ai = new g();
        super.a(((dl)object).ai, string);
        ((dl)object).bL = new int[]{cf2.a, cf2.d, cf2.c};
        ((dl)object).bC = null;
        ((dl)object).cH = null;
    }

    private void ab() {
        Object object;
        if (this.B == 0 && this.equals(main.a.G)) {
            this.af();
            return;
        }
        if (this.B == 0 && this.equals(main.a.H) || this.B == 2) {
            this.bC = this.equals(main.a.H) ? (ar)main.a.H.V.elementAt(this.ak) : (ar)main.a.G.V.elementAt(this.ak);
            dq.c("toi day select= " + this.ak);
            object = new eq("");
            ((eq)object).addElement(new ae(ch.bk, this, 8000, this.bC));
            if (this.bC != null) {
                main.a.F.a((eq)object, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                this.b(this.bC);
            } else {
                this.ai = null;
            }
        }
        if (this.B == 1) {
            if (this.ak == this.O - 3) {
                if (this.aS) {
                    return;
                }
                object = this;
                if (((dl)object).o == null) {
                    ((dl)object).o = new el();
                    ((dl)object).o.a.b = main.a.B - 35 - el.b().a.d;
                    ((dl)object).o.a();
                    ((dl)object).o.c = main.a.G;
                }
                ((dl)object).o.h = ch.ef;
                ((dl)object).o.a.i = ch.eg;
                ((dl)object).o.g = "";
                ((dl)object).o.b = true;
                ((dl)object).o.a.c(1);
                ((dl)object).o.a.b(10);
                if (main.a.e) {
                    ((dl)object).o.a.b();
                }
            } else if (this.ak == this.O - 2) {
                if (!this.aT) {
                    boolean bl2 = this.aS = !this.aS;
                    if (this.aS) {
                        cj.a().a((byte)5, -1, (byte)-1, -1);
                    } else {
                        this.A();
                        da.a();
                        cj.a().a((byte)3, -1, (byte)-1, -1);
                    }
                } else {
                    this.aT = false;
                }
            } else if (this.ak == this.O - 1) {
                if (this.aS && !this.aT && this.m) {
                    main.a.a(ch.ex, new ae(ch.bo, this, 7002, null), new ae(ch.bp, this, 4005, null));
                }
            } else {
                if (this.aS) {
                    return;
                }
                this.bC = (ar)main.a.G.U.elementAt(this.ak);
                object = new eq("");
                ((eq)object).addElement(new ae(ch.bk, this, 8000, this.bC));
                if (this.bC != null) {
                    main.a.F.a((eq)object, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                    this.b(this.bC);
                } else {
                    this.ai = null;
                }
            }
        }
        if (main.a.e) {
            this.ak = -1;
        }
    }

    private void ac() {
        if (this.B == 0) {
            if (this.ak == -1) {
                return;
            }
            if (this.k.size() == 0) {
                return;
            }
            if (this.ak == this.k.size()) {
                this.cc = -1;
                this.ak = main.a.e ? -1 : 0;
                da.a();
                cj.a().a((byte)1, this.k);
                return;
            }
            if (this.ak > this.k.size() - 1) {
                return;
            }
            this.bC = (ar)main.a.G.k.elementAt(this.ak);
            eq eq2 = new eq("");
            eq2.addElement(new ae(ch.eb, this, 6001, this.bC));
            if (this.bC != null) {
                main.a.F.a(eq2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                this.b(this.bC);
            } else {
                this.ai = null;
            }
        }
        if (this.B == 1) {
            this.af();
        }
    }

    private void ad() {
        this.bC = null;
        if (this.ak < 0) {
            return;
        }
        eq eq2 = new eq("");
        if (this.B < this.aY.length - (main.a.H != null ? 0 : 1) && this.A != 17) {
            this.bC = co.m().aX[this.B][this.ak];
            if (this.bC != null) {
                if (this.bC.y) {
                    if (this.bC.s > 0) {
                        eq2.addElement(new ae(String.valueOf(ch.ez) + "\n" + dq.b((long)this.bC.s), this, 3005, this.bC));
                    }
                } else if (this.bJ == 4) {
                    eq2.addElement(new ae(ch.cr, this, 30001, this.bC));
                    eq2.addElement(new ae(ch.bl, this, 30002, this.bC));
                    eq2.addElement(new ae(ch.cs, this, 30003, this.bC));
                } else if (this.bC.n == 0 && this.bC.p == 0) {
                    if (this.bC.j != 0L) {
                        eq2.addElement(new ae(String.valueOf(ch.ey) + "\n" + dq.a(this.bC.j) + " \n" + ch.fl, this, 3004, this.bC));
                    } else {
                        eq2.addElement(new ae(String.valueOf(ch.cr) + "\n" + ch.er, this, 3000, this.bC));
                    }
                } else if (this.bJ == 8) {
                    if (this.bC.n > 0) {
                        eq2.addElement(new ae(String.valueOf(ch.ez) + "\n" + dq.b((long)this.bC.n) + "\n" + ch.bF, this, 30001, this.bC));
                    }
                    if (this.bC.p > 0) {
                        eq2.addElement(new ae(String.valueOf(ch.ez) + "\n" + dq.b((long)this.bC.p) + "\n" + ch.bG, this, 30002, this.bC));
                    }
                } else if (this.bJ != 2) {
                    if (this.bC.n > 0) {
                        eq2.addElement(new ae(String.valueOf(ch.ez) + "\n" + dq.b((long)this.bC.n) + "\n" + ch.bF, this, 3000, this.bC));
                    }
                    if (this.bC.p > 0) {
                        eq2.addElement(new ae(String.valueOf(ch.ez) + "\n" + dq.b((long)this.bC.p) + "\n" + ch.bG, this, 3001, this.bC));
                    }
                } else {
                    if (this.bC.n != -1) {
                        eq2.addElement(new ae(String.valueOf(ch.ez) + "\n" + dq.b((long)this.bC.n) + "\n" + ch.bF, this, 10016, this.bC));
                    }
                    if (this.bC.p != -1) {
                        eq2.addElement(new ae(String.valueOf(ch.ez) + "\n" + dq.b((long)this.bC.p) + "\n" + ch.bG, this, 10017, this.bC));
                    }
                }
            }
        } else if (this.bJ == 0) {
            if (this.ak == 0) {
                this.a(co.m().aV.length + co.m().aT.length, false, false);
            } else {
                this.bC = null;
                if (!dl.a(this.ak, this.bO, co.m().aV)) {
                    ar ar2 = co.m().aT[dl.b(this.ak, this.bO, co.m().aV)];
                    if (ar2 != null) {
                        this.bC = ar2;
                    }
                } else {
                    ar ar3 = co.m().aV[dl.c(this.ak, this.bO)];
                    if (ar3 != null) {
                        this.bC = ar3;
                    }
                }
                if (this.bC != null) {
                    eq2.addElement(new ae(ch.ee, this, 3002, this.bC));
                }
            }
        } else {
            this.bC = this.A == 17 ? co.m().aX[4][this.ak] : co.m().aX[this.B][this.ak];
            if (this.bC.v == 0) {
                if (this.bC.a(87)) {
                    eq2.addElement(new ae(ch.fK, this, 10013, this.bC));
                } else {
                    eq2.addElement(new ae(ch.fJ, this, 10012, this.bC));
                }
            } else if (this.bC.v == 1) {
                eq2.addElement(new ae(ch.fN, this, 10014, this.bC));
                eq2.addElement(new ae(ch.fR, this, 10018, this.bC));
            } else if (this.bC.v == 2) {
                eq2.addElement(new ae(ch.fO, this, 10015, this.bC));
            }
        }
        if (this.bC != null) {
            co.m().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            main.a.F.a(eq2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
            this.b(this.bC);
            return;
        }
        this.ai = null;
    }

    private void ae() {
        if (this.ak < 0) {
            return;
        }
        if (co.m().aS[this.ak].d && !co.m().aS[this.ak].e) {
            if (!main.a.e) {
                cj.a().b(this.ak);
                return;
            }
            if (main.a.p > this.ae + this.ag - 40) {
                cj.a().b(this.ak);
            }
        }
    }

    private void af() {
        dq.c("fire inventory");
        if (co.m().T == 14) {
            main.a.a(ch.eA);
            return;
        }
        if (this.ak == -1) {
            return;
        }
        if (this.ak == 0) {
            this.a(co.m().aV.length + co.m().aT.length, false, false);
            return;
        }
        this.bC = null;
        eq eq2 = new eq("");
        if (!dl.a(this.ak, this.bO, co.m().aV)) {
            ar ar2 = co.m().aT[dl.b(this.ak, this.bO, co.m().aV)];
            if (ar2 != null) {
                this.bC = ar2;
                if (main.a.G.A == 12) {
                    eq2.addElement(new ae(ch.eB, this, 6000, this.bC));
                } else if (main.a.G.A == 13) {
                    eq2.addElement(new ae(ch.eC, this, 7000, this.bC));
                } else if (ar2.b()) {
                    eq2.addElement(new ae(ch.bn, this, 2000, this.bC));
                    if (co.m().cj) {
                        eq2.addElement(new ae(ch.ed, this, 2005, this.bC));
                    }
                } else {
                    eq2.addElement(new ae(ch.bn, this, 2001, this.bC));
                }
            }
        } else {
            ar ar3 = co.m().aV[dl.c(this.ak, this.bO)];
            if (ar3 != null) {
                this.bC = ar3;
                eq2.addElement(new ae(ch.eb, this, 2002, this.bC));
            }
        }
        if (this.bC != null) {
            co.m().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            if (main.a.G.A != 12 && main.a.G.A != 13) {
                if (this.bH == 0) {
                    eq2.addElement(new ae(ch.ec, this, 2003, this.bC));
                }
                if (this.bH == 1) {
                    eq2.addElement(new ae(ch.ee, this, 3002, this.bC));
                }
            }
            main.a.F.a(eq2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
            this.b(this.bC);
            return;
        }
        this.ai = null;
    }

    private void ag() {
        this.A();
        if (do.f == null || do.f.size() == 0) {
            cj.a().b(0, -1);
        }
        do.c().a();
    }

    private void ah() {
        block36: {
            block35: {
                if (this.ak < 0) {
                    return;
                }
                if (es.a && this.ak == G.length - 1) {
                    cj.a().B();
                    return;
                }
                if (co.m().cj) break block35;
                switch (this.ak) {
                    case 0: {
                        this.ag();
                        return;
                    }
                    case 1: {
                        cj.a().j(54);
                        return;
                    }
                    case 2: {
                        this.ai();
                        return;
                    }
                    case 3: {
                        cj.a().b((byte)0, (byte)-1);
                        da.a();
                        return;
                    }
                    case 4: {
                        if (co.m().T == 14) {
                            main.a.a(ch.eA);
                            return;
                        }
                        cj.a().m();
                        return;
                    }
                    case 5: {
                        main.a.l();
                        if (co.m().ab() < 5) {
                            main.a.a(ch.eD);
                            return;
                        }
                        if (this.o == null) {
                            this.o = new el();
                            this.o.a.b = main.a.B - 35 - el.b().a.d;
                            this.o.a();
                            this.o.c = main.a.G;
                        }
                        this.o.h = ch.eE;
                        this.o.a.i = ch.br;
                        this.o.g = "";
                        this.o.b = true;
                        this.o.a.c(0);
                        if (main.a.e) {
                            this.o.a.b();
                            return;
                        }
                        break block36;
                    }
                    case 6: {
                        this.at();
                        return;
                    }
                    case 7: {
                        this.ar();
                        return;
                    }
                    case 8: {
                        main.a.I.g();
                        return;
                    }
                    case 9: {
                        if (main.a.I.n) {
                            es.a();
                            es.W();
                            return;
                        }
                        break block36;
                    }
                    default: {
                        return;
                    }
                }
            }
            switch (this.ak) {
                case 0: {
                    this.ag();
                    return;
                }
                case 1: {
                    cj.a().j(54);
                    return;
                }
                case 2: {
                    this.ai();
                    return;
                }
                case 3: {
                    dl dl2 = this;
                    da.a();
                    cj.a().y();
                    dl2.bM = 20;
                    return;
                }
                case 4: {
                    cj.a().b((byte)0, (byte)-1);
                    da.a();
                    return;
                }
                case 5: {
                    if (co.m().T == 14) {
                        main.a.a(ch.eA);
                        return;
                    }
                    cj.a().m();
                    return;
                }
                case 6: {
                    main.a.l();
                    if (co.m().ab() < 5) {
                        main.a.a(ch.eD);
                        return;
                    }
                    if (this.o == null) {
                        this.o = new el();
                        this.o.a.b = main.a.B - 35 - el.b().a.d;
                        this.o.a();
                        this.o.c = main.a.G;
                    }
                    this.o.h = ch.eE;
                    this.o.a.i = ch.br;
                    this.o.g = "";
                    this.o.b = true;
                    this.o.a.c(0);
                    if (!main.a.e) break;
                    this.o.a.b();
                    return;
                }
                case 7: {
                    this.at();
                    return;
                }
                case 8: {
                    this.ar();
                    return;
                }
                case 9: {
                    main.a.I.g();
                    return;
                }
                case 10: {
                    if (!main.a.I.n) break;
                    es.a();
                    es.W();
                }
            }
        }
    }

    private void ai() {
        this.O = at.size();
        this.aD = 24;
        this.ak = main.a.e ? -1 : 0;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.A = 23;
        this.c(0);
    }

    private void aj() {
        this.o.h = ch.dA;
        this.o.a.i = ch.dA;
        this.o.g = "";
        this.o.b = true;
        this.o.a.e = true;
        this.o.a.c(0);
        if (main.a.e) {
            this.o.a.b();
        }
    }

    public final void D() {
        if (this.j == null) {
            this.j = new dw();
        }
        this.j.m = this.o.a.e();
        this.j.a(false);
        this.o.b = false;
    }

    private void b(db db2) {
        String string = "|0|1|" + db2.c.au;
        string = String.valueOf(string) + "\n";
        string = db2.e ? String.valueOf(string) + "|4|1|" + ch.cQ : String.valueOf(string) + "|3|1|" + ch.cR;
        string = String.valueOf(string) + "\n--";
        string = String.valueOf(string) + "\n|5|" + ch.dd + ": " + db2.a;
        this.ai = new g();
        this.a(this.ai, string);
        this.cH = db2.c;
        this.bC = null;
    }

    private void ak() {
        if (this.ak < 0) {
            return;
        }
        if (this.X.size() == 0) {
            return;
        }
        eq eq2 = new eq("");
        this.cG = this.ak;
        eq2.addElement(new ae(ch.bs, this, 10000, (db)this.X.elementAt(this.cG)));
        eq2.addElement(new ae(ch.bl, this, 10001, (db)this.X.elementAt(this.cG)));
        main.a.F.a(eq2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
        this.b((db)this.X.elementAt(this.ak));
    }

    private void al() {
        if (this.ak < 0) {
            return;
        }
        if (this.T.size() == 0) {
            return;
        }
        eq eq2 = new eq("");
        this.cG = this.ak;
        eq2.addElement(new ae(ch.br, this, 8001, (db)this.T.elementAt(this.cG)));
        eq2.addElement(new ae(ch.bl, this, 8002, (db)this.T.elementAt(this.cG)));
        eq2.addElement(new ae(ch.gq, this, 8004, (db)this.T.elementAt(this.cG)));
        main.a.F.a(eq2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
        this.b((db)this.T.elementAt(this.ak));
    }

    private void am() {
        if (this.ak < 0) {
            return;
        }
        eq eq2 = new eq("");
        this.cG = this.ak;
        eq2.addElement(new ae(ch.bT, this, 10030, null));
        eq2.addElement(new ae(ch.bC, this, 10031, null));
        main.a.F.a(eq2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
    }

    private void d(int n2) {
        String string = "";
        int n3 = 0;
        if (this.ak == 0) {
            n3 = co.m().cU + 1000;
        }
        if (this.ak == 1) {
            n3 = co.m().cV + 1000;
        }
        if (this.ak == 2) {
            n3 = co.m().cT * co.m().dg;
        }
        if (this.ak == 3) {
            n3 = 500000 + co.m().cW * 100000;
        }
        string = String.valueOf(string) + "|5|2|" + ch.bn + " " + n3 + " " + ch.fl;
        if (n2 == 0) {
            string = String.valueOf(string) + "\n|5|2|" + ch.fp;
        }
        if (n2 == 1) {
            string = String.valueOf(string) + "\n|5|2|" + ch.fq;
        }
        if (n2 == 2) {
            string = String.valueOf(string) + "\n|5|2|" + ch.fr;
        }
        if (n2 == 3) {
            string = String.valueOf(string) + "\n|5|2|" + ch.fr;
        }
        this.bC = null;
        this.bL = null;
        this.cH = null;
        this.bK = -1;
        this.ai = new g();
        this.a(this.ai, string);
    }

    private void an() {
        if (this.ak == -1) {
            return;
        }
        dq.c("FIRE ZONE");
        this.cI = true;
        main.a.G.A();
    }

    public final void a(int n2, int n3) {
        this.ai.d[this.ai.d.length - 1] = String.valueOf(ch.dc) + " " + n2 + "/" + n3;
    }

    private void ao() {
        if (this.ak < 0) {
            return;
        }
        this.bC = null;
        eq eq2 = new eq("");
        if (this.B == 0 && !this.equals(main.a.H)) {
            if (this.ak == 0) {
                this.a(co.m().aU.length, false, true);
            } else {
                byte by2 = (byte)dl.c(this.ak, this.bO);
                ar ar2 = co.m().aU[by2];
                if (ar2 != null) {
                    if (this.aj) {
                        eq2.addElement(new ae(ch.eb, this, 1000, ar2));
                        eq2.addElement(new ae(ch.bn, this, 2010, ar2));
                    } else if (ar2.b()) {
                        eq2.addElement(new ae(ch.eb, this, 1000, ar2));
                    } else {
                        eq2.addElement(new ae(ch.eb, this, 1000, ar2));
                    }
                    this.bC = ar2;
                }
            }
        }
        if (this.B == 1 || this.equals(main.a.H)) {
            if (this.ak == 0) {
                this.a(co.m().aV.length + co.m().aT.length, true, false);
            } else {
                Object object = co.m().aV;
                boolean bl2 = dl.a(this.ak, this.bO, object);
                if (!bl2) {
                    byte by3 = (byte)dl.b(this.ak, this.bO, object);
                    ar ar3 = co.m().aT[by3];
                    if (ar3 != null) {
                        eq2.addElement(new ae(ch.cF, this, 1001, ar3));
                        if (ar3.b()) {
                            eq2.addElement(new ae(ch.bn, this, 2000, ar3));
                        } else {
                            eq2.addElement(new ae(ch.bn, this, 2001, ar3));
                        }
                        this.bC = ar3;
                    }
                } else {
                    object = co.m().aV[dl.c(this.ak, this.bO)];
                    if (object != null) {
                        eq2.addElement(new ae(ch.cG, this, 1002, object));
                        this.bC = object;
                    }
                }
            }
        }
        if (this.bC != null) {
            co.m().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            if (this.aj) {
                eq2.addElement(new ae(ch.ec, this, 2011, this.bC));
            }
            main.a.F.a(eq2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
            this.b(this.bC);
        } else {
            this.ai = null;
        }
        this.aI = this.O * this.aD - this.ah;
    }

    public final void a(byte by2, String string, byte by3, byte by4) {
        main.a.l();
        at at2 = new at();
        new at().c = by2;
        at2.a = by4;
        at2.b = by3;
        main.a.a(string, new ae(ch.bo, this, 2004, at2), new ae(ch.bp, this, 4005, null));
    }

    public final void a(byte by2, String string, short s2) {
        at at2 = new at();
        new at().c = by2;
        at2.a = s2;
        main.a.a(string, new ae(ch.bo, this, 3003, at2), new ae(ch.bp, this, 4005, null));
    }

    public final void a(int n2, Object object) {
        a a2;
        a a3;
        ar ar2;
        int n3;
        Object object2;
        if (n2 == 9999) {
            object2 = (cf)object;
            cj.a().w(((cf)object2).g);
        }
        if (n2 == 170391) {
            ea.a();
            if (eh.b > 1) {
                ea.a("levelScreenKN", 1);
            } else {
                ea.a("levelScreenKN", 0);
            }
            GameMidlet.g.a();
        }
        if (n2 == 6001) {
            object2 = (ar)object;
            ((ar)object).f = false;
            main.a.G.k.removeElement(object2);
            if (main.a.G.B == 0) {
                main.a.G.o();
            }
        }
        if (n2 == 6000) {
            object2 = (ar)object;
            n3 = 0;
            while (n3 < main.a.G.k.size()) {
                ar2 = (ar)main.a.G.k.elementAt(n3);
                if (ar2.b.a == ((ar)object2).b.a) {
                    main.a.a(ch.em);
                    return;
                }
                ++n3;
            }
            ((ar)object2).f = true;
            main.a.G.k.addElement(object2);
            if (main.a.G.B == 0) {
                main.a.G.o();
            }
        }
        if (n2 == 7000) {
            if (this.aS) {
                main.a.a(ch.en);
                return;
            }
            object2 = (ar)object;
            n3 = 0;
            while (n3 < main.a.G.U.size()) {
                ar2 = (ar)main.a.G.U.elementAt(n3);
                if (ar2.g == ((ar)object2).g) {
                    main.a.a(ch.em);
                    return;
                }
                ++n3;
            }
            if (((ar)object2).h > 1) {
                dl dl2 = this;
                if (dl2.o == null) {
                    dl2.o = new el();
                    dl2.o.a.b = main.a.B - 35 - el.b().a.d;
                    dl2.o.a();
                    dl2.o.c = main.a.G;
                }
                dl2.o.h = ch.ej;
                dl2.o.a.i = ch.ek;
                dl2.o.g = "";
                dl2.o.b = true;
                dl2.o.a.c(1);
                if (main.a.e) {
                    dl2.o.a.b();
                }
                return;
            }
            ((ar)object2).f = true;
            ar ar3 = new ar();
            new ar().b = ((ar)object2).b;
            ar3.a = ((ar)object2).a;
            ar3.g = ((ar)object2).g;
            main.a.G.U.addElement(ar3);
            cj.a().a((byte)2, -1, (byte)ar3.g, ar3.h);
        }
        if (n2 == 7001) {
            object2 = (ar)object;
            ((ar)object).f = false;
            main.a.G.U.removeElement(object2);
            if (main.a.G.B == 1) {
                main.a.G.a(true);
            }
            cj.a().a((byte)4, -1, (byte)((ar)object2).g, -1);
        }
        if (n2 == 7002) {
            this.aT = true;
            main.a.l();
            cj.a().a((byte)7, -1, (byte)-1, -1);
            this.A();
        }
        if (n2 == 8003) {
            object2 = (db)object;
            cj.a().a((byte)1, ((db)object2).c.V);
        }
        if (n2 == 8002) {
            object2 = (db)object;
            cj.a().a((byte)2, ((db)object2).c.V);
        }
        if (n2 == 8004) {
            object2 = (db)object;
            cj.a().a(((db)object2).c.V);
        }
        if (n2 == 8001) {
            dq.c("chat player");
            object2 = (db)object;
            if (this.o == null) {
                this.o = new el();
                this.o.a.b = main.a.B - 35 - el.b().a.d;
                this.o.a();
                this.o.c = main.a.G;
            }
            this.o.h = ch.cT;
            this.o.a.i = String.valueOf(ch.cU) + " " + ((db)object2).c.au;
            this.o.g = "";
            this.o.b = true;
            this.o.a.e = true;
            this.o.a.c(0);
            if (main.a.e) {
                this.o.a.b();
            }
        }
        if (n2 == 1000) {
            cj.a().a((byte)0, (byte)dl.c(this.ak, this.bO));
        }
        if (n2 == 1001) {
            byte by2 = (byte)dl.b(this.ak, this.bO, co.m().aV);
            cj.a().a(bj, by2);
        }
        if (n2 == 1003) {
            this.A();
        }
        if (n2 == 1002) {
            cj.a().a(bk, (byte)dl.c(this.ak, this.bO));
        }
        if (n2 == 2011) {
            cj.a().a((byte)1, (byte)2, (byte)dl.c(this.ak, this.bO), (short)-1);
        }
        if (n2 == 2010) {
            cj.a().a((byte)0, (byte)2, (byte)dl.c(this.ak, this.bO), (short)-1);
            ar ar4 = (ar)object;
            if (ar4 != null && (ar4.b.a == 193 || ar4.b.a == 194)) {
                main.a.G.A();
            }
        }
        if (n2 == 2000) {
            ar[] arArray = co.m().aV;
            byte by3 = (byte)dl.b(this.ak, this.bO, arArray);
            cj.a().a(bl, by3);
        }
        if (n2 == 2001) {
            dq.c("use item");
            ar ar5 = (ar)object;
            boolean bl2 = dl.a(this.ak, this.bO, co.m().aV);
            byte by4 = !bl2 ? (byte)dl.b(this.ak, this.bO, co.m().aV) : (byte)dl.c(this.ak, this.bO);
            cj.a().a((byte)0, (byte)(!bl2 ? 1 : 0), by4, (short)-1);
            if (ar5.b.a == 193 || ar5.b.a == 194) {
                main.a.G.A();
            }
        }
        if (n2 == 2002) {
            cj.a().a(bm, (byte)dl.c(this.ak, this.bO));
        }
        if (n2 == 2003) {
            dq.c("remove item");
            boolean bl3 = dl.a(this.ak, this.bO, co.m().aV);
            byte by5 = !bl3 ? (byte)dl.b(this.ak, this.bO, co.m().aV) : (byte)dl.c(this.ak, this.bO);
            cj.a().a((byte)1, (byte)(!bl3 ? 1 : 0), by5, (short)-1);
        }
        if (n2 == 2004) {
            main.a.l();
            at at2 = (at)object;
            byte by6 = (byte)at2.b;
            byte by7 = (byte)at2.a;
            cj.a().a((byte)(at2.c == 0 ? 3 : 2), by6, by7, (short)-1);
        }
        if (n2 == 2005) {
            byte by8 = (byte)dl.b(this.ak, this.bO, co.m().aV);
            cj.a().a(bn, by8);
        }
        if (n2 == 2006) {
            ar[] cfr_ignored_0 = co.n().aV;
            byte by9 = (byte)this.ak;
            cj.a().a(bo, by9);
        }
        if (n2 == 30001) {
            dq.c("nhan do");
            cj.a().a((byte)0, this.ak, 0);
        }
        if (n2 == 30002) {
            dq.c("xoa do");
            cj.a().a((byte)1, this.ak, 0);
        }
        if (n2 == 30003) {
            dq.c("nhan tat");
            cj.a().a((byte)2, this.ak, 0);
        }
        if (n2 == 3000) {
            dq.c("mua do");
            ar ar6 = (ar)object;
            cj.a().a((byte)0, (int)ar6.b.a, 0);
        }
        if (n2 == 3001) {
            ar ar7 = (ar)object;
            main.a.L.b();
            cj.a().a((byte)1, (int)ar7.b.a, 0);
        }
        if (n2 == 3002) {
            main.a.l();
            boolean bl4 = dl.a(this.ak, this.bO, co.m().aV);
            byte by10 = !bl4 ? (byte)dl.b(this.ak, this.bO, co.m().aV) : (byte)dl.c(this.ak, this.bO);
            cj.a().a((byte)0, (byte)(!bl4 ? 1 : 0), by10);
        }
        if (n2 == 3003) {
            main.a.l();
            at at3 = (at)object;
            cj.a().a((byte)1, (byte)at3.c, (short)at3.a);
        }
        if (n2 == 3004) {
            ar ar8 = (ar)object;
            cj.a().a((byte)3, (int)ar8.b.a, 0);
        }
        if (n2 == 3005) {
            dq.c("mua do");
            ar ar9 = (ar)object;
            cj.a().a((byte)3, (int)ar9.b.a, 0);
        }
        if (n2 == 4000 && (a3 = (a)object) != null) {
            main.a.l();
            cj.a().a(2, null, a3.a);
        }
        if (n2 == 4001 && (a2 = (a)object) != null) {
            da.a();
            this.ao = ch.aD;
            cj.a().e(a2.a);
        }
        if (n2 == 4005) {
            main.a.l();
        }
        if (n2 == 4007) {
            main.a.l();
        }
        if (n2 == 4006) {
            c c2 = (c)object;
            cj.a().d(c2.a);
        }
        if (n2 == 5001) {
            e e2 = (e)object;
            cj.a().b(e2.a, (byte)0);
        }
        if (n2 == 5002) {
            e e3 = (e)object;
            cj.a().b(e3.a, (byte)1);
        }
        if (n2 == 5003) {
            e e4 = (e)object;
            cj.a().b(e4.a, (byte)2);
        }
        if (n2 == 5004) {
            e e5 = (e)object;
            cj.a().b(e5.a, (byte)-1);
        }
        if (n2 == 9000) {
            cj.a().a(this.ak, 1);
            main.a.l();
            da.a();
        }
        if (n2 == 9006) {
            cj.a().a(this.ak, 10);
            main.a.l();
            da.a();
        }
        if (n2 == 9007) {
            cj.a().a(this.ak, 100);
            main.a.l();
            da.a();
        }
        if (n2 == 9002) {
            bt bt2 = (bt)object;
            if (bt2.a.c()) {
                main.a.a(ch.b);
            } else {
                main.a.a(String.valueOf(ch.eV) + bt2.d + ch.eW + bt2.l + ch.eX);
            }
        }
        if (n2 == 9003) {
            if (main.a.e) {
                cw.l();
                cw.a((bx)object);
            } else {
                cw.l();
                cw.b((bx)object);
            }
        }
        if (n2 == 9004) {
            bt bt3 = (bt)object;
            if (bt3.a.c()) {
                main.a.a(ch.a);
            } else {
                main.a.a(String.valueOf(ch.eV) + bt3.d + ch.eW + bt3.l + ch.eX);
            }
        }
        if (n2 == 10000) {
            db db2 = (db)object;
            cj.a().b((byte)1, db2.c.V);
            main.a.G.z();
        }
        if (n2 == 10001) {
            db db3 = (db)object;
            cj.a().b((byte)2, db3.c.V);
            da.a();
        }
        if (n2 == 10012) {
            if (this.o == null) {
                this.o = new el();
                this.o.a.b = main.a.B - 35 - el.b().a.d;
                this.o.a();
                this.o.c = main.a.H == null ? main.a.G : main.a.H;
            }
            this.o.a.c(1);
            this.o.a.a("");
            if (this.bC.h == 1) {
                this.o.h = ch.fL;
                this.o.a.i = ch.eg;
            } else {
                this.o.h = String.valueOf(ch.ek) + " ";
                this.o.a.i = ch.ek;
            }
            this.o.a.b(10);
            this.o.g = "";
            this.o.b = true;
            this.o.a.c(1);
            if (main.a.e) {
                this.o.a.b();
            }
        }
        if (n2 == 10013) {
            if (this.o == null) {
                this.o = new el();
                this.o.a.b = main.a.B - 35 - el.b().a.d;
                this.o.a();
                this.o.c = main.a.H == null ? main.a.G : main.a.H;
            }
            this.o.a.c(1);
            this.o.a.a("");
            if (this.bC.h == 1) {
                this.o.h = ch.fM;
                this.o.a.i = ch.eg;
            } else {
                this.o.h = String.valueOf(ch.ek) + "  ";
                this.o.a.i = ch.ek;
            }
            this.o.g = "";
            this.o.b = true;
            this.o.a.c(1);
            if (main.a.e) {
                this.o.a.b();
            }
        }
        if (n2 == 10014) {
            ar ar10 = (ar)object;
            cj.a().a((byte)1, ar10.d, (byte)-1, -1, -1);
            da.a();
        }
        if (n2 == 10015) {
            ar ar11 = (ar)object;
            cj.a().a((byte)2, ar11.d, (byte)-1, -1, -1);
            da.a();
        }
        if (n2 == 10016) {
            ar ar12 = (ar)object;
            cj.a().a((byte)3, ar12.d, (byte)0, ar12.n, -1);
            da.a();
        }
        if (n2 == 10017) {
            ar ar13 = (ar)object;
            cj.a().a((byte)3, ar13.d, (byte)1, ar13.p, -1);
            da.a();
        }
        if (n2 == 10018) {
            ar ar14 = (ar)object;
            cj.a().a((byte)5, ar14.d, (byte)-1, -1, -1);
            da.a();
        }
        if (n2 == 10019) {
            eb.a().f();
            ea.a(ea.e, "");
            ea.a(ea.f, "");
            main.a.I.b.a("");
            main.a.I.a.a("");
            main.a.I.n = false;
            main.a.ao.a();
            main.a.l();
            this.A();
        }
        if (n2 == 10020) {
            main.a.l();
        }
        if (n2 == 10030) {
            cj.a().b((byte)1, (byte)this.ak);
            main.a.G.z();
        }
        if (n2 == 10031) {
            eb.a().f();
        }
        if (n2 == 11000) {
            cj.a().a((byte)0, this.bC.d, (byte)1, this.bC.t, 1);
            main.a.l();
        }
        if (n2 == 11001) {
            cj.a().a((byte)0, this.bC.d, (byte)1, this.bC.t, this.bC.i);
            main.a.l();
        }
        if (n2 == 11002) {
            this.o.b = false;
            main.a.l();
        }
    }

    public final void a(String object, String object2) {
        if (this.o.a.e() == null || this.o.a.e().equals("") || ((String)object).equals("") || object == null) {
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(ch.dw)) {
            da.a();
            this.o.b = false;
            cj.a().a((String)object);
            return;
        }
        if (this.o.h.equals(ch.dy)) {
            da.a();
            this.o.b = false;
            cj.a().a(0, (String)object, -1);
            return;
        }
        if (this.o.h.equals(ch.dz)) {
            if (this.o.a.e() == "") {
                cw.aO.a(ch.dJ, 0);
                return;
            }
            if (this.j == null) {
                this.j = new dw();
            }
            this.j.m = this.o.a.e();
            this.j.a(false);
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(ch.dA)) {
            if (this.o.a.e() == "") {
                cw.aO.a(ch.dK, 0);
                return;
            }
            cj.a().a((byte)4, co.m().aw.b, this.o.a.e());
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(ch.gb)) {
            try {
                int n2 = Integer.parseInt(this.o.a.e());
                this.o.b = false;
                this.o.a.c(0);
                this.A();
                if (this.o.a.e().length() != 6 || this.o.a.e().equals("")) {
                    main.a.a(ch.gc);
                    return;
                }
                cj.a().x(n2);
                this.o.b = false;
                this.o.a.c(0);
                this.A();
                return;
            }
            catch (Exception exception) {
                main.a.a(ch.S);
                return;
            }
        }
        if (this.o.h.equals(ch.eE)) {
            if (this.o.a.e().equals("")) {
                return;
            }
            cj.a().e(this.o.a.e());
            this.o.b = false;
            this.A();
            return;
        }
        if (this.o.h.equals(ch.cT)) {
            this.o.b = false;
            object2 = null;
            if (this.A == 8) {
                object2 = (db)this.bG.elementAt(this.cG);
            } else if (this.A == 11) {
                object2 = (db)this.T.elementAt(this.cG);
            }
            if (((db)object2).c.V == co.m().V) {
                return;
            }
            cj.a().a((String)object, ((db)object2).c.V);
            return;
        }
        if (this.o.h.equals(ch.ej)) {
            int n3;
            try {
                n3 = Integer.parseInt(this.o.a.e());
            }
            catch (Exception exception) {
                main.a.a(ch.el);
                this.o.b = false;
                this.o.a.c(0);
                return;
            }
            if (n3 <= 0 || n3 > this.bC.h) {
                main.a.a(ch.el);
                this.o.b = false;
                this.o.a.c(0);
                return;
            }
            this.bC.f = true;
            object = new ar();
            new ar().b = this.bC.b;
            ((ar)object).h = n3;
            ((ar)object).g = this.bC.g;
            ((ar)object).a = this.bC.a;
            main.a.G.U.addElement(object);
            cj.a().a((byte)2, -1, (byte)((ar)object).g, ((ar)object).h);
            this.o.b = false;
            this.o.a.c(0);
            return;
        }
        if (this.o.h == ch.ef) {
            int n4;
            try {
                n4 = Integer.parseInt(this.o.a.e());
            }
            catch (Exception exception) {
                main.a.a(ch.eh);
                this.o.b = false;
                this.o.a.c(0);
                return;
            }
            if ((long)n4 > co.m().aH) {
                main.a.a(ch.ei);
                this.o.b = false;
                this.o.a.c(0);
                return;
            }
            this.aR = n4;
            cj.a().a((byte)2, -1, (byte)-1, n4);
            this.o.b = false;
            this.o.a.c(0);
            return;
        }
        if (this.o.h.equals(ch.fL)) {
            try {
                cj.a().a((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.a.e()), 1);
            }
            catch (Exception exception) {
                main.a.a(ch.eh);
            }
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(ch.fL) + " ")) {
            try {
                cj.a().a((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.a.e()), this.bC.i);
            }
            catch (Exception exception) {
                main.a.a(ch.eh);
            }
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(ch.fM)) {
            this.e(0);
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(ch.fM) + "  ")) {
            this.e(1);
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(ch.ek) + " ")) {
            this.bC.i = Integer.parseInt(this.o.a.e());
            if (this.bC.i > this.bC.h) {
                main.a.a(ch.el);
                return;
            }
            this.cJ = true;
            this.o.b = false;
            return;
        }
        if (this.o.h.equals(String.valueOf(ch.ek) + "  ")) {
            this.bC.i = Integer.parseInt(this.o.a.e());
            if (this.bC.i > this.bC.h) {
                main.a.a(ch.el);
                return;
            }
            this.cK = true;
            this.o.b = false;
        }
    }

    public final void B() {
        this.o.a.c(0);
    }

    public final void b(int n2) {
        this.cX = n2;
        this.cM = 90;
        if (this.cX == 0) {
            this.cQ = 5;
            this.cO = 90;
            this.cN = 90;
            this.cW = 2;
            n2 = 0;
            while (n2 < this.k.size()) {
                ar ar2 = (ar)this.k.elementAt(n2);
                if (ar2 != null) {
                    if (ar2.b.b == 14) {
                        this.de = ar2.b.f;
                    } else {
                        this.aA = ar2.b.f;
                    }
                }
                ++n2;
            }
        } else if (this.cX == 1) {
            this.cQ = 2;
            this.cO = 0;
            this.cN = 0;
            this.cW = 1;
            n2 = 0;
            while (n2 < this.k.size()) {
                ar ar3 = (ar)this.k.elementAt(n2);
                if (ar3 != null) {
                    if (n2 == 0) {
                        this.aA = ar3.b.f;
                    } else {
                        this.de = ar3.b.f;
                    }
                }
                ++n2;
            }
        } else if (this.cX == 2) {
            this.cQ = 7;
            this.cO = 25;
            this.cN = 25;
            this.cW = 1;
            n2 = 0;
            while (n2 < this.k.size()) {
                ar ar4 = (ar)this.k.elementAt(n2);
                if (ar4 != null) {
                    this.aA = ar4.b.f;
                }
                ++n2;
            }
        } else if (this.cX == 3) {
            this.ax = main.a.C;
            this.ay = main.a.D;
            this.cQ = 1;
            this.cO = 1;
            this.cN = 1;
            this.cW = 4;
            n2 = 0;
            while (n2 < this.k.size()) {
                ar ar5 = (ar)this.k.elementAt(n2);
                if (ar5 != null) {
                    this.aA = ar5.b.f;
                }
                ++n2;
            }
        } else if (this.cX == 4) {
            this.cQ = this.k.size();
            this.df = new short[this.cQ];
            this.cO = 25;
            this.cN = 25;
            this.cW = 1;
            n2 = 0;
            while (n2 < this.k.size()) {
                ar ar6 = (ar)this.k.elementAt(n2);
                if (ar6 != null) {
                    this.df[n2] = ar6.b.f;
                }
                ++n2;
            }
        }
        this.cR = 1;
        this.db = true;
        this.az = false;
        this.dc = false;
        this.cP = 360 / this.cQ;
        this.cS = new int[this.cQ];
        this.cT = new int[this.cQ];
        this.cU = new int[this.cQ];
        this.cV = new int[this.cQ];
        this.aq();
        this.dd = true;
        this.cY = 10;
        this.cZ = 30;
        this.da = 10;
        this.a(this.aw, ch.C);
    }

    private void ap() {
        --this.cY;
        if (this.cY < 0) {
            this.cY = 0;
        }
        --this.cZ;
        if (this.cZ < 0) {
            this.cZ = 0;
        }
        if (this.cY == 0) {
            if (!this.dc) {
                if (this.cW > 0) {
                    if (this.av != -1) {
                        if (this.cX == 3) {
                            if (main.a.w % 10 == 0) {
                                i i2 = new i(21, this.ax - 10, this.ay + 25, 4, 1, 1);
                                h.a(i2);
                                --this.cW;
                            }
                        } else {
                            if (main.a.w % 2 == 0) {
                                if (this.db) {
                                    if (this.cR < 40) {
                                        this.cR += 2;
                                    }
                                } else if (this.cR > 10) {
                                    this.cR -= 2;
                                }
                            }
                            if (this.cZ == 0) {
                                if (this.db) {
                                    if (this.cM > 0) {
                                        this.cM -= 5;
                                    } else if (main.a.w % 10 == 0) {
                                        this.db = false;
                                        --this.cW;
                                        this.cZ = 5;
                                        this.da = 10;
                                    }
                                } else if (this.cM < 90) {
                                    this.cM += 5;
                                } else if (main.a.w % 10 == 0) {
                                    this.db = true;
                                    this.cZ = 10;
                                }
                            }
                            this.cN = this.cO;
                            this.cN -= this.cR;
                            if (this.cN >= 360) {
                                this.cN -= 360;
                            }
                            if (this.cN < 0) {
                                this.cN += 360;
                            }
                            this.cO = this.cN;
                            this.aq();
                        }
                    }
                } else if (main.a.w % 20 == 0) {
                    this.dc = true;
                }
                if (main.a.w % 20 == 0) {
                    if (this.cX != 3) {
                        l.a(132, this.ax, this.ay, 2);
                    }
                    l.a(114, this.ax, this.ay + 20, 2);
                    return;
                }
            } else if (this.dc) {
                if (this.av == 1) {
                    if (this.da == 10) {
                        i i3 = new i(22, this.ax - 3, this.ay + 25, 4, 1, 1);
                        h.a(i3);
                    }
                    --this.da;
                    if (this.da < 0) {
                        this.da = 0;
                    }
                    if (this.cM < 300) {
                        this.cM = dq.g(this.cM + 10);
                        if (this.cM == 20) {
                            this.a(this.aw, ch.D);
                        }
                    } else if (main.a.w % 20 == 0) {
                        if (main.a.A > 2 * ab) {
                            main.a.H = new dl();
                            main.a.H.M[7] = new String[][]{{""}};
                            main.a.H.f();
                            main.a.H.s();
                        }
                        this.av = (byte)-1;
                        this.az = true;
                        if (this.cX == 4) {
                            main.a.G.z();
                        }
                    }
                    this.aq();
                    return;
                }
                if (this.av == 0) {
                    if (this.da == 10) {
                        if (this.cX == 2) {
                            i i4 = new i(20, this.ax - 3, this.ay + 15, 4, 2, 1);
                            h.a(i4);
                        } else {
                            i i5 = new i(21, this.ax - 10, this.ay + 25, 4, 1, 1);
                            h.a(i5);
                        }
                        this.a(this.aw, ch.F);
                        this.dd = false;
                    }
                    if (!this.dd) {
                        --this.da;
                        if (this.da < -50) {
                            this.da = -50;
                            if (this.cX < 3 && main.a.A > 2 * ab) {
                                main.a.H = new dl();
                                main.a.H.M[7] = new String[][]{{""}};
                                main.a.H.f();
                                main.a.H.s();
                            }
                            this.av = (byte)-1;
                            this.az = true;
                            if (this.cX == 4) {
                                main.a.G.z();
                            }
                        }
                    }
                }
            }
        }
    }

    private void aq() {
        int n2 = 0;
        while (n2 < this.cT.length) {
            if (this.cN >= 360) {
                this.cN -= 360;
            }
            if (this.cN < 0) {
                this.cN += 360;
            }
            this.cT[n2] = dq.g(this.cM * dq.a(this.cN) / 1024);
            this.cS[n2] = dq.g(this.cM * dq.b(this.cN) / 1024);
            if (this.cN < 90) {
                this.cU[n2] = this.ax + this.cS[n2];
                this.cV[n2] = this.ay - this.cT[n2];
            } else if (this.cN >= 90 && this.cN < 180) {
                this.cU[n2] = this.ax - this.cS[n2];
                this.cV[n2] = this.ay - this.cT[n2];
            } else if (this.cN >= 180 && this.cN < 270) {
                this.cU[n2] = this.ax - this.cS[n2];
                this.cV[n2] = this.ay + this.cT[n2];
            } else {
                this.cU[n2] = this.ax + this.cS[n2];
                this.cV[n2] = this.ay + this.cT[n2];
            }
            this.cN -= this.cP;
            ++n2;
        }
    }

    private void a(int n2, String string) {
        if (this.cX < 3) {
            int n3 = 0;
            while (n3 < cw.H.size()) {
                bg bg2 = (bg)cw.H.elementAt(n3);
                if (bg2.t.a == n2) {
                    bg2.a(string);
                }
                ++n3;
            }
        }
    }

    private void ar() {
        this.A = 19;
        this.c(0);
        dl dl2 = this;
        es.a();
        es.Q();
        dl2.O = H.length;
        dl2.aD = 24;
        dl2.ak = main.a.e ? -1 : 0;
        dl2.aI = dl2.O * dl2.aD - dl2.ah;
        if (dl2.aI < 0) {
            dl2.aI = 0;
        }
        dl2.g = dl2.f = dl2.aJ[dl2.B];
        if (dl2.g < 0) {
            dl2.f = 0;
            dl2.g = 0;
        }
        if (dl2.g > dl2.aI) {
            dl2.g = dl2.f = dl2.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    private void F(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int n2 = 0;
        while (n2 < H.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.d(n3, n4, n5, n6);
                if (H[n2] != null && (H[n2].equals(ch.ca) || H[n2].startsWith(ch.ca))) {
                    if (es.O()) {
                        ev.f.a(eh2, es.N(), this.ae + 25, n4 + 6, 0);
                    } else {
                        ev.f.a(eh2, ch.ca, this.ae + 25, n4 + 2, 0);
                        ev.f.a(eh2, es.M(), this.ae + 25, n4 + 12, 0);
                    }
                } else {
                    ev.f.a(eh2, H[n2], this.ae + 25, n4 + 6, 0);
                }
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void as() {
        if (this.ak < 0) {
            return;
        }
        if (this.ak < H.length && H[this.ak] != null && (H[this.ak].equals(ch.ca) || H[this.ak].startsWith(ch.ca))) {
            es.a().P();
            return;
        }
        switch (this.ak) {
            case 0: {
                es.a().b();
                return;
            }
            case 1: {
                es.a().e();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                es.a().d();
                return;
            }
            case 4: {
                es.a().c();
            }
        }
    }

    private void at() {
        this.A = 20;
        this.c(0);
        dl dl2 = this;
        if (ej.c == 5) {
            ba = new String[]{ch.ga, ch.bP, ch.bQ, ch.af};
            if (cw.bx) {
                ba = new String[]{ch.ga, ch.bP, ch.bQ, ch.af, ch.o};
            }
        } else {
            ba = new String[]{ch.ga, ch.bP, ch.bQ, ch.af, ch.fW};
            if (cw.bx) {
                ba = new String[]{ch.ga, ch.bP, ch.bQ, ch.af, ch.fW, ch.o};
            }
            if ((ej.c == 2 || ej.c == 7) && ch.fE != 2) {
                ba = new String[]{ch.ga, ch.bP, ch.bQ, ch.af, ch.fW};
                if (cw.bx) {
                    ba = new String[]{ch.ga, ch.bP, ch.bQ, ch.af, ch.fW, ch.o};
                }
            }
        }
        dl2.O = ba.length;
        dl2.aD = 24;
        dl2.ak = main.a.e ? -1 : 0;
        dl2.aI = dl2.O * dl2.aD - dl2.ah;
        if (dl2.aI < 0) {
            dl2.aI = 0;
        }
        dl2.g = dl2.f = dl2.aJ[dl2.B];
        if (dl2.g < 0) {
            dl2.f = 0;
            dl2.g = 0;
        }
        if (dl2.g > dl2.aI) {
            dl2.g = dl2.f = dl2.aI;
        }
        this.aK = 0;
        this.h = 0;
    }

    private void G(eh eh2) {
        eh2.e(this.ae, this.af, this.ag, this.ah);
        eh2.a(0, -this.g);
        int n2 = 0;
        while (n2 < ba.length) {
            int n3 = this.ae;
            int n4 = this.af + n2 * this.aD;
            int n5 = this.ag - 1;
            int n6 = this.aD - 1;
            if (n4 - this.g <= this.af + this.ah && n4 - this.g >= this.af - this.aD) {
                eh2.a(n2 == this.ak ? 16383818 : 15196114);
                eh2.d(n3, n4, n5, n6);
                ev.f.a(eh2, ba[n2], this.ae + this.ag / 2, n4 + 6, 2);
            }
            ++n2;
        }
        this.f(eh2);
    }

    private void au() {
        if (this.ak < 0) {
            return;
        }
        switch (this.ak) {
            case 0: {
                main.a.l();
                if (this.o == null) {
                    this.o = new el();
                    this.o.a.b = main.a.B - 35 - el.b().a.d;
                    this.o.a();
                    this.o.c = main.a.G;
                }
                this.o.a.a("");
                this.o.h = ch.gb;
                this.o.a.i = ch.gb;
                this.o.g = "";
                this.o.b = true;
                this.o.a.e = true;
                this.o.a.c(1);
                if (!main.a.e) break;
                this.o.a.b();
                return;
            }
            case 1: {
                cj.a().a((byte)0, -1);
                da.a();
                return;
            }
            case 2: {
                cj.a().b((byte)0, -1);
                da.a();
                return;
            }
            case 3: {
                this.l();
                if (this.o != null) break;
                this.o = new el();
                this.o.a.b = main.a.B - 35 - el.b().a.d;
                this.o.a();
                this.o.c = main.a.G;
                return;
            }
            case 4: {
                if (ch.fE == 2) {
                    Object object = "http://dragonball.indonaga.com/coda/?username=" + main.a.I.a.e();
                    this.z();
                    try {
                        GameMidlet.g.platformRequest((String)object);
                        return;
                    }
                    catch (Exception exception) {
                        object = exception;
                        exception.toString();
                        return;
                    }
                }
                this.z();
                if (co.m().aR.c <= 10) {
                    main.a.a(ch.fX);
                    return;
                }
                di.c().a();
                return;
            }
            case 5: {
                this.L();
            }
        }
    }

    public final void E() {
        this.A = 25;
        this.c(0);
        this.av();
        this.B = 0;
    }

    private void av() {
        this.aD = 24;
        this.O = co.m().aY[this.B].length;
        this.aI = this.O * this.aD - this.ah;
        if (this.aI < 0) {
            this.aI = 0;
        }
        this.g = this.f = this.aJ[this.B];
        if (this.g < 0) {
            this.f = 0;
            this.g = 0;
        }
        if (this.g > this.aI) {
            this.g = this.f = this.aI;
        }
        this.ak = main.a.e ? -1 : 0;
    }

    public final boolean F() {
        return this.A == 1;
    }

    private void e(int n2) {
        try {
            this.bC.t = Integer.parseInt(this.o.a.e());
        }
        catch (Exception exception) {
            main.a.a(ch.eh);
            this.o.b = false;
            return;
        }
        ae ae2 = new ae(ch.bo, this, n2 == 0 ? 11000 : 11001, null);
        ae ae3 = new ae(ch.bp, this, 11002, null);
        main.a.a(ch.f, ae2, ae3);
    }

    private static int f(int n2) {
        switch (n2) {
            case 4: {
                return 1269146;
            }
            case 1: {
                return 2786816;
            }
            case 5: {
                return 13279744;
            }
            case 3: {
                return 12537346;
            }
            case 2: {
                return 7078041;
            }
            case 6: {
                return 0xB10000;
            }
        }
        return -1;
    }

    private static byte g(int n2) {
        if (n2 < 0) {
            return 0;
        }
        switch (n2) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return 0;
            }
            case 9: {
                return 4;
            }
            case 10: {
                return 1;
            }
            case 11: {
                return 5;
            }
            case 12: {
                return 3;
            }
            case 13: {
                return 2;
            }
        }
        return 6;
    }

    private static ev h(int n2) {
        ev ev2 = ev.k;
        switch (n2) {
            case -1: {
                ev2 = ev.k;
                break;
            }
            case 0: {
                ev2 = ev.f;
                break;
            }
            case 1: {
                ev2 = ev.h;
                break;
            }
            case 2: {
                ev2 = ev.b;
                break;
            }
            case 3: {
                ev2 = ev.p;
                break;
            }
            case 4: {
                ev2 = ev.r;
                break;
            }
            case 5: {
                ev2 = ev.q;
                break;
            }
            case 7: {
                ev2 = ev.a;
                break;
            }
            case 8: {
                ev2 = ev.d;
            }
        }
        return ev2;
    }

    private void a(eh eh2, int n2, int n3, int n4, int n5) {
        if (n2 == 34) {
            if (this.dj != null) {
                eh2.a(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = ej.b("/mainImage/o_0.png");
            }
            if (this.dk != null) {
                eh2.a(this.dk, n3, n4 + n5 - this.dk.getHeight(), 0);
                return;
            }
            this.dk = ej.b("/mainImage/o_1.png");
            return;
        }
        if (n2 == 35) {
            if (this.dj != null) {
                eh2.a(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = ej.b("/mainImage/o_0.png");
            }
            if (this.dl != null) {
                eh2.a(this.dl, n3, n4 + n5 - this.dl.getHeight(), 0);
                return;
            }
            this.dl = ej.b("/mainImage/o_2.png");
            return;
        }
        if (n2 == 36) {
            if (this.dj != null) {
                eh2.a(this.dj, n3, n4 + n5 - this.dj.getHeight(), 0);
            } else {
                this.dj = ej.b("/mainImage/o_0.png");
            }
            if (this.dm != null) {
                eh2.a(this.dm, n3, n4 + n5 - this.dm.getHeight(), 0);
                return;
            }
            this.dm = ej.b("/mainImage/o_3.png");
        }
    }

    private static void a(eh eh2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 == 102 && n3 > g.t) {
            n2 = dl.g(n3);
            int n8 = n4;
            int n9 = n5;
            eh eh3 = eh2;
            n6 = n2;
            n5 = n3 -= g.t;
            n4 = n7;
            n3 = 34;
            n2 = n9;
            int n10 = n8;
            try {
                int n11 = (n3 << 1) + (n4 << 1);
                n11 /= n5;
                dh = dg.length;
                if (n5 > 4) {
                    dh = 2;
                }
                int n12 = 0;
                while (n12 < n5) {
                    int n13 = 0;
                    while (n13 < dh) {
                        int n14;
                        int n15 = n14 = dg[n13] > 1 ? (dg[n13] >> 1) + 1 : 1;
                        int n16 = n4;
                        int n17 = n3;
                        int n18 = main.a.w - (n13 << 2);
                        int n19 = n11 * n12;
                        int n20 = n10 + ((n19 = (n18 + n19) % ((n17 << 1) + (n16 << 1))) >= 0 && n19 < n17 ? n19 % n17 : (n17 <= n19 && n19 < n17 + n16 ? n17 - n15 : (n17 + n16 <= n19 && n19 < (n17 << 1) + n16 ? n17 - (n19 - n16) % n17 - n15 : 0)));
                        n15 = n14;
                        n16 = n4;
                        n17 = n3;
                        n18 = main.a.w - (n13 << 2);
                        n19 = n11 * n12;
                        n19 = (n18 + n19) % ((n17 << 1) + (n16 << 1));
                        n14 = n2 + (n19 >= 0 && n19 < n17 ? 0 : (n17 <= n19 && n19 < n17 + n16 ? n19 % n17 : (n17 + n16 <= n19 && n19 < (n17 << 1) + n16 ? n16 - n15 : n16 - (n19 - (n17 << 1)) % n16 - n15)));
                        eh3.a(di[n6][n13]);
                        eh3.d(n20, n14, dg[n13], dg[n13]);
                        ++n13;
                    }
                    ++n12;
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    public static ev b(int n2, int n3) {
        switch (n2) {
            case 0: {
                return ev.c;
            }
            case 1: {
                return ev.h;
            }
            case 3: {
                return ev.F;
            }
            case 4: {
                return ev.b;
            }
            case 5: {
                return ev.d;
            }
            case 6: {
                return ev.a;
            }
            case 7: {
                return ev.f;
            }
        }
        return ev.c;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean a(int n2, int n3, ar[] arArray) {
        void var2_4;
        void var1_3;
        int n4 = n2 - 1 + var1_3 * 20;
        boolean bl2 = var1_3 == false ? n4 < ((void)var2_4).length : false;
        return bl2;
    }

    private static int c(int n2, int n3) {
        n2 = n2 - 1 + n3 * 20;
        return n2;
    }

    private static int b(int n2, int n3, ar[] arArray) {
        n2 = n2 - 1 + n3 * 20;
        return n2 -= arArray.length;
    }

    private boolean aw() {
        return this.A == 0 && this.B == 1 || this.A == 7 && this.B == 0;
    }

    private void ax() {
        if (this.ak >= 0) {
            if (main.a.i[4]) {
                --this.bO;
                if (this.bO < 0) {
                    this.bO = 0;
                    if (main.a.W) {
                        main.a.W = false;
                        main.a.G.ak = 0;
                        return;
                    }
                }
            } else if (main.a.i[6]) {
                ++this.bO;
                if (this.bO > this.dn - 1) {
                    this.bO = this.dn - 1;
                    if (main.a.H != null) {
                        main.a.W = true;
                        main.a.H.ak = 0;
                    }
                }
            }
        }
    }

    private void ay() {
        this.O();
        if (this.ak == 0) {
            this.ax();
        }
    }

    private int i(int n2) {
        int n3 = 20;
        int n4 = n2 / 20 + (n2 % 20 > 0 ? 1 : 0);
        this.dn = (byte)n4;
        if (this.bO > n4 - 1) {
            this.bO = n4 - 1;
        }
        if (n2 % 20 > 0 && this.bO == n4 - 1) {
            n3 = n2 % 20;
        }
        return ++n3;
    }

    private void a(int n2, boolean bl2, boolean bl3) {
        n2 = n2 / 20 + (n2 % 20 > 0 ? 1 : 0);
        int n3 = this.ae;
        this.bO = (main.a.p - n3) / this.aF;
        if (this.bO > n2 - 1) {
            this.bO = n2 - 1;
        }
        if (main.a.p < n3) {
            this.bO = 0;
        }
        if (!bl3) {
            this.b(bl2);
            return;
        }
        this.T();
    }
}

