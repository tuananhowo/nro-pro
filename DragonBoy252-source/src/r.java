/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;
import main.a;

public final class r {
    public static ep a = new ep("h ImgByName");

    public static void a(String string, Image image, byte by2) {
        a.put(string, new eo(image, by2));
    }

    public static eo a(String string, ep ep2) {
        eo eo2 = (eo)ep2.get(string);
        if (eo2 == null) {
            eo2 = new eo();
            eo eo3 = r.a(string);
            if (eo3 != null) {
                eo2.a = eo3.a;
                eo2.d = eo3.d;
            }
            ep2.put(string, eo2);
        }
        eo2.b = main.a.b / 1000L;
        if (eo2.a == null) {
            --eo2.c;
            if (eo2.c <= 0) {
                cj.a().g(string);
                eo2.c = 200;
            }
        }
        return eo2;
    }

    private static eo a(String object) {
        object = String.valueOf(eh.b) + "ImgByName_" + (String)object;
        eo eo2 = null;
        byte[] byArray = ea.b((String)object);
        object = byArray;
        if (byArray == null) {
            return null;
        }
        try {
            eo2 = new eo();
            new eo().d = (byte)object[0];
            eo2.a = Image.createImage((byte[])object, (int)1, (int)(((Object)object).length - 1));
        }
        catch (Exception exception) {
            return null;
        }
        return eo2;
    }

    public static void a(String string, byte by2, byte[] byArray) {
        string = String.valueOf(eh.b) + "ImgByName_" + string;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(by2);
            by2 = 0;
            while (by2 < byArray.length) {
                dataOutputStream.writeByte(byArray[by2]);
                by2 = (byte)(by2 + 1);
            }
            ea.a(string, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void a(ep ep2, int n2) {
        eq eq2 = new eq("checkDelHash");
        Enumeration enumeration = ep2.keys();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            eo eo2 = (eo)ep2.get(string);
            if (main.a.b / 1000L - eo2.b <= 600L) continue;
            eq2.addElement(string);
        }
        int n3 = 0;
        while (n3 < eq2.size()) {
            ep2.remove((String)eq2.elementAt(n3));
            ++n3;
        }
    }
}

