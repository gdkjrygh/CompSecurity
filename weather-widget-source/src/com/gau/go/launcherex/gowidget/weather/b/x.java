// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.ExtremeCityIdBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.view.WeatherDetailActivity;
import com.jiubang.core.b.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            y, z

public class x
{

    private static int a = 4;
    private static x d;
    private Context b;
    private NotificationManager c;
    private u e;
    private y f;
    private SharedPreferences g;

    private x(Context context)
    {
        c = null;
        b = context.getApplicationContext();
        c = (NotificationManager)b.getSystemService("notification");
        e = com.gau.go.launcherex.gowidget.weather.c.c.a(context.getApplicationContext()).f().a();
        f = new y(this);
        g = GoWidgetApplication.c(context.getApplicationContext()).a();
    }

    static int a()
    {
        int i = a;
        a = i + 1;
        return i;
    }

    private PendingIntent a(Context context, String s, int i)
    {
        return PendingIntent.getActivity(context, i, WeatherDetailActivity.a(b, s, true, 11, "", 7), 0x8000000);
    }

    static PendingIntent a(x x1, Context context, String s, int i)
    {
        return x1.a(context, s, i);
    }

    static u a(x x1)
    {
        return x1.e;
    }

    private String a(long l)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm Z", Locale.ENGLISH);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT+0800"));
        return simpledateformat.format(new Date(l));
    }

    static String a(x x1, long l)
    {
        return x1.a(l);
    }

    public static void a(Context context)
    {
        if (d == null)
        {
            d = new x(context);
        }
        context = d.b();
        d.a(((List) (context)));
        d.b(context);
    }

    static void a(x x1, u u1)
    {
        x1.a(u1);
    }

    static void a(x x1, List list)
    {
        x1.c(list);
    }

    private void a(u u1)
    {
        TypedArray typedarray = b.obtainStyledAttributes(0x1030068, new int[] {
            0x1010098
        });
        int i = typedarray.getColor(0, 0);
        typedarray.recycle();
        if ((0xffffff & i) < 0x7fffff)
        {
            u1.C = "notification_style_default_white";
        } else
        {
            u1.C = "notification_style_default_black";
        }
        com.gau.go.launcherex.gowidget.weather.c.c.a(b.getApplicationContext()).f().a("notification_style", u1.C);
    }

    private void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); ((z)list.next()).a()) { }
    }

    private boolean a(int i, int j, int k)
    {
        while (i == -10000 || j == -10000 || i - j < k) 
        {
            return false;
        }
        return true;
    }

    static boolean a(x x1, int i, int j, int k)
    {
        return x1.a(i, j, k);
    }

    static Context b(x x1)
    {
        return x1.b;
    }

    private List b()
    {
        Object obj = e.K;
        ArrayList arraylist;
        Iterator iterator;
        z z1;
        int i;
        int j;
        int k;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (((String) (obj)).contains("#"))
            {
                try
                {
                    obj = ((String) (obj)).split("#");
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (com.gtp.a.a.b.c.a())
                    {
                        ((Exception) (obj)).printStackTrace();
                    }
                    obj = null;
                }
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
        i = g.getInt("key_temp_change_extreme_decrease_id", -1);
        arraylist = new ArrayList();
        iterator = com.gau.go.launcherex.gowidget.weather.c.c.a(b.getApplicationContext()).h().d().iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        z1 = new z(this, (WeatherBean)iterator.next());
        z1.b = true;
        if (obj == null) goto _L4; else goto _L3
_L3:
        k = obj.length;
        j = 0;
_L8:
        if (j >= k) goto _L4; else goto _L5
_L5:
        if (!obj[j].equals(z1.n)) goto _L7; else goto _L6
_L6:
        z1.b = false;
_L4:
        z1.o.c(i);
        arraylist.add(z1);
        i--;
        continue; /* Loop/switch isn't completed */
_L7:
        j++;
        if (true) goto _L8; else goto _L2
_L2:
        obj = g.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putInt("key_temp_change_extreme_decrease_id", i);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        return arraylist;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_73;
_L9:
    }

    private void b(List list)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            z z1 = (z)list.next();
            if (com.gau.go.launcherex.gowidget.weather.b.z.a(z1, arraylist))
            {
                arraylist1.add(z1.o);
            }
        } while (true);
        if (arraylist.size() > 0)
        {
            f.a(1, arraylist1, "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
        }
    }

    static NotificationManager c(x x1)
    {
        return x1.c;
    }

    private void c(List list)
    {
        ArrayList arraylist = new ArrayList();
        f f1 = com.gau.go.launcherex.gowidget.weather.c.c.a(b.getApplicationContext()).h();
        Object obj;
        for (list = list.iterator(); list.hasNext(); arraylist.add(obj))
        {
            com.gau.go.launcherex.gowidget.weather.model.c c1 = (com.gau.go.launcherex.gowidget.weather.model.c)list.next();
            obj = f1.a(c1.j());
            if (obj != null)
            {
                ((WeatherBean) (obj)).m.put(Integer.valueOf(c1.k()), c1);
            }
            obj = new ExtremeCityIdBean();
            ((ExtremeCityIdBean) (obj)).a(c1.j());
            ((ExtremeCityIdBean) (obj)).a(c1.k());
        }

        list = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_UPDATE_EXTREME_WEATHER");
        list.putParcelableArrayListExtra("extra_extreme_city_ids", arraylist);
        b.sendBroadcast(list);
    }

}
