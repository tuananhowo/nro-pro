/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class am {
    private eq d = new eq("EffectEnd VecEffEnd");
    private dz e;
    private byte[] f = new byte[10];
    private byte[] g = new byte[10];
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    public int a;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private short G;
    private long H;
    public boolean b;
    private boolean I;
    private co J;
    private bn[] K;
    private bn L;
    public static short[][] c;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int[] R;
    private int[] S;
    private int[] T;
    private int[] U;
    private static int[][] V;
    private int[] W;
    private int X;
    private int Y;
    private int Z;
    private dz[] aa;

    static {
        short[][] sArrayArray = new short[29][];
        sArrayArray[0] = new short[]{68, 264, 4};
        sArrayArray[1] = new short[]{30, 120, 4};
        sArrayArray[2] = new short[]{66, 280, 4};
        short[] sArray = new short[3];
        sArray[2] = 1;
        sArrayArray[3] = sArray;
        sArrayArray[4] = new short[]{111, 68, 2};
        sArrayArray[5] = new short[]{90, 68, 2};
        sArrayArray[6] = new short[]{125, 68, 2};
        sArrayArray[7] = new short[]{47, 282, 6};
        sArrayArray[8] = new short[]{10, 40, 4};
        sArrayArray[9] = new short[]{92, 525, 7};
        sArrayArray[10] = new short[]{62, 372, 6};
        sArrayArray[11] = new short[]{80, 352, 4};
        sArrayArray[12] = new short[]{80, 352, 4};
        sArrayArray[13] = new short[]{80, 352, 4};
        sArrayArray[14] = new short[]{72, 240, 3};
        sArrayArray[15] = new short[]{20, 42, 3};
        sArrayArray[16] = new short[]{65, 160, 4};
        sArrayArray[17] = new short[]{50, 300, 6};
        sArrayArray[18] = new short[]{84, 168, 2};
        sArrayArray[19] = new short[]{90, 540, 6};
        sArrayArray[20] = new short[]{180, 900, 6};
        sArrayArray[21] = new short[]{62, 186, 3};
        sArrayArray[22] = new short[]{34, 80, 4};
        sArrayArray[23] = new short[]{140, 560, 4};
        sArrayArray[24] = new short[]{64, 600, 6};
        sArrayArray[25] = new short[]{36, 200, 5};
        sArrayArray[26] = new short[]{35, 200, 5};
        sArrayArray[27] = new short[]{50, 250, 5};
        sArrayArray[28] = new short[]{50, 240, 6};
        c = sArrayArray;
        V = new int[][]{{16310304, 16298056, 0xFFFFFF}, {7045120, 12643960, 0xFFFFFF}, {2407423, 11987199, 0xFFFFFF}};
    }

    public static Image a(int n2) {
        if (n2 < 0) {
            return null;
        }
        String string = "/e/e_" + n2 + ".png";
        Image image = null;
        try {
            image = ej.b(string);
        }
        catch (Exception exception) {}
        return image;
    }

    public am(int n2, int n3, int n4, co co2, bn bn2, int n5, short s2, short s3) {
        byte[] byArray = new byte[24];
        byArray[0] = 12;
        byArray[1] = 11;
        byArray[2] = 10;
        byArray[3] = 9;
        byArray[4] = 8;
        byArray[5] = 7;
        byArray[6] = 6;
        byArray[7] = 5;
        byArray[8] = 4;
        byArray[9] = 3;
        byArray[10] = 2;
        byArray[11] = 1;
        byArray[13] = 23;
        byArray[14] = 22;
        byArray[15] = 21;
        byArray[16] = 20;
        byArray[17] = 19;
        byArray[18] = 18;
        byArray[19] = 17;
        byArray[20] = 16;
        byArray[21] = 15;
        byArray[22] = 14;
        byArray[23] = 13;
        byte[] byArray2 = new byte[24];
        byArray2[2] = 2;
        byArray2[3] = 1;
        byArray2[4] = 1;
        byArray2[5] = 2;
        byArray2[8] = 2;
        byArray2[9] = 1;
        byArray2[10] = 1;
        byArray2[11] = 2;
        byArray2[14] = 2;
        byArray2[15] = 1;
        byArray2[16] = 1;
        byArray2[17] = 2;
        byArray2[20] = 2;
        byArray2[21] = 1;
        byArray2[22] = 1;
        byArray2[23] = 2;
        byte[] byArray3 = new byte[24];
        byArray3[0] = 2;
        byArray3[1] = 2;
        byArray3[2] = 3;
        byArray3[3] = 3;
        byArray3[4] = 3;
        byArray3[5] = 4;
        byArray3[6] = 5;
        byArray3[7] = 5;
        byArray3[8] = 5;
        byArray3[9] = 5;
        byArray3[10] = 5;
        byArray3[11] = 1;
        byArray3[17] = 7;
        byArray3[18] = 6;
        byArray3[19] = 6;
        byArray3[20] = 6;
        byArray3[21] = 6;
        byArray3[22] = 6;
        byArray3[23] = 2;
        this.X = 0;
        this.u = 0;
        this.E = 0;
        this.i = n2;
        this.j = n3;
        this.h = n4;
        this.J = co2;
        if (co2.b(1265)) {
            this.J.N = this.i == 21 || this.i == 22 || this.i == 23 ? (this.J.N += 10 * this.J.U) : (this.i == 18 || this.i == 19 || this.i == 20 ? (this.J.N += -15 * this.J.U) : (this.J.N += 15 * this.J.U));
        }
        this.o = this.J.N;
        this.p = this.J.O;
        this.s = this.J.U;
        this.t = this.s == -1 ? 2 : 0;
        this.L = bn2;
        this.a = n5;
        this.H = ej.j();
        this.G = s2;
        this.k = s3;
        this.I = false;
        this.b = false;
        this.n = 4;
        this.f();
        this.b();
    }

    public am(int n2, int n3, int n4, int n5, int n6, int n7, int n8, short s2, bn[] bnArray) {
        byte[] byArray = new byte[24];
        byArray[0] = 12;
        byArray[1] = 11;
        byArray[2] = 10;
        byArray[3] = 9;
        byArray[4] = 8;
        byArray[5] = 7;
        byArray[6] = 6;
        byArray[7] = 5;
        byArray[8] = 4;
        byArray[9] = 3;
        byArray[10] = 2;
        byArray[11] = 1;
        byArray[13] = 23;
        byArray[14] = 22;
        byArray[15] = 21;
        byArray[16] = 20;
        byArray[17] = 19;
        byArray[18] = 18;
        byArray[19] = 17;
        byArray[20] = 16;
        byArray[21] = 15;
        byArray[22] = 14;
        byArray[23] = 13;
        byte[] byArray2 = new byte[24];
        byArray2[2] = 2;
        byArray2[3] = 1;
        byArray2[4] = 1;
        byArray2[5] = 2;
        byArray2[8] = 2;
        byArray2[9] = 1;
        byArray2[10] = 1;
        byArray2[11] = 2;
        byArray2[14] = 2;
        byArray2[15] = 1;
        byArray2[16] = 1;
        byArray2[17] = 2;
        byArray2[20] = 2;
        byArray2[21] = 1;
        byArray2[22] = 1;
        byArray2[23] = 2;
        byte[] byArray3 = new byte[24];
        byArray3[0] = 2;
        byArray3[1] = 2;
        byArray3[2] = 3;
        byArray3[3] = 3;
        byArray3[4] = 3;
        byArray3[5] = 4;
        byArray3[6] = 5;
        byArray3[7] = 5;
        byArray3[8] = 5;
        byArray3[9] = 5;
        byArray3[10] = 5;
        byArray3[11] = 1;
        byArray3[17] = 7;
        byArray3[18] = 6;
        byArray3[19] = 6;
        byArray3[20] = 6;
        byArray3[21] = 6;
        byArray3[22] = 6;
        byArray3[23] = 2;
        this.X = 0;
        this.u = 0;
        this.E = 0;
        this.i = n2;
        this.j = n3;
        this.h = n4;
        this.o = n5;
        this.p = n6;
        this.a = n7;
        this.s = n8;
        this.t = n8 == -1 ? 2 : 0;
        this.H = ej.j();
        this.G = s2;
        this.I = false;
        this.b = false;
        this.n = 4;
        if (bnArray != null) {
            this.K = new bn[bnArray.length];
            n2 = 0;
            while (n2 < this.K.length) {
                this.K[n2] = bnArray[n2];
                ++n2;
            }
        }
        this.f();
        this.b();
    }

    private void b() {
        try {
            int n2 = this.p;
            int n3 = this.o;
            try {
                dq.d(3);
            }
            catch (Exception exception) {
                dq.b("ERR setSoundSkill_END: " + exception.toString());
            }
            switch (this.i) {
                case 0: 
                case 1: 
                case 2: {
                    n2 = this.i;
                    am am2 = this;
                    switch (n2) {
                        case 0: {
                            am2.e = new dz(4);
                            break;
                        }
                        case 1: {
                            am2.e = new dz(5);
                            break;
                        }
                        case 2: {
                            am2.e = new dz(6);
                        }
                    }
                    am2.l = 100;
                    am2.B = main.a.B / 3 + 10;
                    am2.x = 10;
                    am2.z = 0;
                    am2.I = false;
                    return;
                }
                case 3: {
                    this.c();
                    return;
                }
                case 16: 
                case 17: {
                    am am3 = this;
                    if (am3.i == 17) {
                        am3.o = am3.o + (am3.s == 0 ? 0 : -am3.aa[0].a);
                        am3.p -= am3.aa[0].b / 2;
                    }
                    return;
                }
                case 18: 
                case 19: 
                case 20: {
                    am am4 = this;
                    this.f = null;
                    am4.n = 3;
                    if (am4.i == 18) {
                        if (am4.j == 0) {
                            byte[] byArray = new byte[9];
                            byArray[3] = 1;
                            byArray[4] = 1;
                            byArray[5] = 1;
                            byArray[6] = 2;
                            byArray[7] = 2;
                            byArray[8] = 2;
                            am4.f = byArray;
                            break;
                        }
                        am4.f = new byte[]{3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6};
                    }
                    return;
                }
                case 21: 
                case 22: 
                case 23: {
                    am am5 = this;
                    if (am5.J != null) {
                        if (am5.i == 21) {
                            am5.o = am5.J.N - 3 * am5.J.U;
                            am5.p = am5.J.O;
                            int cfr_ignored_0 = am5.o;
                            int cfr_ignored_1 = am5.p;
                            es.aa();
                            break;
                        }
                        if (am5.i == 22) {
                            am5.o = am5.J.N + 20 * am5.J.U;
                            am5.p = am5.J.O - 4;
                            int cfr_ignored_2 = am5.o;
                            int cfr_ignored_3 = am5.p;
                            es.aa();
                            break;
                        }
                        if (am5.i == 23) {
                            am5.o = am5.J.N;
                            am5.p = am5.J.O - 50;
                            int cfr_ignored_4 = am5.o;
                            int cfr_ignored_5 = am5.p;
                            es.aa();
                            break;
                        }
                        am5.o = am5.J.N;
                        am5.p = am5.J.O;
                    }
                    return;
                }
                case 24: {
                    am am6 = this;
                    this.q = am6.aa[0].a;
                    am6.r = am6.aa[0].b;
                    am6.C = dq.g(am6.o - am6.L.b);
                    byte[] byArray = new byte[6];
                    byArray[3] = 1;
                    byArray[4] = 1;
                    byArray[5] = 1;
                    am6.f = byArray;
                    am6.I = false;
                    int cfr_ignored_6 = am6.o;
                    int cfr_ignored_7 = am6.p;
                    es.aa();
                    return;
                }
                case 25: {
                    this.d();
                    return;
                }
                case 26: {
                    am am7 = this;
                    byte[] byArray = new byte[9];
                    byArray[3] = 1;
                    byArray[4] = 1;
                    byArray[5] = 1;
                    byArray[6] = 2;
                    byArray[7] = 2;
                    byArray[8] = 2;
                    this.f = byArray;
                    am7.I = false;
                    am7.m = 10;
                    am7.y = am7.o;
                    am7.z = am7.p + 12;
                    am7.F = 25;
                    am7.B = 19;
                    if (am7.j == 1) {
                        am7.B = 21;
                    } else if (am7.j == 2) {
                        am7.B = 31;
                    }
                    am7.r = am7.aa[1].b + 50 - am7.B;
                    am7.x = 1;
                    am7.A = 1;
                    am7.p = am7.z - am7.r;
                    am7.M = 90;
                    am7.C = 1;
                    am7.O = 25;
                    am7.N = 25;
                    am7.Q = 1;
                    if (am7.K != null && am7.K.length > 0) {
                        am7.Q = am7.K.length;
                    }
                    am7.P = 360 / am7.Q;
                    am7.R = new int[am7.Q];
                    am7.S = new int[am7.Q];
                    am7.T = new int[am7.Q];
                    am7.U = new int[am7.Q];
                    cw.a(16, 0, am7.h, am7.y, am7.z, 1, 0, (short)-1, null);
                    int cfr_ignored_8 = am7.o;
                    int cfr_ignored_9 = am7.p;
                    es.aa();
                    return;
                }
                case 9: {
                    am am8 = this;
                    this.X = am8.j;
                    am8.y = am8.o * 1000;
                    am8.z = am8.p * 1000;
                    am8.l = dq.b(4, 6);
                    am8.C = 5;
                    am8.Y = 10;
                    am8.Z = 20;
                    am8.a(am8.C, am8.Y, am8.Z, 0);
                    return;
                }
                case 10: 
                case 11: {
                    this.e();
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {
            dq.b("ERR create_Effect: " + exception.toString());
            am am9 = this;
            this.b = true;
        }
    }

    public final void a() {
        try {
            ++this.u;
            switch (this.i) {
                case 0: 
                case 1: 
                case 2: {
                    am am2 = this;
                    this.o = main.a.C;
                    am2.p = am2.z;
                    if (am2.u > am2.l) {
                        am am3 = am2;
                        am2.b = true;
                    }
                    ++am2.x;
                    if (am2.x > 15) {
                        am2.x = 15;
                    }
                    if (am2.z + am2.x < am2.B) {
                        am2.z += am2.x;
                        break;
                    }
                    am2.z = am2.B;
                    if (!am2.I) {
                        am2.I = true;
                        if (am2.j != -1) {
                            cw.a(am2.j, 0, 0, am2.o, am2.p, am2.a, 0, (short)-1, null);
                        }
                    }
                    return;
                }
                case 3: {
                    am am4 = this;
                    int n2 = 0;
                    while (n2 < am4.d.size()) {
                        bn bn2 = (bn)am4.d.elementAt(n2);
                        bn2.a();
                        if (bn2.i == bn2.j) {
                            int cfr_ignored_0 = bn2.b;
                            int cfr_ignored_1 = bn2.c;
                            es.aa();
                        }
                        if (bn2.i - bn2.j > bn2.p.c * 3 - 1) {
                            bn2.i = 0;
                            if (am4.j == 0) {
                                bn2.j = dq.d(10);
                                int n3 = 1;
                                if (n2 % 2 == 0) {
                                    n3 = -1;
                                }
                                bn2.b = am4.o + dq.d(c[5][0] / 2) * n3;
                                bn2.c = am4.p - dq.d(c[5][1] / 2);
                            }
                        }
                        ++n2;
                    }
                    if (am4.u >= am4.l) {
                        am am5 = am4;
                        am4.b = true;
                    }
                    return;
                }
                case 16: 
                case 17: {
                    am am6 = this;
                    if (am6.G > 0) {
                        if (main.a.b - am6.H >= (long)am6.G) {
                            am am7 = am6;
                            am6.b = true;
                            break;
                        }
                    } else if (am6.u >= am6.aa[0].c * am6.n) {
                        am am8 = am6;
                        am6.b = true;
                    }
                    return;
                }
                case 18: 
                case 19: 
                case 20: {
                    am am9 = this;
                    if (am9.J != null) {
                        am9.o = am9.J.N;
                        am9.p = am9.J.O + 13;
                    }
                    if (am9.G > 0) {
                        if (main.a.b - am9.H >= (long)am9.G) {
                            am am10 = am9;
                            am9.b = true;
                            break;
                        }
                    } else if (am9.f != null) {
                        if (am9.u > am9.f.length) {
                            am am11 = am9;
                            am9.b = true;
                            break;
                        }
                    } else if (am9.u >= am9.aa[0].c * am9.n) {
                        am am12 = am9;
                        am9.b = true;
                    }
                    return;
                }
                case 21: 
                case 22: 
                case 23: {
                    am am13 = this;
                    if (am13.J != null) {
                        if (am13.i == 21) {
                            am13.o = am13.J.N - 3 * am13.J.U;
                            am13.p = am13.J.O;
                        } else if (am13.i == 22) {
                            am13.o = am13.J.N + 20 * am13.J.U;
                            am13.p = am13.J.O - 4;
                        } else if (am13.i == 23) {
                            am13.o = am13.J.N;
                            am13.p = am13.J.O - 50;
                        } else {
                            am13.o = am13.J.N;
                            am13.p = am13.J.O;
                        }
                    }
                    if (am13.G > 0) {
                        if (main.a.b - am13.H >= (long)am13.G) {
                            am am14 = am13;
                            am13.b = true;
                            break;
                        }
                    } else if (am13.u >= am13.aa[0].c * am13.n) {
                        am am15 = am13;
                        am13.b = true;
                    }
                    return;
                }
                case 24: {
                    am am16 = this;
                    ++am16.w;
                    am16.q += 20;
                    if (am16.q > am16.C) {
                        am16.q = am16.C;
                    }
                    am16.o = am16.J.N + 10;
                    am16.p = am16.J.O - 3;
                    if (am16.s == -1) {
                        am16.o = am16.J.N - am16.q - 10;
                    }
                    if (!am16.I && main.a.b - am16.H >= (long)am16.G) {
                        am16.u = 0;
                        am16.f = new byte[]{2, 2, 2, 3, 3, 3};
                        am16.I = true;
                    }
                    if (am16.u > am16.f.length - 1) {
                        if (am16.I) {
                            am am17 = am16;
                            am16.b = true;
                            break;
                        }
                        am16.u = 0;
                    }
                    return;
                }
                case 25: {
                    am am18 = this;
                    int n4 = 0;
                    int n5 = 0;
                    while (n5 < am18.d.size()) {
                        bn bn3 = (bn)am18.d.elementAt(n5);
                        if (!bn3.n && main.a.b - am18.H >= (long)(n5 * am18.m)) {
                            bn3.n = true;
                            cw.a(17, 0, am18.h, am18.J.N, am18.J.O - 3, 2, am18.t, (short)-1, null);
                            if (n5 == am18.d.size() - 1) {
                                int cfr_ignored_2 = bn3.b;
                                int cfr_ignored_3 = bn3.c;
                                es.aa();
                            } else {
                                int cfr_ignored_4 = bn3.b;
                                int cfr_ignored_5 = bn3.c;
                                es.aa();
                            }
                        }
                        if (bn3.n && !bn3.m) {
                            ++bn3.i;
                            if (!bn3.o) {
                                if (bn3.i < 10 && n5 == am18.d.size() - 1 && am18.J != null && !dx.a(am18.J.N - (am18.J.aA + 1) * am18.J.U, am18.J.O, am18.J.U == 1 ? 8 : 4)) {
                                    am18.J.N -= am18.J.U;
                                }
                                int n6 = bn3.h;
                                int n7 = bn3.g;
                                bn bn4 = bn3;
                                int n8 = n7 - bn4.b;
                                int n9 = n6 - bn4.c;
                                if (n8 > 1) {
                                    n8 = dq.a(n8, n9);
                                    bn4.k = bn4.a(n8);
                                }
                                if (dq.g(bn4.e) > 0 && dq.g(bn4.b - n7) >= dq.g(bn4.e)) {
                                    bn4.b += bn4.e;
                                } else {
                                    bn4.b = n7;
                                    bn4.e = 0;
                                }
                                if (dq.g(bn4.f) > 0 && dq.g(bn4.c - n6) >= dq.g(bn4.f)) {
                                    bn4.c += bn4.f;
                                } else {
                                    bn4.c = n6;
                                    bn4.f = 0;
                                }
                                if (bn3.b == bn3.g) {
                                    bn3.o = true;
                                    bn3.i = 0;
                                }
                            }
                            if (bn3.o && bn3.i >= am18.n * bn3.q.c) {
                                bn3.m = true;
                            }
                        }
                        if (bn3.m) {
                            ++n4;
                        }
                        ++n5;
                    }
                    if (n4 == am18.d.size()) {
                        am am19 = am18;
                        am18.b = true;
                    }
                    return;
                }
                case 26: {
                    am am20 = this;
                    if (am20.E == 0) {
                        if (am20.u == 3) {
                            int cfr_ignored_6 = am20.o;
                            int cfr_ignored_7 = am20.p;
                            es.aa();
                        }
                        ++am20.v;
                        if (am20.v > am20.f.length - 1) {
                            am20.v = am20.f.length - 1;
                        }
                        if (am20.u == am20.m + 4) {
                            cw.a(16, 1, am20.h, am20.o, am20.p, 3, 0, (short)2945, null);
                        }
                        if (am20.u > am20.m + 4) {
                            --am20.M;
                            if (am20.M < 0) {
                                am20.M = 0;
                                am20.u = 0;
                                am20.w = 0;
                                byte[] byArray = new byte[22];
                                byArray[0] = 1;
                                byArray[1] = 1;
                                byArray[6] = 1;
                                byArray[7] = 1;
                                byArray[8] = 1;
                                byArray[9] = 1;
                                byArray[13] = 1;
                                byArray[14] = 1;
                                byArray[15] = 1;
                                byArray[18] = 1;
                                byArray[19] = 1;
                                byArray[20] = 1;
                                byArray[21] = 2;
                                am20.g = byArray;
                                boolean bl2 = true;
                                am am21 = am20;
                                if (am21.K != null) {
                                    int n10 = 0;
                                    while (n10 < am21.K.length) {
                                        if (am21.K[n10] != null) {
                                            cy cy2;
                                            if (am21.K[n10].a == 0) {
                                                cy2 = cw.c(am21.K[n10].l);
                                                if (cy2 != null) {
                                                    cy2.ad = true;
                                                }
                                            } else {
                                                cy2 = co.m().V == am21.K[n10].l ? co.m() : cw.b(am21.K[n10].l);
                                                if (cy2 != null) {
                                                    ((co)cy2).cm = true;
                                                }
                                            }
                                        }
                                        ++n10;
                                    }
                                }
                                am20.E = 1;
                            } else {
                                am am22 = am20;
                                if (am22.C < 40) {
                                    am22.C += 2;
                                }
                                am22.N = am22.O;
                                am22.N -= am22.C;
                                if (am22.N >= 360) {
                                    am22.N -= 360;
                                }
                                if (am22.N < 0) {
                                    am22.N += 360;
                                }
                                am22.O = am22.N;
                                am22 = am20;
                                int n11 = 0;
                                while (n11 < am22.S.length) {
                                    if (am22.N >= 360) {
                                        am22.N -= 360;
                                    }
                                    if (am22.N < 0) {
                                        am22.N += 360;
                                    }
                                    am22.S[n11] = dq.g(am22.M * dq.a(am22.N) / 1024);
                                    am22.R[n11] = dq.g(am22.M * dq.b(am22.N) / 1024);
                                    if (am22.N < 90) {
                                        am22.T[n11] = am22.o + am22.R[n11];
                                        am22.U[n11] = am22.p - am22.S[n11];
                                    } else if (am22.N >= 90 && am22.N < 180) {
                                        am22.T[n11] = am22.o - am22.R[n11];
                                        am22.U[n11] = am22.p - am22.S[n11];
                                    } else if (am22.N >= 180 && am22.N < 270) {
                                        am22.T[n11] = am22.o - am22.R[n11];
                                        am22.U[n11] = am22.p + am22.S[n11];
                                    } else {
                                        am22.T[n11] = am22.o + am22.R[n11];
                                        am22.U[n11] = am22.p + am22.S[n11];
                                    }
                                    am22.N -= am22.P;
                                    ++n11;
                                }
                                am20.a(true);
                            }
                            break;
                        }
                    } else if (am20.E == 1) {
                        ++am20.w;
                        if (am20.w > am20.g.length - 1) {
                            am20.w = am20.g.length - 1;
                            if (main.a.w % 2 == 0) {
                                ++am20.A;
                            }
                            am20.x += am20.A;
                            if (am20.x >= am20.r - am20.aa[0].b - am20.F + am20.B) {
                                am20.x = am20.r - am20.aa[0].b - am20.F + am20.B;
                                am20.u = 0;
                                am20.w = 0;
                                am20.E = 2;
                                am20.g = new byte[]{3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
                                break;
                            }
                        }
                    } else if (am20.E == 2) {
                        ++am20.w;
                        if (am20.w > am20.g.length - 1) {
                            am20.E = 3;
                            am20.v = 0;
                            byte[] byArray = new byte[17];
                            byArray[0] = 2;
                            byArray[1] = 2;
                            byArray[2] = 1;
                            byArray[3] = 1;
                            byArray[6] = 3;
                            byArray[7] = 3;
                            byArray[8] = 3;
                            byArray[12] = 4;
                            byArray[13] = 4;
                            byArray[14] = 4;
                            am20.f = byArray;
                            break;
                        }
                    } else if (am20.E == 3) {
                        ++am20.v;
                        if (am20.v == 3) {
                            int cfr_ignored_8 = am20.o;
                            int cfr_ignored_9 = am20.p;
                            es.aa();
                        }
                        if (am20.v > am20.f.length - 1) {
                            am20.v = 0;
                            am20.E = 4;
                            byte[] byArray = new byte[51];
                            byArray[17] = 3;
                            byArray[18] = 3;
                            byArray[19] = 3;
                            byArray[23] = 4;
                            byArray[24] = 4;
                            byArray[25] = 4;
                            byArray[45] = 3;
                            byArray[46] = 3;
                            byArray[49] = 4;
                            byArray[50] = 4;
                            am20.f = byArray;
                            break;
                        }
                    } else {
                        ++am20.v;
                        if (am20.v > am20.f.length - 1) {
                            am20.v = 0;
                        }
                        if (main.a.b - am20.H >= (long)am20.G) {
                            cw.a(16, 0, am20.h, am20.y, am20.z, 1, 0, (short)-1, null);
                            am20.a(false);
                            am am23 = am20;
                            am20.b = true;
                        }
                    }
                    return;
                }
                case 9: {
                    am am24 = this;
                    int n12 = 0;
                    while (n12 < am24.d.size()) {
                        az az2;
                        az az3 = az2 = (az)am24.d.elementAt(n12);
                        az2.a += az3.e;
                        az3.c += az3.e;
                        az3.b += az3.f;
                        az3.d += az3.f;
                        ++az3.g;
                        if (am24.u >= am24.l) {
                            am24.d.removeElement(az2);
                            --n12;
                        }
                        ++n12;
                    }
                    if (am24.u >= am24.l) {
                        if (main.a.b - am24.H >= (long)am24.G) {
                            am24.d.removeAllElements();
                            am am25 = am24;
                            am24.b = true;
                            break;
                        }
                        am24.l = dq.b(4, 6);
                        am24.u = 0;
                        am24.a(am24.C, am24.Y, am24.Z, 0);
                    }
                    return;
                }
                case 10: 
                case 11: {
                    am am26 = this;
                    int n13 = 0;
                    while (n13 < am26.d.size()) {
                        bn bn5 = (bn)am26.d.elementAt(n13);
                        bn5.a();
                        if (bn5.c < am26.D) {
                            am26.d.removeElementAt(n13);
                            --n13;
                        }
                        ++n13;
                    }
                    if (am26.u >= am26.l) {
                        am am27 = am26;
                        am26.b = true;
                    }
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {
            dq.b("ERR update: " + exception.toString());
            am am28 = this;
            this.b = true;
        }
    }

    public final void a(eh object) {
        try {
            if (this.b || this.u < 0) {
                return;
            }
            switch (this.i) {
                case 0: 
                case 1: 
                case 2: {
                    Object object2 = object;
                    object = this;
                    if (((am)object).e != null) {
                        ((am)object).e.a(((am)object).u / 5 % ((am)object).e.c, ((am)object).o, ((am)object).p, 0, 33, (eh)object2);
                    }
                    return;
                }
                case 3: {
                    Object object3 = object;
                    object = this;
                    int n2 = 0;
                    while (n2 < ((am)object).d.size()) {
                        bn bn2 = (bn)((am)object).d.elementAt(n2);
                        if (bn2.i - bn2.j >= 0 && bn2.p != null) {
                            bn2.p.a((bn2.i - bn2.j) / 3 % bn2.p.c, bn2.b, bn2.c, 0, 3, (eh)object3);
                        }
                        ++n2;
                    }
                    return;
                }
                case 17: {
                    this.a((eh)object, 0);
                    return;
                }
                case 16: {
                    if (this.j == 0) {
                        this.a((eh)object, 33);
                        return;
                    }
                    this.a((eh)object, 3);
                    return;
                }
                case 18: 
                case 19: 
                case 20: {
                    int n3 = 33;
                    Object object4 = object;
                    object = this;
                    if (((am)object).aa[0] != null) {
                        if (((am)object).f != null) {
                            ((am)object).aa[0].a(((am)object).f[((am)object).u % ((am)object).f.length], ((am)object).o, ((am)object).p, ((am)object).t, 33, (eh)object4);
                            break;
                        }
                        ((am)object).aa[0].a(((am)object).u / ((am)object).n % ((am)object).aa[0].c, ((am)object).o, ((am)object).p, ((am)object).t, 33, (eh)object4);
                    }
                    return;
                }
                case 21: 
                case 22: 
                case 23: {
                    int n4 = 3;
                    Object object5 = object;
                    object = this;
                    if (((am)object).aa[0] != null) {
                        ((am)object).aa[0].a(((am)object).u / ((am)object).n % ((am)object).aa[0].c, ((am)object).o, ((am)object).p, ((am)object).t, 3, (eh)object5);
                    }
                    return;
                }
                case 24: {
                    Object object6 = object;
                    object = this;
                    if (((am)object).aa != null) {
                        ((eh)object6).e(((am)object).o, ((am)object).p - ((am)object).r / 2, ((am)object).q, ((am)object).r);
                        int n5 = ((am)object).C;
                        int n6 = ((am)object).p;
                        int n7 = ((am)object).o;
                        byte by2 = ((am)object).f[((am)object).u];
                        dz dz2 = ((am)object).aa[2];
                        dz dz3 = ((am)object).aa[1];
                        dz dz4 = ((am)object).aa[0];
                        Object object7 = object6;
                        Object object8 = object;
                        int n8 = 0;
                        int n9 = n5;
                        boolean bl2 = false;
                        if (dz4 != null && dz2 != null) {
                            bl2 = true;
                            n9 = n5 - (dz4.a + dz2.a);
                        }
                        if (n9 > 0) {
                            n8 = n9 / dz3.a;
                            if (n9 % dz3.a > 0) {
                                ++n8;
                            }
                            if (((am)object8).s == -1) {
                                n9 = 0;
                                while (n9 < n8) {
                                    int n10 = n9 == n8 - 1 ? (bl2 ? n7 + dz2.a : n7 + n5 - dz3.a) : (bl2 ? n7 + dz2.a + dz3.a + n9 * dz3.a : n7 + n9 * dz3.a);
                                    dz3.a(by2, n10, n6 - dz3.b / 2, 2, 0, (eh)object7);
                                    ++n9;
                                }
                            } else {
                                n9 = 0;
                                while (n9 < n8) {
                                    int n11 = n9 == n8 - 1 ? (bl2 ? n7 + n5 - (dz3.a + dz2.a) : n7 + n5 - dz3.a) : (bl2 ? n7 + n9 * dz3.a + dz4.a : n7 + n9 * dz3.a);
                                    dz3.a(by2, n11, n6 - dz3.b / 2, 0, 0, (eh)object7);
                                    ++n9;
                                }
                            }
                        }
                        if (((am)object8).s == -1) {
                            if (dz4 != null) {
                                dz4.a(by2, n7 + n5 - dz4.a, n6 - dz4.b / 2, 2, 0, (eh)object7);
                            }
                            if (dz2 != null) {
                                dz2.a(by2, n7, n6 - dz2.b / 2, 2, 0, (eh)object7);
                            }
                        } else {
                            if (dz4 != null) {
                                dz4.a(by2, n7, n6 - dz4.b / 2, 0, 0, (eh)object7);
                            }
                            if (dz2 != null) {
                                dz2.a(by2, n7 + n5 - dz2.a - 1, n6 - dz2.b / 2, 0, 0, (eh)object7);
                            }
                        }
                        main.a.b((eh)object6);
                        if (((am)object).s == -1 && ((am)object).aa[0] != null) {
                            ((am)object).aa[0].a(((am)object).f[((am)object).u], ((am)object).o + ((am)object).q - ((am)object).aa[0].a, ((am)object).p - ((am)object).aa[0].b / 2 - 1, 2, 0, (eh)object6);
                        }
                    }
                    return;
                }
                case 25: {
                    Object object9 = object;
                    object = this;
                    int n12 = 0;
                    while (n12 < ((am)object).d.size()) {
                        bn bn3 = (bn)((am)object).d.elementAt(n12);
                        if (bn3.n && !bn3.m) {
                            if (!bn3.o) {
                                boolean bl3 = false;
                                int n13 = 3;
                                dz dz5 = bn3.p;
                                Object object10 = object9;
                                bn bn4 = bn3;
                                if (dz5 != null) {
                                    int n14 = dz5.c / 3;
                                    if (n14 <= 0) {
                                        n14 = 1;
                                    }
                                    int n15 = dz5.c > 3 ? (bn4.i / 3 % 2 == 0 ? 0 : 3) : bn4.i % n14;
                                    int n16 = n14 * bn4.r[bn4.k] + n15;
                                    if (dz5.c < 3) {
                                        n16 = bn4.i / 3 % dz5.c;
                                    }
                                    dz5.a(n16, bn4.b, bn4.c, bn4.s[bn4.k], 3, (eh)object10);
                                }
                            }
                            if (bn3.o) {
                                bn3.q.a(bn3.i / ((am)object).n % bn3.q.c, bn3.b, bn3.c, ((am)object).t, 3, (eh)object9);
                            }
                        }
                        ++n12;
                    }
                    return;
                }
                case 26: {
                    Object object11 = object;
                    object = this;
                    if (((am)object).aa != null) {
                        if (((am)object).f != null) {
                            ((am)object).aa[0].a(((am)object).f[((am)object).v], ((am)object).y, ((am)object).z, 0, 33, (eh)object11);
                        }
                        if (((am)object).E == 1 || ((am)object).E == 2) {
                            int n17 = 33;
                            int n18 = ((am)object).F;
                            if (((am)object).g[((am)object).w] == 0 || ((am)object).g[((am)object).w] == 1) {
                                n17 = 3;
                                n18 = 0;
                            }
                            ((am)object).aa[1].a(((am)object).g[((am)object).w], ((am)object).o, ((am)object).p + n18 + ((am)object).x, 0, n17, (eh)object11);
                        }
                    }
                    return;
                }
                case 9: {
                    Object object12 = object;
                    object = this;
                    int n19 = 0;
                    while (n19 < ((am)object).d.size()) {
                        az az2 = (az)((am)object).d.elementAt(n19);
                        if (az2 != null) {
                            int n20 = 0;
                            if (n19 / 2 < ((am)object).W.length) {
                                n20 = ((am)object).W[n19 / 2];
                            }
                            ((eh)object12).a(n20);
                            ((eh)object12).a(az2.a / 1000, az2.b / 1000, az2.c / 1000, az2.d / 1000);
                            if (az2.h) {
                                ((eh)object12).a(az2.a / 1000 + 1, az2.b / 1000, az2.c / 1000 + 1, az2.d / 1000);
                            }
                        }
                        ++n19;
                    }
                    return;
                }
                case 10: 
                case 11: {
                    Object object13 = object;
                    object = this;
                    int n21 = 0;
                    while (n21 < ((am)object).d.size()) {
                        bn bn5 = (bn)((am)object).d.elementAt(n21);
                        if (((am)object).e != null) {
                            ((am)object).e.a(bn5.k, bn5.b, bn5.c, 0, 3, (eh)object13);
                        }
                        ++n21;
                    }
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {
            object = exception;
            dq.b(exception.toString());
            object = this;
            this.b = true;
        }
    }

    private void c() {
        int n2 = dq.b(3, 5);
        this.l = 90;
        int n3 = 0;
        while (n3 < n2) {
            bn bn2 = new bn();
            new bn().b = this.o + dq.e(4);
            bn2.c = this.p + dq.e(5);
            if (this.j == 0) {
                bn2.j = dq.d(10);
                int n4 = 1;
                if (n3 % 2 == 0) {
                    n4 = -1;
                }
                bn2.b = this.o + dq.d(c[5][0] / 2) * n4;
                bn2.c = this.p - dq.d(c[5][1] / 2);
                bn2.p = new dz(7);
            }
            this.d.addElement(bn2);
            ++n3;
        }
    }

    private void d() {
        this.o = this.J.N + 20 * this.J.U;
        this.m = this.G / 15;
        if (this.L != null) {
            int n2 = 0;
            while (n2 < 15) {
                bn bn2 = new bn();
                new bn().p = this.aa[0];
                bn2.q = this.aa[2];
                bn2.b = this.o;
                bn2.c = this.p;
                if (this.L != null) {
                    bn2.g = this.L.b;
                    bn2.h = this.L.c;
                    if (this.k > 0) {
                        bn2.g += dq.c(0, this.k);
                        bn2.h += dq.c(0, this.k);
                    }
                }
                this.C = dq.b(9, 12);
                if (n2 == 14) {
                    bn2.p = this.aa[1];
                    bn2.q = this.aa[3];
                    bn2.g = this.L.b;
                    bn2.h = this.L.c;
                    this.C = 9;
                }
                bn2.n = false;
                bn2.o = false;
                bn2.m = false;
                int n3 = this.C;
                bn bn3 = bn2;
                bn2.d = n3;
                n3 = bn3.g - bn3.b;
                int n4 = bn3.h - bn3.c;
                int cfr_ignored_0 = bn3.b;
                int cfr_ignored_1 = bn3.g;
                int n5 = dq.a(n3, n4);
                bn3.k = bn3.a(n5);
                int n6 = dq.d(n3, n4) / bn3.d;
                if (n6 == 0) {
                    n6 = 1;
                }
                n5 = n3 / n6;
                int n7 = n4 / n6;
                if (n5 == 0 && n3 < n6) {
                    int n8 = n5 = n3 < 0 ? -1 : 1;
                }
                if (n7 == 0 && n4 < n6) {
                    int n9 = n7 = n4 < 0 ? -1 : 1;
                }
                if (dq.g(n5) > dq.g(n3)) {
                    n5 = n3;
                }
                if (dq.g(n7) > dq.g(n4)) {
                    n7 = n4;
                }
                bn3.e = n5;
                bn3.f = n7;
                this.d.addElement(bn2);
                ++n2;
            }
            return;
        }
        am am2 = this;
        this.b = true;
    }

    private void a(int n2, int n3, int n4, int n5) {
        if (this.u == -1) {
            this.d.removeAllElements();
        }
        this.W = new int[4];
        if (n4 <= n3) {
            n4 = n3 + 1;
        }
        n5 = 0;
        while (n5 < 4) {
            this.W[n5] = dq.d(2) == 0 ? V[this.X][dq.d(3)] : V[this.X][2];
            ++n5;
        }
        n5 = 0;
        while (n5 < 4) {
            az az2 = new az();
            int n6 = 45 + n5 * 45 - 5;
            int n7 = 5 + n5 * 45;
            if (n6 <= n7) {
                n6 = n7 + 1;
            }
            int n8 = dq.b(n3, n4);
            int n9 = dq.b(n2, n2 + 3);
            n7 = dq.b(n7, n6);
            n6 = dq.b(13, 23);
            boolean bl2 = dq.d(4) == 0;
            n7 = dq.c(n7 % 360);
            az2.a(this.y - dq.a(n7) * (n8 + n6), this.z - dq.b(n7) * (n8 + n6), this.y - dq.a(n7) * n6, this.z - dq.b(n7) * n6, dq.a(n7) * n9, dq.b(n7) * n9, bl2);
            this.d.addElement(az2);
            az2 = new az();
            n7 += 180 + dq.c(2, 5);
            n7 = dq.c(n7 % 360);
            az2.a(this.y - dq.a(n7) * (n8 + n6), this.z - dq.b(n7) * (n8 + n6), this.y - dq.a(n7) * n6, this.z - dq.b(n7) * n6, dq.a(n7) * n9, dq.b(n7) * n9, bl2);
            this.d.addElement(az2);
            ++n5;
        }
    }

    private void e() {
        this.e = new dz(8);
        this.l = dq.b(23, 27);
        int n2 = dq.b(1, 3);
        this.D = this.p - 40;
        int n3 = 0;
        while (n3 < n2) {
            bn bn2 = new bn();
            new bn().b = this.o + dq.c(0, 20);
            bn2.c = this.p + dq.e(7);
            bn2.k = this.i == 10 ? dq.b(0, this.e.c - 2) : (this.i == 11 ? dq.b(2, this.e.c) : dq.b(0, this.e.c));
            dq.d(2);
            bn2.f = -dq.b(1, 4);
            this.d.addElement(bn2);
            ++n3;
        }
    }

    private void a(boolean bl2) {
        if (this.K == null) {
            return;
        }
        int n2 = 0;
        while (n2 < this.K.length) {
            if (this.K[n2] != null) {
                cy cy2;
                if (this.K[n2].a == 0) {
                    cy2 = cw.c(this.K[n2].l);
                    if (cy2 != null) {
                        cy2.R = bl2;
                        cy2.ad = false;
                        cy2.S = this.T[n2];
                        cy2.T = this.U[n2];
                    }
                } else {
                    cy2 = co.m().V == this.K[n2].l ? co.m() : cw.b(this.K[n2].l);
                    if (cy2 != null) {
                        ((co)cy2).dF = bl2;
                        ((co)cy2).cm = false;
                        ((co)cy2).dG = this.T[n2];
                        ((co)cy2).dH = this.U[n2];
                    }
                }
            }
            ++n2;
        }
    }

    private void f() {
        int n2;
        int n3 = 0;
        int[] nArray = null;
        int[] nArray2 = null;
        switch (this.i) {
            case 18: {
                n3 = 24;
                nArray = new int[1];
                nArray2 = new int[]{9};
                break;
            }
            case 21: {
                n3 = 24;
                nArray = new int[]{1};
                nArray2 = new int[]{10};
                break;
            }
            case 24: {
                n3 = 24;
                nArray = new int[]{2, 3, 4};
                nArray2 = new int[]{11, 12, 13};
                break;
            }
            case 19: {
                n3 = 25;
                nArray = new int[1];
                nArray2 = new int[]{14};
                break;
            }
            case 22: {
                n3 = 25;
                nArray = new int[]{1};
                nArray2 = new int[]{15};
                break;
            }
            case 17: {
                n3 = 25;
                nArray = new int[]{2};
                nArray2 = new int[]{16};
                break;
            }
            case 25: {
                n3 = 25;
                nArray = new int[]{3, 4, 5, 6};
                nArray2 = new int[]{17, 18, 19, 20};
                break;
            }
            case 20: {
                n3 = 26;
                nArray = new int[1];
                nArray2 = new int[]{21};
                break;
            }
            case 23: {
                n3 = 26;
                nArray = new int[]{1};
                nArray2 = new int[]{22};
                break;
            }
            case 16: {
                n3 = 26;
                if (this.j == 0) {
                    nArray = new int[]{7};
                    nArray2 = new int[]{28};
                }
                if (this.j != 1) break;
                nArray = new int[]{2};
                nArray2 = new int[]{23};
                break;
            }
            case 26: {
                n3 = 26;
                n2 = 0;
                int n4 = 0;
                if (this.j == 0) {
                    n2 = 4;
                    n4 = 25;
                } else if (this.j == 1) {
                    n2 = 5;
                    n4 = 26;
                } else if (this.j == 2) {
                    n2 = 6;
                    n4 = 27;
                }
                nArray = new int[]{n2, 3};
                nArray2 = new int[]{n4, 24};
            }
        }
        if (nArray != null && nArray2 != null) {
            this.aa = new dz[nArray.length];
            n2 = 0;
            while (n2 < nArray.length) {
                Object object = "Skills_" + n3 + "_" + this.h + "_" + nArray[n2];
                if ((object = ej.d((String)object)) == null) {
                    object = new dz(nArray2[n2]);
                }
                if (object != null) {
                    this.aa[n2] = object;
                }
                ++n2;
            }
        }
    }

    private void a(eh eh2, int n2) {
        this.aa[0].a(this.u / this.n % this.aa[0].c, this.o, this.p, this.s, n2, eh2);
    }
}

