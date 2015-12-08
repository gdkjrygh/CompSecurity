// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.gtp.a.a.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            t

class u extends BroadcastReceiver
{

    final t a;
    private boolean b;
    private long c;
    private boolean d;

    u(t t1)
    {
        a = t1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context == null) goto _L2; else goto _L1
_L1:
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY")) goto _L4; else goto _L3
_L3:
        b = true;
_L2:
        return;
_L4:
        if (!context.equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            break; /* Loop/switch isn't completed */
        }
        context = com.gau.go.launcherex.gowidget.weather.b.t.a(a).getActiveNetworkInfo();
        if (d)
        {
            com.gtp.a.a.a.a.a().a("\u5404\u9879\u5237\u65B0\u5929\u6C14\u7684\u6761\u4EF6\u51C6\u5907\u597D\uFF0C\u6B63\u5728\u68C0\u67E5\u7F51\u7EDC\u72B6\u6001", "\u4EAE\u5C4F\u5237\u65B0\u5929\u6C14.txt");
            if (b && context != null && context.isConnected())
            {
                com.gtp.a.a.a.a.a().a("\u5404\u9879\u5237\u65B0\u5929\u6C14\u7684\u6761\u4EF6\u51C6\u5907\u597D\uFF0C\u7F51\u7EDC\u5DF2\u7ECF\u6062\u590D\u597D", "\u4EAE\u5C4F\u5237\u65B0\u5929\u6C14.txt");
                t.b(a);
                d = false;
                return;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (context.equals("android.intent.action.SCREEN_OFF"))
        {
            d = false;
            c = SystemClock.elapsedRealtime();
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("SCREEN OFF TIME\uFF1A").append(c).toString(), "\u4EAE\u5C4F\u5237\u65B0\u5929\u6C14.txt");
            return;
        }
        if (context.equals("android.intent.action.SCREEN_ON"))
        {
            context = com.gau.go.launcherex.gowidget.weather.b.t.a(a).getActiveNetworkInfo();
            long l = SystemClock.elapsedRealtime();
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("SCREEN ON TIME\uFF1A").append(l).toString(), "\u4EAE\u5C4F\u5237\u65B0\u5929\u6C14.txt");
            if (b && context != null && context.isConnected() && l - c > 0x927c0L)
            {
                t.b(a);
                return;
            }
            if (b && (context == null || !context.isConnected()) && l - c > 0x927c0L)
            {
                d = true;
                com.gtp.a.a.a.a.a().a("\u5404\u9879\u5237\u65B0\u5929\u6C14\u7684\u6761\u4EF6\u51C6\u5907\u597D\uFF0C\u7B49\u5F85\u7F51\u7EDC\u6062\u590D", "\u4EAE\u5C4F\u5237\u65B0\u5929\u6C14.txt");
                return;
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }
}
