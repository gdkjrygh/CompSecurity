// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;


// Referenced classes of package com.weather.commons.push:
//            PushService

public static final class  extends Enum
{

    private static final BASIC_SERVICES $VALUES[];
    public static final BASIC_SERVICES ALL_SERVICES;
    public static final BASIC_SERVICES BASIC_SERVICES;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/push/PushService$ServicesSet, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ALL_SERVICES = new <init>("ALL_SERVICES", 0);
        BASIC_SERVICES = new <init>("BASIC_SERVICES", 1);
        $VALUES = (new .VALUES[] {
            ALL_SERVICES, BASIC_SERVICES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
