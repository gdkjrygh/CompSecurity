// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.squareup.otto.Bus;
import com.walmart.android.app.main.AppLifecycleManager;
import com.walmart.android.app.payment.PaymentPinActivity;
import com.walmart.android.events.AppBackgroundEvent;
import com.walmart.android.events.AppForegroundEvent;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.payment.controller.pin.MobilePayPinController;
import com.walmartlabs.utils.WLog;

public class ActivityTracker
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private static String TAG = com/walmart/android/app/ActivityTracker.getSimpleName();
    private int mCreatedActivitiesCounter;
    private boolean mHasAlreadyLaunched;
    private AppLifecycleManager mLifecycleManager;
    private int mStartedActivitiesCount;

    public ActivityTracker(Context context)
    {
        mCreatedActivitiesCounter = 0;
        mStartedActivitiesCount = 0;
        mHasAlreadyLaunched = false;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        mCreatedActivitiesCounter = mCreatedActivitiesCounter + 1;
        if (mCreatedActivitiesCounter == 1)
        {
            WLog.d(TAG, "App started");
            mLifecycleManager = new AppLifecycleManager(activity.getApplicationContext());
            mLifecycleManager.start();
            MobilePayPinController.create(com/walmart/android/app/payment/PaymentPinActivity);
        }
    }

    public void onActivityDestroyed(Activity activity)
    {
        mCreatedActivitiesCounter = mCreatedActivitiesCounter - 1;
        if (mCreatedActivitiesCounter == 0)
        {
            WLog.d(TAG, "App exited");
            mHasAlreadyLaunched = false;
            MobilePayPinController.destroy();
            if (mLifecycleManager != null)
            {
                mLifecycleManager.stop();
                mLifecycleManager = null;
            }
        }
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        mStartedActivitiesCount = mStartedActivitiesCount + 1;
        if (mStartedActivitiesCount == 1)
        {
            String s = TAG;
            StringBuilder stringbuilder = (new StringBuilder()).append("Application ");
            Object obj;
            boolean flag;
            if (mHasAlreadyLaunched)
            {
                obj = "came to foreground";
            } else
            {
                obj = "has launched";
            }
            WLog.d(s, stringbuilder.append(((String) (obj))).toString());
            obj = MessageBus.getBus();
            if (!mHasAlreadyLaunched)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((Bus) (obj)).post(new AppForegroundEvent(flag));
            MobilePayPinController.start(activity);
            mHasAlreadyLaunched = true;
        }
    }

    public void onActivityStopped(Activity activity)
    {
        mStartedActivitiesCount = mStartedActivitiesCount - 1;
        if (mStartedActivitiesCount == 0)
        {
            MobilePayPinController.stop(activity);
            WLog.d(TAG, "Application went to background");
            MessageBus.getBus().post(new AppBackgroundEvent());
        }
    }

}
