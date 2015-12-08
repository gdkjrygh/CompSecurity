// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.text.format.Time;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.util.ArrayList;
import java.util.List;

public class n
{

    protected int a;
    private WeatherBean b;
    private int c;
    private int d;
    private int e;

    public n()
    {
        c = 1;
    }

    public WeatherBean a()
    {
        return b;
    }

    public List a(Time time)
    {
        ArrayList arraylist = new ArrayList(c);
        if (b == null)
        {
            e = 0;
            return arraylist;
        }
        ArrayList arraylist1 = r.a(b.g, time, true);
        if (arraylist1.size() > c)
        {
            ForecastBean forecastbean = (ForecastBean)arraylist1.get(0);
            if (r.a(forecastbean.e(), forecastbean.f(), forecastbean.g(), time))
            {
                arraylist1.remove(0);
            }
        }
        e = arraylist1.size();
        int k = d * c - 1;
        int j = 0;
        while (j < c) 
        {
            k++;
            if (!arraylist1.isEmpty() && k < arraylist1.size())
            {
                arraylist.add(j, arraylist1.get(k));
            } else
            {
                arraylist.add(j, null);
            }
            j++;
        }
        return arraylist;
    }

    public void a(int j)
    {
        a = j;
    }

    public void a(WeatherBean weatherbean)
    {
        b = weatherbean;
    }

    public String b()
    {
        if (b == null)
        {
            return "";
        } else
        {
            return b.c();
        }
    }

    public void b(int j)
    {
        c = j;
        if (c < 1)
        {
            c = 1;
        }
    }

    public String c()
    {
        if (b == null)
        {
            return "";
        }
        if (b.e() == 2 || b.e() == 3)
        {
            return "my_location";
        } else
        {
            return b.c();
        }
    }

    public int d()
    {
        return c;
    }

    public void e()
    {
        d = d + 1;
        int j = g();
        if (j == 0)
        {
            d = 0;
            return;
        } else
        {
            d = d % j;
            return;
        }
    }

    public void f()
    {
        d = d - 1;
        int j = g();
        if (j == 0)
        {
            d = 0;
        }
        if (d < 0)
        {
            d = j - 1;
        }
    }

    public int g()
    {
        int k = e / c;
        int j = k;
        if (e % c != 0)
        {
            j = k + 1;
        }
        k = j;
        if (j < 0)
        {
            k = 0;
        }
        return k;
    }

    public boolean h()
    {
        return d < g() - 1;
    }

    public boolean i()
    {
        return d > 0 && e > 0;
    }
}
