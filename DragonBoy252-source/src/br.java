/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class br {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private int p;
    private int q;
    public int i;
    public int j;
    public int k;
    public int l;
    private int r;
    private int s;
    private int[] t = new int[3];
    public boolean m;
    private boolean u;
    private int v;
    public int n;
    public int o = 1;
    private int w = 1;
    private boolean x = true;

    public final bs a() {
        int n2;
        if (this.x) {
            int n3 = 0;
            br br2 = this;
            int n4 = br2.p;
            int n5 = br2.q;
            int n6 = br2.i;
            int n7 = br2.j;
            if (main.a.k) {
                if (!br2.m && main.a.b(n4, n5, n6, n7)) {
                    n6 = 0;
                    while (n6 < br2.t.length) {
                        br2.t[0] = main.a.q;
                        ++n6;
                    }
                    br2.s = main.a.q;
                    br2.m = true;
                    br2.n = -1;
                    br2.u = br2.v != 0;
                    br2.v = 0;
                } else if (br2.m) {
                    ++br2.r;
                    if (br2.r > 5 && br2.s == main.a.q && !br2.u) {
                        br2.s = -1000;
                        if (br2.o > 0) {
                            if (br2.w > 1) {
                                n6 = (br2.b + main.a.q - n5) / br2.o;
                                n3 = (br2.a + main.a.p - n4) / br2.o;
                                br2.n = n6 * br2.w + n3;
                            } else {
                                br2.n = (br2.b + main.a.q - n5) / br2.o;
                            }
                        } else {
                            br2.n = -1;
                        }
                    }
                    if ((n6 = main.a.q - br2.t[0]) != 0 && br2.n != -1) {
                        br2.n = -1;
                    }
                    n3 = br2.t.length - 1;
                    while (n3 > 0) {
                        br2.t[n3] = br2.t[n3 - 1];
                        --n3;
                    }
                    br2.t[0] = main.a.q;
                    br2.b -= n6;
                    if (br2.b < 0) {
                        br2.b = 0;
                    }
                    if (br2.b > br2.l) {
                        br2.b = br2.l;
                    }
                    if (br2.d < 0 || br2.d > br2.l) {
                        n6 /= 2;
                    }
                    br2.d -= n6;
                }
            }
            n6 = 0;
            if (main.a.m && br2.m) {
                n3 = main.a.q - br2.t[0];
                main.a.m = false;
                if (dq.g(n3) < 20 && dq.g(main.a.q - br2.s) < 20 && !br2.u) {
                    br2.v = 0;
                    br2.b = br2.d;
                    br2.s = -1000;
                    if (br2.o > 0) {
                        if (br2.w > 1) {
                            n3 = (br2.b + main.a.q - n5) / br2.o;
                            n4 = (br2.a + main.a.p - n4) / br2.o;
                            br2.n = n3 * br2.w + n4;
                        } else {
                            br2.n = (br2.b + main.a.q - n5) / br2.o;
                        }
                    } else {
                        br2.n = -1;
                    }
                    br2.r = 0;
                    n6 = 1;
                } else if (br2.n != -1 && br2.r > 5) {
                    br2.r = 0;
                    n6 = 1;
                } else if (br2.n == -1 && !br2.u) {
                    if (br2.d < 0) {
                        br2.b = 0;
                    } else if (br2.d > br2.l) {
                        br2.b = br2.l;
                    } else {
                        n3 = main.a.q - br2.t[0] + (br2.t[0] - br2.t[1]) + (br2.t[1] - br2.t[2]);
                        n3 = n3 > 10 ? 10 : (n3 < -10 ? -10 : 0);
                        br2.v = -n3 * 100;
                    }
                }
                br2.m = false;
                br2.r = 0;
                main.a.m = false;
            }
            bs bs2 = new bs();
            new bs().b = br2.n;
            bs2.c = n6;
            bs2.a = br2.m;
            return bs2;
        }
        br br3 = this;
        int n8 = br3.p;
        int n9 = br3.q;
        int n10 = br3.i;
        int n11 = br3.j;
        if (main.a.k) {
            if (!br3.m && main.a.b(n8, n9, n10, n11)) {
                n2 = 0;
                while (n2 < br3.t.length) {
                    br3.t[0] = main.a.p;
                    ++n2;
                }
                br3.s = main.a.p;
                br3.m = true;
                br3.n = -1;
                br3.u = br3.v != 0;
                br3.v = 0;
            } else if (br3.m) {
                ++br3.r;
                if (br3.r > 5 && br3.s == main.a.p && !br3.u) {
                    br3.s = -1000;
                    br3.n = br3.o > 0 ? (br3.a + main.a.p - n8) / br3.o : -1;
                }
                if ((n2 = main.a.p - br3.t[0]) != 0 && br3.n != -1) {
                    br3.n = -1;
                }
                n11 = br3.t.length - 1;
                while (n11 > 0) {
                    br3.t[n11] = br3.t[n11 - 1];
                    --n11;
                }
                br3.t[0] = main.a.p;
                br3.a -= n2;
                if (br3.a < 0) {
                    br3.a = 0;
                }
                if (br3.a > br3.k) {
                    br3.a = br3.k;
                }
                if (br3.c < 0 || br3.c > br3.k) {
                    n2 /= 2;
                }
                br3.c -= n2;
            }
        }
        n2 = 0;
        if (main.a.m && br3.m) {
            n11 = main.a.p - br3.t[0];
            main.a.m = false;
            if (dq.g(n11) < 20 && dq.g(main.a.p - br3.s) < 20 && !br3.u) {
                br3.v = 0;
                br3.a = br3.c;
                br3.s = -1000;
                br3.n = br3.o > 0 ? (br3.a + main.a.p - n8) / br3.o : -1;
                br3.r = 0;
                n2 = 1;
            } else if (br3.n != -1 && br3.r > 5) {
                br3.r = 0;
                n2 = 1;
            } else if (br3.n == -1 && !br3.u) {
                if (br3.c < 0) {
                    br3.a = 0;
                } else if (br3.c > br3.k) {
                    br3.a = br3.k;
                } else {
                    n8 = main.a.p - br3.t[0] + (br3.t[0] - br3.t[1]) + (br3.t[1] - br3.t[2]);
                    n8 = n8 > 10 ? 10 : (n8 < -10 ? -10 : 0);
                    br3.v = -n8 * 100;
                }
            }
            br3.m = false;
            br3.r = 0;
            main.a.m = false;
        }
        bs bs3 = new bs();
        new bs().b = br3.n;
        bs3.c = n2;
        bs3.a = br3.m;
        return bs3;
    }

    public final void b() {
        if (this.v != 0 && !this.m) {
            if (this.x) {
                this.b += this.v / 100;
                if (this.b < 0) {
                    this.b = 0;
                } else if (this.b > this.l) {
                    this.b = this.l;
                } else {
                    this.d = this.b;
                }
            } else {
                this.a += this.v / 100;
                if (this.a < 0) {
                    this.a = 0;
                } else if (this.a > this.k) {
                    this.a = this.k;
                } else {
                    this.c = this.a;
                }
            }
            this.v = this.v * 9 / 10;
            if (this.v < 100 && this.v > -100) {
                this.v = 0;
            }
        }
        if (this.c != this.a && !this.m) {
            this.e = this.a - this.c << 2;
            this.g += this.e;
            this.c += this.g >> 4;
            this.g &= 0xF;
        }
        if (this.d != this.b && !this.m) {
            this.f = this.b - this.d << 2;
            this.h += this.f;
            this.d += this.h >> 4;
            this.h &= 0xF;
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, int n8) {
        this.p = n4;
        this.q = n5;
        if (n3 <= 0) {
            n3 = 1;
        }
        this.w = 1;
        this.o = n3;
        this.i = n6;
        this.j = n7;
        this.x = true;
        n4 = n2;
        if (false) {
            ++n4;
        }
        this.l = n4 * n3 - n7;
        if (this.l < 0) {
            this.l = 0;
        }
        if (this.k < 0) {
            this.k = 0;
        }
    }

    public final void a(int n2) {
        if (this.x) {
            this.b = n2 -= (this.j - this.o) / 2;
            if (this.b < 0) {
                this.b = 0;
            }
            if (this.b > this.l) {
                this.b = this.l;
                return;
            }
        } else {
            this.a = n2 -= (this.i - this.o) / 2;
            if (this.a < 0) {
                this.a = 0;
            }
            if (this.a > this.k) {
                this.a = this.k;
            }
        }
    }
}

