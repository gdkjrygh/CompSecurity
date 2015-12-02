// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddi
    implements hst
{

    static final boolean a;
    private final ddc b;
    private final hzb c;
    private final hzb d;

    private ddi(ddc ddc1, hzb hzb1, hzb hzb2)
    {
        if (!a && ddc1 == null)
        {
            throw new AssertionError();
        }
        b = ddc1;
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

    public static hst a(ddc ddc1, hzb hzb1, hzb hzb2)
    {
        return new ddi(ddc1, hzb1, hzb2);
    }

    private cin b()
    {
        return ddc.a((chx)c.a(), (dao)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddi.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
