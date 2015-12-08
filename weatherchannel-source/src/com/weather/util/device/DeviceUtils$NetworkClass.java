// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.device;


// Referenced classes of package com.weather.util.device:
//            DeviceUtils

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN FOUR_G;
    public static final UNKNOWN THREE_G;
    public static final UNKNOWN TWO_G;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/util/device/DeviceUtils$NetworkClass, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TWO_G = new <init>("TWO_G", 0);
        THREE_G = new <init>("THREE_G", 1);
        FOUR_G = new <init>("FOUR_G", 2);
        UNKNOWN = new <init>("UNKNOWN", 3);
        $VALUES = (new .VALUES[] {
            TWO_G, THREE_G, FOUR_G, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
