// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.facade;

import com.google.common.base.Preconditions;

// Referenced classes of package com.weather.ads2.facade:
//            CurrentConditions, WeatherAlerts, Pollen, Forecast, 
//            Ski

public final class WxData
{

    public final CurrentConditions currentConditions;
    public final Forecast forecast;
    public final Pollen pollen;
    public final Ski ski;
    public final WeatherAlerts weatherAlerts;

    public WxData(CurrentConditions currentconditions, WeatherAlerts weatheralerts, Pollen pollen1, Forecast forecast1, Ski ski1)
    {
        currentConditions = (CurrentConditions)Preconditions.checkNotNull(currentconditions);
        weatherAlerts = (WeatherAlerts)Preconditions.checkNotNull(weatheralerts);
        pollen = (Pollen)Preconditions.checkNotNull(pollen1);
        forecast = (Forecast)Preconditions.checkNotNull(forecast1);
        ski = (Ski)Preconditions.checkNotNull(ski1);
    }
}
