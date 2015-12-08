// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;


public class c
{

    private final String a;
    private final long b;
    private volatile int c;
    private final int d = -1;
    private final int e;
    private volatile boolean f;

    public c(String s, long l, int i, int j)
    {
        a = s;
        b = l;
        e = i;
        f = false;
        c = j;
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        c = i;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public long b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return e;
    }

    public boolean e()
    {
        return f;
    }
}
