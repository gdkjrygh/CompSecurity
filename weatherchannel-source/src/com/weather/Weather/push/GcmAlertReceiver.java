// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.weather.Weather.push.notifications.AlertProcessingService;
import com.weather.util.log.LogUtil;

public class GcmAlertReceiver extends BroadcastReceiver
{

    public static final String GCM_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String TAG = "GcmAlertReceiver";

    public GcmAlertReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()))
        {
            Intent intent1 = new Intent(context, com/weather/Weather/push/notifications/AlertProcessingService);
            intent = intent.getExtras();
            if (intent != null)
            {
                intent1.putExtras(intent);
                Log.d("GcmAlertReceiver", LogUtil.bundleToString(intent));
            }
            context.startService(intent1);
        }
        setResultCode(-1);
    }
}
