/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;
import main.a;

public abstract class eg
extends Canvas
implements Runnable {
    public static boolean as;

    public static void a(GameMidlet gameMidlet) {
        Display.getDisplay((MIDlet)gameMidlet).setCurrent((Displayable)a.h);
    }

    public eg() {
        this.setFullScreenMode(true);
        int n2 = super.getHeight();
        int n3 = super.getWidth();
        if (n3 * n2 >= 2073600) {
            eh.b = 4;
            return;
        }
        if (n3 * n2 >= 691200) {
            eh.b = 3;
            return;
        }
        if (n3 * n2 > 153600) {
            eh.b = 2;
            return;
        }
        eh.b = 1;
    }

    public final void q() {
        new Thread(this).start();
    }

    public static String r() {
        return System.getProperty("microedition.platform");
    }

    public int getHeight() {
        System.out.println("DONT USE getHeight, PLEASE USE getHeightz()");
        return -1;
    }

    public int getWidth() {
        System.out.println("DONT USE getWidth, PLEASE USE getWidthz()");
        return -1;
    }

    public final int s() {
        int n2 = super.getWidth();
        return n2 / eh.b + (n2 % eh.b == 0 ? 0 : 1);
    }

    public final int t() {
        int n2 = super.getHeight();
        return n2 / eh.b + (n2 % eh.b == 0 ? 0 : 1);
    }

    protected final void pointerDragged(int n2, int n3) {
        this.a(n2 /= eh.b, n3 /= eh.b);
    }

    protected final void pointerPressed(int n2, int n3) {
        this.b(n2 /= eh.b, n3 /= eh.b);
    }

    protected final void pointerReleased(int n2, int n3) {
        this.c(n2 /= eh.b, n3 /= eh.b);
    }

    protected abstract void a(int var1, int var2);

    protected abstract void b(int var1, int var2);

    protected abstract void c(int var1, int var2);

    protected abstract void d();

    public void run() {
        try {
            Thread.sleep(100L);
        }
        catch (Exception exception) {}
        as = true;
        while (as) {
            long l2 = System.currentTimeMillis();
            this.d();
            this.repaint();
            this.serviceRepaints();
            long l3 = System.currentTimeMillis() - l2;
            try {
                if (l3 < 27L) {
                    long l4;
                    long l5;
                    do {
                        l4 = System.currentTimeMillis();
                        Thread.sleep(27L - l3);
                    } while ((l5 = System.currentTimeMillis()) - l4 < 27L - l3);
                    continue;
                }
                Thread.sleep(1L);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }
}

