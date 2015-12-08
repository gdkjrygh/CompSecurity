// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class hv
{

    private final String a;
    private final String b;
    private String c;
    private int d;

    public hv(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final hu.a a()
    {
        return new hu.a(0, a, b, c, d);
    }

    public final hv a(int i)
    {
        d = i;
        return this;
    }

    public final hv a(String s)
    {
        c = s;
        return this;
    }
}
