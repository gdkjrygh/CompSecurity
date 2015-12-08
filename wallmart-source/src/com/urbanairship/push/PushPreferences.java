// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.urbanairship.Logger;
import com.urbanairship.PreferenceDataStore;
import com.urbanairship.UAirship;
import com.urbanairship.util.UAStringUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.push:
//            ChannelRegistrationPayload

class PushPreferences
{

    private static final String ADM_REGISTRATION_ID_KEY = "com.urbanairship.push.ADM_REGISTRATION_ID_KEY";
    private static final String ALIAS_KEY = "com.urbanairship.push.ALIAS";
    private static final String APID_KEY = "com.urbanairship.push.APID";
    private static final String APP_VERSION_KEY = "com.urbanairship.push.APP_VERSION";
    private static final String CHANNEL_ID_KEY = "com.urbanairship.push.CHANNEL_ID";
    private static final String CHANNEL_ID_PREFERENCE_KEY = "com.urbanairship.preferences.CHANNEL_ID";
    private static final String CHANNEL_LOCATION_KEY = "com.urbanairship.push.CHANNEL_LOCATION";
    private static final String CHANNEL_LOCATION_PREFERENCE_KEY = "com.urbanairship.preferences.CHANNEL_LOCATION";
    private static final String DEVICE_ID_KEY = "com.urbanairship.push.DEVICE_ID";
    private static final String GCM_REGISTRATION_ID_KEY = "com.urbanairship.push.GCM_REGISTRATION_ID_KEY";
    private static final String KEY_PREFIX = "com.urbanairship.push";
    private static final String LAST_CANONICAL_IDS_KEY = "com.urbanairship.push.LAST_CANONICAL_IDS";
    private static final String LAST_RECEIVED_SEND_ID = "com.urbanairship.push.LAST_RECEIVED_SEND_ID";
    private static final String LAST_REGISTRATION_PAYLOAD_KEY = "com.urbanairship.push.LAST_REGISTRATION_PAYLOAD";
    private static final String LAST_REGISTRATION_TIME_KEY = "com.urbanairship.push.LAST_REGISTRATION_TIME";
    private static final String PUSH_ENABLED_KEY = "com.urbanairship.push.PUSH_ENABLED";
    private static final String PUSH_ENABLED_SETTINGS_MIGRATED_KEY = "com.urbanairship.push.PUSH_ENABLED_SETTINGS_MIGRATED";
    private static final String REGISTERED_GCM_SENDER_IDS = "com.urbanairship.push.REGISTERED_GCM_SENDER_IDS";
    private static final String SHARED_PREFERENCES_NAME = "com.urbanairship.preferences";
    private static final String SOUND_ENABLED_KEY = "com.urbanairship.push.SOUND_ENABLED";
    private static final String TAGS_KEY = "com.urbanairship.push.TAGS";
    private static final String USER_NOTIFICATIONS_ENABLED_KEY = "com.urbanairship.push.USER_NOTIFICATIONS_ENABLED";
    private static final String VIBRATE_ENABLED_KEY = "com.urbanairship.push.VIBRATE_ENABLED";
    private PreferenceDataStore preferenceDataStore;

    public PushPreferences(PreferenceDataStore preferencedatastore)
    {
        preferenceDataStore = preferencedatastore;
    }

    private SharedPreferences getSharedPreferences()
    {
        return UAirship.getApplicationContext().getSharedPreferences("com.urbanairship.preferences", 0);
    }

    String getAdmId()
    {
        return preferenceDataStore.getString("com.urbanairship.push.ADM_REGISTRATION_ID_KEY", null);
    }

    String getAlias()
    {
        return preferenceDataStore.getString("com.urbanairship.push.ALIAS", null);
    }

    String getApid()
    {
        return preferenceDataStore.getString("com.urbanairship.push.APID", null);
    }

    int getAppVersionCode()
    {
        return preferenceDataStore.getInt("com.urbanairship.push.APP_VERSION", -1);
    }

    List getCanonicalIds()
    {
        ArrayList arraylist;
        Object obj;
        arraylist = new ArrayList();
        obj = preferenceDataStore.getString("com.urbanairship.push.LAST_CANONICAL_IDS", null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i;
        try
        {
            obj = new JSONArray(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L3:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(((JSONArray) (obj)).getString(i));
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        return arraylist;
    }

    String getChannelId()
    {
        if (UAStringUtil.isEmpty(preferenceDataStore.getString("com.urbanairship.push.CHANNEL_ID", null)))
        {
            String s = getSharedPreferences().getString("com.urbanairship.preferences.CHANNEL_ID", null);
            preferenceDataStore.put("com.urbanairship.push.CHANNEL_ID", s);
            return s;
        } else
        {
            return preferenceDataStore.getString("com.urbanairship.push.CHANNEL_ID", null);
        }
    }

    String getChannelLocation()
    {
        if (UAStringUtil.isEmpty(preferenceDataStore.getString("com.urbanairship.push.CHANNEL_LOCATION", null)))
        {
            preferenceDataStore.put("com.urbanairship.push.CHANNEL_LOCATION", getSharedPreferences().getString("com.urbanairship.preferences.CHANNEL_LOCATION", null));
        }
        return preferenceDataStore.getString("com.urbanairship.push.CHANNEL_LOCATION", null);
    }

    String getDeviceId()
    {
        return preferenceDataStore.getString("com.urbanairship.push.DEVICE_ID", null);
    }

    String getGcmId()
    {
        return preferenceDataStore.getString("com.urbanairship.push.GCM_REGISTRATION_ID_KEY", null);
    }

    String getLastReceivedSendId()
    {
        return preferenceDataStore.getString("com.urbanairship.push.LAST_RECEIVED_SEND_ID", null);
    }

    ChannelRegistrationPayload getLastRegistrationPayload()
    {
        Object obj = preferenceDataStore.getString("com.urbanairship.push.LAST_REGISTRATION_PAYLOAD", null);
        if (UAStringUtil.isEmpty(((String) (obj))))
        {
            return null;
        }
        try
        {
            obj = ChannelRegistrationPayload.createFromJSON(new JSONObject(((String) (obj))));
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return ((ChannelRegistrationPayload) (obj));
    }

    long getLastRegistrationTime()
    {
        long l1 = preferenceDataStore.getLong("com.urbanairship.push.LAST_REGISTRATION_TIME", 0L);
        long l = l1;
        if (l1 > System.currentTimeMillis())
        {
            l = 0L;
            setLastRegistrationTime(0L);
        }
        return l;
    }

    boolean getPushEnabledSettingsMigrated()
    {
        return preferenceDataStore.getBoolean("com.urbanairship.push.PUSH_ENABLED_SETTINGS_MIGRATED", false);
    }

    Date[] getQuietTimeInterval()
    {
        int i = preferenceDataStore.getInt("com.urbanairship.push.QuietTime.START_HOUR", -1);
        int j = preferenceDataStore.getInt("com.urbanairship.push.QuietTime.START_MINUTE", -1);
        int k = preferenceDataStore.getInt("com.urbanairship.push.QuietTime.END_HOUR", -1);
        int l = preferenceDataStore.getInt("com.urbanairship.push.QuietTime.END_MINUTE", -1);
        if (i == -1 || j == -1 || k == -1 || l == -1)
        {
            return null;
        }
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).set(11, i);
        ((Calendar) (obj)).set(12, j);
        ((Calendar) (obj)).set(13, 0);
        obj = ((Calendar) (obj)).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, k);
        calendar.set(12, l);
        calendar.set(13, 0);
        if (k < i)
        {
            calendar.add(5, 1);
        }
        return (new Date[] {
            obj, calendar.getTime()
        });
    }

    Set getRegisteredGcmSenderIds()
    {
        Object obj;
        HashSet hashset;
        hashset = new HashSet();
        obj = preferenceDataStore.getString("com.urbanairship.push.REGISTERED_GCM_SENDER_IDS", null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = new JSONArray(((String) (obj)));
        int i = 0;
_L4:
        obj = hashset;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(jsonarray.getString(i));
        i++;
        if (true) goto _L4; else goto _L3
        obj;
        Logger.error("Unable to parse registered GCM sender Ids", ((Throwable) (obj)));
        preferenceDataStore.put("com.urbanairship.push.REGISTERED_GCM_SENDER_IDS", null);
_L2:
        obj = null;
_L3:
        return ((Set) (obj));
    }

    Set getTags()
    {
        HashSet hashset;
        Object obj;
        hashset = new HashSet();
        obj = preferenceDataStore.getString("com.urbanairship.push.TAGS", "[]");
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        try
        {
            obj = new JSONArray(((String) (obj)));
            j = ((JSONArray) (obj)).length();
        }
        catch (JSONException jsonexception)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(((JSONArray) (obj)).getString(i));
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        return hashset;
    }

    boolean getUserNotificationsEnabled()
    {
        return preferenceDataStore.getBoolean("com.urbanairship.push.USER_NOTIFICATIONS_ENABLED", false);
    }

    boolean isInQuietTime()
    {
        boolean flag = true;
        if (isQuietTimeEnabled())
        {
            Calendar calendar = Calendar.getInstance();
            int i = preferenceDataStore.getInt("com.urbanairship.push.QuietTime.START_HOUR", -1);
            int j = preferenceDataStore.getInt("com.urbanairship.push.QuietTime.START_MINUTE", -1);
            int k = preferenceDataStore.getInt("com.urbanairship.push.QuietTime.END_HOUR", -1);
            int l = preferenceDataStore.getInt("com.urbanairship.push.QuietTime.END_MINUTE", -1);
            if (-1 != i && -1 != j && -1 != k && -1 != l)
            {
                Calendar calendar1 = Calendar.getInstance();
                calendar1.set(11, i);
                calendar1.set(12, j);
                calendar1.set(13, 0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, k);
                calendar2.set(12, l);
                calendar2.set(13, 0);
                if (calendar1.after(calendar) && calendar2.before(calendar1))
                {
                    calendar1.add(6, -1);
                }
                if (calendar2.before(calendar1))
                {
                    calendar2.add(6, 1);
                }
                if (!calendar.after(calendar1) || !calendar.before(calendar2))
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    boolean isPushEnabled()
    {
        return preferenceDataStore.getBoolean("com.urbanairship.push.PUSH_ENABLED", true);
    }

    boolean isQuietTimeEnabled()
    {
        return preferenceDataStore.getBoolean("com.urbanairship.push.QuietTime.ENABLED", false);
    }

    boolean isSoundEnabled()
    {
        return preferenceDataStore.getBoolean("com.urbanairship.push.SOUND_ENABLED", true);
    }

    boolean isVibrateEnabled()
    {
        return preferenceDataStore.getBoolean("com.urbanairship.push.VIBRATE_ENABLED", true);
    }

    void migratePushEnabledSettings()
    {
        if (getPushEnabledSettingsMigrated())
        {
            return;
        }
        Logger.info("Migrating push enabled preferences");
        boolean flag = preferenceDataStore.getBoolean("com.urbanairship.push.PUSH_ENABLED", false);
        Logger.info((new StringBuilder()).append("Setting user notifications enabled to ").append(Boolean.toString(flag)).toString());
        setUserNotificationsEnabled(flag);
        if (!flag)
        {
            Logger.info("Push is now enabled. You can continue to toggle the opt-in state byenabling or disabling user notifications");
        }
        setPushEnabled(true);
        setPushEnabledSettingsMigrated(true);
    }

    void setAdmId(String s)
    {
        preferenceDataStore.put("com.urbanairship.push.ADM_REGISTRATION_ID_KEY", s);
    }

    void setAlias(String s)
    {
        preferenceDataStore.put("com.urbanairship.push.ALIAS", s);
    }

    void setAppVersionCode(int i)
    {
        preferenceDataStore.put("com.urbanairship.push.APP_VERSION", Integer.valueOf(i));
    }

    void setCanonicalIds(List list)
    {
        list = new JSONArray(list);
        preferenceDataStore.put("com.urbanairship.push.LAST_CANONICAL_IDS", list.toString());
    }

    void setChannelId(String s)
    {
        preferenceDataStore.put("com.urbanairship.push.CHANNEL_ID", s);
        s = getSharedPreferences().edit().putString("com.urbanairship.preferences.CHANNEL_ID", s);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            s.apply();
            return;
        } else
        {
            s.commit();
            return;
        }
    }

    void setChannelLocation(String s)
    {
        preferenceDataStore.put("com.urbanairship.push.CHANNEL_LOCATION", s);
        s = getSharedPreferences().edit().putString("com.urbanairship.preferences.CHANNEL_LOCATION", s);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            s.apply();
            return;
        } else
        {
            s.commit();
            return;
        }
    }

    void setDeviceId(String s)
    {
        preferenceDataStore.put("com.urbanairship.push.DEVICE_ID", s);
    }

    void setGcmId(String s)
    {
        preferenceDataStore.put("com.urbanairship.push.GCM_REGISTRATION_ID_KEY", s);
    }

    void setLastReceivedSendId(String s)
    {
        preferenceDataStore.put("com.urbanairship.push.LAST_RECEIVED_SEND_ID", s);
    }

    void setLastRegistrationPayload(ChannelRegistrationPayload channelregistrationpayload)
    {
        if (channelregistrationpayload == null)
        {
            channelregistrationpayload = null;
        } else
        {
            channelregistrationpayload = channelregistrationpayload.asJSON().toString();
        }
        preferenceDataStore.put("com.urbanairship.push.LAST_REGISTRATION_PAYLOAD", channelregistrationpayload);
    }

    void setLastRegistrationTime(long l)
    {
        preferenceDataStore.put("com.urbanairship.push.LAST_REGISTRATION_TIME", Long.valueOf(l));
    }

    void setPushEnabled(boolean flag)
    {
        preferenceDataStore.put("com.urbanairship.push.PUSH_ENABLED", Boolean.valueOf(flag));
    }

    void setPushEnabledSettingsMigrated(boolean flag)
    {
        preferenceDataStore.put("com.urbanairship.push.PUSH_ENABLED_SETTINGS_MIGRATED", Boolean.valueOf(flag));
    }

    void setQuietTimeEnabled(boolean flag)
    {
        preferenceDataStore.put("com.urbanairship.push.QuietTime.ENABLED", Boolean.valueOf(flag));
    }

    void setQuietTimeInterval(Date date, Date date1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(11);
        int j = calendar.get(12);
        date = Calendar.getInstance();
        date.setTime(date1);
        int k = date.get(11);
        int l = date.get(12);
        preferenceDataStore.put("com.urbanairship.push.QuietTime.START_HOUR", Integer.valueOf(i));
        preferenceDataStore.put("com.urbanairship.push.QuietTime.START_MINUTE", Integer.valueOf(j));
        preferenceDataStore.put("com.urbanairship.push.QuietTime.END_HOUR", Integer.valueOf(k));
        preferenceDataStore.put("com.urbanairship.push.QuietTime.END_MINUTE", Integer.valueOf(l));
    }

    void setRegisteredGcmSenderIds(Set set)
    {
        set = new JSONArray(set);
        preferenceDataStore.put("com.urbanairship.push.REGISTERED_GCM_SENDER_IDS", set.toString());
    }

    void setSoundEnabled(boolean flag)
    {
        preferenceDataStore.put("com.urbanairship.push.SOUND_ENABLED", Boolean.valueOf(flag));
    }

    void setTags(Set set)
    {
        if (set == null || set.isEmpty())
        {
            preferenceDataStore.put("com.urbanairship.push.TAGS", null);
            return;
        } else
        {
            set = new JSONArray(set);
            preferenceDataStore.put("com.urbanairship.push.TAGS", set.toString());
            return;
        }
    }

    void setUserNotificationsEnabled(boolean flag)
    {
        preferenceDataStore.put("com.urbanairship.push.USER_NOTIFICATIONS_ENABLED", Boolean.valueOf(flag));
    }

    void setVibrateEnabled(boolean flag)
    {
        preferenceDataStore.put("com.urbanairship.push.VIBRATE_ENABLED", Boolean.valueOf(flag));
    }

    // Unreferenced inner class com/urbanairship/push/PushPreferences$QuietTime
    /* block-local class not found */
    class QuietTime {}

}
