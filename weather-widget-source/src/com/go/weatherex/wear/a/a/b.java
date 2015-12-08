// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear.a.a;

import com.google.android.gms.wearable.DataMap;

public class b
{

    private int a;
    private int b;
    private int c;
    private int d;
    private String e;
    private int f;
    private int g;
    private int h;

    public b()
    {
        d = 1;
        f = -10000;
        g = -10000;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(DataMap datamap)
    {
        datamap.putInt("mYear", a);
        datamap.putInt("mMonth", b);
        datamap.putInt("mDay", c);
        datamap.putInt("mType", d);
        datamap.putString("mDesp", e);
        datamap.putInt("mHighTemp", f);
        datamap.putInt("mLowTemp", g);
        datamap.putInt("mPop", h);
    }

    public void a(String s)
    {
        e = s;
    }

    public void b(int i)
    {
        b = i;
    }

    public void c(int i)
    {
        c = i;
    }

    public void d(int i)
    {
        d = i;
    }

    public void e(int i)
    {
        f = i;
    }

    public void f(int i)
    {
        g = i;
    }

    public void g(int i)
    {
        h = i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WearForecastBean [mYear=").append(a).append(", mMonth=").append(b).append(", mDay=").append(c).append(", mType=").append(d).append(", mDesp=").append(e).append(", mHighTemp=").append(f).append(", mLowTemp=").append(g).append(", mPop=").append(h).append("]").toString();
    }
}
