/*
 * Decompiled with CFR 0.152.
 */
public final class ax {
    public static ep a = new ep("item template");

    public static void a(aw aw2) {
        a.put(new Short(aw2.a), aw2);
    }

    public static aw a(short s2) {
        return (aw)a.get(new Short(s2));
    }
}

