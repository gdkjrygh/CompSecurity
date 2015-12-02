// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google.gcm;

import aam;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import bjw;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.notification.model.NotificationData;
import dbf;
import dfp;
import eky;
import gmg;
import ijg;
import ijj;

// Referenced classes of package com.ubercab.client.core.vendor.google.gcm:
//            GcmReceiver

public class GcmService extends IntentService
{

    public gmg a;
    public bjw b;
    public eky c;

    public GcmService()
    {
        super("GcmService");
    }

    public void onCreate()
    {
        super.onCreate();
        ((RiderApplication)getApplicationContext()).b().a(this);
    }

    protected void onHandleIntent(Intent intent)
    {
        byte byte0;
        byte0 = 0;
        if (a.a(dbf.aM))
        {
            return;
        }
        Object obj;
        Bundle bundle;
        aam.a(this);
        obj = aam.a(intent);
        bundle = intent.getExtras();
        if (bundle.isEmpty()) goto _L2; else goto _L1
_L1:
        int i = ((String) (obj)).hashCode();
        i;
        JVM INSTR tableswitch 102161 102161: default 64
    //                   102161 94;
           goto _L3 _L4
_L3:
        byte0 = -1;
_L6:
        byte0;
        JVM INSTR tableswitch 0 0: default 88
    //                   0 106;
           goto _L2 _L5
_L2:
        GcmReceiver.completeWakefulIntent(intent);
        return;
_L4:
        if (!((String) (obj)).equals("gcm")) goto _L3; else goto _L6
_L5:
        obj = NotificationData.fromUberBundle(b, bundle);
        if (obj == null)
        {
            GcmReceiver.completeWakefulIntent(intent);
            return;
        }
        c.a(((NotificationData) (obj)));
          goto _L2
        Object obj1;
        obj1;
        ijg.a("GcmService").b(((Throwable) (obj1)), "Failed to handle GCM intent", new Object[0]);
        GcmReceiver.completeWakefulIntent(intent);
        return;
        obj1;
        GcmReceiver.completeWakefulIntent(intent);
        throw obj1;
    }
}
