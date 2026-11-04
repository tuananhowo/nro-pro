/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;
import main.a;

public final class bz {
    public Image a;
    public int b;
    public int c;
    public int d;

    public bz(Image image, int n2) {
        this.a = image;
        this.b = n2;
        this.c = 0;
        this.d = 0;
    }

    public final void a(eh eh2, int n2, int n3, int n4, int n5) {
        boolean bl2 = false;
        int n6 = n5;
        n5 = n4;
        n4 = n3;
        n3 = n2;
        eh eh3 = eh2;
        bz bz2 = this;
        if (eh3 == null || bz2.a == null) {
            return;
        }
        eh3.b(bz2.a, 0, 0, eh.a(bz2.a), eh.b(bz2.a), n3, n4, n5, n6);
        if (main.a.w % 1000 == 0) {
            ++bz2.c;
            bz2.d = bz2.c;
        }
    }

    public final void a(eh eh2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        boolean bl2 = false;
        int n9 = n8;
        n8 = n7;
        n7 = n6;
        n6 = n5;
        n5 = n4;
        n4 = n3;
        n3 = n2;
        eh eh3 = eh2;
        bz bz2 = this;
        if (eh3 == null || bz2.a == null) {
            return;
        }
        if (eh.a(bz2.a) != 1) {
            eh3.b(bz2.a, 0, n4 * n7, n7, n8, n3, n5, n6, n9);
            if (main.a.w % 1000 == 0) {
                ++bz2.c;
                bz2.d = bz2.c;
            }
        }
    }
}

