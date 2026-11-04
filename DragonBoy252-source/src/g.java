/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class g
extends j
implements ao {
    public int a = 100;
    public int b;
    public int c;
    public String[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public bg i;
    private static long D;
    private static long E;
    private int F;
    private String[] G;
    public ae j;
    public ae k;
    public ae l;
    public static g m;
    public static g n;
    private static String H;
    private static bg I;
    public byte o = 0;
    public byte p = 0;
    public static br q;
    private static boolean J;
    public int r;
    private int K;
    private static int L;
    private int M;
    public boolean[] s = new boolean[20];
    public static int t;
    private int N = 0;
    private int O = 0;
    private int P = 0;
    private Image Q;
    public int u;
    public boolean v = false;
    public static int w;
    private int R = 0;
    private int S = 0;

    static {
        t = 7;
    }

    public static void a() {
        m = null;
        n = null;
        co.J = null;
        co.cc = false;
        H = null;
        I = null;
        q = null;
        J = false;
        if (cw.aO != null) {
            cw.aO.f = true;
        }
        g.a(j.y);
        g.a(j.A);
    }

    private static void a(eq eq2) {
        if (eq2 == null) {
            return;
        }
        int n2 = eq2.size() - 1;
        while (n2 >= 0) {
            if (eq2.elementAt(n2) instanceof g) {
                eq2.removeElementAt(n2);
            }
            --n2;
        }
    }

    public static void a(String string, bg bg2) {
        H = string;
        I = bg2;
        if (m == null) {
            g.b(H, 100000, I);
            H = null;
            I = null;
        }
    }

    public static void a(String stringArray, int n2, bg bg2) {
        stringArray = new String[]{stringArray};
        if (bg2.V != 5 && cw.aO.e) {
            cw.aO.f = false;
        }
        co.cc = true;
        n = g.c(stringArray[0], 100000, bg2);
        g.c(stringArray[0], 100000, bg2).u = 5;
        g.n.e = main.a.A / 2 - g.n.a / 2 - 1;
        g.n.f = main.a.B - 20 - g.n.g;
        g.n.F = 0;
        g.n.G = stringArray;
        q = new br();
        int n3 = g.n.d.length;
        q.a(n3, 12, g.n.e, g.n.f - g.n.u + 12, g.n.a + 2, g.n.g - 25, true, 1);
        es.a();
        es.u();
    }

    public static void b(String stringArray, int n2, bg bg2) {
        dq.c("chat= " + (String)stringArray);
        stringArray = dq.a((String)stringArray, "\n", 0);
        co.cc = true;
        m = g.c(stringArray[0], 100000, bg2);
        g.c(stringArray[0], 100000, bg2).F = 0;
        g.m.G = stringArray;
        String string = ch.bm;
        if (stringArray.length == 1) {
            string = ch.bk;
        }
        g.m.j = new ae(string, m, 8000, null);
        g.m.j.j = main.a.A / 2 - 35;
        g.m.j.k = main.a.B - 35;
        es.a();
        es.u();
    }

    public static g c(String string, int n2, bg bg2) {
        dq.c("ADD POP");
        dq.c(co.m().bh != null ? "!null" : "null");
        L = 10;
        g g2 = new g();
        new g().a = main.a.A - 30 - (main.a.F.a ? main.a.F.c : 0);
        if (g2.a > 320) {
            g2.a = 320;
        }
        if (string.length() < 10) {
            g2.a = 64;
        }
        if (main.a.A == 128) {
            g2.a = 128;
        }
        g2.d = ev.p.a(string, g2.a - 10);
        g2.b = n2;
        g2.i = bg2;
        co.J = g2;
        g2.g = 15 - g2.c + g2.d.length * 12 + 10;
        if (g2.g > main.a.B - 80) {
            g2.g = main.a.B - 80;
        }
        boolean cfr_ignored_0 = main.a.F.a;
        j.y.addElement(g2);
        J = false;
        if (bg2 != null && bg2.V == 5) {
            J = true;
            cw.aO.a("", 1);
        }
        D = E = ej.j();
        return g2;
    }

    public static g a(String string, int n2, bg bg2, int n3) {
        dq.c("ADD POP");
        dq.c(co.m().bh != null ? "!null" : "null");
        L = 10;
        g g2 = new g();
        new g().a = main.a.A - 30 - (main.a.F.a ? main.a.F.c : 0);
        if (g2.a > 320) {
            g2.a = 320;
        }
        if (string.length() < 10) {
            g2.a = 64;
        }
        if (main.a.A == 128) {
            g2.a = 128;
        }
        g2.d = ev.p.a(string, g2.a - 10);
        g2.b = 100000;
        g2.i = bg2;
        g2.K = 5820;
        co.J = g2;
        g2.g = 15 - g2.c + g2.d.length * 12 + 10;
        if (g2.g > main.a.B - 80) {
            g2.g = main.a.B - 80;
        }
        boolean cfr_ignored_0 = main.a.F.a;
        j.y.addElement(g2);
        J = false;
        if (bg2 != null && bg2.V == 5) {
            J = true;
            cw.aO.a("", 1);
        }
        g2.g += 15;
        D = E = ej.j();
        return g2;
    }

    public final void b() {
        if (q != null) {
            cw.aO.f = false;
            q.b();
        } else {
            cw.aO.f = true;
        }
        if (main.a.F.a) {
            this.u = 0;
            this.e = main.a.A / 2 - this.a / 2 - 1;
            this.f = main.a.F.d - this.g;
        } else {
            this.u = 0;
            if (cw.l().cB != null || cw.l().cz != null || cw.l().cA != null || this.j != null || this.k != null) {
                this.u = 5;
                this.e = main.a.A / 2 - this.a / 2 - 1;
                this.f = main.a.B - 20 - this.g;
            } else {
                this.e = main.a.A / 2 - this.a / 2 - 1;
                this.f = main.a.B - 5 - this.g;
            }
        }
        if (this.b > 0) {
            --this.b;
        }
        if (L > 0) {
            --L;
        } else {
            cw.aO.b.e = 0;
            int n2 = 0;
            while (n2 < cw.aO.b.a.size()) {
                if (((db)cw.aO.b.a.elementAt((int)n2)).b != 70) {
                    ((db)cw.aO.b.a.elementAt((int)n2)).b = 10;
                }
                ++n2;
            }
        }
        if (this.c > 1) {
            --this.c;
        }
        if (this.i != null && co.J != null && co.J != this || this.i != null && co.J == null || this.b <= 0) {
            j.A.removeElement(this);
            j.y.removeElement(this);
        }
    }

    public final void a(eh object) {
        int n2;
        Object object2;
        if (cw.l().bp && cw.l().bm) {
            return;
        }
        main.a.a((eh)object);
        int n3 = this.e;
        int n4 = this.f;
        int n5 = this.a + 2;
        int n6 = this.g;
        if (!(n3 > 0 && n4 > 0 || main.a.G.a)) {
            return;
        }
        int n7 = 0;
        if (this.i != null) {
            n7 = main.a.w % 10 > 2 ? 0 : 1;
            er.b((eh)object, this.i.bc, this.e + 14, this.f + n7, 0, dv.d);
        }
        if (this.K != 0) {
            n7 = main.a.w % 10 > 2 ? 0 : 1;
            er.b((eh)object, this.K, this.e + n5 / 2, this.f + this.g - 15 + n7, 0, dv.f);
        }
        bo.a((eh)object, n3, n4, n5, n6, 0xFFFFFF, false);
        if (q != null) {
            ((eh)object).e(n3, n4, n5, n6 - 16);
            ((eh)object).a(0, -g.q.d);
        }
        n7 = 0;
        int n8 = 0;
        if (this.v) {
            n7 = ((eh)object).a();
            n8 = ((eh)object).b();
            ((eh)object).e(n3, n4 + 1, n5, n6 - 17);
            ((eh)object).a(0, -w);
        }
        int n9 = -1;
        int n10 = 0;
        while (n10 < this.d.length) {
            if (this.d[n10].startsWith("--")) {
                ((eh)object).a(0);
                ((eh)object).d(n3 + 10, this.f + this.c + n10 * 12 + 6, n5 - 20, 1);
            } else {
                int n11;
                object2 = ev.k;
                n2 = 2;
                Object object3 = this.d[n10];
                if (this.d[n10].startsWith("|")) {
                    String[] stringArray = dq.a(this.d[n10], "|", 0);
                    if (stringArray.length == 3) {
                        object3 = stringArray[2];
                    }
                    if (stringArray.length == 4) {
                        object3 = stringArray[3];
                        n2 = Integer.parseInt(stringArray[2]);
                    }
                    n9 = n11 = Integer.parseInt(stringArray[1]);
                } else {
                    n11 = n9;
                }
                switch (n11) {
                    case -1: {
                        object2 = ev.k;
                        break;
                    }
                    case 0: {
                        object2 = ev.f;
                        break;
                    }
                    case 1: {
                        object2 = ev.h;
                        break;
                    }
                    case 2: {
                        object2 = ev.b;
                        break;
                    }
                    case 3: {
                        object2 = ev.p;
                        break;
                    }
                    case 4: {
                        object2 = ev.r;
                        break;
                    }
                    case 5: {
                        object2 = ev.q;
                        break;
                    }
                    case 7: {
                        object2 = ev.a;
                        break;
                    }
                    case 8: {
                        object2 = ev.d;
                        break;
                    }
                    case 9: {
                        object2 = ev.d;
                    }
                }
                if (this.d[n10].startsWith("<")) {
                    String[] stringArray = dq.a(this.d[n10], "<", 0);
                    object3 = dq.a(stringArray[1], ">", 1);
                    if (this.M == 0) {
                        this.M = Integer.parseInt(object3[1]);
                    } else {
                        D = ej.j();
                        if (D - E >= 1000L) {
                            E = D;
                            --this.M;
                        }
                    }
                    object3 = String.valueOf(this.M) + " " + object3[2];
                    ((ev)object2).a((eh)object, (String)object3, this.e + this.a / 2, this.f + this.c + n10 * 12 - this.u + 12, n2);
                } else {
                    if (n2 == 2) {
                        ((ev)object2).a((eh)object, (String)object3, this.e + this.a / 2, this.f + this.c + n10 * 12 - this.u + 12, n2);
                    }
                    if (n2 == 1) {
                        ((ev)object2).a((eh)object, (String)object3, this.e + this.a - 5, this.f + this.c + n10 * 12 - this.u + 12, n2);
                    }
                }
            }
            ++n10;
        }
        if (this.v) {
            main.a.a((eh)object);
            ((eh)object).a(n7, n8);
        }
        if (this.p > 4) {
            this.O = (this.p + 1) / 2;
            this.N = this.p - this.O;
            int[] nArray = new int[this.p];
            object2 = new int[this.p];
            n2 = 0;
            while (n2 < this.O) {
                ((eh)object).a(dl.s, n3 + n5 / 2 - this.O * 20 / 2 + n2 * 20 + eh.a(dl.s), n4 + n6 - 17, 3);
                nArray[n2] = n3 + n5 / 2 - this.O * 20 / 2 + n2 * 20 + eh.a(dl.s);
                object2[n2] = n4 + n6 - 17;
                ++n2;
            }
            n2 = 0;
            while (n2 < this.N) {
                ((eh)object).a(dl.s, n3 + n5 / 2 - this.N * 20 / 2 + n2 * 20 + eh.a(dl.s), n4 + n6 - 8, 3);
                nArray[this.O + n2] = n3 + n5 / 2 - this.N * 20 / 2 + n2 * 20 + eh.a(dl.s);
                object2[this.O + n2] = n4 + n6 - 8;
                ++n2;
            }
            dq.b(String.valueOf(this.p) + "maxStarSlot");
            if (this.p >= 7) {
                int n12 = 7;
                while (n12 < this.p) {
                    if (this.s[n12]) {
                        ((eh)object).a(dl.u, nArray[n12], (int)object2[n12], 3);
                    }
                    ++n12;
                }
            }
            if (this.o > 0) {
                this.Q = dl.r;
                if (this.o >= this.O) {
                    this.P = this.o - this.O;
                    n2 = 0;
                    while (n2 < this.O) {
                        ((eh)object).a(this.Q, n3 + n5 / 2 - this.O * 20 / 2 + n2 * 20 + eh.a(this.Q), n4 + n6 - 17, 3);
                        ++n2;
                    }
                    n2 = 0;
                    while (n2 < this.P) {
                        if (n2 + this.O >= t) {
                            this.Q = dl.t;
                        }
                        ((eh)object).a(this.Q, n3 + n5 / 2 - this.N * 20 / 2 + n2 * 20 + eh.a(this.Q), n4 + n6 - 8, 3);
                        ++n2;
                    }
                } else {
                    n2 = 0;
                    while (n2 < this.o) {
                        ((eh)object).a(this.Q, n3 + n5 / 2 - this.O * 20 / 2 + n2 * 20 + eh.a(this.Q), n4 + n6 - 17, 3);
                        ++n2;
                    }
                }
            }
        } else {
            n10 = 0;
            while (n10 < this.p) {
                ((eh)object).a(dl.s, n3 + n5 / 2 - this.p * 20 / 2 + n10 * 20 + eh.a(dl.s), n4 + n6 - 13, 3);
                ++n10;
            }
            if (this.o > 0) {
                n10 = 0;
                while (n10 < this.o) {
                    ((eh)object).a(dl.r, n3 + n5 / 2 - this.p * 20 / 2 + n10 * 20 + eh.a(dl.r), n4 + n6 - 13, 3);
                    ++n10;
                }
            }
        }
        eh eh2 = object;
        object = this;
        eh2.a(-eh2.a(), -eh2.b());
        eh2.e(0, 0, main.a.A, main.a.B);
        main.a.M.a();
        if (((g)object).j != null) {
            bj.a(eh2, null, ((g)object).j, null);
        }
        if (((g)object).k != null) {
            bj.a(eh2, ((g)object).k, null, ((g)object).l);
        }
    }

    public final void a(eh eh2, int n2) {
        int n3 = this.e;
        int n4 = this.f;
        int n5 = this.a;
        int n6 = eh2.a();
        int n7 = eh2.b();
        eh2.a(0, -n2);
        if (!(n3 > 0 && n4 > 0 || main.a.G.a)) {
            return;
        }
        n2 = -1;
        n4 = 0;
        while (n4 < this.d.length) {
            if (this.d[n4].startsWith("--")) {
                eh2.a(0xFFFFFF);
                eh2.d(n3 + 10, this.f + this.c + n4 * 12 - 6, n5 - 20, 1);
            } else {
                int n8;
                ev ev2 = ev.s;
                int n9 = 2;
                Object object = this.d[n4];
                if (this.d[n4].startsWith("|")) {
                    String[] stringArray = dq.a(this.d[n4], "|", 0);
                    if (stringArray.length == 3) {
                        object = stringArray[2];
                    }
                    if (stringArray.length == 4) {
                        object = stringArray[3];
                        n9 = Integer.parseInt(stringArray[2]);
                    }
                    n2 = n8 = Integer.parseInt(stringArray[1]);
                } else {
                    n8 = n2;
                }
                switch (n8) {
                    case -1: {
                        ev2 = ev.s;
                        break;
                    }
                    case 0: {
                        ev2 = ev.c;
                        break;
                    }
                    case 1: {
                        ev2 = ev.h;
                        break;
                    }
                    case 2: {
                        ev2 = ev.a;
                    }
                }
                if (this.d[n4].startsWith("<")) {
                    String[] stringArray = dq.a(this.d[n4], "<", 0);
                    object = dq.a(stringArray[1], ">", 1);
                    if (this.M == 0) {
                        this.M = Integer.parseInt(object[1]);
                    } else {
                        D = ej.j();
                        if (D - E >= 1000L) {
                            E = D;
                            --this.M;
                        }
                    }
                    object = String.valueOf(this.M) + " " + object[2];
                    ev2.a(eh2, (String)object, this.e + this.a / 2, this.f + this.c + n4 * 12 - this.u, n9);
                } else {
                    if (n9 == 2) {
                        ev2.a(eh2, (String)object, this.e + this.a / 2, this.f + this.c + n4 * 12 - this.u, n9);
                    }
                    if (n9 == 1) {
                        ev2.a(eh2, (String)object, this.e + this.a - 5, this.f + this.c + n4 * 12 - this.u, n9);
                    }
                }
            }
            ++n4;
        }
        main.a.a(eh2);
        eh2.a(n6, n7);
    }

    private void a(int n2) {
        if ((w += n2 * 12) < 0) {
            w = 0;
        }
        if (w > this.h) {
            w = this.h;
        }
    }

    public final void c() {
        if (this.v) {
            if (main.a.i[8]) {
                main.a.i[8] = false;
                this.a(1);
            }
            if (main.a.i[2]) {
                main.a.i[2] = false;
                this.a(-1);
            }
            if (main.a.a(this.e, 0, this.a + 2, this.g)) {
                if (main.a.n) {
                    if (this.S == 0) {
                        this.S = main.a.q;
                    }
                    this.R = this.S - main.a.q;
                    if (this.R != 0) {
                        w += this.R;
                        this.S = main.a.q;
                    }
                    if (w < 0) {
                        w = 0;
                    }
                    if (w > this.h) {
                        w = this.h;
                    }
                } else {
                    this.S = 0;
                    this.S = 0;
                }
            }
        }
        if (q != null) {
            if (main.a.e) {
                q.a();
            }
            if (main.a.j[2]) {
                g.q.b -= 12;
                if (g.q.b < 0) {
                    g.q.b = 0;
                }
            }
            if (main.a.j[8]) {
                main.a.i[8] = false;
                g.q.b += 12;
                if (g.q.b > g.q.l) {
                    g.q.b = g.q.l;
                }
            }
        }
        if (main.a.i[5] || ew.a(main.a.E.cA)) {
            main.a.i[5] = false;
            ew.cF = -1;
            if (this.j != null) {
                this.j.a();
            } else if (this.k != null) {
                this.k.a();
            } else if (this.l != null) {
                this.l.a();
            }
        }
        if (q != null && g.q.m) {
            return;
        }
        if (this.k != null && (main.a.i[12] || main.a.i[5] || ew.a(this.k))) {
            main.a.i[12] = false;
            main.a.i[5] = false;
            main.a.l = false;
            main.a.m = false;
            this.k.a();
            ew.cF = -1;
        }
        if (this.l != null && (main.a.i[13] || ew.a(this.l))) {
            main.a.i[13] = false;
            main.a.l = false;
            main.a.m = false;
            this.l.a();
            ew.cF = -1;
        }
    }

    public final void a(int n2, Object object) {
        if (n2 == 1000) {
            try {
                GameMidlet.g.platformRequest((String)object);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
            GameMidlet.g.notifyDestroyed();
            main.a.l();
        }
        if (n2 == 1001) {
            q = null;
            co.J = null;
            n = null;
            cw.aO.f = true;
            co.cc = false;
            if (J) {
                cw.aO.b.e = 0;
                cw.aO.b.b.b = 10;
            }
        }
        if (n2 == 8000) {
            if (L > 0) {
                return;
            }
            int n3 = g.m.F;
            if (++n3 >= g.m.G.length) {
                co.J = null;
                m = null;
                cw.aO.f = true;
                co.cc = false;
                if (H != null) {
                    g.b(H, 100000, I);
                    H = null;
                    I = null;
                    return;
                }
                if (J) {
                    cw.aO.b.e = 0;
                    n2 = 0;
                    while (n2 < cw.aO.b.a.size()) {
                        if (((db)cw.aO.b.a.elementAt((int)n2)).b == 10000000) {
                            ((db)cw.aO.b.a.elementAt((int)n2)).b = 10;
                        }
                        ++n2;
                    }
                }
                return;
            }
            g g2 = g.c(g.m.G[n3], g.m.b, g.m.i);
            g.c(g.m.G[n3], g.m.b, g.m.i).F = n3;
            g2.G = g.m.G;
            g2.j = g.m.j;
            m = g2;
        }
    }
}

