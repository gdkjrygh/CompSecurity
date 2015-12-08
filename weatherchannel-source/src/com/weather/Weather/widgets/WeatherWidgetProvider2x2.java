// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

// Referenced classes of package com.weather.Weather.widgets:
//            WeatherWidgetProvider, WidgetType

public class WeatherWidgetProvider2x2 extends WeatherWidgetProvider
{

    private static final String TAG = "WeatherWidgetProvider2x2";

    public WeatherWidgetProvider2x2()
    {
    }

    protected String getClassName()
    {
        return "WeatherWidgetProvider2x2";
    }

    public int getLayoutId()
    {
        return 0x7f0300cc;
    }

    protected void scheduleClockUpdate(Context context, Bundle bundle, int i)
    {
    }

    static 
    {
        widgetTypeMap.put(com/weather/Weather/widgets/WeatherWidgetProvider2x2.getCanonicalName(), WidgetType.TwoByTwo);
    }
}
