// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import com.weather.Weather.widgets.WidgetType;
import com.weather.commons.push.ProductType;

// Referenced classes of package com.weather.Weather.app:
//            FlagshipApplication

static class Type
{

    static final int $SwitchMap$com$weather$Weather$widgets$WidgetType[];
    static final int $SwitchMap$com$weather$commons$push$ProductType[];
    static final int $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType[];

    static 
    {
        $SwitchMap$com$weather$commons$push$ProductType = new int[ProductType.values().length];
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_BREAKINGNEWS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_POLLEN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_RAINSNOW.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_SEVERE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_REAL_TIME_RAIN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_LIGHTNING_STRIKES.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        $SwitchMap$com$weather$Weather$widgets$WidgetType = new int[WidgetType.values().length];
        try
        {
            $SwitchMap$com$weather$Weather$widgets$WidgetType[WidgetType.OneByOne.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$weather$Weather$widgets$WidgetType[WidgetType.TwoByTwo.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$weather$Weather$widgets$WidgetType[WidgetType.FourByOne.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$weather$Weather$widgets$WidgetType[WidgetType.FourByTwo.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType = new int[com.weather.dal2.locations.e.values().length];
        try
        {
            $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType[com.weather.dal2.locations.e.lightning.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType[com.weather.dal2.locations.e.realTimeRain.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$dal2$locations$SavedLocation$AlertType[com.weather.dal2.locations.e.severe.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
