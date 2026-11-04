/*
 * Decompiled with CFR 0.152.
 */
import main.a;

final class cs
implements Runnable {
    private int a;
    private boolean b;
    private cr c;

    cs(cr cr2) {
        this.c = cr2;
        this.a = 0;
        this.b = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        try {
            while (cr.d) {
                block8: {
                    if (main.a.E != cr.a) {
                        return;
                    }
                    this.c.c = 2;
                    while (true) {
                        if (this.a >= 7 || this.c.b == 5) {
                            if (this.a == 7) {
                                Thread.sleep(800L);
                                cr.a(cr.c());
                                Thread.sleep(4000L);
                                if (!cr.e) break;
                                this.c.e();
                                Thread.yield();
                                return;
                            }
                            break block8;
                        }
                        cr.a(this.c, this.a);
                        ++this.a;
                        Thread.sleep(300L);
                    }
                    if (this.c.b == 5) {
                        cr.a(cr.c());
                        this.a = 0;
                    }
                    Thread.sleep(1000L);
                }
                if (this.c.b != 5 || this.a != 0 || this.b) continue;
                this.b = true;
                cr.a(cr.c());
            }
            return;
        }
        catch (Exception exception) {}
    }
}

