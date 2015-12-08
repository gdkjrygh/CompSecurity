// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear.a.a;

import com.google.android.gms.wearable.DataMap;

public class a
{

    private String a;
    private String b;
    private String c;
    private String d;
    private long e;

    public a()
    {
    }

    public void a(long l)
    {
        e = l;
    }

    public void a(DataMap datamap)
    {
        datamap.putString("mCityId", a);
        datamap.putString("mCityName", b);
        datamap.putString("mStateName", c);
        datamap.putString("mCountryName", d);
        datamap.putLong("mUpdateTime", e);
    }

    public void a(String s)
    {
        a = s;
    }

    public void b(String s)
    {
        b = s;
    }

    public void c(String s)
    {
        c = s;
    }

    public void d(String s)
    {
        d = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("WearCityBean [mCityId=").append(a).append(", mCityName=").append(b).append(", mStateName=").append(c).append(", mCountryName=").append(d).append(", mUpdateTime=").append(e).append("]").toString();
    }
}
