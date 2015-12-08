// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.kahuna.sdk.KahunaCommon;
import com.kahuna.sdk.KahunaPreferences;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.kahuna.sdk.location:
//            KahunaIBeaconManager, KahunaActivityDetectionRequester, KahunaActivityDetectionRemover, KahunaLocationUtils

public class KahunaActivityRecognitionManager
{

    private static final int DEFAULT_MONITORING_INTERVAL_MILLI = 15000;
    private static final List SUPPORTED_ACTIVITY_TYPES = Arrays.asList(new Integer[] {
        Integer.valueOf(2), Integer.valueOf(8), Integer.valueOf(7), Integer.valueOf(5)
    });
    private static final int activityConfidence = 65;
    private static final KahunaActivityRecognitionManager instance = new KahunaActivityRecognitionManager();
    private static int prevActivityType = -1;
    private Context mContext;
    private int mDetectionIntervalMilli;
    private KahunaActivityDetectionRemover mDetectionRemover;
    private KahunaActivityDetectionRequester mDetectionRequester;
    private boolean mIsMonitoringActivites;
    private boolean readyForActivityMonitoring;

    private KahunaActivityRecognitionManager()
    {
        mIsMonitoringActivites = false;
        readyForActivityMonitoring = false;
        mDetectionIntervalMilli = 15000;
    }

    private static String getActivityString(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 6: // '\006'
        default:
            return "unknown";

        case 8: // '\b'
            return "running";

        case 7: // '\007'
            return "walking";

        case 2: // '\002'
            return "on foot";

        case 5: // '\005'
            return "standing";
        }
    }

    protected static int getIntervalTime()
    {
        if (instance != null)
        {
            return instance.mDetectionIntervalMilli;
        } else
        {
            return -1;
        }
    }

    public static void handleActivityRecognitionIntent(Context context, Intent intent)
    {
        int j;
label0:
        {
            context = ActivityRecognitionResult.extractResult(intent).getMostProbableActivity();
            int i = context.getConfidence();
            j = context.getType();
            if (i >= 65 && prevActivityType != j)
            {
                prevActivityType = j;
                if (!SUPPORTED_ACTIVITY_TYPES.contains(Integer.valueOf(j)))
                {
                    break label0;
                }
                if (KahunaCommon.getDebugModeEnabled())
                {
                    Log.d("Kahuna", (new StringBuilder()).append("Got supported Activity type: ").append(getActivityString(j)).toString());
                }
                KahunaIBeaconManager.startScanning();
            }
            return;
        }
        if (KahunaCommon.getDebugModeEnabled())
        {
            Log.d("Kahuna", (new StringBuilder()).append("Got unsupported Activity type: ").append(getActivityString(j)).toString());
        }
        KahunaIBeaconManager.stopScanning();
    }

    public static void init(KahunaCommon kahunacommon, Context context)
    {
        if (kahunacommon == null || !(kahunacommon instanceof KahunaCommon))
        {
            Log.e("Kahuna", "You cannot init the Activity Recognition Manager externally from the Kahuna SDK. Aborting!");
            return;
        } else
        {
            instance.mContext = context;
            instance.readyForActivityMonitoring = servicesConnected(context);
            setIntervalTime(KahunaPreferences.getActivityMonitoringDelay(kahunacommon, context));
            return;
        }
    }

    private void initRequestorRemover()
    {
        if (mDetectionRequester == null)
        {
            mDetectionRequester = new KahunaActivityDetectionRequester(mContext);
        }
        if (mDetectionRemover == null)
        {
            mDetectionRemover = new KahunaActivityDetectionRemover(mContext);
        }
    }

    public static boolean isDeviceReadyForActivityRecognition()
    {
        return instance.readyForActivityMonitoring;
    }

    protected static boolean isInited()
    {
        return instance.mContext != null;
    }

    public static void removeActivityUpdates(KahunaCommon kahunacommon)
    {
        if (kahunacommon != null && (kahunacommon instanceof KahunaCommon)) goto _L2; else goto _L1
_L1:
        Log.e("Kahuna", "You cannot use Activity Recognition Manager externally from the Kahuna SDK. Aborting!");
_L4:
        return;
_L2:
        if (instance.readyForActivityMonitoring)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!KahunaCommon.getDebugModeEnabled()) goto _L4; else goto _L3
_L3:
        Log.w("Kahuna", "App doens't have required permissions for Activity Monitoring. Aborting request for removal of updates!");
        return;
        if (!instance.mIsMonitoringActivites) goto _L4; else goto _L5
_L5:
        KahunaIBeaconManager.stopScanning();
        instance.initRequestorRemover();
        if (instance.mDetectionRequester.getRequestPendingIntent() != null)
        {
            instance.mDetectionRemover.removeUpdates(instance.mDetectionRequester.getRequestPendingIntent());
            instance.mDetectionRequester.getRequestPendingIntent().cancel();
        }
        instance.mDetectionRequester = null;
        instance.mDetectionRemover = null;
_L7:
        instance.mIsMonitoringActivites = false;
        return;
        kahunacommon;
        if (KahunaCommon.getDebugModeEnabled())
        {
            Log.w("Kahuna", "Caught error when attempting to remove ActivityMonitoring Updates.");
            Log.w("Kahuna", kahunacommon);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void requestActivityUpdates(KahunaCommon kahunacommon)
    {
        if (kahunacommon != null && (kahunacommon instanceof KahunaCommon)) goto _L2; else goto _L1
_L1:
        Log.e("Kahuna", "You cannot use Activity Recognition Manager externally from the Kahuna SDK. Aborting!");
_L4:
        return;
_L2:
        if (instance.readyForActivityMonitoring)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!KahunaCommon.getDebugModeEnabled()) goto _L4; else goto _L3
_L3:
        Log.w("Kahuna", "App doens't have required permissions for Activity Monitoring. Aborting request for updates!");
        return;
        if (instance.mIsMonitoringActivites) goto _L4; else goto _L5
_L5:
        instance.initRequestorRemover();
        instance.mDetectionRequester.requestUpdates();
_L7:
        instance.mIsMonitoringActivites = true;
        return;
        kahunacommon;
        if (KahunaCommon.getDebugModeEnabled())
        {
            Log.w("Kahuna", "Caught error when attempting to request for ActivityMonitoring Updates.");
            Log.w("Kahuna", kahunacommon);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean servicesConnected(Context context)
    {
        boolean flag;
        boolean flag1;
        try
        {
            flag1 = KahunaLocationUtils.hasPlayServices(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (KahunaCommon.getDebugModeEnabled())
            {
                Log.w("Kahuna", "Caught error when checking for Activity Recognition. If you are NOT using iBeacons please ignore this warning: ");
                Log.w("Kahuna", context);
            }
            return false;
        }
        flag = flag1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        flag = KahunaLocationUtils.checkManifestPermission(context, "com.google.android.gms.permission.ACTIVITY_RECOGNITION");
        return flag;
    }

    protected static void setIntervalTime(int i)
    {
        if (instance != null)
        {
            instance.mDetectionIntervalMilli = i;
            if (instance.mDetectionIntervalMilli < 0)
            {
                instance.mDetectionIntervalMilli = 15000;
            }
        }
    }

    protected static void updateIntervalPeriod()
    {
        if (instance.mDetectionRequester != null && KahunaIBeaconManager.isScanning())
        {
            instance.mDetectionRequester.requestUpdates();
        }
    }

}
