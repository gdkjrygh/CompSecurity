// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper.a;

import android.content.res.Resources;

public class d
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public d()
    {
    }

    private int a(Resources resources, Resources resources1, int i, String s, int j, String s1)
    {
        int l = resources.getIdentifier(s1, "array", s);
        int k = l;
        if (l == 0)
        {
            k = i;
            resources = resources1;
        }
        s = resources.getIntArray(k);
        resources = s;
        if (j >= s.length)
        {
            resources = resources1.getIntArray(i);
        }
        return resources[j];
    }

    public int a()
    {
        return a;
    }

    public void a(int i, boolean flag, Resources resources, String s, Resources resources1)
    {
        int j;
label0:
        {
            if (i >= 2)
            {
                j = i;
                if (i <= 8)
                {
                    break label0;
                }
            }
            j = 2;
        }
        j = (j - 2) * 2;
        i = j;
        if (!flag)
        {
            i = j + 1;
        }
        a = a(resources, resources1, 0x7f0d003d, s, i, "wp_text_color_top");
        b = a(resources, resources1, 0x7f0d003f, s, i, "wp_text_color_hightemp");
        c = a(resources, resources1, 0x7f0d0040, s, i, "wp_text_color_lowtemp");
        d = a(resources, resources1, 0x7f0d0041, s, i, "wp_text_color_main");
        e = a(resources, resources1, 0x7f0d003e, s, i, "wp_text_color_desp");
        h = a(resources, resources1, 0x7f0d0044, s, i, "wp_text_shadow_main");
        f = a(resources, resources1, 0x7f0d0042, s, i, "wp_text_shadow_hightemp");
        g = a(resources, resources1, 0x7f0d0043, s, i, "wp_text_shadow_lowtemp");
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public int g()
    {
        return g;
    }

    public int h()
    {
        return h;
    }
}
