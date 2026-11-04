/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Image;
import main.a;

public final class ev {
    private int K;
    private int L;
    private Image M;
    private String N;
    private int[][] O;
    private static String P = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():a\u00e1\u00e0\u1ea3\u00e3\u1ea1\u00e2\u1ea5\u1ea7\u1ea9\u1eab\u1ead\u0103\u1eaf\u1eb1\u1eb3\u1eb5\u1eb7bcd\u0111e\u00e9\u00e8\u1ebb\u1ebd\u1eb9\u00ea\u1ebf\u1ec1\u1ec3\u1ec5\u1ec7fghi\u00ed\u00ec\u1ec9\u0129\u1ecbjklmno\u00f3\u00f2\u1ecf\u00f5\u1ecd\u00f4\u1ed1\u1ed3\u1ed5\u1ed7\u1ed9\u01a1\u1edb\u1edd\u1edf\u1ee1\u1ee3pqrstu\u00fa\u00f9\u1ee7\u0169\u1ee5\u01b0\u1ee9\u1eeb\u1eed\u1eef\u1ef1vxy\u00fd\u1ef3\u1ef7\u1ef9\u1ef5zwA\u00c1\u00c0\u1ea2\u00c3\u1ea0\u0102\u1eb0\u1eae\u1eb2\u1eb4\u1eb6\u00c2\u1ea4\u1ea6\u1ea8\u1eaa\u1eacBCD\u0110E\u00c9\u00c8\u1eba\u1ebc\u1eb8\u00ca\u1ebe\u1ec0\u1ec2\u1ec4\u1ec6FGHI\u00cd\u00cc\u1ec8\u0128\u1ecaJKLMNO\u00d3\u00d2\u1ece\u00d5\u1ecc\u00d4\u1ed0\u1ed2\u1ed4\u1ed6\u1ed8\u01a0\u1eda\u1edc\u1ede\u1ee0\u1ee2PQRSTU\u00da\u00d9\u1ee6\u0168\u1ee4\u01af\u1ee8\u1eea\u1eec\u1eee\u1ef0VXY\u00dd\u1ef2\u1ef6\u1ef8\u1ef4ZW";
    public static ev a = new ev(P, "/myfont/tahoma_7b_red.png", "/myfont/tahoma_7b", 0);
    public static ev b = new ev(P, "/myfont/tahoma_7b_blue.png", "/myfont/tahoma_7b", 0);
    public static ev c = new ev(P, "/myfont/tahoma_7b_white.png", "/myfont/tahoma_7b", 0);
    public static ev d = new ev(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
    public static ev e = new ev(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
    public static ev f = new ev(P, "/myfont/tahoma_7b_brown.png", "/myfont/tahoma_7b", 0);
    public static ev g = new ev(P, "/myfont/tahoma_7b_green2.png", "/myfont/tahoma_7b", 0);
    public static ev h = new ev(P, "/myfont/tahoma_7b_green.png", "/myfont/tahoma_7b", 0);
    public static ev i = new ev(P, "/myfont/tahoma_7b_focus.png", "/myfont/tahoma_7b", 0);
    public static ev j = new ev(P, "/myfont/tahoma_7b_unfocus.png", "/myfont/tahoma_7b", 0);
    public static ev k = new ev(P, "/myfont/tahoma_7.png", "/myfont/tahoma_7", 0);
    public static ev l = new ev(P, "/myfont/tahoma_7_blue1.png", "/myfont/tahoma_7", 0);
    public static ev m = new ev(P, "/myfont/tahoma_7_green2.png", "/myfont/tahoma_7", 0);
    public static ev n = new ev(P, "/myfont/tahoma_7_yellow.png", "/myfont/tahoma_7", 0);
    public static ev o = new ev(P, "/myfont/tahoma_7_grey.png", "/myfont/tahoma_7", 0);
    public static ev p = new ev(P, "/myfont/tahoma_7_red.png", "/myfont/tahoma_7", 0);
    public static ev q = new ev(P, "/myfont/tahoma_7_blue.png", "/myfont/tahoma_7", 0);
    public static ev r = new ev(P, "/myfont/tahoma_7_green.png", "/myfont/tahoma_7", 0);
    public static ev s = new ev(P, "/myfont/tahoma_7_white.png", "/myfont/tahoma_7", 0);
    public static ev t = new ev(P, "/myfont/tahoma_8b.png", "/myfont/tahoma_8b", -1);
    private static ev Q = new ev(" 0123456789+-", "/myfont/number_yellow.png", "/myfont/number", 0);
    private static ev R = new ev(" 0123456789+-", "/myfont/number_red.png", "/myfont/number", 0);
    private static ev S = new ev(" 0123456789+-", "/myfont/number_green.png", "/myfont/number", 0);
    public static ev u = new ev(" 0123456789+-", "/myfont/number_gray.png", "/myfont/number", 0);
    private static ev T = new ev(" 0123456789+-", "/myfont/number_orange.png", "/myfont/number", 0);
    public static ev v = R;
    public static ev w = c;
    public static ev x = Q;
    public static ev y = S;
    public static ev z = T;
    public static ev A = l;
    public static ev B = p;
    public static ev C = n;
    public static ev D = r;
    public static ev E = o;
    public static ev F = n;
    public static ev G = g;
    public static ev H = s;
    public static ev I = h;
    public static ev J = l;
    private String U;

    private ev(String object, String string, String string2, int n2) {
        try {
            this.N = object;
            this.K = n2;
            this.U = string;
            object = null;
            ev ev2 = this;
            this.M = ej.b(ev2.U);
            try {
                object = new DataInputStream(v.a(string2));
                this.O = new int[((DataInputStream)object).readShort()][];
                int n3 = 0;
                while (n3 < this.O.length) {
                    this.O[n3] = new int[4];
                    this.O[n3][0] = ((DataInputStream)object).readShort();
                    this.O[n3][1] = ((DataInputStream)object).readShort();
                    this.O[n3][2] = ((DataInputStream)object).readShort();
                    this.O[n3][3] = ((DataInputStream)object).readShort();
                    int n4 = this.O[n3][3];
                    ev2 = this;
                    this.L = n4;
                    ++n3;
                }
                return;
            }
            catch (Exception exception) {
                try {
                    ((FilterInputStream)object).close();
                    return;
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                    return;
                }
            }
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            System.out.println("paht data:" + string);
            return;
        }
    }

    public final int a() {
        return this.L;
    }

    public final int a(String string) {
        int n2 = 0;
        int n3 = 0;
        while (n3 < string.length()) {
            int n4 = this.N.indexOf(string.charAt(n3));
            if (n4 == -1) {
                n4 = 0;
            }
            n2 += this.O[n4][2] + this.K;
            ++n3;
        }
        return n2;
    }

    public final void a(eh eh2, String string, int n2, int n3, int n4) {
        int n5 = string.length();
        n4 = n4 == 0 ? n2 : (n4 == 1 ? n2 - this.a(string) : n2 - (this.a(string) >> 1));
        int n6 = 0;
        while (n6 < n5) {
            n2 = this.N.indexOf(string.charAt(n6));
            if (n2 == -1) {
                n2 = 0;
            }
            if (n2 >= 0) {
                eh2.a(this.M, this.O[n2][0], this.O[n2][1], this.O[n2][2], this.O[n2][3], 0, n4, n3, 20);
            }
            n4 += this.O[n2][2] + this.K;
            ++n6;
        }
    }

    public final void a(eh eh2, String string, int n2, int n3, int n4, ev ev2) {
        int n5 = string.length();
        n4 = n4 == 0 ? n2 : (n4 == 1 ? n2 - this.a(string) : n2 - (this.a(string) >> 1));
        int n6 = 0;
        while (n6 < n5) {
            n2 = this.N.indexOf(string.charAt(n6));
            if (n2 == -1) {
                n2 = 0;
            }
            if (n2 >= 0) {
                if (!main.a.a) {
                    eh2.a(ev2.M, this.O[n2][0], this.O[n2][1], this.O[n2][2], this.O[n2][3], 0, n4 + 1, n3, 20);
                    eh2.a(ev2.M, this.O[n2][0], this.O[n2][1], this.O[n2][2], this.O[n2][3], 0, n4, n3 + 1, 20);
                }
                eh2.a(this.M, this.O[n2][0], this.O[n2][1], this.O[n2][2], this.O[n2][3], 0, n4, n3, 20);
            }
            n4 += this.O[n2][2] + this.K;
            ++n6;
        }
    }

    public final String[] a(String object, int n2) {
        int n3 = n2;
        String[] stringArray = object;
        object = this;
        eq eq2 = new eq("vLine");
        String string = "";
        int n4 = 0;
        while (n4 < stringArray.length()) {
            if (stringArray.charAt(n4) == '\n' || stringArray.charAt(n4) == '\b') {
                eq2.addElement(string);
                string = "";
            } else {
                if (((ev)object).a(string = String.valueOf(string) + stringArray.charAt(n4)) > n3) {
                    int n5 = string.length() - 1;
                    while (n5 >= 0) {
                        if (string.charAt(n5) == ' ') break;
                        --n5;
                    }
                    if (n5 < 0) {
                        n5 = string.length() - 1;
                    }
                    eq2.addElement(string.substring(0, n5));
                    n4 = n4 - (string.length() - n5) + 1;
                    string = "";
                }
                if (n4 == stringArray.length() - 1 && !string.trim().equals("")) {
                    eq2.addElement(string);
                }
            }
            ++n4;
        }
        object = eq2;
        stringArray = new String[((Vector)object).size()];
        n3 = 0;
        while (n3 < ((Vector)object).size()) {
            stringArray[n3] = ((Vector)object).elementAt(n3).toString();
            ++n3;
        }
        return stringArray;
    }

    public final void b(eh eh2, String string, int n2, int n3, int n4) {
        this.a(eh2, string, n2, n3, 2);
    }

    public final void b(eh eh2, String string, int n2, int n3, int n4, ev ev2) {
        this.a(eh2, string, n2, n3, n4, ev2);
    }
}

