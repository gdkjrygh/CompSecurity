// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.storelocator;

import android.content.Context;
import com.squareup.otto.Bus;
import com.walmart.android.events.AppForegroundEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.WalmartLocationService;
import com.walmartlabs.msco.service.StoreModeEvent;

// Referenced classes of package com.walmart.android.app.storelocator:
//            LocationCompletedEvent, InStoreCriteria

public class WalmartStoreModeManager
{

    private static final long IN_STORE_CHECK_PERIOD = 0x927c0L;
    private static final long OUT_OF_STORE_CHECK_PERIOD = 60000L;
    private static final String TAG = com/walmart/android/app/storelocator/WalmartStoreModeManager.getSimpleName();
    private static WalmartStoreModeManager sInstance;
    private final Context mContext;
    private boolean mHasPendingLocation;
    private long mLastStoreCheck;
    private StoreModeEvent mLastStoreModeEvent;

    private WalmartStoreModeManager(Context context)
    {
        mLastStoreModeEvent = new StoreModeEvent();
        mContext = context;
    }

    public static WalmartStoreModeManager create(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new WalmartStoreModeManager(context);
            sInstance.init();
        }
        return sInstance;
    }

    public static void destroy()
    {
        if (sInstance != null)
        {
            MessageBus.getBus().unregister(sInstance);
            sInstance = null;
        }
    }

    private long getLocationCheckPeriod()
    {
        boolean flag;
        if (mLastStoreModeEvent != null && mLastStoreModeEvent.isInStore())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag ? 60000L : 0x927c0L;
    }

    private boolean isInStore(LocationCompletedEvent locationcompletedevent)
    {
        return locationcompletedevent.mClosestStoreData != null && InStoreCriteria.isInStore(locationcompletedevent.mAccuracy, locationcompletedevent.mDistanceFromStore);
    }

    private void probeClosestStore()
    {
        mLastStoreCheck = System.currentTimeMillis();
        mHasPendingLocation = true;
        WalmartLocationService.start(mContext);
    }

    private void trackAnalytics(LocationCompletedEvent locationcompletedevent)
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("instoreId");
        if (!locationcompletedevent.mLocationEnabled)
        {
            builder.putString("storeIdStatus", "notpermitted");
        } else
        if (locationcompletedevent.mClosestStoreData == null)
        {
            builder.putString("storeIdStatus", "unknown");
        } else
        if (mLastStoreModeEvent.isInStore())
        {
            builder.putString("storeIdStatus", "instore");
            builder.putInt("locationAccuracy", (int)Math.ceil(locationcompletedevent.mAccuracy));
            builder.putInt("storeIdDistance", (int)Math.ceil(locationcompletedevent.mDistanceFromStore));
            builder.putString("storeId", mLastStoreModeEvent.getStoreId());
        } else
        {
            String s;
            boolean flag;
            if (locationcompletedevent.mAccuracy <= 100F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                s = "notstore";
            } else
            {
                s = "inaccurate";
            }
            builder.putString("storeIdStatus", s);
            builder.putInt("locationAccuracy", (int)Math.ceil(locationcompletedevent.mAccuracy));
            builder.putInt("storeIdDistance", (int)Math.ceil(locationcompletedevent.mDistanceFromStore));
        }
        MessageBus.getBus().post(builder);
    }

    public StoreModeEvent getStoreModeEvent()
    {
        return mLastStoreModeEvent;
    }

    public void init()
    {
        MessageBus.getBus().register(this);
    }

    public void onAppForegroundEvent(AppForegroundEvent appforegroundevent)
    {
        if (System.currentTimeMillis() - mLastStoreCheck > getLocationCheckPeriod())
        {
            probeClosestStore();
        }
    }

    public void onLocationCompletedEvent(LocationCompletedEvent locationcompletedevent)
    {
        boolean flag;
        if (mHasPendingLocation || mLastStoreModeEvent.isInStore() != isInStore(locationcompletedevent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            mHasPendingLocation = false;
            if (isInStore(locationcompletedevent))
            {
                mLastStoreModeEvent = new StoreModeEvent(locationcompletedevent.mClosestStoreData);
            } else
            {
                mLastStoreModeEvent = new StoreModeEvent();
            }
            MessageBus.getBus().post(mLastStoreModeEvent);
            trackAnalytics(locationcompletedevent);
        }
    }

}
