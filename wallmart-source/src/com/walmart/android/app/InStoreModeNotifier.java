// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.otto.Bus;
import com.walmart.android.app.storelocator.LocationCompletedEvent;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.utils.WLog;

class InStoreModeNotifier
{

    private static final long MIN_TIME_BETWEEN_NOTIFICATIONS_PER_STORE = 0x5265c00L;
    private static final String SHARED_PREF = "in_store_mode";
    public static final String TAG = com/walmart/android/app/InStoreModeNotifier.getSimpleName();
    private final Context mContext;

    private InStoreModeNotifier(Context context)
    {
        mContext = context;
    }

    private boolean allowedToShowForStore(String s)
    {
        boolean flag = false;
        long l = mContext.getSharedPreferences("in_store_mode", 0).getLong(s, 0L);
        l = System.currentTimeMillis() - l;
        if (l > 0x5265c00L)
        {
            flag = true;
        }
        WLog.d(TAG, (new StringBuilder()).append(l).append(" seconds since last show. allowed=").append(flag).toString());
        return flag;
    }

    static void create(Context context)
    {
        (new InStoreModeNotifier(context)).init();
    }

    private Notification createNotification()
    {
        return null;
    }

    private void hideNotification()
    {
        ((NotificationManager)mContext.getSystemService("notification")).cancel(1);
    }

    private void init()
    {
        MessageBus.getBus().register(this);
    }

    private void showNotification(Notification notification, String s)
    {
        ((NotificationManager)mContext.getSystemService("notification")).notify(1, notification);
        mContext.getSharedPreferences("in_store_mode", 0).edit().putLong(s, System.currentTimeMillis()).apply();
    }

    public void onLocationCompletedEvent(LocationCompletedEvent locationcompletedevent)
    {
    }

}
