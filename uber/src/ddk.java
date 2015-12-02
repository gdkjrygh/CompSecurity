// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class ddk
    implements hst
{

    static final boolean a;
    private final ddj b;
    private final hzb c;

    private ddk(ddj ddj1, hzb hzb1)
    {
        if (!a && ddj1 == null)
        {
            throw new AssertionError();
        }
        b = ddj1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = hzb1;
            return;
        }
    }

    public static hst a(ddj ddj1, hzb hzb1)
    {
        return new ddk(ddj1, hzb1);
    }

    private cxs b()
    {
        return ddj.a((RiderActivity)c.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!ddk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
