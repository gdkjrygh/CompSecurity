// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dfm
    implements hst
{

    static final boolean a;
    private final dfe b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private dfm(dfe dfe1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && dfe1 == null)
        {
            throw new AssertionError();
        }
        b = dfe1;
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
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hst a(dfe dfe1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new dfm(dfe1, hzb1, hzb2, hzb3);
    }

    private czq b()
    {
        return b.a((daj)c.a(), (dpg)d.a(), (hkr)e.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dfm.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
