// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hourly;

import com.weather.commons.facade.HourlyWeatherFacade;

// Referenced classes of package com.weather.Weather.hourly:
//            HourlyForecastDetailActivity

class val.hwf
    implements Runnable
{

    final HourlyForecastDetailActivity this$0;
    final HourlyWeatherFacade val$hwf;

    public void run()
    {
        HourlyForecastDetailActivity.access$200(HourlyForecastDetailActivity.this, val$hwf);
    }

    ()
    {
        this$0 = final_hourlyforecastdetailactivity;
        val$hwf = HourlyWeatherFacade.this;
        super();
    }
}
