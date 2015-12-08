// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WeatherWidget41Style2, bi

public class a extends BroadcastReceiver
{

    final WeatherWidget41Style2 a;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            context = intent.getAction();
            if (context.equals("android.intent.action.PACKAGE_ADDED") || context.equals("android.intent.action.PACKAGE_REMOVED"))
            {
                context = intent.getDataString();
                if (!TextUtils.isEmpty(context) && !context.equals("com.gau.go.launcherex.gowidget.weatherwidget"))
                {
                    break label0;
                }
            }
            return;
        }
        WeatherWidget41Style2.l(a).sendEmptyMessage(7);
    }

    public (WeatherWidget41Style2 weatherwidget41style2)
    {
        a = weatherwidget41style2;
        super();
    }
}
