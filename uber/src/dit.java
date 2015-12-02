// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dit
    implements hst
{

    static final boolean a;
    private final dfq b;

    private dit(dfq dfq1)
    {
        if (!a && dfq1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = dfq1;
            return;
        }
    }

    public static hst a(dfq dfq1)
    {
        return new dit(dfq1);
    }

    private static cra b()
    {
        return dfq.B();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dit.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
