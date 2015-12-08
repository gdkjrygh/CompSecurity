// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmTaskService, TaskParams, zzb

private class zzavN extends Thread
{

    private final String mTag;
    private final zzb zzavN;
    final GcmTaskService zzavO;

    public void run()
    {
        int i = zzavO.onRunTask(new TaskParams(mTag));
        zzavN.zzgg(i);
        GcmTaskService.zza(zzavO, mTag);
        return;
        Object obj;
        obj;
        Log.e("GcmTaskService", (new StringBuilder()).append("Error reporting result of operation to scheduler for ").append(mTag).toString());
        GcmTaskService.zza(zzavO, mTag);
        return;
        obj;
        GcmTaskService.zza(zzavO, mTag);
        throw obj;
    }

    (GcmTaskService gcmtaskservice, String s, IBinder ibinder)
    {
        zzavO = gcmtaskservice;
        super();
        mTag = s;
        zzavN = zzavN(ibinder);
    }
}
