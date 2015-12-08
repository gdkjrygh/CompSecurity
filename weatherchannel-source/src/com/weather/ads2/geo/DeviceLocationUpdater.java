// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.geo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.ads2.targeting.AdTargetingChange;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class DeviceLocationUpdater
{

    private static final String TAG = "DeviceLocationUpdater";
    private final TwcBus bus;

    public DeviceLocationUpdater(TwcBus twcbus)
    {
        bus = (TwcBus)Preconditions.checkNotNull(twcbus);
    }

    public void onLocationChange(SavedLocation savedlocation)
    {
label0:
        {
            LogUtil.d("DeviceLocationUpdater", LoggingMetaTags.TWC_AD, "onLocationChange; location=%s", new Object[] {
                savedlocation
            });
            String s = savedlocation.getZipCode();
            if (s != null)
            {
                savedlocation = s;
                if (!s.isEmpty())
                {
                    break label0;
                }
            }
            savedlocation = "nl";
        }
        savedlocation = new AdTargetingChange(ImmutableMap.of(AdTargetingParam.HYPER_LOCAL_ZIP, savedlocation));
        bus.post(savedlocation);
    }
}
