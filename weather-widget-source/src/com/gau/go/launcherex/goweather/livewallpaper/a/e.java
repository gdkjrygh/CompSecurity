// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper.a;

import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;

public class e
{

    private String a;
    private String b;
    private int c;
    private String d;
    private float e;
    private float f;
    private float g;
    private String h;
    private float i;
    private int j;
    private String k;
    private String l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;

    public e()
    {
        j = 1;
    }

    public float a(int i1)
    {
        if (i1 == 1 && e != -10000F)
        {
            return com.gau.go.launcherex.gowidget.weather.util.q.b(e, 1);
        } else
        {
            return e;
        }
    }

    public void a(float f1)
    {
        e = f1;
    }

    public boolean a()
    {
        boolean flag = true;
        if (TextUtils.isEmpty(a) || "--".equals(a))
        {
            flag = false;
        }
        return flag;
    }

    public boolean a(String s)
    {
        boolean flag = false;
        if (!a.equals(s))
        {
            flag = true;
            a = s;
        }
        return flag;
    }

    public float b(int i1)
    {
        if (i1 == 1 && g != -10000F)
        {
            return com.gau.go.launcherex.gowidget.weather.util.q.b(g, 1);
        } else
        {
            return g;
        }
    }

    public String b()
    {
        return a;
    }

    public void b(float f1)
    {
        g = f1;
    }

    public void b(String s)
    {
        a = s;
    }

    public float c(int i1)
    {
        if (i1 == 1 && f != -10000F)
        {
            return com.gau.go.launcherex.gowidget.weather.util.q.b(f, 1);
        } else
        {
            return f;
        }
    }

    public void c(String s)
    {
        b = s;
    }

    public boolean c()
    {
        return a.equals("--");
    }

    public boolean c(float f1)
    {
        return f1 != -10000F;
    }

    public String d()
    {
        return b;
    }

    public void d(float f1)
    {
        f = f1;
    }

    public void d(int i1)
    {
        j = i1;
    }

    public void d(String s)
    {
        d = s;
    }

    public String e()
    {
        return d;
    }

    public void e(float f1)
    {
        i = f1;
    }

    public void e(int i1)
    {
        m = i1;
    }

    public void e(String s)
    {
        h = s;
    }

    public void f(int i1)
    {
        c = i1;
    }

    public void f(String s)
    {
        k = s;
    }

    public boolean f()
    {
        return !d.equals("--");
    }

    public String g()
    {
        return h;
    }

    public void g(String s)
    {
        l = s;
    }

    public float h()
    {
        return i;
    }

    public int i()
    {
        return j;
    }

    public String j()
    {
        return k;
    }

    public String k()
    {
        return l;
    }

    public int l()
    {
        return m;
    }

    public int m()
    {
        return p;
    }

    public int n()
    {
        return n;
    }

    public int o()
    {
        return o;
    }

    public int p()
    {
        return q;
    }

    public void q()
    {
        if (r.a(k) && r.a(l))
        {
            try
            {
                String as[] = k.split(":");
                n = Integer.parseInt(as[0]);
                o = Integer.parseInt(as[1]);
                as = l.split(":");
                p = Integer.parseInt(as[0]);
                q = Integer.parseInt(as[1]);
                return;
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            return;
        } else
        {
            n = 6;
            o = 0;
            p = 18;
            q = 0;
            return;
        }
    }
}
