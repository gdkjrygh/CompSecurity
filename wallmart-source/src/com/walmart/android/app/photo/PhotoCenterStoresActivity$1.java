// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.photo;

import com.walmart.android.data.WalmartStore;
import com.walmartlabs.android.photo.model.user.UserPreferences;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StorePickerListener;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.photo:
//            PhotoCenterStoresActivity, WalmartIntegration

class this._cls0
    implements StorePickerListener
{

    final PhotoCenterStoresActivity this$0;

    public void onCancelled()
    {
    }

    public void onStoreClicked(WalmartStore walmartstore)
    {
        if (walmartstore != null && walmartstore.hasService("Photo"))
        {
            walmartstore = WalmartIntegration.fromWalmartStore(walmartstore);
            if (walmartstore != null)
            {
                WLog.d(PhotoCenterStoresActivity.access$000(), "Saving new selected photo store");
                UserPreferences.get(PhotoCenterStoresActivity.this).setStore(walmartstore);
            }
        }
        finish();
    }

    public volatile void onStoreClicked(StoreData storedata)
    {
        onStoreClicked((WalmartStore)storedata);
    }

    ()
    {
        this$0 = PhotoCenterStoresActivity.this;
        super();
    }
}
