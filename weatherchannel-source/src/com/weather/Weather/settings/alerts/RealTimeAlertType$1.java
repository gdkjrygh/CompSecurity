// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;


// Referenced classes of package com.weather.Weather.settings.alerts:
//            RealTimeAlertType

static class 
{

    static final int $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType[];

    static 
    {
        $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType = new int[RealTimeAlertType.values().length];
        try
        {
            $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType[RealTimeAlertType.REAL_TIME_RAIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$Weather$settings$alerts$RealTimeAlertType[RealTimeAlertType.LIGHTNING_STRIKES.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
