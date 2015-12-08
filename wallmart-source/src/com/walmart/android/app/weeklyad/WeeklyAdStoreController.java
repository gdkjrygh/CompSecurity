// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.weeklyad;

import android.app.Activity;
import com.squareup.otto.Bus;
import com.walmart.android.config.WalmartStoreConfigurator;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreFinderController;
import com.walmartlabs.storelocator.StorePickerListener;

public class WeeklyAdStoreController extends StoreFinderController
{
    public static interface StoreSelectionListener
    {

        public abstract void onStoreSelected(WalmartStore walmartstore);
    }


    public WeeklyAdStoreController(final Activity activity, PresenterStack presenterstack, final StoreSelectionListener listener)
    {
        super(activity, presenterstack, new WalmartStoreConfigurator(activity));
        initPickerMode();
        setStorePickerListener(new StorePickerListener() {

            final WeeklyAdStoreController this$0;
            final Activity val$activity;
            final StoreSelectionListener val$listener;

            public void onCancelled()
            {
            }

            public void onStoreClicked(WalmartStore walmartstore)
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("makeMyStore")).putString("storeId", walmartstore.getId()));
                SharedPreferencesUtil.saveLocalAdStore(activity, walmartstore);
                if (listener != null)
                {
                    listener.onStoreSelected(walmartstore);
                }
            }

            public volatile void onStoreClicked(StoreData storedata)
            {
                onStoreClicked((WalmartStore)storedata);
            }

            
            {
                this$0 = WeeklyAdStoreController.this;
                activity = activity1;
                listener = storeselectionlistener;
                super();
            }
        });
        initLocation();
    }
}
