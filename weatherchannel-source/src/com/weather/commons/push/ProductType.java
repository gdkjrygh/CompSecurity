// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;


public final class ProductType extends Enum
{

    private static final ProductType $VALUES[];
    public static final ProductType DENSE_FOG;
    public static final ProductType EXTREME_COLD;
    public static final ProductType EXTREME_HEAT;
    public static final ProductType HEAVY_RAIN;
    public static final ProductType HEAVY_SNOWFALL;
    public static final ProductType HIGH_WIND;
    public static final ProductType ICE;
    public static final ProductType PRODUCT_BREAKINGNEWS;
    public static final ProductType PRODUCT_LIGHTNING_STRIKES;
    public static final ProductType PRODUCT_POLLEN;
    public static final ProductType PRODUCT_RAINSNOW;
    public static final ProductType PRODUCT_REAL_TIME_RAIN;
    public static final ProductType PRODUCT_SEVERE;
    public static final ProductType SIGNIFICANT_WEATHER_FORECAST;
    public static final ProductType THUNDERSTORM;
    private final com.weather.dal2.locations.SavedLocation.AlertType alertType;
    private final String productName;
    private final com.weather.util.prefs.TwcPrefs.Keys twcPrefsKey;

    private ProductType(String s, int i, String s1, com.weather.dal2.locations.SavedLocation.AlertType alerttype, com.weather.util.prefs.TwcPrefs.Keys keys)
    {
        super(s, i);
        productName = s1;
        alertType = alerttype;
        twcPrefsKey = keys;
    }

    public static ProductType getProduct(String s)
    {
        ProductType aproducttype[] = values();
        int j = aproducttype.length;
        for (int i = 0; i < j; i++)
        {
            ProductType producttype = aproducttype[i];
            if (producttype.getProductName().equalsIgnoreCase(s))
            {
                return producttype;
            }
        }

        return null;
    }

    public static ProductType valueOf(String s)
    {
        return (ProductType)Enum.valueOf(com/weather/commons/push/ProductType, s);
    }

    public static ProductType[] values()
    {
        return (ProductType[])$VALUES.clone();
    }

    public com.weather.dal2.locations.SavedLocation.AlertType getAlertType()
    {
        return alertType;
    }

    public String getProductName()
    {
        return productName;
    }

    public com.weather.util.prefs.TwcPrefs.Keys getTwcPrefsKey()
    {
        return twcPrefsKey;
    }

    static 
    {
        PRODUCT_SEVERE = new ProductType("PRODUCT_SEVERE", 0, "severe", com.weather.dal2.locations.SavedLocation.AlertType.severe, com.weather.util.prefs.TwcPrefs.Keys.SEVERE_ALERTS);
        PRODUCT_POLLEN = new ProductType("PRODUCT_POLLEN", 1, "pollen", com.weather.dal2.locations.SavedLocation.AlertType.pollen, com.weather.util.prefs.TwcPrefs.Keys.POLLEN_ALERTS);
        PRODUCT_RAINSNOW = new ProductType("PRODUCT_RAINSNOW", 2, "precip", com.weather.dal2.locations.SavedLocation.AlertType.rainSnow, com.weather.util.prefs.TwcPrefs.Keys.RAIN_SNOW_ALERTS);
        PRODUCT_REAL_TIME_RAIN = new ProductType("PRODUCT_REAL_TIME_RAIN", 3, "followme-precip", com.weather.dal2.locations.SavedLocation.AlertType.realTimeRain, com.weather.util.prefs.TwcPrefs.Keys.REAL_TIME_RAIN_ALERTS);
        PRODUCT_BREAKINGNEWS = new ProductType("PRODUCT_BREAKINGNEWS", 4, "breakingnews", com.weather.dal2.locations.SavedLocation.AlertType.breaking, com.weather.util.prefs.TwcPrefs.Keys.BREAKING_NEWS_ALERTS);
        PRODUCT_LIGHTNING_STRIKES = new ProductType("PRODUCT_LIGHTNING_STRIKES", 5, "followme-lightning", com.weather.dal2.locations.SavedLocation.AlertType.lightning, com.weather.util.prefs.TwcPrefs.Keys.LIGHTNING_ALERTS);
        SIGNIFICANT_WEATHER_FORECAST = new ProductType("SIGNIFICANT_WEATHER_FORECAST", 6, "significant-weather", com.weather.dal2.locations.SavedLocation.AlertType.significantWeatherForecast, com.weather.util.prefs.TwcPrefs.Keys.SIGNIFICANT_WEATHER_FORECAST_ALERTS);
        HEAVY_RAIN = new ProductType("HEAVY_RAIN", 7, "NRF", com.weather.dal2.locations.SavedLocation.AlertType.heavy_rain, com.weather.util.prefs.TwcPrefs.Keys.HEAVY_RAIN);
        THUNDERSTORM = new ProductType("THUNDERSTORM", 8, "NTS", com.weather.dal2.locations.SavedLocation.AlertType.thunderstorm, com.weather.util.prefs.TwcPrefs.Keys.THUNDERSTORM);
        EXTREME_HEAT = new ProductType("EXTREME_HEAT", 9, "NEH", com.weather.dal2.locations.SavedLocation.AlertType.extreme_heat, com.weather.util.prefs.TwcPrefs.Keys.EXTREME_HEAT);
        HIGH_WIND = new ProductType("HIGH_WIND", 10, "NHW", com.weather.dal2.locations.SavedLocation.AlertType.high_wind, com.weather.util.prefs.TwcPrefs.Keys.HIGH_WIND);
        DENSE_FOG = new ProductType("DENSE_FOG", 11, "NFG", com.weather.dal2.locations.SavedLocation.AlertType.dense_fog, com.weather.util.prefs.TwcPrefs.Keys.DENSE_FOG);
        EXTREME_COLD = new ProductType("EXTREME_COLD", 12, "NEC", com.weather.dal2.locations.SavedLocation.AlertType.extreme_cold, com.weather.util.prefs.TwcPrefs.Keys.EXTREME_COLD);
        HEAVY_SNOWFALL = new ProductType("HEAVY_SNOWFALL", 13, "NSF", com.weather.dal2.locations.SavedLocation.AlertType.heavy_snowfall, com.weather.util.prefs.TwcPrefs.Keys.HEAVY_SNOWFALL);
        ICE = new ProductType("ICE", 14, "NIC", com.weather.dal2.locations.SavedLocation.AlertType.ice, com.weather.util.prefs.TwcPrefs.Keys.ICE);
        $VALUES = (new ProductType[] {
            PRODUCT_SEVERE, PRODUCT_POLLEN, PRODUCT_RAINSNOW, PRODUCT_REAL_TIME_RAIN, PRODUCT_BREAKINGNEWS, PRODUCT_LIGHTNING_STRIKES, SIGNIFICANT_WEATHER_FORECAST, HEAVY_RAIN, THUNDERSTORM, EXTREME_HEAT, 
            HIGH_WIND, DENSE_FOG, EXTREME_COLD, HEAVY_SNOWFALL, ICE
        });
    }
}
