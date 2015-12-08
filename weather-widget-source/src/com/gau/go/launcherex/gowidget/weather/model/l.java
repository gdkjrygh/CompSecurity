// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;


public class l
{

    public boolean a;
    public boolean b;
    private String c;
    private String d;
    private String e;
    private int f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m;

    public l()
    {
        a = false;
        b = false;
    }

    public l(String s)
    {
        a = false;
        b = false;
        s = s.split("#");
        if (s.length == 5)
        {
            d = s[0];
            c = s[1];
            g = s[2];
            e = s[3];
            try
            {
                f = Integer.valueOf(s[4]).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                f = 0;
            }
            i = null;
            l = null;
            h = null;
            j = null;
            k = null;
        }
    }

    public int a()
    {
        return m;
    }

    public void a(int i1)
    {
        m = i1;
    }

    public void a(String s)
    {
        h = s;
    }

    public String b()
    {
        return c;
    }

    public void b(String s)
    {
        i = s;
    }

    public int c()
    {
        return f;
    }

    public void c(String s)
    {
        j = s;
    }

    public String d()
    {
        return g;
    }

    public void d(String s)
    {
        k = s;
    }

    public String e()
    {
        return h;
    }

    public void e(String s)
    {
        l = s;
    }

    public String f()
    {
        return i;
    }

    public String g()
    {
        return k;
    }

    public String h()
    {
        return l;
    }

    public String i()
    {
        return d;
    }
}
