// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.d.f;

// Referenced classes of package com.go.weatherex.setting:
//            bo, bp

class bx extends BroadcastReceiver
{

    final bo a;

    private bx(bo bo1)
    {
        a = bo1;
        super();
    }

    bx(bo bo1, bp bp)
    {
        this(bo1);
    }

    public void onReceive(Context context, Intent intent)
    {
        for (context = intent.getAction(); context == null || !context.equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE") || !GoWidgetApplication.b(a.getActivity().getApplicationContext()).b();)
        {
            return;
        }

    }
}
