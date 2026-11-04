/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.Vector;
import main.a;

public final class m {
    private static Random a = new Random();
    private static Vector b = new Vector();
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static float j;
    private static int[] k;
    private static int[] l;
    private static boolean m;
    private static long n;
    private static long o;

    static {
        k = new int[3];
        l = new int[3];
        m = false;
        n = 0L;
        o = 150L;
    }

    public static void a(eh eh2) {
        if (m) {
            m.l[2] = l[1];
            m.k[2] = k[1];
            m.l[1] = l[0];
            m.k[1] = k[0];
            m.l[0] = d;
            m.k[0] = c;
            c = (int)(Math.cos((double)e * Math.PI / 180.0) * (double)i * (double)h) + f;
            d = (int)((double)i * Math.sin((double)e * Math.PI / 180.0) * (double)h - (double)(0.0f * (float)h * (float)h / 2.0f));
            if (System.currentTimeMillis() - n >= o) {
                ++h;
                n = System.currentTimeMillis();
            }
        }
        if (h > 32 && m) {
            m = false;
            b.removeAllElements();
            b.addElement(new n(dq.b(50, main.a.A - 50), dq.b(main.a.B - 100, main.a.B), 5, 72));
        }
        eh2.a(0);
        eh2.d(0, 0, 0, 0);
        eh2.a(0xFF0000);
        int n2 = 0;
        while (n2 < b.size()) {
            eh eh3 = eh2;
            n n3 = (n)b.elementAt(n2);
            int n4 = 0;
            while (n4 < n3.a.size()) {
                o o2 = (o)n3.a.elementAt(n4);
                if (o2.f < -200) {
                    n3.a.removeElementAt(n4);
                }
                eh eh4 = eh3;
                o.a(eh4, o2.a - o2.e, o2.b - o2.f, o2.j);
                int n5 = 0;
                while (n5 < 2) {
                    o.a(eh4, o2.a - o2.o[n5], o2.b - o2.p[n5], o2.j);
                    ++n5;
                }
                if (o2.n && System.currentTimeMillis() - o2.l >= o2.m) {
                    ++o2.i;
                    o2.l = System.currentTimeMillis();
                    o2.o[1] = o2.o[0];
                    o2.p[1] = o2.p[0];
                    o2.o[0] = o2.e;
                    o2.p[0] = o2.f;
                    o2.e = (int)(Math.cos((double)o2.h * Math.PI / 180.0) * (double)o2.c * (double)o2.i) + o2.d;
                    o2.f = (int)((double)o2.c * Math.sin((double)o2.h * Math.PI / 180.0) * (double)o2.i - (double)(o2.k * (float)o2.i * (float)o2.i / 2.0f)) + o2.g;
                }
                ++n4;
            }
            ++n2;
        }
        if (!m) {
            int n6 = -(Math.abs(a.nextInt() % 3) + 5);
            if (n6 == -5 && !m) {
                f = 0;
                e = 80;
                m = true;
                m.a();
                return;
            }
            if (n6 == -7 && !m) {
                e = 60;
                f = 0;
                m = true;
                m.a();
                return;
            }
            if (n6 == -6 && !m) {
                e = 120;
                f = 0;
                m = true;
                m.a();
            }
        }
    }

    private static void a() {
        g = 0;
        i = 16;
        h = 0;
        j = 0.0f;
        int n2 = 0;
        while (n2 < 3) {
            m.l[n2] = 0;
            m.k[n2] = f;
            ++n2;
        }
        m = true;
    }
}

