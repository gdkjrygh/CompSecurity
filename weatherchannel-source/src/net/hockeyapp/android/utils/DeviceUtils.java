// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import net.hockeyapp.android.Constants;

public class DeviceUtils
{
    private static class DeviceUtilsHolder
    {

        public static final DeviceUtils INSTANCE = new DeviceUtils();


        private DeviceUtilsHolder()
        {
        }
    }


    private DeviceUtils()
    {
    }


    public static DeviceUtils getInstance()
    {
        return DeviceUtilsHolder.INSTANCE;
    }

    public String getAppName(Context context)
    {
        if (context == null)
        {
            return "";
        }
        PackageManager packagemanager;
        try
        {
            packagemanager = context.getPackageManager();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        if (packagemanager == null)
        {
            return "";
        }
        context = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(context.getPackageName(), 0)).toString();
        return context;
    }

    public int getCurrentVersionCode(Context context)
    {
        return Integer.parseInt(Constants.APP_VERSION);
    }
}
