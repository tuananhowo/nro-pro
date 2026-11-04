/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import main.a;

public class o {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    float k;
    long l;
    long m;
    boolean n;
    int[] o;
    int[] p;

    public o(int n2, int n3, int n4, int n5, int n6) {
        this.i = 0;
        this.j = 0xFF0000;
        this.l = 0L;
        this.m = 150L;
        this.n = true;
        this.o = new int[2];
        this.p = new int[2];
        this.g = n3;
        this.d = n2;
        this.k = 1.0f;
        this.c = n4;
        this.h = n5;
        this.a = main.a.A;
        this.b = main.a.B;
        this.l = System.currentTimeMillis();
        n4 = 0;
        while (n4 < 2) {
            this.o[n4] = n2;
            this.p[n4] = n3;
            ++n4;
        }
        this.j = n6;
    }

    public static void a(eh eh2, int n2, int n3, int n4) {
        eh2.a(n4);
        eh2.d(n2, n3, 1, 2);
    }

    public o() {
    }

    public static byte[] a(aa aa2) {
        try {
            int n2 = aa2.c().readInt();
            if (n2 > 1) {
                byte[] byArray = new byte[n2];
                aa2.c().read(byArray);
                return byArray;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        return null;
    }

    public static byte[] a(DataInputStream dataInputStream) {
        try {
            int n2 = dataInputStream.readInt();
            byte[] byArray = new byte[n2];
            dataInputStream.read(byArray);
            return byArray;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    public static String a(String string, String string2, String string3) {
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = 0;
        while ((n2 = string.indexOf(string2)) != -1) {
            stringBuffer.append(String.valueOf(string.substring(0, n2)) + string3);
            string = string.substring(n2 + string2.length());
        }
        stringBuffer.append(string);
        return stringBuffer.toString();
    }

    public static String a(int n2) {
        long l2 = (long)n2 * 1000L;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        calendar.setTime(new Date(l2));
        int n3 = calendar.get(11);
        calendar.get(12);
        int n4 = calendar.get(5);
        int n5 = calendar.get(2) + 1;
        int n6 = calendar.get(1);
        return String.valueOf(n4) + "/" + n5 + "/" + n6 + " " + n3 + "h";
    }

    public static String b(int n2) {
        int n3 = 0;
        if (n2 > 60) {
            n3 = n2 / 60;
            n2 %= 60;
        }
        int n4 = 0;
        if (n3 > 60) {
            n4 = n3 / 60;
            n3 %= 60;
        }
        int n5 = 0;
        if (n4 > 24) {
            n5 = n4 / 24;
            n4 %= 24;
        }
        String string = "";
        if (n5 > 0) {
            string = String.valueOf(string) + n5;
            string = String.valueOf(string) + "d";
            string = String.valueOf(string) + n4 + "h";
        } else if (n4 > 0) {
            string = String.valueOf(string) + n4;
            string = String.valueOf(string) + "h";
            string = String.valueOf(string) + n3 + "'";
        } else {
            string = n3 > 9 ? String.valueOf(string) + n3 : String.valueOf(string) + "0" + n3;
            string = String.valueOf(string) + ":";
            string = n2 > 9 ? String.valueOf(string) + n2 : String.valueOf(string) + "0" + n2;
        }
        return string;
    }

    public static String a(long l2) {
        String string = "";
        long l3 = l2 / 1000L + 1L;
        int n2 = 0;
        while ((long)n2 < l3) {
            if (l2 >= 1000L) {
                long l4 = l2 % 1000L;
                string = l4 == 0L ? ".000" + string : (l4 < 10L ? ".00" + l4 + string : (l4 < 100L ? ".0" + l4 + string : "." + l4 + string));
                l2 /= 1000L;
            } else {
                string = String.valueOf(l2) + string;
                break;
            }
            ++n2;
        }
        return string;
    }

    public static String c(int n2) {
        int n3 = 0;
        if (n2 > 60) {
            n3 = n2 / 60;
        }
        n2 = 0;
        if (n3 > 60) {
            n2 = n3 / 60;
            n3 %= 60;
        }
        int n4 = 0;
        if (n2 > 24) {
            n4 = n2 / 24;
            n2 %= 24;
        }
        String string = "";
        if (n4 > 0) {
            string = String.valueOf(string) + n4;
            string = String.valueOf(string) + "d";
            string = String.valueOf(string) + n2 + "h";
        } else if (n2 > 0) {
            string = String.valueOf(string) + n2;
            string = String.valueOf(string) + "h";
            string = String.valueOf(string) + n3 + "'";
        } else {
            if (n3 == 0) {
                n3 = 1;
            }
            string = String.valueOf(string) + n3;
            string = String.valueOf(string) + "ph";
        }
        return string;
    }
}

