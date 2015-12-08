// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.util.f;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            a, r

class b extends BroadcastReceiver
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (s.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY"))
        {
            intent = c.a(context.getApplicationContext());
            if (intent.h().e() > 0)
            {
                com.gau.go.launcherex.gowidget.weather.b.a.a(a, 2);
                if (g.a(context))
                {
                    com.gau.go.launcherex.gowidget.weather.b.a.a(a, 4);
                    if (com.gau.go.launcherex.gowidget.weather.b.a.a(a) == 7)
                    {
                        com.gau.go.launcherex.gowidget.weather.b.a.a(a, context);
                    }
                }
            } else
            {
                com.gau.go.launcherex.gowidget.weather.b.a.b(a, 0);
            }
            r.a(context).a(intent.f().a());
        } else
        if (s.equals("android.net.conn.CONNECTIVITY_CHANGE") && !intent.getBooleanExtra("noConnectivity", false))
        {
            com.gau.go.launcherex.gowidget.weather.b.a.a(a, 4);
            if (com.gau.go.launcherex.gowidget.weather.b.a.a(a) == 7)
            {
                com.gau.go.launcherex.gowidget.weather.b.a.a(a, context);
                return;
            }
        }
    }
}
