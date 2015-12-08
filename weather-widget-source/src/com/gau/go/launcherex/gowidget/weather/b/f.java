// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.go.weatherex.setting.i;
import com.jiubang.goweather.c.h;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            g, h

public class f
{

    private Context a;
    private boolean b;
    private boolean c;
    private Location d;
    private i e;
    private final h f = new g(this);

    public f(Context context)
    {
        b = false;
        c = false;
        a = context;
        e = new i(a);
    }

    static ContentValues a(f f1, CityBean citybean, int j, boolean flag)
    {
        return f1.a(citybean, j, flag);
    }

    private ContentValues a(CityBean citybean, int j, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("cityId", citybean.a());
        contentvalues.put("oldCityId", citybean.g());
        contentvalues.put("cityName", citybean.b());
        contentvalues.put("state", citybean.d());
        contentvalues.put("cityType", Integer.valueOf(2));
        contentvalues.put("myLocation", Integer.valueOf(1));
        contentvalues.put("city_my_location", Integer.valueOf(j));
        contentvalues.put("latitude", Float.valueOf(-10000F));
        contentvalues.put("longitude", Float.valueOf(-10000F));
        contentvalues.put("hasRadar", Integer.valueOf(citybean.i()));
        contentvalues.put("hasSatellite", Integer.valueOf(citybean.k()));
        contentvalues.put("nowTempValue", Float.valueOf(-10000F));
        contentvalues.put("lowTempValue", Float.valueOf(-10000F));
        contentvalues.put("highTempValue", Float.valueOf(-10000F));
        contentvalues.put("windDirection", "--");
        contentvalues.put("windStrength", "--");
        contentvalues.put("windType", Integer.valueOf(1));
        contentvalues.put("windStrengthValue", Float.valueOf(-10000F));
        contentvalues.put("visibilityValue", Float.valueOf(-10000F));
        contentvalues.put("barometerValue", Float.valueOf(-10000F));
        contentvalues.put("dewpointValue", Float.valueOf(-10000F));
        contentvalues.put("uvIndexValue", Float.valueOf(-10000F));
        contentvalues.put("sunrise", "--");
        contentvalues.put("sunset", "--");
        contentvalues.put("type", Integer.valueOf(1));
        contentvalues.put("nowDesp", "--");
        contentvalues.put("humidityValue", Integer.valueOf(-10000));
        if (flag)
        {
            contentvalues.put("sequence", Integer.valueOf(com.gau.go.launcherex.gowidget.weather.util.f.a(a).c().size()));
        }
        contentvalues.put("tz_offset", Integer.valueOf(-10000));
        contentvalues.put("pop", Integer.valueOf(-10000));
        contentvalues.put("feelslikeValue", Float.valueOf(-10000F));
        return contentvalues;
    }

    static Location a(f f1, Location location)
    {
        f1.d = location;
        return location;
    }

    static h a(f f1)
    {
        return f1.f;
    }

    private void a(int j, CityBean citybean, int k, String s)
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION");
        intent.putExtra("location_status", j);
        intent.putExtra("city_code", citybean.a());
        intent.putExtra("city_name", citybean.b());
        intent.putExtra("last_location_cityid", s);
        intent.putExtra("isMyLocation", k);
        intent.putExtra("city", citybean);
        a.sendBroadcast(intent);
    }

    private void a(Location location, CityBean citybean)
    {
        if (location == null || citybean == null)
        {
            return;
        } else
        {
            android.content.SharedPreferences.Editor editor = a.getSharedPreferences("myLocation", 0).edit();
            editor.putString("lat", String.valueOf(location.getLatitude()));
            editor.putString("lng", String.valueOf(location.getLongitude()));
            editor.putString("cityId", citybean.a());
            editor.putString("cityName", citybean.b());
            editor.putString("countryName", citybean.c());
            editor.putString("stateName", citybean.d());
            editor.putString("url", citybean.m());
            editor.commit();
            return;
        }
    }

    static void a(f f1, int j, CityBean citybean, int k, String s)
    {
        f1.a(j, citybean, k, s);
    }

    static void a(f f1, ArrayList arraylist, String s)
    {
        f1.a(arraylist, s);
    }

    private void a(CityBean citybean, WeatherBean weatherbean)
    {
        if (c)
        {
            return;
        } else
        {
            c = true;
            (new com.gau.go.launcherex.gowidget.weather.b.h(this)).execute(new Object[] {
                citybean, weatherbean
            });
            return;
        }
    }

    private void a(ArrayList arraylist, String s)
    {
        if (com.gau.go.launcherex.gowidget.weather.c.c.a(a.getApplicationContext()).f().a().o != 1)
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("setting_value", s);
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(contentvalues).withSelection("setting_key='notify_city'", null).build());
        }
    }

    static boolean a(f f1, boolean flag)
    {
        f1.c = flag;
        return flag;
    }

    static Context b(f f1)
    {
        return f1.a;
    }

    private void c()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION_FAILED");
        a.sendBroadcast(intent);
    }

    static void c(f f1)
    {
        f1.c();
    }

    static i d(f f1)
    {
        return f1.e;
    }

    public void a()
    {
        b = true;
        a(2);
    }

    public void a(int j)
    {
        while (!b || !com.gau.go.launcherex.gowidget.weather.c.c.a(a).f().e()) 
        {
            return;
        }
        com.jiubang.goweather.c.e.a(a).a(f);
        com.jiubang.goweather.c.e.a(a).b();
    }

    public void a(CityBean citybean)
    {
        if (TextUtils.isEmpty(citybean.a()))
        {
            c();
            return;
        }
        Object obj = com.gau.go.launcherex.gowidget.weather.c.c.a(a);
        e e1 = ((c) (obj)).f();
        obj = ((c) (obj)).h();
        if (e1.e())
        {
            a(d, citybean);
            String s = ((com.gau.go.launcherex.gowidget.weather.util.f) (obj)).h();
            boolean flag1 = false;
            boolean flag = flag1;
            if (s != null)
            {
                flag = flag1;
                if (s.equals(citybean.a()))
                {
                    flag = true;
                }
            }
            if (!flag)
            {
                WeatherBean weatherbean = null;
                if (s != null)
                {
                    weatherbean = ((com.gau.go.launcherex.gowidget.weather.util.f) (obj)).a(s);
                }
                a(citybean, weatherbean);
                return;
            } else
            {
                c();
                return;
            }
        } else
        {
            c();
            return;
        }
    }

    public void b()
    {
        com.jiubang.goweather.c.e.a(a).b(f);
    }
}
