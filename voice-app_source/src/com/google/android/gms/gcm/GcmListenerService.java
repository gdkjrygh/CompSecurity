// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmReceiver, zza

public abstract class GcmListenerService extends Service
{

    private int zzavB;
    private int zzavC;
    private final Object zzqt = new Object();

    public GcmListenerService()
    {
        zzavC = 0;
    }

    static void zza(GcmListenerService gcmlistenerservice, Intent intent)
    {
        gcmlistenerservice.zzk(intent);
    }

    private final void zzk(Intent intent)
    {
        boolean flag = "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction());
        if (!flag)
        {
            GcmReceiver.completeWakefulIntent(intent);
            return;
        }
        obj = intent.getStringExtra("message_type");
        byte byte0;
        if (obj == null)
        {
            obj = "gcm";
        }
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 4: default 276
    //                   -2062414158: 165
    //                   102161: 150
    //                   814694033: 195
    //                   814800675: 180;
           goto _L1 _L2 _L3 _L4 _L5
_L7:
        Log.w("GcmListenerService", (new StringBuilder()).append("Received message with unknown type: ").append(((String) (obj))).toString());
_L6:
        synchronized (zzqt)
        {
            zzavC = zzavC - 1;
            if (zzavC == 0)
            {
                zzgf(zzavB);
            }
        }
        GcmReceiver.completeWakefulIntent(intent);
        return;
_L3:
        if (((String) (obj)).equals("gcm"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (((String) (obj)).equals("deleted_messages"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        if (((String) (obj)).equals("send_event"))
        {
            byte0 = 2;
        }
          goto _L1
_L4:
        if (((String) (obj)).equals("send_error"))
        {
            byte0 = 3;
        }
          goto _L1
_L8:
        zzs(intent.getExtras());
          goto _L6
        obj;
        GcmReceiver.completeWakefulIntent(intent);
        throw obj;
_L9:
        onDeletedMessages();
          goto _L6
_L10:
        onMessageSent(intent.getStringExtra("google.message_id"));
          goto _L6
_L11:
        onSendError(intent.getStringExtra("google.message_id"), intent.getStringExtra("error"));
          goto _L6
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        byte0;
        JVM INSTR tableswitch 0 3: default 308
    //                   0 210
    //                   1 229
    //                   2 236
    //                   3 249;
           goto _L7 _L8 _L9 _L10 _L11
    }

    private void zzs(Bundle bundle)
    {
        bundle.remove("message_type");
        bundle.remove("android.support.content.wakelockid");
        if (com.google.android.gms.gcm.zza.zzt(bundle))
        {
            com.google.android.gms.gcm.zza.zzar(this).zzu(bundle);
            return;
        } else
        {
            String s = bundle.getString("from");
            bundle.remove("from");
            onMessageReceived(s, bundle);
            return;
        }
    }

    public final IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDeletedMessages()
    {
    }

    public void onMessageReceived(String s, Bundle bundle)
    {
    }

    public void onMessageSent(String s)
    {
    }

    public void onSendError(String s, String s1)
    {
    }

    public final int onStartCommand(final Intent intent, int i, int j)
    {
        synchronized (zzqt)
        {
            zzavB = j;
            zzavC = zzavC + 1;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() {

                final Intent val$intent;
                final GcmListenerService zzavD;

                public void run()
                {
                    GcmListenerService.zza(zzavD, intent);
                }

            
            {
                zzavD = GcmListenerService.this;
                intent = intent1;
                super();
            }
            });
        } else
        {
            (new AsyncTask() {

                final Intent val$intent;
                final GcmListenerService zzavD;

                protected Object doInBackground(Object aobj[])
                {
                    return zzb((Void[])aobj);
                }

                protected transient Void zzb(Void avoid[])
                {
                    GcmListenerService.zza(zzavD, intent);
                    return null;
                }

            
            {
                zzavD = GcmListenerService.this;
                intent = intent1;
                super();
            }
            }).execute(new Void[0]);
        }
        return 3;
        intent;
        obj;
        JVM INSTR monitorexit ;
        throw intent;
    }

    boolean zzgf(int i)
    {
        return stopSelfResult(i);
    }
}
