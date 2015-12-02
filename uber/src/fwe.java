// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fwe extends Enum
    implements hst
{

    public static final fwe a;
    private static final fwe b[];

    private fwe(String s)
    {
        super(s, 0);
    }

    public static hst b()
    {
        return a;
    }

    private static fwd c()
    {
        return new fwd();
    }

    public static fwe valueOf(String s)
    {
        return (fwe)Enum.valueOf(fwe, s);
    }

    public static fwe[] values()
    {
        return (fwe[])b.clone();
    }

    public final Object a()
    {
        return c();
    }

    static 
    {
        a = new fwe("INSTANCE");
        b = (new fwe[] {
            a
        });
    }
}
