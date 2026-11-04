/*
 * Decompiled with CFR 0.152.
 */
import main.GameMidlet;
import main.a;

public final class di
extends ew
implements ao {
    public static di a;
    private et b;
    private et c;
    private int d;
    private int e;
    private int f = main.a.A - 20;
    private int g;
    private String[] h;
    private int i;

    public di() {
        if (this.f > 320) {
            this.f = 320;
        }
        this.h = ev.g.a(ch.bd, this.f - 20);
        this.d = (main.a.A - this.f) / 2;
        this.e = main.a.B - 150 - (this.h.length - 1) * 20;
        this.g = 110 + (this.h.length - 1) * 20;
        this.b = new et();
        this.b.i = ch.bb;
        this.b.a = this.d + 10;
        this.b.b = this.e + 35 + (this.h.length - 1) * 20;
        this.b.c = this.f - 20;
        this.b.d = ew.cC + 2;
        this.b.e = !main.a.e;
        this.b.c(0);
        if (!main.a.e) {
            this.cB = this.b.j;
        }
        this.c = new et();
        this.c.i = ch.bc;
        this.c.a = this.d + 10;
        this.c.b = this.b.b + 35;
        this.c.c = this.f - 20;
        this.c.d = ew.cC + 2;
        this.c.e = false;
        this.c.c(0);
        this.cz = new ae(ch.bk, this, 1, null);
        this.cA = new ae(ch.be, this, 2, null);
        if (main.a.e) {
            this.cA.j = main.a.A / 2 + 18;
            this.cz.j = main.a.A / 2 - 85;
            this.cA.k = this.cz.k = this.e + this.g + 5;
        }
    }

    public static di c() {
        if (a == null) {
            a = new di();
        }
        return a;
    }

    public final void a() {
        this.i = 0;
        try {
            if (ch.fE == 0) {
                GameMidlet.g.platformRequest("http://ngocrongonline.com/");
            }
            if (ch.fE == 2) {
                GameMidlet.g.platformRequest("http://dragonball.indonaga.com/");
            }
            if (ch.fE == 1) {
                GameMidlet.g.platformRequest("http://world.teamobi.com/games-page-0.html");
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void a(eh eh2) {
        cw.l().a(eh2);
        bo.a(eh2, this.d, this.e, this.f, this.g, -1, true);
        int n2 = 0;
        while (n2 < this.h.length) {
            ev.g.a(eh2, this.h[n2], main.a.A / 2, this.e + 15 + n2 * 20, 2);
            ++n2;
        }
        this.b.a(eh2);
        this.c.a(eh2);
        super.a(eh2);
    }

    public final void b() {
        cw.l().b();
        this.b.d();
        this.c.d();
    }

    public final void a(int n2) {
        if (this.b.e) {
            this.b.a(n2);
        } else if (this.c.e) {
            this.c.a(n2);
        }
        super.a(n2);
    }

    public final void d() {
        if (main.a.i[2]) {
            --this.i;
            if (this.i < 0) {
                this.i = 1;
            }
        } else if (main.a.i[8]) {
            ++this.i;
            if (this.i > 1) {
                this.i = 1;
            }
        }
        if (main.a.i[2] || main.a.i[8]) {
            main.a.j();
            if (this.i == 1) {
                this.b.e = false;
                this.c.e = true;
                if (!main.a.e) {
                    this.cB = this.c.j;
                }
            } else if (this.i == 0) {
                this.b.e = true;
                this.c.e = false;
                if (!main.a.e) {
                    this.cB = this.b.j;
                }
            } else {
                this.b.e = false;
                this.c.e = false;
            }
        }
        if (main.a.m) {
            if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
                this.i = 0;
            } else if (main.a.a(this.c.a, this.c.b, this.c.c, this.c.d)) {
                this.i = 1;
            }
        }
        super.d();
        main.a.j();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            cw.c.a();
            a = null;
        }
        if (n2 == 2) {
            if (this.b.e() == null || this.b.e().equals("")) {
                main.a.a(ch.bf);
                return;
            }
            if (this.c.e() == null || this.c.e().equals("")) {
                main.a.a(ch.bg);
                return;
            }
            cj.a().a(this.b.e(), this.c.e());
            cw.c.a();
            a = null;
        }
    }
}

