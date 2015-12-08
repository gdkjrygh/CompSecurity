// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;


// Referenced classes of package com.weather.commons.ups.backend:
//            UpsCommonUtil

public static final class value extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN LOGGED_IN_TO_ANON_ACCOUNT;
    public static final UNKNOWN LOGGED_IN_TO_NAMED_ACCOUNT;
    public static final UNKNOWN LOGGED_OUT;
    public static final UNKNOWN TOKEN_EXPIRED;
    public static final UNKNOWN UNKNOWN;
    private final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/weather/commons/ups/backend/UpsCommonUtil$LoginStatus, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        LOGGED_IN_TO_NAMED_ACCOUNT = new <init>("LOGGED_IN_TO_NAMED_ACCOUNT", 0, 1);
        LOGGED_IN_TO_ANON_ACCOUNT = new <init>("LOGGED_IN_TO_ANON_ACCOUNT", 1, 2);
        LOGGED_OUT = new <init>("LOGGED_OUT", 2, 3);
        TOKEN_EXPIRED = new <init>("TOKEN_EXPIRED", 3, 4);
        UNKNOWN = new <init>("UNKNOWN", 4, 5);
        $VALUES = (new .VALUES[] {
            LOGGED_IN_TO_NAMED_ACCOUNT, LOGGED_IN_TO_ANON_ACCOUNT, LOGGED_OUT, TOKEN_EXPIRED, UNKNOWN
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
