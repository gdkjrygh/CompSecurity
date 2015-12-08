// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package net.hockeyapp.android.utils:
//            PrefsUtil

public class VersionCache
{

    private static String VERSION_INFO_KEY = "versionInfo";

    public VersionCache()
    {
    }

    public static String getVersionInfo(Context context)
    {
        if (context != null)
        {
            return context.getSharedPreferences("HockeyApp", 0).getString(VERSION_INFO_KEY, "[]");
        } else
        {
            return "[]";
        }
    }

    public static void setVersionInfo(Context context, String s)
    {
        if (context != null)
        {
            context = context.getSharedPreferences("HockeyApp", 0).edit();
            context.putString(VERSION_INFO_KEY, s);
            PrefsUtil.applyChanges(context);
        }
    }

}
