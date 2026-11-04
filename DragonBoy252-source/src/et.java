/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.TextBox
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.midlet.MIDlet;
import main.GameMidlet;
import main.a;

public final class et
implements ao {
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    private boolean l = false;
    private static int m = 2;
    private static final int[] n = new int[]{18, 14, 11, 9, 6, 4, 2};
    private static int o = 0;
    private static String[] p = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb72", "def3\u0111\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec73", "ghi4\u00ed\u00ec\u1ec9\u0129\u1ecb4", "jkl5", "mno6\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee36", "pqrs7", "tuv8\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef18", "wxyz9\u00fd\u1ef3\u1ef7\u1ef9\u1ef59", "*", "#"};
    private static String[] q = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
    public String f = "";
    private String r = "";
    private String s = "";
    private String t = "";
    private int u = 0;
    private int v = 0;
    private int w = 500;
    private int x = 0;
    private int y = -1984;
    private int z = 0;
    private int A = 0;
    private int B = 10;
    private int C = 0;
    public static boolean g;
    private static int D;
    private int E = 0;
    private static int F;
    public boolean h;
    public String i = "";
    public ae j;
    private static Image G;
    private boolean H = true;
    public boolean k = true;
    private static Image I;

    static {
        String[] stringArray = new String[]{"abc", "Abc", "ABC", "123"};
        F = 11;
        G = ej.b("/mainImage/myTexture2der.png");
        I = ej.b("/mainImage/myTexture2dtf.png");
        int[][] nArrayArray = new int[][]{{32, 48}, {49, 69}, {50, 84}, {51, 85}, {52, 68}, {53, 71}, {54, 74}, {55, 67}, {56, 66}, {57, 77}, {42, 128}, {35, 137}, {33, 113}, {63, 97}, {64, 121, 122}, {46, 111}, {44, 108}};
    }

    public static void a() {
    }

    public final void b() {
        Object object;
        TextBox textBox = new TextBox(this.i, "", this.w, 0);
        textBox.addCommand(new Command(ch.bt, 4, 0));
        textBox.addCommand(new Command(ch.bx, 3, 0));
        textBox.setCommandListener((CommandListener)new eu(this, textBox));
        try {
            if (this.C == 2) {
                textBox.setConstraints(65536);
            } else if (this.C == 1) {
                textBox.setConstraints(2);
            } else {
                textBox.setConstraints(0);
            }
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        object = this;
        textBox.setString(((et)object).r);
        textBox.setMaxSize(this.w);
        Display.getDisplay((MIDlet)GameMidlet.g).setCurrent((Displayable)textBox);
    }

    public et() {
        et et2 = this;
        o = ev.t.a() + 1;
        et2.j = new ae(ch.bl, et2, 1000, null);
        D = 0;
        if (ea.d("qwerty") == 1) {
            g = true;
        }
    }

    public final void c() {
        if (this.u > 0 && this.r.length() > 0) {
            this.r = String.valueOf(this.r.substring(0, this.u - 1)) + this.r.substring(this.u, this.r.length());
            --this.u;
            this.f();
            this.g();
        }
    }

    private void f() {
        this.t = this.C == 2 ? this.s : this.r;
        if (this.x < 0 && ev.t.a(this.t) + this.x < this.c - 6 - 13) {
            this.x = this.c - 10 - ev.t.a(this.t);
        }
        if (this.x + ev.t.a(this.t.substring(0, this.u)) <= 0) {
            this.x = -ev.t.a(this.t.substring(0, this.u));
            this.x += 40;
        } else if (this.x + ev.t.a(this.t.substring(0, this.u)) >= this.c - 22) {
            this.x = this.c - 10 - ev.t.a(this.t.substring(0, this.u)) - 12;
        }
        if (this.x > 0) {
            this.x = 0;
        }
    }

    private void d(int n2) {
        if (n2 == 432) {
            n2 = 119;
        }
        if (!(this.C != 2 && this.C != 3 || n2 >= 48 && n2 <= 57 || n2 >= 65 && n2 <= 90 || n2 >= 97 && n2 <= 122)) {
            return;
        }
        if (this.r.length() < this.w) {
            String string = String.valueOf(this.r.substring(0, this.u)) + (char)n2;
            if (this.u < this.r.length()) {
                string = String.valueOf(string) + this.r.substring(this.u, this.r.length());
            }
            this.r = string;
            ++this.u;
            this.g();
            this.f();
        }
    }

    public final boolean a(int n2) {
        if (n2 == 8 || n2 == -8 || n2 == 204) {
            this.c();
            return true;
        }
        if (n2 >= 65 && n2 <= 122 && !g) {
            g = true;
            D = 0;
            ea.a("qwerty", 1);
        }
        if (g) {
            if (n2 == 45) {
                if (n2 == this.y && this.z < n[m]) {
                    this.t = this.r = String.valueOf(this.r.substring(0, this.u - 1)) + '_';
                    this.g();
                    this.f();
                    this.y = -1984;
                    return false;
                }
                this.y = 45;
            }
            if (n2 >= 32) {
                this.d(n2);
                return false;
            }
        }
        if (n2 == F) {
            ++this.E;
            if (this.E > 3) {
                this.E = 0;
            }
            this.z = 1;
            this.y = n2;
            return false;
        }
        if (n2 == 42) {
            n2 = 58;
        }
        if (n2 == 35) {
            n2 = 59;
        }
        if (n2 >= 48 && n2 <= 59) {
            if (this.C == 0 || this.C == 2 || this.C == 3) {
                int n3 = n2;
                et et2 = this;
                Object object = et2.C == 2 || et2.C == 3 ? q : p;
                if (n3 == et2.y) {
                    et2.A = (et2.A + 1) % object[n3 - 48].length();
                    char c2 = object[n3 - 48].charAt(et2.A);
                    c2 = et2.E == 0 ? Character.toLowerCase(c2) : (et2.E == 1 ? Character.toUpperCase(c2) : (et2.E == 2 ? Character.toUpperCase(c2) : object[n3 - 48].charAt(object[n3 - 48].length() - 1)));
                    object = String.valueOf(et2.r.substring(0, et2.u - 1)) + c2;
                    if (et2.u < et2.r.length()) {
                        object = String.valueOf(object) + et2.r.substring(et2.u, et2.r.length());
                    }
                    et2.r = object;
                    et2.z = n[m];
                    et2.g();
                } else if (et2.r.length() < et2.w) {
                    if (et2.E == 1 && et2.y != -1984) {
                        et2.E = 0;
                    }
                    et2.A = 0;
                    char c3 = object[n3 - 48].charAt(et2.A);
                    c3 = et2.E == 0 ? Character.toLowerCase(c3) : (et2.E == 1 ? Character.toUpperCase(c3) : (et2.E == 2 ? Character.toUpperCase(c3) : object[n3 - 48].charAt(object[n3 - 48].length() - 1)));
                    object = String.valueOf(et2.r.substring(0, et2.u)) + c3;
                    if (et2.u < et2.r.length()) {
                        object = String.valueOf(object) + et2.r.substring(et2.u, et2.r.length());
                    }
                    et2.r = object;
                    et2.z = n[m];
                    ++et2.u;
                    et2.g();
                    et2.f();
                }
                et2.y = n3;
            } else if (this.C == 1) {
                this.d(n2);
                this.z = 1;
            }
        } else {
            this.A = 0;
            this.y = -1984;
            if (n2 == 14) {
                if (this.u > 0) {
                    --this.u;
                    this.f();
                    this.B = 10;
                    return false;
                }
            } else if (n2 == 15) {
                if (this.u < this.r.length()) {
                    ++this.u;
                    this.f();
                    this.B = 10;
                    return false;
                }
            } else {
                if (n2 == 19) {
                    this.c();
                    return false;
                }
                this.y = n2;
            }
        }
        return true;
    }

    public final void a(eh eh2) {
        if (this.H) {
            eh2.e(0, 0, main.a.A, main.a.B);
        }
        Object object = this;
        boolean bl2 = ((et)object).e;
        this.t = this.C == 2 ? this.s : this.r;
        String string = this.i;
        String string2 = this.t;
        int n2 = this.b + (this.d - ev.t.a()) / 2;
        int n3 = 6 + this.x + this.a;
        int n4 = this.d;
        int n5 = this.c;
        int n6 = this.b - 1;
        int n7 = this.a;
        boolean bl3 = bl2;
        object = eh2;
        ((eh)object).a(0);
        if (bl3) {
            ((eh)object).a(I, 0, 81, 29, 27, 0, n7, n6, 0);
            ((eh)object).a(I, 0, 135, 29, 27, 0, n7 + n5 - 29, n6, 0);
            ((eh)object).a(I, 0, 108, 29, 27, 0, n7 + n5 - 58, n6, 0);
            int n8 = 0;
            while (n8 < (n5 - 58) / 29) {
                ((eh)object).a(I, 0, 108, 29, 27, 0, n7 + 29 + n8 * 29, n6, 0);
                ++n8;
            }
        } else {
            ((eh)object).a(I, 0, 0, 29, 27, 0, n7, n6, 0);
            ((eh)object).a(I, 0, 54, 29, 27, 0, n7 + n5 - 29, n6, 0);
            ((eh)object).a(I, 0, 27, 29, 27, 0, n7 + n5 - 58, n6, 0);
            int n9 = 0;
            while (n9 < (n5 - 58) / 29) {
                ((eh)object).a(I, 0, 27, 29, 27, 0, n7 + 29 + n9 * 29, n6, 0);
                ++n9;
            }
        }
        ((eh)object).e(n7 + 3, n6 + 1, n5 - 4, n4);
        if (string2 != null && !string2.equals("")) {
            ev.t.a((eh)object, string2, n3, n2, 0);
        } else if (string != null) {
            if (bl3) {
                ev.i.a((eh)object, string, n3, n2 + 2, 0);
            } else {
                ev.j.a((eh)object, string, n3, n2 + 2, 0);
            }
        }
        eh2.a(0);
        object = this;
        if (((et)object).e && this.k) {
            if (this.z == 0 && (this.B > 0 || this.v / 5 % 2 == 0)) {
                eh2.a(7999781);
                eh2.d(7 + this.x + this.a + ev.t.a(this.t.substring(0, this.u)) - 1, this.b + (this.d - o) / 2 + 1, 1, o);
            }
            main.a.a(eh2);
            if (this.r != null && this.r.length() > 0 && main.a.e && bl2) {
                eh2.a(G, this.a + this.c - 13, this.b + this.d / 2 + 1, 3);
            }
        }
    }

    private void g() {
        if (this.C == 2) {
            this.s = "";
            int n2 = 0;
            while (n2 < this.r.length()) {
                this.s = String.valueOf(this.s) + "*";
                ++n2;
            }
            if (this.z > 0 && this.u > 0) {
                this.s = String.valueOf(this.s.substring(0, this.u - 1)) + this.r.charAt(this.u - 1) + this.s.substring(this.u, this.s.length());
            }
        }
    }

    public final void d() {
        this.k = true;
        ++this.v;
        if (this.z > 0) {
            --this.z;
            if (this.z == 0) {
                this.A = 0;
                if (this.E == 1 && this.y != F) {
                    this.E = 0;
                }
                this.y = -1984;
                this.g();
            }
        }
        if (this.B > 0) {
            --this.B;
        }
        if (main.a.m) {
            et et2 = this;
            if (main.a.a(et2.a + et2.c - 20, et2.b, 40, et2.d)) {
                et et3 = et2;
                et2.r = "";
                et3.u = 0;
                et3.f();
                et3.g();
                et2.e = true;
                return;
            }
            if (main.a.a(et2.a, et2.b, et2.c, et2.d)) {
                et2.b();
                return;
            }
            et2.e = false;
        }
    }

    public final String e() {
        return this.r;
    }

    public final void a(String string) {
        if (string == null) {
            return;
        }
        this.y = -1984;
        this.z = 0;
        this.A = 0;
        this.r = string;
        this.t = string;
        this.g();
        this.u = string.length();
        this.f();
    }

    public final void b(int n2) {
        this.w = n2;
    }

    public final void c(int n2) {
        this.C = n2;
        int n3 = 500;
        et et2 = this;
        this.w = n3;
    }

    public final void a(int n2, Object object) {
        switch (n2) {
            case 1000: {
                this.c();
            }
        }
    }
}

