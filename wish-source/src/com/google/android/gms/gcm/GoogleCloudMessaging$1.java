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

class zzaoX extends Handler
{

    final GoogleCloudMessaging zzaoX;

    public void handleMessage(Message message)
    {
        if (message == null || !(message.obj instanceof Intent))
        {
            Log.w("GCM", "Dropping invalid message");
        }
        message = (Intent)message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
        {
            GoogleCloudMessaging.zza(zzaoX).add(message);
        } else
        if (!GoogleCloudMessaging.zza(zzaoX, message))
        {
            message.setPackage(GoogleCloudMessaging.zzb(zzaoX).getPackageName());
            GoogleCloudMessaging.zzb(zzaoX).sendBroadcast(message);
            return;
        }
    }

    (GoogleCloudMessaging googlecloudmessaging, Looper looper)
    {
        zzaoX = googlecloudmessaging;
        super(looper);
    }
}
