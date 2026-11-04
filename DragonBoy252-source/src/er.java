/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;
import main.a;

public final class er {
    public static int[][] a;
    public static Image[] b;
    public static bz[] c;
    public static eq d;
    public static Image e;
    public static byte[] f;
    public static eq g;
    private static int i;
    public static short h;

    static {
        d = new eq("vKeys");
        e = null;
        g = new eq("");
    }

    public static void a() {
        if (b == null) {
            b = new Image[]{ej.a("/img/Big0.png"), ej.a("/img/Big1.png"), ej.a("/img/Big2.png"), ej.a("/img/Big3.png")};
            System.gc();
        }
    }

    public static void b() {
        System.gc();
        e = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
    }

    public er() {
        er.f();
    }

    public static void c() {
        new er();
    }

    private static void f() {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(ea.b("NR_image")));
            int n2 = dataInputStream.readShort();
            a = new int[n2][5];
            int n3 = 0;
            while (n3 < n2) {
                er.a[n3][0] = dataInputStream.readUnsignedByte();
                er.a[n3][1] = dataInputStream.readShort();
                er.a[n3][2] = dataInputStream.readShort();
                er.a[n3][3] = dataInputStream.readShort();
                er.a[n3][4] = dataInputStream.readShort();
                if (!(n3 >= 84 && n3 <= 90 || n3 >= 372 && n3 <= 384 || n3 >= 371 && n3 <= 377 || a[n3][1] < 256 && a[n3][3] < 256 && a[n3][2] < 256 && a[n3][4] < 256)) {
                    er.a[n3] = null;
                }
                ++n3;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void d() {
    }

    private static boolean b(int n2) {
        Image[] imageArray = b;
        return b != null && n2 >= 0 && n2 < imageArray.length && imageArray[n2] != null;
    }

    /*
     * Unable to fully structure code
     */
    private static bz c(int var0) {
        var1_1 = er.c;
        if (er.c == null || var0 < 0 || var0 >= var1_1.length) {
            return null;
        }
        var2_2 = var1_1[var0];
        if (var2_2 == null) {
            return null;
        }
        var3_3 = var2_2.a;
        if (var3_3 == null) ** GOTO lbl-1000
        if (var3_3 == er.e) {
            v0 = true;
        } else if (eh.a(var3_3) > 0 && eh.b(var3_3) > 0) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        if (!v0) {
            if (er.c == var1_1 && var1_1[var0] == var2_2) {
                var1_1[var0] = null;
            }
            return null;
        }
        return var2_2;
    }

    public static void a(int n2) {
        bz[] bzArray = c;
        if (c == null || n2 < 0 || n2 >= bzArray.length) {
            return;
        }
        if (er.c(n2) != null) {
            return;
        }
        if (eh.b == 1) {
            Object object = ej.b("/SmallImage/Small" + n2 + ".png");
            if (object != null) {
                bzArray[n2] = new bz((Image)object, n2);
                return;
            }
            bzArray[n2] = new bz(e, n2);
            if (main.a.E == main.a.aq) {
                object = cj.a();
                if (object != null) {
                    ((cj)object).p(n2);
                    return;
                }
            } else if (g != null) {
                g.addElement(bzArray[n2]);
                return;
            }
        } else {
            Image image = ej.b("/SmallImage/Small" + n2 + ".png");
            if (image != null) {
                bzArray[n2] = new bz(image, n2);
                return;
            }
            boolean bl2 = false;
            Object object = ea.b(String.valueOf(eh.b) + "Small" + n2);
            if (object != null) {
                if (f != null && (n2 >= f.length || ((byte[])object).length % 127 != f[n2])) {
                    bl2 = true;
                }
                if (!bl2) {
                    Image image2 = Image.createImage((byte[])object, (int)0, (int)((byte[])object).length);
                    object = image2;
                    if (image2 != null) {
                        bzArray[n2] = new bz((Image)object, n2);
                    } else {
                        bl2 = true;
                    }
                }
            } else {
                bl2 = true;
            }
            if (bl2) {
                bzArray[n2] = new bz(e, n2);
                if (main.a.E == main.a.aq) {
                    cj cj2 = cj.a();
                    object = cj2;
                    if (cj2 != null) {
                        object.p(n2);
                        return;
                    }
                } else if (g != null) {
                    g.addElement(bzArray[n2]);
                }
            }
        }
    }

    public static void a(int n2, Image image) {
        if (image == null || c == null || n2 < 0 || n2 >= c.length) {
            return;
        }
        bz bz2 = c[n2];
        if (bz2 != null && bz2.a == image) {
            v0.c = bz2.d;
        }
    }

    public static void b(int n2, Image image) {
        if (image == null) {
            return;
        }
        bz[] bzArray = c;
        if (c == null || n2 < 0 || n2 >= bzArray.length) {
            return;
        }
        bz bz2 = bzArray[n2];
        if (bz2 == null) {
            bz2 = new bz(image, n2);
            if (c == bzArray && bzArray[n2] == null) {
                bzArray[n2] = bz2;
            }
            return;
        }
        if (c == bzArray && bzArray[n2] == bz2) {
            bz2.a = image;
        }
    }

    public static void a(eh eh2, int n2, int n3, int n4, int n5, int n6) {
        if (eh2 == null || n2 < 0) {
            return;
        }
        er.b(eh2, n2, n3, n4, 0, n6);
    }

    public static void b(eh eh2, int n2, int n3, int n4, int n5, int n6) {
        if (eh2 == null || n2 < 0) {
            return;
        }
        try {
            if (b == null) {
                bz bz2 = er.c(n2);
                if (bz2 == null) {
                    er.a(n2);
                    return;
                }
                bz2.a(eh2, n5, n3, n4, n6);
                return;
            }
            if (a != null) {
                if (n2 < 0 || n2 >= a.length || a[n2] == null || a[n2].length < 5 || a[n2][1] >= 256 || a[n2][3] >= 256 || a[n2][2] >= 256 || a[n2][4] >= 256) {
                    bz bz3 = er.c(n2);
                    if (bz3 == null) {
                        er.a(n2);
                        return;
                    }
                    bz3.a(eh2, n5, n3, n4, n6);
                    return;
                }
                if (a[n2][0] != 4 && er.b(a[n2][0])) {
                    eh2.a(b[a[n2][0]], a[n2][1], a[n2][2], a[n2][3], a[n2][4], n5, n3, n4, n6);
                    return;
                }
                bz bz4 = er.c(n2);
                if (bz4 == null) {
                    er.a(n2);
                    return;
                }
                bz4.a(eh2, n5, n3, n4, n6);
                return;
            }
            if (main.a.E != cw.l()) {
                bz bz5 = er.c(n2);
                if (bz5 == null) {
                    er.a(n2);
                    return;
                }
                bz5.a(eh2, n5, n3, n4, n6);
                return;
            }
        }
        catch (Exception exception) {}
    }

    public static void a(eh eh2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (eh2 == null || n2 < 0) {
            return;
        }
        try {
            if (b == null) {
                bz bz2 = er.c(n2);
                if (bz2 == null) {
                    er.a(n2);
                    return;
                }
                bz2.a(eh2, n8, n3, n4, n5, n6, n7, n9);
                return;
            }
            if (a != null) {
                if (n2 < 0 || n2 >= a.length || a[n2] == null || a[n2].length < 5 || a[n2][1] >= 256 || a[n2][3] >= 256 || a[n2][2] >= 256 || a[n2][4] >= 256) {
                    bz bz3 = er.c(n2);
                    if (bz3 == null) {
                        er.a(n2);
                        return;
                    }
                    bz3.a(eh2, n8, n3, n4, n5, n6, n7, n9);
                    return;
                }
                if (a[n2][0] != 4 && er.b(a[n2][0])) {
                    eh2.a(b[a[n2][0]], 0, n3 * n6, n6, n7, n8, n4, n5, n9);
                    return;
                }
                bz bz4 = er.c(n2);
                if (bz4 == null) {
                    er.a(n2);
                    return;
                }
                bz4.a(eh2, n8, n3, n4, n5, n6, n7, n9);
                return;
            }
            if (main.a.E != cw.l()) {
                bz bz5 = er.c(n2);
                if (bz5 == null) {
                    er.a(n2);
                    return;
                }
                bz5.a(eh2, n8, n3, n4, n5, n6, n7, n9);
                return;
            }
        }
        catch (Exception exception) {}
    }

    public static void e() {
        bz[] bzArray = c;
        if (main.a.w % 1000 == 0 && bzArray != null) {
            int n2 = 0;
            while (n2 < bzArray.length) {
                bz bz2 = bzArray[n2];
                if (bz2 != null) {
                    boolean bl2;
                    ++bz2.d;
                    co co2 = co.m();
                    boolean bl3 = bl2 = co2 != null && co2.a(bz2.b);
                    if (bz2.d - bz2.c > 1 && !bl2 && c != null && bz2.b >= 0 && bz2.b < c.length && c[bz2.b] == bz2) {
                        er.c[bz2.b] = null;
                    }
                    ++i;
                }
                ++n2;
            }
        }
    }
}

