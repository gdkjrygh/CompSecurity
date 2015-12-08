// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import com.walmart.android.app.storelocator.StoreDetailPresenter;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.storelocator.StoreData;

// Referenced classes of package com.walmart.android.fragments:
//            StoreFragment

class this._cls0
    implements com.walmartlabs.storelocator.oller.OnShowStoreDetailsListener
{

    final StoreFragment this$0;

    public void onShowStoreDetails(WalmartStore walmartstore)
    {
        walmartstore = new StoreDetailPresenter(getActivity(), walmartstore);
        StoreFragment.access$000(StoreFragment.this).pushPresenter(walmartstore, true);
    }

    public volatile void onShowStoreDetails(StoreData storedata)
    {
        onShowStoreDetails((WalmartStore)storedata);
    }

    ilPresenter()
    {
        this$0 = StoreFragment.this;
        super();
    }
}
