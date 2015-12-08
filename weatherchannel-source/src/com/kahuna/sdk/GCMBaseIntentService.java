// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;

// Referenced classes of package com.kahuna.sdk:
//            KahunaLogger, GCMRegistrar, GCMRegistrationManager, KahunaCommon

public abstract class GCMBaseIntentService extends IntentService
{

    private static final Object LOCK = com/kahuna/sdk/GCMBaseIntentService;
    public static final String TAG = "GCMBaseIntentService";
    private static final String WAKELOCK_KEY = "GCM_LIB";
    private static int sCounter = 0;
    private static android.os.PowerManager.WakeLock sWakeLock;
    private final KahunaLogger mLogger;
    private final String mSenderIds[];

    protected GCMBaseIntentService()
    {
        this(getName("DynamicSenderIds"), null);
    }

    private GCMBaseIntentService(String s, String as[])
    {
        super(s);
        mLogger = new KahunaLogger((new StringBuilder()).append("[").append(getClass().getName()).append("]: ").toString());
        mSenderIds = as;
        mLogger.log(2, "Intent service name: %s", new Object[] {
            s
        });
    }

    protected transient GCMBaseIntentService(String as[])
    {
        this(getName(as), as);
    }

    private static String getName(String s)
    {
        s = (new StringBuilder()).append("GCMIntentService-").append(s).append("-");
        int i = sCounter + 1;
        sCounter = i;
        return s.append(i).toString();
    }

    private static String getName(String as[])
    {
        return getName(GCMRegistrar.getFlatSenderIds(as));
    }

    private void handleRegistration(Context context, Intent intent)
    {
        GCMRegistrar.cancelAppPendingIntent();
        String s = intent.getStringExtra("registration_id");
        String s1 = intent.getStringExtra("error");
        intent = intent.getStringExtra("unregistered");
        mLogger.log(3, "handleRegistration: registrationId = %s, error = %s, unregistered = %s", new Object[] {
            s, s1, intent
        });
        if (s != null)
        {
            GCMRegistrationManager.resetBackoff(context);
            GCMRegistrar.setRegistrationId(context, s);
            onRegistered(context, s);
            return;
        }
        if (intent != null)
        {
            GCMRegistrationManager.resetBackoff(context);
            onUnregistered(context, GCMRegistrar.clearRegistrationId(context));
            return;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(s1))
        {
            GCMRegistrationManager.handleGCMServiceErrorAndRetry();
            return;
        } else
        {
            onError(context, s1);
            return;
        }
    }

    static void runIntentInService(Context context, Intent intent, String s)
    {
        synchronized (LOCK)
        {
            if (sWakeLock == null)
            {
                sWakeLock = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "GCM_LIB");
            }
        }
        sWakeLock.acquire();
_L2:
        intent.setClassName(context, s);
        context.startService(intent);
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        SecurityException securityexception;
        securityexception;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.w("Kahuna", "App does not have WAKE_LOCK permission");
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected String[] getSenderIds(Context context)
    {
        if (mSenderIds == null)
        {
            throw new IllegalStateException("sender id not set on constructor");
        } else
        {
            return mSenderIds;
        }
    }

    protected void onDeletedMessages(Context context, int i)
    {
    }

    protected abstract void onError(Context context, String s);

    public final void onHandleIntent(Intent intent)
    {
        Object obj;
        Object obj1;
        obj = getApplicationContext();
        obj1 = intent.getAction();
        if (!GCMRegistrationManager.getIsGCMManagedFromPlayServices()) goto _L2; else goto _L1
_L1:
        obj1 = intent.getExtras();
        String s = GoogleCloudMessaging.getInstance(this).getMessageType(intent);
        if (!((Bundle) (obj1)).isEmpty() && "gcm".equals(s))
        {
            onMessage(((Context) (obj)), intent);
        }
_L23:
        intent = ((Intent) (LOCK));
        intent;
        JVM INSTR monitorenter ;
        if (sWakeLock == null || !sWakeLock.isHeld()) goto _L4; else goto _L3
_L3:
        sWakeLock.release();
_L19:
        return;
_L2:
        if (((String) (obj1)).equals("com.google.android.c2dm.intent.REGISTRATION"))
        {
            GCMRegistrar.setRetryBroadcastReceiver(((Context) (obj)));
            handleRegistration(((Context) (obj)), intent);
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L15:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.w("Kahuna", "Caught exception in GCM onHandleIntent, SDK might not be initialized correctly.");
            intent.printStackTrace();
        }
        intent = ((Intent) (LOCK));
        intent;
        JVM INSTR monitorenter ;
        if (sWakeLock == null || !sWakeLock.isHeld()) goto _L7; else goto _L6
_L6:
        sWakeLock.release();
_L20:
        return;
        obj;
        intent;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        if (!((String) (obj1)).equals("com.google.android.c2dm.intent.RECEIVE")) goto _L9; else goto _L8
_L8:
        obj1 = intent.getStringExtra("message_type");
        if (obj1 == null) goto _L11; else goto _L10
_L10:
        if (!((String) (obj1)).equals("deleted_messages")) goto _L13; else goto _L12
_L12:
        intent = intent.getStringExtra("total_deleted");
        if (intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = Integer.parseInt(intent);
        mLogger.log(2, "Received notification for %d deletedmessages", new Object[] {
            Integer.valueOf(i)
        });
        onDeletedMessages(((Context) (obj)), i);
        continue; /* Loop/switch isn't completed */
        obj;
        try
        {
            mLogger.log(6, "GCM returned invalid number of deleted messages (%d)", new Object[] {
                intent
            });
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        finally
        {
            intent = ((Intent) (LOCK));
        }
        if (true) goto _L15; else goto _L14
_L14:
        intent;
        JVM INSTR monitorenter ;
        if (sWakeLock == null || !sWakeLock.isHeld()) goto _L17; else goto _L16
_L16:
        sWakeLock.release();
_L21:
        intent;
        JVM INSTR monitorexit ;
        throw obj;
_L13:
        mLogger.log(6, "Received unknown special message: %s", new Object[] {
            obj1
        });
        continue; /* Loop/switch isn't completed */
_L11:
        onMessage(((Context) (obj)), intent);
        continue; /* Loop/switch isn't completed */
_L9:
        if (!((String) (obj1)).equals("com.google.android.gcm.intent.RETRY"))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getPackage();
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        if (intent.equals(getApplicationContext().getPackageName()))
        {
            break MISSING_BLOCK_LABEL_440;
        }
        mLogger.log(6, "Ignoring retry intent from another package (%s)", new Object[] {
            intent
        });
        intent = ((Intent) (LOCK));
        intent;
        JVM INSTR monitorenter ;
        if (sWakeLock == null || !sWakeLock.isHeld())
        {
            break MISSING_BLOCK_LABEL_421;
        }
        sWakeLock.release();
_L18:
        return;
        obj;
        intent;
        JVM INSTR monitorexit ;
        throw obj;
        mLogger.log(6, "Wakelock reference is null or not held", new Object[0]);
          goto _L18
        if (GCMRegistrar.isRegistered(((Context) (obj))))
        {
            GCMRegistrar.internalUnregister(((Context) (obj)));
            continue; /* Loop/switch isn't completed */
        }
        GCMRegistrar.internalRegister(((Context) (obj)), getSenderIds(((Context) (obj))));
        continue; /* Loop/switch isn't completed */
_L4:
        mLogger.log(6, "Wakelock reference is null or not held", new Object[0]);
          goto _L19
        Exception exception;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
_L7:
        mLogger.log(6, "Wakelock reference is null or not held", new Object[0]);
          goto _L20
_L17:
        mLogger.log(6, "Wakelock reference is null or not held", new Object[0]);
          goto _L21
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L23; else goto _L22
_L22:
    }

    protected abstract void onMessage(Context context, Intent intent);

    protected boolean onRecoverableError(Context context, String s)
    {
        return true;
    }

    protected abstract void onRegistered(Context context, String s);

    protected abstract void onUnregistered(Context context, String s);

}
