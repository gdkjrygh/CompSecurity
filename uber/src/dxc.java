// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.vendor.google.now.GoogleNowApi;
import java.util.concurrent.ExecutorService;

public final class dxc
    implements hst
{

    static final boolean a;
    private final dxb b;
    private final hzb c;

    private dxc(dxb dxb1, hzb hzb1)
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
        return new dxc(dxb1, hzb1);
    }

    private GoogleNowApi b()
    {
        GoogleNowApi googlenowapi = dxb.a((ExecutorService)c.a());
        if (googlenowapi == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return googlenowapi;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dxc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
