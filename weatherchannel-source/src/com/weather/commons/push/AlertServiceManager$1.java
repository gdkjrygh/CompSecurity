// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;


// Referenced classes of package com.weather.commons.push:
//            AlertServiceManager

static class e
{

    static final int $SwitchMap$com$weather$commons$push$PushService$ServiceType[];

    static 
    {
        $SwitchMap$com$weather$commons$push$PushService$ServiceType = new int[e.values().length];
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.SEVERE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.POLLEN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.RAINSNOW.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.HEAVY_RAIN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.THUNDERSTORM.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.EXTREME_HEAT.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.HIGH_WIND.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.DENSE_FOG.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.EXTREME_COLD.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.HEAVY_SNOWFALL.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.ICE.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.BREAKINGNEWS.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.REAL_TIME_RAIN.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.FOLLOWME_LIGHTNING.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[e.FOLLOWME_SEVERE.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
