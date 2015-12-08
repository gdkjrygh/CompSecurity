// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


public final class r
{

    private final String a;
    private final String b;
    private final double c;
    private final long d;
    private String e;
    private String f;

    public r(String s, String s1, double d1, long l)
    {
        e = null;
        f = null;
        if (s == null || s.trim().length() == 0)
        {
            throw new IllegalArgumentException("orderId must not be empty or null");
        }
        if (s1 == null || s1.trim().length() == 0)
        {
            throw new IllegalArgumentException("itemSKU must not be empty or null");
        } else
        {
            a = s;
            b = s1;
            c = d1;
            d = l;
            return;
        }
    }

    static String a(r r1)
    {
        return r1.a;
    }

    static String b(r r1)
    {
        return r1.b;
    }

    static double c(r r1)
    {
        return r1.c;
    }

    static long d(r r1)
    {
        return r1.d;
    }

    static String e(r r1)
    {
        return r1.e;
    }

    static String f(r r1)
    {
        return r1.f;
    }

    public final r a(String s)
    {
        e = s;
        return this;
    }

    public final r b(String s)
    {
        f = s;
        return this;
    }
}
