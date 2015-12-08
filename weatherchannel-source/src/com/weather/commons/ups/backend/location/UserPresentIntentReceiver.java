// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.commons.ups.backend.location:
//            LocationSyncScheduler

public class UserPresentIntentReceiver extends BroadcastReceiver
{

    private static final String TAG = "UserPresentIntentReceiver";
    private static final String USER_PRESENT_ACTION = "android.intent.action.USER_PRESENT";
    private static UserPresentIntentReceiver receiver;

    public UserPresentIntentReceiver()
    {
    }

    public static void registerUserPresentReceiver(Context context)
    {
        com/weather/commons/ups/backend/location/UserPresentIntentReceiver;
        JVM INSTR monitorenter ;
        UserPresentIntentReceiver userpresentintentreceiver = receiver;
        if (userpresentintentreceiver != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        receiver = new UserPresentIntentReceiver();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.USER_PRESENT");
        context.registerReceiver(receiver, intentfilter);
_L2:
        com/weather/commons/ups/backend/location/UserPresentIntentReceiver;
        JVM INSTR monitorexit ;
        return;
        context;
        Log.e("UserPresentIntentReceiver", context.getMessage(), context);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        throw context;
    }

    public static void unregisterUserPresentReceiver(Context context)
    {
        com/weather/commons/ups/backend/location/UserPresentIntentReceiver;
        JVM INSTR monitorenter ;
        UserPresentIntentReceiver userpresentintentreceiver = receiver;
        if (userpresentintentreceiver == null) goto _L2; else goto _L1
_L1:
        context.unregisterReceiver(receiver);
_L3:
        receiver = null;
        LocationSyncScheduler.cancelAlarm();
_L2:
        com/weather/commons/ups/backend/location/UserPresentIntentReceiver;
        JVM INSTR monitorexit ;
        return;
        context;
        Log.e("UserPresentIntentReceiver", context.getMessage(), context);
          goto _L3
        context;
        throw context;
    }

    public void onReceive(Context context, Intent intent)
    {
        LocationSyncScheduler.reScheduleSync(AbstractTwcApplication.getRootContext(), 1000L, true, false);
    }
}
