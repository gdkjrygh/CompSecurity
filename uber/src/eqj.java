// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eqj
    implements hst
{

    static final boolean a;
    private final eqg b;
    private final hzb c;

    private eqj(eqg eqg1, hzb hzb1)
    {
        if (!a && eqg1 == null)
        {
            throw new AssertionError();
        }
        b = eqg1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(eqg eqg1, hzb hzb1)
    {
        return new eqj(eqg1, hzb1);
    }

    private hkj b()
    {
        hkj hkj = eqg.a((hjo)c.a());
        if (hkj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hkj;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!eqj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
