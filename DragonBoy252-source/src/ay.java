/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class ay {
    public short a;
    public int b = 0;
    public int c;
    private long d;
    private long e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private String k;
    private int l = 100;

    public ay(short s2, int n2) {
        this.a = s2;
        this.c = n2 / 60;
        this.b = n2 % 60;
        this.g = n2;
        this.h = n2;
        this.d = this.e = System.currentTimeMillis();
        this.f = s2 == 14;
    }

    public ay() {
    }

    public static boolean a(int n2) {
        int n3 = 0;
        while (n3 < co.bI.size()) {
            ay ay2 = (ay)co.bI.elementAt(n3);
            if (ay2.a == n2) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    public static boolean b(int n2) {
        int n3 = 0;
        while (n3 < cw.bI.size()) {
            ay ay2 = (ay)cw.bI.elementAt(n3);
            if (ay2.a == n2) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    public static ay c(int n2) {
        int n3 = 0;
        while (n3 < co.bI.size()) {
            ay ay2 = (ay)co.bI.elementAt(n3);
            if (ay2.a == n2) {
                return ay2;
            }
            ++n3;
        }
        return null;
    }

    public static ay d(int n2) {
        int n3 = 0;
        while (n3 < cw.bI.size()) {
            ay ay2 = (ay)cw.bI.elementAt(n3);
            if (ay2.a == n2) {
                return ay2;
            }
            ++n3;
        }
        return null;
    }

    public final void a(byte by2, String string, int n2) {
        this.j = n2 == -1;
        this.i = true;
        this.c = n2 / 60;
        this.b = n2 % 60;
        this.a = by2;
        this.g = n2;
        this.h = n2;
        this.k = string;
        this.d = this.e = System.currentTimeMillis();
        this.f = this.a == 14;
    }

    public final void a(int n2, boolean bl2) {
        this.c = n2 / 60;
        this.b = n2 % 60;
        this.g = n2;
        this.h = n2;
        this.i = false;
        this.d = this.e = System.currentTimeMillis();
    }

    public final void a(eh eh2, int n2, int n3) {
        if (this.f) {
            if (co.m() != null) {
                n2 = main.a.A / 2 - 40;
                n3 = main.a.B - 80;
                eh2.a(0x808080);
                eh2.d(n2, n3, 80, 2);
                eh2.a(0xFFFFFF);
                if (this.l > 0) {
                    eh2.d(n2, n3, 80 * this.l / 100, 2);
                    return;
                }
            }
        } else {
            String string = String.valueOf(this.c) + "'";
            if (this.c <= 0) {
                string = String.valueOf(this.b) + "s";
            }
            if (this.c < 0) {
                string = "";
            }
            if (this.j) {
                string = "";
            }
            ev.c.a(eh2, String.valueOf(this.k) + " " + string, n2, n3, 0, ev.f);
        }
    }

    public final void a() {
        this.d = System.currentTimeMillis();
        if (this.d - this.e >= 1000L) {
            this.e = System.currentTimeMillis();
            --this.b;
            --this.h;
            if (this.b <= 0) {
                this.b = 60;
                --this.c;
            }
            if (this.g > 0) {
                this.l = this.h * 100 / this.g;
            }
        }
        if (this.c < 0 && !this.i) {
            co.bI.removeElement(this);
        }
        if (this.c < 0 && this.i && !this.j) {
            cw.bI.removeElement(this);
        }
    }
}

