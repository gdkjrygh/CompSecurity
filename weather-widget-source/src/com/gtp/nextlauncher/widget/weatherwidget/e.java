// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Handler;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.HourlyBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.gl.view.GLView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            d, f, g, j, 
//            i, h

public class e
{

    public static int a = 2;
    public static int b = 1;
    private boolean A;
    private boolean B;
    private int C;
    private boolean D;
    private d E;
    private final BroadcastReceiver F = new f(this);
    private int G;
    private boolean H;
    private final BroadcastReceiver I = new com.gtp.nextlauncher.widget.weatherwidget.g(this);
    private Time J;
    private boolean K;
    private String L;
    private String M;
    private String N;
    private String O;
    private String P;
    private Context c;
    private int d;
    private boolean e;
    private j f;
    private g g;
    private String h;
    private int i;
    private ArrayList j;
    private List k;
    private ArrayList l;
    private ContentResolver m;
    private boolean n;
    private int o;
    private HourlyBean p;
    private WeatherBean q;
    private long r;
    private Time s;
    private List t;
    private Handler u;
    private i v;
    private GLView w;
    private boolean x;
    private boolean y;
    private boolean z;

    public e(Context context, int i1, GLView glview, boolean flag)
    {
        c = null;
        d = 0;
        e = false;
        g = null;
        h = "";
        i = -1;
        j = new ArrayList();
        k = new ArrayList();
        l = new ArrayList();
        n = true;
        o = 2;
        q = null;
        r = 0x5265c00L;
        s = new Time();
        x = true;
        y = false;
        z = false;
        A = false;
        B = true;
        C = -1;
        D = false;
        E = new d();
        G = -1;
        H = false;
        J = new Time();
        K = false;
        w = glview;
        c = context;
        g = new g(context);
        g.a(true);
        d = i1;
        a(c);
        f = new j(this, c.getContentResolver());
        q = new WeatherBean();
        c.startService(new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService"));
        if (flag)
        {
            G = 1;
        } else
        {
            G = 0;
        }
        v();
        u = new Handler();
        m = c.getContentResolver();
        v = new i(this, u);
        context = android.provider.Settings.System.getUriFor("time_12_24");
        m.registerContentObserver(context, true, v);
        H();
    }

    private void A()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(1));
        arraylist.add(Integer.valueOf(3));
        arraylist.add(Integer.valueOf(4));
        b(arraylist);
    }

    private void B()
    {
        x = false;
        z = false;
        z();
    }

    private void C()
    {
        f.a(9, null, WeatherContentProvider.a, new String[] {
            "cityId"
        }, null, null, "sequence");
    }

    private void D()
    {
        String s1 = (new StringBuilder()).append(d).append("").toString();
        f.a(-1, null, WeatherContentProvider.E, "go_widget_id=?", new String[] {
            s1
        });
    }

    private void E()
    {
        String s1 = (new StringBuilder()).append(d).append("").toString();
        f.a(6, null, WeatherContentProvider.E, null, "go_widget_id=?", new String[] {
            s1
        }, null);
    }

    private void F()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", 50);
        c.startService(intent);
    }

    private void G()
    {
        if (t != null)
        {
            Iterator iterator = t.iterator();
            while (iterator.hasNext()) 
            {
                ((h)iterator.next()).onLoadFinish();
            }
        }
    }

    private void H()
    {
        if (!L() || !g.d() || q == null)
        {
            s = g.c();
        } else
        {
            s = t();
        }
        if (t != null)
        {
            Iterator iterator = t.iterator();
            while (iterator.hasNext()) 
            {
                ((h)iterator.next()).onTimeChange(s.hour, s.minute);
            }
        }
    }

    private void I()
    {
        if (t != null)
        {
            Iterator iterator = t.iterator();
            while (iterator.hasNext()) 
            {
                ((h)iterator.next()).startRefresh();
            }
        }
    }

    private void J()
    {
        if (t != null)
        {
            Iterator iterator = t.iterator();
            while (iterator.hasNext()) 
            {
                ((h)iterator.next()).endRefresh();
            }
        }
    }

    private Time K()
    {
        if (g.d() && q != null && L())
        {
            int i1 = q.l.n();
            return g.b(i1);
        } else
        {
            return g.c();
        }
    }

    private boolean L()
    {
        return n;
    }

    private void a(int i1, int j1)
    {
        int k1 = j.size();
        if (i1 >= 0 && j1 >= 0 && i1 < k1 && j1 < k1 && i1 != j1)
        {
            Object obj = (WeatherBean)j.remove(i1);
            if (j1 == k1 - 1)
            {
                j.add(obj);
            } else
            {
                j.add(j1, obj);
            }
            obj = ((WeatherBean)j.get(i)).c();
            if (!((String) (obj)).equals(h))
            {
                h = ((String) (obj));
                q = (WeatherBean)j.get(i);
                w();
            }
        }
    }

    private void a(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.TIME_TICK");
        intentfilter.addAction("android.intent.action.TIME_SET");
        intentfilter.addAction("android.intent.action.DATE_CHANGED");
        intentfilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION");
        intentfilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LUNAR");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATESTYLE_UNIT");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ADD_CITY");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FESTIVAL");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_CYCLE_MODE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GOWIDGET_THEME_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_UPDATE_EXTREME_WEATHER");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_EXPIRED_EXTREME_WEATHER");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CLEAR_EXTREME_WEATHER");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CONVERT_INDEX_STATE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_INITIALIZED_CITY");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RELOAD_DATA");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        intentfilter.setPriority(1009);
        context.registerReceiver(F, intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
        intentfilter.addDataScheme("package");
        context.registerReceiver(I, intentfilter);
    }

    private void a(Cursor cursor)
    {
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        int i1;
        int j1;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        cursor.moveToFirst();
        i1 = cursor.getColumnIndex("setting_key");
        j1 = cursor.getColumnIndex("setting_value");
_L6:
        Object obj = cursor.getString(i1);
        if (!((String) (obj)).equals("tempUnit")) goto _L2; else goto _L1
_L1:
        f(cursor.getInt(j1));
_L4:
        if (!cursor.moveToNext())
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (((String) (obj)).equals("dateStyle"))
        {
            int k1 = cursor.getInt(j1);
            b = k1;
            g(k1);
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj)).equals("widgt_clock"))
        {
            E.a(cursor.getString(j1));
            continue; /* Loop/switch isn't completed */
        }
        if (!((String) (obj)).equals("world_clock"))
        {
            break MISSING_BLOCK_LABEL_214;
        }
        n = L();
        if (!n)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        obj = g;
        boolean flag;
        if (cursor.getInt(j1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            ((g) (obj)).a(flag);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
            return;
        }
        continue; /* Loop/switch isn't completed */
        g.a(false);
        continue; /* Loop/switch isn't completed */
        if (((String) (obj)).equals("windUnit"))
        {
            o = cursor.getInt(j1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(Cursor cursor, WeatherBean weatherbean)
    {
        int j1 = cursor.getColumnCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = cursor.getColumnName(i1);
            if (s1.equals("cityName"))
            {
                weatherbean.e(cursor.getString(i1));
            } else
            if (s1.equals("cityId"))
            {
                weatherbean.c(cursor.getString(i1));
            } else
            if (s1.equals("nowDesp"))
            {
                weatherbean.l.c(cursor.getString(i1));
            } else
            if (s1.equals("nowTempValue"))
            {
                weatherbean.l.b(cursor.getFloat(i1));
            } else
            if (s1.equals("lowTempValue"))
            {
                weatherbean.l.d(cursor.getFloat(i1));
            } else
            if (s1.equals("highTempValue"))
            {
                weatherbean.l.c(cursor.getFloat(i1));
            } else
            if (s1.equals("windDirection"))
            {
                weatherbean.l.a(cursor.getString(i1));
            } else
            if (s1.equals("windStrength"))
            {
                weatherbean.l.b(cursor.getString(i1));
            } else
            if (s1.equals("windType"))
            {
                weatherbean.l.g(cursor.getInt(i1));
            } else
            if (s1.equals("humidityValue"))
            {
                weatherbean.l.d(cursor.getInt(i1));
            } else
            if (s1.equals("type"))
            {
                weatherbean.l.e(cursor.getInt(i1));
            } else
            if (s1.equals("sequence"))
            {
                weatherbean.e(cursor.getInt(i1));
            } else
            if (s1.equals("city_my_location"))
            {
                weatherbean.a(cursor.getInt(i1));
            } else
            if (s1.equals("sunrise"))
            {
                weatherbean.l.d(cursor.getString(i1));
            } else
            if (s1.equals("sunset"))
            {
                weatherbean.l.e(cursor.getString(i1));
            } else
            if (s1.equals("tz_offset"))
            {
                weatherbean.l.h(cursor.getInt(i1));
            } else
            if (s1.equals("timestamp"))
            {
                weatherbean.l.b(cursor.getLong(i1));
            } else
            if (s1.endsWith("windStrengthValue"))
            {
                weatherbean.l.a(cursor.getFloat(i1));
            }
            i1++;
        }
    }

    static void a(e e1, int i1, int j1)
    {
        e1.a(i1, j1);
    }

    static void a(e e1, String s1)
    {
        e1.b(s1);
    }

    static void a(e e1, String s1, Cursor cursor)
    {
        e1.a(s1, cursor);
    }

    static void a(e e1, List list)
    {
        e1.b(list);
    }

    private void a(String s1)
    {
        f.a(16, s1, WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, "setting_key=?", new String[] {
            s1
        }, null);
    }

    private void a(String s1, Cursor cursor)
    {
        boolean flag = true;
        if (!TextUtils.isEmpty(s1) && cursor != null)
        {
            cursor.moveToFirst();
            int i1 = cursor.getColumnIndex("setting_value");
            if (i1 != -1 && cursor.getCount() != 0)
            {
                if (s1.equals("tempUnit"))
                {
                    f(cursor.getInt(i1));
                    return;
                }
                if (s1.equals("dateStyle"))
                {
                    i1 = cursor.getInt(i1);
                    b = i1;
                    g(i1);
                    return;
                }
                if (s1.equals("widgt_clock"))
                {
                    s1 = cursor.getString(i1);
                    E.a(s1);
                    return;
                }
                if (s1.equals("world_clock"))
                {
                    if (cursor.getInt(i1) != 1)
                    {
                        flag = false;
                    }
                    n = L();
                    if (n)
                    {
                        g.a(flag);
                    } else
                    {
                        g.a(false);
                    }
                    G();
                    return;
                }
                if (s1.equals("windUnit"))
                {
                    o = cursor.getInt(i1);
                    G();
                    return;
                }
            }
        }
    }

    private void a(List list)
    {
        f.a(11, list, WeatherContentProvider.j, null, null, null, null);
    }

    private boolean a(HourlyBean hourlybean)
    {
        s = t();
        return hourlybean.a() == s.year && hourlybean.b() - 1 == s.month && hourlybean.c() == s.monthDay && hourlybean.d() == s.hour;
    }

    static boolean a(e e1)
    {
        return e1.B;
    }

    static boolean a(e e1, Cursor cursor)
    {
        return e1.f(cursor);
    }

    static boolean a(e e1, boolean flag)
    {
        e1.n = flag;
        return flag;
    }

    private void b(Cursor cursor)
    {
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        int j1;
        j1 = cursor.getColumnCount();
        obj = cursor.getColumnNames();
        cursor.moveToFirst();
_L6:
        int i1;
        String s1 = cursor.getString(cursor.getColumnIndex("cityId"));
        i1 = k.indexOf(s1);
        if (i1 < 0) goto _L4; else goto _L3
_L3:
        if (i1 < j.size()) goto _L5; else goto _L4
_L4:
        boolean flag = cursor.moveToNext();
        if (flag) goto _L6; else goto _L2
_L2:
        if (cursor == null) goto _L8; else goto _L7
_L7:
        cursor.close();
_L8:
        Object obj1;
        w();
        return;
_L5:
        if ((obj1 = (WeatherBean)j.get(i1)) == null) goto _L4; else goto _L9
_L9:
        obj1 = ((WeatherBean) (obj1)).k();
        i1 = 0;
_L12:
        if (i1 >= j1) goto _L4; else goto _L10
_L10:
        if (obj[i1].equals("date_long"))
        {
            ((HourlyBean) (obj1)).a(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_437;
        }
        break MISSING_BLOCK_LABEL_163;
_L11:
        ((Exception) (obj)).printStackTrace();
        if (cursor == null) goto _L8; else goto _L7
label0:
        {
            if (obj[i1].equals("hour"))
            {
                ((HourlyBean) (obj1)).a(cursor.getInt(i1));
                break MISSING_BLOCK_LABEL_437;
            }
            try
            {
                if (obj[i1].equals("tempValue"))
                {
                    ((HourlyBean) (obj1)).a(cursor.getFloat(i1));
                    break MISSING_BLOCK_LABEL_437;
                }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                if (cursor != null)
                {
                    cursor.close();
                }
                throw obj;
            }
        }
          goto _L11
        if (obj[i1].equals("type"))
        {
            ((HourlyBean) (obj1)).c(cursor.getInt(i1));
            break MISSING_BLOCK_LABEL_437;
        }
        if (obj[i1].equals("windType"))
        {
            ((HourlyBean) (obj1)).d(cursor.getInt(i1));
            break MISSING_BLOCK_LABEL_437;
        }
        if (obj[i1].equals("windStrength"))
        {
            ((HourlyBean) (obj1)).c(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_437;
        }
        if (obj[i1].equals("windStrengthValue"))
        {
            ((HourlyBean) (obj1)).b(cursor.getFloat(i1));
            break MISSING_BLOCK_LABEL_437;
        }
        if (obj[i1].equals("status"))
        {
            ((HourlyBean) (obj1)).d(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_437;
        }
        if (obj[i1].equals("windDirection"))
        {
            ((HourlyBean) (obj1)).b(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_437;
        }
        if (obj[i1].equals("pop"))
        {
            ((HourlyBean) (obj1)).e(cursor.getInt(i1));
        }
        i1++;
          goto _L12
    }

    private void b(HourlyBean hourlybean)
    {
        Time time = new Time();
        time.set(0, 0, hourlybean.d(), hourlybean.c(), hourlybean.b() - 1, hourlybean.a());
        Time time1 = t();
        time1.set(0, 0, s.hour, s.monthDay, s.month, s.year);
        long l1 = time.toMillis(true) - time1.toMillis(true);
        if (l1 >= 0L && l1 < r)
        {
            r = l1;
            p = hourlybean;
            C = l.indexOf(p);
        }
    }

    static void b(e e1)
    {
        e1.G();
    }

    static void b(e e1, Cursor cursor)
    {
        e1.a(cursor);
    }

    static void b(e e1, String s1)
    {
        e1.a(s1);
    }

    static void b(e e1, List list)
    {
        e1.g(list);
    }

    private void b(String s1)
    {
        if (t != null)
        {
            Iterator iterator = t.iterator();
            while (iterator.hasNext()) 
            {
                ((h)iterator.next()).onScreenChange(s1);
            }
        }
    }

    private void b(List list)
    {
        if (list == null || list.isEmpty()) goto _L2; else goto _L1
_L1:
        ((Integer)list.remove(0)).intValue();
        JVM INSTR tableswitch 1 11: default 84
    //                   1 91
    //                   2 85
    //                   3 103
    //                   4 109
    //                   5 84
    //                   6 84
    //                   7 97
    //                   8 84
    //                   9 84
    //                   10 84
    //                   11 115;
           goto _L2 _L3 _L4 _L5 _L6 _L2 _L2 _L7 _L2 _L2 _L2 _L8
_L2:
        return;
_L4:
        f(list);
        return;
_L3:
        g(list);
        return;
_L7:
        c(list);
        return;
_L5:
        d(list);
        return;
_L6:
        e(list);
        return;
_L8:
        a(list);
        return;
    }

    static boolean b(e e1, boolean flag)
    {
        e1.e = flag;
        return flag;
    }

    static String c(e e1)
    {
        return e1.h;
    }

    private void c(Cursor cursor)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((WeatherBean)iterator.next()).g()) { }
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        int j1;
        j1 = cursor.getColumnCount();
        obj = cursor.getColumnNames();
        cursor.moveToFirst();
_L6:
        int i1;
        String s1 = cursor.getString(cursor.getColumnIndex("cityId"));
        i1 = k.indexOf(s1);
        if (i1 < 0) goto _L4; else goto _L3
_L3:
        if (i1 < j.size()) goto _L5; else goto _L4
_L4:
        boolean flag = cursor.moveToNext();
        if (flag) goto _L6; else goto _L2
_L2:
        Object obj1;
        cursor.close();
        G();
        return;
_L5:
        if ((obj1 = (WeatherBean)j.get(i1)) == null) goto _L4; else goto _L7
_L7:
        obj1 = ((WeatherBean) (obj1)).l();
        i1 = 0;
_L9:
        if (i1 >= j1) goto _L4; else goto _L8
_L8:
label0:
        {
            if (obj[i1].equals("lowTempValue"))
            {
                ((ForecastBean) (obj1)).a(cursor.getFloat(i1));
                break MISSING_BLOCK_LABEL_541;
            }
            try
            {
                if (obj[i1].equals("highTempValue"))
                {
                    ((ForecastBean) (obj1)).b(cursor.getFloat(i1));
                    break MISSING_BLOCK_LABEL_541;
                }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                cursor.close();
                throw obj;
            }
        }
        ((Exception) (obj)).printStackTrace();
          goto _L2
        if (obj[i1].equals("weekDate"))
        {
            ((ForecastBean) (obj1)).f(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("type"))
        {
            ((ForecastBean) (obj1)).c(cursor.getInt(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("windType"))
        {
            ((ForecastBean) (obj1)).d(cursor.getInt(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("status"))
        {
            ((ForecastBean) (obj1)).d(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("windDir"))
        {
            ((ForecastBean) (obj1)).g(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("windStrengthValue"))
        {
            ((ForecastBean) (obj1)).c(cursor.getFloat(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("windStrength"))
        {
            ((ForecastBean) (obj1)).h(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("status_day"))
        {
            ((ForecastBean) (obj1)).a(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("status_night"))
        {
            ((ForecastBean) (obj1)).b(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("date_long"))
        {
            ((ForecastBean) (obj1)).c(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_541;
        }
        if (obj[i1].equals("pop"))
        {
            ((ForecastBean) (obj1)).e(cursor.getInt(i1));
        }
        i1++;
          goto _L9
    }

    static void c(e e1, Cursor cursor)
    {
        e1.e(cursor);
    }

    static void c(e e1, String s1)
    {
        e1.c(s1);
    }

    static void c(e e1, List list)
    {
        e1.a(list);
    }

    private void c(String s1)
    {
        if (t != null)
        {
            Iterator iterator = t.iterator();
            while (iterator.hasNext()) 
            {
                ((h)iterator.next()).onAutoLocateFail(s1);
            }
        }
    }

    private void c(List list)
    {
        String s1 = (new StringBuilder()).append(d).append("").toString();
        f.a(7, list, WeatherContentProvider.E, new String[] {
            "city_id"
        }, "go_widget_id=?", new String[] {
            s1
        }, null);
    }

    static boolean c(e e1, boolean flag)
    {
        e1.K = flag;
        return flag;
    }

    static int d(e e1)
    {
        return e1.d;
    }

    private void d(Cursor cursor)
    {
        if (cursor != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        cursor.moveToFirst();
        if (cursor == null || cursor.getCount() <= 0) goto _L1; else goto _L3
_L3:
        k.clear();
        boolean flag1;
        do
        {
            k.add(cursor.getString(0));
            flag1 = cursor.moveToNext();
        } while (flag1);
_L5:
        boolean flag;
        cursor = new ArrayList();
        int j1 = j.size();
        int i1 = 0;
        flag = false;
        for (; i1 < j1; i1++)
        {
            String s1 = ((WeatherBean)j.get(i1)).c();
            if (!k.contains(s1))
            {
                if (i1 == i)
                {
                    flag = true;
                }
                cursor.add(j.get(i1));
            }
        }

        break; /* Loop/switch isn't completed */
        cursor;
        cursor.printStackTrace();
        if (true) goto _L5; else goto _L4
_L4:
        WeatherBean weatherbean;
        for (cursor = cursor.iterator(); cursor.hasNext(); j.remove(weatherbean))
        {
            weatherbean = (WeatherBean)cursor.next();
        }

        if (!flag && k.contains(h))
        {
            i = k.indexOf(h);
            q = (WeatherBean)j.get(i);
        } else
        {
            i = 0;
            h = (String)k.get(i);
            q = (WeatherBean)j.get(i);
        }
        G();
        return;
    }

    static void d(e e1, Cursor cursor)
    {
        e1.d(cursor);
    }

    private void d(List list)
    {
        f.a(3, list, WeatherContentProvider.e, new String[] {
            "cityId", "hour", "tempValue", "type", "windType", "windDirection", "windStrength", "windStrengthValue", "status", "windDirection", 
            "date_long"
        }, null, null, "cityId");
    }

    static boolean d(e e1, boolean flag)
    {
        e1.y = flag;
        return flag;
    }

    private void e(Cursor cursor)
    {
        int i1;
        i1 = 0;
        i = 0;
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int j1;
        cursor.moveToNext();
        h = cursor.getString(0);
        j1 = k.size();
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        if (!h.equals(k.get(i1))) goto _L5; else goto _L4
_L4:
        i = i1;
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void e(e e1, Cursor cursor)
    {
        e1.b(cursor);
    }

    private void e(List list)
    {
        f.a(4, list, WeatherContentProvider.b, new String[] {
            "cityId", "weekDate", "date", "lowTempValue", "highTempValue", "type", "windType", "windDir", "windStrength", "windStrengthValue", 
            "status", "status_day", "status_night", "date_long", "pop"
        }, null, null, "cityId");
    }

    static boolean e(e e1)
    {
        return e1.n;
    }

    static boolean e(e e1, boolean flag)
    {
        e1.x = flag;
        return flag;
    }

    static g f(e e1)
    {
        return e1.g;
    }

    private void f(int i1)
    {
        a = i1;
        if (t != null)
        {
            Iterator iterator = t.iterator();
            while (iterator.hasNext()) 
            {
                ((h)iterator.next()).onTemperatureUnitChange(i1);
            }
        }
    }

    static void f(e e1, Cursor cursor)
    {
        e1.c(cursor);
    }

    private void f(List list)
    {
        f.a(2, list, WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, "setting_key in ('tempUnit', 'calendarType', 'festival', 'isCycle', 'dateStyle', 'world_clock', 'widgt_clock', 'widgt_calendar', 'dynamic_icon_gowidget', 'windUnit')", null, null);
    }

    private boolean f(Cursor cursor)
    {
        if (B && !k.isEmpty())
        {
            B = false;
        }
        A = true;
        if (cursor == null || cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (j != null)
        {
            j.clear();
        }
        if (k != null)
        {
            k.clear();
        }
        cursor.moveToFirst();
_L8:
        WeatherBean weatherbean1;
        int j1;
        weatherbean1 = new WeatherBean();
        weatherbean1.h();
        a(cursor, weatherbean1);
        j1 = j.size();
        WeatherBean weatherbean;
        int i1;
        weatherbean = null;
        i1 = 0;
_L9:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_397;
        }
        if (!weatherbean1.c().equals(((WeatherBean)j.get(i1)).c())) goto _L4; else goto _L3
_L3:
        weatherbean = weatherbean1;
_L11:
        if (weatherbean != null) goto _L6; else goto _L5
_L5:
        j.add(weatherbean1);
        k.add(weatherbean1.c());
_L10:
        boolean flag = cursor.moveToNext();
        if (flag) goto _L8; else goto _L7
_L4:
        i1++;
          goto _L9
_L6:
        WeatherBean weatherbean2;
        try
        {
            weatherbean2 = (WeatherBean)j.get(i1);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
            break MISSING_BLOCK_LABEL_185;
        }
        if (weatherbean2 == null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        weatherbean1.a(weatherbean2.e());
        j.remove(i1);
        k.remove(weatherbean.c());
        j.add(weatherbean);
        k.add(weatherbean.c());
          goto _L10
_L2:
        return true;
_L7:
        if (k == null || k.size() < 1)
        {
            return false;
        }
        i = k.indexOf(h);
        if (i == -1)
        {
            i = 0;
            if (k != null && k.size() > i)
            {
                h = (String)k.get(i);
            }
        }
        q = (WeatherBean)j.get(i);
        return false;
        i1 = -1;
          goto _L11
    }

    static boolean f(e e1, boolean flag)
    {
        e1.z = flag;
        return flag;
    }

    private void g(int i1)
    {
        if (t != null)
        {
            Iterator iterator = t.iterator();
            while (iterator.hasNext()) 
            {
                ((h)iterator.next()).onDateStyleChange(i1);
            }
        }
    }

    private void g(List list)
    {
        f.a(1, list, WeatherContentProvider.a, new String[] {
            "cityName", "cityId", "nowTempValue", "highTempValue", "lowTempValue", "windDirection", "humidityValue", "nowDesp", "type", "sequence", 
            "city_my_location", "sunrise", "sunset", "tz_offset", "timestamp", "windStrengthValue"
        }, null, null, "sequence");
    }

    static boolean g(e e1)
    {
        return e1.e;
    }

    static void h(e e1)
    {
        e1.x();
    }

    static void i(e e1)
    {
        e1.H();
    }

    static void j(e e1)
    {
        e1.I();
    }

    static void k(e e1)
    {
        e1.C();
    }

    static void l(e e1)
    {
        e1.J();
    }

    static void m(e e1)
    {
        e1.A();
    }

    static void n(e e1)
    {
        e1.v();
    }

    static void o(e e1)
    {
        e1.y();
    }

    static Context p(e e1)
    {
        return e1.c;
    }

    static void q(e e1)
    {
        e1.B();
    }

    private void v()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(11));
        arraylist.add(Integer.valueOf(2));
        arraylist.add(Integer.valueOf(7));
        arraylist.add(Integer.valueOf(1));
        if (G == 0)
        {
            arraylist.add(Integer.valueOf(3));
        }
        arraylist.add(Integer.valueOf(4));
        b(arraylist);
    }

    private void w()
    {
        l.clear();
        r = 0x5265c00L;
        if (q.h != null)
        {
            Iterator iterator = q.h.iterator();
            boolean flag = false;
            while (iterator.hasNext()) 
            {
                HourlyBean hourlybean = (HourlyBean)iterator.next();
                if (hourlybean.a() != -10000 && hourlybean.b() != -10000 && hourlybean.c() != -10000 && hourlybean.d() != -10000 && com.gau.go.launcherex.gowidget.weather.util.q.a(hourlybean.b(a)) != -10000)
                {
                    HourlyBean hourlybean1 = new HourlyBean();
                    hourlybean1.a(hourlybean.b(2));
                    hourlybean1.a(hourlybean.a(), hourlybean.b(), hourlybean.c());
                    hourlybean1.a(hourlybean.d());
                    hourlybean1.b(hourlybean.f());
                    if (hourlybean.e() == -10000 || hourlybean.e() == 0)
                    {
                        hourlybean1.c(1);
                    } else
                    {
                        hourlybean1.c(hourlybean.e());
                    }
                    if (hourlybean.g().equals("--") || TextUtils.isEmpty(hourlybean.g()))
                    {
                        hourlybean1.d(c.getString(0x7f0801e2));
                    } else
                    {
                        hourlybean1.d(hourlybean.g());
                    }
                    l.add(hourlybean1);
                    if (!flag && a(hourlybean1))
                    {
                        p = hourlybean1;
                        C = l.indexOf(p);
                        r = 0L;
                        flag = true;
                    }
                    if (!flag)
                    {
                        b(hourlybean1);
                    }
                }
            }
        }
    }

    private void x()
    {
        if (D)
        {
            H = true;
        } else
        {
            D = true;
            if (w != null)
            {
                w();
                H();
                D = false;
                if (H)
                {
                    x();
                    H = false;
                    return;
                }
            }
        }
    }

    private void y()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(1));
        arraylist.add(Integer.valueOf(3));
        arraylist.add(Integer.valueOf(4));
        b(arraylist);
    }

    private void z()
    {
        k.clear();
        j.clear();
        q.h();
        q.g();
        q.f();
        l.clear();
        G();
    }

    public String a(WeatherBean weatherbean)
    {
        return weatherbean.l.e();
    }

    public void a()
    {
        E.a(c);
    }

    public void a(int i1)
    {
        D();
    }

    public void a(h h1)
    {
        if (t == null)
        {
            t = new ArrayList();
        }
        if (!t.contains(h1))
        {
            t.add(h1);
        }
        G();
    }

    public WeatherBean b(int i1)
    {
        int j1 = k.size();
        if (i1 < 0 || i1 >= j1)
        {
            return null;
        } else
        {
            return (WeatherBean)j.get(i1);
        }
    }

    public String b(WeatherBean weatherbean)
    {
        if (weatherbean != null)
        {
            if (weatherbean.l.a(a) == -10000F)
            {
                return "--";
            } else
            {
                return (new StringBuilder()).append(Math.round(weatherbean.l.a(a))).append("").toString();
            }
        } else
        {
            return null;
        }
    }

    public void b(h h1)
    {
        if (t.contains(h1))
        {
            t.remove(h1);
        }
    }

    public boolean b()
    {
        return DateFormat.is24HourFormat(c);
    }

    public String c(WeatherBean weatherbean)
    {
        weatherbean = null;
        if (a == 1)
        {
            weatherbean = "\260C";
        } else
        if (a == 2)
        {
            return "\260F";
        }
        return weatherbean;
    }

    public void c()
    {
        int j1;
        if (!K)
        {
            if ((j1 = j.size()) >= 1)
            {
                ArrayList arraylist = new ArrayList();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    WeatherBean weatherbean = (WeatherBean)j.get(i1);
                    if (weatherbean != null)
                    {
                        RequestBean requestbean = new RequestBean();
                        requestbean.a(weatherbean.c(), weatherbean.d(), weatherbean.l.g());
                        arraylist.add(requestbean);
                    }
                }

                if (!arraylist.isEmpty())
                {
                    Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
                    intent.putExtra("notify_request", 22);
                    intent.putParcelableArrayListExtra("req_arg", arraylist);
                    c.startService(intent);
                    return;
                }
            }
        }
    }

    public boolean c(int i1)
    {
        Object obj = b(i1);
        if (obj == null)
        {
            return true;
        }
        i1 = ((WeatherBean) (obj)).l.n();
        J = g.b(i1);
        String s1 = ((WeatherBean) (obj)).l.j();
        obj = ((WeatherBean) (obj)).l.k();
        if (g.d())
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, ((String) (obj)), J);
        } else
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, ((String) (obj)));
        }
    }

    public String d(WeatherBean weatherbean)
    {
        if (L == null)
        {
            L = c.getResources().getString(0x7f080294);
        }
        int i1 = weatherbean.l.c();
        if (i1 == -10000)
        {
            return L;
        } else
        {
            return (new StringBuilder()).append(L).append(" : ").append(i1).append("%").toString();
        }
    }

    public void d()
    {
        if (K)
        {
            K = false;
            J();
        }
    }

    public boolean d(int i1)
    {
        if (q == null)
        {
            return false;
        } else
        {
            String s1 = q.l.j();
            String s2 = q.l.k();
            return com.gau.go.launcherex.gowidget.weather.util.r.a(i1, com.gau.go.launcherex.gowidget.weather.util.r.a(true, s1), com.gau.go.launcherex.gowidget.weather.util.r.a(false, s2));
        }
    }

    public HourlyBean e(int i1)
    {
        i1 = i1 * 4 + C;
        if (i1 > 0 && i1 < l.size())
        {
            return (HourlyBean)l.get(i1);
        } else
        {
            return null;
        }
    }

    public String e(WeatherBean weatherbean)
    {
        if (M == null)
        {
            M = c.getResources().getString(0x7f08028f);
        }
        String s1 = null;
        int i1;
        if (a == 1)
        {
            s1 = "\260C";
        } else
        if (a == 2)
        {
            s1 = "\260F";
        }
        i1 = Math.round(weatherbean.l.b(a));
        if (!com.gau.go.launcherex.gowidget.weather.util.r.b(i1))
        {
            return "--";
        } else
        {
            return (new StringBuilder()).append(M).append(i1).append(s1).toString();
        }
    }

    public void e()
    {
        c.unregisterReceiver(I);
        c.unregisterReceiver(F);
        m.unregisterContentObserver(v);
        g.b();
    }

    public String f(WeatherBean weatherbean)
    {
        if (N == null)
        {
            N = c.getResources().getString(0x7f080595);
        }
        String s1 = null;
        int i1;
        if (a == 1)
        {
            s1 = "\260C";
        } else
        if (a == 2)
        {
            s1 = "\260F";
        }
        i1 = Math.round(weatherbean.l.c(a));
        if (!com.gau.go.launcherex.gowidget.weather.util.r.b(i1))
        {
            return "--";
        } else
        {
            return (new StringBuilder()).append(N).append(i1).append(s1).toString();
        }
    }

    public void f()
    {
        int i1 = k.size();
        if (i1 < 2)
        {
            return;
        } else
        {
            i = (i + 1) % i1;
            h = (String)k.get(i);
            q = (WeatherBean)j.get(i);
            E();
            w();
            G();
            return;
        }
    }

    public int g()
    {
        int i1 = k.size();
        if (i1 < 2)
        {
            return i;
        } else
        {
            i = (i + 1) % i1;
            h = (String)k.get(i);
            q = (WeatherBean)j.get(i);
            E();
            return i;
        }
    }

    public String g(WeatherBean weatherbean)
    {
        if (weatherbean == null)
        {
            return null;
        }
        if (O == null)
        {
            O = c.getResources().getString(0x7f080291);
        }
        if (P == null)
        {
            P = c.getResources().getString(0x7f080293);
        }
        int i1 = o;
        String s1 = weatherbean.l.b();
        if (!com.gau.go.launcherex.gowidget.weather.util.r.a(s1))
        {
            return "--";
        }
        float f1 = weatherbean.l.a();
        if (!com.gau.go.launcherex.gowidget.weather.util.r.b(f1))
        {
            return (new StringBuilder()).append(O).append(" : ").append(s1).toString();
        }
        if (i1 == 1)
        {
            weatherbean = (new StringBuilder()).append(com.gau.go.launcherex.gowidget.weather.util.q.c(f1, 1)).append(" ").append(c.getResources().getString(0x7f0801ff)).toString();
        } else
        if (i1 == 4)
        {
            weatherbean = (new StringBuilder()).append(com.gau.go.launcherex.gowidget.weather.util.q.e(f1, 1)).append(" ").append(c.getResources().getString(0x7f080202)).toString();
        } else
        if (i1 == 3)
        {
            weatherbean = (new StringBuilder()).append(com.gau.go.launcherex.gowidget.weather.util.q.d(f1, 1)).append(" ").append(c.getResources().getString(0x7f080201)).toString();
        } else
        if (i1 == 5)
        {
            weatherbean = String.format(c.getResources().getString(0x7f080215), new Object[] {
                Integer.valueOf(com.gau.go.launcherex.gowidget.weather.util.q.a(f1))
            });
        } else
        if (i1 == 6)
        {
            weatherbean = (new StringBuilder()).append(com.gau.go.launcherex.gowidget.weather.util.q.f(f1, 1)).append(" ").append(c.getResources().getString(0x7f080204)).toString();
        } else
        {
            weatherbean = (new StringBuilder()).append(f1).append(" ").append(c.getResources().getString(0x7f080200)).toString();
        }
        return (new StringBuilder()).append(O).append(" : ").append(weatherbean).append(" , ").append(s1).toString();
    }

    public int h()
    {
        int i1 = k.size();
        if (i1 < 2)
        {
            return i;
        } else
        {
            i = ((i - 1) + i1) % i1;
            h = (String)k.get(i);
            q = (WeatherBean)j.get(i);
            E();
            return i;
        }
    }

    public int i()
    {
        if (k == null)
        {
            return 0;
        } else
        {
            return k.size();
        }
    }

    public int j()
    {
        return i;
    }

    public String k()
    {
        return h;
    }

    public int l()
    {
        return q.e();
    }

    public String m()
    {
        if (q != null && j.size() > 0 && q.d() != null)
        {
            return q.d();
        }
        if (!y && x)
        {
            if (!z && A)
            {
                z = true;
                F();
            }
            if (z)
            {
                return c.getResources().getString(0x7f080517);
            } else
            {
                return c.getResources().getString(0x7f080516);
            }
        } else
        {
            return c.getResources().getString(0x7f080514);
        }
    }

    public List n()
    {
        if (q != null)
        {
            return q.g;
        } else
        {
            return null;
        }
    }

    public boolean o()
    {
        if (q == null)
        {
            return true;
        } else
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(q.l.j(), q.l.k());
        }
    }

    public NowBean p()
    {
        if (q != null)
        {
            return q.l;
        } else
        {
            return null;
        }
    }

    public void q()
    {
        if (!L() || !g.d() || q == null)
        {
            s = K();
            return;
        } else
        {
            s = t();
            return;
        }
    }

    public int r()
    {
        return s.hour;
    }

    public int s()
    {
        return s.minute;
    }

    public Time t()
    {
        if (q != null)
        {
            int i1 = q.l.n();
            return g.b(i1);
        } else
        {
            return g.c();
        }
    }

    public int u()
    {
        return d;
    }

}
