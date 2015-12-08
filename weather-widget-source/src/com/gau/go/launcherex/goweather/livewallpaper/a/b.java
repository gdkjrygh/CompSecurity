// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper.a;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.gau.go.launcherex.gowidget.weather.util.r;

public class b
{

    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;

    public b()
    {
    }

    public float a()
    {
        return a;
    }

    public b a(Resources resources, int i1)
    {
        int ai[];
        int j1;
label0:
        {
            a = resources.getDimension(0x7f0c025a);
            l = resources.getDimension(0x7f0c025b);
            o = resources.getInteger(0x7f0b000a);
            ai = resources.getIntArray(0x7f0d0034);
            if (i1 >= 0)
            {
                j1 = i1;
                if (i1 < ai.length)
                {
                    break label0;
                }
            }
            j1 = 0;
        }
        c = ai[j1];
        e = resources.getIntArray(0x7f0d0035)[j1];
        f = resources.getIntArray(0x7f0d0036)[j1];
        i = resources.getIntArray(0x7f0d0037)[j1];
        j = resources.getIntArray(0x7f0d0038)[j1];
        k = resources.getIntArray(0x7f0d0039)[j1];
        float f1 = resources.getDisplayMetrics().density;
        b = r.a(resources.getIntArray(0x7f0d0030)[j1], f1);
        d = r.a(resources.getIntArray(0x7f0d0031)[j1], f1);
        g = r.a(resources.getIntArray(0x7f0d0032)[j1], f1);
        h = r.a(resources.getIntArray(0x7f0d0033)[j1], f1);
        m = r.a(resources.getIntArray(0x7f0d003b)[j1], f1);
        n = r.a(resources.getIntArray(0x7f0d003c)[j1], f1);
        return this;
    }

    public float b()
    {
        return b;
    }

    public float c()
    {
        return c;
    }

    public float d()
    {
        return d;
    }

    public float e()
    {
        return e;
    }

    public float f()
    {
        return f;
    }

    public float g()
    {
        return g;
    }

    public float h()
    {
        return h;
    }

    public float i()
    {
        return i;
    }

    public float j()
    {
        return j;
    }

    public float k()
    {
        return k;
    }

    public float l()
    {
        return m;
    }

    public float m()
    {
        return n;
    }

    public float n()
    {
        return o;
    }
}
