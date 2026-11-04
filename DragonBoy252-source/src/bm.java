/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bm {
    private co b;
    private af c;
    private eq d = new eq("vDARTS");
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = 0;
    private int m = 0;
    private boolean n = false;
    private boolean o = true;
    public bw a;

    public bm(co object, int n2, bw bw2, int n3, int n4) {
        this.a = bw2;
        this.b = object;
        this.c = cw.x[n2];
        this.h = this.c.i;
        this.i = n3;
        this.j = n4;
        object = ((co)object).be == null ? ((co)object).bi : ((co)object).be;
        n2 = dq.a(object.b() - n3, object.c() - n4);
        object = this;
        this.e = n2;
        ((bm)object).f = ((bm)object).h * dq.b(n2) >> 10;
        ((bm)object).g = ((bm)object).h * dq.a(n2) >> 10;
    }

    public final void a() {
        if (!this.o) {
            return;
        }
        if (this.b.be == null && this.b.bi == null) {
            this.b();
            return;
        }
        cy cy2 = this.b.be == null ? this.b.bi : this.b.be;
        int n2 = 0;
        while (n2 < this.c.h) {
            if (this.c.c.length > 0) {
                this.d.addElement(new v(this.i, this.j));
            }
            int n3 = this.b.b() > cy2.b() ? 10 : -10;
            this.l = cy2.b() + n3 - this.i;
            this.m = cy2.c() - cy2.d() / 2 - this.j;
            ++this.k;
            if (dq.g(this.l) < 20 && dq.g(this.m) < 20) {
                if (this.b.bi != null && this.b.bi.aE) {
                    this.b.bi.a(this.b.bi.aq, 0L, this.b.bi.as, this.b.bi.ar);
                }
                this.b();
                return;
            }
            n3 = dq.a(this.l, this.m);
            if (Math.abs(n3 - this.e) < 90 || this.l * this.l + this.m * this.m > 4096) {
                this.e = Math.abs(n3 - this.e) < 15 ? n3 : (n3 - this.e >= 0 && n3 - this.e < 180 || n3 - this.e < -180 ? dq.c(this.e + 15) : dq.c(this.e - 15));
            }
            if (this.h < 8192) {
                this.h += 1024;
            }
            this.f = this.h * dq.b(this.e) >> 10;
            this.g = this.h * dq.a(this.e) >> 10;
            this.l += this.f;
            n3 = this.l >> 10;
            this.i += n3;
            this.l &= 0x3FF;
            this.m += this.g;
            n3 = this.m >> 10;
            this.j += n3;
            this.m &= 0x3FF;
            ++n2;
        }
        n2 = 0;
        while (n2 < this.d.size()) {
            v v2 = (v)this.d.elementAt(n2);
            ++v2.a;
            if (v2.a >= this.c.c.length) {
                this.d.removeElementAt(n2);
            }
            ++n2;
        }
    }

    private void b() {
        dq.c("END ME!");
        if (!this.b.cJ && this.i >= cw.j && this.i <= cw.j + main.a.A) {
            es.a();
            es.w();
        }
        this.b.G();
        if (this.b.aE) {
            bm bm2 = this;
            bm2.b.s();
        }
        if (this.b.cJ) {
            this.b.cJ = false;
            if (this.b.ce && this.b.aE && this.b.T != 14 && this.b.T != 5) {
                this.b.ce = false;
            }
            if (this.b.W == 2) {
                int n2 = this.b.aE ? co.m().aQ.b : this.b.bd;
                if (n2 < 77 || n2 > 83) {
                    cw.l().b(this.i, this.j);
                }
            } else {
                cw.l().b(this.i, this.j);
            }
        }
        this.b.cE = null;
        this.b.cF = false;
        this.b.cG = null;
        this.b.cH = null;
        this.b.E();
    }

    public final void a(eh eh2) {
        v v2;
        if (!this.o) {
            return;
        }
        int n2 = t.a(360 - this.e);
        byte by2 = t.c[n2];
        n2 = t.b[n2];
        int n3 = this.d.size() / 2;
        while (n3 < this.d.size()) {
            v v3 = (v)this.d.elementAt(n3);
            er.b(eh2, this.c.d[v3.a], v3.b, v3.c, 0, 3);
            ++n3;
        }
        n3 = main.a.w % this.c.b.length;
        er.b(eh2, this.c.b[n3][by2], this.i, this.j, n2, 3);
        int n4 = 0;
        while (n4 < this.d.size()) {
            v2 = (v)this.d.elementAt(n4);
            er.b(eh2, this.c.c[v2.a], v2.b, v2.c, 0, 3);
            ++n4;
        }
        er.b(eh2, this.c.a[n3][by2], this.i, this.j, n2, 3);
        n4 = 0;
        while (n4 < this.d.size()) {
            v2 = (v)this.d.elementAt(n4);
            if (dq.g(t.a.nextInt(100)) < this.c.g) {
                er.b(eh2, main.a.w % 2 == 0 ? this.c.e[v2.a] : this.c.f[v2.a], v2.b, v2.c, 0, 3);
            }
            ++n4;
        }
        eh2.a(0xFF0000);
    }
}

