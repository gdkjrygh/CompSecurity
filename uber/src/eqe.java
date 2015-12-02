// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.ubercab.client.feature.payment.PaymentFragment;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.response.TripResponse;

public final class eqe
    implements icg
{

    final PaymentFragment a;

    private eqe(PaymentFragment paymentfragment)
    {
        a = paymentfragment;
        super();
    }

    public eqe(PaymentFragment paymentfragment, byte byte0)
    {
        this(paymentfragment);
    }

    private void a(TripResponse tripresponse)
    {
        if (a.m.f())
        {
            tripresponse = tripresponse.getTrip();
            if (tripresponse != null)
            {
                a.f.c(new erv(tripresponse.getUseCredits()));
            }
        }
    }

    public final void a()
    {
        a.e();
    }

    public final volatile void a(Object obj)
    {
        a((TripResponse)obj);
    }

    public final void a(Throwable throwable)
    {
        a.e();
        Toast.makeText(a.getActivity(), a.getString(0x7f070631), 0).show();
    }
}
