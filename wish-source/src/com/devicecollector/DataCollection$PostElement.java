// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;


// Referenced classes of package com.devicecollector:
//            DataCollection

public static final class postField extends Enum
{

    private static final SESSION_ID $VALUES[];
    public static final SESSION_ID DEVICE_COOKIE;
    public static final SESSION_ID ERROR_LIST;
    public static final SESSION_ID GEO_DATE;
    public static final SESSION_ID GEO_PROVIDER;
    public static final SESSION_ID LATITUDE;
    public static final SESSION_ID LONGITUDE;
    public static final SESSION_ID MERCHANT_ID;
    public static final SESSION_ID MOBILE_MODEL;
    public static final SESSION_ID OLD_DEVICE_COOKIE;
    public static final SESSION_ID OS_VERSION;
    public static final SESSION_ID SDK_TYPE;
    public static final SESSION_ID SDK_VERSION;
    public static final SESSION_ID SESSION_ID;
    public static final SESSION_ID USER_COOKIE;
    private String postField;

    public static postField valueOf(String s)
    {
        return (postField)Enum.valueOf(com/devicecollector/DataCollection$PostElement, s);
    }

    public static postField[] values()
    {
        return (postField[])$VALUES.clone();
    }

    public String postField()
    {
        return postField;
    }

    static 
    {
        LATITUDE = new <init>("LATITUDE", 0, "lat");
        LONGITUDE = new <init>("LONGITUDE", 1, "lon");
        GEO_DATE = new <init>("GEO_DATE", 2, "ltm");
        GEO_PROVIDER = new <init>("GEO_PROVIDER", 3, "lpv");
        OLD_DEVICE_COOKIE = new <init>("OLD_DEVICE_COOKIE", 4, "odc");
        DEVICE_COOKIE = new <init>("DEVICE_COOKIE", 5, "dc");
        USER_COOKIE = new <init>("USER_COOKIE", 6, "uc");
        OS_VERSION = new <init>("OS_VERSION", 7, "os");
        SDK_VERSION = new <init>("SDK_VERSION", 8, "sv");
        SDK_TYPE = new <init>("SDK_TYPE", 9, "st");
        MOBILE_MODEL = new <init>("MOBILE_MODEL", 10, "mdl");
        ERROR_LIST = new <init>("ERROR_LIST", 11, "err");
        MERCHANT_ID = new <init>("MERCHANT_ID", 12, "m");
        SESSION_ID = new <init>("SESSION_ID", 13, "s");
        $VALUES = (new .VALUES[] {
            LATITUDE, LONGITUDE, GEO_DATE, GEO_PROVIDER, OLD_DEVICE_COOKIE, DEVICE_COOKIE, USER_COOKIE, OS_VERSION, SDK_VERSION, SDK_TYPE, 
            MOBILE_MODEL, ERROR_LIST, MERCHANT_ID, SESSION_ID
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        postField = s1;
    }
}
