// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.location;


// Referenced classes of package com.weather.ads2.location:
//            LocationPrefs

public static final class  extends Enum
{

    private static final LONGITUDE $VALUES[];
    public static final LONGITUDE LATITUDE;
    public static final LONGITUDE LONGITUDE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/ads2/location/LocationPrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LATITUDE = new <init>("LATITUDE", 0);
        LONGITUDE = new <init>("LONGITUDE", 1);
        $VALUES = (new .VALUES[] {
            LATITUDE, LONGITUDE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
