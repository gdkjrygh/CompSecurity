// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;


// Referenced classes of package com.weather.dal2.locations:
//            LocationPrefs

public static final class  extends Enum
{

    private static final FOLLOW_ME $VALUES[];
    public static final FOLLOW_ME FIXED_LOCATIONS;
    public static final FOLLOW_ME FOLLOW_ME;
    public static final FOLLOW_ME WIDGET_LOCATIONS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/dal2/locations/LocationPrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FIXED_LOCATIONS = new <init>("FIXED_LOCATIONS", 0);
        WIDGET_LOCATIONS = new <init>("WIDGET_LOCATIONS", 1);
        FOLLOW_ME = new <init>("FOLLOW_ME", 2);
        $VALUES = (new .VALUES[] {
            FIXED_LOCATIONS, WIDGET_LOCATIONS, FOLLOW_ME
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
