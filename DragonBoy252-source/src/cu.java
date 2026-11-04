/*
 * Decompiled with CFR 0.152.
 */
import main.a;

public abstract class cu {
    public ae a;
    public ae b;
    public ae c;

    public void a(eh eh2) {
        eh2.a(-eh2.a(), -eh2.b());
        eh2.e(0, 0, main.a.A, main.a.B);
        main.a.M.a();
        bj.a(eh2, this.a, this.b, this.c);
    }

    public void a(int n2) {
        switch (n2) {
            case -38: 
            case -1: {
                main.a.j[2] = true;
                main.a.i[2] = true;
                return;
            }
            case -39: 
            case -2: {
                main.a.j[8] = true;
                main.a.i[8] = true;
                return;
            }
            case -21: 
            case -6: {
                main.a.j[12] = true;
                main.a.i[12] = true;
                return;
            }
            case -22: 
            case -7: {
                main.a.j[13] = true;
                main.a.i[13] = true;
                return;
            }
            case -5: 
            case 10: {
                main.a.j[5] = true;
                main.a.i[5] = true;
                return;
            }
            case -27: {
                return;
            }
        }
    }

    public void a() {
        if (this.b != null && (main.a.i[5] || ew.a(this.b))) {
            main.a.i[5] = false;
            main.a.l = false;
            ew.cF = -1;
            main.a.m = false;
            if (this.b != null) {
                this.b.a();
            }
            ew.cF = -1;
        }
        if (this.a != null && (main.a.i[12] || ew.a(this.a))) {
            main.a.i[12] = false;
            main.a.l = false;
            ew.cF = -1;
            main.a.m = false;
            if (this.a != null) {
                this.a.a();
            }
            ew.cF = -1;
        }
        if (this.c != null && (main.a.i[13] || ew.a(this.c))) {
            main.a.i[13] = false;
            main.a.l = false;
            main.a.m = false;
            ew.cF = -1;
            if (this.c != null) {
                this.c.a();
            }
            ew.cF = -1;
        }
        main.a.j();
        main.a.k();
    }
}

