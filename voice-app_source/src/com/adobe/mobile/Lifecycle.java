// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.app.Activity;
import android.content.ComponentName;
import android.content.SharedPreferences;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, MobileConfig, ReferrerHandler, AnalyticsTrackInternal, 
//            AnalyticsTrackTimedAction, Messages, AudienceManagerWorker

final class Lifecycle
{

    private static final Object _contextDataMutex = new Object();
    private static final HashMap _lifecycleContextData = new HashMap();
    private static final HashMap _lifecycleContextDataLowercase = new HashMap();
    private static final Object _lowercaseContextDataMutex = new Object();
    private static final HashMap _previousSessionlifecycleContextData = new HashMap();
    private static final Object _referralMutex = new Object();
    protected static volatile boolean lifecycleHasRun = false;
    protected static long sessionStartTime = 0L;

    Lifecycle()
    {
    }

    private static void addInstallData(Map map, long l)
    {
        map.put("a.InstallDate", (new SimpleDateFormat("M/d/yyyy", Locale.US)).format(Long.valueOf(l)));
        map.put("a.InstallEvent", "InstallEvent");
        map.put("a.DailyEngUserEvent", "DailyEngUserEvent");
        map.put("a.MonthlyEngUserEvent", "MonthlyEngUserEvent");
        if (!StaticMethods.getSharedPreferences().contains("utm_campaign")) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        s = StaticMethods.getSharedPreferences().getString("utm_source", null);
        s1 = StaticMethods.getSharedPreferences().getString("utm_medium", null);
        s2 = StaticMethods.getSharedPreferences().getString("utm_term", null);
        s3 = StaticMethods.getSharedPreferences().getString("utm_content", null);
        s4 = StaticMethods.getSharedPreferences().getString("utm_campaign", null);
        s5 = StaticMethods.getSharedPreferences().getString("trackingcode", null);
        if (s == null || s4 == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        map.put("a.referrer.campaign.source", s);
        map.put("a.referrer.campaign.medium", s1);
        map.put("a.referrer.campaign.term", s2);
        map.put("a.referrer.campaign.content", s3);
        map.put("a.referrer.campaign.name", s4);
        map.put("a.referrer.campaign.trackingcode", s5);
_L4:
        map = StaticMethods.getSharedPreferencesEditor();
        map.putLong("ADMS_InstallDate", l);
        map.commit();
        return;
_L2:
        if (MobileConfig.getInstance().getReferrerTimeout() > 0)
        {
            map.put("a.referrer.campaign.source", "D=utm_source");
            map.put("a.referrer.campaign.medium", "D=utm_medium");
            map.put("a.referrer.campaign.term", "D=utm_term");
            map.put("a.referrer.campaign.content", "D=utm_content");
            map.put("a.referrer.campaign.name", "D=utm_campaign");
            map.put("a.referrer.campaign.trackingcode", "D=trackingcode");
            ReferrerHandler.setReferrerProcessed(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
        map;
        StaticMethods.logErrorFormat("Lifecycle - Error setting install data (%s).", new Object[] {
            map.getMessage()
        });
        return;
    }

    private static void addLifecycleGenericData(Map map, long l)
    {
        map.putAll(StaticMethods.getDefaultData());
        map.put("a.LaunchEvent", "LaunchEvent");
        map.put("a.OSVersion", StaticMethods.getOperatingSystem());
        map.put("a.HourOfDay", (new SimpleDateFormat("H", Locale.US)).format(Long.valueOf(l)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l);
        map.put("a.DayOfWeek", Integer.toString(calendar.get(7)));
        try
        {
            android.content.SharedPreferences.Editor editor = StaticMethods.getSharedPreferencesEditor();
            int i = StaticMethods.getSharedPreferences().getInt("ADMS_Launches", 0) + 1;
            map.put("a.Launches", Integer.toString(i));
            editor.putInt("ADMS_Launches", i);
            editor.putLong("ADMS_LastDateUsed", l);
            editor.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            StaticMethods.logErrorFormat("Lifecycle - Error adding generic data (%s).", new Object[] {
                map.getMessage()
            });
        }
    }

    private static void addNonInstallData(Map map, long l)
    {
        Object obj = new SimpleDateFormat("yyyy/M/d", Locale.US);
        long l1 = StaticMethods.getSharedPreferences().getLong("ADMS_LastDateUsed", 0L);
        String s = ((DateFormat) (obj)).format(new Date(l1));
        if (!((DateFormat) (obj)).format(Long.valueOf(l)).equalsIgnoreCase(s))
        {
            map.put("a.DailyEngUserEvent", "DailyEngUserEvent");
        }
        obj = new SimpleDateFormat("yyyy/M", Locale.US);
        s = ((DateFormat) (obj)).format(new Date(l1));
        if (!((DateFormat) (obj)).format(Long.valueOf(l)).equalsIgnoreCase(s))
        {
            map.put("a.MonthlyEngUserEvent", "MonthlyEngUserEvent");
        }
        map.put("a.DaysSinceFirstUse", calculateDaysSince(StaticMethods.getSharedPreferences().getLong("ADMS_InstallDate", 0L), l));
        map.put("a.DaysSinceLastUse", calculateDaysSince(l1, l));
        if (StaticMethods.getSharedPreferences().getBoolean("ADMS_SuccessfulClose", false))
        {
            break MISSING_BLOCK_LABEL_331;
        }
        obj = StaticMethods.getSharedPreferencesEditor();
        ((android.content.SharedPreferences.Editor) (obj)).remove("ADMS_PauseDate");
        ((android.content.SharedPreferences.Editor) (obj)).remove("ADMS_SessionStart");
        sessionStartTime = StaticMethods.getTimeSince1970();
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        l = StaticMethods.getSharedPreferences().getLong("ADBLastKnownTimestampKey", 0L);
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        if (!MobileConfig.getInstance().mobileUsingAnalytics() || !MobileConfig.getInstance().getOfflineTrackingEnabled())
        {
            break MISSING_BLOCK_LABEL_297;
        }
        map = new HashMap();
        map.put("a.CrashEvent", "CrashEvent");
        _lifecycleContextData.putAll(map);
        AnalyticsTrackInternal.trackInternal("Crash", map, 1L + l);
_L2:
        AnalyticsTrackTimedAction.sharedInstance().trackTimedActionUpdateActionsClearAdjustedStartTime();
        return;
        map.put("a.CrashEvent", "CrashEvent");
        if (true) goto _L2; else goto _L1
_L1:
        map;
        StaticMethods.logErrorFormat("Lifecycle - Error setting non install data (%s).", new Object[] {
            map.getMessage()
        });
    }

    private static void addPersistedLifecycleToMap(Map map)
    {
        String s;
        try
        {
            s = StaticMethods.getSharedPreferences().getString("ADMS_LifecycleData", null);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            StaticMethods.logErrorFormat("Lifecycle - Issue loading persisted lifecycle data", new Object[] {
                map.getMessage()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            StaticMethods.logWarningFormat("Lifecycle - Issue loading persisted lifecycle data (%s)", new Object[] {
                map.getMessage()
            });
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (s.length() > 0)
        {
            map.putAll(StaticMethods.mapFromJson(new JSONObject(s)));
        }
    }

    protected static void addReferralDataToSavedLifecycle(Map map)
    {
label0:
        {
            synchronized (_referralMutex)
            {
                if (_lifecycleContextData.size() != 0)
                {
                    break label0;
                }
            }
            return;
        }
        _lifecycleContextData.put("a.referrer.campaign.source", map.get("utm_source"));
        _lifecycleContextData.put("a.referrer.campaign.medium", map.get("utm_medium"));
        _lifecycleContextData.put("a.referrer.campaign.term", map.get("utm_term"));
        _lifecycleContextData.put("a.referrer.campaign.content", map.get("utm_content"));
        _lifecycleContextData.put("a.referrer.campaign.name", map.get("utm_campaign"));
        _lifecycleContextData.put("a.referrer.campaign.trackingcode", map.get("trackingcode"));
        clearContextDataLowercase();
        java.util.Map.Entry entry;
        for (map = _lifecycleContextData.entrySet().iterator(); map.hasNext(); _lifecycleContextDataLowercase.put(((String)entry.getKey()).toLowerCase(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        break MISSING_BLOCK_LABEL_187;
        map;
        obj;
        JVM INSTR monitorexit ;
        throw map;
        obj;
        JVM INSTR monitorexit ;
    }

    private static void addSessionLengthData(Map map)
    {
        int j;
        long l;
        try
        {
            l = StaticMethods.getSharedPreferences().getLong("ADMS_PauseDate", 0L);
            int i = MobileConfig.getInstance().getLifecycleTimeout();
            if ((int)(((new Date()).getTime() - l) / 1000L) < i)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            StaticMethods.logErrorFormat("Lifecycle - Error adding session length data (%s).", new Object[] {
                map.getMessage()
            });
            return;
        }
        j = (int)((l - StaticMethods.getSharedPreferences().getLong("ADMS_SessionStart", 0L)) / 1000L);
        sessionStartTime = StaticMethods.getTimeSince1970();
        if (j <= 0 || j >= 0x93a80)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        l = StaticMethods.getSharedPreferences().getLong("ADBLastKnownTimestampKey", 0L);
        if (l <= 0L) goto _L2; else goto _L1
_L1:
        if (!MobileConfig.getInstance().mobileUsingAnalytics() || !MobileConfig.getInstance().getOfflineTrackingEnabled()) goto _L2; else goto _L3
_L3:
        map = new HashMap();
        map.put("a.PrevSessionLength", (new StringBuilder()).append("").append(j).toString());
        _lifecycleContextData.putAll(map);
        AnalyticsTrackInternal.trackInternal("SessionInfo", map, 1L + l);
_L4:
        map = StaticMethods.getSharedPreferencesEditor();
        map.remove("ADMS_SessionStart");
        map.commit();
        return;
_L2:
        map.put("a.PrevSessionLength", Integer.toString(j));
          goto _L4
        map.put("a.ignoredSessionLength", Integer.toString(j));
          goto _L4
    }

    private static void addUpgradeData(Map map, long l)
    {
        android.content.SharedPreferences.Editor editor;
        long l1;
        editor = StaticMethods.getSharedPreferencesEditor();
        l1 = StaticMethods.getSharedPreferences().getLong("ADMS_UpgradeDate", 0L);
        if (StaticMethods.getApplicationVersion().equalsIgnoreCase(StaticMethods.getSharedPreferences().getString("ADMS_LastVersion", ""))) goto _L2; else goto _L1
_L1:
        map.put("a.UpgradeEvent", "UpgradeEvent");
        editor.putLong("ADMS_UpgradeDate", l);
        editor.putInt("ADMS_LaunchesAfterUpgrade", 0);
_L4:
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        int i = StaticMethods.getSharedPreferences().getInt("ADMS_LaunchesAfterUpgrade", 0) + 1;
        map.put("a.LaunchesSinceUpgrade", (new StringBuilder()).append("").append(i).toString());
        editor.putInt("ADMS_LaunchesAfterUpgrade", i);
        editor.commit();
        return;
_L2:
        if (l1 > 0L)
        {
            try
            {
                map.put("a.DaysSinceLastUpgrade", calculateDaysSince(l1, l));
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                StaticMethods.logErrorFormat("Lifecycle - Error setting upgrade data (%s).", new Object[] {
                    map.getMessage()
                });
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String calculateDaysSince(long l, long l1)
    {
        return Integer.toString((int)((l1 - l) / 0x5265c00L));
    }

    private static void clearContextDataLowercase()
    {
        synchronized (_lowercaseContextDataMutex)
        {
            _lifecycleContextDataLowercase.clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void generateLifecycleToBeSaved(Map map)
    {
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = new HashMap();
        }
        map.putAll(StaticMethods.getDefaultData());
        map.put("a.locale", StaticMethods.getDefaultAcceptLanguage());
        _lifecycleContextData.putAll(map);
        clearContextDataLowercase();
        java.util.Map.Entry entry;
        for (map = _lifecycleContextData.entrySet().iterator(); map.hasNext(); _lifecycleContextDataLowercase.put(((String)entry.getKey()).toLowerCase(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    protected static HashMap getContextData()
    {
label0:
        {
            HashMap hashmap;
            synchronized (_contextDataMutex)
            {
                if (_lifecycleContextData.size() <= 0)
                {
                    break label0;
                }
                hashmap = _lifecycleContextData;
            }
            return hashmap;
        }
        HashMap hashmap1;
        if (_previousSessionlifecycleContextData.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        hashmap1 = _previousSessionlifecycleContextData;
        obj;
        JVM INSTR monitorexit ;
        return hashmap1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        addPersistedLifecycleToMap(_previousSessionlifecycleContextData);
        exception = _previousSessionlifecycleContextData;
        obj;
        JVM INSTR monitorexit ;
        return exception;
    }

    protected static Map getContextDataLowercase()
    {
        Object obj = _lowercaseContextDataMutex;
        obj;
        JVM INSTR monitorenter ;
        if (_lifecycleContextDataLowercase.size() <= 0)
        {
            Object obj1 = new HashMap();
            addPersistedLifecycleToMap(((Map) (obj1)));
            java.util.Map.Entry entry;
            for (obj1 = ((HashMap) (obj1)).entrySet().iterator(); ((Iterator) (obj1)).hasNext(); _lifecycleContextDataLowercase.put(((String)entry.getKey()).toLowerCase(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
            }

        }
        break MISSING_BLOCK_LABEL_89;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        HashMap hashmap = _lifecycleContextDataLowercase;
        obj;
        JVM INSTR monitorexit ;
        return hashmap;
    }

    private static void persistLifecycleContextData()
    {
        try
        {
            android.content.SharedPreferences.Editor editor = StaticMethods.getSharedPreferencesEditor();
            editor.putString("ADMS_LifecycleData", (new JSONObject(_lifecycleContextData)).toString());
            editor.commit();
            return;
        }
        catch (StaticMethods.NullContextException nullcontextexception)
        {
            StaticMethods.logWarningFormat("Lifecycle - Error persisting lifecycle data (%s)", new Object[] {
                nullcontextexception.getMessage()
            });
        }
    }

    protected static void removeContextData(String s)
    {
        synchronized (_contextDataMutex)
        {
            _lifecycleContextData.remove(s);
        }
        synchronized (_lowercaseContextDataMutex)
        {
            _lifecycleContextDataLowercase.remove(s.toLowerCase());
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static void resetLifecycleFlags(long l)
    {
        try
        {
            android.content.SharedPreferences.Editor editor = StaticMethods.getSharedPreferencesEditor();
            if (!StaticMethods.getSharedPreferences().contains("ADMS_SessionStart"))
            {
                editor.putLong("ADMS_SessionStart", l);
                sessionStartTime = l / 1000L;
            }
            editor.putString("ADMS_LastVersion", StaticMethods.getApplicationVersion());
            editor.putBoolean("ADMS_SuccessfulClose", false);
            editor.remove("ADMS_PauseDate");
            editor.commit();
            return;
        }
        catch (StaticMethods.NullContextException nullcontextexception)
        {
            StaticMethods.logErrorFormat("Lifecycle - Error resetting lifecycle flags (%s).", new Object[] {
                nullcontextexception.getMessage()
            });
        }
    }

    protected static void start(Activity activity, Map map)
    {
        if (lifecycleHasRun)
        {
            return;
        }
        lifecycleHasRun = true;
        Object obj;
        Activity activity1;
        SharedPreferences sharedpreferences;
        boolean flag;
        boolean flag1;
        int i;
        int j;
        long l;
        try
        {
            sharedpreferences = StaticMethods.getSharedPreferences();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            StaticMethods.logErrorFormat("Lifecycle - Error starting lifecycle (%s).", new Object[] {
                activity.getMessage()
            });
            return;
        }
        obj = null;
        activity1 = StaticMethods.getCurrentActivity();
        obj = activity1;
_L2:
        if (obj != null && activity != null && ((Activity) (obj)).getComponentName().toString().equals(activity.getComponentName().toString()))
        {
            Messages.checkForInAppMessage(null, null, null);
        }
        StaticMethods.setCurrentActivity(activity);
        obj = MobileConfig.getInstance();
        l = sharedpreferences.getLong("ADMS_PauseDate", 0L);
        i = ((MobileConfig) (obj)).getLifecycleTimeout();
        flag1 = true;
        flag = flag1;
        long l1;
        if (l > 0L)
        {
            j = (int)(((new Date()).getTime() - l) / 1000L);
            l = sharedpreferences.getLong("ADMS_SessionStart", 0L);
            sessionStartTime = l / 1000L;
            AnalyticsTrackTimedAction.sharedInstance().trackTimedActionUpdateAdjustedStartTime(j);
            flag = flag1;
            if (j < i)
            {
                flag = flag1;
                if (l > 0L)
                {
                    try
                    {
                        activity = StaticMethods.getSharedPreferencesEditor();
                        activity.putLong("ADMS_SessionStart", (long)(j * 1000) + l);
                        activity.commit();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Activity activity)
                    {
                        StaticMethods.logErrorFormat("Lifecycle - Error while updating start time (%s).", new Object[] {
                            activity.getMessage()
                        });
                    }
                    sessionStartTime = sharedpreferences.getLong("ADMS_SessionStart", 0L) / 1000L;
                    flag = false;
                }
            }
        }
        l1 = (new Date()).getTime();
        if (flag)
        {
            ((MobileConfig) (obj)).downloadRemoteConfigs();
            _lifecycleContextData.clear();
            clearContextDataLowercase();
            if (map != null)
            {
                activity = new HashMap(map);
            } else
            {
                activity = new HashMap();
            }
            if (!sharedpreferences.contains("ADMS_InstallDate"))
            {
                addInstallData(activity, l1);
            } else
            {
                addNonInstallData(activity, l1);
                addUpgradeData(activity, l1);
                addSessionLengthData(activity);
            }
            addLifecycleGenericData(activity, l1);
            generateLifecycleToBeSaved(activity);
            persistLifecycleContextData();
            if (((MobileConfig) (obj)).mobileUsingAnalytics())
            {
                AnalyticsTrackInternal.trackInternal("Lifecycle", activity, StaticMethods.getTimeSince1970() - 1L);
            }
            if (((MobileConfig) (obj)).mobileUsingAudienceManager())
            {
                AudienceManagerWorker.SubmitSignal(_lifecycleContextData, null);
            }
        }
        resetLifecycleFlags(l1);
        return;
        StaticMethods.NullActivityException nullactivityexception;
        nullactivityexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected static void stop()
    {
        lifecycleHasRun = false;
        StaticMethods.updateLastKnownTimestamp(Long.valueOf(StaticMethods.getTimeSince1970()));
        Activity activity;
        try
        {
            android.content.SharedPreferences.Editor editor = StaticMethods.getSharedPreferencesEditor();
            editor.putBoolean("ADMS_SuccessfulClose", true);
            editor.putLong("ADMS_PauseDate", (new Date()).getTime());
            editor.commit();
        }
        catch (StaticMethods.NullContextException nullcontextexception)
        {
            StaticMethods.logErrorFormat("Lifecycle - Error updating lifecycle pause data (%s)", new Object[] {
                nullcontextexception.getMessage()
            });
        }
        try
        {
            activity = StaticMethods.getCurrentActivity();
        }
        catch (StaticMethods.NullActivityException nullactivityexception)
        {
            return;
        }
        if (activity.isFinishing())
        {
            Messages.resetAllInAppMessages();
        }
    }

    protected static void updateContextData(HashMap hashmap)
    {
        synchronized (_contextDataMutex)
        {
            _lifecycleContextData.putAll(hashmap);
        }
        obj = _lowercaseContextDataMutex;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); _lifecycleContextDataLowercase.put(((String)entry.getKey()).toLowerCase(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

        break MISSING_BLOCK_LABEL_88;
        hashmap;
        obj;
        JVM INSTR monitorexit ;
        throw hashmap;
        hashmap;
        obj;
        JVM INSTR monitorexit ;
        throw hashmap;
        obj;
        JVM INSTR monitorexit ;
    }

}
