/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class cg
implements ao {
    public short a;
    public short b;
    public short c;
    public short d;
    public boolean e;
    public boolean f;
    public bo g;

    public cg(short s2, short s3, short s4, short s5, boolean bl2, boolean bl3, String string) {
        this.a = s2;
        this.b = s3;
        this.c = s4;
        this.d = s5;
        string = dq.a(string);
        this.e = bl2;
        this.f = bl3;
        if ((dx.l == 21 || dx.l == 22 || dx.l == 23) && this.a >= 0 && this.a <= 24) {
            return;
        }
        if ((dx.l == 0 && co.m().W != 0 || dx.l == 7 && co.m().W != 1 || dx.l == 14 && co.m().W != 2) && bl3) {
            return;
        }
        if (dx.f() || dx.l == 47) {
            if (s3 > 150 && dx.f()) {
                return;
            }
            this.g = new bo(string, s2 + (s4 - s2) / 2, s5 - (s2 > 100 ? 24 : 48));
            this.g.i = new ae(null, this, 1, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
            dx.u.addElement(this);
            return;
        }
        if (!bl2 && !bl3) {
            this.g = new bo(string, s2, s3 - 24);
            this.g.i = new ae(null, this, 1, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
        } else {
            if (dx.b()) {
                this.g = new bo(string, s2, s3 - 16);
            } else {
                s2 = (short)(s2 + (s4 - s2) / 2);
                this.g = new bo(string, s2, s3 - (s3 != 0 ? 16 : -32));
            }
            this.g.i = new ae(null, this, 2, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
        }
        dx.u.addElement(this);
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1: {
                n2 = (this.a + this.c) / 2;
                int n3 = this.d;
                if (this.d > this.b + 24) {
                    n3 = (this.b + this.d) / 2;
                }
                cw.l().bj = 0;
                co.m().ck = new be(n2, n3);
                co.m().U = co.m().N - co.m().ck.a > 0 ? -1 : 1;
                cj.a().l();
                return;
            }
            case 2: {
                cw.l().bj = 0;
                if (co.m().q() != null) {
                    cj.a().l();
                    da.a();
                    cj.a().v();
                    co.cb = true;
                    return;
                }
                if (co.m().r() != null) {
                    cj.a().l();
                    cj.a().k();
                    co.cc = true;
                    co.cb = true;
                    main.a.k();
                    main.a.j();
                    da.a();
                    return;
                }
                n2 = (this.a + this.c) / 2;
                short s2 = this.d;
                co.m().ck = new be(n2, s2);
                co.m().U = co.m().N - co.m().ck.a > 0 ? -1 : 1;
                co.m().aM = new ae(null, this, 2, null);
            }
        }
    }
}

