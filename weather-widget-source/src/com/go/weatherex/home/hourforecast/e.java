// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.hourforecast;

import com.gau.go.launcherex.gowidget.weather.util.w;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.hourforecast:
//            c, ForecastHourForm, d

class e extends com.go.weatherex.framework.e
{

    final c a;

    private e(c c1)
    {
        a = c1;
        super();
    }

    e(c c1, d d)
    {
        this(c1);
    }

    public void a()
    {
        super.a();
        if (!com.go.weatherex.home.hourforecast.c.b(a))
        {
            return;
        } else
        {
            com.go.weatherex.home.hourforecast.c.a(a).a();
            return;
        }
    }

    public void a(int i)
    {
        super.a(i);
        com.go.weatherex.home.hourforecast.c.a(a).a();
    }

    public void a(List list, w w)
    {
        super.a(list, w);
        com.go.weatherex.home.hourforecast.c.a(a).a();
    }

    public void b()
    {
        super.b();
        if (!com.go.weatherex.home.hourforecast.c.b(a))
        {
            return;
        } else
        {
            com.go.weatherex.home.hourforecast.c.a(a).a();
            return;
        }
    }

    public void c()
    {
        super.c();
        com.go.weatherex.home.hourforecast.c.a(a).a();
    }

    public void e(int i)
    {
        super.e(i);
        com.go.weatherex.home.hourforecast.c.a(a).a();
    }
}
