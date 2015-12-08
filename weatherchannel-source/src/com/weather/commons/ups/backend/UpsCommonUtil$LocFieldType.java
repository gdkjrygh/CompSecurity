// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;


// Referenced classes of package com.weather.commons.ups.backend:
//            UpsCommonUtil

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN KEY_TYPE;
    public static final UNKNOWN LAT_LONG;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/ups/backend/UpsCommonUtil$LocFieldType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LAT_LONG = new <init>("LAT_LONG", 0);
        KEY_TYPE = new <init>("KEY_TYPE", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            LAT_LONG, KEY_TYPE, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
