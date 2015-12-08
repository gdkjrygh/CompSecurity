// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.location.Location;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreLocationManager

public static interface 
{

    public static final int ERROR_CANCELLED = 2;
    public static final int ERROR_PROVIDER_NOT_ENABLED = 1;
    public static final int ERROR_TIMEOUT = 3;

    public abstract void onError(int i);

    public abstract void onError(ConnectionResult connectionresult);

    public abstract void onFoundLocation(LatLng latlng, Location location);

    public abstract void onStarted();
}
