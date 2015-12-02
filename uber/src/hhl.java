// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rds.feature.trip.TripHistoryActivity;

public final class hhl
    implements hie
{

    static final boolean a;
    private hzb b;
    private hsr c;
    private hzb d;
    private hsr e;

    private hhl(hhm hhm1)
    {
        if (!a && hhm1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(hhm1);
            return;
        }
    }

    hhl(hhm hhm1, byte byte0)
    {
        this(hhm1);
    }

    public static hhm a()
    {
        return new hhm((byte)0);
    }

    private void a(hhm hhm1)
    {
        b = hcc.a(hhm.a(hhm1));
        c = hbq.a(hsu.a(), b);
        d = hbu.a(hhm.a(hhm1));
        e = hif.a(c, d);
    }

    public final void a(TripHistoryActivity triphistoryactivity)
    {
        e.injectMembers(triphistoryactivity);
    }

    static 
    {
        boolean flag;
        if (!hhl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
