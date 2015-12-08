// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.urbanairship.Autopilot;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.IntentUtils;

// Referenced classes of package com.urbanairship.push:
//            PushManager, PushPreferences, PushService

public class GCMPushReceiver extends BroadcastReceiver
{

    public GCMPushReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Autopilot.automaticTakeOff((Application)context.getApplicationContext());
        if ("android.intent.action.PACKAGE_REPLACED".equals(intent.getAction()))
        {
            String s = intent.getDataString();
            if (s != null && s.contains(UAirship.getPackageName()))
            {
                Logger.debug((new StringBuilder()).append("Package (").append(UAirship.getPackageName()).append(") was replaced. Resetting GCM ID.").toString());
                PushManager.shared().getPreferences().setAppVersionCode(0x80000000);
                (new Intent(context, com/urbanairship/push/PushService)).setAction("com.urbanairship.push.START_SERVICE");
                IntentUtils.scheduleIntent(context, intent, 0, 60000L);
            }
            return;
        } else
        {
            PushService.runGcmIntentInService(context, intent);
            setResult(-1, null, null);
            return;
        }
    }
}
