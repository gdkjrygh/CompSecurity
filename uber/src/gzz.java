// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gzz extends Enum
{

    public static final gzz a;
    public static final gzz b;
    private static final gzz c[];

    private gzz(String s, int i)
    {
        super(s, i);
    }

    public static gzz valueOf(String s)
    {
        return (gzz)Enum.valueOf(gzz, s);
    }

    public static gzz[] values()
    {
        return (gzz[])c.clone();
    }

    static 
    {
        a = new gzz("PRIVATE", 0);
        b = new gzz("PUBLIC", 1);
        c = (new gzz[] {
            a, b
        });
    }
}
