// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.gcm:
//            PendingCallback, TaskParams, zzb

public abstract class GcmTaskService extends Service
{
    private class zza extends Thread
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

        zza(String s, IBinder ibinder, Bundle bundle)
        {
            zzazQ = GcmTaskService.this;
            super();
            mTag = s;
            zzazP = zzb.zza.zzbR(ibinder);
            mExtras = bundle;
        }
    }


    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private final Set zzazN = new HashSet();
    private int zzazO;

    public GcmTaskService()
    {
    }

    static void zza(GcmTaskService gcmtaskservice, String s)
    {
        gcmtaskservice.zzdn(s);
    }

    private void zzdn(String s)
    {
        synchronized (zzazN)
        {
            zzazN.remove(s);
            if (zzazN.size() == 0)
            {
                stopSelf(zzazO);
            }
        }
        return;
        s;
        set;
        JVM INSTR monitorexit ;
        throw s;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onInitializeTasks()
    {
    }

    public abstract int onRunTask(TaskParams taskparams);

    public int onStartCommand(Intent intent, int i, int j)
    {
        intent.setExtrasClassLoader(com/google/android/gms/gcm/PendingCallback.getClassLoader());
        if (!"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        String s;
        android.os.Parcelable parcelable;
        Bundle bundle;
        s = intent.getStringExtra("tag");
        parcelable = intent.getParcelableExtra("callback");
        bundle = (Bundle)intent.getParcelableExtra("extras");
        if (parcelable != null && (parcelable instanceof PendingCallback)) goto _L4; else goto _L3
_L3:
        Log.e("GcmTaskService", (new StringBuilder()).append(getPackageName()).append(" ").append(s).append(": Could not process request, invalid callback.").toString());
_L6:
        return 2;
_L4:
        synchronized (zzazN)
        {
            zzazN.add(s);
            stopSelf(zzazO);
            zzazO = j;
        }
        (new zza(s, ((PendingCallback)parcelable).getIBinder(), bundle)).start();
        return 2;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) goto _L6; else goto _L5
_L5:
        onInitializeTasks();
        synchronized (zzazN)
        {
            zzazO = j;
            if (zzazN.size() == 0)
            {
                stopSelf(zzazO);
            }
        }
        return 2;
        exception1;
        intent;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
