// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper.a;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.gau.go.launcherex.gowidget.weather.util.r;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper.a:
//            a, b

public class c
{

    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private a g;

    public c()
    {
        e = 0;
        f = 0;
        g = new a();
    }

    public float a(Resources resources)
    {
        int ai[];
        int i;
label0:
        {
            int j = d - 1;
            ai = resources.getIntArray(0x7f0d003a);
            if (j >= 0)
            {
                i = j;
                if (j < ai.length)
                {
                    break label0;
                }
            }
            i = 0;
        }
        float f1 = resources.getDisplayMetrics().density;
        return (float)r.a(ai[i], f1);
    }

    public a a()
    {
        return g;
    }

    public void a(int i)
    {
        d = i;
    }

    public void a(String s)
    {
        a = s;
    }

    public int b()
    {
        return e;
    }

    public b b(Resources resources)
    {
        return (new b()).a(resources, f - 1);
    }

    public void b(int i)
    {
        f = i;
    }

    public void c(int i)
    {
        e = i;
    }

    public boolean c()
    {
        return c != 0;
    }

    public void d(int i)
    {
        c = i;
    }

    public boolean d()
    {
        return b != 0;
    }

    public String e()
    {
        return a;
    }

    public void e(int i)
    {
        b = i;
    }

    public boolean f(int i)
    {
        boolean flag = false;
        if (b != i)
        {
            b = i;
            flag = true;
        }
        return flag;
    }
}
