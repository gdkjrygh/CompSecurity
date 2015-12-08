// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.content.Context;
import android.text.TextUtils;
import com.arubanetworks.meridian.internal.util.Dev;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.storesearch.AisleLocations;
import com.walmart.android.service.storesearch.InStoreSearchService;
import com.walmart.android.service.storesearch.StoreMapMapping;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InStoreMapLoader
{
    public static interface AisleLoadCallback
    {

        public abstract void onAisleFailed();

        public abstract void onAisleLocations(AisleLocations aislelocations);
    }

    public static interface EnabledCallback
    {

        public abstract void onEnabled(String s);
    }


    private static final String TAG = com/walmart/android/app/shop/map/InStoreMapLoader.getSimpleName();
    private final boolean mOpenGLSupported;
    private final List mRequestsInFlight = new ArrayList();

    public InStoreMapLoader(Context context)
    {
        boolean flag;
        if (Dev.getOpenGLMajorVersion(context) >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mOpenGLSupported = flag;
    }

    public void cancel()
    {
        for (Iterator iterator = mRequestsInFlight.iterator(); iterator.hasNext(); ((Request)iterator.next()).cancel()) { }
    }

    public void load(final String storeId, final EnabledCallback enabledCallback)
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (mOpenGLSupported && appconfig != null && appconfig.storeMapPOC != null && appconfig.storeMapPOC.enabled && !TextUtils.isEmpty(appconfig.storeMapPOC.storeMapsIdsUrl))
        {
            mRequestsInFlight.add(Services.get().getInStoreSearchService().lookupStoreMapMappings(appconfig.storeMapPOC.storeMapsIdsUrl).addCallback(new CallbackSameThread() {

                final InStoreMapLoader this$0;
                final EnabledCallback val$enabledCallback;
                final String val$storeId;

                public void onResultSameThread(Request request, Result result)
                {
                    mRequestsInFlight.remove(request);
                    if (result.successful() && result.hasData())
                    {
                        request = ((StoreMapMapping)result.getData()).mapping;
                        if (request.get(storeId) != null)
                        {
                            enabledCallback.onEnabled((String)request.get(storeId));
                            return;
                        } else
                        {
                            WLog.e(InStoreMapLoader.TAG, (new StringBuilder()).append("Failed to load store id - map id mappings, no data for store ").append(storeId).toString());
                            enabledCallback.onEnabled(null);
                            return;
                        }
                    } else
                    {
                        WLog.e(InStoreMapLoader.TAG, "Failed to load store id - map id mappings");
                        enabledCallback.onEnabled(null);
                        return;
                    }
                }

            
            {
                this$0 = InStoreMapLoader.this;
                storeId = s;
                enabledCallback = enabledcallback;
                super();
            }
            }));
            return;
        } else
        {
            WLog.e(TAG, "Store map not enabled");
            enabledCallback.onEnabled(null);
            return;
        }
    }

    public void loadAisles(String s, final AisleLoadCallback aisleLoadCallback)
    {
        mRequestsInFlight.add(Services.get().getInStoreSearchService().lookupAisleLocations(s).addCallback(new CallbackSameThread() {

            final InStoreMapLoader this$0;
            final AisleLoadCallback val$aisleLoadCallback;

            public void onResultSameThread(Request request, Result result)
            {
                mRequestsInFlight.remove(request);
                if (result.successful() && result.hasData())
                {
                    aisleLoadCallback.onAisleLocations((AisleLocations)result.getData());
                    return;
                } else
                {
                    aisleLoadCallback.onAisleFailed();
                    return;
                }
            }

            
            {
                this$0 = InStoreMapLoader.this;
                aisleLoadCallback = aisleloadcallback;
                super();
            }
        }));
    }



}
