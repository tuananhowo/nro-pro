/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class cp
extends ew
implements ao {
    private ae[] b;
    public static dn[] a;
    private int c;
    private int[] d = new int[]{main.a.A / 2 - 100, main.a.A / 2 - 100};
    private int e = 0;
    private int[] f = new int[2];
    private int[] g = new int[]{main.a.A / 2 - 150, main.a.B / 2 - 100, 300, 200};
    private int h = -35;
    private int i = -35;

    public final void a() {
        ds.c = false;
        co.cd = false;
        en.c = false;
        ds.o = false;
        cw.l().e();
        super.a();
    }

    public final void b() {
        this.c = main.a.w % 10 > 2 ? 1 : 0;
        int n2 = 0;
        while (n2 < this.b.length) {
            if (this.b[n2].c()) {
                this.b[n2].a();
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < this.d.length) {
            if (main.a.a(this.d[n2] + this.i, this.f[n2] + this.h, this.g[2], 60)) {
                if (main.a.k) {
                    this.e = n2;
                    break;
                }
                if (main.a.m) {
                }
            }
            ++n2;
        }
        super.b();
    }

    public final void a(eh eh2) {
        main.a.c(eh2);
        try {
            int n2;
            bo.a(eh2, this.g[0] - 10, this.g[1], this.g[2] + 20, this.g[3], 0xFFFFFF, true);
            if (this.b != null) {
                n2 = 0;
                while (n2 < this.b.length) {
                    this.b[n2].a(eh2);
                    ++n2;
                }
            }
            if (a != null) {
                n2 = 0;
                while (n2 < a.length) {
                    bo.a(eh2, this.d[n2] - 20, this.f[n2] + this.h, this.g[2], 60, 0xFFFFFF, false);
                    bk bk2 = cw.y[cp.a[n2].c];
                    bk bk3 = cw.y[cp.a[n2].e];
                    bk bk4 = cw.y[cp.a[n2].d];
                    er.b(eh2, bk2.a[co.bT[this.c][0][0]].a, this.d[n2] + co.bT[this.c][0][1] + bk2.a[co.bT[this.c][0][0]].b, this.f[n2] - co.bT[this.c][0][2] + bk2.a[co.bT[this.c][0][0]].c, 0, 0);
                    er.b(eh2, bk3.a[co.bT[this.c][1][0]].a, this.d[n2] + co.bT[this.c][1][1] + bk3.a[co.bT[this.c][1][0]].b, this.f[n2] - co.bT[this.c][1][2] + bk3.a[co.bT[this.c][1][0]].c, 0, 0);
                    er.b(eh2, bk4.a[co.bT[this.c][2][0]].a, this.d[n2] + co.bT[this.c][2][1] + bk4.a[co.bT[this.c][2][0]].b, this.f[n2] - co.bT[this.c][2][2] + bk4.a[co.bT[this.c][2][0]].c, 0, 0);
                    if (this.e == n2) {
                        ev.d.a(eh2, cp.a[n2].b, this.d[n2] + this.g[2] - 25, this.f[n2] + this.h, 1);
                        ev.d.a(eh2, String.valueOf(ch.dh) + " " + dq.b(cp.a[n2].f), this.d[n2] + this.g[2] - 25, this.f[n2] + this.h + ev.d.a(), 1);
                    } else {
                        ev.f.a(eh2, cp.a[n2].b, this.d[n2] + this.g[2] - 25, this.f[n2] + this.h, 1);
                        ev.f.a(eh2, String.valueOf(ch.dh) + " " + dq.b(cp.a[n2].f), this.d[n2] + this.g[2] - 25, this.f[n2] + this.h + ev.f.a(), 1);
                    }
                    ++n2;
                }
            }
        }
        catch (Exception exception) {}
        super.a(eh2);
    }

    public final void a(byte n2) {
        this.d = new int[n2];
        this.f = new int[n2];
        int n3 = 0;
        while (n3 < n2) {
            this.d[n3] = this.g[0] + 20;
            this.f[n3] = n3 * 70 + this.g[1] + 50;
            ++n3;
        }
        this.b = new ae[2];
        this.b[1] = new ae("V\u00e0o game", this, 1, null, this.g[0] + this.g[2] - 80 - 80, this.g[1] + this.g[3] - 30);
        this.b[0] = new ae("Tr\u1edd ra", this, 2, null, this.g[0] + this.g[2] - 80, this.g[1] + this.g[3] - 30);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1: {
                if (this.e == -1) break;
                main.a.m();
                cj.a().t(cp.a[this.e].a);
                return;
            }
            case 2: {
                main.a.e();
            }
        }
    }
}

