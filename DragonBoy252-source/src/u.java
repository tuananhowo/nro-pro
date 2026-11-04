/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class u
extends j {
    private ah a;
    private int b;
    private int c;
    private int d;
    private co e;
    private dh f;
    private short g = 0;
    private long h = 0L;
    private int i;

    public static void a(int n2, int n3, int n4, int n5) {
        u u2 = new u();
        new u().a = cw.z[n2 - 1];
        u2.c = n3;
        u2.d = n4;
        u2.g = (short)n5;
        j.y.addElement(u2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        u u2 = new u();
        new u().a = cw.z[n2 - 1];
        u2.c = n3;
        u2.d = n4;
        u2.g = 1;
        u2.i = n6;
        j.y.addElement(u2);
    }

    public static void a(int n2, dh dh2, int n3) {
        u u2 = new u();
        new u().a = cw.z[n2 - 1];
        u2.f = dh2;
        u2.g = 1;
        j.y.addElement(u2);
    }

    public static void a(int n2, co co2, int n3) {
        u u2 = new u();
        new u().a = cw.z[n2 - 1];
        u2.e = co2;
        u2.g = (short)n3;
        j.y.addElement(u2);
    }

    public final void a(eh eh2) {
        if (eh.b == 1) {
            ++cw.aY;
        }
        if (cw.aY < 11) {
            int n2;
            int n3;
            if (this.e != null) {
                this.c = this.e.N;
                this.d = this.e.O + main.a.ag;
            }
            if (this.f != null) {
                this.c = this.f.p;
                this.d = this.f.q + main.a.ag;
            }
            if (main.a.d(n3 = this.c + this.a.a[this.b].a, n2 = this.d + this.a.a[this.b].b)) {
                er.b(eh2, this.a.a[this.b].c, n3, n2, this.i, 3);
            }
        }
    }

    public final void b() {
        if (0L != 0L) {
            ++this.b;
            if (this.b >= this.a.a.length) {
                this.b = 0;
            }
            if (System.currentTimeMillis() > 0L) {
                j.y.removeElement(this);
            }
        } else {
            ++this.b;
            if (this.b >= this.a.a.length) {
                this.g = (short)(this.g - 1);
                if (this.g <= 0) {
                    j.y.removeElement(this);
                } else {
                    this.b = 0;
                }
            }
        }
        if (main.a.w % 11 == 0 && this.e != null && this.e != co.m() && !cw.E.contains(this.e)) {
            j.y.removeElement(this);
        }
    }
}

