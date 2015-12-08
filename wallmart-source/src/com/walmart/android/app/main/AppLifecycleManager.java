// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import android.location.Location;
import android.os.Debug;
import com.github.anrwatchdog.ANRError;
import com.github.anrwatchdog.ANRWatchDog;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.otto.Bus;
import com.walmart.android.app.storelocator.WalmartStoreModeManager;
import com.walmart.android.events.StartupFinishedEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.storelocator.StoreLocationManager;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            WalmartUncaughtExceptionHandler, StartupManager, LaunchAndForegroundEventHelper

public class AppLifecycleManager
{

    private static final String TAG = com/walmart/android/app/main/AppLifecycleManager.getSimpleName();
    private ANRWatchDog mAnrWatchdog;
    private final Context mApplicationContext;
    private boolean mFoundLocation;
    private LaunchAndForegroundEventHelper mLaunchAndForegroundEventHelper;
    private boolean mStartupFinished;

    public AppLifecycleManager(Context context)
    {
        mApplicationContext = context.getApplicationContext();
    }

    private void initAnrWatchDog()
    {
        stopAnrWatchDog();
        com.github.anrwatchdog.ANRWatchDog.InterruptionListener interruptionlistener = new com.github.anrwatchdog.ANRWatchDog.InterruptionListener() {

            final AppLifecycleManager this$0;

            public void onInterrupted(InterruptedException interruptedexception)
            {
                WLog.i(AppLifecycleManager.TAG, "ANR Watchdog has stopped");
            }

            
            {
                this$0 = AppLifecycleManager.this;
                super();
            }
        };
        com.github.anrwatchdog.ANRWatchDog.ANRListener anrlistener = new com.github.anrwatchdog.ANRWatchDog.ANRListener() {

            final AppLifecycleManager this$0;

            public void onAppNotResponding(ANRError anrerror)
            {
                if (Debug.isDebuggerConnected())
                {
                    WLog.i(AppLifecycleManager.TAG, (new StringBuilder()).append("Debugger is connected, ignore ANR Watchdog ").append(mAnrWatchdog).toString());
                    return;
                } else
                {
                    throw anrerror;
                }
            }

            
            {
                this$0 = AppLifecycleManager.this;
                super();
            }
        };
        mAnrWatchdog = (new ANRWatchDog()).setInterruptionListener(interruptionlistener).setANRListener(anrlistener);
        WLog.i(TAG, (new StringBuilder()).append("Starting ANR Watchdog with default interval (5000ms) ").append(mAnrWatchdog).append(", id=").append(mAnrWatchdog.getId()).toString());
        mAnrWatchdog.start();
    }

    private void initUncaughtExceptionHandler()
    {
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = Thread.currentThread().getUncaughtExceptionHandler();
        if (!(uncaughtexceptionhandler instanceof WalmartUncaughtExceptionHandler))
        {
            Thread.currentThread().setUncaughtExceptionHandler(new WalmartUncaughtExceptionHandler(uncaughtexceptionhandler));
        }
    }

    private void loadNearbyStoresIfReady(Context context)
    {
        if (context != null && mStartupFinished && mFoundLocation)
        {
            StoreLocationManager.getInstance(context).loadNearbyStores(null);
        }
    }

    private void stopAnrWatchDog()
    {
        if (mAnrWatchdog != null)
        {
            WLog.i(TAG, (new StringBuilder()).append("Stopping ANR Watchdog ").append(mAnrWatchdog).append(", id=").append(mAnrWatchdog.getId()).toString());
            mAnrWatchdog.interrupt();
            mAnrWatchdog = null;
        }
    }

    public void onStartupFinished(StartupFinishedEvent startupfinishedevent)
    {
        mStartupFinished = true;
        loadNearbyStoresIfReady(mApplicationContext);
        MessageBus.getBus().unregister(this);
    }

    public void start()
    {
        initUncaughtExceptionHandler();
        StartupManager.start(mApplicationContext);
        StoreLocationManager.getInstance(mApplicationContext).requestLocationInBackground(new com.walmartlabs.storelocator.StoreLocationManager.LocationCallbackAdapter() {

            final AppLifecycleManager this$0;

            public void onFoundLocation(LatLng latlng, Location location)
            {
                mFoundLocation = true;
                loadNearbyStoresIfReady(mApplicationContext);
            }

            
            {
                this$0 = AppLifecycleManager.this;
                super();
            }
        });
        SharedPreferencesUtil.clearStates(mApplicationContext, false);
        mLaunchAndForegroundEventHelper = new LaunchAndForegroundEventHelper(mApplicationContext);
        mLaunchAndForegroundEventHelper.init();
        WalmartStoreModeManager.create(mApplicationContext);
        MessageBus.getBus().register(this);
    }

    public void stop()
    {
        if (mLaunchAndForegroundEventHelper != null)
        {
            mLaunchAndForegroundEventHelper.destroy();
            mLaunchAndForegroundEventHelper = null;
        }
        WalmartStoreModeManager.destroy();
    }



/*
    static boolean access$002(AppLifecycleManager applifecyclemanager, boolean flag)
    {
        applifecyclemanager.mFoundLocation = flag;
        return flag;
    }

*/




}
