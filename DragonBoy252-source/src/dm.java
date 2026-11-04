/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class dm {
    public short a;
    public int b;
    public int c;
    public int d;
    public int e;
    private int k;
    private int l;
    public int f;
    public int g;
    private int m;
    private int n;
    public int h;
    public int i;
    public int j;
    private int[] o;
    private int p;

    public final void a(int n2, int[] nArray, int n3, int n4) {
        if (n2 <= 0) {
            return;
        }
        this.h = n2;
        this.o = nArray;
        this.i = n3;
        this.j = n4;
    }

    public dm() {
        new ap();
        this.h = -1;
        this.i = 0;
        this.j = 0;
        int[] nArray = new int[4];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 1;
        this.o = nArray;
        this.c = dq.b(0, 3);
    }

    public final void a() {
        dm dm2 = this;
        if (dm2.e != dm2.d) {
            dm2.l = dm2.d - dm2.e << 2;
            dm2.k += dm2.l;
            dm2.e += dm2.k >> 4;
            dm2.k &= 0xF;
        }
        if (dm2.g != dm2.f) {
            dm2.n = dm2.f - dm2.g << 2;
            dm2.m += dm2.n;
            dm2.g += dm2.m >> 4;
            dm2.m &= 0xF;
        }
        if (main.a.w % 3 == 0) {
            this.c = this.o[this.p];
            ++this.p;
        }
        if (this.p >= this.o.length) {
            this.p = 0;
        }
    }

    public final void b() {
        u.a(60, this.g, this.e + 3 + (main.a.w % 10 > 5 ? 1 : 0), 1);
    }
}

