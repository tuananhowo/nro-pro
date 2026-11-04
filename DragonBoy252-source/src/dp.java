/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;
import main.a;

public final class dp
extends ew
implements ao {
    private et a;
    private et b;
    private et c;
    private et d;
    private et e;
    private et f;
    private et g;
    private et h;
    private et i;
    private static boolean j = false;
    private int k;
    private int l;
    private int m;
    private boolean n = false;
    private boolean o = false;
    private ae p;
    private ae q;
    private ae r;
    private ae s;
    private ae t;
    private int u;
    private ae v;
    private int w;
    private int x = 130;
    private int y;
    private int z = -1;
    private boolean A = false;
    private int B = 2;
    private int C = 0;
    private int D = -40;
    private int E = 1;

    static {
        int[] nArray = new int[5];
        nArray[1] = 8;
        nArray[2] = 2;
        nArray[3] = 6;
        nArray[4] = 9;
    }

    public final void a() {
        System.out.println("Res switch");
        es.a();
        es.C();
        this.a.e = true;
        this.b.e = false;
        if (main.a.e) {
            this.a.e = false;
        }
        super.a();
    }

    public dp(byte by2) {
        byte by3 = (byte)(System.currentTimeMillis() % 9L);
        dx.o = by3;
        if (by3 == 5 || dx.o == 6) {
            dx.o = 4;
        }
        cw.a(-1, -1);
        cw.j = 100;
        cw.k = 200;
        this.m = main.a.B > 200 ? main.a.D - 80 : main.a.D - 65;
        dp dp2 = this;
        this.l = -50;
        this.u = main.a.D - ew.cC - 5;
        if (main.a.B <= 160) {
            this.u = 20;
        }
        this.i = new et();
        this.i.c(1);
        this.i.c = 220;
        this.i.d = ew.cC + 2;
        this.i.i = "S\u1ed1 \u0111i\u1ec7n tho\u1ea1i";
        if (by2 == 1) {
            this.i.a("01234567890");
        }
        this.a = new et();
        this.a.c = 220;
        this.a.d = ew.cC + 2;
        this.a.e = true;
        this.a.i = "H\u1ecd v\u00e0 t\u00ean";
        if (by2 == 1) {
            this.a.a("Nguy\u1ec5n V\u0103n A");
        }
        this.a.c(0);
        this.b = new et();
        this.b.c(1);
        this.b.c = 70;
        this.b.d = ew.cC + 2;
        this.b.i = "Ng\u00e0y sinh";
        if (by2 == 1) {
            this.b.a("01");
        }
        this.c = new et();
        this.c.c(1);
        this.c.c = 70;
        this.c.d = ew.cC + 2;
        this.c.i = "Th\u00e1ng sinh";
        if (by2 == 1) {
            this.c.a("01");
        }
        this.d = new et();
        this.d.c(1);
        this.d.c = 70;
        this.d.d = ew.cC + 2;
        this.d.i = "N\u0103m sinh";
        if (by2 == 1) {
            this.d.a("1980");
        }
        this.e = new et();
        this.e.c(0);
        this.e.c = 220;
        this.e.d = ew.cC + 2;
        this.e.i = "\u0110\u1ecba ch\u1ec9 \u0111\u0103ng k\u00fd th\u01b0\u1eddng tr\u00fa";
        if (by2 == 1) {
            this.e.a("123 \u0111\u01b0\u1eddng s\u1ed1 1, Qu\u1eadn 1, TP.HCM");
        }
        this.f = new et();
        this.f.c(1);
        this.f.c = 220;
        this.f.d = ew.cC + 2;
        this.f.i = "S\u1ed1 Ch\u1ee9ng minh nh\u00e2n d\u00e2n ho\u1eb7c s\u1ed1 h\u1ed9 chi\u1ebfu";
        if (by2 == 1) {
            this.f.a("123456789");
        }
        this.g = new et();
        this.g.c(0);
        this.g.c = 220;
        this.g.d = ew.cC + 2;
        this.g.i = "Ng\u00e0y c\u1ea5p";
        if (by2 == 1) {
            this.g.a("01/01/1990");
        }
        this.h = new et();
        this.h.c(0);
        this.h.c = 220;
        this.h.d = ew.cC + 2;
        this.h.i = "N\u01a1i c\u1ea5p";
        if (by2 == 1) {
            this.h.a("TP.HCM");
        }
        this.u += 35;
        this.n = true;
        this.k = 0;
        this.p = new ae(main.a.A > 200 ? ch.ay : ch.az, main.a.h, 888393, null);
        new ae(ch.bv, this, 2001, null);
        this.r = new ae(ch.aA, this, 2002, null);
        this.t = new ae(ch.bx, this, 10021, null);
        this.cz = this.s = new ae(ch.bj, this, 2003, null);
        if (main.a.e) {
            this.p.j = main.a.A / 2 - 100;
            this.s.j = main.a.A / 2 - ew.cD - 8;
            if (main.a.B >= 200) {
                this.p.k = main.a.B / 2 - 40;
                this.s.k = this.x + 110;
            }
            this.t.j = main.a.A / 2 + 3;
            this.t.k = this.x + 110;
            this.r.j = main.a.A / 2 - 84;
            this.r.k = this.s.k;
        }
        this.y = 170;
        int cfr_ignored_0 = this.a.b;
        by2 = (byte)184;
        if (184 >= main.a.A) {
            by2 = (byte)152;
        }
        this.w = main.a.A / 2 - by2 / 2;
        this.x = 5;
        if (main.a.A >= 200) {
        } else {
            int cfr_ignored_1 = this.a.b;
        }
        this.a.a = this.w + 10;
        this.a.b = this.x + 20;
        this.v = new ae(ch.bt, this, 2008, null);
        this.v.j = 260;
        this.v.k = main.a.B - 60;
        this.q = new ae("Tho\u00e1t", this, 1003, null);
        this.q.j = 260;
        this.q.k = main.a.B - 30;
        this.v.j = main.a.A / 2 - 80;
        this.q.j = main.a.A / 2 + 10;
        this.q.k = this.v.k = main.a.B - 25;
        this.cA = this.v;
        this.cz = this.q;
    }

    public final void b() {
        this.a.d();
        this.i.d();
        this.b.d();
        this.c.d();
        this.d.d();
        int n2 = 0;
        while (n2 < j.y.size()) {
            j j2 = (j)j.y.elementAt(n2);
            j2.b();
            ++n2;
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
        dp dp2 = this;
        if (dp2.m != dp2.l) {
            dp2.l += dp2.m - dp2.l >> 1;
        }
        main.a.c();
        main.a.c();
        if (this.C >= 0) {
            this.D += this.E * this.C;
            this.C += this.E * this.B;
            if (this.C <= 0) {
                this.E = -this.E;
            }
            if (this.D > 0) {
                this.E = -this.E;
                this.C -= 2 * this.B;
            }
        }
        main.a.c();
        if (this.z >= 0 && main.a.w % 100 == 0) {
            dp2 = this;
            ++dp2.z;
            if (dp2.z >= ch.aZ.length) {
                dp2.z = 0;
            }
            if (main.a.K == main.a.L && main.a.L.d) {
                main.a.L.a(ch.aZ[dp2.z]);
            }
        }
        if (main.a.e) {
            if (this.o) {
                this.cA = this.r;
                this.cz = this.t;
                return;
            }
            this.cA = this.v;
            this.cz = this.q;
            return;
        }
        if (this.o) {
            this.cA = this.r;
            this.cz = this.t;
            return;
        }
        this.cA = this.v;
        this.cz = this.q;
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
        int cfr_ignored_0 = this.a.b;
        if (g.m != null) {
            return;
        }
        if (g.n != null) {
            return;
        }
        if (main.a.K == null) {
            this.w = main.a.C - 120;
            this.x = (main.a.B - 110) / 2;
            bo.a(eh2, this.w, this.x, 240, 110, -1, true);
            main.a.c();
            this.a.a = this.w + 10;
            this.a.b = this.x + 15;
            this.i.a = this.a.a;
            this.i.b = this.a.b + 30;
            this.b.a = this.w + 10;
            this.b.b = this.i.b + 30;
            this.c.a = this.b.a + 75;
            this.c.b = this.b.b;
            this.d.a = this.c.a + 75;
            this.d.b = this.c.b;
            ev.i.a(eh2, "C\u1eadp nh\u1eadt th\u00f4ng tin", main.a.C, this.x + 2, 2);
            this.a.a(eh2);
            this.i.a(eh2);
            this.b.a(eh2);
            this.c.a(eh2);
            this.d.a(eh2);
        }
        main.a.a(eh2);
        String string = "2.5.2";
        eh2.a(main.a.O);
        eh2.d(main.a.A - 40, 4, 36, 11);
        ev.o.a(eh2, string, main.a.A - 22, 4, 2);
        eh2.a(main.a.aj, 10, 10, 0);
        super.a(eh2);
    }

    public final void d() {
        if (!main.a.e) {
            this.cB = this.a.e ? this.a.j : this.b.j;
        }
        if (main.a.i[2]) {
            --this.k;
            if (this.k < 0) {
                this.k = 1;
            }
        } else if (main.a.i[8]) {
            ++this.k;
            if (this.k > 1) {
                this.k = 1;
            }
        }
        if (main.a.i[2] || main.a.i[8]) {
            main.a.j();
            if (this.k == 1) {
                this.a.e = false;
                this.b.e = true;
            } else if (this.k == 0) {
                this.a.e = true;
                this.b.e = false;
            } else {
                this.a.e = false;
                this.b.e = false;
            }
        }
        if (main.a.e) {
            if (this.o) {
                this.cA = this.r;
                this.cz = this.t;
            } else {
                this.cA = this.v;
                this.cz = this.q;
            }
        } else if (this.o) {
            this.cA = this.r;
            this.cz = this.t;
        } else {
            this.cA = this.v;
            this.cz = this.q;
        }
        if (main.a.m) {
            if (main.a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
                this.k = 0;
            } else if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
                this.k = 1;
            }
        }
        super.d();
        main.a.j();
    }

    public final void a(int n2, Object object) {
        switch (n2) {
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
                this.o = false;
                return;
            }
            case 1002: {
                return;
            }
            case 1004: {
                ds.c();
                main.a.ao.a();
                return;
            }
            case 10021: {
                dp dp2 = this;
                this.o = false;
                dp2.b.e = false;
                dp2.a.e = true;
                dp2.cz = dp2.s;
                return;
            }
            case 1003: {
                main.a.ao.a();
                eb.a().f();
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
                return;
            }
            case 10042: {
                return;
            }
            case 2000: {
                return;
            }
            case 2001: {
                if (this.n) {
                    this.n = false;
                    return;
                }
                this.n = true;
                return;
            }
            case 2002: {
                boolean bl2;
                dp dp3 = this;
                if (dp3.a.e().equals("")) {
                    main.a.a(ch.V);
                    break;
                }
                dp3.a.e().toCharArray();
                if (dp3.b.e().equals("")) {
                    main.a.a(ch.W);
                    break;
                }
                if (dp3.a.e().length() < 5) {
                    main.a.a(ch.X);
                    break;
                }
                object = null;
                if (ch.fE == 2) {
                    if (dp3.a.e().indexOf("@") == -1 || dp3.a.e().indexOf(".") == -1) {
                        object = ch.Z;
                    }
                    bl2 = false;
                } else {
                    try {
                        Long.parseLong(dp3.a.e());
                        if (dp3.a.e().length() < 8 || dp3.a.e().length() > 12 || !dp3.a.e().startsWith("0") && !dp3.a.e().startsWith("84")) {
                            object = ch.Y;
                        }
                        bl2 = true;
                    }
                    catch (Exception exception) {
                        if (dp3.a.e().indexOf("@") == -1 || dp3.a.e().indexOf(".") == -1) {
                            object = ch.Z;
                        }
                        bl2 = false;
                    }
                }
                if (object != null) {
                    main.a.a((String)object);
                } else {
                    main.a.L.a(String.valueOf(ch.aj) + (bl2 ? String.valueOf(ch.ak) + ": " : String.valueOf(ch.al) + ": ") + dp3.a.e() + "\n" + ch.ae + ": " + dp3.b.e(), new ae(ch.bw, dp3, 4000, null), null, new ae(ch.bp, main.a.h, 8882, null));
                }
                main.a.K = main.a.L;
                return;
            }
            case 2003: {
                dp dp4 = this;
                object = new eq("vMenu Login");
                ((eq)object).addElement(new ae(ch.aa, dp4, 2004, null));
                ((eq)object).addElement(new ae(ch.ab, dp4, 1004, null));
                ((eq)object).addElement(new ae(ch.ad, dp4, 1003, null));
                ((eq)object).addElement(new ae(ch.aJ, dp4, 1005, null));
                int n3 = ea.d("lowGraphic");
                if (n3 == 1) {
                    ((eq)object).addElement(new ae(ch.bX, dp4, 10041, null));
                } else {
                    ((eq)object).addElement(new ae(ch.bY, dp4, 10042, null));
                }
                ((eq)object).addElement(new ae(ch.bq, main.a.h, 8885, null));
                main.a.F.a((eq)object);
                return;
            }
            case 2004: {
                dp dp5 = this;
                main.a.l();
                main.a.a(ch.fZ);
                dp5.o = true;
                dp5.b.e = false;
                dp5.a.e = true;
                return;
            }
            case 2008: {
                if (this.b.e().equals("") || this.c.e().equals("") || this.d.e().equals("") || this.i.e().equals("") || this.a.e().equals("")) {
                    main.a.a("Vui l\u00f2ng \u0111i\u1ec1n \u0111\u1ea7y \u0111\u1ee7 th\u00f4ng tin");
                    return;
                }
                main.a.a(ch.aD);
                cj.a().a(this.b.e(), this.c.e(), this.d.e(), "", "", "", "", this.i.e(), this.a.e());
                return;
            }
            case 4000: {
                this.a.e();
            }
        }
    }
}

