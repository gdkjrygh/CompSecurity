// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManager

class AnswersLifecycleCallbacks extends io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
{

    private final SessionAnalyticsManager analyticsManager;

    public AnswersLifecycleCallbacks(SessionAnalyticsManager sessionanalyticsmanager)
    {
        analyticsManager = sessionanalyticsmanager;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        analyticsManager.onLifecycle(activity, SessionEvent.Type.CREATE);
    }

    public void onActivityDestroyed(Activity activity)
    {
        analyticsManager.onLifecycle(activity, SessionEvent.Type.DESTROY);
    }

    public void onActivityPaused(Activity activity)
    {
        analyticsManager.onLifecycle(activity, SessionEvent.Type.PAUSE);
    }

    public void onActivityResumed(Activity activity)
    {
        analyticsManager.onLifecycle(activity, SessionEvent.Type.RESUME);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        analyticsManager.onLifecycle(activity, SessionEvent.Type.SAVE_INSTANCE_STATE);
    }

    public void onActivityStarted(Activity activity)
    {
        analyticsManager.onLifecycle(activity, SessionEvent.Type.START);
    }

    public void onActivityStopped(Activity activity)
    {
        analyticsManager.onLifecycle(activity, SessionEvent.Type.STOP);
    }
}
