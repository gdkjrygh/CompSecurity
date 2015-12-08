// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.location.Location;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.jiubang.goweather.c.l;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            m

class n extends l
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public void a(int i, Location location)
    {
        if (i == 1 && location != null)
        {
            m.a(a, location);
        }
    }

    public void a(int i, CityBean citybean)
    {
        if (i != 4);
    }
}
