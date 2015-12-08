// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Activity;
import android.content.Intent;

// Referenced classes of package com.walmart.android.app.main:
//            HomeActivity

public class AppState
{

    public static final String TAG = com/walmart/android/app/main/AppState.getSimpleName();
    private static boolean sStarted;

    public AppState()
    {
    }

    public static boolean isAppStarted()
    {
        return sStarted;
    }

    public static boolean rerouteOnAppStart(Activity activity)
    {
        if (!sStarted)
        {
            if (com/walmart/android/app/main/HomeActivity.equals(activity.getClass()))
            {
                sStarted = true;
            } else
            {
                activity.startActivity(new Intent(activity, com/walmart/android/app/main/HomeActivity));
                activity.finish();
            }
        }
        return !sStarted;
    }

}
