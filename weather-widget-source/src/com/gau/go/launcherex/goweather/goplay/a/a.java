// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay.a;

import android.content.Context;
import android.text.format.Time;
import com.gau.go.a.f.e;
import com.gau.go.launcherex.gowidget.statistics.w;

public class a
{

    private static final Time y = new Time();
    protected String a;
    protected String b;
    protected String c;
    protected String d;
    protected String e;
    protected String f;
    protected String g;
    protected String h;
    protected String i;
    protected String j;
    protected String k;
    protected String l;
    protected String m;
    protected String n;
    protected String o;
    protected String p;
    protected String q;
    protected String r;
    protected String s;
    protected String t;
    protected String u;
    protected String v;
    protected String w;
    protected String x;

    public a(Context context, String s1, String s2)
    {
        b = "0";
        c = "0";
        d = "0";
        e = "0";
        f = "0";
        g = "0";
        h = "0";
        j = "0";
        k = "0";
        l = "0";
        m = "0";
        n = "0";
        o = "0";
        p = "0";
        q = "0";
        r = "0";
        s = "0";
        t = "0";
        u = "0";
        v = "0";
        w = "0";
        x = "0";
        a = s1;
        i = s2;
        c = com.gau.go.launcherex.gowidget.statistics.w.v(context);
        e = com.gau.go.launcherex.gowidget.statistics.w.n(context).toUpperCase();
        f = com.gau.go.launcherex.gowidget.statistics.w.f(context);
        g = String.valueOf(com.gau.go.launcherex.gowidget.statistics.w.e(context));
        h = com.gau.go.launcherex.gowidget.statistics.w.c(context);
        d = com.gau.go.a.f.e.e(context);
        w = com.gau.go.launcherex.gowidget.statistics.w.w(context);
        q = com.gau.go.launcherex.gowidget.statistics.w.d(context);
    }

    protected String a(String s1)
    {
        y.setToNow();
        y.set(y.toMillis(true) - (y.gmtoff - 28800L) * 1000L);
        return y.format(s1);
    }

    public void a()
    {
    }

    public String b()
    {
        return "";
    }

    public void b(String s1)
    {
        j = s1;
    }

    public void c(String s1)
    {
        k = s1;
    }

    public void d(String s1)
    {
        m = s1;
    }

    public void e(String s1)
    {
        n = s1;
    }

    public void f(String s1)
    {
        x = s1;
    }

    public void g(String s1)
    {
        o = s1;
    }

    public void h(String s1)
    {
        p = s1;
    }

    public void i(String s1)
    {
        r = s1;
    }

    public void j(String s1)
    {
        s = s1;
    }

}
