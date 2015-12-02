// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hav extends Enum
{

    public static final hav a;
    public static final hav b;
    private static final hav c[];

    private hav(String s, int i)
    {
        super(s, i);
    }

    public static hav valueOf(String s)
    {
        return (hav)Enum.valueOf(hav, s);
    }

    public static hav[] values()
    {
        return (hav[])c.clone();
    }

    static 
    {
        a = new hav("BAIDU", 0);
        b = new hav("GOOGLE", 1);
        c = (new hav[] {
            a, b
        });
    }
}
