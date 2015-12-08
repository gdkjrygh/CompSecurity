// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk:
//            KahunaPreferences, KahunaCommon, KahunaCoreReceiver, KahunaUtils

public class PushNotificationsManager
{

    private static final long DEFAULT_DISPLAY_ID_COOLDOWN_SECONDS = 43200L;
    private static final int KAHUNA_PRIVATE_ID = 1964;
    protected static final String LANDING_DICTIONARY_EXTRAS = "KAHUNA_LANDING_EXTRAS_ID";
    private static final String TRACKING_ID_EXTRA = "KAHUNA_TRACKING_ID";
    private static PushNotificationsManager instance = new PushNotificationsManager();
    private Class pushCustomReceiver;

    private PushNotificationsManager()
    {
    }

    private void cleanExpiredDisplayIds(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        long l = System.currentTimeMillis() / 1000L;
        Object obj = KahunaPreferences.getSavedPushDisplayIds(context);
        hashmap = new HashMap();
        obj = ((Map) (obj)).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (((Long)entry.getValue()).longValue() > l)
            {
                hashmap.put(entry.getKey(), entry.getValue());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_104;
        context;
        throw context;
        KahunaPreferences.savePushDisplayIds(hashmap, context);
        this;
        JVM INSTR monitorexit ;
    }

    private static void generateNotification(Context context, String s, String s1, int i, Bundle bundle)
    {
        Object obj;
        int j;
        ApplicationInfo applicationinfo = context.getApplicationInfo();
        try
        {
            obj = context.getString(applicationinfo.labelRes);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Exception trying to retrieve Application label:  ").append(obj).toString());
            }
            obj = "";
        }
        j = applicationinfo.icon;
        if (KahunaCommon.getSharedInstance().getIconResourceId() > 0)
        {
            j = KahunaCommon.getSharedInstance().getIconResourceId();
        }
        if (!"".equals(obj) && j != 0) goto _L2; else goto _L1
_L1:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", "Recieved push, but app has no icon or app name label, NOT showing notification");
        }
_L3:
        return;
_L2:
        int k;
        k = 1964;
        if (i != -1)
        {
            k = i;
        }
        Intent intent;
        long l;
        l = System.currentTimeMillis();
        intent = new Intent(context, com/kahuna/sdk/KahunaCoreReceiver);
        intent.setAction("KAHUNA_PUSH_CLICKED");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        intent.putExtra("KAHUNA_TRACKING_ID", s1);
        intent.putExtra("KAHUNA_NID", k);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        intent.putExtra("KAHUNA_LANDING_EXTRAS_ID", bundle);
        s1 = PendingIntent.getBroadcast(context, 0, intent, 0x8000000);
        bundle = (NotificationManager)context.getSystemService("notification");
        i = 1;
        android.support.v4.app.NotificationCompat.Builder builder = (new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(j).setContentTitle(((CharSequence) (obj))).setContentText(s).setDefaults(5).setTicker(s).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(s));
        builder.setContentIntent(s1);
        builder.setAutoCancel(true);
        bundle.notify(k, builder.build());
_L4:
        if (i == 0)
        {
            try
            {
                Notification notification = new Notification(j, s, l);
                notification.defaults = notification.defaults | 5;
                notification.setLatestEventInfo(context, ((CharSequence) (obj)), s, s1);
                notification.flags = notification.flags | 0x10;
                bundle.notify(k, notification);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Caught generic exception trying to build push notification:  ").append(context).toString());
                return;
            }
        }
          goto _L3
        Throwable throwable;
        throwable;
        Log.w("Kahuna", "You should add the support library to your application");
        i = 0;
          goto _L4
    }

    private boolean getShouldDisplayPushMessage(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        l = System.currentTimeMillis() / 1000L;
        context = KahunaPreferences.getSavedPushDisplayIds(context);
        if (!context.containsKey(s)) goto _L2; else goto _L1
_L1:
        long l1 = ((Long)context.get(s)).longValue();
        if (l1 <= l) goto _L2; else goto _L3
_L3:
        boolean flag = false;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
        context;
        throw context;
    }

    protected static void handlePushMessageClicked(Context context, Intent intent)
    {
        intent = intent.getExtras();
        if (intent != null)
        {
            String s = intent.getString("KAHUNA_TRACKING_ID");
            if (s != null)
            {
                KahunaCommon.getSharedInstance().trackPushClickedEvent(s);
            }
        }
        if (!KahunaCommon.getSharedInstance().getKahunaPushLaunchOverride())
        {
            Intent intent1 = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            intent1.setFlags(0x34000000);
            context.getApplicationContext().startActivity(intent1);
        }
        if (instance.pushCustomReceiver != null)
        {
            Intent intent2 = new Intent(context, instance.pushCustomReceiver);
            intent2.setAction("com.kahuna.sdk.push.clicked");
            intent = intent.getBundle("KAHUNA_LANDING_EXTRAS_ID");
            if (intent != null)
            {
                intent2.putExtra("landing_extras_id", intent);
            }
            context.sendBroadcast(intent2);
        }
    }

    protected static void handlePushMessageRecieved(Context context, Bundle bundle)
    {
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        String s;
        Object obj1;
        String s1;
        int i;
        try
        {
            obj = bundle.getString("alert");
            s = bundle.getString("k");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Exception reading message from Push Notification Manager: ").append(obj).toString());
            }
            obj = null;
            s = null;
        }
        if (!bundle.containsKey("nid")) goto _L4; else goto _L3
_L3:
        obj1 = bundle.get("nid");
        if (!(obj1 instanceof String)) goto _L6; else goto _L5
_L5:
        i = Integer.parseInt((String)obj1);
_L16:
        if (bundle.containsKey("k"))
        {
            bundle.remove("k");
        }
        if (bundle.containsKey("nid"))
        {
            bundle.remove("nid");
        }
        if (bundle.containsKey("collapse_key"))
        {
            bundle.remove("collapse_key");
        }
        if (bundle.containsKey("from"))
        {
            bundle.remove("from");
        }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Kahuna Message: ").append(((String) (obj))).toString());
        }
        if (obj == null || s == null) goto _L1; else goto _L7
_L7:
        if (!bundle.containsKey("k_internal")) goto _L9; else goto _L8
_L8:
        obj1 = bundle.getString("k_internal");
        if (KahunaUtils.isNullOrEmpty(((String) (obj1)))) goto _L11; else goto _L10
_L10:
        obj1 = new JSONObject(((String) (obj1)));
        s1 = ((JSONObject) (obj1)).optString("gid");
        if (KahunaUtils.isNullOrEmpty(s1)) goto _L11; else goto _L12
_L12:
        if (instance.getShouldDisplayPushMessage(context, s1)) goto _L14; else goto _L13
_L13:
        if (!KahunaCommon.mDebugEnabled) goto _L1; else goto _L15
_L15:
        Log.w("Kahuna", (new StringBuilder()).append("Received another push with displayId: ").append(s1).append(" within the cooldown period. Ignoring push.").toString());
        return;
_L11:
        bundle.remove("k_internal");
_L9:
        if (instance.pushCustomReceiver != null)
        {
            obj1 = new Intent(context, instance.pushCustomReceiver);
            ((Intent) (obj1)).setAction("com.kahuna.sdk.push.received");
            ((Intent) (obj1)).putExtra("alert", ((String) (obj)));
            if (bundle != null)
            {
                ((Intent) (obj1)).putExtra("landing_extras_id", bundle);
            }
            context.sendBroadcast(((Intent) (obj1)));
        }
        try
        {
            if (KahunaCommon.getSharedInstance().getShouldDisplayNotification() && !KahunaCommon.getKahunaGenerateNotificationsOverride())
            {
                break MISSING_BLOCK_LABEL_553;
            }
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", "Hiding Kahuna Push notification because user is generating notification separately.");
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("Kahuna", "KahunaSDK wasn't initialized in onAppCreate(), please initialized Kahuna correctly to prevent strange behavior");
            context.printStackTrace();
            return;
        }
          goto _L1
_L6:
        try
        {
            i = ((Integer)obj1).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Exception reading push message notification id: ").append(obj1).toString());
            }
            i = -1;
        }
          goto _L16
_L4:
        i = -1;
          goto _L16
_L14:
        try
        {
            long l = ((JSONObject) (obj1)).optLong("ex_offset", -1L);
            instance.updateDisplayId(context, s1, l);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.e("Kahuna", (new StringBuilder()).append("Caught JSON Exception trying to parse Kahuna internal payload: ").append(obj1).toString());
            }
        }
          goto _L11
        generateNotification(context, ((String) (obj)), s, i, bundle);
        return;
          goto _L16
    }

    protected static void init(Context context)
    {
        instance.cleanExpiredDisplayIds(context);
    }

    protected static void setPushRecevier(Class class1)
    {
        instance.pushCustomReceiver = class1;
    }

    private void updateDisplayId(Context context, String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = System.currentTimeMillis() / 1000L;
        Map map;
        if (l > -1L)
        {
            l = l1 + l;
        } else
        {
            l = l1 + 43200L;
        }
        map = KahunaPreferences.getSavedPushDisplayIds(context);
        map.put(s, Long.valueOf(l));
        KahunaPreferences.savePushDisplayIds(map, context);
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Updated recevied push group id: ").append(s).append(" with expire time: ").append(l).toString());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

}
