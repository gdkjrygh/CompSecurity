// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.data.WalmartStore;
import com.walmartlabs.storelocator.StoreData;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListAdapter

class this._cls0
    implements com.walmartlabs.storelocator.this._cls0
{

    final StoreAvailabilityListAdapter this$0;

    public void onFailure(int i)
    {
        if (StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this) != null)
        {
            StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this).onErrorLoadingStores(i);
        }
        StoreAvailabilityListAdapter.access$302(StoreAvailabilityListAdapter.this, false);
        StoreAvailabilityListAdapter.access$402(StoreAvailabilityListAdapter.this, true);
        notifyDataSetChanged();
        StoreAvailabilityListAdapter.access$500(StoreAvailabilityListAdapter.this);
    }

    public void onStoresReceived(WalmartStore awalmartstore[])
    {
        if (awalmartstore != null && awalmartstore.length > 0)
        {
            awalmartstore = new ArrayList(Arrays.asList(awalmartstore));
            StoreAvailabilityListAdapter.access$000(StoreAvailabilityListAdapter.this, awalmartstore);
            StoreAvailabilityListAdapter.access$100(StoreAvailabilityListAdapter.this, awalmartstore);
            return;
        }
        if (StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this) != null)
        {
            StoreAvailabilityListAdapter.access$200(StoreAvailabilityListAdapter.this).onErrorLoadingStoreAvailability(10000);
        }
        StoreAvailabilityListAdapter.access$302(StoreAvailabilityListAdapter.this, false);
        StoreAvailabilityListAdapter.access$402(StoreAvailabilityListAdapter.this, true);
        notifyDataSetChanged();
        StoreAvailabilityListAdapter.access$500(StoreAvailabilityListAdapter.this);
    }

    public volatile void onStoresReceived(StoreData astoredata[])
    {
        onStoresReceived((WalmartStore[])astoredata);
    }

    oreAvailabilityListener()
    {
        this$0 = StoreAvailabilityListAdapter.this;
        super();
    }
}
