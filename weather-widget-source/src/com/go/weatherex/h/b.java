// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.h;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import com.gau.go.launcherex.goweather.livewallpaper.b.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget21Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget42Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays42Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetWorldClock42Provider;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;

// Referenced classes of package com.go.weatherex.h:
//            a

public class b
{

    private Context a;

    public b(Context context)
    {
        a = context;
    }

    private void a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[\u4E0A\u4F20\u4FE1\u606F\uFF1A");
        stringbuilder.append(s);
        stringbuilder.append("]");
        s = stringbuilder.toString();
        com.gtp.a.a.b.c.a("BehaviorStaticStatisticsHandler", s);
        com.gtp.a.a.a.a.a().a(s, "behavior_static_statistics.txt");
    }

    private String b()
    {
        Object obj;
        StringBuilder stringbuilder;
        com.go.weatherex.h.a a1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag2;
        boolean flag3;
        int i3;
        int j3;
        int k3;
        int l3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        boolean flag9;
        boolean flag10;
        boolean flag11;
        boolean flag12;
        boolean flag13;
        boolean flag14;
        boolean flag15;
        boolean flag16;
        stringbuilder = new StringBuilder();
        a1 = new com.go.weatherex.h.a(a);
        flag5 = false;
        k1 = 0;
        flag6 = false;
        flag4 = false;
        flag7 = false;
        j1 = 0;
        flag8 = false;
        flag2 = false;
        flag9 = false;
        i1 = 0;
        flag10 = false;
        flag3 = false;
        flag11 = false;
        l = 0;
        flag12 = false;
        i3 = 0;
        flag13 = false;
        k = 0;
        flag14 = false;
        j3 = 0;
        flag15 = false;
        j = 0;
        flag16 = false;
        k3 = 0;
        i = 0;
        l3 = 0;
        l1 = 0;
        obj = a.getContentResolver().query(WeatherContentProvider.l, new String[] {
            "go_widget_type"
        }, null, null, "go_widget_id");
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i2;
        boolean flag;
        boolean flag1;
        int j2;
        int k2;
        int l2;
        k1 = l1;
        l2 = ((flag15) ? 1 : 0);
        l1 = ((flag13) ? 1 : 0);
        i2 = ((flag11) ? 1 : 0);
        flag = flag9;
        flag1 = flag7;
        j2 = ((flag5) ? 1 : 0);
        k2 = l3;
        j1 = ((flag16) ? 1 : 0);
        i1 = ((flag14) ? 1 : 0);
        l = ((flag12) ? 1 : 0);
        k = ((flag10) ? 1 : 0);
        j = ((flag8) ? 1 : 0);
        i = ((flag6) ? 1 : 0);
        if (((Cursor) (obj)).getCount() <= 0) goto _L4; else goto _L3
_L3:
        k2 = l3;
        j1 = ((flag16) ? 1 : 0);
        i1 = ((flag14) ? 1 : 0);
        l = ((flag12) ? 1 : 0);
        k = ((flag10) ? 1 : 0);
        j = ((flag8) ? 1 : 0);
        i = ((flag6) ? 1 : 0);
        l3 = ((Cursor) (obj)).getCount();
        k2 = l3;
        j1 = ((flag16) ? 1 : 0);
        i1 = ((flag14) ? 1 : 0);
        l = ((flag12) ? 1 : 0);
        k = ((flag10) ? 1 : 0);
        j = ((flag8) ? 1 : 0);
        i = ((flag6) ? 1 : 0);
        int i4 = ((Cursor) (obj)).getColumnIndex("go_widget_type");
        k1 = l3;
        l2 = ((flag15) ? 1 : 0);
        l1 = ((flag13) ? 1 : 0);
        i2 = ((flag11) ? 1 : 0);
        flag = flag9;
        flag1 = flag7;
        j2 = ((flag5) ? 1 : 0);
        if (i4 == -1) goto _L4; else goto _L5
_L5:
        k1 = l3;
        l2 = ((flag15) ? 1 : 0);
        l1 = ((flag13) ? 1 : 0);
        i2 = ((flag11) ? 1 : 0);
        flag = flag9;
        flag1 = flag7;
        j2 = ((flag5) ? 1 : 0);
        k2 = l3;
        j1 = ((flag16) ? 1 : 0);
        i1 = ((flag14) ? 1 : 0);
        l = ((flag12) ? 1 : 0);
        k = ((flag10) ? 1 : 0);
        j = ((flag8) ? 1 : 0);
        i = ((flag6) ? 1 : 0);
        if (!((Cursor) (obj)).moveToFirst()) goto _L4; else goto _L6
_L6:
        l2 = ((flag4) ? 1 : 0);
_L15:
        k2 = l3;
        j1 = k3;
        i1 = j3;
        l = i3;
        k = ((flag3) ? 1 : 0);
        j = ((flag2) ? 1 : 0);
        i = l2;
        ((Cursor) (obj)).getInt(i4);
        JVM INSTR tableswitch 0 5: default 1697
    //                   0 1311
    //                   1 1337
    //                   2 1441
    //                   3 1415
    //                   4 1363
    //                   5 1389;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L7:
        break MISSING_BLOCK_LABEL_1697;
_L18:
        k2 = l3;
        j1 = k1;
        i1 = l1;
        l = i2;
        k = ((flag) ? 1 : 0);
        j = ((flag1) ? 1 : 0);
        i = j2;
        boolean flag17 = ((Cursor) (obj)).moveToNext();
        k3 = k1;
        j3 = l1;
        i3 = i2;
        flag3 = flag;
        flag2 = flag1;
        l2 = j2;
        if (flag17) goto _L15; else goto _L14
_L14:
        l2 = k1;
        k1 = l3;
_L4:
        ((Cursor) (obj)).close();
        j = l2;
        k = l1;
        l = i2;
        i1 = ((flag) ? 1 : 0);
        j1 = ((flag1) ? 1 : 0);
        i = k1;
        k1 = j2;
_L2:
        obj = a.getContentResolver().query(WeatherContentProvider.a, new String[] {
            "cityId"
        }, null, null, "cityId");
        if (obj == null) goto _L17; else goto _L16
_L16:
        l1 = ((Cursor) (obj)).getCount();
        ((Cursor) (obj)).close();
_L19:
        a1.a();
        a1.k("4*2_gw");
        if (k1 != 0)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("4*1_gw");
        if (j1 != 0)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("4*1gwf");
        if (k != 0)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("4*1gwn");
        if (j != 0)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("2*1_gw");
        if (i1 != 0)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("1*1_gw");
        if (l != 0)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("4*2_aw");
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider))
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("4*2_awf");
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays42Provider))
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("4*1_aw");
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget41Provider))
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("4*1_awf");
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays41Provider))
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("2*1_aw");
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget21Provider))
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("wlw");
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(a, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetWorldClock42Provider))
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        if (i > 0)
        {
            boolean flag18 = com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(com.gau.go.launcherex.gowidget.weather.globaltheme.d.a(a, 0));
            a1.a();
            a1.k("gw_theme");
            Exception exception;
            SQLException sqlexception;
            if (flag18)
            {
                obj = "1";
            } else
            {
                obj = "0";
            }
            a1.l(((String) (obj)));
            stringbuilder.append(a1.b());
            stringbuilder.append("\r\n");
        }
        obj = "1_city";
        if (l1 >= 7)
        {
            obj = "7-9_city";
        }
        if (l1 >= 4)
        {
            obj = "4-6_city";
        } else
        if (l1 == 3)
        {
            obj = "3_city";
        } else
        if (l1 == 2)
        {
            obj = "2_city";
        } else
        if (l1 == 1)
        {
            obj = "1_city";
        }
        a1.a();
        a1.k(((String) (obj)));
        a1.l("1");
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("auto_loc_city");
        a1.l(String.valueOf(com.gau.go.launcherex.gowidget.weather.c.c.a(a).f().a().b));
        stringbuilder.append(a1.b());
        stringbuilder.append("\r\n");
        a1.a();
        a1.k("weather_wp");
        if (h.a(a))
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a1.l(((String) (obj)));
        stringbuilder.append(a1.b());
        return stringbuilder.toString();
_L8:
        j2 = 1;
        k1 = k3;
        l1 = j3;
        i2 = i3;
        flag = flag3;
        flag1 = flag2;
          goto _L18
_L9:
        flag1 = true;
        k1 = k3;
        l1 = j3;
        i2 = i3;
        flag = flag3;
        j2 = l2;
          goto _L18
_L12:
        l1 = 1;
        k1 = k3;
        i2 = i3;
        flag = flag3;
        flag1 = flag2;
        j2 = l2;
          goto _L18
_L13:
        k1 = 1;
        l1 = j3;
        i2 = i3;
        flag = flag3;
        flag1 = flag2;
        j2 = l2;
          goto _L18
_L11:
        flag = true;
        k1 = k3;
        l1 = j3;
        i2 = i3;
        flag1 = flag2;
        j2 = l2;
          goto _L18
_L10:
        i2 = 1;
        k1 = k3;
        l1 = j3;
        flag = flag3;
        flag1 = flag2;
        j2 = l2;
          goto _L18
        sqlexception;
        if (com.gtp.a.a.b.c.a())
        {
            sqlexception.printStackTrace();
        }
        ((Cursor) (obj)).close();
        k1 = k;
        l1 = j;
        i2 = i;
        i = k2;
        j = j1;
        k = i1;
        i1 = k1;
        j1 = l1;
        k1 = i2;
          goto _L2
        exception;
        ((Cursor) (obj)).close();
        throw exception;
        sqlexception;
        if (com.gtp.a.a.b.c.a())
        {
            sqlexception.printStackTrace();
        }
        ((Cursor) (obj)).close();
        l1 = 0;
          goto _L19
        exception;
        ((Cursor) (obj)).close();
        throw exception;
_L17:
        l1 = 0;
          goto _L19
        k1 = k3;
        l1 = j3;
        i2 = i3;
        flag = flag3;
        flag1 = flag2;
        j2 = l2;
          goto _L18
    }

    private void c()
    {
        String s = b();
        com.gau.go.a.e.a(a).a(s);
        a(s);
        e();
    }

    private long d()
    {
        return GoWidgetApplication.c(a).a().getLong("key_behavior_static_statistics_upload_time", 0L);
    }

    private void e()
    {
        android.content.SharedPreferences.Editor editor = GoWidgetApplication.c(a).a().edit();
        editor.putLong("key_behavior_static_statistics_upload_time", System.currentTimeMillis());
        editor.commit();
    }

    public void a()
    {
        if (System.currentTimeMillis() - d() >= 0x5265c00L)
        {
            c();
        }
    }
}
