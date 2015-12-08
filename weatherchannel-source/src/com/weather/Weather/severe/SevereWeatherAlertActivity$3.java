// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.severe;

import com.weather.commons.facade.CurrentWeatherFacade;

// Referenced classes of package com.weather.Weather.severe:
//            SevereWeatherAlertActivity

class val.cwf
    implements Runnable
{

    final SevereWeatherAlertActivity this$0;
    final CurrentWeatherFacade val$cwf;

    public void run()
    {
        SevereWeatherAlertActivity.access$400(SevereWeatherAlertActivity.this, val$cwf);
    }

    ()
    {
        this$0 = final_severeweatheralertactivity;
        val$cwf = CurrentWeatherFacade.this;
        super();
    }
}
