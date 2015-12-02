// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.push;

import android.app.IntentService;
import android.content.Intent;
import bjw;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.notification.model.NotificationData;
import czh;
import czi;
import czj;
import dbf;
import dog;
import doh;
import doi;
import doj;
import eky;
import gmg;

public class ProcessPushService extends IntentService
    implements czh, czi
{

    public gmg a;
    public bjw b;
    public eky c;
    private doi d;

    public ProcessPushService()
    {
        super("ProcessPushService");
    }

    private doi a()
    {
        return dog.a().a(new doj(this, this)).a(((RiderApplication)getApplication()).b()).a();
    }

    private void a(doi doi1)
    {
        doi1.a(this);
    }

    private doi b()
    {
        return d;
    }

    public final volatile void a(czj czj)
    {
        a((doi)czj);
    }

    public final czj c()
    {
        return a();
    }

    public final czj d()
    {
        return b();
    }

    public void onCreate()
    {
        super.onCreate();
        d = a();
        d.a(this);
    }

    protected void onHandleIntent(Intent intent)
    {
        if (a.a(dbf.aM))
        {
            if ((intent = NotificationData.fromUberBundle(b, intent.getExtras())) != null)
            {
                c.a(intent);
                return;
            }
        }
    }
}
