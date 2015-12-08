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
import com.gtp.a.a.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            r, ak, f

class s extends BroadcastReceiver
{

    final r a;

    s(r r1)
    {
        a = r1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        String s1 = intent.getAction();
        if (!s1.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY")) goto _L2; else goto _L1
_L1:
        context = c.a(context.getApplicationContext()).f().a();
        a.a(context);
        com.gau.go.launcherex.gowidget.weather.b.r.a(a).a();
        r.b(a).a();
_L4:
        return;
_L2:
        if (!s1.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WEATHER_UPDATE_TIME"))
        {
            break; /* Loop/switch isn't completed */
        }
        int i = intent.getIntExtra("auto_weather_update", 0);
        int j = intent.getIntExtra("auto_weather_frequency", -1);
        if (i != com.gau.go.launcherex.gowidget.weather.b.r.c(a))
        {
            if (i == 1)
            {
                com.gtp.a.a.a.a.a().a("\u5F00\u542F\u5B9A\u65F6\u5237\u65B0\u529F\u80FD\u3002");
                com.gau.go.launcherex.gowidget.weather.b.r.a(a, j);
                a.a(false);
            } else
            {
                a.a();
                com.gau.go.launcherex.gowidget.weather.b.r.a(a, 0L);
                com.gtp.a.a.a.a.a().a("\u5173\u95ED\u5B9A\u65F6\u5237\u65B0\u529F\u80FD\u3002");
            }
            r.b(a, i);
            return;
        }
        if (r.d(a) != j)
        {
            com.gau.go.launcherex.gowidget.weather.b.r.a(a, j);
            if (i == 1)
            {
                a.a(false);
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s1.equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = intent.getBooleanExtra("noConnectivity", false);
        if (com.gau.go.launcherex.gowidget.weather.b.r.e(a) && !flag)
        {
            com.gtp.a.a.a.a.a().a("\u7F51\u7EDC\u51C6\u5907\u597D\uFF0C\u5F00\u59CB\u5237\u65B0\u3002");
            com.gau.go.launcherex.gowidget.weather.b.r.c(a, 2);
            com.gau.go.launcherex.gowidget.weather.b.r.a(a, false);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (s1.equals("android.intent.action.TIME_SET") || s1.equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            com.gtp.a.a.a.a.a().a("[Broadcast] ACTION_TIME_CHANGED");
            a.a(false);
            return;
        }
        if (s1.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_AUTO_UPDATE"))
        {
            com.gtp.a.a.a.a.a().a("\u5B9A\u65F6\u5237\u65B0\u65F6\u95F4\u5230\u8FBE\uFF0C\u5F00\u59CB\u5237\u65B0\u3002");
            if (g.a(r.f(a)))
            {
                com.gau.go.launcherex.gowidget.weather.b.r.c(a, 2);
                return;
            } else
            {
                com.gtp.a.a.a.a.a().a("\u6CA1\u6709\u7F51\u7EDC\uFF0C\u7B49\u5F85\u7F51\u7EDC\u597D\u4E86\u540E\uFF0C\u5237\u65B0\u5929\u6C14\u3002");
                com.gau.go.launcherex.gowidget.weather.b.r.a(a, true);
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
    }
}
