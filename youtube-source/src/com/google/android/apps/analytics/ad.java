// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


public final class ad
{

    private final String a;
    private String b;
    private final double c;
    private double d;
    private double e;

    public ad(String s, double d1)
    {
        b = null;
        d = 0.0D;
        e = 0.0D;
        if (s == null || s.trim().length() == 0)
        {
            throw new IllegalArgumentException("orderId must not be empty or null");
        } else
        {
            a = s;
            c = d1;
            return;
        }
    }

    static String a(ad ad1)
    {
        return ad1.a;
    }

    static double b(ad ad1)
    {
        return ad1.c;
    }

    static String c(ad ad1)
    {
        return ad1.b;
    }

    static double d(ad ad1)
    {
        return ad1.d;
    }

    static double e(ad ad1)
    {
        return ad1.e;
    }

    public final ad a(double d1)
    {
        d = d1;
        return this;
    }

    public final ad a(String s)
    {
        b = s;
        return this;
    }

    public final ad b(double d1)
    {
        e = d1;
        return this;
    }
}
