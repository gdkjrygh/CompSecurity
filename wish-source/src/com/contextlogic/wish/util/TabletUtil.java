// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class TabletUtil
{

    private static boolean CACHED_LARGE_TABLET_CHECK_RESULT = false;
    private static boolean CACHED_TABLET_CHECK_RESULT = false;
    private static boolean HAS_CACHED_CHECK_RESULT = false;
    private static boolean HAS_CACHED_LARGE_CHECK_RESULT = false;
    private static final int LARGE_TABLET_THRESHOLD = 725;
    private static final int TABLET_THRESHOLD = 525;

    public TabletUtil()
    {
    }

    public static boolean isLargeTablet(Activity activity)
    {
        boolean flag = false;
        if (activity == null)
        {
            return false;
        }
        if (!HAS_CACHED_LARGE_CHECK_RESULT)
        {
            activity = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displaymetrics = new DisplayMetrics();
            activity.getMetrics(displaymetrics);
            if (Math.min((float)displaymetrics.widthPixels / displaymetrics.density, (float)displaymetrics.heightPixels / displaymetrics.density) >= 725F)
            {
                flag = true;
            }
            CACHED_LARGE_TABLET_CHECK_RESULT = flag;
            HAS_CACHED_LARGE_CHECK_RESULT = true;
        }
        return CACHED_LARGE_TABLET_CHECK_RESULT;
    }

    public static boolean isLargeTablet(Context context)
    {
        if (context != null && (context instanceof Activity))
        {
            return isTablet((Activity)context);
        } else
        {
            return false;
        }
    }

    public static boolean isTablet(Activity activity)
    {
        boolean flag = false;
        if (activity == null)
        {
            return false;
        }
        if (!HAS_CACHED_CHECK_RESULT)
        {
            activity = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displaymetrics = new DisplayMetrics();
            activity.getMetrics(displaymetrics);
            if (Math.min((float)displaymetrics.widthPixels / displaymetrics.density, (float)displaymetrics.heightPixels / displaymetrics.density) >= 525F)
            {
                flag = true;
            }
            CACHED_TABLET_CHECK_RESULT = flag;
            HAS_CACHED_CHECK_RESULT = true;
        }
        return CACHED_TABLET_CHECK_RESULT;
    }

    public static boolean isTablet(Context context)
    {
        if (context != null && (context instanceof Activity))
        {
            return isTablet((Activity)context);
        } else
        {
            return false;
        }
    }
}
