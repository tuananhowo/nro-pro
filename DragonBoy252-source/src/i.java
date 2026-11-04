/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

public final class i {
    public int a;
    public int b;
    public int c;
    public int d;
    private boolean o;
    private co p;
    public int e;
    private int q;
    public int f;
    public int g;
    private int r;
    private int s;
    private int t;
    private boolean u = true;
    public int h;
    public int i = 0;
    public static eq j = new eq("vEffData");
    public int k = 0;
    public long l = 0L;
    private static eq v = new eq("vLastEff");
    public static eq m = new eq("vNewEff");
    public static eq n = new eq("vdowloadEff");
    private int[] w;
    private int[] x;
    private int[] y;
    private int[] z;
    private int[] A;
    private boolean B;
    private short[] C;

    public static void a(co co2) {
        int n2 = 0;
        while (n2 < 1799) {
            co2.b(0, n2 + 201);
            ++n2;
        }
        if (co2.cs >= 201 && co2.cs < 2000) {
            i i2 = new i(co2.cs, co2, 2, -1, 10, 1);
            new i(co2.cs, co2, 2, -1, 10, 1).b = 5;
            co2.a(i2);
        }
    }

    private static void b(int n2) {
        int n3 = 0;
        while (n3 < j.size()) {
            k k2 = (k)j.elementAt(n3);
            if (k2.d == n2) {
                j.removeElement(k2);
                return;
            }
            ++n3;
        }
    }

    public static k a(int n2) {
        int n3 = 0;
        while (n3 < j.size()) {
            k k2 = (k)j.elementAt(n3);
            if (k2.d == n2) {
                return k2;
            }
            ++n3;
        }
        return null;
    }

    public i() {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.w = nArray;
        this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        this.y = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
        this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        this.B = false;
    }

    public i(int n2, co object, int n3, int n4, int n5, byte by2) {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.w = nArray;
        this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        this.y = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
        this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        this.B = false;
        this.p = object;
        this.a = n2;
        this.h = n3;
        this.r = n4;
        this.s = n5;
        this.i = by2;
        if (i.a(n2) == null) {
            object = new k();
            new k().d = n2;
            if (n2 >= 42 && n2 <= 46) {
                n2 = 106;
            }
            String string = "/x" + eh.b + "/effectdata/" + n2 + "/data";
            InputStream inputStream = null;
            try {
                inputStream = v.a(string);
            }
            catch (Exception exception) {}
            if (inputStream != null) {
                if (n2 > 100 && n2 < 200) {
                    ((k)object).b(string);
                } else {
                    ((k)object).a(string);
                }
                ((k)object).a = ej.b("/effectdata/" + n2 + "/img.png");
            } else {
                cj.a().a((short)n2);
            }
            j.addElement(object);
        }
        this.c = -1;
        this.d = -1;
        this.k = -1;
        this.b = 4;
        if (n2 == 78) {
            this.b = 5;
        }
    }

    public i(int n2, int n3, int n4, int n5, int n6, int n7) {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.w = nArray;
        this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
        this.y = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
        this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
        this.B = false;
        this.f = n3;
        this.g = n4;
        this.a = n2;
        this.h = n5;
        this.r = n6;
        this.s = n7;
        if (i.a(n2) == null) {
            k k2 = new k();
            new k().d = n2;
            if (n2 >= 42 && n2 <= 46) {
                n2 = 106;
            }
            String string = "/x" + eh.b + "/effectdata/" + n2 + "/data";
            InputStream inputStream = null;
            try {
                inputStream = v.a(string);
            }
            catch (Exception exception) {}
            if (inputStream != null) {
                if (n2 > 100 && n2 < 200) {
                    k2.b(string);
                } else {
                    k2.a(string);
                }
                k2.a = ej.b("/effectdata/" + n2 + "/img.png");
            } else {
                cj.a().a((short)n2);
            }
            j.addElement(k2);
            if (v.size() > 20) {
                i.b(Integer.parseInt((String)v.elementAt(0)));
                v.removeElementAt(0);
            }
            v.addElement(String.valueOf(this.a));
        }
        this.c = -1;
        this.d = -1;
        this.b = n2 == 78 ? 5 : 1;
        if (!i.a(String.valueOf(this.a))) {
            m.addElement(String.valueOf(this.a));
        }
    }

    private static boolean a(String string) {
        int n2 = 0;
        while (n2 < m.size()) {
            String string2 = (String)m.elementAt(n2);
            if (string2.equals(string)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private boolean b() {
        return this.u;
    }

    public final void a(eh eh2, int n2, int n3) {
        if (!this.b()) {
            return;
        }
        if (i.a((int)this.a).a != null) {
            i.a(this.a).a(eh2, this.q, this.f + n2, this.g + n3, this.k, this.h);
        }
    }

    public final void a(eh eh2) {
        if (!this.b()) {
            return;
        }
        if (i.a(this.a) == null) {
            return;
        }
        if (i.a((int)this.a).a != null) {
            try {
                i.a(this.a).a(eh2, this.q, this.f, this.g, this.k, this.h);
                return;
            }
            catch (Exception exception) {
                dq.c("Effect " + this.a + " err at frame " + this.q + " vitri " + this.f + "_" + this.g + "   " + this.h);
                exception.printStackTrace();
            }
        }
    }

    public final void a() {
        block46: {
            try {
                k k2;
                if (this.a >= 42 && this.a <= 46) {
                    i i2 = this;
                    if (i2.a == 42) {
                        i2.q = i2.w[i2.e];
                    }
                    if (i2.a == 43) {
                        i2.q = i2.x[i2.e];
                    }
                    if (i2.a == 44) {
                        i2.q = i2.y[i2.e];
                    }
                    if (i2.a == 45) {
                        i2.q = i2.z[i2.e];
                    }
                    if (i2.a == 46) {
                        i2.q = i2.A[i2.e];
                    }
                    ++i2.e;
                    if (i2.e > i2.w.length - 1) {
                        i2.e = 0;
                    }
                    return;
                }
                if (i.a(this.a) == null) {
                    return;
                }
                if (i.a((int)this.a).a == null) {
                    return;
                }
                if (this.b == 5) {
                    int n2 = this.p.T;
                    k2 = i.a(this.a);
                    if (n2 >= k2.c.length) {
                        n2 = 0;
                    }
                    this.C = k2.c[n2] == null ? new short[1] : k2.c[n2];
                } else {
                    k2 = i.a(this.a);
                    this.C = k2.b;
                }
                if (this.C != null) {
                    if (!this.B) {
                        this.B = true;
                        int n3 = this.C.length - 1;
                        if (n3 > 0 && this.b != 1) {
                            this.e = dq.b(0, n3);
                        }
                        if (this.b == 0) {
                            this.e = dq.b(this.c, this.d);
                        }
                    }
                    switch (this.b) {
                        case 4: {
                            this.f = this.p.N;
                            this.g = this.p.O;
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 5: {
                            this.k = this.p.U == 1 ? 0 : 1;
                            this.f = this.p.U == 1 ? this.p.N - 15 : this.p.N + 15;
                            this.g = this.p.dh == 0 ? this.p.O - 25 : this.p.O - 35;
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 1: 
                        case 3: {
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 0: {
                            if (dq.a(this.f - 50, this.g - 50, 100, 100, co.m().N, co.m().O) && this.e > this.c && this.e < this.d) {
                                if (this.e < this.d) {
                                    this.e = this.d;
                                }
                                this.o = true;
                            }
                            if (!this.o) {
                                ++this.e;
                                if (this.e != this.d) break;
                                this.e = this.c;
                                break;
                            }
                            if (this.e >= this.C.length) break;
                            ++this.e;
                            break;
                        }
                        case 2: {
                            if (this.e < this.C.length) {
                                ++this.e;
                            }
                            ++this.t;
                            if (this.t != this.s) break;
                            this.t = 0;
                            this.k = dq.b(0, 2);
                        }
                    }
                    if (this.e == this.C.length / 2 && (this.a == 62 || this.a == 63 || this.a == 64 || this.a == 65)) {
                        es.aa();
                    }
                    if (this.e <= this.C.length - 1) {
                        this.q = this.C[this.e];
                    }
                }
                if (this.e >= this.C.length - 1) {
                    if (this.b == 0 || this.b == 3) {
                        this.u = false;
                    }
                    if (this.s == -1) {
                        h.a.removeElement(this);
                    }
                    if (this.b == 2) {
                        this.e = 0;
                        return;
                    }
                    if (this.b == 1 && this.r == 1) {
                        this.u = false;
                    }
                    if (this.b == 4 || this.b == 5) {
                        if (this.r == -1) {
                            this.e = 0;
                            return;
                        }
                        ++this.t;
                        if (this.t == this.s) {
                            this.t = 0;
                            --this.r;
                            this.e = 0;
                            if (this.r == 0) {
                                this.p.b(0, this.a);
                            }
                        }
                        return;
                    }
                    this.o = false;
                    if (this.r == -1) {
                        ++this.t;
                        this.e = 0;
                        if (this.t == this.s) {
                            this.t = 0;
                            if (this.s > 1) {
                                this.k = dq.b(0, 2);
                                return;
                            }
                        }
                    } else {
                        ++this.t;
                        this.e = 0;
                        if (this.t == this.s) {
                            this.t = 0;
                            --this.r;
                            if (this.r == 0) {
                                h.a.removeElement(this);
                                return;
                            }
                        }
                    }
                    break block46;
                }
                this.u = true;
                return;
            }
            catch (Exception exception) {
                System.out.println("err  Effect.update: " + this.a + "  " + this.b);
                exception.printStackTrace();
                h.a.removeElement(this);
            }
        }
    }
}

