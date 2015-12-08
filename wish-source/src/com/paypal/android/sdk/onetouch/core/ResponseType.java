// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


public final class ResponseType extends Enum
{

    private static final ResponseType a[];
    public static final ResponseType authorization_code;
    public static final ResponseType web;

    private ResponseType(String s, int i)
    {
        super(s, i);
    }

    public static ResponseType valueOf(String s)
    {
        return (ResponseType)Enum.valueOf(com/paypal/android/sdk/onetouch/core/ResponseType, s);
    }

    public static ResponseType[] values()
    {
        return (ResponseType[])a.clone();
    }

    static 
    {
        web = new ResponseType("web", 0);
        authorization_code = new ResponseType("authorization_code", 1);
        a = (new ResponseType[] {
            web, authorization_code
        });
    }
}
