/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Vector;

final class ef
implements Runnable {
    private final Vector a;
    private final long b;
    private eb c;

    public ef(eb eb2, long l2) {
        this.c = eb2;
        this.a = new Vector();
        this.b = l2;
    }

    public final void a(aa aa2) {
        this.a.addElement(aa2);
    }

    public final void run() {
        while (this.b == this.c.e() && this.c.d) {
            Object object;
            try {
                if (this.c.j) {
                    while (this.a.size() > 0) {
                        object = (aa)this.a.elementAt(0);
                        this.a.removeElementAt(0);
                        eb.a(this.c, (aa)object, this.b);
                    }
                }
                try {
                    Thread.sleep(10L);
                }
                catch (Exception exception) {}
            }
            catch (IOException iOException) {
                eb.a(this.c, this.b, "socket send failed: " + iOException.toString());
                return;
            }
            catch (RuntimeException runtimeException) {
                object = runtimeException;
                runtimeException.printStackTrace();
            }
        }
    }

    static Vector a(ef ef2) {
        return ef2.a;
    }
}

