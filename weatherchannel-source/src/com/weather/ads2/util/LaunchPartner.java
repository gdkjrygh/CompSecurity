// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.util;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Strings;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import java.util.concurrent.TimeUnit;

public class LaunchPartner
{

    private static final LaunchPartner INSTANCE = new LaunchPartner();
    private static final long INTERVAL;
    private static final String TAG = "LaunchPartner";
    private String launchPartner;

    LaunchPartner()
    {
    }

    public static LaunchPartner getInstance()
    {
        return INSTANCE;
    }

    public String getLaunchPartner()
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        if (launchPartner == null)
        {
            long l = SystemTimeProvider.getInstance().currentTimeMillis();
            Prefs prefs = TwcPrefs.getInstance();
            s1 = prefs.getString(com.weather.util.prefs.TwcPrefs.Keys.LAUNCH_PARTNER, "nl");
            long l1 = prefs.getLong(com.weather.util.prefs.TwcPrefs.Keys.LAUNCH_PARTNER_TIME, 0L);
            LogUtil.d("LaunchPartner", LoggingMetaTags.TWC_AD, (new StringBuilder()).append("Getting cached launch partner: ").append(s1).append(" - ").append(l1).toString(), new Object[0]);
            if (INTERVAL + l1 >= l)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            LogUtil.d("LaunchPartner", LoggingMetaTags.TWC_AD, "Clearing launch partner", new Object[0]);
            launchPartner = "nl";
            prefs.remove(com.weather.util.prefs.TwcPrefs.Keys.LAUNCH_PARTNER);
            prefs.remove(com.weather.util.prefs.TwcPrefs.Keys.LAUNCH_PARTNER_TIME);
        }
_L1:
        String s = launchPartner;
        this;
        JVM INSTR monitorexit ;
        return s;
        launchPartner = s1;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void handleIntent(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        if (intent.getExtras() != null && !Strings.isNullOrEmpty(intent.getExtras().getString("launch_partner")))
        {
            long l = SystemTimeProvider.getInstance().currentTimeMillis();
            intent = intent.getExtras().getString("launch_partner");
            LogUtil.d("LaunchPartner", LoggingMetaTags.TWC_AD, (new StringBuilder()).append("Setting launch partner: ").append(intent).toString(), new Object[0]);
            launchPartner = intent;
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.LAUNCH_PARTNER, intent);
            TwcPrefs.getInstance().putLong(com.weather.util.prefs.TwcPrefs.Keys.LAUNCH_PARTNER_TIME, l);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        intent;
        throw intent;
    }

    static 
    {
        INTERVAL = TimeUnit.HOURS.toMillis(1L);
    }
}
