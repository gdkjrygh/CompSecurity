// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.promo.RealtimeTripBalancesAdapter;
import com.ubercab.client.feature.payment.promo.TripBalancesFragment;
import com.ubercab.rider.realtime.model.Client;

public final class evh
    implements ide
{

    final TripBalancesFragment a;

    private evh(TripBalancesFragment tripbalancesfragment)
    {
        a = tripbalancesfragment;
        super();
    }

    public evh(TripBalancesFragment tripbalancesfragment, byte byte0)
    {
        this(tripbalancesfragment);
    }

    private void a(Client client)
    {
        TripBalancesFragment.a(a);
        a.i.a(client.getTripBalances());
    }

    public final void call(Object obj)
    {
        a((Client)obj);
    }
}
