// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartLocationService

private static class location
{

    public LatLng coordinates;
    public Location location;

    public (LatLng latlng, Location location1)
    {
        coordinates = latlng;
        location = location1;
    }
}
