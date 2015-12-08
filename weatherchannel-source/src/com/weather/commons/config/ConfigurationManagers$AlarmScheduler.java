// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

// Referenced classes of package com.weather.commons.config:
//            ConfigurationManagers

public static class 
{

    public void cancel(Intent intent, int i, Context context, AlarmManager alarmmanager)
    {
        alarmmanager.cancel(PendingIntent.getBroadcast(context, i, intent, 0));
    }

    public void restartRepeating(Intent intent, int i, long l, Context context, AlarmManager alarmmanager)
    {
        intent = PendingIntent.getBroadcast(context, i, intent, 0);
        alarmmanager.cancel(intent);
        alarmmanager.setInexactRepeating(3, SystemClock.elapsedRealtime() + l, l, intent);
    }

    public ()
    {
    }
}
