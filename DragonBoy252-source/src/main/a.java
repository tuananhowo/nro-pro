/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package main;

import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class a
extends eg
implements ao {
    public static boolean a = false;
    public static long b = 0L;
    public static boolean c = true;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static a h;
    public static boolean[] i;
    private static boolean[] at;
    public static boolean[] j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static bq[] v;
    public static int w;
    public static int x;
    private static int au;
    public static boolean y;
    public static boolean z;
    private static long av;
    private static long aw;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static ew E;
    private static long ax;
    public static dg F;
    public static dl G;
    public static dl H;
    public static en I;
    public static dp J;
    public static cu K;
    public static dj L;
    private static eq ay;
    public static bj M;
    public static Image[] N;
    public static int O;
    private static int az;
    public static int[] P;
    public static int[] Q;
    private eh aA = new eh();
    public static Image[] R;
    public static Image[] S;
    public static ep T;
    public static eq U;
    private static eq aB;
    private static eq aC;
    public static eq V;
    public static boolean W;
    public static int X;
    public static long Y;
    public static boolean Z;
    private static int aD;
    private int aE;
    public static boolean aa;
    private static Image aF;
    private static Image aG;
    public static Image[] ab;
    private static Image[] aH;
    public static int[] ac;
    public static int[] ad;
    private static int aI;
    private static int aJ;
    private static int aK;
    private static int aL;
    private static int[] aM;
    private static int[] aN;
    private static int[] aO;
    public static boolean ae;
    private static boolean aP;
    private static int aQ;
    public static int af;
    public static int ag;
    private static int[] aR;
    public static int[] ah;
    private static int[] aS;
    private static int aT;
    private static int[] aU;
    private static Image aV;
    private static Image aW;
    private static boolean aX;
    private static long aY;
    public static int ai;
    public static Image aj;
    private static int aZ;
    private static int ba;
    private long bb = System.currentTimeMillis() + 1000L;
    private long bc = System.currentTimeMillis() + 1000L;
    public static long ak;
    private static String bd;
    private static int be;
    private static eq bf;
    private int bg = 12;
    public static boolean al;
    private int[] bh;
    private int[] bi;
    private int[] bj;
    private static int[] bk;
    private static Image[] bl;
    private static Image bm;
    private static Image[][] bn;
    public static boolean am;
    public static boolean an;
    public static ds ao;
    public static dt ap;
    public static dr aq;
    public static boolean ar;
    private volatile boolean bo;
    private static volatile String bp;
    private static int bq;
    private static Object br;
    private static long bs;
    private static int bt;

    static {
        e = false;
        i = new boolean[15];
        at = new boolean[15];
        j = new boolean[15];
        v = new bq[4];
        new Object();
        az = 0;
        R = new Image[7];
        S = new Image[7];
        T = new ep("");
        U = new eq("");
        X = -1;
        Z = false;
        aD = -1;
        ab = new Image[3];
        aH = new Image[3];
        af = -1;
        aR = new int[5];
        aT = 0;
        aU = new int[]{1, 4, 11};
        (new int[1])[0] = -1;
        aY = 0L;
        new eq("vFlyText");
        aZ = 0;
        be = A - 60;
        bf = new eq("");
        al = false;
        new Random();
        an = true;
        bt = 15;
    }

    public a() {
        a a2 = this;
        A = a2.s();
        B = a2.t();
        ew.cC = ev.t.a() + 8;
        F = new dg();
        G = new dl();
        ay = new eq("vCurrPopup");
        C = A / 2;
        D = B / 2;
        if (a2.hasPointerEvents()) {
            e = true;
            if (A >= 240) {
                f = true;
            }
            if (A < 320) {
                g = true;
            }
        }
        L = new dj();
        if (B <= 160) {
            bj.a = 15;
            ew.cE = 17;
        }
        cw.t = (A > B ? A : B) + 20;
        h = a2;
        System.gc();
        M = new bj();
        if (!a) {
            if (bn == null) {
                bn = new Image[2][5];
                int n2 = 0;
                while (n2 < 2) {
                    int n3 = 0;
                    while (n3 < 5) {
                        main.a.bn[n2][n3] = ej.b("/e/d" + n2 + n3 + ".png");
                        ++n3;
                    }
                    ++n2;
                }
            }
            a2.bh = new int[2];
            a2.bi = new int[2];
            a2.bj = new int[2];
            a2.bj[1] = -1;
            a2.bj[0] = -1;
        }
        main.a.u();
        bm = ej.b("/mainImage/myTexture2df.png");
        int n4 = ea.d(ea.b);
        if (n4 != -1) {
            ej.c = n4;
        }
        if (ej.c == 7 && (ea.c("fake") == null || ea.c("fake") == "")) {
            bm = ej.b("/mainImage/wait.png");
        }
        aB = new eq("vDebugUpdate");
        aC = new eq("vDeBugPait");
        V = new eq("vDebugSesion");
        n4 = 0;
        while (n4 < 3) {
            main.a.ab[n4] = ej.b("/mainImage/myTexture2dbd" + n4 + ".png");
            ++n4;
        }
        eh.a(ab[0]);
        eh.b(ab[0]);
        eh.a(ab[1]);
        eh.b(ab[1]);
        dl.I = ea.d("lowGraphic");
        a = ea.d("lowGraphic") == 1;
        cw.ci = ea.d("serverchat") != 1;
        co.dz = ea.d("isPaintAura") == 1;
        co.dA = ea.d("isPaintAura2") == 1;
        dq.a();
        er.b();
        bo.a();
        dl.ab = 176;
        if (176 > A) {
            dl.ab = A;
        }
        aj = ej.b("/mainImage/18+.png");
        n4 = 0;
        while (n4 < 7) {
            main.a.R[n4] = ej.b("/effectdata/blue/" + n4 + ".png");
            main.a.S[n4] = ej.b("/effectdata/violet/" + n4 + ".png");
            ++n4;
        }
        ao = new ds();
        ap = new dt();
        I = new en();
        aq = new dr();
    }

    public static a a() {
        return h;
    }

    public static void b() {
        if (!eb.a().d()) {
            eb.a().a(GameMidlet.a, GameMidlet.b);
        }
    }

    public static void a(eh eh2) {
        eh2.a(-eh2.a(), -eh2.b());
        eh2.e(0, 0, A, B);
    }

    public static void b(eh eh2) {
        eh2.a(-eh2.a(), -eh2.b());
        eh2.a(0, 0);
        eh2.e(0, 0, A, B);
        eh2.a(-cw.j, -cw.k);
    }

    public static void c() {
    }

    public final void d() {
        block145: {
            int n2;
            block144: {
                block146: {
                    String string;
                    if (X == 1 && Y < ej.j()) {
                        Y = ej.j();
                        X = -1;
                        co.cd = false;
                        K = null;
                        da.c();
                        ej.a(true);
                    }
                    if (X == 2 && Y < ej.j() && w % 2 == 0 && E != null) {
                        if (E == cw.l()) {
                            if (co.cd) {
                                co.cd = false;
                            }
                            if (ds.o) {
                                ds.o = false;
                            }
                        }
                        if (er.g != null && er.g.size() > 0) {
                            cj cj2;
                            string = er.g.elementAt(0);
                            if (string instanceof bz && (cj2 = cj.a()) != null) {
                                cj2.p(((bz)((Object)string)).b);
                            }
                            er.g.removeElementAt(0);
                        }
                        i.n.size();
                    }
                    if (ej.j() > this.bb) {
                        this.bb += 1000L;
                        aZ = 0;
                    }
                    ++aZ;
                    if (U.size() > 0 && bd == null) {
                        bd = string = (String)U.elementAt(0);
                        be = A - 60;
                        aD = -1;
                        U.removeElementAt(0);
                    }
                    if (w % 5 == 0) {
                        b = ej.j();
                    }
                    if (ej.j() > this.bc) {
                        this.bc += 1000L;
                        ba = 0;
                    }
                    ++ba;
                    aB.removeAllElements();
                    long l2 = System.currentTimeMillis();
                    if (cw.cc) {
                        dq.b();
                    }
                    if (!cw.av && cw.aB > 0L && ej.j() - cw.aB >= 500L) {
                        cw.l();
                        cw.k();
                    }
                    if (l2 - av >= 780L && !y) {
                        av = l2;
                        y = true;
                    } else {
                        y = false;
                    }
                    if (l2 - aw >= 7800L && !z) {
                        aw = l2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x > 0) {
                        --x;
                    }
                    if (++w > 10000) {
                        if (System.currentTimeMillis() - aY > 20000L && E == I) {
                            GameMidlet.g.a();
                        }
                        w = 0;
                    }
                    if (E == null) break block145;
                    if (g.n != null) {
                        g.n.b();
                        g.n.c();
                    } else if (g.m != null) {
                        g.m.b();
                        g.m.c();
                    } else if (K != null) {
                        K.a();
                    } else if (main.a.F.a) {
                        F.b();
                        F.a();
                    } else if (main.a.G.a) {
                        G.C();
                        if (main.a.b(main.a.G.b, 0, main.a.G.d, main.a.G.e)) {
                            W = false;
                        }
                        if (H != null && main.a.H.a) {
                            H.C();
                            if (main.a.b(main.a.H.b, 0, main.a.H.d, main.a.H.e)) {
                                W = true;
                            }
                        }
                        if (H != null) {
                            if (W) {
                                H.u();
                            } else {
                                G.u();
                            }
                        } else {
                            G.u();
                        }
                        if (main.a.G.o != null && main.a.G.o.b) {
                            G.t();
                        } else if (H != null && main.a.H.o != null && main.a.H.o.b) {
                            H.t();
                        } else if (main.a.b(main.a.G.b, 0, main.a.G.d, main.a.G.e) && H != null || H == null) {
                            G.u();
                        } else if (H != null && main.a.H.a) {
                            if (main.a.b(main.a.H.b, 0, main.a.H.d, main.a.H.e)) {
                                H.u();
                            }
                        }
                        if (main.a.b(main.a.G.b + main.a.G.d, 0, A - (main.a.G.d << 1), main.a.G.e) && m && main.a.G.az) {
                            G.A();
                        }
                    }
                    if (!d) {
                        E.b();
                    }
                    if (!main.a.G.a && g.n == null) {
                        E.d();
                    }
                    if (co.m().aR == null || E != cw.c) break block146;
                    int n3 = co.m().aR.c;
                    int n4 = co.m().aR.a;
                    an.j = false;
                    an.k = 0;
                    an.c = 0;
                    an.i = true;
                    an.m = true;
                    if (main.a.F.a && n3 > 0) {
                        an.i = false;
                    }
                    switch (n3) {
                        case 0: {
                            if (g.m != null || co.m().T == 14) {
                                an.a = A / 2;
                                an.b = B - 15;
                            } else {
                                if (n4 == 0 && dx.u.size() != 0) {
                                    an.a = ((cg)dx.u.elementAt((int)0)).a - 100;
                                    an.b = ((cg)dx.u.elementAt((int)0)).b + 40;
                                    an.j = true;
                                }
                                if (n4 == 1) {
                                    an.a(0);
                                }
                                if (n4 == 2) {
                                    an.a();
                                }
                                if (n4 == 3) {
                                    if (!main.a.G.a) {
                                        an.a();
                                    } else if (main.a.G.B == 0) {
                                        if (main.a.G.ai == null) {
                                            an.a = main.a.G.ae + main.a.G.ag / 2;
                                            an.b = main.a.G.af + 20;
                                        } else if (main.a.F.e != 0) {
                                            an.a = main.a.G.ae + 25;
                                            an.b = main.a.G.af + 60;
                                        }
                                    } else if (main.a.G.B == 1) {
                                        an.a = main.a.G.C + 10;
                                        an.b = 65;
                                    }
                                }
                                if (n4 == 4) {
                                    if (main.a.G.a) {
                                        an.a = main.a.G.aa.j + 5;
                                        an.b = main.a.G.aa.k + 5;
                                    } else if (main.a.F.a) {
                                        an.a = A / 2;
                                        an.b = B - 20;
                                    } else {
                                        an.a();
                                    }
                                }
                                if (n4 == 5) {
                                    an.a();
                                }
                            }
                            break block144;
                        }
                        case 1: {
                            if (g.m != null || co.m().T == 14) {
                                an.a = A / 2;
                                an.b = B - 15;
                            } else {
                                if (n4 == 0) {
                                    if (dx.d()) {
                                        an.a(0);
                                    } else {
                                        an.b();
                                    }
                                }
                                if (n4 == 1) {
                                    if (!dx.d()) {
                                        an.a(1);
                                    } else {
                                        an.a();
                                    }
                                }
                            }
                            break block144;
                        }
                        case 2: {
                            if (g.m != null || co.m().T == 14) {
                                an.a = A / 2;
                                an.b = B - 15;
                            } else {
                                if (n4 == 0) {
                                    if (!dx.d()) {
                                        an.f = true;
                                    }
                                    if (!main.a.G.a) {
                                        if (!an.f) {
                                            an.a = cw.l().bc.j;
                                            an.b = cw.l().bc.k + 13;
                                            an.k = 1;
                                        } else {
                                            if (cw.z() == dx.l) {
                                                if (!an.c()) {
                                                    an.b();
                                                }
                                            } else {
                                                an.a(0);
                                            }
                                            if (an.f) {
                                                an.g = true;
                                            }
                                        }
                                    } else if (!an.f) {
                                        if (main.a.G.B == 0) {
                                            n3 = B > 300 ? 15 : 10;
                                            an.a = main.a.G.ae + main.a.G.ag / 2;
                                            an.b = main.a.G.af + main.a.G.ah - n3;
                                        } else {
                                            an.a = main.a.G.C + 10;
                                            an.b = 65;
                                        }
                                    } else if (!an.g) {
                                        an.a = main.a.G.aa.j + 5;
                                        an.b = main.a.G.aa.k + 5;
                                    } else {
                                        an.i = false;
                                    }
                                    if (co.m().af <= 0L) {
                                        an.a = cw.bK + 5;
                                        an.b = cw.bL + 13;
                                        an.j = false;
                                    }
                                }
                                if (n4 == 1) {
                                    break;
                                }
                            }
                            break block144;
                        }
                        case 3: {
                            if (g.m != null || co.m().T == 14) {
                                an.a = A / 2;
                                an.b = B - 15;
                            } else if (n4 == 0) {
                                if (!main.a.G.a) {
                                    if (!an.h) {
                                        an.a = cw.l().bc.j;
                                        an.b = cw.l().bc.k + 13;
                                        an.k = 1;
                                    } else {
                                        if (cw.z() == dx.l) {
                                            if (!an.c()) {
                                                an.b();
                                            }
                                        } else {
                                            an.a(0);
                                        }
                                        if (an.f) {
                                            an.g = true;
                                        }
                                    }
                                } else if (!an.h) {
                                    an.a = main.a.G.ae + 10 + 108 - 18;
                                    an.b = 65;
                                } else if (!an.g) {
                                    an.a = main.a.G.aa.j + 5;
                                    an.b = main.a.G.aa.k + 5;
                                } else {
                                    an.i = false;
                                }
                                if (co.m().af <= 0L) {
                                    an.a = cw.bK + 5;
                                    an.b = cw.bL + 13;
                                    an.j = false;
                                }
                            } else {
                                an.i = false;
                                an.m = false;
                            }
                            break block144;
                        }
                        default: {
                            if (co.m().aR.c == 9 && co.m().aR.a == 2) {
                                n3 = 0;
                                while (n3 < bo.a.size()) {
                                    bo bo2 = (bo)bo.a.elementAt(n3);
                                    if (bo2.e <= 24) {
                                        an.a = bo2.d + bo2.b / 2;
                                        an.b = bo2.e + 30;
                                        an.j = true;
                                        an.i = false;
                                        an.m = true;
                                        break block144;
                                    }
                                    ++n3;
                                }
                            }
                            an.i = false;
                            an.m = false;
                            break block144;
                        }
                    }
                }
                an.i = false;
                an.m = false;
            }
            int n5 = n2 = an.k == 0 ? 2 : -2;
            if (!an.e) {
                an.l = false;
                if (++an.d == 50) {
                    an.d = 0;
                    an.e = true;
                }
            } else {
                ++an.d;
                if (an.c == 0) {
                    if (an.d == 2) {
                        an.a += n2 * 2;
                        an.b -= 4;
                        an.l = true;
                    }
                    if (an.d == 4) {
                        an.a -= n2 * 2;
                        an.b += 4;
                        an.e = false;
                        an.l = false;
                        an.d = 0;
                    }
                    if (an.d > 4) {
                        an.e = false;
                    }
                }
                if (an.c == 1) {
                    if (an.d == 2) {
                        if (e) {
                            cw.a(ch.cL, an.a, an.b + 10, 0, 20, 7);
                        }
                        an.l = true;
                        an.a += n2 * 2;
                        an.b -= 4;
                    }
                    if (an.d == 4) {
                        an.l = false;
                        an.a -= n2;
                        an.b += 2;
                    }
                    if (an.d == 6) {
                        an.l = true;
                        an.a += n2;
                        an.b -= 2;
                    }
                    if (an.d == 8) {
                        an.l = false;
                        an.a -= n2;
                        an.b += 2;
                    }
                    if (an.d == 10) {
                        an.a -= n2;
                        an.b += 2;
                        an.e = false;
                        an.d = 0;
                    }
                }
            }
            es.a();
            es.v();
        }
        System.currentTimeMillis();
        da.b();
        if (this.bo) {
            this.bo = false;
            main.a.e();
            String string = bp;
            int n6 = bq;
            Object object = br;
            bp = null;
            bq = 0;
            br = null;
            if (string != null) {
                main.a.a(string, n6, object);
            }
        }
        if (E != null && E instanceof cw) {
            int n7;
            int n8 = n7 = es.l > 0 ? 1 : 2;
            if ((be += aD * n7) - dl.v.getWidth() <= 60) {
                aD = 0;
                ++this.aE;
                if (this.aE > 150) {
                    this.aE = 0;
                    bd = null;
                }
            }
        }
        if (E != null && E.equals(cw.l())) {
            if (cw.aO != null) {
                cw.aO.a();
            }
            if (cw.aP != null) {
                cw.aP.a();
            }
        }
        o = false;
    }

    public static void e() {
        try {
            co.cd = false;
            co.cb = false;
            es.a();
            es.C();
            en.c = false;
            dx.p = 0;
            dx.q = 0;
            co.o();
            cw.m();
            cw.h();
            da.c();
            dc dc2 = cw.aO;
            dc2.b.a();
            dc2 = cw.aP;
            dc2.b.a();
            cw.aP.i = null;
            g.m = null;
            ci.b = false;
            cw.a(-1, -1);
            cw.bI.removeAllElements();
            cw.j = 100;
            main.a.G.B = 0;
            main.a.G.ak = e ? -1 : 0;
            G.a();
            H = null;
            cw.bG = true;
            c.l.removeAllElements();
            cw.B.removeAllElements();
            cw.C.removeAllElements();
            cw.D.removeAllElements();
            dx.w.removeAllElements();
            f.a.removeAllElements();
            h.a.removeAllElements();
            i.m.removeAllElements();
            main.a.F.a = false;
            main.a.G.a = false;
            main.a.G.k.removeAllElements();
            if (main.a.G.j != null) {
                main.a.G.j.k = false;
            }
            if (eh.b == 1) {
                er.d();
            }
            eb.a().f();
            eb.b().f();
        }
        catch (Exception exception) {}
        ds.C = true;
        ds.n = 0;
        ds.A = -1;
        ds.B = true;
        main.a.f();
        if (ds.p == -1) {
            ap.a();
            return;
        }
        if (ao == null) {
            ao = new ds();
        }
        ao.a();
    }

    public static void f() {
        K = null;
        da.c();
        if (F != null) {
            main.a.F.a = false;
        }
        if (G != null) {
            main.a.G.a = false;
            if (main.a.G.o != null) {
                main.a.G.o.b = false;
            }
        }
        if (H != null) {
            main.a.H.a = false;
            if (main.a.H.o != null) {
                main.a.H.o.b = false;
            }
        }
        if (L != null) {
            main.a.L.d = false;
        }
        if (cw.c != null) {
            cw.c.cd = null;
        }
        g.a();
        an.e = false;
        bo.a.removeAllElements();
        if (ay != null) {
            ay.removeAllElements();
        }
    }

    public static void g() {
    }

    public static void h() {
    }

    private static void a(eh eh2, int n2, int n3, int n4, int n5, int n6, int n7) {
        eh2.a(n2);
        n2 = cw.k;
        if (n2 > B) {
            n2 = B;
        }
        eh2.d(0, n4 - (n7 != 0 ? n2 >> n7 : 0), n5, n6 + (n7 != 0 ? n2 >> n7 : 0));
    }

    private static void a(eh eh2, int n2, int n3, int n4, int n5) {
        block24: {
            try {
                int n6;
                int n7;
                int n8 = n2 - 1;
                if (n8 == N.length - 1 && (cw.l().bn || cw.l().ce)) {
                    eh2.a(cw.l().bq);
                    eh2.d(0, 0, A, B);
                    if (af == 2 || af == 4 || af == 7) {
                        main.a.d(eh2);
                        main.a.e(eh2);
                    }
                    if (cw.l().ce && !a) {
                        m.a(eh2);
                    }
                    return;
                }
                if (N == null || N[n8] == null) break block24;
                if (aN[n8] != 0) {
                    int n9 = n8;
                    aN[n9] = aN[n9] + aO[n8];
                }
                if ((n7 = cw.k) > B) {
                    n7 = B;
                }
                if (aM[n8] != 0) {
                    if (P[n8] > 0) {
                        n6 = -((cw.j + aN[n8] >> aM[n8]) % P[n8]);
                        while (n6 < cw.d) {
                            eh2.a(N[n8], n6, aR[n8] - (n3 > 0 ? n7 >> n3 : 0), 0);
                            n6 += P[n8];
                        }
                    }
                } else if (P[n8] > 0) {
                    n6 = 0;
                    while (n6 < cw.d) {
                        eh2.a(N[n8], n6, aR[n8] - (n3 > 0 ? n7 >> n3 : 0), 0);
                        n6 += P[n8];
                    }
                }
                if (n4 != -1) {
                    if (n8 == aT - 1) {
                        main.a.a(eh2, n4, 0, -(n7 >> n3), cw.d, aR[n8], n3);
                    } else {
                        main.a.a(eh2, n4, 0, aR[n8 - 1] + Q[n8 - 1], cw.d, aR[n8] - (aR[n8 - 1] + Q[n8 - 1]), n3);
                    }
                }
                if (n5 != -1) {
                    if (n8 == 0) {
                        main.a.a(eh2, n5, 0, aR[n8] + Q[n8], cw.d, cw.e - (aR[n8] + Q[n8]), n3);
                    } else {
                        main.a.a(eh2, n5, 0, aR[n8] + Q[n8], cw.d, aR[n8 - 1] - (aR[n8] + Q[n8]) + 80, n3);
                    }
                }
                if (E == cw.c) {
                    if (n2 == 1 && af == 11 && dx.p == 0) {
                        eh2.a(aG, -(cw.j >> aM[0]) + 400, aR[0] + 30 - (n7 >> 2), dv.c);
                    }
                    if (n2 == 1 && af == 13) {
                        eh2.a(N[1], -(cw.j >> aM[0]) + dx.a * 24 / 4, aR[0] - (n7 >> 3) + 30, 0);
                        eh2.a(N[1], 0, 0, P[1], Q[1], 2, -(cw.j >> aM[0]) + dx.a * 24 / 4 + P[1], aR[0] - (n7 >> 3) + 30, 0);
                    }
                    if (n2 == 3 && dx.l == 1) {
                        n6 = 0;
                        while (n6 < dx.d / eh.b(aV)) {
                            eh2.a(aV, -(cw.j >> aM[2]) + 300, n6 * eh.b(aV) - (n7 >> 3), 0);
                            ++n6;
                        }
                    }
                }
                n6 = -(cw.j + aN[n8] >> aM[n8]);
                h.a(eh2, n6, aR[n8] + Q[n8] - (n7 >> n3), n8);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private static void d(eh eh2) {
        if (aF != null) {
            eh2.a(aF, aI, aJ, 0);
        }
        if (ae) {
            if (w % 200 == 0) {
                aP = true;
            }
            if (aP) {
                if (++aQ == 10) {
                    aQ = 0;
                    aP = false;
                }
                if (aQ % 2 == 0) {
                    eh2.a(0xFFFFFF);
                    eh2.d(0, 0, A, B);
                }
            }
        }
    }

    private static void e(eh eh2) {
        if (aG != null) {
            eh2.a(aG, aK, aL, 0);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c(eh eh2) {
        if (!aX) {
            eh2.a(0);
            eh2.d(0, 0, A, B);
        }
        if (co.cd) {
            return;
        }
        int n2 = cw.d;
        eh2.a(-eh2.a(), -eh2.b());
        eh2.a(0);
        eh2.d(0, 0, A, B);
        try {
            if (aa && (!a || E == ao || E == I)) {
                if (E == cw.l()) {
                    if (dx.l != 172 && (dx.l == 137 || dx.l == 115 || dx.l == 117 || dx.l == 118 || dx.l == 120 || dx.j)) {
                        eh2.a(0);
                        eh2.d(0, 0, A, B);
                        return;
                    }
                    if (dx.l == 138) {
                        eh2.a(0x676767);
                        eh2.d(0, 0, A, B);
                        return;
                    }
                }
                if (af == 0) {
                    main.a.a(eh2, 4, 6, ah[3], aS[3]);
                    main.a.a(eh2, 3, 4, -1, aS[2]);
                    main.a.a(eh2, 2, 3, -1, aS[1]);
                    main.a.a(eh2, 1, 2, -1, aS[0]);
                    return;
                }
                if (af == 1) {
                    main.a.a(eh2, 4, 6, -1, -1);
                    main.a.a(eh2, 3, 3, -1, -1);
                    main.a.a(eh2, ah[2], 0, -(cw.k >> 5), n2, aR[2], 5);
                    main.a.a(eh2, aS[2], 0, aR[2] + Q[2] - (cw.k >> 3), n2, 70, 3);
                    main.a.a(eh2, 2, 2, -1, -1);
                    main.a.a(eh2, 1, 1, -1, aS[0]);
                    return;
                }
                if (af == 2) {
                    main.a.a(eh2, 5, 10, ah[4], aS[4]);
                    main.a.a(eh2, 4, 8, -1, ah[2]);
                    main.a.a(eh2, 3, 5, -1, aS[2]);
                    main.a.a(eh2, 2, 2, -1, aS[1]);
                    main.a.a(eh2, 1, 1, -1, aS[0]);
                    return;
                }
                if (af == 3) {
                    int n3 = cw.k - (325 - cw.g);
                    eh2.a(0, -n3);
                    main.a.a(eh2, cw.l().bn || cw.l().ce ? cw.l().bq : ah[2], 0, n3 - (cw.k >> 3), n2, aR[2] - n3 + (cw.k >> 3) + 100, 2);
                    main.a.a(eh2, 3, 2, -1, aS[2]);
                    main.a.a(eh2, 2, 0, -1, -1);
                    main.a.a(eh2, 1, 0, -1, aS[0]);
                    eh2.a(0, -eh2.b());
                    return;
                }
                if (af == 4) {
                    main.a.a(eh2, 4, 7, ah[3], -1);
                    main.a.a(eh2, 3, 3, -1, eh.b > 1 ? aS[2] : ah[1]);
                    main.a.a(eh2, 2, 2, ah[1], aS[1]);
                    main.a.a(eh2, 1, 1, -1, aS[0]);
                    return;
                }
                if (af == 5) {
                    main.a.a(eh2, 4, 15, ah[3], -1);
                    main.a.d(eh2);
                    eh2.a(100, 10);
                    main.a.d(eh2);
                    eh2.a(-100, -10);
                    main.a.e(eh2);
                    main.a.a(eh2, 3, 10, -1, -1);
                    main.a.a(eh2, 2, 6, -1, -1);
                    main.a.a(eh2, 1, 4, -1, -1);
                    eh2.a(0, 27);
                    main.a.a(eh2, 1, 2, -1, -1);
                    eh2.a(0, 20);
                    main.a.a(eh2, 1, 2, -1, aS[0]);
                    eh2.a(-eh2.a(), -eh2.b());
                    return;
                }
                if (af == 6) {
                    main.a.a(eh2, 5, 10, ah[4], aS[4]);
                    main.a.d(eh2);
                    main.a.e(eh2);
                    eh2.a(60, 40);
                    main.a.e(eh2);
                    eh2.a(-60, -40);
                    main.a.a(eh2, 4, 7, -1, aS[3]);
                    f.e(eh2);
                    main.a.a(eh2, 3, 4, -1, -1);
                    main.a.a(eh2, 2, 3, -1, aS[1]);
                    main.a.a(eh2, 1, 2, -1, aS[0]);
                    return;
                }
                if (af == 7) {
                    main.a.a(eh2, 4, 6, ah[3], aS[3]);
                    main.a.a(eh2, 3, 5, -1, -1);
                    main.a.a(eh2, 2, 4, -1, -1);
                    main.a.a(eh2, 1, 3, -1, aS[0]);
                    return;
                }
                if (af == 8) {
                    main.a.a(eh2, 4, 8, ah[3], aS[3]);
                    main.a.d(eh2);
                    main.a.e(eh2);
                    main.a.a(eh2, 3, 4, -1, aS[2]);
                    main.a.a(eh2, 2, 2, -1, aS[1]);
                    if ((dx.l >= 92 && dx.l <= 96 || dx.l == 51 || dx.l == 52) && E != I) return;
                    main.a.a(eh2, 1, 1, -1, aS[0]);
                    return;
                }
                if (af == 9) {
                    main.a.a(eh2, 4, 8, ah[3], aS[3]);
                    main.a.d(eh2);
                    main.a.e(eh2);
                    eh2.a(-80, 20);
                    main.a.e(eh2);
                    eh2.a(80, -20);
                    f.e(eh2);
                    main.a.a(eh2, 3, 5, -1, -1);
                    main.a.a(eh2, 2, 3, -1, -1);
                    main.a.a(eh2, 1, 2, -1, aS[0]);
                    return;
                }
                if (af == 10) {
                    int n4 = cw.k - (380 - cw.g);
                    eh2.a(0, -n4);
                    main.a.a(eh2, cw.l().bn ? cw.l().bq : ah[1], 0, n4 - (cw.k >> 2), n2, aR[1] - n4 + (cw.k >> 2) + 100, 2);
                    main.a.a(eh2, 2, 2, -1, aS[1]);
                    main.a.d(eh2);
                    main.a.e(eh2);
                    main.a.a(eh2, 1, 0, -1, -1);
                    eh2.a(0, -eh2.b());
                    return;
                }
                if (af == 11) {
                    main.a.a(eh2, 3, 6, ah[2], aS[2]);
                    main.a.d(eh2);
                    main.a.a(eh2, 2, 3, -1, aS[1]);
                    main.a.a(eh2, 1, 2, -1, aS[0]);
                    return;
                }
                if (af == 12) {
                    eh2.a(9161471);
                    eh2.d(0, 0, A, B);
                    main.a.a(eh2, 3, 4, -1, 0xDBFFFF);
                    main.a.a(eh2, 2, 3, -1, 0xDBFFFF);
                    main.a.a(eh2, 1, 2, -1, 0xDBFFFF);
                    return;
                }
                if (af == 13) {
                    eh2.a(0xE8F8F8);
                    eh2.d(0, 0, A, B);
                    main.a.a(eh2, 1, 5, -1, 0xE8F8F8);
                    return;
                }
                if (af == 15) {
                    eh2.a(0x282848);
                    eh2.d(0, 0, A, B);
                    main.a.a(eh2, 2, 3, -1, aS[1]);
                    main.a.a(eh2, 1, 2, -1, aS[0]);
                    return;
                }
                if (af == 16) {
                    main.a.a(eh2, 4, 6, ah[3], aS[3]);
                    int n5 = 0;
                    while (n5 < aH.length) {
                        eh2.a(aH[n5], ac[n5], ad[n5], 33);
                        ++n5;
                    }
                    main.a.a(eh2, 3, 4, -1, aS[2]);
                    main.a.a(eh2, 2, 3, -1, aS[1]);
                    main.a.a(eh2, 1, 2, -1, aS[0]);
                    return;
                }
                if (af == 19) {
                    main.a.a(eh2, 5, 10, ah[4], aS[4]);
                    main.a.a(eh2, 4, 8, -1, ah[2]);
                    main.a.a(eh2, 3, 5, -1, aS[2]);
                    main.a.a(eh2, 2, 2, -1, aS[1]);
                    main.a.a(eh2, 1, 1, -1, aS[0]);
                    return;
                }
                main.a.a(eh2, aS[3], 0, aR[3] + Q[3], cw.d, aR[2] + Q[2], 6);
                main.a.a(eh2, 4, 6, ah[3], aS[3]);
                main.a.d(eh2);
                main.a.a(eh2, 3, 4, -1, aS[2]);
                main.a.a(eh2, 2, 3, -1, aS[1]);
                main.a.a(eh2, 1, 2, -1, aS[0]);
                return;
            }
            eh2.a(2315859);
            eh2.d(0, 0, A, B);
            if (aW == null) return;
            int n6 = -((cw.j >> 2) % eh.a(aW));
            while (n6 < cw.d) {
                eh2.a(aW, n6, (cw.k >> 3) + B / 2 - 50, 0);
                n6 += eh.a(aW);
            }
            eh2.a(5084791);
            eh2.d(0, (cw.k >> 3) + B / 2 - 50 + eh.b(aW), n2, B);
            return;
        }
        catch (Exception exception) {
            eh2.a(0);
            eh2.d(0, 0, A, B);
        }
    }

    public static void i() {
    }

    /*
     * Unable to fully structure code
     */
    private static void b(int var0) {
        try {
            var1_1 = cw.g;
            switch (var0) {
                case 0: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 70;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] + 20;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] + 30;
                    main.a.aR[3] = main.a.aR[2] - main.a.Q[3] + 50;
                    return;
                }
                case 1: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 120;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] + 40;
                    main.a.aR[2] = main.a.aR[1] - 90;
                    main.a.aR[3] = main.a.aR[2] - 25;
                    return;
                }
                case 2: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 150;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] - 60;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] - 40;
                    main.a.aR[3] = main.a.aR[2] - main.a.Q[3] - 10;
                    main.a.aR[4] = main.a.aR[3] - main.a.Q[4];
                    return;
                }
                case 3: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 10;
                    main.a.aR[1] = main.a.aR[0] + 80;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] - 10;
                    return;
                }
                case 4: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 130;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1];
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] - 20;
                    main.a.aR[3] = main.a.aR[1] - main.a.Q[2] - 80;
                    return;
                }
                case 5: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 40;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] + 10;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] + 15;
                    main.a.aR[3] = main.a.aR[2] - main.a.Q[3] + 50;
                    return;
                }
                case 6: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 100;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] - 30;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] + 10;
                    main.a.aR[3] = main.a.aR[2] - main.a.Q[3] + 15;
                    main.a.aR[4] = main.a.aR[3] - main.a.Q[4] + 15;
                    return;
                }
                case 7: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 20;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] + 15;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] + 20;
                    main.a.aR[3] = main.a.aR[1] - main.a.Q[2] - 10;
                    return;
                }
                case 8: {
                    main.a.aR[0] = var1_1 - 103 + 150;
                    if (dx.l == 103) {
                        main.a.aR[0] = main.a.aR[0] - 100;
                    }
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] - 10;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] + 40;
                    main.a.aR[3] = main.a.aR[2] - main.a.Q[3] + 10;
                    return;
                }
                case 9: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 100;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] + 22;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] + 50;
                    main.a.aR[3] = main.a.aR[2] - main.a.Q[3];
                    return;
                }
                case 10: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] - 45;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] - 10;
                    return;
                }
                case 11: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 60;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] + 5;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] - 15;
                    return;
                }
                case 12: {
                    main.a.aR[0] = var1_1 + 40;
                    main.a.aR[1] = main.a.aR[0] - 40;
                    main.a.aR[2] = main.a.aR[1] - 40;
                    return;
                }
                case 13: {
                    main.a.aR[0] = var1_1 - 80;
                    main.a.aR[1] = main.a.aR[0];
                    return;
                }
                case 15: {
                    main.a.aR[0] = var1_1 - 20;
                    main.a.aR[1] = main.a.aR[0] - 80;
                    return;
                }
                case 16: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 75;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] + 50;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] + 50;
                    main.a.aR[3] = main.a.aR[2] - main.a.Q[3] + 90;
                    return;
                }
                case 19: {
                    main.a.aR[0] = var1_1 - main.a.Q[0] + 150;
                    main.a.aR[1] = main.a.aR[0] - main.a.Q[1] - 60;
                    main.a.aR[2] = main.a.aR[1] - main.a.Q[2] - 40;
                    main.a.aR[3] = main.a.aR[2] - main.a.Q[3] - 10;
                    main.a.aR[4] = main.a.aR[3] - main.a.Q[4];
                    return;
                }
            }
            main.a.aR[0] = var1_1 - main.a.Q[0] + 75;
            main.a.aR[1] = main.a.aR[0] - main.a.Q[1] + 50;
            main.a.aR[2] = main.a.aR[1] - main.a.Q[2] + 50;
            main.a.aR[3] = main.a.aR[2] - main.a.Q[3] + 90;
            return;
        }
        catch (Exception v0) {
            var0 = 0;
            ** while (var0 < main.a.aR.length)
        }
lbl-1000:
        // 1 sources

        {
            main.a.aR[var0] = 1;
            ++var0;
            continue;
        }
lbl114:
        // 1 sources

    }

    public static void a(int n2) {
        try {
            Object object;
            Object object2;
            aX = true;
            f.f = af == 12 ? dx.d - 100 : dx.d - 160;
            dq.c("load bg id= " + n2 + "map ID= " + dx.l);
            f.a();
            main.a.c(n2);
            if (dx.m == n2 && dx.q == dx.p && aa && N != null || n2 == -1) {
                return;
            }
            ag = 12;
            dx.m = (byte)n2;
            dx.q = (byte)dx.p;
            aM = new int[]{1, 2, 3, 7, 8};
            aN = new int[5];
            aO = new int[5];
            af = n2;
            ae = false;
            cw.bd = cw.k;
            N = null;
            aF = null;
            aV = null;
            f.a.removeAllElements();
            cw.bd = -1;
            switch (af) {
                case 0: {
                    aV = ej.a("/bg/caycot.png");
                    aM = new int[]{1, 3, 5, 7};
                    aT = 4;
                    if (dx.p != 2) break;
                    ag = 8;
                    break;
                }
                case 1: {
                    ag = 7;
                    aT = 4;
                    break;
                }
                case 2: {
                    int[] nArray = new int[5];
                    nArray[2] = 1;
                    aN = nArray;
                    int[] nArray2 = new int[5];
                    nArray2[2] = 2;
                    aO = nArray2;
                    aT = 5;
                    break;
                }
                case 3: {
                    aT = 3;
                    break;
                }
                case 4: {
                    f.a(3);
                    int[] nArray = new int[5];
                    nArray[1] = 1;
                    aN = nArray;
                    int[] nArray3 = new int[5];
                    nArray3[1] = 1;
                    aO = nArray3;
                    aT = 4;
                    break;
                }
                case 5: {
                    aT = 4;
                    break;
                }
                case 6: {
                    int[] nArray = new int[5];
                    nArray[0] = 1;
                    aN = nArray;
                    int[] nArray4 = new int[5];
                    nArray4[0] = 2;
                    aO = nArray4;
                    aT = 5;
                    break;
                }
                case 7: {
                    aT = 4;
                    break;
                }
                case 8: {
                    ag = 8;
                    aT = 4;
                    break;
                }
                case 9: {
                    f.a(9);
                    aT = 4;
                    break;
                }
                case 10: {
                    aT = 2;
                    break;
                }
                case 11: {
                    ag = 7;
                    main.a.aM[2] = 0;
                    aT = 3;
                    break;
                }
                case 12: {
                    int[] nArray = new int[5];
                    nArray[0] = 1;
                    nArray[1] = 1;
                    aN = nArray;
                    int[] nArray5 = new int[5];
                    nArray5[0] = 2;
                    nArray5[1] = 1;
                    aO = nArray5;
                    aT = 3;
                    break;
                }
                case 13: {
                    aT = 2;
                    break;
                }
                case 15: {
                    dq.c("HELL");
                    aT = 2;
                    break;
                }
                case 16: {
                    aM = new int[]{1, 3, 5, 7};
                    aT = 4;
                    break;
                }
                case 19: {
                    int[] nArray = new int[5];
                    nArray[1] = 2;
                    nArray[2] = 1;
                    aN = nArray;
                    int[] nArray6 = new int[5];
                    nArray6[1] = 2;
                    nArray6[2] = 1;
                    aO = nArray6;
                    aT = 5;
                    break;
                }
                default: {
                    aM = new int[]{1, 3, 5, 7};
                    aT = 4;
                }
            }
            if (n2 <= 16) {
                O = dv.g[af];
            } else {
                try {
                    String string = "/bg/b" + af + 3 + ".png";
                    if (dx.p != 0) {
                        string = "/bg/b" + af + 3 + "-" + dx.p + ".png";
                    }
                    object2 = new int[1];
                    object = ej.a(string);
                    object.getRGB(object2, 0, 1, eh.c(object) / 2, 0, 1, 1);
                    O = object2[0];
                }
                catch (Exception exception) {
                    O = dv.g[dv.g.length - 1];
                }
            }
            ah = new int[dv.g.length];
            aS = new int[dv.g.length];
            int n3 = 0;
            while (n3 < dv.g.length) {
                main.a.ah[n3] = dv.g[n3];
                main.a.aS[n3] = dv.g[n3];
                ++n3;
            }
            if (a) {
                aW = ej.a("/bg/b63.png");
                return;
            }
            N = new Image[aT];
            P = new int[aT];
            Q = new int[aT];
            aS = new int[aT];
            ah = new int[aT];
            if (dx.p == 100) {
                main.a.N[0] = ej.a("/bg/b100.png");
                main.a.N[1] = ej.a("/bg/b100.png");
                main.a.N[2] = ej.a("/bg/b82-1.png");
                main.a.N[3] = ej.a("/bg/b93.png");
                n3 = 0;
                while (n3 < aT) {
                    if (N[n3] != null) {
                        object2 = new int[1];
                        N[n3].getRGB(object2, 0, 1, eh.c(N[n3]) / 2, 0, 1, 1);
                        main.a.ah[n3] = object2[0];
                        object2 = new int[1];
                        N[n3].getRGB(object2, 0, 1, eh.c(N[n3]) / 2, eh.d(N[n3]) - 1, 1, 1);
                        main.a.aS[n3] = object2[0];
                        main.a.P[n3] = eh.a(N[n3]);
                        main.a.Q[n3] = eh.b(N[n3]);
                    } else if (aT > 1) {
                        main.a.N[n3] = ej.a("/bg/b" + af + "0.png");
                        main.a.P[n3] = eh.a(N[n3]);
                        main.a.Q[n3] = eh.b(N[n3]);
                    }
                    ++n3;
                }
            } else {
                n3 = 0;
                while (n3 < aT) {
                    object2 = "/bg/b" + af + n3 + ".png";
                    if (dx.p != 0) {
                        object2 = "/bg/b" + af + n3 + "-" + dx.p + ".png";
                    }
                    main.a.N[n3] = ej.a((String)object2);
                    if (N[n3] != null) {
                        object = new int[1];
                        N[n3].getRGB((int[])object, 0, 1, eh.c(N[n3]) / 2, 0, 1, 1);
                        main.a.ah[n3] = (int)object[0];
                        object = new int[1];
                        N[n3].getRGB((int[])object, 0, 1, eh.c(N[n3]) / 2, eh.d(N[n3]) - 1, 1, 1);
                        main.a.aS[n3] = (int)object[0];
                        main.a.P[n3] = eh.a(N[n3]);
                        main.a.Q[n3] = eh.b(N[n3]);
                    } else if (aT > 1) {
                        main.a.N[n3] = ej.a("/bg/b" + af + "0.png");
                        if (N[n3] != null) {
                            main.a.P[n3] = eh.a(N[n3]);
                            main.a.Q[n3] = eh.b(N[n3]);
                        }
                    }
                    ++n3;
                }
            }
            main.a.b(af);
            dq.c("5");
            ac = new int[]{cw.d / 2 - 40, cw.d / 2 + 40, cw.d / 2 - 100, cw.d / 2 - 80, cw.d / 2 - 120};
            ad = new int[]{130, 100, 150, 140, 80};
            aH = null;
            if (af != 0) {
                if (af == 2) {
                    aF = ej.a("/bg/sun0.png");
                    aI = cw.d / 2 + 50;
                    aJ = aR[4] - 40;
                    dx.h = ej.a("/tWater/wts");
                } else if (af == 19) {
                    dx.h = ej.a("/tWater/water_flow_32");
                } else if (af == 4) {
                    aF = ej.a("/bg/sun2.png");
                    aI = cw.d / 2 + 30;
                    aJ = aR[3];
                } else if (af == 7) {
                    aF = ej.a("/bg/sun3" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aG = ej.a("/bg/sun4" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aI = cw.d - cw.d / 3;
                    aJ = aR[3] - 80;
                    aK = aI - 100;
                    aL = aR[3] - 30;
                } else if (af == 6) {
                    aF = ej.a("/bg/sun5" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aG = ej.a("/bg/sun6" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aI = cw.d - cw.d / 3;
                    aJ = aR[4];
                    aK = aI - 100;
                    aL = aR[4] + 20;
                } else if (n2 == 5) {
                    aF = ej.a("/bg/sun8" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aG = ej.a("/bg/sun7" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aI = cw.d / 2 - 50;
                    aJ = aR[3] + 20;
                    aK = cw.d / 2 + 20;
                    aL = aR[3] - 30;
                } else if (af == 8 && dx.l < 90) {
                    aF = ej.a("/bg/sun9" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aG = ej.a("/bg/sun10" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aI = cw.d / 2 - 30;
                    aJ = aR[3] + 60;
                    aK = cw.d / 2 + 20;
                    aL = aR[3] + 10;
                } else if (n2 == 9) {
                    aF = ej.a("/bg/sun11" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aG = ej.a("/bg/sun12" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aI = cw.d - cw.d / 3;
                    aJ = aR[4] + 20;
                    aK = aI - 80;
                    aL = aR[4] + 40;
                } else if (n2 == 10) {
                    aF = ej.a("/bg/sun13" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aG = ej.a("/bg/sun14" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aI = cw.d - cw.d / 3;
                    aJ = aR[1] - 30;
                    aK = aI - 80;
                    aL = aR[1];
                } else if (n2 == 11) {
                    aF = ej.a("/bg/sun15" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aG = ej.a("/bg/b113" + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    aI = cw.d / 2 - 30;
                    aJ = aR[2] - 30;
                } else if (n2 == 12) {
                    ad = new int[]{200, 170, 220, 150, 250};
                } else if (n2 == 16) {
                    ac = new int[]{90, 170, 250, 320, 400, 450, 500};
                    ad = new int[]{aR[2] + 5, aR[2] - 20, aR[2] - 50, aR[2] - 30, aR[2] - 50, aR[2], aR[2] - 40};
                    aH = new Image[7];
                    n3 = 0;
                    while (n3 < aH.length) {
                        int n4 = 160;
                        if (n3 == 1 || n3 == 3) {
                            n4 = 161;
                        }
                        main.a.aH[n3] = ej.a("/bg/sun" + n4 + ".png");
                        ++n3;
                    }
                } else if (n2 == 19) {
                    int[] nArray = new int[5];
                    nArray[1] = 2;
                    nArray[2] = 1;
                    aN = nArray;
                    int[] nArray7 = new int[5];
                    nArray7[1] = 2;
                    nArray7[2] = 1;
                    aO = nArray7;
                    aT = 5;
                } else {
                    aF = null;
                    aG = null;
                    aF = ej.a("/bg/sun" + n2 + (dx.p == 0 ? "" : "-" + dx.p) + ".png");
                    if (ej.a("/tWater/water_flow_" + n2) != null) {
                        dx.h = ej.a("/tWater/water_flow_" + n2);
                    }
                    aI = cw.d - cw.d / 3;
                    aJ = aR[2] - 30;
                }
            }
            aa = false;
            if (!false) {
                aa = true;
                return;
            }
        }
        catch (Exception exception) {
            aX = false;
        }
    }

    private static void c(int n2) {
        int n3 = 0;
        while (n3 < aU.length) {
            int n4;
            if (n2 == aU[n3] && (n4 = dq.b(0, 2)) == 0) {
                f.a(0);
                return;
            }
            ++n3;
        }
    }

    public final void keyPressed(int n2) {
        aY = System.currentTimeMillis();
        if (n2 >= 48 && n2 <= 57 || n2 >= 65 && n2 <= 122 || n2 == 10 || n2 == 8 || n2 == 13 || n2 == 32 || n2 == 31) {
            ai = n2;
        }
        if (K != null) {
            K.a(n2);
            ai = 0;
            return;
        }
        E.a(n2);
        switch (n2) {
            case 48: {
                main.a.j[0] = true;
                main.a.i[0] = true;
                return;
            }
            case 49: {
                if (E == cr.a || E == cw.c && c && !el.b().b) {
                    main.a.j[1] = true;
                    main.a.i[1] = true;
                }
                return;
            }
            case 51: {
                if (E == cr.a || E == cw.c && c && !el.b().b) {
                    main.a.j[3] = true;
                    main.a.i[3] = true;
                }
                return;
            }
            case 55: {
                main.a.j[7] = true;
                main.a.i[7] = true;
                return;
            }
            case 57: {
                main.a.j[9] = true;
                main.a.i[9] = true;
                return;
            }
            case 42: {
                main.a.j[10] = true;
                main.a.i[10] = true;
                return;
            }
            case 35: {
                main.a.j[11] = true;
                main.a.i[11] = true;
                return;
            }
            case -21: 
            case -6: {
                main.a.j[12] = true;
                main.a.i[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.a.j[13] = true;
                main.a.i[13] = true;
                return;
            }
            case -5: 
            case 10: {
                if (E instanceof cw || E instanceof cr) {
                    co.m();
                }
                main.a.j[5] = true;
                main.a.i[5] = true;
                return;
            }
            case -38: 
            case -1: {
                if (E instanceof cw || E instanceof cr) {
                    co.m();
                }
                main.a.j[2] = true;
                main.a.i[2] = true;
                return;
            }
            case -39: 
            case -2: {
                if (E instanceof cw || E instanceof cr) {
                    co.m();
                }
                main.a.j[8] = true;
                main.a.i[8] = true;
                return;
            }
            case -3: {
                if (E instanceof cw || E instanceof cr) {
                    co.m();
                }
                main.a.j[4] = true;
                main.a.i[4] = true;
                return;
            }
            case -4: {
                if (E instanceof cw || E instanceof cr) {
                    co.m();
                }
                main.a.j[6] = true;
                main.a.i[6] = true;
                return;
            }
            case 50: {
                if (E == cr.a || E == cw.c && c && !el.b().b) {
                    main.a.j[2] = true;
                    main.a.i[2] = true;
                }
                return;
            }
            case 52: {
                if (E == cr.a || E == cw.c && c && !el.b().b) {
                    main.a.j[4] = true;
                    main.a.i[4] = true;
                }
                return;
            }
            case 54: {
                if (E == cr.a || E == cw.c && c && !el.b().b) {
                    main.a.j[6] = true;
                    main.a.i[6] = true;
                }
                return;
            }
            case 56: {
                if (E == cr.a || E == cw.c && c && !el.b().b) {
                    main.a.j[8] = true;
                    main.a.i[8] = true;
                }
                return;
            }
            case 53: {
                if (E != cr.a && (E != cw.c || !c || el.b().b)) break;
                main.a.j[5] = true;
                main.a.i[5] = true;
            }
        }
    }

    public final void keyReleased(int n2) {
        ai = 0;
        switch (n2) {
            case 48: {
                main.a.j[0] = false;
                main.a.at[0] = true;
                return;
            }
            case 49: {
                if (E == cw.c && c && !el.b().b) {
                    main.a.j[1] = false;
                    main.a.at[1] = true;
                }
                return;
            }
            case 51: {
                if (E == cw.c && c && !el.b().b) {
                    main.a.j[3] = false;
                    main.a.at[3] = true;
                }
                return;
            }
            case 55: {
                main.a.j[7] = false;
                main.a.at[7] = true;
                return;
            }
            case 57: {
                main.a.j[9] = false;
                main.a.at[9] = true;
                return;
            }
            case 42: {
                main.a.j[10] = false;
                main.a.at[10] = true;
                return;
            }
            case 35: {
                main.a.j[11] = false;
                main.a.at[11] = true;
                return;
            }
            case -21: 
            case -6: {
                main.a.j[12] = false;
                main.a.at[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.a.j[13] = false;
                main.a.at[13] = true;
                return;
            }
            case -5: 
            case 10: {
                main.a.j[5] = false;
                main.a.at[5] = true;
                return;
            }
            case -38: 
            case -1: {
                main.a.j[2] = false;
                return;
            }
            case -39: 
            case -2: {
                main.a.j[8] = false;
                return;
            }
            case -3: {
                main.a.j[4] = false;
                return;
            }
            case -4: {
                main.a.j[6] = false;
                return;
            }
            case 50: {
                if (E == cw.c && c && !el.b().b) {
                    main.a.j[2] = false;
                    main.a.at[2] = true;
                }
                return;
            }
            case 52: {
                if (E == cw.c && c && !el.b().b) {
                    main.a.j[4] = false;
                    main.a.at[4] = true;
                }
                return;
            }
            case 54: {
                if (E == cw.c && c && !el.b().b) {
                    main.a.j[6] = false;
                    main.a.at[6] = true;
                }
                return;
            }
            case 56: {
                if (E == cw.c && c && !el.b().b) {
                    main.a.j[8] = false;
                    main.a.at[8] = true;
                }
                return;
            }
            case 53: {
                if (E != cw.c || !c || el.b().b) break;
                main.a.j[5] = false;
                main.a.at[5] = true;
            }
        }
    }

    public final void a(int n2, int n3) {
        o = false;
        if (dq.g(n2 - t) >= 10 || dq.g(n3 - u) >= 10) {
            l = false;
            k = true;
            n = true;
        }
        p = n2;
        q = n3;
        if (++az > 3) {
            az = 0;
        }
        main.a.v[main.a.az] = new bq(n2, n3);
    }

    public final void b(int n2, int n3) {
        o = false;
        m = false;
        al = true;
        k = true;
        l = false;
        n = false;
        aY = System.currentTimeMillis();
        r = n2;
        s = n3;
        t = n2;
        u = n3;
        p = n2;
        q = n3;
    }

    public final void c(int n2, int n3) {
        if (!n) {
            o = true;
        }
        k = false;
        m = true;
        n = false;
        l = true;
        ew.cF = -1;
        p = n2;
        q = n3;
    }

    public static boolean a(int n2, int n3, int n4, int n5) {
        if (!k && !m) {
            return false;
        }
        return p >= n2 && p <= n2 + n4 && q >= n3 && q <= n3 + n5;
    }

    public static void j() {
        int n2 = 0;
        while (n2 < i.length) {
            main.a.i[n2] = false;
            ++n2;
        }
        m = false;
    }

    public static void k() {
        int n2 = 0;
        while (n2 < j.length) {
            main.a.j[n2] = false;
            ++n2;
        }
    }

    public final void paint(Graphics object) {
        this.aA.a = object;
        aC.removeAllElements();
        object = E;
        if (object != null) {
            try {
                ((ew)object).a(this.aA);
            }
            catch (NullPointerException nullPointerException) {
                long l2 = System.currentTimeMillis();
                if (l2 - ax >= 1000L) {
                    ax = l2;
                    System.err.println("[PAINT-NPE] screen=" + object.getClass().getName() + " tick=" + w + " map=" + dx.l);
                    if (object instanceof cw) {
                        ((cw)object).u();
                    }
                    nullPointerException.printStackTrace();
                }
                throw nullPointerException;
            }
        }
        this.aA.a(-this.aA.a(), -this.aA.b());
        this.aA.e(0, 0, A, B);
        if (main.a.G.a) {
            G.a(this.aA);
            if (H != null && main.a.H.a) {
                H.a(this.aA);
            }
            if (main.a.G.o != null && main.a.G.o.b) {
                main.a.G.o.a(this.aA);
            }
            if (H != null && main.a.H.o != null && main.a.H.o.b) {
                main.a.H.o.a(this.aA);
            }
        }
        if (cw.cc) {
            dq.a(this.aA);
        }
        da.a(this.aA);
        if (K != null) {
            K.a(this.aA);
        } else if (main.a.F.a) {
            main.a.a(this.aA);
            F.a(this.aA);
        }
        cw.aO.a(this.aA);
        cw.aP.a(this.aA);
        if (cw.l().cd != null) {
            cw.l().cd.a(this.aA);
        }
        if (g.m != null) {
            g.m.a(this.aA);
        }
        object = this.aA;
        if (g.n == null && !co.m().F && !co.m().E) {
            Object object2 = object;
            try {
                if (an.m && (an.a <= cw.j || an.a >= cw.j + cw.d || an.b <= cw.k || an.b >= cw.k + cw.e) && w % 10 >= 5 && g.m == null && g.n == null && !main.a.G.a && an.j) {
                    int n2 = an.a - co.m().N;
                    int n3 = an.b - co.m().O;
                    int n4 = 0;
                    int n5 = 0;
                    int n6 = 0;
                    if (n2 > 0 && n3 >= 0) {
                        if (dq.g(n2) >= dq.g(n3)) {
                            n4 = cw.d - 10;
                            n5 = cw.e / 2 + 30;
                            if (e) {
                                n5 = cw.e / 2 + 10;
                            }
                            n6 = 0;
                        } else {
                            n4 = cw.d / 2;
                            n5 = cw.e - 10;
                            n6 = 5;
                        }
                    } else if (n2 >= 0 && n3 < 0) {
                        if (dq.g(n2) >= dq.g(n3)) {
                            n4 = cw.d - 10;
                            n5 = cw.e / 2 + 30;
                            if (e) {
                                n5 = cw.e / 2 + 10;
                            }
                            n6 = 0;
                        } else {
                            n4 = cw.d / 2;
                            n5 = 10;
                            n6 = 6;
                        }
                    }
                    if (n2 < 0 && n3 >= 0) {
                        if (dq.g(n2) >= dq.g(n3)) {
                            n4 = 10;
                            n5 = cw.e / 2 + 30;
                            if (e) {
                                n5 = cw.e / 2 + 10;
                            }
                            n6 = 3;
                        } else {
                            n4 = cw.d / 2;
                            n5 = cw.e - 10;
                            n6 = 5;
                        }
                    } else if (n2 <= 0 && n3 < 0) {
                        if (dq.g(n2) >= dq.g(n3)) {
                            n4 = 10;
                            n5 = cw.e / 2 + 30;
                            if (e) {
                                n5 = cw.e / 2 + 10;
                            }
                            n6 = 3;
                        } else {
                            n4 = cw.d / 2;
                            n5 = 10;
                            n6 = 6;
                        }
                    }
                    cw.c((eh)object2);
                    ((eh)object2).a(cw.bJ, 0, 0, 13, 16, n6, n4, n5, dv.f);
                }
            }
            catch (Exception exception) {}
            if (!(main.a.F.e != 0 || !an.i || g.q != null || co.cb || E != cw.l() || main.a.G.a && main.a.G.h != 0)) {
                if (an.j) {
                    ((eh)object).a(-cw.j, -cw.k);
                }
                if (an.k == 0) {
                    ((eh)object).a(dl.i, an.a - 15, an.b, 0);
                }
                if (an.k == 1) {
                    ((eh)object).a(dl.i, 0, 0, 14, 16, 2, an.a + 15, an.b, dv.b);
                }
                if (an.l) {
                    ((eh)object).a(as.f, an.a, an.b, 3);
                }
                ((eh)object).a(-((eh)object).a(), -((eh)object).b());
            }
        }
        if (g.n != null) {
            g.n.a(this.aA);
        }
        int n7 = 0;
        while (n7 < j.y.size()) {
            j j2 = (j)j.y.elementAt(n7);
            if (j2 instanceof g && !j2.equals(g.m) && !j2.equals(g.n)) {
                j2.a(this.aA);
            }
            ++n7;
        }
        if (K != null) {
            K.a(this.aA);
        }
        if (co.cd || en.c || ds.o || dr.a) {
            object = this.aA;
            String string = "";
            main.a.a((eh)object);
            ((eh)object).a(0);
            ((eh)object).d(0, 0, A, B);
            ((eh)object).a(en.j, A / 2, B / 2 - 24, dv.c);
            main.a.a(C, B / 2 + 24, (eh)object);
            ev.c.a((eh)object, String.valueOf(ch.aD) + (en.k > 0 ? " " + en.k + "s" : string), A / 2, B / 2, 2);
            if (bt > 0 && en.k <= 0 && ej.j() - bs >= 1000L) {
                if (--bt == 0) {
                    bt = 15;
                }
                bs = ej.j();
            }
        }
        main.a.a(this.aA);
        h.d(this.aA);
        if (ar && !d) {
            if (E == I || E == ao || E == ap) {
                this.aA.a(aj, 5, 5, 0);
            }
            if (E == ct.a) {
                this.aA.a(aj, C, 5, 0);
            }
        }
        n7 = 0;
        while (n7 < bf.size()) {
            String string = (String)bf.elementAt(n7);
            ev.a.a(this.aA, string, A, B - this.bg - n7 * this.bg, 1);
            ev.c.a(this.aA, string, A - 1, B - this.bg - n7 * this.bg - 1, 1);
            ++n7;
        }
        main.a.a(this.aA);
        n7 = B / 4;
        if (E != null && E instanceof cw && bd != null) {
            this.aA.e(60, n7, A - 120, ev.s.a() + 2);
            ev.o.a(this.aA, bd, be, n7 + 1, 0);
            ev.n.a(this.aA, bd, be, n7, 0);
            this.aA.e(0, 0, A, B);
        }
    }

    public static void l() {
        K = null;
        da.c();
    }

    public static void a(String string) {
        L.a(string, null, new ae(ch.bt, h, 8882, null), null);
        K = L;
    }

    public static void b(String string) {
        L.a(string, null, new ae(ch.bx, h, 8882, null), null);
        K = L;
        main.a.L.d = true;
    }

    public static void c(String string) {
        L.a(string, null, new ae(ch.bx, h, 8882, null), null);
        K = L;
        main.a.L.d = true;
    }

    public static void m() {
        co.cd = true;
    }

    public static void a(String string, int n2, Object object) {
        L.a(string, null, new ae(ch.bt, h, n2, object), null);
        L.c();
    }

    public static void a(String string, ae ae2, ae ae3) {
        L.a(string, ae2, null, ae3);
        L.c();
    }

    public final void sizeChanged(int n2, int n3) {
    }

    public static boolean n() {
        return true;
    }

    public final boolean a(int n2, int n3, int n4) {
        if (a) {
            return false;
        }
        int n5 = n2 = n2 == 1 ? 0 : 1;
        if (this.bj[n2] != -1) {
            return false;
        }
        this.bj[n2] = 0;
        this.bh[n2] = n3;
        this.bi[n2] = n4;
        return true;
    }

    private static void u() {
        if (a) {
            return;
        }
        bl = new Image[3];
        int n2 = 0;
        while (n2 < 3) {
            main.a.bl[n2] = ej.b("/e/w" + n2 + ".png");
            ++n2;
        }
        int[] nArray = new int[2];
        bk = nArray;
        main.a.bk[1] = -1;
        nArray[0] = -1;
    }

    public final void o() {
        if (a) {
            return;
        }
        try {
            int n2 = 0;
            while (n2 < 2) {
                if (this.bj[n2] != -1) {
                    int n3 = n2;
                    this.bj[n3] = this.bj[n3] + 1;
                    if (this.bj[n2] >= 5) {
                        this.bj[n2] = -1;
                    }
                    if (n2 == 0) {
                        int n4 = n2;
                        this.bh[n4] = this.bh[n4] - 1;
                    } else {
                        int n5 = n2;
                        this.bh[n5] = this.bh[n5] + 1;
                    }
                    int n6 = n2;
                    this.bi[n6] = this.bi[n6] - 1;
                }
                ++n2;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static boolean d(int n2, int n3) {
        if (n2 < cw.j) {
            return false;
        }
        if (n2 > cw.j + cw.d) {
            return false;
        }
        if (n3 < cw.k) {
            return false;
        }
        return n3 <= cw.k + cw.e + 30;
    }

    public static void a(int n2, int n3, eh eh2) {
        int n4 = au % (ej.c == 7 ? 8 : 9);
        if (++au == 1000) {
            au = 0;
        }
        eh2.a(bm, 0, n4 << 4, 16, 16, 0, n2, n3, 3);
    }

    public static void b(String object, int n2, Object object2) {
        bq = n2;
        br = null;
        bp = object;
        if (h != null) {
            object = h;
            h.bo = true;
        }
    }

    public static boolean b(int n2, int n3, int n4, int n5) {
        if (!k && !m) {
            return false;
        }
        return p >= n2 && p <= n2 + n4 && q >= n3 && q <= n3 + n5;
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 10001: {
                K = null;
                da.c();
                return;
            }
            case 10000: {
                K = null;
                da.c();
                return;
            }
            case 9000: {
                K = null;
                da.c();
                du.b = null;
                er.a();
                System.gc();
                ds.u = true;
                ds.B = true;
                cw.l().n();
                if (E == I) break;
                ao.g();
                return;
            }
            case 999: {
                ej.g();
                K = null;
                da.c();
                return;
            }
            case 9999: {
                K = null;
                da.c();
                main.a.b();
                I.c();
                return;
            }
            case 8881: {
                Object object2 = (String)object;
                try {
                    GameMidlet.g.platformRequest((String)object2);
                }
                catch (Exception exception) {
                    object2 = exception;
                    exception.printStackTrace();
                }
                K = null;
                return;
            }
            case 8882: {
                da.c();
                K = null;
                if (en.o) {
                    cj.a().f();
                    en.o = false;
                }
                ds.j();
                ds.q = 0;
                ds.r = 0;
                ds.s = 0L;
                ds.t = 0;
                ds.C = false;
                ds.n = 0;
                return;
            }
            case 8884: {
                K = null;
                da.c();
                if (ap == null) {
                    ap = new dt();
                }
                ap.a();
                return;
            }
            case 8885: {
                GameMidlet.g.a();
                return;
            }
            case 8886: {
                K = null;
                da.c();
                String string = (String)object;
                cj.a().c(string);
                return;
            }
            case 8887: {
                K = null;
                da.c();
                n2 = (Integer)object;
                cj.a().m(n2);
                return;
            }
            case 8888: {
                n2 = (Integer)object;
                cj.a().n(n2);
                K = null;
                da.c();
                return;
            }
            case 8889: {
                String string = (String)object;
                K = null;
                da.c();
                cj.a().d(string);
                return;
            }
            case 88810: {
                n2 = (Integer)object;
                K = null;
                da.c();
                cj.a().k(n2);
                return;
            }
            case 88811: {
                K = null;
                da.c();
                cj.a().n();
                return;
            }
            case 88814: {
                ar[] arArray = (ar[])object;
                K = null;
                da.c();
                cj.a().a(arArray);
                return;
            }
            case 88815: {
                return;
            }
            case 88817: {
                g.c("", 1, co.m().bh);
                cj.a().a(co.m().bh.t.a, main.a.F.b, 0);
                return;
            }
            case 88818: {
                n2 = ((Short)object).shortValue();
                cj.a().a((short)n2, null.d.e());
                K = null;
                da.c();
                return;
            }
            case 88819: {
                n2 = ((Short)object).shortValue();
                cj.a().b((short)n2);
                return;
            }
            case 88820: {
                String[] stringArray = (String[])object;
                if (co.m().bh == null) {
                    return;
                }
                object = new Integer(main.a.F.b);
                if (stringArray.length > 1) {
                    eq eq2 = new eq("vSub");
                    int n3 = 0;
                    while (n3 < stringArray.length - 1) {
                        eq2.addElement(new ae(stringArray[n3 + 1], h, 88821, object));
                        ++n3;
                    }
                    F.a(eq2);
                    return;
                }
                g.c("", 1, co.m().bh);
                cj.a().a(co.m().bh.t.a, ((Integer)object).intValue(), 0);
                return;
            }
            case 88821: {
                int n4 = (Integer)object;
                g.c("", 1, co.m().bh);
                cj.a().a(co.m().bh.t.a, n4, main.a.F.b);
                return;
            }
            case 88822: {
                g.c("", 1, co.m().bh);
                cj.a().a(co.m().bh.t.a, main.a.F.b, 0);
                return;
            }
            case 88823: {
                main.a.a(ch.L);
                return;
            }
            case 88824: {
                main.a.a(ch.M);
                return;
            }
            case 88825: {
                main.a.c(ch.N);
                return;
            }
            case 88826: {
                main.a.c(ch.O);
                return;
            }
            case 88827: {
                main.a.a(ch.P);
                return;
            }
            case 88828: {
                main.a.a(ch.Q);
                return;
            }
            case 88829: {
                String string = null.d.e();
                if (string.equals("")) {
                    return;
                }
                cj.a().b(string, (int)((Integer)object));
                da.a();
                return;
            }
            case 88836: {
                null.d.b(6);
                ((de)null).a(ch.T, new ae(ch.bw, h, 888361, null), 1);
                return;
            }
            case 888361: {
                String string = null.d.e();
                K = null;
                da.c();
                if (string.length() < 6 || string.equals("")) {
                    main.a.a(ch.R);
                    return;
                }
                try {
                    cj.a().q(Integer.parseInt(string));
                    return;
                }
                catch (Exception exception) {
                    main.a.a(ch.S);
                    return;
                }
            }
            case 88837: {
                String string = null.d.e();
                K = null;
                da.c();
                try {
                    cj.a().s(Integer.parseInt(string.trim()));
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 88839: {
                String string = null.d.e();
                K = null;
                da.c();
                if (string.length() < 6 || string.equals("")) {
                    main.a.a(ch.R);
                    return;
                }
                try {
                    String string2 = string;
                    string = null;
                    int n5 = 8882;
                    object = string2;
                    n5 = 888391;
                    String string3 = ch.ai;
                    L.a(string3, new ae(ch.bo, h, 888391, object), new ae("", h, 888391, object), new ae(ch.bp, h, 8882, null));
                    L.c();
                    return;
                }
                catch (Exception exception) {
                    main.a.a(ch.S);
                    return;
                }
            }
            case 888391: {
                String string = (String)object;
                K = null;
                da.c();
                cj.a().r(Integer.parseInt(string));
                return;
            }
            case 888392: {
                cj.a().a(4, main.a.F.b, 0);
                return;
            }
            case 888393: {
                I.c();
                return;
            }
            case 888394: {
                K = null;
                da.c();
                return;
            }
            case 888395: {
                if (E.equals(du.a) || E.equals(ao)) {
                    ao.a();
                } else {
                    I.a();
                }
                K = null;
                da.c();
                return;
            }
            case 888396: {
                K = null;
                da.c();
                return;
            }
            case 888397: {
                K = null;
                da.c();
                return;
            }
            case 101024: {
                K = null;
                da.c();
                return;
            }
            case 101025: {
                K = null;
                da.c();
                if (ds.B) {
                    ao.a();
                    return;
                }
                ao.k();
                return;
            }
            case 101026: {
                ej.b(true);
                return;
            }
            case 100001: {
                cj.a().b((byte)0, (byte)-1);
                da.a();
                return;
            }
            case 100002: {
                if (I == null) {
                    I = new en();
                }
                I.g();
                return;
            }
            case 100003: {
                return;
            }
            case 100004: {
                return;
            }
            case 100005: {
                if (co.m().T == 14) {
                    main.a.a(ch.eA);
                    return;
                }
                cj.a().m();
                return;
            }
            case 100006: {
                ej.b(true);
                return;
            }
            case 100016: {
                ds.a(17, false);
                main.a.e();
                ds.o = true;
                K = null;
                da.c();
            }
        }
    }

    public static void p() {
        l = false;
        k = false;
        al = false;
        m = false;
        o = false;
        cw.l().bg = 0L;
        cw.l().bf = false;
    }
}

