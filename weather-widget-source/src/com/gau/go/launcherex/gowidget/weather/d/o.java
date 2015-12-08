// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import java.text.SimpleDateFormat;

public class o
{

    private final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String b;
    private String c;
    private int d;
    private String e;
    private boolean f;

    public o()
    {
    }

    public String a()
    {
        return b;
    }

    public void a(int i)
    {
        d = i;
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public String b()
    {
        return c;
    }

    public void b(String s)
    {
        c = s;
    }

    public int c()
    {
        return d;
    }

    public void c(String s)
    {
        e = s;
    }

    public String d()
    {
        return e;
    }

    public boolean e()
    {
        return f;
    }

    public String f()
    {
        return (new StringBuilder()).append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<root><installDate>").append(a()).append("</installDate>").append("<currentDate>").append(b()).append("</currentDate>").append("<serialRamdonKey>").append(c()).append("</serialRamdonKey>").append("<serialCode>").append(d()).append("</serialCode>").append("<paid>").append(e()).append("</paid>").append("</root>").toString();
    }
}
