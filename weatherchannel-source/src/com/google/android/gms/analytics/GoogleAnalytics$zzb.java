// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.analytics:
//            GoogleAnalytics

class zzIA
    implements android.app.LifecycleCallbacks
{

    final GoogleAnalytics zzIA;

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
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        zzIA.zzl(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        zzIA.zzm(activity);
    }

    (GoogleAnalytics googleanalytics)
    {
        zzIA = googleanalytics;
        super();
    }
}
