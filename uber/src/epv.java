// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.PaymentActivity;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.TripResponse;

public final class epv
    implements icg
{

    final PaymentActivity a;

    private epv(PaymentActivity paymentactivity)
    {
        a = paymentactivity;
        super();
    }

    public epv(PaymentActivity paymentactivity, byte byte0)
    {
        this(paymentactivity);
    }

    private void a(TripResponse tripresponse)
    {
        PaymentActivity.a(a, a.i.c(), tripresponse.getTrip(), true, null, false);
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
        com.ubercab.rider.realtime.model.Client client = a.i.c();
        com.ubercab.rider.realtime.model.Trip trip = a.i.f();
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
        PaymentActivity.a(a, client, trip, false, throwable, flag);
    }
}
