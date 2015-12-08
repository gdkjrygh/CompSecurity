// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.location.Location;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.jiubang.goweather.c.e;
import com.jiubang.goweather.c.h;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            f

class g extends h
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public void a(int i)
    {
        e.a(f.b(a)).b(f.a(a));
        f.c(a);
    }

    public void a(Location location)
    {
        f.a(a, location);
    }

    public void a(CityBean citybean)
    {
        e.a(f.b(a)).b(f.a(a));
        a.a(citybean);
    }
}
