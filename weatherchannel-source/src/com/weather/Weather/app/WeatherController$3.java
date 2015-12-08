// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import com.weather.Weather.ui.FrontPageView;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController

class this._cls0
    implements nsionsFoundListener
{

    final WeatherController this$0;

    public void onDimensionsFound(int i, int j)
    {
        Prefs prefs = TwcPrefs.getInstance();
        prefs.putInt(com.weather.util.prefs._WIDTH, i);
        prefs.putInt(com.weather.util.prefs._HEIGHT, j);
        header.setHeightWidth(i, j);
    }

    nsionsFoundListener()
    {
        this$0 = WeatherController.this;
        super();
    }
}
