/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import main.GameMidlet;

final class ed
implements Runnable {
    private final long a;
    private final DataInputStream b;
    private eb c;

    ed(eb eb2, long l2, DataInputStream dataInputStream) {
        this.c = eb2;
        this.a = l2;
        this.b = dataInputStream;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block22: {
            while (true) {
                block25: {
                    block21: {
                        try lbl-1000:
                        // 3 sources

                        {
                            while (this.a == this.c.e() && this.c.d && this.b != null) {
                                block23: {
                                    var2_2 = this.b;
                                    var1_1 = this;
                                    var3_4 = var2_2.readByte();
                                    if (var1_1.c.j) {
                                        var3_4 = eb.a(var1_1.c, var3_4);
                                    }
                                    if (var3_4 != -32 && var3_4 != -66 && var3_4 != 11 && var3_4 != -67 && var3_4 != -74 && var3_4 != -87 && var3_4 != 66 && var3_4 != 12) break block23;
                                    var3_5 = var2_2;
                                    var2_3 = var3_4;
                                    var4_6 = eb.a(var1_1.c, var3_5.readByte()) + 128;
                                    var5_8 = eb.a(var1_1.c, var3_5.readByte()) + 128;
                                    var6_10 = eb.a(var1_1.c, var3_5.readByte()) + 128;
                                    var4_6 = ((var6_10 << 8) + var5_8 << 8) + var4_6;
                                    var5_7 = new byte[var4_6];
                                    var6_10 = 0;
                                    var7_11 = 0;
                                    if (true) ** GOTO lbl50
                                }
                                if (var1_1.c.j) {
                                    var5_9 = var2_2.readByte();
                                    var6_10 = var2_2.readByte();
                                    var4_6 = (eb.a(var1_1.c, var5_9) & 255) << 8 | eb.a(var1_1.c, (byte)var6_10) & 255;
                                } else {
                                    var4_6 = var2_2.readUnsignedShort();
                                }
                                var5_7 = new byte[var4_6];
                                var6_10 = 0;
                                var7_11 = 0;
                                while (true) {
                                    block24: {
                                        if (var6_10 != -1 && var7_11 < var4_6) break block24;
                                        if (!var1_1.c.j) break block21;
                                        var8_15 = 0;
                                        if (true) ** GOTO lbl62
                                    }
                                    var6_10 = var2_2.read(var5_7, var7_11, var4_6 - var7_11);
                                    if (var6_10 <= 0) continue;
                                    var1_1.c.i += (var7_11 += var6_10) + 5;
                                    var8_14 = eb.a().i + eb.a().h;
                                    var1_1.c.m = String.valueOf(var8_14 / 1024) + "." + var8_14 % 1024 / 102 + "Kb";
                                }
                            }
                            break block22;
                        }
                        catch (Exception v0) {}
                        break block22;
                        do {
                            if ((var6_10 = var3_5.read(var5_7, var7_11, var4_6 - var7_11)) <= 0) continue;
                            var1_1.c.i += (var7_11 += var6_10) + 5;
                            var8_13 = eb.a().i + eb.a().h;
                            var1_1.c.m = String.valueOf(var8_13 / 1024) + "." + var8_13 % 1024 / 102 + "Kb";
lbl50:
                            // 3 sources

                        } while (var6_10 != -1 && var7_11 < var4_6);
                        if (var1_1.c.j) {
                            var8_13 = 0;
                            while (var8_13 < var5_7.length) {
                                var5_7[var8_13] = eb.a(var1_1.c, var5_7[var8_13]);
                                ++var8_13;
                            }
                        }
                        v1 = new aa(var2_3, var5_7);
                        break block25;
                        do {
                            var5_7[var8_15] = eb.a(var1_1.c, var5_7[var8_15]);
                            ++var8_15;
lbl62:
                            // 2 sources

                        } while (var8_15 < var5_7.length);
                    }
                    v1 = var1_1 = new aa(var3_4, var5_7);
                }
                if (this.a != this.c.e()) {
                    return;
                }
                if (var1_1 == null) break block22;
                try {
                    block26: {
                        if (var1_1.a != -27) break block26;
                        this.a((aa)var1_1, this.a);
                        ** GOTO lbl-1000
                    }
                    this.c.b.a((aa)var1_1);
                }
                catch (Exception v2) {
                    var1_1 = v2;
                    v2.printStackTrace();
                    break;
                }
            }
            ** GOTO lbl-1000
        }
        if (this.a != this.c.e()) {
            return;
        }
        if (this.c.d) {
            if (this.c.b != null) {
                if (System.currentTimeMillis() - this.c.l > 500L) {
                    this.c.b.b(this.c.c);
                } else {
                    this.c.b.a(this.c.c);
                }
            }
            if (this.a == this.c.e() && eb.c(this.c) != null) {
                eb.d(this.c);
            }
        }
    }

    private void a(aa aa2, long l2) {
        if (l2 != this.c.e()) {
            return;
        }
        int n2 = aa2.c().readByte();
        byte[] byArray = new byte[n2];
        int n3 = 0;
        while (n3 < n2) {
            byArray[n3] = aa2.c().readByte();
            ++n3;
        }
        n3 = 0;
        while (n3 < byArray.length - 1) {
            int n4 = n3 + 1;
            byArray[n4] = (byte)(byArray[n4] ^ byArray[n3]);
            ++n3;
        }
        String string = aa2.c().readUTF();
        n2 = aa2.c().readInt();
        boolean bl2 = aa2.c().readByte() != 0;
        dq.c("[SECONDARY] handshake endpoint=" + string + ":" + n2 + " serverEnabled=" + bl2 + " mainSession=" + this.c.c + " disabledForced=true");
        eb eb2 = this.c;
        synchronized (eb2) {
            if (l2 != eb.b(this.c) || eb.a(this.c)) {
                return;
            }
            this.c.k = byArray;
            if (this.c.c) {
                GameMidlet.c = null;
                GameMidlet.d = 0;
                GameMidlet.h = false;
                dq.c("[SECONDARY] disabled reason=forced off; serverEnabled=" + bl2);
            } else {
                dq.c("[SECONDARY] handshake endpoint ignored on secondary session");
            }
            this.c.j = true;
            eb.b(this.c, l2);
            if (this.c.c) {
                ds.A = 2;
            }
        }
        if (this.c.c && l2 == this.c.e()) {
            eb.b().f();
        }
        System.out.println("====> getKey " + this.c.j + " co nect 2 is false (forced off)");
    }
}

