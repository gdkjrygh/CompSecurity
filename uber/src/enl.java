// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.AddPaymentFragment;
import com.ubercab.rider.realtime.model.Client;

public final class enl
    implements ide
{

    final AddPaymentFragment a;

    private enl(AddPaymentFragment addpaymentfragment)
    {
        a = addpaymentfragment;
        super();
    }

    public enl(AddPaymentFragment addpaymentfragment, byte byte0)
    {
        this(addpaymentfragment);
    }

    private void a(Client client)
    {
        if (AddPaymentFragment.a(a) == null)
        {
            AddPaymentFragment.a(a, client.getMobileCountryIso2());
        }
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
