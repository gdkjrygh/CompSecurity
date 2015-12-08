// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.device;


// Referenced classes of package com.weather.util.device:
//            DeviceUtils

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN MOBILE;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN WIFI;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/util/device/DeviceUtils$NetworkType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        WIFI = new <init>("WIFI", 0);
        MOBILE = new <init>("MOBILE", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            WIFI, MOBILE, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
