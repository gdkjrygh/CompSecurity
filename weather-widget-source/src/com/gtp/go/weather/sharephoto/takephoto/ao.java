// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;

public abstract class ao
{

    protected int a;
    protected final PointF b = new PointF();
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected float g;
    protected int h;
    protected int i;
    protected WeatherBean j;
    protected u k;

    public ao()
    {
        a = 0;
        e = 720;
        f = 960;
        g = 1.0F;
    }

    public int a()
    {
        return a;
    }

    public abstract Bitmap a(int l, int i1);

    public void a(WeatherBean weatherbean)
    {
        j = weatherbean;
    }

    public void a(u u)
    {
        k = u;
    }
}
