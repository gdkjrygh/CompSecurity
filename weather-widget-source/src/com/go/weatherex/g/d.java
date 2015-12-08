// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.gau.go.launcherex.gowidget.gcm.b;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.setting.i;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.go.weatherex.g:
//            ag, f, ae, e, 
//            r

public class d
    implements ag
{

    private Context a;
    private boolean b;
    private com.go.weatherex.g.f c;
    private i d;
    private ae e;
    private e f;
    private CityBean g;

    public d(Context context)
    {
        b = false;
        a = context;
        d = new i(a);
        c = new com.go.weatherex.g.f(a.getContentResolver(), this);
        e = new ae(a);
        e.a(this);
    }

    private void a(int j, Object obj, int k)
    {
        if (k <= 0) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 2 2: default 24
    //                   2 30;
           goto _L2 _L3
_L2:
        b = false;
        return;
_L3:
        a((CityBean)obj, false);
        if (true) goto _L2; else goto _L4
_L4:
    }

    private void a(int j, Object obj, Cursor cursor)
    {
        switch (j)
        {
        default:
            return;

        case 1: // '\001'
            obj = (CityBean)obj;
            break;
        }
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.getCount() <= 0) goto _L4; else goto _L3
_L3:
        b = false;
        j = 1;
_L8:
        cursor.close();
_L6:
        if (b && j == 0)
        {
            cursor = new ContentValues();
            cursor.put("cityId", ((CityBean) (obj)).a());
            cursor.put("oldCityId", ((CityBean) (obj)).a());
            cursor.put("cityName", ((CityBean) (obj)).b());
            cursor.put("state", ((CityBean) (obj)).d());
            cursor.put("country", ((CityBean) (obj)).c());
            cursor.put("tz_offset", Integer.valueOf(((CityBean) (obj)).e()));
            cursor.put("latitude", Float.valueOf(-10000F));
            cursor.put("longitude", Float.valueOf(-10000F));
            cursor.put("hasRadar", Integer.valueOf(((CityBean) (obj)).i()));
            cursor.put("hasSatellite", Integer.valueOf(((CityBean) (obj)).k()));
            cursor.put("myLocation", Integer.valueOf(1));
            cursor.put("city_my_location", Integer.valueOf(1));
            cursor.put("windDirection", "--");
            cursor.put("windStrength", "--");
            cursor.put("windType", Integer.valueOf(1));
            cursor.put("sunrise", "--");
            cursor.put("sunset", "--");
            cursor.put("type", Integer.valueOf(1));
            cursor.put("nowDesp", "--");
            cursor.put("sequence", Integer.valueOf(com.gau.go.launcherex.gowidget.weather.util.f.a(a).c().size()));
            cursor.put("pop", Integer.valueOf(-10000));
            cursor.put("cityType", Integer.valueOf(2));
            cursor.put("feelslikeValue", Float.valueOf(-10000F));
            cursor.put("barometerValue", Float.valueOf(-10000F));
            cursor.put("dewpointValue", Float.valueOf(-10000F));
            cursor.put("highTempValue", Float.valueOf(-10000F));
            cursor.put("lowTempValue", Float.valueOf(-10000F));
            cursor.put("windStrengthValue", Float.valueOf(-10000F));
            cursor.put("nowTempValue", Float.valueOf(-10000F));
            cursor.put("timestamp", Integer.valueOf(-10000));
            cursor.put("uvIndexValue", Float.valueOf(-10000F));
            cursor.put("humidityValue", Float.valueOf(-10000F));
            cursor.put("visibilityValue", Float.valueOf(-10000F));
            cursor.put("updateTime", Integer.valueOf(-10000));
            c.a(0, obj, WeatherContentProvider.a, cursor);
            return;
        }
        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        exception.printStackTrace();
        b = false;
        cursor.close();
        j = 0;
        if (true) goto _L6; else goto _L5
        obj;
        cursor.close();
        throw obj;
_L5:
        cursor = (WeatherBean)com.gau.go.launcherex.gowidget.weather.util.f.a(a).c().get(((CityBean) (obj)).a());
        if (cursor != null)
        {
            if (cursor.e() == 2)
            {
                cursor = new ContentValues();
                cursor.put("city_my_location", Integer.valueOf(3));
                c.a(2, obj, WeatherContentProvider.a, cursor, "cityId=?", new String[] {
                    ((CityBean) (obj)).a()
                });
                return;
            } else
            {
                a(((CityBean) (obj)), true);
                b = false;
                return;
            }
        } else
        {
            b = false;
            return;
        }
_L2:
        b = false;
        return;
_L4:
        j = 0;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(int j, Object obj, Uri uri)
    {
        a((CityBean)obj, false);
        b = false;
    }

    private void a(CityBean citybean, boolean flag)
    {
        if (!flag)
        {
            f f1 = com.gau.go.launcherex.gowidget.weather.util.f.a(a);
            f1.a(citybean, f1.c().size(), 0);
            com.gau.go.launcherex.gowidget.gcm.b.a(a).b(citybean.a());
            c(citybean);
            d.a(citybean.a());
            b(citybean, false);
        }
        if (f != null)
        {
            f.a(citybean, flag);
        }
    }

    static void a(d d1, int j, Object obj, int k)
    {
        d1.a(j, obj, k);
    }

    static void a(d d1, int j, Object obj, Cursor cursor)
    {
        d1.a(j, obj, cursor);
    }

    static void a(d d1, int j, Object obj, Uri uri)
    {
        d1.a(j, obj, uri);
    }

    private void b(CityBean citybean, boolean flag)
    {
        if (com.gau.go.launcherex.gowidget.weather.util.f.a(a).e() == 0)
        {
            r.a(a, g, citybean, flag);
        }
    }

    private void c(CityBean citybean)
    {
        Object obj = new RequestBean();
        ((RequestBean) (obj)).a(citybean.a(), citybean.b(), 0L);
        citybean = new ArrayList();
        citybean.add(obj);
        obj = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        ((Intent) (obj)).putExtra("notify_request", 21);
        ((Intent) (obj)).putParcelableArrayListExtra("req_arg", citybean);
        a.startService(((Intent) (obj)));
    }

    public void a()
    {
        e.a();
    }

    public void a(CityBean citybean)
    {
        g = citybean;
    }

    public void a(CityBean citybean, int j)
    {
        b(citybean, true);
        if (f != null)
        {
            f.a(citybean, false);
        }
    }

    public void a(e e1)
    {
        f = e1;
    }

    public void b(CityBean citybean)
    {
        if (b)
        {
            return;
        } else
        {
            b = true;
            com.go.weatherex.g.f f1 = c;
            Uri uri = WeatherContentProvider.a;
            String s = citybean.a();
            f1.a(1, citybean, uri, new String[] {
                "cityId"
            }, "cityId=?", new String[] {
                s
            }, null);
            return;
        }
    }
}
