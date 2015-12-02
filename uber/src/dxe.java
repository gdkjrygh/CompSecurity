// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.vendor.google.now.RtNowApi;

public final class dxe
    implements hst
{

    static final boolean a;
    private final dxb b;
    private final hzb c;

    private dxe(dxb dxb1, hzb hzb1)
    {
        if (!a && dxb1 == null)
        {
            throw new AssertionError();
        }
        b = dxb1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(dxb dxb1, hzb hzb1)
    {
        return new dxe(dxb1, hzb1);
    }

    private RtNowApi b()
    {
        RtNowApi rtnowapi = dxb.a((grs)c.a());
        if (rtnowapi == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return rtnowapi;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dxe.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
