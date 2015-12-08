// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.preference;

import android.os.Handler;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.LocationOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.location.LocationPreferences;
import com.urbanairship.location.UALocationManager;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushPreferences;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushUser;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.urbanairship.preference:
//            UAPreference

public class UAPreferenceAdapter
{

    private static int APID_MAX_RETRIES = 4;
    private static int APID_RETRY_DELAY = 1000;
    private int apidRetryCount;
    private LocationPreferences locPrefs;
    private Map preferences;
    private PushPreferences pushPrefs;

    public UAPreferenceAdapter(PreferenceScreen preferencescreen)
    {
        pushPrefs = PushManager.shared().getPreferences();
        locPrefs = UALocationManager.shared().getPreferences();
        preferences = new HashMap();
        apidRetryCount = 0;
        checkForUAPreferences(preferencescreen);
    }

    private void checkForUAPreferences(PreferenceGroup preferencegroup)
    {
        if (preferencegroup != null)
        {
            int i = 0;
            while (i < preferencegroup.getPreferenceCount()) 
            {
                Preference preference = preferencegroup.getPreference(i);
                if (preference instanceof PreferenceGroup)
                {
                    checkForUAPreferences((PreferenceGroup)preference);
                } else
                if (preference instanceof UAPreference)
                {
                    trackPreference((UAPreference)preference);
                }
                i++;
            }
        }
    }

    private Object getInternalPreference(UAPreference.PreferenceType preferencetype)
    {
        static class _cls3
        {

            static final int $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[];

            static 
            {
                $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType = new int[UAPreference.PreferenceType.values().length];
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.LOCATION_BACKGROUND_ENABLE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.LOCATION_ENABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.LOCATION_FOREGROUND_ENABLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.PUSH_ENABLE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.QUIET_TIME_ENABLE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.QUIET_TIME_END.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.QUIET_TIME_START.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.SOUND_ENABLE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.VIBRATE_ENABLE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.APID.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$urbanairship$preference$UAPreference$PreferenceType[UAPreference.PreferenceType.USER_ID.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.urbanairship.preference.UAPreference.PreferenceType[preferencetype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return Boolean.valueOf(locPrefs.isBackgroundLocationEnabled());

        case 2: // '\002'
            return Boolean.valueOf(locPrefs.isLocationEnabled());

        case 3: // '\003'
            return Boolean.valueOf(locPrefs.isForegroundLocationEnabled());

        case 4: // '\004'
            return Boolean.valueOf(pushPrefs.isPushEnabled());

        case 5: // '\005'
            return Boolean.valueOf(pushPrefs.isQuietTimeEnabled());

        case 6: // '\006'
            preferencetype = pushPrefs.getQuietTimeInterval();
            if (preferencetype != null)
            {
                return Long.valueOf(preferencetype[1].getTime());
            } else
            {
                return null;
            }

        case 7: // '\007'
            preferencetype = pushPrefs.getQuietTimeInterval();
            if (preferencetype != null)
            {
                return Long.valueOf(preferencetype[0].getTime());
            } else
            {
                return null;
            }

        case 8: // '\b'
            return Boolean.valueOf(pushPrefs.isSoundEnabled());

        case 9: // '\t'
            return Boolean.valueOf(pushPrefs.isVibrateEnabled());

        case 10: // '\n'
            return PushManager.shared().getAPID();

        case 11: // '\013'
            return RichPushManager.shared().getRichPushUser().getId();
        }
    }

    private boolean isServiceEnabledForPreferenceType(UAPreference.PreferenceType preferencetype)
    {
        boolean flag1 = false;
        _cls3..SwitchMap.com.urbanairship.preference.UAPreference.PreferenceType[preferencetype.ordinal()];
        JVM INSTR tableswitch 1 11: default 68
    //                   1 72
    //                   2 72
    //                   3 72
    //                   4 123
    //                   5 123
    //                   6 123
    //                   7 123
    //                   8 123
    //                   9 123
    //                   10 123
    //                   11 171;
           goto _L1 _L2 _L2 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4
_L1:
        boolean flag = true;
_L6:
        return flag;
_L2:
        if (!UAirship.shared().getAirshipConfigOptions().locationOptions.locationServiceEnabled || locPrefs == null)
        {
            Logger.warn((new StringBuilder()).append("Unable to modify preference ").append(preferencetype).append(" because the locationService is not enabled. Ignoring preference").toString());
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!UAirship.shared().getAirshipConfigOptions().pushServiceEnabled || pushPrefs == null)
        {
            Logger.warn((new StringBuilder()).append("Unable to modify preference ").append(preferencetype).append(" because the pushService is not enabled").toString());
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag = flag1;
        if (!UAirship.shared().getAirshipConfigOptions().pushServiceEnabled) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (!UAirship.shared().getAirshipConfigOptions().richPushEnabled) goto _L6; else goto _L7
_L7:
        if (pushPrefs == null)
        {
            return false;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    private void setInternalPreference(UAPreference.PreferenceType preferencetype, Object obj)
    {
        switch (_cls3..SwitchMap.com.urbanairship.preference.UAPreference.PreferenceType[preferencetype.ordinal()])
        {
        case 10: // '\n'
        case 11: // '\013'
        default:
            return;

        case 1: // '\001'
            if (((Boolean)obj).booleanValue())
            {
                UALocationManager.enableBackgroundLocation();
                return;
            } else
            {
                UALocationManager.disableBackgroundLocation();
                return;
            }

        case 2: // '\002'
            if (((Boolean)obj).booleanValue())
            {
                UALocationManager.enableLocation();
                return;
            } else
            {
                UALocationManager.disableLocation();
                return;
            }

        case 3: // '\003'
            if (((Boolean)obj).booleanValue())
            {
                UALocationManager.enableForegroundLocation();
                return;
            } else
            {
                UALocationManager.disableForegroundLocation();
                return;
            }

        case 4: // '\004'
            if (((Boolean)obj).booleanValue())
            {
                PushManager.enablePush();
                return;
            } else
            {
                PushManager.disablePush();
                return;
            }

        case 5: // '\005'
            pushPrefs.setQuietTimeEnabled(((Boolean)obj).booleanValue());
            return;

        case 8: // '\b'
            pushPrefs.setSoundEnabled(((Boolean)obj).booleanValue());
            return;

        case 9: // '\t'
            pushPrefs.setVibrateEnabled(((Boolean)obj).booleanValue());
            return;

        case 6: // '\006'
            preferencetype = pushPrefs.getQuietTimeInterval();
            if (preferencetype != null)
            {
                preferencetype = preferencetype[0];
            } else
            {
                preferencetype = new Date();
            }
            pushPrefs.setQuietTimeInterval(preferencetype, new Date(((Long)obj).longValue()));
            return;

        case 7: // '\007'
            preferencetype = pushPrefs.getQuietTimeInterval();
            break;
        }
        if (preferencetype != null)
        {
            preferencetype = preferencetype[1];
        } else
        {
            preferencetype = new Date();
        }
        pushPrefs.setQuietTimeInterval(new Date(((Long)obj).longValue()), preferencetype);
    }

    private void trackPreference(final UAPreference preference)
    {
        final Object preferenceType = preference.getPreferenceType();
        if (preferenceType == null)
        {
            Logger.warn((new StringBuilder()).append("Preference returned a null preference type. Ignoring preference ").append(preference).toString());
        } else
        if (isServiceEnabledForPreferenceType(((UAPreference.PreferenceType) (preferenceType))))
        {
            Object obj = getInternalPreference(((UAPreference.PreferenceType) (preferenceType)));
            if (obj != null)
            {
                try
                {
                    preference.setValue(obj);
                }
                // Misplaced declaration of an exception variable
                catch (final Object preferenceType)
                {
                    Logger.warn((new StringBuilder()).append("Exception setting value ").append(obj).append(". Ignoring preference ").append(preference).toString(), ((Throwable) (preferenceType)));
                    return;
                }
            } else
            if (preferenceType == UAPreference.PreferenceType.APID && pushPrefs.isPushEnabled() && apidRetryCount < APID_MAX_RETRIES)
            {
                apidRetryCount = apidRetryCount + 1;
                (new Handler()).postDelayed(new Runnable() {

                    final UAPreferenceAdapter this$0;
                    final UAPreference val$preference;

                    public void run()
                    {
                        trackPreference(preference);
                    }

            
            {
                this$0 = UAPreferenceAdapter.this;
                preference = uapreference;
                super();
            }
                }, APID_RETRY_DELAY);
                return;
            }
            ((Preference)preference).setOnPreferenceChangeListener(new android.preference.Preference.OnPreferenceChangeListener() {

                final UAPreferenceAdapter this$0;
                final UAPreference.PreferenceType val$preferenceType;

                public boolean onPreferenceChange(Preference preference1, Object obj1)
                {
                    preferences.put(preferenceType, obj1);
                    return true;
                }

            
            {
                this$0 = UAPreferenceAdapter.this;
                preferenceType = preferencetype;
                super();
            }
            });
            return;
        }
    }

    public void applyUrbanAirshipPreferences()
    {
        Iterator iterator = preferences.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UAPreference.PreferenceType preferencetype = (UAPreference.PreferenceType)iterator.next();
            Object obj = preferences.get(preferencetype);
            if (obj != null)
            {
                try
                {
                    setInternalPreference(preferencetype, obj);
                }
                catch (Exception exception)
                {
                    Logger.warn((new StringBuilder()).append("Unable to set ").append(preferencetype).append(", invalid value ").append(obj).toString(), exception);
                }
            }
        } while (true);
    }



}
