// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherfx;


// Referenced classes of package com.weather.ads2.weatherfx:
//            WeatherFxPrefs

public static final class  extends Enum
{

    private static final EXPIRES_AT $VALUES[];
    public static final EXPIRES_AT EXPIRES_AT;
    public static final EXPIRES_AT VALUE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/ads2/weatherfx/WeatherFxPrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VALUE = new <init>("VALUE", 0);
        EXPIRES_AT = new <init>("EXPIRES_AT", 1);
        $VALUES = (new .VALUES[] {
            VALUE, EXPIRES_AT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
