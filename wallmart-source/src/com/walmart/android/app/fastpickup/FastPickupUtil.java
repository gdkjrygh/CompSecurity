// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.fastpickup;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.config.WalmartNetServiceSettings;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.FastPickupOrderReadyEvent;
import com.walmart.android.service.ErrorCodes;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.fastpickup.FastPickupManager;
import com.walmart.android.wmservice.fastpickup.FastPickupNotificationReceiver;
import com.walmart.android.wmservice.fastpickup.FastPickupService;
import com.walmartlabs.utils.WLog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class FastPickupUtil
{
    public static interface FastPickupErrorCodes
        extends ErrorCodes
    {

        public static final int ERROR_NOT_AUTHENTICATED = 401;
    }


    private static final String FAST_PICKUP_PREFS = "FAST_PICKUP_PREFS";
    private static final String NOTIFICATION_COUNTER_PREF = "NOTIFICATION_COUNTER";
    private static final String PUSH_NOTIFICATION_COUNTER_PREF = "PUSH_COUNTER";
    private static final String TAG = com/walmart/android/app/fastpickup/FastPickupUtil.getSimpleName();

    public FastPickupUtil()
    {
    }

    public static AlertDialog buildDebugDialog(Context context)
    {
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(context);
        builder.setTitle("Fast Pickup Settings");
        context = new android.content.DialogInterface.OnClickListener(context) {

            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    WalmartNetServiceSettings.showFastPickupServerSelectDialog(context);
                    return;

                case 1: // '\001'
                    WLog.d(FastPickupUtil.TAG, "Clearing notification cache...");
                    SharedPreferencesUtil.clearFastPickupNotificationStatus(context, null);
                    return;

                case 2: // '\002'
                    WLog.d(FastPickupUtil.TAG, "Clearing read order...");
                    Services.get().getFastPickupManager().resetServerState();
                    SharedPreferencesUtil.clearFastPickupNotificationStatus(context, null);
                    return;

                case 3: // '\003'
                    dialoginterface = new Intent();
                    dialoginterface.setAction("com.google.android.c2dm.intent.RECEIVE");
                    dialoginterface.addCategory("com.walmart.android");
                    dialoginterface.putExtra("url", "walmart://checkin/2280");
                    dialoginterface.putExtra("title", "Fast Pickup test");
                    dialoginterface.putExtra("text", "Test message");
                    context.sendOrderedBroadcast(dialoginterface, null);
                    return;

                case 4: // '\004'
                    FastPickupService.refresh(context, true);
                    break;
                }
            }

            
            {
                context = context1;
                super();
            }
        };
        builder.setItems(new String[] {
            "Select server", "Clear settings/prefs", "Reset received order", "Test GCM notification", "Refresh server data"
        }, context);
        return builder.create();
    }

    public static Notification createNotification(Context context, String s, String s1, String s2, String s3, int i, String as[])
    {
        Intent intent = new Intent(context, com/walmart/android/wmservice/fastpickup/FastPickupNotificationReceiver);
        intent.putExtra("STORE_ID", s);
        intent.putExtra("ORDER_IDS", as);
        if (!TextUtils.isEmpty(s3))
        {
            intent.putExtra("ANIVIA_TYPE", s3);
        }
        s = PendingIntent.getBroadcast(context, i, intent, 0);
        return (new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(0x7f0202ef).setContentTitle(s1).setContentText(s2).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(s2)).setContentIntent(s).setAutoCancel(true).build();
    }

    public static boolean fieldChanged(Object obj, Object obj1)
    {
label0:
        {
            boolean flag3 = false;
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (obj == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (obj1 == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!(flag1 ^ flag))
            {
                flag2 = flag3;
                if (obj == null)
                {
                    break label0;
                }
                flag2 = flag3;
                if (obj.equals(obj1))
                {
                    break label0;
                }
            }
            flag2 = true;
        }
        return flag2;
    }

    private static int getCurrentCounter(Context context, String s)
    {
        return context.getSharedPreferences("FAST_PICKUP_PREFS", 0).getInt(s, 0);
    }

    public static int getCurrentRequestCode(Context context)
    {
        return getCurrentCounter(context, "NOTIFICATION_COUNTER");
    }

    public static int getNextPushRequestCode(Context context)
    {
        return incrementCounter(context, "PUSH_COUNTER");
    }

    public static int getNextRequestCode(Context context)
    {
        return incrementCounter(context, "NOTIFICATION_COUNTER");
    }

    private static int incrementCounter(Context context, String s)
    {
        context = context.getSharedPreferences("FAST_PICKUP_PREFS", 0);
        int i = context.getInt(s, 0) + 1;
        context = context.edit();
        context.putInt(s, i);
        context.apply();
        return i;
    }

    public static boolean isUseStorePickup()
    {
        Object obj = AppConfigManager.get();
        if (obj != null)
        {
            obj = ((AppConfigManager) (obj)).getAppConfig();
            if (obj != null)
            {
                return ((AppConfig) (obj)).storePickup;
            }
        }
        return false;
    }

    public static String print(List list)
    {
        if (list != null)
        {
            return StringUtils.join(list, ", ");
        } else
        {
            return "null";
        }
    }

    public static String print(Map map)
    {
        if (map != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append(entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
                stringbuilder.append(entry.getKey());
                stringbuilder.append(":");
            }

            return stringbuilder.toString();
        } else
        {
            return "null";
        }
    }

    public static void sendPageViewEvent(String s)
    {
        FastPickupOrderReadyEvent fastpickuporderreadyevent = Services.get().getFastPickupManager().getFastPickupOrderReadyEvent();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", s).putString("section", "express pickup");
        if (fastpickuporderreadyevent.isLocationEnabled())
        {
            s = "yes";
        } else
        {
            s = "no";
        }
        builder = builder.putString("locationEnabled", s);
        if (fastpickuporderreadyevent.isInStore())
        {
            s = "inside";
        } else
        {
            s = "outside";
        }
        s = builder.putString("geofence", s);
        MessageBus.getBus().post(s);
    }

    public static int translateErrorCode(Integer integer)
    {
        switch (integer.intValue())
        {
        default:
            return 0x15f91;

        case 90000: 
        case 90001: 
        case 90002: 
        case 90003: 
            return integer.intValue();

        case 401: 
            return 401;
        }
    }


}
