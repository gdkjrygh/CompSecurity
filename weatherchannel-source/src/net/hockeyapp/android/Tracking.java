// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import net.hockeyapp.android.utils.PrefsUtil;

// Referenced classes of package net.hockeyapp.android:
//            Constants

public class Tracking
{

    private static final String START_TIME_KEY = "startTime";
    private static final String USAGE_TIME_KEY = "usageTime";

    public Tracking()
    {
    }

    private static boolean checkVersion(Context context)
    {
        if (Constants.APP_VERSION == null)
        {
            Constants.loadFromContext(context);
            if (Constants.APP_VERSION == null)
            {
                return false;
            }
        }
        return true;
    }

    private static SharedPreferences getPreferences(Context context)
    {
        return context.getSharedPreferences("HockeyApp", 0);
    }

    public static long getUsageTime(Context context)
    {
        if (!checkVersion(context))
        {
            return 0L;
        } else
        {
            return getPreferences(context).getLong((new StringBuilder()).append("usageTime").append(Constants.APP_VERSION).toString(), 0L) / 1000L;
        }
    }

    public static void startUsage(Activity activity)
    {
        long l = System.currentTimeMillis();
        if (activity == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = getPreferences(activity).edit();
            editor.putLong((new StringBuilder()).append("startTime").append(activity.hashCode()).toString(), l);
            PrefsUtil.applyChanges(editor);
            return;
        }
    }

    public static void stopUsage(Activity activity)
    {
        long l;
        l = System.currentTimeMillis();
        break MISSING_BLOCK_LABEL_4;
        if (activity != null && checkVersion(activity))
        {
            SharedPreferences sharedpreferences = getPreferences(activity);
            long l1 = sharedpreferences.getLong((new StringBuilder()).append("startTime").append(activity.hashCode()).toString(), 0L);
            long l2 = sharedpreferences.getLong((new StringBuilder()).append("usageTime").append(Constants.APP_VERSION).toString(), 0L);
            if (l1 > 0L)
            {
                activity = sharedpreferences.edit();
                activity.putLong((new StringBuilder()).append("usageTime").append(Constants.APP_VERSION).toString(), l2 + (l - l1));
                PrefsUtil.applyChanges(activity);
                return;
            }
        }
        return;
    }
}
