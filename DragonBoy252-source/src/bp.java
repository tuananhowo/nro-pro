/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class bp
implements ao {
    public ae a;
    private ae b;
    private String[] c;
    private int d;
    private int e;
    private int f = 120;
    private int g;
    private int h;
    private long i;
    private long j;

    public final void a(String string, ae ae2, ae ae3) {
        this.c = new String[]{string};
        this.g = 29;
        this.a = ae2;
        this.b = ae3;
        this.a.g = this.b.g = cw.bB;
        this.a.h = this.b.h = cw.bC;
        this.a.l = eh.a(ae2.g);
        this.b.l = eh.a(ae2.g);
        this.a.m = eh.b(ae2.g);
        this.b.m = eh.b(ae2.g);
        this.i = System.currentTimeMillis();
        this.h = this.c[0].length() / 3;
        if (this.h < 15) {
            this.h = 15;
        }
        ce.a();
    }

    public final void a(eh eh2) {
        bo.a(eh2, this.d, this.e, this.f, this.g + (!main.a.e ? 10 : 0), 0xFFFFFF, false);
        if (this.c != null) {
            ce.a(eh2, this.c[0], this.d + 5, this.e + this.g / 2 - (main.a.e ? 4 : 6), this.f - 10, this.g, ev.k);
            if (main.a.e) {
                this.a.a(eh2);
                ev.n.a(eh2, String.valueOf(this.h), this.a.j + this.a.l / 2, this.a.k + this.a.m + 5, 2, ev.o);
                return;
            }
            if (et.g) {
                ev.b.a(eh2, String.valueOf(ch.cN) + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
                return;
            }
            ev.b.a(eh2, String.valueOf(ch.cO) + this.h + ")", this.d + this.f / 2, this.e + this.g, 2);
        }
    }

    public final void a() {
        if (this.c != null) {
            this.d = main.a.A - 5 - this.f;
            this.e = 45;
            if (main.a.A - 50 > 155 + this.f) {
                this.d = main.a.A - 55 - this.f;
                this.e = 5;
            }
            this.a.j = this.d - 35;
            this.a.k = this.e;
            this.j = System.currentTimeMillis();
            dq.c("curr - last= " + (this.j - this.i));
            if (this.j - this.i >= 1000L) {
                this.i = System.currentTimeMillis();
                --this.h;
            }
            if (this.h == 0) {
                cw.l().cd = null;
            }
        }
    }

    public final void a(int n2, Object object) {
    }
}

