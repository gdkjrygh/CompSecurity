// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;


public final class o extends Enum
{

    public static final o a;
    public static final o b;
    private static final o d[];
    private final int c;

    private o(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/facebook/ads/a/o, s);
    }

    public static o[] values()
    {
        return (o[])d.clone();
    }

    public int a()
    {
        return c;
    }

    static 
    {
        a = new o("HTML", 0, 0);
        b = new o("NATIVE", 1, 1);
        d = (new o[] {
            a, b
        });
    }
}
