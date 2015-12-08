// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.app.Activity;
import android.os.Bundle;
import com.kochava.android.util.Logging;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

protected class this._cls0
    implements android.app.ycleCallbacks
{

    final Feature this$0;

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        Logging.Log("LifeCycleTracker - Tracking Activity lost focus");
        sManager.changeStatus("is_in_background");
        boolean _tmp = Feature.access$3002(true);
    }

    public void onActivityResumed(Activity activity)
    {
        Logging.Log("LifeCycleTracker - Tracking Activity Resumed");
        sManager.changeStatus("is_focused");
        boolean _tmp = Feature.access$3002(false);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }

    protected sManager()
    {
        this$0 = Feature.this;
        super();
    }
}
