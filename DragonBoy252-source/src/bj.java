/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class bj {
    private static int b = 15787715;
    private static Image[] c = new Image[6];
    public static int a;
    private static int d;

    static {
        int n2 = 0;
        while (n2 < c.length) {
            bj.c[n2] = ej.b("/mainImage/myTexture2dgoc" + (n2 + 1) + ".png");
            ++n2;
        }
        a = 24;
        d = 0;
        ej.b("/mainImage/myTexture2dcheck.png");
    }

    public bj() {
        int[] nArray = new int[]{15970400, -844109861, 0x225544, 16374659, 15906669, 12931125, 3108954};
    }

    public static void a(eh eh2, ae ae2, ae ae3, ae ae4) {
        ev ev2 = ev.f;
        if (ae2 != null && (d = ev2.a(ae2.b)) > 0) {
            if (ae2.j >= 0 && ae2.k > 0) {
                ae2.a(eh2);
            } else {
                eh2.a(ew.cF == 0 ? cw.aG : cw.aF, 1, main.a.B - ew.cE - 1, 0);
                ev2.a(eh2, ae2.b, 35, main.a.B - ew.cE + 3 + 3, 2);
            }
        }
        if (ae3 != null && (d = ev2.a(ae3.b)) > 0) {
            if (ae3.j > 0 && ae3.k > 0) {
                ae3.a(eh2);
            } else {
                eh2.a(ew.cF == 1 ? cw.aG : cw.aF, main.a.C - 35, main.a.B - ew.cE - 1, 0);
                ev2.a(eh2, ae3.b, main.a.C, main.a.B - ew.cE + 3 + 3, 2);
            }
        }
        if (ae4 != null && (d = ev2.a(ae4.b)) > 0) {
            if (ae4.j > 0 && ae4.k > 0) {
                ae4.a(eh2);
                return;
            }
            eh2.a(ew.cF == 2 ? cw.aG : cw.aF, main.a.A - 71, main.a.B - ew.cE - 1, 0);
            ev2.a(eh2, ae4.b, main.a.A - 35, main.a.B - ew.cE + 3 + 3, 2);
        }
    }

    public static void a() {
    }

    public final void a(eh eh2, int n2, int n3, int n4, int n5, String[] stringArray) {
        bj.b(n2, n3, n4, 69, eh2);
        n3 = n3 + 20 - ev.t.a();
        n5 = 0;
        while (n5 < stringArray.length) {
            ev.t.a(eh2, stringArray[n5], n2 + n4 / 2, n3, 2);
            ++n5;
            n3 += ev.t.a();
        }
    }

    public static void a(int n2, int n3, int n4, int n5, eh eh2) {
        eh2.a(9340251);
        eh2.c(n2 + 18, n3, (n4 - 36) / 2 - 32, n5);
        eh2.c(n2 + 18 + (n4 - 36) / 2 + 32, n3, (n4 - 36) / 2 - 22, n5);
        eh2.c(n2, n3 + 8, n4, n5 - 17);
        eh2.a(b);
        eh2.d(n2 + 18, n3 + 3, (n4 - 36) / 2 - 32, n5 - 4);
        eh2.d(n2 + 18 + (n4 - 36) / 2 + 31, n3 + 3, (n4 - 38) / 2 - 22, n5 - 4);
        eh2.d(n2 + 1, n3 + 6, n4 - 1, n5 - 11);
        eh2.a(14667919);
        eh2.d(n2 + 18, n3 + 1, (n4 - 36) / 2 - 32, 2);
        eh2.d(n2 + 18 + (n4 - 36) / 2 + 32, n3 + 1, (n4 - 36) / 2 - 12, 2);
        eh2.d(n2 + 18, n3 + n5 - 2, (n4 - 36) / 2 - 31, 2);
        eh2.d(n2 + 18 + (n4 - 36) / 2 + 32, n3 + n5 - 2, (n4 - 36) / 2 - 31, 2);
        eh2.d(n2 + 1, n3 + 11, 2, n5 - 18);
        eh2.d(n2 + n4 - 2, n3 + 11, 2, n5 - 18);
        eh2.a(c[0], n2 - 3, n3 - 2, 20);
        eh2.a(c[2], n2 + n4 + 3, n3 - 2, dv.b);
        eh2.a(c[1], n2 - 3, n3 + n5 + 3, dv.d);
        eh2.a(c[3], n2 + n4 + 4, n3 + n5 + 2, dv.e);
        eh2.a(c[4], n2 + n4 / 2, n3, dv.a);
        eh2.a(c[5], n2 + n4 / 2, n3 + n5 + 1, dv.c);
    }

    public static void b(int n2, int n3, int n4, int n5, eh eh2) {
        eh2.a(13524492);
        eh2.c(n2 + 6, n3, n4 - 12, n5);
        eh2.c(n2, n3 + 6, n4, n5 - 12);
        eh2.c(n2 + 7, n3 + 1, n4 - 14, n5 - 2);
        eh2.c(n2 + 1, n3 + 7, n4 - 2, n5 - 14);
        eh2.a(14338484);
        eh2.d(n2 + 8, n3 + 2, n4 - 16, n5 - 3);
        eh2.d(n2 + 2, n3 + 8, n4 - 3, n5 - 14);
        eh2.a(main.a.ab[2], n2, n3, 20);
        eh2.a(main.a.ab[2], 0, 0, 16, 16, 2, n2 + n4 + 1, n3, dv.b);
        eh2.a(main.a.ab[2], 0, 0, 16, 16, 1, n2, n3 + n5 + 1, dv.d);
        eh2.a(main.a.ab[2], 0, 0, 16, 16, 3, n2 + n4 + 1, n3 + n5 + 1, dv.e);
    }

    public static void c(int n2, int n3, int n4, int n5, eh eh2) {
        eh2.a(0x664400);
        eh2.d(n2, n3, n4, n5);
        eh2.a(14338484);
        eh2.d(n2 + 1, n3 + 1, n4 - 2, n5 - 2);
    }
}

