/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.a;

public final class ct
extends ew
implements ao {
    public static ct a;
    public static boolean b;
    private ae c;
    private static et d;
    private static int e;
    private static int f;
    private static int g;
    private static int[][] h;
    private static int[] i;
    private static int[] j;
    private int[] k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    static {
        b = false;
        h = new int[][]{{64, 30, 31}, {9, 29, 32}, {6, 27, 28}};
        i = new int[]{2, 13, 8};
        j = new int[]{1, 12, 7};
    }

    public static ct c() {
        if (a == null) {
            a = new ct();
        }
        return a;
    }

    private static void a(byte[] byArray) {
        InputStream inputStream = null;
        inputStream = null;
        int n2 = 0;
        while (n2 < byArray.length) {
            inputStream = v.a("/mymap/" + byArray[n2]);
            inputStream = new DataInputStream(inputStream);
            bb.a[n2] = (char)((FilterInputStream)inputStream).read();
            bb.b[n2] = (char)((FilterInputStream)inputStream).read();
            bb.e[n2] = new int[((FilterInputStream)inputStream).available()];
            int n3 = 0;
            while (n3 < bb.a[n2] * bb.b[n2]) {
                bb.e[n2][n3] = ((FilterInputStream)inputStream).read();
                ++n3;
            }
            bb.f[n2] = new int[bb.e[n2].length];
            ++n2;
        }
    }

    public final void a() {
        en.c = false;
        main.a.F.a = false;
        main.a.l();
        super.a();
        e = dq.b(0, 3);
        f = dq.b(0, 3);
        this.e();
        co.cd = false;
        if (d != null) {
            ct.d.i = ch.ax;
        }
        ds.n = 0;
        if (main.a.e) {
            this.c = new ae(ds.a[ds.p], this, 10018, null);
            this.c.j = 1;
            this.c.k = 3;
        }
    }

    private void e() {
        dx.f = new int[bb.e[e].length];
        int n2 = 0;
        while (n2 < bb.e[e].length) {
            dx.f[n2] = bb.e[e][n2];
            ++n2;
        }
        dx.g = bb.f[e];
        dx.d = bb.d[e];
        dx.c = bb.c[e];
        dx.e = bb.c[e];
        dx.a = bb.a[e];
        dx.b = bb.b[e];
        dx.e = this.k[e] + 1;
        dx.h();
        main.a.a(this.k[e]);
        cw.a(this.l, this.m);
    }

    public ct() {
        int[] nArray = new int[3];
        nArray[1] = 4;
        nArray[2] = 8;
        this.k = nArray;
        this.l = 168;
        this.m = 350;
        this.n = 45;
        if (main.a.I == null) {
            main.a.I = new en();
        }
        try {
            if (!main.a.a) {
                byte[] byArray = new byte[]{39, 40, 41};
                if (!main.a.a) {
                    InputStream inputStream = null;
                    inputStream = null;
                    try {
                        int n2 = 0;
                        while (n2 < byArray.length) {
                            inputStream = v.a("/mymap/mapTable" + byArray[n2]);
                            inputStream = new DataInputStream(inputStream);
                            int n3 = ((DataInputStream)inputStream).readShort();
                            bb.g[n2] = new eq("MapTemplate.vCurrItem[a] ");
                            int n4 = 0;
                            while (n4 < n3) {
                                short s2 = ((DataInputStream)inputStream).readShort();
                                short s3 = ((DataInputStream)inputStream).readShort();
                                short s4 = ((DataInputStream)inputStream).readShort();
                                if (dx.a(s2) != null) {
                                    ek ek2 = dx.a(s2);
                                    ek ek3 = new ek();
                                    new ek().a = s2;
                                    ek3.c = ek2.c;
                                    ek3.f = ek2.f;
                                    ek3.g = ek2.g;
                                    ek3.d = s3 * dx.i;
                                    ek3.e = s4 * dx.i;
                                    ek3.h = ek2.h;
                                    bb.g[n2].addElement(ek3);
                                    if (!ek.k.containsKey(String.valueOf(ek3.c))) {
                                        Image image;
                                        try {
                                            image = ej.b("/mapBackGround/" + ek3.c + ".png");
                                            ek.k.put(String.valueOf(ek3.c), image);
                                        }
                                        catch (Exception exception) {
                                            image = ej.c("/mapBackGround/" + ek3.c + ".png");
                                            if (image == null) {
                                                image = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                                cj.a().c(ek3.c);
                                            }
                                            ek.k.put(String.valueOf(ek3.c), image);
                                        }
                                        ek.m.addElement(String.valueOf(ek3.c));
                                    }
                                    if (!ek.a(String.valueOf(ek3.c))) {
                                        ek.l.addElement(String.valueOf(ek3.c));
                                    }
                                    ek.b();
                                }
                                ++n4;
                            }
                            ++n2;
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                }
            }
            ct.a(new byte[]{39, 40, 41});
        }
        catch (Exception exception) {
            Exception exception3 = exception;
            exception.printStackTrace();
        }
        if (main.a.A <= 200) {
            cw.d(128, 100);
            cw.bY = (main.a.A - 128) / 2;
            cw.bX = 10;
            this.m += 15;
            this.n -= 15;
        }
        e = 1;
        d = new et();
        new et().c = main.a.I.a.c;
        if (main.a.A < 200) {
            ct.d.c = 60;
        }
        ct.d.d = 26;
        if (main.a.A < 200) {
            ct.d.a = cw.bY + 45;
            ct.d.b = cw.bX + 12;
        } else {
            ct.d.a = main.a.A / 2 - ct.d.c / 2;
            ct.d.b = 35;
        }
        if (!main.a.e) {
            ct.d.e = true;
        }
        d.c(0);
        ct.d.i = ch.ax;
        if (d.e().equals("@")) {
            d.a(main.a.I.a.e().substring(0, main.a.I.a.e().indexOf("@")));
        }
        e = 1;
        f = 0;
        this.cA = new ae(ch.bB, this, 8000, null);
        this.cz = new ae(ch.bC, this, 8001, null);
        if (!main.a.e) {
            this.cB = ct.d.j;
        }
    }

    public final void a(int n2) {
        d.a(n2);
    }

    public final void b() {
        ++this.o;
        if (this.o > 30) {
            this.o = 0;
        }
        this.p = this.o % 15 < 5 ? 0 : 1;
        d.d();
        if (this.c != null && this.c.c()) {
            this.c.a();
        }
        if (g != 0) {
            ct.d.e = false;
        }
    }

    public final void d() {
        if (main.a.i[2] && --g < 0) {
            g = ch.aL.length - 1;
        }
        if (main.a.i[8] && ++g >= ch.aL.length) {
            g = 0;
        }
        if (g == 0) {
            if (!main.a.e) {
                this.cB = ct.d.j;
            }
            d.d();
        }
        if (g == 1) {
            if (main.a.i[4]) {
                if (--e < 0) {
                    e = ch.aM.length - 1;
                }
                this.e();
            }
            if (main.a.i[6]) {
                if (++e > ch.aM.length - 1) {
                    e = 0;
                }
                this.e();
            }
            this.cB = null;
        }
        if (g == 2) {
            if (main.a.i[4] && --f < 0) {
                f = ch.fs[0].length - 1;
            }
            if (main.a.i[6] && ++f > ch.fs[0].length - 1) {
                f = 0;
            }
            this.cB = null;
        }
        if (main.a.m) {
            int n2;
            int n3 = 110;
            int n4 = 60;
            if (main.a.A > main.a.B) {
                n3 = 100;
                n4 = 40;
            }
            if (main.a.a(main.a.A / 2 - 117, 15, 234, 80)) {
                g = 0;
                ct.d.e = true;
            }
            if (main.a.a(main.a.A / 2 - 117, n3 - 30, 234, n4 + 5)) {
                g = 1;
                n2 = e;
                e = (main.a.p - (main.a.A / 2 - 117)) / 78;
                if (e < 0) {
                    e = 0;
                }
                if (e > ch.aM.length - 1) {
                    e = ch.aM.length - 1;
                }
                if (n2 != e) {
                    this.e();
                }
            }
            if (main.a.a(main.a.A / 2 - 117, n3 - 30 + n4 + 5, 234, 65)) {
                g = 2;
                n2 = f;
                f = (main.a.p - (main.a.A / 2 - 117)) / 78;
                if (f < 0) {
                    f = 0;
                }
                if (f > ch.fs[0].length - 1) {
                    f = ch.fs[0].length - 1;
                }
                if (n2 != g) {
                    this.e();
                }
            }
        }
        super.d();
        main.a.k();
        main.a.j();
    }

    public final void a(eh eh2) {
        int n2;
        int n3;
        if (co.cd) {
            return;
        }
        main.a.c(eh2);
        eh2.a(-cw.j, -cw.k);
        if (!main.a.a) {
            n3 = 0;
            while (n3 < bb.g[e].size()) {
                ek ek2 = (ek)bb.g[e].elementAt(n3);
                if (ek2.c != -1 && ek2.h == 1) {
                    ek2.a(eh2);
                }
                ++n3;
            }
        }
        dx.a(eh2);
        n3 = 30;
        if (main.a.A == 128) {
            n3 = 20;
        }
        int n4 = h[e][f];
        int n5 = i[e];
        int n6 = j[e];
        eh2.a(dx.y, this.l, this.m + this.n, 3);
        bk bk2 = cw.y[n4];
        bk bk3 = cw.y[n5];
        bk bk4 = cw.y[n6];
        er.b(eh2, bk2.a[co.bT[this.p][0][0]].a, this.l + co.bT[this.p][0][1] + bk2.a[co.bT[this.p][0][0]].b, this.m - co.bT[this.p][0][2] + bk2.a[co.bT[this.p][0][0]].c + this.n, 0, 0);
        er.b(eh2, bk3.a[co.bT[this.p][1][0]].a, this.l + co.bT[this.p][1][1] + bk3.a[co.bT[this.p][1][0]].b, this.m - co.bT[this.p][1][2] + bk3.a[co.bT[this.p][1][0]].c + this.n, 0, 0);
        er.b(eh2, bk4.a[co.bT[this.p][2][0]].a, this.l + co.bT[this.p][2][1] + bk4.a[co.bT[this.p][2][0]].b, this.m - co.bT[this.p][2][2] + bk4.a[co.bT[this.p][2][0]].c + this.n, 0, 0);
        if (!main.a.a) {
            n2 = 0;
            while (n2 < bb.g[e].size()) {
                ek ek3 = (ek)bb.g[e].elementAt(n2);
                if (ek3.c != -1 && ek3.h == 3) {
                    ek3.a(eh2);
                }
                ++n2;
            }
        }
        eh2.a(-eh2.a(), -eh2.b());
        if (main.a.A < 200) {
            bj.b(cw.bY, cw.bX, cw.bZ, cw.ca, eh2);
            er.b(eh2, bk2.a[co.bT[0][0][0]].a, main.a.A / 2 + co.bT[0][0][1] + bk2.a[co.bT[0][0][0]].b, cw.bX + 30 + n3 * 3 - co.bT[0][0][2] + bk2.a[co.bT[0][0][0]].c + this.n, 0, 0);
            er.b(eh2, bk3.a[co.bT[0][1][0]].a, main.a.A / 2 + co.bT[0][1][1] + bk3.a[co.bT[0][1][0]].b, cw.bX + 30 + n3 * 3 - co.bT[0][1][2] + bk3.a[co.bT[0][1][0]].c + this.n, 0, 0);
            er.b(eh2, bk4.a[co.bT[0][2][0]].a, main.a.A / 2 + co.bT[0][2][1] + bk4.a[co.bT[0][2][0]].b, cw.bX + 30 + n3 * 3 - co.bT[0][2][2] + bk4.a[co.bT[0][2][0]].c + this.n, 0, 0);
            n2 = 0;
            while (n2 < ch.aL.length) {
                if (g == n2) {
                    eh2.a(cw.bJ, 0, 0, 13, 16, 2, cw.bY + 10 + (main.a.w % 7 > 3 ? 1 : 0), cw.bX + 35 + n2 * n3, dv.f);
                    eh2.a(cw.bJ, 0, 0, 13, 16, 0, cw.bY + cw.bZ - 10 - (main.a.w % 7 > 3 ? 1 : 0), cw.bX + 35 + n2 * n3, dv.f);
                }
                ev.f.a(eh2, ch.aL[n2], cw.bY + 20, cw.bX + 30 + n2 * n3, 0);
                ++n2;
            }
            ev.f.a(eh2, ch.aM[e], cw.bY + 70, cw.bX + 30 + n3 * 1, 0);
            ev.f.a(eh2, ch.fs[e][f], cw.bY + 55, cw.bX + 30 + n3 * 2, 0);
        } else {
            n2 = 110;
            int n7 = 60;
            if (main.a.A > main.a.B) {
                n2 = 100;
                n7 = 45;
            }
            n3 = 0;
            while (n3 < 3) {
                if (n3 != e) {
                    eh2.a(cw.aF, main.a.A / 2 - 78 + n3 * 78, n2, 3);
                } else {
                    if (g == 1) {
                        eh2.a(cw.bJ, 0, 0, 13, 16, 4, main.a.A / 2 - 78 + n3 * 78, n2 - 20 + (main.a.w % 7 > 3 ? 1 : 0), dv.f);
                    }
                    eh2.a(cw.aG, main.a.A / 2 - 78 + n3 * 78, n2, 3);
                }
                ev.f.a(eh2, ch.aM[n3], main.a.A / 2 - 78 + n3 * 78, n2 - 5, 2);
                ++n3;
            }
            n3 = 0;
            while (n3 < 3) {
                if (n3 != f) {
                    eh2.a(cw.aF, main.a.A / 2 - 78 + n3 * 78, n2 + n7, 3);
                } else {
                    if (g == 2) {
                        eh2.a(cw.bJ, 0, 0, 13, 16, 4, main.a.A / 2 - 78 + n3 * 78, n2 + n7 - 20 + (main.a.w % 7 > 3 ? 1 : 0), dv.f);
                    }
                    eh2.a(cw.aG, main.a.A / 2 - 78 + n3 * 78, n2 + n7, 3);
                }
                ev.f.a(eh2, ch.fs[e][n3], main.a.A / 2 - 78 + n3 * 78, n2 + n7 - 5, 2);
                ++n3;
            }
            if (g == 0) {
                eh2.a(cw.bJ, 0, 0, 13, 16, 4, main.a.A / 2, 20 + (main.a.w % 7 > 3 ? 1 : 0), dv.f);
            }
        }
        d.a(eh2);
        eh2.e(0, 0, main.a.A, main.a.B);
        if (this.c != null) {
            this.c.a(eh2);
        }
        super.a(eh2);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                if (d.e().equals("")) {
                    main.a.a(ch.at);
                    return;
                }
                if (d.e().length() < 5) {
                    main.a.a(ch.au);
                    return;
                }
                if (d.e().length() > 15) {
                    main.a.a(ch.av);
                    return;
                }
                da.a();
                cj.a().a(d.e(), e, h[e][f]);
                return;
            }
            case 8001: {
                if (main.a.I.n) {
                    main.a.a(ch.fY, new ae(ch.bo, this, 10019, null), new ae(ch.bp, this, 10020, null));
                    return;
                }
                eb.a().f();
                ds.E = false;
                main.a.ao.a();
                return;
            }
            case 10020: {
                main.a.l();
                return;
            }
            case 10019: {
                eb.a().f();
                main.a.l();
                ds.E = false;
                main.a.ao.a();
                return;
            }
            case 10018: {
                ds.a(-1, true);
                dt.a = false;
                ci.e = false;
                main.a.ap.a();
            }
        }
    }
}

