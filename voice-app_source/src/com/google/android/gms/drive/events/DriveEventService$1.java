// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Looper;
import com.google.android.gms.drive.internal.zzx;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService

class zzaee extends Thread
{

    final CountDownLatch zzaee;
    final DriveEventService zzaef;

    public void run()
    {
        Looper.prepare();
        zzaef.zzaec = new a(zzaef);
        zzaef.zzaed = false;
        zzaee.countDown();
        zzx.zzt("DriveEventService", "Bound and starting loop");
        Looper.loop();
        zzx.zzt("DriveEventService", "Finished loop");
        if (DriveEventService.zzb(zzaef) != null)
        {
            DriveEventService.zzb(zzaef).countDown();
        }
        return;
        Exception exception;
        exception;
        if (DriveEventService.zzb(zzaef) != null)
        {
            DriveEventService.zzb(zzaef).countDown();
        }
        throw exception;
    }

    a(DriveEventService driveeventservice, CountDownLatch countdownlatch)
    {
        zzaef = driveeventservice;
        zzaee = countdownlatch;
        super();
    }
}
