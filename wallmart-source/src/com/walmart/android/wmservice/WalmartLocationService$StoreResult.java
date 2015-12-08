// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.google.android.gms.maps.model.LatLng;
import com.walmart.android.data.WalmartStore;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

private static class timestamp
{

    private double latitude;
    private double longitude;
    private WalmartStore stores[];
    private long timestamp;

    public LatLng getLocation()
    {
        return new LatLng(latitude, longitude);
    }



    public ()
    {
    }

    public (LatLng latlng, WalmartStore awalmartstore[])
    {
        latitude = latlng.latitude;
        longitude = latlng.longitude;
        stores = awalmartstore;
        timestamp = System.currentTimeMillis();
    }
}
