// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            MapDetailActivity, ac

class ab extends BroadcastReceiver
{

    final MapDetailActivity a;

    ab(MapDetailActivity mapdetailactivity)
    {
        a = mapdetailactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag1 = true;
        if (intent.getAction().equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE"))
        {
            MapDetailActivity.a(a, true);
            context = MapDetailActivity.b(a);
            boolean flag;
            if (!MapDetailActivity.a(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            context.a(flag);
            context = MapDetailActivity.c(a);
            if (!MapDetailActivity.a(a))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            context.a(flag);
        }
    }
}
