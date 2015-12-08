// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.os.Bundle;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.Temperature;
import com.weather.commons.facade.WeatherAlertsFacade;
import com.weather.dal2.locations.SavedLocation;
import java.util.List;

public final class WeatherIntentSupport
{

    public static final String ALERT_COUNT_KEY = "com.weather.Weather.ui.ALERT_COUNT_KEY";
    public static final String ALERT_SEVERITY_KEY = "com.weather.Weather.ui.ALERT_SEVERITY_KEY";
    public static final String ICON_KEY = "com.weather.Weather.ui.ICON_KEY";
    public static final String LOCATION_KEY = "com.weather.Weather.ui.LOCATION_KEY";
    public static final String LOCATION_NAME_KEY = "com.weather.Weather.ui.LOCATION_NAME_KEY";
    public static final String PHRASE_KEY = "com.weather.Weather.ui.PHRASE_KEY";
    private static final String PREFIX = "com.weather.Weather.ui";
    public static final String TEMPERATURE_KEY = "com.weather.Weather.ui.TEMPERATURE_KEY";

    private WeatherIntentSupport()
    {
    }

    public static Bundle makeExtras(CurrentWeatherFacade currentweatherfacade, SavedLocation savedlocation)
    {
        int k = 0;
        Temperature temperature = currentweatherfacade.getCurrentTemp();
        WeatherAlertsFacade weatheralertsfacade = currentweatherfacade.getWeatherAlertsFacade();
        int i;
        int j;
        if (temperature.value != null)
        {
            i = ((Integer)temperature.value).intValue();
        } else
        {
            i = -1;
        }
        if (weatheralertsfacade != null)
        {
            j = weatheralertsfacade.getAlertsList().size();
        } else
        {
            j = 0;
        }
        if (weatheralertsfacade != null)
        {
            k = weatheralertsfacade.getLowestSeverityNumber();
        }
        return makeExtras(savedlocation, i, currentweatherfacade.getPhrase(), currentweatherfacade.getSkyCode(), j, k);
    }

    public static Bundle makeExtras(SavedLocation savedlocation, int i, String s, int j, int k, int l)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.weather.Weather.ui.LOCATION_KEY", savedlocation.getKeyTypeCountry());
        bundle.putString("com.weather.Weather.ui.LOCATION_NAME_KEY", savedlocation.getNickname());
        bundle.putInt("com.weather.Weather.ui.TEMPERATURE_KEY", i);
        bundle.putString("com.weather.Weather.ui.PHRASE_KEY", s);
        bundle.putInt("com.weather.Weather.ui.ICON_KEY", j);
        if (k > 0)
        {
            bundle.putInt("com.weather.Weather.ui.ALERT_COUNT_KEY", k);
            bundle.putInt("com.weather.Weather.ui.ALERT_SEVERITY_KEY", l);
        }
        return bundle;
    }
}
