// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.service;

import android.content.Context;
import com.weather.Weather.app.WeatherController;
import com.weather.commons.service.AbstractNotificationService;

public class NotificationService extends AbstractNotificationService
{

    private static final String TAG = "NotificationService";

    public NotificationService()
    {
        super("NotificationService");
    }

    protected void customizeNotification(android.support.v4.app.NotificationCompat.Builder builder, Context context)
    {
        builder.setContentInfo(context.getString(0x7f070057));
    }

    protected Class getRespondingActivity()
    {
        return com/weather/Weather/app/WeatherController;
    }
}
