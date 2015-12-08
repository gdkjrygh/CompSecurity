// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import com.gau.go.launcherex.gowidget.weather.util.r;
import com.jiubang.goweather.a.b;

public class c
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private String g;
    private String h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;

    public c()
    {
    }

    public int a()
    {
        return j;
    }

    public void a(int i1)
    {
        j = i1;
    }

    public void a(b b1)
    {
        a = b1.a();
        b = b1.b();
        c = b1.c();
        d = b1.d();
        e = b1.e();
        f = b1.f();
        g = b1.g();
        h = b1.h();
        i = b1.i();
        j = b1.j();
        k = r.c(b);
        l = b1.k();
        m = b1.l();
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(boolean flag)
    {
        k = flag;
    }

    public void b(int i1)
    {
        f = i1;
    }

    public void b(String s)
    {
        b = s;
    }

    public void b(boolean flag)
    {
        l = flag;
    }

    public boolean b()
    {
        return k;
    }

    public String c()
    {
        return a;
    }

    public void c(int i1)
    {
        i = i1;
    }

    public void c(String s)
    {
        c = s;
    }

    public void c(boolean flag)
    {
        m = flag;
    }

    public String d()
    {
        return b;
    }

    public void d(String s)
    {
        d = s;
    }

    public String e()
    {
        return c;
    }

    public void e(String s)
    {
        e = s;
    }

    public String f()
    {
        return d;
    }

    public void f(String s)
    {
        g = s;
    }

    public String g()
    {
        return e;
    }

    public void g(String s)
    {
        h = s;
    }

    public int h()
    {
        return f;
    }

    public String i()
    {
        return g;
    }

    public String j()
    {
        return h;
    }

    public int k()
    {
        return i;
    }

    public boolean l()
    {
        return l;
    }

    public boolean m()
    {
        return m;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append("ExtremeId : ").append(i).append("||").toString());
        stringbuilder.append((new StringBuilder()).append("CityId : ").append(h).append("||").toString());
        stringbuilder.append((new StringBuilder()).append("PublishTime : ").append(a).append("||").toString());
        stringbuilder.append((new StringBuilder()).append("ExpTime : ").append(b).append("||").toString());
        stringbuilder.append((new StringBuilder()).append("Type : ").append(c).append("||").toString());
        stringbuilder.append((new StringBuilder()).append("Description : ").append(d).append("||").toString());
        stringbuilder.append((new StringBuilder()).append("Phenomena : ").append(e).append("||").toString());
        stringbuilder.append((new StringBuilder()).append("Level : ").append(f).append("||").toString());
        stringbuilder.append((new StringBuilder()).append("TzOffset : ").append(j).toString());
        stringbuilder.append((new StringBuilder()).append("IsNotify : ").append(l).toString());
        stringbuilder.append((new StringBuilder()).append("mHasRead : ").append(m).toString());
        return stringbuilder.toString();
    }
}
