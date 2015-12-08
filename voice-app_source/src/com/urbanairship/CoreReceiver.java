// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.urbanairship.actions.ActionService;
import com.urbanairship.actions.Situation;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.push.PushManager;

// Referenced classes of package com.urbanairship:
//            Autopilot, UAirship, Logger

public class CoreReceiver extends BroadcastReceiver
{

    public CoreReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Autopilot.automaticTakeOff((Application)context.getApplicationContext());
        if (!intent.getAction().startsWith("com.urbanairship.push.NOTIFICATION_OPENED_PROXY"))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        ActionService.runActionsForPushBundle(intent.getExtras(), Situation.PUSH_OPENED);
        UAirship.shared().getAnalytics().setConversionPushId(intent.getStringExtra("com.urbanairship.push.PUSH_ID"));
        if (PushManager.shared().getIntentReceiver() != null)
        {
            context = new Intent("com.urbanairship.push.NOTIFICATION_OPENED");
            context.setClass(UAirship.shared().getApplicationContext(), PushManager.shared().getIntentReceiver());
            if (intent.getExtras() != null)
            {
                context.putExtras(intent.getExtras());
            }
            UAirship.shared().getApplicationContext().sendBroadcast(context);
        } else
        {
            Logger.debug("No intent receiver set, not sending ACTION_NOTIFICATION_OPENED");
        }
        context = (PendingIntent)intent.getExtras().get("com.urbanairship.push.CONTENT_INTENT");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        context.send();
        return;
        context;
        Logger.debug("Failed to send notification's contentIntent, already canceled.");
        return;
    }
}
