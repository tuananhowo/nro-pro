/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class ei {
    SocketConnection a;

    public ei(String string, int n2) {
        this.a = (SocketConnection)Connector.open((String)("socket://" + string + ":" + n2));
    }

    public final void a() {
        if (this.a != null) {
            this.a.close();
        }
    }
}

