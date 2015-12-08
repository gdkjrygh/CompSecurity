// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.jiubang.playsdk.main.BitmapBean;
import com.jiubang.playsdk.main.c;

public class h extends a
{

    private c a;
    private com.jiubang.playsdk.a.a b;
    private String c;
    private Context d;
    private BitmapBean e;

    public h(Context context, c c1, com.jiubang.playsdk.a.a a1, String s)
    {
        d = context;
        a = c1;
        b = a1;
        c = s;
    }

    protected void a()
    {
        e = a.b(d, b);
    }

    protected boolean a(a a1)
    {
        if (!com/go/weatherex/themestore/h.isInstance(a1))
        {
            return false;
        } else
        {
            a1 = (h)a1;
            return c.equals(((h) (a1)).c);
        }
    }

    public BitmapBean c()
    {
        return e;
    }

    public String d()
    {
        return c;
    }
}
