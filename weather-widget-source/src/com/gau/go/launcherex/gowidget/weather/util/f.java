// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Environment;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.c.b;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.e.j;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.model.ExtremeCityIdBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.c;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;
import com.jiubang.goweather.a.a;
import com.jiubang.goweather.a.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.util:
//            j, i, r, h, 
//            g, o

public class f extends b
{

    private static f b = null;
    private Context a;
    private i c;
    private Map d;
    private com.gau.go.launcherex.gowidget.weather.c.e e;
    private u f;
    private com.gau.go.launcherex.gowidget.weather.util.j g;

    private f(Context context)
    {
        a = null;
        c = null;
        d = new HashMap();
        a = context;
        g = new com.gau.go.launcherex.gowidget.weather.util.j(this);
        context = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        a.registerReceiver(g, context);
        c = new i(this, a.getContentResolver());
    }

    private ContentValues a(a a1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("cityName", a1.d());
        Object obj = a1.b();
        if (obj != null && ((String) (obj)).length() > 0)
        {
            contentvalues.put("state", ((String) (obj)));
        }
        obj = a1.c();
        if (obj != null && ((String) (obj)).length() > 0)
        {
            contentvalues.put("country", ((String) (obj)));
        }
        contentvalues.put("cityId", a1.e());
        contentvalues.put("updateTime", Long.valueOf(a1.n()));
        contentvalues.put("tz_offset", Integer.valueOf(a1.u()));
        contentvalues.put("latitude", Float.valueOf(a1.f()));
        contentvalues.put("longitude", Float.valueOf(a1.g()));
        contentvalues.put("hasRadar", Integer.valueOf(a1.h()));
        contentvalues.put("hasSatellite", Integer.valueOf(a1.i()));
        contentvalues.put("northeast", a1.k());
        contentvalues.put("southwest", a1.m());
        contentvalues.put("cityJsonString", a1.w());
        contentvalues.put("timestamp", Long.valueOf(a1.o()));
        obj = a1.q();
        contentvalues.put("sequence", Integer.valueOf(0));
        contentvalues.put("city_my_location", Integer.valueOf(1));
        contentvalues.put("nowDesp", ((e) (obj)).t());
        contentvalues.put("type", Integer.valueOf(((e) (obj)).u()));
        contentvalues.put("nowTempValue", Float.valueOf(com.gau.go.launcherex.gowidget.weather.util.r.a(((e) (obj)).v())));
        contentvalues.put("lowTempValue", Float.valueOf(com.gau.go.launcherex.gowidget.weather.util.r.a(((e) (obj)).s())));
        contentvalues.put("highTempValue", Float.valueOf(com.gau.go.launcherex.gowidget.weather.util.r.a(((e) (obj)).r())));
        contentvalues.put("humidityValue", Integer.valueOf(((e) (obj)).w()));
        contentvalues.put("windDirection", ((e) (obj)).q());
        contentvalues.put("windStrength", ((e) (obj)).h());
        contentvalues.put("windStrengthValue", Float.valueOf(((e) (obj)).f()));
        contentvalues.put("windType", Integer.valueOf(((e) (obj)).g()));
        contentvalues.put("barometerValue", Float.valueOf(((e) (obj)).k()));
        contentvalues.put("visibilityValue", Float.valueOf(((e) (obj)).j()));
        contentvalues.put("dewpointValue", Float.valueOf(((e) (obj)).l()));
        contentvalues.put("uvIndexValue", Float.valueOf(((e) (obj)).m()));
        contentvalues.put("sunrise", ((e) (obj)).n());
        contentvalues.put("sunset", ((e) (obj)).o());
        contentvalues.put("pop", Integer.valueOf(((e) (obj)).p()));
        contentvalues.put("rainFall", Float.valueOf(((e) (obj)).x()));
        contentvalues.put("feelslikeValue", Float.valueOf(((e) (obj)).i()));
        contentvalues.put("golife", a1.a());
        return contentvalues;
    }

    private WeatherBean a(String s, String s1, int i1)
    {
        WeatherBean weatherbean = new WeatherBean();
        weatherbean.e(d.size());
        weatherbean.a(i1);
        weatherbean.c(s);
        weatherbean.e(s1);
        weatherbean.h();
        weatherbean.g();
        weatherbean.i();
        weatherbean.j();
        d.put(s, weatherbean);
        return weatherbean;
    }

    public static f a(Context context)
    {
        com/gau/go/launcherex/gowidget/weather/util/f;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new f(context);
        }
        context = b;
        com/gau/go/launcherex/gowidget/weather/util/f;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static ArrayList a(f f1, Cursor cursor)
    {
        return f1.c(cursor);
    }

    static Map a(f f1)
    {
        return f1.d;
    }

    private void a(int i1, int j1, ArrayList arraylist, ArrayList arraylist1, int k1, int l1)
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        intent.putExtra("weather_update_status", i1);
        intent.putExtra("weather_update_errorcode", j1);
        intent.putExtra("update_weather_data", arraylist);
        intent.putExtra("weather_status", arraylist1);
        intent.putExtra("weather_update_way", k1);
        intent.putExtra("request", l1);
        a.sendBroadcast(intent);
    }

    static void a(f f1, int i1)
    {
        f1.a(i1);
    }

    private void a(a a1, WeatherBean weatherbean, ArrayList arraylist)
    {
        int j1 = a1.t();
        for (int i1 = 0; i1 < j1; i1++)
        {
            com.jiubang.goweather.a.b b1 = a1.e(i1);
            int k1 = b1.i();
            if (weatherbean.d(k1) == null && !com.gau.go.launcherex.gowidget.weather.util.r.c(b1.b()))
            {
                ExtremeCityIdBean extremecityidbean = new ExtremeCityIdBean();
                extremecityidbean.a(a1.e());
                extremecityidbean.a(k1);
                arraylist.add(extremecityidbean);
            }
        }

    }

    static Context b(f f1)
    {
        return f1.a;
    }

    static void b(f f1, Cursor cursor)
    {
        f1.d(cursor);
    }

    private void b(ArrayList arraylist)
    {
        boolean flag1 = true;
        if (arraylist != null)
        {
            Object obj = f.F;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                if (((String) (obj)).contains("#"))
                {
                    obj = ((String) (obj)).split("#");
                } else
                {
                    obj = (new String[] {
                        obj
                    });
                }
            } else
            {
                obj = null;
            }
            if (obj != null && obj.length > 0)
            {
                ArrayList arraylist1 = new ArrayList();
                for (int i1 = 0; i1 < obj.length; i1++)
                {
                    arraylist1.add(obj[i1]);
                }

                for (arraylist = arraylist.iterator(); arraylist.hasNext(); arraylist1.remove((String)arraylist.next())) { }
                if (arraylist1.size() < obj.length)
                {
                    arraylist = new StringBuffer();
                    obj = arraylist1.iterator();
                    boolean flag = flag1;
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s = (String)((Iterator) (obj)).next();
                        if (flag)
                        {
                            arraylist.append(s);
                            flag = false;
                        } else
                        {
                            arraylist.append((new StringBuilder()).append("#").append(s).toString());
                        }
                    }
                    arraylist = arraylist.toString();
                    e.b(arraylist);
                    e.a(WeatherContentProvider.g, "setting_key", "no_alerts_cities", "setting_value", arraylist);
                }
            }
        }
    }

    private ArrayList c(Cursor cursor)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = false;
        flag1 = false;
        flag2 = false;
        boolean flag3 = cursor.moveToFirst();
        if (!flag3) goto _L2; else goto _L1
_L1:
        flag1 = flag2;
_L7:
        WeatherBean weatherbean;
        String s;
        weatherbean = new WeatherBean();
        weatherbean.a(cursor);
        s = weatherbean.c();
        if (TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        WeatherBean weatherbean1 = (WeatherBean)d.get(s);
        if (weatherbean1 == null) goto _L6; else goto _L5
_L5:
        if (weatherbean1.e() == 2)
        {
            weatherbean1.e(weatherbean.q());
        }
_L8:
        flag = flag1;
_L10:
        flag1 = flag;
        flag3 = cursor.moveToNext();
        flag1 = flag;
        if (flag3) goto _L7; else goto _L2
_L2:
        cursor.close();
_L9:
        Object obj;
        if (flag)
        {
            cursor = new ArrayList();
            cursor.add(ContentProviderOperation.newDelete(WeatherContentProvider.a).withSelection("cityId is null", null).build());
            return cursor;
        } else
        {
            return null;
        }
_L6:
        weatherbean.g();
        weatherbean.h();
        weatherbean.j();
        weatherbean.i();
        d.put(s, weatherbean);
          goto _L8
        obj;
_L11:
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        flag = flag1;
          goto _L9
_L4:
        flag = true;
          goto _L10
        obj;
        cursor.close();
        throw obj;
        obj;
          goto _L11
    }

    static void c(f f1, Cursor cursor)
    {
        f1.e(cursor);
    }

    static boolean c(f f1)
    {
        return f1.m();
    }

    static i d(f f1)
    {
        return f1.c;
    }

    private void d(Cursor cursor)
    {
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i1 = cursor.getColumnIndex("cityId");
_L3:
        Object obj;
        obj = cursor.getString(i1);
        obj = (WeatherBean)d.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        ((WeatherBean) (obj)).b(cursor);
        boolean flag = cursor.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        cursor.close();
        return;
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        cursor.close();
        return;
        obj1;
        cursor.close();
        throw obj1;
    }

    static void d(f f1, Cursor cursor)
    {
        f1.f(cursor);
    }

    private void e(Cursor cursor)
    {
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i1 = cursor.getColumnIndex("cityId");
_L3:
        Object obj;
        obj = cursor.getString(i1);
        obj = (WeatherBean)d.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        ((WeatherBean) (obj)).c(cursor);
        boolean flag = cursor.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        cursor.close();
        return;
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        cursor.close();
        return;
        obj1;
        cursor.close();
        throw obj1;
    }

    static void e(f f1)
    {
        f1.n();
    }

    static u f(f f1)
    {
        return f1.f;
    }

    private void f(Cursor cursor)
    {
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        c c1;
        WeatherBean weatherbean;
        c1 = WeatherBean.d(cursor);
        weatherbean = (WeatherBean)d.get(c1.j());
        if (weatherbean == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        c1.a(com.gau.go.launcherex.gowidget.weather.util.r.c(c1.d()));
        weatherbean.m.put(Integer.valueOf(c1.k()), c1);
        boolean flag = cursor.moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        cursor.close();
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        return;
        obj;
        cursor.close();
        throw obj;
    }

    static com.gau.go.launcherex.gowidget.weather.c.e g(f f1)
    {
        return f1.e;
    }

    private boolean m()
    {
        boolean flag = false;
        a a1 = com.gau.go.launcherex.gowidget.weather.c.a.a(a);
        if (a1 != null)
        {
            flag = true;
            ContentValues contentvalues = a(a1);
            c.a(13, a1, WeatherContentProvider.a, contentvalues);
        }
        return flag;
    }

    private void n()
    {
        c.a(3, null, WeatherContentProvider.e, com.gau.go.launcherex.gowidget.weather.e.j.a(), null, null, "cityId");
    }

    public int a(String s, ArrayList arraylist)
    {
        int j1 = arraylist.size();
        if (j1 > 1 && !"".equals(s))
        {
            for (int i1 = 0; i1 < j1; i1++)
            {
                if (((WeatherBean)arraylist.get(i1)).c().equals(s))
                {
                    return i1;
                }
            }

        }
        return 0;
    }

    public g a()
    {
        return com.gau.go.launcherex.gowidget.weather.c.c.a(a).g();
    }

    public WeatherBean a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            return (WeatherBean)d.get(s);
        } else
        {
            return null;
        }
    }

    public void a(int i1, int j1, List list, int k1, int l1)
    {
        if (!list.isEmpty())
        {
            ArrayList arraylist = new ArrayList();
            Object obj = new ArrayList();
            int j2 = list.size();
            int i2 = 0;
            while (i2 < j2) 
            {
                a a1 = (a)list.get(i2);
                WeatherBean weatherbean = (WeatherBean)d.get(a1.c);
                if (weatherbean != null)
                {
                    if (a1.a == 1)
                    {
                        a(a1, weatherbean, arraylist);
                        weatherbean.a(a1, a1.c);
                    }
                } else
                {
                    ((ArrayList) (obj)).add(a1);
                }
                i2++;
            }
            for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); list.remove((a)((Iterator) (obj)).next())) { }
            obj = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            a a2;
            for (list = list.iterator(); list.hasNext(); arraylist1.add(Integer.valueOf(a2.a)))
            {
                a2 = (a)list.next();
                ((ArrayList) (obj)).add(a2.c);
            }

            a(i1, j1, ((ArrayList) (obj)), arraylist1, k1, l1);
            if (!arraylist.isEmpty())
            {
                list = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_UPDATE_EXTREME_WEATHER");
                list.putParcelableArrayListExtra("extra_extreme_city_ids", arraylist);
                a.sendBroadcast(list);
                return;
            }
        }
    }

    public void a(Cursor cursor)
    {
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i1 = cursor.getColumnIndex("cityId");
_L3:
        Object obj;
        obj = cursor.getString(i1);
        obj = (WeatherBean)d.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        ((WeatherBean) (obj)).f(cursor);
        boolean flag = cursor.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        cursor.close();
        return;
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        cursor.close();
        return;
        obj1;
        cursor.close();
        throw obj1;
    }

    public void a(CityBean citybean)
    {
        WeatherBean weatherbean = (WeatherBean)d.get(citybean.a());
        WeatherBean weatherbean1 = g();
        if (weatherbean != null)
        {
            if (weatherbean1 != null)
            {
                if (!citybean.a().equals(weatherbean1.c()))
                {
                    int i1 = weatherbean1.e();
                    if (i1 == 3)
                    {
                        weatherbean1.a(1);
                    } else
                    if (i1 == 2)
                    {
                        d.remove(weatherbean1.c());
                    }
                    weatherbean.a(3);
                }
            } else
            {
                weatherbean.a(3);
            }
        } else
        if (weatherbean1 != null)
        {
            int j1 = weatherbean1.e();
            if (j1 == 2)
            {
                d.remove(weatherbean1.c());
                weatherbean1.c(citybean.a());
                weatherbean1.e(citybean.b());
                weatherbean1.a(citybean.d());
                weatherbean1.b(citybean.c());
                weatherbean1.l.l(citybean.h());
                weatherbean1.l.k(citybean.j());
                weatherbean1.l.q(citybean.i());
                weatherbean1.l.r(citybean.k());
                weatherbean1.f();
                weatherbean1.g();
                weatherbean1.i();
                weatherbean1.j();
                weatherbean1.h();
                d.put(citybean.a(), weatherbean1);
            } else
            if (j1 == 3)
            {
                weatherbean1.a(1);
                a(citybean.a(), citybean.b(), 2);
            }
        } else
        {
            a(citybean.a(), citybean.b(), 2);
        }
        if (f.o == 2)
        {
            e.a(f.m, f.p, citybean.a(), f.o, f.C);
            e.c();
        }
    }

    public void a(CityBean citybean, int i1, int j1)
    {
        Object obj = a(citybean.a());
        if (obj == null)
        {
            obj = new WeatherBean();
            ((WeatherBean) (obj)).e(i1);
            ((WeatherBean) (obj)).c(citybean.a());
            ((WeatherBean) (obj)).d(citybean.a());
            ((WeatherBean) (obj)).e(citybean.b());
            ((WeatherBean) (obj)).a(citybean.d());
            ((WeatherBean) (obj)).b(citybean.c());
            ((WeatherBean) (obj)).a(1);
            ((WeatherBean) (obj)).l.l(citybean.h());
            ((WeatherBean) (obj)).l.k(citybean.j());
            ((WeatherBean) (obj)).l.q(citybean.i());
            ((WeatherBean) (obj)).l.r(citybean.k());
            ((WeatherBean) (obj)).l.h(citybean.e());
            ((WeatherBean) (obj)).h();
            ((WeatherBean) (obj)).g();
            ((WeatherBean) (obj)).i();
            ((WeatherBean) (obj)).j();
            d.put(citybean.a(), obj);
            obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ADD_CITY");
            ((Intent) (obj)).putExtra("city_code", citybean.a());
            ((Intent) (obj)).putExtra("city_name", citybean.b());
            ((Intent) (obj)).putExtra("city_index", i1);
            ((Intent) (obj)).putExtra("gowidget_Id", j1);
            a.sendBroadcast(((Intent) (obj)));
            return;
        } else
        {
            ((WeatherBean) (obj)).a(3);
            return;
        }
    }

    public void a(WeatherBean weatherbean, ArrayList arraylist)
    {
        ExtremeCityIdBean extremecityidbean;
        for (weatherbean = weatherbean.m.entrySet().iterator(); weatherbean.hasNext(); arraylist.add(extremecityidbean))
        {
            Object obj = (java.util.Map.Entry)weatherbean.next();
            extremecityidbean = new ExtremeCityIdBean();
            obj = (c)((java.util.Map.Entry) (obj)).getValue();
            extremecityidbean.a(((c) (obj)).j());
            extremecityidbean.a(((c) (obj)).k());
        }

    }

    public void a(c c1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("cityId", c1.j());
        contentvalues.put("description", c1.f());
        contentvalues.put("exp_time", c1.d());
        contentvalues.put("level", Integer.valueOf(c1.h()));
        contentvalues.put("message", c1.i());
        contentvalues.put("phenomena", c1.g());
        contentvalues.put("publish_time", c1.c());
        contentvalues.put("type", c1.e());
        contentvalues.put("alert_id", Integer.valueOf(c1.k()));
        contentvalues.put("tz_offset", Integer.valueOf(c1.a()));
        contentvalues.put("has_read", Integer.valueOf(0));
        c.a(0, null, WeatherContentProvider.k, contentvalues);
        WeatherBean weatherbean = (WeatherBean)d.get(c1.j());
        if (com.gau.go.launcherex.gowidget.weather.util.r.c(c1.d()))
        {
            c1.a(true);
        }
        if (weatherbean != null)
        {
            Object obj = new ExtremeCityIdBean();
            ((ExtremeCityIdBean) (obj)).a(c1.j());
            ((ExtremeCityIdBean) (obj)).a(c1.k());
            if (!c1.b())
            {
                weatherbean.m.put(Integer.valueOf(c1.k()), c1);
                c1 = new ArrayList();
                c1.add(obj);
                obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_UPDATE_EXTREME_WEATHER");
                ((Intent) (obj)).putParcelableArrayListExtra("extra_extreme_city_ids", c1);
                a.sendBroadcast(((Intent) (obj)));
            }
        }
    }

    public void a(o o)
    {
        super.a(o);
        e = com.gau.go.launcherex.gowidget.weather.c.c.a(a).f();
        f = e.a();
        c.a(2, null, WeatherContentProvider.a, com.gau.go.launcherex.gowidget.weather.e.b.a(), null, null, null);
    }

    public void a(String s, c c1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("exp_time", c1.d());
        contentvalues.put("type", c1.e());
        contentvalues.put("description", c1.f());
        contentvalues.put("phenomena", c1.g());
        contentvalues.put("publish_time", c1.c());
        contentvalues.put("level", Integer.valueOf(c1.h()));
        contentvalues.put("tz_offset", Integer.valueOf(c1.a()));
        contentvalues.put("message", c1.i());
        int i1;
        if (c1.m())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("has_read", Integer.valueOf(i1));
        c.a(0, null, WeatherContentProvider.k, contentvalues, (new StringBuilder()).append("alert_id=").append(c1.k()).append(" and ").append("cityId").append("='").append(s).append("'").toString(), null);
    }

    public void a(String s, String s1, long l1)
    {
        if (!TextUtils.isEmpty(s))
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(new RequestBean(s, s1, l1));
            s = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
            s.putExtra("notify_request", 21);
            s.putParcelableArrayListExtra("req_arg", arraylist);
            a.startService(s);
        }
    }

    public void a(ArrayList arraylist)
    {
        String s2 = com.go.weatherex.city.c.a().b();
        int l1 = b(s2);
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        Object obj = arraylist.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            WeatherBean weatherbean1 = (WeatherBean)d.remove(s);
            if (weatherbean1 != null)
            {
                String as[] = new String[1];
                as[0] = s;
                arraylist1.add(ContentProviderOperation.newDelete(WeatherContentProvider.a).withSelection("cityId=?", as).build());
                arraylist1.add(ContentProviderOperation.newDelete(WeatherContentProvider.b).withSelection("cityId=?", as).build());
                arraylist1.add(ContentProviderOperation.newDelete(WeatherContentProvider.f).withSelection("cityId=?", as).build());
                arraylist1.add(ContentProviderOperation.newDelete(WeatherContentProvider.e).withSelection("cityId=?", as).build());
                arraylist1.add(ContentProviderOperation.newDelete(WeatherContentProvider.k).withSelection("cityId=?", as).build());
                if (weatherbean1.o() > 0)
                {
                    a(weatherbean1, arraylist2);
                }
                if (f.n.equals(s))
                {
                    e.d();
                }
                com.gau.go.launcherex.gowidget.gcm.b.a(a).a(s);
                d(s);
            }
        } while (true);
        b(arraylist);
        ArrayList arraylist3 = d();
        int i2 = arraylist3.size();
        obj = new ContentValues();
        for (int i1 = 0; i1 < i2; i1++)
        {
            WeatherBean weatherbean = (WeatherBean)arraylist3.get(i1);
            weatherbean.e(i1);
            ((ContentValues) (obj)).put("sequence", Integer.valueOf(i1));
            arraylist1.add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(((ContentValues) (obj))).withSelection((new StringBuilder()).append("cityId='").append(weatherbean.c()).append("'").toString(), null).build());
        }

        int j1;
        if (arraylist.contains(s2))
        {
            Object obj1;
            int k1;
            if (l1 >= i2 - 1)
            {
                j1 = i2 - 1;
            } else
            {
                j1 = l1;
            }
            obj = ((WeatherBean)arraylist3.get(j1)).c();
        } else
        {
            String s1;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); d.remove(s1))
            {
                s1 = (String)((Iterator) (obj)).next();
            }

            j1 = arraylist3.indexOf(a(s2));
            obj = s2;
        }
        obj1 = obj;
        k1 = j1;
        if (j1 == -1)
        {
            try
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("[size]=").append(i2).append("|[currentIdx]=").append(l1).append("|[currentCityId]=").append(s2).append("|[newCurIdx]=").append(j1).append("|[newCurCityId]=").append(((String) (obj))).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj1 = new Intent(a, com/gau/go/launcherex/gowidget/weather/service/NotifyService);
            }
            ((Intent) (obj1)).putExtra("notify_request", 38);
            ((Intent) (obj1)).putExtra("request_extra_runtime_crash_title", "Error : DataManager.java:972");
            ((Intent) (obj1)).putExtra("request_extra_runtime_crash_text", w.a(((Throwable) (obj)), "#"));
            a.startService(((Intent) (obj1)));
            obj1 = ((WeatherBean)arraylist3.get(0)).c();
            k1 = 0;
        }
        if (!arraylist1.isEmpty())
        {
            c.a(11, new h(this, arraylist, k1, ((String) (obj1))), "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist1);
        }
        if (!arraylist2.isEmpty())
        {
            e.a(arraylist2);
        }
        e.b(arraylist);
    }

    public int b(String s)
    {
        s = a(s);
        if (s != null)
        {
            return s.q();
        } else
        {
            return -1;
        }
    }

    public WeatherBean b(int i1)
    {
        for (Iterator iterator = d.values().iterator(); iterator.hasNext();)
        {
            WeatherBean weatherbean = (WeatherBean)iterator.next();
            if (weatherbean.q() == i1)
            {
                return weatherbean;
            }
        }

        return null;
    }

    public void b()
    {
        a.unregisterReceiver(g);
    }

    public void b(Cursor cursor)
    {
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i1 = cursor.getColumnIndex("cityId");
_L3:
        Object obj;
        obj = cursor.getString(i1);
        obj = (WeatherBean)d.get(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        ((WeatherBean) (obj)).e(cursor);
        boolean flag = cursor.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        cursor.close();
        return;
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        cursor.close();
        return;
        obj1;
        cursor.close();
        throw obj1;
    }

    public Map c()
    {
        return d;
    }

    public boolean c(String s)
    {
        return d.remove(s) != null;
    }

    public ArrayList d()
    {
        Object obj = d.entrySet();
        ArrayList arraylist = new ArrayList();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((java.util.Map.Entry)((Iterator) (obj)).next()).getValue())) { }
        Collections.sort(arraylist, new com.gau.go.launcherex.gowidget.weather.util.g(this));
        return arraylist;
    }

    public void d(String s)
    {
        File file = new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append("/GOWeatherEX/download/maps").append(File.separator).append("radar_").append(s).append(".png").toString());
        if (file != null && file.exists())
        {
            file.delete();
        }
        s = new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append("/GOWeatherEX/download/maps").append(File.separator).append("satellite_").append(s).append(".png").toString());
        if (s != null && s.exists())
        {
            s.delete();
        }
    }

    public int e()
    {
        return d.size();
    }

    public String e(String s)
    {
        s = (WeatherBean)d.get(s);
        if (s != null)
        {
            return s.d();
        } else
        {
            return null;
        }
    }

    public ArrayList f()
    {
        return new ArrayList(d.values());
    }

    public boolean f(String s)
    {
        return d.get(s) != null;
    }

    public WeatherBean g()
    {
label0:
        {
            if (d.isEmpty())
            {
                break label0;
            }
            Iterator iterator = d.values().iterator();
            WeatherBean weatherbean;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                weatherbean = (WeatherBean)iterator.next();
            } while (weatherbean.e() == 1);
            return weatherbean;
        }
        return null;
    }

    public boolean g(String s)
    {
        s = (WeatherBean)d.get(s);
        if (s != null)
        {
            return s.e() != 1;
        } else
        {
            return false;
        }
    }

    public String h()
    {
        WeatherBean weatherbean = g();
        if (weatherbean != null)
        {
            return weatherbean.c();
        } else
        {
            return null;
        }
    }

    public void i()
    {
        if (e() != 0)
        {
            ArrayList arraylist = new ArrayList();
            RequestBean requestbean;
            for (Iterator iterator = d.values().iterator(); iterator.hasNext(); arraylist.add(requestbean))
            {
                WeatherBean weatherbean = (WeatherBean)iterator.next();
                requestbean = new RequestBean();
                requestbean.a = weatherbean.c();
                requestbean.b = weatherbean.d();
                requestbean.c = weatherbean.l.g();
            }

            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
            intent.putExtra("notify_request", 22);
            intent.putParcelableArrayListExtra("req_arg", arraylist);
            a.startService(intent);
        }
    }

    public boolean j()
    {
label0:
        {
            if (d.isEmpty())
            {
                break label0;
            }
            Iterator iterator = d.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!((WeatherBean)iterator.next()).r());
            return true;
        }
        return false;
    }

    public void k()
    {
        Object obj = a(a).c().entrySet();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Iterator iterator = ((WeatherBean)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue()).n().entrySet().iterator();
            while (iterator.hasNext()) 
            {
                c c1 = (c)((java.util.Map.Entry)iterator.next()).getValue();
                if (com.gau.go.launcherex.gowidget.weather.util.r.c(c1.d()))
                {
                    c1.a(true);
                    ExtremeCityIdBean extremecityidbean = new ExtremeCityIdBean();
                    extremecityidbean.a(c1.j());
                    extremecityidbean.a(c1.k());
                    arraylist.add(extremecityidbean);
                } else
                {
                    c1.a(false);
                }
            }
        }

        if (arraylist1.size() > 0)
        {
            Intent intent1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_UPDATE_EXTREME_WEATHER");
            intent1.putParcelableArrayListExtra("extra_extreme_city_ids", arraylist1);
            intent1.putExtra("extra_extreme_notify", false);
            a.sendBroadcast(intent1);
        }
        if (arraylist.size() > 0)
        {
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_EXPIRED_EXTREME_WEATHER");
            intent.putParcelableArrayListExtra("extra_extreme_city_ids", arraylist);
            a.sendBroadcast(intent);
        }
    }

    public void l()
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag1;
        Object obj = a(a).c().entrySet();
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        obj = ((Set) (obj)).iterator();
        flag1 = false;
        do
        {
label0:
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                Map map = ((WeatherBean)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue()).n();
                Iterator iterator = map.entrySet().iterator();
                boolean flag = flag1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    c c1 = (c)((java.util.Map.Entry)iterator.next()).getValue();
                    if (com.gau.go.launcherex.gowidget.weather.util.r.c(c1.d()) && c1.m() || r.d(c1.d()))
                    {
                        arraylist2.add(Integer.valueOf(c1.k()));
                        arraylist.add(Integer.valueOf(c1.k()));
                        ExtremeCityIdBean extremecityidbean = new ExtremeCityIdBean();
                        extremecityidbean.a(c1.j());
                        extremecityidbean.a(c1.k());
                        arraylist1.add(extremecityidbean);
                        flag = true;
                    }
                } while (true);
                int l1 = arraylist2.size();
                int k1 = 0;
                do
                {
                    flag1 = flag;
                    if (k1 >= l1)
                    {
                        break;
                    }
                    map.remove(arraylist2.get(k1));
                    k1++;
                } while (true);
            }
        } while (true);
        if (flag1)
        {
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_EXPIRED_EXTREME_WEATHER");
            intent.putParcelableArrayListExtra("extra_extreme_city_ids", arraylist1);
            a.sendBroadcast(intent);
            arraylist1 = new ArrayList();
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                arraylist1.add(ContentProviderOperation.newDelete(WeatherContentProvider.k).withSelection((new StringBuilder()).append("alert_id='").append(arraylist.get(i1)).append("'").toString(), null).build());
            }

            c.a(0, null, "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist1);
        }
        return;
    }

}
