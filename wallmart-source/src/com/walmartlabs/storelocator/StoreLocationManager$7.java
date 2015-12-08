// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.location.Location;
import com.walmartlabs.utils.LocationUtils;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreLocationManager

class val.location
    implements Runnable
{

    final StoreLocationManager this$0;
    final Location val$location;

    public void run()
    {
        WLog.i(StoreLocationManager.TAG, (new StringBuilder()).append("onLocationChanged: ").append(val$location).toString());
        if (StoreLocationManager.access$000(StoreLocationManager.this) == null)
        {
            return;
        }
        com.google.android.gms.maps.model.LatLng latlng = LocationUtils.locationToCoordinates(val$location);
        StoreLocationManager.access$1200(StoreLocationManager.this, latlng);
        for (Iterator iterator = goingRequest.access._mth800(StoreLocationManager.access$000(StoreLocationManager.this)).iterator(); iterator.hasNext(); ((cationCallback)iterator.next()).onFoundLocation(latlng, val$location)) { }
        StoreLocationManager.access$200(StoreLocationManager.this);
    }

    cationCallback()
    {
        this$0 = final_storelocationmanager;
        val$location = Location.this;
        super();
    }
}
