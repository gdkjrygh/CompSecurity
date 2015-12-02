// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.push.internal.vendor.google;

import aam;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.ubercab.push.internal.vendor.google:
//            GoogleBroadcastReceiver

public class GoogleIntentService extends IntentService
{

    public GoogleIntentService()
    {
        super("GoogleIntentService");
    }

    protected void onHandleIntent(Intent intent)
    {
        Bundle bundle;
        Object obj;
        aam.a(this);
        obj = aam.a(intent);
        bundle = intent.getExtras();
        if (bundle.isEmpty()) goto _L2; else goto _L1
_L1:
        Exception exception1;
        byte byte0 = -1;
        int i;
        try
        {
            i = ((String) (obj)).hashCode();
        }
        catch (Exception exception)
        {
            GoogleBroadcastReceiver.completeWakefulIntent(intent);
            return;
        }
        finally
        {
            GoogleBroadcastReceiver.completeWakefulIntent(intent);
        }
        i;
        JVM INSTR tableswitch 102161 102161: default 52
    //                   102161 78;
           goto _L3 _L4
_L3:
        byte0;
        JVM INSTR tableswitch 0 0: default 72
    //                   0 93;
           goto _L2 _L5
_L2:
        GoogleBroadcastReceiver.completeWakefulIntent(intent);
        return;
_L4:
        if (((String) (obj)).equals("gcm"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new Intent("com.ubercab.push.UBER_MESSAGE");
        ((Intent) (obj)).setPackage(getPackageName());
        ((Intent) (obj)).putExtras(bundle);
        sendBroadcast(((Intent) (obj)));
        if (true) goto _L2; else goto _L6
_L6:
        throw exception1;
        if (true) goto _L3; else goto _L7
_L7:
    }
}
