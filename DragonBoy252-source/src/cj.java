/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import main.a;
import main.c;

public final class cj {
    private z f = eb.a();
    private static cj g;
    private static volatile boolean h;
    private static volatile boolean i;
    private static long j;
    private static long k;
    private static long l;
    private final Vector m = new Vector();
    public static long a;
    public static long b;
    public static long c;
    public static long d;
    public static boolean e;

    static {
        h = false;
        i = false;
        j = Long.MIN_VALUE;
        k = Long.MIN_VALUE;
        l = Long.MIN_VALUE;
    }

    public static cj a() {
        if (g == null) {
            g = new cj();
        }
        return g;
    }

    public final void a(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(18);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b() {
    }

    public final void a(String object, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(42);
                aa2.d().writeUTF((String)object);
                aa2.d().writeUTF(string);
                aa2.d().writeUTF(string2);
                aa2.d().writeUTF(string3);
                aa2.d().writeUTF(string4);
                aa2.d().writeUTF(string5);
                aa2.d().writeUTF(string6);
                aa2.d().writeUTF(string7);
                aa2.d().writeUTF(string8);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void c() {
    }

    public final void a(byte by2, eq eq2) {
        dq.c("combine");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-81);
                aa2.d().writeByte(1);
                aa2.d().writeByte(eq2.size());
                int n2 = 0;
                while (n2 < eq2.size()) {
                    aa2.d().writeByte(((ar)eq2.elementAt((int)n2)).g);
                    dq.c("gui id " + ((ar)eq2.elementAt((int)n2)).g);
                    ++n2;
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, int n2, byte by3, int n3) {
        dq.c("giao dich action = " + by2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-86);
                aa2.d().writeByte(by2);
                if (by2 == 0 || by2 == 1) {
                    aa2.d().writeInt(n2);
                }
                if (by2 == 2) {
                    dq.c("gui len indxe =" + by3 + " num= " + n3);
                    aa2.d().writeByte(by3);
                    aa2.d().writeInt(n3);
                }
                if (by2 == 4) {
                    aa2.d().writeByte(by3);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(et[] etArray) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-125);
                aa2.d().writeByte(etArray.length);
                int n2 = 0;
                while (n2 < etArray.length) {
                    aa2.d().writeUTF(etArray[n2].e());
                    ++n2;
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(112);
                aa2.d().writeByte(0);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(char c2) {
        dq.c("cap char c= " + c2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-85);
                aa2.d().writeChar(c2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, int n2) {
        dq.c("add friend");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-80);
                aa2.d().writeByte(by2);
                if (n2 != -1) {
                    aa2.d().writeInt(n2);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(int n2) {
        dq.c("get ngoc");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-76);
                aa2.d().writeByte(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void c(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-79);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(byte by2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-62);
                aa2.d().writeByte(by2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void c(byte by2) {
        dq.c("Skill not focus so " + by2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-45);
                aa2.d().writeByte(by2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void d(int n2) {
        aa aa2 = null;
        try {
            try {
                dq.c("CLAN DONATE");
                aa2 = new aa(-54);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(int n2, String string, int n3) {
        aa aa2 = null;
        try {
            try {
                dq.c("CLAN MESSAGE");
                aa2 = new aa(-51);
                aa2.d().writeByte(n2);
                if (n2 == 0) {
                    aa2.d().writeUTF(string);
                }
                if (n2 == 2) {
                    aa2.d().writeInt(n3);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, byte by3, byte by4, short s2) {
        if (co.m().T == 14) {
            return;
        }
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-43);
                aa2.d().writeByte(by2);
                aa2.d().writeByte(by3);
                aa2.d().writeByte(by4);
                if (by4 == -1) {
                    aa2.d().writeShort(s2);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(int n2, byte by2) {
        dq.c("JOIN CLAN " + n2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-49);
                aa2.d().writeInt(n2);
                aa2.d().writeByte(by2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void e(int n2) {
        dq.c("MEMBER CLAN " + n2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-50);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(String object) {
        dq.c("send SEARCH CLAN " + (String)object);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-47);
                aa2.d().writeUTF((String)object);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(int n2, byte by2) {
        dq.c("REMOTE CLAN id = " + n2 + " role= " + by2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-56);
                aa2.d().writeInt(n2);
                aa2.d().writeByte(by2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void d() {
        dq.c("LEAVE CLAN");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-55);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, int n2, int n3, int n4) {
        dq.c("invite action = " + by2 + "layerid= " + n2 + " clanID= " + n3 + " code= " + n4);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-57);
                aa2.d().writeByte(by2);
                if (by2 == 0) {
                    aa2.d().writeInt(n2);
                }
                if (by2 == 1 || by2 == 2) {
                    aa2.d().writeInt(n3);
                    aa2.d().writeInt(n4);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, int n2, String string) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-46);
                aa2.d().writeByte(by2);
                if (by2 == 2 || by2 == 4) {
                    aa2.d().writeShort((short)n2);
                    aa2.d().writeUTF(string);
                    dq.c("SEND SLOGAN= " + string);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void d(byte by2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-41);
                aa2.d().writeByte(by2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, byte by3) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-40);
                aa2.d().writeByte(by2);
                aa2.d().writeByte(by3);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    private static aa i(byte by2) {
        aa aa2 = new aa(-29);
        aa2.d().writeByte(by2);
        return aa2;
    }

    private static aa j(byte by2) {
        aa aa2 = new aa(-28);
        aa2.d().writeByte(by2);
        return aa2;
    }

    /*
     * Loose catch block
     */
    public final synchronized boolean a(boolean bl2) {
        InputStream inputStream;
        aa aa2;
        block22: {
            boolean bl32;
            eb eb2 = bl2 ? eb.b() : eb.a();
            if (eb2 == null || !eb2.d()) {
                dq.b("skip CLIENT_INFO: socket is not connected");
                return false;
            }
            long l2 = eb2.e();
            boolean bl4 = bl2 ? i && k == l2 : (bl32 = h && j == l2);
            if (bl4) {
                return false;
            }
            if (ea.d(ea.b) != -1) {
                ej.c = ea.d(ea.b);
            }
            aa2 = null;
            inputStream = null;
            dq.c("setType " + (bl2 ? "secondary" : "main"));
            aa2 = cj.i((byte)2);
            aa2.d().writeByte(ej.c);
            aa2.d().writeByte(eh.b);
            aa2.d().writeBoolean(false);
            aa2.d().writeInt(main.a.A);
            aa2.d().writeInt(main.a.B);
            aa2.d().writeBoolean(et.g);
            aa2.d().writeBoolean(main.a.e);
            aa2.d().writeUTF(String.valueOf(eg.r()) + "|" + "2.5.2");
            inputStream = this.getClass().getResourceAsStream("res\\info");
            if (inputStream != null) {
                int n2;
                Object object = new ByteArrayOutputStream();
                byte[] byArray = new byte[256];
                while ((n2 = inputStream.read(byArray)) > 0) {
                    ((ByteArrayOutputStream)object).write(byArray, 0, n2);
                }
                byte[] byArray2 = ((ByteArrayOutputStream)object).toByteArray();
                object = byArray2;
                if (byArray2.length > 0) {
                    aa2.d().writeShort(((Object)object).length);
                    ((OutputStream)aa2.d()).write((byte[])object);
                    dq.b("write " + ((Object)object).length + "|" + "2.5.2");
                }
            }
            eb2.a(aa2);
            if (bl2) {
                i = true;
                k = l2;
            } else {
                h = true;
                j = l2;
            }
            if (inputStream == null) break block22;
            try {
                inputStream.close();
            }
            catch (IOException iOException) {}
        }
        if (aa2 != null) {
            aa2.e();
        }
        return true;
        catch (IOException iOException) {
            block23: {
                try {
                    dq.b("send CLIENT_INFO failed: " + iOException.toString());
                    if (inputStream == null) break block23;
                }
                catch (Throwable throwable) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (IOException iOException2) {}
                    }
                    if (aa2 != null) {
                        aa2.e();
                    }
                    throw throwable;
                }
                try {
                    inputStream.close();
                }
                catch (IOException iOException3) {}
            }
            if (aa2 != null) {
                aa2.e();
            }
            return false;
        }
    }

    public final synchronized void b(boolean bl2) {
        if (bl2) {
            i = false;
            k = Long.MIN_VALUE;
            return;
        }
        h = false;
        j = Long.MIN_VALUE;
        l = Long.MIN_VALUE;
    }

    public final synchronized void a(boolean bl2, long l2) {
        eb eb2 = bl2 ? eb.b() : eb.a();
        if (eb2 == null || eb2.e() != l2) {
            return;
        }
        this.b(bl2);
    }

    public final synchronized void e() {
        h = false;
        i = false;
        j = Long.MIN_VALUE;
        k = Long.MIN_VALUE;
        l = Long.MIN_VALUE;
        this.C();
    }

    public final synchronized void f() {
        this.C();
    }

    public final synchronized boolean g() {
        eb eb2 = eb.a();
        if (eb2 == null || !eb2.d()) {
            return false;
        }
        long l2 = eb2.e();
        return h && j == l2 && l == l2;
    }

    public final synchronized boolean h() {
        eb eb2 = eb.a();
        if (eb2 == null || !eb2.d()) {
            return false;
        }
        long l2 = eb2.e();
        if (!h || j != l2) {
            return false;
        }
        l = l2;
        boolean bl2 = this.m.size() > 0;
        if (bl2) {
            this.D();
        }
        return bl2;
    }

    private void C() {
        while (this.m.size() > 0) {
            aa aa2 = (aa)this.m.elementAt(0);
            this.m.removeElementAt(0);
            if (aa2 == null) continue;
            aa2.e();
        }
    }

    private boolean D() {
        eb eb2 = eb.a();
        while (this.m.size() > 0) {
            aa aa2 = (aa)this.m.elementAt(0);
            if (aa2 == null) {
                this.m.removeElementAt(0);
                continue;
            }
            boolean bl2 = false;
            try {
                try {
                    eb2.a(aa2);
                    bl2 = true;
                }
                catch (RuntimeException runtimeException) {
                    dq.b("flush pending login failed: " + runtimeException.toString());
                    return false;
                }
            }
            catch (Throwable throwable) {
                if (bl2 && this.m.size() > 0 && this.m.elementAt(0) == aa2) {
                    this.m.removeElementAt(0);
                    aa2.e();
                }
                throw throwable;
            }
            if (this.m.size() <= 0 || this.m.elementAt(0) != aa2) continue;
            this.m.removeElementAt(0);
            aa2.e();
        }
        return true;
    }

    private void a(aa aa2) {
        this.C();
        this.m.addElement(aa2);
    }

    private synchronized void b(aa aa2) {
        if (aa2 == null) {
            return;
        }
        if (!this.g()) {
            this.a(aa2);
            return;
        }
        if (!this.D()) {
            this.a(aa2);
            return;
        }
        try {
            eb.a().a(aa2);
            aa2.e();
            return;
        }
        catch (RuntimeException runtimeException) {
            this.m.addElement(aa2);
            dq.b("queue login failed, will retry: " + runtimeException.toString());
            return;
        }
    }

    public final void i() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-120);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                a = ej.j();
                aa2.e();
                return;
            }
        }
        finally {
            a = ej.j();
            aa2.e();
        }
    }

    public final void j() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-121);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                b = ej.j();
                aa2.e();
                return;
            }
        }
        finally {
            b = ej.j();
            aa2.e();
        }
    }

    public final void a(String object, String string, String string2, byte by2) {
        dq.c("[LOGIN] request queued; clientType=" + ej.c);
        aa aa2 = null;
        try {
            try {
                aa2 = cj.i((byte)0);
                aa2.d().writeUTF(main.c.a());
                aa2.d().writeUTF((String)object);
                aa2.d().writeUTF(string);
                aa2.d().writeUTF(string2);
                aa2.d().writeByte(by2);
                aa2.d().writeByte(ch.fE);
                this.b(aa2);
                aa2 = null;
                x.a.a();
                return;
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
                if (aa2 != null) {
                    aa2.e();
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            if (aa2 != null) {
                aa2.e();
            }
            throw throwable;
        }
    }

    public final void a(String string, String string2, String string3, String object) {
        dq.c("Request Register " + string + " " + string2 + " " + (String)object);
        try {
            object = cj.i((byte)1);
            ((aa)object).d().writeUTF(string);
            ((aa)object).d().writeUTF(string2);
            if (string3 != null && !string3.equals("")) {
                ((aa)object).d().writeUTF(string3);
                ((aa)object).d().writeUTF("a");
            }
            this.f.a((aa)object);
            ((aa)object).e();
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void k() {
        aa aa2 = new aa(-23);
        this.f.a(aa2);
        aa2.e();
    }

    public final void e(byte by2) {
        aa aa2 = new aa(-34);
        try {
            aa2.d().writeByte(by2);
            this.f.a(aa2);
            aa2.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void f(int n2) {
        aa aa2 = new aa(21);
        try {
            aa2.d().writeByte(n2);
            this.f.a(aa2);
            aa2.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void g(int n2) {
        aa aa2 = new aa(-78);
        try {
            aa2.d().writeInt(n2);
            this.f.a(aa2);
            aa2.e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void l() {
        int n2 = co.m().N - co.m().bU;
        int n3 = co.m().O - co.m().bV;
        if (co.cb || n2 == 0 && n3 == 0 || ci.b || co.m().E || co.m().O <= 0 || co.m().ds) {
            return;
        }
        try {
            aa aa2 = new aa(-7);
            co.m().bU = co.m().N;
            co.m().bV = co.m().O;
            co.m().bW = co.m().U;
            co.m().bZ = co.m().T;
            if (dx.a(co.m().N / dx.i, co.m().O / dx.i) == 0) {
                aa2.d().writeByte(1);
            } else {
                aa2.d().writeByte(0);
            }
            aa2.d().writeShort(co.m().N);
            if (n3 != 0) {
                aa2.d().writeShort(co.m().O);
            }
            this.f.a(aa2);
            ++cw.O;
            aa2.e();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(String object, int n2, int n3) {
        aa aa2 = new aa(-28);
        try {
            aa2.d().writeByte(2);
            aa2.d().writeUTF((String)object);
            aa2.d().writeByte(n2);
            aa2.d().writeByte(n3);
            dq.c("name= " + (String)object + " gender= " + n2 + " hair=" + n3);
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        this.f.a(aa2);
    }

    public final void h(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(11);
                aa2.d().writeShort(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, byte by3, short s2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(7);
                aa2.d().writeByte(by2);
                aa2.d().writeByte(by3);
                aa2.d().writeShort(s2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, int n2, int n3) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(6);
                aa2.d().writeByte(by2);
                aa2.d().writeShort(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void i(int n2) {
        dq.c(String.valueOf(co.m().au) + " SELECT SKILL " + n2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(34);
                aa2.d().writeShort(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(short s2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-66);
                aa2.d().writeShort(s2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void m() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(29);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(short s2, byte by2) {
        dq.c("confirme menu=" + by2 + " npc= " + s2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(32);
                aa2.d().writeShort(s2);
                aa2.d().writeByte(by2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void j(int n2) {
        dq.c("npc id" + n2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(33);
                aa2.d().writeShort(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(int n2, int n3, int n4) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(22);
                aa2.d().writeByte(n2);
                aa2.d().writeByte(n3);
                aa2.d().writeByte(n4);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(short s2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(27);
                aa2.d().writeShort(s2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(short s2, String string) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(88);
                aa2.d().writeShort(s2);
                aa2.d().writeUTF(string);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(ar[] arArray) {
        main.a.L.b();
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(13);
                int n2 = 0;
                while (n2 < arArray.length) {
                    if (arArray[n2] != null) {
                        aa2.d().writeByte(arArray[n2].g);
                    }
                    ++n2;
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void k(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(37);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void n() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(50);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(eq eq2, eq eq3, int n2) {
        try {
            dq.c("SEND ATTACT vChar=  " + eq3.size());
            aa aa2 = null;
            if (n2 == 0) {
                return;
            }
            if (eq2.size() > 0 && eq3.size() > 0) {
                cy cy2;
                if (n2 == 1) {
                    aa2 = new aa(-4);
                } else if (n2 == 2) {
                    aa2 = new aa(67);
                }
                aa2.d().writeByte(eq2.size());
                n2 = 0;
                while (n2 < eq2.size()) {
                    cy2 = (dh)eq2.elementAt(n2);
                    aa2.d().writeByte(cy2.B);
                    ++n2;
                }
                n2 = 0;
                while (n2 < eq3.size()) {
                    cy2 = (co)eq3.elementAt(n2);
                    if (cy2 != null) {
                        aa2.d().writeInt(((co)cy2).V);
                    } else {
                        aa2.d().writeInt(-1);
                    }
                    ++n2;
                }
            } else if (eq2.size() > 0) {
                dq.c("PLAYER ATTACK NPC");
                aa2 = new aa(54);
                n2 = 0;
                while (n2 < eq2.size()) {
                    dh dh2 = (dh)eq2.elementAt(n2);
                    if (!dh2.O) {
                        aa2.d().writeByte(dh2.B);
                    } else {
                        aa2.d().writeByte(-1);
                        aa2.d().writeInt(dh2.B);
                    }
                    ++n2;
                }
            } else if (eq3.size() > 0) {
                dq.c("player attack player ");
                aa2 = new aa(-60);
                n2 = 0;
                while (n2 < eq3.size()) {
                    co co2 = (co)eq3.elementAt(n2);
                    aa2.d().writeInt(co2.V);
                    ++n2;
                }
            }
            aa2.d().writeByte((byte)co.m().U);
            if (aa2 == null) {
                return;
            }
            this.f.a(aa2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void l(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-20);
                aa2.d().writeShort(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void o() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-15);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void p() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-16);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(String object) {
        aa aa2 = null;
        try {
            try {
                dq.c("Send chat " + (String)object);
                aa2 = new aa(44);
                aa2.d().writeUTF((String)object);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void q() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-87);
                this.f = eb.b().d() && !eb.b().e ? eb.b() : eb.a();
                this.f.a(aa2);
                this.f = eb.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void r() {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)6);
                this.f = eb.b().d() && !eb.b().e ? eb.b() : eb.a();
                this.f.a(aa2);
                this.f = eb.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void s() {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)7);
                this.f = eb.b().d() && !eb.b().e ? eb.b() : eb.a();
                this.f.a(aa2);
                this.f = eb.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void t() {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)8);
                this.f = eb.b().d() && !eb.b().e ? eb.b() : eb.a();
                this.f.a(aa2);
                this.f = eb.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void u() {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)13);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void c(String object) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(53);
                aa2.d().writeUTF((String)object);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void m(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(76);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void n(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(77);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, byte by3, int n2) {
        dq.c("PLAYER VS PLAYER");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-59);
                aa2.d().writeByte(by2);
                aa2.d().writeByte(by3);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void o(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)10);
                aa2.d().writeByte(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void d(String object) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(17);
                aa2.d().writeUTF((String)object);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(String object, int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-72);
                aa2.d().writeInt(n2);
                aa2.d().writeUTF((String)object);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void e(String object) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-71);
                aa2.d().writeUTF((String)object);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(String object, String string) {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)16);
                aa2.d().writeUTF((String)object);
                aa2.d().writeUTF(string);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(String object, int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)18);
                aa2.d().writeInt(n2);
                aa2.d().writeUTF((String)object);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void p(int n2) {
        main.a.b();
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-67);
                aa2.d().writeInt(n2);
                this.f = eb.b().d() && !eb.b().e ? eb.b() : eb.a();
                this.f.a(aa2);
                this.f = eb.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void q(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)37);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void r(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)41);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void s(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = cj.j((byte)39);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void c(short s2) {
        dq.c("get image id= " + s2);
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-32);
                aa2.d().writeShort(s2);
                this.f = eb.b().d() && !eb.b().e ? eb.b() : eb.a();
                this.f.a(aa2);
                this.f = eb.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void v() {
        dq.c("send map offline");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-33);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void w() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-38);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void t(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-38);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void x() {
        dq.c("finishLoadMap");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-39);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void u(int n2) {
        dq.c("request bag image");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-63);
                aa2.d().writeShort(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void f(String object) {
        dq.c("Login 2");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-101);
                aa2.d().writeUTF((String)object);
                aa2.d().writeByte(1);
                this.b(aa2);
                aa2 = null;
                return;
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                if (aa2 != null) {
                    aa2.e();
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            if (aa2 != null) {
                aa2.e();
            }
            throw throwable;
        }
    }

    public final void f(byte by2) {
        dq.c("request magic tree");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-34);
                aa2.d().writeByte(2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(int n2, int n3) {
        aa aa2 = null;
        try {
            try {
                int n4 = 16;
                aa aa3 = new aa(-30);
                aa3.d().writeByte(16);
                aa2 = aa3;
                aa2.d().writeByte(n2);
                aa2.d().writeShort(n3);
                dq.c("g\u1eedi t\u0103ng ti\u1ec1m n\u0103ng NUM= " + n3 + " type= " + n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(byte by2, eq object) {
        dq.c("request resource action= " + by2);
        object = null;
        try {
            try {
                object = new aa(-74);
                ((aa)object).d().writeByte(by2);
                if (eb.b().d() && !eb.b().e) {
                    this.f = eb.b();
                } else {
                    e = true;
                    this.f = eb.a();
                }
                this.f.a((aa)object);
                this.f = eb.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                ((aa)object).e();
                return;
            }
        }
        finally {
            ((aa)object).e();
        }
    }

    public final void v(int n2) {
        dq.c("request magic tree");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-91);
                aa2.d().writeByte(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void y() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-107);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(String object, byte by2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-96);
                aa2.d().writeUTF((String)object);
                aa2.d().writeByte(by2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void w(int n2) {
        dq.c("GUI THACH DAUA");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-118);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(byte by2, int n2) {
        dq.c("add friend");
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-99);
                aa2.d().writeByte(by2);
                if (by2 == 1 || by2 == 2) {
                    aa2.d().writeInt(n2);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, int n2, byte by3, int n3, int n4) {
        aa aa2 = null;
        try {
            try {
                dq.c("ki gui action= " + by2 + " item id= " + n2);
                aa2 = new aa(-100);
                aa2.d().writeByte(by2);
                if (by2 == 0) {
                    aa2.d().writeShort(n2);
                    aa2.d().writeByte(by3);
                    aa2.d().writeInt(n3);
                    aa2.d().writeInt(n4);
                    dq.c("ki gui so luong " + n4);
                }
                if (by2 == 1 || by2 == 2) {
                    aa2.d().writeShort(n2);
                }
                if (by2 == 3) {
                    aa2.d().writeShort(n2);
                    aa2.d().writeByte(by3);
                    aa2.d().writeInt(n3);
                }
                if (by2 == 4) {
                    aa2.d().writeByte(by3);
                    aa2.d().writeByte(n3);
                    dq.c("currTab= " + by3 + " page= " + n3);
                }
                if (by2 == 5) {
                    aa2.d().writeShort(n2);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(byte by2, byte by3) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-103);
                aa2.d().writeByte(by2);
                dq.c("------------service--  " + by2 + "   " + by3);
                if (by2 != 0) {
                    aa2.d().writeByte(by3);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void x(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-104);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void g(byte by2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-108);
                aa2.d().writeByte(by2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void z() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-105);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void h(byte by2) {
        aa aa2 = null;
        try {
            try {
                dq.c("FUNSION");
                aa2 = new aa(125);
                aa2.d().writeByte(by2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(eq eq2) {
        aa aa2 = null;
        try {
            try {
                dq.c("IMAGE SOURCE size= " + eq2.size());
                aa2 = new aa(-111);
                aa2.d().writeShort(eq2.size());
                if (eq2.size() > 0) {
                    int n2 = 0;
                    while (n2 < eq2.size()) {
                        dq.c("gui len str " + ((cz)eq2.elementAt((int)n2)).a);
                        aa2.d().writeUTF(((cz)eq2.elementAt((int)n2)).a);
                        ++n2;
                    }
                }
                if (eb.b().d() && !eb.b().e) {
                    this.f = eb.b();
                } else {
                    this.f = eb.a();
                    e = true;
                }
                this.f.a(aa2);
                this.f = eb.a();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, int n2, byte[] byArray) {
        aa aa2 = null;
        try {
            try {
                dq.c("SERVER DATA");
                aa2 = new aa(-110);
                aa2.d().writeByte(1);
                aa2.d().writeInt(n2);
                if (byArray != null) {
                    n2 = byArray.length;
                    aa2.d().writeShort(n2);
                    aa2.d().write(byArray, 0, n2);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte[] byArray) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-113);
                int n2 = 0;
                while (n2 < cw.bb.length) {
                    aa2.d().writeByte(byArray[n2]);
                    ++n2;
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void A() {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-114);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void y(int n2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-30);
                aa2.d().writeByte(63);
                aa2.d().writeInt(n2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(int n2, short s2) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-30);
                aa2.d().writeByte(64);
                aa2.d().writeInt(n2);
                aa2.d().writeShort(s2);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void g(String object) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(66);
                aa2.d().writeUTF((String)object);
                dq.c(">>>getGetImgByName = " + (String)object);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void c(byte by2, byte by3) {
        aa aa2 = new aa(-127);
        try {
            try {
                aa2.d().writeByte(by2);
                if (by3 > 0) {
                    aa2.d().writeByte(by3);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void b(int n2, int n3) {
        aa aa2 = new aa(127);
        try {
            try {
                aa2.d().writeByte(n2);
                if (n3 != -1) {
                    aa2.d().writeShort(n3);
                }
                this.f.a(aa2);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void B() {
        aa aa2 = new aa(69);
        try {
            try {
                this.f.a(aa2);
            }
            catch (Exception exception) {
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void a(byte by2, byte by3, short s2, short s3) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(-45);
                aa2.d().writeByte(20);
                aa2.d().writeByte(by2);
                aa2.d().writeShort(co.m().N);
                aa2.d().writeShort(co.m().O);
                aa2.d().writeByte(by3);
                aa2.d().writeShort(s2);
                aa2.d().writeShort(s3);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }

    public final void d(byte by2, byte by3) {
        aa aa2 = null;
        try {
            try {
                aa2 = new aa(24);
                aa2.d().writeByte(by2);
                aa2.d().writeByte(by3);
                dq.b(" =====> SEND OPTION_HAT " + by2 + "_" + by3);
                this.f.a(aa2);
            }
            catch (Exception exception) {
                aa2.e();
                return;
            }
        }
        finally {
            aa2.e();
        }
    }
}

