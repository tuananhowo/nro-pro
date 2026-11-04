/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

final class ee
implements Runnable {
    private final String a;
    private final long b;
    private int c;
    private eb d;

    ee(eb eb2, String string, int n2, long l2) {
        this.d = eb2;
        this.a = string;
        this.c = n2;
        this.b = l2;
    }

    public final void run() {
        eb.a(this.d, this.b);
        if (this.b != this.d.e()) {
            return;
        }
        try {
            block14: {
                Runnable runnable;
                long l2 = this.b;
                int n2 = this.c;
                Object object = this.a;
                ee ee2 = this;
                ei ei2 = null;
                DataOutputStream dataOutputStream = null;
                try {
                    ei2 = new ei((String)object, n2);
                    object = ei2;
                    dataOutputStream = ei2.a.openDataOutputStream();
                    object = ei2;
                    object = ((ei)object).a.openDataInputStream();
                }
                catch (IOException iOException) {
                    eb.a(ee2.d, ei2, dataOutputStream, null);
                    throw iOException;
                }
                catch (RuntimeException runtimeException) {
                    eb.a(ee2.d, ei2, dataOutputStream, null);
                    throw runtimeException;
                }
                if (dataOutputStream == null || object == null) {
                    eb.a(ee2.d, ei2, dataOutputStream, (DataInputStream)object);
                    throw new IOException("socket streams are unavailable");
                }
                eb eb2 = ee2.d;
                synchronized (eb2) {
                    if (l2 != eb.b(ee2.d) || eb.a(ee2.d)) {
                        eb.a(ee2.d, ei2, dataOutputStream, (DataInputStream)object);
                        break block14;
                    }
                    eb.a(ee2.d, ei2);
                    eb.a(ee2.d, dataOutputStream);
                    ee2.d.a = object;
                    ee2.d.d = true;
                    runnable = new ef(ee2.d, l2);
                    eb.a(ee2.d, (ef)runnable);
                    runnable = new Thread(runnable);
                    ee2.d.g = runnable;
                    ee2.d.f = object = new Thread(new ed(ee2.d, l2, (DataInputStream)object));
                }
                if (l2 == ee2.d.e() && !eb.a(ee2.d)) {
                    ((Thread)runnable).start();
                    ((Thread)object).start();
                    ee2.d.l = System.currentTimeMillis();
                    eb.a(ee2.d, new aa(-27), l2);
                    dq.c("=======================> gui message cmd = -27 to server");
                    ee2.d.e = false;
                }
            }
            if (!eb.a(this.d) && this.b == this.d.e() && this.d.b != null) {
                this.d.b.c(this.d.c);
                return;
            }
        }
        catch (IOException iOException) {
            eb.a(this.d, this.b, "socket connect failed: " + iOException.toString());
            return;
        }
        catch (RuntimeException runtimeException) {
            eb.a(this.d, this.b, "socket setup failed: " + runtimeException.toString());
        }
    }
}

