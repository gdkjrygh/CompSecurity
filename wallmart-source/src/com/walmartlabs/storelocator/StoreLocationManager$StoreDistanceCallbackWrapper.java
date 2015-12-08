// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreLocationManager, StoreData

private class mCurrentLocation
    implements mCurrentLocation
{

    private final mCallback mCallback;
    private final LatLng mCurrentLocation;
    final StoreLocationManager this$0;

    public void onFailure(int i)
    {
        mCallback.mCallback(i);
    }

    public void onStoresReceived(StoreData astoredata[])
    {
        if (astoredata != null && mCurrentLocation != null)
        {
            int j = astoredata.length;
            for (int i = 0; i < j; i++)
            {
                astoredata[i].setSourceCoordinates(mCurrentLocation.latitude, mCurrentLocation.longitude);
            }

        }
        mCallback.mCallback(astoredata);
    }

    public ( , LatLng latlng)
    {
        this$0 = StoreLocationManager.this;
        super();
        mCallback = ;
        mCurrentLocation = latlng;
    }
}
