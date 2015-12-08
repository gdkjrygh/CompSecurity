// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import com.weather.Weather.metric.MetricUtil;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.util.metric.MetricRegistry;
import com.weather.util.metric.TimerMetric;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController, HomeScreen, HomeScreenUI

class ade
    implements Runnable
{

    final WeatherController this$0;
    final CurrentWeatherFacade val$cwf;

    public void run()
    {
        WeatherController.access$300(WeatherController.this);
        if (homeScreen.getUiFields() != null)
        {
            if (val$cwf.isEmpty())
            {
                homeScreen.getUiFields().setNoCurrentWeather();
                WeatherController.access$402(WeatherController.this, 0L);
            } else
            {
                homeScreen.getUiFields().setCurrentWeather(val$cwf);
                WeatherController.access$402(WeatherController.this, val$cwf.getRecordCreationTime());
                MetricUtil.recordAppLaunchMetrics(MetricRegistry.getInstance(), val$cwf);
                if (val$cwf.getRecordSetsSource() == com.weather.dal2.dsx.sSource.NETWORK)
                {
                    MetricRegistry.getInstance().timer(com.weather.util.metric.ER_PULL_TO_REFRESH_DISPLAY.MetricName()).stop();
                    return;
                }
            }
        }
    }

    ade()
    {
        this$0 = final_weathercontroller;
        val$cwf = CurrentWeatherFacade.this;
        super();
    }
}
