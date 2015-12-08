// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;


// Referenced classes of package com.weather.Weather.checkin:
//            CheckinPrefs

public static final class  extends Enum
{

    private static final HAS_LAUNCHED $VALUES[];
    public static final HAS_LAUNCHED HAS_LAUNCHED;
    public static final HAS_LAUNCHED LAST_CHECKIN_CODE;
    public static final HAS_LAUNCHED LAST_CHECKIN_ID;
    public static final HAS_LAUNCHED LAST_CHECKIN_LAT;
    public static final HAS_LAUNCHED LAST_CHECKIN_LONG;
    public static final HAS_LAUNCHED LAST_CHECKIN_TIME;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/Weather/checkin/CheckinPrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LAST_CHECKIN_TIME = new <init>("LAST_CHECKIN_TIME", 0);
        LAST_CHECKIN_ID = new <init>("LAST_CHECKIN_ID", 1);
        LAST_CHECKIN_LAT = new <init>("LAST_CHECKIN_LAT", 2);
        LAST_CHECKIN_LONG = new <init>("LAST_CHECKIN_LONG", 3);
        LAST_CHECKIN_CODE = new <init>("LAST_CHECKIN_CODE", 4);
        HAS_LAUNCHED = new <init>("HAS_LAUNCHED", 5);
        $VALUES = (new .VALUES[] {
            LAST_CHECKIN_TIME, LAST_CHECKIN_ID, LAST_CHECKIN_LAT, LAST_CHECKIN_LONG, LAST_CHECKIN_CODE, HAS_LAUNCHED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
