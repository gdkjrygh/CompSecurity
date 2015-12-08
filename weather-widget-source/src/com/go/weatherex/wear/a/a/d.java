// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear.a.a;

import com.google.android.gms.wearable.DataMap;

public class d
{

    private String a;
    private String b;
    private String c;

    public d()
    {
    }

    public String a()
    {
        return a;
    }

    public void a(DataMap datamap)
    {
        datamap.putString("mKey", a);
        datamap.putString("mName", b);
        datamap.putString("mValue", c);
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

    public String toString()
    {
        return (new StringBuilder()).append("WearLifeBean [mKey=").append(a).append(", mName=").append(b).append(", mValue=").append(c).append("]").toString();
    }
}
