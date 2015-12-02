// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dpu
    implements hst
{

    static final boolean a;
    private final dpj b;

    private dpu(dpj dpj1)
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
        return new dpu(dpj1);
    }

    private static hjk b()
    {
        hjk hjk = dpj.b();
        if (hjk == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hjk;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dpu.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
