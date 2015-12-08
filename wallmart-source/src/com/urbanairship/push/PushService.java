// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.SparseArray;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.google.PlayServicesUtils;
import com.urbanairship.util.UAHttpStatusUtil;
import com.urbanairship.util.UAStringUtil;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

// Referenced classes of package com.urbanairship.push:
//            PushManager, ChannelAPIClient, ChannelResponse, PushPreferences, 
//            PushMessage, ChannelRegistrationPayload, GCMRegistrar, ADMRegistrar

public class PushService extends IntentService
{

    static final String ACTION_PUSH_RECEIVED = "com.urbanairship.push.ACTION_PUSH_RECEIVED";
    static final String ACTION_PUSH_REGISTRATION_FINISHED = "com.urbanairship.push.ACTION_PUSH_REGISTRATION_FINISHED";
    static final String ACTION_RETRY_CHANNEL_REGISTRATION = "com.urbanairship.push.ACTION_RETRY_CHANNEL_REGISTRATION";
    static final String ACTION_RETRY_PUSH_REGISTRATION = "com.urbanairship.push.ACTION_RETRY_PUSH_REGISTRATION";
    static final String ACTION_START_REGISTRATION = "com.urbanairship.push.ACTION_START_REGISTRATION";
    static final String ACTION_UPDATE_REGISTRATION = "com.urbanairship.push.ACTION_UPDATE_REGISTRATION";
    private static final long CHANNEL_REREGISTRATION_INTERVAL_MS = 0x5265c00L;
    static final String EXTRA_BACK_OFF = "com.urbanairship.push.EXTRA_BACK_OFF";
    static final String EXTRA_WAKE_LOCK_ID = "com.urbanairship.push.EXTRA_WAKE_LOCK_ID";
    private static final long MAX_BACK_OFF_TIME = 0x4e2000L;
    private static final long STARTING_BACK_OFF_TIME = 10000L;
    private static final long WAKE_LOCK_TIMEOUT_MS = 60000L;
    private static long channelRegistrationBackOff = 0L;
    private static boolean isPushRegistering = false;
    private static int nextWakeLockID = 0;
    private static long pushRegistrationBackOff = 0L;
    private static final SparseArray wakeLocks = new SparseArray();
    private ChannelAPIClient channelClient;

    public PushService()
    {
        super("PushService");
    }

    PushService(ChannelAPIClient channelapiclient)
    {
        super("PushService");
        channelClient = channelapiclient;
    }

    private static int acquireWakeLock()
    {
        com/urbanairship/push/PushService;
        JVM INSTR monitorenter ;
        int i;
        android.os.PowerManager.WakeLock wakelock = ((PowerManager)UAirship.getApplicationContext().getSystemService("power")).newWakeLock(1, "UA_GCM_WAKE_LOCK");
        wakelock.setReferenceCounted(false);
        wakelock.acquire(60000L);
        SparseArray sparsearray = wakeLocks;
        i = nextWakeLockID + 1;
        nextWakeLockID = i;
        sparsearray.append(i, wakelock);
        i = nextWakeLockID;
        com/urbanairship/push/PushService;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    private long calculateNextBackOff(long l)
    {
        return Math.max(Math.min(2L * l, 0x4e2000L), 10000L);
    }

    private void createChannel(ChannelRegistrationPayload channelregistrationpayload)
    {
        PushManager pushmanager = UAirship.shared().getPushManager();
        PushPreferences pushpreferences = pushmanager.getPreferences();
        ChannelResponse channelresponse = getChannelClient().createChannelWithPayload(channelregistrationpayload);
        if (channelresponse == null || UAHttpStatusUtil.inServerErrorRange(channelresponse.getStatus()))
        {
            Logger.error("Channel registration failed, will retry.");
            channelRegistrationBackOff = calculateNextBackOff(channelRegistrationBackOff);
            scheduleRetry("com.urbanairship.push.ACTION_RETRY_CHANNEL_REGISTRATION", channelRegistrationBackOff);
            return;
        }
        if (channelresponse.getStatus() == 200 || channelresponse.getStatus() == 201)
        {
            Logger.info((new StringBuilder()).append("Channel creation succeeded with status: ").append(channelresponse.getStatus()).toString());
            if (!UAStringUtil.isEmpty(channelresponse.getChannelLocation()) && !UAStringUtil.isEmpty(channelresponse.getChannelId()))
            {
                pushmanager.setChannel(channelresponse.getChannelId(), channelresponse.getChannelLocation());
                pushpreferences.setLastRegistrationPayload(channelregistrationpayload);
                pushpreferences.setLastRegistrationTime(System.currentTimeMillis());
                pushmanager.sendRegistrationFinishedBroadcast(true);
            } else
            {
                Logger.error((new StringBuilder()).append("Failed to register with channel ID: ").append(channelresponse.getChannelId()).append(" channel location: ").append(channelresponse.getChannelLocation()).toString());
                pushmanager.sendRegistrationFinishedBroadcast(false);
            }
            channelRegistrationBackOff = 0L;
            return;
        } else
        {
            Logger.error((new StringBuilder()).append("Channel registration failed with status: ").append(channelresponse.getStatus()).toString());
            pushmanager.sendRegistrationFinishedBroadcast(false);
            channelRegistrationBackOff = 0L;
            return;
        }
    }

    private ChannelAPIClient getChannelClient()
    {
        if (channelClient == null)
        {
            channelClient = new ChannelAPIClient();
        }
        return channelClient;
    }

    private URL getChannelLocationURL()
    {
        String s;
        s = UAirship.shared().getPushManager().getPreferences().getChannelLocation();
        if (UAStringUtil.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        URL url = new URL(s);
        return url;
        MalformedURLException malformedurlexception;
        malformedurlexception;
        Logger.error((new StringBuilder()).append("Channel location from preferences was invalid: ").append(s).toString(), malformedurlexception);
        return null;
    }

    private boolean isPushRegistrationAllowed()
    {
        AirshipConfigOptions airshipconfigoptions = UAirship.shared().getAirshipConfigOptions();
        switch (UAirship.shared().getPlatformType())
        {
        default:
            return false;

        case 2: // '\002'
            if (!airshipconfigoptions.isTransportAllowed("GCM"))
            {
                Logger.info("Unable to register for push. GCM transport type is not allowed.");
                return false;
            } else
            {
                return true;
            }

        case 1: // '\001'
            break;
        }
        if (!airshipconfigoptions.isTransportAllowed("ADM"))
        {
            Logger.info("Unable to register for push. ADM transport type is not allowed.");
            return false;
        } else
        {
            return true;
        }
    }

    private boolean needsPushRegistration()
    {
        PushPreferences pushpreferences = UAirship.shared().getPushManager().getPreferences();
        if (UAirship.getPackageInfo().versionCode == pushpreferences.getAppVersionCode()) goto _L2; else goto _L1
_L1:
        Logger.verbose((new StringBuilder()).append("Version code changed to ").append(UAirship.getPackageInfo().versionCode).append(". Push re-registration required.").toString());
_L7:
        return true;
_L2:
        if (!PushManager.getSecureId(getApplicationContext()).equals(pushpreferences.getDeviceId()))
        {
            Logger.verbose("Device ID changed. Push re-registration required.");
            return true;
        }
        UAirship.shared().getPlatformType();
        JVM INSTR tableswitch 1 2: default 112
    //                   1 189
    //                   2 114;
           goto _L3 _L4 _L5
_L4:
        continue; /* Loop/switch isn't completed */
_L3:
        return false;
_L5:
        if (UAStringUtil.isEmpty(pushpreferences.getGcmId())) goto _L7; else goto _L6
_L6:
        Set set = UAirship.shared().getAirshipConfigOptions().getGCMSenderIds();
        Set set1 = pushpreferences.getRegisteredGcmSenderIds();
        if (set1 != null && !set1.equals(set))
        {
            Logger.verbose("GCM sender IDs changed. Push re-registration required.");
            return true;
        } else
        {
            Logger.verbose((new StringBuilder()).append("GCM already registered with ID: ").append(pushpreferences.getGcmId()).toString());
            return false;
        }
        if (UAStringUtil.isEmpty(pushpreferences.getAdmId())) goto _L7; else goto _L8
_L8:
        Logger.verbose((new StringBuilder()).append("ADM already registered with ID: ").append(pushpreferences.getAdmId()).toString());
        return false;
    }

    private void onPushReceived(Intent intent)
    {
        intent = new PushMessage(intent.getExtras());
        Logger.info((new StringBuilder()).append("Received push message: ").append(intent).toString());
        UAirship.shared().getPushManager().deliverPush(intent);
    }

    private void onPushRegistrationFinished()
    {
        isPushRegistering = false;
        performChannelRegistration();
    }

    private void onRetryChannelRegistration(Intent intent)
    {
        channelRegistrationBackOff = intent.getLongExtra("com.urbanairship.push.EXTRA_BACK_OFF", channelRegistrationBackOff);
        performChannelRegistration();
    }

    private void onRetryPushRegistration(Intent intent)
    {
        pushRegistrationBackOff = intent.getLongExtra("com.urbanairship.push.EXTRA_BACK_OFF", pushRegistrationBackOff);
        if (isPushRegistrationAllowed() && needsPushRegistration())
        {
            startPushRegistration();
        }
    }

    private void onStartRegistration()
    {
        if (isPushRegistering)
        {
            return;
        }
        if (isPushRegistrationAllowed() && needsPushRegistration())
        {
            startPushRegistration();
            return;
        } else
        {
            performChannelRegistration();
            return;
        }
    }

    private void onUpdateRegistration()
    {
        if (isPushRegistering)
        {
            Logger.verbose("Push registration in progress, skipping registration update.");
            return;
        } else
        {
            performChannelRegistration();
            return;
        }
    }

    private void performChannelRegistration()
    {
        Logger.verbose("Performing channel registration.");
        Object obj = UAirship.shared().getPushManager();
        Object obj1 = ((PushManager) (obj)).getPreferences();
        obj = ((PushManager) (obj)).getNextChannelRegistrationPayload();
        if (!shouldUpdateRegistration(((ChannelRegistrationPayload) (obj))))
        {
            Logger.verbose("Channel already up to date.");
            return;
        }
        obj1 = ((PushPreferences) (obj1)).getChannelId();
        URL url = getChannelLocationURL();
        if (url != null && !UAStringUtil.isEmpty(((String) (obj1))))
        {
            updateChannel(url, ((ChannelRegistrationPayload) (obj)));
            return;
        } else
        {
            createChannel(((ChannelRegistrationPayload) (obj)));
            return;
        }
    }

    private static void releaseWakeLock(int i)
    {
        com/urbanairship/push/PushService;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = (android.os.PowerManager.WakeLock)wakeLocks.get(i);
        if (wakelock == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        wakeLocks.remove(i);
        if (wakelock.isHeld())
        {
            wakelock.release();
        }
        com/urbanairship/push/PushService;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void scheduleRetry(String s, long l)
    {
        Logger.info((new StringBuilder()).append("Rescheduling push service ").append(s).append(" in ").append(l).append(" milliseconds.").toString());
        Object obj = (new Intent(getApplicationContext(), com/urbanairship/push/PushService)).setAction(s).putExtra("com.urbanairship.push.EXTRA_BACK_OFF", l);
        s = (AlarmManager)getApplicationContext().getSystemService("alarm");
        obj = PendingIntent.getService(getApplicationContext(), 0, ((Intent) (obj)), 0x10000000);
        s.set(3, SystemClock.elapsedRealtime() + l, ((PendingIntent) (obj)));
    }

    private boolean shouldUpdateRegistration(ChannelRegistrationPayload channelregistrationpayload)
    {
        PushPreferences pushpreferences = UAirship.shared().getPushManager().getPreferences();
        ChannelRegistrationPayload channelregistrationpayload1 = pushpreferences.getLastRegistrationPayload();
        long l = System.currentTimeMillis();
        long l1 = pushpreferences.getLastRegistrationTime();
        return !channelregistrationpayload.equals(channelregistrationpayload1) || l - l1 >= 0x5265c00L;
    }

    private void startPushRegistration()
    {
        isPushRegistering = true;
        UAirship.shared().getPlatformType();
        JVM INSTR tableswitch 1 2: default 32
    //                   1 136
    //                   2 47;
           goto _L1 _L2 _L3
_L1:
        Logger.error("Unknown platform type. Unable to register for push.");
        isPushRegistering = false;
        performChannelRegistration();
_L5:
        return;
_L3:
        if (!PlayServicesUtils.isGoogleCloudMessagingDependencyAvailable())
        {
            Logger.info("Unable to start registration. Google Play services unavailable.");
            performChannelRegistration();
            return;
        }
        try
        {
            if (!GCMRegistrar.register())
            {
                Logger.error("GCM registration failed.");
                isPushRegistering = false;
                pushRegistrationBackOff = 0L;
                performChannelRegistration();
                return;
            }
        }
        catch (IOException ioexception)
        {
            Logger.error((new StringBuilder()).append("GCM registration failed, will retry. GCM error: ").append(ioexception.getMessage()).toString());
            pushRegistrationBackOff = calculateNextBackOff(pushRegistrationBackOff);
            scheduleRetry("com.urbanairship.push.ACTION_RETRY_PUSH_REGISTRATION", pushRegistrationBackOff);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!ADMRegistrar.register())
        {
            Logger.error("ADM registration failed.");
            isPushRegistering = false;
            pushRegistrationBackOff = 0L;
            performChannelRegistration();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void startServiceWithWakeLock(Context context, Intent intent)
    {
        Logger.debug("PushService startService");
        intent.setClass(context, com/urbanairship/push/PushService);
        intent.putExtra("com.urbanairship.push.EXTRA_WAKE_LOCK_ID", acquireWakeLock());
        context.startService(intent);
    }

    private void updateChannel(URL url, ChannelRegistrationPayload channelregistrationpayload)
    {
        PushManager pushmanager = UAirship.shared().getPushManager();
        PushPreferences pushpreferences = pushmanager.getPreferences();
        url = getChannelClient().updateChannelWithPayload(url, channelregistrationpayload);
        if (url == null || UAHttpStatusUtil.inServerErrorRange(url.getStatus()))
        {
            Logger.error("Channel registration failed, will retry.");
            channelRegistrationBackOff = calculateNextBackOff(channelRegistrationBackOff);
            scheduleRetry("com.urbanairship.push.ACTION_RETRY_CHANNEL_REGISTRATION", channelRegistrationBackOff);
            return;
        }
        if (UAHttpStatusUtil.inSuccessRange(url.getStatus()))
        {
            Logger.info((new StringBuilder()).append("Channel registration succeeded with status: ").append(url.getStatus()).toString());
            pushpreferences.setLastRegistrationPayload(channelregistrationpayload);
            pushpreferences.setLastRegistrationTime(System.currentTimeMillis());
            pushmanager.sendRegistrationFinishedBroadcast(true);
            channelRegistrationBackOff = 0L;
            return;
        }
        if (url.getStatus() == 409)
        {
            pushmanager.setChannel(null, null);
            pushpreferences.setLastRegistrationPayload(null);
            performChannelRegistration();
            return;
        } else
        {
            Logger.error((new StringBuilder()).append("Channel registration failed with status: ").append(url.getStatus()).toString());
            pushmanager.sendRegistrationFinishedBroadcast(false);
            channelRegistrationBackOff = 0L;
            return;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        Autopilot.automaticTakeOff(getApplicationContext());
    }

    protected void onHandleIntent(Intent intent)
    {
        Logger.verbose((new StringBuilder()).append("Push service started with intent: ").append(intent).toString());
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        int i;
        s = intent.getAction();
        i = intent.getIntExtra("com.urbanairship.push.EXTRA_WAKE_LOCK_ID", -1);
        intent.removeExtra("com.urbanairship.push.EXTRA_WAKE_LOCK_ID");
        if (!"com.urbanairship.push.ACTION_PUSH_RECEIVED".equals(s)) goto _L4; else goto _L3
_L3:
        onPushReceived(intent);
_L5:
        if (i >= 0)
        {
            releaseWakeLock(i);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!"com.urbanairship.push.ACTION_PUSH_REGISTRATION_FINISHED".equals(s))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        onPushRegistrationFinished();
          goto _L5
        intent;
        if (i >= 0)
        {
            releaseWakeLock(i);
        }
        throw intent;
label0:
        {
            if (!"com.urbanairship.push.ACTION_UPDATE_REGISTRATION".equals(s))
            {
                break label0;
            }
            onUpdateRegistration();
        }
          goto _L5
label1:
        {
            if (!"com.urbanairship.push.ACTION_START_REGISTRATION".equals(s))
            {
                break label1;
            }
            onStartRegistration();
        }
          goto _L5
        if (!"com.urbanairship.push.ACTION_RETRY_CHANNEL_REGISTRATION".equals(s)) goto _L7; else goto _L6
_L6:
        onRetryChannelRegistration(intent);
          goto _L5
_L7:
        if (!"com.urbanairship.push.ACTION_RETRY_PUSH_REGISTRATION".equals(s)) goto _L5; else goto _L8
_L8:
        onRetryPushRegistration(intent);
          goto _L5
        if (true) goto _L1; else goto _L9
_L9:
    }

}
