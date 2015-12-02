// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dqq
    implements hst
{

    static final boolean a;
    private final dpj b;
    private final hzb c;

    private dqq(dpj dpj1, hzb hzb1)
    {
        if (!a && dpj1 == null)
        {
            throw new AssertionError();
        }
        b = dpj1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dpj dpj1, hzb hzb1)
    {
        return new dqq(dpj1, hzb1);
    }

    private hkn b()
    {
        hkn hkn = dpj.g((hjo)c.a());
        if (hkn == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hkn;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dqq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
