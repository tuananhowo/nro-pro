/*
 * Decompiled with CFR 0.152.
 */
final class ec
implements Runnable {
    private eb a;
    private final long b;

    ec(eb eb2, long l2) {
        this.a = eb2;
        this.b = l2;
    }

    public final void run() {
        try {
            Thread.sleep(20000L);
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        if (this.b == this.a.e() && (this.a.e || this.a.d && !this.a.j)) {
            eb.a(this.a, this.b, "socket/key handshake timed out");
        }
    }
}

