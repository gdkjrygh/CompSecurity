// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.a.a;

import com.gtp.a.a.b.c;

public class b
{

    private int a;
    private String b;
    private String c;
    private int d;
    private int e;
    private int f;

    public b()
    {
        b = "";
        c = "";
        d = 0;
        e = 0;
        f = 0;
    }

    public b(int i)
    {
        b = "";
        c = "";
        d = 0;
        e = 0;
        f = 0;
        a = i;
    }

    public String a()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(a).append("#");
        stringbuffer.append(b).append("#");
        stringbuffer.append(c).append("#");
        stringbuffer.append(d).append("#");
        stringbuffer.append(e).append("#");
        stringbuffer.append(f);
        com.gtp.a.a.b.c.a("adid", (new StringBuilder()).append("OrganizeData => ").append(stringbuffer.toString()).toString());
        return stringbuffer.toString();
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(String s)
    {
        b = s;
    }

    public int b()
    {
        return a;
    }

    public void b(int i)
    {
        d = i;
    }

    public void b(String s)
    {
        c = s;
    }

    public String c()
    {
        return b;
    }

    public void c(int i)
    {
        e = i;
    }

    public String d()
    {
        return c;
    }

    public void d(int i)
    {
        f = i;
    }
}
