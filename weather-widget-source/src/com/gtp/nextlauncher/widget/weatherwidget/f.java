// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.c.g;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            e

class f extends BroadcastReceiver
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!com.gtp.nextlauncher.widget.weatherwidget.e.g(a))
        {
            if (context.equals("android.intent.action.TIME_TICK"))
            {
                e.h(a);
                return;
            }
            if (context.equals("android.intent.action.TIME_SET") || context.equals("android.intent.action.DATE_CHANGED"))
            {
                e.h(a);
                return;
            }
            if (context.equals("android.intent.action.TIMEZONE_CHANGED"))
            {
                e.h(a);
                return;
            }
        }
        if (context.equals("android.intent.action.SCREEN_OFF"))
        {
            e.b(a, true);
            e.a(a, "android.intent.action.SCREEN_OFF");
            return;
        }
        if (context.equals("android.intent.action.SCREEN_ON"))
        {
            e.b(a, false);
            e.i(a);
            e.a(a, "android.intent.action.SCREEN_ON");
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED"))
        {
            e.c(a, true);
            e.j(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app"))
        {
            e.b(a, "widgt_clock");
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ADD_CITY"))
        {
            context = new ArrayList();
            context.add(Integer.valueOf(1));
            context.add(Integer.valueOf(3));
            context.add(Integer.valueOf(4));
            e.a(a, context);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY"))
        {
            e.k(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA"))
        {
            e.b(a, null);
            e.c(a, false);
            e.l(a);
            e.m(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RELOAD_DATA"))
        {
            e.n(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY"))
        {
            e.n(a);
            return;
        }
        if (context.equalsIgnoreCase("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT"))
        {
            e.b(a, "tempUnit");
            return;
        }
        if (context.equalsIgnoreCase("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATESTYLE_UNIT"))
        {
            e.b(a, "dateStyle");
            return;
        }
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_LOCATION"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (intent.getIntExtra("extra_auto_location_flag", -1) == 0)
        {
            e.o(a);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE"))
        {
            e.c(a, null);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK"))
        {
            if (intent.getIntExtra("extra_world_clock", 0) == 1)
            {
                e.f(a).a(true);
            } else
            {
                e.f(a).a(false);
            }
            e.i(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WIND_UNIT"))
        {
            e.b(a, "windUnit");
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CONVERT_INDEX_STATE"))
        {
            int i = intent.getIntExtra("extra_convert_from_index", -1);
            int k = intent.getIntExtra("extra_convert_to_index", -1);
            e.a(a, i, k);
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_INITIALIZED_CITY"))
        {
            int j = intent.getIntExtra("city_location_state", 3);
            context = intent.getStringExtra("city_location_id");
            if (j != 4 || TextUtils.isEmpty(context))
            {
                e.d(a, true);
                e.c(a, e.p(a).getResources().getString(0x7f080514));
            }
            e.e(a, false);
            e.f(a, false);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
