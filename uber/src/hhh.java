// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rds.feature.trip.TripDetailsActivity;

public final class hhh
    implements hhy
{

    static final boolean a;
    private hzb b;
    private hsr c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;

    private hhh(hhi hhi1)
    {
        if (!a && hhi1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(hhi1);
            return;
        }
    }

    hhh(hhi hhi1, byte byte0)
    {
        this(hhi1);
    }

    public static hhi a()
    {
        return new hhi((byte)0);
    }

    private void a(hhi hhi1)
    {
        b = hcc.a(hhi.a(hhi1));
        c = hbq.a(hsu.a(), b);
        d = hbu.a(hhi.a(hhi1));
        e = hcf.a(hhi.a(hhi1));
        f = hcd.a(hhi.a(hhi1));
        g = hhz.a(c, d, e, f);
    }

    public final void a(TripDetailsActivity tripdetailsactivity)
    {
        g.injectMembers(tripdetailsactivity);
    }

    static 
    {
        boolean flag;
        if (!hhh.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
