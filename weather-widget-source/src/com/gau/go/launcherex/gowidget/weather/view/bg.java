// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WeatherWidget41Style2

class bg extends BroadcastReceiver
{

    final WeatherWidget41Style2 a;

    bg(WeatherWidget41Style2 weatherwidget41style2)
    {
        a = weatherwidget41style2;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        for (context = intent.getAction(); context == null || a.mWidgetScrollGroup == null || !context.equals("android.intent.action.PACKAGE_DATA_CLEARED") || !intent.getDataString().replace("package:", "").equals(a.getContext().getPackageName());)
        {
            return;
        }

        WeatherWidget41Style2.k(a);
    }
}
