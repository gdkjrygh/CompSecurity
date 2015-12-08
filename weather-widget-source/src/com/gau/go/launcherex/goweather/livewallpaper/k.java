// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.text.TextUtils;
import android.text.format.Time;
import com.gau.go.launcherex.goweather.livewallpaper.a.a;
import com.gau.go.launcherex.goweather.livewallpaper.a.c;
import com.gau.go.launcherex.goweather.livewallpaper.a.e;
import com.gau.go.launcherex.goweather.livewallpaper.b.b;
import com.gau.go.launcherex.goweather.livewallpaper.b.d;
import com.gau.go.launcherex.gowidget.language.j;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.r;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            o, l, n, m

public class k
    implements j
{

    private com.jiubang.core.c.j a;
    private com.gau.go.launcherex.goweather.livewallpaper.a.g b;
    private c c;
    private e d;
    private BroadcastReceiver e;
    private n f;
    private f g;
    private g h;
    private com.gau.go.launcherex.gowidget.language.e i;
    private com.gau.go.launcherex.goweather.livewallpaper.b.g j;
    private com.gau.go.launcherex.goweather.livewallpaper.b.f k;
    private d l;
    private b m;
    private String n;
    private int o;
    private final int p = 1;
    private BroadcastReceiver q;
    private Context r;
    private boolean s;

    public k(Context context, com.gau.go.launcherex.goweather.livewallpaper.b.g g1, com.gau.go.launcherex.goweather.livewallpaper.b.f f1, d d1, b b1)
    {
        o = 0;
        r = context;
        j = g1;
        k = f1;
        l = d1;
        m = b1;
        d = new e();
        c = new c();
        a = new o(this, context.getContentResolver());
        h = new g(context);
        g = com.gau.go.launcherex.gowidget.weather.d.f.a(context);
        i = com.gau.go.launcherex.gowidget.language.e.a(context);
        s = false;
    }

    static int a(k k1, int i1)
    {
        k1.o = i1;
        return i1;
    }

    private void a(int i1)
    {
        a.a(i1, null, WeatherContentProvider.a, new String[] {
            "cityId", "cityName", "type", "nowTempValue", "nowDesp", "highTempValue", "lowTempValue", "windDirection", "windStrengthValue", "sunrise", 
            "sunset", "tz_offset"
        }, null, null, "sequence");
    }

    private void a(int i1, String s1)
    {
        com.jiubang.core.c.j j1 = a;
        android.net.Uri uri = WeatherContentProvider.a;
        s1 = (new StringBuilder()).append("cityId = '").append(s1).append("'").toString();
        j1.a(i1, null, uri, new String[] {
            "cityName", "type", "nowTempValue", "nowDesp", "highTempValue", "lowTempValue", "windDirection", "windStrengthValue", "sunrise", "sunset", 
            "tz_offset"
        }, s1, null, null);
    }

    private void a(int i1, String as[])
    {
        int j1 = 0;
        String s1 = "setting_key in ('";
        int k1;
        for (k1 = as.length - 1; j1 < k1; j1++)
        {
            s1 = (new StringBuilder()).append(s1).append(as[j1]).append("', '").toString();
        }

        as = (new StringBuilder()).append(s1).append(as[k1]).append("')").toString();
        a.a(i1, null, WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, as, null, null);
    }

    private void a(Cursor cursor, String s1)
    {
        if (cursor != null && cursor.moveToFirst())
        {
            cursor = cursor.getString(cursor.getColumnIndex("setting_value"));
            if (cursor.equals(s1))
            {
                c.a(cursor);
                k.a(cursor);
                d(cursor);
            }
        }
    }

    static void a(k k1, int i1, String s1)
    {
        k1.a(i1, s1);
    }

    static void a(k k1, Cursor cursor)
    {
        k1.c(cursor);
    }

    static void a(k k1, Cursor cursor, String s1)
    {
        k1.a(cursor, s1);
    }

    static void a(k k1, String s1)
    {
        k1.c(s1);
    }

    static void a(k k1, boolean flag)
    {
        k1.a(flag);
    }

    private void a(boolean flag)
    {
        if (d != null)
        {
            Time time;
            if (h.d())
            {
                time = h.b(d.l());
            } else
            {
                time = h.c();
            }
            if (d.i() != 1 && (time.hour == d.n() && time.minute == d.o() || time.hour == d.m() && time.minute == d.p() || flag))
            {
                k.a(d.i(), c.d(), b());
            }
        }
    }

    static boolean a(k k1)
    {
        return k1.s;
    }

    private int b(Cursor cursor)
    {
        int i1;
        boolean flag;
        i1 = 0;
        flag = true;
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        int k1;
        k1 = cursor.getColumnCount();
        obj = cursor.getColumnNames();
        cursor.moveToFirst();
_L29:
        int j1 = ((flag) ? 1 : 0);
        if (i1 >= k1) goto _L4; else goto _L3
_L3:
        if (!obj[i1].equals("cityId")) goto _L6; else goto _L5
_L5:
        d.b(cursor.getString(i1));
          goto _L7
_L6:
        if (!obj[i1].equals("cityName")) goto _L9; else goto _L8
_L8:
        d.c(cursor.getString(i1));
          goto _L7
        obj;
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        return -1;
_L9:
        if (!obj[i1].equals("type")) goto _L11; else goto _L10
_L10:
        d.d(cursor.getInt(i1));
          goto _L7
        obj;
        cursor.close();
        throw obj;
_L11:
        if (!obj[i1].equals("nowTempValue")) goto _L13; else goto _L12
_L12:
        d.a(cursor.getFloat(i1));
          goto _L7
_L13:
        if (!obj[i1].equals("nowDesp")) goto _L15; else goto _L14
_L14:
        d.d(cursor.getString(i1));
          goto _L7
_L15:
        if (!obj[i1].equals("highTempValue")) goto _L17; else goto _L16
_L16:
        d.d(cursor.getFloat(i1));
          goto _L7
_L17:
        if (!obj[i1].equals("lowTempValue")) goto _L19; else goto _L18
_L18:
        d.b(cursor.getFloat(i1));
          goto _L7
_L19:
        if (!obj[i1].equals("windDirection")) goto _L21; else goto _L20
_L20:
        d.e(cursor.getString(i1));
          goto _L7
_L21:
        if (!obj[i1].equals("windStrengthValue")) goto _L23; else goto _L22
_L22:
        d.e(cursor.getFloat(i1));
          goto _L7
_L23:
        if (!obj[i1].equals("sunrise")) goto _L25; else goto _L24
_L24:
        d.f(cursor.getString(i1));
          goto _L7
_L25:
        if (!obj[i1].equals("sunset")) goto _L27; else goto _L26
_L26:
        d.g(cursor.getString(i1));
          goto _L7
_L27:
        if (obj[i1].equals("tz_offset"))
        {
            d.e(cursor.getInt(i1));
        }
          goto _L7
_L2:
        j1 = 0;
_L4:
        cursor.close();
        return j1;
_L7:
        i1++;
        if (true) goto _L29; else goto _L28
_L28:
    }

    static g b(k k1)
    {
        return k1.h;
    }

    private void b(int i1, String s1)
    {
        com.jiubang.core.c.j j1 = a;
        android.net.Uri uri = WeatherContentProvider.g;
        s1 = (new StringBuilder()).append("setting_key = '").append(s1).append("'").toString();
        j1.a(i1, null, uri, new String[] {
            "setting_key", "setting_value"
        }, s1, null, null);
    }

    static void b(k k1, int i1, String s1)
    {
        k1.b(i1, s1);
    }

    static void b(k k1, Cursor cursor)
    {
        k1.f(cursor);
    }

    private void b(String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", s1);
        a.a(0, null, WeatherContentProvider.g, contentvalues, "setting_key = 'key_live_wallpaper_city_id'", null);
    }

    static e c(k k1)
    {
        return k1.d;
    }

    private void c(Cursor cursor)
    {
        int i1 = b(cursor);
        if (i1 == 1)
        {
            d.q();
            j.a(d, b, c, b(), i.a());
            k.a(c.d(), c.e());
        } else
        if (i1 == 0)
        {
            a(4);
            return;
        }
    }

    private void c(String s1)
    {
        a.a(12, s1, WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "app_theme"
        }, null);
    }

    static boolean c(k k1, Cursor cursor)
    {
        return k1.d(cursor);
    }

    static c d(k k1)
    {
        return k1.c;
    }

    static void d(k k1, Cursor cursor)
    {
        k1.e(cursor);
    }

    private void d(String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", s1);
        a.a(-1, null, WeatherContentProvider.g, contentvalues, "setting_key=?", new String[] {
            "key_live_wallpaper_theme"
        });
    }

    private boolean d(Cursor cursor)
    {
        boolean flag = false;
        if (b(cursor) == 1)
        {
            d.q();
            j.b(d, b, c, b(), i.a());
            flag = true;
        }
        return flag;
    }

    static d e(k k1)
    {
        return k1.l;
    }

    private void e(Cursor cursor)
    {
        int i1 = b(cursor);
        if (i1 == 1)
        {
            d.q();
            j.a(d, b, c, b(), i.a());
            k.a(c.d(), c.e());
            b(d.b());
        } else
        if (i1 == 0)
        {
            j.a(d, b, c, b(), i.a());
            k.a(c.d(), c.e());
            return;
        }
    }

    static void e(k k1, Cursor cursor)
    {
        k1.g(cursor);
    }

    static Context f(k k1)
    {
        return k1.r;
    }

    private void f(Cursor cursor)
    {
        boolean flag = true;
        Object obj;
        int i1;
        int j1;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_543;
        }
        c = new c();
        b = new com.gau.go.launcherex.goweather.livewallpaper.a.g();
        obj = c.a();
        cursor.moveToFirst();
        i1 = cursor.getColumnIndex("setting_key");
        j1 = cursor.getColumnIndex("setting_value");
_L4:
        String s1 = cursor.getString(i1);
        if (!s1.equals("key_live_wallpaper_city_id")) goto _L2; else goto _L1
_L1:
        d.b(cursor.getString(j1));
_L5:
        boolean flag1 = cursor.moveToNext();
        if (flag1) goto _L4; else goto _L3
_L3:
        cursor.close();
_L6:
        if (flag)
        {
            i();
            j();
            a(2, d.b());
        }
        return;
_L2:
        if (!s1.equals("key_live_wallpaper_city_flag"))
        {
            break MISSING_BLOCK_LABEL_193;
        }
        d.f(cursor.getInt(j1));
          goto _L5
        obj;
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        flag = false;
          goto _L6
        if (!s1.equals("key_live_wallpaper_dynamic_effect_on"))
        {
            break MISSING_BLOCK_LABEL_230;
        }
        c.e(cursor.getInt(j1));
          goto _L5
        obj;
        cursor.close();
        throw obj;
label0:
        {
            if (!s1.equals("key_live_wallpaper_theme"))
            {
                break label0;
            }
            c.a(cursor.getString(j1));
        }
          goto _L5
label1:
        {
            if (!s1.equals("key_live_wallpaper_show_weather_info_on"))
            {
                break label1;
            }
            c.d(cursor.getInt(j1));
        }
          goto _L5
label2:
        {
            if (!s1.equals("key_live_wallpaper_weather_info_description_on"))
            {
                break label2;
            }
            ((a) (obj)).a(cursor.getInt(j1));
        }
          goto _L5
label3:
        {
            if (!s1.equals("key_live_wallpaper_weather_info_hight_low_temperature_on"))
            {
                break label3;
            }
            ((a) (obj)).b(cursor.getInt(j1));
        }
          goto _L5
label4:
        {
            if (!s1.equals("key_live_wallpaper_weather_info_wind_on"))
            {
                break label4;
            }
            ((a) (obj)).c(cursor.getInt(j1));
        }
          goto _L5
label5:
        {
            if (!s1.equals("key_live_wallpaper_weather_info_font_size"))
            {
                break label5;
            }
            c.b(cursor.getInt(j1));
        }
          goto _L5
label6:
        {
            if (!s1.equals("key_live_wallpaper_weather_info_position"))
            {
                break label6;
            }
            c.a(cursor.getInt(j1));
        }
          goto _L5
label7:
        {
            if (!s1.equals("key_live_wallpaper_weather_info_show_moment"))
            {
                break label7;
            }
            c.c(cursor.getInt(j1));
        }
          goto _L5
label8:
        {
            if (!s1.equals("world_clock"))
            {
                break label8;
            }
            b.a(cursor.getInt(j1));
            h.a(b.a());
        }
          goto _L5
        if (!s1.equals("tempUnit")) goto _L8; else goto _L7
_L7:
        b.c(cursor.getInt(j1));
          goto _L5
_L8:
        if (!s1.equals("windUnit")) goto _L5; else goto _L9
_L9:
        b.e(cursor.getInt(j1));
          goto _L5
        flag = false;
          goto _L3
    }

    static void f(k k1, Cursor cursor)
    {
        k1.h(cursor);
    }

    private void g()
    {
        if (!TextUtils.isEmpty(n) && o == 1)
        {
            String s1 = c.e();
            if (!n.equals(s1))
            {
                k.a(s1);
            }
            n = "";
            o = 0;
        }
    }

    private void g(Cursor cursor)
    {
        boolean flag;
        int i1;
        boolean flag1;
        byte byte0;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = false;
        byte0 = 2;
        i1 = byte0;
        flag1 = flag2;
        flag = flag3;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag = flag3;
        cursor.moveToFirst();
        flag = flag3;
        int k1 = cursor.getColumnIndex("setting_key");
        flag = flag3;
        int j1 = cursor.getColumnIndex("setting_value");
        i1 = byte0;
        flag1 = flag2;
        flag = flag3;
        if (!cursor.getString(k1).equals("tempUnit"))
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag = true;
        flag1 = true;
        i1 = cursor.getInt(j1);
        cursor.close();
_L2:
        if (flag1 && b.d(i1))
        {
            j.a(d, b, i.a());
        }
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        i1 = byte0;
        flag1 = flag;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        cursor.close();
        throw obj;
    }

    static void g(k k1)
    {
        k1.k();
    }

    static void g(k k1, Cursor cursor)
    {
        k1.i(cursor);
    }

    static com.gau.go.launcherex.gowidget.language.e h(k k1)
    {
        return k1.i;
    }

    private void h()
    {
        int i1 = 0;
        String as[] = new String[13];
        as[0] = "key_live_wallpaper_city_id";
        as[1] = "key_live_wallpaper_dynamic_effect_on";
        as[2] = "key_live_wallpaper_theme";
        as[3] = "key_live_wallpaper_show_weather_info_on";
        as[4] = "key_live_wallpaper_weather_info_description_on";
        as[5] = "key_live_wallpaper_weather_info_wind_on";
        as[6] = "key_live_wallpaper_weather_info_hight_low_temperature_on";
        as[7] = "key_live_wallpaper_weather_info_font_size";
        as[8] = "key_live_wallpaper_weather_info_position";
        as[9] = "key_live_wallpaper_weather_info_show_moment";
        as[10] = "world_clock";
        as[11] = "tempUnit";
        as[12] = "windUnit";
        String s1 = "setting_key in ('";
        int j1;
        for (j1 = as.length - 1; i1 < j1; i1++)
        {
            s1 = (new StringBuilder()).append(s1).append(as[i1]).append("', '").toString();
        }

        s1 = (new StringBuilder()).append(s1).append(as[j1]).append("')").toString();
        a.a(1, null, WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, s1, null, null);
    }

    private void h(Cursor cursor)
    {
        boolean flag;
        int i1;
        boolean flag1;
        byte byte0;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = false;
        byte0 = 2;
        i1 = byte0;
        flag1 = flag2;
        flag = flag3;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag = flag3;
        cursor.moveToFirst();
        flag = flag3;
        int k1 = cursor.getColumnIndex("setting_key");
        flag = flag3;
        int j1 = cursor.getColumnIndex("setting_value");
        i1 = byte0;
        flag1 = flag2;
        flag = flag3;
        if (!cursor.getString(k1).equals("windUnit"))
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag = true;
        flag1 = true;
        i1 = cursor.getInt(j1);
        cursor.close();
_L2:
        if (flag1 && b.f(i1))
        {
            j.b(d, b, i.a());
        }
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        i1 = byte0;
        flag1 = flag;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        cursor.close();
        throw obj;
    }

    static void h(k k1, Cursor cursor)
    {
        k1.k(cursor);
    }

    static com.gau.go.launcherex.goweather.livewallpaper.a.g i(k k1)
    {
        return k1.b;
    }

    private void i()
    {
        e = new l(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.USER_PRESENT");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        intentfilter.addAction("android.intent.action.TIME_TICK");
        intentfilter.addAction("android.intent.action.TIME_SET");
        intentfilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_SETTINGS_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_THEME_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED");
        intentfilter.addAction("android.intent.action.LOCALE_CHANGED");
        r.registerReceiver(e, intentfilter);
        f = new n(this, null);
        intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentfilter.addDataScheme("package");
        r.registerReceiver(f, intentfilter);
    }

    private void i(Cursor cursor)
    {
        int i1;
        boolean flag1;
        flag1 = false;
        i1 = 0;
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int k1;
        boolean flag2;
        cursor.moveToFirst();
        int j1 = cursor.getColumnIndex("setting_key");
        k1 = cursor.getColumnIndex("setting_value");
        flag2 = cursor.getString(j1).equals("world_clock");
        if (!flag2) goto _L2; else goto _L3
_L3:
        boolean flag = true;
        i1 = cursor.getInt(k1);
_L7:
        cursor.close();
_L4:
        if (flag && b.b(i1))
        {
            k.a(d.i(), c.d(), b());
        }
        return;
        Object obj;
        obj;
        i1 = 0;
_L5:
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        flag = i1;
        i1 = ((flag1) ? 1 : 0);
          goto _L4
        obj;
        cursor.close();
        throw obj;
        obj;
        i1 = 1;
          goto _L5
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void i(k k1, Cursor cursor)
    {
        k1.l(cursor);
    }

    static b j(k k1)
    {
        return k1.m;
    }

    private void j()
    {
        q = new m(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentfilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentfilter.addDataScheme("file");
        r.registerReceiver(q, intentfilter);
    }

    private void j(Cursor cursor)
    {
        boolean flag2 = false;
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        a a1;
        int i1;
        int j1;
        a1 = c.a();
        cursor.moveToFirst();
        i1 = cursor.getColumnIndex("setting_key");
        j1 = cursor.getColumnIndex("setting_value");
        boolean flag1;
        flag2 = false;
        flag1 = false;
_L12:
        String s1 = cursor.getString(i1);
        if (!s1.equals("key_live_wallpaper_city_id")) goto _L4; else goto _L3
_L3:
        boolean flag3 = d.a(cursor.getString(j1));
        flag1 = flag2;
        flag2 = flag3;
_L7:
        flag3 = cursor.moveToNext();
        if (flag3) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        cursor.close();
        flag3 = flag1;
        flag1 = flag2;
_L9:
        Object obj;
        if (flag)
        {
            if (flag1)
            {
                a(10, d.b());
            } else
            {
                j.a(d, b, c, b(), i.a());
                if (flag3)
                {
                    k.a(d.i(), c.d(), b());
                    return;
                }
            }
        }
        return;
_L4:
        if (!s1.equals("key_live_wallpaper_city_flag"))
        {
            break MISSING_BLOCK_LABEL_191;
        }
        d.f(cursor.getInt(j1));
        flag3 = flag1;
        flag1 = flag2;
        flag2 = flag3;
          goto _L7
        if (!s1.equals("key_live_wallpaper_dynamic_effect_on"))
        {
            break MISSING_BLOCK_LABEL_229;
        }
        flag3 = c.f(cursor.getInt(j1));
        flag2 = flag1;
        flag1 = flag3;
          goto _L7
        if (!s1.equals("key_live_wallpaper_theme"))
        {
            break MISSING_BLOCK_LABEL_269;
        }
        c.a(cursor.getString(j1));
        flag3 = flag1;
        flag1 = flag2;
        flag2 = flag3;
          goto _L7
        if (!s1.equals("key_live_wallpaper_show_weather_info_on"))
        {
            break MISSING_BLOCK_LABEL_309;
        }
        c.d(cursor.getInt(j1));
        flag3 = flag1;
        flag1 = flag2;
        flag2 = flag3;
          goto _L7
        if (!s1.equals("key_live_wallpaper_weather_info_description_on"))
        {
            break MISSING_BLOCK_LABEL_346;
        }
        a1.a(cursor.getInt(j1));
        flag3 = flag1;
        flag1 = flag2;
        flag2 = flag3;
          goto _L7
        if (!s1.equals("key_live_wallpaper_weather_info_hight_low_temperature_on"))
        {
            break MISSING_BLOCK_LABEL_383;
        }
        a1.b(cursor.getInt(j1));
        flag3 = flag1;
        flag1 = flag2;
        flag2 = flag3;
          goto _L7
        if (!s1.equals("key_live_wallpaper_weather_info_wind_on"))
        {
            break MISSING_BLOCK_LABEL_420;
        }
        a1.c(cursor.getInt(j1));
        flag3 = flag1;
        flag1 = flag2;
        flag2 = flag3;
          goto _L7
        if (!s1.equals("key_live_wallpaper_weather_info_font_size"))
        {
            break MISSING_BLOCK_LABEL_460;
        }
        c.b(cursor.getInt(j1));
        flag3 = flag1;
        flag1 = flag2;
        flag2 = flag3;
          goto _L7
        if (!s1.equals("key_live_wallpaper_weather_info_position"))
        {
            break MISSING_BLOCK_LABEL_500;
        }
        c.a(cursor.getInt(j1));
        flag3 = flag1;
        flag1 = flag2;
        flag2 = flag3;
          goto _L7
        if (s1.equals("key_live_wallpaper_weather_info_show_moment"))
        {
            c.c(cursor.getInt(j1));
        }
        flag3 = flag1;
        flag1 = flag2;
        flag2 = flag3;
          goto _L7
_L2:
        flag1 = false;
        flag = false;
          goto _L8
        obj;
        flag2 = false;
        flag1 = false;
_L10:
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        flag = false;
        flag3 = flag2;
          goto _L9
        obj;
        cursor.close();
        throw obj;
        obj;
          goto _L10
        obj;
        boolean flag4 = flag2;
        flag2 = flag1;
        flag1 = flag4;
          goto _L10
_L6:
        boolean flag5 = flag2;
        flag2 = flag1;
        flag1 = flag5;
        if (true) goto _L12; else goto _L11
_L11:
    }

    static void j(k k1, Cursor cursor)
    {
        k1.j(cursor);
    }

    private void k()
    {
        a(9, new String[] {
            "key_live_wallpaper_city_flag", "key_live_wallpaper_city_id", "key_live_wallpaper_dynamic_effect_on", "key_live_wallpaper_theme", "key_live_wallpaper_show_weather_info_on", "key_live_wallpaper_weather_info_description_on", "key_live_wallpaper_weather_info_wind_on", "key_live_wallpaper_weather_info_hight_low_temperature_on", "key_live_wallpaper_weather_info_font_size", "key_live_wallpaper_weather_info_position", 
            "key_live_wallpaper_weather_info_show_moment"
        });
    }

    private void k(Cursor cursor)
    {
        Object obj;
        Object obj2;
        Object obj3;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = false;
        obj2 = null;
        obj3 = null;
        obj = obj3;
        flag1 = flag2;
        flag = flag3;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        flag = flag3;
        cursor.moveToFirst();
        flag = flag3;
        int j1 = cursor.getColumnIndex("setting_key");
        flag = flag3;
        int i1 = cursor.getColumnIndex("setting_value");
        obj = obj3;
        flag1 = flag2;
        flag = flag3;
        if (!cursor.getString(j1).equals("key_live_wallpaper_theme"))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        flag = true;
        flag1 = true;
        obj = cursor.getString(i1);
        cursor.close();
_L2:
        if (flag1)
        {
            c.a(((String) (obj)));
            k.a(((String) (obj)));
        }
        return;
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        cursor.close();
        obj1 = obj2;
        flag1 = flag;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        cursor.close();
        throw obj1;
    }

    static void k(k k1)
    {
        k1.g();
    }

    static void k(k k1, Cursor cursor)
    {
        k1.m(cursor);
    }

    static com.gau.go.launcherex.goweather.livewallpaper.b.f l(k k1)
    {
        return k1.k;
    }

    private void l(Cursor cursor)
    {
        if (d(cursor))
        {
            b(d.b());
        }
    }

    private void m(Cursor cursor)
    {
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        if (cursor.getCount() > 0)
        {
            cursor.moveToFirst();
            int i1 = cursor.getColumnIndex("setting_key");
            int j1 = cursor.getColumnIndex("setting_value");
            if (cursor.getString(i1).equals("auto_location") && cursor.getInt(j1) == 0)
            {
                k();
            }
        }
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

    public void a()
    {
        h();
    }

    public void a(Cursor cursor)
    {
        if (b(cursor) == 1)
        {
            d.q();
            j.a(d, b, c, b(), i.a());
            k.a(d.i(), c.d(), b());
        }
    }

    public void a(String s1)
    {
        n = s1;
        g();
    }

    public boolean b()
    {
        if (!d.c())
        {
            String s1 = d.j();
            String s2 = d.k();
            if (g.b() && h.d())
            {
                int i1 = d.l();
                return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2, h.b(i1));
            } else
            {
                return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2);
            }
        } else
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a("06:00", "18:00");
        }
    }

    public c c()
    {
        return c;
    }

    public e d()
    {
        return d;
    }

    public void e()
    {
        m.c(d, b, i.a());
    }

    public void f()
    {
        s = true;
        if (e != null)
        {
            r.unregisterReceiver(e);
            e = null;
        }
        if (f != null)
        {
            r.unregisterReceiver(f);
            f = null;
        }
        if (q != null)
        {
            r.unregisterReceiver(q);
            q = null;
        }
        if (g != null)
        {
            g.i();
        }
        if (i != null)
        {
            com.gau.go.launcherex.gowidget.language.e.f();
        }
        if (h != null)
        {
            h.b();
        }
    }
}
