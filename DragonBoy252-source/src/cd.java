/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class cd {
    public static eq a = new eq("vTeleport");
    public int b;
    public int c;
    private int f;
    private int g;
    private boolean h;
    private int i;
    public int d;
    private int j;
    private int k;
    private static Image[] l = new Image[5];
    private static Image m;
    private boolean n;
    private boolean o;
    private boolean p = false;
    public boolean e;
    private boolean q;
    private int r;
    private int s = 1;
    private int t;
    private int u;
    private boolean v;
    private boolean w;

    public cd(int n2, int n3, int n4, int n5, int n6, boolean bl2, int n7) {
        this.b = n2;
        this.c = 5;
        this.i = n3;
        dq.c("TELEPORT x= " + n2 + " y= " + n3 + " type= " + n6);
        this.f = n4;
        this.g = n6;
        this.h = bl2;
        this.j = n5;
        this.k = n7;
        this.r = 0;
        n3 = 0;
        while (n3 < 100) {
            ++n3;
            this.i += 12;
            if (!dx.a(n2, this.i, 2)) continue;
            if (this.i % 24 == 0) break;
            this.i -= this.i % 24;
            break;
        }
        dq.c("Y2= " + this.i + "--------------------------------------------------------------");
        this.o = true;
        this.n = false;
        if (this.k > 2) {
            this.i += 4;
            if (l[3] == null) {
                cd.l[3] = ej.c("/mainImage/myTexture2dmaybay4a.png");
            }
            if (l[4] == null) {
                cd.l[4] = ej.c("/mainImage/myTexture2dmaybay4b.png");
            }
            if (m == null) {
                m = ej.c("/mainImage/hole.png");
            }
        } else if (l[n7] == null) {
            cd.l[n7] = ej.b("/mainImage/myTexture2dmaybay" + (n7 + 1) + ".png");
        }
        if (n2 > cw.j && n2 < cw.j + main.a.A && this.i > 100) {
            es.a();
            es.I();
            es.a();
            es.K();
            this.p = true;
            es.a();
            es.x();
        }
    }

    public static void a(cd cd2) {
        a.addElement(cd2);
    }

    public final void a(eh eh2) {
        if (this.k > 2 && this.v) {
            eh2.a(m, this.b, this.i + 20, dv.c);
        }
    }

    public final void b(eh eh2) {
        if (co.cd) {
            return;
        }
        if (this.b < cw.j || this.b > cw.j + main.a.A) {
            return;
        }
        bk bk2 = cw.y[this.f];
        int n2 = 0;
        int n3 = 0;
        if (this.k == 0) {
            n2 = 15;
            n3 = 40;
        }
        if (this.k == 1) {
            n2 = 7;
            n3 = 55;
        }
        if (this.k == 2) {
            n2 = 18;
            n3 = 52;
        }
        if (this.q && this.k < 3) {
            er.b(eh2, bk2.a[co.bT[0][0][0]].a, this.b + (this.j == 1 ? n2 : -n2), this.c - n3, this.j == 1 ? 0 : 2, dv.a);
        }
        if (this.k < 3) {
            eh2.a(l[this.k], 0, 0, eh.a(l[this.k]), eh.b(l[this.k]), this.j == 1 ? 2 : 0, this.b, this.c, dv.c);
            return;
        }
        if (this.o) {
            if (this.r > 10) {
                eh2.a(l[4], 0, 0, eh.a(l[4]), eh.b(l[4]), this.j == 1 ? 2 : 0, this.j == 1 ? this.b - 11 : this.b + 11, this.c + 2, dv.c);
                return;
            }
            eh2.a(l[3], 0, 0, eh.a(l[3]), eh.b(l[3]), this.j == 1 ? 2 : 0, this.b, this.c, dv.c);
            return;
        }
        if (this.r < 20) {
            eh2.a(l[4], 0, 0, eh.a(l[4]), eh.b(l[4]), this.j == 1 ? 2 : 0, this.j == 1 ? this.b - 11 : this.b + 11, this.c + 2, dv.c);
            return;
        }
        eh2.a(l[3], 0, 0, eh.a(l[3]), eh.b(l[3]), this.j == 1 ? 2 : 0, this.b, this.c, dv.c);
    }

    public final void a() {
        if (this.k > 2 && this.e && this.c != -80) {
            if (this.o && this.r == 0) {
                if (main.a.w % 3 == 0) {
                    u.a(1, this.b, this.c, 1, 0);
                }
            } else if (this.n && main.a.w % 3 == 0) {
                u.a(1, this.b, this.c + 16, 1, 1);
            }
        }
        ++this.t;
        if (this.t > 3) {
            this.t = 0;
        }
        if (this.o) {
            this.e = true;
            boolean bl2 = this.q = this.g != 0;
            if (this.k < 3) {
                int n2 = this.i - this.c >> 3;
                if (n2 <= 0) {
                    n2 = 1;
                    this.e = false;
                }
                this.c += n2;
            } else {
                if (main.a.w % 2 == 0) {
                    ++this.s;
                }
                if (this.i - this.c < this.s) {
                    this.c = this.i;
                    this.e = false;
                } else {
                    this.c += this.s;
                }
            }
            if (this.h && this.g == 1 && co.m().E) {
                co.m().N = this.b;
                co.m().O = this.c - 30;
                co.m().T = 4;
                cw.l = this.b - cw.f;
                cw.m = this.c - cw.g - 1;
                cw.aO.f = false;
            }
            if (cw.b(this.d) != null && !this.h && this.g == 1 && cw.b((int)this.d).E) {
                cw.b((int)this.d).N = this.b;
                cw.b((int)this.d).O = this.c - 30;
                cw.b((int)this.d).T = 4;
            }
            if (dq.g(this.c - this.i) < 50 && dx.a(this.b, this.c, 2)) {
                this.v = true;
                if (this.k < 3) {
                    es.a();
                    es.E();
                    if (this.c % 24 != 0) {
                        this.c -= this.c % 24;
                    }
                    ++this.r;
                    if (this.r > 10) {
                        this.r = 0;
                        this.o = false;
                        this.n = true;
                        this.e = false;
                    }
                    if (this.g == 1) {
                        if (this.h) {
                            co.m().E = false;
                        } else if (cw.b(this.d) != null) {
                            cw.b((int)this.d).E = false;
                        }
                        this.q = false;
                    }
                } else {
                    this.c = this.i;
                    if (!this.w) {
                        u.a(92, this.b + 4, this.c + 14, 1, 0);
                        cw.bH = 10;
                        this.w = true;
                    }
                    ++this.r;
                    if (this.r > 30) {
                        this.r = 0;
                        this.o = false;
                        this.n = true;
                        this.e = false;
                    }
                    if (this.g == 1) {
                        if (this.h) {
                            co.m().E = false;
                        } else if (cw.b(this.d) != null) {
                            cw.b((int)this.d).E = false;
                        }
                        this.q = false;
                    }
                }
            }
        } else if (this.n) {
            ++this.r;
            if (this.r > 30) {
                int n3 = this.i + 24 - this.c >> 3;
                if (n3 > 30) {
                    n3 = 30;
                }
                this.c -= n3;
                this.e = true;
            } else {
                if (this.r == 14 && this.p) {
                    es.a();
                    es.J();
                }
                if (this.r > 0 && this.g == 0) {
                    if (this.h) {
                        co.m().E = false;
                        if (co.m().T != 14) {
                            co.m().T = 3;
                        }
                        co.m().Q = -3;
                    } else if (cw.b(this.d) != null) {
                        cw.b((int)this.d).E = false;
                        if (cw.b((int)this.d).T != 14) {
                            cw.b((int)this.d).T = 3;
                        }
                        cw.b((int)this.d).Q = -3;
                    }
                    this.q = false;
                }
                if (this.r > 12 && this.g == 0) {
                    if (this.h) {
                        co.m().E = true;
                    } else if (cw.b(this.d) != null) {
                        cw.b((int)this.d).N = this.b;
                        cw.b((int)this.d).O = this.c;
                        cw.b((int)this.d).E = true;
                    }
                    this.q = true;
                }
            }
            if (this.h) {
                if (this.g == 0) {
                    cw.l = this.b - cw.f;
                    cw.m = this.c - cw.g - 1;
                }
                if (this.g == 1) {
                    cw.aO.f = true;
                }
            }
            if (this.c <= -80) {
                if (this.h && this.g == 0) {
                    ci.b = false;
                    co.cb = true;
                }
                if (!this.h && cw.b(this.d) != null && this.g == 0) {
                    cw.E.removeElement(cw.b(this.d));
                }
                if (this.k < 3) {
                    a.removeElement(this);
                } else {
                    this.c = -80;
                    ++this.u;
                    if (this.u > 80) {
                        this.u = 0;
                        a.removeElement(this);
                    }
                }
            }
        }
        if (this.e && this.k < 3 && dq.g(this.c - this.i) <= 50 && main.a.w % 5 == 0) {
            i i2 = new i(19, this.b, this.i + 20, 2, 1, -1);
            h.a(i2);
        }
    }
}

