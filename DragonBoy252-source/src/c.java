/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public final class c
implements ao {
    public int a;
    public int b;
    public int c;
    public String d;
    public long e;
    public String[] f;
    public byte g;
    public byte h;
    private int m;
    public int i;
    public int j;
    public String[] k;
    public static eq l = new eq("v Message");

    public static void a(c c2, int n2, boolean bl2) {
        int n3 = 0;
        while (n3 < l.size()) {
            c c3 = (c)l.elementAt(n3);
            if (c3.a == c2.a) {
                l.removeElement(c3);
                if (!bl2) {
                    l.insertElementAt(c2, n3);
                    return;
                }
                l.insertElementAt(c2, 0);
                return;
            }
            if (c3.j != 0 && c3.i == c3.j) {
                l.removeElement(c3);
            }
            ++n3;
        }
        if (n2 == -1) {
            l.addElement(c2);
        } else {
            l.insertElementAt(c2, 0);
        }
        if (l.size() > 20) {
            l.removeElementAt(l.size() - 1);
        }
    }

    public final void a(eh eh2, int n2, int n3) {
        ev ev2 = ev.f;
        if (this.h == 0) {
            ev2 = ev.a;
        } else if (this.h == 1) {
            ev2 = ev.h;
        } else if (this.h == 2) {
            ev2 = ev.g;
        }
        if (this.b == 0) {
            ev2.a(eh2, this.d, n2 + 3, n3 + 1, 0);
            if (this.g == 0) {
                ev.o.a(eh2, String.valueOf(this.f[0]) + (this.f.length > 1 ? "..." : ""), n2 + 3, n3 + 11, 0);
            } else {
                ev.p.a(eh2, String.valueOf(this.f[0]) + (this.f.length > 1 ? "..." : ""), n2 + 3, n3 + 11, 0);
            }
            ev.o.a(eh2, String.valueOf(o.c(this.m)) + " " + ch.dM, n2 + main.a.G.ag - 3, n3 + 1, 1);
        }
        if (this.b == 1) {
            ev2.a(eh2, String.valueOf(this.d) + " (" + this.i + "/" + this.j + ")", n2 + 3, n3 + 1, 0);
            ev.q.a(eh2, String.valueOf(ch.da) + " " + o.c(this.m) + " " + ch.dM, n2 + 3, n3 + 11, 0);
        }
        if (this.b == 2) {
            ev2.a(eh2, this.d, n2 + 3, n3 + 1, 0);
            ev.q.a(eh2, ch.dD, n2 + 3, n3 + 11, 0);
        }
    }

    public final void a(int n2, Object object) {
    }

    public final void a() {
        if (this.e != 0L) {
            this.m = (int)(System.currentTimeMillis() / 1000L - this.e);
        }
    }
}

