// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.a;


public class b
{

    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;
    private int k;
    private boolean l;
    private boolean m;

    public b()
    {
    }

    public String a()
    {
        return b;
    }

    public void a(int i1)
    {
        g = i1;
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(boolean flag)
    {
        l = flag;
    }

    public String b()
    {
        return c;
    }

    public void b(int i1)
    {
        a = i1;
    }

    public void b(String s)
    {
        c = s;
    }

    public String c()
    {
        return d;
    }

    public void c(int i1)
    {
        k = i1;
    }

    public void c(String s)
    {
        d = s;
    }

    public String d()
    {
        return e;
    }

    public void d(String s)
    {
        e = s;
    }

    public String e()
    {
        return f;
    }

    public void e(String s)
    {
        f = s;
    }

    public int f()
    {
        return g;
    }

    public void f(String s)
    {
        h = s;
    }

    public String g()
    {
        return h;
    }

    public void g(String s)
    {
        i = s;
    }

    public String h()
    {
        return i;
    }

    public void h(String s)
    {
        j = s;
    }

    public int i()
    {
        return a;
    }

    public int j()
    {
        return k;
    }

    public boolean k()
    {
        return l;
    }

    public boolean l()
    {
        return m;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj;
        if ((new StringBuilder()).append("ExtremeId : ").append(a).toString() != null)
        {
            obj = Integer.valueOf(a);
        } else
        {
            obj = "";
        }
        stringbuilder.append(obj);
        if ((new StringBuilder()).append("||PublishTime : ").append(b).toString() != null)
        {
            obj = b;
        } else
        {
            obj = "";
        }
        stringbuilder.append(((String) (obj)));
        if ((new StringBuilder()).append("||CityId : ").append(i).toString() != null)
        {
            obj = i;
        } else
        {
            obj = "";
        }
        stringbuilder.append(((String) (obj)));
        if ((new StringBuilder()).append("||Description : ").append(e).toString() != null)
        {
            obj = e;
        } else
        {
            obj = "";
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append((new StringBuilder()).append("||mIsNotify : ").append(l).toString());
        stringbuilder.append((new StringBuilder()).append("||mHasRead : ").append(m).toString());
        return stringbuilder.toString();
    }
}
