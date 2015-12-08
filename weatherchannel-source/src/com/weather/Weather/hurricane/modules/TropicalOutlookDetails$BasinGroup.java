// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import com.google.common.collect.ImmutableList;
import com.weather.commons.analytics.hurricane.BasinAttributeValue;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            TropicalOutlookDetails

public static final class localyticsValue extends Enum
{

    private static final PACIFIC $VALUES[];
    public static final PACIFIC ATLANTIC;
    public static final PACIFIC ATLANTIC_ES;
    public static final PACIFIC PACIFIC;
    final ImmutableList basins;
    final BasinAttributeValue localyticsValue;

    public static localyticsValue valueOf(String s)
    {
        return (localyticsValue)Enum.valueOf(com/weather/Weather/hurricane/modules/TropicalOutlookDetails$BasinGroup, s);
    }

    public static localyticsValue[] values()
    {
        return (localyticsValue[])$VALUES.clone();
    }

    static 
    {
        ATLANTIC = new <init>("ATLANTIC", 0, ImmutableList.of(new >("XXZ021", Integer.valueOf(0x7f070060))), BasinAttributeValue.ATLANTIC);
        ATLANTIC_ES = new <init>("ATLANTIC_ES", 1, ImmutableList.of(new >("XXZ004", Integer.valueOf(0x7f070086))), BasinAttributeValue.ATLANTIC);
        PACIFIC = new <init>("PACIFIC", 2, ImmutableList.of(new >("XXZ007", Integer.valueOf(0x7f0700ea)), new >("XXZ014", Integer.valueOf(0x7f0701f6))), BasinAttributeValue.EASTERN_PACIFIC);
        $VALUES = (new .VALUES[] {
            ATLANTIC, ATLANTIC_ES, PACIFIC
        });
    }

    private (String s, int i, ImmutableList immutablelist, BasinAttributeValue basinattributevalue)
    {
        super(s, i);
        basins = immutablelist;
        localyticsValue = basinattributevalue;
    }
}
