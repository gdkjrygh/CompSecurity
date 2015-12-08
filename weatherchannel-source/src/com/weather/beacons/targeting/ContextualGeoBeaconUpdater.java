// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.targeting;

import android.net.Uri;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;

// Referenced classes of package com.weather.beacons.targeting:
//            BeaconTargetingParam, BeaconTargetingChange

public final class ContextualGeoBeaconUpdater
{

    private final TwcBus bus;

    public ContextualGeoBeaconUpdater(TwcBus twcbus)
    {
        bus = twcbus;
    }

    private static String formatValue(String s)
    {
        if (Strings.isNullOrEmpty(s) || "*".equals(s) || "null".equals(s))
        {
            s = "nl";
        } else
        {
            String s1 = Uri.encode(s);
            s = s1;
            if (s1 == null)
            {
                return "nl";
            }
        }
        return s;
    }

    public void onLocationUpdate(SavedLocation savedlocation)
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        savedlocation = (new StringBuilder()).append(savedlocation.getCity()).append('_').append(savedlocation.getState()).append('_').append(savedlocation.getZipCode()).append('_').append(savedlocation.getCountryCode()).toString();
        builder.put(BeaconTargetingParam.CURRENT_LOCATION, formatValue(savedlocation));
        bus.post(new BeaconTargetingChange(builder.build()));
    }
}
