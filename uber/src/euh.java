// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.paytm.PaytmWalletFragment;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.TextView;

public final class euh
    implements ide
{

    final PaytmWalletFragment a;

    private euh(PaytmWalletFragment paytmwalletfragment)
    {
        a = paytmwalletfragment;
        super();
    }

    public euh(PaytmWalletFragment paytmwalletfragment, byte byte0)
    {
        this(paytmwalletfragment);
    }

    private void a(Client client)
    {
        a.mTextViewNumber.setText(client.getMobile());
        if (client.getPaymentProfiles() == null && !a.j.h())
        {
            a.e.c(new eri());
        } else
        {
            client = client.findPaymentProfileByUuid(PaytmWalletFragment.a(a));
            if (client == null)
            {
                if (!a.j.h())
                {
                    a.e.c(new eri());
                    return;
                }
            } else
            {
                PaytmWalletFragment.a(a, client.getUuid());
                a.i.a(PaytmWalletFragment.b(a));
                return;
            }
        }
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
