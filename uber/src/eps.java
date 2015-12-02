// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.PaymentActivity;
import com.ubercab.rider.realtime.model.ClientStatus;

public final class eps
    implements ide
{

    final PaymentActivity a;

    private eps(PaymentActivity paymentactivity)
    {
        a = paymentactivity;
        super();
    }

    public eps(PaymentActivity paymentactivity, byte byte0)
    {
        this(paymentactivity);
    }

    private void a(ClientStatus clientstatus)
    {
        clientstatus = clientstatus.getStatus();
        if ("com.ubercab.SELECT_PAYMENT".equals(PaymentActivity.a(a)) && !"Looking".equals(clientstatus))
        {
            a.setResult(0);
            a.finish();
        } else
        if ("com.ubercab.CHANGE_PAYMENT".equals(PaymentActivity.a(a)) && !"WaitingForPickup".equals(clientstatus) && !"OnTrip".equals(clientstatus))
        {
            a.setResult(0);
            a.finish();
            return;
        }
    }

    public final void call(Object obj)
    {
        a((ClientStatus)obj);
    }
}
