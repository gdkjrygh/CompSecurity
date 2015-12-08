// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear.a.a;

import com.google.android.gms.wearable.DataMap;

public class e
{

    int a;
    boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String h;
    private String i;

    public e()
    {
        c = -10000;
        d = -10000;
        e = -10000;
        g = 1;
    }

    public void a(int j)
    {
        c = j;
    }

    public void a(DataMap datamap)
    {
        datamap.putInt("mNowTemp", c);
        datamap.putInt("mHighTemp", d);
        datamap.putInt("mLowTemp", e);
        datamap.putInt("mHumidity", f);
        datamap.putInt("mType", g);
        datamap.putString("mNowDesp", h);
        datamap.putString("mWind", i);
        datamap.putInt("mPop", a);
        datamap.putBoolean("mIsDay", b);
    }

    public void a(String s)
    {
        h = s;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b(int j)
    {
        d = j;
    }

    public void b(String s)
    {
        i = s;
    }

    public void c(int j)
    {
        e = j;
    }

    public void d(int j)
    {
        f = j;
    }

    public void e(int j)
    {
        g = j;
    }

    public void f(int j)
    {
        a = j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WearNowBean [mNowTemp=").append(c).append(", mHighTemp=").append(d).append(", mLowTemp=").append(e).append(", mHumidity=").append(f).append(", mType=").append(g).append(", mNowDesp=").append(h).append(", mWind=").append(i).append(", mPop=").append(a).append(", mIsDay=").append(b).append("]").toString();
    }
}
