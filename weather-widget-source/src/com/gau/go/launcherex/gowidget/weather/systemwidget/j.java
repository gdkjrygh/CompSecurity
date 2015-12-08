// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.util.e;
import com.gtp.a.a.b.c;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            i

class j extends BroadcastReceiver
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        context = intent.getAction();
        if (context != null) goto _L3; else goto _L2
_L2:
        return;
_L3:
        c.a("AppWidgetWeatherManager", (new StringBuilder()).append("deal action:").append(context).toString());
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA"))
        {
            i.a(a, i.a(a), intent);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ADD_CITY"))
        {
            i.b(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_CITY"))
        {
            com.gau.go.launcherex.gowidget.weather.systemwidget.i.c(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION"))
        {
            i.d(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RELOAD_DATA"))
        {
            com.gau.go.launcherex.gowidget.weather.systemwidget.i.e(a);
            return;
        }
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CONVERT_INDEX_STATE"))
        {
            continue; /* Loop/switch isn't completed */
        }
        int k = intent.getIntExtra("extra_convert_from_index", -1);
        int l = intent.getIntExtra("extra_convert_to_index", -1);
        if (k < 0 || l < 0 || k == l)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = i.f(a).size();
        if (k >= i1 || l >= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        e.a(k, l, i.f(a));
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L4
_L4:
        i.g(a);
        return;
    }
}
