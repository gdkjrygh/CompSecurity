// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetActivity, m

class j extends BroadcastReceiver
{

    final GoWidgetActivity a;

    j(GoWidgetActivity gowidgetactivity)
    {
        a = gowidgetactivity;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !intent.getAction().equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY")) 
        {
            return;
        }
        long l = System.currentTimeMillis() - GoWidgetActivity.c(a);
        if (l < 2000L)
        {
            GoWidgetActivity.a(a).sendEmptyMessageDelayed(0, 2000L - l);
            return;
        } else
        {
            GoWidgetActivity.a(a).sendEmptyMessage(0);
            return;
        }
    }
}
