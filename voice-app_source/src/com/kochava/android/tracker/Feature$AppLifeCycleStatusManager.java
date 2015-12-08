// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.util.Log;
import com.kochava.android.util.Logging;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

protected static class _cls1.val.status
{

    protected static final String IS_FOCUSED = "is_focused";
    protected static final String IS_IN_BACKGROUND = "is_in_background";
    protected static boolean active = false;
    protected static boolean resumed = false;

    protected static void changeStatus(String s)
    {
        (new Thread(s) {

            final String val$status;

            public void run()
            {
                if (!Feature.AppLifeCycleStatusManager.active)
                {
                    Log.e("KochavaTracker", "AppLifeCycleStatusManager - not active");
                } else
                {
                    if (status.equals("is_focused"))
                    {
                        if (!Feature.AppLifeCycleStatusManager.resumed)
                        {
                            Logging.Log("AppLifeCycleStatusManager - not already resumed, starting session...");
                            Feature.access$4100();
                            Feature.AppLifeCycleStatusManager.resumed = true;
                            return;
                        } else
                        {
                            Logging.Log("AppLifeCycleStatusManager - IS_FOCUSED received, App is already in focused state.");
                            return;
                        }
                    }
                    if (status.equals("is_in_background"))
                    {
                        if (Feature.AppLifeCycleStatusManager.resumed)
                        {
                            Logging.Log("AppLifeCycleStatusManager - going to background from app, ending session");
                            Feature.access$4200();
                            Feature.AppLifeCycleStatusManager.resumed = false;
                            return;
                        } else
                        {
                            Logging.Log("AppLifeCycleStatusManager - IS_IN_BACKGROUND received, App is already in background state.");
                            return;
                        }
                    }
                }
            }

            
            {
                status = s;
                super();
            }
        }).start();
    }


    protected _cls1.val.status()
    {
    }
}
