// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.TripFragment;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;

public final class frm
    implements ide
{

    final TripFragment a;

    private frm(TripFragment tripfragment)
    {
        a = tripfragment;
        super();
    }

    public frm(TripFragment tripfragment, byte byte0)
    {
        this(tripfragment);
    }

    private void a(frn frn1)
    {
        a.M.n();
        a.N.b();
        a.U.b();
        a.Y.b();
        a.X.a();
        frn1 = dre.a(frn1.d, (Eyeball)frn1.e.d(), (Trip)frn1.f.d());
        if (frn1 != null)
        {
            TripFragment.a(a, frn1);
        }
        TripFragment.d(a);
        TripFragment.e(a);
    }

    public final void call(Object obj)
    {
        a((frn)obj);
    }
}
