// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.network.AlipayApi;

public final class dvk
    implements hst
{

    static final boolean a;
    private final dvh b;
    private final hzb c;

    private dvk(dvh dvh1, hzb hzb1)
    {
        if (!a && dvh1 == null)
        {
            throw new AssertionError();
        }
        b = dvh1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dvh dvh1, hzb hzb1)
    {
        return new dvk(dvh1, hzb1);
    }

    private AlipayApi b()
    {
        AlipayApi alipayapi = dvh.a((grs)c.a());
        if (alipayapi == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return alipayapi;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dvk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
