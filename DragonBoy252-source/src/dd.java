/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class dd {
    public byte a;
    public byte b;
    public byte c;
    public byte d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public byte j;
    public byte k;
    public co l;
    public dh m;
    public au[] n;
    int[] o;
    int p;
    long q;
    public g r;
    private eq s;

    public dd() {
        int[] nArray = new int[10];
        nArray[5] = 1;
        nArray[6] = 1;
        nArray[7] = 1;
        nArray[8] = 1;
        nArray[9] = 1;
        this.o = nArray;
        this.p = 0;
        this.s = new eq("");
    }

    public final void a(int n2, int n3, int n4, byte by2, byte by3, short s2, String string, String string2, co co2, au[] auArray) {
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.a = by2;
        this.d = by3;
        if (s2 != -1) {
            this.m = new dh();
            this.m.H = s2;
        }
        this.h = string;
        this.i = string2;
        this.l = co2;
        this.n = auArray;
        this.a();
    }

    public final void a(byte by2, byte by3) {
        this.b = by2;
        this.c = by3;
    }

    public final void a(byte by2) {
        this.j = by2;
        this.a();
    }

    public final void b(byte by2) {
        this.k = by2;
        this.a();
    }

    public static dd a(eq eq2, int n2) {
        if (eq2 != null) {
            int n3 = 0;
            while (n3 < eq2.size()) {
                dd dd2 = (dd)eq2.elementAt(n3);
                if (dd2 != null && dd2.e == n2) {
                    return dd2;
                }
                ++n3;
            }
        }
        return null;
    }

    public final void a() {
        this.r = new g();
        Object object = null;
        String string = "";
        string = String.valueOf(string) + "\n|6|" + this.i;
        string = String.valueOf(string) + "\n--";
        if (this.n != null) {
            int n2 = 0;
            while (true) {
                int n3 = 0;
                int n4 = 0;
                while (n4 < this.n.length) {
                    object = this.n[n4].a();
                    if (!((String)object).equals("") && n2 == this.n[n4].b) {
                        ++n3;
                        break;
                    }
                    ++n4;
                }
                if (n3 == 0) break;
                string = n2 == 0 ? String.valueOf(string) + "\n|6|2|--" + ch.h + "--" : String.valueOf(string) + "\n|6|2|--" + ch.g + " Lv." + n2 + "--";
                n4 = 0;
                while (n4 < this.n.length) {
                    object = this.n[n4].a();
                    if (!((String)object).equals("") && n2 == this.n[n4].b) {
                        String string2 = "1";
                        if (this.j == 0) {
                            string2 = "2";
                        } else if (this.n[n4].b != 0) {
                            if (this.k == 0) {
                                string2 = "2";
                            } else if (this.j < this.n[n4].b) {
                                string2 = "2";
                            }
                        }
                        string = String.valueOf(string) + "\n|" + string2 + "|1|" + (String)object;
                    }
                    ++n4;
                }
                if (n3 == 0) continue;
                ++n2;
            }
        }
        object = this.r;
        this.r.a = do.d;
        ((g)object).e = do.b;
        ((g)object).d = ev.k.a(string, ((g)object).a - 8);
        ((g)object).b = 10000000;
        ((g)object).i = null;
        ((g)object).g = ((g)object).d.length * 12;
        ((g)object).f = do.c;
        ((g)object).u = 10;
        ((g)object).h = ((g)object).g - do.e;
        if (((g)object).h < 0) {
            ((g)object).h = 0;
        }
    }

    public final void a(eh eh2, int n2, int n3) {
        dd dd2 = this;
        if (dd2.b == dd2.c && dd2.s.size() == 0) {
            int n4 = dq.b(1, 5);
            int n5 = 0;
            while (n5 < n4) {
                bq bq2 = new bq();
                new bq().a = dq.b(5, 25);
                bq2.b = dq.b(5, 25);
                bq2.d = n5 * dq.b(0, 8);
                bq2.e = 0;
                bq2.c = -1;
                dd2.s.addElement(bq2);
                ++n5;
            }
        }
        int n6 = 0;
        while (n6 < this.s.size()) {
            bq bq3 = (bq)this.s.elementAt(n6);
            if (bq3 != null) {
                if (bq3.e < bq3.d) {
                    ++bq3.e;
                }
                if (bq3.e >= bq3.d) {
                    bq3.c = main.a.w / 3 % (do.a.c + 1);
                    if (bq3.c >= do.a.c) {
                        this.s.removeElementAt(n6);
                        --n6;
                    } else {
                        do.a.a(bq3.c, n2 + bq3.a, n3 + bq3.b, 0, 3, eh2);
                    }
                }
            }
            ++n6;
        }
    }
}

