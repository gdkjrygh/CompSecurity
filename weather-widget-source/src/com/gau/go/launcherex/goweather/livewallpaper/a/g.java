// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper.a;


public class g
{

    private int a;
    private int b;
    private int c;

    public g()
    {
    }

    public void a(int i)
    {
        a = i;
    }

    public boolean a()
    {
        return a != 0;
    }

    public String b()
    {
        if (b == 1)
        {
            return "\260C";
        } else
        {
            return "\260F";
        }
    }

    public boolean b(int i)
    {
        boolean flag = false;
        if (i != a)
        {
            flag = true;
        }
        return flag;
    }

    public int c()
    {
        return b;
    }

    public void c(int i)
    {
        b = i;
    }

    public int d()
    {
        return c;
    }

    public boolean d(int i)
    {
        boolean flag = false;
        if (i != b)
        {
            flag = true;
            b = i;
        }
        return flag;
    }

    public void e(int i)
    {
        c = i;
    }

    public boolean f(int i)
    {
        boolean flag = false;
        if (i != c)
        {
            flag = true;
            c = i;
        }
        return flag;
    }
}
