/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;
import main.a;

public final class ci
implements y {
    private static ci f;
    private aa g;
    public static boolean a;
    private float h;
    public static boolean b;
    public static boolean c;
    public static ep d;
    public static boolean e;

    static {
        a = false;
        c = false;
        d = new ep("frame new boss");
    }

    public static ci a() {
        if (f == null) {
            f = new ci();
        }
        return f;
    }

    public final void c(boolean bl2) {
        if (bl2) {
            System.out.println("connect 1 ok");
            if (cj.a().a(false)) {
                cj.a().b();
                return;
            }
        } else if (cj.a().a(true)) {
            cj.a().c();
        }
    }

    public final void a(boolean bl2) {
        cj.a().b(bl2);
        if (!bl2) {
            if (ds.q <= 0 && main.a.E == main.a.ao && ds.z && !cj.e) {
                ds.A = 0;
                main.a.ao.h();
            }
            ej.a(bl2);
            return;
        }
        eb.a();
        eb.g();
        ej.a(bl2);
    }

    public final void b(boolean bl2) {
        cj.a().b(bl2);
        if (!bl2) {
            if (main.a.E == main.a.ao && !cj.e) {
                main.a.ao.h();
            }
            if (main.a.E == main.a.I && !cj.e) {
                ej.b(bl2);
                return;
            }
        } else {
            eb.a();
            eb.g();
            ej.b(bl2);
        }
    }

    private void c(aa aa2) {
        try {
            int n2 = aa2.c().readUnsignedByte();
            ar ar2 = cw.S.aV[n2];
            cw.S.aV[n2].r = aa2.c().readInt();
            ar2.l = aa2.c().readByte();
            ar2.c = new eq("item.options");
            try {
                while (true) {
                    au au2;
                    if ((au2 = ci.b(aa2)) == null) {
                        continue;
                    }
                    ar2.c.addElement(au2);
                }
            }
            catch (Exception exception) {
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(aa var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [55[CASE]], but top level block is 2[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void d(aa aa2) {
        int n2 = aa2.c().readByte();
        cp.a = new dn[n2];
        dq.c("[LEN] sl nguoi choi " + n2);
        int n3 = 0;
        while (n3 < n2) {
            int n4 = aa2.c().readInt();
            String string = aa2.c().readUTF();
            short s2 = aa2.c().readShort();
            short s3 = aa2.c().readShort();
            short s4 = aa2.c().readShort();
            long l2 = aa2.c().readLong();
            cp.a[n3] = new dn(n4, string, s2, s3, s4, l2);
            ++n3;
        }
        ((cp)null).a();
        ((cp)null).a((byte)n2);
    }

    private static void a(DataInputStream dataInputStream) {
        cw.ap = dataInputStream.readByte();
        cw.l().M = new bv[dataInputStream.readByte()];
        int n2 = 0;
        while (n2 < cw.l().M.length) {
            cw.l().M[n2] = new bv();
            bv[] cfr_ignored_0 = cw.l().M;
            bv[] cfr_ignored_1 = cw.l().M;
            dataInputStream.readUTF();
            ++n2;
        }
        cw.J = new bf[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < cw.J.length) {
            cw.J[n2] = new bf();
            cw.J[n2].a = n2;
            dataInputStream.readUTF();
            cw.J[n2].b = new bx[dataInputStream.readByte()];
            int n3 = 0;
            while (n3 < cw.J[n2].b.length) {
                cw.J[n2].b[n3] = new bx();
                cw.J[n2].b[n3].a = dataInputStream.readByte();
                cw.J[n2].b[n3].b = dataInputStream.readUTF();
                cw.J[n2].b[n3].c = dataInputStream.readByte();
                cw.J[n2].b[n3].d = dataInputStream.readByte();
                cw.J[n2].b[n3].e = dataInputStream.readByte();
                cw.J[n2].b[n3].f = dataInputStream.readShort();
                cw.J[n2].b[n3].i = dataInputStream.readUTF();
                int n4 = 130;
                if (main.a.A == 128 || main.a.B <= 208) {
                    n4 = 100;
                }
                cw.J[n2].b[n3].g = ev.m.a(dataInputStream.readUTF(), n4);
                cw.J[n2].b[n3].h = new bt[dataInputStream.readByte()];
                n4 = 0;
                while (n4 < cw.J[n2].b[n3].h.length) {
                    cw.J[n2].b[n3].h[n4] = new bt();
                    cw.J[n2].b[n3].h[n4].b = dataInputStream.readShort();
                    cw.J[n2].b[n3].h[n4].a = cw.J[n2].b[n3];
                    cw.J[n2].b[n3].h[n4].c = dataInputStream.readByte();
                    cw.J[n2].b[n3].h[n4].d = dataInputStream.readLong();
                    cw.J[n2].b[n3].h[n4].i = dataInputStream.readShort();
                    cw.J[n2].b[n3].h[n4].e = dataInputStream.readInt();
                    cw.J[n2].b[n3].h[n4].g = dataInputStream.readShort();
                    cw.J[n2].b[n3].h[n4].h = dataInputStream.readShort();
                    bt[] cfr_ignored_2 = cw.J[n2].b[n3].h;
                    dataInputStream.readByte();
                    cw.J[n2].b[n3].h[n4].k = dataInputStream.readShort();
                    bt[] cfr_ignored_3 = cw.J[n2].b[n3].h;
                    dataInputStream.readShort();
                    cw.J[n2].b[n3].h[n4].l = dataInputStream.readUTF();
                    by.a(cw.J[n2].b[n3].h[n4]);
                    ++n4;
                }
                ++n3;
            }
            ++n2;
        }
    }

    private static void b(DataInputStream dataInputStream) {
        System.out.println(">>>createMap: " + dataInputStream.available());
        cw.ao = dataInputStream.readByte();
        dx.x = new String[dataInputStream.readShort()];
        int n2 = 0;
        while (n2 < dx.x.length) {
            dx.x[n2] = dataInputStream.readUTF();
            ++n2;
        }
        bg.u = new bh[dataInputStream.readByte()];
        n2 = 0;
        while (n2 < bg.u.length) {
            bg.u[n2] = new bh();
            bg.u[n2].a = n2;
            bg.u[n2].b = dataInputStream.readUTF();
            bg.u[n2].c = dataInputStream.readShort();
            bg.u[n2].d = dataInputStream.readShort();
            bg.u[n2].e = dataInputStream.readShort();
            bg.u[n2].f = new String[dataInputStream.readByte()][];
            int n3 = 0;
            while (n3 < bg.u[n2].f.length) {
                bg.u[n2].f[n3] = new String[dataInputStream.readByte()];
                int n4 = 0;
                while (n4 < bg.u[n2].f[n3].length) {
                    bg.u[n2].f[n3][n4] = dataInputStream.readUTF();
                    ++n4;
                }
                ++n3;
            }
            n2 = (byte)(n2 + 1);
        }
        dh.d = new bd[dataInputStream.readShort()];
        n2 = 0;
        while (n2 < dh.d.length) {
            dh.d[n2] = new bd();
            dh.d[n2].c = dataInputStream.readByte();
            dh.d[n2].e = dataInputStream.readUTF();
            dh.d[n2].d = dataInputStream.readLong();
            dh.d[n2].a = dataInputStream.readByte();
            dh.d[n2].b = dataInputStream.readByte();
            dh.d[n2].g = dataInputStream.readByte();
            ++n2;
        }
    }

    private static void a(DataInputStream dataInputStream, boolean bl2) {
        cw.an = dataInputStream.readByte();
        dq.c("vcData= " + cw.an + " vData=" + cw.ar);
        ea.a("NR_dart", o.a(dataInputStream));
        ea.a("NR_arrow", o.a(dataInputStream));
        ea.a("NR_effect", o.a(dataInputStream));
        ea.a("NR_image", o.a(dataInputStream));
        ea.a("NR_part", o.a(dataInputStream));
        ea.a("NR_skill", o.a(dataInputStream));
        ea.a("NRdata");
    }

    private static Image a(byte[] byArray) {
        try {
            return Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void a(aa aa2, int n2) {
        try {
            c c2 = new c();
            byte by2 = aa2.c().readByte();
            c2.b = by2;
            c2.a = aa2.c().readInt();
            c2.c = aa2.c().readInt();
            c2.d = aa2.c().readUTF();
            c2.h = aa2.c().readByte();
            c2.e = aa2.c().readInt() + 1000000000;
            dq.c("type= " + c2.b + " id= " + c2.a + " playID= " + c2.c + " time= " + c2.e);
            boolean bl2 = false;
            cw.bi = false;
            if (by2 == 0) {
                String string = aa2.c().readUTF();
                dq.c("str chat " + string);
                cw.bi = true;
                if (ev.k.a(string) > dl.ab - 60) {
                    c2.f = ev.k.a(string, dl.ab - 10);
                } else {
                    c2.f = new String[1];
                    c2.f[0] = string;
                }
                c2.g = aa2.c().readByte();
            } else if (by2 == 1) {
                c2.i = aa2.c().readByte();
                c2.j = aa2.c().readByte();
                bl2 = aa2.c().readByte() == 1;
                if (bl2) {
                    cw.bi = true;
                }
                if (c2.c != co.m().V) {
                    c2.k = c2.i < c2.j ? new String[]{ch.cJ} : null;
                }
                if (main.a.G.ai != null) {
                    main.a.G.a(c2.i, c2.j);
                }
            } else if (by2 == 2 && co.m().ax == 0) {
                cw.bi = true;
                c2.k = new String[]{ch.bx, ch.cK};
            }
            if (main.a.E != cw.c) {
                cw.bi = false;
            } else if (main.a.G.a && main.a.G.A == 0 && main.a.G.B == 3) {
                cw.bi = false;
            }
            c.a(c2, n2, bl2);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static void a(byte n2) {
        dq.c("is loading map = " + co.cd);
        cw.l().bj = 0;
        cw.by = false;
        ct.a = null;
        cw.aO.f = false;
        cw.aP.f = false;
        cw.A = 0;
        main.a.G.a = false;
        es.a();
        es.C();
        if (!cw.b && !ct.b) {
            cw.l().e();
        }
        cw.a(n2 == 1 ? co.m().N : -1, n2 == 0 ? -1 : 0);
        dx.h();
        dx.c(dx.e);
        dq.c("LOAD GAMESCR 2");
        co.m().P = 0;
        co.m().T = 4;
        co.m().ck = null;
        co.m().be = null;
        co.m().bi = null;
        co.m().bh = null;
        co.m().bj = null;
        co.m().cG = null;
        co.m().c(false);
        co.m().cH = null;
        main.a.p();
        if (co.m().O >= dx.d - 100) {
            co.m().bH = true;
            co.m().N += dq.g(dq.b(0, 80));
            cj.a().l();
        }
        cw.l().n();
        main.a.a(dx.o);
        co.cc = false;
        int n3 = 0;
        while (n3 < co.m().aP.size()) {
            ag ag2 = (ag)co.m().aP.elementAt(n3);
            al cfr_ignored_0 = ag2.b;
            ++n3;
        }
        main.a.k();
        main.a.j();
        cw.l().bP = co.m().ag;
        cw.l().bM = co.m().af;
        co.cb = false;
        cw.l().a();
        if (co.m().O <= 10 && n2 != 0 && n2 != 2) {
            cd cd2 = new cd(co.m().N, co.m().O, co.m().cp, co.m().U, 1, true, n2 == 1 ? co.m().W : n2);
            cd.a(cd2);
            co.m().E = true;
        }
        if (n2 == 2) {
            co.m().t();
        }
        if (cw.l().bn) {
            if (dx.l == cw.l().bt && dx.n == cw.l().bu) {
                cw.l().c(cw.l().br, cw.l().bs);
            }
            if (eh.b > 1) {
                cw.l().r();
            }
        }
        da.c();
        da.a(dx.k, String.valueOf(ch.co) + " " + dx.n, 30);
        main.a.l();
        main.a.d = false;
        an.b();
        an.a();
        main.a.c();
        main.a.X = 2;
        main.a.Y = ej.j() + 1000L;
    }

    private void e(aa aa2) {
        try {
            Object object;
            if (eh.b == 1) {
                er.d();
            }
            short s2 = aa2.c().readShort();
            co.m().bX = s2;
            co.m().bU = s2;
            co.m().N = s2;
            short s3 = aa2.c().readShort();
            co.m().bY = s3;
            co.m().bV = s3;
            co.m().O = s3;
            co.m().cN = co.m().N;
            co.m().cO = co.m().O;
            dq.c("head= " + co.m().cp + " body= " + co.m().cr + " left= " + co.m().cq + " x= " + co.m().N + " y= " + co.m().O + " chung toc= " + co.m().W);
            if (co.m().N >= 0 && co.m().N <= 100) {
                co.m().U = 1;
            } else if (co.m().N >= dx.a - 100 && co.m().N <= dx.a) {
                co.m().U = -1;
            }
            main.a.c();
            int n2 = aa2.c().readByte();
            dq.c("vGo size= " + n2);
            if (!cw.aO.e) {
                cw.aO.d = co.m().N - cw.j;
                cw.aO.c = co.m().O - cw.k;
            }
            int n3 = 0;
            while (n3 < n2) {
                object = new cg(aa2.c().readShort(), aa2.c().readShort(), aa2.c().readShort(), aa2.c().readShort(), aa2.c().readBoolean(), aa2.c().readBoolean(), aa2.c().readUTF());
                if ((dx.l == 21 || dx.l == 22 || dx.l == 23) && ((cg)object).a >= 0) {
                    short cfr_ignored_0 = ((cg)object).a;
                }
                ++n3;
            }
            main.a.c();
            n2 = aa2.c().readByte();
            dh.Q.removeAllElements();
            n3 = 0;
            while (n3 < n2) {
                object = new dh(n3, aa2.c().readBoolean(), aa2.c().readBoolean(), aa2.c().readBoolean(), aa2.c().readBoolean(), aa2.c().readBoolean(), aa2.c().readShort(), aa2.c().readByte(), aa2.c().readLong(), aa2.c().readByte(), aa2.c().readLong(), aa2.c().readShort(), aa2.c().readShort(), aa2.c().readByte(), aa2.c().readByte());
                new dh(n3, aa2.c().readBoolean(), aa2.c().readBoolean(), aa2.c().readBoolean(), aa2.c().readBoolean(), aa2.c().readBoolean(), aa2.c().readShort(), aa2.c().readByte(), aa2.c().readLong(), aa2.c().readByte(), aa2.c().readLong(), aa2.c().readShort(), aa2.c().readShort(), aa2.c().readByte(), aa2.c().readByte()).U = ((dh)object).p;
                ((dh)object).V = ((dh)object).q;
                ((dh)object).N = aa2.c().readBoolean();
                if (dh.d[((dh)object).H].c != 0) {
                    ((dh)object).r = n3 % 3 == 0 ? -1 : 1;
                    ((dh)object).p += 10 - n3 % 20;
                }
                ((dh)object).O = false;
                cm cm2 = null;
                ck ck2 = null;
                cn cn2 = null;
                dk dk2 = null;
                if (((dh)object).H == 70) {
                    cm2 = new cm(n3, (short)((dh)object).p, (short)((dh)object).q, 70, ((dh)object).m, ((dh)object).n, ((dh)object).L);
                }
                if (((dh)object).H == 71) {
                    int cfr_ignored_1 = ((dh)object).L;
                    ck2 = new ck(n3, (short)((dh)object).p, (short)((dh)object).q, 71, ((dh)object).m, ((dh)object).n);
                }
                if (((dh)object).H == 72) {
                    cn2 = new cn(n3, (short)((dh)object).p, (short)((dh)object).q, 72, ((dh)object).m, ((dh)object).n);
                }
                if (((dh)object).N) {
                    int cfr_ignored_2 = ((dh)object).L;
                    dk2 = new dk(n3, (short)((dh)object).p, (short)((dh)object).q, ((dh)object).H, ((dh)object).m, ((dh)object).n);
                }
                if (dk2 != null) {
                    cw.G.addElement(dk2);
                } else if (cm2 != null) {
                    cw.G.addElement(cm2);
                } else if (ck2 != null) {
                    cw.G.addElement(ck2);
                } else if (cn2 != null) {
                    cw.G.addElement(cn2);
                } else {
                    cw.G.addElement(object);
                }
                n3 = (byte)(n3 + 1);
            }
            if (co.m().bf != null && cw.c(co.m().bf.B) == null) {
                co.m().bf.x();
                co.m().bf.p = co.m().N;
                co.m().bf.q = co.m().O - 40;
                cw.G.addElement(co.m().bf);
            }
            aa2.c().readByte();
            main.a.c();
            n2 = aa2.c().readByte();
            dq.c("NPC size= " + n2);
            n3 = 0;
            while (n3 < n2) {
                block73: {
                    short s4;
                    byte by2;
                    short s5;
                    short s6;
                    byte by3;
                    block74: {
                        by3 = aa2.c().readByte();
                        s6 = aa2.c().readShort();
                        s5 = aa2.c().readShort();
                        by2 = aa2.c().readByte();
                        dq.c("tempalte = " + by2);
                        s4 = aa2.c().readShort();
                        dq.c("1");
                        if (by2 == 6) break block73;
                        dq.c("2");
                        if (co.m().aR.c >= 7 && (co.m().aR.c != 7 || co.m().aR.a > 1)) break block74;
                        if (by2 == 7 || by2 == 8 || by2 == 9) break block73;
                        dq.c("3");
                    }
                    if (co.m().aR.c >= 6 || by2 != 16) {
                        if (by2 == 4) {
                            cw.l().aX = new ba(n3, by3, s6, s5, by2, s4);
                            cj.a().e((byte)2);
                            cw.H.addElement(cw.l().aX);
                            dq.c("5");
                        } else {
                            bg bg2 = new bg(n3, by3, s6, s5 + 3, by2, s4);
                            cw.H.addElement(bg2);
                            dq.c("6");
                        }
                    }
                }
                ++n3;
            }
            main.a.c();
            n2 = aa2.c().readByte();
            dq.c("item size = " + n2);
            int n4 = 0;
            while (n4 < n2) {
                short s7 = aa2.c().readShort();
                short s8 = aa2.c().readShort();
                short s9 = aa2.c().readShort();
                short s10 = aa2.c().readShort();
                int n5 = aa2.c().readInt();
                int n6 = 0;
                if (n5 == -2) {
                    n6 = aa2.c().readShort();
                }
                as as2 = new as(n5, s7, s8, (int)s9, (int)s10, (short)n6);
                s8 = 0;
                n6 = 0;
                while (n6 < cw.F.size()) {
                    as as3 = (as)cw.F.elementAt(n6);
                    if (as3.d == as2.d) {
                        s8 = 1;
                        break;
                    }
                    ++n6;
                }
                if (s8 == 0) {
                    cw.F.addElement(as2);
                }
                ++n4;
            }
            dx.w.removeAllElements();
            if (eh.b == 1) {
                ek.a();
            }
            ek.l.removeAllElements();
            if (!main.a.a || main.a.a && dx.a() || dx.l == 45 || dx.l == 46 || dx.l == 47 || dx.l == 48 || dx.l == 120 || dx.l == 128 || dx.l == 170 || dx.l == 49) {
                n4 = aa2.c().readShort();
                int n7 = 0;
                while (n7 < n4) {
                    short s11 = aa2.c().readShort();
                    short s12 = aa2.c().readShort();
                    short s13 = aa2.c().readShort();
                    if (dx.a(s11) != null) {
                        Object object2 = dx.a(s11);
                        ek ek2 = new ek();
                        new ek().a = s11;
                        ek2.c = ((ek)object2).c;
                        ek2.f = ((ek)object2).f;
                        ek2.g = ((ek)object2).g;
                        ek2.d = s12 * dx.i;
                        ek2.e = s13 * dx.i;
                        ek2.h = ((ek)object2).h;
                        if (dx.b(ek2.a)) {
                            int n8 = ek2.b = n7 % 2 == 0 ? 0 : 2;
                            if (dx.l == 45) {
                                ek2.b = 0;
                            }
                        }
                        object2 = null;
                        if (!ek.k.containsKey(String.valueOf(ek2.c))) {
                            if (eh.b == 1) {
                                object2 = ej.c("/mapBackGround/" + ek2.c + ".png");
                                if (object2 == null) {
                                    object2 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                    eb.b().d();
                                    cj.a().c(ek2.c);
                                }
                                ek.k.put(String.valueOf(ek2.c), object2);
                            } else {
                                s11 = 0;
                                byte[] byArray = ea.b(String.valueOf(eh.b) + "bgItem" + ek2.c);
                                object2 = byArray;
                                if (byArray != null) {
                                    if (ek.n != null) {
                                        dq.c("Small  last= " + ((Object)object2).length % 127 + "new Version= " + ek.n[ek2.c]);
                                        if (((Object)object2).length % 127 != ek.n[ek2.c]) {
                                            s11 = 1;
                                        }
                                    }
                                    if (s11 == 0) {
                                        if ((object2 = Image.createImage((byte[])object2, (int)0, (int)((Object)object2).length)) != null) {
                                            ek.k.put(String.valueOf(ek2.c), object2);
                                        } else {
                                            s11 = 1;
                                        }
                                    }
                                } else {
                                    s11 = 1;
                                }
                                if (s11 != 0) {
                                    object2 = ej.c("/mapBackGround/" + ek2.c + ".png");
                                    if (object2 == null) {
                                        object2 = Image.createRGBImage((int[])new int[]{-2013265920}, (int)1, (int)1, (boolean)true);
                                        cj.a().c(ek2.c);
                                    }
                                    ek.k.put(String.valueOf(ek2.c), object2);
                                }
                            }
                            ek.m.addElement(String.valueOf(ek2.c));
                        }
                        if (!ek.a(String.valueOf(ek2.c))) {
                            ek.l.addElement(String.valueOf(ek2.c));
                        }
                        ek.b();
                        dx.w.addElement(ek2);
                    }
                    ++n7;
                }
                n7 = 0;
                while (n7 < ek.m.size()) {
                    String string = (String)ek.m.elementAt(n7);
                    if (!ek.a(string)) {
                        ek.k.remove(string);
                        if (ek.k.containsKey(String.valueOf(string) + "blend" + 1)) {
                            ek.k.remove(String.valueOf(string) + "blend" + 1);
                        }
                        if (ek.k.containsKey(String.valueOf(string) + "blend" + 3)) {
                            ek.k.remove(String.valueOf(string) + "blend" + 3);
                        }
                        ek.m.removeElementAt(n7);
                        --n7;
                    }
                    ++n7;
                }
                f.d = false;
                f.e = 0;
                h.a.removeAllElements();
                f.a.removeAllElements();
                i.m.removeAllElements();
                n7 = aa2.c().readShort();
                System.out.println("nKey= " + n7);
                int n9 = 0;
                while (n9 < n7) {
                    Object object3 = aa2.c().readUTF();
                    String string = aa2.c().readUTF();
                    System.out.println("key= " + (String)object3 + " value= " + string + "--------------------------------------------------------------------");
                    String[] stringArray = object3;
                    object3 = string;
                    String[] stringArray2 = stringArray;
                    if (stringArray.equals("eff")) {
                        if (dl.I <= 0) {
                            int n10;
                            stringArray2 = dq.a((String)object3, ".", 0);
                            int n11 = Integer.parseInt(stringArray2[0]);
                            int n12 = Integer.parseInt(stringArray2[1]);
                            int n13 = Integer.parseInt(stringArray2[2]);
                            int n14 = Integer.parseInt(stringArray2[3]);
                            if (stringArray2.length <= 4) {
                                n4 = -1;
                                n10 = 1;
                            } else {
                                n4 = Integer.parseInt(stringArray2[4]);
                                n10 = Integer.parseInt(stringArray2[5]);
                            }
                            object3 = new i(n11, n13, n14, n12, n4, n10);
                            if (stringArray2.length > 6) {
                                object3.b = Integer.parseInt(stringArray2[6]);
                                if (stringArray2.length > 7) {
                                    object3.c = Integer.parseInt(stringArray2[7]);
                                    object3.d = Integer.parseInt(stringArray2[8]);
                                }
                            }
                            h.a((i)object3);
                        }
                    } else if (stringArray2.equals("beff") && dl.I <= 1) {
                        f.a(Integer.parseInt((String)object3));
                    }
                    ++n9;
                }
            } else {
                n4 = aa2.c().readShort();
                int n15 = 0;
                while (n15 < n4) {
                    aa2.c().readShort();
                    aa2.c().readShort();
                    aa2.c().readShort();
                    ++n15;
                }
                n15 = aa2.c().readShort();
                int n16 = 0;
                while (n16 < n15) {
                    aa2.c().readUTF();
                    aa2.c().readUTF();
                    ++n16;
                }
            }
            dx.p = aa2.c().readByte();
            byte by4 = aa2.c().readByte();
            n4 = by4;
            ci.a(by4);
            main.a.c();
        }
        catch (Exception exception) {
            dq.b(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap khong thanh cong");
            main.a.e();
            ds.o = true;
            main.a.l();
        }
        main.a.d = false;
        dq.b(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap thanh cong");
    }

    private void f(aa aa2) {
        main.a.c();
        try {
            try {
                int n2 = aa2.c().readByte();
                ej.e("messageNotMap: cmd:" + n2);
                switch (n2) {
                    case 16: {
                        di.c().a();
                        break;
                    }
                    case 17: {
                        main.a.c();
                        co.m();
                        co.P();
                        break;
                    }
                    case 18: {
                        main.a.d = false;
                        main.a.l();
                        Integer n3 = new Integer(aa2.c().readInt());
                        ((de)null).a(ch.aw, new ae(ch.bt, main.a.h, 88829, n3), 0);
                        break;
                    }
                    case 20: {
                        co.m().ba = aa2.c().readByte();
                        cw.aO.a(String.valueOf(ch.bI) + " " + co.m().ba, 0);
                        break;
                    }
                    case 33: {
                        break;
                    }
                    case 35: {
                        main.a.l();
                        cw.l().p();
                        cw.aO.a(aa2.c().readUTF(), 0);
                        break;
                    }
                    case 36: {
                        cw.aN = aa2.c().readByte();
                        dq.c("load Me Active: " + cw.aN);
                        break;
                    }
                    case 4: {
                        dq.a("vao cmd 4 UPDATE_VERSION SA8", 2);
                        main.a.I.e();
                        cw.bw = false;
                        cw.bx = false;
                        en.d = true;
                        en.e = true;
                        en.f = true;
                        en.g = true;
                        en.h = true;
                        cw.ar = aa2.c().readByte();
                        cw.as = aa2.c().readByte();
                        cw.at = aa2.c().readByte();
                        cw.au = aa2.c().readByte();
                        aa2.c().readByte();
                        cw.c();
                        if (main.a.I.n) {
                            ea.a(ea.e, "");
                            ea.a(ea.f, "");
                        } else {
                            ea.a(String.valueOf(ea.d) + ds.p, "");
                        }
                        dq.c("****** DATA VERSION: Server " + cw.ar + " Client " + cw.an);
                        dq.c("****** MAP VERSION: Server " + cw.as + " Client " + cw.ao);
                        dq.c("****** SKILL VERSION: Server " + cw.at + " Client " + cw.ap);
                        dq.c("****** ITEM VERSION: Server " + cw.au + " Client " + cw.aq);
                        if (cw.ar != cw.an) {
                            dq.c("send update data");
                            cw.b = false;
                            cj.a().q();
                        } else {
                            try {
                                en.e = false;
                            }
                            catch (Exception exception) {
                                Exception exception2 = exception;
                                exception.printStackTrace();
                                cw.an = (byte)-1;
                                cj.a().q();
                            }
                        }
                        if (cw.as != cw.ao) {
                            cw.b = false;
                            cj.a().r();
                        } else {
                            try {
                                if (!cw.b) {
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(ea.b("NRmap")));
                                    ci.b(dataInputStream);
                                }
                                en.f = false;
                            }
                            catch (Exception exception) {
                                cw.ao = (byte)-1;
                                cj.a().r();
                            }
                        }
                        if (cw.at != cw.ap) {
                            cw.b = false;
                            cj.a().s();
                        } else {
                            try {
                                if (!cw.b) {
                                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(ea.b("NRskill")));
                                    ci.a(dataInputStream);
                                }
                                en.g = false;
                            }
                            catch (Exception exception) {
                                cw.ap = (byte)-1;
                                cj.a().s();
                            }
                        }
                        if (cw.au != cw.aq) {
                            cw.b = false;
                            cw.aw = true;
                            cw.aB = ej.j();
                            cj.a().t();
                        } else {
                            Object object;
                            cw.aw = false;
                            try {
                                object = new DataInputStream(new ByteArrayInputStream(ea.b("NRitem0")));
                                this.b((DataInputStream)object, false);
                                object = new DataInputStream(new ByteArrayInputStream(ea.b("NRitem1")));
                                this.b((DataInputStream)object, false);
                                object = new DataInputStream(new ByteArrayInputStream(ea.b("NRitem100")));
                                this.b((DataInputStream)object, false);
                                en.h = false;
                            }
                            catch (Exception exception) {
                                cw.aq = (byte)-1;
                                cj.a().t();
                            }
                            try {
                                byte[] byArray = ea.b("NRitem101");
                                object = byArray;
                                if (byArray != null) {
                                    object = new DataInputStream(new ByteArrayInputStream((byte[])object));
                                    this.b((DataInputStream)object, false);
                                }
                            }
                            catch (Exception exception) {}
                        }
                        if (!cw.b) {
                            cw.l();
                            cw.k();
                        } else {
                            cj.a().u();
                        }
                        n2 = aa2.c().readByte();
                        dq.c("CAPTION LENT= " + n2);
                        cw.T = new long[n2];
                        n2 = 0;
                        while (n2 < cw.T.length) {
                            cw.T[n2] = aa2.c().readLong();
                            ++n2;
                        }
                        break;
                    }
                    case 6: {
                        dq.c("GET UPDATE_MAP " + aa2.c().available() + " bytes");
                        aa2.c().mark(100000);
                        ci.b(aa2.c());
                        aa2.c().reset();
                        byte[] byArray = new byte[aa2.c().available()];
                        aa2.c().readFully(byArray);
                        ea.a("NRmap", byArray);
                        byArray = new byte[]{cw.ao};
                        ea.a("NRmapVersion", byArray);
                        dq.c("GET UPDATE_MAP NRmapVersion:" + byArray);
                        en.f = false;
                        cw.l();
                        cw.k();
                        break;
                    }
                    case 7: {
                        dq.c("GET UPDATE_SKILL " + aa2.c().available() + " bytes");
                        aa2.c().mark(100000);
                        ci.a(aa2.c());
                        aa2.c().reset();
                        byte[] byArray = new byte[aa2.c().available()];
                        aa2.c().readFully(byArray);
                        ea.a("NRskill", byArray);
                        byArray = new byte[]{cw.ap};
                        ea.a("NRskillVersion", byArray);
                        en.g = false;
                        cw.l();
                        cw.k();
                        break;
                    }
                    case 8: {
                        dq.c("GET UPDATE_ITEM " + aa2.c().available() + " bytes");
                        DataInputStream dataInputStream = aa2.c();
                        Object object = this;
                        try {
                            ((ci)object).b(dataInputStream, true);
                        }
                        catch (Exception exception) {
                            object = exception;
                            exception.printStackTrace();
                        }
                        cw.l();
                        cw.k();
                        break;
                    }
                    case 10: {
                        try {
                            co.cd = true;
                            dq.c("REQUEST MAP TEMPLATE");
                            main.a.d = true;
                            dx.f = null;
                            dx.g = null;
                            System.gc();
                            main.a.c();
                            dx.a = aa2.c().readByte();
                            dx.b = aa2.c().readByte();
                            dx.f = new int[dx.a * dx.b];
                            dq.c("Cmd.REQUEST_MAPTEMPLATE=10  w|H= " + dx.a + "|" + dx.b + "\n Dien Tich = " + dx.a * dx.b);
                            n2 = 0;
                            while (n2 < dx.f.length) {
                                int n4 = aa2.c().readByte();
                                if (n4 < 0) {
                                    n4 += 256;
                                }
                                dx.f[n2] = (char)n4;
                                ++n2;
                            }
                            dx.g = new int[dx.f.length];
                            aa2 = this.g;
                            this.e(aa2);
                            try {
                                byte by2 = aa2.c().readByte();
                                n2 = by2;
                                dx.j = by2 != 0;
                            }
                            catch (Exception exception) {}
                        }
                        catch (Exception exception) {
                            Exception exception3 = exception;
                            exception.printStackTrace();
                        }
                        aa2.e();
                        this.g.e();
                        this.g = null;
                        aa2 = null;
                        break;
                    }
                    case 9: {
                        main.a.c();
                    }
                }
            }
            catch (Exception exception) {
                if (aa2 != null) {
                    aa2.e();
                    return;
                }
            }
        }
        finally {
            if (aa2 != null) {
                aa2.e();
            }
        }
    }

    private static void g(aa aa2) {
        try {
            try {
                byte by2 = aa2.c().readByte();
                switch (by2) {
                    case 2: {
                        String string;
                        ds.k = string = aa2.c().readUTF();
                        ej.a();
                        ds.a(ds.k);
                        try {
                            byte by3 = aa2.c().readByte();
                            dl.ad = by3 == 1;
                        }
                        catch (Exception exception) {}
                        c = true;
                    }
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                if (aa2 != null) {
                    aa2.e();
                    return;
                }
            }
        }
        finally {
            if (aa2 != null) {
                aa2.e();
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void h(aa var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[CASE]], but top level block is 5[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void a(bt bt2) {
        if (co.m().aQ == null) {
            co.m().aQ = bt2;
        } else if (bt2.a.equals(co.m().aQ.a)) {
            co.m().aQ = bt2;
        }
        co.m().aN.addElement(bt2);
        if ((bt2.a.e == 1 || bt2.a.e == 4 || bt2.a.e == 2 || bt2.a.e == 3) && (bt2.a.c == 0 || bt2.a.c > 0 && bt2.c > 0)) {
            if (bt2.a.a == co.m().bd) {
                cj.a().i(co.m().bd);
            }
            co.m().aO.addElement(bt2);
        }
    }

    private static boolean a(co object, aa aa2) {
        try {
            ((co)object).ac = aa2.c().readByte();
            ((co)object).bs = aa2.c().readBoolean();
            ((co)object).bb = aa2.c().readByte();
            dq.c("ADD TYPE PK= " + ((co)object).bb + " to player " + ((co)object).V);
            ((co)object).aL = cw.J[aa2.c().readByte()];
            ((co)object).W = aa2.c().readByte();
            ((co)object).cp = aa2.c().readShort();
            ((co)object).au = aa2.c().readUTF();
            ((co)object).dw = ((co)object).ag = aa2.c().readLong();
            if (((co)object).ag == 0L) {
                ((co)object).T = 14;
            }
            ((co)object).aj = aa2.c().readLong();
            if (((co)object).O >= dx.d - 100) {
                ((co)object).bH = true;
            }
            ((co)object).cr = aa2.c().readShort();
            ((co)object).cq = aa2.c().readShort();
            ((co)object).cs = aa2.c().readShort();
            dq.c(" body= " + ((co)object).cr + " leg= " + ((co)object).cq + " bag=" + ((co)object).cs + "BAG ==" + ((co)object).cs + "*********************************");
            ((co)object).bt = true;
            aa2.c().readByte();
            if (((co)object).ct == -1) {
                ((co)object).v();
            }
            if (((co)object).cr == -1) {
                ((co)object).w();
            }
            if (((co)object).cq == -1) {
                ((co)object).x();
            }
            dq.c("1");
            ((co)object).N = aa2.c().readShort();
            ((co)object).O = aa2.c().readShort();
            ((co)object).cN = ((co)object).N;
            ((co)object).cO = ((co)object).O;
            ((co)object).ad = aa2.c().readShort();
            ((co)object).ae = aa2.c().readShort();
            int n2 = aa2.c().readByte();
            int n3 = 0;
            while (n3 < n2) {
                ag ag2 = new ag(aa2.c().readByte(), aa2.c().readInt(), aa2.c().readInt(), aa2.c().readShort());
                ((co)object).aP.addElement(ag2);
                al cfr_ignored_0 = ag2.b;
                al cfr_ignored_1 = ag2.b;
                ++n3;
            }
            dq.c("Controller readCharInfo body: body|leg|bag " + ((co)object).cr + ((co)object).cq + ((co)object).cs);
            return true;
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
            return false;
        }
    }

    private void i(aa object) {
        try {
            String string = ((aa)object).c().readUTF();
            byte by2 = ((aa)object).c().readByte();
            byte[] byArray = o.a((aa)object);
            object = byArray;
            Image image = ci.a(byArray);
            r.a(string, image, by2);
            if (object != null) {
                r.a(string, by2, (byte[])object);
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    private void b(DataInputStream dataInputStream, boolean bl2) {
        try {
            dataInputStream.mark(1000000);
            cw.aq = dataInputStream.readByte();
            int n2 = dataInputStream.readByte();
            ej.e(">>loadItemNew:  type:" + n2);
            cw.aB = ej.j();
            if (n2 == 0) {
                cw.ax = true;
                cw.l().L = new av[dataInputStream.readShort()];
                n2 = 0;
                while (n2 < cw.l().L.length) {
                    cw.l().L[n2] = new av();
                    cw.l().L[n2].a = n2;
                    cw.l().L[n2].b = dataInputStream.readUTF();
                    av[] cfr_ignored_0 = cw.l().L;
                    dataInputStream.readByte();
                    ++n2;
                }
                try {
                    n2 = dataInputStream.readShort();
                    int n3 = 0;
                    while (n3 < n2) {
                        short s2 = dataInputStream.readShort();
                        cw.l().L[s2].c = dataInputStream.readUnsignedByte();
                        ++n3;
                    }
                }
                catch (Exception exception) {}
                if (bl2) {
                    dataInputStream.reset();
                    byte[] byArray = new byte[dataInputStream.available()];
                    dataInputStream.readFully(byArray);
                    ea.a("NRitem0", byArray);
                }
            } else if (n2 == 1) {
                Object object;
                cw.ay = true;
                ax.a.clear();
                n2 = dataInputStream.readShort();
                int n4 = 0;
                while (n4 < n2) {
                    aw aw2 = new aw((short)n4, dataInputStream.readByte(), dataInputStream.readByte(), dataInputStream.readUTF(), dataInputStream.readUTF(), dataInputStream.readByte(), dataInputStream.readInt(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readBoolean());
                    object = aw2;
                    ax.a(aw2);
                    ++n4;
                }
                if (bl2) {
                    dataInputStream.reset();
                    byte[] byArray = new byte[dataInputStream.available()];
                    dataInputStream.readFully(byArray);
                    ea.a("NRitem1", byArray);
                    object = new byte[]{cw.aq};
                    ea.a("NRitemVersion", object);
                }
            } else if (n2 != 2) {
                if (n2 == 100) {
                    cw.az = true;
                    co.dx = ci.c(dataInputStream);
                    if (bl2) {
                        dataInputStream.reset();
                        byte[] byArray = new byte[dataInputStream.available()];
                        dataInputStream.readFully(byArray);
                        ea.a("NRitem100", byArray);
                    }
                } else if (n2 == 101) {
                    cw.aA = true;
                    try {
                        n2 = dataInputStream.readShort();
                        co.dD = new short[n2];
                        int n5 = 0;
                        while (n5 < n2) {
                            short s3;
                            co.dD[n5] = s3 = dataInputStream.readShort();
                            ++n5;
                        }
                        if (bl2) {
                            dataInputStream.reset();
                            byte[] byArray = new byte[dataInputStream.available()];
                            dataInputStream.readFully(byArray);
                            ea.a("NRitem101", byArray);
                        }
                    }
                    catch (Exception exception) {
                        co.dD = new short[0];
                    }
                }
            }
            cw.l();
            cw.k();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static void b(aa aa2, int n2) {
        try {
            int n3 = aa2.c().readByte();
            int[][] nArrayArray = new int[n3][];
            int n4 = 0;
            while (n4 < n3) {
                int n5 = aa2.c().readByte();
                nArrayArray[n4] = new int[n5];
                int n6 = 0;
                while (n6 < n5) {
                    nArrayArray[n4][n6] = aa2.c().readByte();
                    ++n6;
                }
                ++n4;
            }
            d.put(String.valueOf(n2), nArrayArray);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    private static int[][] c(DataInputStream dataInputStream) {
        int[][] nArrayArray = new int[][]{{542, 543}};
        try {
            int n2 = dataInputStream.readShort();
            nArrayArray = new int[n2][];
            n2 = 0;
            while (n2 < nArrayArray.length) {
                int n3 = dataInputStream.readByte();
                nArrayArray[n2] = new int[n3];
                int n4 = 0;
                while (n4 < n3) {
                    nArrayArray[n2][n4] = dataInputStream.readShort();
                    ++n4;
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        return nArrayArray;
    }

    private void j(aa object) {
        block11: {
            try {
                block12: {
                    byte by2 = ((aa)object).c().readByte();
                    if (by2 != 0) break block11;
                    try {
                        byte s2 = ((aa)object).c().readByte();
                        if (s2 == 0) {
                            short s3 = ((aa)object).c().readShort();
                            String string = ((aa)object).c().readUTF();
                            String string2 = ((aa)object).c().readUTF();
                            int n2 = ((aa)object).c().readInt();
                            short s4 = ((aa)object).c().readShort();
                            byte by3 = ((aa)object).c().readByte();
                            cw.cl = new aq(by2, s3, string, string2, n2, s4);
                            new aq(by2, s3, string, string2, n2, s4).g = by3;
                            cw.cl.a(by2, 0, 0);
                            break block11;
                        }
                        if (s2 == 1) {
                            int n3 = ((aa)object).c().readInt();
                            int n4 = ((aa)object).c().readInt();
                            if (cw.cl == null) break block12;
                            int n5 = n3;
                            object = cw.cl;
                            cw.cl.a = by2;
                            ((aq)object).c = n5;
                            ((aq)object).d = n4;
                            break block11;
                        }
                        if (s2 == 2) {
                            byte by3 = ((aa)object).c().readByte();
                            int n6 = 0;
                            if (by3 == 1) {
                                n6 = 1;
                            } else if (by3 == 2) {
                                n6 = 2;
                            }
                            cw.cl = null;
                            cw.a(n6, -1, 0, main.a.C, main.a.D, 0, 0, (short)-1, null);
                            break block11;
                        }
                        if (s2 == 5) {
                            short s5 = ((aa)object).c().readShort();
                            if (cw.cl == null) break block12;
                            short s6 = s5;
                            object = cw.cl;
                            cw.cl.a = by2;
                            ((aq)object).m = s6;
                            ((aq)object).n = main.a.b;
                            break block11;
                        }
                        if (s2 != 4) break block12;
                        byte by4 = ((aa)object).c().readByte();
                        byte by5 = ((aa)object).c().readByte();
                        if (cw.cl == null) break block12;
                        cw.cl.a(by2, by4, by5);
                        break block11;
                    }
                    catch (Exception exception) {}
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void k(aa aa2) {
        try {
            byte by2 = aa2.c().readByte();
            if (by2 == 0) {
                short string;
                co.m().dC = string = aa2.c().readShort();
                es.a();
                es.Q();
                return;
            }
            if (by2 == 2) {
                int string = aa2.c().readInt();
                byte by3 = aa2.c().readByte();
                short s2 = aa2.c().readShort();
                String string2 = String.valueOf(s2) + "," + by3;
                r.a("banner_" + s2, r.a);
                main.a.T.put(String.valueOf(string), string2);
                return;
            }
            if (by2 == 3) {
                short s3 = aa2.c().readShort();
                er.a(s3);
                f.c = s3;
                return;
            }
            if (by2 == 4) {
                String string = aa2.c().readUTF();
                main.a.U.addElement(string);
                return;
            }
            if (by2 == 5) {
                String string = "\n|ChienTruong|Log: ";
                int n2 = aa2.c().readByte();
                if (n2 == 0) {
                    cw.cp = aa2.c().readUTF();
                    byte by4 = aa2.c().readByte();
                    cw.cm = by4;
                    cw.cn = by4;
                    cw.cq = by4 << 1;
                    cw.cr = false;
                    string = String.valueOf(string) + "\tsub    0|  nCT_team= " + cw.cp + "|nCT_TeamA =" + cw.cn + "  isPaint_CT=false \n";
                } else if (n2 == 1) {
                    int n3 = aa2.c().readInt();
                    cw.cs = n2 = aa2.c().readByte();
                    cw.co = (long)(n3 * 1000) + ej.j();
                    cw.cr = true;
                    string = String.valueOf(string) + "\tsub    1 floor= " + n2 + "|timeBallte= " + n3 + "isPaint_CT=true \n";
                } else if (n2 == 2) {
                    cw.cn = aa2.c().readByte();
                    cw.cm = aa2.c().readByte();
                    cw.ct.removeAllElements();
                    byte by5 = aa2.c().readByte();
                    n2 = 0;
                    while (n2 < by5) {
                        String string3 = "";
                        string3 = String.valueOf(string3) + aa2.c().readByte() + "|";
                        string3 = String.valueOf(string3) + aa2.c().readUTF() + "|";
                        string3 = String.valueOf(string3) + aa2.c().readShort() + "|";
                        string3 = String.valueOf(string3) + aa2.c().readInt();
                        cw.ct.addElement(string3);
                        ++n2;
                    }
                    string = String.valueOf(string) + "\tsub   2|  A= " + cw.cn + "|B =" + cw.cm + "  isPaint_CT=true \n";
                } else if (n2 == 3) {
                    cj.a().d(by2, (byte)n2);
                    cw.cs = 0;
                    cw.co = 0L;
                    cw.cr = false;
                    string = String.valueOf(string) + "\tsub    3|  isPaint_CT=false \n";
                } else if (n2 == 4) {
                    cw.cv = aa2.c().readByte();
                    cw.cw = aa2.c().readByte();
                }
                string = String.valueOf(string) + "END LOG CT.";
                dq.b(string);
                return;
            }
            ci.a(by2, aa2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void l(aa object) {
        try {
            int n2 = ((aa)object).c().readShort();
            int n3 = -1;
            try {
                n3 = ((aa)object).c().readByte();
            }
            catch (Exception exception) {}
            if (n3 == 0) {
                short s2 = ((aa)object).c().readShort();
                n3 = 0;
                while (n3 < co.m().aN.size()) {
                    bt bt2 = (bt)co.m().aN.elementAt(n3);
                    if (bt2.b == n2) {
                        bt2.m = s2;
                        return;
                    }
                    ++n3;
                }
                return;
            }
            if (n3 == 1) {
                byte by2 = ((aa)object).c().readByte();
                n3 = 0;
                while (n3 < co.m().aN.size()) {
                    bt bt3 = (bt)co.m().aN.elementAt(n3);
                    if (bt3.b == n2) {
                        n2 = 0;
                        while (n2 < 20) {
                            String string = "Skills_" + bt3.a.a + "_" + by2 + "_" + n2;
                            r.a(string, r.a);
                            ++n2;
                        }
                        return;
                    }
                    ++n3;
                }
                return;
            }
            if (n3 == -1) {
                bt bt4;
                object = by.a((short)n2);
                n3 = 0;
                while (n3 < co.m().aN.size()) {
                    bt4 = (bt)co.m().aN.elementAt(n3);
                    if (bt4.a.a == ((bt)object).a.a) {
                        co.m().aN.setElementAt(object, n3);
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < co.m().aO.size()) {
                    bt4 = (bt)co.m().aO.elementAt(n3);
                    if (bt4.a.a == ((bt)object).a.a) {
                        co.m().aO.setElementAt(object, n3);
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < cw.bb.length) {
                    if (cw.bb[n3] != null && cw.bb[n3].a.a == ((bt)object).a.a) {
                        cw.bb[n3] = object;
                        break;
                    }
                    ++n3;
                }
                n3 = 0;
                while (n3 < cw.ba.length) {
                    if (cw.ba[n3] != null && cw.ba[n3].a.a == ((bt)object).a.a) {
                        cw.ba[n3] = object;
                        break;
                    }
                    ++n3;
                }
                if (co.m().aQ.a.a == ((bt)object).a.a) {
                    co.m().aQ = object;
                }
                cw.aO.a(String.valueOf(ch.eG) + ((bt)object).a.b + ch.eH + ((bt)object).c, 0);
                return;
            }
        }
        catch (Exception exception) {}
    }

    private static void a(byte by2, aa aa2) {
        block12: {
            try {
                int n2;
                String string;
                if (by2 != 127) break block12;
                main.a.l();
                ds.k = string = aa2.c().readUTF();
                ej.a();
                ds.a(ds.k);
                dq.c(">>>>read.isEXTRA_LINK " + string);
                int n3 = aa2.c().readByte();
                dq.c(">>>>read.isEXTRA_LINK  numSv: " + n3);
                if (n3 > 0) {
                    ds.e = new byte[n3];
                    ds.f = new co[n3];
                    n2 = 0;
                    while (n2 < n3) {
                        ds.e[n2] = aa2.c().readByte();
                        dq.c(String.valueOf(ds.a[n2]) + ">>>>read.isEXTRA_LINK  typeClass: " + ds.e[n2]);
                        if (ds.e[n2] >= 0) {
                            ds.g = true;
                            ds.f[n2] = new co();
                            ds.f[n2].W = ds.e[n2];
                            ds.f[n2].cp = aa2.c().readShort();
                            ds.f[n2].cr = aa2.c().readShort();
                            ds.f[n2].cq = aa2.c().readShort();
                            ds.f[n2].cs = aa2.c().readShort();
                            ds.f[n2].au = aa2.c().readUTF();
                        }
                        ++n2;
                    }
                }
                ds.n();
                ds.c = false;
                co.cd = false;
                en.c = false;
                ds.o = false;
                n2 = 0;
                n3 = 0;
                try {
                    if (!ea.c(ea.e).equals("")) {
                        n2 = 1;
                    }
                    if (!ea.c(String.valueOf(ea.d) + ds.p).equals("")) {
                        n3 = 1;
                    }
                }
                catch (Exception exception) {}
                if (!ds.g && n2 == 0 && n3 == 0) {
                    main.a.ao.m();
                    return;
                }
                if (ea.d(ds.D) == -1) {
                    dt.a = false;
                    main.a.ap.a();
                    return;
                }
                ds.a(ea.d(ds.D), false);
                if (ds.f != null && ds.f[ds.p] != null) {
                    main.a.aq.a(ds.f[ds.p]);
                    return;
                }
                main.a.ao.m();
                return;
            }
            catch (Exception exception) {
                dq.c(">>>>read.isEXTRA_LINK  errr:");
                main.a.ap.a();
            }
        }
    }

    public static au b(aa aa2) {
        au au2 = null;
        try {
            short s2 = aa2.c().readShort();
            int n2 = aa2.c().readInt();
            if (s2 != -1) {
                au2 = new au(s2, n2);
            }
        }
        catch (Exception exception) {
            dq.b(">>>>read.ItemOption  errr:");
        }
        return au2;
    }

    private void m(aa aa2) {
        try {
            byte by2 = aa2.c().readByte();
            dq.c(">>---read_cmdExtraBig-sub:" + by2 + "  " + aa2.c().available());
            if (by2 == 0) {
                this.b(aa2.c(), true);
                return;
            }
        }
        catch (Exception exception) {}
    }
}

