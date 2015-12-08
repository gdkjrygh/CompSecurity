// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.format.Time;
import com.gtp.a.a.b.c;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            ah

class aj extends BroadcastReceiver
{

    final ah a;

    aj(ah ah1)
    {
        a = ah1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        int i;
        boolean flag;
        int k;
        i = 21;
        flag = false;
        k = ah.a(a);
        context = intent.getAction();
        if (!context.equals("android.intent.action.TIME_SET") && !context.equals("android.intent.action.TIMEZONE_CHANGED")) goto _L2; else goto _L1
_L1:
        c.a("Remind Handler", "\u7528\u6237\u6539\u53D8\u65F6\u533A\u6216\u65F6\u95F4");
        ah.b(a).setToNow();
        i = ((flag) ? 1 : 0);
        if (Math.abs(ah.b(a).toMillis(true) - com.gau.go.launcherex.gowidget.weather.b.ah.c(a)) < 0x1b7740L)
        {
            i = 1;
        }
        if (i == 0)
        {
            c.a("Remind Handler", "\u5237\u65B0\u65F6\u95F4\u6E05\u96F6");
            ah.a(a, 0L);
        }
        ah.b(a, ah.b(a).toMillis(true));
        ah.d(a);
_L4:
        return;
_L2:
        if (context.equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            boolean flag1 = intent.getBooleanExtra("noConnectivity", false);
            if (ah.e(a))
            {
                c.a("Remind Handler", "\u670D\u52A1\u542F\u52A8\u524D\u7684\u7F51\u7EDC\u72B6\u6001\u6539\u53D8\u5E7F\u64AD\uFF0C\u4E22\u5F03");
                return;
            }
            if (!flag1)
            {
                c.a("Remind Handler", "\u7F51\u7EDC\u8FDE\u63A5\u6062\u590D");
                if (k != 3)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (!ah.f(a))
                {
                    return;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_228;
        if (k != 2 || ah.f(a) || ah.g(a)) goto _L4; else goto _L3
_L3:
        return;
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PREPARE_FORECASET_DATA"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (k == 3)
        {
            c.a("Remind Handler", "\u5F00\u59CB\u5237\u65B0");
            return;
        }
        if (k == 2 && !ah.g(a))
        {
            c.a("Remind Handler", "\u5F39\u7A97\u65F6\u95F4\uFF0C\u5148\u68C0\u67E5\u5237\u65B0");
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_FORECASET"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k != 2) goto _L4; else goto _L6
_L6:
        c.a("Remind Handler", "\u5230\u8FBE7\u70B9");
        if (!ah.f(a)) goto _L4; else goto _L7
_L7:
        ah.h(a);
        return;
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA") || k != 3 && k != 2) goto _L4; else goto _L8
_L8:
        c.a("Remind Handler", "\u5237\u65B0\u5B8C\u6210");
        context = intent.getExtras();
        int j;
        long l;
        long l1;
        if (context != null)
        {
            j = context.getInt("weather_update_status", 1);
            i = context.getInt("request", 21);
        } else
        {
            j = 1;
        }
        if (j != 1 && j != 2 || i != 22) goto _L4; else goto _L9
_L9:
        context = context.getIntegerArrayList("weather_status");
        if (context != null)
        {
            i = context.size();
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L4; else goto _L10
_L10:
        j = 0;
_L13:
        if (j >= i)
        {
            break MISSING_BLOCK_LABEL_683;
        }
        if (((Integer)context.get(j)).intValue() == 1 || ((Integer)context.get(j)).intValue() == 2) goto _L12; else goto _L11
_L11:
        i = 0;
_L15:
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        c.a("Remind Handler", "\u5168\u90E8\u5237\u65B0\u6210\u529F");
        ah.a(a, 0);
        ah.b(a).setToNow();
        ah.a(a, ah.b(a).toMillis(true));
        if (k == 2)
        {
            ah.h(a);
            return;
        }
          goto _L4
_L12:
        j++;
          goto _L13
        if (!ah.i(a)) goto _L4; else goto _L14
_L14:
        c.a("Remind Handler", "\u6709\u5931\u8D25");
        ah.b(a, false);
        context = ((ConnectivityManager)a.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null && context.isAvailable() && context.isConnected())
        {
            ah.b(a).setToNow();
            l = ah.b(a, ah.j(a));
            l1 = ah.b(a).toMillis(true);
            context = (AlarmManager)a.a.getSystemService("alarm");
            intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_PREPARE_FORECASET_DATA");
            intent = PendingIntent.getBroadcast(a.a, 2, intent, 0x10000000);
            context.cancel(intent);
            context.set(0, l + l1, intent);
            return;
        }
          goto _L4
        i = 1;
          goto _L15
    }
}
