// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;

// Referenced classes of package com.weather.Weather.widgets:
//            WeatherWidgetProvider, WidgetType

public class WeatherWidgetProvider1x1 extends WeatherWidgetProvider
{

    private static final String TAG = "WeatherWidgetProvider1x1";

    public WeatherWidgetProvider1x1()
    {
    }

    protected String getClassName()
    {
        return "WeatherWidgetProvider1x1";
    }

    public int getLayoutId()
    {
        return 0x7f0300cb;
    }

    protected void scheduleClockUpdate(Context context, Bundle bundle, int i)
    {
    }

    static 
    {
        widgetTypeMap.put(com/weather/Weather/widgets/WeatherWidgetProvider1x1.getCanonicalName(), WidgetType.OneByOne);
    }
}
