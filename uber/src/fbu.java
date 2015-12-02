// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fbu extends Enum
    implements hst
{

    public static final fbu a;
    private static final fbu b[];

    private fbu(String s)
    {
        super(s, 0);
    }

    public static hst b()
    {
        return a;
    }

    private static fbt c()
    {
        return new fbt();
    }

    public static fbu valueOf(String s)
    {
        return (fbu)Enum.valueOf(fbu, s);
    }

    public static fbu[] values()
    {
        return (fbu[])b.clone();
    }

    public final Object a()
    {
        return c();
    }

    static 
    {
        a = new fbu("INSTANCE");
        b = (new fbu[] {
            a
        });
    }
}
