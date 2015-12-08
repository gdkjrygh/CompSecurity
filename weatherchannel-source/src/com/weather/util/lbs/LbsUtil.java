// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.lbs;

import android.content.Context;
import android.location.LocationManager;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.ui.UIUtil;
import java.util.Iterator;

public class LbsUtil
{

    private static final LbsUtil INSTANCE = new LbsUtil();

    private LbsUtil()
    {
    }

    private boolean anyGpsOrNetworkProviderInList(Iterable iterable)
    {
label0:
        {
            if (iterable == null)
            {
                break label0;
            }
            iterable = iterable.iterator();
            String s;
            do
            {
                if (!iterable.hasNext())
                {
                    break label0;
                }
                s = (String)iterable.next();
            } while (!"network".equals(s) && !"gps".equals(s));
            return true;
        }
        return false;
    }

    public static LbsUtil getInstance()
    {
        return INSTANCE;
    }

    public boolean deviceSupportsLocation()
    {
        LocationManager locationmanager;
        if (!UIUtil.isOGKindle())
        {
            if ((locationmanager = (LocationManager)AbstractTwcApplication.getRootContext().getSystemService("location")) != null && anyGpsOrNetworkProviderInList(locationmanager.getAllProviders()))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isLbsAvailable()
    {
        LocationManager locationmanager = (LocationManager)AbstractTwcApplication.getRootContext().getSystemService("location");
        return locationmanager != null && anyGpsOrNetworkProviderInList(locationmanager.getProviders(true));
    }

    public boolean isLbsDisabledAndCanBeEnabled()
    {
        LocationManager locationmanager;
        if (deviceSupportsLocation())
        {
            if ((locationmanager = (LocationManager)AbstractTwcApplication.getRootContext().getSystemService("location")) != null && !anyGpsOrNetworkProviderInList(locationmanager.getProviders(true)) && anyGpsOrNetworkProviderInList(locationmanager.getProviders(false)))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isLbsEnabledForApp()
    {
        return TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.USE_LBS, true);
    }

    public boolean isLbsEnabledForAppAndDevice()
    {
        return isLbsEnabledForApp() && isLbsAvailable();
    }

}
