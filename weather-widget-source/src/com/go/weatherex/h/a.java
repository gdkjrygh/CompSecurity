// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.h;

import android.content.Context;

public class a extends com.gau.go.launcherex.goweather.goplay.a.a
{

    public a(Context context)
    {
        super(context, "24", "184");
    }

    public void a()
    {
        j = "0";
        k = "0";
    }

    public String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a);
        stringbuilder.append("||");
        b = a("%Y-%m-%d %H:%M:%S");
        stringbuilder.append(b);
        stringbuilder.append("||");
        stringbuilder.append(c);
        stringbuilder.append("||");
        stringbuilder.append(d);
        stringbuilder.append("||");
        stringbuilder.append(e);
        stringbuilder.append("||");
        stringbuilder.append(f);
        stringbuilder.append("||");
        stringbuilder.append(g);
        stringbuilder.append("||");
        stringbuilder.append(h);
        stringbuilder.append("||");
        stringbuilder.append(i);
        stringbuilder.append("||");
        stringbuilder.append(j);
        stringbuilder.append("||");
        stringbuilder.append(k);
        stringbuilder.append("||");
        stringbuilder.append(l);
        return stringbuilder.toString();
    }

    public void k(String s)
    {
        j = s;
    }

    public void l(String s)
    {
        k = s;
    }
}
