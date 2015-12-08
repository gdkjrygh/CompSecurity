// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;

public class SystemBootReceiver extends BroadcastReceiver
{

    public SystemBootReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = new Intent(context, com/gau/go/launcherex/gowidget/weather/service/NotifyService);
        intent.putExtra("notify_request", 23);
        context.startService(intent);
    }
}
