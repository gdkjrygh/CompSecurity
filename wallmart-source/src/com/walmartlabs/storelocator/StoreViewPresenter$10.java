// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.util.Log;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter, StoreManager, StoreMapController, StoreListController, 
//            StoreData

class val.hasItemRestrictions
    implements Callback
{

    final StoreViewPresenter this$0;
    final boolean val$hasItemRestrictions;
    final LatLng val$location;
    final boolean val$moveMapToShowStoresAround;
    final LatLng val$newCenter;
    final boolean val$showClosestStore;

    public void onFailure(int i)
    {
        if (StoreViewPresenter.access$1100(StoreViewPresenter.this))
        {
            return;
        }
        StoreViewPresenter.access$2202(StoreViewPresenter.this, null);
        Log.w(StoreViewPresenter.TAG, "failed to load stores!");
        StoreViewPresenter.access$1400(StoreViewPresenter.this);
        if (i == 0x15f92)
        {
            showDialog(600);
            return;
        } else
        {
            showDialog(9);
            return;
        }
    }

    public void onStoresReceived(StoreData astoredata[])
    {
        if (StoreViewPresenter.access$1100(StoreViewPresenter.this))
        {
            return;
        }
        StoreViewPresenter.access$1400(StoreViewPresenter.this);
        if (val$newCenter != null)
        {
            StoreViewPresenter.access$2202(StoreViewPresenter.this, val$newCenter);
        }
        StoreViewPresenter.access$500(StoreViewPresenter.this).setStores(astoredata);
        if (StoreViewPresenter.access$500(StoreViewPresenter.this).size() == 0 && astoredata.length > 0)
        {
            clearFilterAndShowDialog();
            StoreViewPresenter.access$500(StoreViewPresenter.this).setStores(astoredata);
        }
        if (!StoreViewPresenter.access$2300(StoreViewPresenter.this))
        {
            StoreViewPresenter.access$2000(StoreViewPresenter.this).reloadStoreData();
            StoreViewPresenter.access$2000(StoreViewPresenter.this).setLocation(val$location, val$moveMapToShowStoresAround);
        }
        StoreViewPresenter.access$1800(StoreViewPresenter.this).setLocation(val$location);
        StoreViewPresenter.access$1800(StoreViewPresenter.this).onMapStoresLoaded();
        if (StoreViewPresenter.access$500(StoreViewPresenter.this).size() <= 0) goto _L2; else goto _L1
_L1:
        if (val$showClosestStore && !StoreViewPresenter.access$2300(StoreViewPresenter.this))
        {
            StoreViewPresenter.access$2400(StoreViewPresenter.this);
        }
        astoredata = StoreViewPresenter.access$500(StoreViewPresenter.this).getClosestStore();
        if (StoreViewPresenter.access$2500(StoreViewPresenter.this) == null) goto _L4; else goto _L3
_L3:
        if (StoreViewPresenter.access$2600(StoreViewPresenter.this) == null) goto _L6; else goto _L5
_L5:
        StoreViewPresenter.access$2500(StoreViewPresenter.this).onClosestStoreFound(StoreViewPresenter.access$2600(StoreViewPresenter.this), astoredata);
_L4:
        StoreViewPresenter.access$2700(StoreViewPresenter.this);
        return;
_L6:
        if (StoreViewPresenter.access$2200(StoreViewPresenter.this) != null)
        {
            StoreViewPresenter.access$2500(StoreViewPresenter.this).onClosestStoreFound(StoreViewPresenter.access$2200(StoreViewPresenter.this).latitude, StoreViewPresenter.access$2200(StoreViewPresenter.this).longitude, astoredata);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (val$hasItemRestrictions)
        {
            showDialog(11);
        } else
        {
            showDialog(7);
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    ClosestStoreFoundListener()
    {
        this$0 = final_storeviewpresenter;
        val$newCenter = latlng;
        val$location = latlng1;
        val$moveMapToShowStoresAround = flag;
        val$showClosestStore = flag1;
        val$hasItemRestrictions = Z.this;
        super();
    }
}
