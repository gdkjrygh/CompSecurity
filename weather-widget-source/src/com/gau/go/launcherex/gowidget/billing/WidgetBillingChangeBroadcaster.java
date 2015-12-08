// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.content.AsyncQueryHandler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

public class WidgetBillingChangeBroadcaster extends BroadcastReceiver
{

    private AsyncQueryHandler a;

    public void onReceive(Context context, Intent intent)
    {
        a.startQuery(0, null, WeatherContentProvider.j, null, null, null, null);
    }
}
