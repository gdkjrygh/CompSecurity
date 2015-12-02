// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.faresplit.master.FareSplitInviteFragment;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.ui.TextView;

public final class ebu
    implements ide
{

    final FareSplitInviteFragment a;

    private ebu(FareSplitInviteFragment faresplitinvitefragment)
    {
        a = faresplitinvitefragment;
        super();
    }

    public ebu(FareSplitInviteFragment faresplitinvitefragment, byte byte0)
    {
        this(faresplitinvitefragment);
    }

    private void a(ebv ebv1)
    {
        City city = (City)ebv1.a.d();
        com.ubercab.rider.realtime.model.Client client = ebv1.b;
        if (city == null || client == null)
        {
            return;
        }
        Object obj = ebv1.c;
        Eyeball eyeball = (Eyeball)ebv1.d.d();
        ebv1 = (Trip)ebv1.e.d();
        obj = dre.a(((com.ubercab.rider.realtime.model.ClientStatus) (obj)), eyeball, ebv1);
        a.mTextViewFeeNotice.setText(city.getFareSplitFeeString());
        if (obj != null && FareSplitInviteFragment.b(a) != null)
        {
            FareSplitInviteFragment.b(a).a(((com.ubercab.rider.realtime.model.FareSplit) (obj)));
        }
        if (FareSplitInviteFragment.c(a) != null)
        {
            FareSplitInviteFragment.c(a).a(client, ((com.ubercab.rider.realtime.model.FareSplit) (obj)));
        }
        if (FareSplitInviteFragment.d(a) != null)
        {
            FareSplitInviteFragment.d(a).a(client);
        }
        FareSplitInviteFragment.a(a, city, ((com.ubercab.rider.realtime.model.FareSplit) (obj)), ebv1);
    }

    public final void call(Object obj)
    {
        a((ebv)obj);
    }
}
