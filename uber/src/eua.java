// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.PaytmOrCcFragment;
import com.ubercab.client.feature.payment.paytm.PaytmOtpActivity;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.response.CreatePaymentProfileResponse;

public final class eua
    implements icg
{

    final PaytmOrCcFragment a;

    private eua(PaytmOrCcFragment paytmorccfragment)
    {
        a = paytmorccfragment;
        super();
    }

    public eua(PaytmOrCcFragment paytmorccfragment, byte byte0)
    {
        this(paytmorccfragment);
    }

    private void a(CreatePaymentProfileResponse createpaymentprofileresponse)
    {
        a.e();
        a.startActivity(PaytmOtpActivity.a(a.d, createpaymentprofileresponse.getNewPaymentProfileUuid()));
        a.e.c(new erl());
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((CreatePaymentProfileResponse)obj);
    }

    public final void a(Throwable throwable)
    {
        a.e();
        throwable = ((Error)throwable).getRealtimeError();
        PaytmOrCcFragment paytmorccfragment = a;
        if (throwable != null)
        {
            throwable = throwable.getMessage();
        } else
        {
            throwable = a.getString(0x7f070631);
        }
        paytmorccfragment.c(throwable);
    }
}
