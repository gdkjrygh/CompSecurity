// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class djl
    implements hst
{

    static final boolean a;
    private final djh b;

    private djl(djh djh1)
    {
        if (!a && djh1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = djh1;
            return;
        }
    }

    public static hst a(djh djh1)
    {
        return new djl(djh1);
    }

    private static drt b()
    {
        return djh.a();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!djl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
