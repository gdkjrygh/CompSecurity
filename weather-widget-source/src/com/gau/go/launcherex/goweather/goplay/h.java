// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            ThemeDetailActivity, g

class h extends BroadcastReceiver
{

    final ThemeDetailActivity a;

    private h(ThemeDetailActivity themedetailactivity)
    {
        a = themedetailactivity;
        super();
    }

    h(ThemeDetailActivity themedetailactivity, g g)
    {
        this(themedetailactivity);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null || !"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_SCROLL_CHANGE".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        intent.getIntExtra("extra_theme_change_type", 0);
        JVM INSTR tableswitch 1 2: default 44
    //                   1 45
    //                   2 55;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        ThemeDetailActivity.a(a, 39);
        return;
_L4:
        ThemeDetailActivity.a(a, 40);
        return;
    }
}
