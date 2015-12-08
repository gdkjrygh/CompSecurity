// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.google.android.gms.maps.model.LatLng;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreLocationManager, StoreData

private class mClientCallback
    implements mClientCallback
{

    private final eived mClientCallback;
    final StoreLocationManager this$0;

    public void onFailure(int i)
    {
        WLog.v(StoreLocationManager.TAG, "NearbyStoresCallback onFailure");
        if (mClientCallback != null)
        {
            mClientCallback.mClientCallback(i);
        }
    }

    public void onStoresReceived(StoreData astoredata[])
    {
        WLog.v(StoreLocationManager.TAG, "NearbyStoresCallback onSuccess");
        if (astoredata != null && astoredata.length > 0)
        {
            StoreLocationManager.access$300(StoreLocationManager.this).clear();
            int j = astoredata.length;
            for (int i = 0; i < j; i++)
            {
                astoredata[i].setSourceCoordinates(StoreLocationManager.access$400(StoreLocationManager.this).latitude, StoreLocationManager.access$400(StoreLocationManager.this).longitude);
            }

            StoreLocationManager.access$300(StoreLocationManager.this).addAll(Arrays.asList(astoredata));
            StoreLocationManager.access$502(StoreLocationManager.this, StoreLocationManager.access$400(StoreLocationManager.this));
            WLog.v(StoreLocationManager.TAG, (new StringBuilder()).append(astoredata.length).append(" nearby stores added.").toString());
        }
        if (mClientCallback != null)
        {
            mClientCallback.eived(astoredata);
        }
    }

    public ( )
    {
        this$0 = StoreLocationManager.this;
        super();
        mClientCallback = ;
    }
}
