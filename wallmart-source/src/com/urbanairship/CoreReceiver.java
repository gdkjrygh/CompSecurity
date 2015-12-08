// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import com.urbanairship.actions.ActionService;
import com.urbanairship.actions.Situation;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.InteractiveNotificationEvent;
import com.urbanairship.push.BaseIntentReceiver;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.UAStringUtil;

// Referenced classes of package com.urbanairship:
//            Logger, UAirship, AirshipConfigOptions, Autopilot

public class CoreReceiver extends BroadcastReceiver
{

    public CoreReceiver()
    {
    }

    static void handleNotificationButtonOpenedProxy(Context context, Intent intent)
    {
        Object obj = intent.getBundleExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE");
        if (obj == null)
        {
            Logger.error("Missing push bundle.");
            return;
        }
        String s = intent.getStringExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ID");
        if (s == null)
        {
            Logger.error("Missing notification button ID.");
            return;
        }
        obj = new PushMessage(((Bundle) (obj)));
        int i = intent.getIntExtra("com.urbanairship.push.NOTIFICATION_ID", -1);
        boolean flag = intent.getBooleanExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_FOREGROUND", true);
        String s1 = intent.getStringExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ACTIONS_PAYLOAD");
        intent = intent.getStringExtra("com.urbanairship.push.EXTRA_NOTIFICATION_ACTION_BUTTON_DESCRIPTION");
        Logger.debug((new StringBuilder()).append("Notification action opened ").append(s).toString());
        if (flag)
        {
            UAirship.shared().getAnalytics().setConversionSendId(((PushMessage) (obj)).getSendId());
        }
        Logger.debug((new StringBuilder()).append("Dismissing notification: ").append(i).toString());
        NotificationManagerCompat.from(context).cancel(i);
        intent = new InteractiveNotificationEvent(((PushMessage) (obj)), s, intent, flag);
        UAirship.shared().getAnalytics().addEvent(intent);
        context.sendOrderedBroadcast((new Intent("com.urbanairship.push.OPENED")).putExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE", ((PushMessage) (obj)).getPushBundle()).putExtra("com.urbanairship.push.NOTIFICATION_ID", i).putExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ID", s).putExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_FOREGROUND", flag).putExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ACTIONS_PAYLOAD", s1).setPackage(UAirship.getPackageName()).addCategory(UAirship.getPackageName()), UAirship.getUrbanAirshipPermission());
    }

    private void handleNotificationDismissedProxy(Context context, Intent intent)
    {
        Bundle bundle = intent.getBundleExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE");
        if (bundle == null)
        {
            Logger.error("Missing push bundle.");
            return;
        }
        int i = intent.getIntExtra("com.urbanairship.push.NOTIFICATION_ID", -1);
        Logger.info((new StringBuilder()).append("Notification dismissed: ").append(i).toString());
        intent = (PendingIntent)intent.getExtras().get("com.urbanairship.push.EXTRA_NOTIFICATION_DELETE_INTENT");
        if (intent != null)
        {
            try
            {
                intent.send();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Logger.debug("Failed to send notification's deleteIntent, already canceled.");
            }
        }
        context.sendOrderedBroadcast((new Intent("com.urbanairship.push.DISMISSED")).putExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE", bundle).putExtra("com.urbanairship.push.NOTIFICATION_ID", i).setPackage(UAirship.getPackageName()).addCategory(UAirship.getPackageName()), UAirship.getUrbanAirshipPermission());
    }

    private void handleNotificationOpened(Context context, Intent intent)
    {
        Logger.info("Handling notification opened.");
        AirshipConfigOptions airshipconfigoptions = UAirship.shared().getAirshipConfigOptions();
        Object obj = intent.getBundleExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE");
        if (obj == null)
        {
            Logger.error("Missing push bundle.");
        } else
        {
            obj = new PushMessage(((Bundle) (obj)));
            if (intent.hasExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ID"))
            {
                boolean flag = intent.getBooleanExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_FOREGROUND", false);
                String s = intent.getStringExtra("com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ACTIONS_PAYLOAD");
                if (flag && getResultCode() != BaseIntentReceiver.RESULT_ACTIVITY_LAUNCHED && airshipconfigoptions.autoLaunchApplication && launchApplication(context) && isOrderedBroadcast())
                {
                    setResultCode(BaseIntentReceiver.RESULT_ACTIVITY_LAUNCHED);
                }
                if (!UAStringUtil.isEmpty(s))
                {
                    Logger.debug((new StringBuilder()).append("Running actions for notification action: ").append(s).toString());
                    if (flag)
                    {
                        intent = Situation.FOREGROUND_NOTIFICATION_ACTION_BUTTON;
                    } else
                    {
                        intent = Situation.BACKGROUND_NOTIFICATION_ACTION_BUTTON;
                    }
                    ActionService.runActionsPayload(context, s, intent, ((PushMessage) (obj)));
                    return;
                }
            } else
            {
                if (getResultCode() != BaseIntentReceiver.RESULT_ACTIVITY_LAUNCHED && airshipconfigoptions.autoLaunchApplication && launchApplication(context) && isOrderedBroadcast())
                {
                    setResultCode(BaseIntentReceiver.RESULT_ACTIVITY_LAUNCHED);
                }
                ActionService.runActionsPayload(context, ((PushMessage) (obj)).getActionsPayload(), Situation.PUSH_OPENED, ((PushMessage) (obj)));
                return;
            }
        }
    }

    static void handleNotificationOpenedProxy(Context context, Intent intent)
    {
        Object obj = intent.getBundleExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE");
        if (obj == null)
        {
            Logger.error("Missing push bundle.");
            return;
        }
        obj = new PushMessage(((Bundle) (obj)));
        int i = intent.getIntExtra("com.urbanairship.push.NOTIFICATION_ID", -1);
        Logger.debug("Notification opened");
        UAirship.shared().getAnalytics().setConversionSendId(((PushMessage) (obj)).getSendId());
        intent = (PendingIntent)intent.getExtras().get("com.urbanairship.push.EXTRA_NOTIFICATION_CONTENT_INTENT");
        if (intent != null)
        {
            try
            {
                intent.send();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Logger.debug("Failed to send notification's contentIntent, already canceled.");
            }
        }
        context.sendOrderedBroadcast((new Intent("com.urbanairship.push.OPENED")).putExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE", ((PushMessage) (obj)).getPushBundle()).putExtra("com.urbanairship.push.NOTIFICATION_ID", i).setPackage(UAirship.getPackageName()).addCategory(UAirship.getPackageName()), UAirship.getUrbanAirshipPermission());
    }

    private boolean launchApplication(Context context)
    {
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(UAirship.getPackageName());
        if (intent != null)
        {
            intent.setFlags(0x10000000);
            Logger.info("Starting application's launch intent.");
            context.startActivity(intent);
            return true;
        } else
        {
            Logger.info("Unable to launch application. Launch intent is unavailable.");
            return false;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        Autopilot.automaticTakeOff(context);
        if ("com.urbanairship.ACTION_NOTIFICATION_OPENED_PROXY".equals(intent.getAction()))
        {
            handleNotificationOpenedProxy(context, intent);
        } else
        {
            if ("com.urbanairship.ACTION_NOTIFICATION_BUTTON_OPENED_PROXY".equals(intent.getAction()))
            {
                handleNotificationButtonOpenedProxy(context, intent);
                return;
            }
            if ("com.urbanairship.ACTION_NOTIFICATION_DISMISSED_PROXY".equals(intent.getAction()))
            {
                handleNotificationDismissedProxy(context, intent);
                return;
            }
            if ("com.urbanairship.push.OPENED".equals(intent.getAction()))
            {
                handleNotificationOpened(context, intent);
                return;
            }
        }
    }
}
