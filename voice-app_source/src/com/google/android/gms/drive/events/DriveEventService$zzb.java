// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.RemoteException;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzx;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEventService

final class zzaef extends com.google.android.gms.drive.internal.aef
{

    final DriveEventService zzaef;

    public void zzc(OnEventResponse oneventresponse)
        throws RemoteException
    {
        DriveEventService driveeventservice = zzaef;
        driveeventservice;
        JVM INSTR monitorenter ;
        zzx.zzt("DriveEventService", (new StringBuilder()).append("onEvent: ").append(oneventresponse).toString());
        DriveEventService.zza(zzaef);
        if (zzaef.zzaec == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        oneventresponse = zza(zzaef.zzaec, oneventresponse);
        zzaef.zzaec.sendMessage(oneventresponse);
_L2:
        return;
        zzx.zzv("DriveEventService", "Receiving event before initialize is completed.");
        if (true) goto _L2; else goto _L1
_L1:
        oneventresponse;
        driveeventservice;
        JVM INSTR monitorexit ;
        throw oneventresponse;
    }

    (DriveEventService driveeventservice)
    {
        zzaef = driveeventservice;
        super();
    }
}
