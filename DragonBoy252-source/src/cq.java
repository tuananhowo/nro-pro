/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class cq
extends ew
implements ao {
    private static cq b;
    public et[] a;
    private int c;
    private int d;
    private int e;
    private int f;
    private String[] g;
    private String h;
    private el i;
    private int j;
    private int k;

    public static cq c() {
        if (b == null) {
            b = new cq();
        }
        return b;
    }

    public final void a() {
        if (ej.c == 5 && this.a.length == 1 || ej.c == 3 && this.a.length == 1) {
            this.i = new el();
            this.i.h = this.h;
            this.i.a.i = this.a[0].f;
            this.i.g = "";
            this.i.b = true;
            this.i.a.c(0);
            if (main.a.e) {
                el el2 = this.i;
                el2.a.a();
                return;
            }
        } else {
            this.j = 0;
            super.a();
        }
    }

    public final void a(int n2, String string) {
        this.k = n2;
        cq cq2 = this;
        this.h = string;
        cq2.e = main.a.A - 20;
        if (cq2.e > 320) {
            cq2.e = 320;
        }
        dq.c("title= " + string);
        cq2.g = ev.f.a(string, cq2.e - 20);
        cq2.c = (main.a.A - cq2.e) / 2;
        cq2.a = new et[cq2.k];
        cq2.f = cq2.a.length * 35 + (cq2.g.length - 1) * 20 + 40;
        cq2.d = main.a.B - cq2.f - 40 - (cq2.g.length - 1) * 20;
        int n3 = 0;
        while (n3 < cq2.a.length) {
            cq2.a[n3] = new et();
            cq2.a[n3].i = "";
            cq2.a[n3].a = cq2.c + 10;
            cq2.a[n3].b = cq2.d + 35 + (cq2.g.length - 1) * 20 + n3 * 35;
            cq2.a[n3].c = cq2.e - 20;
            cq2.a[n3].d = ew.cC + 2;
            cq2.a[0].e = !main.a.e;
            if (!main.a.e) {
                cq2.cB = cq2.a[0].j;
            }
            ++n3;
        }
        cq2.cz = new ae(ch.bk, cq2, 1, null);
        cq2.cA = new ae(ch.bt, cq2, 2, null);
        if (main.a.e) {
            cq2.cA.j = main.a.A / 2 + 18;
            cq2.cz.j = main.a.A / 2 - 85;
            cq2.cA.k = cq2.cz.k = cq2.d + cq2.f + 5;
        }
        this.a();
    }

    public final void a(eh eh2) {
        cw.l().a(eh2);
        bo.a(eh2, this.c, this.d, this.e, this.f, -1, true);
        int n2 = 0;
        while (n2 < this.g.length) {
            ev.g.a(eh2, this.g[n2], main.a.A / 2, this.d + 15 + n2 * 20, 2);
            ++n2;
        }
        n2 = 0;
        while (n2 < this.a.length) {
            this.a[n2].a(eh2);
            ++n2;
        }
        super.a(eh2);
    }

    public final void b() {
        cw.l().b();
        int n2 = 0;
        while (n2 < this.a.length) {
            this.a[n2].d();
            ++n2;
        }
    }

    public final void a(int n2) {
        int n3 = 0;
        while (n3 < this.a.length) {
            if (this.a[n3].e) {
                this.a[n3].a(n2);
                break;
            }
            ++n3;
        }
        super.a(n2);
    }

    public final void d() {
        if (main.a.i[2]) {
            --this.j;
            if (this.j < 0) {
                this.j = this.a.length - 1;
            }
        } else if (main.a.i[8]) {
            ++this.j;
            if (this.j > this.a.length - 1) {
                this.j = 0;
            }
        }
        if (main.a.i[2] || main.a.i[8]) {
            main.a.j();
            int n2 = 0;
            while (n2 < this.a.length) {
                if (this.j == n2) {
                    this.a[n2].e = true;
                    if (!main.a.e) {
                        this.cB = this.a[n2].j;
                    }
                } else {
                    this.a[n2].e = false;
                }
                if (main.a.m && main.a.a(this.a[n2].a, this.a[n2].b, this.a[n2].c, this.a[n2].d)) {
                    this.j = n2;
                    break;
                }
                ++n2;
            }
        }
        super.d();
        main.a.j();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            cw.c.a();
            b = null;
        }
        if (n2 == 2) {
            if (ej.c == 5 && this.a.length == 1 || ej.c == 3 && this.a.length == 1) {
                if (this.i.a.e() == null || this.i.a.e().equals("")) {
                    main.a.a(ch.gm);
                    return;
                }
                this.a[0].a(this.i.a.e());
                cj.a().a(this.a);
                cw.c.a();
                return;
            }
            n2 = 0;
            while (n2 < this.a.length) {
                if (this.a[n2].e() == null || this.a[n2].e().equals("")) {
                    main.a.a(ch.gm);
                    return;
                }
                ++n2;
            }
            cj.a().a(this.a);
            cw.c.a();
        }
    }
}

