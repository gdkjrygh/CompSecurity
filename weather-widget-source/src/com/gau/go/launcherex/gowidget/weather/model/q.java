// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;


public class q
{

    private String a;
    private int b;
    private String c;

    public q()
    {
        a = "--";
        b = -10000;
        c = "--";
    }

    public q(String s, int i, String s1)
    {
        a = "--";
        b = -10000;
        c = "--";
        a = s;
        b = i;
        c = s1;
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        return c;
    }

    public void b(String s)
    {
        c = s;
    }
}
