// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.v;

// Referenced classes of package com.go.weatherex.framework:
//            c

class d extends BroadcastReceiver
{

    final com.go.weatherex.framework.c a;

    d(com.go.weatherex.framework.c c1)
    {
        a = c1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag = true;
        if (intent != null)
        {
            context = intent.getAction();
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED".equals(context))
            {
                context = intent.getStringArrayListExtra("cityIds");
                a.a(context);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA".equals(context))
            {
                context = (new v()).a(intent);
                intent = c.a(c.a(a).getApplicationContext()).h();
                a.a(intent.d(), context);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT".equals(context))
            {
                int i = intent.getIntExtra("temperature_unit", 1);
                a.a(i);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT".equals(context))
            {
                int j = intent.getIntExtra("wind_unit", 1);
                a.b(j);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_VISIBILITY_UNIT".equals(context))
            {
                int k = intent.getIntExtra("visibility_unit", 1);
                a.c(k);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PRESSURE_UNIT".equals(context))
            {
                int l = intent.getIntExtra("pressure_unit", 2);
                a.d(l);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATESTYLE_UNIT".equals(context))
            {
                int i1 = intent.getIntExtra("datestyle_unit", 1);
                a.e(i1);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK".equals(context))
            {
                int j1;
                if (intent.getIntExtra("extra_world_clock", 0) != 1)
                {
                    flag = false;
                }
                a.a(flag);
                return;
            }
            if ("android.intent.action.TIME_SET".equals(context) || "android.intent.action.TIME_TICK".equals(context))
            {
                a.b();
                return;
            }
            if ("android.intent.action.TIMEZONE_CHANGED".equals(context))
            {
                a.c();
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE".equals(context))
            {
                a.d();
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION".equals(context))
            {
                a.e();
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ADD_CITY".equals(context))
            {
                context = intent.getStringExtra("city_code");
                intent = intent.getStringExtra("city_name");
                a.a(context, intent, c.b(a).d());
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY".equals(context))
            {
                context = intent.getStringArrayListExtra("city_code_list");
                j1 = intent.getIntExtra("city_index", 0);
                intent = intent.getStringExtra("city_code");
                a.a(context, j1, intent, c.b(a).d());
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION".equals(context))
            {
                if (intent.getIntExtra("extra_auto_location_flag", 0) == 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                a.b(flag);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION_FAILED".equals(context))
            {
                a.a(false, null, null);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION".equals(context))
            {
                context = intent.getStringExtra("last_location_cityid");
                intent = intent.getStringExtra("city_code");
                a.a(true, context, intent);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_NEW_THEME_FLAG_CHANGE".equals(context))
            {
                if (intent.getIntExtra("extra_new_theme_flag", 0) == 1)
                {
                    flag = flag2;
                } else
                {
                    flag = false;
                }
                a.c(flag);
                return;
            }
            if ("android.intent.action.SCREEN_ON".equals(context))
            {
                c.a(a, true);
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(context))
            {
                c.a(a, false);
                return;
            }
            if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_DONE"))
            {
                com.go.weatherex.framework.c.c(a);
                return;
            }
        }
    }
}
