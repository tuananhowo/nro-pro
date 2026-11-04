/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class as
implements cy {
    public int a;
    public int b;
    private int g;
    private int h;
    private int i;
    private int j;
    public int c;
    public int d;
    public aw e;
    private byte k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int[] r;
    private int[] s;
    private int[] t;
    private int[] u;
    private int v;
    private int w;
    public static Image f = ej.b("/mainImage/myTexture2dflare.png");
    private static Image x = ej.b("/mainImage/myTexture2ditemaura1.png");
    private static Image y = ej.b("/mainImage/myTexture2ditemaura2.png");
    private static Image z = ej.b("/mainImage/myTexture2ditemaura3.png");

    public as(short s2, short s3, int n2, int n3, int n4, int n5) {
        this.d = s2;
        this.e = ax.a(s3);
        this.a = n4;
        this.b = n3;
        this.g = n4;
        this.h = n5;
        this.i = n4 - n2 >> 2;
        this.j = 5;
    }

    public as(int n2, short s2, short s3, int n3, int n4, short s4) {
        this.d = s2;
        this.e = ax.a(s3);
        this.a = this.g = n3;
        this.b = this.h = n4;
        this.k = 1;
        this.c = n2;
        if (this.h()) {
            this.l = s4;
            as as2 = this;
            this.m = as2.a;
            as2.n = as2.b;
            as2.q = 120;
            as2.o = 0;
            if (!main.a.a) {
                as2.p = 360 / as2.q;
                as2.r = new int[as2.q];
                as2.s = new int[as2.q];
                as2.t = new int[as2.q];
                as2.u = new int[as2.q];
                as2.i();
            }
        }
    }

    public final void a(int n2, int n3) {
        this.g = n2;
        this.h = n3;
        this.i = n2 - this.a >> 2;
        this.j = n3 - this.b >> 2;
        this.k = (byte)2;
    }

    public final void a() {
        if (this.k == 2 && this.a == this.g && this.b == this.h) {
            cw.F.removeElement(this);
            if (co.m().bj != null && co.m().bj.equals(this)) {
                co.m().bj = null;
            }
            return;
        }
        if (this.k > 0) {
            if (this.i == 0) {
                this.a = this.g;
            }
            if (this.j == 0) {
                this.b = this.h;
            }
            if (this.a != this.g) {
                this.a += this.i;
                if (this.i > 0 && this.a > this.g || this.i < 0 && this.a < this.g) {
                    this.a = this.g;
                }
            }
            if (this.b != this.h) {
                this.b += this.j;
                if (this.j > 0 && this.b > this.h || this.j < 0 && this.b < this.h) {
                    this.b = this.h;
                }
            }
        } else {
            this.k = (byte)(this.k - 4);
            if (this.k < -12) {
                this.b -= 12;
                this.k = 1;
            }
        }
        if (this.h()) {
            as as2 = this;
            ++as2.v;
            ++as2.w;
            if (as2.w >= 40) {
                as2.w = 0;
            }
            if (as2.v >= as2.q) {
                as2.v = 0;
            }
            if (as2.v % 10 == 0 && !main.a.a) {
                u.a(114, as2.a - 5, as2.b - 30, 1);
            }
        }
    }

    public final void a(eh object) {
        if (this.h()) {
            ((eh)object).a(dx.y, this.a + 3, this.b, 3);
            if (this.k <= 0) {
                if (this.w < 10) {
                    ((eh)object).a(x, this.a, this.b + this.k + 3, 33);
                } else {
                    ((eh)object).a(y, this.a, this.b + this.k + 3, 33);
                }
            } else if (this.w < 10) {
                ((eh)object).a(x, this.a, this.b + 3, 33);
            } else {
                ((eh)object).a(y, this.a, this.b + 3, 33);
            }
            eh eh2 = object;
            object = this;
            if (!main.a.a && super.h()) {
                int n2 = 0;
                while (n2 < ((as)object).s.length) {
                    if (((as)object).v == n2) {
                        if (((as)object).w <= 20) {
                            eh2.a(z, ((as)object).t[n2], ((as)object).u[n2] + 3, 33);
                        } else {
                            er.b(eh2, ((as)object).e.f, ((as)object).t[n2], ((as)object).u[n2] + 3, 0, 33);
                        }
                    }
                    ++n2;
                }
            }
            return;
        }
        if (!this.h()) {
            if (main.a.w % 4 == 0) {
                ((eh)object).a(f, this.a, this.b + this.k + 13, 33);
            }
            if (this.k <= 0) {
                er.b((eh)object, this.e.f, this.a, this.b + this.k + 3, 0, 33);
            } else {
                er.b((eh)object, this.e.f, this.a, this.b + 3, 0, 33);
            }
            if (co.m().bj != null && co.m().bj.equals(this) && this.k != 2) {
                ((eh)object).a(dh.W, 0, 24, 9, 6, 0, this.a, this.b - 17, 3);
            }
        }
    }

    private boolean h() {
        boolean bl2 = this.e.b == 22;
        return bl2;
    }

    private void i() {
        if (!main.a.a) {
            int n2 = 0;
            while (n2 < this.s.length) {
                this.s[n2] = dq.g(this.l * dq.a(this.o) / 1024);
                this.r[n2] = dq.g(this.l * dq.b(this.o) / 1024);
                if (this.o < 90) {
                    this.t[n2] = this.m + this.r[n2];
                    this.u[n2] = this.n - this.s[n2];
                } else if (this.o >= 90 && this.o < 180) {
                    this.t[n2] = this.m - this.r[n2];
                    this.u[n2] = this.n - this.s[n2];
                } else if (this.o >= 180 && this.o < 270) {
                    this.t[n2] = this.m - this.r[n2];
                    this.u[n2] = this.n + this.s[n2];
                } else {
                    this.t[n2] = this.m + this.r[n2];
                    this.u[n2] = this.n + this.s[n2];
                }
                this.o += this.p;
                ++n2;
            }
        }
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return 20;
    }

    public final int e() {
        return 20;
    }

    public final void f() {
    }

    public final boolean g() {
        return false;
    }
}

