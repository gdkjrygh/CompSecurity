// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.ui;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Window;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public final class UIUtil
{

    private static final boolean IS_KINDLE_FIRST_GEN;
    private static final boolean IS_KINDLE_HD7;
    private static final boolean IS_KINDLE_HD89;
    private static final boolean IS_KINDLE_SECOND_GEN;
    private static final String TAG = "UIUtil";
    private static float displayDensity = -1F;
    private static int screenLayoutSize = 0;

    private UIUtil()
    {
    }

    public static void allowScreenOff(Activity activity)
    {
        LogUtil.v("UIUtil", LoggingMetaTags.TWC_UI, "allowScreenOff", new Object[0]);
        if (activity != null)
        {
            activity = activity.getWindow();
            if (activity != null)
            {
                activity.clearFlags(128);
            }
        }
    }

    public static float convertDpToPixel(Context context, float f)
    {
        return f * ((float)context.getResources().getDisplayMetrics().densityDpi / 160F);
    }

    public static int convertDpToPixelInt(Context context, float f)
    {
        if (displayDensity <= 0.0F)
        {
            displayDensity = context.getResources().getDisplayMetrics().density;
        }
        return (int)(displayDensity * f + 0.5F);
    }

    public static int getDeviceDensity(Context context)
    {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static boolean isAmazon(Context context)
    {
        return isAmazonMobile(context) || isAmazonMessaging();
    }

    public static boolean isAmazonMessaging()
    {
        try
        {
            Class.forName("com.amazon.device.messaging.ADM");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        return true;
    }

    public static boolean isAmazonMobile(Context context)
    {
        return context.getPackageManager().hasSystemFeature("com.amazon.software.home");
    }

    public static boolean isInLandscape(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean isKindle2ndGenDevices()
    {
        return IS_KINDLE_HD89 || IS_KINDLE_HD7 || IS_KINDLE_SECOND_GEN;
    }

    public static boolean isOGKindle()
    {
        return IS_KINDLE_FIRST_GEN;
    }

    public static boolean isTablet(Context context)
    {
        if (screenLayoutSize == 0)
        {
            screenLayoutSize = context.getResources().getConfiguration().screenLayout & 0xf;
        }
        return screenLayoutSize >= 3;
    }

    public static void keepScreenOn(Activity activity)
    {
        LogUtil.v("UIUtil", LoggingMetaTags.TWC_UI, "keepScreenOn", new Object[0]);
        if (activity != null)
        {
            activity = activity.getWindow();
            if (activity != null)
            {
                activity.addFlags(128);
            }
        }
    }

    static 
    {
        boolean flag = false;
        IS_KINDLE_FIRST_GEN = "Kindle Fire".equals(Build.MODEL);
        IS_KINDLE_SECOND_GEN = "KFOT".equals(Build.MODEL);
        IS_KINDLE_HD7 = "KFTT".equals(Build.MODEL);
        if ("KFJWA".equals(Build.MODEL) || "KFJWI".equals(Build.MODEL))
        {
            flag = true;
        }
        IS_KINDLE_HD89 = flag;
    }
}
