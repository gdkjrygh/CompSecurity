// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.faresplit.master.FareSplitSummaryFragment;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;

public final class ecc
    implements ide
{

    final FareSplitSummaryFragment a;

    private ecc(FareSplitSummaryFragment faresplitsummaryfragment)
    {
        a = faresplitsummaryfragment;
        super();
    }

    public ecc(FareSplitSummaryFragment faresplitsummaryfragment, byte byte0)
    {
        this(faresplitsummaryfragment);
    }

    private void a(ecd ecd1)
    {
        FareSplitSummaryFragment.a(a, (City)ecd1.a.d(), ecd1.b, (Eyeball)ecd1.c.d(), (Trip)ecd1.d.d());
    }

    public final void call(Object obj)
    {
        a((ecd)obj);
    }
}
