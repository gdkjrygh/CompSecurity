// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.location.Location;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import java.util.HashMap;

public class q
{

    private WeatherBean a;
    private Location b;
    private HashMap c;

    public q()
    {
        c = new HashMap();
    }

    static Location a(q q1, Location location)
    {
        q1.b = location;
        return location;
    }

    static WeatherBean a(q q1)
    {
        return q1.a;
    }

    static WeatherBean a(q q1, WeatherBean weatherbean)
    {
        q1.a = weatherbean;
        return weatherbean;
    }

    static HashMap b(q q1)
    {
        return q1.c;
    }

    public HashMap a()
    {
        return c;
    }

    public WeatherBean b()
    {
        return a;
    }

    public Location c()
    {
        return b;
    }
}
