// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.arubanetworks.meridian.internal.analytics.MeridianAnalytics;
import com.arubanetworks.meridian.internal.util.ConfigReader;
import com.arubanetworks.meridian.internal.util.Dev;
import com.arubanetworks.meridian.log.MeridianLogger;

public class Meridian
{

    private static final MeridianLogger a = MeridianLogger.forTag("Meridian");
    private static Meridian b;
    private final RequestQueue c;
    private final PackageInfo d;
    private Uri e;
    private boolean f;
    private long g;
    private boolean h;

    private Meridian(Context context)
    {
        PackageInfo packageinfo;
        c = Volley.newRequestQueue(context);
        packageinfo = null;
        PackageInfo packageinfo1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        packageinfo = packageinfo1;
_L2:
        d = packageinfo;
        e = Uri.parse(ConfigReader.getStringBuildConfig(context, "MERIDIAN_API_BASE_URL", "http://edit.meridianapps.com"));
        f = ConfigReader.getBooleanBuildConfig(context, "MERIDIAN_CACHE_OVERRIDE", false);
        g = ConfigReader.getLongBuildConfig(context, "MERIDIAN_CACHE_OVERRIDE_TIMEOUT", 0x5265c00L);
        h = ConfigReader.getBooleanBuildConfig(context, "MERIDIAN_AUTO_ADVANCE_ROUTE", true);
        MeridianAnalytics.init(context, ConfigReader.getStringBuildConfig(context, "ANALYTICS_ID", "").split(","));
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        a.wtf("PackageManager couldn't find app package", namenotfoundexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void configure(Context context)
    {
    /* block-local class not found */
    class MeridianConfigurationException {}

        if (context == null)
        {
            throw new MeridianConfigurationException("You have to provide a valid Context object.");
        }
        if (b != null)
        {
            throw new MeridianConfigurationException("You can't call configure more than once.");
        } else
        {
            Dev.init(context);
            b = new Meridian(context);
            return;
        }
    }

    public static Meridian getShared()
    {
        if (b == null)
        {
            throw new MeridianConfigurationException("The Meridian SDK must be configured through Meridian.configure(Context) before it can be used.");
        } else
        {
            return b;
        }
    }

    public Uri getAPIBaseUri()
    {
        return e;
    }

    public String getAPIVersion()
    {
        return "v1";
    }

    public long getCacheOverrideTimeout()
    {
        return g;
    }

    public PackageInfo getPackageInfo()
    {
        return d;
    }

    public RequestQueue getRequestQueue()
    {
        return c;
    }

    public String getSDKVersion()
    {
        return "2.14.3";
    }

    public void setAPIBaseUri(Uri uri)
    {
        e = uri;
    }

    public void setAutoAdvanceRoutes(boolean flag)
    {
        h = flag;
    }

    public void setCacheOverrideTimeout(long l)
    {
        g = l;
    }

    public void setOverrideCacheHeaders(boolean flag)
    {
        f = flag;
    }

    public boolean shouldAutoAdvanceRoutes()
    {
        return h;
    }

    public boolean shouldOverrideCacheHeaders()
    {
        return f;
    }

}
