// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.urbanairship.analytics:
//            LifeCycleCallbacks

static final class val.callback
    implements android.app.ifecycleCallbacks
{

    final llback val$callback;

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
        val$callback.onStart(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        val$callback.onStop(activity);
    }

    llback(llback llback)
    {
        val$callback = llback;
        super();
    }
}
