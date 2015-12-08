// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.d.f;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetApplication

class o extends BroadcastReceiver
{

    final GoWidgetApplication a;

    o(GoWidgetApplication gowidgetapplication)
    {
        a = gowidgetapplication;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        c.a(context).e().h();
    }
}
