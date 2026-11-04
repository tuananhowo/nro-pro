/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
package main;

import javax.microedition.midlet.MIDlet;
import main.a;

public class GameMidlet
extends MIDlet {
    public static String a = "112.213.94.23";
    public static int b = 14445;
    public static String c;
    public static int d;
    public static int e;
    public static int f;
    private static a i;
    public static GameMidlet g;
    private static boolean j;
    public static boolean h;

    static {
        f = 252;
    }

    public GameMidlet() {
        g = this;
    }

    protected void destroyApp(boolean bl2) {
    }

    protected void pauseApp() {
    }

    public void startApp() {
        if (!j) {
            GameMidlet gameMidlet = this;
            i = new a();
            i.q();
            eb.a().a(ci.a());
            eb.b().a(ci.a());
            eb.b().c = false;
            du.f();
            du.c();
            main.a.E = new du();
            eg.a(g);
            j = true;
        }
    }

    public final void a() {
        eg.as = false;
        System.gc();
        this.notifyDestroyed();
    }
}

