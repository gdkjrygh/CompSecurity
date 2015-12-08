// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.squareup.otto.Bus;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.AppForegroundEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.CapabilityUtils;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;

public class LaunchAndForegroundEventHelper
{

    private static final String TAG = com/walmart/android/app/main/LaunchAndForegroundEventHelper.getSimpleName();
    private Context mContext;
    private boolean mHasSentTestEvent;

    public LaunchAndForegroundEventHelper(Context context)
    {
        mContext = context.getApplicationContext();
    }

    private static boolean isWifiConnected(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1);
        return context != null && context.isConnected();
    }

    private void sendEvent(boolean flag)
    {
        String s;
        boolean flag1;
        boolean flag2;
        WLog.d(TAG, "sendLaunchOrForegroundEvent");
        flag1 = SharedPreferencesUtil.isPromotionNotificationsEnabled(mContext);
        flag2 = SharedPreferencesUtil.hasStoreInfo(mContext);
        s = "Unknown";
        String s1 = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionName;
        s = s1;
_L1:
        Object obj;
        if (!flag)
        {
            obj = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("foreground");
        } else
        {
            obj = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("launch");
            ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putBoolean("wifi", isWifiConnected(mContext));
            ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putBoolean("hasWatch", CapabilityUtils.hasAndroidWearApp(mContext));
        }
        ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putBoolean("loggedIn", Services.get().getAuthentication().hasCredentials());
        ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putBoolean("pushEnabled", flag1);
        ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("appVersion", s);
        ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("device", Build.MODEL);
        ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putBoolean("storeSet", flag2);
        MessageBus.getBus().post(obj);
        return;
        obj;
        Log.d(TAG, "Failed to get appversion", ((Throwable) (obj)));
          goto _L1
    }

    public void destroy()
    {
        MessageBus.getBus().unregister(this);
    }

    public void init()
    {
        MessageBus.getBus().register(this);
    }

    public void onAppConfigReceived(AppConfig appconfig)
    {
        if (appconfig != null && !mHasSentTestEvent)
        {
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("test");
            if (!TextUtils.isEmpty(appconfig.abSegments))
            {
                builder.putString("testGroup", appconfig.abSegments);
            }
            MessageBus.getBus().post(builder);
            mHasSentTestEvent = true;
        }
    }

    public void onAppForegroundEvent(AppForegroundEvent appforegroundevent)
    {
        sendEvent(appforegroundevent.isLaunch);
    }

}
