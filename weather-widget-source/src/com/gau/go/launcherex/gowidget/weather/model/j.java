// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;


public final class j extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    private static final j k[];
    String j;

    private j(String s, int l, String s1)
    {
        super(s, l);
        j = s1;
    }

    public static j a(String s)
    {
        if (a.a().equals(s))
        {
            return a;
        }
        if (b.a().equals(s))
        {
            return b;
        }
        if (c.a().equals(s))
        {
            return c;
        }
        if (d.a().equals(s))
        {
            return d;
        }
        if (e.a().equals(s))
        {
            return e;
        }
        if (f.a().equals(s))
        {
            return f;
        }
        if (g.a().equals(s))
        {
            return g;
        }
        if (h.a().equals(s))
        {
            return h;
        }
        if (i.a().equals(s))
        {
            return i;
        } else
        {
            throw new IllegalArgumentException("bad value");
        }
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/gau/go/launcherex/gowidget/weather/model/j, s);
    }

    public static j[] values()
    {
        return (j[])k.clone();
    }

    public String a()
    {
        return j;
    }

    static 
    {
        a = new j("ARTHRITISPAIN", 0, "arthritisPainForecastCategory");
        b = new j("COMMONCOLD", 1, "commonColdForecastCategory");
        c = new j("DRIVING", 2, "drivingTravelIndexCategory");
        d = new j("FIGHTDELAY", 3, "flightDelaysCategory");
        e = new j("OUTDOORACTIVITY", 4, "outdoorActivityForecastCategory");
        f = new j("OUTDOORBARBE", 5, "outdoorBarbecueCategory");
        g = new j("SAILING", 6, "sailingForecastCategory");
        h = new j("HEADACHE", 7, "sinusHeadacheForecastCategory");
        i = new j("SKI", 8, "skiWeatherForecastCategory");
        k = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}
