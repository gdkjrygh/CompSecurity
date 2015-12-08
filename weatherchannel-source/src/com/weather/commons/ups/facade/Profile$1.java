// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;


// Referenced classes of package com.weather.commons.ups.facade:
//            Profile

static class iceType
{

    static final int $SwitchMap$com$weather$commons$push$PushService$ServiceType[];

    static 
    {
        $SwitchMap$com$weather$commons$push$PushService$ServiceType = new int[com.weather.commons.push.e.ServiceType.values().length];
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.SEVERE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.POLLEN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.RAINSNOW.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.HEAVY_RAIN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.THUNDERSTORM.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.EXTREME_HEAT.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.HIGH_WIND.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.DENSE_FOG.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.EXTREME_COLD.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.HEAVY_SNOWFALL.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.ICE.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.BREAKINGNEWS.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.REAL_TIME_RAIN.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.FOLLOWME_LIGHTNING.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$commons$push$PushService$ServiceType[com.weather.commons.push.e.ServiceType.FOLLOWME_SEVERE.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
