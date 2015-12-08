// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import com.urbanairship.BaseManager;
import com.urbanairship.CoreReceiver;
import com.urbanairship.Logger;
import com.urbanairship.PreferenceDataStore;
import com.urbanairship.UAirship;
import com.urbanairship.actions.ActionService;
import com.urbanairship.actions.Situation;
import com.urbanairship.analytics.Analytics;
import com.urbanairship.analytics.PushArrivedEvent;
import com.urbanairship.push.notifications.DefaultNotificationFactory;
import com.urbanairship.push.notifications.NotificationActionButtonGroup;
import com.urbanairship.push.notifications.NotificationFactory;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushUser;
import com.urbanairship.util.UAStringUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.urbanairship.push:
//            PushPreferences, NotificationActionButtonGroupFactory, PushMessage, PushService, 
//            ChannelRegistrationPayload

public class PushManager extends BaseManager
{

    public static final String ACTION_CHANNEL_UPDATED = "com.urbanairship.push.CHANNEL_UPDATED";
    public static final String ACTION_NOTIFICATION_BUTTON_OPENED_PROXY = "com.urbanairship.ACTION_NOTIFICATION_BUTTON_OPENED_PROXY";
    public static final String ACTION_NOTIFICATION_DISMISSED = "com.urbanairship.push.DISMISSED";
    public static final String ACTION_NOTIFICATION_DISMISSED_PROXY = "com.urbanairship.ACTION_NOTIFICATION_DISMISSED_PROXY";
    public static final String ACTION_NOTIFICATION_OPENED = "com.urbanairship.push.OPENED";
    public static final String ACTION_NOTIFICATION_OPENED_PROXY = "com.urbanairship.ACTION_NOTIFICATION_OPENED_PROXY";
    public static final String ACTION_PUSH_RECEIVED = "com.urbanairship.push.RECEIVED";
    public static final String EXTRA_CHANNEL_ID = "com.urbanairship.push.EXTRA_CHANNEL_ID";
    public static final String EXTRA_ERROR = "com.urbanairship.push.EXTRA_ERROR";
    public static final String EXTRA_NOTIFICATION_ACTION_BUTTON_DESCRIPTION = "com.urbanairship.push.EXTRA_NOTIFICATION_ACTION_BUTTON_DESCRIPTION";
    public static final String EXTRA_NOTIFICATION_BUTTON_ACTIONS_PAYLOAD = "com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ACTIONS_PAYLOAD";
    public static final String EXTRA_NOTIFICATION_BUTTON_FOREGROUND = "com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_FOREGROUND";
    public static final String EXTRA_NOTIFICATION_BUTTON_ID = "com.urbanairship.push.EXTRA_NOTIFICATION_BUTTON_ID";
    public static final String EXTRA_NOTIFICATION_CONTENT_INTENT = "com.urbanairship.push.EXTRA_NOTIFICATION_CONTENT_INTENT";
    public static final String EXTRA_NOTIFICATION_DELETE_INTENT = "com.urbanairship.push.EXTRA_NOTIFICATION_DELETE_INTENT";
    public static final String EXTRA_NOTIFICATION_ID = "com.urbanairship.push.NOTIFICATION_ID";
    public static final String EXTRA_PUSH_BUNDLE = "com.urbanairship.push.EXTRA_PUSH_BUNDLE";
    private static final int MAX_CANONICAL_IDS = 10;
    private static final int MAX_TAG_LENGTH = 127;
    private static final int RICH_PUSH_REFRESH_WAIT_TIME_MS = 60000;
    private String UA_NOTIFICATION_BUTTON_GROUP_PREFIX;
    private Map actionGroupMap;
    private boolean deviceTagsEnabled;
    private NotificationFactory notificationFactory;
    NotificationManagerCompat notificationManager;
    PushPreferences preferences;

    public PushManager(Context context, PreferenceDataStore preferencedatastore)
    {
        this(context, new PushPreferences(preferencedatastore), NotificationManagerCompat.from(context));
    }

    PushManager(Context context, PushPreferences pushpreferences, NotificationManagerCompat notificationmanagercompat)
    {
        UA_NOTIFICATION_BUTTON_GROUP_PREFIX = "ua_";
        actionGroupMap = new HashMap();
        deviceTagsEnabled = true;
        notificationManager = notificationmanagercompat;
        preferences = pushpreferences;
        notificationFactory = new DefaultNotificationFactory(context);
        if (Logger.logLevel < 7 && !UAStringUtil.isEmpty(getChannelId()))
        {
            Log.d((new StringBuilder()).append(UAirship.getAppName()).append(" Channel ID").toString(), getChannelId());
        }
        actionGroupMap.putAll(NotificationActionButtonGroupFactory.createUrbanAirshipGroups());
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

    static String getSecureId(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
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

    private Set normalizeTags(Set set)
    {
        if (set != null) goto _L2; else goto _L1
_L1:
        set = null;
_L4:
        return set;
_L2:
        HashSet hashset = new HashSet();
        Iterator iterator = set.iterator();
        do
        {
            set = hashset;
            if (!iterator.hasNext())
            {
                continue;
            }
            set = (String)iterator.next();
            if (set == null)
            {
                Logger.error("Null tag was removed from set.");
            } else
            {
                set = set.trim();
                if (set.length() <= 0 || set.length() > 127)
                {
                    Logger.error((new StringBuilder()).append("Tag with zero or greater than max length was removed from set: ").append(set).toString());
                } else
                {
                    hashset.add(set);
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void refreshRichPushMessages()
    {
        Semaphore semaphore = new Semaphore(0);
        UAirship.shared().getRichPushManager().refreshMessages(new _cls1(semaphore));
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

    private void sendPushReceivedBroadcast(PushMessage pushmessage, Integer integer)
    {
        pushmessage = (new Intent("com.urbanairship.push.RECEIVED")).putExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE", pushmessage.getPushBundle()).addCategory(UAirship.getPackageName()).setPackage(UAirship.getPackageName());
        if (integer != null)
        {
            pushmessage.putExtra("com.urbanairship.push.NOTIFICATION_ID", integer.intValue());
        }
        UAirship.getApplicationContext().sendBroadcast(pushmessage, UAirship.getUrbanAirshipPermission());
    }

    public static PushManager shared()
    {
        return UAirship.shared().getPushManager();
    }

    private Integer show(PushMessage pushmessage, NotificationFactory notificationfactory)
    {
        if (pushmessage == null || notificationfactory == null || !getUserNotificationsEnabled())
        {
            return null;
        }
        Context context = UAirship.getApplicationContext();
        Integer integer;
        try
        {
            integer = Integer.valueOf(notificationfactory.getNextId(pushmessage));
            notificationfactory = notificationfactory.createNotification(pushmessage, integer.intValue());
        }
        // Misplaced declaration of an exception variable
        catch (PushMessage pushmessage)
        {
            Logger.error("Unable to create and display notification.", pushmessage);
            return null;
        }
        if (notificationfactory != null)
        {
            if (!isVibrateEnabled() || isInQuietTime())
            {
                notificationfactory.vibrate = null;
                notificationfactory.defaults = ((Notification) (notificationfactory)).defaults & -3;
            }
            if (!isSoundEnabled() || isInQuietTime())
            {
                notificationfactory.sound = null;
                notificationfactory.defaults = ((Notification) (notificationfactory)).defaults & -2;
            }
            Intent intent = (new Intent(context, com/urbanairship/CoreReceiver)).setAction("com.urbanairship.ACTION_NOTIFICATION_OPENED_PROXY").addCategory(UUID.randomUUID().toString()).putExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE", pushmessage.getPushBundle()).putExtra("com.urbanairship.push.NOTIFICATION_ID", integer);
            if (((Notification) (notificationfactory)).contentIntent != null)
            {
                intent.putExtra("com.urbanairship.push.EXTRA_NOTIFICATION_CONTENT_INTENT", ((Notification) (notificationfactory)).contentIntent);
            }
            pushmessage = (new Intent(context, com/urbanairship/CoreReceiver)).setAction("com.urbanairship.ACTION_NOTIFICATION_DISMISSED_PROXY").addCategory(UUID.randomUUID().toString()).putExtra("com.urbanairship.push.EXTRA_PUSH_BUNDLE", pushmessage.getPushBundle()).putExtra("com.urbanairship.push.NOTIFICATION_ID", integer);
            if (((Notification) (notificationfactory)).deleteIntent != null)
            {
                pushmessage.putExtra("com.urbanairship.push.EXTRA_NOTIFICATION_DELETE_INTENT", ((Notification) (notificationfactory)).deleteIntent);
            }
            notificationfactory.contentIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            notificationfactory.deleteIntent = PendingIntent.getBroadcast(context, 0, pushmessage, 0);
            Logger.debug((new StringBuilder()).append("Posting notification ").append(notificationfactory).append(" with id ").append(integer).toString());
            notificationManager.notify(integer.intValue(), notificationfactory);
            return integer;
        } else
        {
            return null;
        }
    }

    public void addNotificationActionButtonGroup(String s, NotificationActionButtonGroup notificationactionbuttongroup)
    {
        if (s.startsWith(UA_NOTIFICATION_BUTTON_GROUP_PREFIX))
        {
            Logger.warn((new StringBuilder()).append("Unable to add any notification button groups that starts with the reserved Urban Airship prefix ").append(UA_NOTIFICATION_BUTTON_GROUP_PREFIX).toString());
            return;
        } else
        {
            actionGroupMap.put(s, notificationactionbuttongroup);
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
        if (!isUniqueCanonicalId(pushmessage.getCanonicalPushId()))
        {
            Logger.info((new StringBuilder()).append("Received a duplicate push with canonical ID: ").append(pushmessage.getCanonicalPushId()).toString());
            return;
        }
        preferences.setLastReceivedSendId(pushmessage.getSendId());
        createPushArrivedEvent(pushmessage.getSendId());
        ActionService.runActionsPayload(UAirship.getApplicationContext(), pushmessage.getActionsPayload(), Situation.PUSH_RECEIVED, pushmessage);
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
        if (!UAStringUtil.isEmpty(pushmessage.getRichPushMessageId()))
        {
            Logger.debug("Received a Rich Push.");
            refreshRichPushMessages();
        }
        sendPushReceivedBroadcast(pushmessage, show(pushmessage, getNotificationFactory()));
    }

    public String getAdmId()
    {
        return preferences.getAdmId();
    }

    public String getAlias()
    {
        return preferences.getAlias();
    }

    public String getChannelId()
    {
        return preferences.getChannelId();
    }

    public boolean getDeviceTagsEnabled()
    {
        return deviceTagsEnabled;
    }

    public String getGcmId()
    {
        return preferences.getGcmId();
    }

    public String getLastReceivedSendId()
    {
        return preferences.getLastReceivedSendId();
    }

    ChannelRegistrationPayload getNextChannelRegistrationPayload()
    {
        ChannelRegistrationPayload.Builder builder;
        builder = (new ChannelRegistrationPayload.Builder()).setAlias(getAlias()).setTags(getDeviceTagsEnabled(), getTags()).setOptIn(isOptIn());
        boolean flag;
        if (isPushEnabled() && isPushAvailable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        builder = builder.setBackgroundEnabled(flag).setUserId(UAirship.shared().getRichPushManager().getRichPushUser().getId()).setApid(preferences.getApid());
        UAirship.shared().getPlatformType();
        JVM INSTR tableswitch 1 2: default 108
    //                   1 139
    //                   2 118;
           goto _L1 _L2 _L3
_L1:
        return builder.build();
_L3:
        builder.setDeviceType("android").setPushAddress(preferences.getGcmId());
        continue; /* Loop/switch isn't completed */
_L2:
        builder.setDeviceType("amazon").setPushAddress(preferences.getAdmId());
        if (true) goto _L1; else goto _L4
_L4:
    }

    public NotificationActionButtonGroup getNotificationActionGroup(String s)
    {
        return (NotificationActionButtonGroup)actionGroupMap.get(s);
    }

    public NotificationFactory getNotificationFactory()
    {
        return notificationFactory;
    }

    PushPreferences getPreferences()
    {
        return preferences;
    }

    public Date[] getQuietTimeInterval()
    {
        return preferences.getQuietTimeInterval();
    }

    public Set getTags()
    {
        Set set = preferences.getTags();
        Set set1 = normalizeTags(set);
        if (set.size() != set1.size())
        {
            setTags(set1);
        }
        return set1;
    }

    public boolean getUserNotificationsEnabled()
    {
        return preferences.getUserNotificationsEnabled();
    }

    protected void init()
    {
        preferences.migratePushEnabledSettings();
        Intent intent = new Intent(UAirship.getApplicationContext(), com/urbanairship/push/PushService);
        intent.setAction("com.urbanairship.push.ACTION_START_REGISTRATION");
        UAirship.getApplicationContext().startService(intent);
    }

    public boolean isInQuietTime()
    {
        return preferences.isInQuietTime();
    }

    public boolean isOptIn()
    {
        return isPushEnabled() && isPushAvailable() && getUserNotificationsEnabled();
    }

    public boolean isPushAvailable()
    {
        boolean flag = true;
        UAirship.shared().getPlatformType();
        JVM INSTR tableswitch 1 2: default 32
    //                   1 36
    //                   2 51;
           goto _L1 _L2 _L3
_L1:
        flag = false;
_L5:
        return flag;
_L2:
        if (UAStringUtil.isEmpty(getPreferences().getAdmId()))
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (UAStringUtil.isEmpty(getPreferences().getGcmId()))
        {
            return false;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean isPushEnabled()
    {
        return preferences.isPushEnabled();
    }

    public boolean isQuietTimeEnabled()
    {
        return preferences.isQuietTimeEnabled();
    }

    public boolean isSoundEnabled()
    {
        return preferences.isSoundEnabled();
    }

    public boolean isVibrateEnabled()
    {
        return preferences.isVibrateEnabled();
    }

    public void removeNotificationActionButtonGroup(String s)
    {
        if (s.startsWith(UA_NOTIFICATION_BUTTON_GROUP_PREFIX))
        {
            Logger.error((new StringBuilder()).append("Unable to remove any reserved Urban Airship actions groups that begin with ").append(UA_NOTIFICATION_BUTTON_GROUP_PREFIX).toString());
            return;
        } else
        {
            actionGroupMap.remove(s);
            return;
        }
    }

    void sendRegistrationFinishedBroadcast(boolean flag)
    {
        Intent intent = (new Intent("com.urbanairship.push.CHANNEL_UPDATED")).putExtra("com.urbanairship.push.EXTRA_CHANNEL_ID", getChannelId()).addCategory(UAirship.getPackageName()).setPackage(UAirship.getPackageName());
        if (!flag)
        {
            intent.putExtra("com.urbanairship.push.EXTRA_ERROR", true);
        }
        UAirship.getApplicationContext().sendBroadcast(intent, UAirship.getUrbanAirshipPermission());
    }

    void setAdmId(String s)
    {
        preferences.setAppVersionCode(UAirship.getPackageInfo().versionCode);
        preferences.setAdmId(s);
        preferences.setDeviceId(getSecureId(UAirship.getApplicationContext()));
    }

    public void setAlias(String s)
    {
        if (!UAStringUtil.equals(s, preferences.getAlias()))
        {
            preferences.setAlias(s);
            updateRegistration();
        }
    }

    public void setAliasAndTags(String s, Set set)
    {
        if (set == null)
        {
            throw new IllegalArgumentException("Tags must be non-null.");
        }
        set = normalizeTags(set);
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
            updateRegistration();
        }
    }

    void setChannel(String s, String s1)
    {
        preferences.setChannelId(s);
        preferences.setChannelLocation(s1);
        UAirship.shared().getRichPushManager().updateUser();
    }

    public void setDeviceTagsEnabled(boolean flag)
    {
        deviceTagsEnabled = flag;
    }

    void setGcmId(String s)
    {
        preferences.setAppVersionCode(UAirship.getPackageInfo().versionCode);
        preferences.setGcmId(s);
        preferences.setDeviceId(getSecureId(UAirship.getApplicationContext()));
    }

    public void setNotificationFactory(NotificationFactory notificationfactory)
    {
        notificationFactory = notificationfactory;
    }

    public void setPushEnabled(boolean flag)
    {
        preferences.setPushEnabled(flag);
        updateRegistration();
    }

    public void setQuietTimeEnabled(boolean flag)
    {
        preferences.setQuietTimeEnabled(flag);
    }

    public void setQuietTimeInterval(Date date, Date date1)
    {
        preferences.setQuietTimeInterval(date, date1);
    }

    public void setSoundEnabled(boolean flag)
    {
        preferences.setSoundEnabled(flag);
    }

    public void setTags(Set set)
    {
        if (set == null)
        {
            throw new IllegalArgumentException("Tags must be non-null.");
        }
        set = normalizeTags(set);
        if (!set.equals(preferences.getTags()))
        {
            preferences.setTags(set);
            updateRegistration();
        }
    }

    public void setUserNotificationsEnabled(boolean flag)
    {
        preferences.setUserNotificationsEnabled(flag);
        updateRegistration();
    }

    public void setVibrateEnabled(boolean flag)
    {
        preferences.setVibrateEnabled(flag);
    }

    public void updateRegistration()
    {
        Context context = UAirship.getApplicationContext();
        Intent intent = new Intent(context, com/urbanairship/push/PushService);
        intent.setAction("com.urbanairship.push.ACTION_UPDATE_REGISTRATION");
        context.startService(intent);
    }

    /* member class not found */
    class _cls1 {}

}
