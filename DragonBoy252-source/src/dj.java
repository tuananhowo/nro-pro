/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class dj
extends cu {
    private String[] e;
    public boolean d;
    private int f;
    private int g = 35;
    private long h = -1L;

    public dj() {
        if (main.a.A <= 176) {
            this.g = 10;
        }
        if (main.a.A > 320) {
            this.g = 80;
        }
    }

    public final void b() {
        this.a(ch.aD, null, null, null);
        main.a.K = this;
        this.h = ej.j() + 5000L;
    }

    public final void c() {
        main.a.K = this;
        this.h = -1L;
    }

    public final void a(String string) {
        this.e = ev.t.a(string, main.a.A - ((this.g << 1) + 20));
        this.f = 80;
        if (this.e.length >= 5) {
            this.f = this.e.length * ev.t.a() + 20;
        }
    }

    public final void a(String string, ae ae2, ae ae3, ae ae4) {
        this.e = ev.t.a(string, main.a.A - ((this.g << 1) + 20));
        this.a = ae2;
        this.b = ae3;
        this.c = ae4;
        this.f = 80;
        if (this.e.length >= 5) {
            this.f = this.e.length * ev.t.a() + 20;
        }
        if (main.a.e) {
            if (ae2 != null) {
                this.a.j = main.a.A / 2 - 68 - 5;
                this.a.k = main.a.B - 50;
            }
            if (ae4 != null) {
                this.c.j = main.a.A / 2 + 5;
                this.c.k = main.a.B - 50;
            }
            if (ae3 != null) {
                this.b.j = main.a.A / 2 - 35;
                this.b.k = main.a.B - 50;
            }
        }
        this.d = false;
        this.h = -1L;
    }

    public final void a(eh eh2) {
        eh2.e(0, 0, main.a.A, main.a.B);
        if (en.c) {
            return;
        }
        int n2 = main.a.B - this.f - 38;
        int n3 = main.a.A - (this.g << 1);
        bj.a(this.g, n2, n3, this.f, eh2);
        n2 = n2 + (this.f - this.e.length * ev.t.a()) / 2 - 2;
        if (this.d) {
            main.a.a(main.a.C, (n2 += 8) - 12, eh2);
        }
        n3 = 0;
        while (n3 < this.e.length) {
            ev.f.a(eh2, this.e[n3], main.a.C, n2, 2);
            ++n3;
            n2 += ev.t.a();
        }
        super.a(eh2);
    }

    public final void a() {
        super.a();
        if (this.h != -1L && ej.j() > this.h) {
            main.a.l();
        }
    }
}

