// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmTaskService, TaskParams, zzb

private class mExtras extends Thread
{

    private final Bundle mExtras;
    private final String mTag;
    private final zzb zzazP;
    final GcmTaskService zzazQ;

    public void run()
    {
        int i = zzazQ.onRunTask(new TaskParams(mTag, mExtras));
        zzazP.zzgs(i);
        GcmTaskService.zza(zzazQ, mTag);
        return;
        Object obj;
        obj;
        Log.e("GcmTaskService", (new StringBuilder()).append("Error reporting result of operation to scheduler for ").append(mTag).toString());
        GcmTaskService.zza(zzazQ, mTag);
        return;
        obj;
        GcmTaskService.zza(zzazQ, mTag);
        throw obj;
    }

    (GcmTaskService gcmtaskservice, String s, IBinder ibinder, Bundle bundle)
    {
        zzazQ = gcmtaskservice;
        super();
        mTag = s;
        zzazP = zzazP(ibinder);
        mExtras = bundle;
    }
}
