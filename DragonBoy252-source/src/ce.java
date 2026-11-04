/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class ce {
    private static int a;
    private static int b;
    private static int c;
    private static boolean d;
    private static String e;

    static {
        e = "";
    }

    public static void a() {
        a = 0;
        b = 0;
        d = false;
    }

    public static void a(eh eh2, String string, int n2, int n3, int n4, int n5, ev ev2) {
        if (c != ev2.a(string) || !e.equals(string)) {
            e = string;
            a = 0;
            c = ev2.a(string);
            d = false;
            b = 0;
        }
        eh2.e(n2, n3, n4, n5);
        if (c > n4) {
            ev2.a(eh2, string, n2 - a, n3, 0);
        } else {
            ev2.a(eh2, string, n2 + n4 / 2, n3, 2);
        }
        main.a.a(eh2);
        if (c > n4) {
            if (!d) {
                if (++b > 50 && ++a >= c) {
                    b = 0;
                    a = -n4 + 30;
                    d = true;
                    return;
                }
            } else {
                if (a < 0) {
                    int n6 = n4 + a >> 1;
                    a += n6;
                }
                if (a > 0) {
                    a = 0;
                }
                if (a == 0 && ++b == 50) {
                    b = 0;
                    d = false;
                }
            }
        }
    }
}

