// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

final class ewy
    implements Callback
{

    private final cev a;
    private final UberLatLng b;
    private final double c = 250D;

    ewy(cev cev1, UberLatLng uberlatlng)
    {
        a = cev1;
        b = uberlatlng;
    }

    private void a(GuidedPickupGeocodeRegion guidedpickupgeocoderegion, Response response)
    {
        a.c(new ews(b, c, guidedpickupgeocoderegion, response));
    }

    public final void failure(RetrofitError retrofiterror)
    {
        a.c(new ews(retrofiterror));
    }

    public final void success(Object obj, Response response)
    {
        a((GuidedPickupGeocodeRegion)obj, response);
    }
}
