/*
 * Decompiled with CFR 0.152.
 */
public final class aj
extends eq {
    public static aj a = new aj("low");
    public static aj b = new aj("mid");
    public static aj c = new aj("mid2");
    public static aj d = new aj("hi");

    private void c() {
        int n2 = this.size() - 1;
        while (n2 >= 0) {
            am am2 = (am)this.elementAt(n2);
            if (am2 != null) {
                am2.a();
                if (am2.b) {
                    this.removeElementAt(n2);
                }
            }
            --n2;
        }
    }

    public static void a() {
        d.c();
        b.c();
        c.c();
        a.c();
    }

    public final void a(eh eh2) {
        int n2 = 0;
        while (n2 < this.size()) {
            am am2 = (am)this.elementAt(n2);
            if (am2 != null && !am2.b) {
                ((am)this.elementAt(n2)).a(eh2);
            }
            ++n2;
        }
    }

    private void d() {
        int n2 = this.size() - 1;
        while (n2 >= 0) {
            am am2 = (am)this.elementAt(n2);
            if (am2 != null) {
                am2.b = true;
                this.removeElementAt(n2);
            }
            --n2;
        }
    }

    public static void b() {
        d.d();
        a.d();
        b.d();
        c.d();
    }

    public static void a(am am2) {
        d.addElement(am2);
    }

    public static void b(am am2) {
        b.addElement(am2);
    }

    public static void c(am am2) {
        c.addElement(am2);
    }

    public static void d(am am2) {
        a.addElement(am2);
    }

    private aj(String string) {
        super(string);
    }
}

