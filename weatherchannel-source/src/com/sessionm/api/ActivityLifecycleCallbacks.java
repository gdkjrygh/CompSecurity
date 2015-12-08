// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.sessionm.api:
//            SessionM

public class ActivityLifecycleCallbacks
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private static final String TAG = "SessionM.Lifecycle";

    public ActivityLifecycleCallbacks()
    {
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        if (Log.isLoggable("SessionM.Lifecycle", 3))
        {
            Log.d("SessionM.Lifecycle", (new StringBuilder()).append(activity.getClass().getSimpleName()).append(".onCreate()").toString());
        }
    }

    public void onActivityDestroyed(Activity activity)
    {
        if (Log.isLoggable("SessionM.Lifecycle", 3))
        {
            Log.d("SessionM.Lifecycle", (new StringBuilder()).append(activity.getClass().getSimpleName()).append(".onDestroyed").toString());
        }
    }

    public void onActivityPaused(Activity activity)
    {
        if (Log.isLoggable("SessionM.Lifecycle", 3))
        {
            Log.d("SessionM.Lifecycle", (new StringBuilder()).append(activity.getClass().getSimpleName()).append(".onPause()").toString());
        }
        SessionM.getInstance().onActivityPause(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        if (Log.isLoggable("SessionM.Lifecycle", 3))
        {
            Log.d("SessionM.Lifecycle", (new StringBuilder()).append(activity.getClass().getSimpleName()).append(".onResume()").toString());
        }
        SessionM.getInstance().onActivityResume(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        if (Log.isLoggable("SessionM.Lifecycle", 3))
        {
            Log.d("SessionM.Lifecycle", (new StringBuilder()).append(activity.getClass().getSimpleName()).append(".onSaveInstanceState(Bundle)").toString());
        }
    }

    public void onActivityStarted(Activity activity)
    {
        if (Log.isLoggable("SessionM.Lifecycle", 3))
        {
            Log.d("SessionM.Lifecycle", (new StringBuilder()).append(activity.getClass().getSimpleName()).append(".onStart()").toString());
        }
        SessionM sessionm = SessionM.getInstance();
        sessionm.onActivityStart(activity);
        sessionm.setApplicationContext(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        if (Log.isLoggable("SessionM.Lifecycle", 3))
        {
            Log.d("SessionM.Lifecycle", (new StringBuilder()).append(activity.getClass().getSimpleName()).append(".onStop()").toString());
        }
        SessionM.getInstance().onActivityStop(activity);
    }
}
