// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.app;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.multidex.MultiDexApplication;
import android.util.Log;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

public abstract class AbstractTwcApplication extends MultiDexApplication
{

    private static final String TAG = "AbstractTwcApplication";
    private static volatile Context appRootContext;
    private static volatile boolean isBuildServerDebug = true;
    private boolean isUpgrade;

    public AbstractTwcApplication()
    {
    }

    public static Context getRootContext()
    {
        return appRootContext;
    }

    public static boolean isBuildServerDebug()
    {
        return isBuildServerDebug;
    }

    public static void setBuildServerDebug(boolean flag)
    {
        isBuildServerDebug = flag;
    }

    public static void setContext(Context context)
    {
        appRootContext = context;
    }

    public int getVersionCode()
    {
        int i;
        try
        {
            Context context = getRootContext();
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e("AbstractTwcApplication", "no version number", namenotfoundexception);
            return 0;
        }
        return i;
    }

    public boolean isUpgrade()
    {
        return isUpgrade;
    }

    public void onCreate()
    {
        super.onCreate();
        setContext(getApplicationContext());
        int i = getVersionCode();
        if (TwcPrefs.getInstance().getLong(com.weather.util.prefs.TwcPrefs.Keys.INSTALLED_VERSION_CODE, 0L) < (long)i)
        {
            isUpgrade = true;
            TwcPrefs.getInstance().putLong(com.weather.util.prefs.TwcPrefs.Keys.INSTALLED_VERSION_CODE, i);
        }
    }

}
