// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class frz
    implements hst
{

    static final boolean a;
    private final frt b;
    private final hzb c;
    private final hzb d;

    private frz(frt frt1, hzb hzb1, hzb hzb2)
    {
        if (!a && frt1 == null)
        {
            throw new AssertionError();
        }
        b = frt1;
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

    public static hst a(frt frt1, hzb hzb1, hzb hzb2)
    {
        return new frz(frt1, hzb1, hzb2);
    }

    private fuk b()
    {
        return frt.a((cxu)c.a(), (hkr)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!frz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
