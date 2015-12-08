// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.gau.go.launcherex.gowidget.gcm.b;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.c.j;
import com.jiubang.goweather.c.l;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            af, ag

public class ae
{

    private static ae a = null;
    private Context b;
    private ag c;
    private boolean d;
    private j e;
    private final l f = new af(this);

    private ae(Context context)
    {
        b = context.getApplicationContext();
        c = new ag(b.getContentResolver(), this);
        d = false;
        e = new j(b);
        e.a(f);
    }

    static Context a(ae ae1)
    {
        return ae1.b;
    }

    public static ae a(Context context)
    {
        com/gau/go/launcherex/gowidget/weather/b/ae;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new ae(context);
        }
        context = a;
        com/gau/go/launcherex/gowidget/weather/b/ae;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a(int i, Object obj, int k)
    {
    }

    private void a(int i, Object obj, Cursor cursor)
    {
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        i = cursor.getCount();
        Exception exception;
        if (i > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        cursor.close();
        if (i == 0)
        {
            obj = (CityBean)obj;
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
            cursor.put("sequence", Integer.valueOf(com.gau.go.launcherex.gowidget.weather.util.f.a(b.getApplicationContext()).c().size()));
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
        } else
        {
            d = false;
            return;
        }
        exception;
        exception.printStackTrace();
        cursor.close();
        i = 0;
        break MISSING_BLOCK_LABEL_23;
        obj;
        cursor.close();
        throw obj;
        d = false;
        return;
    }

    private void a(int i, Object obj, Uri uri)
    {
        obj = (CityBean)obj;
        uri = com.gau.go.launcherex.gowidget.weather.util.f.a(b);
        uri.a(((CityBean) (obj)), uri.c().size(), 0);
        com.gau.go.launcherex.gowidget.gcm.b.a(b).b(((CityBean) (obj)).a());
        uri = new RequestBean();
        uri.a(((CityBean) (obj)).a(), ((CityBean) (obj)).b(), 0L);
        obj = new ArrayList();
        ((ArrayList) (obj)).add(uri);
        uri = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        uri.putExtra("notify_request", 21);
        uri.putParcelableArrayListExtra("req_arg", ((ArrayList) (obj)));
        b.startService(uri);
        d = false;
    }

    static void a(ae ae1, int i, Object obj, int k)
    {
        ae1.a(i, obj, k);
    }

    static void a(ae ae1, int i, Object obj, Cursor cursor)
    {
        ae1.a(i, obj, cursor);
    }

    static void a(ae ae1, int i, Object obj, Uri uri)
    {
        ae1.a(i, obj, uri);
    }

    static boolean a(ae ae1, boolean flag)
    {
        ae1.d = flag;
        return flag;
    }

    static ag b(ae ae1)
    {
        return ae1.c;
    }

    public void a()
    {
        if (!d && e != null)
        {
            d = true;
            e.b();
            com.gtp.a.a.b.c.a("WeatherCityInitializationHandler", "startLocatingCity");
        }
    }

}
