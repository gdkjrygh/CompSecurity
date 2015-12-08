// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            g, f, h

public class e
{

    private static volatile e b;
    public boolean a;
    private g c;
    private Context d;
    private u e;
    private f f;
    private boolean g;
    private ArrayList h;

    private e(Context context)
    {
        e = new u();
        g = false;
        a = false;
        h = new ArrayList();
        d = context.getApplicationContext();
        c = new g(d.getContentResolver(), this);
        f = new f(this);
        context = new IntentFilter();
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PACKAGE_REMOVED");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APPWIDGET_THEME_CHANGE");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LUNAR");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FESTIVAL");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATESTYLE_UNIT");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION");
        context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        d.registerReceiver(f, context);
        c();
    }

    public static e a(Context context)
    {
        com/gau/go/launcherex/gowidget/weather/systemwidget/e;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new e(context);
        }
        context = b;
        com/gau/go/launcherex/gowidget/weather/systemwidget/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static g a(e e1)
    {
        return e1.c;
    }

    private void a(Cursor cursor)
    {
        boolean flag;
        flag = true;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        u u1;
        cursor.moveToFirst();
        u1 = e;
        if (cursor.getInt(0) != 1)
        {
            flag = false;
        }
        u1.J = flag;
        cursor.close();
        return;
        cursor;
        cursor.printStackTrace();
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

    static void a(e e1, Cursor cursor)
    {
        e1.a(cursor);
    }

    static void a(e e1, String s)
    {
        e1.a(s);
    }

    static void a(e e1, String s, Cursor cursor)
    {
        e1.a(s, cursor);
    }

    private void a(String s)
    {
        c.startQuery(3, s, WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, "setting_key=?", new String[] {
            s
        }, null);
    }

    private void a(String s, Cursor cursor)
    {
        if (TextUtils.isEmpty(s) || cursor == null)
        {
            return;
        }
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int i;
        cursor.moveToFirst();
        i = cursor.getColumnIndex("setting_value");
        if (i == -1) goto _L2; else goto _L3
_L3:
        if (!s.equals("world_clock")) goto _L5; else goto _L4
_L4:
        e.r = cursor.getInt(i);
_L7:
        b(s);
_L2:
        try
        {
            cursor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
_L5:
        if (s.equals("tempUnit"))
        {
            i = cursor.getInt(i);
            if (e.g != i)
            {
                e.g = i;
            }
        } else
        if (s.equals("windUnit"))
        {
            i = cursor.getInt(i);
            if (e.q != i)
            {
                e.q = i;
            }
        } else
        if (s.equals("app_widget_theme"))
        {
            String s1 = cursor.getString(i);
            if (!e.G.equals(s1))
            {
                e.G = s1;
            }
        } else
        if (s.equals("auto_location"))
        {
            i = cursor.getInt(i);
            if (e.b != i)
            {
                e.b = i;
            }
        } else
        if (s.equals("dateStyle"))
        {
            i = cursor.getInt(i);
            if (e.k != i)
            {
                e.k = i;
            }
        } else
        if (s.equals("widgt_calendar"))
        {
            String s2 = cursor.getString(i);
            if (!TextUtils.isEmpty(s2) && !e.I.equals(s2))
            {
                e.I = s2;
            }
        } else
        if (s.equals("widgt_clock"))
        {
            String s3 = cursor.getString(i);
            if (!TextUtils.isEmpty(s3) && !e.H.equals(s3))
            {
                e.H = s3;
            }
        } else
        if (s.equals("calendarType"))
        {
            i = cursor.getInt(i);
            if (e.h != i)
            {
                e.h = i;
            }
        } else
        if (s.equals("festival"))
        {
            i = cursor.getInt(i);
            if (e.i != i)
            {
                e.i = i;
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    static boolean a(e e1, boolean flag)
    {
        e1.g = flag;
        return flag;
    }

    public static void b()
    {
        if (b != null)
        {
            b.d();
            b = null;
        }
    }

    private void b(Cursor cursor)
    {
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        cursor.moveToFirst();
        i = cursor.getColumnIndex("setting_key");
        j = cursor.getColumnIndex("setting_value");
_L5:
        Object obj;
        obj = cursor.getString(i);
        if (((String) (obj)).equals("tempUnit"))
        {
            e.g = cursor.getInt(j);
        }
        if (!((String) (obj)).equals("windUnit")) goto _L4; else goto _L3
_L3:
        e.q = cursor.getInt(j);
_L6:
        boolean flag = cursor.moveToNext();
        if (flag) goto _L5; else goto _L2
_L2:
        cursor.close();
        return;
_L4:
        if (!((String) (obj)).equals("calendarType"))
        {
            break MISSING_BLOCK_LABEL_150;
        }
        e.h = cursor.getInt(j);
          goto _L6
        obj;
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        return;
        if (!((String) (obj)).equals("festival"))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        e.i = cursor.getInt(j);
          goto _L6
        obj;
        cursor.close();
        throw obj;
label0:
        {
            if (!((String) (obj)).equals("dateStyle"))
            {
                break label0;
            }
            e.k = cursor.getInt(j);
        }
          goto _L6
label1:
        {
            if (!((String) (obj)).equals("world_clock"))
            {
                break label1;
            }
            e.r = cursor.getInt(j);
        }
          goto _L6
label2:
        {
            if (!((String) (obj)).equals("widgt_calendar"))
            {
                break label2;
            }
            obj = cursor.getString(j);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                e.I = ((String) (obj));
            }
        }
          goto _L6
label3:
        {
            if (!((String) (obj)).equals("widgt_clock"))
            {
                break label3;
            }
            obj = cursor.getString(j);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                e.H = ((String) (obj));
            }
        }
          goto _L6
        if (!((String) (obj)).equals("app_widget_theme")) goto _L8; else goto _L7
_L7:
        e.G = cursor.getString(j);
          goto _L6
_L8:
        if (!((String) (obj)).equals("auto_location")) goto _L6; else goto _L9
_L9:
        e.b = cursor.getInt(j);
          goto _L6
    }

    static void b(e e1, Cursor cursor)
    {
        e1.b(cursor);
    }

    static void b(e e1, String s)
    {
        e1.b(s);
    }

    private void b(String s)
    {
        for (Iterator iterator = (new ArrayList(h)).iterator(); iterator.hasNext(); ((h)iterator.next()).a(s, a())) { }
    }

    private void c()
    {
        if (!g)
        {
            g = true;
            c.startQuery(1, "need_query_setting", WeatherContentProvider.j, null, null, null, null);
        }
    }

    private void d()
    {
        d.unregisterReceiver(f);
        h.clear();
        g = false;
        a = false;
    }

    public u a()
    {
        return e;
    }

    public void a(h h1)
    {
        if (h1 != null && !h.contains(h1))
        {
            h.add(h1);
        }
    }

    public void b(h h1)
    {
        h.remove(h1);
    }
}
