// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;

public final class czm extends czr
{

    private final chp a;
    private final RiderActivity b;

    public czm(chp chp1, RiderActivity rideractivity)
    {
        a = chp1;
        b = rideractivity;
    }

    private void d()
    {
        cic cic = b.s();
        if (cic == null)
        {
            throw new RuntimeException("Events must be specified for every activity. If no impression events are desired, return RiderActivity#NO_ACTIVITY_IMPRESSION");
        }
        if (cic != RiderActivity.a)
        {
            a.a(cic);
        }
    }

    public final void b()
    {
        d();
    }
}
