// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.provider;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Environment;
import android.text.TextUtils;
import android.text.format.Time;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.e.c;
import com.gau.go.launcherex.gowidget.weather.e.d;
import com.gau.go.launcherex.gowidget.weather.e.e;
import com.gau.go.launcherex.gowidget.weather.e.i;
import com.gau.go.launcherex.gowidget.weather.e.k;
import com.gau.go.launcherex.gowidget.weather.e.l;
import com.gau.go.launcherex.gowidget.weather.e.m;
import com.gau.go.launcherex.gowidget.weather.e.n;
import com.gau.go.launcherex.gowidget.weather.e.s;
import com.gau.go.launcherex.gowidget.weather.e.t;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a.a.b;
import com.gau.go.launcherex.gowidget.weather.model.v;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget21Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget42Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays42Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetWorldClock42Provider;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a extends SQLiteOpenHelper
{

    private static a a;
    private Context b;
    private SQLiteQueryBuilder c;
    private boolean d;

    private a(Context context, String s1, int i1)
    {
        super(context, s1, null, i1);
        b = null;
        d = false;
        b = context;
        c = new SQLiteQueryBuilder();
    }

    private void A(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(c.k);
        sqlitedatabase = b.getSharedPreferences("goweatherex_info", 0);
        android.content.SharedPreferences.Editor editor = sqlitedatabase.edit();
        String s1 = sqlitedatabase.getString("key_new_language", "");
        sqlitedatabase = s1;
        if (!s1.equals(""))
        {
            sqlitedatabase = (new StringBuilder()).append(s1).append("#").toString();
        }
        editor.putString("key_new_language", (new StringBuilder()).append(sqlitedatabase).append("com.gau.go.weatherex.language.hu#com.gau.go.weatherex.language.pt#com.gau.go.weatherex.language.ro#com.gau.go.weatherex.language.nl").toString());
        editor.putBoolean("weather_share", true);
        editor.putBoolean("setting", true);
        editor.putBoolean("setting_language", true);
        editor.commit();
    }

    private void B(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change_high', '9')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change_low', '9')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change_type', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('plugin_camera_data_timestamp', '0')");
        sqlitedatabase = b.getSharedPreferences("goweatherex_info", 0).edit();
        sqlitedatabase.putBoolean("key_new_feature_temp_change", true);
        sqlitedatabase.putBoolean("setting", true);
        sqlitedatabase.putInt("current_versioncode", 0);
        sqlitedatabase.commit();
    }

    private void C(SQLiteDatabase sqlitedatabase)
    {
        if (!a(sqlitedatabase, "messagecenter"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS messagecenter (mesageid text, title text, readed numeric, viewtype numeric, type text, date text, url text, stime_start text,stime_end text,icon text,intro text,acttype numeric,actvalue text,zicon1 text,zicon2 text,zpos numeric,ztime numeric,isclosed numeric,filter_pkgs text,clickclosed numeric,dynamic numeric,iconpos numeric,fullscreenicon text,removed numeric, packagename text, mapid text, whitelist text, isdeleted numeric,PRIMARY KEY (mesageid))");
        }
        D(sqlitedatabase);
        E(sqlitedatabase);
    }

    private void D(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        Object obj;
        obj = new ArrayList();
        cursor = sqlitedatabase.query("msg_center", null, null, null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.getCount() > 0)
        {
            cursor.moveToFirst();
            do
            {
                ContentValues contentvalues = new ContentValues();
                c(cursor, contentvalues);
                ((ArrayList) (obj)).add(contentvalues);
            } while (cursor.moveToNext());
        }
        obj = ((ArrayList) (obj)).iterator();
_L4:
        ContentValues contentvalues1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_194;
        }
        contentvalues1 = (ContentValues)((Iterator) (obj)).next();
        if (sqlitedatabase.update("messagecenter", contentvalues1, (new StringBuilder()).append("mesageid='").append(contentvalues1.getAsString("mesageid")).append("'").toString(), null) != 0) goto _L4; else goto _L3
_L3:
        sqlitedatabase.insert("messagecenter", null, contentvalues1);
          goto _L4
        Object obj1;
        obj1;
        ((SQLException) (obj1)).printStackTrace();
          goto _L4
        sqlitedatabase;
        sqlitedatabase.printStackTrace();
_L5:
        cursor.close();
_L2:
        return;
        obj1;
        ((Exception) (obj1)).printStackTrace();
          goto _L4
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
        sqlitedatabase.delete("msg_center", null, null);
          goto _L5
    }

    private void E(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        Object obj1;
        ContentValues contentvalues;
        Object obj3;
        Cursor cursor;
        contentvalues = null;
        obj3 = null;
        obj1 = null;
        cursor = sqlitedatabase.query("weather11_city", null, null, null, null, null, null);
        obj = obj1;
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int i1 = cursor.getCount();
        obj = obj1;
        if (i1 <= 0) goto _L2; else goto _L3
_L3:
        HashMap hashmap;
        hashmap = new HashMap(i1);
        cursor.moveToFirst();
        obj1 = null;
        obj = null;
_L5:
        int j1 = cursor.getColumnCount();
        i1 = 0;
_L10:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        Object obj2;
        String s1;
        s1 = cursor.getColumnName(i1);
        if ("widgetId".equals(s1))
        {
            obj2 = cursor.getString(i1);
            break MISSING_BLOCK_LABEL_391;
        }
        obj2 = obj;
        if (!"cityId".equals(s1))
        {
            break MISSING_BLOCK_LABEL_391;
        }
        obj1 = cursor.getString(i1);
        obj2 = obj;
        break MISSING_BLOCK_LABEL_391;
        boolean flag;
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            hashmap.put(obj, obj1);
        }
        flag = cursor.moveToNext();
        if (flag) goto _L5; else goto _L4
_L4:
        obj = hashmap;
_L2:
        obj1 = obj;
        if (cursor == null) goto _L7; else goto _L6
_L6:
        cursor.close();
        obj1 = obj;
_L7:
        if (obj1 != null && ((HashMap) (obj1)).size() > 0)
        {
            obj = ((HashMap) (obj1)).entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
                obj1 = (String)((java.util.Map.Entry) (obj2)).getKey();
                obj2 = (String)((java.util.Map.Entry) (obj2)).getValue();
                try
                {
                    contentvalues = new ContentValues();
                    contentvalues.put("go_widget_id", ((String) (obj1)));
                    contentvalues.put("city_id", ((String) (obj2)));
                    contentvalues.put("go_widget_type", Integer.valueOf(2));
                    if (sqlitedatabase.update("go_widget_binding_city_table", contentvalues, "go_widget_id=?", new String[] {
    obj1
}) < 1)
                    {
                        sqlitedatabase.insert("go_widget_binding_city_table", null, contentvalues);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    ((SQLException) (obj1)).printStackTrace();
                }
            } while (true);
        }
        break; /* Loop/switch isn't completed */
        obj;
        ((Exception) (obj)).printStackTrace();
        obj1 = obj3;
        if (cursor == null) goto _L7; else goto _L8
_L8:
        obj = contentvalues;
        if (true) goto _L6; else goto _L9
        sqlitedatabase;
        if (cursor != null)
        {
            cursor.close();
        }
        throw sqlitedatabase;
_L9:
        return;
        i1++;
        obj = obj2;
          goto _L10
    }

    private void F(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS featured_theme_table (_id INTEGER PRIMARY KEY, appid INTEGER, new_theme INTEGER, type_id INTEGER, packname TEXT, name TEXT, version TEXT, version_code INTEGER, download_type INTEGER, download_url TEXT, detail_type INTEGER, detail_url TEXT, pay_type INTEGER, pay_id TEXT, pic_url TEXT, pics_url TEXT, pic_path TEXT, pics_path TEXT, featured_type INTEGER, theme_type INTEGER, mark TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS featured_theme_tab_table (_id INTEGER PRIMARY KEY, type_id INTEGER, sequence INTEGER, type_name TEXT, mark TEXT)");
        a("citynow", "rainFall", "REAL", -10000, sqlitedatabase);
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget_days_41_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget_days_42_city', '')");
    }

    private void G(SQLiteDatabase sqlitedatabase)
    {
        a("featured_theme_table", "synchro_time", "REAL", 0, sqlitedatabase);
    }

    private void H(SQLiteDatabase sqlitedatabase)
    {
        a("citynow", "aqi", "INTEGER", -10000, sqlitedatabase);
        a("citynow", "qualityType", "INTEGER", -10000, sqlitedatabase);
        a("citynow", "pm25", "INTEGER", -10000, sqlitedatabase);
        a("citynow", "pm10", "INTEGER", -10000, sqlitedatabase);
        a("citynow", "so2", "INTEGER", -10000, sqlitedatabase);
        a("citynow", "no2", "INTEGER", -10000, sqlitedatabase);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("timestamp", Integer.valueOf(0));
        sqlitedatabase.update("citynow", contentvalues, null, null);
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget_world_clock_42_city_one', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget_world_clock_42_city_two', '')");
    }

    private void I(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('notification_style', 'notification_style_default')");
    }

    private void J(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS [ad_info_table] ([_id] INTEGER PRIMARY KEY, [ad_id] INTEGER, [ad_interval] INTEGER, [ad_overcount] INTEGER, [ad_img] TEXT, [ad_monitor] TEXT, [ad_weather] INTEGER, [ad_text] TEXT, [ad_url] TEXT, [pcount] INTEGER, [purl] TEXT, [timestamp] TEXT )");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('weather_assistant_switch', 1)");
    }

    private void K(SQLiteDatabase sqlitedatabase)
    {
        a("ad_info_table", "timestamp", "", sqlitedatabase);
    }

    private void L(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(c.l);
        a("featured_theme_table", "pkgalias", "", sqlitedatabase);
        a("featured_theme_table", "ficon_url", "", sqlitedatabase);
    }

    private void M(SQLiteDatabase sqlitedatabase)
    {
        String s1;
        ContentValues contentvalues;
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(b, "com.gau.go.weatherex.theme.gowidget.blacktransparentskin"))
        {
            s1 = "com.gau.go.weatherex.theme.gowidget.blacktransparentskin";
        } else
        {
            s1 = "app_widget_theme_default_transparent";
        }
        contentvalues = new ContentValues();
        contentvalues.put("setting_value", s1);
        sqlitedatabase.update("common_setting_table", contentvalues, "setting_value=? and setting_key=?", new String[] {
            "app_widget_theme_black", "go_widget_theme"
        });
        contentvalues = new ContentValues();
        contentvalues.put("widget_theme", s1);
        sqlitedatabase.update("gowidget_theme_table", contentvalues, "widget_theme=?", new String[] {
            "app_widget_theme_black"
        });
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(b, "com.gau.go.weatherex.systemwidgetskin.blacktransparentskin"))
        {
            s1 = "com.gau.go.weatherex.systemwidgetskin.blacktransparentskin";
        } else
        {
            s1 = "app_widget_theme_white";
        }
        contentvalues = new ContentValues();
        contentvalues.put("setting_value", s1);
        sqlitedatabase.update("common_setting_table", contentvalues, "setting_value=? and setting_key=?", new String[] {
            "app_widget_theme_black", "app_widget_theme"
        });
    }

    private void N(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS next_widget_binding_city_table (_id INTEGER PRIMARY KEY, go_widget_type INTEGER, go_widget_id TEXT, city_id TEXT)");
    }

    private void O(SQLiteDatabase sqlitedatabase)
    {
        boolean flag = false;
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('weather_warning_switch', '1')");
        SharedPreferences sharedpreferences = b.getSharedPreferences("dynamic_bg_settings", 0);
        if (com.gtp.a.a.c.a.a() != 3)
        {
            flag = true;
        }
        if (sharedpreferences.getBoolean("dynamic_background_boolean", flag))
        {
            sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.c.a("1"));
        } else
        {
            sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.c.a("0"));
        }
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('dynamic_icon_gowidget', 1)");
        a("messagecenter", "whitelist", "", sqlitedatabase);
    }

    private void P(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS coupon_table (_id INTEGER PRIMARY KEY, coupon_id TEXT, coupon_value INTEGER, consumed INTEGER, consumed_time REAL, effective_time REAL, expired_time REAL)");
    }

    private void Q(SQLiteDatabase sqlitedatabase)
    {
        b(sqlitedatabase, "com.gau.go.weatherex.dynamicsbg.defaultv1");
    }

    private void R(SQLiteDatabase sqlitedatabase)
    {
        Object obj = null;
        Object obj1 = sqlitedatabase.query("common_setting_table", new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "app_theme"
        }, null, null, null);
        obj = obj1;
        obj1 = obj;
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        Object obj2 = ((Cursor) (obj)).getString(0);
        obj1 = obj2;
_L8:
        obj2 = obj1;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            obj2 = obj1;
        }
_L3:
        obj = b.getSharedPreferences("goweatherex_info", 0).edit();
        SQLException sqlexception;
        if ("com.gau.go.launcherex.gowidget.weatherwidget".equals(obj2))
        {
            ((android.content.SharedPreferences.Editor) (obj)).putInt("key_show_update_bg_theme_to_download_old_version_tip_count", 0);
            ((android.content.SharedPreferences.Editor) (obj)).putInt("key_show_update_bg_theme_to_change_theme_tip_count", 100);
        } else
        {
            ((android.content.SharedPreferences.Editor) (obj)).putInt("key_show_update_bg_theme_to_change_theme_tip_count", 0);
            ((android.content.SharedPreferences.Editor) (obj)).putInt("key_show_update_bg_theme_to_download_old_version_tip_count", 100);
        }
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        obj = new ContentValues();
        ((ContentValues) (obj)).put("setting_value", "com.gau.go.launcherex.gowidget.weatherwidget");
        sqlitedatabase.update("common_setting_table", ((ContentValues) (obj)), "setting_key=?", new String[] {
            "app_theme"
        });
        sqlitedatabase.update("common_setting_table", ((ContentValues) (obj)), "setting_key=?", new String[] {
            "key_live_wallpaper_theme"
        });
        return;
        sqlexception;
        obj = null;
_L6:
        obj1 = obj;
        if (!com.gtp.a.a.b.c.a())
        {
            break MISSING_BLOCK_LABEL_218;
        }
        obj1 = obj;
        sqlexception.printStackTrace();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        sqlexception = "com.gau.go.launcherex.gowidget.weatherwidget";
          goto _L3
        sqlitedatabase;
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw sqlitedatabase;
        sqlitedatabase;
        obj = obj1;
        if (true) goto _L5; else goto _L4
_L4:
        sqlexception;
          goto _L6
_L2:
        obj1 = "com.gau.go.launcherex.gowidget.weatherwidget";
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void S(SQLiteDatabase sqlitedatabase)
    {
        a("featured_theme_table", "issupport_coupons", "INTEGER", 0, sqlitedatabase);
    }

    private void T(SQLiteDatabase sqlitedatabase)
    {
        a("featured_theme_table", "issupport_coupons", "INTEGER", 0, sqlitedatabase);
        a("messagecenter", "packagename", "TEXT", 0, sqlitedatabase);
        a("messagecenter", "mapid", "TEXT", 0, sqlitedatabase);
    }

    private void U(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS promo_table (_id INTEGER PRIMARY KEY, promo_code TEXT, effective_time REAL, expired_time REAL)");
    }

    private void V(SQLiteDatabase sqlitedatabase)
    {
        String s1;
        Cursor cursor;
        String as[];
        Cursor cursor1;
        a("citynow", "city_my_location", "INTEGER", 1, sqlitedatabase);
        as = new String[1];
        as[0] = "cityId";
        cursor1 = sqlitedatabase.query("citynow", as, "myLocation=?", new String[] {
            String.valueOf(2)
        }, null, null, null);
        cursor = null;
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        s1 = cursor;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = cursor1.getColumnCount();
        i1 = 0;
_L11:
        s1 = cursor;
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        if (!"cityId".equals(cursor1.getColumnName(i1))) goto _L5; else goto _L4
_L4:
        s1 = cursor1.getString(i1);
_L2:
        cursor1.close();
_L13:
        if (TextUtils.isEmpty(s1)) goto _L7; else goto _L6
_L6:
        cursor = sqlitedatabase.query("citynow", as, "cityId=?", new String[] {
            s1
        }, null, null, null);
        if (cursor == null) goto _L7; else goto _L8
_L8:
        i1 = cursor.getCount();
        cursor.close();
        if (i1 != 1) goto _L10; else goto _L9
_L9:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("myLocation", Integer.valueOf(1));
        contentvalues.put("city_my_location", Integer.valueOf(2));
        sqlitedatabase.update("citynow", contentvalues, "cityId=?", new String[] {
            s1
        });
_L7:
        return;
_L5:
        i1++;
          goto _L11
_L10:
        if (i1 <= 1) goto _L7; else goto _L12
_L12:
        sqlitedatabase.delete("citynow", "myLocation=?", new String[] {
            String.valueOf(2)
        });
        ContentValues contentvalues1 = new ContentValues();
        contentvalues1.put("myLocation", Integer.valueOf(1));
        contentvalues1.put("city_my_location", Integer.valueOf(3));
        sqlitedatabase.update("citynow", contentvalues1, "cityId=?", new String[] {
            s1
        });
        return;
        s1 = null;
          goto _L13
    }

    private void W(SQLiteDatabase sqlitedatabase)
    {
        a("citynow", "latitude", "TEXT", sqlitedatabase);
        a("citynow", "longitude", "TEXT", sqlitedatabase);
        a("citynow", "hasRadar", "INTEGER", 0, sqlitedatabase);
        a("citynow", "hasSatellite", "INTEGER", 0, sqlitedatabase);
    }

    private void X(SQLiteDatabase sqlitedatabase)
    {
        b(sqlitedatabase, "com.gau.go.weatherex.dynamicsbg.defaultv2");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('no_alerts_cities', '')");
        a("extreme", "has_read", "INTEGER", 0, sqlitedatabase);
    }

    private void Y(SQLiteDatabase sqlitedatabase)
    {
        e();
        sqlitedatabase.execSQL(t.a);
        f();
    }

    private void Z(SQLiteDatabase sqlitedatabase)
    {
        boolean flag = false;
        a("citynow", "northeast", "TEXT", sqlitedatabase);
        a("citynow", "southwest", "TEXT", sqlitedatabase);
        String s1 = aa(sqlitedatabase);
        AppWidgetManager appwidgetmanager = AppWidgetManager.getInstance(b);
        int ai2[] = appwidgetmanager.getAppWidgetIds(new ComponentName(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider));
        com.gtp.a.a.b.c.a("updatewidget", (new StringBuilder()).append("\u7CFB\u7EDFwidget\u5F53\u59294*2\u4E2A\u6570\u4E3A\uFF1A").append(ai2.length).append("\u4E2A").toString());
        if (ai2.length > 0)
        {
            String s3 = c(sqlitedatabase, "appwidget42_city");
            if (!TextUtils.isEmpty(s3))
            {
                for (int i1 = 0; i1 < ai2.length; i1++)
                {
                    a(sqlitedatabase, 1, ai2[i1], s3, s1);
                }

            }
        }
        ai2 = appwidgetmanager.getAppWidgetIds(new ComponentName(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget41Provider));
        com.gtp.a.a.b.c.a("updatewidget", (new StringBuilder()).append("\u7CFB\u7EDFwidget\u5F53\u59294*1\u4E2A\u6570\u4E3A\uFF1A").append(ai2.length).append("\u4E2A").toString());
        if (ai2.length > 0)
        {
            String s4 = c(sqlitedatabase, "appwidget41_city");
            if (!TextUtils.isEmpty(s4))
            {
                for (int j1 = 0; j1 < ai2.length; j1++)
                {
                    a(sqlitedatabase, 2, ai2[j1], s4, s1);
                }

            }
        }
        ai2 = appwidgetmanager.getAppWidgetIds(new ComponentName(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget21Provider));
        com.gtp.a.a.b.c.a("updatewidget", (new StringBuilder()).append("\u7CFB\u7EDFwidget\u5F53\u59292*1\u4E2A\u6570\u4E3A\uFF1A").append(ai2.length).append("\u4E2A").toString());
        if (ai2.length > 0)
        {
            String s5 = c(sqlitedatabase, "appwidget21_city");
            if (!TextUtils.isEmpty(s5))
            {
                for (int k1 = 0; k1 < ai2.length; k1++)
                {
                    a(sqlitedatabase, 3, ai2[k1], s5, s1);
                }

            }
        }
        ai2 = appwidgetmanager.getAppWidgetIds(new ComponentName(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays42Provider));
        com.gtp.a.a.b.c.a("updatewidget", (new StringBuilder()).append("\u7CFB\u7EDFwidget\u591A\u59294*2\u4E2A\u6570\u4E3A\uFF1A").append(ai2.length).append("\u4E2A").toString());
        if (ai2.length > 0)
        {
            String s6 = c(sqlitedatabase, "appwidget_days_42_city");
            if (!TextUtils.isEmpty(s6))
            {
                for (int l1 = 0; l1 < ai2.length; l1++)
                {
                    a(sqlitedatabase, 4, ai2[l1], s6, s1);
                }

            }
        }
        int ai1[] = appwidgetmanager.getAppWidgetIds(new ComponentName(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays41Provider));
        com.gtp.a.a.b.c.a("updatewidget", (new StringBuilder()).append("\u7CFB\u7EDFwidget\u591A\u59294*1\u4E2A\u6570\u4E3A\uFF1A").append(ai1.length).append("\u4E2A").toString());
        if (ai1.length > 0)
        {
            String s2 = c(sqlitedatabase, "appwidget_days_41_city");
            if (!TextUtils.isEmpty(s2))
            {
                for (int i2 = ((flag) ? 1 : 0); i2 < ai1.length; i2++)
                {
                    a(sqlitedatabase, 5, ai1[i2], s2, s1);
                }

            }
        }
    }

    private int a(boolean flag, boolean flag1)
    {
        if (flag && flag1)
        {
            return 1;
        }
        if (flag && !flag1)
        {
            return 2;
        }
        return flag || !flag1 ? 0 : 3;
    }

    public static a a(Context context, String s1, int i1)
    {
        com/gau/go/launcherex/gowidget/weather/provider/a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new a(context, s1, i1);
        }
        context = a;
        com/gau/go/launcherex/gowidget/weather/provider/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a()
    {
        android.content.SharedPreferences.Editor editor = b.getSharedPreferences("start_msg", 0).edit();
        editor.putBoolean("isFirstStart", true);
        editor.putBoolean("is1to2", true);
        editor.commit();
    }

    private void a(int i1, int j1, int k1, ContentValues contentvalues)
    {
        contentvalues.put("type", Integer.valueOf(com.gau.go.launcherex.gowidget.weather.util.r.b(i1)));
        if (k1 == 1)
        {
            String as[] = b.getResources().getStringArray(0x7f0d0046);
            if (j1 >= 0 && j1 < as.length)
            {
                contentvalues.put("nowDesp", as[j1]);
                return;
            } else
            {
                contentvalues.put("nowDesp", "--");
                return;
            }
        }
        String as1[] = b.getResources().getStringArray(0x7f0d0045);
        if (j1 >= 0 && j1 < as1.length)
        {
            contentvalues.put("nowDesp", as1[j1]);
            return;
        } else
        {
            contentvalues.put("nowDesp", "--");
            return;
        }
    }

    private void a(int i1, int j1, ContentValues contentvalues)
    {
        if (j1 == 1)
        {
            String as[] = b.getResources().getStringArray(0x7f0d0047);
            contentvalues.put("windType", Integer.valueOf(com.gau.go.launcherex.gowidget.weather.util.r.d(i1)));
            if (i1 >= 0 && i1 < as.length)
            {
                contentvalues.put("windDirection", as[i1]);
            } else
            {
                contentvalues.put("windDirection", "--");
            }
            contentvalues.put("windStrength", "--");
            contentvalues.put("windStrengthInt", Integer.valueOf(-10000));
            return;
        }
        String as1[] = b.getResources().getStringArray(0x7f0d0048);
        contentvalues.put("windType", Integer.valueOf(com.gau.go.launcherex.gowidget.weather.util.r.c(i1)));
        if (i1 >= 0 && i1 < as1.length)
        {
            contentvalues.put("windDirection", as1[i1]);
        } else
        {
            contentvalues.put("windDirection", "--");
        }
        contentvalues.put("windStrength", "--");
        contentvalues.put("windStrengthInt", Integer.valueOf(-10000));
    }

    private void a(android.content.SharedPreferences.Editor editor)
    {
        b b1;
        b1 = new b();
        b1.a("admob");
        b1.b(0);
        b1.c(0);
        b1.a(1);
        if (!com.gau.go.launcherex.gowidget.statistics.w.h(b) || com.gau.go.launcherex.gowidget.statistics.w.p(b)) goto _L2; else goto _L1
_L1:
        b1.b(1);
        b1.b(b.getString(0x7f080036));
_L4:
        editor.putString((new StringBuilder()).append("key_adid_location_").append(b1.b()).toString(), b1.a());
        b1.a(2);
        b1.b(0);
        if (!com.gau.go.launcherex.gowidget.statistics.w.h(b) && com.gau.go.launcherex.gowidget.statistics.w.p(b))
        {
            b1.b(1);
            b1.b(b.getString(0x7f080039));
        }
        editor.putString((new StringBuilder()).append("key_adid_location_").append(b1.b()).toString(), b1.a());
        editor.putInt("key_adid_request_frequency", 0);
        return;
_L2:
        if (!com.gau.go.launcherex.gowidget.statistics.w.h(b) && com.gau.go.launcherex.gowidget.statistics.w.p(b))
        {
            b1.b(1);
            b1.b(b.getString(0x7f080037));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(Cursor cursor, int i1, ContentValues contentvalues)
    {
        int k1 = cursor.getColumnCount();
        int j1 = 0;
        while (j1 < k1) 
        {
            String s1 = cursor.getColumnName(j1);
            if (s1.equals("cityName"))
            {
                contentvalues.put(s1, cursor.getString(j1));
            } else
            if (s1.equals("cityId"))
            {
                contentvalues.put(s1, cursor.getString(j1));
            } else
            if (s1.equals("cityType"))
            {
                contentvalues.put(s1, Integer.valueOf(cursor.getInt(j1)));
            } else
            if (s1.equals("nowDesp"))
            {
                contentvalues.put(s1, Integer.valueOf(cursor.getInt(j1)));
            } else
            if (s1.equals("language"))
            {
                contentvalues.put(s1, Integer.valueOf(cursor.getInt(j1)));
            } else
            if (s1.equals("nowTemp"))
            {
                contentvalues.put(s1, cursor.getString(j1));
            } else
            if (s1.equals("lowTemp"))
            {
                contentvalues.put(s1, cursor.getString(j1));
            } else
            if (s1.equals("highTemp"))
            {
                contentvalues.put(s1, cursor.getString(j1));
            } else
            if (s1.equals("wind"))
            {
                contentvalues.put(s1, Integer.valueOf(cursor.getInt(j1)));
            } else
            if (s1.equals("humidity"))
            {
                contentvalues.put(s1, cursor.getString(j1));
            } else
            if (s1.equals("type"))
            {
                contentvalues.put(s1, Integer.valueOf(cursor.getInt(j1)));
            }
            j1++;
        }
        contentvalues.put("sequence", Integer.valueOf(i1));
    }

    private void a(Cursor cursor, ContentValues contentvalues)
    {
        byte byte1 = -1;
        int j2 = cursor.getColumnCount();
        int i1 = 0;
        byte byte0 = -1;
        byte byte3 = 8;
        byte byte2 = -1;
        while (i1 < j2) 
        {
            String s1 = cursor.getColumnName(i1);
            int j1;
            int k1;
            int l1;
            int i2;
            if (s1.equals("cityName"))
            {
                contentvalues.put("cityName", cursor.getString(i1));
                i2 = byte0;
                l1 = byte1;
                k1 = byte2;
                j1 = byte3;
            } else
            if (s1.equals("cityId"))
            {
                contentvalues.put("cityId", cursor.getString(i1));
                contentvalues.put("oldCityId", cursor.getString(i1));
                j1 = byte3;
                k1 = byte2;
                l1 = byte1;
                i2 = byte0;
            } else
            if (s1.equals("cityType"))
            {
                contentvalues.put("cityType", Integer.valueOf(cursor.getInt(i1)));
                j1 = byte3;
                k1 = byte2;
                l1 = byte1;
                i2 = byte0;
            } else
            if (s1.equals("nowDesp"))
            {
                k1 = cursor.getInt(i1);
                j1 = byte3;
                l1 = byte1;
                i2 = byte0;
            } else
            if (s1.equals("nowTemp"))
            {
                contentvalues.put("nowTemp", com.gau.go.launcherex.gowidget.weather.util.q.a(cursor.getString(i1), 1, 2));
                j1 = byte3;
                k1 = byte2;
                l1 = byte1;
                i2 = byte0;
            } else
            if (s1.equals("lowTemp"))
            {
                contentvalues.put("lowTemp", com.gau.go.launcherex.gowidget.weather.util.q.a(cursor.getString(i1), 1, 2));
                j1 = byte3;
                k1 = byte2;
                l1 = byte1;
                i2 = byte0;
            } else
            if (s1.equals("highTemp"))
            {
                contentvalues.put("highTemp", com.gau.go.launcherex.gowidget.weather.util.q.a(cursor.getString(i1), 1, 2));
                j1 = byte3;
                k1 = byte2;
                l1 = byte1;
                i2 = byte0;
            } else
            if (s1.equals("wind"))
            {
                i2 = cursor.getInt(i1);
                j1 = byte3;
                k1 = byte2;
                l1 = byte1;
            } else
            if (s1.equals("humidity"))
            {
                contentvalues.put("humidity", cursor.getString(i1));
                j1 = byte3;
                k1 = byte2;
                l1 = byte1;
                i2 = byte0;
            } else
            if (s1.equals("type"))
            {
                j1 = cursor.getInt(i1);
                k1 = byte2;
                l1 = byte1;
                i2 = byte0;
            } else
            if (s1.equals("language"))
            {
                l1 = cursor.getInt(i1);
                j1 = byte3;
                k1 = byte2;
                i2 = byte0;
            } else
            {
                j1 = byte3;
                k1 = byte2;
                l1 = byte1;
                i2 = byte0;
                if (s1.equals("sequence"))
                {
                    contentvalues.put("sequence", Integer.valueOf(cursor.getInt(i1)));
                    j1 = byte3;
                    k1 = byte2;
                    l1 = byte1;
                    i2 = byte0;
                }
            }
            i1++;
            byte3 = j1;
            byte2 = k1;
            byte1 = l1;
            byte0 = i2;
        }
        a(byte0, byte1, contentvalues);
        a(byte3, byte2, byte1, contentvalues);
        contentvalues.put("visibility", "--");
        contentvalues.put("barometer", "--");
        contentvalues.put("dewpoint", "--");
        contentvalues.put("uvIndex", "--");
        contentvalues.put("sunrise", "--");
        contentvalues.put("sunset", "--");
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('autoUpdate', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('autpUpdateFreq', '3600000')");
        sqlitedatabase.execSQL(c.g);
        sqlitedatabase.execSQL(c.h);
        sqlitedatabase.execSQL(c.i);
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('isCycle', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('dateStyle', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('notify', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('notify_type', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('notify_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('notify_city_type', '1')");
        sqlitedatabase.execSQL(c.j);
        sqlitedatabase.execSQL(c.k);
        sqlitedatabase.execSQL(c.l);
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('world_clock', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('widgt_clock', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('widgt_calendar', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('notification_sound', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('user_lang_code', 'default')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('user_lang_pkg', 'com.gau.go.launcherex.gowidget.weatherwidget')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change_high', '9')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change_low', '9')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('temp_change_type', '1')");
    }

    private void a(SQLiteDatabase sqlitedatabase, int i1, int j1, String s1, String s2)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("widget_id", Integer.valueOf(j1));
        contentvalues.put("widget_type", Integer.valueOf(i1));
        if (!TextUtils.isEmpty(s2) && s1.equals(s2))
        {
            com.gtp.a.a.b.c.a("updatewidget", (new StringBuilder()).append("\u6709\u7ED1\u5B9A\u5B9A\u4F4D\u57CE\u5E02\uFF0C\u8BE5\u57CE\u5E02\u662F\uFF1A").append(s1).toString());
            contentvalues.put("widget_location_type", Integer.valueOf(1));
        } else
        {
            contentvalues.put("widget_location_type", Integer.valueOf(0));
        }
        contentvalues.put("current_cityid", s1);
        sqlitedatabase.insert("appwidget_info_table", null, contentvalues);
    }

    private void a(SQLiteDatabase sqlitedatabase, int i1, int j1, String s1, String s2, String s3)
    {
        boolean flag2 = false;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("widget_id", Integer.valueOf(j1));
        contentvalues.put("widget_type", Integer.valueOf(i1));
        boolean flag1;
        if (!TextUtils.isEmpty(s3))
        {
            boolean flag;
            if (s1.equals(s3))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (s2.equals(s3))
            {
                flag2 = true;
                flag1 = flag;
            }
        } else
        {
            flag1 = false;
        }
        contentvalues.put("widget_location_type", Integer.valueOf(a(flag1, flag2)));
        contentvalues.put("current_cityid", (new StringBuilder()).append(s1).append("#").append(s2).toString());
        sqlitedatabase.insert("appwidget_info_table", null, contentvalues);
    }

    private void a(SQLiteDatabase sqlitedatabase, String s1, String s2, String s3, String s4, int i1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(s2, s4);
        contentvalues.put(s3, Integer.valueOf(i1));
        sqlitedatabase.insert(s1, null, contentvalues);
    }

    private void a(SQLiteDatabase sqlitedatabase, String s1, String s2, String s3, String s4, String s5)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(s2, s4);
        contentvalues.put(s3, s5);
        sqlitedatabase.insert(s1, null, contentvalues);
    }

    private void a(SQLiteDatabase sqlitedatabase, ArrayList arraylist)
    {
        sqlitedatabase = sqlitedatabase.query("citynow", new String[] {
            "cityId", "cityName", "cityType", "nowDesp", "nowTemp", "lowTemp", "highTemp", "wind", "humidity", "language", 
            "type", "sequence"
        }, null, null, null, null, null);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        if (sqlitedatabase.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        sqlitedatabase.moveToFirst();
        boolean flag;
        do
        {
            ContentValues contentvalues = new ContentValues();
            a(((Cursor) (sqlitedatabase)), contentvalues);
            arraylist.add(contentvalues);
            flag = sqlitedatabase.moveToNext();
        } while (flag);
_L4:
        sqlitedatabase.close();
_L2:
        return;
        arraylist;
        arraylist.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
        arraylist;
        sqlitedatabase.close();
        throw arraylist;
    }

    private void a(SQLiteDatabase sqlitedatabase, Map map)
    {
        Cursor cursor = sqlitedatabase.query("citynow", new String[] {
            "cityId", "cityType"
        }, null, null, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.getCount() <= 0) goto _L2; else goto _L3
_L3:
        int k1;
        k1 = cursor.getColumnCount();
        cursor.moveToFirst();
_L4:
        sqlitedatabase = "";
        String as[] = cursor.getColumnNames();
        int i1;
        int j1;
        i1 = 0;
        j1 = 1;
_L6:
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        Object obj;
        if (as[i1].equals("cityId"))
        {
            obj = cursor.getString(i1);
            break MISSING_BLOCK_LABEL_204;
        }
        obj = sqlitedatabase;
        if (!as[i1].equals("cityType"))
        {
            break MISSING_BLOCK_LABEL_204;
        }
        j1 = cursor.getInt(i1);
        obj = sqlitedatabase;
        break MISSING_BLOCK_LABEL_204;
        boolean flag;
        map.put(sqlitedatabase, Integer.valueOf(j1));
        flag = cursor.moveToNext();
        if (flag) goto _L4; else goto _L2
_L2:
        if (cursor == null || cursor.isClosed())
        {
            break MISSING_BLOCK_LABEL_193;
        }
        cursor.close();
        return;
        sqlitedatabase;
        sqlitedatabase.printStackTrace();
        if (true) goto _L2; else goto _L5
_L5:
        sqlitedatabase;
        return;
        i1++;
        sqlitedatabase = ((SQLiteDatabase) (obj));
          goto _L6
    }

    private void a(String s1, String s2, String s3, int i1, SQLiteDatabase sqlitedatabase)
    {
        if (!a(s2, s1, sqlitedatabase))
        {
            sqlitedatabase.execSQL((new StringBuilder()).append("ALTER TABLE '").append(s1).append("'").append(" ADD ").append("'").append(s2).append("'").append(" ").append(s3).toString());
        }
        s3 = new ContentValues();
        s3.put(s2, Integer.valueOf(i1));
        sqlitedatabase.update(s1, s3, null, null);
    }

    private void a(String s1, String s2, String s3, SQLiteDatabase sqlitedatabase)
    {
        if (!a(s2, s1, sqlitedatabase))
        {
            sqlitedatabase.execSQL((new StringBuilder()).append("ALTER TABLE '").append(s1).append("'").append(" ADD ").append("'").append(s2).append("'").append("  TEXT").toString());
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(s2, s3);
        sqlitedatabase.update(s1, contentvalues, null, null);
    }

    private boolean a(SQLiteDatabase sqlitedatabase, String s1)
    {
        s1 = sqlitedatabase.query(s1, null, null, null, null, null, null, "1");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase = s1;
        int i1 = s1.getCount();
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L8:
        if (s1 != null)
        {
            s1.close();
        }
        return flag;
        SQLiteException sqliteexception;
        sqliteexception;
        s1 = null;
_L6:
        sqlitedatabase = s1;
        sqliteexception.printStackTrace();
        if (s1 != null)
        {
            s1.close();
        }
        return false;
        s1;
        sqlitedatabase = null;
_L5:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw s1;
        s1;
        if (true) goto _L5; else goto _L4
_L4:
        sqliteexception;
        if (true) goto _L6; else goto _L2
_L2:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean a(String s1)
    {
        try
        {
            Float.parseFloat(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        return true;
    }

    private boolean a(String s1, String s2, SQLiteDatabase sqlitedatabase)
    {
        Object obj = null;
        sqlitedatabase = sqlitedatabase.query(s2, new String[] {
            s1
        }, null, null, null, null, null);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        s2 = sqlitedatabase;
        int i1 = sqlitedatabase.getColumnIndex(s1);
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L8:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return flag;
        s1;
        sqlitedatabase = null;
_L6:
        s2 = sqlitedatabase;
        s1.printStackTrace();
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return false;
        s1;
        s2 = obj;
_L5:
        if (s2 != null)
        {
            s2.close();
        }
        throw s1;
        s1;
        if (true) goto _L5; else goto _L4
_L4:
        s1;
        if (true) goto _L6; else goto _L2
_L2:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private String aa(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        Cursor cursor;
        Object obj1 = null;
        obj = null;
        cursor = sqlitedatabase.query("citynow", new String[] {
            "cityId"
        }, "city_my_location=?", new String[] {
            String.valueOf(2)
        }, null, null, null);
        sqlitedatabase = obj1;
        if (cursor == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase = obj;
        if (!cursor.moveToFirst()) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        j1 = cursor.getColumnCount();
        i1 = 0;
_L9:
        sqlitedatabase = obj;
        if (i1 >= j1) goto _L4; else goto _L5
_L5:
        if (!"cityId".equals(cursor.getColumnName(i1))) goto _L7; else goto _L6
_L6:
        sqlitedatabase = cursor.getString(i1);
_L4:
        cursor.close();
_L2:
        return sqlitedatabase;
_L7:
        i1++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void ab(SQLiteDatabase sqlitedatabase)
    {
        a("citynow", "cityJsonString", "TEXT", sqlitedatabase);
        String s1 = aa(sqlitedatabase);
        int ai1[] = AppWidgetManager.getInstance(b).getAppWidgetIds(new ComponentName(b, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetWorldClock42Provider));
        com.gtp.a.a.b.c.a("updatewidget", (new StringBuilder()).append("\u7CFB\u7EDFwidget\u65F6\u949F4*2\u4E2A\u6570\u4E3A\uFF1A").append(ai1.length).append("\u4E2A").toString());
        if (ai1.length > 0)
        {
            String s2 = c(sqlitedatabase, "appwidget_world_clock_42_city_one");
            String s3 = c(sqlitedatabase, "appwidget_world_clock_42_city_two");
            if (!TextUtils.isEmpty(s2) || !TextUtils.isEmpty(s3))
            {
                for (int i1 = 0; i1 < ai1.length; i1++)
                {
                    a(sqlitedatabase, 6, ai1[i1], s2, s3, s1);
                }

            }
        }
    }

    private void ac(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        obj = sqlitedatabase.query("common_setting_table", new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "user_lang_code"
        }, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        String s1;
        ((Cursor) (obj)).moveToFirst();
        if (((Cursor) (obj)).getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("setting_value"));
        Object obj3;
        if (s1 != null)
        {
            try
            {
                if (s1.equalsIgnoreCase("fr"))
                {
                    ContentValues contentvalues = new ContentValues();
                    contentvalues.put("setting_value", "com.gau.go.launcherex.gowidget.weatherwidget");
                    sqlitedatabase.update("common_setting_table", contentvalues, "setting_key=?", new String[] {
                        "user_lang_pkg"
                    });
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((Exception) (obj1)).printStackTrace();
                ((Cursor) (obj)).close();
            }
        }
        obj3 = new ArrayList();
        obj = sqlitedatabase.query("citynow", new String[] {
            "cityId", "city_my_location"
        }, null, null, null, null, null);
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                int k1 = ((Cursor) (obj)).getColumnCount();
                do
                {
                    Object obj1 = new v();
                    int i1 = 0;
                    do
                    {
                        if (i1 >= k1)
                        {
                            break;
                        }
                        String s2 = ((Cursor) (obj)).getColumnName(i1);
                        if ("cityId".equals(s2))
                        {
                            obj1.a = ((Cursor) (obj)).getString(i1);
                        } else
                        if ("city_my_location".equals(s2))
                        {
                            obj1.c = ((Cursor) (obj)).getInt(i1);
                        }
                        i1++;
                    } while (true);
                    ((List) (obj3)).add(obj1);
                } while (((Cursor) (obj)).moveToNext());
            }
            ((Cursor) (obj)).close();
        }
        Object obj2 = "";
        obj = sqlitedatabase.query("common_setting_table", new String[] {
            "setting_value"
        }, "setting_key=? or setting_key=?", new String[] {
            "temp_change_city", "temp_change_type"
        }, null, null, null);
        int j1;
        if (obj != null)
        {
            Object obj4;
            if (((Cursor) (obj)).moveToFirst())
            {
                j1 = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("setting_value"));
            } else
            {
                j1 = -1;
            }
            ((Cursor) (obj)).close();
        } else
        {
            j1 = -1;
        }
        if (j1 != 2) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj3)).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        obj2 = (v)((Iterator) (obj)).next();
        if (((v) (obj2)).c != 2) goto _L6; else goto _L5
_L5:
        obj = ((v) (obj2)).a;
        break MISSING_BLOCK_LABEL_430;
_L2:
        obj4 = sqlitedatabase.query("common_setting_table", new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "temp_change_city"
        }, null, null, null);
        obj = obj2;
        if (obj4 != null)
        {
            obj = obj2;
            if (((Cursor) (obj4)).moveToFirst())
            {
                obj = ((Cursor) (obj4)).getString(((Cursor) (obj4)).getColumnIndex("setting_value"));
            }
            ((Cursor) (obj4)).close();
        }
        continue; /* Loop/switch isn't completed */
_L8:
        obj2 = new StringBuffer();
        obj3 = ((List) (obj3)).iterator();
        j1 = 0;
        do
        {
            if (!((Iterator) (obj3)).hasNext())
            {
                break;
            }
            obj4 = (v)((Iterator) (obj3)).next();
            if (!((v) (obj4)).a.equals(obj))
            {
                if (j1 > 0)
                {
                    ((StringBuffer) (obj2)).append("#");
                }
                ((StringBuffer) (obj2)).append(((v) (obj4)).a);
                j1++;
            }
        } while (true);
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.c.a("no_notify_temp_change_cities", ((StringBuffer) (obj2)).toString()));
        return;
_L4:
        obj = "";
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void ad(SQLiteDatabase sqlitedatabase)
    {
        if (!a(sqlitedatabase, "pollenIndex"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS pollenIndex (_id INTEGER PRIMARY KEY, cityId TEXT,date_time INTEGER, pollen_index REAL)");
        }
        if (!a(sqlitedatabase, "pollensource"))
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS pollensource (_id INTEGER PRIMARY KEY, cityId TEXT,date_time INTEGER, name TEXT,type INTEGER,url TEXT)");
        }
    }

    private void ae(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(s.a);
        sqlitedatabase.execSQL(m.a);
        sqlitedatabase.execSQL(n.a);
        sqlitedatabase.execSQL(l.a);
        sqlitedatabase.execSQL(k.a);
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.a.a);
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.q.a);
    }

    private void af(SQLiteDatabase sqlitedatabase)
    {
        a("messagecenter", "isdeleted", "INTEGER", 0, sqlitedatabase);
    }

    private void ag(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(e.a);
        sqlitedatabase.execSQL(d.a);
    }

    private void ah(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('widget_theme_switcher', 1)");
    }

    private void ai(SQLiteDatabase sqlitedatabase)
    {
        R(sqlitedatabase);
    }

    private void aj(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("common_setting_table", com.gau.go.launcherex.gowidget.weather.e.c.a(), "setting_key=?", new String[] {
            "app_theme"
        }, null, null, null);
        String s2 = "";
        String s1 = s2;
        if (cursor != null)
        {
            s1 = s2;
            if (cursor.getCount() > 0)
            {
                cursor.moveToFirst();
                int i1 = cursor.getColumnIndex("setting_value");
                s1 = s2;
                if (i1 != -1)
                {
                    s1 = cursor.getString(i1);
                }
            }
            cursor.close();
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget".equals(s1))
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("setting_value", "0");
            sqlitedatabase.update("common_setting_table", contentvalues, "setting_key='dynamic_bg_switch'", null);
            sqlitedatabase.update("common_setting_table", contentvalues, "setting_key='key_live_wallpaper_dynamic_effect_on'", null);
        }
    }

    private void ak(SQLiteDatabase sqlitedatabase)
    {
    }

    private void al(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        sqlitedatabase.execSQL(com.go.weatherex.messagecenter.k.a);
        cursor = sqlitedatabase.query("common_setting_table", new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "user_lang_code"
        }, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (cursor.moveToFirst())
        {
            String s1 = cursor.getString(0);
            if ("hi".equalsIgnoreCase(s1) || "pt_BR".equalsIgnoreCase(s1) || "id".equalsIgnoreCase(s1) || "tr".equalsIgnoreCase(s1) || "fa".equalsIgnoreCase(s1) || "tl".equalsIgnoreCase(s1) || "uk".equalsIgnoreCase(s1) || "vi".equalsIgnoreCase(s1) || "th".equalsIgnoreCase(s1))
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("setting_value", "com.gau.go.launcherex.gowidget.weatherwidget");
                sqlitedatabase.update("common_setting_table", contentvalues, "setting_key=?", new String[] {
                    "user_lang_pkg"
                });
            }
        }
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.close();
_L2:
        return;
        sqlitedatabase;
        sqlitedatabase.printStackTrace();
        if (cursor == null) goto _L2; else goto _L1
        sqlitedatabase;
        if (cursor != null)
        {
            cursor.close();
        }
        throw sqlitedatabase;
    }

    private void am(SQLiteDatabase sqlitedatabase)
    {
        a("citynow", "golife", ((String) (null)), sqlitedatabase);
        a("citynow", "radar_map_url", ((String) (null)), sqlitedatabase);
    }

    private void an(SQLiteDatabase sqlitedatabase)
    {
        Object obj = sqlitedatabase.query("common_setting_table", new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "app_widget_theme"
        }, null, null, null);
        String s1;
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("setting_value"));
            } else
            {
                s1 = "";
            }
            ((Cursor) (obj)).close();
        } else
        {
            s1 = "";
        }
        a("go_widget_binding_city_table", "widget_theme", s1, sqlitedatabase);
        obj = new ContentValues();
        ((ContentValues) (obj)).put("theme_package_name", s1);
        sqlitedatabase.update("appwidget_info_table", ((ContentValues) (obj)), null, null);
    }

    private void b()
    {
        c();
    }

    private void b(Cursor cursor, ContentValues contentvalues)
    {
        int j1 = cursor.getColumnCount();
        String as[] = com.gau.go.launcherex.gowidget.weather.util.c.h(b);
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = cursor.getColumnName(i1);
            if (s1.equals("dayId"))
            {
                int k1 = cursor.getInt(i1);
                if (i1 == 0)
                {
                    contentvalues.put("weekDate", as[k1]);
                } else
                {
                    contentvalues.put("weekDate", as[k1 % 7]);
                }
            } else
            if (s1.equals("lowTemp"))
            {
                contentvalues.put("lowTemp", com.gau.go.launcherex.gowidget.weather.util.q.a(cursor.getString(i1), 1, 2));
            } else
            if (s1.equals("highTemp"))
            {
                contentvalues.put("highTemp", com.gau.go.launcherex.gowidget.weather.util.q.a(cursor.getString(i1), 1, 2));
            } else
            if (s1.equals("type"))
            {
                contentvalues.put("type", Integer.valueOf(com.gau.go.launcherex.gowidget.weather.util.r.b(cursor.getInt(i1))));
            } else
            if (s1.equals("cityId"))
            {
                contentvalues.put("cityId", cursor.getString(i1));
            }
            i1++;
        }
        contentvalues.put("date", "--");
        contentvalues.put("status", "--");
        contentvalues.put("windDir", "--");
        contentvalues.put("windStrength", "--");
        contentvalues.put("windStrengthInt", Integer.valueOf(-10000));
        contentvalues.put("windType", Integer.valueOf(1));
    }

    private void b(SQLiteDatabase sqlitedatabase)
    {
        if (a(sqlitedatabase, "setting"))
        {
            c(sqlitedatabase);
        }
    }

    private void b(SQLiteDatabase sqlitedatabase, String s1)
    {
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(b, s1))
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("setting_value", s1);
            sqlitedatabase.update("common_setting_table", contentvalues, "setting_value=? and setting_key=?", new String[] {
                "com.gau.go.launcherex.gowidget.weatherwidget", "app_theme"
            });
            sqlitedatabase.update("common_setting_table", contentvalues, "setting_value=? and setting_key=?", new String[] {
                "com.gau.go.launcherex.gowidget.weatherwidget", "key_live_wallpaper_theme"
            });
        }
    }

    private void b(SQLiteDatabase sqlitedatabase, ArrayList arraylist)
    {
        sqlitedatabase = sqlitedatabase.query("forecast", new String[] {
            "cityId", "dayId", "highTemp", "lowTemp", "type"
        }, null, null, null, null, null);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        if (sqlitedatabase.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        sqlitedatabase.moveToFirst();
        boolean flag;
        do
        {
            ContentValues contentvalues = new ContentValues();
            b(((Cursor) (sqlitedatabase)), contentvalues);
            arraylist.add(contentvalues);
            flag = sqlitedatabase.moveToNext();
        } while (flag);
_L4:
        sqlitedatabase.close();
_L2:
        return;
        arraylist;
        arraylist.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
        arraylist;
        sqlitedatabase.close();
        throw arraylist;
    }

    private void b(SQLiteDatabase sqlitedatabase, Map map)
    {
        Cursor cursor;
        HashMap hashmap;
        cursor = sqlitedatabase.query("citynow", new String[] {
            "cityId", "nowTemp", "highTemp", "lowTemp", "humidity", "barometer", "uvIndex", "dewpoint", "visibility", "feels_like", 
            "windStrengthInt"
        }, null, null, null, null, null);
        hashmap = new HashMap();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.getCount() <= 0) goto _L2; else goto _L3
_L3:
        int j1;
        j1 = cursor.getColumnCount();
        cursor.moveToFirst();
_L8:
        ContentValues contentvalues;
        String as[];
        String s2;
        int k1;
        contentvalues = new ContentValues();
        as = cursor.getColumnNames();
        s2 = cursor.getString(cursor.getColumnIndex("cityId"));
        k1 = ((Integer)map.get(s2)).intValue();
        int i1 = 0;
_L9:
        if (i1 >= j1) goto _L5; else goto _L4
_L4:
        if (as[i1].equals("cityId"))
        {
            break MISSING_BLOCK_LABEL_882;
        }
        if (as[i1].equals("nowTemp"))
        {
            String s3 = cursor.getString(i1);
            if (a(s3))
            {
                contentvalues.put("nowTempValue", Float.valueOf(s3));
            }
            break MISSING_BLOCK_LABEL_882;
        }
          goto _L6
_L2:
        if (cursor == null || cursor.isClosed())
        {
            break MISSING_BLOCK_LABEL_284;
        }
        cursor.close();
        return;
_L6:
        if (as[i1].equals("highTemp"))
        {
            String s4 = cursor.getString(i1);
            if (a(s4))
            {
                contentvalues.put("highTempValue", Float.valueOf(s4));
            }
            break MISSING_BLOCK_LABEL_882;
        }
        if (as[i1].equals("lowTemp"))
        {
            String s5 = cursor.getString(i1);
            if (a(s5))
            {
                contentvalues.put("lowTempValue", Float.valueOf(s5));
            }
            break MISSING_BLOCK_LABEL_882;
        }
        if (as[i1].equals("feels_like"))
        {
            String s6 = cursor.getString(i1);
            if (a(s6))
            {
                contentvalues.put("feelslikeValue", Float.valueOf(s6));
            }
            break MISSING_BLOCK_LABEL_882;
        }
        float f2;
        if (!as[i1].equals("windStrengthInt"))
        {
            break MISSING_BLOCK_LABEL_506;
        }
        String s7 = cursor.getString(i1);
        if (!a(s7))
        {
            break MISSING_BLOCK_LABEL_882;
        }
        f2 = Float.valueOf(s7).floatValue();
        float f1;
        f1 = f2;
        if (k1 != 1)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        f1 = com.gau.go.launcherex.gowidget.weather.util.q.c((int)f2);
        contentvalues.put("windStrengthValue", Float.valueOf(f1));
        break MISSING_BLOCK_LABEL_882;
        if (as[i1].equals("dewpoint"))
        {
            String s8 = cursor.getString(i1);
            if (a(s8))
            {
                contentvalues.put("dewpointValue", Float.valueOf(s8));
            }
            break MISSING_BLOCK_LABEL_882;
        }
        if (as[i1].equals("uvIndex"))
        {
            String s9 = cursor.getString(i1);
            if (a(s9))
            {
                contentvalues.put("uvIndexValue", Float.valueOf(s9));
            }
            break MISSING_BLOCK_LABEL_882;
        }
        if (as[i1].equals("humidity"))
        {
            String s10 = cursor.getString(i1).replaceAll("%", "");
            if (a(s10))
            {
                contentvalues.put("humidityValue", Integer.valueOf(s10));
            }
            break MISSING_BLOCK_LABEL_882;
        }
        if (as[i1].equals("barometer"))
        {
            String s11 = cursor.getString(i1).split(" ")[0];
            if (a(s11))
            {
                contentvalues.put("barometerValue", Float.valueOf(s11));
            }
            break MISSING_BLOCK_LABEL_882;
        }
        try
        {
            if (as[i1].equals("visibility"))
            {
                String s12 = cursor.getString(i1).split(" ")[0];
                if (a(s12))
                {
                    contentvalues.put("visibilityValue", Float.valueOf(s12));
                }
            }
            break MISSING_BLOCK_LABEL_882;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.printStackTrace();
        }
          goto _L2
_L5:
        hashmap.put(s2, contentvalues);
        if (cursor.moveToNext()) goto _L8; else goto _L7
_L7:
        map = hashmap.keySet().iterator();
        while (map.hasNext()) 
        {
            String s1 = (String)map.next();
            sqlitedatabase.update("citynow", (ContentValues)hashmap.get(s1), (new StringBuilder()).append("cityId='").append(s1).append("'").toString(), null);
        }
          goto _L2
          goto _L8
        sqlitedatabase;
        return;
        i1++;
          goto _L9
    }

    private String c(SQLiteDatabase sqlitedatabase, String s1)
    {
        Object obj1 = null;
        Object obj = null;
        s1 = sqlitedatabase.query("common_setting_table", new String[] {
            "setting_key", "setting_value"
        }, "setting_key=?", new String[] {
            s1
        }, null, null, null);
        sqlitedatabase = obj1;
        if (s1 != null)
        {
            sqlitedatabase = obj;
            if (s1.getCount() > 0)
            {
                s1.moveToFirst();
                int i1 = s1.getColumnIndex("setting_value");
                sqlitedatabase = obj;
                if (i1 != -1)
                {
                    sqlitedatabase = s1.getString(i1);
                }
            }
            s1.close();
        }
        return sqlitedatabase;
    }

    private void c()
    {
        Object obj;
        Object obj1;
        if (d)
        {
            return;
        }
        obj = (new StringBuilder()).append(b.getFilesDir()).append("/city").toString();
        obj1 = new File(((String) (obj)));
        if (!((File) (obj1)).exists())
        {
            ((File) (obj1)).mkdir();
        }
        obj1 = (new StringBuilder()).append(((String) (obj))).append("/").append("go_city.db").toString();
        obj = new File(((String) (obj1)));
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        obj = b.getResources().openRawResource(0x7f06001e);
        byte abyte0[];
        obj1 = new FileOutputStream(((String) (obj1)));
        abyte0 = new byte[8192];
_L1:
        int i1 = ((InputStream) (obj)).read(abyte0);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        ((FileOutputStream) (obj1)).write(abyte0, 0, i1);
          goto _L1
        try
        {
            ((FileOutputStream) (obj1)).close();
            ((InputStream) (obj)).close();
            d = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((FileNotFoundException) (obj)).printStackTrace();
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        return;
    }

    private void c(Cursor cursor, ContentValues contentvalues)
    {
        int j1 = cursor.getColumnCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = cursor.getColumnName(i1);
            if (s1.equals("msgId"))
            {
                contentvalues.put("mesageid", (new StringBuilder()).append("gcm").append(cursor.getString(i1)).toString());
            } else
            if (s1.equals("msgTitle"))
            {
                contentvalues.put("title", cursor.getString(i1));
            } else
            if (s1.equals("startTime"))
            {
                contentvalues.put("date", com.gau.go.launcherex.gowidget.messagecenter.a.a.a(cursor.getString(i1)));
            } else
            if (s1.equals("isMsgBar"))
            {
                s1 = cursor.getString(i1);
                byte byte0 = 1;
                if (s1.equals("1"))
                {
                    byte0 = 3;
                }
                contentvalues.put("viewtype", Integer.valueOf(byte0));
            } else
            if (s1.equals("msgContent"))
            {
                contentvalues.put("intro", cursor.getString(i1));
            } else
            if (s1.equals("isRead"))
            {
                contentvalues.put("readed", cursor.getString(i1));
            } else
            if (!s1.equals("isDeleted"));
            i1++;
        }
        contentvalues.put("type", Integer.valueOf(100));
        contentvalues.put("url", "");
        contentvalues.put("stime_start", "00:00:00");
        contentvalues.put("stime_end", "23:59:59");
        contentvalues.put("icon", "");
        contentvalues.put("acttype", "0");
        contentvalues.put("actvalue", "");
        contentvalues.put("zicon1", "");
        contentvalues.put("zicon2", "");
        contentvalues.put("zpos", "0");
        contentvalues.put("ztime", "0");
        contentvalues.put("isclosed", "0");
        contentvalues.put("filter_pkgs", "");
        contentvalues.put("clickclosed", "0");
        contentvalues.put("dynamic", "0");
        contentvalues.put("iconpos", "0");
        contentvalues.put("fullscreenicon", "");
        contentvalues.put("removed", "1");
    }

    private void c(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        ContentValues contentvalues;
        cursor = sqlitedatabase.query("setting", null, null, null, null, null, null);
        contentvalues = new ContentValues();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.getCount() <= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        int j1;
        cursor.moveToFirst();
        j1 = cursor.getColumnCount();
        obj = cursor.getColumnNames();
        int i1 = 0;
_L16:
        if (i1 >= j1) goto _L4; else goto _L5
_L5:
        if (!obj[i1].equals("autoUpdate")) goto _L7; else goto _L6
_L6:
        contentvalues.put("autoUpdate", Integer.valueOf(cursor.getInt(i1)));
          goto _L8
_L7:
        if (!obj[i1].equals("autpUpdateFreq")) goto _L10; else goto _L9
_L9:
        contentvalues.put("autpUpdateFreq", Integer.valueOf(cursor.getInt(i1)));
          goto _L8
        obj;
        ((Exception) (obj)).printStackTrace();
_L4:
        cursor.close();
          goto _L2
_L10:
        if (!obj[i1].equals("calendarType")) goto _L12; else goto _L11
_L11:
        contentvalues.put("calendarType", Integer.valueOf(cursor.getInt(i1)));
          goto _L8
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
_L12:
        if (!obj[i1].equals("festival")) goto _L14; else goto _L13
_L13:
        contentvalues.put("festival", Integer.valueOf(cursor.getInt(i1)));
          goto _L8
_L14:
        if (obj[i1].equals("tempUnit"))
        {
            contentvalues.put("tempUnit", Integer.valueOf(cursor.getInt(i1)));
        }
          goto _L8
_L2:
        contentvalues.put("auto_update_time_begin", Integer.valueOf(0));
        contentvalues.put("auto_update_time_end", Integer.valueOf(0));
        contentvalues.put("isCycle", Integer.valueOf(0));
        contentvalues.put("dateStyle", Integer.valueOf(1));
        try
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS setting");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS setting (_id INTEGER PRIMARY KEY, autoUpdate INTEGER, autpUpdateFreq INTEGER, tempUnit INTEGER, calendarType INTEGER, festival INTEGER, auto_update_time_begin INTEGER, auto_update_time_end INTEGER, isCycle INTEGER, dateStyle INTEGER, notify INTEGER, notify_city TEXT, notify_type INTEGER, manual_refresh INTEGER, windUnit INTEGER,notify_city_type INTEGER, world_clock INTEGER, widgt_clock TEXT, widgt_calendar TEXT)");
            sqlitedatabase.insert("setting", null, contentvalues);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.printStackTrace();
        }
        return;
_L8:
        i1++;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private void c(SQLiteDatabase sqlitedatabase, Map map)
    {
        Cursor cursor;
        HashMap hashmap;
        cursor = sqlitedatabase.query("forecast", new String[] {
            "_id", "cityId", "lowTemp", "highTemp", "windStrengthInt"
        }, null, null, null, null, null);
        hashmap = new HashMap();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.getCount() <= 0) goto _L2; else goto _L3
_L3:
        int j1;
        j1 = cursor.getColumnCount();
        cursor.moveToFirst();
_L9:
        ContentValues contentvalues;
        String as[];
        int k1;
        contentvalues = new ContentValues();
        as = cursor.getColumnNames();
        k1 = ((Integer)map.get(cursor.getString(cursor.getColumnIndex("cityId")))).intValue();
        String s1;
        int i1;
        i1 = 0;
        s1 = "";
_L10:
        if (i1 >= j1) goto _L5; else goto _L4
_L4:
        String s2;
        if (as[i1].equals("_id"))
        {
            s2 = cursor.getString(i1);
            break MISSING_BLOCK_LABEL_513;
        }
        if (!as[i1].equals("highTemp")) goto _L7; else goto _L6
_L6:
        String s3 = cursor.getString(i1);
        s2 = s1;
        if (!a(s3))
        {
            break MISSING_BLOCK_LABEL_513;
        }
        contentvalues.put("highTempValue", Float.valueOf(s3));
        s2 = s1;
        break MISSING_BLOCK_LABEL_513;
        sqlitedatabase;
        sqlitedatabase.printStackTrace();
_L2:
        if (cursor == null || cursor.isClosed())
        {
            break MISSING_BLOCK_LABEL_262;
        }
        cursor.close();
        return;
_L7:
        if (!as[i1].equals("lowTemp"))
        {
            break MISSING_BLOCK_LABEL_320;
        }
        s3 = cursor.getString(i1);
        s2 = s1;
        if (!a(s3))
        {
            break MISSING_BLOCK_LABEL_513;
        }
        contentvalues.put("lowTempValue", Float.valueOf(s3));
        s2 = s1;
        break MISSING_BLOCK_LABEL_513;
        s2 = s1;
        if (!as[i1].equals("windStrengthInt"))
        {
            break MISSING_BLOCK_LABEL_513;
        }
        s3 = cursor.getString(i1);
        s2 = s1;
        float f2;
        if (!a(s3))
        {
            break MISSING_BLOCK_LABEL_513;
        }
        f2 = Float.valueOf(s3).floatValue();
        float f1;
        f1 = f2;
        if (k1 != 1)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        f1 = com.gau.go.launcherex.gowidget.weather.util.q.c((int)f2);
        contentvalues.put("windStrengthValue", Float.valueOf(f1));
        s2 = s1;
        break MISSING_BLOCK_LABEL_513;
_L5:
        hashmap.put(s1, contentvalues);
        if (cursor.moveToNext()) goto _L9; else goto _L8
_L8:
        map = hashmap.keySet().iterator();
        while (map.hasNext()) 
        {
            s1 = (String)map.next();
            sqlitedatabase.update("forecast", (ContentValues)hashmap.get(s1), (new StringBuilder()).append("_id ='").append(s1).append("'").toString(), null);
        }
          goto _L2
          goto _L9
        sqlitedatabase;
        return;
        i1++;
        s1 = s2;
          goto _L10
    }

    private void d()
    {
        android.content.SharedPreferences.Editor editor = b.getSharedPreferences("goweatherex_info", 0).edit();
        a(editor);
        editor.commit();
    }

    private void d(SQLiteDatabase sqlitedatabase)
    {
        if (!a(sqlitedatabase, "citynow")) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = e(sqlitedatabase);
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS citynow");
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.b.a);
        if (arraylist == null) goto _L2; else goto _L3
_L3:
        int j1 = arraylist.size();
        int i1 = 0;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitedatabase.insert("citynow", null, (ContentValues)arraylist.get(i1));
        i1++;
        if (true) goto _L4; else goto _L2
        sqlitedatabase;
        sqlitedatabase.printStackTrace();
_L2:
    }

    private void d(SQLiteDatabase sqlitedatabase, Map map)
    {
        Cursor cursor;
        HashMap hashmap;
        cursor = sqlitedatabase.query("hourly", new String[] {
            "_id", "cityId", "date", "temp", "windStrengthInt", "humidity"
        }, null, null, null, null, null);
        hashmap = new HashMap();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.getCount() <= 0) goto _L2; else goto _L3
_L3:
        Time time;
        int j1;
        j1 = cursor.getColumnCount();
        time = new Time();
        time.setToNow();
        cursor.moveToFirst();
_L11:
        ContentValues contentvalues;
        String as[];
        int k1;
        contentvalues = new ContentValues();
        as = cursor.getColumnNames();
        k1 = ((Integer)map.get(cursor.getString(cursor.getColumnIndex("cityId")))).intValue();
        String s1;
        int i1;
        i1 = 0;
        s1 = "";
_L12:
        if (i1 >= j1) goto _L5; else goto _L4
_L4:
        String s2;
        if (as[i1].equals("_id"))
        {
            s2 = cursor.getString(i1);
            break MISSING_BLOCK_LABEL_689;
        }
        if (!as[i1].equals("date")) goto _L7; else goto _L6
_L6:
        s2 = cursor.getString(i1);
        if (time.month != 11 || !s2.startsWith("01/") && !s2.startsWith("1/")) goto _L9; else goto _L8
_L8:
        contentvalues.put("date_long", (new StringBuilder()).append(time.year + 1).append("/").append(s2).toString());
        s2 = s1;
        break MISSING_BLOCK_LABEL_689;
        sqlitedatabase;
        sqlitedatabase.printStackTrace();
_L2:
        if (cursor == null || cursor.isClosed())
        {
            break MISSING_BLOCK_LABEL_329;
        }
        cursor.close();
        return;
_L9:
        contentvalues.put("date_long", (new StringBuilder()).append(time.year).append("/").append(s2).toString());
        s2 = s1;
        break MISSING_BLOCK_LABEL_689;
_L7:
        String s3;
        if (!as[i1].equals("temp"))
        {
            break MISSING_BLOCK_LABEL_431;
        }
        s3 = cursor.getString(i1);
        s2 = s1;
        if (!a(s3))
        {
            break MISSING_BLOCK_LABEL_689;
        }
        contentvalues.put("tempValue", Float.valueOf(s3));
        s2 = s1;
        break MISSING_BLOCK_LABEL_689;
        if (!as[i1].equals("humidity"))
        {
            break MISSING_BLOCK_LABEL_496;
        }
        s3 = cursor.getString(i1).replaceAll("%", "");
        s2 = s1;
        if (!a(s3))
        {
            break MISSING_BLOCK_LABEL_689;
        }
        contentvalues.put("humidityValue", Integer.valueOf(s3));
        s2 = s1;
        break MISSING_BLOCK_LABEL_689;
        s2 = s1;
        if (!as[i1].equals("windStrengthInt"))
        {
            break MISSING_BLOCK_LABEL_689;
        }
        s3 = cursor.getString(i1);
        s2 = s1;
        float f2;
        if (!a(s3))
        {
            break MISSING_BLOCK_LABEL_689;
        }
        f2 = Float.valueOf(s3).floatValue();
        float f1;
        f1 = f2;
        if (k1 != 1)
        {
            break MISSING_BLOCK_LABEL_563;
        }
        f1 = com.gau.go.launcherex.gowidget.weather.util.q.c((int)f2);
        contentvalues.put("windStrengthValue", Float.valueOf(f1));
        s2 = s1;
        break MISSING_BLOCK_LABEL_689;
_L5:
        hashmap.put(s1, contentvalues);
        if (cursor.moveToNext()) goto _L11; else goto _L10
_L10:
        map = hashmap.keySet().iterator();
        while (map.hasNext()) 
        {
            s1 = (String)map.next();
            sqlitedatabase.update("hourly", (ContentValues)hashmap.get(s1), (new StringBuilder()).append("_id ='").append(s1).append("'").toString(), null);
        }
          goto _L2
          goto _L11
        sqlitedatabase;
        return;
        i1++;
        s1 = s2;
          goto _L12
    }

    private ArrayList e(SQLiteDatabase sqlitedatabase)
    {
        ArrayList arraylist;
        ContentValues contentvalues;
        int i1;
        boolean flag;
        try
        {
            sqlitedatabase = sqlitedatabase.query("citynow", new String[] {
                "cityId", "cityName", "cityType", "nowTemp", "nowDesp", "lowTemp", "highTemp", "humidity", "type", "wind", 
                "updateTime", "language"
            }, null, null, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.printStackTrace();
            sqlitedatabase = null;
        }
        arraylist = new ArrayList();
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.moveToFirst();
        i1 = 0;
_L4:
        contentvalues = new ContentValues();
        a(sqlitedatabase, i1, contentvalues);
        arraylist.add(contentvalues);
        i1++;
        flag = sqlitedatabase.moveToNext();
        if (flag) goto _L4; else goto _L3
_L3:
        sqlitedatabase.close();
_L2:
        return arraylist;
        Exception exception1;
        exception1;
        exception1.printStackTrace();
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
    }

    private boolean e()
    {
        return com.gau.go.launcherex.gowidget.weather.util.r.a(b, "city", 0x7f06001f);
    }

    private void f()
    {
        Object obj = b.getSharedPreferences("goweatherex_info", 0);
        String s1 = ((SharedPreferences) (obj)).getString("key_adid_location_1", "");
        String s2 = ((SharedPreferences) (obj)).getString("key_adid_location_2", "");
        if (!TextUtils.isEmpty(s1) && s1.contains("#") && !TextUtils.isEmpty(s2) && s2.contains("#") && s1.split("#").length == 5)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString("key_adid_location_1", (new StringBuilder()).append(s1).append("#").append("0").toString());
            ((android.content.SharedPreferences.Editor) (obj)).putString("key_adid_location_2", (new StringBuilder()).append(s2).append("#").append("0").toString());
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
    }

    private void f(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        Object obj1;
        obj1 = new ArrayList();
        obj = new ArrayList();
        a(sqlitedatabase, ((ArrayList) (obj1)));
        b(sqlitedatabase, ((ArrayList) (obj)));
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS citynow");
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS forecast");
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.b.a);
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS forecast(_id INTEGER PRIMARY KEY, weekDate TEXT, lowTemp TEXT, highTemp TEXT, type INTEGER, status TEXT, cityId TEXT, date TEXT, windType INTEGER, windDir TEXT, windStrength TEXT, windStrengthInt INTEGER,dayId INTEGER, pop INTEGER, status_day TEXT, status_night TEXT, date_long TEXT, lowTempValue REAL, highTempValue REAL, windStrengthValue REAL)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS hourly(_id INTEGER PRIMARY KEY, date TEXT, hour INTEGER, temp TEXT, type INTEGER, cityId TEXT, windType INTEGER, windDirection TEXT, windStrength TEXT, windStrengthInt INTEGER, status TEXT, humidity TEXT, pop INTEGER, date_long TEXT, tempValue REAL, windStrengthValue REAL, humidityValue INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS alarm (_id INTEGER PRIMARY KEY, cityId TEXT, alarmInfo TEXT)");
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); sqlitedatabase.insert("citynow", null, (ContentValues)((Iterator) (obj1)).next())) { }
          goto _L1
_L3:
        return;
_L1:
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); sqlitedatabase.insert("forecast", null, (ContentValues)((Iterator) (obj)).next())) { }
        obj = sqlitedatabase.query("setting", new String[] {
            "autoUpdate", "autpUpdateFreq", "tempUnit", "calendarType", "festival", "auto_update_time_begin", "auto_update_time_end", "isCycle", "dateStyle"
        }, null, null, null, null, null);
        if (obj == null) goto _L3; else goto _L2
_L2:
        int i1 = ((Cursor) (obj)).getCount();
        if (i1 <= 0) goto _L3; else goto _L4
_L4:
        int k1;
        ((Cursor) (obj)).moveToFirst();
        obj1 = new ContentValues();
        k1 = ((Cursor) (obj)).getColumnCount();
        String s1;
        for (int j1 = 0; j1 >= k1; j1++)
        {
            break MISSING_BLOCK_LABEL_589;
        }

        s1 = ((Cursor) (obj)).getColumnName(j1);
        if (s1.equals("autoUpdate"))
        {
            ((ContentValues) (obj1)).put("autoUpdate", Integer.valueOf(((Cursor) (obj)).getInt(j1)));
            break MISSING_BLOCK_LABEL_661;
        }
        if (s1.equals("autpUpdateFreq"))
        {
            ((ContentValues) (obj1)).put("autpUpdateFreq", Integer.valueOf(((Cursor) (obj)).getInt(j1)));
            break MISSING_BLOCK_LABEL_661;
        }
          goto _L5
_L6:
        sqlitedatabase.printStackTrace();
        try
        {
            ((Cursor) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.printStackTrace();
        }
          goto _L3
_L5:
        if (s1.equals("tempUnit"))
        {
            ((ContentValues) (obj1)).put("tempUnit", Integer.valueOf(((Cursor) (obj)).getInt(j1)));
            break MISSING_BLOCK_LABEL_661;
        }
        break MISSING_BLOCK_LABEL_397;
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
        if (s1.equals("calendarType"))
        {
            ((ContentValues) (obj1)).put("calendarType", Integer.valueOf(((Cursor) (obj)).getInt(j1)));
            break MISSING_BLOCK_LABEL_661;
        }
        if (s1.equals("festival"))
        {
            ((ContentValues) (obj1)).put("festival", Integer.valueOf(((Cursor) (obj)).getInt(j1)));
            break MISSING_BLOCK_LABEL_661;
        }
        if (s1.equals("auto_update_time_begin"))
        {
            ((ContentValues) (obj1)).put("auto_update_time_begin", Integer.valueOf(((Cursor) (obj)).getInt(j1)));
            break MISSING_BLOCK_LABEL_661;
        }
        if (s1.equals("auto_update_time_end"))
        {
            ((ContentValues) (obj1)).put("auto_update_time_end", Integer.valueOf(((Cursor) (obj)).getInt(j1)));
            break MISSING_BLOCK_LABEL_661;
        }
        if (s1.equals("isCycle"))
        {
            ((ContentValues) (obj1)).put("isCycle", Integer.valueOf(((Cursor) (obj)).getInt(j1)));
            break MISSING_BLOCK_LABEL_661;
        }
        try
        {
            if (s1.equals("dateStyle"))
            {
                ((ContentValues) (obj1)).put("dateStyle", Integer.valueOf(((Cursor) (obj)).getInt(j1)));
            }
            break MISSING_BLOCK_LABEL_661;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase) { }
        finally { }
          goto _L6
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS setting");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS setting (_id INTEGER PRIMARY KEY, autoUpdate INTEGER, autpUpdateFreq INTEGER, tempUnit INTEGER, calendarType INTEGER, festival INTEGER, auto_update_time_begin INTEGER, auto_update_time_end INTEGER, isCycle INTEGER, dateStyle INTEGER, notify INTEGER, notify_city TEXT, notify_type INTEGER, manual_refresh INTEGER, windUnit INTEGER,notify_city_type INTEGER, world_clock INTEGER, widgt_clock TEXT, widgt_calendar TEXT)");
        ((ContentValues) (obj1)).put("notify", Integer.valueOf(0));
        ((ContentValues) (obj1)).put("notify_city", "");
        ((ContentValues) (obj1)).put("notify_type", Integer.valueOf(1));
        ((ContentValues) (obj1)).put("manual_refresh", Integer.valueOf(0));
        sqlitedatabase.insert("setting", null, ((ContentValues) (obj1)));
        ((Cursor) (obj)).close();
        return;
          goto _L3
    }

    private void g()
    {
        SharedPreferences sharedpreferences = b.getSharedPreferences("goweatherex_info", 0);
        if (sharedpreferences.getInt("key_days_trend_show_tip_view_count", 0) + sharedpreferences.getInt("key_hours_trend_show_tip_view_count", 0) + sharedpreferences.getInt("key_rain_trend_show_tip_view_count", 0) > 0)
        {
            sharedpreferences.edit().putInt("key_trend_show_tip_view_count", 2).commit();
        }
    }

    private void g(SQLiteDatabase sqlitedatabase)
    {
        c();
        i(sqlitedatabase);
        h(sqlitedatabase);
    }

    private SQLiteDatabase h()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = null;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
_L2:
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        SQLiteException sqliteexception;
        sqliteexception;
        sqlitedatabase = obj;
        if (!"unable to open database file".equalsIgnoreCase(sqliteexception.getMessage()))
        {
            continue; /* Loop/switch isn't completed */
        }
        sqlitedatabase = obj;
        if (b.deleteDatabase("weather.db"))
        {
            Toast.makeText(b, 0x7f08021e, 0).show();
            sqlitedatabase = getWritableDatabase();
        }
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    private void h(SQLiteDatabase sqlitedatabase)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        Object obj;
        obj = sqlitedatabase.query("citynow", new String[] {
            "updateTime", "cityId"
        }, null, null, null, null, null);
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj)).moveToFirst();
_L6:
        Object obj1;
        int j1;
        obj1 = new ContentValues();
        j1 = ((Cursor) (obj)).getColumnCount();
        int i1 = 0;
_L7:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        if (((Cursor) (obj)).getColumnName(i1).equals("updateTime"))
        {
            ((ContentValues) (obj1)).put("updateTime", com.gau.go.launcherex.gowidget.weather.util.r.b(((Cursor) (obj)).getString(i1)));
            break MISSING_BLOCK_LABEL_362;
        }
        int k1;
        int l1;
        boolean flag;
        try
        {
            if (((Cursor) (obj)).getColumnName(i1).equals("cityId"))
            {
                arraylist1.add(((Cursor) (obj)).getString(i1));
            }
            break MISSING_BLOCK_LABEL_362;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        finally
        {
            ((Cursor) (obj)).close();
            throw sqlitedatabase;
        }
        ((Exception) (obj1)).printStackTrace();
_L5:
        ((Cursor) (obj)).close();
          goto _L2
_L4:
        arraylist.add(obj1);
        flag = ((Cursor) (obj)).moveToNext();
        if (flag) goto _L6; else goto _L5
_L2:
        k1 = arraylist1.size();
        for (i1 = 0; i1 < k1; i1++)
        {
            obj = ((ContentValues)arraylist.get(i1)).getAsString("updateTime");
            System.out.println((new StringBuilder()).append("object + ").append(((String) (obj))).toString());
            obj = (String)arraylist1.get(i1);
            l1 = sqlitedatabase.update("citynow", (ContentValues)arraylist.get(i1), (new StringBuilder()).append("cityId = '").append(((String) (obj))).append("'").toString(), null);
            System.out.println((new StringBuilder()).append("update + ").append(l1).toString());
        }

        return;
        i1++;
          goto _L7
    }

    private void i(SQLiteDatabase sqlitedatabase)
    {
        if (!a("windUnit", "setting", sqlitedatabase))
        {
            sqlitedatabase.execSQL("ALTER TABLE 'setting' ADD 'windUnit' INTEGER");
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("windUnit", Integer.valueOf(2));
        sqlitedatabase.update("setting", contentvalues, null, null);
    }

    private void j(SQLiteDatabase sqlitedatabase)
    {
        k(sqlitedatabase);
        l(sqlitedatabase);
    }

    private void k(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        ArrayList arraylist;
        cursor = sqlitedatabase.query("citynow", new String[] {
            "cityId", "sequence"
        }, null, null, null, null, "sequence ASC ");
        arraylist = new ArrayList();
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        cursor.moveToFirst();
_L7:
        if (cursor.isAfterLast()) goto _L4; else goto _L3
_L3:
        int j1 = cursor.getColumnCount();
        int i1 = 0;
_L11:
        if (i1 >= j1) goto _L6; else goto _L5
_L5:
        String s1 = cursor.getColumnName(i1);
        if (s1.equals("cityId"))
        {
            arraylist.add(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_280;
        }
        try
        {
            if (s1.equals("sequence"))
            {
                int k1 = cursor.getInt(i1);
                System.out.println(k1);
            }
            break MISSING_BLOCK_LABEL_280;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase) { }
        finally
        {
            cursor.close();
            throw sqlitedatabase;
        }
        sqlitedatabase.printStackTrace();
_L9:
        cursor.close();
_L2:
        return;
_L6:
        cursor.moveToNext();
          goto _L7
_L4:
        ContentValues contentvalues;
        j1 = arraylist.size();
        contentvalues = new ContentValues();
        i1 = 0;
_L10:
        if (i1 >= j1) goto _L9; else goto _L8
_L8:
        contentvalues.clear();
        contentvalues.put("sequence", Integer.valueOf(i1));
        sqlitedatabase.update("citynow", contentvalues, (new StringBuilder()).append("cityId='").append((String)arraylist.get(i1)).append("'").toString(), null);
        i1++;
          goto _L10
          goto _L9
        i1++;
          goto _L11
    }

    private void l(SQLiteDatabase sqlitedatabase)
    {
        Object obj2 = sqlitedatabase.query("setting", new String[] {
            "notify", "notify_city"
        }, null, null, null, null, null);
        if (obj2 == null || ((Cursor) (obj2)).getCount() <= 0) goto _L2; else goto _L1
_L1:
        int i1 = -1;
        int l1;
        ((Cursor) (obj2)).moveToFirst();
        l1 = ((Cursor) (obj2)).getColumnCount();
        Object obj;
        int j1;
        j1 = 0;
        i1 = -1;
        obj = null;
_L21:
        if (j1 >= l1) goto _L4; else goto _L3
_L3:
        String s1 = ((Cursor) (obj2)).getColumnName(j1);
        if (!s1.equals("notify_city")) goto _L6; else goto _L5
_L5:
        Object obj1 = ((Cursor) (obj2)).getString(j1);
        int k1 = i1;
          goto _L7
_L6:
        k1 = i1;
        obj1 = obj;
        if (!s1.equals("notify")) goto _L7; else goto _L8
_L8:
        k1 = ((Cursor) (obj2)).getInt(j1);
        obj1 = obj;
          goto _L7
        obj1;
        obj = null;
_L19:
        ((Exception) (obj1)).printStackTrace();
        ((Cursor) (obj2)).close();
_L18:
        if (obj == null || "".equals(obj)) goto _L10; else goto _L9
_L9:
        obj = (new StringBuilder()).append("cityId='").append(((String) (obj))).append("'").append(" or ").append("oldCityId").append("=").append("'").append(((String) (obj))).append("'").toString();
        obj = sqlitedatabase.query("citynow", new String[] {
            "cityId"
        }, ((String) (obj)), null, null, null, null);
        if (obj == null || ((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L11
_L11:
        ((Cursor) (obj)).moveToFirst();
        obj1 = ((Cursor) (obj)).getString(0);
        obj2 = new ContentValues();
        ((ContentValues) (obj2)).put("notify_city", ((String) (obj1)));
        sqlitedatabase.update("setting", ((ContentValues) (obj2)), null, null);
_L12:
        ((Cursor) (obj)).close();
_L2:
        return;
        sqlitedatabase;
        ((Cursor) (obj2)).close();
        throw sqlitedatabase;
        sqlitedatabase;
        sqlitedatabase.printStackTrace();
          goto _L12
        sqlitedatabase;
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
_L10:
        if (i1 != 1) goto _L2; else goto _L13
_L13:
        obj = sqlitedatabase.query("citynow", new String[] {
            "cityId"
        }, null, null, null, null, null, "1");
        if (obj == null || ((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L14
_L14:
        ((Cursor) (obj)).moveToFirst();
        obj1 = ((Cursor) (obj)).getString(0);
        obj2 = new ContentValues();
        ((ContentValues) (obj2)).put("notify_city", ((String) (obj1)));
        sqlitedatabase.update("setting", ((ContentValues) (obj2)), null, null);
_L16:
        ((Cursor) (obj)).close();
        return;
        sqlitedatabase;
        sqlitedatabase.printStackTrace();
        if (true) goto _L16; else goto _L15
_L15:
        sqlitedatabase;
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
_L4:
        ((Cursor) (obj2)).close();
        if (true) goto _L18; else goto _L17
_L17:
        obj1;
        if (true) goto _L19; else goto _L7
_L7:
        j1++;
        i1 = k1;
        obj = obj1;
        if (true) goto _L21; else goto _L20
_L20:
    }

    private void m(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS common_setting_table (_id INTEGER PRIMARY KEY, setting_key TEXT, setting_value TEXT)");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('app_widget_theme', 'app_widget_theme_default_transparent')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget42_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget41_city', '')");
    }

    private void n(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget21_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('auto_location', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('boot_refresh', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('launch_refresh', '1')");
        a("citynow", "myLocation", "INTEGER", 1, sqlitedatabase);
        a("weather11_city", "my_location", "INTEGER", 1, sqlitedatabase);
        a("setting", "notify_city_type", "INTEGER", 1, sqlitedatabase);
    }

    private void o(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('go_widget_theme', '' )");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('app_widget_theme_data_timestamp', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('go_widget_theme_data_timestamp', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('app_theme_data_timestamp', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('app_theme', 'com.gau.go.launcherex.gowidget.weatherwidget' )");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS app_widget_theme_table (_id INTEGER PRIMARY KEY, theme_type INTEGER, theme_id INTEGER, is_all INTEGER, is_sale INTEGER, preview_id TEXT, preview_path TEXT, summary TEXT, version TEXT, version_num INTEGER, package_name TEXT, fee_type INTEGER, price TEXT, size TEXT, update_time TEXT, download TEXT, ftp_url TEXT, app_market_url TEXT, web_market_url TEXT, go_boutique_url TEXT, other_url TEXT, name TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS gowidget_theme_table (_id INTEGER PRIMARY KEY, widget_id INTEGER, widget_theme TEXT)");
        c();
    }

    private void p(SQLiteDatabase sqlitedatabase)
    {
        a("setting", "world_clock", "INTEGER", 1, sqlitedatabase);
        a("setting", "widgt_clock", "", sqlitedatabase);
        a("setting", "widgt_calendar", "", sqlitedatabase);
        a("citynow", "tz_offset", "INTEGER", -10000, sqlitedatabase);
        a("citynow", "pop", "INTEGER", -10000, sqlitedatabase);
        a("citynow", "feels_like", "INTEGER", -10000, sqlitedatabase);
        a("forecast", "pop", "INTEGER", -10000, sqlitedatabase);
        a("hourly", "pop", "INTEGER", -10000, sqlitedatabase);
        sqlitedatabase.execSQL(i.a);
        android.content.SharedPreferences.Editor editor = b.getSharedPreferences("goweatherex_info", 0).edit();
        editor.putBoolean("24Hours", false);
        editor.putBoolean("future_weather", false);
        editor.putBoolean("menu", true);
        editor.putBoolean("cities", false);
        editor.putBoolean("theme", true);
        editor.putBoolean("setting", false);
        editor.putBoolean("feedback", false);
        editor.commit();
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS extreme(_id INTEGER PRIMARY KEY, cityId TEXT, publish_time TEXT, exp_time TEXT, type TEXT, description TEXT, phenomena TEXT, level INTEGER, message TEXT, alert_id INTEGER, tz_offset INTEGER, has_read INTEGER)");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('extreme_switch', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value) select 'precipitation_switch' ,'1' union select 'wind_switch' ,'1' union select 'humidity_switch' ,'1' union select 'uv_switch' ,'1' union select 'dew_switch' ,'0' union select 'visibility_switch' ,'1' union select 'pressure_switch' ,'0' union select 'sunrise_switch' ,'1'");
    }

    private void q(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('weather_focecast_switch', '0')");
        a("citynow", "state", "", sqlitedatabase);
        a("citynow", "country", "", sqlitedatabase);
        a("extreme", "tz_offset", "INTEGER", 0, sqlitedatabase);
        a("forecast", "status_day", "", sqlitedatabase);
        a("forecast", "status_night", "", sqlitedatabase);
        a("forecast", "date_long", "", sqlitedatabase);
        sqlitedatabase = b.getSharedPreferences("goweatherex_info", 0).edit();
        sqlitedatabase.putBoolean("setting_forecast", true);
        sqlitedatabase.putBoolean("menu", true);
        sqlitedatabase.putBoolean("setting", true);
        sqlitedatabase.commit();
    }

    private void r(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS recommended_apps(_id INTEGER PRIMARY KEY, pid INTEGER, is_all INTEGER, is_sale INTEGER, name TEXT, preview_id TEXT, preview_path TEXT, summary TEXT, version TEXT, version_num INTEGER, price TEXT, fee_type INTEGER, size TEXT, update_time TEXT, download INTEGER, ftp_url TEXT, app_market_url TEXT, web_market_url TEXT, go_boutique_url TEXT, other_url TEXT, theme_type INTEGER, packageName TEXT, iconId TEXT, iconSavedPath TEXT)");
    }

    private void s(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS msg_center (_id INTEGER PRIMARY KEY, msgId INTEGER, msgTitle TEXT, startTime TEXT, endTime TEXT, isMsgBar INTEGER, msgContent TEXT, isRead INTEGER, recTime TEXT, isDeleted INTEGER)");
    }

    private void t(SQLiteDatabase sqlitedatabase)
    {
        u(sqlitedatabase);
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('notification_sound', '0')");
        sqlitedatabase = b.getSharedPreferences("goweatherex_info", 0).edit();
        sqlitedatabase.putBoolean("setting", true);
        sqlitedatabase.putBoolean("setting_notification_sound", true);
        sqlitedatabase.commit();
    }

    private void u(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Cursor cursor;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l7;
        int i8;
        int j8;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        boolean flag12;
        cursor = sqlitedatabase.query("setting", new String[] {
            "autoUpdate", "autpUpdateFreq", "tempUnit", "calendarType", "festival", "isCycle", "dateStyle", "notify", "notify_city", "notify_city_type", 
            "notify_type", "windUnit", "world_clock", "widgt_clock", "widgt_calendar"
        }, null, null, null, null, null);
        k6 = 1;
        j8 = 1;
        i1 = 1;
        j1 = 0x36ee80;
        l1 = com.gau.go.launcherex.gowidget.weather.e.r.a;
        i2 = c.e;
        j2 = c.f;
        i8 = 1;
        flag7 = true;
        k2 = 1;
        l7 = 1;
        flag8 = true;
        l2 = 1;
        l5 = 0;
        flag9 = false;
        i3 = 0;
        j6 = 1;
        flag10 = true;
        j3 = 1;
        obj = "";
        k5 = 1;
        flag11 = true;
        k3 = 1;
        k1 = com.gau.go.launcherex.gowidget.weather.e.r.b;
        i6 = 1;
        flag12 = true;
        l3 = 1;
        obj1 = "";
        obj2 = "";
        if (cursor == null) goto _L2; else goto _L1
_L1:
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        boolean flag;
        boolean flag1;
        boolean flag2;
        int i4;
        boolean flag3;
        boolean flag4;
        int j4;
        int k4;
        int l4;
        int i5;
        boolean flag5;
        boolean flag6;
        int j5;
        int l6;
        int i7;
        int j7;
        int k7;
        obj6 = obj2;
        obj8 = obj1;
        j5 = k1;
        obj7 = obj;
        k7 = j2;
        j7 = i2;
        i7 = l1;
        l6 = j1;
        obj3 = obj2;
        obj5 = obj1;
        flag3 = flag12;
        i4 = k1;
        flag2 = flag11;
        obj4 = obj;
        flag4 = flag10;
        flag = flag9;
        flag6 = flag8;
        flag5 = flag7;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = j8;
        if (cursor.getCount() <= 0) goto _L4; else goto _L3
_L3:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = flag12;
        i4 = k1;
        flag2 = flag11;
        obj4 = obj;
        flag4 = flag10;
        flag = flag9;
        flag6 = flag8;
        flag5 = flag7;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = j8;
        int k8 = cursor.getColumnCount();
        obj3 = obj2;
        obj5 = obj1;
        flag3 = flag12;
        i4 = k1;
        flag2 = flag11;
        obj4 = obj;
        flag4 = flag10;
        flag = flag9;
        flag6 = flag8;
        flag5 = flag7;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = j8;
        cursor.moveToFirst();
        obj3 = obj2;
        obj5 = obj1;
        flag3 = flag12;
        i4 = k1;
        flag2 = flag11;
        obj4 = obj;
        flag4 = flag10;
        flag = flag9;
        flag6 = flag8;
        flag5 = flag7;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = j8;
        String as[] = cursor.getColumnNames();
        j8 = 0;
_L38:
        obj6 = obj2;
        obj8 = obj1;
        i6 = l3;
        j5 = k1;
        k5 = k3;
        obj7 = obj;
        j6 = j3;
        l5 = i3;
        l7 = l2;
        i8 = k2;
        k7 = j2;
        j7 = i2;
        i7 = l1;
        l6 = j1;
        k6 = i1;
        if (j8 >= k8) goto _L4; else goto _L5
_L5:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("autoUpdate")) goto _L7; else goto _L6
_L6:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        i8 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
          goto _L8
_L7:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("autpUpdateFreq")) goto _L10; else goto _L9
_L9:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        l7 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        i8 = i1;
          goto _L8
_L10:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("tempUnit")) goto _L12; else goto _L11
_L11:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        k7 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        l7 = j1;
        i8 = i1;
          goto _L8
_L12:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("calendarType")) goto _L14; else goto _L13
_L13:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        j7 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L14:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("festival")) goto _L16; else goto _L15
_L15:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        i7 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L16:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("isCycle")) goto _L18; else goto _L17
_L17:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        l6 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L18:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("dateStyle")) goto _L20; else goto _L19
_L19:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        k6 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L20:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("notify")) goto _L22; else goto _L21
_L21:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        j6 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L22:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("notify_type")) goto _L24; else goto _L23
_L23:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        i6 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L24:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("notify_city")) goto _L26; else goto _L25
_L25:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        obj8 = cursor.getString(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L26:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("notify_city_type")) goto _L28; else goto _L27
_L27:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        l5 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L28:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("windUnit")) goto _L30; else goto _L29
_L29:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        k5 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L30:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("world_clock")) goto _L32; else goto _L31
_L31:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        j5 = cursor.getInt(j8);
        obj6 = obj2;
        obj7 = obj1;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L32:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        if (!as[j8].equals("widgt_clock")) goto _L34; else goto _L33
_L33:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        obj7 = cursor.getString(j8);
        obj6 = obj2;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L34:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        obj6 = obj2;
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
        if (!as[j8].equals("widgt_calendar")) goto _L8; else goto _L35
_L35:
        obj3 = obj2;
        obj5 = obj1;
        flag3 = l3;
        i4 = k1;
        flag2 = k3;
        obj4 = obj;
        flag4 = j3;
        flag = i3;
        flag6 = l2;
        flag5 = k2;
        i5 = j2;
        l4 = i2;
        k4 = l1;
        j4 = j1;
        flag1 = i1;
        obj6 = cursor.getString(j8);
        obj7 = obj1;
        j5 = l3;
        k5 = k1;
        l5 = k3;
        obj8 = obj;
        i6 = j3;
        j6 = i3;
        k6 = l2;
        l6 = k2;
        i7 = j2;
        j7 = i2;
        k7 = l1;
        l7 = j1;
        i8 = i1;
          goto _L8
_L4:
        cursor.close();
        k2 = l7;
        l2 = i8;
        i3 = k7;
        j3 = j7;
        k3 = i7;
        l3 = l6;
        i2 = j6;
        obj1 = obj8;
        j1 = i6;
        k1 = j5;
        l1 = k5;
        obj2 = obj7;
        i1 = k6;
        j2 = l5;
        obj = obj6;
_L36:
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "autoUpdate", i1);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "autpUpdateFreq", l3);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "tempUnit", k3);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "calendarType", j3);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "festival", i3);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "isCycle", l2);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "dateStyle", k2);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "notify", j2);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "notify_city", ((String) (obj2)));
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "notify_city_type", l1);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "notify_type", i2);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "windUnit", k1);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "world_clock", j1);
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "widgt_clock", ((String) (obj1)));
        a(sqlitedatabase, "common_setting_table", "setting_key", "setting_value", "widgt_calendar", ((String) (obj)));
        return;
        obj;
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        k2 = ((flag6) ? 1 : 0);
        l2 = ((flag5) ? 1 : 0);
        i3 = i5;
        j3 = l4;
        k3 = k4;
        l3 = j4;
        i2 = ((flag4) ? 1 : 0);
        obj1 = obj5;
        j1 = ((flag3) ? 1 : 0);
        k1 = i4;
        l1 = ((flag2) ? 1 : 0);
        obj2 = obj4;
        i1 = ((flag1) ? 1 : 0);
        j2 = ((flag) ? 1 : 0);
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
_L2:
        k2 = 1;
        l2 = 1;
        i3 = j2;
        j3 = i2;
        k3 = l1;
        l3 = 0x36ee80;
        i2 = 1;
        obj1 = "";
        j1 = 1;
        l1 = 1;
        obj2 = "";
        i1 = 1;
        j2 = 0;
        obj = "";
        if (true) goto _L36; else goto _L8
_L8:
        j8++;
        obj2 = obj6;
        obj1 = obj7;
        l3 = j5;
        k1 = k5;
        k3 = l5;
        obj = obj8;
        j3 = i6;
        i3 = j6;
        l2 = k6;
        k2 = l6;
        j2 = i7;
        i2 = j7;
        l1 = k7;
        j1 = l7;
        i1 = i8;
        if (true) goto _L38; else goto _L37
_L37:
    }

    private void v(SQLiteDatabase sqlitedatabase)
    {
        a("citynow", "nowTempValue", "REAL", -10000, sqlitedatabase);
        a("citynow", "highTempValue", "REAL", -10000, sqlitedatabase);
        a("citynow", "lowTempValue", "REAL", -10000, sqlitedatabase);
        a("citynow", "feelslikeValue", "REAL", -10000, sqlitedatabase);
        a("citynow", "windStrengthValue", "REAL", -10000, sqlitedatabase);
        a("citynow", "humidityValue", "INTEGER", -10000, sqlitedatabase);
        a("citynow", "barometerValue", "REAL", -10000, sqlitedatabase);
        a("citynow", "uvIndexValue", "REAL", -10000, sqlitedatabase);
        a("citynow", "dewpointValue", "REAL", -10000, sqlitedatabase);
        a("citynow", "visibilityValue", "REAL", -10000, sqlitedatabase);
        a("citynow", "timestamp", "INTEGER", 0, sqlitedatabase);
        HashMap hashmap = new HashMap();
        a(sqlitedatabase, hashmap);
        b(sqlitedatabase, hashmap);
        a("forecast", "lowTempValue", "REAL", -10000, sqlitedatabase);
        a("forecast", "highTempValue", "REAL", -10000, sqlitedatabase);
        a("forecast", "windStrengthValue", "REAL", -10000, sqlitedatabase);
        c(sqlitedatabase, hashmap);
        a("hourly", "windStrengthValue", "REAL", -10000, sqlitedatabase);
        a("hourly", "humidityValue", "INTEGER", -10000, sqlitedatabase);
        a("hourly", "tempValue", "REAL", -10000, sqlitedatabase);
        a("hourly", "date_long", "", sqlitedatabase);
        d(sqlitedatabase, hashmap);
        c();
    }

    private void w(SQLiteDatabase sqlitedatabase)
    {
        a("go_widget_binding_city_table", "go_widget_type", "INTEGER", -1, sqlitedatabase);
        sqlitedatabase = b.getSharedPreferences("goweatherex_info", 0).edit();
        sqlitedatabase.putBoolean("is_cityid_sync", true);
        sqlitedatabase.commit();
    }

    private void x(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value) select 'key_live_wallpaper_city_id' ,'--' union select 'key_live_wallpaper_city_flag' ,'-1' union select 'key_live_wallpaper_dynamic_effect_on' ,'0' union select 'key_live_wallpaper_show_weather_info_on' ,'1' union select 'key_live_wallpaper_weather_info_description_on' ,'1' union select 'key_live_wallpaper_weather_info_hight_low_temperature_on' ,'1' union select 'key_live_wallpaper_weather_info_wind_on' ,'1' union select 'key_live_wallpaper_weather_info_position' ,'1' union select 'key_live_wallpaper_weather_info_show_moment' ,'3' union select 'key_live_wallpaper_weather_info_font_size' ,'2' union select 'key_live_wallpaper_theme' ,'com.gau.go.launcherex.gowidget.weatherwidget'");
        y(sqlitedatabase);
        sqlitedatabase = b.getSharedPreferences("goweatherex_info", 0).edit();
        sqlitedatabase.putBoolean("setting", true);
        sqlitedatabase.putBoolean("is_cityid_sync", false);
        sqlitedatabase.commit();
    }

    private void y(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        cursor = sqlitedatabase.query("common_setting_table", new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "app_theme"
        }, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        if (cursor.moveToFirst())
        {
            String s1 = cursor.getString(0);
            if (!TextUtils.isEmpty(s1) && !"com.gau.go.launcherex.gowidget.weatherwidget".equals(s1) && com.gau.go.launcherex.gowidget.weather.globaltheme.a.c(s1, b) != null)
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("setting_value", s1);
                sqlitedatabase.update("common_setting_table", contentvalues, "setting_key=?", new String[] {
                    "key_live_wallpaper_theme"
                });
            }
        }
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.close();
_L2:
        return;
        sqlitedatabase;
        if (cursor != null)
        {
            cursor.close();
        }
        throw sqlitedatabase;
        sqlitedatabase;
        if (cursor == null) goto _L2; else goto _L1
    }

    private void z(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('user_lang_code', 'default')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('user_lang_pkg', 'com.gau.go.launcherex.gowidget.weatherwidget')");
        sqlitedatabase = b.getSharedPreferences("goweatherex_info", 0).edit();
        sqlitedatabase.putString("key_new_language", "com.gau.go.weatherex.language.it#com.gau.go.weatherex.language.fr");
        sqlitedatabase.putBoolean("weather_share", true);
        sqlitedatabase.putBoolean("setting", true);
        sqlitedatabase.putBoolean("setting_language", true);
        sqlitedatabase.commit();
    }

    public int a(String s1, ContentValues contentvalues, String s2, String as[])
    {
        int i1 = 0;
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = h();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return 0;
        }
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        i1 = sqlitedatabase.update(s1, contentvalues, s2, as);
        return i1;
    }

    public int a(String s1, String s2, String as[])
    {
        int i1 = 0;
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = h();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return 0;
        }
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        i1 = sqlitedatabase.delete(s1, s2, as);
        return i1;
    }

    public long a(String s1, ContentValues contentvalues)
    {
        long l1 = 0L;
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = h();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return 0L;
        }
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        l1 = sqlitedatabase.insert(s1, null, contentvalues);
        return l1;
    }

    public Cursor a(String s1, String as[], String s2, String as1[], String s3, String s4, String s5, 
            String s6)
    {
        c.setTables(s1);
        try
        {
            s1 = h();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s1 = c.query(s1, as, s2, as1, s3, s4, s5, s6);
_L4:
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS setting (_id INTEGER PRIMARY KEY, autoUpdate INTEGER, autpUpdateFreq INTEGER, tempUnit INTEGER, calendarType INTEGER, festival INTEGER, auto_update_time_begin INTEGER, auto_update_time_end INTEGER, isCycle INTEGER, dateStyle INTEGER, notify INTEGER, notify_city TEXT, notify_type INTEGER, manual_refresh INTEGER, windUnit INTEGER,notify_city_type INTEGER, world_clock INTEGER, widgt_clock TEXT, widgt_calendar TEXT)");
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.r.c);
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.b.a);
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS forecast(_id INTEGER PRIMARY KEY, weekDate TEXT, lowTemp TEXT, highTemp TEXT, type INTEGER, status TEXT, cityId TEXT, date TEXT, windType INTEGER, windDir TEXT, windStrength TEXT, windStrengthInt INTEGER,dayId INTEGER, pop INTEGER, status_day TEXT, status_night TEXT, date_long TEXT, lowTempValue REAL, highTempValue REAL, windStrengthValue REAL)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS weather11_city (_id INTEGER PRIMARY KEY, widgetId INTEGER, cityId TEXT, my_location INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS hourly(_id INTEGER PRIMARY KEY, date TEXT, hour INTEGER, temp TEXT, type INTEGER, cityId TEXT, windType INTEGER, windDirection TEXT, windStrength TEXT, windStrengthInt INTEGER, status TEXT, humidity TEXT, pop INTEGER, date_long TEXT, tempValue REAL, windStrengthValue REAL, humidityValue INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS alarm (_id INTEGER PRIMARY KEY, cityId TEXT, alarmInfo TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS extreme(_id INTEGER PRIMARY KEY, cityId TEXT, publish_time TEXT, exp_time TEXT, type TEXT, description TEXT, phenomena TEXT, level INTEGER, message TEXT, alert_id INTEGER, tz_offset INTEGER, has_read INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS featured_theme_table (_id INTEGER PRIMARY KEY, appid INTEGER, new_theme INTEGER, type_id INTEGER, packname TEXT, name TEXT, version TEXT, version_code INTEGER, download_type INTEGER, download_url TEXT, detail_type INTEGER, detail_url TEXT, pay_type INTEGER, pay_id TEXT, pic_url TEXT, pics_url TEXT, pic_path TEXT, pics_path TEXT, featured_type INTEGER, theme_type INTEGER, synchro_time REAL, mark TEXT, pkgalias TEXT, ficon_url TEXT, issupport_coupons INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS featured_theme_tab_table (_id INTEGER PRIMARY KEY, type_id INTEGER, sequence INTEGER, type_name TEXT, mark TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS coupon_table (_id INTEGER PRIMARY KEY, coupon_id TEXT, coupon_value INTEGER, consumed INTEGER, consumed_time REAL, effective_time REAL, expired_time REAL)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS promo_table (_id INTEGER PRIMARY KEY, promo_code TEXT, effective_time REAL, expired_time REAL)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS common_setting_table (_id INTEGER PRIMARY KEY, setting_key TEXT, setting_value TEXT)");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('app_widget_theme', 'app_widget_theme_default_transparent')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget42_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget41_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget21_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget_days_41_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget_days_42_city', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('auto_location', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('boot_refresh', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('launch_refresh', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value) select 'precipitation_switch' ,'1' union select 'wind_switch' ,'1' union select 'humidity_switch' ,'1' union select 'uv_switch' ,'0' union select 'dew_switch' ,'0' union select 'visibility_switch' ,'0' union select 'pressure_switch' ,'0' union select 'sunrise_switch' ,'1'");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('extreme_switch', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('weather_focecast_switch', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('weather_warning_switch', '1')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('no_alerts_cities', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value) select 'key_live_wallpaper_city_id' ,'--' union select 'key_live_wallpaper_city_flag' ,'-1' union select 'key_live_wallpaper_dynamic_effect_on' ,'0' union select 'key_live_wallpaper_show_weather_info_on' ,'1' union select 'key_live_wallpaper_weather_info_description_on' ,'1' union select 'key_live_wallpaper_weather_info_hight_low_temperature_on' ,'1' union select 'key_live_wallpaper_weather_info_wind_on' ,'1' union select 'key_live_wallpaper_weather_info_position' ,'1' union select 'key_live_wallpaper_weather_info_show_moment' ,'3' union select 'key_live_wallpaper_weather_info_font_size' ,'2' union select 'key_live_wallpaper_theme' ,'com.gau.go.launcherex.gowidget.weatherwidget'");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('notification_style', 'notification_style_default')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('weather_assistant_switch', 1)");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('go_widget_theme', '' )");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget_world_clock_42_city_one', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('appwidget_world_clock_42_city_two', '')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('dynamic_icon_gowidget', 1)");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('widget_theme_switcher', 1)");
        a(sqlitedatabase);
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS app_widget_theme_table (_id INTEGER PRIMARY KEY, theme_type INTEGER, theme_id INTEGER, is_all INTEGER, is_sale INTEGER, preview_id TEXT, preview_path TEXT, summary TEXT, version TEXT, version_num INTEGER, package_name TEXT, fee_type INTEGER, price TEXT, size TEXT, update_time TEXT, download TEXT, ftp_url TEXT, app_market_url TEXT, web_market_url TEXT, go_boutique_url TEXT, other_url TEXT, name TEXT)");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('app_widget_theme_data_timestamp', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('go_widget_theme_data_timestamp', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('app_theme_data_timestamp', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('plugin_camera_data_timestamp', '0')");
        sqlitedatabase.execSQL("INSERT INTO common_setting_table (setting_key, setting_value)values('app_theme', 'com.gau.go.launcherex.gowidget.weatherwidget' )");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS gowidget_theme_table (_id INTEGER PRIMARY KEY, widget_id INTEGER, widget_theme TEXT)");
        sqlitedatabase.execSQL(i.a);
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS recommended_apps(_id INTEGER PRIMARY KEY, pid INTEGER, is_all INTEGER, is_sale INTEGER, name TEXT, preview_id TEXT, preview_path TEXT, summary TEXT, version TEXT, version_num INTEGER, price TEXT, fee_type INTEGER, size TEXT, update_time TEXT, download INTEGER, ftp_url TEXT, app_market_url TEXT, web_market_url TEXT, go_boutique_url TEXT, other_url TEXT, theme_type INTEGER, packageName TEXT, iconId TEXT, iconSavedPath TEXT)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS msg_center (_id INTEGER PRIMARY KEY, msgId INTEGER, msgTitle TEXT, startTime TEXT, endTime TEXT, isMsgBar INTEGER, msgContent TEXT, isRead INTEGER, recTime TEXT, isDeleted INTEGER)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS messagecenter (mesageid text, title text, readed numeric, viewtype numeric, type text, date text, url text, stime_start text,stime_end text,icon text,intro text,acttype numeric,actvalue text,zicon1 text,zicon2 text,zpos numeric,ztime numeric,isclosed numeric,filter_pkgs text,clickclosed numeric,dynamic numeric,iconpos numeric,fullscreenicon text,removed numeric, packagename text, mapid text, whitelist text, isdeleted numeric,PRIMARY KEY (mesageid))");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS [ad_info_table] ([_id] INTEGER PRIMARY KEY, [ad_id] INTEGER, [ad_interval] INTEGER, [ad_overcount] INTEGER, [ad_img] TEXT, [ad_monitor] TEXT, [ad_weather] INTEGER, [ad_text] TEXT, [ad_url] TEXT, [pcount] INTEGER, [purl] TEXT, [timestamp] TEXT )");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS next_widget_binding_city_table (_id INTEGER PRIMARY KEY, go_widget_type INTEGER, go_widget_id TEXT, city_id TEXT)");
        sqlitedatabase.execSQL(t.a);
        sqlitedatabase.execSQL(s.a);
        sqlitedatabase.execSQL(m.a);
        sqlitedatabase.execSQL(n.a);
        sqlitedatabase.execSQL(l.a);
        sqlitedatabase.execSQL(k.a);
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.a.a);
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.q.a);
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS pollenIndex (_id INTEGER PRIMARY KEY, cityId TEXT,date_time INTEGER, pollen_index REAL)");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS pollensource (_id INTEGER PRIMARY KEY, cityId TEXT,date_time INTEGER, name TEXT,type INTEGER,url TEXT)");
        sqlitedatabase.execSQL(e.a);
        sqlitedatabase.execSQL(d.a);
        sqlitedatabase.execSQL(com.go.weatherex.messagecenter.k.a);
        e();
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.c.a(String.valueOf(0)));
        sqlitedatabase.execSQL(com.gau.go.launcherex.gowidget.weather.e.c.a("no_notify_temp_change_cities", ""));
        sqlitedatabase = b.getSharedPreferences("goweatherex_info", 0).edit();
        sqlitedatabase.putBoolean("24Hours", false);
        sqlitedatabase.putBoolean("future_weather", false);
        sqlitedatabase.putBoolean("menu", false);
        sqlitedatabase.putBoolean("cities", false);
        sqlitedatabase.putBoolean("theme", false);
        sqlitedatabase.putBoolean("setting", false);
        sqlitedatabase.putBoolean("feedback", false);
        sqlitedatabase.putBoolean("weather_share", false);
        sqlitedatabase.putBoolean("is_cityid_sync", true);
        sqlitedatabase.putInt("key_new_feature_live_wallpaper", 0);
        sqlitedatabase.putBoolean("new_theme", false);
        sqlitedatabase.putLong("key_first_install_time", System.currentTimeMillis() + 0x5265c00L);
        sqlitedatabase.putBoolean("key_open_dialog_boolean", false);
        sqlitedatabase.putBoolean("key_is_new_user", true);
        a(sqlitedatabase);
        sqlitedatabase.commit();
        sqlitedatabase = b.getSharedPreferences("goweatherex_world_info", 2).edit();
        sqlitedatabase.putBoolean("key_systemwidget_isfirst_open_theme", true);
        sqlitedatabase.putBoolean("key_gowidget_isfirst_open_theme", true);
        sqlitedatabase.commit();
        com.gau.go.launcherex.gowidget.weather.util.r.a(new File(Environment.getExternalStorageDirectory(), "/GOWeatherEX/download/maps"));
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
    {
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
    {
        if (j1 <= i1) goto _L2; else goto _L1
_L1:
        android.content.SharedPreferences.Editor editor = b.getSharedPreferences("goweatherex_info", 0).edit();
        editor.putInt("key_last_versioncode", i1);
        editor.putBoolean("key_is_new_user", false);
        editor.commit();
        i1;
        JVM INSTR tableswitch 1 57: default 296
    //                   1 297
    //                   2 301
    //                   3 305
    //                   4 310
    //                   5 315
    //                   6 320
    //                   7 325
    //                   8 330
    //                   9 335
    //                   10 340
    //                   11 345
    //                   12 350
    //                   13 355
    //                   14 360
    //                   15 365
    //                   16 370
    //                   17 375
    //                   18 380
    //                   19 385
    //                   20 390
    //                   21 395
    //                   22 400
    //                   23 405
    //                   24 410
    //                   25 415
    //                   26 420
    //                   27 425
    //                   28 430
    //                   29 435
    //                   30 440
    //                   31 445
    //                   32 450
    //                   33 455
    //                   34 460
    //                   35 465
    //                   36 470
    //                   37 475
    //                   38 480
    //                   39 485
    //                   40 490
    //                   41 495
    //                   42 499
    //                   43 504
    //                   44 509
    //                   45 514
    //                   46 519
    //                   47 524
    //                   48 529
    //                   49 534
    //                   50 538
    //                   51 543
    //                   52 548
    //                   53 553
    //                   54 558
    //                   55 563
    //                   56 568
    //                   57 573;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59
_L2:
        return;
_L3:
        a();
_L4:
        b();
_L5:
        b(sqlitedatabase);
_L6:
        d(sqlitedatabase);
_L7:
        f(sqlitedatabase);
_L8:
        g(sqlitedatabase);
_L9:
        j(sqlitedatabase);
_L10:
        m(sqlitedatabase);
_L11:
        n(sqlitedatabase);
_L12:
        o(sqlitedatabase);
_L13:
        p(sqlitedatabase);
_L14:
        q(sqlitedatabase);
_L15:
        r(sqlitedatabase);
_L16:
        s(sqlitedatabase);
_L17:
        t(sqlitedatabase);
_L18:
        v(sqlitedatabase);
_L19:
        w(sqlitedatabase);
_L20:
        x(sqlitedatabase);
_L21:
        z(sqlitedatabase);
_L22:
        A(sqlitedatabase);
_L23:
        B(sqlitedatabase);
_L24:
        C(sqlitedatabase);
_L25:
        F(sqlitedatabase);
_L26:
        G(sqlitedatabase);
_L27:
        H(sqlitedatabase);
_L28:
        I(sqlitedatabase);
_L29:
        J(sqlitedatabase);
_L30:
        K(sqlitedatabase);
_L31:
        L(sqlitedatabase);
_L32:
        M(sqlitedatabase);
_L33:
        N(sqlitedatabase);
_L34:
        O(sqlitedatabase);
_L35:
        P(sqlitedatabase);
_L36:
        Q(sqlitedatabase);
_L37:
        S(sqlitedatabase);
_L38:
        T(sqlitedatabase);
_L39:
        U(sqlitedatabase);
_L40:
        V(sqlitedatabase);
_L41:
        W(sqlitedatabase);
_L42:
        X(sqlitedatabase);
_L43:
        d();
_L44:
        Y(sqlitedatabase);
_L45:
        Z(sqlitedatabase);
_L46:
        ab(sqlitedatabase);
_L47:
        ac(sqlitedatabase);
_L48:
        ad(sqlitedatabase);
_L49:
        ae(sqlitedatabase);
_L50:
        af(sqlitedatabase);
_L51:
        g();
_L52:
        ag(sqlitedatabase);
_L53:
        ah(sqlitedatabase);
_L54:
        ai(sqlitedatabase);
_L55:
        aj(sqlitedatabase);
_L56:
        ak(sqlitedatabase);
_L57:
        al(sqlitedatabase);
_L58:
        am(sqlitedatabase);
_L59:
        an(sqlitedatabase);
        return;
    }
}
