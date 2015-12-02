// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.ubercab.client.feature.trip.TripFragment;
import com.ubercab.rider.realtime.response.FareEstimateResponse;

public final class fro
    implements icg
{

    final TripFragment a;

    private fro(TripFragment tripfragment)
    {
        a = tripfragment;
        super();
    }

    public fro(TripFragment tripfragment, byte byte0)
    {
        this(tripfragment);
    }

    private void a(FareEstimateResponse fareestimateresponse)
    {
        a.t.a(fareestimateresponse.getFareInfo());
        a.ad.a(fareestimateresponse.getSuggestedVehicleView());
        a.U.a(fareestimateresponse);
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((FareEstimateResponse)obj);
    }

    public final void a(Throwable throwable)
    {
        Toast.makeText(a.getActivity(), a.getString(0x7f070631), 0).show();
    }
}
