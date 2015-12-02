// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dqd
    implements hst
{

    static final boolean a;
    private final dpj b;
    private final hzb c;
    private final hzb d;

    private dqd(dpj dpj1, hzb hzb1, hzb hzb2)
    {
        if (!a && dpj1 == null)
        {
            throw new AssertionError();
        }
        b = dpj1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(dpj dpj1, hzb hzb1, hzb hzb2)
    {
        return new dqd(dpj1, hzb1, hzb2);
    }

    private dpb b()
    {
        return dpj.a((iir)c.a(), (iir)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dqd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
