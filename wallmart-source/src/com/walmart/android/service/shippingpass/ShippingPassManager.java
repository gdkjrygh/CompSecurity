// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.shippingpass;

import android.content.Context;
import com.squareup.otto.Bus;
import com.walmart.android.events.AppForegroundEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;

public class ShippingPassManager
{

    private static final String TAG = com/walmart/android/service/shippingpass/ShippingPassManager.getSimpleName();
    private static ShippingPassManager sInstance;
    private Context mContext;

    public ShippingPassManager(Context context)
    {
        mContext = context;
    }

    public static ShippingPassManager create(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new ShippingPassManager(context.getApplicationContext());
            sInstance.init();
        }
        return sInstance;
    }

    public static void destroy()
    {
        if (sInstance != null)
        {
            sInstance.onDestroy();
            sInstance = null;
        }
    }

    public static ShippingPassManager get()
    {
        return sInstance;
    }

    public void clearPendingRefreshFlag()
    {
        SharedPreferencesUtil.setShippingPassPendingRefresh(mContext, false);
    }

    public boolean hasPendingRefresh()
    {
        return SharedPreferencesUtil.getShippingPassPendingRefresh(mContext);
    }

    public void init()
    {
        MessageBus.getBus().register(this);
    }

    public void onAppForegroundEvent(AppForegroundEvent appforegroundevent)
    {
        if (hasPendingRefresh())
        {
            clearPendingRefreshFlag();
            Services.get().getAuthentication().renewSession(true, new com.walmart.android.wmservice.Authentication.AuthCallback() {

                final ShippingPassManager this$0;

                public void onFailure(int i)
                {
                    WLog.d(ShippingPassManager.TAG, "onFailure(): Failed to refresh ShippingPass status");
                }

                public void onSuccess()
                {
                    WLog.d(ShippingPassManager.TAG, "onSuccess(): ShippingPass status refreshed");
                }

            
            {
                this$0 = ShippingPassManager.this;
                super();
            }
            });
        }
    }

    public void onDestroy()
    {
        MessageBus.getBus().unregister(this);
    }

    public void setPendingRefreshFlag()
    {
        SharedPreferencesUtil.setShippingPassPendingRefresh(mContext, true);
    }


}
