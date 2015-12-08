// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import com.weather.Weather.nhc.NhcWeatherAlertFetcher;
import com.weather.commons.facade.WeatherAlert;
import java.util.List;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            HurricaneBulletinsModule

static final class recordCreationTime
{

    private final WeatherAlert publicAdvisoryAlert;
    private final long recordCreationTime;
    private final WeatherAlert tropicalDiscussionAlert;

    boolean hasData()
    {
        return publicAdvisoryAlert != null || tropicalDiscussionAlert != null;
    }




    (List list, String s, long l)
    {
        publicAdvisoryAlert = NhcWeatherAlertFetcher.getWeatherAlert(list, s, com.weather.Weather.nhc.VISORY);
        tropicalDiscussionAlert = NhcWeatherAlertFetcher.getWeatherAlert(list, s, com.weather.Weather.nhc.N_DETAILS);
        recordCreationTime = l;
    }
}
