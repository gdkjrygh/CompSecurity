// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.livewallpaper.b.h;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            g, b

class k extends BroadcastReceiver
{

    final g a;

    k(g g1)
    {
        a = g1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_DONE".equals(context) && !"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_ALL_SCRIPT_DONE".equals(context)) goto _L2; else goto _L1
_L1:
        g.a(a);
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a) != null)
        {
            if (!com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a).u() && h.a(a.a.getApplicationContext()))
            {
                Toast.makeText(a.a, 0x7f0804c8, 1).show();
            }
            if (a.b != null)
            {
                a.b.a(com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a));
            }
            g.d(a);
            com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a, null);
        }
_L4:
        return;
_L2:
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PURCHASE_SUCCESS".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        context = intent.getStringExtra("extra_purchase_theme_package_name");
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a) != null && com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a).x().equals(context))
        {
            com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a).d(true);
            a.a(com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a) == null || com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a).q() || !c.a(a.a.getApplicationContext()).e().b()) goto _L4; else goto _L5
_L5:
        a.a(com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a));
        return;
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION".equals(context) || com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a) == null || com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a).q() || !c.a(a.a.getApplicationContext()).e().c()) goto _L4; else goto _L6
_L6:
        a.a(com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g.c(a));
        return;
    }
}
