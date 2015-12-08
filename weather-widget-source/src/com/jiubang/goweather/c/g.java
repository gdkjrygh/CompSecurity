// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.location.Location;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;

// Referenced classes of package com.jiubang.goweather.c:
//            l, e

class g extends l
{

    final e a;

    g(e e1)
    {
        a = e1;
        super();
    }

    public void a(int i, Location location)
    {
        if (i == 1 && location != null)
        {
            e.a(a, location);
            return;
        } else
        {
            e.b(a, i);
            return;
        }
    }

    public void a(int i, CityBean citybean)
    {
        if (i == 4 && citybean != null)
        {
            e.b(a, citybean);
            return;
        } else
        {
            e.a(a, i);
            return;
        }
    }
}
