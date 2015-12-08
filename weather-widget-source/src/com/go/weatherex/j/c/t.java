// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget21Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget42Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays42Provider;

// Referenced classes of package com.go.weatherex.j.c:
//            d

public class t
{

    public static AppWidgetProviderInfo a(d d1)
    {
        AppWidgetProviderInfo appwidgetproviderinfo = new AppWidgetProviderInfo();
        switch (d1.j())
        {
        default:
            throw new IllegalArgumentException("bad widget type?");

        case 1: // '\001'
            appwidgetproviderinfo.provider = new ComponentName(d1.n(), com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider);
            return appwidgetproviderinfo;

        case 2: // '\002'
            appwidgetproviderinfo.provider = new ComponentName(d1.n(), com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget41Provider);
            return appwidgetproviderinfo;

        case 3: // '\003'
            appwidgetproviderinfo.provider = new ComponentName(d1.n(), com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget21Provider);
            return appwidgetproviderinfo;

        case 5: // '\005'
            appwidgetproviderinfo.provider = new ComponentName(d1.n(), com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays41Provider);
            return appwidgetproviderinfo;

        case 4: // '\004'
            appwidgetproviderinfo.provider = new ComponentName(d1.n(), com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays42Provider);
            return appwidgetproviderinfo;
        }
    }
}
