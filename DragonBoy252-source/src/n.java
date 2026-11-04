/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import main.GameMidlet;
import main.a;

public class n {
    private Random b;
    Vector a;
    private int[] c;

    public n(int n2, int n3, int n4, int n5) {
        this.b = new Random();
        this.a = new Vector();
        this.c = new int[]{0xFF0000, 0xFFFF00, 65280, 0xFFFFFF, 255, 65535, 0xF0F0F0, 0xC0C0C0};
        n4 = 0;
        while (n4 < 72) {
            this.a.addElement(new o(n2, n3, Math.abs(this.b.nextInt() % 8) + 3, n4 * 5, this.c[Math.abs(this.b.nextInt() % this.c.length)]));
            ++n4;
        }
    }

    public n() {
    }

    /*
     * WARNING - void declaration
     */
    public static void a(aa object) {
        try {
            switch (((aa)object).a) {
                case -128: {
                    Object aa2 = object;
                    try {
                        byte by2 = ((aa)aa2).c().readByte();
                        int n2 = ((aa)aa2).c().readInt();
                        co co2 = n2 == co.m().V ? co.m() : cw.b(n2);
                        if (by2 == 0) {
                            short s2 = ((aa)aa2).c().readShort();
                            byte by3 = ((aa)aa2).c().readByte();
                            byte by4 = ((aa)aa2).c().readByte();
                            short s3 = ((aa)aa2).c().readShort();
                            byte by5 = ((aa)aa2).c().readByte();
                            if (co2 != null) {
                                co2.a(new i((int)s2, co2, (int)by3, (int)by4, (int)s3, by5));
                            }
                            break;
                        }
                        if (by2 == 1) {
                            short s4 = ((aa)aa2).c().readShort();
                            if (co2 != null) {
                                co2.b(0, (int)s4);
                            }
                            break;
                        }
                        if (by2 == 2) {
                            if (co2 != null) {
                                co2.b(-1, 0);
                            }
                            break;
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                    return;
                }
                case 127: {
                    Object aa3 = object;
                    try {
                        byte by6 = ((aa)aa3).c().readByte();
                        if (by6 == 0) {
                            do.c();
                            eq eq2 = new eq("");
                            int n3 = ((aa)aa3).c().readShort();
                            int n4 = 0;
                            int n5 = 0;
                            while (n5 < n3) {
                                byte by7;
                                byte by8;
                                dd dd2 = new dd();
                                short s5 = ((aa)aa3).c().readShort();
                                int n6 = n5 + 1;
                                short s6 = ((aa)aa3).c().readShort();
                                byte by9 = ((aa)aa3).c().readByte();
                                byte by10 = ((aa)aa3).c().readByte();
                                byte by11 = ((aa)aa3).c().readByte();
                                short s7 = -1;
                                co co3 = null;
                                byte by12 = ((aa)aa3).c().readByte();
                                if (by12 == 0) {
                                    s7 = ((aa)aa3).c().readShort();
                                } else {
                                    short s8 = ((aa)aa3).c().readShort();
                                    short s9 = ((aa)aa3).c().readShort();
                                    by8 = ((aa)aa3).c().readShort();
                                    byte by13 = by7 = ((aa)aa3).c().readShort();
                                    byte by14 = by8;
                                    short s10 = s9;
                                    short s11 = s8;
                                    co co4 = new co();
                                    new co().cp = s11;
                                    co4.cr = s10;
                                    co4.cq = by14;
                                    co4.cs = by13;
                                    co3 = co4;
                                }
                                String string = ((aa)aa3).c().readUTF();
                                String string2 = ((aa)aa3).c().readUTF();
                                by8 = ((aa)aa3).c().readByte();
                                by7 = ((aa)aa3).c().readByte();
                                byte by15 = ((aa)aa3).c().readByte();
                                au[] auArray = null;
                                if (by15 != 0) {
                                    auArray = new au[by15];
                                    int n7 = 0;
                                    while (n7 < auArray.length) {
                                        ci.a();
                                        au au2 = ci.b((aa)aa3);
                                        byte by16 = ((aa)aa3).c().readByte();
                                        if (au2 != null) {
                                            auArray[n7] = au2;
                                            auArray[n7].b = by16;
                                        }
                                        ++n7;
                                    }
                                }
                                dd2.a(s5, n6, s6, by9, by12, s7, string, string2, co3, auArray);
                                dd2.a(by8);
                                dd2.b(by7);
                                dd2.a(by10, by11);
                                eq2.addElement(dd2);
                                if (by8 > 0) {
                                    ++n4;
                                }
                                ++n5;
                            }
                            do.c().a(eq2, n4, n3);
                            break;
                        }
                        if (by6 == 1) {
                            short s12 = ((aa)aa3).c().readShort();
                            byte by17 = ((aa)aa3).c().readByte();
                            if (dd.a(do.f, s12) != null) {
                                dd.a(do.f, s12).b(by17);
                            }
                            do.e();
                            break;
                        }
                        if (by6 == 2) {
                            short s13 = ((aa)aa3).c().readShort();
                            byte by18 = ((aa)aa3).c().readByte();
                            int n8 = 0;
                            int n9 = 0;
                            while (n9 < do.f.size()) {
                                dd dd3 = (dd)do.f.elementAt(n9);
                                if (dd3 != null) {
                                    if (dd3.e == s13) {
                                        dd3.a(by18);
                                    }
                                    if (dd3.j > 0) {
                                        ++n8;
                                    }
                                }
                                ++n9;
                            }
                            do.a(n8, do.f.size());
                            if (dd.a(do.g, s13) != null) {
                                dd.a(do.g, s13).a(by18);
                                break;
                            }
                        } else if (by6 == 3) {
                            short s14 = ((aa)aa3).c().readShort();
                            byte by19 = ((aa)aa3).c().readByte();
                            byte by20 = ((aa)aa3).c().readByte();
                            if (dd.a(do.f, s14) != null) {
                                dd.a(do.f, s14).a(by19, by20);
                            }
                            if (dd.a(do.g, s14) != null) {
                                dd.a(do.g, s14).a(by19, by20);
                                break;
                            }
                        } else if (by6 == 4) {
                            int n10 = ((aa)aa3).c().readInt();
                            short s15 = ((aa)aa3).c().readShort();
                            co co5 = n10 == co.m().V ? co.m() : cw.b(n10);
                            if (co5 != null) {
                                co5.dy = s15;
                                co5.dB = ((aa)aa3).c().readByte();
                                break;
                            }
                        }
                    }
                    catch (Exception exception) {
                        Exception exception3 = exception;
                        exception.printStackTrace();
                    }
                    return;
                }
                case 114: {
                    try {
                        ((aa)object).c().readUTF();
                        ej.e = ((aa)object).c().readByte();
                        ej.f = ((aa)object).c().readByte();
                        return;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                case 113: {
                    short nArray;
                    byte by21 = 0;
                    byte by22 = 0;
                    int n11 = 0;
                    boolean n12 = false;
                    int n2 = 0;
                    int n3 = -1;
                    try {
                        by21 = ((aa)object).c().readByte();
                        by22 = ((aa)object).c().readByte();
                        n11 = ((aa)object).c().readShort();
                        nArray = ((aa)object).c().readShort();
                        n2 = ((aa)object).c().readShort();
                        n3 = ((aa)object).c().readShort();
                    }
                    catch (Exception exception) {}
                    h.a(new i(n11, nArray, n2, (int)by22, (int)by21, n3));
                    return;
                }
                case 48: {
                    byte by23 = ((aa)object).c().readByte();
                    ds.a(by23, false);
                    main.a.e();
                    eb.a().f();
                    main.a.l();
                    ds.o = true;
                    return;
                }
                case 31: {
                    int n15 = ((aa)object).c().readInt();
                    short s16 = ((aa)object).c().readByte();
                    if (s16 == 1) {
                        void by29;
                        s16 = ((aa)object).c().readShort();
                        int n16 = -1;
                        Object n20 = null;
                        short s2 = 0;
                        int n4 = 0;
                        try {
                            byte by2 = ((aa)object).c().readByte();
                            n16 = by2;
                            if (by2 > 0) {
                                int n5 = ((aa)object).c().readByte();
                                int[] n22 = new int[n5];
                                int n6 = 0;
                                while (n6 < n5) {
                                    n22[n6] = ((aa)object).c().readByte();
                                    ++n6;
                                }
                                s2 = ((aa)object).c().readShort();
                                n4 = ((aa)object).c().readShort();
                            }
                        }
                        catch (Exception exception) {}
                        if (n15 == co.m().V) {
                            co.m().H = new dm();
                            co.m().H.a = s16;
                            if (n16 > 0) {
                                co.m().H.a(n16, (int[])by29, s2, n4);
                                return;
                            }
                        } else {
                            co co2 = cw.b(n15);
                            cw.b(n15).H = new dm();
                            co2.H.a = s16;
                            if (n16 > 0) {
                                co2.H.a(n16, (int[])by29, s2, n4);
                                return;
                            }
                        }
                        break;
                    }
                    if (n15 == co.m().V) {
                        co.m().H.b();
                        co.m().H = null;
                        return;
                    }
                    co co7 = cw.b(n15);
                    co7.H.b();
                    co7.H = null;
                    return;
                }
                case -89: {
                    main.a.ar = ((aa)object).c().readByte() == 1;
                    return;
                }
                case 42: {
                    main.a.l();
                    en.c = false;
                    co.cd = false;
                    byte by25 = ((aa)object).c().readByte();
                    if (main.a.J == null) {
                        main.a.J = new dp(by25);
                    }
                    main.a.J.a();
                    return;
                }
                case 52: {
                    co co3;
                    byte by26 = ((aa)object).c().readByte();
                    if (by26 == 1) {
                        int by34 = ((aa)object).c().readInt();
                        if (by34 == co.m().V) {
                            co.m().c(true);
                            co.m().N = ((aa)object).c().readShort();
                            co.m().O = ((aa)object).c().readShort();
                        } else {
                            co3 = cw.b(by34);
                            if (co3 != null) {
                                co3.c(true);
                                co3.N = ((aa)object).c().readShort();
                                co3.O = ((aa)object).c().readShort();
                            }
                        }
                    }
                    if (by26 == 0) {
                        int s25 = ((aa)object).c().readInt();
                        if (s25 == co.m().V) {
                            co.m().c(false);
                        } else {
                            co3 = cw.b(s25);
                            if (co3 != null) {
                                co3.c(false);
                            }
                        }
                    }
                    if (by26 == 2) {
                        int co9 = ((aa)object).c().readInt();
                        int n7 = ((aa)object).c().readInt();
                        df df2 = (df)cw.b(co9);
                        df2.c(n7);
                    }
                    if (by26 == 3) {
                        cw.cj = ((aa)object).c().readByte();
                        return;
                    }
                    break;
                }
                case 51: {
                    void s32;
                    int by37 = ((aa)object).c().readInt();
                    df df3 = (df)cw.b(by37);
                    byte by3 = ((aa)object).c().readByte();
                    short s3 = ((aa)object).c().readShort();
                    short s4 = ((aa)object).c().readShort();
                    byte by28 = ((aa)object).c().readByte();
                    co[] coArray = new co[by28];
                    long[] lArray = new long[by28];
                    boolean n41 = false;
                    while (s32 < by28) {
                        int n8 = ((aa)object).c().readInt();
                        dq.c("char ID=" + n8);
                        coArray[s32] = null;
                        coArray[s32] = n8 != co.m().V ? cw.b(n8) : co.m();
                        lArray[s32] = ((aa)object).c().readLong();
                        ++s32;
                    }
                    df3.a(by3, s3, s4, coArray, lArray);
                    return;
                }
                case -127: {
                    n.b((aa)object);
                    return;
                }
                case -126: {
                    byte n47 = ((aa)object).c().readByte();
                    dq.c("type quay= " + n47);
                    if (n47 == 1) {
                        ((aa)object).c().readByte();
                        String string = ((aa)object).c().readUTF();
                        String string3 = ((aa)object).c().readUTF();
                        cw.l().b(string, string3);
                    }
                    if (n47 == 0) {
                        cw.l().b(((aa)object).c().readUTF());
                        return;
                    }
                    break;
                }
                case -122: {
                    short s5 = ((aa)object).c().readShort();
                    bg bg2 = cw.a(s5);
                    int n24 = ((aa)object).c().readByte();
                    bg2.x = new int[n24];
                    int n25 = 0;
                    while (n25 < n24) {
                        bg2.x[n25] = ((aa)object).c().readShort();
                        ++n25;
                    }
                    bg2.a(((aa)object).c().readByte(), ((aa)object).c().readInt());
                    return;
                }
                case 102: {
                    int n9;
                    int n10;
                    long[] lArray;
                    co[] coArray;
                    int n28;
                    dh dh2;
                    byte by30 = ((aa)object).c().readByte();
                    if (by30 == 0 || by30 == 1 || by30 == 2 || by30 == 6) {
                        dh2 = dh.z();
                        if (dh2 == null) {
                            return;
                        }
                        if (by30 == 6) {
                            dh2.x = -1000;
                            dh2.w = -1000;
                            ((cn)dh2).b = -1000;
                            ((cn)dh2).a = -1000;
                            dh2.q = -1000;
                            dh2.p = -1000;
                            return;
                        }
                        n28 = ((aa)object).c().readByte();
                        coArray = new co[n28];
                        lArray = new long[n28];
                        n10 = 0;
                        while (n10 < n28) {
                            n9 = ((aa)object).c().readInt();
                            coArray[n10] = null;
                            coArray[n10] = n9 != co.m().V ? cw.b(n9) : co.m();
                            lArray[n10] = ((aa)object).c().readLong();
                            ++n10;
                        }
                        ((cn)dh2).a(coArray, lArray, by30);
                    }
                    if (by30 == 3 || by30 == 4 || by30 == 5 || by30 == 7) {
                        dh2 = dh.A();
                        if (dh2 == null) {
                            return;
                        }
                        if (by30 == 7) {
                            dh2.x = -1000;
                            dh2.w = -1000;
                            ((ck)dh2).b = -1000;
                            ((ck)dh2).a = -1000;
                            dh2.q = -1000;
                            dh2.p = -1000;
                            return;
                        }
                        if (by30 == 3 || by30 == 4) {
                            n28 = ((aa)object).c().readByte();
                            coArray = new co[n28];
                            lArray = new long[n28];
                            n10 = 0;
                            while (n10 < n28) {
                                n9 = ((aa)object).c().readInt();
                                coArray[n10] = null;
                                coArray[n10] = n9 != co.m().V ? cw.b(n9) : co.m();
                                lArray[n10] = ((aa)object).c().readLong();
                                ++n10;
                            }
                            ((ck)dh2).a(coArray, lArray, by30);
                        }
                        if (by30 == 5) {
                            n28 = ((aa)object).c().readShort();
                            ((ck)dh2).b((short)n28);
                        }
                    }
                    if (by30 > 9 && by30 < 30) {
                        n.a((aa)object, by30);
                        return;
                    }
                    break;
                }
                case 101: {
                    dq.c("big boss--------------------------------------------------");
                    cm cm2 = dh.y();
                    if (cm2 == null) {
                        return;
                    }
                    byte by31 = ((aa)object).c().readByte();
                    if (by31 == 0 || by31 == 1 || by31 == 2 || by31 == 4 || by31 == 3) {
                        if (by31 == 3) {
                            short s6 = ((aa)object).c().readShort();
                            cm2.w = s6;
                            cm2.a = s6;
                            short s7 = ((aa)object).c().readShort();
                            cm2.x = s7;
                            cm2.b = s7;
                            cm2.v();
                        } else {
                            int n11 = ((aa)object).c().readByte();
                            dq.c("CHUONG nChar= " + n11);
                            co[] coArray = new co[n11];
                            long[] lArray = new long[n11];
                            int n12 = 0;
                            while (n12 < n11) {
                                int n31 = ((aa)object).c().readInt();
                                dq.c("char ID=" + n31);
                                coArray[n12] = null;
                                coArray[n12] = n31 != co.m().V ? cw.b(n31) : co.m();
                                lArray[n12] = ((aa)object).c().readLong();
                                ++n12;
                            }
                            cm2.a(coArray, lArray, by31);
                        }
                    }
                    if (by31 == 5) {
                        cm2.c = true;
                        cm2.s = 2;
                    }
                    if (by31 == 6) {
                        cm2.u();
                        cm2.p = ((aa)object).c().readShort();
                        cm2.q = ((aa)object).c().readShort();
                    }
                    if (by31 == 7) {
                        cm2.a(null, null, by31);
                    }
                    if (by31 == 8) {
                        short s8 = ((aa)object).c().readShort();
                        cm2.w = s8;
                        cm2.a = s8;
                        short s9 = ((aa)object).c().readShort();
                        cm2.x = s9;
                        cm2.b = s9;
                        cm2.s = 2;
                    }
                    if (by31 == 9) {
                        cm2.x = -1000;
                        cm2.w = -1000;
                        cm2.b = -1000;
                        cm2.a = -1000;
                        cm2.q = -1000;
                        cm2.p = -1000;
                        return;
                    }
                    break;
                }
                case -120: {
                    long l2 = ej.j();
                    cj.c = l2 - cj.a;
                    cj.a().i();
                    return;
                }
                case -121: {
                    long l3 = ej.j();
                    cj.d = l3 - cj.b;
                    cj.a().j();
                    return;
                }
                case 100: {
                    byte by32 = ((aa)object).c().readByte();
                    int n32 = ((aa)object).c().readByte();
                    ar ar2 = null;
                    if (by32 == 0) {
                        ar2 = co.m().aV[n32];
                    }
                    if (by32 == 1) {
                        ar2 = co.m().aT[n32];
                    }
                    if ((n32 = ((aa)object).c().readShort()) != -1) {
                        ar2.b = ax.a((short)n32);
                        ar2.h = ((aa)object).c().readInt();
                        ((aa)object).c().readUTF();
                        ((aa)object).c().readUTF();
                        byte by4 = ((aa)object).c().readByte();
                        n32 = by4;
                        if (by4 != 0) {
                            ar2.a = new au[n32];
                            n32 = 0;
                            while (n32 < ar2.a.length) {
                                ci.a();
                                au au3 = ci.b((aa)object);
                                if (au3 != null) {
                                    ar2.a[n32] = au3;
                                }
                                ++n32;
                            }
                        }
                        if (ar2.h <= 0) {
                            return;
                        }
                    }
                    break;
                }
                case -123: {
                    int n33 = ((aa)object).c().readInt();
                    if (cw.b(n33) != null) {
                        cw.b((int)n33).dv = ((aa)object).c().readByte();
                        return;
                    }
                    break;
                }
                case -119: {
                    co.m().I = ((aa)object).c().readInt();
                    return;
                }
                case -117: {
                    cw.l().ch = 0;
                    cw.l().cf = ((aa)object).c().readByte();
                    if (cw.l().cf == 100) {
                        cw.l().cg = true;
                    }
                    if (cw.l().cf == 101) {
                        bg.w = true;
                        return;
                    }
                    break;
                }
                case -116: {
                    cw.bx = ((aa)object).c().readByte() == 1;
                    return;
                }
                case -115: {
                    co.m().a(((aa)object).c().readUTF(), ((aa)object).c().readShort(), ((aa)object).c().readShort(), ((aa)object).c().readShort());
                    return;
                }
                case -113: {
                    byte[] byArray = new byte[10];
                    int n34 = 0;
                    while (n34 < 10) {
                        byArray[n34] = ((aa)object).c().readByte();
                        ++n34;
                    }
                    cw.l().b(byArray);
                    cw.l().a(byArray);
                    cw.l().c(byArray);
                    return;
                }
                case -111: {
                    int n35 = ((aa)object).c().readShort();
                    cz.b = new eq("");
                    int n36 = 0;
                    while (n36 < n35) {
                        String string = ((aa)object).c().readUTF();
                        byte by45 = ((aa)object).c().readByte();
                        cz.b.addElement(new cz(string, by45));
                        ++n36;
                    }
                    cz.a();
                    cz.b();
                    return;
                }
                case 125: {
                    byte by35 = ((aa)object).c().readByte();
                    int n37 = ((aa)object).c().readInt();
                    if (n37 == co.m().V) {
                        co.m().b(by35);
                        return;
                    }
                    if (cw.b(n37) != null) {
                        cw.b(n37).b(by35);
                        return;
                    }
                    break;
                }
                case 124: {
                    short s10 = ((aa)object).c().readShort();
                    object = ((aa)object).c().readUTF();
                    dq.c("noi chuyen = " + (String)object + "npc ID= " + s10);
                    bg bg3 = cw.a(s10);
                    if (bg3 != null) {
                        bg3.a((String)object);
                        return;
                    }
                    break;
                }
                case 123: {
                    void var4_139;
                    int n38 = ((aa)object).c().readInt();
                    short s26 = ((aa)object).c().readShort();
                    short s27 = ((aa)object).c().readShort();
                    byte by36 = ((aa)object).c().readByte();
                    dq.c("SET POSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss x= " + s26 + " y= " + s27 + "chaPos= " + n38 + "type Pos= " + by36);
                    Object var4_136 = null;
                    if (n38 == co.m().V) {
                        co co4 = co.m();
                    } else if (cw.b(n38) != null) {
                        co co5 = cw.b(n38);
                    }
                    if (var4_139 != null) {
                        u.a(by36 == 0 ? 60 : 173, (co)var4_139, 1);
                        var4_139.a(s26, s27, by36);
                        return;
                    }
                    break;
                }
                case 122: {
                    short s28 = ((aa)object).c().readShort();
                    dq.c("second login = " + s28);
                    en.k = s28;
                    en.m = en.l = System.currentTimeMillis();
                    main.a.l();
                    return;
                }
                case 121: {
                    ej.h = ((aa)object).c().readUTF();
                    ej.g = ((aa)object).c().readUTF();
                    dq.c("SHOW AD public ID= " + ej.h);
                    ej.h();
                    return;
                }
                case -124: {
                    int n13;
                    int n40;
                    byte by38 = ((aa)object).c().readByte();
                    byte by39 = ((aa)object).c().readByte();
                    if (by39 == 0) {
                        if (by38 == 2) {
                            n40 = ((aa)object).c().readInt();
                            if (n40 == co.m().V) {
                                co.m().V();
                            } else if (cw.b(n40) != null) {
                                cw.b(n40).V();
                            }
                        }
                        n40 = ((aa)object).c().readUnsignedByte();
                        int n14 = ((aa)object).c().readInt();
                        dq.c("playerID= " + n14 + " skillID= " + n40);
                        if (n40 == 32) {
                            if (by38 == 1) {
                                n13 = ((aa)object).c().readInt();
                                if (n14 == co.m().V) {
                                    co.m().dl = n40;
                                    cw.b(n13).b(co.m());
                                } else if (cw.b(n14) != null && n13 != co.m().V) {
                                    cw.b((int)n14).dl = n40;
                                    cw.b(n13).b(cw.b(n14));
                                } else if (cw.b(n14) != null && n13 == co.m().V) {
                                    cw.b((int)n14).dl = n40;
                                    co.m().b(cw.b(n14));
                                }
                            } else if (n14 == co.m().V) {
                                co.m().S();
                            } else if (cw.b(n14) != null) {
                                cw.b(n14).S();
                            }
                        }
                        if (n40 == 33) {
                            if (by38 == 1) {
                                if (n14 == co.m().V) {
                                    co.m().dn = true;
                                } else if (cw.b(n14) != null) {
                                    cw.b((int)n14).dn = true;
                                }
                            } else if (n14 == co.m().V) {
                                co.m().T();
                            } else if (cw.b(n14) != null) {
                                cw.b(n14).T();
                            }
                        }
                        if (n40 == 39) {
                            if (by38 == 1) {
                                if (n14 == co.m().V) {
                                    co.m().dq = true;
                                } else if (cw.b(n14) != null) {
                                    cw.b((int)n14).dq = true;
                                }
                            } else if (n14 == co.m().V) {
                                co.m().W();
                            } else if (cw.b(n14) != null) {
                                cw.b(n14).W();
                            }
                        }
                        if (n40 == 40) {
                            if (by38 == 1) {
                                if (n14 == co.m().V) {
                                    co.m().dr = true;
                                } else if (cw.b(n14) != null) {
                                    cw.b((int)n14).dr = true;
                                }
                            } else if (n14 == co.m().V) {
                                co.m().U();
                            } else if (cw.b(n14) != null) {
                                cw.b(n14).U();
                            }
                        }
                        if (n40 == 41) {
                            if (by38 == 1) {
                                if (n14 == co.m().V) {
                                    co.m().dt = true;
                                } else if (cw.b(n14) != null) {
                                    cw.b((int)n14).dt = true;
                                }
                            } else if (n14 == co.m().V) {
                                co.m().Y();
                            } else if (cw.b(n14) != null) {
                                cw.b(n14).Y();
                            }
                        }
                        if (n40 == 42) {
                            if (by38 == 1) {
                                if (n14 == co.m().V) {
                                    co.m().du = true;
                                }
                            } else if (n14 == co.m().V) {
                                co.m().du = false;
                                dq.c("tra ve huy chieu 2");
                            }
                        }
                    }
                    if (by39 == 1) {
                        n40 = ((aa)object).c().readUnsignedByte();
                        byte by5 = ((aa)object).c().readByte();
                        dq.c("modbHoldID= " + by5 + " skillID= " + n40 + "eff ID= " + by38);
                        if (n40 == 32) {
                            if (by38 == 1) {
                                n13 = ((aa)object).c().readInt();
                                if (n13 == co.m().V) {
                                    cw.a((byte)by5).l = n40;
                                    co.m().a(cw.a(by5));
                                } else if (cw.b(n13) != null) {
                                    cw.a((byte)by5).l = n40;
                                    cw.b(n13).a(cw.a(by5));
                                }
                            } else {
                                cw.a(by5).r();
                            }
                        }
                        if (n40 == 40) {
                            if (by38 == 1) {
                                cw.a((byte)by5).ag = true;
                            } else {
                                cw.a(by5).s();
                            }
                        }
                        if (n40 == 41) {
                            if (by38 == 1) {
                                cw.a((byte)by5).ah = true;
                                return;
                            }
                            cw.a(by5).t();
                            return;
                        }
                    }
                    break;
                }
                case -125: {
                    el.b().b = false;
                    String string = ((aa)object).c().readUTF();
                    dq.c("titile= " + string);
                    int n15 = ((aa)object).c().readByte();
                    cq.c().a(n15, string);
                    int n16 = 0;
                    while (n16 < n15) {
                        cq.c().a[n16].i = ((aa)object).c().readUTF();
                        byte by40 = ((aa)object).c().readByte();
                        if (by40 == 0) {
                            cq.c().a[n16].c(1);
                        }
                        if (by40 == 1) {
                            cq.c().a[n16].c(0);
                        }
                        if (by40 == 2) {
                            cq.c().a[n16].c(2);
                        }
                        ++n16;
                    }
                    return;
                }
                case -110: {
                    int n43;
                    byte by6 = ((aa)object).c().readByte();
                    if (by6 == 1) {
                        n43 = ((aa)object).c().readInt();
                        byte[] byArray = ea.b(String.valueOf(n43));
                        if (byArray == null) {
                            cj.a().a((byte)1, -1, (byte[])null);
                        } else {
                            cj.a().a((byte)1, n43, byArray);
                        }
                    }
                    if (by6 == 0) {
                        n43 = ((aa)object).c().readInt();
                        short s29 = ((aa)object).c().readShort();
                        byte[] byArray = new byte[s29];
                        ((aa)object).c().read(byArray, 0, s29);
                        ea.a(String.valueOf(n43), byArray);
                        return;
                    }
                    break;
                }
                case 93: {
                    String string = ((aa)object).c().readUTF();
                    string = dq.a(string);
                    cw.l().a(string);
                    return;
                }
                case -106: {
                    short s30 = ((aa)object).c().readShort();
                    short s31 = ((aa)object).c().readShort();
                    if (ay.a(s30)) {
                        ay.c(s30).a(s31, false);
                        return;
                    }
                    ay ay2 = new ay(s30, s31);
                    co.bI.addElement(ay2);
                    return;
                }
                case -105: {
                    dy.c().b = 0;
                    dy.c().c = ((aa)object).c().readShort();
                    dy.c().d = dy.c().e = System.currentTimeMillis();
                    dy.c().a = ((aa)object).c().readByte();
                    dy.c().a();
                    return;
                }
                case -103: {
                    int n44 = ((aa)object).c().readByte();
                    dq.c("server gui ve actionFlag = " + n44);
                    if (n44 == 0) {
                        main.a.G.Y.removeAllElements();
                        n44 = ((aa)object).c().readByte();
                        int n45 = 0;
                        while (n45 < n44) {
                            ar ar3 = new ar();
                            short s11 = ((aa)object).c().readShort();
                            if (s11 != -1) {
                                ar3.b = ax.a(s11);
                                byte by7 = ((aa)object).c().readByte();
                                if (by7 != -1) {
                                    ar3.a = new au[by7];
                                    int n17 = 0;
                                    while (n17 < ar3.a.length) {
                                        ci.a();
                                        au au2 = ci.b((aa)object);
                                        if (au2 != null) {
                                            ar3.a[n17] = au2;
                                        }
                                        ++n17;
                                    }
                                }
                            }
                            main.a.G.Y.addElement(ar3);
                            ++n45;
                        }
                        main.a.G.h();
                        main.a.G.s();
                        return;
                    }
                    if (n44 == 1) {
                        n44 = ((aa)object).c().readInt();
                        byte by43 = ((aa)object).c().readByte();
                        dq.c("---------------actionFlag1:  " + n44 + " : " + by43);
                        if (n44 == co.m().V) {
                            co.m().bP = by43;
                        } else if (cw.b(n44) != null) {
                            cw.b((int)n44).bP = by43;
                        }
                        cw.l();
                        cw.a(n44, by43);
                        return;
                    }
                    if (n44 == 2) {
                        void var4_147;
                        Object object2;
                        void var4_145;
                        n44 = ((aa)object).c().readByte();
                        short s33 = ((aa)object).c().readShort();
                        bi bi2 = new bi();
                        new bi().a = (byte)n44;
                        bi2.b = s33;
                        cw.I.addElement(bi2);
                        boolean bl2 = false;
                        while (var4_145 < cw.I.size()) {
                            object2 = (bi)cw.I.elementAt((int)var4_145);
                            dq.c("i: " + (int)var4_145 + "  cflag: " + ((bi)object2).a + "   IDimageFlag: " + ((bi)object2).b);
                            ++var4_145;
                        }
                        boolean bl3 = false;
                        while (var4_147 < cw.E.size()) {
                            object2 = (co)cw.E.elementAt((int)var4_147);
                            if (object2 != null && ((co)object2).bP == n44) {
                                ((co)object2).bQ = s33;
                            }
                            ++var4_147;
                        }
                        if (co.m().bP == n44) {
                            co.m().bQ = s33;
                            return;
                        }
                    }
                    break;
                }
                case -102: {
                    byte by44 = ((aa)object).c().readByte();
                    en.o = false;
                    if (by44 != 0 && by44 == 1) {
                        main.a.I.n = false;
                        cj.a().a(ea.c(ea.e), ea.c(ea.f), "2.5.2", (byte)0);
                        en.o = true;
                        return;
                    }
                    break;
                }
                case -101: {
                    if (main.a.I == null) {
                        main.a.I = new en();
                    }
                    main.a.I.n = true;
                    en.o = true;
                    main.a.b();
                    String string = ((aa)object).c().readUTF();
                    ea.a(String.valueOf(ea.d) + ds.p, string);
                    cj.a().a(string, "", "2.5.2", (byte)1);
                    return;
                }
                case -100: {
                    byte by8;
                    da.c();
                    boolean bl2 = false;
                    if (main.a.A > 2 * dl.ab) {
                        bl2 = true;
                    }
                    if ((by8 = ((aa)object).c().readByte()) < 0) break;
                    dq.c("t Indxe= " + by8);
                    main.a.G.K[by8] = ((aa)object).c().readByte();
                    main.a.G.L[by8] = ((aa)object).c().readByte();
                    dq.c("max page= " + main.a.G.K[by8] + " curr page= " + main.a.G.L[by8]);
                    int n18 = ((aa)object).c().readUnsignedByte();
                    co.m().aX[by8] = new ar[n18];
                    dl.ar = ch.ev;
                    int n19 = 0;
                    while (n19 < n18) {
                        short s12 = ((aa)object).c().readShort();
                        if (s12 != -1) {
                            int n20;
                            co.m().aX[by8][n19] = new ar();
                            co.m().aX[by8][n19].b = ax.a(s12);
                            co.m().aX[by8][n19].d = ((aa)object).c().readShort();
                            co.m().aX[by8][n19].n = ((aa)object).c().readInt();
                            co.m().aX[by8][n19].p = ((aa)object).c().readInt();
                            co.m().aX[by8][n19].v = ((aa)object).c().readByte();
                            co.m().aX[by8][n19].h = ((aa)object).c().readInt();
                            co.m().aX[by8][n19].B = ((aa)object).c().readByte();
                            byte by9 = ((aa)object).c().readByte();
                            if (by9 != -1) {
                                co.m().aX[by8][n19].a = new au[by9];
                                n20 = 0;
                                while (n20 < co.m().aX[by8][n19].a.length) {
                                    ci.a();
                                    au au3 = ci.b((aa)object);
                                    if (au3 != null) {
                                        co.m().aX[by8][n19].a[n20] = au3;
                                        co.m().aX[by8][n19].A = main.a.G.a(co.m().aX[by8][n19]);
                                    }
                                    ++n20;
                                }
                            }
                            if ((n20 = ((aa)object).c().readByte()) == 1) {
                                short s13 = ((aa)object).c().readShort();
                                short s14 = ((aa)object).c().readShort();
                                short s15 = ((aa)object).c().readShort();
                                short s16 = ((aa)object).c().readShort();
                                co.m().aX[by8][n19].a(s13, s14, s15, s16);
                            }
                            if (GameMidlet.f >= 237) {
                                co.m().aX[by8][n19].H = ((aa)object).c().readUTF();
                                dq.b("nguoi ki gui  " + co.m().aX[by8][n19].H);
                            }
                        }
                        ++n19;
                    }
                    if (bl2) {
                        main.a.H.e();
                    }
                    main.a.G.y();
                    main.a.G.f = 0;
                    main.a.G.g = 0;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private static void b(aa aa2) {
        try {
            byte by2 = aa2.c().readByte();
            if (by2 == 0) {
                by2 = aa2.c().readByte();
                short[] sArray = new short[by2];
                byte by3 = 0;
                while (by3 < by2) {
                    sArray[by3] = aa2.c().readShort();
                    ++by3;
                }
                by3 = aa2.c().readByte();
                by2 = aa2.c().readInt();
                short s2 = aa2.c().readShort();
                cr.c().a(sArray, by3, by2, s2);
                return;
            }
            if (by2 == 1) {
                by2 = aa2.c().readByte();
                short[] sArray = new short[by2];
                byte by4 = 0;
                while (by4 < by2) {
                    sArray[by4] = aa2.c().readShort();
                    ++by4;
                }
                cr.c().a(sArray);
                return;
            }
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
    }

    private static void a(aa aa2, int n2) {
        try {
            int n3;
            byte by2 = aa2.c().readByte();
            dk dk2 = dh.a(by2);
            if (dk2 == null) {
                return;
            }
            if (n2 == 10) {
                n3 = aa2.c().readShort();
                short s2 = aa2.c().readShort();
                dk2.a((short)n3, s2);
            }
            if (n2 >= 11 && n2 <= 20) {
                byte by3 = aa2.c().readByte();
                n3 = by3;
                co[] coArray = new co[by3];
                long[] lArray = new long[n3];
                int n4 = 0;
                while (n4 < n3) {
                    int n5 = aa2.c().readInt();
                    coArray[n4] = null;
                    coArray[n4] = n5 != co.m().V ? cw.b(n5) : co.m();
                    lArray[n4] = aa2.c().readLong();
                    ++n4;
                }
                n4 = aa2.c().readByte();
                dk2.a(coArray, lArray, (byte)(n2 - 10), (byte)n4);
            }
            if (n2 == 21) {
                dk2.a = aa2.c().readShort();
                dk2.b = aa2.c().readShort();
                dk2.u();
            }
            if (n2 == 23) {
                dk2.v();
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }
}

