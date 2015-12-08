// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.util.UnitType;

// Referenced classes of package com.weather.commons.facade:
//            CurrentWeatherFacade

static class 
{

    static final int $SwitchMap$com$weather$util$UnitType[];

    static 
    {
        $SwitchMap$com$weather$util$UnitType = new int[UnitType.values().length];
        try
        {
            $SwitchMap$com$weather$util$UnitType[UnitType.METRIC.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$util$UnitType[UnitType.HYBRID.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$weather$util$UnitType[UnitType.ENGLISH.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
