/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class bc {
    private static Image c = ej.b("/mainImage/myTexture2dmobCapcha.png");
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    public static boolean a;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    public static boolean b;

    static {
        l = 0;
    }

    public static void a(eh eh2, int n2, int n3) {
        if (!b) {
            if (main.a.w % 3 == 0) {
                if (co.m().U == 1) {
                    h = n2 - 20 - cw.j;
                }
                if (co.m().U == -1) {
                    h = n2 + 20 - cw.j;
                }
            }
            d = co.m().O - 40 - cw.k;
        } else {
            if (++l == 5) {
                b = false;
                l = 0;
            }
            h = n2 - cw.j;
            d = n3 - cw.k;
        }
        o = i > n2 - cw.j ? -1 : 1;
        eh2.a(cw.bE, i, e - 40, 3);
        bo.a(eh2, i - 25, e - 70, 50, 20, 0xFFFFFF, false);
        ev.f.a(eh2, cw.l().bF, i, e - 65, 2);
        if (a) {
            a = false;
            h.a(new i(18, i + cw.j, e + cw.k, 2, 10, -1));
            cw.l().aW = null;
            h = -cw.j;
            d = -cw.k;
        }
        eh2.a(c, 0, n * 40, 40, 40, o == 1 ? 0 : 2, i, e + 3 + (main.a.w % 10 > 5 ? 1 : 0), 3);
        if (e != d) {
            g = d - e << 2;
            e += (f += g) >> 4;
            f &= 0xF;
        }
        if (i != h) {
            k = h - i << 2;
            i += (j += k) >> 4;
            j &= 0xF;
        }
        if (++m == 5) {
            m = 0;
            if (++n > 2) {
                n = 0;
            }
        }
    }
}

