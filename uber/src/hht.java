// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rds.feature.trip.TripReceiptActivity;

public final class hht
    implements hit
{

    static final boolean a;
    private hzb b;
    private hsr c;
    private hzb d;
    private hzb e;
    private hzb f;
    private hzb g;
    private hzb h;
    private hsr i;

    private hht(hhu hhu1)
    {
        if (!a && hhu1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(hhu1);
            return;
        }
    }

    hht(hhu hhu1, byte byte0)
    {
        this(hhu1);
    }

    public static hhu a()
    {
        return new hhu((byte)0);
    }

    private void a(hhu hhu1)
    {
        b = hcc.a(hhu.a(hhu1));
        c = hbq.a(hsu.a(), b);
        d = hbu.a(hhu.a(hhu1));
        e = hbv.a(hhu.a(hhu1));
        f = hca.a(hhu.a(hhu1));
        g = hcd.a(hhu.a(hhu1));
        h = hcf.a(hhu.a(hhu1));
        i = hiu.a(c, d, e, f, g, h);
    }

    public final void a(TripReceiptActivity tripreceiptactivity)
    {
        i.injectMembers(tripreceiptactivity);
    }

    static 
    {
        boolean flag;
        if (!hht.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
