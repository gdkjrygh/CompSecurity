// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.util;

import android.content.SharedPreferences;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.targeting.AdTargetingChange;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.ads2.util:
//            AppVersion, UserSelectionUtils

public class LaunchHistory
{

    private static final LaunchHistory INSTANCE = new LaunchHistory(AppVersion.getInstance());
    private static final String LAUNCH_NEW = "new";
    private static final String LAUNCH_UPGRADE = "upgrade";
    private final AppVersion appVersion;
    private TwcBus bus;
    private String lastVersion;
    private final Object lock = new Object();

    LaunchHistory(AppVersion appversion)
    {
        appVersion = appversion;
    }

    public static LaunchHistory getInstance()
    {
        return INSTANCE;
    }

    public void init(TwcBus twcbus)
    {
        obj = appVersion.getAdAppVersion();
        Object obj1 = UserSelectionUtils.getPrefsMain(AbstractTwcApplication.getRootContext());
        if (obj1 == null)
        {
            throw new IllegalStateException("Application Root context not setup");
        }
        obj1 = ((SharedPreferences) (obj1)).getString("version", "");
        if (((String) (obj1)).isEmpty())
        {
            obj = "new";
        } else
        if (((String) (obj1)).equals(obj))
        {
            obj = "nl";
        } else
        {
            obj = "upgrade";
        }
        twcbus.post(new AdTargetingChange(ImmutableMap.of(AdTargetingParam.FIRST_TIME_LAUNCH, obj)));
        synchronized (lock)
        {
            lastVersion = ((String) (obj1));
            bus = twcbus;
        }
        return;
        twcbus;
        obj;
        JVM INSTR monitorexit ;
        throw twcbus;
    }

    public void updateLaunchVersion()
    {
        String s;
        SharedPreferences sharedpreferences;
        boolean flag;
        flag = true;
        s = appVersion.getAdAppVersion();
        sharedpreferences = UserSelectionUtils.getPrefsMain(AbstractTwcApplication.getRootContext());
        if (sharedpreferences == null)
        {
            throw new IllegalStateException("Application Root context not setup");
        }
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        TwcBus twcbus;
        boolean flag1;
        if (bus != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1, "LaunchHistory not initialized");
        twcbus = bus;
        if (lastVersion.equals(s))
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        sharedpreferences.edit().putString("version", s).apply();
        lastVersion = s;
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            twcbus.post(new AdTargetingChange(ImmutableMap.of(AdTargetingParam.FIRST_TIME_LAUNCH, "nl")));
        }
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
