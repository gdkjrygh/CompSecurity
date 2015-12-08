// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.kahuna.sdk:
//            GCMRegistrar, KahunaCommon, KahunaUtils

public class GCMRegistrationManager
{

    private static final String BACKOFF_MS = "backoff_ms";
    private static final int DEFAULT_BACKOFF_MS = 3000;
    private static final String GCM_PREFERENCES = "com.google.android.gcm";
    private static final int MAX_BACKOFF_MS;
    private static final String OLD_GCM_PROPERTY_REG_ID = "regId";
    private static final String PLAY_SERVICES_PROPERTY_REG_ID = "registration_id";
    private static final String PROPERTY_APP_VERSION = "appVersion";
    private static GCMRegistrationManager mSharedInstance = new GCMRegistrationManager();
    private static final Random sRandom = new Random();
    private boolean isManagingGCMFromPlayServices;
    private Context mContext;
    private String mSenderId;
    private Timer mTimer;
    private Object mTimerLock;

    private GCMRegistrationManager()
    {
        isManagingGCMFromPlayServices = false;
        mTimerLock = new Object();
    }

    private static int getAppVersion(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 1;
        }
        return i;
    }

    protected static int getBackoff(Context context)
    {
        return getGCMPreferences(context).getInt("backoff_ms", 3000);
    }

    protected static SharedPreferences getGCMPreferences(Context context)
    {
        return context.getSharedPreferences("com.google.android.gcm", 0);
    }

    protected static boolean getIsGCMManagedFromPlayServices()
    {
        return mSharedInstance.isManagingGCMFromPlayServices;
    }

    protected static String getRegistrationId()
    {
        String s;
        SharedPreferences sharedpreferences;
        if (!mSharedInstance.isManagingGCMFromPlayServices)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        sharedpreferences = getGCMPreferences(mSharedInstance.mContext);
        s = sharedpreferences.getString("registration_id", "");
        if (!"".equals(s)) goto _L2; else goto _L1
_L1:
        logDebug("Registration not found.");
        s = "";
_L4:
        return s;
_L2:
        if (sharedpreferences.getInt("appVersion", 0x80000000) == getAppVersion(mSharedInstance.mContext)) goto _L4; else goto _L3
_L3:
        logDebug("App version changed.");
        return "";
        return GCMRegistrar.getRegistrationId(mSharedInstance.mContext);
    }

    protected static void handleDisablePush()
    {
        try
        {
            KahunaCommon.getSharedInstance().disablePush();
            return;
        }
        catch (Exception exception)
        {
            Log.e("Kahuna", "KahunaSDK wasn't initialized in onAppCreate(), please initialized Kahuna correctly to prevent strange behavior");
            exception.printStackTrace();
            return;
        }
    }

    protected static void handleGCMServiceErrorAndRetry()
    {
        int i = getBackoff(mSharedInstance.mContext);
        int j = i / 2 + sRandom.nextInt(i);
        logDebug((new StringBuilder()).append("Scheduling registration retry, backoff = ").append(j).append("(").append(i).append(")").toString());
        if (mSharedInstance.isManagingGCMFromPlayServices)
        {
            mSharedInstance.scheduleRegistrationForGCMPlayServices(j);
        } else
        {
            Object obj = new Intent("com.google.android.gcm.intent.RETRY");
            ((Intent) (obj)).setPackage(mSharedInstance.mContext.getPackageName());
            obj = PendingIntent.getBroadcast(mSharedInstance.mContext, 0, ((Intent) (obj)), 0);
            ((AlarmManager)mSharedInstance.mContext.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + (long)j, ((PendingIntent) (obj)));
        }
        if (i < MAX_BACKOFF_MS)
        {
            setBackoff(mSharedInstance.mContext, i * 2);
        }
    }

    protected static void handlePushTokenReceived(String s)
    {
        com/kahuna/sdk/GCMRegistrationManager;
        JVM INSTR monitorenter ;
        KahunaCommon.getSharedInstance().setPushToken(s);
        KahunaCommon.getSharedInstance().enablePush();
_L2:
        com/kahuna/sdk/GCMRegistrationManager;
        JVM INSTR monitorexit ;
        return;
        s;
        Log.e("Kahuna", "KahunaSDK wasn't initialized in onAppCreate(), please initialized Kahuna correctly to prevent strange behavior");
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    protected static void init()
    {
        Object obj;
        Object obj1;
        try
        {
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(mSharedInstance.mContext) == 0)
            {
                mSharedInstance.isManagingGCMFromPlayServices = true;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            mSharedInstance.isManagingGCMFromPlayServices = false;
        }
        if (mSharedInstance.isManagingGCMFromPlayServices)
        {
            obj = "GCM is being managed from Play Services";
        } else
        {
            obj = "GCM is being managed from Old GCM Client Library";
        }
        logDebug(((String) (obj)));
        obj1 = getGCMPreferences(mSharedInstance.mContext);
        obj = ((SharedPreferences) (obj1)).edit();
        if (!mSharedInstance.isManagingGCMFromPlayServices) goto _L2; else goto _L1
_L1:
        obj1 = ((SharedPreferences) (obj1)).getString("regId", "");
        if (!KahunaUtils.isNullOrEmpty(((String) (obj1))))
        {
            logDebug("Migrating Push Token from Old GCM to Play Services");
            ((android.content.SharedPreferences.Editor) (obj)).putString("registration_id", ((String) (obj1)));
        }
_L4:
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        return;
_L2:
        obj1 = ((SharedPreferences) (obj1)).getString("registration_id", "");
        if (!KahunaUtils.isNullOrEmpty(((String) (obj1))))
        {
            logDebug("Migrating Push Token from Play Services back to Old GCM");
            ((android.content.SharedPreferences.Editor) (obj)).putString("regId", ((String) (obj1)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void logDebug(String s)
    {
        if (KahunaCommon.getDebugModeEnabled())
        {
            String s1;
            if (mSharedInstance.isManagingGCMFromPlayServices)
            {
                s1 = "Play Services GCM: ";
            } else
            {
                s1 = "Old GCM: ";
            }
            Log.d("Kahuna", (new StringBuilder()).append(s1).append(s).toString());
        }
    }

    protected static void registerForPush(String s)
    {
        mSharedInstance.mSenderId = s;
        if (mSharedInstance.isManagingGCMFromPlayServices)
        {
            mSharedInstance.scheduleRegistrationForGCMPlayServices(0L);
            return;
        } else
        {
            GCMRegistrar.register(mSharedInstance.mContext, new String[] {
                mSharedInstance.mSenderId
            });
            return;
        }
    }

    protected static void resetBackoff(Context context)
    {
        logDebug("Resetting backoff");
        setBackoff(context, 3000);
    }

    private void scheduleRegistrationForGCMPlayServices(long l)
    {
        synchronized (mTimerLock)
        {
            if (mTimer != null)
            {
                mTimer.cancel();
            }
            mTimer = new Timer();
    /* block-local class not found */
    class RegisterGCMPLayServicesTask {}

            mTimer.schedule(new RegisterGCMPLayServicesTask(mSenderId), l);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static void setBackoff(Context context, int i)
    {
        context = getGCMPreferences(context).edit();
        context.putInt("backoff_ms", i);
        context.commit();
    }

    protected static void setContext(Context context)
    {
        mSharedInstance.mContext = context;
    }

    static 
    {
        MAX_BACKOFF_MS = (int)TimeUnit.SECONDS.toMillis(3600L);
    }




}
