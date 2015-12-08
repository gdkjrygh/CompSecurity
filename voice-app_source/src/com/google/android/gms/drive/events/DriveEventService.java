// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzx;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.drive.events:
//            ChangeListener, CompletionListener, zzc, DriveEvent, 
//            ChangeEvent, CompletionEvent, ChangesAvailableEvent

public abstract class DriveEventService extends Service
    implements ChangeListener, CompletionListener, zzc
{
    final class zza extends Handler
    {

        final DriveEventService zzaef;

        static Message zza(zza zza1)
        {
            return zza1.zzpw();
        }

        static Message zza(zza zza1, OnEventResponse oneventresponse)
        {
            return zza1.zzb(oneventresponse);
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

        zza()
        {
            zzaef = DriveEventService.this;
            super();
        }
    }

    final class zzb extends com.google.android.gms.drive.internal.zzam.zza
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
            oneventresponse = zza.zza(zzaef.zzaec, oneventresponse);
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

        zzb()
        {
            zzaef = DriveEventService.this;
            super();
        }
    }


    public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    private final String mName;
    int zzZN;
    private CountDownLatch zzaeb;
    zza zzaec;
    boolean zzaed;

    protected DriveEventService()
    {
        this("DriveEventService");
    }

    protected DriveEventService(String s)
    {
        zzaed = false;
        zzZN = -1;
        mName = s;
    }

    static void zza(DriveEventService driveeventservice)
        throws SecurityException
    {
        driveeventservice.zzpv();
    }

    static void zza(DriveEventService driveeventservice, OnEventResponse oneventresponse)
    {
        driveeventservice.zza(oneventresponse);
    }

    private void zza(OnEventResponse oneventresponse)
    {
        oneventresponse = oneventresponse.zzpO();
        zzx.zzt("DriveEventService", (new StringBuilder()).append("handleEventMessage: ").append(oneventresponse).toString());
        oneventresponse.getType();
        JVM INSTR tableswitch 1 4: default 147
    //                   1 91
    //                   2 129
    //                   3 64
    //                   4 138;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        zzx.zzu(mName, (new StringBuilder()).append("Unhandled event: ").append(oneventresponse).toString());
        return;
_L2:
        try
        {
            onChange((ChangeEvent)oneventresponse);
            return;
        }
        catch (Exception exception)
        {
            zzx.zza(mName, exception, (new StringBuilder()).append("Error handling event: ").append(oneventresponse).toString());
        }
        return;
_L3:
        onCompletion((CompletionEvent)oneventresponse);
        return;
_L4:
        zza((ChangesAvailableEvent)oneventresponse);
        return;
    }

    static CountDownLatch zzb(DriveEventService driveeventservice)
    {
        return driveeventservice.zzaeb;
    }

    private void zzpv()
        throws SecurityException
    {
        int i = getCallingUid();
        if (i == zzZN)
        {
            return;
        }
        if (GooglePlayServicesUtil.zzd(this, i))
        {
            zzZN = i;
            return;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    protected int getCallingUid()
    {
        return Binder.getCallingUid();
    }

    public final IBinder onBind(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (!"com.google.android.gms.drive.events.HANDLE_EVENT".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        if (zzaec != null || zzaed)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        zzaed = true;
        intent = new CountDownLatch(1);
        zzaeb = new CountDownLatch(1);
        (new Thread(intent) {

            final CountDownLatch zzaee;
            final DriveEventService zzaef;

            public void run()
            {
                Looper.prepare();
                zzaef.zzaec = zzaef. new zza();
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

            
            {
                zzaef = DriveEventService.this;
                zzaee = countdownlatch;
                super();
            }
        }).start();
        if (!intent.await(5000L, TimeUnit.MILLISECONDS))
        {
            zzx.zzv("DriveEventService", "Failed to synchronously initialize event handler.");
        }
        intent = (new zzb()).asBinder();
_L4:
        this;
        JVM INSTR monitorexit ;
        return intent;
        intent;
        throw new RuntimeException("Unable to start event handler", intent);
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
_L2:
        intent = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onChange(ChangeEvent changeevent)
    {
        zzx.zzu(mName, (new StringBuilder()).append("Unhandled change event: ").append(changeevent).toString());
    }

    public void onCompletion(CompletionEvent completionevent)
    {
        zzx.zzu(mName, (new StringBuilder()).append("Unhandled completion event: ").append(completionevent).toString());
    }

    public void onDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        zzx.zzt("DriveEventService", "onDestroy");
        if (zzaec == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        Message message = zza.zza(zzaec);
        zzaec.sendMessage(message);
        zzaec = null;
        Exception exception;
        try
        {
            if (!zzaeb.await(5000L, TimeUnit.MILLISECONDS))
            {
                zzx.zzu("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
            }
        }
        catch (InterruptedException interruptedexception) { }
        zzaeb = null;
        super.onDestroy();
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    public boolean onUnbind(Intent intent)
    {
        return true;
    }

    public void zza(ChangesAvailableEvent changesavailableevent)
    {
        zzx.zzu(mName, (new StringBuilder()).append("Unhandled changes available event: ").append(changesavailableevent).toString());
    }
}
