// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.language.e;

// Referenced classes of package com.go.weatherex.j:
//            p

class t extends BroadcastReceiver
{

    final p a;

    t(p p1)
    {
        a = p1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED".equals(s))
        {
            p.a(a, a.e.a());
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED".equals(s))
        {
            p.b(a);
            return;
        }
        if ("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA".equals(s))
        {
            p.c(a);
            return;
        }
        if ("android.intent.action.TIME_TICK".equals(s) || "android.intent.action.TIME_SET".equals(s) || "android.intent.action.DATE_CHANGED".equals(s) || "android.intent.action.TIMEZONE_CHANGED".equals(s))
        {
            p.d(a);
            return;
        } else
        {
            a.a(context, intent);
            return;
        }
    }
}
