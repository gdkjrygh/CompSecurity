// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.util.Log;
import com.weather.Weather.feedback.NpsAppRater;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController

class this._cls0
    implements Runnable
{

    final WeatherController this$0;

    public void run()
    {
        try
        {
            (new NpsAppRater()).showPopUps(WeatherController.this);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("WeatherController", "Ignoring NpsAppRater exception", throwable);
        }
    }

    ()
    {
        this$0 = WeatherController.this;
        super();
    }
}
