// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.view.a:
//            q, r

class v extends BroadcastReceiver
{

    final q a;

    private v(q q1)
    {
        a = q1;
        super();
    }

    v(q q1, r r)
    {
        this(q1);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PURCHASE_SUCCESS".equals(context)) goto _L2; else goto _L1
_L1:
        context = intent.getStringExtra("extra_purchase_theme_package_name");
        if (q.e(a) != null && q.e(a).x().equals(context))
        {
            q.e(a).d(true);
            a.a(q.e(a));
        }
_L4:
        return;
_L2:
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (q.e(a) == null || q.e(a).q() || !c.a(a.a.getApplicationContext()).e().b()) goto _L4; else goto _L3
_L3:
        a.a(q.e(a));
        return;
        if (!"com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION".equals(context) || q.e(a) == null || q.e(a).q() || !c.a(a.a.getApplicationContext()).e().c()) goto _L4; else goto _L5
_L5:
        a.a(q.e(a));
        return;
    }
}
