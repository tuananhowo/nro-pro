/*
 * Decompiled with CFR 0.152.
 */
public final class dw
implements ao {
    int a;
    private int p;
    int b;
    private int q;
    ae c;
    ae d;
    private int r = 24;
    public int e = 0;
    private int s = 50;
    public static br f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public String m;
    private eq t = new eq("vItems");
    int n;
    int o;

    public final void a(boolean bl2) {
        a cfr_ignored_0 = co.m().aw;
        this.k = true;
        this.l = false;
        dw dw2 = this;
        if (dw2.l) {
            dw2.b = 170;
            dw2.q = 118;
            dw2.a = main.a.A / 2 - dw2.b / 2;
            dw2.p = main.a.B / 2 - dw2.q / 2;
        } else {
            dw2.b = 170;
            dw2.q = 170;
            dw2.a = main.a.A / 2 - dw2.b / 2;
            dw2.p = main.a.B / 2 - dw2.q / 2;
            if (main.a.B < 240) {
                dw2.p -= 10;
            }
        }
        dw2.h = dw2.a;
        dw2.g = 0;
        dw2.e = b.f.size();
        if (main.a.e) {
            dw2.c.j = dw2.a;
            dw2.c.k = dw2.p + dw2.q + 5;
            dw2.d.j = dw2.a + dw2.b - 68;
            dw2.d.k = dw2.p + dw2.q + 5;
        }
        f = new br();
        f.a(dw2.e, dw2.r, dw2.a, dw2.p + dw2.s, dw2.b, dw2.q - dw2.s, true, 1);
    }

    private void a() {
        this.g = this.a + this.b;
        er.d();
    }

    public dw() {
        this.c = new ae(ch.by, this, 1, null);
        this.d = new ae(ch.bk, this, 2, null);
    }

    public final void a(eh eh2) {
        eh2.a(-this.h, 0);
        bo.a(eh2, this.a, this.p - 17, this.b, this.q + 17, -1, true);
        ev.f.a(eh2, ch.dC, this.a + this.b / 2, this.p - 7, 2);
        if (this.o >= 0 && this.o <= b.f.size() - 1) {
            b b2 = (b)b.f.elementAt(this.o);
            if (b2.c != null) {
                co.m().a(eh2, b2.c, main.a.A / 2, this.p + 45, 1, false);
            }
        }
        co.m().a(eh2, main.a.A / 2, this.p + 45, 1, co.m().aG, false);
        eh2.e(this.a, this.p + this.s, this.b, this.q - this.s - 10);
        if (f != null) {
            eh2.a(0, -dw.f.d);
        }
        int n2 = 0;
        while (n2 < this.e) {
            int n3 = this.a + 10;
            int n4 = this.p + n2 * this.r + this.s;
            if (n4 + this.r - (f != null ? dw.f.d : 0) >= this.p + this.s && n4 - (f != null ? dw.f.d : 0) <= this.p + this.s + this.q) {
                b b3 = (b)b.f.elementAt(n2);
                ev ev2 = ev.o;
                if (n2 == this.o) {
                    ev2 = ev.q;
                }
                if (b3.b != null) {
                    ev2.a(eh2, b3.b, n3 + 20, n4, 0);
                }
                if (b3.d > 0) {
                    ev2.a(eh2, String.valueOf(b3.d) + " " + ch.bF, n3 + this.b - 20, n4, 1);
                } else if (b3.e > 0) {
                    ev2.a(eh2, String.valueOf(b3.e) + " " + ch.bG, n3 + this.b - 20, n4, 1);
                }
                if (b3.c != null) {
                    er.b(eh2, b3.c[0], n3, n4, 0, 0);
                }
            }
            ++n2;
        }
        eh2.a(0, -eh2.b());
        eh2.e(0, 0, main.a.A, main.a.B);
        bj.a(eh2, this.c, null, this.d);
    }

    public final void a(int n2, Object object) {
        if (n2 == 2) {
            this.a();
        }
        if (n2 == 1 && !this.l && this.o >= 0) {
            this.a();
            if (co.m().aw == null) {
                cj.a().a((byte)2, ((b)b.f.elementAt((int)this.o)).a, this.m);
                return;
            }
            cj.a().a((byte)4, ((b)b.f.elementAt((int)this.o)).a, "");
        }
    }
}

