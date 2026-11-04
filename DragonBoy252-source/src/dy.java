/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class dy
extends ew
implements ao {
    private static dy f;
    private static Image g;
    private static Image h;
    public byte a;
    private int i = 5;
    private int[] j = new int[this.o];
    private int[] k = new int[this.o];
    private int[] l;
    private int[] m;
    private int n;
    private int o = 20;
    public short b;
    public short c;
    public long d;
    public long e;
    private boolean p;
    private boolean q;
    private int r;

    static {
        g = ej.b("/mainImage/myTexture2dfutherShip.png");
        h = ej.b("/mainImage/taungam.png");
    }

    public dy() {
        int n2 = 0;
        while (n2 < this.o) {
            this.j[n2] = dq.b(0, main.a.A);
            this.k[n2] = n2 * (main.a.B / this.o);
            ++n2;
        }
        this.l = new int[this.o];
        this.m = new int[this.o];
        n2 = 0;
        while (n2 < this.o) {
            this.l[n2] = dq.b(0, main.a.A);
            this.m[n2] = n2 * (main.a.B / this.o);
            ++n2;
        }
    }

    public static dy c() {
        if (f == null) {
            f = new dy();
        }
        return f;
    }

    public final void a() {
        this.p = false;
        this.q = false;
        this.cA = co.m().ab() > 0 && this.a == 0 ? new ae(ch.gd, this, 1, null) : null;
        this.r = 0;
        super.a();
    }

    public final void a(eh eh2) {
        eh2.a(this.a == 0 ? 0 : 3056895);
        eh2.d(0, 0, main.a.A, main.a.B);
        int n2 = 0;
        while (n2 < this.o) {
            eh2.a(this.a == 0 ? 0xE1DEDE : 11140863);
            eh2.d(this.j[n2], this.k[n2], 10, 2);
            ++n2;
        }
        if (this.a == 0) {
            eh2.a(g, 0, 0, 72, 95, 7, this.n + this.r, main.a.B / 2, 3);
        }
        if (this.a == 1) {
            eh2.a(h, 0, 0, 144, 79, 2, this.n + this.r, main.a.B / 2, 3);
        }
        n2 = 0;
        while (n2 < this.o) {
            eh2.a(this.a == 0 ? 0xE3E3E3 : 7536127);
            eh2.d(this.l[n2], this.m[n2], 18, 3);
            ++n2;
        }
        super.a(eh2);
    }

    public final void b() {
        if (this.a == 0) {
            if (!this.p) {
                this.r = main.a.A / 2 * this.b / this.c;
            }
        } else {
            this.r += 2;
        }
        ci.b = false;
        this.n = (((main.a.A / 2 + this.n) / 2 + this.n) / 2 + this.n) / 2;
        if (this.a == 1) {
            this.n = 0;
        }
        int n2 = 0;
        while (n2 < this.o) {
            int n3 = n2;
            this.j[n3] = this.j[n3] - this.i / 2;
            if (this.j[n2] < -20) {
                this.j[n2] = main.a.A;
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < this.o) {
            int n4 = n2;
            this.l[n4] = this.l[n4] - this.i;
            if (this.l[n2] < -20) {
                this.l[n2] = main.a.A;
            }
            ++n2;
        }
        if (main.a.w % 3 == 0) {
            this.i += this.p ? 2 : 1;
        }
        if (this.i > (this.p ? 80 : 25)) {
            this.i = this.p ? 80 : 25;
        }
        this.e = System.currentTimeMillis();
        if (this.e - this.d >= 1000L) {
            this.b = (short)(this.b + 1);
            this.d = this.e;
        }
        if (this.p) {
            this.r += 3;
        }
        if (this.r >= main.a.A / 2 + 30 && !this.q) {
            this.q = true;
            cj.a().z();
        }
        super.b();
    }

    public final void d() {
        super.d();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            main.a.a(ch.ge, new ae(ch.bo, this, 2, null), new ae(ch.bp, this, 3, null));
        }
        if (n2 == 2 && co.m().ab() > 0) {
            this.p = true;
            main.a.l();
            this.cA = null;
        }
        if (n2 == 3) {
            main.a.l();
        }
    }
}

