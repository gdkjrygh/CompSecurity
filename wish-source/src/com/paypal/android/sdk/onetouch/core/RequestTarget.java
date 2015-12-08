// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


public final class RequestTarget extends Enum
{

    private static final RequestTarget a[];
    public static final RequestTarget browser;
    public static final RequestTarget wallet;

    private RequestTarget(String s, int i)
    {
        super(s, i);
    }

    public static RequestTarget valueOf(String s)
    {
        return (RequestTarget)Enum.valueOf(com/paypal/android/sdk/onetouch/core/RequestTarget, s);
    }

    public static RequestTarget[] values()
    {
        return (RequestTarget[])a.clone();
    }

    static 
    {
        browser = new RequestTarget("browser", 0);
        wallet = new RequestTarget("wallet", 1);
        a = (new RequestTarget[] {
            browser, wallet
        });
    }
}
