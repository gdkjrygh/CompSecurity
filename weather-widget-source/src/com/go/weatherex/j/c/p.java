// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.e;
import com.gau.go.launcherex.gowidget.weather.systemwidget.m;
import com.gau.go.launcherex.gowidget.weather.view.t;
import com.go.weatherex.common.PackageEventReceiver;
import com.go.weatherex.j.h;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.go.weatherex.j.c:
//            q, e

public class p extends com.go.weatherex.j.p
{

    private static p j;
    private final List k = new ArrayList();
    private final PackageEventReceiver l = new PackageEventReceiver();
    private d m;
    private final com.go.weatherex.common.d n = new q(this);

    private p(Context context)
    {
        super(context);
        m = new d(d());
        l.a(a);
        l.a(n);
    }

    public static void b(Context context)
    {
        if (j == null)
        {
            j = new p(context);
        }
    }

    public static boolean n()
    {
        return j != null;
    }

    public static p o()
    {
        if (j == null)
        {
            throw new IllegalStateException("did you forget to call initSingleton?");
        } else
        {
            return j;
        }
    }

    private static void p()
    {
        if (j != null)
        {
            j.c();
            j = null;
        }
    }

    protected h a(Context context)
    {
        return new com.go.weatherex.j.c.e(context);
    }

    protected void a()
    {
        try
        {
            super.a();
            return;
        }
        catch (SecurityException securityexception)
        {
            securityexception.printStackTrace();
        }
    }

    protected void a(Context context, Intent intent)
    {
        context = intent.getAction();
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_CALENDAR".equals(context)) goto _L2; else goto _L1
_L1:
        a(intent.getIntExtra("extra_widget_id", 0));
        if (!c.a) goto _L4; else goto _L3
_L3:
        i.a(c.a().I);
_L6:
        return;
_L4:
        i.a();
        return;
_L2:
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_CLOCK".equals(context))
        {
            b(intent.getIntExtra("extra_widget_id", 0));
            if (c.a)
            {
                i.b(c.a().H);
                return;
            } else
            {
                i.b();
                return;
            }
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_WEATHER_DETAIL".equals(context))
        {
            c(intent.getIntExtra("extra_widget_id", 0));
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEXT_CITY".equals(context))
        {
            d(intent.getIntExtra("extra_widget_id", 0));
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_THEME_SETTING".equals(context))
        {
            int i1 = intent.getIntExtra("extra_widget_id", 0);
            int k1 = intent.getIntExtra("extra_theme_entrance", 20);
            a(i1, k1);
            t.a(a, k1);
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_WIDGET_CONFIG".equals(context))
        {
            int j1 = intent.getIntExtra("extra_widget_id", 0);
            int l1 = intent.getIntExtra("extra_widget_type", 0);
            b(j1, l1);
            t.a(a, j1, l1);
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_WEATHER".equals(context))
        {
            e(intent.getIntExtra("extra_widget_id", 0));
            l();
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DAYS_NEXT_PAGE".equals(context))
        {
            a(intent.getIntExtra("extra_widget_id", 0), intent.getIntExtra("extra_widget_type", 0), intent.getStringExtra("extra_city_id"));
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DAYS_PREVIOUS_PAGE".equals(context))
        {
            b(intent.getIntExtra("extra_widget_id", 0), intent.getIntExtra("extra_widget_type", 0), intent.getStringExtra("extra_city_id"));
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ONE_GOWIDGET_THEME_CHANGE".equals(context))
        {
            a(intent.getIntExtra("extra_widget_id", 0), intent.getStringExtra("extra_widget_theme_package"));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void a(IntentFilter intentfilter)
    {
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_CALENDAR");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_CLOCK");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_WEATHER_DETAIL");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEXT_CITY");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_THEME_SETTING");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_WEATHER");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DAYS_NEXT_PAGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DAYS_PREVIOUS_PAGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_OPEN_WIDGET_CONFIG");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ONE_GOWIDGET_THEME_CHANGE");
    }

    public void a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("bad client: null");
        }
        if (k.contains(obj))
        {
            throw new IllegalStateException("client already exist");
        } else
        {
            k.add(obj);
            return;
        }
    }

    protected void b()
    {
        try
        {
            super.b();
            return;
        }
        catch (SecurityException securityexception)
        {
            securityexception.printStackTrace();
        }
    }

    public void b(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("bad client: null");
        }
        if (!k.contains(obj))
        {
            throw new IllegalStateException("client is not bind before, do you give the wrong client?");
        }
        k.remove(obj);
        if (k.size() == 0)
        {
            p();
        }
    }

    protected void c()
    {
        if (k.size() > 0)
        {
            return;
        } else
        {
            super.c();
            l.b(a);
            m.a();
            return;
        }
    }

    public h e()
    {
        return m();
    }

    protected boolean i()
    {
        boolean flag = false;
        boolean flag1 = false;
        Cursor cursor = a.getContentResolver().query(WeatherContentProvider.o, new String[] {
            "flag_new_theme"
        }, null, null, null);
        if (cursor != null)
        {
            flag = flag1;
            if (cursor.moveToFirst())
            {
                if (cursor.getInt(0) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            try
            {
                cursor.close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return flag;
            }
        }
        return flag;
    }

    public com.go.weatherex.j.c.e m()
    {
        return (com.go.weatherex.j.c.e)super.e();
    }
}
