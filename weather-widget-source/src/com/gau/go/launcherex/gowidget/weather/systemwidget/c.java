// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.Context;
import android.util.SparseArray;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.service.AppWidgetService;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            d, a, AppWidget42Provider, AppWidget41Provider, 
//            AppWidget21Provider, AppWidgetDays42Provider, AppWidgetDays41Provider, AppWidgetWorldClock42Provider

public class c
{

    private static c a;
    private Context b;
    private final SparseArray c = new SparseArray();

    private c(Context context)
    {
        b = context.getApplicationContext();
        AppWidgetService.a(context);
    }

    public static c a()
    {
        if (a == null)
        {
            throw new IllegalStateException("did you forget to call initSingleton?");
        } else
        {
            return a;
        }
    }

    private d a(int i)
    {
        d d2 = (d)c.get(i);
        d d1 = d2;
        if (d2 == null)
        {
            d1 = new d(c(i, b));
            c.put(i, d1);
        }
        return d1;
    }

    public static void a(Context context)
    {
        if (a == null)
        {
            a = new c(context);
        }
    }

    private static com.gau.go.launcherex.gowidget.weather.systemwidget.a c(int i, Context context)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException("new widgetType?");

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return new com.gau.go.launcherex.gowidget.weather.systemwidget.a(context, i);
        }
    }

    public void a(int i, Context context)
    {
        a(i).a(context);
    }

    public void a(int i, Context context, int ai[])
    {
        a(i).a(context, ai);
    }

    public void b()
    {
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider))
        {
            d d1 = a(1);
            d1.a(b);
            d1.b(b, com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider));
        }
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget41Provider))
        {
            d d2 = a(2);
            d2.a(b);
            d2.b(b, com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget41Provider));
        }
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget21Provider))
        {
            d d3 = a(3);
            d3.a(b);
            d3.b(b, com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget21Provider));
        }
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays42Provider))
        {
            d d4 = a(4);
            d4.a(b);
            d4.b(b, com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays42Provider));
        }
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays41Provider))
        {
            d d5 = a(5);
            d5.a(b);
            d5.b(b, com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays41Provider));
        }
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetWorldClock42Provider))
        {
            d d6 = a(6);
            d6.a(b);
            d6.b(b, com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetWorldClock42Provider));
        }
    }

    public void b(int i, Context context)
    {
        a(i).b(context);
        c.delete(i);
    }

    public void b(int i, Context context, int ai[])
    {
        a(i).b(context, ai);
    }
}
