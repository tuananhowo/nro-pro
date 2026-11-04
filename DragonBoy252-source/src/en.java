/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class en
extends ew
implements ao {
    public et a;
    public et b;
    public static boolean c = false;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t = false;
    private boolean u = false;
    private ae v;
    private ae w;
    private ae x;
    private ae y;
    private ae z;
    private ae A;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static String i;
    public static Image j;
    public static short k;
    public static long l;
    public static long m;
    private int B;
    private ae C;
    private int D;
    private int E = main.a.D - 30;
    private int F;
    private int G = -1;
    public boolean n = false;
    private int H = 2;
    private int I = 0;
    private int J = -40;
    private int K = 1;
    private ae L;
    public static boolean o;

    static {
        int[] nArray = new int[5];
        nArray[1] = 8;
        nArray[2] = 2;
        nArray[3] = 6;
        nArray[4] = 9;
    }

    public final void a() {
        o = false;
        es.a();
        es.C();
        this.a.e = true;
        this.b.e = false;
        if (main.a.e) {
            this.a.e = false;
        }
        main.a.a(0);
        this.cz = new ae(ch.bC, this, 101, null);
        super.a();
    }

    public en() {
        int n2;
        byte by2 = (byte)(System.currentTimeMillis() % 9L);
        dx.o = by2;
        if (by2 == 5 || dx.o == 6) {
            dx.o = 4;
        }
        cw.a(-1, -1);
        cw.j = 100;
        cw.k = 200;
        this.s = main.a.B > 200 ? main.a.D - 80 : main.a.D - 65;
        en en2 = this;
        this.r = -50;
        this.q = n2 = main.a.A >= 200 ? 160 : 140;
        this.B = main.a.D - ew.cC - 5;
        if (main.a.B <= 160) {
            this.B = 20;
        }
        this.a = new et();
        this.a.b = main.a.D - ew.cC - 9;
        this.a.c = this.q;
        this.a.d = ew.cC + 2;
        this.a.e = true;
        this.a.c(0);
        this.a.i = String.valueOf(ch.fE == 2 ? "" : String.valueOf(ch.ak) + "/") + ch.al;
        this.b = new et();
        this.b.b = main.a.D - 4;
        this.b.c(2);
        this.b.c = this.q;
        this.b.d = ew.cC + 2;
        this.B += 35;
        this.t = true;
        n2 = ea.d(ea.g);
        if (n2 == 1) {
            this.t = true;
        } else if (n2 == 2) {
            this.t = false;
        }
        this.a.a(ea.c(ea.e));
        this.b.a(ea.c(ea.f));
        this.a.a((String)null);
        this.b.a((String)null);
        if (this.L == null) {
            this.L = new ae("G\u1ecdi hotline", this, 13, null);
            this.L.j = main.a.A - 75;
            this.L.k = ej.c == 1 && !main.a.e ? main.a.B - 20 : 8;
        }
        this.p = 0;
        this.v = new ae(main.a.A > 200 ? ch.ay : ch.az, main.a.h, 888393, null);
        new ae(ch.bv, this, 2001, null);
        this.x = new ae(ch.aA, this, 2002, null);
        this.z = new ae(ch.bx, this, 10021, null);
        this.A = new ae(ch.bC, this, 101, null);
        this.cz = this.y = new ae(ch.bj, this, 2003, null);
        if (main.a.e) {
            this.v.j = main.a.A / 2 + 8;
            this.y.j = main.a.A / 2 - ew.cD - 8;
            if (main.a.B >= 200) {
                this.v.k = this.E + 110;
                this.y.k = this.E + 110;
            }
            this.z.j = main.a.A / 2 + 3;
            this.z.k = this.E + 110;
            this.x.j = main.a.A / 2 - 84;
            this.x.k = this.y.k;
            this.A.j = 2;
            this.A.k = main.a.B - ew.cE;
        }
        this.F = 170;
        int cfr_ignored_0 = this.a.b;
        n2 = 184;
        if (184 >= main.a.A) {
            n2 = 152;
        }
        this.D = main.a.A / 2 - n2 / 2;
        this.E = main.a.D - 30;
        if (main.a.A >= 200) {
        } else {
            int cfr_ignored_1 = this.a.b;
        }
        this.a.a = this.D + 10;
        this.a.b = this.E + 20;
        this.C = new ae(ch.bt, this, 2008, null);
        this.C.j = main.a.A / 2 - 84;
        this.C.k = this.v.k;
        this.w = new ae(ch.ad, this, 1003, null);
        this.w.j = main.a.A / 2 + 3;
        this.w.k = this.v.k;
        this.cA = this.C;
        this.cz = this.w;
    }

    public final void c() {
        if (o && eb.a().d()) {
            return;
        }
        dq.c("user ao= " + ea.c(String.valueOf(ea.d) + ds.p));
        String string = ea.c(ea.e);
        String string2 = ea.c(ea.f);
        this.n = (string == null || string.equals("")) && ea.c(String.valueOf(ea.d) + ds.p) != null && !ea.c(String.valueOf(ea.d) + ds.p).equals("");
        dq.c("isLogin 2= " + this.n);
        if ((string == null || string.equals("")) && this.n) {
            string = ea.c(String.valueOf(ea.d) + ds.p);
            string2 = "a";
        }
        dq.c("user = " + string + " pass= " + string2);
        if (string == null || string2 == null || string.equals("")) {
            return;
        }
        if (string2.equals("")) {
            this.p = 1;
            this.a.e = false;
            this.b.e = true;
            if (!main.a.e) {
                this.cB = this.b.j;
            }
            return;
        }
        if (!eb.a().d()) {
            main.a.b();
        }
        o = true;
        cj.a().a(string, string2, "2.5.2", this.n ? (byte)1 : 0);
        ea.a(ds.D, ds.p);
        if (eb.a().d) {
            main.a.m();
        } else {
            main.a.a(String.valueOf(ch.x) + " [0]", 8884, null);
        }
        this.p = 0;
        if (!this.n) {
            this.h();
        }
        main.a.ak = ej.j() + 30000L;
    }

    public final void e() {
        if (this.t) {
            ea.a(ea.g, 1);
            ea.a(ea.e, this.a.e().toLowerCase().trim());
            ea.a(ea.f, this.b.e().toLowerCase().trim());
            return;
        }
        ea.a(ea.g, 2);
        ea.a(ea.e, "");
        ea.a(ea.f, "");
    }

    public final void b() {
        if (k > 0) {
            main.a.m();
            m = System.currentTimeMillis();
            if (m - l >= 1000L) {
                if ((k = (short)(k - 1)) == 0) {
                    main.a.I.c();
                }
                l = m;
            }
        }
        if (this.n && !this.u) {
            this.a.i = String.valueOf(ch.fE == 2 ? "" : String.valueOf(ch.ak) + "/") + ch.al;
            this.b.i = ch.ae;
            this.a.k = false;
            this.b.k = false;
            this.a.d();
            this.b.d();
        } else {
            this.a.i = String.valueOf(ch.fE == 2 ? "" : String.valueOf(ch.ak) + "/") + ch.al;
            this.b.i = ch.ae;
            this.a.d();
            this.b.d();
        }
        int n2 = 0;
        while (n2 < j.y.size()) {
            j j2 = (j)j.y.elementAt(n2);
            j2.b();
            ++n2;
        }
        if (!(!d || e || h || f || g)) {
            d = false;
            System.gc();
            cj.a().w();
        }
        if (++cw.j > main.a.A * 3 + 100) {
            cw.j = 100;
        }
        if (g.m != null) {
            return;
        }
        main.a.c();
        main.a.c();
        main.a.c();
        en en2 = this;
        if (en2.s != en2.r) {
            en2.r += en2.s - en2.r >> 1;
        }
        main.a.c();
        main.a.c();
        if (this.I >= 0) {
            this.J += this.K * this.I;
            this.I += this.K * this.H;
            if (this.I <= 0) {
                this.K = -this.K;
            }
            if (this.J > 0) {
                this.K = -this.K;
                this.I -= 2 * this.H;
            }
        }
        main.a.c();
        if (this.G >= 0 && main.a.w % 100 == 0) {
            en2 = this;
            ++en2.G;
            if (en2.G >= ch.aZ.length) {
                en2.G = 0;
            }
            if (main.a.K == main.a.L && main.a.L.d) {
                main.a.L.a(ch.aZ[en2.G]);
            }
        }
        if (this.n && !this.u) {
            this.a.k = false;
            this.b.k = false;
            this.a.d();
            this.b.d();
        } else {
            this.a.i = String.valueOf(ch.fE == 2 ? "" : String.valueOf(ch.ak) + "/") + ch.al;
            this.b.i = ch.ae;
            this.a.d();
            this.b.d();
        }
        if (main.a.e) {
            if (this.u) {
                this.cA = this.x;
                this.cz = this.z;
            } else {
                this.cA = this.C;
                this.cz = this.w;
            }
            if (this.A != null && this.A.c()) {
                this.A.a();
                return;
            }
        } else {
            if (this.u) {
                this.cA = this.x;
                this.cz = this.z;
                return;
            }
            this.cA = this.C;
            this.cz = this.w;
        }
    }

    public final void a(int n2) {
        if (this.a.e) {
            this.a.a(n2);
        } else if (this.b.e) {
            this.b.a(n2);
        }
        super.a(n2);
    }

    public final void a(eh eh2) {
        main.a.c();
        main.a.c(eh2);
        main.a.c();
        int n2 = this.a.b - 50;
        if (main.a.B <= 220) {
            n2 += 5;
        }
        ev.s.a(eh2, "v2.5.2", main.a.A - 2, 17, 1, ev.o);
        if (ej.c == 1 && !main.a.e) {
            ev.s.a(eh2, ds.m, main.a.A - 2, main.a.B - 15, 1, ev.o);
        } else {
            ev.s.a(eh2, ds.m, main.a.A - 2, 2, 1, ev.o);
        }
        if (main.a.K == null) {
            int n3 = main.a.A >= 200 ? 180 : 160;
            bo.a(eh2, this.D, this.E - 10, n3, 105, -1, true);
            if (main.a.B > 160 && j != null) {
                eh2.a(j, main.a.C, n2, 3);
            }
            main.a.c();
            n2 = 184;
            if (184 >= main.a.A) {
                n2 = 152;
            }
            this.D = main.a.A / 2 - n2 / 2;
            this.a.a = this.D + 10;
            this.a.b = this.E + 20;
            this.b.a = this.D + 10;
            this.b.b = this.E + 55;
            this.a.a(eh2);
            this.b.a(eh2);
            if (main.a.A < 176) {
                ev.g.a(eh2, String.valueOf(ch.am) + ":", this.a.a - 35, this.a.b + 7, 0);
                ev.g.a(eh2, String.valueOf(ch.an) + ":", this.b.a - 35, this.b.b + 7, 0);
                ev.g.a(eh2, String.valueOf(ch.aK) + ": " + i, main.a.A / 2, this.b.b + 32, 2);
            }
        }
        super.a(eh2);
        this.A.a(eh2);
    }

    public final void d() {
        if (main.a.e && this.L != null && this.L.c()) {
            this.L.a();
        }
        if (c) {
            return;
        }
        if (!main.a.e) {
            this.cB = this.a.e ? this.a.j : this.b.j;
        }
        if (main.a.i[2]) {
            --this.p;
            if (this.p < 0) {
                this.p = 1;
            }
        } else if (main.a.i[8]) {
            ++this.p;
            if (this.p > 1) {
                this.p = 1;
            }
        }
        if (main.a.i[2] || main.a.i[8]) {
            main.a.j();
            if (!this.n || this.u) {
                if (this.p == 1) {
                    this.a.e = false;
                    this.b.e = true;
                } else if (this.p == 0) {
                    this.a.e = true;
                    this.b.e = false;
                } else {
                    this.a.e = false;
                    this.b.e = false;
                }
            }
        }
        if (main.a.e) {
            if (this.u) {
                this.cA = this.x;
                this.cz = this.z;
            } else {
                this.cA = this.C;
                this.cz = this.w;
            }
        } else if (this.u) {
            this.cA = this.x;
            this.cz = this.z;
        } else {
            this.cA = this.C;
            this.cz = this.w;
        }
        if (main.a.m && (!this.n || this.u)) {
            if (main.a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
                this.p = 0;
            } else if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
                this.p = 1;
            }
        }
        super.d();
        main.a.j();
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 101: {
                cj.a().f();
                ds.j();
                main.a.ao.a();
                return;
            }
            case 13: {
                switch (ej.c) {
                    case 1: {
                        ej.c();
                        return;
                    }
                    case 3: 
                    case 5: {
                        ej.d();
                        return;
                    }
                    case 6: {
                        ej.e();
                        return;
                    }
                    case 2: {
                        ej.k();
                    }
                }
                return;
            }
            case 1000: {
                try {
                    GameMidlet.g.platformRequest((String)object);
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
                main.a.l();
                return;
            }
            case 1001: {
                main.a.l();
                this.u = false;
                return;
            }
            case 1002: {
                main.a.m();
                String string = ea.c("userAo" + ds.p);
                if (string == null || string.equals("")) {
                    o = true;
                    cj.a().f("");
                    return;
                }
                main.a.I.n = true;
                o = true;
                main.a.b();
                cj.a().a(string, "", "2.5.2", (byte)1);
                return;
            }
            case 1004: {
                ds.c();
                main.a.ao.a();
                return;
            }
            case 10021: {
                this.h();
                return;
            }
            case 1003: {
                main.a.a(ch.ao);
                return;
            }
            case 1005: {
                try {
                    GameMidlet.g.platformRequest("http://ngocrongonline.com");
                    return;
                }
                catch (Exception exception) {
                    Exception exception3 = exception;
                    exception.printStackTrace();
                    return;
                }
            }
            case 10041: {
                ea.a("lowGraphic", 0);
                main.a.a(ch.cP, 8885, null);
                return;
            }
            case 10042: {
                ea.a("lowGraphic", 1);
                main.a.a(ch.cP, 8885, null);
                return;
            }
            case 2000: {
                return;
            }
            case 2001: {
                if (this.t) {
                    this.t = false;
                    return;
                }
                this.t = true;
                return;
            }
            case 2002: {
                boolean bl2;
                en en2 = this;
                if (en2.a.e().equals("")) {
                    main.a.a(ch.V);
                    break;
                }
                en2.a.e().toCharArray();
                if (en2.b.e().equals("")) {
                    main.a.a(ch.W);
                    break;
                }
                if (en2.a.e().length() < 5) {
                    main.a.a(ch.X);
                    break;
                }
                object = null;
                if (ch.fE == 2) {
                    if (en2.a.e().indexOf("@") == -1 || en2.a.e().indexOf(".") == -1) {
                        object = ch.Z;
                    }
                    bl2 = false;
                } else {
                    try {
                        Long.parseLong(en2.a.e());
                        if (en2.a.e().length() < 8 || en2.a.e().length() > 12 || !en2.a.e().startsWith("0") && !en2.a.e().startsWith("84")) {
                            object = ch.Y;
                        }
                        bl2 = true;
                    }
                    catch (Exception exception) {
                        if (en2.a.e().indexOf("@") == -1 || en2.a.e().indexOf(".") == -1) {
                            object = ch.Z;
                        }
                        bl2 = false;
                    }
                }
                if (object != null) {
                    main.a.a((String)object);
                } else {
                    main.a.L.a(String.valueOf(ch.aj) + (bl2 ? String.valueOf(ch.ak) + ": " : String.valueOf(ch.al) + ": ") + en2.a.e() + "\n" + ch.ae + ": " + en2.b.e(), new ae(ch.bw, en2, 4000, null), null, new ae(ch.bp, main.a.h, 8882, null));
                }
                main.a.K = main.a.L;
                return;
            }
            case 2003: {
                en en3 = this;
                object = new eq("vMenu Login");
                ((eq)object).addElement(new ae(ch.aa, en3, 2004, null));
                if (!en3.n) {
                    ((eq)object).addElement(new ae(ch.ab, en3, 1004, null));
                }
                ((eq)object).addElement(new ae(ch.ad, en3, 1003, null));
                ((eq)object).addElement(new ae(ch.aJ, en3, 1005, null));
                int n3 = ea.d("lowGraphic");
                if (n3 == 1) {
                    ((eq)object).addElement(new ae(ch.bX, en3, 10041, null));
                } else {
                    ((eq)object).addElement(new ae(ch.bY, en3, 10042, null));
                }
                ((eq)object).addElement(new ae(ch.bq, main.a.h, 8885, null));
                main.a.F.a((eq)object);
                return;
            }
            case 2004: {
                this.f();
                return;
            }
            case 2008: {
                ea.a(ea.e, this.a.e().trim());
                ea.a(ea.f, this.b.e().trim());
                if (ds.B) {
                    main.a.ao.a();
                    return;
                }
                main.a.ao.k();
                return;
            }
            case 4000: {
                object = this.a.e();
                en en4 = this;
                main.a.b(ch.aE);
                main.a.b();
                main.a.b(ch.K);
                en4.b.e();
                cj cj2 = cj.a();
                String string = en4.b.e();
                String string2 = ea.c(String.valueOf(ea.d) + ds.p);
                ea.c("passAo");
                cj2.a((String)object, string, string2, "2.5.2");
                ea.a("acc", (String)object);
                ea.a(ea.f, en4.b.e());
            }
        }
    }

    private void h() {
        if (this.n) {
            this.c();
            return;
        }
        this.u = false;
        this.b.e = false;
        this.a.e = true;
        this.cz = this.y;
    }

    public final void f() {
        main.a.l();
        main.a.a(ch.fZ);
        this.u = true;
        this.b.e = false;
        this.a.e = true;
    }

    public static void g() {
        main.a.ak = ej.j() + 30000L;
        ds.n = 0;
        if (main.a.I.n) {
            main.a.a(ch.fY, new ae(ch.bo, main.a.G, 10019, null), new ae(ch.bp, main.a.G, 10020, null));
            return;
        }
        ds.E = false;
        dt.a = false;
        main.a.e();
    }
}

