// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.system;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.notification.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;

public class LocaleUpdatedService extends Service
{

    private b a;
    private SharedPreferences b;
    private h c;

    public LocaleUpdatedService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        intent = (YouTubeApplication)getApplication();
        a = (b)com.google.android.apps.youtube.common.fromguava.c.a(intent.n());
        b = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(intent.B());
        c = (h)com.google.android.apps.youtube.common.fromguava.c.a(intent.C());
        if (c.a())
        {
            a.a();
        } else
        {
            b.edit().putBoolean("pending_notification_registration", true).apply();
        }
        stopSelf();
        return 2;
    }
}
