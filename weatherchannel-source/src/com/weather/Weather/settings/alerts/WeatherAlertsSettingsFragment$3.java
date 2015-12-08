// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import com.weather.commons.push.ProductType;

// Referenced classes of package com.weather.Weather.settings.alerts:
//            WeatherAlertsSettingsFragment

static class I
{

    static final int $SwitchMap$com$weather$commons$push$ProductType[];

    static 
    {
        $SwitchMap$com$weather$commons$push$ProductType = new int[ProductType.values().length];
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_SEVERE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_POLLEN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_RAINSNOW.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_REAL_TIME_RAIN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_BREAKINGNEWS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_LIGHTNING_STRIKES.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.SIGNIFICANT_WEATHER_FORECAST.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
