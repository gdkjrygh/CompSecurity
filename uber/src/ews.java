// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class ews extends dmx
{

    private UberLatLng a;
    private double b;

    public ews(UberLatLng uberlatlng, double d, GuidedPickupGeocodeRegion guidedpickupgeocoderegion, Response response)
    {
        super(guidedpickupgeocoderegion, response);
        a = uberlatlng;
        b = d;
    }

    public ews(RetrofitError retrofiterror)
    {
        super(retrofiterror);
    }

    public final UberLatLng a()
    {
        return a;
    }

    public final double b()
    {
        return b;
    }
}
