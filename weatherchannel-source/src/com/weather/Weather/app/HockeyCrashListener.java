// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.DataUnits;
import com.weather.util.device.DeviceUtils;
import com.weather.util.device.LocaleUtil;
import com.weather.util.lbs.LbsUtil;
import net.hockeyapp.android.CrashManagerListener;
import net.hockeyapp.android.Tracking;

public class HockeyCrashListener extends CrashManagerListener
{

    private final Context context;

    public HockeyCrashListener(Context context1)
    {
        context = context1;
    }

    private static StringBuilder appendLocations(StringBuilder stringbuilder)
    {
        try
        {
            SavedLocationsSnapshot savedlocationssnapshot = new SavedLocationsSnapshot();
            stringbuilder.append("SavedLocationsSnapshot[").append("\n followMe: ").append(toString(savedlocationssnapshot.followMe().getLocation())).append("\n widget: ").append(toString(savedlocationssnapshot.getWidgetLocations())).append("\n fixed: ").append(toString(savedlocationssnapshot.getFixedLocations())).append("\n active: ").append(toString(savedlocationssnapshot.getActiveLocation())).append(']');
        }
        catch (Throwable throwable)
        {
            stringbuilder.append("[failed, ").append(throwable.getClass().getSimpleName()).append(':').append(throwable.getMessage()).append(']');
            return stringbuilder;
        }
        return stringbuilder;
    }

    private StringBuilder appendMemoryInfo(StringBuilder stringbuilder)
    {
        ActivityManager activitymanager = (ActivityManager)context.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        activitymanager.getMemoryInfo(memoryinfo);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            stringbuilder.append("\nTotal Memory: ").append(memoryinfo.totalMem >> 20).append('M');
            stringbuilder.append(" (").append(memoryinfo.totalMem >> 10).append("k)");
        }
        stringbuilder.append("\nTotal Available Memory: ").append(memoryinfo.availMem >> 20).append('M');
        stringbuilder.append(" (").append(memoryinfo.availMem >> 10).append("k)");
        stringbuilder.append("\nIn low memory situation: ").append(memoryinfo.lowMemory);
        return stringbuilder;
    }

    private static String toString(SavedLocation savedlocation)
    {
        if (savedlocation == null)
        {
            return "null";
        } else
        {
            return savedlocation.getKeyTypeCountry();
        }
    }

    private static String toString(Iterable iterable)
    {
        iterable = Iterables.transform(iterable, new _cls1());
        return (new StringBuilder()).append('[').append(Joiner.on(", ").join(iterable)).append(']').toString();
    }

    public String getDescription()
    {
        StringBuilder stringbuilder;
        stringbuilder = (new StringBuilder("Note: all the below info is gathered at crash report time, NOT crash time.")).append("\nlocale: ").append(LocaleUtil.getLocale()).append("\nunitType: ").append(DataUnits.getCurrentUnitType()).append("\nusage: ").append(Tracking.getUsageTime(context)).append('s').append("\nlocations: ");
        appendLocations(stringbuilder);
        stringbuilder.append("\nbatteryLevel: ").append(DeviceUtils.getBatteryLevel()).append("\nonWifi: ").append(DeviceUtils.isOnWifi(context)).append("\nlbsEnabledForApp: ").append(LbsUtil.getInstance().isLbsEnabledForApp()).append("\nlbsAvailable: ").append(LbsUtil.getInstance().isLbsAvailable()).append("\nlbsDisabledAndCanBeEnabled: ").append(LbsUtil.getInstance().isLbsDisabledAndCanBeEnabled()).append("\nupsStatus: ").append(AccountManager.getInstance().getLoginStatus());
        appendMemoryInfo(stringbuilder);
        Object obj;
        try
        {
            obj = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            obj = (new StringBuilder()).append(((PackageInfo) (obj)).versionName).append(" (").append(((PackageInfo) (obj)).versionCode).append(')').toString();
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception = "none found";
        }
        stringbuilder.append("\nGoogle Play Services Version: ").append(((String) (obj)));
        return stringbuilder.toString();
        Throwable throwable;
        throwable;
        return (new StringBuilder()).append("Unexpected: ").append(throwable.getClass().getSimpleName()).append(':').append(throwable.getMessage()).toString();
    }

    public boolean shouldAutoUploadCrashes()
    {
        return true;
    }

    /* member class not found */
    class _cls1 {}

}
