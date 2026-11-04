/*
 * Decompiled with CFR 0.152.
 */
public final class au {
    public int a;
    public byte b;
    public av c;

    public au() {
    }

    public au(int n2, int n3) {
        if (n2 == 22) {
            n2 = 6;
            n3 *= 1000;
        }
        if (n2 == 23) {
            n2 = 7;
            n3 *= 1000;
        }
        this.a = n3;
        this.c = cw.l().L[n2];
    }

    public final String a() {
        return o.a(this.c.b, "#", String.valueOf(this.a));
    }

    public final String b() {
        return o.a(this.c.b, "$", "");
    }
}

