/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class ap
implements ao {
    public eq a = new eq("infoWaitToShow");
    public db b;
    public int c = 100;
    private int k;
    public String[] d;
    private int l;
    private int m;
    private boolean n = false;
    private static Image o = ej.b("/mainImage/myTexture2dgocnhon.png");
    public int e;
    public int f;
    private int p;
    public int g;
    public int h;
    public int i;
    public int j;

    public final void a() {
        this.d = null;
        this.a.removeAllElements();
    }

    public final void a(eh eh2, int n2, int n3, int n4) {
        if (this.a.size() != 0) {
            eh2.a(n2, n3);
            if (this.d != null && this.d.length != 0 && this.p != 1) {
                int n5;
                int n6 = n5 = eh.b == 1 ? 0 : 10;
                if (this.b.c == null) {
                    bo.a(eh2, this.g, this.h, this.i, this.j, 0xFFFFFF, false);
                } else {
                    ej.a(eh2, this.g - 23, this.h - n5 / 2, this.i + 15);
                }
                if (this.b.c == null) {
                    eh2.a(o, 0, 0, 9, 8, n4 == 1 ? 0 : 2, this.l - 3 + (n4 == 1 ? -15 : 20), this.m - 20 + this.k + 2, 17);
                }
                n4 = -1;
                int n7 = 0;
                while (n7 < this.d.length) {
                    int n8;
                    ev ev2 = ev.k;
                    String string = this.d[n7];
                    if (this.d[n7].startsWith("|")) {
                        String[] stringArray = dq.a(this.d[n7], "|", 0);
                        if (stringArray.length == 3) {
                            string = stringArray[2];
                        }
                        if (stringArray.length == 4) {
                            string = stringArray[3];
                            Integer.parseInt(stringArray[2]);
                        }
                        n4 = n8 = Integer.parseInt(stringArray[1]);
                    } else {
                        n8 = n4;
                    }
                    switch (n8) {
                        case -1: {
                            ev2 = ev.k;
                            break;
                        }
                        case 0: {
                            ev2 = ev.f;
                            break;
                        }
                        case 1: {
                            ev2 = ev.h;
                            break;
                        }
                        case 2: {
                            ev2 = ev.b;
                            break;
                        }
                        case 3: {
                            ev2 = ev.p;
                            break;
                        }
                        case 4: {
                            ev2 = ev.r;
                            break;
                        }
                        case 5: {
                            ev2 = ev.q;
                            break;
                        }
                        case 7: {
                            ev2 = ev.a;
                        }
                    }
                    if (this.b.c == null) {
                        ev2.a(eh2, string, this.l, this.m - 15 + this.k + n7 * 12 - this.d.length * 12 - 9, 2);
                    } else {
                        n8 = this.g - 23;
                        int n9 = this.h - n5 / 2;
                        int n10 = ej.c == 1 ? this.i + 28 : this.i + 25;
                        int n11 = this.j + (main.a.e ? 0 : 14) + n5;
                        eh2.a(0x442211);
                        eh2.d(n8, n9 + n11, n10, 2);
                        n10 = this.b.f * n10 / this.b.g;
                        if (n10 < 0) {
                            n10 = 0;
                        }
                        eh2.a(43758);
                        eh2.d(n8, n9 + n11, n10, 2);
                        if (this.b.f == 0) {
                            return;
                        }
                        this.b.c.a(eh2, this.g + 5, this.h + this.j / 2, 0);
                        if (eh.b == 1) {
                            (this.b.d ? ev.F : ev.I).a(eh2, this.b.c.au, this.g + 12, this.h + 3, 0);
                        } else {
                            (this.b.d ? ev.F : ev.I).a(eh2, this.b.c.au, this.g + 12, this.h - 3, 0);
                        }
                        if (!main.a.e) {
                            if (!et.g) {
                                ev.G.a(eh2, "Nh\u1ea5n # \u0111\u1ec3 chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
                            } else {
                                ev.G.a(eh2, "Nh\u1ea5n Y \u0111\u1ec3 chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
                            }
                        }
                        if (eh.b == 1) {
                            ce.a(eh2, string, this.g + 14, this.h + this.j / 2 + 2, this.i - 16, this.j, ev.H);
                        } else {
                            String[] stringArray = ev.H.a(string, 120);
                            int n12 = 0;
                            while (n12 < stringArray.length) {
                                ev.H.a(eh2, stringArray[n12], this.g + 12, this.h + 12 + n12 * 12 - 3, 0);
                                ++n12;
                            }
                            main.a.a(eh2);
                        }
                    }
                    ++n7;
                }
                co cfr_ignored_0 = this.b.c;
            }
            eh2.a(-n2, -n3);
        }
    }

    public final void b() {
        if (this.a.size() != 0 && this.b.f == 0) {
            ++this.e;
            if (this.e >= this.b.b) {
                db db2;
                this.e = 0;
                this.a.removeElementAt(0);
                if (this.a.size() == 0) {
                    return;
                }
                this.b = db2 = (db)this.a.firstElement();
                this.c();
            }
        }
    }

    public final void c() {
        int n2;
        this.c = 100;
        if (main.a.A == 128) {
            this.c = 128;
        }
        if (this.b.c != null) {
            this.d = new String[]{this.b.a};
            if (eh.b == 1) {
                n2 = this.d.length;
            } else {
                String[] stringArray = ev.H.a(this.b.a, 120);
                n2 = stringArray.length;
            }
        } else {
            this.d = ev.k.a(this.b.a, this.c - 10);
            n2 = this.d.length;
        }
        this.k = 7;
        this.g = this.l - this.c / 2 - 1;
        this.h = this.m - 15 + this.k - n2 * 12 - 15;
        this.i = this.c + 2 + (this.b.c != null ? 30 : 0);
        this.j = (n2 + 1) * 12 + 1 + (this.b.c != null ? 5 : 0);
    }

    public final void a(String string, int n2, co co2, boolean bl2) {
        this.p = n2;
        if (this.a.size() > 10) {
            this.a.removeElementAt(0);
        }
        if (this.a.size() > 0) {
            string.equals(((db)this.a.lastElement()).a);
        }
        db db2 = new db(string);
        if (this.p == 0) {
            db2.b = string.length();
        }
        if (db2.b < 70) {
            db2.b = 70;
        }
        if (this.p == 1) {
            db2.b = 10000000;
        }
        if (this.p == 3) {
            db2.b = 300;
            db2.h = ej.j();
            db2.f = string.length();
            if (db2.f < 15) {
                db2.f = 15;
            }
            if (db2.f > 100) {
                db2.f = 100;
            }
            db2.g = db2.f;
        }
        if (co2 != null) {
            db2.c = co2;
            db2.d = bl2;
            main.a.G.a(db2);
            if (main.a.e && main.a.G.au) {
                cw.aP.i = new ae(ch.br, this, 1000, db2);
            }
        }
        if (co2 != null && main.a.G.au || co2 == null) {
            this.a.addElement(db2);
        }
        if (this.a.size() == 1) {
            this.b = (db)this.a.firstElement();
            this.c();
        }
        if (main.a.e && co2 != null && main.a.G.au && main.a.A - 50 > 155 + this.i) {
            cw.aP.i.j = main.a.A - this.i - 50;
            cw.aP.i.k = 35;
        }
    }

    public final void a(int n2, Object object) {
        if (n2 == 1000) {
            el el2 = el.b();
            cw.l();
            el2.a(ch.cT);
        }
    }
}

