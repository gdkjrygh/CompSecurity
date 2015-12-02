// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dhl
    implements hst
{

    static final boolean a;
    private final dfq b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;

    private dhl(dfq dfq1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        if (!a && dfq1 == null)
        {
            throw new AssertionError();
        }
        b = dfq1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        } else
        {
            f = hzb4;
            return;
        }
    }

    public static hst a(dfq dfq1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4)
    {
        return new dhl(dfq1, hzb1, hzb2, hzb3, hzb4);
    }

    private dol b()
    {
        return b.a((dom)c.a(), (hki)d.a(), (chp)e.a(), (gmg)f.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dhl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
