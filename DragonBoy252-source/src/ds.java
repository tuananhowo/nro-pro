/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import main.GameMidlet;
import main.a;

public final class ds
extends ew
implements ao {
    public static String[] a;
    private static String[] F;
    public static byte b;
    private static short[] G;
    private static int H;
    public static boolean c;
    public static byte[] d;
    public static byte[] e;
    public static co[] f;
    public static boolean g;
    private ae[] I;
    private ae J;
    private int K;
    public static byte[] h;
    public static byte[] i;
    public static ae j;
    private static String L;
    private static String M;
    private static String N;
    private static String O;
    private static String P;
    private static String Q;
    public static String k;
    public static boolean l;
    public static String m;
    public static int n;
    public static boolean o;
    private static int R;
    private static String S;
    public static int p;
    public static volatile int q;
    public static int r;
    public static long s;
    public static int t;
    private static int T;
    private static long U;
    public static boolean u;
    public static int v;
    public static String w;
    public static int x;
    public static int y;
    public static boolean z;
    private static ae V;
    public static volatile int A;
    private static long W;
    public static boolean B;
    public static boolean C;
    public static String D;
    private static String X;
    public static boolean E;

    static {
        L = "V\u0169 tr\u1ee5 1:dragon1.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 2:dragon2.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 3:dragon3.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 4:dragon4.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 5:dragon5.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 6:dragon6.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 7:dragon7.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 8:dragon10.teamobi.com:14446:0:0:0,V\u0169 tr\u1ee5 9:dragon10.teamobi.com:14447:0:0:0,V\u0169 tr\u1ee5 10:dragon10.teamobi.com:14445:0:0:0,V\u0169 tr\u1ee5 11:dragon11.teamobi.com:14445:0:0:0,V\u00f5 \u0111\u00e0i li\u00ean v\u0169 tr\u1ee5:dragonwar.teamobi.com:20000:0:0:0,Universe 1:dragon.indonaga.com:14445:1:0:0,Naga:dragon.indonaga.com:14446:2:0:0,0,0";
        M = "V\u0169 tr\u1ee5 1:112.213.94.23:14445:0:0:0,V\u0169 tr\u1ee5 2:210.211.109.199:14445:0:0:0,V\u0169 tr\u1ee5 3:112.213.85.88:14445:0:0:0,V\u0169 tr\u1ee5 4:27.0.12.164:14445:0:0:0,V\u0169 tr\u1ee5 5:27.0.12.16:14445:0:0:0,V\u0169 tr\u1ee5 6:27.0.12.173:14445:0:0:0,V\u0169 tr\u1ee5 7:112.213.94.223:14445:0:0:0,V\u0169 tr\u1ee5 8:27.0.14.66:14446:0:0:0,V\u0169 tr\u1ee5 9:27.0.14.66:14447:0:0:0,V\u0169 tr\u1ee5 10:27.0.14.66:14445:0:0:0,V\u0169 tr\u1ee5 11:112.213.85.35:14445:0:0:0,V\u00f5 \u0111\u00e0i li\u00ean v\u0169 tr\u1ee5:27.0.12.173:20000:0:0:0,Universe 1:52.74.230.22:14445:1:0:0,Naga:52.74.230.22:14446:2:0:0,0,0";
        N = "Naga:dragon.indonaga.com:14446:2:0:0,2,0";
        O = "Naga:52.74.230.22:14446:2:0:0,2,0";
        P = "Universe 1:dragon.indonaga.com:14445:1:0:0,1,0";
        Q = "Universe 1:52.74.230.22:14445:1:0:0,1,0";
        k = M;
        S = "NRlink3";
        z = false;
        A = -1;
        D = "svselect";
        X = "NRlink_extra";
    }

    private static void o() {
        if (j == null) {
            if (main.a.ao == null) {
                main.a.ao = new ds();
            }
            j = new ae("", main.a.ao, 14, null);
        }
        ds.j.e = 14;
        if (ds.j.d == null && main.a.ao != null) {
            ds.j.d = main.a.ao;
        }
        ds.j.j = main.a.A - 85;
        ds.j.k = main.a.B - 30;
        ds.j.l = 85;
        ds.j.m = 30;
    }

    public ds() {
        System.getProperty("com.sonyericsson.imei");
        this.p();
        if (!main.a.e) {
            H = 0;
            this.q();
        }
        cw.a(-1, -1);
        cw.j = 100;
        cw.k = 200;
        if (this.J == null) {
            this.J = new ae("G\u1ecdi hotline", this, 13, null);
            this.J.j = main.a.A - 75;
            this.J.k = ej.c == 1 && !main.a.e ? main.a.B - 20 : 8;
        }
        int n2 = 0;
        if (0 == 2) {
            k = ej.c == 1 ? O : N;
        } else if (n2 == 1) {
            k = Q;
            k = ej.c == 1 ? Q : P;
        } else {
            k = M;
            k = ej.c == 1 ? M : L;
        }
        ej.a();
    }

    private void p() {
        this.K = 0;
        String string = ea.c(ea.e);
        if (string == null ? ea.b(String.valueOf(ea.d) + p) != null : !string.equals("") || ea.b(String.valueOf(ea.d) + p) != null) {
            this.K = 1;
        }
        String string2 = a != null && p >= 0 && p < a.length ? a[p] : "";
        string2 = String.valueOf(ch.aK) + ": " + string2;
        this.I = new ae[4 + this.K];
        int n2 = main.a.D - 15 * this.I.length + 28;
        int n3 = 0;
        while (n3 < this.I.length) {
            switch (n3) {
                case 0: {
                    this.I[0] = new ae("", this, 3, null);
                    if (string == null) {
                        this.I[0].b = ch.gk;
                        if (ea.b(String.valueOf(ea.d) + p) == null) break;
                        this.I[0].b = ch.q;
                        break;
                    }
                    if (string.equals("")) {
                        this.I[0].b = ch.gk;
                        if (ea.b(String.valueOf(ea.d) + p) == null) break;
                        this.I[0].b = ch.q;
                        break;
                    }
                    this.I[0].b = String.valueOf(ch.gl) + ": " + string;
                    if (this.I[0].b.length() <= 23) break;
                    this.I[0].b = this.I[0].b.substring(0, 23);
                    this.I[0].b = String.valueOf(this.I[0].b) + "...";
                    break;
                }
                case 1: {
                    if (this.K == 1) {
                        this.I[1] = new ae("", this, 10100, null);
                        this.I[1].b = ch.gk;
                        break;
                    }
                    this.I[1] = new ae(ch.U, this, 7, null);
                    break;
                }
                case 2: {
                    if (this.K == 1) {
                        this.I[2] = new ae(ch.U, this, 7, null);
                        break;
                    }
                    this.I[2] = new ae(string2, this, 17, null);
                    break;
                }
                case 3: {
                    if (this.K == 1) {
                        this.I[3] = new ae(string2, this, 17, null);
                        break;
                    }
                    this.I[3] = new ae(ch.bW, this, 8, null);
                    break;
                }
                case 4: {
                    this.I[4] = new ae(ch.bW, this, 8, null);
                }
            }
            this.I[n3].k = n2;
            this.I[n3].b();
            this.I[n3].j = (main.a.A - this.I[n3].l) / 2;
            n2 += 30;
            ++n3;
        }
        if (this.I != null && this.I.length > 2 + this.K && this.I[2 + this.K] != null) {
            this.I[2 + this.K].b = string2;
        }
    }

    public static void c() {
        ds.a(k);
    }

    public static void a(String string) {
        String[] stringArray = dq.a(string.trim(), ",", 0);
        dq.c(">>> getServerList= " + string);
        ch.a(Byte.parseByte(stringArray[stringArray.length - 2]));
        a = new String[stringArray.length - 2];
        F = new String[stringArray.length - 2];
        G = new short[stringArray.length - 2];
        d = new byte[stringArray.length - 2];
        h = new byte[stringArray.length - 2];
        i = new byte[stringArray.length - 2];
        int n2 = 0;
        while (n2 < stringArray.length - 2) {
            String[] stringArray2 = dq.a(stringArray[n2].trim(), ":", 0);
            ds.a[n2] = stringArray2[0];
            ds.F[n2] = stringArray2[1];
            ds.G[n2] = Short.parseShort(stringArray2[2]);
            ds.d[n2] = Byte.parseByte(stringArray2[3].trim());
            try {
                ds.h[n2] = Byte.parseByte(stringArray2[4].trim());
            }
            catch (Exception exception) {
                ds.h[n2] = 0;
            }
            try {
                ds.i[n2] = Byte.parseByte(stringArray2[5].trim());
            }
            catch (Exception exception) {
                ds.i[n2] = 0;
            }
            ++n2;
        }
        b = Byte.parseByte(stringArray[stringArray.length - 1]);
        dq.c(">>> getServerList= serverPriority: " + b);
        n2 = -1;
        if (GameMidlet.a != null && GameMidlet.b > 0) {
            if (p >= 0 && p < F.length && GameMidlet.a.equals(F[p]) && GameMidlet.b == G[p]) {
                n2 = p;
            } else {
                int n3 = 0;
                while (n3 < F.length) {
                    if (GameMidlet.a.equals(F[n3]) && GameMidlet.b == G[n3]) {
                        n2 = n3;
                        break;
                    }
                    ++n3;
                }
            }
        }
        if (n2 >= 0) {
            p = n2;
        } else if (p < 0 || p >= a.length) {
            int n4 = ea.d(D);
            if (n4 < 0 || n4 >= a.length) {
                n4 = b >= 0 && b < a.length ? (int)b : 0;
            }
            p = n4;
        }
        if (p >= 0 && p < a.length) {
            ea.a(D, p);
        }
        ds.r();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(eh eh2) {
        if (!B) {
            eh2.a(0);
            eh2.d(0, 0, main.a.A, main.a.B);
        } else {
            if (!main.a.aa || main.a.N == null) {
                main.a.a(0);
            }
            main.a.c(eh2);
        }
        ev.s.a(eh2, "v2.5.2(" + eh.b + ")", main.a.A - 2, 17, 1, ev.o);
        try {
            String string = "";
            string = A == 0 ? String.valueOf(string) + a[p] + " [disconnect]" : (A == -1 ? String.valueOf(string) + a[p] + " [connecting...]" : String.valueOf(string) + a[p] + " [connected]");
            ev.s.a(eh2, string, main.a.A - 2, 32, 1, ev.o);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (!z || B) {
            if (ej.c == 1 && !main.a.e) {
                ev.s.a(eh2, m, main.a.A - 2, main.a.B - 15, 1, ev.o);
            } else {
                ev.s.a(eh2, m, main.a.A - 2, 2, 1, ev.o);
            }
        } else {
            ev.s.a(eh2, m, main.a.A - 2, 2, 1, ev.o);
        }
        int n2 = 0;
        ds.b(eh2);
        if (!B) {
            if (u) return;
            eh2.a(en.j, main.a.C, main.a.D - 32, 3);
            if (!z) {
                ev.c.a(eh2, ch.gf, main.a.C, main.a.D + 24, 2);
                if (V == null) return;
                V.a(eh2);
                return;
            }
            if (V != null) {
                V.a(eh2);
            }
            eh2.e(0, 0, main.a.A, main.a.B);
            ev.c.a(eh2, String.valueOf(ch.aF) + v + "%", main.a.A / 2, main.a.D + 24, 2);
            cw.a(cw.ak, cw.al, cw.am, main.a.A / 2 - 50, main.a.D + 45, 100, 100.0f, eh2);
            cw.a(cw.ah, cw.ai, cw.aj, main.a.A / 2 - 50, main.a.D + 45, 100, v, eh2);
            return;
        }
        n2 = main.a.D - 15 * this.I.length - 15;
        if (n2 < 25) {
            n2 = 25;
        }
        if (en.j != null) {
            eh2.a(en.j, main.a.C, n2, 3);
        }
        n2 = this.I.length;
        int n3 = 0;
        while (n3 < n2) {
            this.I[n3].a(eh2);
            ++n3;
        }
        eh2.e(0, 0, main.a.A, main.a.B);
        if (this.I == null || this.I.length <= 2 + this.K || this.I[2 + this.K] == null) return;
        if (cw.ag == null) {
            cw.ag = ej.b("/mainImage/myTexture2dstat.png");
        }
        if (cw.ag == null || this.I[2 + this.K].b == null || this.I[2 + this.K].b.equals("")) return;
        n3 = 0;
        if (eb.a().e || eb.a().d()) {
            n3 = 1;
        }
        if (A == 2 && eb.a().d()) {
            n3 = 2;
        }
        n2 = ev.f.a(this.I[2 + this.K].b);
        n2 = (main.a.A - n2 >> 1) - 10;
        int n4 = this.I[2 + this.K].k + 9;
        eh2.a(cw.ag, 0, n3 * 7, 7, 7, 0, n2, n4, 0);
    }

    public final void b() {
        ae ae2;
        ae ae3;
        if (o) {
            if (++R == 50) {
                main.a.ao.i();
                o = false;
            }
            if (R == 100) {
                if (main.a.I == null) {
                    main.a.I = new en();
                }
                main.a.I.c();
                cj.a().w();
                o = false;
            }
        }
        if (q > 0) {
            if (A == 2 && eb.a().d()) {
                q = 0;
                s = 0L;
                if (t > 0) {
                    T = t;
                    t = 0;
                }
                main.a.l();
            } else if (ej.j() >= s && !eb.a().d() && !eb.a().e) {
                q = 0;
                s = 0L;
                main.a.l();
                ae3 = new ae(ch.bu, this, 20, null);
                ae2 = new ae(ch.bk, this, 21, null);
                main.a.a(ch.y, ae3, ae2);
            }
        }
        if (T > 0 && U > 0L && B && A == 2 && eb.a().d() && ej.j() - U >= 25000L && !cj.a().g()) {
            U = 0L;
            q = 0;
            s = 0L;
            main.a.l();
            ae3 = new ae(ch.bu, this, 20, null);
            ae2 = new ae(ch.bk, this, 21, null);
            main.a.a(ch.y, ae3, ae2);
        }
        int n2 = 0;
        while (n2 < this.I.length) {
            this.I[n2].n = n2 == H;
            ++n2;
        }
        ++cw.j;
        if (!B && (u || v == 100)) {
            V = null;
        }
        if (!B && z && y == 0 && !l && A == 2 && eb.a().d() && ej.j() > W) {
            W = ej.j() + 3000L;
            cj.a().b((byte)1, null);
        }
        super.b();
    }

    private void q() {
        dq.c("load Screen= " + B + " select= " + H);
        if (B) {
            this.cA = new ae("", this, this.I[ds.H].e, null);
            return;
        }
        this.cA = V;
    }

    public static void b(eh eh2) {
        if (j != null) {
            ev.s.a(eh2, ch.gi, main.a.A - 2, main.a.B - 15, 1, ev.o);
        }
    }

    public static void e() {
        if (j == null) {
            ds.o();
        }
        if (j != null) {
            if (ds.j.d == null) {
                ds.j.d = main.a.ao != null ? main.a.ao : (main.a.E instanceof ds ? (ds)main.a.E : null);
            }
            ds.j.e = 14;
            ds.j.j = main.a.A - 85;
            ds.j.k = main.a.B - 30;
            ds.j.l = 85;
            ds.j.m = 30;
            if (j.c()) {
                j.a();
            }
        }
    }

    public final void d() {
        if (main.a.e) {
            ds.e();
            if (this.J != null && this.J.c()) {
                this.J.a();
            }
            if (!B) {
                if (V != null && V.c()) {
                    V.a();
                }
                super.d();
                return;
            }
            int n2 = this.I.length;
            int n3 = 0;
            while (n3 < n2) {
                if (this.I[n3] != null && this.I[n3].c()) {
                    this.I[n3].a();
                }
                ++n3;
            }
        } else {
            if (ej.c == 1 && main.a.i[13]) {
                main.a.i[13] = false;
                this.J.a();
            }
            if (B) {
                int n4;
                if (main.a.i[8]) {
                    n4 = this.I.length - 1;
                    main.a.i[8] = false;
                    if (++H > n4) {
                        H = 0;
                    }
                    this.q();
                }
                if (main.a.i[2]) {
                    n4 = this.I.length - 1;
                    main.a.i[2] = false;
                    if (--H < 0) {
                        H = n4;
                    }
                    this.q();
                }
            }
        }
        super.d();
    }

    private static void r() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(ch.fE);
            dataOutputStream.writeByte(a.length);
            int n2 = 0;
            while (n2 < a.length) {
                dataOutputStream.writeUTF(a[n2]);
                dataOutputStream.writeUTF(F[n2]);
                dataOutputStream.writeShort(G[n2]);
                dataOutputStream.writeByte(d[n2]);
                try {
                    dataOutputStream.writeByte(h[n2]);
                }
                catch (Exception exception) {
                    dataOutputStream.writeByte(0);
                }
                try {
                    dataOutputStream.writeByte(i[n2]);
                }
                catch (Exception exception) {
                    dataOutputStream.writeByte(0);
                }
                ++n2;
            }
            dataOutputStream.writeByte(b);
            ea.a(S, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void f() {
        Object object = ea.b(S);
        if (object == null) {
            ds.a(k);
            du.e();
            return;
        }
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        try {
            ch.a(object.readByte());
            int n2 = object.readByte();
            a = new String[n2];
            F = new String[n2];
            G = new short[n2];
            d = new byte[n2];
            h = new byte[n2];
            i = new byte[n2];
            int n3 = 0;
            while (n3 < n2) {
                ds.a[n3] = object.readUTF();
                ds.F[n3] = object.readUTF();
                ds.G[n3] = object.readShort();
                ds.d[n3] = object.readByte();
                try {
                    ds.h[n3] = object.readByte();
                }
                catch (Exception exception) {
                    ds.h[n3] = 0;
                }
                try {
                    ds.i[n3] = object.readByte();
                }
                catch (Exception exception) {
                    ds.i[n3] = 0;
                }
                ++n3;
            }
            b = object.readByte();
            object.close();
            du.e();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void a() {
        String string;
        t = 0;
        main.a.f();
        ds.o();
        aj.b();
        cw.k = 0;
        cw.j = 0;
        this.p();
        c = false;
        main.a.I = null;
        String string2 = ea.c(ea.a);
        int n2 = string2 != null && string2 != "" ? Integer.parseInt(string2) : -1;
        if (n2 > 0) {
            B = true;
            main.a.a(0);
        }
        u = true;
        String string3 = string = a != null && p >= 0 && p < a.length ? a[p] : "";
        if (this.I != null && this.I.length > 2 + this.K && this.I[2 + this.K] != null) {
            this.I[2 + this.K].b = String.valueOf(ch.aK) + ": " + string;
        }
        if (this.I != null && H >= 0 && H < this.I.length && this.I[H] != null) {
            this.cA = new ae("", this, this.I[ds.H].e, null);
        }
        if (this.I != null && this.I.length > 1 + this.K && this.I[1 + this.K] != null) {
            this.I[1 + this.K].b = ch.U;
        }
        if (this.I != null && this.I.length == 4 + this.K && this.I[3 + this.K] != null) {
            this.I[3 + this.K].b = ch.bW;
        }
        co.cd = false;
        ej.b();
        super.a();
    }

    public final void g() {
        String string;
        t = 0;
        cw.k = 0;
        cw.j = 0;
        this.p();
        c = false;
        main.a.I = null;
        String string2 = ea.c(ea.a);
        int n2 = string2 != null && string2 != "" ? Integer.parseInt(string2) : -1;
        if (n2 > 0) {
            B = true;
            main.a.a(0);
        }
        u = true;
        String string3 = string = a != null && p >= 0 && p < a.length ? a[p] : "";
        if (this.I != null && this.I.length > 2 + this.K && this.I[2 + this.K] != null) {
            this.I[2 + this.K].b = String.valueOf(ch.aK) + ": " + string;
        }
        if (this.I != null && H >= 0 && H < this.I.length && this.I[H] != null) {
            this.cA = new ae("", this, this.I[ds.H].e, null);
        }
        if (this.I != null && this.I.length > 1 + this.K && this.I[1 + this.K] != null) {
            this.I[1 + this.K].b = ch.U;
        }
        if (this.I != null && this.I.length == 4 + this.K && this.I[3 + this.K] != null) {
            this.I[3 + this.K].b = ch.bW;
        }
        super.a();
    }

    public final void h() {
        if (main.a.ao == null) {
            main.a.ao = new ds();
        }
        y = 0;
        v = 0;
        l = true;
        main.a.ao.k();
        z = false;
        ds.V.n = true;
        this.cA = new ae("", this, 2, null);
    }

    public final void i() {
        ds.j();
        t = 0;
        if (F != null && G != null && d != null && p >= 0 && p < F.length && p < G.length && p < d.length && GameMidlet.a != null && GameMidlet.a.equals(F[p]) && GameMidlet.b == G[p] && A == 2 && eb.a().d() && cj.a().g()) {
            q = 0;
            s = 0L;
            GameMidlet.e = d[p];
            if (d[p] != ch.fE) {
                ch.a(d[p]);
            }
            ea.a(D, p);
            this.p();
            B = true;
            c = false;
            main.a.l();
            return;
        }
        q = 1;
        s = ej.j() + 1000L;
        main.a.b(ch.aD);
        cj.a().e();
        eb.a().f();
        eb.b().f();
        GameMidlet.c = null;
        GameMidlet.d = 0;
        GameMidlet.h = false;
        GameMidlet.a = F[p];
        GameMidlet.b = G[p];
        GameMidlet.e = d[p];
        ea.a(D, p);
        if (d[p] != ch.fE) {
            ch.a(d[p]);
        }
        this.p();
        if (this.I != null && this.I.length > 2 + this.K && this.I[2 + this.K] != null && a != null && p >= 0 && p < a.length) {
            this.I[2 + this.K].b = String.valueOf(ch.aK) + ": " + a[p];
        }
        B = true;
        A = -1;
        ds.l();
    }

    public final void a(int n2, Object object) {
        dq.c("perform trong ServerListScreen" + n2);
        if (n2 == 1000) {
            main.a.b();
        }
        if (n2 == 1 || n2 == 4) {
            ds.j();
            cj.a().e();
            l = true;
            z = false;
            y = 0;
            v = 0;
            eb.a().f();
            eb.b().f();
            A = 0;
            q = 0;
            s = 0L;
            t = 0;
            B = true;
            u = true;
            c = false;
            main.a.I = null;
            main.a.l();
            cw.j = 0;
            cw.k = 0;
            co.cd = false;
            this.p();
            Object object2 = object = a != null && p >= 0 && p < a.length ? a[p] : "";
            if (this.I != null && this.I.length > 2 + this.K && this.I[2 + this.K] != null) {
                this.I[2 + this.K].b = String.valueOf(ch.aK) + ": " + (String)object;
            }
            ej.b();
            main.a.a(0);
            super.a();
            ds.l();
        }
        if (n2 == 2) {
            l = false;
            V = new ae(ch.gg, this, 4, null);
            new ae(ch.gg, this, 4, null).j = main.a.A / 2 - ew.cD / 2;
            ds.V.k = main.a.D + 65;
            this.cB = null;
            if (!main.a.e) {
                ds.V.j = main.a.A / 2 - ew.cD / 2;
                ds.V.k = main.a.B - ew.cE - 1;
            }
            this.cA = new ae("", this, 4, null);
            if (!z) {
                if (!eb.a().d()) {
                    ds.l();
                }
                cj.a().b((byte)1, null);
                W = ej.j() + 3000L;
                if (!main.a.e) {
                    ds.V.n = true;
                    this.cA = new ae("", this, 4, null);
                }
                z = true;
            }
        }
        if (n2 == 3) {
            this.b(3);
        }
        if (n2 == 10100) {
            this.b(10100);
        }
        if (n2 == 5) {
            ds.c();
            if (a.length == 1) {
                return;
            }
            object = new eq("");
            int n3 = 0;
            while (n3 < a.length) {
                ((eq)object).addElement(new ae(a[n3], this, 6, null));
                ++n3;
            }
            main.a.F.a((eq)object);
            if (!main.a.e) {
                main.a.F.b = p;
            }
        }
        if (n2 == 6) {
            ds.a(main.a.F.b, false);
            this.i();
        }
        if (n2 == 7) {
            ds.j();
            cj.a().f();
            t = 0;
            if (main.a.I == null) {
                main.a.I = new en();
            }
            main.a.I.a();
        }
        if (n2 == 8) {
            boolean bl2 = ea.d("lowGraphic") == 1;
            eq eq2 = new eq("cau hinh");
            eq2.addElement(new ae(ch.z, this, 9, null));
            eq2.addElement(new ae(ch.A, this, 10, null));
            eq2.addElement(new ae(ch.B, this, 14, null));
            main.a.F.a(eq2);
            main.a.F.b = bl2 ? 0 : 1;
        }
        if (n2 == 9) {
            ea.a("lowGraphic", 1);
            main.a.a(ch.cP, 8885, null);
        }
        if (n2 == 10) {
            ea.a("lowGraphic", 0);
            main.a.a(ch.cP, 8885, null);
        }
        if (n2 == 11) {
            if (main.a.I == null) {
                main.a.I = new en();
            }
            main.a.I.a();
            String string = ea.c(String.valueOf(ea.d) + p);
            if (string == null || string.equals("")) {
                en.o = true;
                cj.a().f("");
            } else {
                main.a.I.n = true;
                en.o = true;
                main.a.b();
                cj.a().a(string, "", "2.5.2", (byte)1);
            }
            main.a.b(ch.aD);
            dq.c("tao user ao");
        }
        if (n2 == 12) {
            GameMidlet.g.a();
        }
        if (n2 == 13 && (!z || B)) {
            switch (ej.c) {
                case 1: {
                    ej.c();
                    break;
                }
                case 3: 
                case 5: {
                    ej.d();
                    break;
                }
                case 6: {
                    ej.e();
                    break;
                }
                case 2: {
                    ej.k();
                }
            }
        }
        if (n2 == 14) {
            ae ae2 = new ae(ch.bo, this, 15, null);
            ae ae3 = new ae(ch.bp, this, 16, null);
            main.a.a(ch.gj, ae2, ae3);
        }
        if (n2 == 15) {
            ea.a();
            main.a.a(ch.cP, 8885, null);
        }
        if (n2 == 16) {
            da.c();
            main.a.K = null;
        }
        if (n2 == 17) {
            t = 0;
            if (main.a.ap == null) {
                main.a.ap = new dt();
            }
            main.a.ap.a();
        }
        if (n2 == 18) {
            main.a.l();
            da.c();
            if (main.a.ap == null) {
                main.a.ap = new dt();
            }
            main.a.ap.a();
        }
        if (n2 == 19) {
            if (ej.c == 1) {
                da.c();
                main.a.K = null;
            } else {
                A = 0;
            }
        }
        if (n2 == 20) {
            int n4 = t > 0 ? t : T;
            if (n4 > 0) {
                ds.j();
                cj.a().f();
                cj.a().e();
                eb.a().f();
                eb.b().f();
                this.b(n4);
            } else {
                this.i();
            }
        }
        if (n2 == 21) {
            ds.j();
            cj.a().f();
            cj.a().e();
            eb.a().f();
            eb.b().f();
            q = 0;
            s = 0L;
            t = 0;
            main.a.l();
        }
    }

    private void b(int n2) {
        boolean bl2;
        if (a != null && a.length > 0 && (p < 0 || p >= a.length)) {
            ds.a(b >= 0 && b < a.length ? (int)b : 0, true);
        }
        boolean bl3 = bl2 = T == n2;
        if (!(T == 0 && t == 0 || bl2)) {
            return;
        }
        if (cj.a().g()) {
            this.c(n2);
            return;
        }
        T = n2;
        U = ej.j();
        t = n2;
        main.a.b(ch.aD);
        if (eb.a().d()) {
            return;
        }
        if (eb.a().e) {
            q = 1;
            s = ej.j() + 1000L;
            return;
        }
        q = 1;
        s = ej.j() + 1000L;
        main.a.b(ch.aD);
        cj.a().e();
        eb.a().f();
        A = 0;
        ds.l();
    }

    private void c(int n2) {
        if (n2 == 3) {
            ds.m();
            return;
        }
        if (n2 == 10100) {
            cw.c();
            if (main.a.I == null) {
                main.a.I = new en();
            }
            main.a.I.a();
            en.o = true;
            cj.a().f("");
            dq.c("tao user ao");
            main.a.m();
            if (a != null && p >= 0 && p < a.length) {
                en.i = a[p];
            }
        }
    }

    public static boolean a(boolean bl2) {
        if (T == 0 || !cj.a().g()) {
            return false;
        }
        int n2 = T;
        ds.j();
        if (!bl2) {
            return true;
        }
        if (main.a.ao == null) {
            main.a.ao = new ds();
        }
        main.a.ao.c(n2);
        return true;
    }

    public static void j() {
        T = 0;
        U = 0L;
        t = 0;
    }

    public final void k() {
        t = 0;
        q = 0;
        s = 0L;
        main.a.l();
        ds.o();
        cw.j = 0;
        cw.k = 0;
        this.p();
        B = false;
        v = 0;
        u = false;
        z = false;
        y = 0;
        co.cd = false;
        ds ds2 = this;
        if (!B) {
            V = new ae(ch.gh, ds2, 2, null);
            new ae(ch.gh, ds2, 2, null).n = true;
            ds.V.j = main.a.A / 2 - ew.cD / 2;
            ds.V.k = main.a.D + 45;
            if (ds.V.k > main.a.B - 26) {
                ds.V.k = main.a.B - 26;
            }
        }
        if (!main.a.e) {
            H = 0;
            ds2.q();
        }
        super.a();
    }

    public static void l() {
        if (F == null || G == null || p < 0 || p >= F.length || p >= G.length) {
            dq.b("ConnectIP: invalid ipSelect = " + p);
            return;
        }
        GameMidlet.a = F[p];
        GameMidlet.b = G[p];
        if (d != null && p < d.length) {
            ch.a(d[p]);
        }
        if (a != null && p < a.length) {
            en.i = a[p];
        }
        main.a.b();
    }

    public static void a(int n2, boolean bl2) {
        dq.b(">>>>SetIpSelect: " + n2 + "  save:" + bl2);
        int n3 = p;
        if (a != null && a.length > 0) {
            if (n2 < 0 || n2 >= a.length) {
                n2 = b >= 0 && b < a.length ? (int)b : 0;
            }
        } else if (n2 < 0) {
            n2 = 0;
        }
        p = n2;
        if (n3 != n2) {
            cj.a().e();
            ds.j();
        }
        if (bl2) {
            ea.a(D, p);
            dq.b("2>>>saveRMSInt:  RMS_svselect == " + p);
        }
    }

    public static void m() {
        cw.c();
        if (main.a.I == null) {
            main.a.I = new en();
        }
        main.a.I.a();
        boolean bl2 = false;
        boolean bl3 = false;
        String string = ea.c(String.valueOf(ea.d) + p);
        try {
            if (!ea.c(ea.e).equals("")) {
                bl2 = true;
            }
            if (!string.equals("")) {
                bl3 = true;
            }
        }
        catch (Exception exception) {}
        main.a.b();
        if (!bl2 && !bl3) {
            main.a.b();
            if (string == null || string.equals("")) {
                en.o = true;
                cj.a().f("");
            } else {
                main.a.I.n = true;
                en.o = true;
                cj.a().a(string, "", "2.5.2", (byte)1);
            }
            ea.a(D, p);
            if (eb.a().d) {
                main.a.m();
            } else {
                main.a.a(ch.cP, 8884, null);
            }
        } else {
            main.a.I.c();
        }
        en.i = a[p];
    }

    public static void n() {
        if (e == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte((byte)e.length);
            int n2 = 0;
            while (n2 < e.length) {
                dataOutputStream.writeByte(e[n2]);
                if (e[n2] >= 0 && f != null && f[n2] != null) {
                    dataOutputStream.writeShort((short)ds.f[n2].cp);
                    dataOutputStream.writeShort((short)ds.f[n2].cr);
                    dataOutputStream.writeShort((short)ds.f[n2].cq);
                    dataOutputStream.writeShort((short)ds.f[n2].cs);
                    dataOutputStream.writeUTF(ds.f[n2].au);
                }
                ++n2;
            }
            ea.a(X, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

