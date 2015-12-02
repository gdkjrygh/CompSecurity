// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.rider.realtime.response.CancellationInfo;

public final class fqj
    implements icg
{

    final TripActivity a;

    private fqj(TripActivity tripactivity)
    {
        a = tripactivity;
        super();
    }

    public fqj(TripActivity tripactivity, byte byte0)
    {
        this(tripactivity);
    }

    private void a(CancellationInfo cancellationinfo)
    {
        a.u();
        TripActivity.a(a, cancellationinfo);
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((CancellationInfo)obj);
    }

    public final void a(Throwable throwable)
    {
        a.u();
        TripActivity.i(a);
    }
}
