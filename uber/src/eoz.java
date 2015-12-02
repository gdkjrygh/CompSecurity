// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eoz extends Enum
    implements hst
{

    public static final eoz a;
    private static final eoz b[];

    private eoz(String s)
    {
        super(s, 0);
    }

    public static hst b()
    {
        return a;
    }

    private static eoy c()
    {
        return new eoy();
    }

    public static eoz valueOf(String s)
    {
        return (eoz)Enum.valueOf(eoz, s);
    }

    public static eoz[] values()
    {
        return (eoz[])b.clone();
    }

    public final Object a()
    {
        return c();
    }

    static 
    {
        a = new eoz("INSTANCE");
        b = (new eoz[] {
            a
        });
    }
}
