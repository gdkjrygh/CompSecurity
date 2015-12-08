// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.d;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class b
{

    private int a;
    private int b;
    private Context c;
    private android.graphics.BitmapFactory.Options d;

    public b(Context context)
    {
        c = context;
        a();
    }

    public void a()
    {
        DisplayMetrics displaymetrics = c.getResources().getDisplayMetrics();
        a = Math.min(1200, displaymetrics.widthPixels * 2);
        b = Math.min(1600, displaymetrics.heightPixels * 2);
    }

    public void a(android.graphics.BitmapFactory.Options options)
    {
        d = options;
    }

    public int b()
    {
        return a;
    }

    public int c()
    {
        return b;
    }

    public android.graphics.BitmapFactory.Options d()
    {
        return d;
    }
}
