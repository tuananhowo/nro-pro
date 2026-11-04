/*
 * Decompiled with CFR 0.152.
 */
public final class l
extends j {
    private ah a;
    private int b;
    private int c;
    private int d;
    private short e = 0;
    private long f = 0L;

    public static void a(int n2, int n3, int n4, int n5) {
        l l2 = new l();
        new l().a = cw.z[n2 - 1];
        l2.c = n3;
        l2.d = n4;
        l2.e = (short)2;
        j.x.addElement(l2);
    }

    public final void a(eh eh2) {
        if (eh.b == 1) {
            ++cw.aY;
        }
        if (cw.aY < 8) {
            int n2 = this.c + this.a.a[this.b].a;
            int n3 = this.d + this.a.a[this.b].b;
            er.b(eh2, this.a.a[this.b].c, n2, n3, 0, 3);
        }
    }

    public final void b() {
        if (0L != 0L) {
            ++this.b;
            if (this.b >= this.a.a.length) {
                this.b = 0;
            }
            if (System.currentTimeMillis() > 0L) {
                j.x.removeElement(this);
            }
        } else {
            ++this.b;
            if (this.b >= this.a.a.length) {
                this.e = (short)(this.e - 1);
                if (this.e <= 0) {
                    j.x.removeElement(this);
                } else {
                    this.b = 0;
                }
            }
        }
    }
}

