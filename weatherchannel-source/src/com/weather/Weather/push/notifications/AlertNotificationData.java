// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push.notifications;

import android.net.Uri;
import com.weather.commons.push.AlertList;
import com.weather.commons.push.notifications.NotificationCreator;

public class AlertNotificationData
{

    private final String alertJsonData;
    private final AlertList alertList;
    private final String contentInfo;
    private final Integer lightColor;
    private final NotificationCreator notificationCreator;
    private final Uri soundUri;
    private final int vibrationSetting;

    public AlertNotificationData(NotificationCreator notificationcreator, AlertList alertlist, String s, Uri uri, int i, Integer integer, String s1)
    {
        notificationCreator = notificationcreator;
        alertList = alertlist;
        alertJsonData = s;
        soundUri = uri;
        vibrationSetting = i;
        lightColor = integer;
        contentInfo = s1;
    }

    public String getAlertJsonData()
    {
        return alertJsonData;
    }

    public AlertList getAlertList()
    {
        return alertList;
    }

    public String getContentInfo()
    {
        return contentInfo;
    }

    public Integer getLightColor()
    {
        return lightColor;
    }

    public NotificationCreator getNotificationCreator()
    {
        return notificationCreator;
    }

    public Uri getSoundUri()
    {
        return soundUri;
    }

    public int getVibrationSetting()
    {
        return vibrationSetting;
    }
}
