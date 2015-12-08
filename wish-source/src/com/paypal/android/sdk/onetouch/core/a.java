// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    private static a c;
    private static a d;
    private static final a f[];
    private int e;

    private a(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/paypal/android/sdk/onetouch/core/a, s);
    }

    public static a[] values()
    {
        return (a[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new a("UNKNOWN", 0, 0);
        c = new a("PAYPAL", 1, 10);
        d = new a("EBAY", 2, 11);
        b = new a("MSDK", 3, 12);
        f = (new a[] {
            a, c, d, b
        });
    }
}
