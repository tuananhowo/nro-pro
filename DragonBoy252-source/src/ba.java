/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class ba
extends bg
implements ao {
    private static Image dI = ej.b("/mainImage/myTexture2dhatdau.png");
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public int j;
    public boolean k;
    public int[] l;
    public int[] m;
    private bo dJ = new bo("", 0, 0);
    public boolean n;
    public static boolean o = true;
    public boolean p;
    public int q;
    public long r;
    public long s;
    private boolean dK;
    private int dL = 0;

    public ba(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(n2, n3, n4, n5, n6, n7);
        this.dJ.i = new ae(null, this, 1, null);
        bo.a(this.dJ);
    }

    public final void a(eh eh2) {
        if (this.a == 0) {
            return;
        }
        er.b(eh2, this.a, this.N, this.O, 0, dv.c);
        if (co.m().bh != null && co.m().bh.equals(this)) {
            eh2.a(dh.W, 0, 0, 9, 6, 0, this.N, this.O - er.a[this.a][4] - 1, 33);
            if (this.i != null) {
                ev.n.a(eh2, this.i, this.N, this.O - er.a[this.a][4] - 20, 2, ev.o);
            }
        } else if (this.i != null) {
            ev.n.a(eh2, this.i, this.N, this.O - er.a[this.a][4] - 17, 2, ev.o);
        }
        try {
            int n2 = 0;
            while (n2 < this.e) {
                eh2.a(dI, this.N + this.l[n2] - er.a[this.a][3] / 2, this.O + this.m[n2] - er.a[this.a][4], 0);
                ++n2;
            }
        }
        catch (Exception exception) {}
        if (this.cu >= 0 && this.cv != null && this.bb == 0) {
            er.b(eh2, this.cv.a[this.cu].c, this.N + this.cv.a[this.cu].a, this.O - 15 + this.cv.a[this.cu].b, 0, 3);
            if (main.a.w % 2 == 0) {
                ++this.cu;
                if (this.cu >= this.cv.a.length) {
                    this.cu = 0;
                }
            }
        }
    }

    public final void a() {
        this.dJ.j = o;
        this.s = System.currentTimeMillis();
        if (this.s - this.r >= 1000L) {
            --this.q;
            this.r = this.s;
            if (this.q < 0) {
                this.q = 0;
            }
        }
        if (!this.k) {
            if (this.e < this.g && this.q == 0) {
                this.dK = true;
            }
        } else if (this.q == 0) {
            this.k = false;
            this.dK = true;
        }
        if (this.dK) {
            ++this.dL;
            if (this.dL == 20) {
                this.dL = 0;
                this.dK = false;
                cj.a().f((byte)2);
            }
        }
        if (this.l != null) {
        }
        if (this.n) {
            this.n = false;
            if (this.q >= 0 && this.e < this.g || this.q >= 0 && this.k || this.p) {
                this.dJ.a(new String[]{!this.k ? String.valueOf(this.e) + "/" + this.g : ch.cC, o.b(this.q)}, this.N, this.O - 20 - er.a[this.a][4]);
            } else if (this.e == this.g && !this.k) {
                this.dJ.a(new String[]{ch.cM, String.valueOf(this.e) + "/" + this.g}, this.N, this.O - 20 - er.a[this.a][4]);
            }
        }
        if (this.q >= 0 && this.e < this.g || this.q >= 0 && this.k) {
            this.dJ.c[this.dJ.c.length - 1] = o.b(this.q);
        }
        if (this.p) {
            this.dJ.j = false;
            u.a(98, this.N + this.l[this.e - 1] - er.a[this.a][3] / 2, this.O + this.m[this.e - 1] - er.a[this.a][4], 1);
            --this.e;
            if (main.a.w % 2 == 0) {
                es.a();
                es.y();
            }
            if (this.e == this.f) {
                this.dJ.j = true;
                this.n = true;
                this.p = false;
            }
        }
        super.a();
    }

    public final void a(int n2, Object object) {
        if (n2 == 1) {
            cj.a().e((byte)1);
        }
    }
}

