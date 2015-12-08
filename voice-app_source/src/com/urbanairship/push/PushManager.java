// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.actions.ActionService;
import com.urbanairship.actions.Situation;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.PushArrivedEvent;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.util.Device;
import com.urbanairship.util.UAStringUtil;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.urbanairship.push:
//            PushMessage, PushPreferences, GCMRegistrar, BasicPushNotificationBuilder, 
//            PushService, PushNotificationBuilder

public class PushManager
{

    public static final String ACTION_NOTIFICATION_OPENED = "com.urbanairship.push.NOTIFICATION_OPENED";
    public static final String ACTION_NOTIFICATION_OPENED_PROXY = "com.urbanairship.push.NOTIFICATION_OPENED_PROXY";
    public static final String ACTION_PUSH_RECEIVED = "com.urbanairship.push.PUSH_RECEIVED";
    public static final String ACTION_REGISTRATION_FINISHED = "com.urbanairship.push.REGISTRATION_FINISHED";
    static final long APID_REREGISTRATION_INTERVAL_MS = 0x5265c00L;
    public static final String EXTRA_ACTIONS_PAYLOAD = "com.urbanairship.actions";
    public static final String EXTRA_ALERT = "com.urbanairship.push.ALERT";
    public static final String EXTRA_APID = "com.urbanairship.push.APID";
    public static final String EXTRA_CONTENT_INTENT = "com.urbanairship.push.CONTENT_INTENT";
    public static final String EXTRA_EXPIRATION = "com.urbanairship.push.EXPIRATION";
    public static final String EXTRA_NOTIFICATION_ID = "com.urbanairship.push.NOTIFICATION_ID";
    static final String EXTRA_PING = "com.urbanairship.push.PING";
    public static final String EXTRA_PUSH_ID = "com.urbanairship.push.CANONICAL_PUSH_ID";
    public static final String EXTRA_REGISTRATION_ERROR = "com.urbanairship.push.REGISTRATION_ERROR";
    public static final String EXTRA_REGISTRATION_VALID = "com.urbanairship.push.REGISTRATION_VALID";
    public static final String EXTRA_SEND_ID = "com.urbanairship.push.PUSH_ID";
    public static final String EXTRA_STRING_EXTRA = "com.urbanairship.push.STRING_EXTRA";
    private static final int MAX_CANONICAL_IDS = 10;
    private static final int RICH_PUSH_REFRESH_WAIT_TIME_MS = 60000;
    private static final PushManager instance = new PushManager();
    private boolean deviceTagsEnabled;
    private Class intentReceiver;
    private PushNotificationBuilder notificationBuilder;
    private PushPreferences preferences;

    private PushManager()
    {
        deviceTagsEnabled = true;
    }

    private void alertHostApplication(PushMessage pushmessage, int i)
    {
        Class class1 = getIntentReceiver();
        if (class1 != null)
        {
            Intent intent = new Intent("com.urbanairship.push.PUSH_RECEIVED");
            intent.setClass(UAirship.shared().getApplicationContext(), class1);
            intent.putExtras(pushmessage.getPushBundle());
            intent.putExtra("com.urbanairship.push.NOTIFICATION_ID", i);
            UAirship.shared().getApplicationContext().sendBroadcast(intent);
        }
    }

    private static void createPushArrivedEvent(String s)
    {
        String s1 = s;
        if (UAStringUtil.isEmpty(s))
        {
            s1 = UUID.randomUUID().toString();
        }
        UAirship.shared().getAnalytics().addEvent(new PushArrivedEvent(s1));
    }

    public static void disablePush()
    {
        if (instance.preferences.isPushEnabled())
        {
            instance.preferences.setPushEnabled(false);
            if (!UAStringUtil.isEmpty(instance.preferences.getGcmId()))
            {
                instance.preferences.setGcmId(null);
                GCMRegistrar.unregister();
            }
            instance.deleteApid(instance.preferences.getPushId());
            instance.preferences.setAPIDReady(false);
            instance.preferences.setLastApidRegistrationTime(0L);
        }
    }

    public static void enablePush()
    {
        if (!instance.preferences.isPushEnabled())
        {
            instance.preferences.setPushEnabled(true);
            startService();
        }
    }

    public static void init()
    {
        if (UAirship.shared().isFlying())
        {
            Logger.verbose("PushManager init");
            instance.preferences = new PushPreferences();
            instance.notificationBuilder = new BasicPushNotificationBuilder();
            startService();
            return;
        } else
        {
            throw new IllegalStateException("UAirship.takeOff must be called before PushManager.init!");
        }
    }

    private static boolean isCorrectApid(String s)
    {
        return s == null || s.equalsIgnoreCase(instance.preferences.getPushId());
    }

    private static boolean isPushEnabled()
    {
        return instance.preferences.isPushEnabled();
    }

    private boolean isUniqueCanonicalId(String s)
    {
        if (s == null)
        {
            return true;
        }
        List list = preferences.getCanonicalIds();
        if (list.contains(s))
        {
            return false;
        }
        list.add(s);
        if (list.size() > 10)
        {
            s = list.subList(list.size() - 10, list.size());
            preferences.setCanonicalIds(s);
            return true;
        } else
        {
            preferences.setCanonicalIds(list);
            return true;
        }
    }

    private void refreshRichPushMessages()
    {
        final Semaphore semaphore = new Semaphore(0);
        RichPushManager.shared().refreshMessages(new com.urbanairship.richpush.RichPushManager.RefreshMessagesCallback() {

            final PushManager this$0;
            final Semaphore val$semaphore;

            public void onRefreshMessages(boolean flag)
            {
                semaphore.release();
            }

            
            {
                this$0 = PushManager.this;
                semaphore = semaphore1;
                super();
            }
        });
        try
        {
            semaphore.tryAcquire(60000L, TimeUnit.MILLISECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Logger.warn("Interrupted while waiting for rich push messages to refresh");
        }
    }

    public static PushManager shared()
    {
        return instance;
    }

    public static void startService()
    {
        Logger.verbose("PushManager startService");
        Context context = UAirship.shared().getApplicationContext();
        Intent intent = new Intent(context, com/urbanairship/push/PushService);
        intent.setAction("com.urbanairship.push.START_SERVICE");
        context.startService(intent);
    }

    public static void validateManifest()
    {
        GCMRegistrar.validateManifest();
    }

    void deleteApid(String s)
    {
        Logger.debug((new StringBuilder()).append("Deleting APID: ").append(s).toString());
        if (UAStringUtil.isEmpty(s))
        {
            Logger.error("No APID. Cannot delete.");
            return;
        } else
        {
            Context context = UAirship.shared().getApplicationContext();
            Intent intent = new Intent();
            intent.setClass(context, com/urbanairship/push/PushService);
            intent.setAction("com.urbanairship.push.DELETE_APID");
            intent.putExtra("com.urbanairship.push.APID", s);
            context.startService(intent);
            return;
        }
    }

    void deliverPush(PushMessage pushmessage)
    {
        if (!isPushEnabled())
        {
            Logger.info("Received a push when push is disabled! Ignoring.");
            return;
        }
        if (!isCorrectApid(pushmessage.getPushApid()))
        {
            Logger.info((new StringBuilder()).append("Received a push addressed to a different APID: ").append(pushmessage.getPushApid()).toString());
            deleteApid(pushmessage.getPushApid());
            return;
        }
        if (!isUniqueCanonicalId(pushmessage.getCanonicalPushId()))
        {
            Logger.info((new StringBuilder()).append("Received a duplicate push with canonical ID: ").append(pushmessage.getCanonicalPushId()).toString());
            return;
        }
        preferences.setLastReceivedSendId(pushmessage.getSendId());
        createPushArrivedEvent(pushmessage.getSendId());
        ActionService.runActionsForPushBundle(pushmessage.getPushBundle(), Situation.PUSH_RECEIVED);
        if (pushmessage.isPing())
        {
            Logger.verbose("Received UA Ping");
            return;
        }
        if (pushmessage.isExpired())
        {
            Logger.debug("Notification expired, ignoring.");
            return;
        }
        if (UAirship.shared().getAirshipConfigOptions().richPushEnabled && !UAStringUtil.isEmpty(pushmessage.getRichPushMessageId()))
        {
            Logger.debug("Received a Rich Push.");
            refreshRichPushMessages();
        }
        alertHostApplication(pushmessage, pushmessage.buildAndDisplayNotification());
    }

    public String getAPID()
    {
        if (preferences.isAPIDReady())
        {
            return preferences.getPushId();
        } else
        {
            return null;
        }
    }

    public String getAlias()
    {
        return preferences.getAlias();
    }

    public boolean getDeviceTagsEnabled()
    {
        return deviceTagsEnabled;
    }

    public String getGcmId()
    {
        return preferences.getGcmId();
    }

    public Class getIntentReceiver()
    {
        return intentReceiver;
    }

    public PushNotificationBuilder getNotificationBuilder()
    {
        return notificationBuilder;
    }

    public PushPreferences getPreferences()
    {
        return preferences;
    }

    public Set getTags()
    {
        return preferences.getTags();
    }

    void sendRegistrationFinishedBroadcast(boolean flag)
    {
        boolean flag1 = preferences.isAPIDReady();
        preferences.setAPIDReady(flag);
        Context context;
        Object obj;
        if (UAirship.shared().getAirshipConfigOptions().richPushEnabled)
        {
            if (!flag1)
            {
                RichPushManager.shared().updateUser();
            } else
            {
                RichPushManager.shared().updateUserIfNecessary();
            }
        }
        context = UAirship.shared().getApplicationContext();
        obj = shared().getIntentReceiver();
        if (obj != null)
        {
            Intent intent = new Intent("com.urbanairship.push.REGISTRATION_FINISHED");
            intent.setClass(context, ((Class) (obj)));
            intent.putExtra("com.urbanairship.push.APID", preferences.getPushId());
            intent.putExtra("com.urbanairship.push.REGISTRATION_VALID", flag);
            obj = preferences.getGcmId();
            if (!UAStringUtil.isEmpty(((String) (obj))))
            {
                intent.putExtra("com.urbanairship.push.GCM_REGISTRATION_ID", ((String) (obj)));
            }
            context.sendBroadcast(intent);
        }
    }

    public void setAlias(String s)
    {
        if (!UAStringUtil.equals(s, preferences.getAlias()))
        {
            preferences.setAlias(s);
            updateApid();
        }
    }

    public void setAliasAndTags(String s, Set set)
    {
        if (set == null)
        {
            throw new IllegalArgumentException("Tags must be non-null.");
        }
        boolean flag = false;
        if (!UAStringUtil.equals(s, preferences.getAlias()))
        {
            preferences.setAlias(s);
            flag = true;
        }
        if (!set.equals(preferences.getTags()))
        {
            preferences.setTags(set);
            flag = true;
        }
        if (flag)
        {
            updateApid();
        }
    }

    public void setDeviceTagsEnabled(boolean flag)
    {
        deviceTagsEnabled = flag;
    }

    public void setGcmId(String s)
    {
        preferences.setAppVersionCode(UAirship.getPackageInfo().versionCode);
        preferences.setDeviceId(Device.getHashedDeviceId());
        if (!UAStringUtil.equals(s, preferences.getGcmId()))
        {
            preferences.setGcmId(s);
            updateApid();
        }
    }

    public void setIntentReceiver(Class class1)
    {
        ComponentName componentname = new ComponentName(UAirship.getPackageName(), class1.getCanonicalName());
        try
        {
            UAirship.getPackageManager().getReceiverInfo(componentname, 128);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Logger.error("The receiver class passed to PushManager.setIntentReceiver() is not declared in the manifest.");
            Logger.error((new StringBuilder()).append("AndroidManifest.xml missing required receiver: ").append(class1.getCanonicalName()).toString());
            return;
        }
        intentReceiver = class1;
    }

    public void setNotificationBuilder(PushNotificationBuilder pushnotificationbuilder)
    {
        notificationBuilder = pushnotificationbuilder;
    }

    public void setTags(Set set)
    {
        if (set == null)
        {
            throw new IllegalArgumentException("Tags must be non-null.");
        }
        if (!set.equals(preferences.getTags()))
        {
            preferences.setTags(set);
            updateApid();
        }
    }

    void updateApid()
    {
        preferences.setApidUpdateNeeded(true);
        Context context = UAirship.shared().getApplicationContext();
        Intent intent = new Intent();
        intent.setClass(context, com/urbanairship/push/PushService);
        intent.setAction("com.urbanairship.push.UPDATE_APID");
        context.startService(intent);
    }

    public void updateApidIfNecessary()
    {
        if (preferences.isApidUpdateNeeded())
        {
            updateApid();
        }
    }

}
