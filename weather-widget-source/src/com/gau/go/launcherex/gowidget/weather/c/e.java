// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.c;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.gcm.b;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.o;
import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.c:
//            b, f, c, g

public class e extends com.gau.go.launcherex.gowidget.weather.c.b
{

    private static e a;
    private Context b;
    private com.gau.go.launcherex.gowidget.weather.c.f c;
    private u d;
    private f e;

    private e(Context context)
    {
        b = context;
        c = new com.gau.go.launcherex.gowidget.weather.c.f(this, context.getContentResolver(), this);
        d = new u();
    }

    public static e a(Context context)
    {
        com/gau/go/launcherex/gowidget/weather/c/e;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new e(context);
        }
        context = a;
        com/gau/go/launcherex/gowidget/weather/c/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static f a(e e1)
    {
        return e1.e;
    }

    private void a(Cursor cursor)
    {
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        int i1;
        int j1;
        i1 = cursor.getColumnIndex("setting_key");
        j1 = cursor.getColumnIndex("setting_value");
_L6:
        Object obj = cursor.getString(i1);
        if (!((String) (obj)).equals("auto_location")) goto _L5; else goto _L4
_L4:
        d.b = cursor.getInt(j1);
_L7:
        boolean flag = cursor.moveToNext();
        if (flag) goto _L6; else goto _L2
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
_L9:
        return;
_L5:
        if (!((String) (obj)).equals("launch_refresh"))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        d.c = cursor.getInt(j1);
          goto _L7
        obj;
        if (com.gtp.a.a.b.c.a())
        {
            ((Exception) (obj)).printStackTrace();
        }
        if (cursor == null) goto _L9; else goto _L8
_L8:
        cursor.close();
        return;
        if (!((String) (obj)).equals("app_theme"))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        d.d = cursor.getString(j1);
          goto _L7
        obj;
        if (cursor != null)
        {
            cursor.close();
        }
        throw obj;
label0:
        {
            if (!((String) (obj)).equals("weather_focecast_switch"))
            {
                break label0;
            }
            d.s = cursor.getInt(j1);
        }
          goto _L7
label1:
        {
            if (!((String) (obj)).equals("weather_warning_switch"))
            {
                break label1;
            }
            d.t = cursor.getInt(j1);
        }
          goto _L7
label2:
        {
            if (!((String) (obj)).equals("no_alerts_cities"))
            {
                break label2;
            }
            d.F = cursor.getString(j1);
        }
          goto _L7
label3:
        {
            if (!((String) (obj)).equals("temp_change"))
            {
                break label3;
            }
            d.u = cursor.getInt(j1);
        }
          goto _L7
label4:
        {
            if (!((String) (obj)).equals("temp_change_low"))
            {
                break label4;
            }
            d.v = cursor.getInt(j1);
        }
          goto _L7
label5:
        {
            if (!((String) (obj)).equals("temp_change_high"))
            {
                break label5;
            }
            d.w = cursor.getInt(j1);
        }
          goto _L7
label6:
        {
            if (!((String) (obj)).equals("temp_change_city"))
            {
                break label6;
            }
            d.x = cursor.getString(j1);
        }
          goto _L7
label7:
        {
            if (!((String) (obj)).equals("temp_change_type"))
            {
                break label7;
            }
            d.y = cursor.getInt(j1);
        }
          goto _L7
label8:
        {
            if (!((String) (obj)).equals("autoUpdate"))
            {
                break label8;
            }
            d.a = cursor.getInt(j1);
        }
          goto _L7
label9:
        {
            if (!((String) (obj)).equals("autpUpdateFreq"))
            {
                break label9;
            }
            d.e = cursor.getInt(j1);
        }
          goto _L7
label10:
        {
            if (!((String) (obj)).equals("tempUnit"))
            {
                break label10;
            }
            d.g = cursor.getInt(j1);
        }
          goto _L7
label11:
        {
            if (!((String) (obj)).equals("calendarType"))
            {
                break label11;
            }
            d.h = cursor.getInt(j1);
        }
          goto _L7
label12:
        {
            if (!((String) (obj)).equals("festival"))
            {
                break label12;
            }
            d.i = cursor.getInt(j1);
        }
          goto _L7
label13:
        {
            if (!((String) (obj)).equals("isCycle"))
            {
                break label13;
            }
            d.j = cursor.getInt(j1);
        }
          goto _L7
label14:
        {
            if (!((String) (obj)).equals("dateStyle"))
            {
                break label14;
            }
            d.k = cursor.getInt(j1);
        }
          goto _L7
label15:
        {
            if (!((String) (obj)).equals("notify"))
            {
                break label15;
            }
            d.m = cursor.getInt(j1);
        }
          goto _L7
label16:
        {
            if (!((String) (obj)).equals("notify_city"))
            {
                break label16;
            }
            d.n = cursor.getString(j1);
        }
          goto _L7
label17:
        {
            if (!((String) (obj)).equals("notify_city_type"))
            {
                break label17;
            }
            d.o = cursor.getInt(j1);
        }
          goto _L7
label18:
        {
            if (!((String) (obj)).equals("notify_type"))
            {
                break label18;
            }
            d.p = cursor.getInt(j1);
        }
          goto _L7
        String s1;
label19:
        {
            if (!((String) (obj)).equals("windUnit"))
            {
                break MISSING_BLOCK_LABEL_813;
            }
            d.q = cursor.getInt(j1);
            if (d.q > 6)
            {
                obj = Locale.getDefault().getCountry();
                s1 = Locale.getDefault().getLanguage();
                if (((String) (obj)).indexOf("CN") == -1 || !s1.equalsIgnoreCase("zh"))
                {
                    break label19;
                }
                d.q = 5;
            }
        }
          goto _L7
label20:
        {
            if (((String) (obj)).indexOf("KR") == -1 || !s1.equalsIgnoreCase("ko"))
            {
                break label20;
            }
            d.q = 4;
        }
          goto _L7
        d.q = 2;
          goto _L7
label21:
        {
            if (!((String) (obj)).equals("world_clock"))
            {
                break label21;
            }
            d.r = cursor.getInt(j1);
        }
          goto _L7
label22:
        {
            if (!((String) (obj)).equals("notification_sound"))
            {
                break label22;
            }
            d.z = cursor.getInt(j1);
        }
          goto _L7
label23:
        {
            if (!((String) (obj)).equals("visibility_unit"))
            {
                break MISSING_BLOCK_LABEL_938;
            }
            d.A = cursor.getInt(j1);
            if (d.A > 2)
            {
                if (!Locale.getDefault().getLanguage().equalsIgnoreCase("en"))
                {
                    break label23;
                }
                d.A = 1;
            }
        }
          goto _L7
        d.A = 2;
          goto _L7
label24:
        {
            if (!((String) (obj)).equals("pressure_unit"))
            {
                break label24;
            }
            d.B = cursor.getInt(j1);
        }
          goto _L7
label25:
        {
            if (!((String) (obj)).equals("notification_style"))
            {
                break label25;
            }
            d.C = cursor.getString(j1);
        }
          goto _L7
label26:
        {
            if (!((String) (obj)).equals("weather_assistant_switch"))
            {
                break label26;
            }
            d.D = cursor.getInt(j1);
        }
          goto _L7
label27:
        {
            if (!((String) (obj)).equals("dynamic_bg_switch"))
            {
                break label27;
            }
            d.l = cursor.getInt(j1);
        }
          goto _L7
        if (!((String) (obj)).equals("dynamic_icon_gowidget")) goto _L11; else goto _L10
_L10:
        d.E = cursor.getInt(j1);
          goto _L7
_L11:
        if (!((String) (obj)).equals("widget_theme_switcher")) goto _L7; else goto _L12
_L12:
        d.L = cursor.getInt(j1);
          goto _L7
    }

    private void a(Uri uri, String s1, ArrayList arraylist, String s2, String s3, String s4, int i1)
    {
        s1 = new ContentValues();
        s1.put(s4, Integer.valueOf(i1));
        arraylist.add(ContentProviderOperation.newUpdate(uri).withValues(s1).withSelection((new StringBuilder()).append(s2).append("='").append(s3).append("'").toString(), null).build());
    }

    private void a(Uri uri, String s1, ArrayList arraylist, String s2, String s3, String s4, String s5)
    {
        s1 = new ContentValues();
        s1.put(s4, s5);
        arraylist.add(ContentProviderOperation.newUpdate(uri).withValues(s1).withSelection((new StringBuilder()).append(s2).append("='").append(s3).append("'").toString(), null).build());
    }

    static void a(e e1, Cursor cursor)
    {
        e1.a(cursor);
    }

    static void a(e e1, Object obj)
    {
        e1.a(obj);
    }

    private void a(WeatherBean weatherbean, ArrayList arraylist, int i1, int j1)
    {
        weatherbean.a(1);
        weatherbean.e(j1);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sequence", Integer.valueOf(j1));
        contentvalues.put("city_my_location", Integer.valueOf(1));
        arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(contentvalues).withSelection((new StringBuilder()).append("cityId='").append(weatherbean.c()).append("'").append(" and ").append("city_my_location").append("='").append(i1).append("'").toString(), null).build());
    }

    private void a(Object obj)
    {
        if (obj != null)
        {
            obj = (ContentValues)obj;
            if (((ContentValues) (obj)).containsKey("tempUnit"))
            {
                b(((ContentValues) (obj)).getAsInteger("tempUnit").intValue());
            } else
            {
                if (((ContentValues) (obj)).containsKey("windUnit"))
                {
                    c(((ContentValues) (obj)).getAsInteger("windUnit").intValue());
                    return;
                }
                if (((ContentValues) (obj)).containsKey("visibility_unit"))
                {
                    d(((ContentValues) (obj)).getAsInteger("visibility_unit").intValue());
                    return;
                }
                if (((ContentValues) (obj)).containsKey("pressure_unit"))
                {
                    e(((ContentValues) (obj)).getAsInteger("pressure_unit").intValue());
                    return;
                }
                if (((ContentValues) (obj)).containsKey("world_clock"))
                {
                    f(((ContentValues) (obj)).getAsInteger("world_clock").intValue());
                    return;
                }
                if (((ContentValues) (obj)).containsKey("dateStyle"))
                {
                    g(((ContentValues) (obj)).getAsInteger("dateStyle").intValue());
                    return;
                }
                if (((ContentValues) (obj)).containsKey("calendarType"))
                {
                    k(((ContentValues) (obj)).getAsInteger("calendarType").intValue());
                    return;
                }
                if (((ContentValues) (obj)).containsKey("festival"))
                {
                    j(((ContentValues) (obj)).getAsInteger("festival").intValue());
                    return;
                }
                if (((ContentValues) (obj)).containsKey("isCycle"))
                {
                    l(((ContentValues) (obj)).getAsInteger("isCycle").intValue());
                    return;
                }
                if (((ContentValues) (obj)).containsKey("weather_focecast_switch"))
                {
                    o(((ContentValues) (obj)).getAsInteger("weather_focecast_switch").intValue());
                    return;
                }
                if (!((ContentValues) (obj)).containsKey("notify") && !((ContentValues) (obj)).containsKey("notify_city") && !((ContentValues) (obj)).containsKey("notify_type"))
                {
                    if (((ContentValues) (obj)).containsKey("notification_style"))
                    {
                        c(((ContentValues) (obj)).getAsString("notification_style"));
                        return;
                    }
                    if (((ContentValues) (obj)).containsKey("notification_sound"))
                    {
                        v(((ContentValues) (obj)).getAsInteger("notification_sound").intValue());
                        return;
                    }
                    if (((ContentValues) (obj)).containsKey("autoUpdate"))
                    {
                        h(((ContentValues) (obj)).getAsInteger("autoUpdate").intValue());
                        return;
                    }
                    if (((ContentValues) (obj)).containsKey("launch_refresh"))
                    {
                        t(((ContentValues) (obj)).getAsInteger("launch_refresh").intValue());
                        return;
                    }
                    if (((ContentValues) (obj)).containsKey("autpUpdateFreq"))
                    {
                        i(((ContentValues) (obj)).getAsInteger("autpUpdateFreq").intValue());
                        return;
                    }
                    if (((ContentValues) (obj)).containsKey("dynamic_icon_gowidget"))
                    {
                        m(((ContentValues) (obj)).getAsInteger("dynamic_icon_gowidget").intValue());
                        return;
                    }
                    if (((ContentValues) (obj)).containsKey("widget_theme_switcher"))
                    {
                        n(((ContentValues) (obj)).getAsInteger("widget_theme_switcher").intValue());
                        return;
                    }
                }
            }
        }
    }

    private void a(ArrayList arraylist, WeatherBean weatherbean)
    {
        d.n = weatherbean.c();
        d.o = 1;
        a(WeatherContentProvider.g, "common_setting_table", arraylist, "setting_key", "notify_city", "setting_value", d.n);
        a(WeatherContentProvider.g, "common_setting_table", arraylist, "setting_key", "notify_city_type", "setting_value", d.o);
        i();
    }

    static Context b(e e1)
    {
        return e1.b;
    }

    static u c(e e1)
    {
        return e1.d;
    }

    private void c(String s1)
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_STATUS_BAR_MATCHED");
        intent.putExtra("extra_status_bar_style", s1);
        b.sendBroadcast(intent);
    }

    private void c(ArrayList arraylist)
    {
        d.o = 1;
        a(WeatherContentProvider.g, "common_setting_table", arraylist, "setting_key", "notify_city_type", "setting_value", d.o);
        i();
    }

    static void d(e e1)
    {
        e1.i();
    }

    private void d(ArrayList arraylist)
    {
        a(WeatherContentProvider.g, "common_setting_table", arraylist, "setting_key", "key_live_wallpaper_city_flag", "setting_value", 1);
    }

    private void h()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WEATHER_UPDATE_TIME");
        intent.putExtra("auto_weather_update", d.a);
        intent.putExtra("auto_weather_frequency", d.e);
        b.sendBroadcast(intent);
    }

    private void i()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", 1);
        intent.putExtra("notify_on_or_off", d.m);
        b.startService(intent);
    }

    private void j()
    {
        c.a(4, null, WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "key_live_wallpaper_city_flag"
        }, "_id");
    }

    private void v(int i1)
    {
        if (d.z != i1)
        {
            d.z = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_NOTIFICATION_SOUND");
            b.sendBroadcast(intent);
        }
    }

    public u a()
    {
        return d;
    }

    public void a(int i1, int j1, String s1, int k1, String s2)
    {
        if (d.m != i1)
        {
            d.m = i1;
        }
        if (d.p != j1)
        {
            d.p = j1;
        }
        if (s1 != null && !d.n.equals(s1))
        {
            d.n = s1;
        }
        if (k1 != d.o)
        {
            d.o = k1;
        }
        if (!TextUtils.isEmpty(s2) && !s2.equals(d.C))
        {
            d.C = s2;
        }
    }

    public void a(int i1, boolean flag)
    {
        d.b = i1;
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION");
        intent.putExtra("extra_auto_location_flag", i1);
        intent.putExtra("extra_delete_my_location", flag);
        b.sendBroadcast(intent);
    }

    public void a(Uri uri, String s1, String s2, String s3, int i1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(s3, Integer.valueOf(i1));
        s3 = new ContentValues();
        s3.put(s2, Integer.valueOf(i1));
        c.a(2, s3, uri, contentvalues, (new StringBuilder()).append(s1).append("='").append(s2).append("'").toString(), null);
    }

    public void a(Uri uri, String s1, String s2, String s3, String s4)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(s3, s4);
        s3 = new ContentValues();
        s3.put(s2, s4);
        c.a(2, s3, uri, contentvalues, (new StringBuilder()).append(s1).append("='").append(s2).append("'").toString(), null);
    }

    public void a(o o1)
    {
        super.a(o1);
        e = com.gau.go.launcherex.gowidget.weather.c.c.a(b).h();
        c.a(1, null, WeatherContentProvider.g, com.gau.go.launcherex.gowidget.weather.e.c.a(), null, null, null);
    }

    public void a(String s1)
    {
        if (s1 != null && !s1.equals(d.K))
        {
            d.K = s1;
        }
    }

    public void a(String s1, int i1)
    {
        d.n = s1;
        d.o = i1;
        ArrayList arraylist = new ArrayList();
        a(WeatherContentProvider.g, "common_setting_table", arraylist, "setting_key", "notify_city", "setting_value", s1);
        a(WeatherContentProvider.g, "common_setting_table", arraylist, "setting_key", "notify_city_type", "setting_value", i1);
        c.a(2, null, "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
    }

    public void a(String s1, String s2)
    {
        a(WeatherContentProvider.g, "setting_key", s1, "setting_value", s2);
    }

    public void a(ArrayList arraylist)
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_EXPIRED_EXTREME_WEATHER");
        intent.putParcelableArrayListExtra("extra_extreme_city_ids", arraylist);
        b.sendBroadcast(intent);
    }

    public void b(int i1)
    {
        boolean flag = true;
        if (d.g != i1)
        {
            d.g = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT");
            intent.putExtra("temperature_unit", d.g);
            b.sendBroadcast(intent);
            if (d.m == 1 && d.p == 1)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                c();
            }
        }
    }

    public void b(int i1, boolean flag)
    {
        if (d.b == i1) goto _L2; else goto _L1
_L1:
        Object obj1;
        ArrayList arraylist;
        obj1 = new ArrayList();
        d.b = i1;
        arraylist = new ArrayList();
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        WeatherBean weatherbean;
        int j1;
        ((ArrayList) (obj1)).add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withSelection("setting_key='auto_location'", null).withValue("setting_value", Integer.valueOf(0)).build());
        j1 = e.e();
        weatherbean = e.g();
        if (weatherbean == null) goto _L6; else goto _L5
_L5:
        int k1 = weatherbean.e();
        if (k1 != 2 && !flag) goto _L8; else goto _L7
_L7:
        if (j1 != 1) goto _L10; else goto _L9
_L9:
        Object obj;
        boolean flag1;
        a(weatherbean, ((ArrayList) (obj1)), 2, 0);
        c(((ArrayList) (obj1)));
        d(((ArrayList) (obj1)));
        flag = false;
        flag1 = false;
        obj = null;
_L12:
        if (((ArrayList) (obj1)).size() > 0)
        {
            c.a(1, ((Object) (new Object[] {
                Boolean.valueOf(flag), Boolean.valueOf(flag1), arraylist
            })), "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", ((ArrayList) (obj1)));
            if (i1 == 0)
            {
                j();
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY");
                arraylist = new ArrayList(1);
                arraylist.add(obj);
                ((Intent) (obj1)).putExtra("city_code_list", arraylist);
                b.sendBroadcast(((Intent) (obj1)));
            }
        }
_L2:
        return;
_L10:
        if (j1 > 1)
        {
            obj = weatherbean.c();
            e.c(((String) (obj)));
            e.d(((String) (obj)));
            ArrayList arraylist1 = e.d();
            new ContentValues();
            for (j1 = 0; j1 < arraylist1.size(); j1++)
            {
                WeatherBean weatherbean1 = (WeatherBean)arraylist1.get(j1);
                weatherbean1.e(j1);
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("sequence", Integer.valueOf(j1));
                ((ArrayList) (obj1)).add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(contentvalues).withSelection((new StringBuilder()).append("cityId='").append(weatherbean1.c()).append("'").toString(), null).build());
            }

            ((ArrayList) (obj1)).add(ContentProviderOperation.newDelete(WeatherContentProvider.a).withSelection((new StringBuilder()).append("cityId='").append(((String) (obj))).append("'").toString(), null).build());
            ((ArrayList) (obj1)).add(ContentProviderOperation.newDelete(WeatherContentProvider.b).withSelection((new StringBuilder()).append("cityId='").append(((String) (obj))).append("'").toString(), null).build());
            ((ArrayList) (obj1)).add(ContentProviderOperation.newDelete(WeatherContentProvider.f).withSelection((new StringBuilder()).append("cityId='").append(((String) (obj))).append("'").toString(), null).build());
            ((ArrayList) (obj1)).add(ContentProviderOperation.newDelete(WeatherContentProvider.e).withSelection((new StringBuilder()).append("cityId='").append(((String) (obj))).append("'").toString(), null).build());
            ((ArrayList) (obj1)).add(ContentProviderOperation.newDelete(WeatherContentProvider.k).withSelection((new StringBuilder()).append("cityId='").append(((String) (obj))).append("'").toString(), null).build());
            if (d.o != 1)
            {
                a(((ArrayList) (obj1)), (WeatherBean)arraylist1.get(0));
            }
            if (weatherbean.o() > 0)
            {
                e.a(weatherbean, arraylist);
            }
            com.gau.go.launcherex.gowidget.gcm.b.a(b).a(weatherbean.c());
            flag = true;
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
          goto _L6
_L8:
        if (k1 == 3)
        {
            weatherbean.a(1);
            obj = new ContentValues();
            ((ContentValues) (obj)).put("city_my_location", Integer.valueOf(1));
            ((ArrayList) (obj1)).add(ContentProviderOperation.newUpdate(WeatherContentProvider.a).withValues(((ContentValues) (obj))).withSelection("cityId=?", new String[] {
                weatherbean.c()
            }).build());
            if (d.o == 2)
            {
                if (j1 > 1)
                {
                    obj = (WeatherBean)e.d().get(0);
                    if (weatherbean.q() > ((WeatherBean) (obj)).q())
                    {
                        a(((ArrayList) (obj1)), ((WeatherBean) (obj)));
                    } else
                    {
                        c(((ArrayList) (obj1)));
                    }
                    obj = null;
                    flag = false;
                    flag1 = false;
                    continue; /* Loop/switch isn't completed */
                }
                if (j1 == 1)
                {
                    c(((ArrayList) (obj1)));
                }
            }
            obj = null;
            flag = false;
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
          goto _L6
_L4:
        ((ArrayList) (obj1)).add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withSelection("setting_key='auto_location'", null).withValue("setting_value", Integer.valueOf(1)).build());
_L6:
        flag = false;
        flag1 = false;
        obj = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public void b(String s1)
    {
        if (!s1.equals(d.F))
        {
            d.F = s1;
        }
    }

    public void b(ArrayList arraylist)
    {
        c.a(2, arraylist, WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "key_live_wallpaper_city_id"
        }, "_id");
    }

    public void c()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", 1);
        intent.putExtra("notify_on_or_off", d.m);
        b.startService(intent);
    }

    public void c(int i1)
    {
        if (i1 != d.q)
        {
            d.q = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT");
            intent.putExtra("wind_unit", d.q);
            b.sendBroadcast(intent);
        }
    }

    public void d()
    {
        WeatherBean weatherbean = (WeatherBean)e.d().get(0);
        if (weatherbean != null)
        {
            String s1 = weatherbean.c();
            int i1;
            if (weatherbean.e() == 1)
            {
                i1 = 1;
            } else
            {
                i1 = 2;
            }
            a(s1, i1);
        }
    }

    public void d(int i1)
    {
        if (i1 != d.A)
        {
            d.A = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_VISIBILITY_UNIT");
            intent.putExtra("visibility_unit", d.A);
            b.sendBroadcast(intent);
        }
    }

    public void e(int i1)
    {
        if (i1 != d.B)
        {
            d.B = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PRESSURE_UNIT");
            intent.putExtra("pressure_unit", d.B);
            b.sendBroadcast(intent);
        }
    }

    public boolean e()
    {
        return d.b == 1;
    }

    public void f(int i1)
    {
        boolean flag = true;
        if (i1 != d.r)
        {
            d.r = i1;
            Object obj = com.gau.go.launcherex.gowidget.weather.c.c.a(b).g();
            if (d.r != 1)
            {
                flag = false;
            }
            ((g) (obj)).a(flag);
            obj = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK");
            ((Intent) (obj)).putExtra("extra_world_clock", d.r);
            b.sendBroadcast(((Intent) (obj)));
        }
    }

    public boolean f()
    {
        return d.m == 1;
    }

    public void g(int i1)
    {
        if (i1 != d.k)
        {
            d.k = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATESTYLE_UNIT");
            intent.putExtra("datestyle_unit", d.k);
            b.sendBroadcast(intent);
        }
    }

    public boolean g()
    {
        return d.c == 1;
    }

    public void h(int i1)
    {
        if (i1 != d.a)
        {
            d.a = i1;
            h();
        }
    }

    public void i(int i1)
    {
        if (i1 != d.e)
        {
            d.e = i1;
            h();
        }
    }

    public void j(int i1)
    {
        if (i1 != d.i)
        {
            d.i = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FESTIVAL");
            if (d.i == 1)
            {
                intent.putExtra("festival", 1);
            } else
            if (d.i == 2)
            {
                intent.putExtra("festival", 2);
            } else
            if (d.i == 3)
            {
                intent.putExtra("festival", 3);
            } else
            {
                intent.putExtra("festival", 0);
            }
            b.sendBroadcast(intent);
        }
    }

    public void k(int i1)
    {
        if (d.h != i1)
        {
            d.h = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LUNAR");
            intent.putExtra("lunar", d.h);
            b.sendBroadcast(intent);
        }
    }

    public void l(int i1)
    {
        if (d.j != i1)
        {
            d.j = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_CYCLE_MODE");
            intent.putExtra("cycle", d.j);
            b.sendBroadcast(intent);
        }
    }

    public void m(int i1)
    {
        if (d.E != i1)
        {
            d.E = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_GOWIDGET_DYNAMIC_ICON_CHANGE");
            intent.putExtra("extra_is_on", d.E);
            b.sendBroadcast(intent);
        }
    }

    public void n(int i1)
    {
        if (d.L != i1)
        {
            d.L = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_THEME_SWITCHER_CHANGE");
            intent.putExtra("extra_theme_switcher", i1);
            b.sendBroadcast(intent);
        }
    }

    public void o(int i1)
    {
        if (i1 != d.s)
        {
            d.s = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
            intent.putExtra("notify_request", 4);
            b.startService(intent);
        }
    }

    public void p(int i1)
    {
        if (i1 != d.t)
        {
            d.t = i1;
        }
    }

    public void q(int i1)
    {
        if (i1 != d.u)
        {
            d.u = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
            intent.putExtra("notify_request", 4);
            b.startService(intent);
        }
    }

    public void r(int i1)
    {
        if (i1 != d.v)
        {
            d.v = i1;
        }
    }

    public void s(int i1)
    {
        if (i1 != d.w)
        {
            d.w = i1;
        }
    }

    public void t(int i1)
    {
        if (i1 != d.c)
        {
            d.c = i1;
        }
    }

    public void u(int i1)
    {
        if (i1 != d.l)
        {
            d.l = i1;
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_DYNAMIC_BG");
            b.sendBroadcast(intent);
        }
    }
}
