/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class el
implements ao {
    private static el i;
    public et a;
    public boolean b = false;
    public cx c;
    private long j = 0L;
    public ae d;
    public ae e;
    public ae f = null;
    private int k;
    private int l;
    private int m;
    private int n;
    public String g;
    public String h = String.valueOf(ch.br) + " ";

    public final void a() {
        this.d = new ae(ch.bt, this, 8000, null, 1, main.a.B - ew.cE + 1);
        this.e = new ae(ch.bl, this, 8001, null, main.a.A - 70, main.a.B - ew.cE + 1);
        this.f = null;
        this.m = this.a.c + 28;
        this.n = this.a.d + 26;
        this.k = main.a.A / 2 - this.m / 2;
        this.l = this.a.b - 18;
        if (this.m > 320) {
            this.m = 320;
        }
        this.d.j = this.k;
        this.e.j = this.k + this.m - 68;
        if (main.a.e) {
            this.a.b -= 5;
            this.l -= 20;
            this.n += 30;
            this.d.j = main.a.A / 2 - 68 - 5;
            this.e.j = main.a.A / 2 + 5;
            this.d.k = main.a.B - 30;
            this.e.k = main.a.B - 30;
        }
    }

    public final void a(int n2) {
        if (this.b) {
            this.a.a(n2);
        }
        if (this.a.e().equals("")) {
            this.e.b = ch.bk;
            return;
        }
        this.e.b = ch.bl;
    }

    public static el b() {
        if (i == null) {
            i = new el();
            return i;
        }
        return i;
    }

    public el() {
        this.a = new et();
        this.a.i = ch.br;
        this.a.c = main.a.A - 32;
        if (this.a.c > 250) {
            this.a.c = 250;
        }
        this.a.d = ew.cC + 2;
        this.a.a = main.a.A / 2 - this.a.c / 2;
        this.a.e = true;
        this.a.b(80);
    }

    public final void a(int n2, cx cx2, String string) {
        this.e.b = ch.bk;
        this.g = string;
        this.a.a(n2);
        if (!this.a.e().equals("") && main.a.K == null) {
            this.c = cx2;
            this.b = true;
        }
    }

    public final void a(String string) {
        this.e.b = ch.bk;
        this.g = string;
        if (main.a.K == null) {
            this.b = true;
            if (main.a.e) {
                this.a.b();
            }
        }
    }

    public final void c() {
        if (!this.b) {
            return;
        }
        if (ej.c != 5 && ej.c != 3) {
            this.a.d();
        }
        if (this.a.h) {
            this.a.h = false;
            this.c.a(this.a.e(), this.g);
            this.a.a("");
            this.e.b = ch.bk;
        }
    }

    public final void a(eh eh2) {
        if (!this.b) {
            return;
        }
        if (ej.c == 5 || ej.c == 3) {
            return;
        }
        bo.a(eh2, this.k, this.l, this.m, this.n, -1, true);
        ev.g.a(eh2, String.valueOf(this.h) + this.g, this.a.a, this.a.b - (main.a.e ? 17 : 12), 0);
        bj.a(eh2, this.d, this.f, this.e);
        this.a.a(eh2);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 8000: {
                dq.c("perform chat 1");
                if (this.c == null) break;
                long l2 = System.currentTimeMillis();
                if (l2 - this.j < 1000L) {
                    return;
                }
                this.j = l2;
                this.c.a(this.a.e(), this.g);
                this.a.a("");
                this.e.b = ch.bk;
                return;
            }
            case 8001: {
                dq.c("perform chat 2");
                if (this.a.e().equals("")) {
                    this.b = false;
                    this.c.B();
                }
                this.a.c();
            }
        }
    }
}

