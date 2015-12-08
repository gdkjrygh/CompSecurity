// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//            NotificationCompat

public class NotificationManagerCompat
{

    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    private static final Impl IMPL;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_BIND_FLAGS;
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static Set sEnabledNotificationListenerPackages = new HashSet();
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static final Object sLock = new Object();
    private static SideChannelManager sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    private NotificationManagerCompat(Context context)
    {
        mContext = context;
        mNotificationManager = (NotificationManager)mContext.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context)
    {
        return new NotificationManagerCompat(context);
    }

    public static Set getEnabledListenerPackages(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (context != null && !context.equals(sEnabledNotificationListeners))
        {
            String as[] = context.split(":");
            HashSet hashset = new HashSet(as.length);
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                ComponentName componentname = ComponentName.unflattenFromString(as[i]);
                if (componentname != null)
                {
                    hashset.add(componentname.getPackageName());
                }
            }

            synchronized (sEnabledNotificationListenersLock)
            {
                sEnabledNotificationListenerPackages = hashset;
                sEnabledNotificationListeners = context;
            }
        }
        return sEnabledNotificationListenerPackages;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void pushSideChannelQueue(Task task)
    {
    /* block-local class not found */
    class SideChannelManager {}

        synchronized (sLock)
        {
            if (sSideChannelManager == null)
            {
                sSideChannelManager = new SideChannelManager(mContext.getApplicationContext());
            }
        }
        sSideChannelManager.queueTask(task);
        return;
        task;
        obj;
        JVM INSTR monitorexit ;
        throw task;
    }

    private static boolean useSideChannelForNotification(Notification notification)
    {
        notification = NotificationCompat.getExtras(notification);
        return notification != null && notification.getBoolean("android.support.useSideChannel");
    }

    public void cancel(int i)
    {
        cancel(null, i);
    }

    public void cancel(String s, int i)
    {
    /* block-local class not found */
    class Impl {}

        IMPL.cancelNotification(mNotificationManager, s, i);
    /* block-local class not found */
    class CancelTask {}

        if (android.os.Build.VERSION.SDK_INT <= 19)
        {
            pushSideChannelQueue(new CancelTask(mContext.getPackageName(), i, s));
        }
    }

    public void cancelAll()
    {
        mNotificationManager.cancelAll();
        if (android.os.Build.VERSION.SDK_INT <= 19)
        {
            pushSideChannelQueue(new CancelTask(mContext.getPackageName()));
        }
    }

    public void notify(int i, Notification notification)
    {
        notify(null, i, notification);
    }

    public void notify(String s, int i, Notification notification)
    {
        if (useSideChannelForNotification(notification))
        {
    /* block-local class not found */
    class NotifyTask {}

            pushSideChannelQueue(new NotifyTask(mContext.getPackageName(), i, s, notification));
            IMPL.cancelNotification(mNotificationManager, s, i);
            return;
        } else
        {
            IMPL.postNotification(mNotificationManager, s, i, notification);
            return;
        }
    }

    static 
    {
    /* block-local class not found */
    class ImplBase {}

    /* block-local class not found */
    class ImplEclair {}

    /* block-local class not found */
    class ImplIceCreamSandwich {}

        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new ImplIceCreamSandwich();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            IMPL = new ImplEclair();
        } else
        {
            IMPL = new ImplBase();
        }
        SIDE_CHANNEL_BIND_FLAGS = IMPL.getSideChannelBindFlags();
    }


    // Unreferenced inner class android/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent
    /* block-local class not found */
    class ServiceConnectedEvent {}


    // Unreferenced inner class android/support/v4/app/NotificationManagerCompat$Task
    /* block-local class not found */
    class Task {}

}
