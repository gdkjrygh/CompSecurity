// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPConfig, MixpanelAPI, ResourceIds

public class GCMReceiver extends BroadcastReceiver
{
    static class NotificationData
    {

        public final int icon;
        public final Intent intent;
        public final String message;
        public final CharSequence title;

        private NotificationData(int i, CharSequence charsequence, String s, Intent intent1)
        {
            icon = i;
            title = charsequence;
            message = s;
            intent = intent1;
        }

        NotificationData(int i, CharSequence charsequence, String s, Intent intent1, NotificationData notificationdata)
        {
            this(i, charsequence, s, intent1);
        }
    }


    private static final String LOGTAG = "MixpanelAPI.GCMReceiver";

    public GCMReceiver()
    {
    }

    private Notification buildNotification(Context context, Intent intent, ResourceIds resourceids)
    {
        intent = readInboundIntent(context, intent, resourceids);
        if (intent == null)
        {
            return null;
        }
        if (MPConfig.DEBUG)
        {
            Log.d("MixpanelAPI.GCMReceiver", (new StringBuilder("MP GCM notification received: ")).append(((NotificationData) (intent)).message).toString());
        }
        resourceids = PendingIntent.getActivity(context, 0, ((NotificationData) (intent)).intent, 0x8000000);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return makeNotificationSDK16OrHigher(context, resourceids, intent);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return makeNotificationSDK11OrHigher(context, resourceids, intent);
        } else
        {
            return makeNotificationSDKLessThan11(context, resourceids, intent);
        }
    }

    private Intent buildNotificationIntent(Context context, String s)
    {
        Uri uri = null;
        if (s != null)
        {
            uri = Uri.parse(s);
        }
        if (uri == null)
        {
            return getDefaultIntent(context);
        } else
        {
            return new Intent("android.intent.action.VIEW", uri);
        }
    }

    private void handleNotificationIntent(Context context, Intent intent)
    {
        String s = MPConfig.getInstance(context).getResourcePackageName();
        Object obj = s;
        if (s == null)
        {
            obj = context.getPackageName();
        }
        obj = new ResourceReader.Drawables(((String) (obj)), context);
        intent = buildNotification(context.getApplicationContext(), intent, ((ResourceIds) (obj)));
        if (intent != null)
        {
            ((NotificationManager)context.getSystemService("notification")).notify(0, intent);
        }
    }

    private void handleRegistrationIntent(Intent intent)
    {
        final String registration = intent.getStringExtra("registration_id");
        if (intent.getStringExtra("error") != null)
        {
            Log.e("MixpanelAPI.GCMReceiver", (new StringBuilder("Error when registering for GCM: ")).append(intent.getStringExtra("error")).toString());
        } else
        {
            if (registration != null)
            {
                if (MPConfig.DEBUG)
                {
                    Log.d("MixpanelAPI.GCMReceiver", (new StringBuilder("Registering GCM ID: ")).append(registration).toString());
                }
                MixpanelAPI.allInstances(new MixpanelAPI.InstanceProcessor() {

                    final GCMReceiver this$0;
                    private final String val$registration;

                    public void process(MixpanelAPI mixpanelapi)
                    {
                        mixpanelapi.getPeople().setPushRegistrationId(registration);
                    }

            
            {
                this$0 = GCMReceiver.this;
                registration = s;
                super();
            }
                });
                return;
            }
            if (intent.getStringExtra("unregistered") != null)
            {
                if (MPConfig.DEBUG)
                {
                    Log.d("MixpanelAPI.GCMReceiver", "Unregistering from GCM");
                }
                MixpanelAPI.allInstances(new MixpanelAPI.InstanceProcessor() {

                    final GCMReceiver this$0;

                    public void process(MixpanelAPI mixpanelapi)
                    {
                        mixpanelapi.getPeople().clearPushRegistrationId();
                    }

            
            {
                this$0 = GCMReceiver.this;
                super();
            }
                });
                return;
            }
        }
    }

    private Notification makeNotificationSDK11OrHigher(Context context, PendingIntent pendingintent, NotificationData notificationdata)
    {
        context = (new android.app.Notification.Builder(context)).setSmallIcon(notificationdata.icon).setTicker(notificationdata.message).setWhen(System.currentTimeMillis()).setContentTitle(notificationdata.title).setContentText(notificationdata.message).setContentIntent(pendingintent).getNotification();
        context.flags = ((Notification) (context)).flags | 0x10;
        return context;
    }

    private Notification makeNotificationSDK16OrHigher(Context context, PendingIntent pendingintent, NotificationData notificationdata)
    {
        context = (new android.app.Notification.Builder(context)).setSmallIcon(notificationdata.icon).setTicker(notificationdata.message).setWhen(System.currentTimeMillis()).setContentTitle(notificationdata.title).setContentText(notificationdata.message).setContentIntent(pendingintent).setStyle((new android.app.Notification.BigTextStyle()).bigText(notificationdata.message)).build();
        context.flags = ((Notification) (context)).flags | 0x10;
        return context;
    }

    private Notification makeNotificationSDKLessThan11(Context context, PendingIntent pendingintent, NotificationData notificationdata)
    {
        Notification notification = new Notification(notificationdata.icon, notificationdata.message, System.currentTimeMillis());
        notification.flags = notification.flags | 0x10;
        notification.setLatestEventInfo(context, notificationdata.title, notificationdata.message, pendingintent);
        return notification;
    }

    Intent getDefaultIntent(Context context)
    {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(s))
        {
            handleRegistrationIntent(intent);
        } else
        if ("com.google.android.c2dm.intent.RECEIVE".equals(s))
        {
            handleNotificationIntent(context, intent);
            return;
        }
    }

    NotificationData readInboundIntent(Context context, Intent intent, ResourceIds resourceids)
    {
        PackageManager packagemanager = context.getPackageManager();
        String s1 = intent.getStringExtra("mp_message");
        String s3 = intent.getStringExtra("mp_icnm");
        String s2 = intent.getStringExtra("mp_cta");
        String s = intent.getStringExtra("mp_title");
        if (s1 == null)
        {
            return null;
        }
        int j = -1;
        int i = j;
        if (s3 != null)
        {
            i = j;
            if (resourceids.knownIdName(s3))
            {
                i = resourceids.idFromName(s3);
            }
        }
        try
        {
            resourceids = packagemanager.getApplicationInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            resourceids = null;
        }
        j = i;
        if (i == -1)
        {
            j = i;
            if (resourceids != null)
            {
                j = ((ApplicationInfo) (resourceids)).icon;
            }
        }
        i = j;
        if (j == -1)
        {
            i = 0x1080093;
        }
        intent = s;
        if (s == null)
        {
            intent = s;
            if (resourceids != null)
            {
                intent = packagemanager.getApplicationLabel(resourceids);
            }
        }
        resourceids = intent;
        if (intent == null)
        {
            resourceids = "A message for you";
        }
        return new NotificationData(i, resourceids, s1, buildNotificationIntent(context, s2), null);
    }
}
