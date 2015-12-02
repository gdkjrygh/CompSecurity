// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rds.feature.trip.TripProblemActivity;

public final class hhp
    implements hin
{

    static final boolean a;
    private hzb b;
    private hsr c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hsr g;

    private hhp(hhq hhq1)
    {
        if (!a && hhq1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(hhq1);
            return;
        }
    }

    hhp(hhq hhq1, byte byte0)
    {
        this(hhq1);
    }

    public static hhq a()
    {
        return new hhq((byte)0);
    }

    private void a(hhq hhq1)
    {
        b = hcc.a(hhq.a(hhq1));
        c = hbq.a(hsu.a(), b);
        d = hbu.a(hhq.a(hhq1));
        e = hcd.a(hhq.a(hhq1));
        f = hcf.a(hhq.a(hhq1));
        g = hio.a(c, d, e, f);
    }

    public final void a(TripProblemActivity tripproblemactivity)
    {
        g.injectMembers(tripproblemactivity);
    }

    static 
    {
        boolean flag;
        if (!hhp.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
