// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;


// Referenced classes of package com.weather.commons.ups.backend:
//            UpsCommonUtil

public static final class A extends Enum
{

    private static final GENERIC_ERROR $VALUES[];
    public static final GENERIC_ERROR AUTHENTICATION_ERROR;
    public static final GENERIC_ERROR CONFLICT;
    public static final GENERIC_ERROR GENERIC_ERROR;
    public static final GENERIC_ERROR JSON_ERROR;
    public static final GENERIC_ERROR NETWORK_ERROR;
    public static final GENERIC_ERROR SUCCESS;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/weather/commons/ups/backend/UpsCommonUtil$LoginResponse, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 1);
        JSON_ERROR = new <init>("JSON_ERROR", 2);
        AUTHENTICATION_ERROR = new <init>("AUTHENTICATION_ERROR", 3);
        CONFLICT = new <init>("CONFLICT", 4);
        GENERIC_ERROR = new <init>("GENERIC_ERROR", 5);
        $VALUES = (new .VALUES[] {
            SUCCESS, NETWORK_ERROR, JSON_ERROR, AUTHENTICATION_ERROR, CONFLICT, GENERIC_ERROR
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
