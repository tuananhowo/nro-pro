/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class dz {
    public int a;
    public int b;
    public int c;
    public Image d;

    public dz(int n2) {
        Image image = am.a(n2);
        if (image != null) {
            this.d = image;
            this.a = am.c[n2][0];
            this.b = am.c[n2][1] / am.c[n2][2];
            this.c = am.c[n2][2];
        }
    }

    public dz(Image image, int n2, int n3) {
        if (image != null) {
            this.d = image;
            this.a = n2;
            this.b = n3;
            this.c = image.getHeight() / n3;
            if (this.c <= 0) {
                this.c = 1;
            }
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, eh eh2) {
        try {
            if (this.d != null) {
                int n7;
                if (n2 > this.c) {
                    n2 = this.c;
                }
                if ((n7 = n2 * this.b) > this.b * (this.c - 1) || n7 < 0) {
                }
                eh2.a(this.d, 0, n2 * this.b, this.a, this.b, n5, n3, n4, n6);
                return;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

