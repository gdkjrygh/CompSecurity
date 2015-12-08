// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.content.res.Resources;
import android.widget.RemoteViews;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.go.weatherex.i.d;

public class f
{

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;

    public f()
    {
    }

    void a(RemoteViews remoteviews, u u, ForecastBean forecastbean, Resources resources, int ai[], int ai1[])
    {
        com.go.weatherex.i.d.a(remoteviews, forecastbean, resources, a, ai1);
        com.go.weatherex.i.d.a(remoteviews, forecastbean, b, ai);
        com.go.weatherex.i.d.a(remoteviews, forecastbean, u, c);
        com.go.weatherex.i.d.b(remoteviews, forecastbean, u, d);
        com.go.weatherex.i.d.c(remoteviews, forecastbean, u, e);
        com.go.weatherex.i.d.a(remoteviews, f, false);
        com.go.weatherex.i.d.a(remoteviews, resources, forecastbean, u, g, ai1);
    }
}
