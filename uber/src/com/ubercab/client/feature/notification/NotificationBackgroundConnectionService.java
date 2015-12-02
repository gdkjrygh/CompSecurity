// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification;

import android.content.Intent;
import android.os.IBinder;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.core.app.CoreService;
import dcs;
import dfp;
import dqx;
import eks;

public class NotificationBackgroundConnectionService extends CoreService
{

    public dcs a;
    public dqx b;

    public NotificationBackgroundConnectionService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return new eks(this, this);
    }

    public void onCreate()
    {
        ((RiderApplication)getApplication()).b().a(this);
        super.onCreate();
        a.d();
        b.d();
    }

    public void onDestroy()
    {
        super.onDestroy();
        a.e();
        b.e();
    }
}
