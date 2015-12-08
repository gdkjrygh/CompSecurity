// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.gcm.GcmReceiver;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.iid:
//            MessengerCompat, zzd, zzc, InstanceID

public class InstanceIDListenerService extends Service
{

    static String ACTION = "action";
    private static String zzavK = "google.com/iid";
    private static String zzawW = "CMD";
    MessengerCompat zzawU;
    BroadcastReceiver zzawV;
    int zzawX;
    int zzawY;

    public InstanceIDListenerService()
    {
        zzawU = new MessengerCompat(new Handler(Looper.getMainLooper()) {

            final InstanceIDListenerService zzawZ;

            public void handleMessage(Message message)
            {
                InstanceIDListenerService.zza(zzawZ, message, MessengerCompat.zzc(message));
            }

            
            {
                zzawZ = InstanceIDListenerService.this;
                super(looper);
            }
        });
        zzawV = new BroadcastReceiver() {

            final InstanceIDListenerService zzawZ;

            public void onReceive(Context context, Intent intent)
            {
                if (Log.isLoggable("InstanceID", 3))
                {
                    intent.getStringExtra("registration_id");
                    Log.d("InstanceID", (new StringBuilder()).append("Received GSF callback using dynamic receiver: ").append(intent.getExtras()).toString());
                }
                zzawZ.zzn(intent);
                zzawZ.stop();
            }

            
            {
                zzawZ = InstanceIDListenerService.this;
                super();
            }
        };
    }

    static void zza(Context context, zzd zzd1)
    {
        zzd1.zzul();
        zzd1 = new Intent("com.google.android.gms.iid.InstanceID");
        zzd1.putExtra(zzawW, "RST");
        zzd1.setPackage(context.getPackageName());
        context.startService(zzd1);
    }

    private void zza(Message message, int i)
    {
        zzc.zzaw(this);
        getPackageManager();
        if (i != zzc.zzaxf && i != zzc.zzaxe)
        {
            Log.w("InstanceID", (new StringBuilder()).append("Message from unexpected caller ").append(i).append(" mine=").append(zzc.zzaxe).append(" appid=").append(zzc.zzaxf).toString());
            return;
        } else
        {
            zzn((Intent)message.obj);
            return;
        }
    }

    static void zza(InstanceIDListenerService instanceidlistenerservice, Message message, int i)
    {
        instanceidlistenerservice.zza(message, i);
    }

    static void zzav(Context context)
    {
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.setPackage(context.getPackageName());
        intent.putExtra(zzawW, "SYNC");
        context.startService(intent);
    }

    public IBinder onBind(Intent intent)
    {
        if (intent != null && "com.google.android.gms.iid.InstanceID".equals(intent.getAction()))
        {
            return zzawU.getBinder();
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        IntentFilter intentfilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentfilter.addCategory(getPackageName());
        registerReceiver(zzawV, intentfilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    public void onDestroy()
    {
        unregisterReceiver(zzawV);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        zzgn(j);
        if (intent == null)
        {
            stop();
            return 2;
        }
        Intent intent1;
        if (!"com.google.android.gms.iid.InstanceID".equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        intent1 = (Intent)intent.getParcelableExtra("GSF");
        if (intent1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        startService(intent1);
        stop();
        return 1;
        zzn(intent);
        stop();
        if (intent.getStringExtra("from") != null)
        {
            GcmReceiver.completeWakefulIntent(intent);
        }
        return 2;
        intent;
        stop();
        throw intent;
    }

    public void onTokenRefresh()
    {
    }

    void stop()
    {
        this;
        JVM INSTR monitorenter ;
        zzawX = zzawX - 1;
        if (zzawX == 0)
        {
            stopSelf(zzawY);
        }
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder()).append("Stop ").append(zzawX).append(" ").append(zzawY).toString());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzab(boolean flag)
    {
        onTokenRefresh();
    }

    void zzgn(int i)
    {
        this;
        JVM INSTR monitorenter ;
        zzawX = zzawX + 1;
        if (i > zzawY)
        {
            zzawY = i;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzn(Intent intent)
    {
        Object obj;
        String s;
        String s1;
        s1 = intent.getStringExtra("subtype");
        if (s1 == null)
        {
            obj = InstanceID.getInstance(this);
        } else
        {
            obj = new Bundle();
            ((Bundle) (obj)).putString("subtype", s1);
            obj = InstanceID.zza(this, ((Bundle) (obj)));
        }
        s = intent.getStringExtra(zzawW);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder()).append("Register result in service ").append(s1).toString());
        }
        ((InstanceID) (obj)).zzuh().zzr(intent);
_L4:
        return;
_L2:
        if (Log.isLoggable("InstanceID", 3))
        {
            Log.d("InstanceID", (new StringBuilder()).append("Service command ").append(s1).append(" ").append(s).append(" ").append(intent.getExtras()).toString());
        }
        if (intent.getStringExtra("unregistered") != null)
        {
            zzd zzd1 = ((InstanceID) (obj)).zzug();
            s = s1;
            if (s1 == null)
            {
                s = "";
            }
            zzd1.zzdi(s);
            ((InstanceID) (obj)).zzuh().zzr(intent);
            return;
        }
        if ("RST".equals(s))
        {
            ((InstanceID) (obj)).zzuf();
            zzab(true);
            return;
        }
        if (!"RST_FULL".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((InstanceID) (obj)).zzug().isEmpty())
        {
            ((InstanceID) (obj)).zzug().zzul();
            zzab(true);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("SYNC".equals(s))
        {
            ((InstanceID) (obj)).zzug().zzdi(s1);
            zzab(false);
            return;
        }
        if ("PING".equals(s))
        {
            try
            {
                GoogleCloudMessaging.getInstance(this).send(zzavK, zzc.zzuk(), 0L, intent.getExtras());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.w("InstanceID", "Failed to send ping response");
            }
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

}
