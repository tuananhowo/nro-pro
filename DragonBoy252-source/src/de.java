/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class de
extends cu {
    private String[] e;
    public et d;
    private int f = 40;

    public de() {
        if (main.a.A <= 176) {
            this.f = 10;
        }
        this.d = new et();
        this.d.a = this.f + 10;
        this.d.b = main.a.B - ew.cC - 43;
        this.d.c = main.a.A - 2 * (this.f + 10);
        this.d.d = ew.cC + 2;
        this.d.e = true;
        this.c = this.d.j;
    }

    public final void a(String object, ae ae2, int n2) {
        this.d.a("");
        this.d.c(n2);
        this.e = ev.t.a((String)object, main.a.A - (this.f << 1));
        this.a = new ae(ch.bk, main.a.a(), 8882, null);
        this.b = ae2;
        object = this;
        main.a.K = object;
    }

    public final void a(eh eh2) {
        main.a.M.a(eh2, this.f, main.a.B - 77 - ew.cE, main.a.A - (this.f << 1), 69, this.e);
        this.d.a(eh2);
        super.a(eh2);
    }

    public final void a(int n2) {
        this.d.a(n2);
        super.a(n2);
    }

    public final void a() {
        this.d.d();
        super.a();
    }
}

