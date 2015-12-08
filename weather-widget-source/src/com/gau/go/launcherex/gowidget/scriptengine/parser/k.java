// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            i, j

class k extends BroadcastReceiver
{

    final i a;

    private k(i j)
    {
        a = j;
        super();
    }

    k(i j, j j1)
    {
        this(j);
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag;
        flag = true;
        break MISSING_BLOCK_LABEL_2;
        if (intent != null && "com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APP_THEME_CHANGE".equals(intent.getAction()))
        {
            intent = intent.getStringExtra("extra_app_theme_package");
            if (c.a(intent))
            {
                i.a(a, intent);
                context = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_BACKGROUND_CHANGE_FINISH");
                i.d(a).sendBroadcast(context);
            } else
            if (!i.g(a).equals(intent))
            {
                i.a(a, intent);
                i.i(a);
                a.b(context);
                flag = false;
            }
            if (flag)
            {
                context = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_ALL_SCRIPT_DONE");
                i.d(a).sendBroadcast(context);
                return;
            }
        }
        return;
    }
}
