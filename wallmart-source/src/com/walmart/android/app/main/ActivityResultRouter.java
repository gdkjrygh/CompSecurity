// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.walmartlabs.utils.WLog;
import java.util.HashMap;

public class ActivityResultRouter
{
    public static interface ActivityResultCallback
    {

        public abstract void onActivityResult(int i, int j, Intent intent);
    }


    private static final String TAG = com/walmart/android/app/main/ActivityResultRouter.getSimpleName();
    private static HashMap sRouters = new HashMap();
    private Activity mActivity;
    private HashMap mCallbackMap;

    private ActivityResultRouter(Activity activity)
    {
        mActivity = activity;
        mCallbackMap = new HashMap();
    }

    public static ActivityResultRouter getInstance(Activity activity)
    {
        if (sRouters == null || !sRouters.containsKey(activity))
        {
            Log.e(TAG, "Activity not registered");
            return null;
        } else
        {
            return (ActivityResultRouter)sRouters.get(activity);
        }
    }

    public static boolean handleActivityResult(Activity activity, int i, int j, Intent intent)
    {
        activity = getInstance(activity);
        if (activity != null)
        {
            return activity.handleActivityResult(i, j, intent);
        } else
        {
            return false;
        }
    }

    public static void register(Activity activity)
    {
        if (!sRouters.containsKey(activity))
        {
            ActivityResultRouter activityresultrouter = new ActivityResultRouter(activity);
            sRouters.put(activity, activityresultrouter);
            return;
        } else
        {
            WLog.e(TAG, "Tried to register already registered activity");
            return;
        }
    }

    public static void unregister(Activity activity)
    {
        if (sRouters.containsKey(activity))
        {
            sRouters.remove(activity);
            return;
        } else
        {
            WLog.e(TAG, "Tried to unregister non-registered activity");
            return;
        }
    }

    public boolean handleActivityResult(int i, int j, Intent intent)
    {
        if (mCallbackMap.containsKey(Integer.valueOf(i)))
        {
            WLog.d(TAG, (new StringBuilder()).append("Executing callback for requestCode: ").append(i).toString());
            ((ActivityResultCallback)mCallbackMap.remove(Integer.valueOf(i))).onActivityResult(i, j, intent);
            return true;
        } else
        {
            WLog.d(TAG, (new StringBuilder()).append("No callback found for requestCode: ").append(i).toString());
            return false;
        }
    }

    public void startActivityForResult(Intent intent, int i, ActivityResultCallback activityresultcallback)
    {
        if (!mCallbackMap.containsKey(Integer.valueOf(i)))
        {
            mCallbackMap.put(Integer.valueOf(i), activityresultcallback);
            mActivity.startActivityForResult(intent, i);
            return;
        } else
        {
            WLog.e(TAG, (new StringBuilder()).append("Callback already pending for requestCode: ").append(i).toString());
            return;
        }
    }

}
