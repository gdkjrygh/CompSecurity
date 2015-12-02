// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.network.AlipayApi;

public final class dvj
    implements hst
{

    static final boolean a;
    private final dvh b;
    private final hzb c;
    private final hzb d;

    private dvj(dvh dvh1, hzb hzb1, hzb hzb2)
    {
        if (!a && dvh1 == null)
        {
            throw new AssertionError();
        }
        b = dvh1;
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

    public static hst a(dvh dvh1, hzb hzb1, hzb hzb2)
    {
        return new dvj(dvh1, hzb1, hzb2);
    }

    private djy b()
    {
        return dvh.a((cev)c.a(), (AlipayApi)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dvj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
