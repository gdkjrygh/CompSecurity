// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzx;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService

final class zzaef extends Handler
{

    final DriveEventService zzaef;

    static Message zza(zzaef zzaef1)
    {
        return zzaef1.zzpw();
    }

    static Message zza(zzpw zzpw1, OnEventResponse oneventresponse)
    {
        return zzpw1.zzb(oneventresponse);
    }

    private Message zzb(OnEventResponse oneventresponse)
    {
        return obtainMessage(1, oneventresponse);
    }

    private Message zzpw()
    {
        return obtainMessage(2);
    }

    public void handleMessage(Message message)
    {
        zzx.zzt("DriveEventService", (new StringBuilder()).append("handleMessage message type:").append(message.what).toString());
        switch (message.what)
        {
        default:
            zzx.zzu("DriveEventService", (new StringBuilder()).append("Unexpected message type:").append(message.what).toString());
            return;

        case 1: // '\001'
            DriveEventService.zza(zzaef, (OnEventResponse)message.obj);
            return;

        case 2: // '\002'
            getLooper().quit();
            break;
        }
    }

    (DriveEventService driveeventservice)
    {
        zzaef = driveeventservice;
        super();
    }
}
