// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class fsq
    implements hst
{

    static final boolean a;
    private final frt b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;

    private fsq(frt frt1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5)
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
        }
        f = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        } else
        {
            g = hzb5;
            return;
        }
    }

    public static hst a(frt frt1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5)
    {
        return new fsq(frt1, hzb1, hzb2, hzb3, hzb4, hzb5);
    }

    private fiv b()
    {
        return frt.a((drc)c.a(), (hkr)d.a(), (RiderActivity)e.a(), (fim)f.a(), (fte)g.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fsq.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
