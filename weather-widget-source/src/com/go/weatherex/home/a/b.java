// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.format.Time;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.DynamicBackgroundView;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.f;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.home.a:
//            a

class b extends BroadcastReceiver
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = true;
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        context = intent.getAction();
        if (context.equals("android.intent.action.TIME_TICK"))
        {
            if (com.go.weatherex.home.a.a.b(a).d() && com.go.weatherex.home.a.a.c(a) != null)
            {
                context = com.go.weatherex.home.a.a.b(a).b(com.go.weatherex.home.a.a.c(a).l.n());
            } else
            {
                context = com.go.weatherex.home.a.a.b(a).c();
            }
            com.go.weatherex.home.a.a.a(a, ((Time) (context)).hour, ((Time) (context)).minute);
            return;
        }
        if (!context.equals("android.intent.action.TIME_SET") && !context.equals("android.intent.action.TIMEZONE_CHANGED") && !context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.go.weatherex.home.a.a.c(a) != null)
        {
            com.go.weatherex.home.a.a.a(a, com.go.weatherex.home.a.a.d(a), false);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA")) goto _L5; else goto _L4
_L4:
        context = com.go.weatherex.home.a.a.e(a).d();
        if (com.go.weatherex.home.a.a.c(a) != null) goto _L7; else goto _L6
_L6:
        int j;
        if (context.isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        com.go.weatherex.home.a.a.a(a, (WeatherBean)context.get(0));
        j = com.go.weatherex.home.a.a.c(a).l.d();
_L8:
        com.go.weatherex.home.a.a.f(a);
        com.go.weatherex.home.a.a.a(a, j, false);
        return;
_L7:
        j = com.go.weatherex.home.a.a.c(a).l.d();
        if (true) goto _L8; else goto _L5
_L5:
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_LOADING_FINISH"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.go.weatherex.home.a.a.c(a) != null)
        {
            com.go.weatherex.home.a.a.a(a, com.go.weatherex.home.a.a.d(a), true);
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_ONE_RELOAD_DONE".equals(context))
        {
            com.go.weatherex.home.a.a.a(a, com.go.weatherex.home.a.a.d(a), true);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_BACKGROUND_CHANGE_FINISH"))
        {
            com.go.weatherex.home.a.a.a(a, com.go.weatherex.home.a.a.d(a), true);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_DYNAMIC_BG"))
        {
            context = a;
            if (com.go.weatherex.home.a.a.g(a).a().l != 1)
            {
                flag = false;
            }
            com.go.weatherex.home.a.a.a(context, flag);
            com.go.weatherex.home.a.a.i(a).b(com.go.weatherex.home.a.a.h(a));
            com.go.weatherex.home.a.a.a(a).a(com.go.weatherex.home.a.a.h(a));
            return;
        }
        if (true) goto _L1; else goto _L10
_L10:
    }
}
