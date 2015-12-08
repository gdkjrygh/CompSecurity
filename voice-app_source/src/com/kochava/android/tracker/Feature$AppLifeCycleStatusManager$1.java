// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.util.Log;
import com.kochava.android.util.Logging;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

static final class val.status extends Thread
{

    final String val$status;

    public void run()
    {
        if (!tive)
        {
            Log.e("KochavaTracker", "AppLifeCycleStatusManager - not active");
        } else
        {
            if (val$status.equals("is_focused"))
            {
                if (!sumed)
                {
                    Logging.Log("AppLifeCycleStatusManager - not already resumed, starting session...");
                    Feature.access$4100();
                    sumed = true;
                    return;
                } else
                {
                    Logging.Log("AppLifeCycleStatusManager - IS_FOCUSED received, App is already in focused state.");
                    return;
                }
            }
            if (val$status.equals("is_in_background"))
            {
                if (sumed)
                {
                    Logging.Log("AppLifeCycleStatusManager - going to background from app, ending session");
                    Feature.access$4200();
                    sumed = false;
                    return;
                } else
                {
                    Logging.Log("AppLifeCycleStatusManager - IS_IN_BACKGROUND received, App is already in background state.");
                    return;
                }
            }
        }
    }

    (String s)
    {
        val$status = s;
        super();
    }
}
