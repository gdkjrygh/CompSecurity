// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.PaytmOrCcFragment;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;

public final class etz
    implements ide
{

    final PaytmOrCcFragment a;

    private etz(PaytmOrCcFragment paytmorccfragment)
    {
        a = paytmorccfragment;
        super();
    }

    public etz(PaytmOrCcFragment paytmorccfragment, byte byte0)
    {
        this(paytmorccfragment);
    }

    private void a(Client client)
    {
        a.j = client.getEmail();
        a.k = client.getMobileDigits();
        boolean flag;
        if (client.getPaymentProfiles() != null && gki.b(client.getPaymentProfiles(), new gka() {

        final etz a;

        private static boolean a(PaymentProfile paymentprofile)
        {
            return dui.b(paymentprofile);
        }

        public final boolean apply(Object obj)
        {
            return a((PaymentProfile)obj);
        }

            
            {
                a = etz.this;
                super();
            }
    }))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PaytmOrCcFragment.a(a, flag);
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
