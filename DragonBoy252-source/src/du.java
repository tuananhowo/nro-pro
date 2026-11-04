/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class du
extends ew {
    private static int c;
    private boolean d = false;
    private static int e;
    private static int f;
    public static du a;
    private static boolean g;
    public static Image b;

    static {
        e = -1;
        f = -1;
        g = false;
        b = ej.b("/gamelogo.png");
    }

    public du() {
        a = this;
    }

    public static void c() {
        c = 0;
        g = false;
    }

    public final void b() {
        if (++c == 30 && !this.d) {
            this.d = true;
            if (ea.d("serverchat") != -1) {
                boolean bl2 = cw.ci = ea.d("serverchat") == 0;
            }
            if (ea.d("isPlaySound") != -1) {
                boolean bl3 = main.a.an = ea.d("isPlaySound") == 1;
            }
            if (main.a.an) {
                es.a();
                es.f();
            }
            es.a();
            es.Q();
            ds.f();
        }
        if (c >= 150 && !g) {
            g = true;
            if (eb.a().d()) {
                ds.B = true;
            } else {
                ej.b(true);
                if (main.a.ao == null) {
                    main.a.ao = new ds();
                }
            }
            main.a.ao.a();
        }
        ds.e();
    }

    public static void e() {
        dq.b(">>>>>loadIP:  svselect == " + ea.d(ds.D));
        ds.a(ea.d(ds.D), false);
        if (ds.p == -1) {
            dq.b(">>>loadIP:  svselect == -1");
            ds.a(ds.b, true);
        }
        ds.l();
    }

    public final void a(eh eh2) {
        if (b != null && c < 30) {
            eh2.a(0xFFFFFF);
            eh2.d(0, 0, main.a.A, main.a.B);
            eh2.a(b, main.a.A / 2, main.a.B / 2, 3);
        }
        if (e != -1) {
            eh2.a(0);
            eh2.d(0, 0, main.a.A, main.a.B);
            eh2.a(en.j, main.a.A / 2, main.a.B / 2 - 24, dv.c);
            main.a.a(main.a.C, main.a.B / 2 + 24, eh2);
            ev.c.a(eh2, String.valueOf(ch.aF) + e * 100 / f + "%", main.a.A / 2, main.a.B / 2, 2);
            return;
        }
        if (c >= 30) {
            eh2.a(0);
            eh2.d(0, 0, main.a.A, main.a.B);
            main.a.a(main.a.C, main.a.D, eh2);
            ds.b(eh2);
        }
    }

    public static void f() {
        b = ej.b("/gamelogo.png");
    }
}

