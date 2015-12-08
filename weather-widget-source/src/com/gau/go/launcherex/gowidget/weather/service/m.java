// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import java.util.Comparator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            l

class m
    implements Comparator
{

    final l a;

    m(l l)
    {
        a = l;
        super();
    }

    public int a(WeatherBean weatherbean, WeatherBean weatherbean1)
    {
        if (weatherbean.q() < weatherbean1.q())
        {
            return -1;
        }
        return weatherbean.q() <= weatherbean1.q() ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((WeatherBean)obj, (WeatherBean)obj1);
    }
}
