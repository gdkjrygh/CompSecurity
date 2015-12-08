// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear.a.a;

import com.google.android.gms.wearable.DataMap;

public class c
{

    boolean a;
    private int b;
    private int c;
    private int d;
    private String e;

    public c()
    {
        c = -10000;
        d = 1;
    }

    public int a()
    {
        return b;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(DataMap datamap)
    {
        datamap.putInt("mHour", b);
        datamap.putInt("mTemp", c);
        datamap.putInt("mType", d);
        datamap.putString("mDesp", e);
        datamap.putBoolean("mIsDay", a);
    }

    public void a(String s)
    {
        e = s;
    }

    public void a(boolean flag)
    {
        a = flag;
    }

    public void b(int i)
    {
        c = i;
    }

    public void c(int i)
    {
        d = i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WearHourlyBean [mHour=").append(b).append(", mTemp=").append(c).append(", mType=").append(d).append(", mDesp=").append(e).append(", mIsDay=").append(a).append("]").toString();
    }
}
