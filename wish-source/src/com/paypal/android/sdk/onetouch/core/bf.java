// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


public final class bf extends Enum
{

    public static final bf a;
    public static final bf b;
    public static final bf c;
    public static final bf d;
    private static final bf e[];

    private bf(String s, int i)
    {
        super(s, i);
    }

    public static bf valueOf(String s)
    {
        return (bf)Enum.valueOf(com/paypal/android/sdk/onetouch/core/bf, s);
    }

    public static bf[] values()
    {
        return (bf[])e.clone();
    }

    static 
    {
        a = new bf("INTERNAL_SERVER_ERROR", 0);
        b = new bf("SERVER_COMMUNICATION_ERROR", 1);
        c = new bf("PARSE_RESPONSE_ERROR", 2);
        d = new bf("INTERNAL_ERROR", 3);
        e = (new bf[] {
            a, b, c, d
        });
    }
}
