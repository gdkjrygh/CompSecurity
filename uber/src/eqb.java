// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.ArrearsView;
import com.ubercab.client.feature.payment.CreditsAdapter;
import com.ubercab.client.feature.payment.ExpenseAdapter;
import com.ubercab.client.feature.payment.PaymentFragment;
import com.ubercab.client.feature.payment.PaymentProfileAdapter;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Trip;

public final class eqb
    implements ide
{

    final PaymentFragment a;

    private eqb(PaymentFragment paymentfragment)
    {
        a = paymentfragment;
        super();
    }

    public eqb(PaymentFragment paymentfragment, byte byte0)
    {
        this(paymentfragment);
    }

    private void a(eqc eqc1)
    {
        Client client;
        if (a.k.n())
        {
            if ((client = eqc1.b) != null)
            {
                City city = (City)eqc1.a.d();
                ClientStatus clientstatus = eqc1.c;
                eqc1 = (Trip)eqc1.d.d();
                PaymentFragment.a(a).a(client, eqc1);
                if (PaymentFragment.b(a) == 3)
                {
                    PaymentFragment.c(a).a(client);
                } else
                if (PaymentFragment.b(a) != 4 && PaymentFragment.b(a) != 7 && !PaymentFragment.d(a) && city != null)
                {
                    boolean flag;
                    boolean flag1;
                    if (!"Looking".equals(clientstatus.getStatus()))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (eqc1 == null)
                    {
                        flag1 = false;
                    } else
                    {
                        flag1 = eqc1.getUseCredits();
                    }
                    a.p.a(city, flag, flag1, client.getCreditBalances());
                }
                if (PaymentFragment.e(a) != null && a.getActivity() != null)
                {
                    PaymentFragment.e(a).a(a.getActivity(), client);
                    return;
                }
            }
        }
    }

    public final void call(Object obj)
    {
        a((eqc)obj);
    }
}
