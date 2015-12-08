// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.weather.Weather.push.notifications.AlertProcessingService;
import com.weather.commons.push.PushService;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class TwcAdmMessageHandler extends ADMMessageHandlerBase
{
    public static class MessageAlertReceiver extends ADMMessageReceiver
    {

        public MessageAlertReceiver()
        {
            super(com/weather/Weather/push/TwcAdmMessageHandler);
        }
    }


    private static final Object ADM_ACTION = "com.amazon.device.messaging.intent.RECEIVE";
    private static final String TAG = "TWCADMMessageHandler";

    public TwcAdmMessageHandler()
    {
        super(com/weather/Weather/push/TwcAdmMessageHandler.getName());
    }

    public TwcAdmMessageHandler(String s)
    {
        super(s);
    }

    protected void onMessage(Intent intent)
    {
        Context context = getApplicationContext();
        if (intent.getAction().equals(ADM_ACTION))
        {
            LogUtil.d("TWCADMMessageHandler", LoggingMetaTags.TWC_ALERTS, "Received Severe weather alert! content=", new Object[] {
                intent.getExtras().getString("content")
            });
            Intent intent1 = new Intent(context, com/weather/Weather/push/notifications/AlertProcessingService);
            intent1.putExtras(intent.getExtras());
            context.startService(intent1);
        }
    }

    protected void onRegistered(String s)
    {
        Log.i("TWCADMMessageHandler", "TWCADMMessageHandler:onRegistered");
        Log.i("TWCADMMessageHandler", s);
        PushService.startPushService(com.weather.commons.push.PushService.ServicesSet.BASIC_SERVICES);
    }

    protected void onRegistrationError(String s)
    {
        Log.e("TWCADMMessageHandler", (new StringBuilder()).append("TWCADMMessageHandler:onRegistrationError ").append(s).toString());
    }

    protected void onUnregistered(String s)
    {
        Log.i("TWCADMMessageHandler", "TWCADMMessageHandler:onUnregistered");
    }

}
