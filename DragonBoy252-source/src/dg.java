/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class dg {
    public boolean a;
    private eq f;
    public int b;
    public int c;
    public int d;
    private int g;
    private int h;
    private static int[] i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private ae n = new ae(ch.by, 0);
    private ae o = new ae(ch.bk, 0, main.a.A - 71, main.a.B - ew.cE + 1);
    private ae p = null;
    private static Image q;
    private static Image r;
    private boolean s;
    public int e;
    private int t;
    private int u;
    private int v;
    private int[] w = new int[3];
    private boolean x;
    private boolean y;
    private int z;
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private boolean F;
    private boolean[] G;

    static {
        q = ej.b("/mainImage/myTexture2dbtMenu1.png");
        r = ej.b("/mainImage/myTexture2dbtMenu2.png");
    }

    public final void a(eq eq2, int n2) {
        this.a(eq2);
        this.s = true;
    }

    public final void a(eq eq2, int n2, int n3) {
        this.a(eq2);
        this.c = n2;
        this.d = n3;
        while (this.d + this.h > main.a.B) {
            this.d -= 2;
        }
    }

    public final void a(eq eq2) {
        if (this.a) {
            return;
        }
        this.F = false;
        this.B = false;
        this.C = false;
        this.e = 0;
        if (eq2.size() == 1) {
            this.b = 0;
            ae ae2 = (ae)eq2.elementAt(0);
            if (ae2 != null && ae2.b.equals(ch.cH)) {
                ae2.a();
                this.a = false;
                da.a();
                return;
            }
        }
        es.a();
        es.r();
        this.G = new boolean[eq2.size()];
        int n2 = 0;
        while (n2 < this.G.length) {
            this.G[n2] = false;
            ++n2;
        }
        this.s = false;
        g.m = null;
        j.y.removeAllElements();
        j.A.removeAllElements();
        da.c();
        if (eq2.size() == 0) {
            return;
        }
        this.f = eq2;
        this.g = 60;
        this.h = 60;
        n2 = 0;
        while (n2 < eq2.size()) {
            ae ae3 = (ae)eq2.elementAt(n2);
            ((ae)eq2.elementAt(n2)).f = false;
            ev.n.a(ae3.b);
            ae3.c = ev.n.a(ae3.b, this.g - 10);
            ++n2;
        }
        i = new int[eq2.size()];
        this.c = (main.a.A - eq2.size() * this.g) / 2;
        if (this.c <= 0) {
            this.c = 1;
        }
        this.d = main.a.B - this.h - (bj.a + 1) - 1;
        if (main.a.e) {
            this.d -= 3;
        }
        this.d += 27;
        n2 = 0;
        while (n2 < i.length) {
            dg.i[n2] = main.a.B;
            ++n2;
        }
        this.a = true;
        this.b = 0;
        l = this.f.size() * this.g - main.a.A;
        if (l < 0) {
            l = 0;
        }
        j = 0;
        k = 0;
        m = 50;
        this.t = eq2.size() * this.g - 1;
        if (this.t > main.a.A - 2) {
            this.t = main.a.A - 2;
        }
        if (main.a.e) {
            this.b = -1;
        }
    }

    private boolean c() {
        return !this.F && i[i.length - 1] > this.d || this.F && i[i.length - 1] < main.a.B;
    }

    public final void a() {
        int n2;
        if (cw.l().bp && cw.l().bm) {
            return;
        }
        if (!this.a) {
            return;
        }
        if (this.c()) {
            return;
        }
        int n3 = 0;
        if (main.a.i[2] || main.a.i[4]) {
            n3 = 1;
            --this.b;
            if (this.b < 0) {
                this.b = this.f.size() - 1;
            }
        } else if (main.a.i[8] || main.a.i[6]) {
            n3 = 1;
            ++this.b;
            if (this.b > this.f.size() - 1) {
                this.b = 0;
            }
        } else if (main.a.i[5]) {
            this.z = 2;
        } else if (main.a.i[12] && !cw.l().t()) {
            if (this.c()) {
                return;
            }
            if (this.n.e > 0) {
                int cfr_ignored_0 = this.n.e;
                Object cfr_ignored_1 = this.n.o;
            } else {
                this.z = 2;
            }
            es.a();
            es.o();
        } else if (!cw.l().t() && !this.s && (main.a.i[13] || ew.a(this.o))) {
            if (this.c()) {
                return;
            }
            if (!this.C) {
                this.C = true;
            }
            this.F = true;
            es.a();
            es.o();
        }
        if (n3 != 0) {
            j = this.b * this.g + this.g - main.a.A / 2;
            if (j > l) {
                j = l;
            }
            if (j < 0) {
                j = 0;
            }
            if (this.b == this.f.size() - 1 || this.b == 0) {
                k = j;
            }
        }
        n3 = 1;
        if (main.a.G.ai != null && main.a.G.ai.v) {
            if (!main.a.a(main.a.G.ai.e, 0, main.a.G.ai.a + 2, main.a.G.ai.g)) {
                n3 = 1;
            } else {
                n3 = 0;
                main.a.G.ai.c();
            }
        }
        if (!(this.s || !main.a.m || main.a.b(this.c, this.d, this.t, this.h) || this.x || cw.l().t() || n3 == 0)) {
            if (this.c()) {
                return;
            }
            this.v = 0;
            this.u = 0;
            this.x = false;
            main.a.p();
            this.F = true;
            this.C = true;
            es.a();
            es.o();
            return;
        }
        if (main.a.k) {
            if (!this.x && main.a.b(this.c, this.d, this.t, this.h)) {
                n3 = 0;
                while (n3 < this.w.length) {
                    this.w[0] = main.a.p;
                    ++n3;
                }
                this.v = main.a.p;
                this.x = true;
                this.y = this.A != 0;
                this.A = 0;
            } else if (this.x) {
                ++this.u;
                if (this.u > 5 && this.v == main.a.p && !this.y) {
                    this.v = -1000;
                    this.b = (j + main.a.p - this.c) / this.g;
                }
                if ((n3 = main.a.p - this.w[0]) != 0 && this.b != -1) {
                    this.b = -1;
                }
                n2 = this.w.length - 1;
                while (n2 > 0) {
                    this.w[n2] = this.w[n2 - 1];
                    --n2;
                }
                this.w[0] = main.a.p;
                if ((j -= n3) < 0) {
                    j = 0;
                }
                if (j > l) {
                    j = l;
                }
                if (k < 0 || k > l) {
                    n3 /= 2;
                }
                k = k - n3;
            }
        }
        if (main.a.m && this.x) {
            n3 = main.a.p - this.w[0];
            main.a.m = false;
            if (dq.g(n3) < 20 && dq.g(main.a.p - this.v) < 20 && !this.y) {
                this.A = 0;
                j = k;
                this.v = -1000;
                this.b = (j + main.a.p - this.c) / this.g;
                this.u = 0;
                this.z = 10;
            } else if (this.b != -1 && this.u > 5) {
                this.u = 0;
                this.z = 1;
            } else if (this.b == -1 && !this.y) {
                if (k < 0) {
                    j = 0;
                } else if (k > l) {
                    j = l;
                } else {
                    n2 = main.a.p - this.w[0] + (this.w[0] - this.w[1]) + (this.w[1] - this.w[2]);
                    n2 = n2 > 10 ? 10 : (n2 < -10 ? -10 : 0);
                    this.A = -n2 * 100;
                }
            }
            this.x = false;
            this.u = 0;
            main.a.m = false;
        }
        main.a.j();
        main.a.k();
    }

    public final void a(eh eh2) {
        if (cw.l().bp && cw.l().bm) {
            return;
        }
        eh2.a(-eh2.a(), -eh2.b());
        eh2.a(-k, 0);
        int n2 = 0;
        while (n2 < this.f.size()) {
            if (n2 == this.b) {
                eh2.a(r, this.c + n2 * this.g + 1, i[n2] + 1, 0);
            } else {
                eh2.a(q, this.c + n2 * this.g + 1, i[n2] + 1, 0);
            }
            ae ae2 = (ae)this.f.elementAt(n2);
            String[] stringArray = ae2.c;
            if (ae2.c == null) {
                stringArray = new String[]{((ae)this.f.elementAt((int)n2)).b};
            }
            int n3 = i[n2] + (this.h - stringArray.length * 14) / 2 + 1;
            int n4 = 0;
            while (n4 < stringArray.length) {
                if (n2 == this.b) {
                    ev.g.a(eh2, stringArray[n4], this.c + n2 * this.g + this.g / 2, n3 + n4 * 14, 2);
                } else if (ae2.a) {
                    ev.a.a(eh2, stringArray[n4], this.c + n2 * this.g + this.g / 2, n3 + n4 * 14, 2);
                } else {
                    ev.f.a(eh2, stringArray[n4], this.c + n2 * this.g + this.g / 2, n3 + n4 * 14, 2);
                }
                ++n4;
            }
            ++n2;
        }
        eh2.a(-eh2.a(), -eh2.b());
    }

    public final void b() {
        dg dg2 = this;
        if (dg2.A != 0 && !dg2.x) {
            if ((j += dg2.A / 100) < 0) {
                j = 0;
            } else if (j > l) {
                j = l;
            } else {
                k = j;
            }
            dg2.A = dg2.A * 9 / 10;
            if (dg2.A < 100 && dg2.A > -100) {
                dg2.A = 0;
            }
        }
        if (k != j && !dg2.x) {
            dg2.D = j - k << 2;
            dg2.E += dg2.D;
            k += dg2.E >> 4;
            dg2.E &= 0xF;
        }
        if (!this.F) {
            ++this.e;
            int n2 = 0;
            while (n2 < i.length) {
                if (i[n2] > this.d) {
                    int n3 = i[n2] - this.d >> 1;
                    if (n3 <= 0) {
                        n3 = 1;
                    }
                    if (this.e > n2) {
                        int n4 = n2;
                        i[n4] = i[n4] - n3;
                    }
                }
                ++n2;
            }
            if (i[i.length - 1] <= this.d) {
                this.e = 0;
            }
        } else {
            ++this.e;
            int n5 = 0;
            while (n5 < i.length) {
                if (i[n5] < main.a.B) {
                    int n6 = (main.a.B - i[n5] >> 1) + 2;
                    if (n6 <= 0) {
                        n6 = 1;
                    }
                    if (this.e > n5) {
                        int n7 = n5;
                        i[n7] = i[n7] + n6;
                    }
                }
                ++n5;
            }
            if (i[i.length - 1] >= main.a.B) {
                this.e = 0;
                Object object = this;
                this.F = false;
                ((dg)object).a = false;
                da.c();
                if (((dg)object).C) {
                    main.a.G.ai = null;
                    co.J = null;
                    if (main.a.H != null && main.a.H.ai != null) {
                        main.a.H.ai = null;
                    }
                } else if (((dg)object).B) {
                    main.a.G.ai = null;
                    if (main.a.H != null && main.a.H.ai != null) {
                        main.a.H.ai = null;
                    }
                    if (((dg)object).b >= 0 && (object = (ae)((dg)object).f.elementAt(((dg)object).b)) != null) {
                        es.a();
                        es.o();
                        ((ae)object).a();
                    }
                }
            }
        }
        if (m != 0 && (m >>= 1) < 0) {
            m = 0;
        }
        if (this.c()) {
            return;
        }
        if (this.z > 0) {
            --this.z;
            if (this.z == 0) {
                if (this.b >= 0 && !this.G[this.b]) {
                    this.F = true;
                    this.B = true;
                    main.a.G.ai = null;
                    return;
                }
                Object object = this;
                da.c();
                if (((dg)object).b >= 0 && (object = (ae)((dg)object).f.elementAt(((dg)object).b)) != null) {
                    ((ae)object).a();
                }
            }
        }
    }
}

