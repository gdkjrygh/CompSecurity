// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import com.weather.commons.push.ProductType;

// Referenced classes of package com.weather.Weather.settings:
//            SettingsActivity

static class 
{

    static final int $SwitchMap$com$weather$commons$push$ProductType[];

    static 
    {
        $SwitchMap$com$weather$commons$push$ProductType = new int[ProductType.values().length];
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_RAINSNOW.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_REAL_TIME_RAIN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_LIGHTNING_STRIKES.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_BREAKINGNEWS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_POLLEN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$commons$push$ProductType[ProductType.PRODUCT_SEVERE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
