// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;


public class o
{

    private String a;
    private String b;
    private long c;
    private String d;

    public o()
    {
        a = "";
        b = "";
        c = 0L;
        d = "";
    }

    public o(o o1)
    {
        a = "";
        b = "";
        c = 0L;
        d = "";
        c(o1.d());
        b(o1.b());
        a(o1.a());
        a(o1.c());
    }

    public String a()
    {
        return a;
    }

    public void a(long l)
    {
        c = l;
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        b = s;
    }

    public long c()
    {
        return c;
    }

    public void c(String s)
    {
        d = s;
    }

    public String d()
    {
        return d;
    }
}
