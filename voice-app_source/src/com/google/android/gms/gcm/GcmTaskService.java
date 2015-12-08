// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
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

        zza(String s, IBinder ibinder)
        {
            zzavO = GcmTaskService.this;
            super();
            mTag = s;
            zzavN = zzb.zza.zzbN(ibinder);
        }
    }


    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private final Set zzavL = new HashSet();
    private int zzavM;

    public GcmTaskService()
    {
    }

    static void zza(GcmTaskService gcmtaskservice, String s)
    {
        gcmtaskservice.zzdc(s);
    }

    private void zzdc(String s)
    {
        synchronized (zzavL)
        {
            zzavL.remove(s);
            if (zzavL.size() == 0)
            {
                stopSelf(zzavM);
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
        if (!"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        String s;
        android.os.Parcelable parcelable;
        s = intent.getStringExtra("tag");
        parcelable = intent.getParcelableExtra("callback");
        if (parcelable != null && (parcelable instanceof PendingCallback)) goto _L4; else goto _L3
_L3:
        Log.e("GcmTaskService", (new StringBuilder()).append(getPackageName()).append(" ").append(s).append(": Could not process request, invalid callback.").toString());
_L6:
        return 2;
_L4:
        synchronized (zzavL)
        {
            zzavL.add(s);
            stopSelf(zzavM);
            zzavM = j;
        }
        (new zza(s, ((PendingCallback)parcelable).getIBinder())).start();
        return 2;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) goto _L6; else goto _L5
_L5:
        onInitializeTasks();
        synchronized (zzavL)
        {
            zzavM = j;
            if (zzavL.size() == 0)
            {
                stopSelf(zzavM);
            }
        }
        return 2;
        exception1;
        intent;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
