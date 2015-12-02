// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.PaymentFragment;
import com.ubercab.rider.realtime.model.Client;

public final class eqa
    implements ide
{

    final PaymentFragment a;

    private eqa(PaymentFragment paymentfragment)
    {
        a = paymentfragment;
        super();
    }

    public eqa(PaymentFragment paymentfragment, byte byte0)
    {
        this(paymentfragment);
    }

    private void a(Client client)
    {
        while (!a.k.n() || client == null) 
        {
            return;
        }
        PaymentFragment.a(a, client);
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
