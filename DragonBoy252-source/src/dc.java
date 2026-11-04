/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class dc {
    public int[][] a = new int[3][];
    public ap b = new ap();
    private int j;
    private int k;
    private int l;
    private int m;
    public int c;
    private int n;
    private int o;
    private int p;
    public int d;
    private int q;
    private int r;
    public boolean e;
    public boolean f = true;
    public int g;
    public int h;
    public ae i;

    public dc() {
        int n2 = 0;
        while (n2 < this.a.length) {
            this.a[n2] = new int[3];
            ++n2;
        }
    }

    public final void a(eh eh2) {
        if (this.equals(cw.aP) && cw.l().x()) {
            return;
        }
        if (this.equals(cw.aP) && cw.l().cd != null) {
            return;
        }
        if (!cw.bG) {
            return;
        }
        if (main.a.E != cw.l() && main.a.E != cr.c()) {
            return;
        }
        if (g.n != null) {
            return;
        }
        if (!this.f) {
            return;
        }
        if (co.cb) {
            return;
        }
        if (main.a.G.a && this.equals(cw.aP)) {
            return;
        }
        eh2.a(-eh2.a(), -eh2.b());
        eh2.e(0, 0, main.a.A, main.a.B);
        if (this.b != null) {
            this.b.a(eh2, this.d, this.c, this.j);
            if (this.b.b != null && this.b.b.c != null && this.i == null) {
            }
            if (this.b.b != null) {
                co cfr_ignored_0 = this.b.b.c;
            }
        }
        if (this.b.b != null && this.b.b.c == null && this.a != null) {
            er.b(eh2, this.a[co.m().W][this.k], this.d, this.c + 3 + (main.a.w % 10 > 5 ? 1 : 0), this.j == 1 ? 0 : 2, dv.f);
        }
        eh2.a(-eh2.a(), -eh2.b());
    }

    public final void a() {
        if (this.b != null && this.b.a != null && this.b.a.size() == 0 && this.c != -40) {
            --this.b.f;
            if (this.b.f <= 0) {
                this.c = -40;
                this.b.e = 0;
                this.b.a.removeAllElements();
                this.b.d = null;
                this.b.f = 200;
            }
        }
        if (this.equals(cw.aP) && cw.l().cd != null) {
            return;
        }
        if (!this.f) {
            return;
        }
        Object object = this;
        if (((dc)object).c != ((dc)object).m) {
            ((dc)object).o = ((dc)object).m - ((dc)object).c << 2;
            ((dc)object).n += ((dc)object).o;
            ((dc)object).c += ((dc)object).n >> 4;
            ((dc)object).n &= 0xF;
        }
        if (((dc)object).d != ((dc)object).p) {
            ((dc)object).r = ((dc)object).p - ((dc)object).d << 2;
            ((dc)object).q += ((dc)object).r;
            ((dc)object).d += ((dc)object).q >> 4;
            ((dc)object).q &= 0xF;
        }
        ++((dc)object).l;
        if (((dc)object).l == 5) {
            ((dc)object).l = 0;
            ((dc)object).k = ((dc)object).k == 0 ? 1 : 0;
        }
        if (this.b == null) {
            return;
        }
        if (this.b != null && this.b.b == null) {
            return;
        }
        if (!this.e) {
            if (this.g > 0) {
                --this.g;
                if (this.g == 0) {
                    main.a.G.l();
                    main.a.G.s();
                }
            }
            if (main.a.w % 3 == 0) {
                if (co.m().U == 1) {
                    this.p = co.m().N - 20 - cw.j;
                }
                if (co.m().U == -1) {
                    this.p = co.m().N + 20 - cw.j;
                }
                if (this.p <= 24) {
                    this.p += this.b.c / 2;
                }
                if (this.p >= main.a.A - 24) {
                    this.p -= this.b.c / 2;
                }
                this.m = co.m().O - 40 - cw.k;
                if (this.b.d != null && this.m < (this.b.d.length + 1) * 12 + 10) {
                    this.m = (this.b.d.length + 1) * 12 + 10;
                }
                if (this.b.b.c != null) {
                    if (main.a.A - 50 > 155 + this.b.i) {
                        this.p = main.a.A - 60 - this.b.i / 2;
                        this.m = this.b.j + 10;
                    } else {
                        this.p = main.a.A - 20 - this.b.i / 2;
                        this.m = 45 + this.b.j;
                        if (main.a.A > main.a.B || main.a.A < 220) {
                            this.p = main.a.A - 20 - this.b.i / 2;
                            this.m = this.b.j + 10;
                        }
                    }
                }
            }
            this.j = this.d > co.m().N - cw.j ? -1 : 1;
        }
        if (this.b.b != null) {
            if (this.b.a.size() > 1) {
                if (this.b.b.f == 0) {
                    ++this.b.e;
                    if (this.b.e >= this.b.b.b) {
                        this.b.e = 0;
                        this.b.a.removeElementAt(0);
                        this.b.b = object = (db)this.b.a.firstElement();
                        this.b.c();
                        return;
                    }
                } else {
                    this.b.b.i = System.currentTimeMillis();
                    if (this.b.b.i - this.b.b.h >= 1000L) {
                        this.b.b.h = System.currentTimeMillis();
                        --this.b.b.f;
                    }
                    if (this.b.b.f == 0) {
                        this.b.a.removeElementAt(0);
                        if (this.b.a.size() == 0) {
                            return;
                        }
                        this.b.b = object = (db)this.b.a.firstElement();
                        this.b.c();
                        return;
                    }
                }
            } else if (this.b.a.size() == 1) {
                if (this.b.b.f == 0) {
                    ++this.b.e;
                    if (this.b.e >= this.b.b.b) {
                        this.e = true;
                    }
                    if (this.b.e == this.b.b.b) {
                        this.m = -40;
                        this.p = co.m().N - cw.j + (co.m().U == 1 ? -20 : 20);
                    }
                    if (this.b.e >= this.b.b.b + 20) {
                        this.b.e = 0;
                        this.b.a.removeAllElements();
                        this.b.d = null;
                        this.b.f = 200;
                        return;
                    }
                } else {
                    this.b.b.i = System.currentTimeMillis();
                    if (this.b.b.i - this.b.b.h >= 1000L) {
                        this.b.b.h = System.currentTimeMillis();
                        --this.b.b.f;
                    }
                    if (this.b.b.f == 0) {
                        this.e = true;
                        this.m = -40;
                        this.p = co.m().N - cw.j + (co.m().U == 1 ? -20 : 20);
                        this.b.e = 0;
                        this.b.a.removeAllElements();
                        this.b.d = null;
                        this.i = null;
                    }
                }
            }
        }
    }

    public final void a(String string, co co2, boolean bl2) {
        this.h = co2.V;
        this.b.a(string, 3, co2, bl2);
        this.e = false;
    }

    public final void a(String string, int n2) {
        string = dq.a(string);
        if (this.b.a.size() > 0 && string.equals(((db)this.b.a.lastElement()).a)) {
            return;
        }
        if (this.b.a.size() > 10) {
            int n3 = 0;
            while (n3 < 5) {
                this.b.a.removeElementAt(0);
                ++n3;
            }
        }
        this.b.a(string, n2, null, false);
        if (this.b.a.size() == 1) {
            this.c = 0;
            this.d = co.m().N - cw.j + (co.m().U == 1 ? -20 : 20);
        }
        this.e = false;
    }
}

