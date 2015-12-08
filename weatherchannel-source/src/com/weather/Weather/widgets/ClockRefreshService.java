// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class ClockRefreshService extends IntentService
{

    public static final String TAG = "ClockRefreshService";

    public ClockRefreshService()
    {
        super("ClockRefreshService");
    }

    public static Intent getIntent(Context context, Bundle bundle)
    {
        context = new Intent(context, com/weather/Weather/widgets/ClockRefreshService);
        context.putExtras(bundle);
        return context;
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        } else
        {
            Intent intent1 = new Intent("com.weather.Weather.widgets.action.CLOCK_REFRESH");
            intent1.putExtras(intent.getExtras());
            sendBroadcast(intent1);
            return;
        }
    }
}
