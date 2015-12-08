// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.i;

import android.content.Context;
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.HourlyBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class c
{

    public static ArrayList a(Context context, String s)
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        Object obj = com.gau.go.launcherex.gowidget.weather.c.c.a(context);
        s = ((com.gau.go.launcherex.gowidget.weather.c.c) (obj)).h().a(s);
        context = arraylist;
        if (s != null)
        {
            context = arraylist;
            if (!((WeatherBean) (s)).h.isEmpty())
            {
                com.gau.go.launcherex.gowidget.weather.d.f f1 = ((com.gau.go.launcherex.gowidget.weather.c.c) (obj)).e();
                obj = ((com.gau.go.launcherex.gowidget.weather.c.c) (obj)).g();
                context = (ArrayList)((WeatherBean) (s)).h.clone();
                a(((ArrayList) (context)));
                s = ((g) (obj)).b(((WeatherBean) (s)).l.n());
                s.minute = 0;
                s.second = 0;
                a(((ArrayList) (context)), ((Time) (s)));
                if (!f1.b())
                {
                    flag = true;
                }
                a(flag, ((ArrayList) (context)));
            }
        }
        return context;
    }

    private static void a(ArrayList arraylist)
    {
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            HourlyBean hourlybean = (HourlyBean)arraylist.next();
            if (hourlybean.a() == -10000 || hourlybean.b() == -10000 || hourlybean.c() == -10000 || hourlybean.d() == -10000)
            {
                arraylist.remove();
            }
        } while (true);
    }

    private static void a(ArrayList arraylist, Time time)
    {
        Time time1;
        int k;
        time1 = new Time();
        k = arraylist.size();
        if (k <= 24) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        HourlyBean hourlybean = (HourlyBean)arraylist.get(i);
        time1.set(0, 0, hourlybean.d(), hourlybean.c(), hourlybean.b() - 1, hourlybean.a());
        if (Time.compare(time1, time) < 0) goto _L4; else goto _L3
_L3:
        int j;
label0:
        {
            if (i != -1)
            {
                j = i;
                if (k - i >= 24)
                {
                    break label0;
                }
            }
            j = k - 24;
        }
        arraylist.subList(0, j).clear();
_L2:
        return;
_L4:
        i++;
          goto _L5
        i = -1;
          goto _L3
    }

    private static void a(boolean flag, ArrayList arraylist)
    {
        int i1;
label0:
        {
            int k = 0;
            int j = 6;
            i1 = arraylist.size();
            if (flag)
            {
                ArrayList arraylist1 = (ArrayList)arraylist.clone();
                arraylist.clear();
                int i;
                int l;
                if (i1 >= 24)
                {
                    i = 4;
                } else
                if (i1 > 6 && i1 < 24)
                {
                    i = i1 / 6;
                } else
                {
                    i = 1;
                    j = i1;
                }
                for (l = 0; l < i1 && k < j; k++)
                {
                    arraylist.add(arraylist1.get(l));
                    l += i;
                }

            } else
            if (i1 > 24)
            {
                if (i1 != 25)
                {
                    break label0;
                }
                arraylist.remove(24);
            }
            return;
        }
        arraylist.subList(24, i1 - 1).clear();
    }

    public static boolean a(int i, int j, int k, Time time)
    {
        return (new Date(time.year, time.month, time.monthDay)).before(new Date(i, j - 1, k));
    }

    public static boolean a(WeatherBean weatherbean)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (weatherbean != null)
        {
            flag = flag1;
            if (r.b(weatherbean.l.a(0)))
            {
                flag = true;
            }
        }
        return flag;
    }

    public static ArrayList b(Context context, String s)
    {
        Object obj = com.gau.go.launcherex.gowidget.weather.c.c.a(context);
        WeatherBean weatherbean = ((com.gau.go.launcherex.gowidget.weather.c.c) (obj)).h().a(s);
        context = new ArrayList();
        if (weatherbean == null || weatherbean.g.isEmpty())
        {
            return context;
        }
        boolean flag = ((com.gau.go.launcherex.gowidget.weather.c.c) (obj)).e().b();
        s = ((com.gau.go.launcherex.gowidget.weather.c.c) (obj)).g().c(weatherbean.l.n());
        obj = ((ArrayList)weatherbean.g.clone()).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ForecastBean forecastbean1 = (ForecastBean)((Iterator) (obj)).next();
            if (forecastbean1 != null && forecastbean1.e() != -10000 && forecastbean1.f() != -10000 && forecastbean1.g() != -10000)
            {
                context.add(forecastbean1);
            }
        } while (true);
        byte byte0;
        int j;
        if (!flag)
        {
            byte0 = 6;
        } else
        {
            byte0 = 10;
        }
        j = context.size();
        if (j > byte0)
        {
            int i = 0;
            do
            {
                ForecastBean forecastbean = (ForecastBean)context.get(0);
                if (i + byte0 == j || r.a(forecastbean.e(), forecastbean.f(), forecastbean.g(), s) || a(forecastbean.e(), forecastbean.f(), forecastbean.g(), s))
                {
                    for (; context.size() > byte0 && !flag; context.remove(byte0)) { }
                    break;
                }
                context.remove(0);
                i++;
            } while (true);
        }
        return context;
    }
}
