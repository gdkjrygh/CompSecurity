// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.weather.dal2.eventlog.logs.EventLog;
import com.weather.util.app.AbstractTwcApplication;

public final class AppVersion
{

    private static final AppVersion INSTANCE = new AppVersion();
    private static final String TAG = "AppVersion";
    private volatile String adAppVersion;
    private volatile String packageVersionName;

    AppVersion()
    {
    }

    public static AppVersion getInstance()
    {
        return INSTANCE;
    }

    private String getPackageVersionName()
    {
        String s;
        if (packageVersionName != null)
        {
            return packageVersionName;
        }
        s = null;
        Object obj;
        obj = AbstractTwcApplication.getRootContext();
        obj = ((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 0).versionName;
        s = ((String) (obj));
_L2:
        packageVersionName = s;
        return packageVersionName;
        Exception exception;
        exception;
        EventLog.w("AppVersion", (new StringBuilder()).append("getPackageVersionName ex=").append(exception).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String getAdAppVersion()
    {
        if (adAppVersion != null)
        {
            return adAppVersion;
        }
        String s = getPackageVersionName();
        if (s == null)
        {
            return "Android_";
        } else
        {
            adAppVersion = (new StringBuilder()).append("Android_").append(s.replace('.', '_')).toString();
            return adAppVersion;
        }
    }

}
