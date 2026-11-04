/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.TextBox
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;
import main.a;

final class eu
implements CommandListener {
    private et a;
    private final TextBox b;

    eu(et et2, TextBox textBox) {
        this.a = et2;
        this.b = textBox;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (command.getLabel().equals(ch.bt)) {
            this.a.a(this.b.getString());
        }
        eg.a(GameMidlet.g);
        main.a.h.setFullScreenMode(true);
        this.a.h = true;
    }
}

