// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;


// Referenced classes of package com.weather.Weather.settings.alerts:
//            WeatherAlertSettingListAdapter

public static final class  extends Enum
{

    private static final CHECK_BOX $VALUES[];
    public static final CHECK_BOX CHECK_BOX;
    public static final CHECK_BOX TEXT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/Weather/settings/alerts/WeatherAlertSettingListAdapter$OnOffIndicator, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TEXT = new <init>("TEXT", 0);
        CHECK_BOX = new <init>("CHECK_BOX", 1);
        $VALUES = (new .VALUES[] {
            TEXT, CHECK_BOX
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
