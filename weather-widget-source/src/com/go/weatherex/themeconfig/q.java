// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import android.content.Context;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.systemwidget.e;
import com.gau.go.launcherex.gowidget.weather.systemwidget.h;
import com.gau.go.launcherex.gowidget.weather.systemwidget.i;
import com.go.weatherex.j.ab;
import com.go.weatherex.j.ae;
import com.go.weatherex.j.k;
import com.go.weatherex.j.l;
import java.util.ArrayList;

public class q extends l
    implements h, com.gau.go.launcherex.gowidget.weather.systemwidget.l, ae
{

    private g d;
    private ab e;

    public q(Context context)
    {
        super(context.getApplicationContext());
        d = new g(a);
        e = new ab(a);
        e.a(this);
        com.gau.go.launcherex.gowidget.weather.systemwidget.e.a(a).a(this);
        i.a(a).a(this);
    }

    public void a()
    {
        d.b();
        com.gau.go.launcherex.gowidget.weather.systemwidget.e.a(a).b(this);
        i.a(a).b(this);
    }

    public void a(com.go.weatherex.j.g g1)
    {
        b = g1;
        b.a(com.gau.go.launcherex.gowidget.language.e.a(a).a());
        b.a(d);
        if (com.gau.go.launcherex.gowidget.weather.systemwidget.e.a(a).a)
        {
            a(((String) (null)), com.gau.go.launcherex.gowidget.weather.systemwidget.e.a(a).a());
        } else
        {
            b.a(false);
        }
        if (i.a(a).a)
        {
            a(i.a(a).a());
            return;
        } else
        {
            b.c(false);
            return;
        }
    }

    public void a(com.go.weatherex.j.g g1, k k1)
    {
        if (k1 != null && g1 == b)
        {
            c = k1;
            c.a(false);
            c();
        }
    }

    public void a(String s)
    {
        b.a(s);
        e.a(b);
    }

    public void a(String s, u u)
    {
        b.a(u);
        b.a(true);
        b();
    }

    public void a(ArrayList arraylist)
    {
        b.a(arraylist);
        b.c(true);
        b.d(false);
        b.b(false);
        b();
    }
}
