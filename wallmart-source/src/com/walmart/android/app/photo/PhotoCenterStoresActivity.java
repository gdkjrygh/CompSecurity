// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.photo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.config.WalmartStoreConfigurator;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.android.photo.model.user.UserPreferences;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderController;
import com.walmartlabs.storelocator.StorePickerListener;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.photo:
//            WalmartIntegration

public class PhotoCenterStoresActivity extends FullScreenActivity
{

    private static final String TAG = com/walmart/android/app/photo/PhotoCenterStoresActivity.getSimpleName();

    public PhotoCenterStoresActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSupportActionBar().setTitle(getString(0x7f0903d0));
        bundle = new StoreFinderController(this, getPresenterStack(), new WalmartStoreConfigurator(this));
        bundle.initFilteredPickerMode(new String[] {
            "Photo"
        });
        bundle.setStorePickerListener(new StorePickerListener() {

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
                        WLog.d(PhotoCenterStoresActivity.TAG, "Saving new selected photo store");
                        UserPreferences.get(PhotoCenterStoresActivity.this).setStore(walmartstore);
                    }
                }
                finish();
            }

            public volatile void onStoreClicked(StoreData storedata)
            {
                onStoreClicked((WalmartStore)storedata);
            }

            
            {
                this$0 = PhotoCenterStoresActivity.this;
                super();
            }
        });
        bundle.initLocation();
        bundle.setStorePickerTitle(getString(0x7f09059e));
        bundle.show(false);
        if (getPresenterStack().peek() == null)
        {
            finish();
        }
    }


}
