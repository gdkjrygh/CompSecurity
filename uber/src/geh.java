// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class geh extends Enum
{

    public static final geh a;
    public static final geh b;
    public static final geh c;
    private static final geh d[];

    private geh(String s, int i)
    {
        super(s, i);
    }

    public static geh valueOf(String s)
    {
        return (geh)Enum.valueOf(geh, s);
    }

    public static geh[] values()
    {
        return (geh[])d.clone();
    }

    static 
    {
        a = new geh("GROUPS", 0);
        b = new geh("PARENTS", 1);
        c = new geh("NONE", 2);
        d = (new geh[] {
            a, b, c
        });
    }
}
