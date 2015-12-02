// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dju extends Enum
    implements gpu
{

    public static final dju a;
    public static final dju b;
    public static final dju c;
    public static final dju d;
    private static final dju e[];

    private dju(String s, int i)
    {
        super(s, i);
    }

    public static dju valueOf(String s)
    {
        return (dju)Enum.valueOf(dju, s);
    }

    public static dju[] values()
    {
        return (dju[])e.clone();
    }

    static 
    {
        a = new dju("NETWORK", 0);
        b = new dju("COLD_START_LOCATION", 1);
        c = new dju("COLD_START_PING", 2);
        d = new dju("COLD_START_BOOTSTRAP", 3);
        e = (new dju[] {
            a, b, c, d
        });
    }
}
