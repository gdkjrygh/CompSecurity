// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.systemwidget.e;
import com.gau.go.launcherex.gowidget.weather.systemwidget.m;
import com.gau.go.launcherex.gowidget.weather.view.t;
import com.go.weatherex.j.h;
import com.go.weatherex.j.p;
import com.go.weatherex.themeconfig.AppWidgetThemeConfigHomeActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.j.b:
//            o, e

public class n extends p
{

    private static n j;
    private final List k = new ArrayList();

    private n(Context context)
    {
        super(context);
    }

    public static void b(Context context)
    {
        if (j == null)
        {
            j = new n(context);
        }
    }

    private void c(int l, int i1)
    {
        for (Iterator iterator = (new ArrayList(b)).iterator(); iterator.hasNext(); ((o)iterator.next()).c(l, i1)) { }
    }

    public static n n()
    {
        if (j == null)
        {
            throw new IllegalStateException("did you forget to call initSingleton?");
        } else
        {
            return j;
        }
    }

    protected h a(Context context)
    {
        return new com.go.weatherex.j.b.e(context);
    }

    protected void a()
    {
        super.a();
    }

    protected void a(Context context, Intent intent)
    {
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ONE_APPWIDGET_THEME_CHANGE".equals(intent.getAction()))
        {
            a(intent.getIntExtra("extra_widget_id", 0), intent.getStringExtra("extra_widget_theme_package"));
        }
    }

    public void a(Intent intent)
    {
        switch (intent.getIntExtra("extra_action_id", -1))
        {
        default:
            return;

        case 7: // '\007'
            a(intent.getIntExtra("extra_widget_id", 0), intent.getIntExtra("extra_widget_type", 0), intent.getStringExtra("extra_city_id"));
            return;

        case 8: // '\b'
            b(intent.getIntExtra("extra_widget_id", 0), intent.getIntExtra("extra_widget_type", 0), intent.getStringExtra("extra_city_id"));
            return;

        case 5: // '\005'
            d(intent.getIntExtra("extra_widget_id", 0));
            return;

        case 1: // '\001'
            a(intent.getIntExtra("extra_widget_id", 0));
            if (c.a)
            {
                i.a(c.a().I);
                return;
            } else
            {
                i.a();
                return;
            }

        case 2: // '\002'
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

        case 4: // '\004'
            int l = intent.getIntExtra("extra_widget_id", 0);
            int j1 = intent.getIntExtra("extra_theme_entrance", 2);
            a(l, j1);
            t.a(a, j1);
            return;

        case 3: // '\003'
            c(intent.getIntExtra("extra_widget_id", 0));
            return;

        case 6: // '\006'
            e(intent.getIntExtra("extra_widget_id", 0));
            l();
            return;

        case 9: // '\t'
            c(intent.getIntExtra("extra_widget_id", 0), intent.getIntExtra("extra_clock_id", 16));
            return;

        case 10: // '\n'
            int i1 = intent.getIntExtra("extra_widget_id", 0);
            int k1 = intent.getIntExtra("extra_widget_type", 0);
            intent = AppWidgetThemeConfigHomeActivity.a(a, i1, k1, 2);
            a.startActivity(intent);
            b(i1, k1);
            return;
        }
    }

    protected void a(IntentFilter intentfilter)
    {
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ONE_APPWIDGET_THEME_CHANGE");
    }

    protected void b()
    {
        super.b();
    }

    protected void c()
    {
        if (k.size() > 0)
        {
            return;
        } else
        {
            super.c();
            return;
        }
    }

    public h e()
    {
        return m();
    }

    protected boolean i()
    {
        return a.getSharedPreferences("goweatherex_info", 0).getBoolean("new_theme", false);
    }

    public com.go.weatherex.j.b.e m()
    {
        return (com.go.weatherex.j.b.e)super.e();
    }
}
