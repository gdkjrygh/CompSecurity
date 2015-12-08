// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MixpanelAPI

class MixpanelActivityLifecycleCallbacks
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final MixpanelAPI mMpInstance;

    public MixpanelActivityLifecycleCallbacks(MixpanelAPI mixpanelapi)
    {
        mMpInstance = mixpanelapi;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
        mMpInstance.getPeople().joinExperimentIfAvailable();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        if (!activity.isTaskRoot())
        {
            return;
        } else
        {
            mMpInstance.getPeople().showNotificationIfAvailable(activity);
            mMpInstance.getPeople().showSurveyIfAvailable(activity);
            return;
        }
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
