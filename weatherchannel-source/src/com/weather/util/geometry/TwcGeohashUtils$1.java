// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.geometry;

import org.jgeohash.distance.MeasuringUnit;

// Referenced classes of package com.weather.util.geometry:
//            TwcGeohashUtils

static class 
{

    static final int $SwitchMap$org$jgeohash$distance$MeasuringUnit[];

    static 
    {
        $SwitchMap$org$jgeohash$distance$MeasuringUnit = new int[MeasuringUnit.values().length];
        try
        {
            $SwitchMap$org$jgeohash$distance$MeasuringUnit[MeasuringUnit.MILE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$org$jgeohash$distance$MeasuringUnit[MeasuringUnit.METER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$org$jgeohash$distance$MeasuringUnit[MeasuringUnit.KILOMETER.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
