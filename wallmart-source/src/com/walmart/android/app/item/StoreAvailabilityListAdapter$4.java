// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.item.StoreItemModel;
import com.walmart.android.util.SharedPreferencesUtil;
import java.util.Comparator;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListAdapter

class this._cls0
    implements Comparator
{

    final StoreAvailabilityListAdapter this$0;

    public int compare(StoreItemModel storeitemmodel, StoreItemModel storeitemmodel1)
    {
        WalmartStore walmartstore;
        byte byte0;
        byte byte1;
        byte1 = 0;
        storeitemmodel = (WalmartStore)StoreAvailabilityListAdapter.access$800(StoreAvailabilityListAdapter.this).get(storeitemmodel.getStoreId());
        storeitemmodel1 = (WalmartStore)StoreAvailabilityListAdapter.access$800(StoreAvailabilityListAdapter.this).get(storeitemmodel1.getStoreId());
        walmartstore = SharedPreferencesUtil.getSavedLocalAdJsonStore(StoreAvailabilityListAdapter.access$900(StoreAvailabilityListAdapter.this));
        byte0 = byte1;
        if (walmartstore == null) goto _L2; else goto _L1
_L1:
        if (!walmartstore.getId().equals(storeitemmodel.getId())) goto _L4; else goto _L3
_L3:
        byte0 = -1;
_L2:
        byte1 = byte0;
        if (byte0 != 0) goto _L6; else goto _L5
_L5:
        if (((WalmartStore) (storeitemmodel)).distanceFromSource >= ((WalmartStore) (storeitemmodel1)).distanceFromSource) goto _L8; else goto _L7
_L7:
        byte1 = -1;
_L6:
        return byte1;
_L4:
        byte0 = byte1;
        if (walmartstore.getId().equals(storeitemmodel1.getId()))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        byte1 = byte0;
        if (((WalmartStore) (storeitemmodel)).distanceFromSource <= ((WalmartStore) (storeitemmodel1)).distanceFromSource) goto _L6; else goto _L9
_L9:
        return 1;
        if (true) goto _L2; else goto _L10
_L10:
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((StoreItemModel)obj, (StoreItemModel)obj1);
    }

    A()
    {
        this$0 = StoreAvailabilityListAdapter.this;
        super();
    }
}
