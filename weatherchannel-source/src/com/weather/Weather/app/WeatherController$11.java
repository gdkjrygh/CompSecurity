// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.content.res.Resources;
import android.widget.Toast;
import com.weather.dal2.weatherconnections.WeatherDataError;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController, HomeScreen, HomeScreenUI

class taError
    implements Runnable
{

    final WeatherController this$0;
    final WeatherDataError val$event;

    public void run()
    {
        if (val$event.postedStaleData())
        {
            String s = getResources().getString(0x7f0700e3);
            Toast.makeText(WeatherController.this, s, 0).show();
        }
        WeatherController.access$300(WeatherController.this);
        if (homeScreen != null)
        {
            homeScreen.getUiFields().setFrontCircleVisible();
        }
    }

    taError()
    {
        this$0 = final_weathercontroller;
        val$event = WeatherDataError.this;
        super();
    }
}
