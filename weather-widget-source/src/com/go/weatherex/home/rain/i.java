// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.rain;

import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.framework.e;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.rain:
//            g, ForecastRainProbability, h

class i extends e
{

    final g a;

    private i(g g1)
    {
        a = g1;
        super();
    }

    i(g g1, h h)
    {
        this(g1);
    }

    public void a()
    {
        super.a();
        if (!g.b(a))
        {
            g.a(a).a();
            return;
        } else
        {
            g.a(a).b();
            return;
        }
    }

    public void a(List list, w w)
    {
        super.a(list, w);
        g.a(a).b();
    }

    public void b()
    {
        super.b();
        if (!g.b(a))
        {
            g.a(a).a();
            return;
        } else
        {
            g.a(a).b();
            return;
        }
    }

    public void e(int j)
    {
        super.e(j);
        g.a(a).b();
    }
}
