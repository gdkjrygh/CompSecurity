// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gpo extends Enum
{

    public static final gpo a;
    public static final gpo b;
    private static final gpo c[];

    private gpo(String s, int i)
    {
        super(s, i);
    }

    public static gpo valueOf(String s)
    {
        return (gpo)Enum.valueOf(gpo, s);
    }

    public static gpo[] values()
    {
        return (gpo[])c.clone();
    }

    static 
    {
        a = new gpo("NON_EMPTY", 0);
        b = new gpo("LOCALE_AWARE", 1);
        c = (new gpo[] {
            a, b
        });
    }
}
