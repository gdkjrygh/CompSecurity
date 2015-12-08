// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.c.l;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            ae, ag

class af extends l
{

    final ae a;

    af(ae ae1)
    {
        a = ae1;
        super();
    }

    public void a(int i, Location location)
    {
    }

    public void a(int i, CityBean citybean)
    {
        c.a("WeatherCityInitializationHandler", (new StringBuilder()).append("onLocateCityFinish: locationState=").append(i).toString());
        if (i == 4 && citybean != null)
        {
            c.a("WeatherCityInitializationHandler", (new StringBuilder()).append("onLocateCityFinish: curCity=").append(citybean.b()).toString());
            Object obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_INITIALIZED_CITY");
            ((Intent) (obj)).putExtra("city_location_state", i);
            ((Intent) (obj)).putExtra("city_location_id", citybean.a());
            ae.a(a).sendBroadcast(((Intent) (obj)));
            obj = ae.b(a);
            android.net.Uri uri = WeatherContentProvider.a;
            String s = citybean.a();
            ((ag) (obj)).a(0, citybean, uri, new String[] {
                "cityId"
            }, "cityId=?", new String[] {
                s
            }, null);
            return;
        } else
        {
            citybean = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_INITIALIZED_CITY");
            citybean.putExtra("city_location_state", i);
            ae.a(a).sendBroadcast(citybean);
            ae.a(a, false);
            return;
        }
    }
}
