// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.lotame;


// Referenced classes of package com.weather.ads2.lotame:
//            LotamePrefs

public static final class  extends Enum
{

    private static final LAST_V1_UPDATE $VALUES[];
    public static final LAST_V1_UPDATE AUDIENCE_EXPIRES_AT;
    public static final LAST_V1_UPDATE AUDIENCE_VALUE;
    public static final LAST_V1_UPDATE LAST_V1_UPDATE;
    public static final LAST_V1_UPDATE LPID_EXPIRES_AT;
    public static final LAST_V1_UPDATE LPID_VALUE;
    public static final LAST_V1_UPDATE TPID_EXPIRES_AT;
    public static final LAST_V1_UPDATE TPID_VALUE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/ads2/lotame/LotamePrefs$Keys, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AUDIENCE_VALUE = new <init>("AUDIENCE_VALUE", 0);
        AUDIENCE_EXPIRES_AT = new <init>("AUDIENCE_EXPIRES_AT", 1);
        TPID_VALUE = new <init>("TPID_VALUE", 2);
        LPID_VALUE = new <init>("LPID_VALUE", 3);
        TPID_EXPIRES_AT = new <init>("TPID_EXPIRES_AT", 4);
        LPID_EXPIRES_AT = new <init>("LPID_EXPIRES_AT", 5);
        LAST_V1_UPDATE = new <init>("LAST_V1_UPDATE", 6);
        $VALUES = (new .VALUES[] {
            AUDIENCE_VALUE, AUDIENCE_EXPIRES_AT, TPID_VALUE, LPID_VALUE, TPID_EXPIRES_AT, LPID_EXPIRES_AT, LAST_V1_UPDATE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
