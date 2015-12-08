// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


public final class bi extends Enum
{

    public static final bi a;
    public static final bi b;
    public static final bi c;
    private static bi d;
    private static bi e;
    private static final bi f[];

    private bi(String s, int i)
    {
        super(s, i);
    }

    public static bi valueOf(String s)
    {
        return (bi)Enum.valueOf(com/paypal/android/sdk/onetouch/core/bi, s);
    }

    public static bi[] values()
    {
        return (bi[])f.clone();
    }

    static 
    {
        a = new bi("GET", 0);
        b = new bi("POST", 1);
        d = new bi("PUT", 2);
        c = new bi("DELETE", 3);
        e = new bi("HEAD", 4);
        f = (new bi[] {
            a, b, d, c, e
        });
    }
}
