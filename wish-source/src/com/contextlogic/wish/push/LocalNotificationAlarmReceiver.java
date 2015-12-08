// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.push;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.data.LocalBackgroundNotificationSpec;
import com.contextlogic.wish.api.service.LogLocalNotificationService;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.PreferencesUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

// Referenced classes of package com.contextlogic.wish.push:
//            LocalNotificationAlarmReceiverActivity, PushNotificationService

public class LocalNotificationAlarmReceiver extends BroadcastReceiver
{

    public static final String ARG_NOTIFICATION_SPEC = "NotificationSpec";
    public static final String LOCAL_NOTIFICATION_ACTION = "LocalNotificationAction";
    public static final String LOCAL_NOTIFICATION_ID_PREF_KEY = "LocalNotificationIds";

    public LocalNotificationAlarmReceiver()
    {
    }

    public void cancelAlarm(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, new Intent(context, com/contextlogic/wish/push/LocalNotificationAlarmReceiver), 0);
        ((AlarmManager)context.getSystemService("alarm")).cancel(pendingintent);
    }

    public void informBackground(Context context)
    {
        LocalBackgroundNotificationSpec localbackgroundnotificationspec;
        int i;
        boolean flag;
        cancelAlarm(context);
        localbackgroundnotificationspec = UserStatusManager.getInstance().getLocalBackgroundNotificationSpec();
        flag = false;
        i = ((flag) ? 1 : 0);
        if (localbackgroundnotificationspec == null) goto _L2; else goto _L1
_L1:
        long l;
        l = UserPreferences.getLastLocalNotificationSent();
        i = ((flag) ? 1 : 0);
        if ((new Date()).getTime() - l <= localbackgroundnotificationspec.getMinimumInterval() - localbackgroundnotificationspec.getDelay()) goto _L2; else goto _L3
_L3:
        if (!localbackgroundnotificationspec.getType().equals("cart")) goto _L5; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
        if (UserStatusManager.getInstance().getCartCount() > 0)
        {
            i = 1;
        }
_L2:
        if (i != 0)
        {
            (new LogLocalNotificationService()).requestService(localbackgroundnotificationspec.getId(), "scheduled", null, null);
            AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
            Intent intent = new Intent(context, com/contextlogic/wish/push/LocalNotificationAlarmReceiver);
            i = (new Random()).nextInt(0x186a0);
            intent.setAction((new StringBuilder()).append("LocalNotificationAction").append(i).toString());
            intent.putExtra("NotificationSpec", localbackgroundnotificationspec);
            context = PendingIntent.getBroadcast(context, 0, intent, 0);
            alarmmanager.set(0, System.currentTimeMillis() + localbackgroundnotificationspec.getDelay(), context);
        }
        return;
_L5:
        i = ((flag) ? 1 : 0);
        if (localbackgroundnotificationspec.getType().equals("forced"))
        {
            i = ((flag) ? 1 : 0);
            if (!UserPreferences.notificationHasBeenScheduled(localbackgroundnotificationspec.getId()))
            {
                UserPreferences.markNotificationAsScheduled(localbackgroundnotificationspec.getId());
                i = 1;
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onReceive(Context context, Intent intent)
    {
        LocalBackgroundNotificationSpec localbackgroundnotificationspec = (LocalBackgroundNotificationSpec)intent.getSerializableExtra("NotificationSpec");
        if (localbackgroundnotificationspec != null && intent.getAction().startsWith("LocalNotificationAction") && !WishApplication.getAppInstance().inForeground())
        {
            Notification notification = new Notification(0x7f020118, localbackgroundnotificationspec.getText(), System.currentTimeMillis());
            notification.flags = notification.flags | 0x10;
            String s = WishApplication.getAppInstance().getAppName();
            String s2 = localbackgroundnotificationspec.getText();
            Intent intent1 = new Intent(context, com/contextlogic/wish/push/LocalNotificationAlarmReceiverActivity);
            intent1.setAction(intent.getAction());
            intent1.putExtra("NotificationSpecId", localbackgroundnotificationspec.getId());
            intent1.putExtra("NotificationSpecTarget", localbackgroundnotificationspec.getTarget());
            intent1.addFlags(0x10000000);
            notification.setLatestEventInfo(context, s, s2, PendingIntent.getActivity(context, 0, intent1, 0));
            intent = (NotificationManager)context.getSystemService("notification");
            intent.cancel(localbackgroundnotificationspec.getId().hashCode());
            try
            {
                String s1 = localbackgroundnotificationspec.getTarget();
                PushNotificationService.sendSrnNotification(context, notification, localbackgroundnotificationspec.getId().hashCode(), s1, intent1, localbackgroundnotificationspec.getText(), null);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            intent.notify(localbackgroundnotificationspec.getId().hashCode(), notification);
            UserPreferences.setLastLocalNotificationSent((new Date()).getTime());
            context = UserPreferences.getPreferences();
            intent = PreferencesUtil.getIntegerArray(context, "LocalNotificationIds");
            intent.add(Integer.valueOf(localbackgroundnotificationspec.getId().hashCode()));
            PreferencesUtil.setIntegerArray(context, "LocalNotificationIds", intent);
            (new LogLocalNotificationService()).requestService(localbackgroundnotificationspec.getId(), "impression", null, null);
        }
    }
}
