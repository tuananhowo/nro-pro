/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import main.a;

public final class t
extends j {
    private int d;
    private af e;
    public static Random a = new Random(System.currentTimeMillis());
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l = false;
    private long m;
    private long n;
    private co o;
    private eq p = new eq("vDarts");
    private int q = 0;
    private int r = 0;
    private static int[] s;
    public static final int[] b;
    public static final byte[] c;

    static {
        int[] nArray = new int[18];
        nArray[1] = 15;
        nArray[2] = 37;
        nArray[3] = 52;
        nArray[4] = 75;
        nArray[5] = 105;
        nArray[6] = 127;
        nArray[7] = 142;
        nArray[8] = 165;
        nArray[9] = 195;
        nArray[10] = 217;
        nArray[11] = 232;
        nArray[12] = 255;
        nArray[13] = 285;
        nArray[14] = 307;
        nArray[15] = 322;
        nArray[16] = 345;
        nArray[17] = 370;
        s = nArray;
        int[] nArray2 = new int[16];
        nArray2[3] = 7;
        nArray2[4] = 6;
        nArray2[5] = 6;
        nArray2[6] = 6;
        nArray2[7] = 2;
        nArray2[8] = 2;
        nArray2[9] = 3;
        nArray2[10] = 3;
        nArray2[11] = 4;
        nArray2[12] = 5;
        nArray2[13] = 5;
        nArray2[14] = 5;
        nArray2[15] = 1;
        b = nArray2;
        byte[] byArray = new byte[25];
        byArray[1] = 1;
        byArray[2] = 2;
        byArray[3] = 1;
        byArray[5] = 1;
        byArray[6] = 2;
        byArray[7] = 1;
        byArray[9] = 1;
        byArray[10] = 2;
        byArray[11] = 1;
        byArray[13] = 1;
        byArray[14] = 2;
        byArray[15] = 1;
        byArray[17] = 1;
        byArray[18] = 2;
        byArray[19] = 1;
        byArray[21] = 1;
        byArray[22] = 2;
        byArray[23] = 1;
        c = byArray;
    }

    public static void a(int n2, int n3, boolean bl2, long l2, long l3, co co2, int n4) {
        j.y.addElement(new t(n2, n3, bl2, l2, l3, co2, n4));
    }

    /*
     * WARNING - void declaration
     */
    private t(int n2, int n3, boolean bl2, long l2, long l3, co co2, int n4) {
        void var8_8;
        void var6_7;
        void var4_6;
        void var9_9;
        this.e = cw.x[var9_9];
        this.i = n2;
        this.j = n3;
        this.m = var4_6;
        this.n = var6_7;
        this.o = var8_8;
        this.d = this.e.i;
        int n5 = dq.a(var8_8.N - n2, var8_8.O - n3);
        t t2 = this;
        this.f = n5;
        t2.g = t2.d * dq.b(n5) >> 10;
        t2.h = t2.d * dq.a(n5) >> 10;
        if (n2 >= cw.j && n2 <= cw.j + main.a.A) {
            es.a();
            es.B();
        }
    }

    public final void b() {
        int n2 = 0;
        while (n2 < this.e.h) {
            if (this.e.c.length > 0) {
                this.p.addElement(new v(this.i, this.j));
            }
            this.q = (this.o != null ? this.o.N : 0) - this.i;
            this.r = (this.o != null ? this.o.O : 0) - 10 - this.j;
            int n3 = 60;
            if (dx.l == 0) {
                n3 = 600;
            }
            ++this.k;
            if (this.o != null && (this.o.T == 5 || this.o.T == 14) || this.o == null) {
                this.i += ((this.o != null ? this.o.N : 0) - this.i) / 2;
                this.j += ((this.o != null ? this.o.O : 0) - this.j) / 2;
            }
            if (dq.g(this.q) < 16 && dq.g(this.r) < 16 || this.k > n3) {
                if (this.o != null && this.o.V >= 0 && this.n != -1L) {
                    if (this.n != -100L) {
                        this.o.a(this.m, this.n, false, true);
                    } else {
                        u.a(80, this.o, 1);
                    }
                }
                j.y.removeElement(this);
                if (this.n != -100L) {
                    u.a(81, this.o, 1);
                    if (this.i >= cw.j && this.i <= cw.j + main.a.A) {
                        es.a();
                        es.D();
                    }
                }
            }
            if (Math.abs((n3 = dq.a(this.q, this.r)) - this.f) < 90 || this.q * this.q + this.r * this.r > 4096) {
                this.f = Math.abs(n3 - this.f) < 15 ? n3 : (n3 - this.f >= 0 && n3 - this.f < 180 || n3 - this.f < -180 ? dq.c(this.f + 15) : dq.c(this.f - 15));
            }
            if (this.d < 8192) {
                this.d += 1024;
            }
            this.g = this.d * dq.b(this.f) >> 10;
            this.h = this.d * dq.a(this.f) >> 10;
            this.q += this.g;
            n3 = this.q >> 10;
            this.i += n3;
            this.q &= 0x3FF;
            this.r += this.h;
            n3 = this.r >> 10;
            this.j += n3;
            this.r &= 0x3FF;
            ++n2;
        }
        n2 = 0;
        while (n2 < this.p.size()) {
            v v2 = (v)this.p.elementAt(n2);
            ++v2.a;
            if (v2.a >= this.e.c.length) {
                this.p.removeElementAt(n2);
            }
            ++n2;
        }
    }

    public static int a(int n2) {
        int n3 = 0;
        while (n3 < s.length - 1) {
            if (n2 >= s[n3] && n2 <= s[n3 + 1]) {
                if (n3 >= 16) {
                    return 0;
                }
                return n3;
            }
            ++n3;
        }
        return 0;
    }

    public final void a(eh eh2) {
        v v2;
        int n2 = t.a(360 - this.f);
        byte by2 = c[n2];
        n2 = b[n2];
        int n3 = this.p.size() / 2;
        while (n3 < this.p.size()) {
            v v3 = (v)this.p.elementAt(n3);
            er.b(eh2, this.e.d[v3.a], v3.b, v3.c, 0, 3);
            ++n3;
        }
        n3 = main.a.w % this.e.b.length;
        er.b(eh2, this.e.b[n3][by2], this.i, this.j, n2, 3);
        int n4 = 0;
        while (n4 < this.p.size()) {
            v2 = (v)this.p.elementAt(n4);
            er.b(eh2, this.e.c[v2.a], v2.b, v2.c, 0, 3);
            ++n4;
        }
        er.b(eh2, this.e.a[n3][by2], this.i, this.j, n2, 3);
        n4 = 0;
        while (n4 < this.p.size()) {
            v2 = (v)this.p.elementAt(n4);
            if (dq.g(a.nextInt(100)) < this.e.g) {
                er.b(eh2, main.a.w % 2 == 0 ? this.e.e[v2.a] : this.e.f[v2.a], v2.b, v2.c, 0, 3);
            }
            ++n4;
        }
    }
}

