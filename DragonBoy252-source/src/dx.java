/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class dx {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    private static int J;
    public static int[] f;
    public static int[] g;
    private static Image[] K;
    private static Image L;
    private static Image M;
    public static Image h;
    private static Image N;
    private static Image O;
    public static byte i;
    private static int P;
    private static int Q;
    private static int R;
    private static int S;
    public static boolean j;
    public static String k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static byte s;
    public static byte t;
    public static eq u;
    public static eq v;
    public static eq w;
    public static String[] x;
    public static Image y;
    private static int[] T;
    public static int[][] z;
    public static int[][][] A;
    public static Image B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static int H;
    public static int I;

    static {
        J = -1;
        i = (byte)24;
        j = false;
        k = "";
        m = -1;
        q = -1;
        t = (byte)-1;
        u = new eq("vGO");
        v = new eq("vItemBg");
        w = new eq("vCurrItem");
        y = ej.b("/mainImage/myTexture2dbong.png");
        new eq("vObject");
        T = new int[]{21, 22, 23, 39, 40, 41};
        int[] nArray = new int[]{21, 22, 23, 24, 25, 26};
        int[] nArray2 = new int[3];
        nArray2[1] = 7;
        nArray2[2] = 14;
        B = ej.b("/bg/light.png");
        int[] nArray3 = new int[]{5257738, 8807192};
        I = 0;
    }

    public static boolean a() {
        return l == 51 || l == 103 || l == 112 || l == 113 || l == 129 || l == 130;
    }

    public static boolean b() {
        return l == 39 || l == 40 || l == 41;
    }

    public static boolean c() {
        return cw.cl != null && l == cw.cl.l;
    }

    public static ek a(int n2) {
        int n3 = 0;
        while (n3 < v.size()) {
            ek ek2 = (ek)v.elementAt(n3);
            if (ek2.a == n2) {
                return ek2;
            }
            ++n3;
        }
        return null;
    }

    public static boolean d() {
        int n2 = 0;
        while (n2 < T.length) {
            if (l == T[n2]) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static boolean b(int n2) {
        if (n2 == 156 || n2 == 330 || n2 == 345 || n2 == 334) {
            return false;
        }
        if (l == 54 || l == 55 || l == 56 || l == 57 || l == 58 || l == 59 || l == 103) {
            return false;
        }
        int n3 = 0;
        int n4 = 0;
        while (n4 < w.size()) {
            ek ek2 = (ek)w.elementAt(n4);
            if (ek2.a == n2) {
                ++n3;
            }
            ++n4;
        }
        return n3 > 2;
    }

    public static final void e() {
        if (L == null) {
            L = ej.a("/tWater/wtf.png");
        }
        if (M == null) {
            M = ej.a("/tWater/twtf.png");
        }
        if (h == null) {
            h = ej.a("/tWater/wts.png");
        }
        if (N == null) {
            N = ej.a("/tWater/wtsN.png");
        }
        if (O == null) {
            O = ej.a("/tWater/wtsN2.png");
        }
        System.gc();
    }

    public static void c(int n2) {
        d = b * i;
        c = a * i;
        --n2;
        try {
            int n3 = 0;
            while (n3 < a * b) {
                int n4 = 0;
                while (n4 < z[n2].length) {
                    int n5 = z[n2][n4];
                    int[] nArray = A[n2][n4];
                    int n6 = n3;
                    int n7 = 0;
                    while (n7 < nArray.length) {
                        if (f[n6] == nArray[n7]) {
                            int n8 = n6;
                            g[n8] = g[n8] | n5;
                            break;
                        }
                        ++n7;
                    }
                    ++n4;
                }
                ++n3;
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("Error Load Map");
            exception.printStackTrace();
            GameMidlet.g.a();
            return;
        }
    }

    public static boolean f() {
        return l == 45 || l == 46 || l == 48;
    }

    public static boolean g() {
        return j || l == 45 || l == 46 || l == 48 || l == 51 || l == 52 || l == 103 || l == 112 || l == 113 || l == 115 || l == 117 || l == 118 || l == 119 || l == 120 || l == 121 || l == 125 || l == 129 || l == 130;
    }

    private static void a(eh eh2, int n2, int n3, int n4) {
        try {
            block6: {
                block5: {
                    block4: {
                        if (K == null) {
                            return;
                        }
                        if (K.length != 1) break block4;
                        if (K[0] == null) break block5;
                        break block6;
                    }
                    if (n2 >= 0 && n2 < K.length && K[n2] != null) {
                        eh2.a(K[n2], n3 * i, n4 * i, 0);
                    }
                }
                return;
            }
            eh2.a(K[0], 0, n2 * i, i, i, 0, n3 * i, n4 * i, 0);
        }
        catch (Exception exception) {}
    }

    private static void a(eh eh2, int n2, int n3, int n4, int n5) {
        try {
            if (K == null) {
                return;
            }
            if (K.length == 1) {
                if (K[0] != null) {
                    eh2.a(K[0], 0, n2 * 24, 24, 24, 0, n3, n4, 0);
                    return;
                }
            } else if (n2 >= 0 && n2 < K.length && K[n2] != null) {
                eh2.a(K[n2], n3, n4, 0);
                return;
            }
        }
        catch (Exception exception) {}
    }

    public static final void a(eh eh2) {
        try {
            int n2;
            int n3;
            if (co.cd) {
                return;
            }
            cw.l();
            cw.a(eh2, 1);
            int n4 = cw.o;
            while (n4 < cw.q) {
                n3 = cw.p;
                while (n3 < cw.r) {
                    if (n4 != 0 && n4 != a - 1) {
                        n2 = f[n3 * a + n4] - 1;
                        if ((dx.a(n4, n3) & 0x100) != 256) {
                            if ((dx.a(n4, n3) & 0x20) == 32) {
                                eh2.a(L, 0, 24 * (main.a.w % 8 >> 1), 24, 24, 0, n4 * i, n3 * i, 0);
                            } else if ((dx.a(n4, n3) & 0x80) == 128) {
                                eh2.a(M, 0, 24 * (main.a.w % 8 >> 1), 24, 24, 0, n4 * i, n3 * i, 0);
                            } else if (e != 13 || n2 == -1) {
                                if (e == 2 && (dx.a(n4, n3) & 0x200) == 512 && n2 != -1) {
                                    dx.a(eh2, n2, n4 * i, n3 * i, 24);
                                    dx.a(eh2, n2, n4 * i, n3 * i + 1, 24);
                                }
                                if ((dx.a(n4, n3) & 0x10) == 16) {
                                    P = n4 * i - cw.j;
                                    Q = P - cw.f;
                                    S = (i - 2) * Q / i;
                                    R = S + cw.f;
                                    dx.a(eh2, n2, R + cw.j, n3 * i, 24);
                                } else if ((dx.a(n4, n3) & 0x200) == 512) {
                                    if (n2 != -1) {
                                        dx.a(eh2, n2, n4 * i, n3 * i, 24);
                                        dx.a(eh2, n2, n4 * i, n3 * i + 1, 24);
                                    }
                                } else if (n2 != -1) {
                                    dx.a(eh2, n2, n4, n3);
                                }
                            }
                        }
                    }
                    ++n3;
                }
                ++n4;
            }
            if (cw.j < 24) {
                n4 = cw.p;
                while (n4 < cw.r) {
                    n3 = f[n4 * a + 1] - 1;
                    if (n3 != -1) {
                        dx.a(eh2, n3, 0, n4);
                    }
                    ++n4;
                }
            }
            if (cw.j > cw.n) {
                n4 = a - 2;
                n3 = cw.p;
                while (n3 < cw.r) {
                    n2 = f[n3 * a + n4] - 1;
                    if (n2 != -1) {
                        dx.a(eh2, n2, n4 + 1, n3);
                    }
                    ++n3;
                }
                return;
            }
        }
        catch (Exception exception) {}
    }

    private static boolean i() {
        return l != 54 && l != 55 && l != 56 && l != 57 && l != 138 && l != 167;
    }

    public static final void b(eh eh2) {
        if (main.a.a) {
            return;
        }
        try {
            int n2 = cw.o;
            while (n2 < cw.q) {
                int n3 = cw.p;
                while (n3 < cw.r) {
                    if ((dx.a(n2, n3) & 0x40) == 64) {
                        Image image = e == 5 ? N : (e == 8 ? O : h);
                        if (!dx.i()) {
                            eh2.a(image, 0, 0, 24, 24, 0, n2 * i, n3 * i - 1, 0);
                            eh2.a(image, 0, 0, 24, 24, 0, n2 * i, n3 * i - 3, 0);
                        }
                        eh2.a(image, 0, (main.a.w % 8 >> 2) * 24, 24, 24, 0, n2 * i, n3 * i - 12, 0);
                        if (I == 0 && dx.i()) {
                            I = n3 * i - 12;
                            int n4 = 0xFFFFFF;
                            if (main.a.af == 2) {
                                n4 = 10871287;
                            } else if (main.a.af == 4) {
                                n4 = 8111470;
                            } else if (main.a.af == 7) {
                                n4 = 5693125;
                            } else if (main.a.af == 19) {
                                n4 = 0xFF0000;
                            }
                            f.a(n4, I + 15);
                        }
                    }
                    ++n3;
                }
                ++n2;
            }
            f.b(eh2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void d(int n2) {
        InputStream inputStream = v.a("/mymap/" + n2);
        if (inputStream == null) {
            throw new Exception("Map " + n2 + " not found in assets, requesting from server");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        a = (char)dataInputStream.read();
        b = (char)dataInputStream.read();
        f = new int[dataInputStream.available()];
        int n3 = 0;
        while (n3 < a * b) {
            dx.f[n3] = (char)dataInputStream.read();
            ++n3;
        }
        g = new int[f.length];
    }

    public static final int a(int n2, int n3) {
        try {
            return g[n3 * a + n2];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final int b(int n2, int n3) {
        try {
            return g[n3 / i * a + n2 / i];
        }
        catch (Exception exception) {
            return 1000;
        }
    }

    public static final boolean a(int n2, int n3, int n4) {
        try {
            return (g[n3 / i * a + n2 / i] & n4) == n4;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static final void b(int n2, int n3, int n4) {
        int n5 = n3 / i * a + n2 / i;
        g[n5] = g[n5] | 0x200;
    }

    public static final void c(int n2, int n3, int n4) {
        int n5 = n3 / i * a + n2 / i;
        g[n5] = g[n5] & 0xFFFFFDFF;
    }

    public static final int e(int n2) {
        return n2 / i * i;
    }

    public static final int f(int n2) {
        return n2 / i * i;
    }

    public static void h() {
        System.gc();
        if (J != e) {
            if (ej.c == 5 || ej.c == 3 || ej.c == 8) {
                if (eh.b == 1) {
                    Image[] imageArray = new Image[1];
                    K = imageArray;
                    imageArray[0] = ej.c("/t/" + e + ".png");
                } else {
                    K = new Image[100];
                    int n2 = 0;
                    while (n2 < K.length) {
                        dx.K[n2] = ej.c("/t/" + e + "/" + (n2 + 1) + ".png");
                        ++n2;
                    }
                }
            } else {
                Image image = ej.a("/t/" + e + "$1.png");
                if (image != null) {
                    ea.a("x" + eh.b + "t" + e);
                    K = new Image[100];
                    int n3 = 0;
                    while (n3 < K.length) {
                        dx.K[n3] = ej.a("/t/" + e + "$" + (n3 + 1) + ".png");
                        ++n3;
                    }
                } else {
                    image = ej.a("/t/" + e + ".png");
                    if (image != null) {
                        Image[] imageArray = new Image[1];
                        K = imageArray;
                        imageArray[0] = image;
                    }
                }
            }
            J = e;
        }
    }
}

