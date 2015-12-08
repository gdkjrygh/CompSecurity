// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.tenday;

import com.weather.commons.facade.DailyWeatherFacade;

// Referenced classes of package com.weather.Weather.tenday:
//            TenDayForecastDetailActivity

class val.dwf
    implements Runnable
{

    final TenDayForecastDetailActivity this$0;
    final DailyWeatherFacade val$dwf;

    public void run()
    {
        TenDayForecastDetailActivity.access$000(TenDayForecastDetailActivity.this, val$dwf);
    }

    ()
    {
        this$0 = final_tendayforecastdetailactivity;
        val$dwf = DailyWeatherFacade.this;
        super();
    }
}
