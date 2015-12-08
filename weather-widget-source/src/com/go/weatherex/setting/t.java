// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.d.f;

// Referenced classes of package com.go.weatherex.setting:
//            p, q

class t extends BroadcastReceiver
{

    final p a;

    private t(p p1)
    {
        a = p1;
        super();
    }

    t(p p1, q q)
    {
        this(p1);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (GoWidgetApplication.b(p.k(a).getApplicationContext()).b() && p.p(a) != null && p.q(a) != null)
        {
            if (!p.q(a).isChecked())
            {
                p.q(a).setEnabled(true);
                p.q(a).setChecked(true);
            }
            p.r(a).setVisibility(8);
            p.q(a).setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if ("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app".equals(context))
        {
            p.a(a, intent.getStringExtra("app_name"));
            p.b(a, intent.getStringExtra("app_package_name"));
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app".equals(context))
        {
            p.c(a, intent.getStringExtra("app_name"));
            p.d(a, intent.getStringExtra("app_package_name"));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
