// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.c.g;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            ab

class ac extends BroadcastReceiver
{

    final ab a;

    ac(ab ab1)
    {
        a = ab1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (!s.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHECK_NEW_VERSION")) goto _L2; else goto _L1
_L1:
        if (g.a(context)) goto _L4; else goto _L3
_L3:
        ab.c(a).cancel(ab.b(a));
        ab.a(a, true);
_L6:
        return;
_L4:
        ab.d(a);
        return;
_L2:
        if (s.equals("android.net.conn.CONNECTIVITY_CHANGE") && !intent.getBooleanExtra("noConnectivity", false) && ab.e(a))
        {
            ab.d(a);
            ab.a(a, false);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
