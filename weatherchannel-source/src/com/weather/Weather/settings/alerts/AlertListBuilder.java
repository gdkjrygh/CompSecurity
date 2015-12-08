// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import android.content.Context;
import com.weather.commons.push.ProductType;
import com.weather.util.device.LocaleUtil;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            WeatherAlertSettingsListItem

public class AlertListBuilder
{

    public static final Prefs prefs = TwcPrefs.getInstance();

    public AlertListBuilder()
    {
    }

    public static List buildLegacyMyAlertsScreenList(Context context)
    {
        ArrayList arraylist = new ArrayList();
        if (LocaleUtil.deviceCountrySupportsSevereAlerts())
        {
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_SEVERE, context.getString(0x7f070209), context.getString(0x7f070207), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS, false)));
        }
        if (LocaleUtil.isDeviceInUS())
        {
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_BREAKINGNEWS, context.getString(0x7f070068), context.getString(0x7f07020d), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERTS, false)));
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_LIGHTNING_STRIKES, context.getString(0x7f0701fe), context.getString(0x7f0701fc), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERTS, false)));
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_REAL_TIME_RAIN, context.getString(0x7f070205), context.getString(0x7f070204), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS, false)));
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_RAINSNOW, context.getString(0x7f070203), context.getString(0x7f070202), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERTS, false)));
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_POLLEN, context.getString(0x7f070201), context.getString(0x7f0701ff), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERTS, false)));
        } else
        {
            if (LocaleUtil.isDeviceInCanada())
            {
                arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_REAL_TIME_RAIN, context.getString(0x7f070205), context.getString(0x7f070204), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS, false)));
            }
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_RAINSNOW, context.getString(0x7f070203), context.getString(0x7f070202), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERTS, false)));
            if (LocaleUtil.isDeviceInUK())
            {
                arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_POLLEN, context.getString(0x7f070201), context.getString(0x7f0701ff), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERTS, false)));
            }
            if (LocaleUtil.deviceCountrySupportsRealTimeRainAlerts())
            {
                arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_REAL_TIME_RAIN, context.getString(0x7f070205), context.getString(0x7f070204), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS, false)));
                return arraylist;
            }
        }
        return arraylist;
    }

    public static List buildMyAlertsScreenList(Context context)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new WeatherAlertSettingsListItem(null, context.getString(0x7f0702a5), context.getString(0x7f0702a5), false));
        arraylist.add(new WeatherAlertSettingsListItem(ProductType.SIGNIFICANT_WEATHER_FORECAST, context.getString(0x7f0702b8), context.getString(0x7f0702b7), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS, false)));
        arraylist.add(new WeatherAlertSettingsListItem(null, context.getString(0x7f0702a4), context.getString(0x7f0702a4), false));
        if (LocaleUtil.isDeviceInUS())
        {
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_REAL_TIME_RAIN, context.getString(0x7f070205), context.getString(0x7f070204), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS, false)));
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_LIGHTNING_STRIKES, context.getString(0x7f0701fe), context.getString(0x7f0701fc), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERTS, false)));
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_SEVERE, context.getString(0x7f0701d3), context.getString(0x7f070207), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS, false)));
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_BREAKINGNEWS, context.getString(0x7f070068), context.getString(0x7f07020d), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERTS, false)));
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_RAINSNOW, context.getString(0x7f070203), context.getString(0x7f070202), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERTS, false)));
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_POLLEN, context.getString(0x7f070201), context.getString(0x7f0701ff), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERTS, false)));
        } else
        {
            if (LocaleUtil.deviceCountrySupportsRealTimeRainAlerts())
            {
                arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_REAL_TIME_RAIN, context.getString(0x7f070205), context.getString(0x7f070204), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS, false)));
            }
            if (LocaleUtil.deviceCountrySupportsSevereAlerts())
            {
                arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_SEVERE, context.getString(0x7f0701d3), context.getString(0x7f070207), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS, false)));
            }
            arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_RAINSNOW, context.getString(0x7f070203), context.getString(0x7f070202), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERTS, false)));
            if (LocaleUtil.isDeviceInUK())
            {
                arraylist.add(new WeatherAlertSettingsListItem(ProductType.PRODUCT_POLLEN, context.getString(0x7f070201), context.getString(0x7f0701ff), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERTS, false)));
                return arraylist;
            }
        }
        return arraylist;
    }

    public static List buildSignificantWeatherAlertsList(Context context)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new WeatherAlertSettingsListItem(ProductType.HEAVY_RAIN, context.getString(0x7f0702c0), context.getString(0x7f0702bf), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.HEAVY_RAIN, false)));
        arraylist.add(new WeatherAlertSettingsListItem(ProductType.THUNDERSTORM, context.getString(0x7f0702c8), context.getString(0x7f0702c7), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.THUNDERSTORM, false)));
        arraylist.add(new WeatherAlertSettingsListItem(ProductType.EXTREME_HEAT, context.getString(0x7f0702be), context.getString(0x7f070586), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.EXTREME_HEAT, false)));
        arraylist.add(new WeatherAlertSettingsListItem(ProductType.HIGH_WIND, context.getString(0x7f0702c4), context.getString(0x7f0702c3), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.HIGH_WIND, false)));
        arraylist.add(new WeatherAlertSettingsListItem(ProductType.DENSE_FOG, context.getString(0x7f0702ba), context.getString(0x7f0702b9), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.DENSE_FOG, false)));
        arraylist.add(new WeatherAlertSettingsListItem(ProductType.EXTREME_COLD, context.getString(0x7f0702bd), context.getString(0x7f0702bc), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.EXTREME_COLD, false)));
        arraylist.add(new WeatherAlertSettingsListItem(ProductType.HEAVY_SNOWFALL, context.getString(0x7f0702c2), context.getString(0x7f0702c1), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.HEAVY_SNOWFALL, false)));
        arraylist.add(new WeatherAlertSettingsListItem(ProductType.ICE, context.getString(0x7f0702c6), context.getString(0x7f0702c5), prefs.getBoolean(com.weather.util.prefs.TwcPrefs.Keys.ICE, false)));
        return arraylist;
    }

}
