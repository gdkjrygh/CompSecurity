// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.CheckBox;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.d.f;

// Referenced classes of package com.go.weatherex.setting:
//            cc, cd

class cg extends BroadcastReceiver
{

    final cc a;

    private cg(cc cc1)
    {
        a = cc1;
        super();
    }

    cg(cc cc1, cd cd)
    {
        this(cc1);
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
        if (GoWidgetApplication.b(a.getActivity().getApplicationContext()).b() && cc.o(a) != null && cc.p(a) != null)
        {
            if (!cc.p(a).isChecked())
            {
                cc.p(a).setEnabled(true);
                cc.p(a).setChecked(true);
            }
            cc.q(a).setVisibility(8);
            cc.p(a).setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if ("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app".equals(context))
        {
            cc.a(a, intent.getStringExtra("app_name"));
            cc.b(a, intent.getStringExtra("app_package_name"));
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app".equals(context))
        {
            cc.c(a, intent.getStringExtra("app_name"));
            cc.d(a, intent.getStringExtra("app_package_name"));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
