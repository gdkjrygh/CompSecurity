// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dpx
    implements hst
{

    static final boolean a;
    private final dpj b;

    private dpx(dpj dpj1)
    {
        if (!a && dpj1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = dpj1;
            return;
        }
    }

    public static hst a(dpj dpj1)
    {
        return new dpx(dpj1);
    }

    private static hjm b()
    {
        return dpj.c();
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dpx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
