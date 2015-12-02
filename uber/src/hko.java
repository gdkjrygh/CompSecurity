// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.client.TripsApi;
import com.ubercab.rider.realtime.request.body.RateDriverBody;
import com.ubercab.rider.realtime.request.body.RiderSetInfoBody;
import com.ubercab.rider.realtime.request.param.Location;

public final class hko
{

    private final hjo a;

    private hko(hjo hjo1)
    {
        a = hjo1;
    }

    public static hko a(hjo hjo1)
    {
        return new hko(hjo1);
    }

    public final ica a(String s)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/TripsApi).a(new _cls1(s)).a();
    }

    public final ica a(String s, int i, Integer integer, String s1, Location location)
    {
        integer = RateDriverBody.create(i).setFeedbackId(integer).setFeedback(s1).setTargetLocation(location);
        return a.a().a().a(com/ubercab/rider/realtime/client/TripsApi).a(new _cls8(s, integer)).b().a(new _cls7());
    }

    public final ica a(String s, com.ubercab.rider.realtime.model.Location location)
    {
        location = RiderSetInfoBody.create(location);
        return a.a().a().a(com/ubercab/rider/realtime/client/TripsApi).a(new _cls4(s, location)).b().a(new _cls3());
    }

    public final ica b(String s)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/TripsApi).a(new _cls5(s)).a();
    }

    public final ica c(String s)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/TripsApi).a(new _cls6(s)).a();
    }

    public final ica d(String s)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/TripsApi).a(new _cls2(s)).b().a(new _cls9());
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls9 {}

}
