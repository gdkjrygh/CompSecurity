// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mobileapptracker.MobileAppTracker;
import com.ubercab.client.core.network.SignupApi;

public final class dii
    implements hst
{

    static final boolean a;
    private final dfq b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;
    private final hzb h;
    private final hzb i;
    private final hzb j;
    private final hzb k;

    private dii(dfq dfq1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, 
            hzb hzb7, hzb hzb8, hzb hzb9)
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
        }
        g = hzb5;
        if (!a && hzb6 == null)
        {
            throw new AssertionError();
        }
        h = hzb6;
        if (!a && hzb7 == null)
        {
            throw new AssertionError();
        }
        i = hzb7;
        if (!a && hzb8 == null)
        {
            throw new AssertionError();
        }
        j = hzb8;
        if (!a && hzb9 == null)
        {
            throw new AssertionError();
        } else
        {
            k = hzb9;
            return;
        }
    }

    public static hst a(dfq dfq1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6, hzb hzb7, 
            hzb hzb8, hzb hzb9)
    {
        return new dii(dfq1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6, hzb7, hzb8, hzb9);
    }

    private dkr b()
    {
        return b.a((cev)c.a(), (hjn)d.a(), (cyy)e.a(), (dak)f.a(), (MobileAppTracker)g.a(), (dao)h.a(), (SignupApi)i.a(), (gju)j.a(), (chp)k.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dii.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
