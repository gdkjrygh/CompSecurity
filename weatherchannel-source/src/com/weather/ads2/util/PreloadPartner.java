// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.base.Strings;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

public class PreloadPartner
{

    private static final String TAG = "PreloadPartner";
    private String preloadPartner;

    public PreloadPartner()
    {
    }

    private static String loadPreloadPartner()
    {
        Object obj;
        String s1;
        s1 = TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.PRELOAD_PARTNER, "");
        obj = s1;
        if (!Strings.isNullOrEmpty(s1)) goto _L2; else goto _L1
_L1:
        String s = s1;
        if ((AbstractTwcApplication.getRootContext().getPackageManager().getPackageInfo("com.weather.Weather", 0).applicationInfo.flags & 1) != 1)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = s1;
        obj = Build.MANUFACTURER;
_L3:
        s = ((String) (obj));
        try
        {
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.PRELOAD_PARTNER, ((String) (obj)));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            LogUtil.e("PreloadPartner", LoggingMetaTags.TWC_GENERAL, namenotfoundexception.getLocalizedMessage(), new Object[0]);
            namenotfoundexception = s;
        }
_L2:
        s = ((String) (obj));
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            s = "nl";
        }
        return s;
        obj = "nl";
          goto _L3
    }

    public String getPreloadPartner()
    {
        if (preloadPartner == null)
        {
            preloadPartner = loadPreloadPartner();
        }
        return preloadPartner;
    }
}
