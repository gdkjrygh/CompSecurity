// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.network.PaymentApi;

public final class dhc
    implements hst
{

    static final boolean a;
    private final dfq b;
    private final hzb c;
    private final hzb d;

    private dhc(dfq dfq1, hzb hzb1, hzb hzb2)
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
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(dfq dfq1, hzb hzb1, hzb hzb2)
    {
        return new dhc(dfq1, hzb1, hzb2);
    }

    private PaymentApi b()
    {
        Object obj = (grs)c.a();
        d.a();
        obj = dfq.b(((grs) (obj)));
        if (obj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ((PaymentApi) (obj));
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dhc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
