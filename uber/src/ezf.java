// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.response.TripResponse;

final class ezf
    implements icg
{

    final ezd a;

    private ezf(ezd ezd1)
    {
        a = ezd1;
        super();
    }

    ezf(ezd ezd1, byte byte0)
    {
        this(ezd1);
    }

    private void a(TripResponse tripresponse)
    {
        ezd.e(a);
        tripresponse = tripresponse.getTrip();
        if (tripresponse == null || ezd.i(a) == null)
        {
            ezd.h(a);
            return;
        } else
        {
            ezd.j(a).a(tripresponse.getPaymentProfileUUID());
            ezd.j(a).b(tripresponse.getUseCredits());
            ezd.j(a).a(tripresponse.getExpenseInfo());
            ezd.k(a).c(ezd.i(a));
            return;
        }
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
        String s = null;
        ezd.d(a);
        ezd.e(a);
        RealtimeError realtimeerror = ((Error)throwable).getRealtimeError();
        if (realtimeerror != null)
        {
            throwable = realtimeerror.getCode();
        } else
        {
            throwable = null;
        }
        if (realtimeerror != null)
        {
            s = realtimeerror.getMessage();
        }
        if ("rtapi.riders.select_rider_profile.out_of_policy".equals(throwable))
        {
            ezd.a(ezd.f(a), ezd.b(a));
            ezd.g(a).a(l.dt);
            return;
        }
        if (!TextUtils.isEmpty(s))
        {
            ezd.b(a).a_(s);
            return;
        } else
        {
            ezd.h(a);
            return;
        }
    }
}
