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

public final class dr
extends ew
implements ao {
    public static boolean a;
    private co b;
    private int c;
    private int d;
    private int e;
    private int f = 45;
    private ae g;
    private int[] h;
    private int[] i;
    private int j;

    private static void a(byte[] byArray) {
        if (main.a.a) {
            return;
        }
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
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public dr() {
        int[] nArray = new int[3];
        nArray[1] = 4;
        nArray[2] = 8;
        this.h = nArray;
        int[] nArray2 = new int[10];
        nArray2[5] = 1;
        nArray2[6] = 1;
        nArray2[7] = 1;
        nArray2[8] = 1;
        nArray2[9] = 1;
        this.i = nArray2;
        this.j = 0;
        try {
            if (!main.a.a) {
                byte[] byArray = new byte[]{39, 40, 41};
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
            dr.a(new byte[]{39, 40, 41});
        }
        catch (Exception exception) {}
        this.d = 168;
        this.e = 350;
        er.c = new bz[32000];
        er.f = new byte[32000];
        er.h = (short)32000;
    }

    public final void a(co co2) {
        this.b = new co();
        this.c = this.b.W = co2.W;
        this.b.cp = co2.cp;
        this.b.co = co2.co;
        this.b.cr = co2.cr;
        this.b.cq = co2.cq;
        this.b.cs = co2.cs;
        this.b.au = co2.au;
        this.a();
    }

    public final void a() {
        main.a.F.a = false;
        main.a.l();
        cw.l().e();
        super.a();
        dr dr2 = this;
        dx.f = new int[bb.e[dr2.c].length];
        int n2 = 0;
        while (n2 < bb.e[dr2.c].length) {
            dx.f[n2] = bb.e[dr2.c][n2];
            ++n2;
        }
        dx.g = bb.f[dr2.c];
        dx.d = bb.d[dr2.c];
        dx.c = bb.c[dr2.c];
        dx.e = bb.c[dr2.c];
        dx.a = bb.a[dr2.c];
        dx.b = bb.b[dr2.c];
        dx.e = dr2.h[dr2.c] + 1;
        dx.h();
        main.a.a(dr2.h[dr2.c]);
        cw.a(dr2.d, dr2.e);
        co.cd = false;
        ds.n = 0;
        this.cA = new ae(ch.by, this, 100, null);
        this.cz = new ae(ch.bC, this, 101, null);
        this.g = new ae(ds.a[ds.p], this, 102, null);
        this.g.j = 1;
        this.g.k = 3;
    }

    public final void a(eh eh2) {
        if (!ci.c) {
            return;
        }
        if (a) {
            return;
        }
        if (co.cd) {
            return;
        }
        main.a.c(eh2);
        eh2.a(-cw.j, -cw.k);
        int n2 = 0;
        while (n2 < bb.g[this.c].size()) {
            ek ek2 = (ek)bb.g[this.c].elementAt(n2);
            if (ek2.c != -1 && ek2.h == 1) {
                ek2.a(eh2);
            }
            ++n2;
        }
        dx.a(eh2);
        eh2.a(dx.y, cw.j + main.a.C, this.e + this.f + 1, 3);
        if (this.b != null) {
            this.b.a(eh2, cw.j + main.a.C, this.e + this.f, 1, this.i[this.j], true);
            ev.d.a(eh2, this.b.au, cw.j + main.a.C, this.e - 15, 2, ev.E);
        }
        eh2.e(0, 0, main.a.A, main.a.B);
        super.a(eh2);
        this.g.a(eh2);
    }

    public final void b() {
        super.b();
        if (!eb.a().d()) {
            a = true;
            ++this.j;
            if (this.j > 50) {
                ds.l();
                this.j = 0;
            }
            return;
        }
        a = false;
        ++this.j;
        if (this.j > this.i.length - 1) {
            this.j = 0;
        }
        if (this.g != null && this.g.c()) {
            this.g.a();
        }
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 100: {
                main.a.ao.m();
                return;
            }
            case 101: {
                ds.E = false;
                main.a.ao.a();
                return;
            }
            case 102: {
                ds.a(-1, true);
                dt.a = false;
                ci.e = false;
                main.a.ap.a();
            }
        }
    }
}

