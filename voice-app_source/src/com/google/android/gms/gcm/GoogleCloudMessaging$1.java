// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.gcm:
//            GoogleCloudMessaging

class zzavY extends Handler
{

    final GoogleCloudMessaging zzavY;

    public void handleMessage(Message message)
    {
        if (message == null || !(message.obj instanceof Intent))
        {
            Log.w("GCM", "Dropping invalid message");
        }
        message = (Intent)message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
        {
            GoogleCloudMessaging.zza(zzavY).add(message);
        } else
        if (!GoogleCloudMessaging.zza(zzavY, message))
        {
            message.setPackage(GoogleCloudMessaging.zzb(zzavY).getPackageName());
            GoogleCloudMessaging.zzb(zzavY).sendBroadcast(message);
            return;
        }
    }

    (GoogleCloudMessaging googlecloudmessaging, Looper looper)
    {
        zzavY = googlecloudmessaging;
        super(looper);
    }
}
