// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;
import com.go.weatherex.ad.c.e;

public class o
{

    private short a;
    private e b;
    private Activity c;
    private volatile boolean d;

    public o()
    {
        a = 0;
        d = false;
    }

    private void a()
    {
        if (c == null)
        {
            return;
        } else
        {
            Intent intent = new Intent(c.getApplicationContext(), com/gau/go/launcherex/gowidget/weather/service/NotifyService);
            Bundle bundle = new Bundle();
            bundle.putInt("notify_request", 34);
            intent.putExtras(bundle);
            c.getApplicationContext().startService(intent);
            return;
        }
    }

    public void a(Activity activity)
    {
        b.a();
    }

    public void a(Activity activity, int i, int j, Intent intent)
    {
    }

    public void a(Activity activity, Intent intent)
    {
    }

    public void a(Activity activity, Bundle bundle)
    {
        c = activity;
        d = false;
        b = new e(c);
        a();
    }

    public void b(Activity activity)
    {
    }

    public void c(Activity activity)
    {
    }

    public void d(Activity activity)
    {
    }

    public void e(Activity activity)
    {
        d = true;
        c = null;
        b.c();
    }

    public boolean f(Activity activity)
    {
        if (!com.go.weatherex.ad.a.e.a && !com.go.weatherex.ad.c.e.a(c))
        {
            return b.b();
        } else
        {
            return false;
        }
    }
}
