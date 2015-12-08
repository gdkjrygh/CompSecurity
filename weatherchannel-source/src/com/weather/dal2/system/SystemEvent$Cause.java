// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.system;


// Referenced classes of package com.weather.dal2.system:
//            SystemEvent

public static final class  extends Enum
{

    private static final NETWORK_UP $VALUES[];
    public static final NETWORK_UP BOOT;
    public static final NETWORK_UP LBS_PROVIDER_CHANGED;
    public static final NETWORK_UP LOCALE_CHANGED;
    public static final NETWORK_UP NETWORK_DOWN;
    public static final NETWORK_UP NETWORK_UP;
    public static final NETWORK_UP POWER_CONNECTED;
    public static final NETWORK_UP POWER_DISCONNECTED;
    public static final NETWORK_UP USER_PRESENT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/dal2/system/SystemEvent$Cause, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BOOT = new <init>("BOOT", 0);
        LOCALE_CHANGED = new <init>("LOCALE_CHANGED", 1);
        USER_PRESENT = new <init>("USER_PRESENT", 2);
        POWER_CONNECTED = new <init>("POWER_CONNECTED", 3);
        POWER_DISCONNECTED = new <init>("POWER_DISCONNECTED", 4);
        LBS_PROVIDER_CHANGED = new <init>("LBS_PROVIDER_CHANGED", 5);
        NETWORK_DOWN = new <init>("NETWORK_DOWN", 6);
        NETWORK_UP = new <init>("NETWORK_UP", 7);
        $VALUES = (new .VALUES[] {
            BOOT, LOCALE_CHANGED, USER_PRESENT, POWER_CONNECTED, POWER_DISCONNECTED, LBS_PROVIDER_CHANGED, NETWORK_DOWN, NETWORK_UP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
