/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;
import main.a;

public final class ej {
    public static boolean a = false;
    public static boolean b = false;
    private static Image j = ej.b("/mainImage/black.png");
    public static int c = 1;
    public static byte d = 0;
    public static byte e = 0;
    public static byte f = (byte)5;
    public static String g;
    public static String h;
    public static boolean i;

    static {
        i = false;
    }

    public static void a() {
    }

    public static void b() {
        e = 0;
    }

    public static int a(Image image) {
        if (c == 5) {
            return image.getWidth();
        }
        return image.getWidth();
    }

    public static int b(Image image) {
        if (c == 5) {
            return image.getHeight();
        }
        return image.getWidth();
    }

    public static String a(long l2, int n2, boolean bl2, boolean bl3) {
        long l3 = (l2 + (long)(n2 * 1000) - System.currentTimeMillis()) / 1000L;
        if (l3 <= 0L) {
            return "";
        }
        return String.valueOf(l3);
    }

    public static String a(long l2) {
        int n2;
        String string;
        boolean bl2;
        String string2;
        block9: {
            string2 = "" + l2;
            bl2 = false;
            string = null;
            if (l2 < 0L) {
                bl2 = true;
                l2 = -l2;
                string2 = "" + l2;
            }
            if (l2 >= 1000000000L) {
                string = "b";
                n2 = ("" + (l2 /= 1000000000L)).length();
                break block9;
            }
            if (l2 >= 1000000L) {
                string = "m";
                n2 = ("" + (l2 /= 1000000L)).length();
                break block9;
            }
            if (l2 >= 1000L) {
                string = "k";
                n2 = ("" + (l2 /= 1000L)).length();
                break block9;
            }
            if (bl2) {
                return "-" + string2;
            }
            return string2;
        }
        try {
            int n3 = Integer.parseInt(string2.substring(n2, 2));
            string2 = n3 == 0 ? String.valueOf(string2.substring(0, n2)) + string : (n3 % 10 == 0 ? String.valueOf(string2.substring(0, n2)) + "," + string2.substring(n2, 1) + string : String.valueOf(string2.substring(0, n2)) + "," + string2.substring(n2, 2) + string);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (bl2) {
            return "-" + string2;
        }
        return string2;
    }

    public static void c() {
        try {
            GameMidlet.g.platformRequest(ds.m);
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            ConnectionNotFoundException connectionNotFoundException2 = connectionNotFoundException;
            connectionNotFoundException.printStackTrace();
            return;
        }
    }

    public static void d() {
    }

    public static void e() {
    }

    public static void a(eh eh2, int n2, int n3, int n4) {
        n4 = n4 / eh.a(j) + 1;
        int n5 = 0;
        while (n5 < n4) {
            eh2.a(j, n2 + n5 * eh.a(j), n3, 0);
            ++n5;
        }
    }

    public static void f() {
        while (ci.b) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
        }
    }

    public static void a(boolean bl2) {
        if (ds.q > 0) {
            if (bl2) {
                ds.A = 0;
            }
            return;
        }
        if (main.a.E.equals(du.a)) {
            main.a.a(String.valueOf(ch.x) + " [1]", 8884, null);
            return;
        }
        eb.a().c();
        eb.b().c();
        ds.c = false;
        if (ci.a) {
            main.a.a(ch.x, 8885, null);
            return;
        }
        main.a.am = true;
        en.c = false;
        en.i = ds.a[ds.p];
        if (main.a.E != main.a.ao) {
            dq.c("===========> 2 v\u00e0o OnconnectFail");
            ds.n = 0;
        } else {
            ds.B = true;
        }
        co.cd = false;
        if (bl2) {
            ds.A = 0;
        }
    }

    public static void b(boolean bl2) {
        if (ds.q > 0) {
            if (bl2) {
                ds.A = 0;
            }
            return;
        }
        main.a.am = true;
        eb.a().c();
        eb.b().c();
        if (ci.a) {
            main.a.b(ch.aG, 8885, null);
            return;
        }
        if (main.a.E != main.a.ao) {
            main.a.b(String.valueOf(ch.x) + " [2]", 8884, null);
        }
        co.cd = false;
        if (bl2) {
            ds.A = 0;
        }
    }

    public static Image a(String string) {
        String[] stringArray = "/x" + eh.b + string;
        Image image = null;
        dq.c("path load rms= " + string);
        try {
            stringArray = dq.a((String)stringArray, ".", 0);
            stringArray = dq.a(stringArray[0], "/", 0);
            String string2 = "x" + eh.b + stringArray[stringArray.length - 1];
            byte[] byArray = ea.b(string2);
            if (byArray == null) {
                byArray = ea.b(String.valueOf(string2) + ".png");
            }
            if (byArray == null) {
                byArray = ea.b(String.valueOf(eh.b) + stringArray[stringArray.length - 1]);
            }
            if (byArray == null) {
                byArray = ea.b(String.valueOf(eh.b) + stringArray[stringArray.length - 1] + ".png");
            }
            if (byArray != null) {
                image = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (image != null) {
            return image;
        }
        try {
            image = em.a(string);
        }
        catch (Exception exception) {}
        return image;
    }

    public static Image b(String string) {
        Image image = null;
        try {
            image = em.a(string);
        }
        catch (Exception exception) {}
        return image;
    }

    public static Image c(String string) {
        string = "/x" + eh.b + string;
        Image image = null;
        try {
            image = Image.createImage((String)string);
        }
        catch (Exception exception) {}
        return image;
    }

    public static void a(eh eh2) {
        int n2 = 0;
        while (n2 < 5) {
            if (cw.bV[n2] != -1 && main.a.d(cw.bT[n2], cw.bU[n2])) {
                if (cw.bW[n2] == 0) {
                    ev.v.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2);
                } else if (cw.bW[n2] == 1) {
                    ev.x.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2);
                } else if (cw.bW[n2] == 2) {
                    ev.y.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2);
                } else if (cw.bW[n2] == 3) {
                    ev.x.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2, ev.y);
                } else if (cw.bW[n2] == 8) {
                    ev.r.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2, ev.f);
                } else if (cw.bW[n2] == 4) {
                    ev.s.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2, ev.o);
                } else if (cw.bW[n2] == 5) {
                    ev.z.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2);
                } else if (cw.bW[n2] == 6) {
                    ev.x.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2, ev.v);
                } else if (cw.bW[n2] == 7) {
                    ev.c.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2, ev.f);
                } else if (cw.bW[n2] == 9) {
                    ev.p.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2, ev.f);
                } else if (cw.bW[n2] == 10) {
                    ev.l.b(eh2, cw.bS[n2], cw.bT[n2], cw.bU[n2], 2, ev.f);
                }
            }
            ++n2;
        }
    }

    public static void g() {
    }

    public static void h() {
    }

    public static void i() {
    }

    public static long j() {
        return System.currentTimeMillis();
    }

    public static void k() {
    }

    public static void l() {
    }

    public static dz d(String string) {
        dz dz2 = null;
        eo eo2 = null;
        eo2 = r.a(string, r.a);
        if (eo2.a != null) {
            int n2 = eo2.a.getHeight() / eo2.d;
            if (n2 <= 0) {
                n2 = 1;
            }
            dz2 = new dz(eo2.a, eo2.a.getWidth(), n2);
        }
        return dz2;
    }

    public static void e(String string) {
    }
}

