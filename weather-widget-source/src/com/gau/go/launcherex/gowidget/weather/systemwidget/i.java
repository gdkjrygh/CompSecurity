// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.v;
import com.gau.go.launcherex.gowidget.weather.util.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            k, j, l

public class i
{

    private static volatile i b;
    public boolean a;
    private k c;
    private ArrayList d;
    private Context e;
    private j f;
    private boolean g;
    private ArrayList h;

    private i(Context context)
    {
        d = new ArrayList();
        g = false;
        a = false;
        h = new ArrayList();
        e = context.getApplicationContext();
        c = new k(e.getContentResolver(), this);
        f = new j(this);
        context = new IntentFilter();
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ADD_CITY");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RELOAD_DATA");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CONVERT_INDEX_STATE");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION");
        e.registerReceiver(f, context);
        c();
    }

    static Context a(i i1)
    {
        return i1.e;
    }

    private WeatherBean a(String s)
    {
        if (d.isEmpty())
        {
            return null;
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            WeatherBean weatherbean = (WeatherBean)iterator.next();
            if (weatherbean.c().equals(s))
            {
                return weatherbean;
            }
        }

        return null;
    }

    public static i a(Context context)
    {
        com/gau/go/launcherex/gowidget/weather/systemwidget/i;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new i(context);
        }
        context = b;
        com/gau/go/launcherex/gowidget/weather/systemwidget/i;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a(Context context, Intent intent)
    {
        context = (new v()).a(intent);
        if (context == null) goto _L2; else goto _L1
_L1:
        ((w) (context)).a;
        JVM INSTR lookupswitch 3: default 56
    //                   1: 57
    //                   2: 56
    //                   11: 56;
           goto _L2 _L3 _L2 _L2
_L2:
        return;
_L3:
        c.startQuery(1, null, WeatherContentProvider.a, new String[] {
            "cityName", "cityId", "nowTempValue", "highTempValue", "lowTempValue", "windDirection", "windStrength", "windStrengthValue", "nowDesp", "type", 
            "city_my_location", "sunrise", "sunset", "tz_offset", "updateTime", "sequence"
        }, null, null, "sequence");
        return;
    }

    private void a(Cursor cursor)
    {
        d(cursor);
    }

    private void a(Cursor cursor, WeatherBean weatherbean)
    {
        int j1 = cursor.getColumnCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s = cursor.getColumnName(i1);
            if (s.equals("cityName"))
            {
                weatherbean.e(cursor.getString(i1));
            } else
            if (s.equals("cityId"))
            {
                weatherbean.c(cursor.getString(i1));
            } else
            if (s.equals("nowDesp"))
            {
                weatherbean.l.c(cursor.getString(i1));
            } else
            if (s.equals("nowTempValue"))
            {
                weatherbean.l.b(cursor.getFloat(i1));
            } else
            if (s.equals("lowTempValue"))
            {
                weatherbean.l.d(cursor.getFloat(i1));
            } else
            if (s.equals("highTempValue"))
            {
                weatherbean.l.c(cursor.getFloat(i1));
            } else
            if (s.equals("windDirection"))
            {
                weatherbean.l.a(cursor.getString(i1));
            } else
            if (s.equals("windStrengthValue"))
            {
                weatherbean.l.a(cursor.getFloat(i1));
            } else
            if (s.equals("type"))
            {
                weatherbean.l.e(cursor.getInt(i1));
            } else
            if (s.equals("city_my_location"))
            {
                weatherbean.a(cursor.getInt(i1));
            } else
            if (s.equals("sunrise"))
            {
                weatherbean.l.d(cursor.getString(i1));
            } else
            if (s.equals("sunset"))
            {
                weatherbean.l.e(cursor.getString(i1));
            } else
            if (s.equals("tz_offset"))
            {
                weatherbean.l.h(cursor.getInt(i1));
            } else
            if (s.equals("updateTime"))
            {
                weatherbean.l.a(cursor.getLong(i1));
            } else
            if (s.equals("timestamp"))
            {
                weatherbean.l.b(cursor.getLong(i1));
            } else
            if (s.equals("sequence"))
            {
                weatherbean.e(cursor.getInt(i1));
            }
            i1++;
        }
    }

    static void a(i i1, Context context, Intent intent)
    {
        i1.a(context, intent);
    }

    static void a(i i1, Cursor cursor)
    {
        i1.d(cursor);
    }

    static boolean a(i i1, boolean flag)
    {
        i1.g = flag;
        return flag;
    }

    public static void b()
    {
        if (b != null)
        {
            b.i();
            b = null;
        }
    }

    private void b(Cursor cursor)
    {
        Object obj;
        Object obj1;
        obj = "";
        obj1 = "";
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        cursor.moveToFirst();
        int i1 = -1;
_L13:
        int k1 = cursor.getColumnCount();
        int j1 = 0;
_L15:
        if (j1 >= k1) goto _L4; else goto _L3
_L3:
        Object obj2;
        obj2 = cursor.getColumnName(j1);
        if (!((String) (obj2)).endsWith("cityId"))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        obj2 = cursor.getString(j1);
        obj = obj1;
        obj1 = obj2;
        break MISSING_BLOCK_LABEL_300;
        if (!((String) (obj2)).endsWith("cityName"))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj2 = cursor.getString(j1);
        obj1 = obj;
        obj = obj2;
        break MISSING_BLOCK_LABEL_300;
        if (!((String) (obj2)).endsWith("sequence")) goto _L6; else goto _L5
_L5:
        i1 = cursor.getInt(j1);
        obj2 = obj;
        obj = obj1;
        obj1 = obj2;
        break MISSING_BLOCK_LABEL_300;
_L4:
        obj2 = d.iterator();
_L10:
        if (!((Iterator) (obj2)).hasNext()) goto _L8; else goto _L7
_L7:
        if (!((WeatherBean)((Iterator) (obj2)).next()).c().equals(obj)) goto _L10; else goto _L9
_L9:
        j1 = 1;
_L14:
        if (j1 != 0) goto _L12; else goto _L11
_L11:
        obj2 = new WeatherBean();
        ((WeatherBean) (obj2)).c(((String) (obj)));
        ((WeatherBean) (obj2)).e(((String) (obj1)));
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        ((WeatherBean) (obj2)).e(i1);
        ((WeatherBean) (obj2)).a(1);
        ((WeatherBean) (obj2)).g();
        d.add(obj2);
_L2:
        cursor.close();
        return;
_L12:
        boolean flag = cursor.moveToNext();
        if (flag) goto _L13; else goto _L2
        obj;
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        return;
        obj;
        cursor.close();
        throw obj;
_L8:
        j1 = 0;
          goto _L14
_L6:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        j1++;
        Object obj4 = obj1;
        obj1 = obj;
        obj = obj4;
          goto _L15
    }

    static void b(i i1)
    {
        i1.e();
    }

    static void b(i i1, Cursor cursor)
    {
        i1.e(cursor);
    }

    private void c()
    {
        if (!g)
        {
            g = true;
            c.startQuery(1, null, WeatherContentProvider.a, new String[] {
                "cityName", "cityId", "nowTempValue", "highTempValue", "lowTempValue", "windDirection", "windStrength", "windStrengthValue", "nowDesp", "type", 
                "city_my_location", "sunrise", "sunset", "tz_offset", "updateTime", "sequence"
            }, null, null, "sequence");
        }
    }

    private void c(Cursor cursor)
    {
        Object obj = new ArrayList();
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        cursor.moveToFirst();
_L3:
        int j1 = cursor.getColumnCount();
        Exception exception;
        Object obj1;
        Exception exception1;
        Object obj2;
        Object obj3;
        String s;
        boolean flag;
        for (int i1 = 0; i1 >= j1; i1++)
        {
            break MISSING_BLOCK_LABEL_76;
        }

        if (cursor.getColumnName(i1).endsWith("cityId"))
        {
            ((List) (obj)).add(cursor.getString(i1));
        }
        break MISSING_BLOCK_LABEL_373;
        flag = cursor.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        cursor.close();
_L7:
        cursor = new ArrayList();
        obj1 = d.iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_226;
        }
        obj2 = (WeatherBean)((Iterator) (obj1)).next();
        obj3 = ((List) (obj)).iterator();
        i1 = 0;
        while (((Iterator) (obj3)).hasNext()) 
        {
            s = (String)((Iterator) (obj3)).next();
            if (((WeatherBean) (obj2)).c().equals(s))
            {
                i1 = 1;
            }
        }
        break MISSING_BLOCK_LABEL_206;
        exception1;
        exception1.printStackTrace();
        cursor.close();
        continue; /* Loop/switch isn't completed */
        exception;
        cursor.close();
        throw exception;
        if (i1 == 0)
        {
            cursor.add(((WeatherBean) (obj2)).c());
        }
        if (true) goto _L5; else goto _L4
_L4:
        exception = new ArrayList();
        for (cursor = cursor.iterator(); cursor.hasNext();)
        {
            exception1 = (String)cursor.next();
            obj2 = d.iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                obj3 = (WeatherBean)((Iterator) (obj2)).next();
                if (((WeatherBean) (obj3)).c().equals(exception1))
                {
                    exception.add(obj3);
                }
            }
        }

        for (cursor = exception.iterator(); cursor.hasNext();)
        {
            exception = (WeatherBean)cursor.next();
            if (exception.e() == 3)
            {
                exception.a(2);
            } else
            {
                d.remove(exception);
            }
        }

        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void c(i i1)
    {
        i1.f();
    }

    static void c(i i1, Cursor cursor)
    {
        i1.b(cursor);
    }

    private void d()
    {
        c.startQuery(2, null, WeatherContentProvider.b, new String[] {
            "cityId", "weekDate", "date", "lowTempValue", "highTempValue", "type", "date_long"
        }, null, null, "cityId");
    }

    private void d(Cursor cursor)
    {
        if (cursor == null)
        {
            return;
        }
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        d.clear();
        cursor.moveToFirst();
        boolean flag;
        do
        {
            WeatherBean weatherbean = new WeatherBean();
            a(cursor, weatherbean);
            weatherbean.g();
            d.add(weatherbean);
            flag = cursor.moveToNext();
        } while (flag);
        try
        {
            cursor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
        }
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        try
        {
            cursor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
        }
        return;
        obj;
        try
        {
            cursor.close();
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
        }
        throw obj;
    }

    static void d(i i1)
    {
        i1.g();
    }

    static void d(i i1, Cursor cursor)
    {
        i1.c(cursor);
    }

    private void e()
    {
        c.startQuery(3, null, WeatherContentProvider.a, new String[] {
            "cityName", "cityId", "sequence"
        }, null, null, "sequence");
    }

    private void e(Cursor cursor)
    {
        if (cursor == null)
        {
            return;
        }
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        int j1;
        j1 = cursor.getColumnCount();
        obj = cursor.getColumnNames();
        cursor.moveToFirst();
_L7:
        WeatherBean weatherbean;
        ForecastBean forecastbean;
        weatherbean = a(cursor.getString(cursor.getColumnIndex("cityId")));
        forecastbean = new ForecastBean();
        int i1 = 0;
_L8:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        if (obj[i1].equals("lowTempValue"))
        {
            forecastbean.a(cursor.getFloat(i1));
            break MISSING_BLOCK_LABEL_469;
        }
        if (obj[i1].equals("highTempValue"))
        {
            forecastbean.b(cursor.getFloat(i1));
            break MISSING_BLOCK_LABEL_469;
        }
          goto _L5
_L6:
        ((Exception) (obj)).printStackTrace();
        try
        {
            cursor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
        }
        return;
_L5:
        if (obj[i1].equals("weekDate"))
        {
            forecastbean.f(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_469;
        }
        if (obj[i1].equals("date"))
        {
            forecastbean.e(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_469;
        }
        if (obj[i1].equals("type"))
        {
            forecastbean.c(cursor.getInt(i1));
            break MISSING_BLOCK_LABEL_469;
        }
        if (obj[i1].equals("date_long"))
        {
            forecastbean.c(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_469;
        }
        if (obj[i1].equals("windType"))
        {
            forecastbean.d(cursor.getInt(i1));
            break MISSING_BLOCK_LABEL_469;
        }
        if (obj[i1].equals("status"))
        {
            forecastbean.d(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_469;
        }
        if (obj[i1].equals("windDir"))
        {
            forecastbean.g(cursor.getString(i1));
            break MISSING_BLOCK_LABEL_469;
        }
        try
        {
            if (obj[i1].equals("windStrengthValue"))
            {
                forecastbean.c(cursor.getInt(i1));
            }
            break MISSING_BLOCK_LABEL_469;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            boolean flag;
            try
            {
                cursor.close();
            }
            // Misplaced declaration of an exception variable
            catch (Cursor cursor)
            {
                cursor.printStackTrace();
            }
            throw obj;
        }
        if (true) goto _L6; else goto _L4
_L4:
        if (weatherbean == null)
        {
            break MISSING_BLOCK_LABEL_435;
        }
        if (forecastbean.e() != -10000 && forecastbean.f() != -10000 && forecastbean.g() != -10000)
        {
            weatherbean.g.add(forecastbean);
        }
        flag = cursor.moveToNext();
        if (flag) goto _L7; else goto _L2
_L2:
        try
        {
            cursor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
        }
        return;
        i1++;
          goto _L8
    }

    static void e(i i1)
    {
        i1.c();
    }

    static void e(i i1, Cursor cursor)
    {
        i1.a(cursor);
    }

    static ArrayList f(i i1)
    {
        return i1.d;
    }

    private void f()
    {
        c.startQuery(4, null, WeatherContentProvider.a, new String[] {
            "cityId"
        }, null, null, "sequence");
    }

    private void g()
    {
        c.startQuery(5, null, WeatherContentProvider.a, new String[] {
            "cityName", "cityId", "nowTempValue", "highTempValue", "windDirection", "windStrength", "windStrengthValue", "lowTempValue", "nowDesp", "type", 
            "city_my_location", "sunrise", "sunset", "tz_offset", "updateTime", "sequence"
        }, null, null, "sequence");
    }

    static void g(i i1)
    {
        i1.h();
    }

    private void h()
    {
        for (Iterator iterator = (new ArrayList(h)).iterator(); iterator.hasNext(); ((l)iterator.next()).a(a())) { }
    }

    static void h(i i1)
    {
        i1.d();
    }

    private void i()
    {
        e.unregisterReceiver(f);
        h.clear();
        d.clear();
        g = false;
        a = false;
    }

    public ArrayList a()
    {
        return d;
    }

    public void a(l l1)
    {
        if (l1 != null && !h.contains(l1))
        {
            h.add(l1);
        }
    }

    public void b(l l1)
    {
        h.remove(l1);
    }
}
