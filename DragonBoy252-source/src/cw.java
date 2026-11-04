/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;
import main.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class cw
extends ew
implements cx {
    private boolean cG;
    private long cH;
    private long cI;
    public static boolean a = false;
    public static boolean b = false;
    public static cw c;
    public static int d;
    public static int e;
    public static int f;
    private static int cJ;
    private static int cK;
    public static int g;
    private static int cL;
    private static int cM;
    private static int cN;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    private static int cO;
    private static int cP;
    private static int cQ;
    private static int cR;
    public static int l;
    public static int m;
    public static int n;
    private static int cS;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public ae s;
    public static int t;
    public static int u;
    public static bw[] v;
    public static ad[] w;
    public static af[] x;
    public static bk[] y;
    public static ah[] z;
    public static int A;
    public static eq B;
    public static eq C;
    public static eq D;
    public static eq E;
    public static eq F;
    private static eq cT;
    public static eq G;
    public static eq H;
    public static eq I;
    public static bf[] J;
    private static int cU;
    public static int K;
    private static int cV;
    public av[] L;
    public bv[] M;
    private static br cW;
    private static br cX;
    public static boolean N;
    public static int O;
    public static boolean P;
    private static boolean cY;
    private static boolean cZ;
    private static boolean da;
    private static boolean db;
    private static boolean dc;
    private static boolean dd;
    public static boolean Q;
    public static boolean R;
    private static boolean de;
    private static boolean df;
    private static boolean dg;
    private static boolean dh;
    private static boolean di;
    private static boolean dj;
    private static boolean dk;
    private static boolean dl;
    private static boolean dm;
    private static boolean dn;
    private static boolean do;
    private static boolean dp;
    private static boolean dq;
    private static boolean dr;
    private static boolean ds;
    private static boolean dt;
    private static boolean du;
    private static boolean dv;
    private static boolean dw;
    private static boolean dx;
    private static boolean dy;
    private static boolean dz;
    private static boolean dA;
    private static boolean dB;
    private static boolean dC;
    private static boolean dD;
    private static boolean dE;
    private static boolean dF;
    private static boolean dG;
    private static boolean dH;
    public static co S;
    public static long[] T;
    private int dI = 0;
    public int[] U;
    public int[] V;
    public int[] W;
    public int[] X;
    public int[] Y;
    public int[] Z;
    public String[] aa;
    public String[] ab;
    public int ac = 0;
    public int ad = 0;
    private int dJ = -1;
    private boolean dK;
    public static int[] ae;
    public static int[] af;
    public static Image ag;
    public static Image ah;
    public static Image ai;
    public static Image aj;
    public static Image ak;
    public static Image al;
    public static Image am;
    public static byte an;
    public static byte ao;
    public static byte ap;
    public static byte aq;
    public static byte ar;
    public static byte as;
    public static byte at;
    public static byte au;
    public static boolean av;
    public static boolean aw;
    public static boolean ax;
    public static boolean ay;
    public static boolean az;
    public static boolean aA;
    public static long aB;
    private static Image dL;
    private static Image dM;
    public static Image aC;
    private static Image dN;
    private static Image dO;
    public static Image aD;
    public static Image aE;
    private static Image dP;
    private static Image dQ;
    private static Image dR;
    private static Image dS;
    private static Image dT;
    private static Image dU;
    private static Image dV;
    private static Image dW;
    private static Image dX;
    private static Image dY;
    public static Image aF;
    public static Image aG;
    public static Image aH;
    public static Image aI;
    public static Image aJ;
    public static Image aK;
    public int aL;
    public int aM;
    public static byte aN;
    public static dc aO;
    public static dc aP;
    private static Image dZ;
    private static Image ea;
    private static Image eb;
    public static Image aQ;
    private static Image ec;
    private static Image ed;
    public static Image aR;
    public static Image aS;
    public static Image aT;
    public static Image aU;
    public static Image aV;
    public dh aW;
    public ba aX;
    private int ee;
    public static int aY;
    private static b ef;
    public static int aZ;
    private static Image eg;
    private ae eh;
    private ae ei;
    private ae ej;
    private ae ek;
    public static bt[] ba;
    public static bt[] bb;
    public ae bc;
    public static int bd;
    private static int el;
    public static long be;
    public boolean bf;
    private boolean em;
    private int en;
    private int eo;
    private int ep;
    private int eq;
    private int er;
    private boolean es;
    public long bg;
    boolean bh;
    private boolean et;
    private int eu;
    private int ev;
    private int ew;
    private int ex;
    public static boolean bi;
    private long ey;
    private long ez;
    public int bj;
    int bk;
    public boolean bl;
    public boolean bm;
    private static Image eA;
    public boolean bn = false;
    public boolean bo = false;
    private boolean eB = false;
    private int eC;
    private int eD;
    private int eE;
    private int eF;
    public boolean bp;
    private boolean eG;
    public int bq;
    public int br;
    public int bs;
    public int bt;
    public int bu;
    public int bv;
    private static int eH;
    public static boolean bw;
    public static boolean bx;
    public static boolean by;
    private int eI;
    private int eJ = 0;
    private int eK = -1;
    private bt eL;
    public String bz;
    private boolean eM;
    private int eN;
    private int eO = -1;
    private static long eP;
    private static long eQ;
    private static long eR;
    private static long eS;
    private static int eT;
    private int eU = 0;
    public static int bA;
    public static Image bB;
    public static Image bC;
    public int[] bD;
    public static Image bE;
    public String bF;
    private static int eV;
    public static boolean bG;
    public static int bH;
    private static long eW;
    private static long eX;
    private static int[] eY;
    private static int[] eZ;
    public static eq bI;
    private String fa = "idle";
    private co fb;
    private int fc = 0;
    public static Image bJ;
    private static int fd;
    private static int fe;
    private static int ff;
    private static int fg;
    private static int fh;
    public static int bK;
    public static int bL;
    private static int fi;
    private static int fj;
    private static int[] fk;
    private static int[] fl;
    private static int fm;
    private static int fn;
    public long bM;
    public long bN;
    public boolean bO;
    public long bP;
    public long bQ;
    public boolean bR;
    private long fo;
    private long fp;
    private int fq;
    public static String[] bS;
    public static int[] bT;
    public static int[] bU;
    private static int[] fr;
    private static int[] fs;
    private static int[] ft;
    public static int[] bV;
    public static int[] bW;
    private static int[] fu;
    private static int[] fv;
    private static int[] fw;
    private static int[] fx;
    private static int[] fy;
    private static int[] fz;
    private static Image[] fA;
    private static int fB;
    private static int fC;
    private static long fD;
    private int fE;
    public static int bX;
    public static int bY;
    public static int bZ;
    public static int ca;
    private static int fF;
    private static int fG;
    private static int fH;
    private static int fI;
    private ae fJ;
    public static boolean cb;
    public static boolean cc;
    public bp cd;
    private static Vector fK;
    public boolean ce;
    private int[] fL;
    private int[] fM;
    private int[] fN;
    private int[] fO;
    private int[] fP;
    private int fQ;
    private String fR;
    private int fS;
    private int fT;
    private int fU;
    private boolean fV;
    public byte cf;
    public boolean cg;
    public int ch;
    public static boolean ci;
    public static byte cj;
    public static byte ck;
    private String fW;
    private String[] fX;
    private static Image fY;
    public static aq cl;
    private static dz fZ;
    private static dz ga;
    private static Image gb;
    private static Image gc;
    private static Image gd;
    public static int cm;
    public static int cn;
    public static long co;
    public static String cp;
    public static int cq;
    public static boolean cr;
    public static byte cs;
    public static eq ct;
    private static int ge;
    public static boolean cu;
    public static int cv;
    public static int cw;
    public static boolean cx;
    public static boolean cy;

    static {
        B = new eq("vClan");
        new eq("vPtMap");
        C = new eq("vFriend");
        D = new eq("vEnemies");
        E = new eq("vCharInMap");
        F = new eq("vItemMap");
        cT = new eq("vMobAttack");
        new eq("vSet");
        G = new eq("vMob");
        H = new eq("vNpc");
        I = new eq("vFlag");
        cU = 0;
        K = -1;
        cV = 0;
        cW = new br();
        cX = new br();
        new eq("vItemUpGrade");
        P = false;
        cY = false;
        cZ = false;
        da = false;
        db = false;
        dc = false;
        dd = false;
        Q = false;
        R = false;
        de = false;
        df = false;
        dg = false;
        dh = false;
        di = false;
        dj = false;
        dk = false;
        dl = false;
        dm = false;
        dn = false;
        do = false;
        dp = false;
        dq = false;
        dr = false;
        ds = false;
        dt = false;
        du = false;
        dv = false;
        dw = false;
        dx = false;
        dy = false;
        dz = false;
        dA = false;
        dB = false;
        dC = false;
        dD = false;
        dE = false;
        dF = false;
        dG = false;
        dH = false;
        ag = ej.b("/mainImage/myTexture2dstat.png");
        ah = ej.b("/mainImage/myTexture2dlineColor20.png");
        ai = ej.b("/mainImage/myTexture2dlineColor21.png");
        aj = ej.b("/mainImage/myTexture2dlineColor22.png");
        ak = ej.b("/mainImage/myTexture2dlineColor00.png");
        al = ej.b("/mainImage/myTexture2dlineColor01.png");
        am = ej.b("/mainImage/myTexture2dlineColor02.png");
        av = false;
        aw = false;
        ax = false;
        ay = false;
        az = false;
        aA = false;
        aB = 0L;
        aN = 0;
        aO = new dc();
        aP = new dc();
        ef = new b();
        aZ = 0;
        eg = ej.b("/mainImage/i_pve_bar_0.png");
        ej.b("/mainImage/i_pve_bar_1.png");
        fZ = new dz(ej.b("/mainImage/i_pve_bar_0.png"), 6, 15);
        ga = new dz(ej.b("/mainImage/i_pve_bar_1.png"), 38, 21);
        gb = ej.b("/mainImage/i_vs.png");
        gc = ej.b("/mainImage/i_charlife.png");
        fY = ej.b("/mainImage/i_hp.png");
        gd = ej.b("/mainImage/i_khung.png");
        aF = ej.b("/mainImage/myTexture2dbtnl.png");
        aG = ej.b("/mainImage/myTexture2dbtnlf.png");
        aH = ej.b("/mainImage/myTexture2dbtnl2.png");
        aI = ej.b("/mainImage/myTexture2dbtnlf2.png");
        dZ = ej.b("/mainImage/myTexture2dpanel.png");
        ea = ej.b("/mainImage/panel2.png");
        eb = ej.b("/mainImage/myTexture2dHP.png");
        ec = ej.b("/mainImage/SP.png");
        ed = ej.b("/mainImage/myTexture2dhpLost.png");
        aR = ej.b("/mainImage/myTexture2dmpLost.png");
        aQ = ej.b("/mainImage/myTexture2dMP.png");
        aD = ej.b("/mainImage/myTexture2dskill.png");
        aE = ej.b("/mainImage/myTexture2dskill2.png");
        aC = ej.b("/mainImage/myTexture2dmenu.png");
        dN = ej.b("/mainImage/myTexture2dfocus.png");
        aS = ej.b("/mainImage/tm-do.png");
        aT = ej.b("/mainImage/tm-vang.png");
        aU = ej.b("/mainImage/tm-xam.png");
        aV = ej.b("/mainImage/tm-xanh.png");
        if (main.a.e) {
            ej.b("/mainImage/myTexture2darrow.png");
            ej.b("/mainImage/myTexture2darrow2.png");
            dL = ej.b("/mainImage/myTexture2dchat.png");
            dM = ej.b("/mainImage/myTexture2dchat2.png");
            dO = ej.b("/mainImage/myTexture2dfocus2.png");
            dP = ej.b("/mainImage/myTexture2dPea0.png");
            dQ = ej.b("/mainImage/myTexture2dPea1.png");
            aJ = ej.b("/mainImage/myTexture2danalog1.png");
            aK = ej.b("/mainImage/myTexture2danalog2.png");
            dR = ej.b("/mainImage/myTexture2dPea2.png");
            dS = ej.b("/mainImage/myTexture2dPea3.png");
            dT = ej.b("/mainImage/myTexture2dfirebtn0.png");
            dU = ej.b("/mainImage/myTexture2dfirebtn1.png");
        }
        dV = ej.b("/mainImage/myTexture2dPea_0.png");
        dW = ej.b("/mainImage/myTexture2dPea_1.png");
        dX = ej.b("/mainImage/myTexture2dPea_2.png");
        dY = ej.b("/mainImage/myTexture2dPea_3.png");
        aZ = ea.d("analog") == 1 ? 1 : 0;
        ef = new b();
        byte[] byArray = ea.b("NRdataVersion");
        byte[] byArray2 = ea.b("NRmapVersion");
        byte[] byArray3 = ea.b("NRskillVersion");
        byte[] byArray4 = ea.b("NRitemVersion");
        if (byArray != null) {
            an = byArray[0];
        }
        if (byArray2 != null) {
            ao = byArray2[0];
        }
        if (byArray3 != null) {
            ap = byArray3[0];
        }
        if (byArray4 != null) {
            aq = byArray4[0];
        }
        ba = new bt[10];
        bb = new bt[10];
        eA = ej.b("/bg/trans.png");
        eH = 0;
        bB = ej.b("/mainImage/myTexture2dnut.png");
        bC = ej.b("/mainImage/myTexture2dnutF.png");
        bG = true;
        eY = new int[]{1, -1, 1, -1};
        eZ = new int[]{1, -1, -1, 1};
        bI = new eq("");
        bJ = ej.b("/mainImage/myTexture2darrow3.png");
        bT = new int[5];
        bU = new int[5];
        fs = new int[5];
        ft = new int[5];
        bV = new int[5];
        bS = new String[5];
        fr = new int[5];
        fu = new int[5];
        bW = new int[8];
        int n2 = 0;
        while (n2 < 5) {
            cw.bV[n2] = -1;
            ++n2;
        }
        bZ = 140;
        ca = 160;
        cb = false;
        cc = false;
        fK = new Vector();
        cm = 50;
        cn = 50;
        cq = 100;
        ct = new eq("");
        ge = 1;
        cu = false;
    }

    public static void c() {
        av = false;
        aw = false;
        ax = false;
        ay = false;
        az = false;
        aA = false;
        aB = 0L;
    }

    public final void e() {
        block13: {
            Object object = null;
            try {
                try {
                    object = new DataInputStream(new ByteArrayInputStream(ea.b("NR_part")));
                    int n2 = ((DataInputStream)object).readShort();
                    y = new bk[n2];
                    int n3 = 0;
                    while (n3 < n2) {
                        int n4 = ((DataInputStream)object).readByte();
                        cw.y[n3] = new bk(n4);
                        n4 = 0;
                        while (n4 < cw.y[n3].a.length) {
                            cw.y[n3].a[n4] = new bl();
                            cw.y[n3].a[n4].a = ((DataInputStream)object).readShort();
                            cw.y[n3].a[n4].b = ((DataInputStream)object).readByte();
                            cw.y[n3].a[n4].c = ((DataInputStream)object).readByte();
                            ++n4;
                        }
                        ++n3;
                    }
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                    try {
                        ((FilterInputStream)object).close();
                    }
                    catch (IOException iOException) {
                        object = iOException;
                        iOException.printStackTrace();
                    }
                    break block13;
                }
            }
            catch (Throwable throwable) {
                try {
                    ((FilterInputStream)object).close();
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
            }
        }
        er.c();
    }

    public static void a(Image image, Image image2, Image image3, float f2, float f3, int n2, float f4, eh eh2) {
        n2 = eh2.c();
        int n3 = eh2.d();
        int n4 = eh2.e();
        int n5 = eh2.f();
        eh2.e((int)f2, (int)f3, (int)f4, 13);
        int n6 = 0;
        while (n6 < 4) {
            eh2.a(image2, f2 + (float)((n6 + 1) * 15), f3, 0);
            ++n6;
        }
        eh2.a(image, f2, f3, 0);
        eh2.a(image2, f2 + 100.0f - 30.0f, f3, 0);
        eh2.a(image3, f2 + 100.0f - 15.0f, f3, 0);
        eh2.e(n2, n3, n4, n5);
    }

    public static boolean f() {
        return dx.l >= 53 && dx.l <= 62;
    }

    public static boolean g() {
        return dx.l >= 63;
    }

    public final void a() {
        ds.c = false;
        if (f.b()) {
            es.a();
            es.A();
        }
        en.c = false;
        co.cd = false;
        if (!a) {
            cj.a().x();
        }
        if (dx.b()) {
            cw cw2 = this;
            if (ct.b) {
                ct.b = false;
                cw2.cB = null;
            }
        }
        cw.aO.f = true;
        cw.aP.f = true;
        b = true;
        this.ee = 0;
        a = false;
        super.a();
    }

    public static void h() {
        cd.a.removeAllElements();
        E.removeAllElements();
        F.removeAllElements();
        j.y.removeAllElements();
        j.B.removeAllElements();
        j.A.removeAllElements();
        j.C.removeAllElements();
        j.x.removeAllElements();
        cT.removeAllElements();
        G.removeAllElements();
        H.removeAllElements();
        co.m().ca.removeAllElements();
    }

    public static void i() {
    }

    public final void a(byte[] object) {
        dq.c("GET ONSCREENSKILL!");
        bb = new bt[10];
        if (object == null) {
            dq.c("null");
            object = this;
            dq.c("LOAD DEFAULT ONSCREEN SKILL");
            int n2 = 0;
            while (n2 < bb.length) {
                bt bt2;
                if (n2 >= co.m().aO.size()) break;
                cw.bb[n2] = bt2 = (bt)co.m().aO.elementAt(n2);
                ++n2;
            }
            cw.C();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < co.m().aO.size()) {
                bt bt3 = (bt)co.m().aO.elementAt(n4);
                if (bt3.a.a == object[n3]) {
                    cw.bb[n3] = bt3;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void b(byte[] object) {
        dq.c("GET KEYSKILL!");
        ba = new bt[10];
        if (object == null) {
            object = this;
            dq.c("LOAD DEFAULT KEY SKILL");
            int n2 = 0;
            while (n2 < ba.length) {
                bt bt2;
                if (n2 >= co.m().aO.size()) break;
                cw.ba[n2] = bt2 = (bt)co.m().aO.elementAt(n2);
                ++n2;
            }
            cw.D();
            return;
        }
        int n3 = 0;
        while (n3 < ((byte[])object).length) {
            int n4 = 0;
            while (n4 < co.m().aO.size()) {
                bt bt3 = (bt)co.m().aO.elementAt(n4);
                if (bt3.a.a == object[n3]) {
                    cw.ba[n3] = bt3;
                    break;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public final void c(byte[] byArray) {
        dq.c("GET CURRENTSKILL!");
        if (byArray == null || byArray.length == 0) {
            if (co.m().aO.size() > 0) {
                co.m().aQ = (bt)co.m().aO.elementAt(0);
            }
        } else {
            int n2 = 0;
            while (n2 < co.m().aO.size()) {
                bt bt2 = (bt)co.m().aO.elementAt(n2);
                if (bt2.a.a == byArray[0]) {
                    co.m().aQ = bt2;
                    break;
                }
                ++n2;
            }
        }
        if (co.m().aQ != null) {
            cj.a().i(co.m().aQ.a.a);
            byte cfr_ignored_0 = co.m().aQ.a.a;
        }
    }

    protected static void a(bx object) {
        dq.c("DO SET ONSCREEN SKILL");
        object = co.m().a((bx)object);
        eq eq2 = new eq("");
        int n2 = 0;
        while (n2 < (main.a.e ? 10 : 5)) {
            Object[] objectArray = new Object[2];
            Object object2 = objectArray;
            objectArray[0] = object;
            object2[1] = String.valueOf(n2);
            object2 = new ae(String.valueOf(ch.cE) + (n2 + 1), 11120, object2);
            bt bt2 = bb[n2];
            if (bt2 != null) {
                object2.a = true;
            }
            eq2.addElement(object2);
            ++n2;
        }
        main.a.F.a(eq2);
    }

    protected static void b(bx object) {
        dq.c("DO SET KEY SKILL");
        object = co.m().a((bx)object);
        String[] stringArray = et.g ? ch.aS : ch.aT;
        eq eq2 = new eq("");
        int n2 = 0;
        while (n2 < (main.a.e ? 10 : 5)) {
            Object[] objectArray = new Object[2];
            Object[] objectArray2 = objectArray;
            objectArray[0] = object;
            objectArray2[1] = String.valueOf(n2);
            eq2.addElement(new ae(stringArray[n2], 11121, objectArray2));
            ++n2;
        }
        main.a.F.a(eq2);
    }

    private static void C() {
        byte[] byArray = new byte[bb.length];
        int n2 = 0;
        while (n2 < bb.length) {
            byArray[n2] = bb[n2] == null ? -1 : cw.bb[n2].a.a;
            ++n2;
        }
        cj.a().a(byArray);
    }

    private static void D() {
        byte[] byArray = new byte[ba.length];
        int n2 = 0;
        while (n2 < ba.length) {
            byArray[n2] = ba[n2] == null ? -1 : cw.ba[n2].a.a;
            ++n2;
        }
        cj.a().a(byArray);
    }

    public static boolean j() {
        int n2 = co.m().aT.length - 1;
        while (n2 >= 0) {
            if (co.m().aT[n2] == null) {
                return false;
            }
            --n2;
        }
        return true;
    }

    public static void a(String[] stringArray, bg bg2) {
        eq eq2 = new eq("");
        int n2 = 0;
        while (n2 < stringArray.length) {
            eq2.addElement(new ae(stringArray[n2], 11057, bg2));
            ++n2;
        }
        main.a.F.a(eq2);
    }

    private static void E() {
        block16: {
            Object object = ea.b("NR_effect");
            if (object == null) {
                return;
            }
            Object object2 = null;
            try {
                try {
                    object2 = new DataInputStream(new ByteArrayInputStream((byte[])object));
                    int n2 = ((DataInputStream)object2).readShort();
                    z = new ah[n2];
                    int n3 = 0;
                    while (n3 < n2) {
                        cw.z[n3] = new ah();
                        ((DataInputStream)object2).readShort();
                        cw.z[n3].a = new ai[((DataInputStream)object2).readByte()];
                        int n4 = 0;
                        while (n4 < cw.z[n3].a.length) {
                            cw.z[n3].a[n4] = new ai();
                            cw.z[n3].a[n4].c = ((DataInputStream)object2).readShort();
                            cw.z[n3].a[n4].a = ((DataInputStream)object2).readByte();
                            cw.z[n3].a[n4].b = ((DataInputStream)object2).readByte();
                            ++n4;
                        }
                        ++n3;
                    }
                }
                catch (Exception exception) {
                    object = exception;
                    exception.printStackTrace();
                    try {
                        if (object2 != null) {
                            ((FilterInputStream)object2).close();
                            return;
                        }
                        break block16;
                    }
                    catch (IOException iOException) {
                        object2 = iOException;
                        iOException.printStackTrace();
                        return;
                    }
                }
            }
            catch (Throwable throwable) {
                try {
                    if (object2 != null) {
                        ((FilterInputStream)object2).close();
                    }
                }
                catch (IOException iOException) {
                    object2 = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object2).close();
                return;
            }
            catch (IOException iOException) {
                object2 = iOException;
                iOException.printStackTrace();
            }
        }
    }

    private static void F() {
        block15: {
            Object object = ea.b("NR_arrow");
            if (object == null) {
                return;
            }
            Object object2 = null;
            try {
                try {
                    object2 = new DataInputStream(new ByteArrayInputStream((byte[])object));
                    int n2 = ((DataInputStream)object2).readShort();
                    w = new ad[n2];
                    int n3 = 0;
                    while (n3 < n2) {
                        cw.w[n3] = new ad();
                        cw.w[n3].a = ((DataInputStream)object2).readShort();
                        cw.w[n3].b[0] = ((DataInputStream)object2).readShort();
                        cw.w[n3].b[1] = ((DataInputStream)object2).readShort();
                        cw.w[n3].b[2] = ((DataInputStream)object2).readShort();
                        ++n3;
                    }
                }
                catch (Exception exception) {
                    object = exception;
                    exception.printStackTrace();
                    try {
                        if (object2 != null) {
                            ((FilterInputStream)object2).close();
                            return;
                        }
                        break block15;
                    }
                    catch (IOException iOException) {
                        object2 = iOException;
                        iOException.printStackTrace();
                        return;
                    }
                }
            }
            catch (Throwable throwable) {
                try {
                    if (object2 != null) {
                        ((FilterInputStream)object2).close();
                    }
                }
                catch (IOException iOException) {
                    object2 = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object2).close();
                return;
            }
            catch (IOException iOException) {
                object2 = iOException;
                iOException.printStackTrace();
            }
        }
    }

    private static void G() {
        block23: {
            Object object = ea.b("NR_dart");
            if (object == null) {
                return;
            }
            Object object2 = null;
            try {
                try {
                    object2 = new DataInputStream(new ByteArrayInputStream((byte[])object));
                    int n2 = ((DataInputStream)object2).readShort();
                    x = new af[n2];
                    int n3 = 0;
                    while (n3 < n2) {
                        int n4;
                        int n5;
                        cw.x[n3] = new af();
                        ((DataInputStream)object2).readShort();
                        cw.x[n3].h = ((DataInputStream)object2).readShort();
                        cw.x[n3].i = ((DataInputStream)object2).readShort() << 8;
                        cw.x[n3].g = ((DataInputStream)object2).readShort();
                        int n6 = ((DataInputStream)object2).readShort();
                        cw.x[n3].c = new short[n6];
                        int n7 = 0;
                        while (n7 < n6) {
                            cw.x[n3].c[n7] = ((DataInputStream)object2).readShort();
                            ++n7;
                        }
                        n6 = ((DataInputStream)object2).readShort();
                        cw.x[n3].d = new short[n6];
                        n7 = 0;
                        while (n7 < n6) {
                            cw.x[n3].d[n7] = ((DataInputStream)object2).readShort();
                            ++n7;
                        }
                        n6 = ((DataInputStream)object2).readShort();
                        cw.x[n3].e = new short[n6];
                        n7 = 0;
                        while (n7 < n6) {
                            cw.x[n3].e[n7] = ((DataInputStream)object2).readShort();
                            ++n7;
                        }
                        n6 = ((DataInputStream)object2).readShort();
                        cw.x[n3].f = new short[n6];
                        n7 = 0;
                        while (n7 < n6) {
                            cw.x[n3].f[n7] = ((DataInputStream)object2).readShort();
                            ++n7;
                        }
                        n6 = ((DataInputStream)object2).readShort();
                        cw.x[n3].a = new short[n6][];
                        n7 = 0;
                        while (n7 < n6) {
                            n5 = ((DataInputStream)object2).readShort();
                            cw.x[n3].a[n7] = new short[n5];
                            n4 = 0;
                            while (n4 < n5) {
                                cw.x[n3].a[n7][n4] = ((DataInputStream)object2).readShort();
                                ++n4;
                            }
                            ++n7;
                        }
                        n6 = ((DataInputStream)object2).readShort();
                        cw.x[n3].b = new short[n6][];
                        n7 = 0;
                        while (n7 < n6) {
                            n5 = ((DataInputStream)object2).readShort();
                            cw.x[n3].b[n7] = new short[n5];
                            n4 = 0;
                            while (n4 < n5) {
                                cw.x[n3].b[n7][n4] = ((DataInputStream)object2).readShort();
                                ++n4;
                            }
                            ++n7;
                        }
                        ++n3;
                    }
                }
                catch (Exception exception) {
                    object = exception;
                    exception.printStackTrace();
                    try {
                        if (object2 != null) {
                            ((FilterInputStream)object2).close();
                            return;
                        }
                        break block23;
                    }
                    catch (IOException iOException) {
                        object2 = iOException;
                        iOException.printStackTrace();
                        return;
                    }
                }
            }
            catch (Throwable throwable) {
                try {
                    if (object2 != null) {
                        ((FilterInputStream)object2).close();
                    }
                }
                catch (IOException iOException) {
                    object2 = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object2).close();
                return;
            }
            catch (IOException iOException) {
                object2 = iOException;
                iOException.printStackTrace();
            }
        }
    }

    private static void H() {
        block19: {
            Object object = ea.b("NR_skill");
            if (object == null) {
                return;
            }
            Object object2 = null;
            try {
                try {
                    object2 = new DataInputStream(new ByteArrayInputStream((byte[])object));
                    short s2 = ((DataInputStream)object2).readShort();
                    int n2 = by.a.size();
                    v = new bw[n2];
                    n2 = 0;
                    while (n2 < s2) {
                        short s3 = ((DataInputStream)object2).readShort();
                        if (s3 == 1111) {
                            s3 = (short)(s2 - 1);
                        }
                        cw.v[s3] = new bw();
                        cw.v[s3].a = s3;
                        cw.v[s3].b = ((DataInputStream)object2).readShort();
                        if (cw.v[s3].b <= 0) {
                            cw.v[s3].b = 80;
                        }
                        ((DataInputStream)object2).readByte();
                        cw.v[s3].c = new bu[((DataInputStream)object2).readByte()];
                        int n3 = 0;
                        while (n3 < cw.v[s3].c.length) {
                            cw.v[s3].c[n3] = new bu();
                            cw.v[s3].c[n3].a = ((DataInputStream)object2).readByte();
                            cw.v[s3].c[n3].b = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].c = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].d = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].e = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].f = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].g = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].h = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].i = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].j = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].k = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].l = ((DataInputStream)object2).readShort();
                            cw.v[s3].c[n3].m = ((DataInputStream)object2).readShort();
                            ++n3;
                        }
                        cw.v[s3].d = new bu[((DataInputStream)object2).readByte()];
                        n3 = 0;
                        while (n3 < cw.v[s3].d.length) {
                            cw.v[s3].d[n3] = new bu();
                            cw.v[s3].d[n3].a = ((DataInputStream)object2).readByte();
                            cw.v[s3].d[n3].b = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].c = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].d = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].e = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].f = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].g = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].h = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].i = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].j = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].k = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].l = ((DataInputStream)object2).readShort();
                            cw.v[s3].d[n3].m = ((DataInputStream)object2).readShort();
                            ++n3;
                        }
                        ++n2;
                    }
                }
                catch (Exception exception) {
                    object = exception;
                    exception.printStackTrace();
                    try {
                        if (object2 != null) {
                            ((FilterInputStream)object2).close();
                        }
                        break block19;
                    }
                    catch (IOException iOException) {
                        object2 = iOException;
                        iOException.printStackTrace();
                    }
                    break block19;
                }
            }
            catch (Throwable throwable) {
                try {
                    if (object2 != null) {
                        ((FilterInputStream)object2).close();
                    }
                }
                catch (IOException iOException) {
                    object2 = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object2).close();
            }
            catch (IOException iOException) {
                object2 = iOException;
                iOException.printStackTrace();
            }
        }
        dq.c("READ SKILL DONE");
    }

    public static void k() {
        try {
            if (av) {
                return;
            }
            dq.c("<readOk><vsData<" + ar + "==" + an);
            dq.c("<readOk><vsMap<" + as + "==" + ao);
            dq.c("<readOk><vsSkill<" + at + "==" + ap);
            dq.c("<readOk><vsItem<" + au + "==" + aq);
            if (ar == an && as == ao && at == ap && au == aq) {
                boolean bl2 = ax && ay && az && aA;
                boolean bl3 = ax && ay && aB > 0L && ej.j() - aB >= 500L;
                bl2 = !aw || bl2 || bl3;
                if (!bl2) {
                    dq.c("<readOk> Dang cho du cac type Item: [0=" + ax + ", 1=" + ay + ", 100=" + az + ", 101=" + aA + "]");
                    return;
                }
                av = true;
                aw = false;
                dq.c(">>>>> DA DU TYPE VA VERSION -> GUI CLIENT_OK: " + ar + "," + as + "," + at + "," + au);
                cw.l();
                cw.G();
                cw.l();
                cw.E();
                cw.l();
                cw.F();
                cw.l();
                cw.H();
                cj.a().u();
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public static cw l() {
        if (c == null) {
            c = new cw();
        }
        return c;
    }

    public static void m() {
        c = null;
    }

    public final void n() {
        if (fA == null) {
            fA = new Image[3];
            int n2 = 0;
            while (n2 < 3) {
                cw.fA[n2] = ej.b("/e/sp" + n2 + ".png");
                ++n2;
            }
        }
        fv = new int[2];
        fw = new int[2];
        fx = new int[2];
        fy = new int[2];
        fz = new int[2];
        cw.fx[1] = -1;
        cw.fx[0] = -1;
        cw cw2 = this;
        this.fE = 84;
        fD = 66L;
        fC = 59;
        fB = 61;
    }

    public cw() {
        int[] nArray = new int[]{-1, -1};
        this.ce = false;
        this.fW = "";
        if (main.a.A != 128) {
        }
        new ae("", 11021);
        this.bc = new ae("  ", 11000);
        this.s = new ae("", 11001);
        this.bc.g = aC;
        this.bc.l = eh.a(this.bc.g) + 20;
        this.bc.f = false;
        this.s.g = dN;
        if (main.a.e) {
            this.bc.j = 0;
            this.bc.k = 50;
            this.s = null;
        } else {
            this.bc.j = 0;
            this.bc.k = e - 30;
            this.s.j = d - 32;
            this.s.k = e - 32;
        }
        this.cB = this.s;
        bA = 1;
        if (main.a.e) {
            Q = true;
        }
        this.eh = new ae("\u0110\u1ed5i c\u1edd", main.a.a(), 100001, null);
        this.ei = new ae("Logout", main.a.a(), 100002, null);
        this.ej = new ae("chat world", main.a.a(), 100003, null);
        this.ek = new ae("InfoLog", main.a.a(), 100004, null);
        this.eh.b();
        this.ei.b();
        this.ej.b();
        this.ek.b();
        this.ej.j = main.a.A - this.ej.l;
        this.ek.j = main.a.A - this.ek.l;
        this.ei.j = main.a.A - this.ei.l;
        this.eh.j = main.a.A - this.eh.l;
        this.ej.k = this.ej.m + ev.s.a();
        this.ek.k = (this.ej.m << 1) + ev.s.a();
        this.ei.k = this.ej.m * 3 + ev.s.a();
        this.eh.k = (this.ej.m << 2) + ev.s.a();
    }

    public static final void a(int n2, int n3) {
        boolean bl2;
        dl dl2;
        d = main.a.A;
        h = 39;
        e = main.a.B;
        cN = main.a.B / 6;
        if (cN < 48) {
            cN = 48;
        }
        f = d >> 1;
        cM = e >> 1;
        cL = e - 120;
        g = (e << 1) / 3;
        i = d / 6;
        cJ = d / dx.i + 2;
        cK = e / dx.i + 2;
        if (d % 24 != 0) {
            ++cJ;
        }
        n = (dx.a - 1) * dx.i - d;
        cS = (dx.b - 1) * dx.i - e;
        if (n2 == -1 && n3 == -1) {
            j = l = co.m().N - f + i * co.m().U;
            k = m = co.m().O - g - 1;
        } else {
            j = l = n2 - cL + i * co.m().U;
            k = m = n3 - g - 1;
        }
        if (j < 24) {
            l = 24;
            j = 24;
        }
        if (j > n) {
            j = l = n;
        }
        if (k < 0) {
            m = 0;
            k = 0;
        }
        if (k > cS) {
            k = m = cS;
        }
        if ((o = j / dx.i - 1) < 0) {
            o = 0;
        }
        p = k / dx.i;
        q = o + cJ;
        r = p + cK;
        if (p < 0) {
            p = 0;
        }
        if (r > dx.b - 1) {
            r = dx.b - 1;
        }
        if ((dx.G = q - o << 2) > dx.a) {
            dx.G = dx.a;
        }
        if ((dx.H = r - p << 2) > dx.b) {
            dx.H = dx.b;
        }
        if ((dx.C = (co.m().N - 2 * d) / dx.i) < 0) {
            dx.C = 0;
        }
        if ((dx.D = dx.C + dx.G) > dx.a) {
            dx.D = dx.a;
        }
        if ((dx.E = (co.m().O - 2 * e) / dx.i) < 0) {
            dx.E = 0;
        }
        if ((dx.F = dx.E + dx.H) > dx.b) {
            dx.F = dx.b;
        }
        el.b().c = c;
        el.b().a.b = main.a.B - 35 - el.b().a.d;
        el.b().a();
        if (main.a.e) {
            fd = e - 88;
            fe = d - 40;
            ff = 2;
            if (main.a.A <= 240) {
                fe = d - 35;
                ff = 5;
            }
            fg = d - 55;
            fh = fd + 35;
            fi = d - 37;
            fj = fd - 1;
            if (main.a.A >= 450) {
                fj -= 12;
                bL -= 7;
                fg -= 10;
                fh -= 5;
                fi -= 10;
            }
        }
        cw.o();
        int n4 = eV = main.a.A > 200 ? 40 : 30;
        if (ea.d("viewchat") == -1) {
            dl2 = main.a.G;
            bl2 = true;
        } else {
            dl2 = main.a.G;
            bl2 = ea.d("viewchat") == 1;
        }
        dl2.au = bl2;
    }

    public static void o() {
        bt[] btArray = main.a.e ? bb : ba;
        fk = new int[btArray.length];
        fl = new int[btArray.length];
        el = 30;
        if (main.a.A <= 320) {
            fn = e - el - 6;
            fm = f - btArray.length * el / 2 - 25;
        } else {
            el = 40;
            fm = 10;
            fn = main.a.B - el + 7;
        }
        int n2 = 0;
        while (n2 < fk.length) {
            cw.fk[n2] = n2 * el;
            cw.fl[n2] = fn;
            if (fk.length > 5 && n2 >= fk.length / 2) {
                cw.fk[n2] = (n2 - fk.length / 2) * el;
                cw.fl[n2] = fn - 32;
            }
            ++n2;
        }
        bK = btArray.length * el;
        bL = fn;
        if (main.a.e) {
            fm = 17;
            fn = main.a.B - 40;
            if (cw.ef.b && aZ == 1) {
                bK = btArray.length * el;
                bL = fn;
            } else {
                bK = main.a.A - 45;
                bL = main.a.B - 45;
            }
            if (aZ != 0) {
                fi = fg = main.a.A - 45;
                if (cw.ef.d) {
                    fm = cw.ef.a + 20;
                    el = 35;
                    bK = fg - 45;
                } else if (cw.ef.c) {
                    bK = fg - 45;
                }
                fh = main.a.B - 45;
                fj = fh - 45;
            }
            n2 = 0;
            while (n2 < fk.length) {
                cw.fk[n2] = n2 * el;
                cw.fl[n2] = fn;
                if (fk.length > 5 && n2 >= fk.length / 2) {
                    cw.fk[n2] = (n2 - fk.length / 2) * el;
                    cw.fl[n2] = fn - 32;
                }
                ++n2;
            }
        }
    }

    public final void a(String string, int n2, int n3) {
        d d2 = new d();
        new d().b = n3;
        d2.a = n2;
        this.a(string, new ae(ch.bo, 12002, d2), new ae(ch.bp, 12003, d2));
    }

    private void I() {
        this.bj = 0;
        main.a.k();
        if (co.m().bi.V < 0) {
            return;
        }
        if (co.m().V < 0) {
            return;
        }
        eq eq2 = main.a.G.S;
        if (eq2.size() > 0) {
            return;
        }
        if (co.m().aR != null && co.m().aR.c > 1) {
            eq2.addElement(new ae(ch.cS, 11112, co.m().bi));
            eq2.addElement(new ae(ch.dO, 11113, co.m().bi));
        }
        if (co.m().aw != null && co.m().ax < 2 && co.m().bi.av == -1) {
            eq2.addElement(new ae(ch.aN[4], 110391));
        }
        if (co.m().bi.T != 14 && co.m().bi.T != 5) {
            if (co.m().aR != null && co.m().aR.c >= 14) {
                eq2.addElement(new ae(ch.aN[0], 2003));
            }
        } else {
            int cfr_ignored_0 = co.m().aQ.a.e;
        }
        if (co.m().aw != null && co.m().aw.a == co.m().bi.av && co.m().bi.T != 14 && co.m().aR != null && co.m().aR.c >= 14) {
            eq2.addElement(new ae(ch.aN[1], 2004));
        }
        int n2 = co.m().aL.b.length;
        int n3 = 0;
        while (n3 < n2) {
            bx bx2 = co.m().aL.b[n3];
            bt bt2 = co.m().a(bx2);
            if (bt2 != null && bx2.a() && bt2.c > 0) {
                eq2.addElement(new ae(bx2.b, 12004, bt2));
            }
            ++n3;
        }
    }

    public static boolean a(dh cy2) {
        if (cy2 == null) {
            return false;
        }
        if (co.m().bb == 5) {
            return true;
        }
        if (co.m().K() && !cy2.O) {
            return false;
        }
        if (co.m().bf != null && cy2.equals(co.m().bf)) {
            return false;
        }
        cy2 = cw.b(cy2.B);
        if (cy2 == null) {
            return true;
        }
        if (((co)cy2).bb == 5) {
            return true;
        }
        return co.m().c((co)cy2);
    }

    private boolean J() {
        if (co.m().aQ != null && (co.m().aQ.a.d != 1 && co.m().af < (long)co.m().aQ.i || co.m().aQ.a.d == 1 && co.m().af < co.m().ak * (long)co.m().aQ.i / 100L)) {
            aO.a(ch.bK, 0);
            this.bj = 0;
            return false;
        }
        if (co.m().aQ == null || co.m().aQ.a.c > 0 && co.m().aQ.c == 0) {
            main.a.a(ch.aU);
            return false;
        }
        return true;
    }

    public final void p() {
        main.a.F.a = false;
        Object object = el.b();
        ((el)object).a.a("");
        ((el)object).b = false;
        el.b().f = null;
        this.dK = false;
        this.ac = 0;
        cV = 0;
        cU = 0;
        this.dJ = -1;
        K = -1;
        this.ad = 0;
        this.ac = 0;
        ej.l();
        if (co.m().ag <= 0L || co.m().T == 14 || co.m().T == 5) {
            if (co.m().dk) {
                this.cA = this.fJ = new ae(ch.aY[0], 11038);
                co.m().ag = 0L;
            }
            Q = false;
        } else {
            Q = true;
        }
        object = cX;
        cX.a = 0;
        ((br)object).b = 0;
        ((br)object).c = 0;
        ((br)object).d = 0;
        ((br)object).e = 0;
        ((br)object).f = 0;
        ((br)object).g = 0;
        ((br)object).h = 0;
        ((br)object).k = 0;
        ((br)object).l = 0;
        ((br)object).i = 0;
        ((br)object).j = 0;
    }

    public final void a(int n2) {
        super.a(n2);
    }

    /*
     * Unable to fully structure code
     */
    public final void d() {
        block245: {
            block253: {
                block254: {
                    block252: {
                        block251: {
                            block247: {
                                block249: {
                                    block248: {
                                        block250: {
                                            block246: {
                                                block244: {
                                                    block243: {
                                                        block237: {
                                                            block242: {
                                                                block241: {
                                                                    block236: {
                                                                        block240: {
                                                                            block239: {
                                                                                block238: {
                                                                                    if (ci.b || co.m().E || co.m().dE) {
                                                                                        return;
                                                                                    }
                                                                                    if (da.b) {
                                                                                        return;
                                                                                    }
                                                                                    if (!main.a.e || el.b().b || main.a.F.a || (var1_1 = this).Q()) break block237;
                                                                                    ew.cF = -1;
                                                                                    if (!main.a.f) break block236;
                                                                                    if (!main.a.a(0, 0, 60, 50) || !main.a.l || !main.a.m) break block238;
                                                                                    if (co.m().aB != null) {
                                                                                        co.m().aB.a();
                                                                                    }
                                                                                    co.m().ck = null;
                                                                                    main.a.p();
                                                                                    var1_1.eM = true;
                                                                                    var1_1.eN = 5;
                                                                                    break block237;
                                                                                }
                                                                                if (dx.d() || !main.a.a(cw.fe, cw.ff, 34, 34)) break block239;
                                                                                ew.cF = 15;
                                                                                main.a.al = false;
                                                                                var1_1.bf = false;
                                                                                el.b().h = ch.br;
                                                                                if (!main.a.l || !main.a.m) break block239;
                                                                                el.b().a("");
                                                                                es.a();
                                                                                es.p();
                                                                                co.m().ck = null;
                                                                                main.a.p();
                                                                                break block237;
                                                                            }
                                                                            if (co.m().aB == null || !main.a.a(co.m().aB.j - 17, co.m().aB.k - 17, 34, 34)) break block240;
                                                                            ew.cF = 20;
                                                                            main.a.al = false;
                                                                            var1_1.bf = false;
                                                                            if (!main.a.l || !main.a.m) break block240;
                                                                            main.a.p();
                                                                            co.m().aB.a();
                                                                            break block237;
                                                                        }
                                                                        var3_9 = var1_1;
                                                                        if (cw.aZ != 0 && co.m().T != 14) {
                                                                            if (main.a.a(cw.fg, cw.fh, 40, 40)) {
                                                                                ew.cF = 5;
                                                                                if (main.a.m) {
                                                                                    main.a.i[5] = true;
                                                                                    main.a.m = false;
                                                                                    main.a.al = false;
                                                                                    main.a.l = false;
                                                                                }
                                                                            }
                                                                            cw.ef.a();
                                                                            if (main.a.a(cw.fi, cw.fj, 34, 34)) {
                                                                                ew.cF = 13;
                                                                                main.a.al = false;
                                                                                var3_9.bf = false;
                                                                                if (main.a.l && main.a.m) {
                                                                                    co.m().L();
                                                                                    main.a.m = false;
                                                                                    main.a.al = false;
                                                                                    main.a.l = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if ((cw.aZ == 0 ? main.a.a(cw.bK, cw.bL + 10, 40, 40) != false : main.a.a(cw.bK, cw.bL + 10, 34, 34) != false) && co.m().T != 14 && var1_1.aW == null) {
                                                                            ew.cF = 10;
                                                                            main.a.al = false;
                                                                            var1_1.bf = false;
                                                                            if (main.a.l && main.a.m) {
                                                                                main.a.i[10] = true;
                                                                                main.a.m = false;
                                                                                main.a.al = false;
                                                                                main.a.l = false;
                                                                            }
                                                                        }
                                                                        if ((cw.aZ == 0 ? main.a.a(cw.bK + 5, cw.bL - 6 - 40 + 10, 40, 40) != false : main.a.a(cw.bK + 5, cw.bL - 6 - 34 + 10, 34, 34) != false) && co.m().T != 14 && var1_1.aW == null) {
                                                                            if (cw.cu) {
                                                                                ew.cF = 14;
                                                                                main.a.al = false;
                                                                                var1_1.bf = false;
                                                                                if (main.a.l && main.a.m) {
                                                                                    main.a.i[14] = true;
                                                                                    main.a.m = false;
                                                                                    main.a.al = false;
                                                                                    main.a.l = false;
                                                                                    cw.cu = false;
                                                                                    cj.a().a((byte)-1, (byte)-1, (byte)-1, (short)-1);
                                                                                }
                                                                            } else if (cw.cx) {
                                                                                ew.cF = 14;
                                                                                main.a.al = false;
                                                                                var1_1.bf = false;
                                                                                if (main.a.l && main.a.m) {
                                                                                    main.a.i[14] = true;
                                                                                    main.a.m = false;
                                                                                    main.a.al = false;
                                                                                    main.a.l = false;
                                                                                    var6_16 = 0;
                                                                                    while (var6_16 < co.m().aT.length) {
                                                                                        var7_20 = co.m().aT[var6_16];
                                                                                        if (var7_20 != null) {
                                                                                            dq.b("find " + var7_20.b.a);
                                                                                            if (var7_20.b.a == 194 && (cw.cx = var7_20.h > 0)) {
                                                                                                cj.a().a((byte)0, (byte)1, (byte)var6_16, (short)-1);
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        ++var6_16;
                                                                                    }
                                                                                }
                                                                            } else if (cw.cy) {
                                                                                ew.cF = 14;
                                                                                main.a.al = false;
                                                                                var1_1.bf = false;
                                                                                if (main.a.l && main.a.m) {
                                                                                    main.a.i[14] = true;
                                                                                    main.a.m = false;
                                                                                    main.a.al = false;
                                                                                    main.a.l = false;
                                                                                    var6_16 = 0;
                                                                                    while (var6_16 < co.m().aT.length) {
                                                                                        var7_20 = co.m().aT[var6_16];
                                                                                        if (var7_20 != null && var7_20.b.a == 193 && (cw.cy = var7_20.h > 0)) {
                                                                                            cj.a().a((byte)0, (byte)1, (byte)var6_16, (short)-1);
                                                                                            break;
                                                                                        }
                                                                                        ++var6_16;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (var1_1.aW == null) break block241;
                                                                    var1_1.N();
                                                                    break block242;
                                                                }
                                                                if (!cw.Q) break block242;
                                                                if (var1_1.M()) break block237;
                                                                var1_1.eO = -1;
                                                                var6_16 = 0;
                                                                if (cw.bb.length > 5 && (main.a.a(cw.fm + cw.fk[0] - cw.el / 2 + 12, cw.fl[0] - cw.el / 2 + 12, 5 * cw.el, cw.el) || main.a.a(cw.fm + cw.fk[5] - cw.el / 2 + 12, cw.fl[5] - cw.el / 2 + 12, 5 * cw.el, cw.el))) {
                                                                    var6_16 = 1;
                                                                }
                                                                if (var6_16 != 0 || main.a.a(cw.fm + cw.fk[0] - cw.el / 2 + 12, cw.fl[0] - cw.el / 2 + 12, 5 * cw.el, cw.el) || !main.a.f && main.a.a(cw.fm + cw.fk[0] - cw.el / 2 + 12, cw.fl[0] - cw.el / 2 + 12, cw.el, cw.bb.length * cw.el)) {
                                                                    main.a.al = false;
                                                                    var1_1.bf = false;
                                                                    var7_21 = (main.a.t - (cw.fm + cw.fk[0] - cw.el / 2 + 12)) / cw.el;
                                                                    if (var6_16 != 0 && main.a.u < cw.fl[0]) {
                                                                        var7_21 += 5;
                                                                    }
                                                                    var1_1.eO = var7_21;
                                                                    if (main.a.l && main.a.m) {
                                                                        main.a.m = false;
                                                                        main.a.al = false;
                                                                        main.a.l = false;
                                                                        var1_1.eK = var7_21;
                                                                        if (var1_1.eK > cw.bb.length - 1) {
                                                                            var1_1.eK = cw.bb.length - 1;
                                                                        }
                                                                        if ((var2_23 = cw.bb[var1_1.eK]) != null) {
                                                                            super.a((bt)var2_23, true);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (main.a.m) {
                                                                if (main.a.j[1] || main.a.j[2] || main.a.j[3] || main.a.j[4] || main.a.j[6]) {
                                                                    main.a.m = false;
                                                                }
                                                                main.a.j[1] = false;
                                                                main.a.j[2] = false;
                                                                main.a.j[3] = false;
                                                                main.a.j[4] = false;
                                                                main.a.j[6] = false;
                                                            }
                                                        }
                                                        var1_1 = this;
                                                        var6_17 = System.currentTimeMillis();
                                                        if (main.a.i[2] || main.a.i[4] || main.a.i[6] || main.a.i[1] || main.a.i[3]) {
                                                            var1_1.bj = 0;
                                                            cw.bw = false;
                                                        }
                                                        if (main.a.i[5]) {
                                                            if (var1_1.bj == 0) {
                                                                if (var6_17 - var1_1.ey < 800L && (co.m().aQ != null && (co.m().aQ.a.d != 1 && co.m().af < (long)co.m().aQ.i || co.m().aQ.a.d == 1 && co.m().af < co.m().ak * (long)co.m().aQ.i / 100L) ? false : co.m().aQ != null && (co.m().aQ.a.c <= 0 || co.m().aQ.c != 0)) && (co.m().be != null || co.m().bi != null && co.m().c(co.m().bi))) {
                                                                    var1_1.bj = 10;
                                                                    main.a.i[5] = false;
                                                                }
                                                            } else {
                                                                var1_1.bj = 0;
                                                                main.a.i[6] = false;
                                                                main.a.i[4] = false;
                                                            }
                                                            var1_1.ey = var6_17;
                                                        }
                                                        if (main.a.w % 5 != 0 || var1_1.bj <= 0 || co.m().ck != null) break block243;
                                                        if (co.m().aQ != null && (co.m().aQ.a.b() || co.m().aQ.j)) break block244;
                                                        if ((co.m().be == null || co.m().be.s == 1 || co.m().be.s == 0 || co.m().bi != null) && (co.m().bi == null || !co.m().c(co.m().bi))) break block243;
                                                        if (co.m().aQ.j) break block244;
                                                        super.a(false, true);
                                                    }
                                                    if (var1_1.bj > 1) {
                                                        --var1_1.bj;
                                                    }
                                                }
                                                main.a.c();
                                                if (g.m != null) {
                                                    var1_1 = g.m.j;
                                                    if ((main.a.i[5] || ew.a((ae)var1_1)) && var1_1 != null) {
                                                        main.a.m = false;
                                                        main.a.i[5] = false;
                                                        ew.cF = -1;
                                                        if (var1_1 != null) {
                                                            var1_1.a();
                                                        }
                                                    }
                                                } else if (!el.b().b) {
                                                    if ((main.a.i[12] || ew.a(main.a.E.cz)) && this.cz != null) {
                                                        main.a.m = false;
                                                        main.a.l = false;
                                                        main.a.i[12] = false;
                                                        ew.cF = -1;
                                                        if (this.cz != null) {
                                                            this.cz.a();
                                                        }
                                                    }
                                                    if ((main.a.i[13] || ew.a(main.a.E.cB)) && this.cB != null) {
                                                        main.a.m = false;
                                                        main.a.l = false;
                                                        main.a.i[13] = false;
                                                        ew.cF = -1;
                                                        if (this.cB != null) {
                                                            this.cB.a();
                                                        }
                                                    }
                                                    if ((main.a.i[5] || ew.a(main.a.E.cA)) && this.cA != null) {
                                                        main.a.m = false;
                                                        main.a.i[5] = false;
                                                        ew.cF = -1;
                                                        if (this.cA != null) {
                                                            this.cA.a();
                                                        }
                                                    }
                                                } else {
                                                    if (el.b().d != null && (main.a.i[12] || ew.a(el.b().d)) && el.b().d != null) {
                                                        el.b().d.a();
                                                    }
                                                    if (el.b().e != null && (main.a.i[13] || ew.a(el.b().e)) && el.b().e != null) {
                                                        el.b().e.a();
                                                    }
                                                    if (el.b().f != null && (main.a.i[5] || ew.a(el.b().f)) && el.b().f != null) {
                                                        el.b().f.a();
                                                    }
                                                }
                                                main.a.c();
                                                var1_1 = this;
                                                main.a.c();
                                                if (co.m().ck != null) {
                                                    var1_2 = 0;
                                                    while (var1_2 < main.a.i.length) {
                                                        if (main.a.i[var1_2]) {
                                                            co.m().ck = null;
                                                            break;
                                                        }
                                                        ++var1_2;
                                                    }
                                                }
                                                main.a.c();
                                                if (el.b().b && main.a.ai != 0) {
                                                    el.b().a(main.a.ai);
                                                    main.a.ai = 0;
                                                    return;
                                                }
                                                if (main.a.F.a || co.cc) {
                                                    return;
                                                }
                                                if (main.a.i[10]) {
                                                    main.a.i[10] = false;
                                                    this.K();
                                                    main.a.j();
                                                }
                                                if (main.a.i[11] && this.aW == null) {
                                                    if (this.cd != null) {
                                                        this.cd.a.a();
                                                    } else if (cw.aP.b.b != null && cw.aP.b.b.c != null) {
                                                        main.a.G.l();
                                                        main.a.G.s();
                                                    }
                                                    main.a.i[11] = false;
                                                    main.a.j();
                                                }
                                                if (main.a.ai != 0 && et.g && main.a.ai == 32) {
                                                    this.K();
                                                    main.a.ai = 0;
                                                    main.a.j();
                                                }
                                                if (main.a.ai != 0 && this.aW == null && et.g && main.a.ai == 121) {
                                                    if (this.cd != null) {
                                                        this.cd.a.a();
                                                        main.a.ai = 0;
                                                        main.a.j();
                                                    } else if (cw.aP.b.b != null && cw.aP.b.b.c != null) {
                                                        main.a.G.l();
                                                        main.a.G.s();
                                                        main.a.ai = 0;
                                                        main.a.j();
                                                    }
                                                }
                                                if (main.a.i[10] && this.aW == null) {
                                                    main.a.i[10] = false;
                                                    var1_3 = 10;
                                                    var1_4 = cw.aP;
                                                    cw.aP.g = 10;
                                                    main.a.j();
                                                }
                                                var1_5 = this;
                                                if (!cw.ef.b() && cw.aZ != 1) {
                                                    co.m().aD = true;
                                                    if (main.a.al) {
                                                        main.a.al = false;
                                                        var1_5.bf = true;
                                                        var1_5.er = 0;
                                                        var1_5.en = var1_5.ep = main.a.p;
                                                        var1_5.eo = var1_5.eq = main.a.q;
                                                    }
                                                    if (var1_5.bf) {
                                                        var6_18 = main.a.p - var1_5.en;
                                                        var7_22 = main.a.q - var1_5.eo;
                                                        if (!(var1_5.em || dq.g(main.a.p - var1_5.ep) <= 15 && dq.g(main.a.q - var1_5.eq) <= 15)) {
                                                            var1_5.em = true;
                                                        }
                                                        var1_5.en = main.a.p;
                                                        var1_5.eo = main.a.q;
                                                        ++var1_5.er;
                                                        if (var1_5.em) {
                                                            co.m().aD = false;
                                                            cw.k -= var7_22;
                                                            if ((cw.j -= var6_18) < 24 && (var2_24 = (24 - cw.j) / 3) != 0) {
                                                                cw.j += var6_18 - var6_18 / var2_24;
                                                            }
                                                            if (cw.j < 24) {
                                                                cw.j = 24;
                                                            }
                                                            if (cw.j > cw.n && (var2_25 = (cw.j - cw.n) / 3) != 0) {
                                                                cw.j += var6_18 - var6_18 / var2_25;
                                                            }
                                                            if (cw.j > cw.n) {
                                                                cw.j = cw.n;
                                                            }
                                                            if (cw.k < 0 && (var2_26 = (0 - cw.k) / 3) != 0) {
                                                                cw.k += var7_22 - var7_22 / var2_26;
                                                            }
                                                            if (cw.k < 0) {
                                                                cw.k = 0;
                                                            }
                                                            if (cw.k > cw.cS) {
                                                                cw.k = cw.cS;
                                                            }
                                                            cw.l = cw.j;
                                                            cw.m = cw.k;
                                                        }
                                                    }
                                                    if (var1_5.bf && main.a.m) {
                                                        var1_5.bf = false;
                                                        var1_5.em = false;
                                                        if (dq.g(main.a.p - var1_5.ep) > 15 || dq.g(main.a.q - var1_5.eq) > 15) {
                                                            main.a.m = false;
                                                        }
                                                    }
                                                }
                                                if (co.m().cK || (var1_5 = this).M()) break block245;
                                                if (var1_5.cd == null || var1_5.cd.a == null || !var1_5.cd.a.c()) break block246;
                                                var1_5.cd.a.a();
                                                break block245;
                                            }
                                            var2_23 = var1_5;
                                            if (var2_23.aW != null && main.a.a(var3_10 = (main.a.A - 5 * cw.eV) / 2, var5_28 = main.a.B - 40, var4_27 = 5 * cw.eV, var8_31 = cw.eV) != false) break block245;
                                            var6_19 = System.currentTimeMillis();
                                            if (var1_5.bg != 0L) {
                                                var1_5.bg = 0L;
                                                main.a.al = false;
                                                if (!var1_5.es) {
                                                    var2_23 = var1_5;
                                                    var3_11 = main.a.p + var2_23.ew;
                                                    var4_27 = main.a.q + var2_23.ex;
                                                    if (!super.g(var3_11, var4_27) && !super.f(var3_11, var4_27)) {
                                                        super.h(var3_11, var4_27);
                                                    }
                                                    main.a.m = false;
                                                    var1_5.cG = true;
                                                    var1_5.cH = ej.j();
                                                }
                                            }
                                            if (!var1_5.cG) break block247;
                                            var1_5.cI = ej.j();
                                            if (var1_5.cI - var1_5.cH >= 300L || !main.a.m) break block247;
                                            var1_5.cG = false;
                                            var2_23 = var1_5;
                                            var3_12 = main.a.p + var2_23.ew;
                                            var4_27 = main.a.q + var2_23.ex;
                                            co.m().O;
                                            var8_32 = super.e(var3_12, var4_27);
                                            if (var8_32 == null) break block248;
                                            if (var8_32 instanceof dh && !cw.a((dh)var8_32)) break block249;
                                            if (super.a(var8_32) || !var8_32.equals(co.m().bh) && var2_23.aW != null) break block247;
                                            if (!co.m().K() || co.m().bi == null || var8_32.equals(co.m().bi) || var8_32.equals(co.m().bi.bf) || !(var8_32 instanceof co)) break block250;
                                            var5_29 = (co)var8_32;
                                            if (var5_29.bb != 5 && !var5_29.K()) break block249;
                                        }
                                        if (dx.l == 51 && var8_32.equals(co.m().bh)) break block249;
                                        super.b(var8_32);
                                        break block247;
                                    }
                                    if (super.g(var3_12, var4_27) || super.f(var3_12, var4_27)) break block247;
                                }
                                super.h(var3_12, var4_27);
                            }
                            if (!main.a.m) break block245;
                            var2_23 = var1_5;
                            var3_13 = main.a.p + cw.j;
                            var4_27 = main.a.q + cw.k;
                            co.m();
                            co.Q();
                            var5_30 = super.e(var3_13, var4_27);
                            if (var5_30 == null) ** GOTO lbl386
                            if (!co.m().K() || co.m().bi == null || var5_30.equals(co.m().bi) || var5_30.equals(co.m().bi.bf) || !(var5_30 instanceof co)) break block251;
                            var8_33 = (co)var5_30;
                            if (var8_33.bb == 5 || var8_33.K()) break block251;
                            super.h(var3_13, var4_27);
                            ** GOTO lbl386
                        }
                        if (co.m().be != var5_30 && co.m().bj != var5_30) break block252;
                        super.b(var5_30);
                        v0 = true;
                        break block253;
                    }
                    if (dx.l != 51 || !var5_30.equals(co.m().bh)) break block254;
                    super.h(var3_13, var4_27);
                    ** GOTO lbl386
                }
                if (co.m().cG != null || co.m().cD != null || co.m().cE != null || co.m().F() != null) {
                    v0 = false;
                } else {
                    co.m().a(var5_30);
                    var5_30.f();
lbl386:
                    // 4 sources

                    v0 = false;
                }
            }
            var1_5.es = v0;
            var1_5.bg = var6_19;
            var1_5.ew = cw.j;
            var1_5.ex = cw.k;
            main.a.m = false;
        }
        if (co.m().aB != null && co.m().aB.c()) {
            co.m().aB.a();
        }
        if (co.m().cG != null) {
            return;
        }
        if (co.m().T == 1) {
            main.a.c();
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, false);
            } else if (main.a.j[2]) {
                if (!co.m().ce) {
                    var1_6 = false;
                    if (co.m().N - co.m().bU != 0 || co.m().O - co.m().bV != 0) {
                        cj.a().l();
                    }
                    co.m().Q = -10;
                    co.m().P = 0;
                    co.m().T = 3;
                    co.m().R = 0;
                }
            } else if (main.a.j[4]) {
                cw.bw = false;
                co.m().aF = false;
                if (co.m().U == 1) {
                    co.m().U = -1;
                } else if (!co.m().ce) {
                    if (co.m().N - co.m().bU != 0) {
                        cj.a().l();
                    }
                    co.m().T = 2;
                    co.m().P = -co.m().aa;
                }
                co.m().dm = false;
            } else if (main.a.j[6]) {
                cw.bw = false;
                co.m().aF = false;
                if (co.m().U == -1) {
                    co.m().U = 1;
                } else if (!co.m().ce) {
                    if (co.m().N - co.m().bU != 0) {
                        cj.a().l();
                    }
                    co.m().T = 2;
                    co.m().P = co.m().aa;
                }
                co.m().dm = false;
            }
        } else if (co.m().T == 2) {
            main.a.c();
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, true);
            } else if (main.a.j[2]) {
                if (co.m().N - co.m().bU != 0 || co.m().O - co.m().bV != 0) {
                    cj.a().l();
                }
                co.m().Q = -10;
                co.m().T = 3;
                co.m().R = 0;
            } else if (main.a.j[4]) {
                cw.bw = false;
                if (co.m().U == 1) {
                    co.m().U = -1;
                } else {
                    v1 = co.m();
                    v2 = -co.m().aa;
                    co.m();
                    v1.P = v2;
                }
            } else if (main.a.j[6]) {
                cw.bw = false;
                if (co.m().U == -1) {
                    co.m().U = 1;
                } else {
                    v3 = co.m();
                    v4 = co.m().aa;
                    co.m();
                    v3.P = v4;
                }
            }
        } else if (co.m().T == 3) {
            cw.bw = false;
            main.a.c();
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, true);
            }
            if (main.a.j[4] || main.a.j[1] && this.aW == null) {
                if (co.m().U == 1) {
                    co.m().U = -1;
                } else {
                    co.m().P = -co.m().aa;
                }
            } else if (main.a.j[6] || main.a.j[3] && this.aW == null) {
                if (co.m().U == -1) {
                    co.m().U = 1;
                } else {
                    co.m().P = co.m().aa;
                }
            }
            if ((main.a.j[2] || (main.a.j[1] || main.a.j[3]) && this.aW == null) && co.m().aC && co.m().af > 0L && co.m().R < 8 && co.m().Q > -4) {
                ++co.m().R;
                co.m().Q = -7;
            }
        } else if (co.m().T == 4) {
            main.a.c();
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, true);
            }
            if (main.a.j[2] && co.m().af > 0L && co.m().aC) {
                cw.bw = false;
                if (!(co.m().N - co.m().bU == 0 && co.m().O - co.m().bV == 0 || dq.g(co.m().N - co.m().bU) <= 96 && dq.g(co.m().O - co.m().bV) <= 24)) {
                    cj.a().l();
                }
                co.m().Q = -10;
                co.m().T = 3;
                co.m().R = 0;
            }
            if (main.a.j[4]) {
                cw.bw = false;
                if (co.m().U == 1) {
                    co.m().U = -1;
                } else {
                    ++co.m().R;
                    co.m().P = -co.m().aa;
                    if (co.m().R > 5 && co.m().Q > 6) {
                        co.m().T = 10;
                        co.m().R = 0;
                        co.m().Q = 0;
                    }
                }
            } else if (main.a.j[6]) {
                cw.bw = false;
                if (co.m().U == -1) {
                    co.m().U = 1;
                } else {
                    ++co.m().R;
                    co.m().P = co.m().aa;
                    if (co.m().R > 5 && co.m().Q > 6) {
                        co.m().T = 10;
                        co.m().R = 0;
                        co.m().Q = 0;
                    }
                }
            }
        } else if (co.m().T == 10) {
            main.a.c();
            if (main.a.i[5]) {
                main.a.i[5] = false;
                this.a(false, true);
            }
            if (co.m().aC && co.m().af > 0L) {
                if (main.a.j[2]) {
                    cw.bw = false;
                    if (!(co.m().N - co.m().bU == 0 && co.m().O - co.m().bV == 0 || dq.g(co.m().N - co.m().bU) <= 96 && dq.g(co.m().O - co.m().bV) <= 24)) {
                        cj.a().l();
                    }
                    co.m().Q = -10;
                    co.m().T = 3;
                    co.m().R = 0;
                } else if (main.a.j[4]) {
                    cw.bw = false;
                    if (co.m().U == 1) {
                        co.m().U = -1;
                    } else {
                        co.m().P = -(co.m().aa + 1);
                    }
                } else if (main.a.j[6]) {
                    if (co.m().U == -1) {
                        co.m().U = 1;
                    } else {
                        co.m().P = co.m().aa + 1;
                    }
                }
            }
        } else if (co.m().T == 7) {
            main.a.c();
            if (main.a.i[5]) {
                main.a.i[5] = false;
            }
            if (main.a.j[4]) {
                cw.bw = false;
                if (co.m().U == 1) {
                    co.m().U = -1;
                } else {
                    co.m().P = -co.m().aa + 2;
                }
            } else if (main.a.j[6]) {
                cw.bw = false;
                if (co.m().U == -1) {
                    co.m().U = 1;
                } else {
                    co.m().P = co.m().aa - 2;
                }
            }
        }
        main.a.c();
        if (main.a.i[8] && main.a.ai != 56) {
            main.a.i[8] = false;
            co.m().cl = 0;
        }
        if (main.a.i[10]) {
            main.a.i[10] = false;
            this.K();
        }
        main.a.c();
        if (main.a.ai != 0) {
            if (this.aW == null) {
                if (et.g) {
                    if (main.a.ai == 113) {
                        if (cw.ba[0] != null) {
                            this.a(cw.ba[0], true);
                        }
                    } else if (main.a.ai == 119) {
                        if (cw.ba[1] != null) {
                            this.a(cw.ba[1], true);
                        }
                    } else if (main.a.ai == 101) {
                        if (cw.ba[2] != null) {
                            this.a(cw.ba[2], true);
                        }
                    } else if (main.a.ai == 114) {
                        if (cw.ba[3] != null) {
                            this.a(cw.ba[3], true);
                        }
                    } else if (main.a.ai == 116) {
                        if (cw.ba[4] != null) {
                            this.a(cw.ba[4], true);
                        }
                    } else if (main.a.ai != 50 && main.a.ai != 53) {
                        el.b().a(main.a.ai, this, "");
                    }
                } else if (!main.a.c) {
                    el.b().a(main.a.ai, this, "");
                } else if (main.a.ai == 55) {
                    if (cw.ba[0] != null) {
                        this.a(cw.ba[0], true);
                    }
                } else if (main.a.ai == 56) {
                    if (cw.ba[1] != null) {
                        this.a(cw.ba[1], true);
                    }
                } else if (main.a.ai == 57) {
                    if (cw.ba[2] != null) {
                        this.a(cw.ba[2], true);
                    }
                } else if (main.a.ai == 49) {
                    if (cw.ba[3] != null) {
                        this.a(cw.ba[3], true);
                    }
                } else if (main.a.ai == 51) {
                    if (cw.ba[4] != null) {
                        this.a(cw.ba[4], true);
                    }
                } else if (main.a.ai == 48) {
                    el.b().a("");
                }
            } else {
                var1_7 = this.bF.toCharArray();
                var2_23 = new eq("");
                var3_14 = 0;
                while (var3_14 < var1_7.length) {
                    var2_23.addElement(String.valueOf(var1_7[var3_14]));
                    ++var3_14;
                }
                var2_23.removeElementAt(0);
                var3_15 = String.valueOf((char)main.a.ai);
                if (var3_15.equals("") || var3_15 == null || var3_15.equals("\n")) {
                    var3_15 = "-";
                }
                var2_23.insertElementAt(var3_15, var2_23.size());
                this.bF = "";
                var1_8 = 0;
                while (var1_8 < var2_23.size()) {
                    this.bF = String.valueOf(this.bF) + ((String)var2_23.elementAt(var1_8)).toUpperCase();
                    ++var1_8;
                }
                cj.a().a((char)main.a.ai);
            }
            main.a.ai = 0;
        }
        main.a.j();
        main.a.c();
    }

    private cy e(int n2, int n3) {
        cy cy2 = null;
        int n4 = 0;
        eq[] eqArray = new eq[]{G, H, F, E};
        int n5 = 0;
        while (n5 < eqArray.length) {
            int n6 = 0;
            while (n6 < eqArray[n5].size()) {
                block10: {
                    int n7;
                    cy cy3;
                    block11: {
                        cy3 = (cy)eqArray[n5].elementAt(n6);
                        if (cy3.g()) break block10;
                        if (!(cy3 instanceof dh)) break block11;
                        dh dh2 = (dh)cy3;
                        if (dh2.O && dh2.equals(co.m().bf)) break block10;
                    }
                    int n8 = cy3.b();
                    int n9 = cy3.c();
                    int n10 = cy3.e();
                    if (cw.a(n2, n3, n8 - n10 / 2 - 30, n9 - (n7 = cy3.d()) - 30, n10 + 60, n7 + 60)) {
                        if (cy2 == null) {
                            cy2 = cy3;
                            n4 = dq.g(n2 - n8) + dq.g(n3 - n9);
                            if (n5 == 1) {
                                return cy2;
                            }
                        } else if ((n8 = dq.g(n2 - n8) + dq.g(n3 - n9)) < n4) {
                            cy2 = cy3;
                            n4 = n8;
                        }
                    }
                }
                ++n6;
            }
            ++n5;
        }
        return cy2;
    }

    private static boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return n2 >= n4 && n2 <= n4 + n6 && n3 >= n5 && n3 <= n5 + n7;
    }

    private boolean a(cy cy2) {
        int n2;
        if (cy2 == null) {
            return false;
        }
        int n3 = cy2.c();
        if (n3 < (n2 = co.m().O)) {
            while (n3 < n2) {
                if (!dx.a(co.m().N, n2 -= 5, 8192)) continue;
                this.bj = 0;
                co.m();
                co.Q();
                co.m().ck = null;
                return true;
            }
        }
        return false;
    }

    private void b(cy cy2) {
        if (!cy2.equals(co.m().bh) && this.aW != null) {
            return;
        }
        if (this.a(cy2)) {
            return;
        }
        boolean bl2 = false;
        cy cy3 = cy2;
        cw cw2 = this;
        if (cy3 != null && cw2.fc <= 0) {
            cw2.fc = 10;
            int n2 = cy3.b();
            n2 = (n2 = dq.g(co.m().N - n2)) <= 80 ? 1 : (n2 > 80 && n2 <= 200 ? 2 : (n2 > 200 && n2 <= 400 ? 3 : 4));
            if (cy3.equals(co.m().be) || cy3.equals(co.m().bi) && co.m().c(co.m().bi)) {
                u.a(135, cy3.b(), cy3.c(), n2);
            } else if (cy3.equals(co.m().bh) || cy3.equals(co.m().bj) || cy3.equals(co.m().bi)) {
                u.a(136, cy3.b(), cy3.c(), n2);
            }
        }
        co.m();
        co.Q();
        co.m().ck = null;
        co.m().Q = 0;
        co.m().P = 0;
        cy2.f();
        this.bj = 10;
        this.a(false, true);
        this.eu = cy2.b();
        this.ev = cy2.c();
        this.et = false;
        this.bh = true;
    }

    private boolean f(int n2, int n3) {
        int n4;
        int n5;
        if (this.equals(aP) && cw.l().cd != null) {
            return false;
        }
        if (cw.aP.b.b != null && cw.aP.b.b.c != null && cw.a(n2 - j, n3 - k, n5 = dq.g(cw.aP.d) + cw.aP.b.g - 40, n4 = dq.g(cw.aP.c) + cw.aP.b.h, 200, cw.aP.b.j)) {
            n2 = 10;
            dc dc2 = aP;
            aP.g = 10;
            return true;
        }
        return false;
    }

    private boolean g(int n2, int n3) {
        int n4 = 0;
        while (n4 < bo.a.size()) {
            bo bo2 = (bo)bo.a.elementAt(n4);
            if (cw.a(n2, n3, bo2.d, bo2.e, bo2.f, bo2.g)) {
                if (bo2.e <= 24 && dx.f() && co.m().bb != 0) {
                    return false;
                }
                if (bo2.j) {
                    bo2.a(10);
                    return true;
                }
            }
            ++n4;
        }
        return false;
    }

    private void h(int n2, int n3) {
        if (ef.c()) {
            return;
        }
        co.m();
        co.Q();
        if (n2 < dx.c && n2 > dx.c - 32) {
            co.m().ck = new be(dx.c, n3);
            return;
        }
        if (n2 < 32 && n2 > 0) {
            co.m().ck = new be(0, n3);
            return;
        }
        this.eu = n2;
        this.ev = n3;
        this.et = false;
        co.m().cl = 0;
        int n4 = n2 = co.m().aC && co.m().af > 0L ? 0 : 1000;
        if (this.ev > co.m().O && dq.g(this.eu - co.m().N) < 12) {
            return;
        }
        int n5 = 0;
        while (n5 < n2 + 60) {
            if (this.ev + n5 >= dx.d - 24) break;
            if (dx.a(this.eu, this.ev + n5, 2)) {
                this.ev = dx.e(this.ev + n5);
                this.et = true;
                break;
            }
            n5 += 24;
        }
        n5 = 0;
        while (n5 < n2 + 40) {
            if (dx.a(this.eu, this.ev - n5, 2)) {
                this.ev = dx.e(this.ev - n5);
                this.et = true;
                break;
            }
            n5 += 24;
        }
        this.bh = true;
        if (this.et && n3 >= this.ev) {
        }
        co.m().cl = 0;
        if (!this.et && this.ev < co.m().O - 50) {
            co.m().cl = 20;
        }
        this.bj = 0;
        if (co.m().dm) {
            co.m().S();
        }
        co.m().ck = new be(this.eu, this.ev);
        co.m().U = co.m().N - co.m().ck.a > 0 ? -1 : 1;
        co.m().aM = null;
        bw = false;
    }

    private void K() {
        if (co.m().du) {
            return;
        }
        if (co.m().dr) {
            return;
        }
        if (co.m().dl > 0) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.ez < 10000L) {
            return;
        }
        if (!co.m().O()) {
            aO.a(ch.aV, 0);
            return;
        }
        u.a(11, co.m(), 5);
        u.a(104, co.m(), 4);
        this.ez = l2;
        es.a();
        es.t();
    }

    public final void b(int n2, int n3) {
        if (!this.eB) {
            es.a();
            es.V();
            dq.c("ACTIVE SUPER POWER");
            this.eB = true;
            this.eC = 0;
            this.eF = 0;
            this.eD = n2 - j;
            this.eE = n3 - k;
        }
    }

    public final void a(boolean bl2) {
        this.bp = true;
        this.bm = true;
        this.eG = true;
        if (bl2) {
            i i2 = new i(20, co.m().N, co.m().O - 77, 2, 8, 1);
            h.a(i2);
        }
    }

    public final void q() {
        this.bp = false;
        this.bm = true;
        this.eG = false;
    }

    public final void r() {
        this.bn = true;
        this.bq = eh.a(0.4f, 0, main.a.ah[main.a.ah.length - 1]);
    }

    public final void c(int n2, int n3) {
        dq.c("VE RONG THAN O VI TRI x= " + n2 + " y=" + n3);
        this.r();
        i i2 = new i(this.bo ? 25 : 17, n2, n3 - 77, 2, -1, 1);
        h.a(i2);
    }

    /*
     * Unable to fully structure code
     */
    private void a(boolean var1_1, boolean var2_2) {
        block46: {
            block48: {
                block50: {
                    block73: {
                        block75: {
                            block78: {
                                block77: {
                                    block76: {
                                        block74: {
                                            block67: {
                                                block70: {
                                                    block69: {
                                                        block71: {
                                                            block72: {
                                                                block68: {
                                                                    block59: {
                                                                        block65: {
                                                                            block66: {
                                                                                block64: {
                                                                                    block63: {
                                                                                        block62: {
                                                                                            block61: {
                                                                                                block60: {
                                                                                                    block58: {
                                                                                                        block57: {
                                                                                                            block56: {
                                                                                                                block55: {
                                                                                                                    block54: {
                                                                                                                        block53: {
                                                                                                                            block52: {
                                                                                                                                block51: {
                                                                                                                                    block49: {
                                                                                                                                        block47: {
                                                                                                                                            if (co.m().bi != null && co.m().bi.O >= co.m().O + 48 && dx.a(co.m().N, co.m().O, 2)) {
                                                                                                                                                this.bj = 0;
                                                                                                                                                co.m().ck = null;
                                                                                                                                                co.cc = false;
                                                                                                                                                co.m().ce = false;
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            dq.c("do fire");
                                                                                                                                            ++cw.eH;
                                                                                                                                            var3_10 = co.m().q();
                                                                                                                                            var4_14 = co.m().r();
                                                                                                                                            if (!var2_2 && var3_10 != null && (co.m().be == null || co.m().be != null && co.m().be.H == 0)) {
                                                                                                                                                var3_10.g.i.a();
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (!var2_2 && var4_14 != null && (co.m().be == null || co.m().be != null && co.m().be.H == 0)) {
                                                                                                                                                var4_14.g.i.a();
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (dx.l == 51 && co.m().bh != null) {
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            if (co.m().T == 14) break block46;
                                                                                                                                            co.m().Q = 0;
                                                                                                                                            co.m().P = 0;
                                                                                                                                            if (!co.m().y() || !co.m().R()) break block47;
                                                                                                                                            if (this.J()) {
                                                                                                                                                co.m().cS = var1_1;
                                                                                                                                                co.m();
                                                                                                                                                co.C();
                                                                                                                                            }
                                                                                                                                            break block48;
                                                                                                                                        }
                                                                                                                                        var2_3 = this;
                                                                                                                                        if (!var2_3.a(co.m().bi)) break block49;
                                                                                                                                        v0 = false;
                                                                                                                                        break block50;
                                                                                                                                    }
                                                                                                                                    if (!var2_3.a(co.m().be)) break block51;
                                                                                                                                    v0 = false;
                                                                                                                                    break block50;
                                                                                                                                }
                                                                                                                                if (!var2_3.a(co.m().bh)) break block52;
                                                                                                                                v0 = false;
                                                                                                                                break block50;
                                                                                                                            }
                                                                                                                            if (!el.b().b) break block53;
                                                                                                                            v0 = false;
                                                                                                                            break block50;
                                                                                                                        }
                                                                                                                        if (da.b) break block54;
                                                                                                                        co.m();
                                                                                                                        if (!co.cc) break block55;
                                                                                                                    }
                                                                                                                    v0 = false;
                                                                                                                    break block50;
                                                                                                                }
                                                                                                                if (co.m().aQ == null || co.m().aQ.a.a != 6 || co.m().bj == null) break block56;
                                                                                                                var2_3.L();
                                                                                                                v0 = false;
                                                                                                                break block50;
                                                                                                            }
                                                                                                            if (co.m().aQ == null || co.m().aQ.a.e != 2 || co.m().bh != null || co.m().aQ.a.a == 6) break block57;
                                                                                                            v0 = var2_3.J();
                                                                                                            break block50;
                                                                                                        }
                                                                                                        if (co.m().cG == null && (co.m().be != null || co.m().bh != null || co.m().bi != null || co.m().bj != null)) break block58;
                                                                                                        v0 = false;
                                                                                                        break block50;
                                                                                                    }
                                                                                                    if (co.m().be == null) break block59;
                                                                                                    if (co.m().be.w() && co.m().be.s == 4) {
                                                                                                        co.m().be = null;
                                                                                                        co.m().ck = null;
                                                                                                    }
                                                                                                    cw.bw = true;
                                                                                                    if (cw.a(co.m().be)) break block60;
                                                                                                    v0 = false;
                                                                                                    break block50;
                                                                                                }
                                                                                                if (var2_3.aW == null) break block61;
                                                                                                v0 = false;
                                                                                                break block50;
                                                                                            }
                                                                                            if (co.m().aQ != null) break block62;
                                                                                            v0 = false;
                                                                                            break block50;
                                                                                        }
                                                                                        if (!co.m().y()) break block63;
                                                                                        v0 = false;
                                                                                        break block50;
                                                                                    }
                                                                                    var3_11 = -1;
                                                                                    var4_15 = dq.g(co.m().N - cw.j) * eh.b;
                                                                                    if (co.m().bi != null) {
                                                                                        var3_11 = dq.g(co.m().N - co.m().bi.N) * eh.b;
                                                                                    } else if (co.m().be != null) {
                                                                                        var3_11 = dq.g(co.m().N - co.m().be.p) * eh.b;
                                                                                    }
                                                                                    if ((co.m().be.s == 1 || co.m().be.s == 0 || co.m().aQ.a.e == 4 || var3_11 == -1 || var3_11 > var4_15) && co.m().aQ.a.e == 4) {
                                                                                        co.m().U = co.m().be.p < co.m().N ? -1 : 1;
                                                                                        var2_3.a(co.m().aQ, true);
                                                                                    }
                                                                                    if (var2_3.J()) break block64;
                                                                                    v0 = false;
                                                                                    break block50;
                                                                                }
                                                                                co.m().U = co.m().N < co.m().be.b() ? 1 : -1;
                                                                                var2_4 = Math.abs(co.m().N - co.m().be.b());
                                                                                var4_15 = Math.abs(co.m().O - co.m().be.c());
                                                                                co.m().P = 0;
                                                                                if (var2_4 > co.m().aQ.g || var4_15 > co.m().aQ.h) break block65;
                                                                                if (co.m().aQ.a.a == 20) ** GOTO lbl-1000
                                                                                if (var4_15 <= var2_4 || dq.g(co.m().O - co.m().be.c()) <= 30 || co.m().be.B().c != 4) break block66;
                                                                                co.m().ck = new be(co.m().N + co.m().U, co.m().be.c());
                                                                                co.m().aM = new ae(null, null, 8002, null);
                                                                                main.a.k();
                                                                                main.a.j();
                                                                                v0 = false;
                                                                                break block50;
                                                                            }
                                                                            var5_18 = 20;
                                                                            var3_11 = 0;
                                                                            if (co.m().be instanceof cm || co.m().be instanceof cn) {
                                                                                var3_11 = 1;
                                                                            }
                                                                            if (co.m().aQ.g > 100) {
                                                                                var5_18 = 60;
                                                                                if (var2_4 < 20) {
                                                                                    co.m().a(co.m().N, co.m().O, 10);
                                                                                }
                                                                            }
                                                                            dq.c("dt= " + var5_18);
                                                                            var4_15 = 0;
                                                                            if ((dx.b(co.m().N, co.m().O + 3) & 2) == 2) {
                                                                                v1 = var6_21 = co.m().N > co.m().be.b() ? 1 : -1;
                                                                                if ((dx.b(co.m().be.b() + var5_18 * var6_21, co.m().O + 3) & 2) != 2) {
                                                                                    var4_15 = 1;
                                                                                }
                                                                            }
                                                                            if (var2_4 <= var5_18 && var4_15 == 0) {
                                                                                if (co.m().N > co.m().be.b()) {
                                                                                    var6_21 = co.m().be.b() + var5_18 + (var3_11 != 0 ? 30 : 0);
                                                                                    var2_4 = co.m().be.b();
                                                                                    var3_11 = 0;
                                                                                    while (var2_4 < var6_21) {
                                                                                        if (dx.b(var2_4, co.m().O + 3) == 8 || dx.b(var2_4, co.m().O + 3) == 4) {
                                                                                            var3_11 = 1;
                                                                                            break;
                                                                                        }
                                                                                        var2_4 += 24;
                                                                                    }
                                                                                    co.m().N = var3_11 != 0 ? var2_4 - 24 : var6_21;
                                                                                    co.m().U = -1;
                                                                                } else {
                                                                                    var6_21 = co.m().be.b() - var5_18 - (var3_11 != 0 ? 30 : 0);
                                                                                    var2_4 = co.m().be.b();
                                                                                    var3_11 = 0;
                                                                                    while (var2_4 > var6_21) {
                                                                                        if (dx.b(var2_4, co.m().O + 3) == 8 || dx.b(var2_4, co.m().O + 3) == 4) {
                                                                                            var3_11 = 1;
                                                                                            break;
                                                                                        }
                                                                                        var2_4 -= 24;
                                                                                    }
                                                                                    co.m().N = var3_11 != 0 ? var2_4 + 24 : var6_21;
                                                                                    co.m().U = 1;
                                                                                }
                                                                                cj.a().l();
                                                                            }
                                                                            main.a.k();
                                                                            main.a.j();
                                                                            ** GOTO lbl-1000
                                                                        }
                                                                        var5_19 = false;
                                                                        if (co.m().be instanceof cm || co.m().be instanceof cn) {
                                                                            var5_19 = true;
                                                                        }
                                                                        var3_11 = (co.m().aQ.g - (var5_19 != false ? 50 : 20)) * (co.m().N > co.m().be.b() ? 1 : -1);
                                                                        if (var2_4 <= co.m().aQ.g) {
                                                                            var3_11 = 0;
                                                                        }
                                                                        co.m().ck = new be(co.m().be.b() + var3_11, co.m().be.c());
                                                                        co.m().aM = new ae(null, null, 8002, null);
                                                                        main.a.k();
                                                                        main.a.j();
                                                                        v0 = false;
                                                                        break block50;
                                                                    }
                                                                    if (co.m().bh == null) break block67;
                                                                    if (!co.m().bh.v) break block68;
                                                                    v0 = false;
                                                                    break block50;
                                                                }
                                                                co.m().U = co.m().N < co.m().bh.N ? 1 : -1;
                                                                co.m().bh.U = co.m().N < co.m().bh.N ? -1 : 1;
                                                                var3_12 = Math.abs(co.m().N - co.m().bh.N);
                                                                var4_16 = Math.abs(co.m().O - co.m().bh.O);
                                                                if (var4_16 > 40) {
                                                                    co.m().O = co.m().bh.O - 40;
                                                                }
                                                                if (var3_12 >= 60) break block69;
                                                                main.a.k();
                                                                main.a.j();
                                                                if (var2_3.dI != 0) break block70;
                                                                if (co.m().aR == null || co.m().aR.c != 0) break block71;
                                                                if (co.m().aR.a >= 4 || co.m().bh.t.a != 4) break block72;
                                                                v0 = false;
                                                                break block50;
                                                            }
                                                            if (co.m().aR.a >= 3 || co.m().bh.t.a != 3) break block71;
                                                            v0 = false;
                                                            break block50;
                                                        }
                                                        var2_3.dI = 50;
                                                        da.a();
                                                        cj.a().l();
                                                        cj.a().j(co.m().bh.t.a);
                                                        break block70;
                                                    }
                                                    var2_5 = (20 + dq.a.nextInt(20)) * (co.m().N > co.m().bh.N ? 1 : -1);
                                                    co.m().ck = new be(co.m().bh.N + var2_5, co.m().O);
                                                    co.m().aM = new ae(null, null, 8002, null);
                                                    main.a.k();
                                                    main.a.j();
                                                }
                                                v0 = false;
                                                break block50;
                                            }
                                            if (co.m().bi == null) break block73;
                                            if (var2_3.aW == null) break block74;
                                            v0 = false;
                                            break block50;
                                        }
                                        co.m().U = co.m().N < co.m().bi.N ? 1 : -1;
                                        var3_13 = Math.abs(co.m().N - co.m().bi.N);
                                        var4_17 = Math.abs(co.m().O - co.m().bi.O);
                                        if (!co.m().c(co.m().bi) && !co.m().A()) break block75;
                                        if (co.m().aQ != null) break block76;
                                        v0 = false;
                                        break block50;
                                    }
                                    if (var2_3.J()) break block77;
                                    v0 = false;
                                    break block50;
                                }
                                co.m().U = co.m().N < co.m().bi.N ? 1 : -1;
                                co.m().P = 0;
                                if (var3_13 > co.m().aQ.g || var4_17 > co.m().aQ.h) break block78;
                                if (co.m().aQ.a.a != 20) {
                                    var2_6 = 20;
                                    if (co.m().aQ.g > 60) {
                                        var2_6 = 60;
                                        if (var3_13 < 20) {
                                            co.m().a(co.m().N, co.m().O, 10);
                                        }
                                    }
                                    var4_17 = 0;
                                    if ((dx.b(co.m().N, co.m().O + 3) & 2) == 2) {
                                        v2 = var5_20 = co.m().N > co.m().bi.N ? 1 : -1;
                                        if ((dx.b(co.m().bi.N + var2_6 * var5_20, co.m().O + 3) & 2) != 2) {
                                            var4_17 = 1;
                                        }
                                    }
                                    if (var3_13 <= var2_6 && var4_17 == 0) {
                                        if (co.m().N > co.m().bi.N) {
                                            co.m().N = co.m().bi.N + var2_6;
                                            co.m().U = -1;
                                        } else {
                                            co.m().N = co.m().bi.N - var2_6;
                                            co.m().U = 1;
                                        }
                                        cj.a().l();
                                    }
                                    main.a.k();
                                    main.a.j();
                                }
                                ** GOTO lbl-1000
                            }
                            var2_7 = (co.m().aQ.g - 20) * (co.m().N > co.m().bi.N ? 1 : -1);
                            if (var3_13 <= co.m().aQ.g) {
                                var2_7 = 0;
                            }
                            co.m().ck = new be(co.m().bi.N + var2_7, co.m().bi.O);
                            co.m().aM = new ae(null, null, 8002, null);
                            main.a.k();
                            main.a.j();
                            v0 = false;
                            break block50;
                        }
                        if (var3_13 < 60 && var4_17 < 40) {
                            co.m().bi;
                            var2_3.I();
                            if (!main.a.e && co.m().bi.V >= 0 && dx.l != 51 && dx.l != 52 && var2_3.cd == null) {
                                main.a.G.a(co.m().bi);
                                main.a.G.s();
                                cj.a().c(co.m().bi.V);
                                cj.a().y(co.m().bi.V);
                            }
                        } else {
                            var2_8 = (20 + dq.a.nextInt(20)) * (co.m().N > co.m().bi.N ? 1 : -1);
                            co.m().ck = new be(co.m().bi.N + var2_8, co.m().bi.O);
                            co.m().aM = new ae(null, null, 8002, null);
                            main.a.k();
                            main.a.j();
                        }
                        v0 = false;
                        break block50;
                    }
                    if (co.m().bj != null) {
                        var2_3.L();
                        v0 = false;
                    } else lbl-1000:
                    // 4 sources

                    {
                        v0 = true;
                    }
                }
                if (v0) {
                    if (co.m().B() && co.m().R()) {
                        if (this.J()) {
                            co.m().cS = var1_1;
                            co.m().D();
                        } else {
                            co.m().E();
                        }
                    } else {
                        var2_9 = dx.a(co.m().N, co.m().O, 2);
                        co.m().a(cw.v[co.m().aQ.b], var2_9 != false ? 0 : 1);
                        if (var2_9) {
                            co.m().cl = 20;
                        }
                        co.m().cS = var1_1;
                    }
                }
            }
            if (co.m().A()) {
                this.bj = 0;
            }
        }
    }

    private void L() {
        if (co.m().bj != null) {
            co.m().U = co.m().N < co.m().bj.a ? 1 : -1;
            int n2 = Math.abs(co.m().N - co.m().bj.a);
            int n3 = Math.abs(co.m().O - co.m().bj.b);
            if (n2 <= 40 && n3 < 40) {
                main.a.k();
                main.a.j();
                if (co.m().bj.e.a != 673) {
                    cj.a().l(co.m().bj.d);
                    return;
                }
                bg bg2 = new bg(5, 0, -100, 100, 5, cw.aO.a[co.m().W][2]);
                dq.c(co.m().bh != null ? "!null" : "null");
                String string = ch.aB;
                String[] stringArray = new String[]{ch.bo, ch.bp};
                dq.c(co.m().bh != null ? "!null" : "null");
                bg2.y = 673;
                cw.l();
                cw.a(stringArray, bg2);
                g.a(string, 100000, bg2, 5820);
                return;
            }
            co.m().ck = new be(co.m().bj.a, co.m().bj.b);
            co.m().aM = new ae(null, null, 8002, null);
            main.a.k();
            main.a.j();
        }
    }

    private boolean M() {
        return co.m().cK || co.m().cJ || co.m().cL || co.m().dj || this.eB || co.m().bA;
    }

    private void a(bt bt2, boolean bl2) {
        if (co.m().cF) {
            return;
        }
        if (this.M()) {
            return;
        }
        if (co.m().aR.c <= 1) {
            return;
        }
        co.m().aQ = bt2;
        if (this.eL != bt2 && this.eL != null) {
            cj.a().i(bt2.a.a);
            byte cfr_ignored_0 = bt2.a.a;
            this.p();
            this.eL = bt2;
            this.eK = -1;
            cw.l().bj = 0;
            return;
        }
        if (co.m().z()) {
            dq.c(">>>use skill spec: " + bt2.a.a);
            co.m().a(bt2.a.a);
            byte cfr_ignored_1 = bt2.a.a;
            this.p();
            this.eL = bt2;
            this.eK = -1;
            cw.l().bj = 0;
            return;
        }
        if (co.m().y()) {
            dq.c("use skill not focus");
            this.a(bt2);
            this.eL = bt2;
            return;
        }
        this.eK = -1;
        if (bt2 != null) {
            dq.c("only select skill");
            if (this.eL != bt2) {
                cj.a().i(bt2.a.a);
                byte cfr_ignored_2 = bt2.a.a;
                this.p();
            }
            if (co.m().bi == null && co.m().A()) {
                dq.c("return o day");
                return;
            }
            if (co.m().R()) {
                this.a(true, true);
            }
            this.eL = bt2;
        }
    }

    private void b(bt bt2, boolean bl2) {
        if ((dx.l == 112 || dx.l == 113) && co.m().bb == 0) {
            return;
        }
        if (co.m().y()) {
            this.a(bt2);
            return;
        }
        this.eK = -1;
        if (bt2 != null) {
            cj.a().i(bt2.a.a);
            byte cfr_ignored_0 = bt2.a.a;
            this.p();
            co.m().aQ = bt2;
            this.a(bl2, true);
        }
    }

    private void a(bt bt2) {
        if ((dx.l == 112 || dx.l == 113) && co.m().bb == 0) {
            return;
        }
        if (this.J()) {
            this.eK = -1;
            if (bt2 != null) {
                cj.a().i(bt2.a.a);
                byte cfr_ignored_0 = bt2.a.a;
                this.p();
                co.m().aQ = bt2;
                co.m();
                co.C();
                co.m().cS = true;
                this.bj = 0;
            }
        }
    }

    public static void s() {
        int n2 = 0;
        while (n2 < co.m().aO.size() - 1) {
            bt bt2 = (bt)co.m().aO.elementAt(n2);
            int n3 = n2 + 1;
            while (n3 < co.m().aO.size()) {
                bt bt3 = (bt)co.m().aO.elementAt(n3);
                if (bt3.a.a < bt2.a.a) {
                    bt bt4 = bt3;
                    bt3 = bt2;
                    bt2 = bt4;
                    co.m().aO.setElementAt(bt2, n2);
                    co.m().aO.setElementAt(bt3, n3);
                }
                ++n3;
            }
            ++n2;
        }
    }

    private void N() {
        if (this.Q()) {
            return;
        }
        int n2 = 0;
        while (n2 < this.bz.length()) {
            int n3;
            int n4;
            int n5;
            int n6;
            this.bD[n2] = -1;
            if (main.a.f && main.a.a(n6 = (main.a.A - this.bz.length() * eV) / 2, n5 = main.a.B - 40, n4 = this.bz.length() * eV, n3 = eV)) {
                if (n2 == (n6 = (main.a.p - n6) / eV)) {
                    this.bD[n2] = 1;
                }
                if (main.a.l && main.a.m && n2 == n6) {
                    char[] cArray = this.bF.toCharArray();
                    eq eq2 = new eq("");
                    n5 = 0;
                    while (n5 < cArray.length) {
                        eq2.addElement(String.valueOf(cArray[n5]));
                        ++n5;
                    }
                    eq2.removeElementAt(0);
                    eq2.insertElementAt(String.valueOf(this.bz.charAt(n2)), eq2.size());
                    this.bF = "";
                    n5 = 0;
                    while (n5 < eq2.size()) {
                        this.bF = String.valueOf(this.bF) + ((String)eq2.elementAt(n5)).toUpperCase();
                        ++n5;
                    }
                    cj.a().a(this.bz.charAt(n2));
                }
            }
            ++n2;
        }
    }

    public final void b() {
        Object object;
        if (main.a.w % 100 == 0 && dx.l == 137) {
            bH = 30;
        }
        if (bw && main.a.w % 20 == 0) {
            object = this;
            if (((cw)object).eI > 0) {
                --((cw)object).eI;
            }
            if (!(!bx || by || co.m().T == 14 || co.m().T == 5 || co.m().bB || co.m().cK || co.m().B())) {
                Object object2;
                boolean bl2 = false;
                int n2 = 0;
                while (n2 < G.size()) {
                    object2 = (dh)G.elementAt(n2);
                    if (((dh)object2).s != 0 && ((dh)object2).s != 1) {
                        bl2 = true;
                    }
                    ++n2;
                }
                if (bl2) {
                    n2 = 0;
                    int n3 = 0;
                    while (n3 < co.m().aT.length) {
                        ar ar2 = co.m().aT[n3];
                        if (ar2 != null && ar2.b.b == 6) {
                            n2 = 1;
                            break;
                        }
                        ++n3;
                    }
                    if (n2 == 0 && main.a.w % 150 == 0) {
                        cj.a().A();
                    }
                    if (co.m().ag <= co.m().aj * 20L / 100L || co.m().af <= co.m().ak * 20L / 100L) {
                        super.K();
                    }
                    if (co.m().be == null || co.m().be != null && co.m().be.O) {
                        n3 = 0;
                        while (n3 < G.size()) {
                            dh dh2 = (dh)G.elementAt(n3);
                            if (dh2.s != 0 && dh2.s != 1 && dh2.m > 0L && !dh2.O) {
                                co.m().N = dh2.p;
                                co.m().O = dh2.q;
                                co.m().be = dh2;
                                cj.a().l();
                                dq.c("focus 1 con bossssssssssssssssssssssssssssssssssssssssssssssssss");
                                break;
                            }
                            ++n3;
                        }
                    } else if (co.m().be.m <= 0L || co.m().be.s == 1 || co.m().be.s == 0) {
                        co.m().be = null;
                    }
                    if (co.m().be != null && ((cw)object).eI == 0 && (co.m().F() == null || co.m().cw >= co.m().F().length || co.m().cE == null || co.m().cD == null)) {
                        long l2;
                        object2 = null;
                        if (main.a.e) {
                            int n4 = 0;
                            while (n4 < bb.length) {
                                if (bb[n4] != null && !cw.bb[n4].j && cw.bb[n4].a.a != 10 && cw.bb[n4].a.a != 11 && cw.bb[n4].a.a != 14 && cw.bb[n4].a.a != 23 && cw.bb[n4].a.a != 7 && co.m().F() == null && !cw.bb[n4].a.c() && co.m().af >= (l2 = cw.bb[n4].a.d == 2 ? 1L : (cw.bb[n4].a.d != 1 ? (long)cw.bb[n4].i : (long)cw.bb[n4].i * co.m().ak / 100L))) {
                                    if (object2 == null) {
                                        object2 = bb[n4];
                                    } else if (((bt)object2).e < cw.bb[n4].e) {
                                        object2 = bb[n4];
                                    }
                                }
                                ++n4;
                            }
                            if (object2 != null) {
                                super.a((bt)object2, true);
                                super.b(co.m().be);
                            }
                        } else {
                            int n5 = 0;
                            while (n5 < ba.length) {
                                if (ba[n5] != null && !cw.ba[n5].j && cw.ba[n5].a.a != 10 && cw.ba[n5].a.a != 11 && cw.ba[n5].a.a != 14 && cw.ba[n5].a.a != 23 && cw.ba[n5].a.a != 7 && co.m().F() == null && co.m().af >= (l2 = cw.ba[n5].a.d == 2 ? 1L : (cw.ba[n5].a.d != 1 ? (long)cw.ba[n5].i : (long)cw.ba[n5].i * co.m().ak / 100L))) {
                                    if (object2 == null) {
                                        object2 = ba[n5];
                                    } else if (((bt)object2).e < cw.ba[n5].e) {
                                        object2 = ba[n5];
                                    }
                                }
                                ++n5;
                            }
                            if (object2 != null) {
                                super.a((bt)object2, true);
                                super.b(co.m().be);
                            }
                        }
                    }
                }
            }
        }
        object = this;
        if (((cw)object).fS != 0) {
            eS = System.currentTimeMillis();
            if (eS - eR > 1000L) {
                eR = System.currentTimeMillis();
                ++eT;
            }
            if (eT > 20) {
                int n6 = 0;
                while (n6 < ((cw)object).fL.length) {
                    ((cw)object).fM[n6] = ((cw)object).fL[n6];
                    ++n6;
                }
                --((cw)object).fS;
                if (((cw)object).fS == 0) {
                    ((cw)object).fW = "";
                    aO.a(((cw)object).fR, 0);
                    eT = 0;
                }
            } else if (((cw)object).fQ > ((cw)object).fL.length - 1) {
                --((cw)object).fS;
                if (((cw)object).fS == 0) {
                    ((cw)object).fW = "";
                    aO.a(((cw)object).fR, 0);
                }
            } else {
                if (((cw)object).fQ < ((cw)object).fM.length) {
                    if (((cw)object).fN[((cw)object).fQ] == 15) {
                        if (((cw)object).fM[((cw)object).fQ] == ((cw)object).fL[((cw)object).fQ] - 1) {
                            ((cw)object).fP[((cw)object).fQ] = 10;
                        }
                        if (((cw)object).fM[((cw)object).fQ] == ((cw)object).fL[((cw)object).fQ]) {
                            ((cw)object).fN[((cw)object).fQ] = -1;
                            ++((cw)object).fQ;
                        }
                    } else if (main.a.w % 5 == 0) {
                        int n7 = ((cw)object).fQ;
                        ((cw)object).fN[n7] = ((cw)object).fN[n7] + 1;
                    }
                }
                int n8 = 0;
                while (n8 < ((cw)object).fL.length) {
                    if (((cw)object).fN[n8] != -1) {
                        int n9 = n8;
                        ((cw)object).fO[n9] = ((cw)object).fO[n9] + 1;
                        if (((cw)object).fO[n8] > ((cw)object).fN[n8] + ((cw)object).fP[n8]) {
                            ((cw)object).fO[n8] = 0;
                            int n10 = n8;
                            ((cw)object).fM[n10] = ((cw)object).fM[n10] + 1;
                            if (((cw)object).fM[n8] >= 10) {
                                ((cw)object).fM[n8] = 0;
                            }
                        }
                    }
                    ++n8;
                }
            }
        }
        ej.i();
        er.e();
        ++this.ee;
        if (this.ee == 100) {
            this.ee = 0;
        }
        try {
            if (en.c) {
                en.c = false;
            }
            if (O == 1) {
                eP = System.currentTimeMillis();
            }
            if (O == 100) {
                O = 0;
                eQ = System.currentTimeMillis();
                int n11 = (int)(eQ - eP) / 1000;
                cj.a().g(n11);
            }
            if (A > 0 && --A == 0) {
                ci.b = false;
            }
            main.a.c();
            if (!a) {
                if (j != l || k != m) {
                    cQ = l - j << 2;
                    cR = m - k << 2;
                    cO &= 0xF;
                    k += (cP += cR) >> 4;
                    cP &= 0xF;
                    if ((j += (cO += cQ) >> 4) < 24) {
                        j = 24;
                    }
                    if (j > n) {
                        j = n;
                    }
                    if (k < 0) {
                        k = 0;
                    }
                    if (k > cS) {
                        k = cS;
                    }
                }
                if ((o = j / dx.i - 1) < 0) {
                    o = 0;
                }
                p = k / dx.i;
                q = o + cJ;
                r = p + cK;
                if (p < 0) {
                    p = 0;
                }
                if (r > dx.b - 1) {
                    r = dx.b - 1;
                }
                if ((dx.C = (co.m().N - 2 * d) / dx.i) < 0) {
                    dx.C = 0;
                }
                if ((dx.D = dx.C + dx.G) > dx.a) {
                    dx.D = dx.a;
                    dx.C = dx.D - dx.G;
                }
                if ((dx.E = (co.m().O - 2 * e) / dx.i) < 0) {
                    dx.E = 0;
                }
                if ((dx.F = dx.E + dx.H) > dx.b) {
                    dx.F = dx.b;
                    dx.E = dx.F - dx.H;
                }
                cX.b();
                cW.b();
            }
            main.a.c();
            el.b().c();
            main.a.c();
            int n12 = 0;
            while (n12 < E.size()) {
                ((co)E.elementAt(n12)).a();
                ++n12;
            }
            n12 = 0;
            while (n12 < cd.a.size()) {
                ((cd)cd.a.elementAt(n12)).a();
                ++n12;
            }
            co.m().a();
            if (co.m().T == 1 && main.a.w % 100 == 0) {
                System.gc();
            }
            if (this.cd != null) {
                this.cd.a();
            }
            h.a();
            main.a.c();
            n12 = 0;
            while (n12 < G.size()) {
                ((dh)G.elementAt(n12)).i();
                ++n12;
            }
            main.a.c();
            n12 = 0;
            while (n12 < H.size()) {
                ((bg)H.elementAt(n12)).a();
                ++n12;
            }
            this.eJ = bb.length;
            n12 = bb.length - 1;
            while (n12 >= 0) {
                bt bt2 = bb[n12];
                if (bt2 != null) {
                    this.eJ = n12 + 1;
                    break;
                }
                --this.eJ;
                --n12;
            }
            cw.o();
            main.a.c();
            main.a.a().o();
            main.a.c();
            n12 = 0;
            while (n12 < 5) {
                if (bV[n12] != -1) {
                    if (bV[n12] > fr[n12]) {
                        int n13 = n12;
                        fu[n13] = fu[n13] + 1;
                        if (fu[n12] == 25) {
                            cw.fu[n12] = 0;
                            cw.bV[n12] = -1;
                            cw.fr[n12] = 0;
                            cw.fs[n12] = 0;
                            cw.bT[n12] = 0;
                        }
                    } else {
                        int n14 = n12;
                        bV[n14] = bV[n14] + dq.g(ft[n12]);
                        int n15 = n12;
                        bT[n15] = bT[n15] + fs[n12];
                        int n16 = n12;
                        bU[n16] = bU[n16] + ft[n12];
                    }
                }
                ++n12;
            }
            bo.b();
            n12 = 0;
            while (n12 < 2) {
                if (fx[n12] != -1) {
                    int n17 = n12;
                    fx[n17] = fx[n17] + 1;
                    int n18 = n12;
                    fv[n18] = fv[n18] + (fz[n12] << 2);
                    int n19 = n12;
                    fw[n19] = fw[n19] - 1;
                    if (fx[n12] >= 6) {
                        cw.fx[n12] = -1;
                    } else {
                        cw.fy[n12] = (fx[n12] >> 1) % 3;
                    }
                }
                ++n12;
            }
            if (fF != fG) {
                fI = fG - fF << 2;
                fF += (fH += fI) >> 4;
                fH &= 0xF;
            }
            if (Math.abs(fG - fF) < 15 && fF < 0) {
                fG = 0;
            }
            if (Math.abs(fG - fF) < 15 && fF > 0) {
                fG = 0;
            }
            main.a.h();
            main.a.c();
            cw cw2 = this;
            if (cw2.fc > 0) {
                --cw2.fc;
            }
            if (cw2.bh) {
                cw2.bh = false;
                cy cy2 = cw2.e(cw2.eu, cw2.ev);
                if (cy2 == null || cy2 != null && cy2.equals(co.m().bh) && dx.l == 51) {
                    u.a(134, cw2.eu, cw2.ev + main.a.ag / 2, 3);
                }
            }
            main.a.c();
            int n20 = 0;
            while (n20 < F.size()) {
                ((as)F.elementAt(n20)).a();
                ++n20;
            }
            main.a.c();
            main.a.c();
            n20 = j.z.size() - 1;
            while (n20 >= 0) {
                j.y.removeElement(j.z.elementAt(n20));
                j.z.removeElementAt(n20);
                --n20;
            }
            n20 = 0;
            while (n20 < j.y.size()) {
                j j2 = (j)j.y.elementAt(n20);
                j2.b();
                ++n20;
            }
            n20 = 0;
            while (n20 < j.A.size()) {
                j j3 = (j)j.A.elementAt(n20);
                j3.b();
                ++n20;
            }
            n20 = 0;
            while (n20 < j.B.size()) {
                j j4 = (j)j.B.elementAt(n20);
                j4.b();
                ++n20;
            }
            n20 = 0;
            while (n20 < j.C.size()) {
                j j5 = (j)j.C.elementAt(n20);
                j5.b();
                ++n20;
            }
            n20 = 0;
            while (n20 < j.x.size()) {
                j j6 = (j)j.x.elementAt(n20);
                j6.b();
                ++n20;
            }
            f.c();
            aO.a();
            aP.a();
            main.a.c();
            if (S != null && !S.equals(co.m())) {
                S.a();
            }
            ++this.eU;
            if (this.eU > 3) {
                this.eU = 0;
            }
            if (this.bR) {
                ++this.bQ;
                if (this.bQ == 20L) {
                    this.bQ = 0L;
                    this.bR = false;
                }
            } else if (this.bP > co.m().ag) {
                long l3 = this.bP - co.m().ag >> 1;
                if (l3 < 1L) {
                    l3 = 1L;
                }
                this.bP -= l3;
            } else {
                this.bP = co.m().ag;
            }
            if (this.bO) {
                ++this.bN;
                if (this.bN == 20L) {
                    this.bN = 0L;
                    this.bO = false;
                }
            } else if (this.bM > co.m().af) {
                long l4 = this.bM - co.m().af >> 1;
                if (l4 < 1L) {
                    l4 = 1L;
                }
                this.bM -= l4;
            } else {
                this.bM = co.m().af;
            }
            if (this.dI > 0) {
                --this.dI;
            }
            if (this.t()) {
                while (this.bs - 100 < k) {
                    --k;
                }
            }
            n20 = 0;
            while (n20 < co.bI.size()) {
                ((ay)co.bI.elementAt(n20)).a();
                ++n20;
            }
            n20 = 0;
            while (n20 < bI.size()) {
                ((ay)bI.elementAt(n20)).a();
                ++n20;
            }
            cw cw3 = this;
            if (cw3.fV) {
                int n21 = es.l > 0 ? 1 : 2;
                cw3.fT -= n21;
                if (cw3.fT < -cw3.fU) {
                    cw3.fT = main.a.A;
                    fK.removeElementAt(0);
                    if (fK.size() == 0) {
                        cw3.ce = false;
                        cw3.fV = false;
                    } else {
                        cw3.fU = ev.c.a((String)fK.elementAt(0));
                    }
                }
            }
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        int n22 = main.a.w % 4000;
        if (n22 == 1000) {
            r.a(r.a, 10);
        }
        aj.a();
    }

    public final boolean t() {
        return this.eG;
    }

    public static void a(eh eh2, int n2) {
        int n3 = 0;
        while (n3 < dx.w.size()) {
            ek ek2 = (ek)dx.w.elementAt(n3);
            if (ek2.c != -1 && ek2.h == n2) {
                ek2.a(eh2);
            }
            ++n3;
        }
        if (dx.l == 48 && n2 == 3 && main.a.P != null && main.a.P[0] != 0) {
            n3 = 0;
            while (n3 < dx.c / main.a.P[0] + 1) {
                eh2.a(main.a.N[0], n3 * main.a.P[0], dx.d - main.a.Q[0] - 70, 0);
                ++n3;
            }
        }
    }

    public static void b(eh eh2) {
        if (main.a.a) {
            return;
        }
        eh2.a(eA, 0, 0, main.a.A, main.a.B);
    }

    public final void u() {
        int n2;
        int n3;
        boolean bl2;
        co co2 = this.fb;
        if (co2 == null) {
            System.err.println("[PAINT-NPE] GameScr.paint stage=" + this.fa + " actor=null");
            return;
        }
        bw bw2 = co2.cG;
        bw bw3 = co2.cH;
        bu[] buArray = bw3 == null ? null : (co2.cI == 0 ? bw3.c : bw3.d);
        int n4 = buArray == null ? -1 : buArray.length;
        boolean bl3 = bl2 = buArray != null && co2.cw >= 0 && co2.cw < buArray.length && buArray[co2.cw] == null;
        int n5 = co2.cA == null ? -1 : (n3 = co2.cA.a == null ? -2 : co2.cA.a.length);
        int n6 = co2.cB == null ? -1 : (n2 = co2.cB.a == null ? -2 : co2.cB.a.length);
        int n7 = co2.cC == null ? -1 : (co2.cC.a == null ? -2 : co2.cC.a.length);
        System.err.println("[PAINT-NPE] GameScr.paint stage=" + this.fa + " actorId=" + co2.V + " actorName=" + co2.au + " local=" + co2.aE + " skillId=" + (bw2 == null ? -1 : bw2.a) + " randomPaintId=" + (bw3 == null ? -1 : bw3.a) + " skillType=" + co2.cI + " indexSkill=" + co2.cw + " skillFrameCount=" + n4 + " currentSkillFrameNull=" + bl2 + " effectFrames=" + co2.cx + "/" + n3 + "," + co2.cy + "/" + n2 + "," + co2.cz + "/" + n7);
    }

    private static void a(String string, int n2) {
        long l2 = System.currentTimeMillis();
        if (l2 - eX < 1000L) {
            return;
        }
        eX = l2;
        System.err.println("[PAINT-NULL-CHAR] stage=" + string + " index=" + n2 + " listSize=" + E.size() + " tick=" + main.a.w + " map=" + dx.l);
    }

    private static void a(String string, int n2, Exception exception) {
        long l2 = System.currentTimeMillis();
        if (l2 - eX < 1000L) {
            return;
        }
        eX = l2;
        System.err.println("[PAINT-CHAR-LOOKUP] stage=" + string + " index=" + n2 + " listSize=" + E.size() + " tick=" + main.a.w + " map=" + dx.l + " exception=" + exception.toString());
        exception.printStackTrace();
    }

    public final void a(eh eh2) {
        int n2;
        int n3;
        int n4;
        int n5;
        Object object;
        int n6;
        aY = 0;
        this.fa = "start";
        this.fb = null;
        if (!bG) {
            return;
        }
        main.a.c();
        if (this.bl || this.bm && g.m == null) {
            ++this.bk;
            if (this.bk < 30 && this.bk >= 0 && main.a.w % 4 == 0 || this.bk >= 30 && this.bk <= 50 && main.a.w % 3 == 0 || this.bk > 50) {
                eh2.a(0xFFFFFF);
                eh2.d(0, 0, main.a.A, main.a.B);
                if (this.bk > 50) {
                    if (this.bm) {
                        this.bm = false;
                        this.bk = 0;
                        if (this.bp) {
                            this.c(this.br, this.bs);
                        } else {
                            cw cw2 = this;
                            this.bn = false;
                            h.a(17);
                            if (cw2.bo) {
                                cw2.bo = false;
                                h.a(25);
                            }
                        }
                    }
                    this.e(eh2);
                    eh2.a(-j, -k);
                    eh2.a(0, main.a.ag);
                    this.fa = "freeze-local-character";
                    this.fb = co.m();
                    co.m().a(eh2);
                    this.fb = null;
                    ej.a(eh2);
                    cw.c(eh2);
                    this.f(eh2);
                    return;
                }
                return;
            }
        }
        main.a.c();
        this.fa = "background";
        main.a.c(eh2);
        if (ej.c != 5) {
            // empty if block
        }
        if ((this.bn || this.ce) && dx.o != 3) {
            cw.b(eh2);
        }
        main.a.c();
        if (bH > 0) {
            eh2.a(-j + eY[bH % eY.length], -k + eZ[bH % eZ.length]);
            --bH;
        } else {
            eh2.a(-j, -k);
        }
        if (this.eB) {
            n6 = main.a.w % 3 == 0 ? 3 : -3;
            eh2.a(n6, 0);
        }
        f.c(eh2);
        h.a(eh2);
        this.fa = "tilemap";
        dx.a(eh2);
        dx.b(eh2);
        int n7 = 0;
        while (n7 < E.size()) {
            co co2 = (co)E.elementAt(n7);
            if (co2.cM && dx.l == 128) {
                co2.b(eh2, co2.N, co2.O, 0);
            }
            ++n7;
        }
        if (co.m().cM && dx.l == 128) {
            co.m().b(eh2, co.m().N, co.m().O, 0);
        }
        cw.a(eh2, 2);
        if (co.m().aB != null && main.a.e) {
            if (ew.cF == 20) {
                eh2.a(dM, co.m().aB.j + j, co.m().aB.k + k, 3);
            } else {
                eh2.a(dL, co.m().aB.j + j, co.m().aB.k + k, 3);
            }
        }
        main.a.c();
        main.a.c();
        f.f(eh2);
        aj.a.a(eh2);
        n7 = 0;
        while (n7 < j.C.size()) {
            j j2 = (j)j.C.elementAt(n7);
            j2.a(eh2);
            ++n7;
        }
        n7 = 0;
        while (n7 < cd.a.size()) {
            ((cd)cd.a.elementAt(n7)).a(eh2);
            ++n7;
        }
        n7 = 0;
        while (n7 < H.size()) {
            bg bg2 = (bg)H.elementAt(n7);
            if (bg2.ag > 0L) {
                bg2.d(eh2);
            }
            ++n7;
        }
        n7 = 0;
        while (n7 < H.size()) {
            ((bg)H.elementAt(n7)).a(eh2);
            ++n7;
        }
        eh2.a(0, main.a.ag);
        main.a.c();
        main.a.c();
        this.fa = "character-shadow";
        n7 = 0;
        while (n7 < E.size()) {
            block162: {
                co co3 = null;
                this.fb = null;
                try {
                    co3 = (co)E.elementAt(n7);
                }
                catch (Exception exception) {
                    cw.a("character-shadow", n7, exception);
                    break block162;
                }
                if (co3 == null) {
                    cw.a("character-shadow", n7);
                } else {
                    this.fb = co3;
                    if (!(main.a.G.a && main.a.G.F() || !co3.bt)) {
                        co3.d(eh2);
                    }
                }
            }
            ++n7;
        }
        this.fb = co.m();
        co.m().d(eh2);
        this.fb = null;
        h.b(eh2);
        this.fa = "mob";
        n7 = 0;
        while (n7 < G.size()) {
            ((dh)G.elementAt(n7)).a(eh2);
            ++n7;
        }
        this.fa = "teleport";
        n7 = 0;
        while (n7 < cd.a.size()) {
            ((cd)cd.a.elementAt(n7)).b(eh2);
            ++n7;
        }
        this.fa = "character";
        n7 = 0;
        while (n7 < E.size()) {
            block163: {
                co co4 = null;
                this.fb = null;
                try {
                    co4 = (co)E.elementAt(n7);
                }
                catch (Exception exception) {
                    cw.a("character", n7, exception);
                    break block163;
                }
                if (co4 == null) {
                    cw.a("character", n7);
                } else if (!main.a.G.a || !main.a.G.F()) {
                    this.fb = co4;
                    co4.a(eh2);
                }
            }
            ++n7;
        }
        this.fa = "local-character";
        this.fb = co.m();
        co.m().a(eh2);
        this.fa = "local-skill";
        if (co.m().cG != null && co.m().F() != null && co.m().cw < co.m().F().length) {
            co.m().e(eh2);
            co.m().c(eh2);
        }
        this.fa = "character-skill";
        n7 = 0;
        while (n7 < E.size()) {
            block164: {
                co co5 = null;
                this.fb = null;
                try {
                    co5 = (co)E.elementAt(n7);
                }
                catch (Exception exception) {
                    cw.a("character-skill", n7, exception);
                    break block164;
                }
                if (co5 == null) {
                    cw.a("character-skill", n7);
                } else if (!main.a.G.a || !main.a.G.F()) {
                    this.fb = co5;
                    if (co5.cG != null && co5.F() != null && co5.cw < co5.F().length) {
                        this.fb = co5;
                        co5.e(eh2);
                        co5.c(eh2);
                    }
                }
            }
            ++n7;
        }
        this.fa = "item-map";
        this.fb = null;
        n7 = 0;
        while (n7 < F.size()) {
            ((as)F.elementAt(n7)).a(eh2);
            ++n7;
        }
        this.fa = "effects-and-hud";
        eh2.a(0, -main.a.ag);
        main.a.c();
        Object object2 = eh2;
        int n8 = 0;
        while (n8 < 2) {
            if (fx[n8] != -1) {
                if (fz[n8] == 1) {
                    ((eh)object2).a(fA[fy[n8]], fv[n8], fw[n8], 3);
                } else {
                    ((eh)object2).a(fA[fy[n8]], 0, 0, eh.a(fA[fy[n8]]), eh.b(fA[fy[n8]]), 2, fv[n8], fw[n8], 3);
                }
            }
            ++n8;
        }
        main.a.c();
        main.a.c();
        main.a.c();
        object2 = eh2;
        n6 = 0;
        while (n6 < j.y.size()) {
            object = (j)j.y.elementAt(n6);
            if (object != null && !(object instanceof g)) {
                ((j)object).a((eh)object2);
            }
            ++n6;
        }
        if (!main.a.a) {
            n6 = 0;
            while (n6 < j.B.size()) {
                object = (j)j.B.elementAt(n6);
                ((j)object).a((eh)object2);
                ++n6;
            }
        }
        n6 = 0;
        while (n6 < j.A.size()) {
            object = (j)j.A.elementAt(n6);
            ((j)object).a((eh)object2);
            ++n6;
        }
        cw.a(eh2, 3);
        n7 = 0;
        while (n7 < H.size()) {
            bg bg3 = (bg)H.elementAt(n7);
            bg3.b(eh2);
            ++n7;
        }
        h.c(eh2);
        n7 = 0;
        while (n7 < H.size()) {
            bg bg4 = (bg)H.elementAt(n7);
            if (bg4 != null && bg4.L != null) {
                bg4.L.a(eh2, bg4.N, bg4.O - bg4.az - main.a.ag, bg4.U);
            }
            ++n7;
        }
        n7 = 0;
        while (n7 < E.size()) {
            co co6 = null;
            try {
                co6 = (co)E.elementAt(n7);
            }
            catch (Exception exception) {}
            if (co6 != null && co6.L != null) {
                co6.L.a(eh2, co6.N, co6.O - co6.az, co6.U);
            }
            ++n7;
        }
        if (co.m().L != null) {
            co.m().L.a(eh2, co.m().N, co.m().O - co.m().az, co.m().U);
        }
        aj.c.a(eh2);
        aj.b.a(eh2);
        f.d(eh2);
        int n9 = 0;
        while (n9 < dx.w.size()) {
            object = (ek)dx.w.elementAt(n9);
            if (((ek)object).c != -1 && ((ek)object).h > 3) {
                ((ek)object).a(eh2);
            }
            ++n9;
        }
        bo.a(eh2);
        if (dx.l == 120) {
            if (this.cf != 100) {
                n9 = this.cf * eh.a(ed) / 100;
                eh2.a(ed, dx.c / 2 - eh.a(ed) / 2, 220, 0);
                eh2.e(dx.c / 2 - eh.a(ed) / 2, 220, n9, 10);
                eh2.a(eb, dx.c / 2 - eh.a(ed) / 2, 220, 0);
                eh2.e(0, 0, main.a.A, main.a.B);
            }
            if (this.cg) {
                ++this.ch;
                if (main.a.w % 3 == 0) {
                    i i2 = new i(19, dq.b(dx.c / 2 - 50, dx.c / 2 + 50), 340, 2, 1, -1);
                    h.a(i2);
                }
                if (main.a.w % 15 == 0) {
                    i i3 = new i(18, dq.b(dx.c / 2 - 5, dx.c / 2 + 5), dq.b(300, 320), 2, 1, -1);
                    h.a(i3);
                }
                if (this.ch == 100) {
                    this.b(dx.c / 2, 300);
                }
                if (this.ch == 110) {
                    this.ch = 0;
                    this.cg = false;
                }
            }
        }
        f.a(eh2);
        int n10 = 1;
        n7 = 0;
        while (n7 < f.a.size()) {
            object = (f)f.a.elementAt(n7);
            if (((f)object).b == 0) {
                n10 = 0;
                break;
            }
            ++n7;
        }
        if (eh.b <= 1) {
            n10 = 0;
        }
        if (n10 != 0 && !this.bn) {
            int n11 = dx.c / (eh.a(dx.B) + 50);
            if (n11 <= 0) {
                n11 = 1;
            }
            if (dx.e != 28) {
                n7 = 0;
                while (n7 < n11) {
                    n5 = 100 + n7 * (eh.a(dx.B) + 50) - j / 2;
                    if (n5 + (n4 = eh.a(dx.B)) >= j && n5 <= j + main.a.A && -20 + eh.b(dx.B) >= k && -20 <= k + main.a.B) {
                        eh2.a(dx.B, 100 + n7 * (eh.a(dx.B) + 50) - j / 2, -20, 0);
                    }
                    ++n7;
                }
            }
        }
        ej.a(eh2);
        main.a.c();
        main.a.c();
        main.a.c();
        object2 = eh2;
        try {
            if (g.m == null && (n10 = cw.A()) != -1) {
                bg bg5 = null;
                n5 = 0;
                while (n5 < H.size()) {
                    bg bg6 = (bg)H.elementAt(n5);
                    if (bg6.t.a == n10) {
                        if (bg5 == null) {
                            bg5 = bg6;
                        } else if (dq.g(bg6.N - co.m().N) < dq.g(bg5.N - co.m().N)) {
                            bg5 = bg6;
                        }
                    }
                    ++n5;
                }
                if (bg5 != null && bg5.T != 15 && (bg5.N <= j || bg5.N >= j + d || bg5.O <= k || bg5.O >= k + e) && main.a.w % 10 >= 5) {
                    n5 = bg5.N - co.m().N;
                    int n12 = bg5.O - co.m().O;
                    n10 = 0;
                    int n13 = 0;
                    n3 = 0;
                    if (n5 > 0 && n12 >= 0) {
                        if (dq.g(n5) >= dq.g(n12)) {
                            n10 = d - 10;
                            n13 = e / 2 + 30;
                            if (main.a.e) {
                                n13 = e / 2 + 10;
                            }
                            n3 = 0;
                        } else {
                            n10 = d / 2;
                            n13 = e - 10;
                            n3 = 5;
                        }
                    } else if (n5 >= 0 && n12 < 0) {
                        if (dq.g(n5) >= dq.g(n12)) {
                            n10 = d - 10;
                            n13 = e / 2 + 30;
                            if (main.a.e) {
                                n13 = e / 2 + 10;
                            }
                            n3 = 0;
                        } else {
                            n10 = d / 2;
                            n13 = 10;
                            n3 = 6;
                        }
                    }
                    if (n5 < 0 && n12 >= 0) {
                        if (dq.g(n5) >= dq.g(n12)) {
                            n10 = 10;
                            n13 = e / 2 + 30;
                            if (main.a.e) {
                                n13 = e / 2 + 10;
                            }
                            n3 = 3;
                        } else {
                            n10 = d / 2;
                            n13 = e - 10;
                            n3 = 5;
                        }
                    } else if (n5 <= 0 && n12 < 0) {
                        if (dq.g(n5) >= dq.g(n12)) {
                            n10 = 10;
                            n13 = e / 2 + 30;
                            if (main.a.e) {
                                n13 = e / 2 + 10;
                            }
                            n3 = 3;
                        } else {
                            n10 = d / 2;
                            n13 = 10;
                            n3 = 6;
                        }
                    }
                    cw.c((eh)object2);
                    ((eh)object2).a(bJ, 0, 0, 13, 16, n3, n10, n13, dv.f);
                }
            }
        }
        catch (Exception exception) {}
        main.a.c();
        if (!a && bA == 1 && !main.a.G.a) {
            this.e(eh2);
        }
        cw.c(eh2);
        object2 = eh2;
        ((eh)object2).a(0x808080);
        ((eh)object2).d(0, main.a.B - 2, main.a.A, 2);
        n10 = (int)(co.m().an * (long)main.a.A / 10000L);
        ((eh)object2).a(0xFFFFFF);
        ((eh)object2).d(0, main.a.B - 2, n10, 2);
        ((eh)object2).a(0);
        n10 = main.a.A / 10;
        int n14 = 1;
        while (n14 < 10) {
            ((eh)object2).d(n14 * n10, main.a.B - 2, 1, 2);
            ++n14;
        }
        if (!a) {
            if (main.a.ar && dx.l != 170) {
                if (main.a.A > 250) {
                    eh2.a(main.a.aj, 160, 6, 0);
                    ev.s.a(eh2, "Ch\u01a1i qu\u00e1 180 ph\u00fat m\u1ed9t ng\u00e0y ", 180, 2, 0);
                    ev.s.a(eh2, "s\u1ebd \u1ea3nh h\u01b0\u1edfng x\u1ea5u \u0111\u1ebfn s\u1ee9c kh\u1ecfe.", 180, 12, 0);
                } else {
                    eh2.a(main.a.aj, 5, main.a.B - 67, 0);
                    ev.s.a(eh2, "Ch\u01a1i qu\u00e1 180 ph\u00fat m\u1ed9t ng\u00e0y s\u1ebd \u1ea3nh h\u01b0\u1edfng x\u1ea5u \u0111\u1ebfn s\u1ee9c kh\u1ecfe.", 25, main.a.B - 70, 0);
                }
            }
            main.a.c();
            main.a.c();
            eh2.a(-eh2.a(), -eh2.b());
            if ((dx.l == 128 || dx.l == 127) && cj != 0) {
                eh2.a(0);
                eh2.d(3, 88, 54, 8);
                eh2.a(0xFF0000);
                eh2.e(5, 90, cj, 4);
                eh2.d(5, 90, 50, 4);
                eh2.e(0, 0, 3000, 3000);
                ev.c.a(eh2, "Mabu", 30, 98, 2, ev.f);
            }
            if (co.m().do) {
                ++co.m().dp;
                if (main.a.w % 3 == 0) {
                    eh2.a(0xFFFFFF);
                    eh2.d(0, 0, main.a.A, main.a.B);
                }
                if (co.m().dp >= 100) {
                    co.m().X();
                }
            }
            int n15 = 0;
            while (n15 < E.size()) {
                co co7 = null;
                try {
                    co7 = (co)E.elementAt(n15);
                }
                catch (Exception exception) {}
                if (co7 != null && co7.do && co.a(co7)) {
                    ++co7.dp;
                    if (main.a.w % 3 == 0) {
                        eh2.a(0xFFFFFF);
                        eh2.d(0, 0, main.a.A, main.a.B);
                    }
                    if (co7.dp >= 100) {
                        co7.X();
                    }
                }
                ++n15;
            }
            main.a.M.a();
            main.a.c();
            main.a.c();
            cw.c(eh2);
            this.f(eh2);
            main.a.c();
            cw.c(eh2);
            if (main.a.e && main.a.f) {
                eh eh3 = eh2;
                object2 = this;
                if (!((cw)object2).Q()) {
                    cw.c(eh3);
                    if (!dx.d() && !((cw)object2).x()) {
                        if (ew.cF == 15) {
                            eh3.a(dM, fe + 17, ff + 17, 3);
                        } else {
                            eh3.a(dL, fe + 17, ff + 17, 3);
                        }
                    }
                }
            }
            cw.c(eh2);
            eh eh4 = eh2;
            object2 = this;
            if (fK.size() != 0 && ci) {
                eh4.e(0, main.a.B - 13, main.a.A, 15);
                eh4.a(0, main.a.B - 13, main.a.A, 15, 0);
                String string = (String)fK.elementAt(0);
                ev.e.a(eh4, string, ((cw)object2).fT, main.a.B - 12, 0);
            }
            if (!main.a.G.a && main.a.K == null && g.m == null && g.n == null && main.a.E.equals(c)) {
                super.a(eh2);
            }
            cw.c(eh2);
            int n16 = 100 + (co.bI.size() != 0 ? bI.size() * 12 : 0);
            if (co.m().aw != null) {
                n5 = 0;
                n3 = 0;
                n4 = (main.a.B - 100 - 60) / 12;
                n15 = 0;
                while (n15 < E.size()) {
                    co co8 = (co)E.elementAt(n15);
                    if (co8.av != -1 && co8.av == co.m().aw.a) {
                        if (co8.H() && co8.N < co.m().N) {
                            int n17 = n4;
                            if (co.bI.size() != 0) {
                                n17 -= bI.size();
                            }
                            if (n5 <= n17) {
                                ev.r.a(eh2, co8.au, 20, n16 - 12 + n5 * 12, 0, ev.o);
                                co8.a(eh2, 10, n16 + n5 * 12 - 5);
                                ++n5;
                            }
                        } else if (co8.H() && co8.N > co.m().N && n3 <= n4) {
                            ev.r.a(eh2, co8.au, main.a.A - 25, n16 - 12 + n3 * 12, 1, ev.o);
                            co8.a(eh2, main.a.A - 15, n16 + n3 * 12 - 5);
                            ++n3;
                        }
                    }
                    ++n15;
                }
            }
            el.b().a(eh2);
            if (bi && !main.a.G.a && main.a.w % 4 == 0) {
                eh2.a(as.f, this.bc.j + 15, this.bc.k + 30, 33);
            }
            if (this.eB) {
                this.eF += 5;
                if (this.eC >= 0) {
                    this.eC += this.eF;
                }
                if (this.eC < 0) {
                    --this.eC;
                    if (this.eC == -20) {
                        this.eB = false;
                        this.eC = 0;
                        this.eF = 0;
                    }
                } else if ((this.eD - this.eC > 0 || this.eC < dx.c) && this.eC > 0) {
                    eh2.a(0xFFFFFF);
                    if (!main.a.a && ej.c != 3 && ej.c != 5) {
                        eh2.a(this.eD - this.eC, this.eE - this.eC, 2 * this.eC, 2 * this.eC, 0, 360);
                    } else {
                        eh2.d(0, 0, main.a.A, main.a.B);
                    }
                } else {
                    this.eC = -1;
                }
            }
            n15 = 0;
            while (n15 < co.bI.size()) {
                n16 = 55;
                int n18 = this.bc.j + 32 + n15 * 24;
                eh4 = eh2;
                object2 = (ay)co.bI.elementAt(n15);
                er.b(eh4, ((ay)object2).a, n18, 55, 0, 3);
                String string = String.valueOf(((ay)object2).c) + "'";
                if (((ay)object2).c == 0) {
                    string = String.valueOf(((ay)object2).b) + "s";
                }
                ev.c.a(eh4, string, n18, 70, 2, ev.f);
                ++n15;
            }
            n15 = 0;
            while (n15 < bI.size()) {
                ((ay)bI.elementAt(n15)).a(eh2, this.bc.j + (co.bI.size() != 0 ? 5 : 25), (co.bI.size() != 0 ? 90 : 45) + n15 * 12);
                ++n15;
            }
            this.d(eh2);
            if (ch.fE == 1) {
                long l2;
                long l3 = l2 = ej.j() - be;
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(l3 + 25200000L));
                n16 = calendar.get(11);
                int n19 = calendar.get(12);
                ev.c.a(eh2, String.valueOf(n16) + "h" + n19 + "m", 10, main.a.B - 65, 0, ev.f);
            }
            if (!this.fW.equals("")) {
                n15 = 0;
                while (n15 < this.fX.length) {
                    ev.c.a(eh2, this.fX[n15], 5, 85 + n15 * 18, 0, ev.f);
                    ++n15;
                }
            }
        }
        if ((n2 = main.a.C) > 200) {
            n2 = 200;
        }
        cw.a(eh2, 0 + main.a.A / 2, 0, n2);
        aj.d.a(eh2);
        if (co > ej.j() && dx.l == 170 && cr && cq / 2 > 0) {
            try {
                this.a(eh2, 0 + main.a.A / 2, 0);
            }
            catch (NullPointerException nullPointerException) {
                long l4 = System.currentTimeMillis();
                if (l4 - eW >= 1000L) {
                    eW = l4;
                    System.err.println("[PAINT-NPE] GameScr.paint stage=paint_CT tick=" + main.a.w + " map=" + dx.l);
                    nullPointerException.printStackTrace();
                }
            }
            catch (Exception exception) {}
        }
        if (dx.l == 172) {
            String cfr_ignored_0 = String.valueOf(ch.aC) + "  " + cv + "/" + cw;
            ev.f.a(eh2, String.valueOf(ch.aC) + "  " + cv + "/" + cw, main.a.A - 10, 40, 1);
        }
    }

    private void d(eh eh2) {
        if (this.fS != 0) {
            String string = "";
            int n2 = 0;
            while (n2 < this.fL.length) {
                string = String.valueOf(string) + this.fM[n2] + " ";
                ++n2;
            }
            bo.a(eh2, 20, 45, 95, 35, 0xFFFFFF, false);
            ev.f.a(eh2, ch.m, 68, 50, 2);
            ev.f.a(eh2, String.valueOf(string), 68, 65, 2);
        }
    }

    public static bg a(short s2) {
        int n2 = 0;
        while (n2 < H.size()) {
            bg bg2 = (bg)H.elementAt(n2);
            if (bg2.t.a == s2) {
                return bg2;
            }
            ++n2;
        }
        return null;
    }

    public static co b(int n2) {
        int n3 = 0;
        while (n3 < E.size()) {
            co co2 = (co)E.elementAt(n3);
            if (co2.V == n2) {
                return co2;
            }
            ++n3;
        }
        return null;
    }

    public static dh c(int n2) {
        int n3 = 0;
        while (n3 < G.size()) {
            dh dh2 = (dh)G.elementAt(n3);
            if (dh2.B == n2) {
                return dh2;
            }
            ++n3;
        }
        return null;
    }

    public static dh a(byte by2) {
        return (dh)G.elementAt(by2);
    }

    public static bg v() {
        int n2 = 0;
        while (n2 < H.size()) {
            bg bg2 = (bg)H.elementAt(n2);
            if (bg2.t.a == cw.A()) {
                return bg2;
            }
            ++n2;
        }
        return null;
    }

    public static void c(eh eh2) {
        eh2.a(-eh2.a(), -eh2.b());
        eh2.e(0, -200, main.a.A, 200 + main.a.B);
    }

    private void a(eh eh2, co co2) {
        int n2 = (int)(co2.ag * fD / co2.aj);
        int n3 = (int)(co2.af * (long)fC / co2.ak);
        int n4 = (int)(this.bP * fD / co2.aj);
        int n5 = (int)(this.bM * (long)fC / co2.ak);
        eh2.e(main.a.A / 2 + 58 - eh.a(dZ), 0, 95, 100);
        eh2.b(dZ, 0, 0, eh.a(dZ), eh.b(dZ), 2, main.a.A / 2 + 60, 0, 24);
        eh2.e((int)((long)(main.a.A / 2 + 60 - 83) - fD + fD - (long)n4), 5, n4, 10);
        eh2.a(ed, main.a.A / 2 + 60 - 83, 5, 24);
        eh2.e(0, 0, main.a.A, main.a.B);
        eh2.e((int)((long)(main.a.A / 2 + 60 - 83) - fD + fD - (long)n2), 5, n2, 10);
        eh2.a(eb, main.a.A / 2 + 60 - 83, 5, 24);
        eh2.e(0, 0, main.a.A, main.a.B);
        eh2.e((int)((long)(main.a.A / 2 + 60 - 83 - fC) + fD - (long)n5), 20, n5, 6);
        eh2.a(aR, main.a.A / 2 + 60 - 83, 20, 24);
        eh2.e(0, 0, main.a.A, main.a.B);
        eh2.e((int)((long)(main.a.A / 2 + 60 - 83 - fC) + fD - (long)n3), 20, n3, 6);
        eh2.a(aQ, main.a.A / 2 + 60 - 83, 20, 24);
        eh2.e(0, 0, main.a.A, main.a.B);
    }

    /*
     * WARNING - void declaration
     */
    private void a(eh eh2, boolean bl2, co co2) {
        void var2_5;
        int n2;
        int n3;
        void var3_6;
        if (var3_6 == null) {
            return;
        }
        if (var3_6.V == co.m().V) {
            int n4 = (int)(this.bP * fD / var3_6.aj);
            n3 = (int)(this.bM * (long)fC / var3_6.ak);
            n2 = (int)(var3_6.ag * fD / var3_6.aj);
            long cfr_ignored_0 = var3_6.af;
            long cfr_ignored_1 = var3_6.ak;
        } else {
            int n5 = (int)(var3_6.dw * fD / var3_6.aj);
            n3 = var3_6.dv * fC / 100;
            n2 = (int)(var3_6.ag * fD / var3_6.aj);
            int cfr_ignored_2 = var3_6.dv;
        }
        if (co.m().ci > 0) {
            int n6 = co.m().cg * fB / co.m().ch;
            eh2.a(ea, 58, 29, 0);
            eh2.e(83, 31, n6, 10);
            eh2.a(ec, 83, 31, 0);
            eh2.e(0, 0, main.a.A, main.a.B);
            ev.s.a(eh2, String.valueOf(co.m().cf) + ":" + co.m().cg + "/" + co.m().ch, 115, 29, 2);
        }
        if (var3_6.V != co.m().V) {
            eh2.e(eh.a(dZ) - 95, 0, 95, 100);
        }
        eh2.a(dZ, 0, 0, 0);
        eh2.e(83, 5, (int)var2_5, 10);
        eh2.a(ed, 83, 5, 0);
        eh2.e(0, 0, main.a.A, main.a.B);
        eh2.e(83, 5, n2, 10);
        eh2.a(eb, 83, 5, 0);
        eh2.e(0, 0, main.a.A, main.a.B);
        eh2.e(83, 20, n3, 6);
        eh2.a(aR, 83, 20, 0);
        eh2.e(0, 0, main.a.A, main.a.B);
        eh2.e(83, 20, n3, 6);
        eh2.a(aQ, 83, 20, 0);
        eh2.e(0, 0, main.a.A, main.a.B);
        if (co.m().af == 0L && main.a.w % 10 > 5) {
            eh2.e(83, 20, 2, 6);
            eh2.a(aR, 83, 20, 0);
            eh2.e(0, 0, main.a.A, main.a.B);
        }
    }

    public final void w() {
        this.fo = this.fp = System.currentTimeMillis();
        this.fq = 180;
    }

    private static co O() {
        int n2 = 0;
        while (n2 < E.size()) {
            co co2 = (co)E.elementAt(n2);
            if (co2.bb != 0) {
                return co2;
            }
            ++n2;
        }
        return null;
    }

    private co P() {
        int n2 = 0;
        while (n2 < E.size()) {
            co co2 = (co)E.elementAt(n2);
            if (co2.bb != 0 && co2 != cw.O()) {
                return co2;
            }
            ++n2;
        }
        return null;
    }

    private void e(eh eh2) {
        if (co.cd) {
            return;
        }
        cw.c(eh2);
        if (dx.l == 130 && cw.O() != null && this.P() != null) {
            eh2.a(main.a.A / 2 - 62, 0);
            this.a(eh2, true, cw.O());
            eh2.a(-(main.a.A / 2 - 65), 0);
            this.a(eh2, this.P());
            cw.O().b(eh2, 137, 25, 0);
            this.P().b(eh2, main.a.A - 15 - 122, 25, 2);
        } else if (this.x() && co.m().bi != null) {
            eh2.a(main.a.A / 2 - 62, 0);
            this.a(eh2, true, co.m().bi);
            eh2.a(-(main.a.A / 2 - 65), 0);
            this.a(eh2, co.m());
            co.m().b(eh2, 137, 25, 0);
            co.m().bi.b(eh2, main.a.A - 15 - 122, 25, 2);
        } else if (cw.R() && main.a.A <= 320) {
            co co2 = co.m();
            boolean bl2 = true;
            bl2 = true;
            eh eh3 = eh2;
            eh3.a(gd, 1, 1, 0);
            int n2 = fY.getWidth();
            int n3 = fY.getHeight() / 2;
            int n4 = (int)(co2.ag * (long)n2 / co2.aj);
            if (n4 <= 0) {
                n4 = 1;
            } else if (n4 > n2) {
                n4 = n2;
            }
            eh3.a(fY, 0, n3, n4, n3, 0, 4, 20, 0);
            n4 = (int)(co2.af * (long)n2 / co2.ak);
            if (n4 <= 0) {
                n4 = 1;
            } else if (n4 > n2) {
                n4 = n2;
            }
            eh3.a(fY, 0, 0, n4, n3, 0, 4, 26, 0);
            n4 = 1 + gd.getWidth() / 2 + 1;
            ev.m.a(eh3, co2.au, n4, 5, 2);
            if (co2.be != null) {
                if (co2.be.B() != null) {
                    ev.m.a(eh3, co2.be.B().e, n4, 33, 2);
                }
            } else if (co2.bh != null) {
                ev.m.a(eh3, co2.bh.t.b, n4, 33, 2);
            } else if (co2.bi != null) {
                ev.m.a(eh3, co2.bi.au, n4, 33, 2);
            }
        } else {
            this.a(eh2, true, co.m());
            if (co.m().q() != null || co.m().r() != null) {
                ev.m.a(eh2, ch.bz, this.fE / 2, 8, 2);
            } else if (co.m().be != null) {
                if (co.m().be.B() != null) {
                    ev.m.a(eh2, co.m().be.B().e, this.fE / 2, 9, 2);
                }
                if (co.m().be.H != 0) {
                    ev.m.a(eh2, String.valueOf(o.a(co.m().be.m)), this.fE / 2, 22, 2);
                }
            } else if (co.m().bh != null) {
                ev.m.a(eh2, co.m().bh.t.b, this.fE / 2, 9, 2);
                if (co.m().bh.t.a == 4) {
                    ev.m.a(eh2, String.valueOf(cw.l().aX.e) + "/" + cw.l().aX.g, this.fE / 2, 22, 2);
                }
            } else if (co.m().bi != null) {
                ev.m.a(eh2, co.m().bi.au, this.fE / 2, 9, 2);
                ev.m.a(eh2, String.valueOf(o.a(co.m().bi.ag)), this.fE / 2, 22, 2);
            } else {
                ev.m.a(eh2, co.m().au, this.fE / 2, 9, 2);
                ev.m.a(eh2, String.valueOf(o.a(co.m().K)), this.fE / 2, 22, 2);
            }
        }
        eh2.a(-eh2.a(), -eh2.b());
        if (this.x() && this.fq > 0) {
            this.fo = System.currentTimeMillis();
            if (this.fo - this.fp >= 1000L) {
                this.fp = System.currentTimeMillis();
                --this.fq;
            }
            ev.c.a(eh2, String.valueOf(this.fq), main.a.A / 2, 13, 2, ev.f);
        }
        if (this.eM) {
            eh2.a(as.f, 40, 35, 33);
            --this.eN;
            if (this.eN < 0) {
                this.eN = 0;
                this.eM = false;
            }
        }
    }

    public final boolean x() {
        return dx.a() && (co.m().bb != 0 || dx.l == 130 && cw.O() != null && this.P() != null);
    }

    private void f(eh eh2) {
        if (this.aW != null) {
            eh eh3 = eh2;
            cw cw2 = this;
            bc.a(eh3, co.m().N, co.m().O);
            eh3.a(-eh3.a(), -eh3.b());
            if (!main.a.F.a && !main.a.G.a && g.m == null && main.a.e) {
                int n2 = 0;
                while (n2 < cw2.bz.length()) {
                    int n3 = (main.a.A - cw2.bz.length() * eV) / 2 + n2 * eV + eV / 2;
                    if (cw2.bD[n2] == -1) {
                        eh3.a(bB, n3, main.a.B - 25, 3);
                        ev.f.a(eh3, String.valueOf(cw2.bz.charAt(n2)), n3, main.a.B - 30, 2);
                    } else {
                        eh3.a(bC, n3, main.a.B - 25, 3);
                        ev.g.a(eh3, String.valueOf(cw2.bz.charAt(n2)), n3, main.a.B - 30, 2);
                    }
                    ++n2;
                }
            }
            return;
        }
        if (main.a.K != null || g.m != null || main.a.F.a || main.a.G.a || co.m().aR.c == 0 || el.b().b || main.a.E == di.a) {
            return;
        }
        long l2 = ej.j();
        long l3 = l2 - this.ez;
        int n4 = 0;
        if (l3 < 10000L) {
            n4 = (int)(l3 * 20L / 10000L);
        }
        if (!main.a.e) {
            eh2.a(ew.cF == 10 ? aE : aD, fm + bK - 1, bL - 1, 0);
            er.b(eh2, 542, fm + bK + 3, bL + 3, 0, 0);
            ev.u.a(eh2, "" + u, fm + bK + 22, bL + 15, 1);
            if (l3 < 10000L) {
                eh2.a(2721889);
                n4 = (int)(l3 * 20L / 10000L);
                eh2.d(fm + bK + 3, bL + 3 + n4, 20, 20 - n4);
            }
        } else if (co.m().T != 14) {
            if (cw.ef.b) {
                if (aZ != 1) {
                    eh2.a(0x939090);
                    eh2.d(bK + 9, bL + 10 + 10, 22, 20);
                    eh2.a(0xFFFFFF);
                    eh2.d(bK + 9, bL + 10 + (n4 != 0 ? 20 - n4 : 0) + 10, 22, n4 != 0 ? n4 : 20);
                    eh2.a(ew.cF == 10 ? dQ : dP, bK, bL + 10, 0);
                    ev.p.a(eh2, "" + u, bK + 20, bL + 15 + 10, 2);
                    if (cu) {
                        eh2.a(ew.cF == 14 ? dW : dV, bK + 5, bL - 6 - 40 + 10, 0);
                    } else if (cx) {
                        eh2.a(ew.cF == 14 ? bC : bB, bK + 5, bL - 6 - 40 + 10, 0);
                        er.b(eh2, 1088, bK - 7 + 5, bL - 6 - 40 - 7 + 10, 0, 0);
                    } else if (cy) {
                        eh2.a(ew.cF == 14 ? bC : bB, bK + 5, bL - 6 - 40 + 10, 0);
                        er.b(eh2, 1087, bK - 7 + 5, bL - 6 - 40 - 7 + 10, 0, 0);
                    }
                } else if (aZ == 1) {
                    eh2.a(ew.cF == 10 ? aE : aD, fm + bK - 1, bL - 1 + 10, 0);
                    er.b(eh2, 542, fm + bK + 3, bL + 3 + 10, 0, 0);
                    ev.u.a(eh2, "" + u, fm + bK + 22, bL + 13 + 10, 1);
                    if (l3 < 10000L) {
                        eh2.a(2721889);
                        n4 = (int)(l3 * 20L / 10000L);
                        eh2.d(fm + bK + 3, bL + 3 + n4 + 10, 20, 20 - n4);
                    }
                    if (cu) {
                        eh2.a(ew.cF == 14 ? dY : dX, bK + 20 + 5, bL + 20 - 6 - 40 + 10, 3);
                    } else if (cx) {
                        eh2.a(ew.cF == 14 ? bC : bB, bK + 20 + 5, bL + 20 - 6 - 40 + 10, 3);
                        er.b(eh2, 1088, bK + 20 - 7 + 5, bL + 20 - 6 - 40 - 7 + 10, 0, 0);
                    } else if (cy) {
                        eh2.a(ew.cF == 14 ? bC : bB, bK + 20 + 5, bL + 20 - 6 - 40 + 10, 3);
                        er.b(eh2, 1087, bK + 20 - 7 + 5, bL + 20 - 6 - 40 - 7 + 10, 0, 0);
                    }
                }
            } else if (aZ != 1) {
                eh2.a(0x939090);
                eh2.d(bK + 9, bL + 10 - 6, 22, 20);
                eh2.a(0xFFFFFF);
                eh2.d(bK + 9, bL + 10 + (n4 != 0 ? 20 - n4 : 0) - 6, 22, n4 != 0 ? n4 : 20);
                eh2.a(ew.cF == 10 ? dQ : dP, bK, bL - 6, 0);
                ev.p.a(eh2, "" + u, bK + 20, bL + 15 - 6, 2);
                if (cu) {
                    eh2.a(ew.cF == 14 ? dW : dV, bK, bL - 6 - 40, 0);
                } else if (cx) {
                    eh2.a(ew.cF == 14 ? bC : bB, bK + 20, bL + 20 - 6 - 40, 3);
                    er.b(eh2, 1088, bK + 20 - 7, bL + 20 - 6 - 40 - 7, 0, 0);
                } else if (cy) {
                    eh2.a(ew.cF == 14 ? bC : bB, bK + 20, bL + 20 - 6 - 40, 3);
                    er.b(eh2, 1087, bK + 20 - 7, bL + 20 - 6 - 40 - 7, 0, 0);
                }
            } else {
                eh2.a(0x939090);
                eh2.d(bK + 10, bL + 10 - 6 + 10, 20, 18);
                eh2.a(0xFFFFFF);
                eh2.d(bK + 10, bL + 10 + (n4 != 0 ? 20 - n4 : 0) - 6 + 10, 20, n4 != 0 ? n4 : 18);
                eh2.a(ew.cF == 10 ? dS : dR, bK + 20, bL + 20 - 6 + 10, 3);
                ev.p.a(eh2, "" + u, bK + 20, bL + 15 - 6 + 10, 2);
                if (cu) {
                    eh2.a(ew.cF == 14 ? dY : dX, bK + 20 + 5, bL + 20 - 6 - 40 + 10, 3);
                } else if (cx) {
                    eh2.a(ew.cF == 14 ? bC : bB, bK + 20 + 5, bL + 20 - 6 - 40 + 10, 3);
                    er.b(eh2, 1088, bK + 20 - 7 + 5, bL + 20 - 6 - 40 - 7 + 10, 0, 0);
                } else if (cy) {
                    eh2.a(ew.cF == 14 ? bC : bB, bK + 20 + 5, bL + 20 - 6 - 40 + 10, 3);
                    er.b(eh2, 1087, bK + 20 - 7 + 5, bL + 20 - 6 - 40 - 7 + 10, 0, 0);
                }
            }
        }
        if (Q) {
            bt[] btArray = main.a.e ? bb : ba;
            if (!main.a.e) {
                eh2.a(11152401);
                eh2.d(fm + bK + 2, bL - 10 + 6, 20, 10);
                ev.s.a(eh2, "*", fm + bK + 12, bL - 8 + 6, 2);
            }
            int n5 = main.a.e ? this.eJ : btArray.length;
            int n6 = 0;
            while (n6 < n5) {
                bt bt2;
                if (!main.a.e) {
                    String[] stringArray;
                    if (et.g) {
                        String[] stringArray2 = new String[5];
                        stringArray2[0] = "Q";
                        stringArray2[1] = "W";
                        stringArray2[2] = "E";
                        stringArray2[3] = "R";
                        stringArray = stringArray2;
                        stringArray2[4] = "T";
                    } else {
                        String[] stringArray3 = new String[5];
                        stringArray3[0] = "7";
                        stringArray3[1] = "8";
                        stringArray3[2] = "9";
                        stringArray3[3] = "1";
                        stringArray = stringArray3;
                        stringArray3[4] = "3";
                    }
                    String[] stringArray4 = stringArray;
                    eh2.a(11152401);
                    eh2.d(fm + fk[n6] + 2, fl[n6] - 10 + 8, 20, 10);
                    ev.s.a(eh2, stringArray4[n6], fm + fk[n6] + 12, fl[n6] - 10 + 6, 2);
                }
                if ((bt2 = btArray[n6]) != co.m().aQ) {
                    eh2.a(aD, fm + fk[n6] - 1, fl[n6] - 1, 0);
                }
                if (bt2 != null) {
                    if (bt2 == co.m().aQ) {
                        eh2.a(aE, fm + fk[n6] - 1, fl[n6] - 1, 0);
                        if (main.a.e) {
                            eh2.a(dh.W, 0, 12, 9, 6, 0, fm + fk[n6] + 8, fl[n6] - 7, 0);
                        }
                    }
                    eh eh4 = eh2;
                    int n7 = fl[n6] + 13;
                    int n8 = fm + fk[n6] + 13;
                    er.b(eh4, bt2.a.f, n8, n7, 0, dv.f);
                    long l4 = System.currentTimeMillis();
                    long l5 = l4 - bt2.f;
                    if (l5 < (long)bt2.e) {
                        eh4.a(2721889);
                        if (bt2.j && main.a.w % 6 > 2) {
                            eh4.a(876862);
                        }
                        int n9 = (int)(l5 * 20L / (long)bt2.e);
                        eh4.d(n8 - 10, n7 - 10 + n9, 20, 20 - n9);
                    } else {
                        bt2.j = false;
                    }
                    if (n6 == this.eK && main.a.w % 10 > 5 || n6 == this.eO) {
                        eh2.a(as.f, fm + fk[n6] + 13, fl[n6] + 14, 3);
                    }
                }
                ++n6;
            }
        }
        eh eh5 = eh2;
        if (aZ != 0 && co.m().T != 14) {
            eh5.a(ew.cF == 5 ? dU : dT, fg + 20, fh + 20, 3);
            ef.a(eh5);
            eh5.a(ew.cF == 13 ? dO : dN, fi + 20, fj + 20, 3);
        }
    }

    public static final void a(String string, int n2, int n3, int n4, int n5, int n6) {
        n4 = -1;
        int n7 = 0;
        while (n7 < 5) {
            if (bV[n7] == -1) {
                n4 = n7;
                break;
            }
            ++n7;
        }
        if (n4 == -1) {
            return;
        }
        cw.bW[n4] = n6;
        cw.bS[n4] = string;
        cw.bT[n4] = n2;
        cw.bU[n4] = n3;
        cw.fs[n4] = 0;
        cw.ft[n4] = n5 < 0 ? -5 : 5;
        cw.bV[n4] = 0;
        cw.fu[n4] = 0;
        cw.fr[n4] = 10;
        n7 = 0;
        while (n7 < 5) {
            if (bV[n7] != -1 && n4 != n7 && ft[n4] < 0 && dq.g(bT[n4] - bT[n7]) <= 20 && fr[n4] == fr[n7]) {
                int n8 = n4;
                fr[n8] = fr[n8] + 10;
            }
            ++n7;
        }
    }

    public static final boolean a(int n2, int n3, int n4) {
        int n5;
        int n6 = n5 = fx[0] == -1 ? 0 : 1;
        if (fx[n5] != -1) {
            return false;
        }
        cw.fx[n5] = 0;
        cw.fz[n5] = n4;
        cw.fv[n5] = n2;
        cw.fw[n5] = n3;
        return true;
    }

    private boolean Q() {
        if (!main.a.f && main.a.E == cw.l()) {
            return true;
        }
        if (!main.a.e) {
            return true;
        }
        if (el.b().b) {
            return true;
        }
        if (da.a) {
            return true;
        }
        return main.a.K != null || g.m != null || main.a.F.a || main.a.G.a;
        {
        }
    }

    public static void d(int n2, int n3) {
        if (main.a.A == 128 || main.a.B <= 208) {
            n2 = 126;
            n3 = 160;
        }
        bZ = n2;
        ca = n3;
        bY = f - n2 / 2;
        bX = cM - n3 / 2;
        if (main.a.e) {
            if (main.a.B <= 240) {
                bX -= 10;
            }
            if (main.a.e && !main.a.g && main.a.E instanceof cw) {
                bZ = 310;
                bY = d / 2 - bZ / 2;
            }
        }
        if (bX < -10) {
            bX = -10;
        }
        if (main.a.B > 208 && bX < 0) {
            bX = 0;
        }
        if (main.a.B == 208 && bX < 10) {
            bX = 10;
        }
    }

    public static void y() {
        dx.e();
    }

    public static int z() {
        int n2 = co.m().aR == null ? -1 : af[co.m().aR.a];
        return n2;
    }

    public static byte A() {
        byte by2 = 0;
        if (co.m().aR == null) {
            by2 = -1;
        } else if (co.m().aR.a <= ae.length - 1) {
            by2 = (byte)ae[co.m().aR.a];
        }
        return by2;
    }

    public final void a(String string, String string2) {
        el.b().b = false;
        if (string2.equals(ch.cT)) {
            if (cw.aP.h == co.m().V) {
                return;
            }
            cj.a().a(string, cw.aP.h);
            return;
        }
        if (string.equals("")) {
            return;
        }
        if (string.equals("pingABCD")) {
            cj.a().i();
            cj.a().j();
            boolean bl2 = cc = !cc;
        }
        if (string.equals("icon")) {
            boolean bl3 = dq.b = !dq.b;
        }
        if (string.equals("big")) {
            dq.c = !dq.c;
        }
        cj.a().b(string);
    }

    public final void B() {
    }

    public final void a(aa aa2) {
        da.c();
        try {
            this.U = new int[aa2.c().readByte()];
            this.V = new int[this.U.length];
            this.W = new int[this.U.length];
            this.X = new int[this.U.length];
            this.Y = new int[this.U.length];
            this.aa = new String[this.U.length];
            this.Z = new int[this.U.length];
            this.ab = new String[this.U.length];
            int n2 = 0;
            while (n2 < this.U.length) {
                this.U[n2] = aa2.c().readByte();
                this.V[n2] = aa2.c().readByte();
                this.W[n2] = aa2.c().readByte();
                this.X[n2] = aa2.c().readByte();
                byte by2 = aa2.c().readByte();
                if (by2 == 1) {
                    this.aa[n2] = aa2.c().readUTF();
                    this.Y[n2] = aa2.c().readInt();
                    this.ab[n2] = aa2.c().readUTF();
                    this.Z[n2] = aa2.c().readInt();
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        main.a.G.r();
        main.a.G.s();
    }

    private void a(String string, ae ae2, ae ae3) {
        this.cd = new bp();
        this.cd.a(string, ae2, ae3);
    }

    public final void a(int n2, String string, byte by2) {
        co co2 = cw.b(n2);
        if (co2 != null) {
            if (by2 == 3) {
                this.a(string, new ae(ch.bt, 2000, co2), new ae(ch.bk, 2009, co2));
            }
            if (by2 == 4) {
                this.a(string, new ae(ch.bt, 2005, co2), new ae(ch.bk, 2009, co2));
            }
        }
    }

    public final void d(int n2) {
        co co2 = cw.b(n2);
        if (co2 != null) {
            this.a(String.valueOf(co2.au) + ch.eF, new ae(ch.bo, 11114, co2), new ae(ch.bp, 2009, co2));
        }
    }

    public static void a(int n2, byte by2) {
        if (I.size() == 0) {
            cj.a().b((byte)2, by2);
            dq.c("getFlag1");
            return;
        }
        if (n2 == co.m().V) {
            dq.c("my cflag: isme");
            co.m();
            if (co.a(by2)) {
                dq.c("my cflag: true");
                int n3 = 0;
                while (n3 < I.size()) {
                    bi bi2 = (bi)I.elementAt(n3);
                    if (bi2 != null && bi2.a == by2) {
                        dq.c("my cflag: cflag==");
                        co.m().bQ = bi2.b;
                    }
                    ++n3;
                }
                return;
            }
            co.m();
            if (!co.a(by2)) {
                dq.c("my cflag: false");
                cj.a().b((byte)2, by2);
                return;
            }
        } else {
            dq.c("my cflag: not me");
            if (cw.b(n2) != null) {
                cw.b(n2);
                if (co.a(by2)) {
                    dq.c("my cflag: true");
                    int n4 = 0;
                    while (n4 < I.size()) {
                        bi bi3 = (bi)I.elementAt(n4);
                        if (bi3 != null && bi3.a == by2) {
                            dq.c("my cflag: cflag==");
                            cw.b((int)n2).bQ = bi3.b;
                        }
                        ++n4;
                    }
                    return;
                }
                cw.b(n2);
                if (!co.a(by2)) {
                    dq.c("my cflag: false");
                    cj.a().b((byte)2, by2);
                }
            }
        }
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public final void a(int n2, Object object) {
        dq.c("PERFORM WITH ID = " + n2);
        int n3 = 0;
        block40: do {
            switch (n3 == 0 ? n2 : n3) {
                case 888351: {
                    cj.a().g((byte)5);
                    main.a.l();
                    return;
                }
                case 11112: {
                    co co2 = (co)object;
                    cj.a().a((byte)1, co2.V);
                    return;
                }
                case 11113: {
                    co co3 = (co)object;
                    if (co3 == null) return;
                    cj.a().a((byte)0, co3.V, (byte)-1, -1);
                    return;
                }
                case 11114: {
                    this.cd = null;
                    co co4 = (co)object;
                    if (co4 == null) {
                        return;
                    }
                    cj.a().a((byte)1, co4.V, (byte)-1, -1);
                    return;
                }
                case 11111: {
                    if (co.m().bi == null) {
                        return;
                    }
                    da.a();
                    if (main.a.G.S.size() <= 0) {
                        co cfr_ignored_1 = co.m().bi;
                        this.I();
                    }
                    main.a.G.a(co.m().bi);
                    main.a.G.s();
                    cj.a().c(co.m().bi.V);
                    cj.a().y(co.m().bi.V);
                    return;
                }
                case 11115: {
                    if (co.m().bi == null) {
                        return;
                    }
                    da.a();
                    cj.a().a(co.m().bi.V, (short)co.m().bi.Y);
                    return;
                }
                case 2000: {
                    this.cd = null;
                    if ((co)object == null) {
                        cj.a().a((byte)1, (byte)3, -1);
                        return;
                    }
                    cj.a().a((byte)1, (byte)3, ((co)object).V);
                    cj.a().l();
                    return;
                }
                case 2001: {
                    main.a.l();
                    return;
                }
                case 2003: {
                    main.a.l();
                    da.a();
                    cj.a().a((byte)0, (byte)3, co.m().bi.V);
                    return;
                }
                case 2004: {
                    main.a.l();
                    cj.a().a((byte)0, (byte)4, co.m().bi.V);
                    return;
                }
                case 2005: {
                    main.a.l();
                    this.cd = null;
                    if ((co)object == null) {
                        cj.a().a((byte)1, (byte)4, -1);
                        return;
                    }
                    cj.a().a((byte)1, (byte)4, ((co)object).V);
                    return;
                }
                case 2009: {
                    this.cd = null;
                    return;
                }
                case 2006: {
                    main.a.l();
                    cj.a().a((byte)2, (byte)4, co.m().bi.V);
                    return;
                }
                case 2007: {
                    main.a.l();
                    n3 = 12006;
                    continue block40;
                }
                case 11038: {
                    eq eq2 = new eq("");
                    eq2.addElement(new ae(ch.aY[1], 110381));
                    eq2.addElement(new ae(ch.aY[2], 110382));
                    eq2.addElement(new ae(ch.aY[3], 110383));
                    main.a.F.a(eq2);
                    return;
                }
                case 110382: {
                    cj.a().o();
                    return;
                }
                case 110383: {
                    cj.a().p();
                    return;
                }
                case 1: {
                    main.a.l();
                    return;
                }
                case 2: {
                    main.a.F.a = false;
                    return;
                }
                case 8002: {
                    this.a(false, true);
                    main.a.k();
                    main.a.j();
                    return;
                }
                case 11057: {
                    j.A.removeAllElements();
                    j.y.removeAllElements();
                    bg bg2 = (bg)object;
                    if (bg2.y == 0) {
                        cj.a().a((short)bg2.t.a, (byte)main.a.F.b);
                        return;
                    }
                    if (main.a.F.b != 0) return;
                    cj.a().l(bg2.y);
                    return;
                }
                case 11000: {
                    main.a.G.q();
                    main.a.G.s();
                    return;
                }
                case 11001: {
                    co.m().L();
                    return;
                }
                case 11002: {
                    main.a.G.A();
                    return;
                }
                case 11120: {
                    Object[] objectArray = (Object[])object;
                    object = (bt)objectArray[0];
                    int n4 = Integer.parseInt((String)objectArray[1]);
                    int n5 = 0;
                    while (true) {
                        if (n5 >= bb.length) {
                            cw.bb[n4] = object;
                            cw.C();
                            return;
                        }
                        if (bb[n5] == object) {
                            cw.bb[n5] = null;
                        }
                        ++n5;
                    }
                }
                case 11121: {
                    Object[] objectArray = (Object[])object;
                    bt bt2 = (bt)objectArray[0];
                    int n6 = Integer.parseInt((String)objectArray[1]);
                    int n7 = 0;
                    while (true) {
                        if (n7 >= ba.length) {
                            cw.ba[n6] = bt2;
                            cw.D();
                            return;
                        }
                        if (ba[n7] == bt2) {
                            cw.ba[n7] = null;
                        }
                        ++n7;
                    }
                }
                case 110001: {
                    main.a.G.q();
                    main.a.G.s();
                    return;
                }
                case 110004: {
                    main.a.F.a = false;
                    return;
                }
                case 11067: {
                    if (dx.n != 0) {
                        cj.a().f(0);
                        da.a();
                        return;
                    }
                    aO.a(ch.aW, 0);
                    return;
                }
                case 11059: {
                    bt bt3 = bb[this.eK];
                    this.b(bt3, false);
                    this.cA = null;
                    return;
                }
                case 12000: {
                    cj.a().a((byte)1, -1, (String)null);
                    return;
                }
                case 12001: {
                    main.a.l();
                    return;
                }
                case 12002: {
                    main.a.l();
                    d d2 = (d)object;
                    cj.a().a((byte)1, -1, d2.a, d2.b);
                    this.cd = null;
                    return;
                }
                case 12003: {
                    d d3 = (d)object;
                    main.a.l();
                    cj.a().a((byte)2, -1, d3.a, d3.b);
                    this.cd = null;
                    return;
                }
                case 12004: {
                    bt bt4 = (bt)object;
                    this.b(bt4, true);
                    co.m();
                    co.s();
                    return;
                }
                case 110391: {
                    cj.a().a((byte)0, co.m().bi.V, -1, -1);
                    return;
                }
                case 12005: {
                    if (main.a.ap == null) {
                        main.a.ap = new dt();
                    }
                    main.a.ap.a();
                    main.a.l();
                    return;
                }
                case 12006: {
                    GameMidlet.g.a();
                    return;
                }
            }
            return;
        } while (true);
    }

    public final void b(String string, String string2) {
        this.fL = new int[string.length()];
        this.fM = new int[string.length()];
        this.fN = new int[string.length()];
        this.fO = new int[string.length()];
        this.fP = new int[string.length()];
        int n2 = 0;
        while (n2 < string.length()) {
            this.fL[n2] = Short.parseShort(string.substring(n2, n2 + 1));
            this.fM[n2] = dq.b(0, 11);
            this.fN[n2] = 1;
            this.fP[n2] = 0;
            ++n2;
        }
        this.fS = 100;
        this.fQ = 0;
        this.fR = string2;
        eR = eS = ej.j();
    }

    public final void a(String string) {
        if (!this.fV) {
            this.fU = ev.e.a(string);
            this.fT = main.a.A;
            this.fV = true;
        }
        if (string.startsWith("!")) {
            string = string.substring(1, string.length());
            this.ce = true;
        }
        fK.addElement(string);
    }

    public final void b(String string) {
        this.fW = string;
        this.fX = ev.k.a(this.fW, 500);
    }

    private static boolean R() {
        return dx.c() && cw.cl.a == 0;
    }

    private static void a(eh eh2, int n2, int n3, int n4) {
        if (cl == null) {
            return;
        }
        if (!a && bA == 1 && !main.a.G.a && cw.R()) {
            int n5;
            int n6;
            if (n4 < cw.ga.a + (cw.fZ.a << 2)) {
                n4 = cw.ga.a + (cw.fZ.a << 2);
            }
            if (n2 > main.a.A - n4 / 2) {
                n2 = main.a.A - n4 / 2;
            }
            if (n2 < eh.a(gd) + n4 / 2 + 10) {
                n2 = eh.a(gd) + n4 / 2 + 10;
            }
            n3 = cw.fZ.b;
            int n7 = n3 + 0 + eh.b(gc) / 2 + 2;
            int n8 = cw.ga.a;
            int n9 = n4 / 2 - n8 / 2;
            n4 = n2 - n4 / 2;
            int n10 = n2 + n8 / 2;
            int n11 = n9 - cw.fZ.a;
            int n12 = n11 / cw.fZ.a;
            if (n11 % cw.fZ.a > 0) {
                ++n12;
            }
            int n13 = 0;
            while (n13 < n12) {
                if (n13 < n12 - 1) {
                    fZ.a(1, n4 + cw.fZ.a + n13 * cw.fZ.a, 3, 0, 0, eh2);
                } else {
                    fZ.a(1, n4 + n11, 3, 0, 0, eh2);
                }
                if (n13 < n12 - 1) {
                    fZ.a(1, n10 + n13 * cw.fZ.a, 3, 0, 0, eh2);
                } else {
                    fZ.a(1, n10 + n11 - cw.fZ.a, 3, 0, 0, eh2);
                }
                ++n13;
            }
            fZ.a(0, n4, 3, 2, 0, eh2);
            fZ.a(0, n10 + n11, 3, 0, 0, eh2);
            if (cw.cl.c > 0) {
                n13 = 2;
                n6 = 3;
                if (cw.cl.e == 4) {
                    n13 = 4;
                    n6 = 5;
                }
                if ((n5 = cw.cl.c * n9 / cw.cl.b) < 0) {
                    n5 = 0;
                }
                if (n5 > n9) {
                    n5 = n9;
                }
                eh2.e(n4 + n9 - n5, 3, n5, n3);
                n5 = 0;
                while (n5 < n12) {
                    if (n5 < n12 - 1) {
                        fZ.a(n6, n4 + cw.fZ.a + n5 * cw.fZ.a, 3, 0, 0, eh2);
                    } else {
                        fZ.a(n6, n4 + n11, 3, 0, 0, eh2);
                    }
                    ++n5;
                }
                fZ.a(n13, n4, 3, 2, 0, eh2);
                main.a.a(eh2);
            }
            if (cw.cl.d > 0) {
                n13 = 2;
                n6 = 3;
                if (cw.cl.f == 4) {
                    n13 = 4;
                    n6 = 5;
                }
                if ((n5 = cw.cl.d * n9 / cw.cl.b) < 0) {
                    n5 = 0;
                }
                if (n5 > n9) {
                    n5 = n9;
                }
                eh2.e(n10, 3, n5, n3);
                n5 = 0;
                while (n5 < n12) {
                    if (n5 < n12 - 1) {
                        fZ.a(n6, n10 + n5 * cw.fZ.a, 3, 0, 0, eh2);
                    } else {
                        fZ.a(n6, n10 + n11 - cw.fZ.a, 3, 0, 0, eh2);
                    }
                    ++n5;
                }
                fZ.a(n13, n10 + n11, 3, 0, 0, eh2);
                main.a.a(eh2);
            }
            ga.a(0, n2 - n8 / 2, 0, 0, 0, eh2);
            String string = ej.a(cw.cl.n, (int)cw.cl.m, true, false);
            ev.d.a(eh2, string, n2 + 1, 0 + cw.ga.b / 2 - ev.g.a() / 2, 2);
            dl.b(cw.cl.e, 1).b(eh2, cw.cl.j, n2 - 5, n7 + 5, 1, ev.f);
            dl.b(cw.cl.f, 1).b(eh2, cw.cl.k, n2 + 5, n7 + 5, 0, ev.f);
            if (cw.cl.a != 0) {
                n6 = 0 + n3 / 2 - 2;
                ev.w.a(eh2, "" + cw.cl.c, n4 + n9 / 2, n6, 2);
                ev.w.a(eh2, "" + cw.cl.d, n10 + n9 / 2, n6, 2);
            }
            eh2.a(gb, n2, 0 + cw.ga.b + 2, 3);
            if (cw.cl.a == 0) {
                int cfr_ignored_0 = cw.cl.e;
                int cfr_ignored_1 = cw.cl.f;
                cw.a(eh2, cw.cl.g, cw.cl.h, n2 - 13, cw.cl.i, n2 + 13, n7);
            }
        }
    }

    private static void a(eh eh2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (gc != null) {
            int n8;
            int n9 = eh.b(gc) / 2;
            int n10 = 0;
            while (n10 < n2) {
                n8 = 0;
                if (n10 < n3) {
                    n8 = 1;
                }
                eh2.a(gc, 0, n8 * n9, eh.a(gc), n9, 0, n4 - n10 * (n9 + 1), n7, 3);
                ++n10;
            }
            n10 = 0;
            while (n10 < n2) {
                n8 = 0;
                if (n10 < n5) {
                    n8 = 1;
                }
                eh2.a(gc, 0, n8 * n9, eh.a(gc), n9, 0, n6 + n10 * (n9 + 1), n7, 3);
                ++n10;
            }
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, short s2, bn[] bnArray) {
        am am2 = new am(n2, n3, n4, n5, n6, n7, n8, s2, bnArray);
        cw.a(am2);
    }

    public static void a(int n2, int n3, int n4, co co2, bn bn2, int n5, short s2, short s3) {
        am am2 = new am(n2, n3, n4, co2.ac(), bn2, n5, s2, s3);
        cw.a(am2);
    }

    private static void a(am am2) {
        if (am2.a == 0) {
            aj.a(am2);
            return;
        }
        if (am2.a == 1) {
            aj.b(am2);
            return;
        }
        if (am2.a == 2) {
            aj.c(am2);
            return;
        }
        aj.d(am2);
    }

    private void a(eh eh2, int n2, int n3) {
        if (n2 > main.a.A - 85) {
            n2 = main.a.A - 85;
        }
        if (n2 < eh.a(gd) + 85 + 10) {
            n2 = eh.a(gd) + 85 + 10;
        }
        int cfr_ignored_0 = cw.fZ.b;
        eh.b(gc);
        n3 = cw.ga.a;
        int n4 = 85 - n3 / 2;
        int n5 = n2 - 85 + 3;
        int n6 = n2 + n3 / 2;
        int n7 = (n4 -= cw.fZ.a) / cw.fZ.a;
        if (n4 % cw.fZ.a > 0) {
            ++n7;
        }
        int n8 = 0;
        while (n8 < n7) {
            if (n8 < n7 - 1) {
                eh2.b(eg, 0, 15, eh.a(eg), 15, 2, n5 + cw.fZ.a + n8 * cw.fZ.a, 3, 20);
            } else {
                eh2.b(eg, 0, 15, eh.a(eg), 15, 2, n5 + n4, 3, 20);
            }
            if (n8 < n7 - 1) {
                eh2.b(eg, 0, 15, eh.a(eg), 15, 2, n6 + n8 * cw.fZ.a, 3, 20);
            } else {
                eh2.b(eg, 0, 15, eh.a(eg), 15, 2, n6 + n4 - cw.fZ.a, 3, 20);
            }
            ++n8;
        }
        fZ.a(0, n5, 3, 2, 0, eh2);
        fZ.a(0, n6 + n4, 3, 0, 0, eh2);
        n8 = cn * 100 / (cq / 2) * 66 / 100;
        if (n8 > 0) {
            if (n8 < 6) {
                n8 = 6;
            }
            eh2.e(n5, 3, n8, 15);
        }
        if (cn > 0) {
            n7 = 0;
            while (n7 < 11) {
                if (n7 == 0) {
                    eh2.b(eg, 0, 60, eh.a(eg), 15, 2, n5, 3, 20);
                } else {
                    eh2.b(eg, 0, 75, eh.a(eg), 15, 2, n5 + n7 * 6, 3, 20);
                }
                ++n7;
            }
        }
        main.a.a(eh2);
        n7 = cm * 100 / (cq / 2) * 66 / 100;
        if (66 - (66 - n7) > 0) {
            if (n7 < 6) {
                n7 = 6;
            }
            eh2.e(n6 + 66 - n7, 3, 66 - (66 - n7), 15);
        }
        if (cm > 0) {
            n7 = 0;
            while (n7 < 11) {
                if (n7 == 0) {
                    eh2.b(eg, 0, 30, eh.a(eg), 15, 0, n6 + n4, 3, 20);
                } else {
                    eh2.b(eg, 0, 45, eh.a(eg), 15, 0, n6 + n4 - n7 * 6, 3, 20);
                }
                ++n7;
            }
        }
        main.a.a(eh2);
        ga.a(0, n2 - n3 / 2 + 1, 0, 0, 0, eh2);
        String string = String.valueOf(o.b((int)((co - ej.j()) / 1000L)));
        ev.d.a(eh2, string, n5 + 85 - 2, 5, 2);
        ev.o.a(eh2, "T\u1ea7ng " + cs, n5 + 85 - 3, 0 + cw.ga.b, 2);
        n4 = ev.a.a(String.valueOf(cn));
        ev.b.a(eh2, String.valueOf(cn), n2 - n3 / 2 - n4, 3 + cw.ga.b, 0);
        er.b(eh2, 2325, n2 - n3 / 2 - n4 - 15, 3 + cw.ga.b, 2, 20);
        n4 = ev.a.a(String.valueOf(cm));
        ev.a.a(eh2, String.valueOf(cm), n2 + n3 / 2, 3 + cw.ga.b, 0);
        er.b(eh2, 2323, n2 + n3 / 2 + n4 + 3, 3 + cw.ga.b, 0, 20);
        ev.f.a("#01 AAAAAAAAAA");
        cw.b(eh2, 40);
        main.a.a(eh2);
    }

    private static void b(eh eh2, int n2) {
        String string = "#01 nnnnnnnnnnnn";
        int n3 = ev.k.a(string);
        n3 = main.a.A - n3 - 20;
        int n4 = 0;
        while (n4 < ge) {
            ev ev2 = ev.s;
            if (n4 == 0) {
                ev2 = ev.p;
            } else if (n4 == 1) {
                ev2 = ev.n;
            } else if (n4 == 2) {
                ev2 = ev.q;
            }
            if (n4 == ge - 1) {
                ev2 = ev.r;
            }
            String[] stringArray = dq.a((String)ct.elementAt(n4), "|", 0);
            int[] nArray = new int[2];
            nArray[1] = 18;
            int[] nArray2 = nArray;
            int n5 = 0;
            while (n5 < 2) {
                ev2.a(eh2, stringArray[n5], n3 + nArray2[n5], 40 + n4 * ev.k.a(), 0, ev.k);
                ++n5;
            }
            ++n4;
        }
        main.a.a(eh2);
        ev.f.a();
        main.a.a(eh2);
    }
}

