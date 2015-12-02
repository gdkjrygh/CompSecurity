// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.amex.AmexRewardInfoActivity;
import com.ubercab.rider.realtime.model.Client;

final class gga
    implements ide
{

    final gfy a;

    private gga(gfy gfy1)
    {
        a = gfy1;
        super();
    }

    gga(gfy gfy1, byte byte0)
    {
        this(gfy1);
    }

    private void a(Client client)
    {
        if (client != null)
        {
            if ((client = AmexRewardInfoActivity.a(client.getPaymentProfiles())) != null && !gfy.a(a))
            {
                gfy.b(a);
                a.startActivity(AmexRewardInfoActivity.a(a.getActivity(), client));
                return;
            }
        }
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
