// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            k

class l extends BroadcastReceiver
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_TEMPERATURE_UNIT")) goto _L2; else goto _L1
_L1:
        k.a(a);
_L4:
        return;
_L2:
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA"))
        {
            k.a(a);
            return;
        }
        if (!context.equals("android.intent.action.TIME_TICK"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (k.b(a))
        {
            k.a(a);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (context.equals("android.intent.action.TIMEZONE_CHANGED") || context.equals("android.intent.action.TIME_SET"))
        {
            k.b(a);
            k.a(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED"))
        {
            k.a(a);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
