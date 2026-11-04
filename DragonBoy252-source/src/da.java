/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class da {
    public static boolean a;
    private static String c;
    private static String d;
    private static int e;
    public static boolean b;

    public static void a(String string, String string2, int n2) {
        if (string == null) {
            return;
        }
        a = true;
        c = string;
        d = string2;
        e = n2;
    }

    public static void a() {
        da.a(ch.aD, null, 1000);
        b = true;
    }

    public static void a(eh eh2) {
        if (!a) {
            return;
        }
        if (b && e > 4990) {
            return;
        }
        bj.a(main.a.C - 75, 10, 150, 55, eh2);
        if (b) {
            main.a.a(main.a.C - ev.t.a(c) / 2 - 10, 38, eh2);
            ev.t.a(eh2, c, main.a.C + 5, 31, 2);
            return;
        }
        if (d != null) {
            ev.t.a(eh2, c, main.a.C, 23, 2);
            ev.m.a(eh2, d, main.a.C, 40, 2);
            return;
        }
        ev.t.a(eh2, c, main.a.C, 31, 2);
    }

    public static void b() {
        if (!a) {
            return;
        }
        if (e > 0 && --e <= 0) {
            da.c();
        }
    }

    public static void c() {
        c = "";
        d = null;
        b = false;
        e = 0;
        a = false;
    }
}

