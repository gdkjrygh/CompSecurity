// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;


public final class CollectorEnum extends Enum
{

    private static final CollectorEnum $VALUES[];
    public static final CollectorEnum DEVICE_COOKIE;
    public static final CollectorEnum GEO_LOCATION;
    public static final CollectorEnum MAC_ADDRESS;
    public static final CollectorEnum USER_COOKIE;
    public static final CollectorEnum WEB;
    private String postValue;

    private CollectorEnum(String s, int i, String s1)
    {
        super(s, i);
        postValue = s1;
    }

    public static CollectorEnum valueOf(String s)
    {
        return (CollectorEnum)Enum.valueOf(com/devicecollector/collectors/CollectorEnum, s);
    }

    public static CollectorEnum[] values()
    {
        return (CollectorEnum[])$VALUES.clone();
    }

    public String postValue()
    {
        return postValue;
    }

    static 
    {
        MAC_ADDRESS = new CollectorEnum("MAC_ADDRESS", 0, "collector_mac_addrs");
        WEB = new CollectorEnum("WEB", 1, "collector_web");
        DEVICE_COOKIE = new CollectorEnum("DEVICE_COOKIE", 2, "collector_device_cookie");
        USER_COOKIE = new CollectorEnum("USER_COOKIE", 3, "collector_user_cookie");
        GEO_LOCATION = new CollectorEnum("GEO_LOCATION", 4, "collector_geo_loc");
        $VALUES = (new CollectorEnum[] {
            MAC_ADDRESS, WEB, DEVICE_COOKIE, USER_COOKIE, GEO_LOCATION
        });
    }
}
