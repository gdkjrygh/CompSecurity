// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.TripResponse;

final class eze
    implements icg
{

    final ezd a;

    private eze(ezd ezd1)
    {
        a = ezd1;
        super();
    }

    eze(ezd ezd1, byte byte0)
    {
        this(ezd1);
    }

    private void a(TripResponse tripresponse)
    {
        a.a(ezd.c(a).c(), tripresponse.getTrip(), true, null, false);
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((TripResponse)obj);
    }

    public final void a(Throwable throwable)
    {
        com.ubercab.rider.realtime.model.Client client = ezd.c(a).c();
        com.ubercab.rider.realtime.model.Trip trip = ezd.c(a).f();
        RealtimeError realtimeerror = ((Error)throwable).getRealtimeError();
        boolean flag;
        if (realtimeerror != null)
        {
            throwable = realtimeerror.getMessage();
        } else
        {
            throwable = null;
        }
        if (realtimeerror != null && "rtapi.riders.select_payment_profile.out_of_policy".equals(realtimeerror.getCode()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.a(client, trip, false, throwable, flag);
    }
}
