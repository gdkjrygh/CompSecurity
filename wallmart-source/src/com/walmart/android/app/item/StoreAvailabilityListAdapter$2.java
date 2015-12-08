// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.location.Location;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.LatLng;
import com.walmartlabs.storelocator.StoreLocationManager;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListAdapter

class llbackAdapter extends com.walmartlabs.storelocator.llbackAdapter
{

    final StoreAvailabilityListAdapter this$0;
    final com.walmartlabs.storelocator.val.callback val$callback;

    public void onError(int i)
    {
        if (StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this) != null)
        {
            StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this).onErrorRequestingLocation(i);
        }
        StoreAvailabilityListAdapter.access$302(StoreAvailabilityListAdapter.this, false);
        StoreAvailabilityListAdapter.access$402(StoreAvailabilityListAdapter.this, true);
        notifyDataSetChanged();
        StoreAvailabilityListAdapter.access$500(StoreAvailabilityListAdapter.this);
    }

    public void onError(ConnectionResult connectionresult)
    {
        if (StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this) != null)
        {
            StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this).onErrorRequestingLocation(connectionresult);
        }
        StoreAvailabilityListAdapter.access$302(StoreAvailabilityListAdapter.this, false);
        StoreAvailabilityListAdapter.access$402(StoreAvailabilityListAdapter.this, true);
        notifyDataSetChanged();
        StoreAvailabilityListAdapter.access$500(StoreAvailabilityListAdapter.this);
    }

    public void onFoundLocation(LatLng latlng, Location location)
    {
        StoreAvailabilityListAdapter.access$600(StoreAvailabilityListAdapter.this).loadNearbyStores(val$callback);
    }

    oreAvailabilityListener()
    {
        this$0 = final_storeavailabilitylistadapter;
        val$callback = com.walmartlabs.storelocator.val.callback.this;
        super();
    }
}
