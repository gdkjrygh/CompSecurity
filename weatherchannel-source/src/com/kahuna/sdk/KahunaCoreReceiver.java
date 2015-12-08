// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.kahuna.sdk.location.KahunaActivityRecognitionManager;
import com.kahuna.sdk.location.KahunaRegionManager;
import java.util.List;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaSDKUpgradeManager, PushNotificationsManager

public class KahunaCoreReceiver extends BroadcastReceiver
{

    public static final String GEOFENCE_UPDATED_ACTION = "KAHUNA_GEOFENCES_UPDATED";
    protected static final String LANDING_DICTIONARY_EXTRAS = "KAHUNA_LANDING_EXTRAS_ID";
    protected static final String NOTIFICATION_ID_EXTRA = "KAHUNA_NID";
    protected static final String PUSH_CLICKED_ACTION = "KAHUNA_PUSH_CLICKED";
    protected static final String TRACKING_ID_EXTRA = "KAHUNA_TRACKING_ID";

    public KahunaCoreReceiver()
    {
    }

    private String getTransitionString(int i)
    {
        switch (i)
        {
        default:
            return "unknown";

        case 1: // '\001'
            return "enter";

        case 2: // '\002'
            return "exit";
        }
    }

    private void handleGeofenceIntent(Context context, Intent intent)
    {
        context = GeofencingEvent.fromIntent(intent);
        if (context != null) goto _L2; else goto _L1
_L1:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Unable to create a Geofence Intent for: ").append(intent.toString()).toString());
        }
_L4:
        return;
_L2:
        if (!context.hasError())
        {
            break; /* Loop/switch isn't completed */
        }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Geofence Intent processing has an error. Code:").append(context.getErrorCode()).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = context.getGeofenceTransition();
        if (j != 1 && j != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", "Recevied Kahuna Geofence update!");
        }
        context = context.getTriggeringGeofences();
        intent = new String[context.size()];
        i = 0;
_L8:
        if (i >= context.size()) goto _L4; else goto _L5
_L5:
        String s;
        s = ((Geofence)context.get(i)).getRequestId();
        intent[i] = s;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("GeofenceId: ").append(s).append(" Transition: ").append(getTransitionString(j)).toString());
        }
        if (!s.contains("KahunaEngineRegion_")) goto _L7; else goto _L6
_L6:
label0:
        {
            if (j != 1)
            {
                break MISSING_BLOCK_LABEL_358;
            }
            if (KahunaSDKUpgradeManager.getShouldIgnoreFirstGeofenceEnter(true))
            {
                if (KahunaCommon.mDebugEnabled)
                {
                    Log.d("Kahuna", "Updated existing regions registered from before 516, ignoring false first enter event");
                }
                KahunaRegionManager.setLastEnteredRegionId(KahunaCommon.getSharedInstance(), s);
                return;
            }
            String s1 = KahunaRegionManager.getLastEnteredRegionId(KahunaCommon.getSharedInstance());
            if (s1 == null || !s1.equals(s))
            {
                break label0;
            }
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Received Geofence enter again even though we are already in region for id:").append(s).toString());
                Log.d("Kahuna", "Not tracking geofence enter event.");
                return;
            }
        }
          goto _L4
        KahunaRegionManager.setLastEnteredRegionId(KahunaCommon.getSharedInstance(), s);
_L9:
        s = s.replace("KahunaEngineRegion_", "");
        KahunaCommon.getSharedInstance().trackRegionMonitoringEvent(s, getTransitionString(j));
_L7:
        i++;
          goto _L8
        KahunaRegionManager.clearLastEnteredRegionId(KahunaCommon.getSharedInstance());
          goto _L9
        if (!KahunaCommon.mDebugEnabled) goto _L4; else goto _L10
_L10:
        Log.d("Kahuna", (new StringBuilder()).append("Received Unknown Geofence transition state:").append(j).toString());
        return;
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        try
        {
            s = intent.getAction();
            if ("KAHUNA_PUSH_CLICKED".equals(s))
            {
                PushNotificationsManager.handlePushMessageClicked(context, intent);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Handled exception in CoreReceiver.onReceive(): ").append(context).toString());
            context.printStackTrace();
            return;
        }
        if ("KAHUNA_GEOFENCES_UPDATED".equals(s))
        {
            handleGeofenceIntent(context, intent);
            return;
        }
        if (ActivityRecognitionResult.hasResult(intent))
        {
            KahunaActivityRecognitionManager.handleActivityRecognitionIntent(context, intent);
        }
        return;
    }
}
