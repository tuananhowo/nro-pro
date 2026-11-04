/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class eb
implements z {
    private static eb n = new eb();
    private static eb o = new eb();
    private volatile DataOutputStream p;
    public volatile DataInputStream a;
    public y b;
    public boolean c = true;
    private volatile ei q;
    public volatile boolean d;
    public volatile boolean e;
    private ef r = new ef(this, Long.MIN_VALUE);
    private volatile long s;
    private volatile boolean t;
    private Thread u;
    public Thread f;
    public Thread g;
    public int h;
    public int i;
    volatile boolean j;
    public byte[] k = null;
    private byte v;
    private byte w;
    long l;
    public String m = "";
    private long x = 0L;
    private static int y;

    public static eb a() {
        return n;
    }

    public static eb b() {
        return o;
    }

    public final synchronized void c() {
        ef.a(this.r).removeAllElements();
    }

    public final boolean d() {
        return this.d && this.q != null && this.q.a != null && this.a != null;
    }

    public final synchronized long e() {
        return this.s;
    }

    public final void a(y y2) {
        this.b = y2;
    }

    public final void a(String object, int n2) {
        long l2;
        System.out.println(">>connect: " + (String)object + ":" + n2);
        eb eb2 = this;
        synchronized (eb2) {
            if (this.d || this.e) {
                return;
            }
            long l3 = ej.j();
            if (l3 < this.x) {
                return;
            }
            this.x = l3 + 50L;
            this.i();
            this.t = false;
            this.j = false;
            this.e = true;
            if (this.c) {
                ds.A = -1;
            }
            l2 = this.s;
            object = new Thread(new ee(this, (String)object, n2, l2));
        }
        cj.a().a(this.c, l2);
        ((Thread)object).start();
    }

    public final synchronized void a(aa aa2) {
        ++y;
        this.r.a(aa2);
        System.out.println("SEND MSG: " + aa2.a);
    }

    private synchronized void a(aa aa2, long l2) {
        if (l2 != this.s || this.p == null) {
            return;
        }
        System.out.println("DO SEND MSG: " + aa2.a);
        byte[] byArray = aa2.a();
        if (this.j) {
            byte by2 = this.a(aa2.a);
            this.p.writeByte(by2);
        } else {
            this.p.writeByte(aa2.a);
        }
        if (byArray != null) {
            int n2;
            int n3 = byArray.length;
            if (this.j) {
                n2 = this.a((byte)(n3 >> 8));
                this.p.writeByte(n2);
                n3 = this.a((byte)n3);
                this.p.writeByte(n3);
            } else {
                this.p.writeShort(n3);
            }
            if (this.j) {
                n2 = 0;
                while (n2 < byArray.length) {
                    byArray[n2] = this.a(byArray[n2]);
                    ++n2;
                }
            }
            ((OutputStream)this.p).write(byArray);
            this.h += 5 + byArray.length;
        } else {
            this.p.writeShort(0);
            this.h += 5;
        }
        this.p.flush();
    }

    private byte a(byte by2) {
        byte by3 = this.w;
        this.w = (byte)(by3 + 1);
        by2 = (byte)(this.k[by3] & 0xFF ^ by2 & 0xFF);
        if (this.w >= this.k.length) {
            this.w = (byte)(this.w % this.k.length);
        }
        return by2;
    }

    public final void f() {
        this.h();
    }

    private void h() {
        long l2;
        eb eb2 = this;
        synchronized (eb2) {
            this.i();
            l2 = this.s;
        }
        cj.a().a(this.c, l2);
    }

    private void i() {
        long l2 = this.s++;
        this.a(l2);
        this.t = true;
        this.k = null;
        this.v = 0;
        this.w = 0;
        this.d = false;
        this.e = false;
        this.j = false;
        if (this.r != null) {
            ef.a(this.r).removeAllElements();
        }
        ei ei2 = this.q;
        DataOutputStream dataOutputStream = this.p;
        DataInputStream dataInputStream = this.a;
        this.q = null;
        this.p = null;
        this.a = null;
        if (this.g != null) {
            this.g.interrupt();
        }
        this.g = null;
        if (this.f != null) {
            this.f.interrupt();
        }
        this.f = null;
        try {
            if (ei2 != null && ei2.a != null) {
                ei2.a();
            }
        }
        catch (IOException iOException) {
            dq.b("socket close failed: " + iOException.toString());
        }
        try {
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
        }
        catch (IOException iOException) {
            dq.b("socket output close failed: " + iOException.toString());
        }
        try {
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        }
        catch (IOException iOException) {
            dq.b("socket input close failed: " + iOException.toString());
        }
        if (this.c) {
            ds.A = 0;
        }
        ci.c = false;
    }

    private synchronized void a(long l2) {
        if (l2 != this.s && l2 + 1L != this.s) {
            return;
        }
        Thread thread = this.u;
        this.u = null;
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
    }

    public static boolean g() {
        return true;
    }

    static void a(eb eb2, long l2) {
        long l3 = l2;
        Thread thread = new Thread(new ec(eb2, l3));
        eb eb3 = eb2;
        synchronized (eb3) {
            if (l3 != eb2.s || eb2.t) {
                return;
            }
            eb2.u = thread;
        }
        thread.start();
    }

    static boolean a(eb eb2) {
        return eb2.t;
    }

    static void a(eb eb2, long l2, String object) {
        String string = object;
        long l3 = l2;
        object = eb2;
        synchronized (eb2) {
            if (l3 != eb2.s || eb2.t) {
                // ** MonitorExit[var3_3] (shouldn't be in output)
                return;
            }
            eb2.i();
            long l4 = eb2.s;
            y y2 = eb2.b;
            // ** MonitorExit[var3_3] (shouldn't be in output)
            cj.a().a(eb2.c, l4);
            dq.b(string);
            if (y2 != null) {
                y2.a(eb2.c);
            }
            return;
        }
    }

    static void a(eb object, ei object2, DataOutputStream closeable, DataInputStream dataInputStream) {
        ei ei2 = object2;
        DataOutputStream dataOutputStream = closeable;
        closeable = dataInputStream;
        object2 = dataOutputStream;
        object = ei2;
        try {
            if (closeable != null) {
                ((FilterInputStream)closeable).close();
            }
        }
        catch (IOException iOException) {}
        try {
            if (object2 != null) {
                ((FilterOutputStream)object2).close();
            }
        }
        catch (IOException iOException) {}
        try {
            if (object != null) {
                ((ei)object).a();
                return;
            }
        }
        catch (IOException iOException) {}
    }

    static long b(eb eb2) {
        return eb2.s;
    }

    static void a(eb eb2, ei ei2) {
        eb2.q = ei2;
    }

    static void a(eb eb2, DataOutputStream dataOutputStream) {
        eb2.p = dataOutputStream;
    }

    static void a(eb eb2, ef ef2) {
        eb2.r = ef2;
    }

    static void a(eb eb2, aa aa2, long l2) {
        eb2.a(aa2, l2);
    }

    static ei c(eb eb2) {
        return eb2.q;
    }

    static void d(eb eb2) {
        eb2.h();
    }

    static void b(eb eb2, long l2) {
        eb2.a(l2);
    }

    static byte a(eb eb2, byte by2) {
        byte by3 = eb2.v;
        eb2.v = (byte)(by3 + 1);
        by2 = (byte)(eb2.k[by3] & 0xFF ^ by2 & 0xFF);
        if (eb2.v >= eb2.k.length) {
            eb2.v = (byte)(eb2.v % eb2.k.length);
        }
        return by2;
    }
}

