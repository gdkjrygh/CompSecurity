// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dqa
    implements hst
{

    static final boolean a;
    private final dpj b;
    private final hzb c;
    private final hzb d;

    private dqa(dpj dpj1, hzb hzb1, hzb hzb2)
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
        return new dqa(dpj1, hzb1, hzb2);
    }

    private hku b()
    {
        hku hku1 = dpj.a((hku)c.a(), (dpg)d.a());
        if (hku1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return hku1;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dqa.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
