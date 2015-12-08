// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;


// Referenced classes of package com.weather.commons.locations:
//            LocationManager

static final class  extends Enum
{

    private static final FOLLOW_ME $VALUES[];
    public static final FOLLOW_ME CURRENT_LOCATION;
    public static final FOLLOW_ME FOLLOW_ME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/locations/LocationManager$LocationPrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CURRENT_LOCATION = new <init>("CURRENT_LOCATION", 0);
        FOLLOW_ME = new <init>("FOLLOW_ME", 1);
        $VALUES = (new .VALUES[] {
            CURRENT_LOCATION, FOLLOW_ME
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
