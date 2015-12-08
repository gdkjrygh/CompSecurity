// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;


// Referenced classes of package com.weather.commons.facade:
//            DailyWeatherFacade, HourlyWeatherFacade

public class HourlyForecastDetailFacade
{

    public final DailyWeatherFacade dailyWeatherFacade;
    public final HourlyWeatherFacade hourlyWeatherFacade;

    public HourlyForecastDetailFacade(HourlyWeatherFacade hourlyweatherfacade, DailyWeatherFacade dailyweatherfacade)
    {
        dailyWeatherFacade = dailyweatherfacade;
        hourlyWeatherFacade = hourlyweatherfacade;
    }
}
