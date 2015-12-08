// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.kahuna.sdk.location.KahunaGeofence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaUtils, Event, ArchiveContainerObject

public class KahunaPreferences
{

    private static final String ACTIVITY_MONITORING_INTERVAL_KEY = "activity_monitoring_interval";
    private static final String DEBUG_MANAGER_STORAGE_KEY = "debug_manager_storage_object";
    private static final String DEVICE_ID_PREF_KEY = "device_id";
    private static final String DIRTY_USER_ATTS_PREF_KEY = "dirty_user_attributes";
    private static final String EVENTS_PREF_KEY = "events";
    private static final String EVENT_NUMBER_KEY = "event_number";
    private static final String GEOFENCE_LIST_KEY = "geofencing_objects_list";
    private static final String GEOFENCE_REGION_IDS_KEY = "geofencing_regions";
    private static final String LAST_ENTERED_REGION_ID_KEY = "last_entered_region_id";
    private static final String LAST_FLUSH_TIMESTAMP_KEY = "last_flush_timestamp";
    private static final String PREFERENCES = "com.kahuna.sdk.android";
    private static final String PREV_PUSH_TOKEN = "prev_push_token";
    private static final String PUSH_ENABLED_KEY = "push_enabled";
    private static final String RECEIVED_PUSH_DISPLAY_IDS_KEY = "received_push_message_ids";
    private static final String SDK_CONFIGURATION_KEY = "sdk_configuration";
    private static final String SHOULD_INSERT_CREDS_KEY = "insert_credentials";
    private static final String SUPPORT_LIB_MISSING = "support_library_missing";
    private static final String TRACKED_IBEACONS_KEY = "tracked_ibeacons";
    private static final String USER_ATTRIBUTES_PREF_KEY = "user_attributes";
    private static final String USER_CREDENTIALS_NEW_PREF_KEY = "user_credentials_v2";
    private static final String USER_CREDENTIALS_OLD_PREF_KEY = "user_credentials";

    private KahunaPreferences()
    {
    }

    public static int getActivityMonitoringDelay(KahunaCommon kahunacommon, Context context)
    {
        if (kahunacommon == null || !(kahunacommon instanceof KahunaCommon))
        {
            Log.e("Kahuna", "You cannot request to get any data from Kahuna preferences externally from the Kahuna SDK. Aborting!");
            return -1;
        } else
        {
            return getKahunaPreferences(context).getInt("activity_monitoring_interval", -1);
        }
    }

    protected static Set getDirtyAttributesKeys(Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        HashSet hashset;
        SharedPreferences sharedpreferences;
        hashset = new HashSet();
        sharedpreferences = getKahunaPreferences(context);
        Object obj = sharedpreferences.getString("dirty_user_attributes", null);
        context = hashset;
        if (KahunaUtils.isNullOrEmpty(((String) (obj)))) goto _L2; else goto _L1
_L1:
        int j;
        obj = new JSONArray(((String) (obj)));
        j = ((JSONArray) (obj)).length();
        int i = 0;
_L3:
        context = hashset;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(((JSONArray) (obj)).optString(i));
        i++;
        if (true) goto _L3; else goto _L2
        context;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting saved dirty user attributes: ").append(context).toString());
        }
        context = new HashSet();
        sharedpreferences.edit().putString("dirty_user_attributes", null);
_L2:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    protected static JSONObject getInternalDebugManagerPreferences(Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        context = getKahunaPreferences(context);
        context = new JSONObject(context.getString("debug_manager_storage_object", "{}"));
_L2:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return context;
        context;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting internal Debug Manager preferences: ").append(context).toString());
        }
        context = new JSONObject();
        if (true) goto _L2; else goto _L1
_L1:
        context;
        throw context;
    }

    private static SharedPreferences getKahunaPreferences(Context context)
    {
        return context.getSharedPreferences("com.kahuna.sdk.android", 0);
    }

    public static String getLastEnteredRegionId(KahunaCommon kahunacommon, Context context)
    {
        Object obj = null;
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        if (kahunacommon == null) goto _L2; else goto _L1
_L1:
        if (kahunacommon instanceof KahunaCommon) goto _L3; else goto _L2
_L2:
        Log.e("Kahuna", "You cannot request to get any data from Kahuna preferences externally from the Kahuna SDK. Aborting!");
        kahunacommon = obj;
_L5:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return kahunacommon;
_L3:
        kahunacommon = getKahunaPreferences(context).getString("last_entered_region_id", null);
        if (true) goto _L5; else goto _L4
_L4:
        kahunacommon;
        throw kahunacommon;
    }

    protected static long getLastFlushTimestamp(Context context)
    {
        return getKahunaPreferences(context).getLong("last_flush_timestamp", 0L);
    }

    protected static Map getOldPrimitivesMapInternal(Context context, String s, Class class1)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        SharedPreferences sharedpreferences;
        hashmap = new HashMap();
        sharedpreferences = getKahunaPreferences(context);
        Object obj = sharedpreferences.getString(s, null);
        context = hashmap;
        if (KahunaUtils.isNullOrEmpty(((String) (obj)))) goto _L2; else goto _L1
_L1:
        int j;
        obj = new JSONArray(((String) (obj)));
        j = ((JSONArray) (obj)).length();
        int i = 0;
_L14:
        context = hashmap;
        if (i >= j) goto _L2; else goto _L3
_L3:
        JSONObject jsonobject;
        Iterator iterator;
        jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        iterator = jsonobject.keys();
_L8:
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        String s1 = (String)iterator.next();
        context = null;
        if (class1 != java/lang/String) goto _L7; else goto _L6
_L6:
        context = jsonobject.optString(s1, null);
_L9:
        hashmap.put(s1, context);
          goto _L8
        context;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting stored internal map: ").append(context).toString());
        }
        context = new HashMap();
        sharedpreferences.edit().putString(s, null);
_L2:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return context;
_L7:
        if (class1 != java/lang/Long)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        context = Long.valueOf(jsonobject.optLong(s1));
          goto _L9
        if (class1 != java/lang/Integer)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        context = Integer.valueOf(jsonobject.optInt(s1));
          goto _L9
        if (class1 != java/lang/Boolean) goto _L11; else goto _L10
_L10:
        context = Boolean.valueOf(jsonobject.optBoolean(s1));
          goto _L9
_L11:
        if (class1 != java/lang/Double) goto _L9; else goto _L12
_L12:
        double d = jsonobject.optDouble(s1);
        context = Double.valueOf(d);
          goto _L9
_L5:
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        context;
        throw context;
    }

    protected static String getPreviousSDKVersion(Context context)
    {
        return getKahunaPreferences(context).getString("prev_sdk_version", "0");
    }

    private static Map getPrimitivesMapInternal(Context context, String s, Class class1)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        SharedPreferences sharedpreferences;
        hashmap = new HashMap();
        sharedpreferences = getKahunaPreferences(context);
        Object obj = sharedpreferences.getString(s, null);
        context = hashmap;
        if (KahunaUtils.isNullOrEmpty(((String) (obj)))) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        obj = new JSONObject(((String) (obj)));
        iterator = ((JSONObject) (obj)).keys();
_L6:
        context = hashmap;
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        String s1 = (String)iterator.next();
        context = null;
        if (class1 != java/lang/String) goto _L5; else goto _L4
_L4:
        context = ((JSONObject) (obj)).optString(s1, null);
_L7:
        hashmap.put(s1, context);
          goto _L6
        context;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting stored internal map: ").append(context).toString());
        }
        context = new HashMap();
        sharedpreferences.edit().putString(s, null);
_L2:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return context;
_L5:
        if (class1 != java/lang/Long)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        context = Long.valueOf(((JSONObject) (obj)).optLong(s1));
          goto _L7
        if (class1 != java/lang/Integer)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        context = Integer.valueOf(((JSONObject) (obj)).optInt(s1));
          goto _L7
        if (class1 != java/lang/Boolean) goto _L9; else goto _L8
_L8:
        context = Boolean.valueOf(((JSONObject) (obj)).optBoolean(s1));
          goto _L7
_L9:
        if (class1 != java/lang/Double) goto _L7; else goto _L10
_L10:
        double d = ((JSONObject) (obj)).optDouble(s1);
        context = Double.valueOf(d);
          goto _L7
        context;
        throw context;
    }

    protected static boolean getPushEnabled(Context context)
    {
        return getKahunaPreferences(context).getBoolean("push_enabled", true);
    }

    protected static String getSavedDeviceId(Context context)
    {
        return getKahunaPreferences(context).getString("device_id", "");
    }

    protected static long getSavedEventNumber(Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        long l = getKahunaPreferences(context).getLong("event_number", 1L);
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return l;
        context;
        throw context;
    }

    protected static ArchiveContainerObject getSavedEvents(Context context, boolean flag)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        SharedPreferences sharedpreferences;
        ArrayList arraylist1;
        sharedpreferences = getKahunaPreferences(context);
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        Object obj;
        Object obj1;
        Object obj3;
        obj3 = null;
        obj1 = null;
        context = null;
        obj = obj3;
        String s = sharedpreferences.getString("events", null);
        Object obj2;
        obj = obj3;
        obj2 = arraylist;
        if (KahunaUtils.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        obj = obj3;
        JSONArray jsonarray = new JSONArray(s);
        obj = obj3;
        int j = jsonarray.length();
        int i = 0;
_L6:
        obj1 = context;
        obj2 = arraylist;
        if (i >= j) goto _L2; else goto _L3
_L3:
        obj = context;
        obj2 = jsonarray.getJSONObject(i);
        obj = context;
        obj1 = Event.buildEventFromSavedArchive(((JSONObject) (obj2)), flag);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        obj = context;
        arraylist.add(obj1);
          goto _L4
        obj1 = context;
        if (context == null)
        {
            obj1 = s;
        }
        obj = obj1;
        arraylist1.add(((JSONObject) (obj2)).optString("event"));
        context = ((Context) (obj1));
          goto _L4
        context;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting saved events: ").append(context).toString());
        }
        obj2 = new ArrayList();
        sharedpreferences.edit().putString("events", null);
        obj1 = obj;
_L2:
        context = new ArchiveContainerObject(((List) (obj2)), ((String) (obj1)), arraylist1);
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static List getSavedGeofencesBeingMonitored(KahunaCommon kahunacommon, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        if (kahunacommon == null) goto _L2; else goto _L1
_L1:
        if (kahunacommon instanceof KahunaCommon) goto _L3; else goto _L2
_L2:
        Log.e("Kahuna", "You cannot request to get any data from Kahuna preferences externally from the Kahuna SDK. Aborting!");
        kahunacommon = new ArrayList();
_L7:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return kahunacommon;
_L3:
        ArrayList arraylist;
        arraylist = new ArrayList();
        context = getKahunaPreferences(context);
        Object obj = context.getString("geofencing_objects_list", null);
        kahunacommon = arraylist;
        if (KahunaUtils.isNullOrEmpty(((String) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new JSONArray(((String) (obj)));
        int i = 0;
_L5:
        kahunacommon = arraylist;
        if (i >= ((JSONArray) (obj)).length())
        {
            continue; /* Loop/switch isn't completed */
        }
        kahunacommon = KahunaGeofence.buildFromJSONObject(((JSONArray) (obj)).getJSONObject(i));
        if (kahunacommon == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        arraylist.add(kahunacommon);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        kahunacommon;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting saved geofences: ").append(kahunacommon).toString());
        }
        kahunacommon = new ArrayList();
        context.edit().putString("geofencing_objects_list", null);
        if (true) goto _L7; else goto _L6
_L6:
        kahunacommon;
        throw kahunacommon;
    }

    public static JSONArray getSavedIBeacons(KahunaCommon kahunacommon, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        if (kahunacommon == null) goto _L2; else goto _L1
_L1:
        if (kahunacommon instanceof KahunaCommon) goto _L3; else goto _L2
_L2:
        Log.e("Kahuna", "You cannot request to get any data from Kahuna preferences externally from the Kahuna SDK. Aborting!");
        kahunacommon = new JSONArray();
_L5:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return kahunacommon;
_L3:
        kahunacommon = getKahunaPreferences(context);
        context = new JSONArray();
        String s = kahunacommon.getString("tracked_ibeacons", null);
        kahunacommon = context;
        if (!KahunaUtils.isNullOrEmpty(s))
        {
            kahunacommon = new JSONArray(s);
        }
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        kahunacommon = context;
        if (!KahunaCommon.mDebugEnabled)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.d("Kahuna", (new StringBuilder()).append("Exception getting tracked iBeacons: ").append(exception).toString());
        kahunacommon = context;
        if (true) goto _L5; else goto _L4
_L4:
        kahunacommon;
        throw kahunacommon;
    }

    protected static Map getSavedPushDisplayIds(Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        context = getPrimitivesMapInternal(context, "received_push_message_ids", java/lang/Long);
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    protected static String getSavedPushToken(Context context)
    {
        return getKahunaPreferences(context).getString("prev_push_token", "");
    }

    public static Map getSavedRegionIds(KahunaCommon kahunacommon, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        if (kahunacommon == null) goto _L2; else goto _L1
_L1:
        if (kahunacommon instanceof KahunaCommon) goto _L3; else goto _L2
_L2:
        Log.e("Kahuna", "You cannot request to get any data from Kahuna preferences externally from the Kahuna SDK. Aborting!");
        kahunacommon = new HashMap();
_L7:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return kahunacommon;
_L3:
        HashMap hashmap;
        hashmap = new HashMap();
        context = getKahunaPreferences(context);
        Object obj = context.getString("geofencing_regions", null);
        kahunacommon = hashmap;
        Iterator iterator;
        if (KahunaUtils.isNullOrEmpty(((String) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new JSONObject(((String) (obj)));
        iterator = ((JSONObject) (obj)).keys();
_L5:
        kahunacommon = hashmap;
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        kahunacommon = (String)iterator.next();
        hashmap.put(kahunacommon, Long.valueOf(((JSONObject) (obj)).getLong(kahunacommon)));
        if (true) goto _L5; else goto _L4
_L4:
        kahunacommon;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting saved region Ids: ").append(kahunacommon).toString());
        }
        kahunacommon = new HashMap();
        context.edit().putString("geofencing_regions", null);
        if (true) goto _L7; else goto _L6
_L6:
        kahunacommon;
        throw kahunacommon;
    }

    protected static JSONObject getSavedSDKConfigurationObject(Context context)
    {
        Object obj;
        context = getKahunaPreferences(context);
        obj = null;
        String s = context.getString("sdk_configuration", null);
        context = ((Context) (obj));
        if (!KahunaUtils.isNullOrEmpty(s))
        {
            context = new JSONObject(s);
        }
_L2:
        obj = context;
        if (context == null)
        {
            obj = new JSONObject();
        }
        return ((JSONObject) (obj));
        Exception exception;
        exception;
        context = ((Context) (obj));
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting SDK configuration: ").append(exception).toString());
            context = ((Context) (obj));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected static boolean getSupportLibMissing(Context context)
    {
        return getKahunaPreferences(context).getBoolean("support_library_missing", false);
    }

    protected static Map getUserAttributes(Context context)
    {
        return getPrimitivesMapInternal(context, "user_attributes", java/lang/String);
    }

    protected static Map getUserCredentialsNew(Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        SharedPreferences sharedpreferences;
        hashmap = new HashMap();
        sharedpreferences = getKahunaPreferences(context);
        Object obj = sharedpreferences.getString("user_credentials_v2", null);
        context = hashmap;
        if (KahunaUtils.isNullOrEmpty(((String) (obj)))) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        obj = new JSONObject(((String) (obj)));
        iterator = ((JSONObject) (obj)).keys();
_L3:
        context = hashmap;
        String s;
        JSONArray jsonarray;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        context = new HashSet();
        s = (String)iterator.next();
        jsonarray = ((JSONObject) (obj)).optJSONArray(s);
        if (jsonarray == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j = jsonarray.length();
        for (int i = 0; i < j; i++)
        {
            try
            {
                String s1 = jsonarray.optString(i);
                if (!KahunaUtils.isNullOrEmpty(s1))
                {
                    context.add(s1);
                }
                break MISSING_BLOCK_LABEL_221;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            finally
            {
                throw context;
            }
            break MISSING_BLOCK_LABEL_155;
        }

        hashmap.put(s, context);
        if (true) goto _L3; else goto _L2
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting stored user credentials map: ").append(context).toString());
        }
        context = new HashMap();
        sharedpreferences.edit().putString("user_credentials_v2", null);
_L2:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return context;
    }

    protected static Map getUserCredentialsOld(Context context)
    {
        return getPrimitivesMapInternal(context, "user_credentials", java/lang/String);
    }

    public static void saveActivityMonitoringDelay(KahunaCommon kahunacommon, Context context, int i)
    {
        if (kahunacommon == null || !(kahunacommon instanceof KahunaCommon))
        {
            Log.e("Kahuna", "You cannot request to save any data to Kahuna preferences externally from the Kahuna SDK. Aborting!");
            return;
        } else
        {
            getKahunaPreferences(context).edit().putInt("activity_monitoring_interval", i).commit();
            return;
        }
    }

    protected static void saveDeviceId(String s, Context context)
    {
        getKahunaPreferences(context).edit().putString("device_id", s).commit();
    }

    protected static void saveDirtyAttributesKeys(Set set, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        context = getKahunaPreferences(context);
        if (set != null) goto _L2; else goto _L1
_L1:
        context.edit().putString("dirty_user_attributes", null).commit();
_L4:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
_L2:
        JSONArray jsonarray;
        try
        {
            jsonarray = new JSONArray();
            for (set = set.iterator(); set.hasNext(); jsonarray.put((String)set.next())) { }
            break MISSING_BLOCK_LABEL_119;
        }
        // Misplaced declaration of an exception variable
        catch (Set set) { }
        finally
        {
            throw set;
        }
        if (!KahunaCommon.mDebugEnabled) goto _L4; else goto _L3
_L3:
        Log.d("Kahuna", (new StringBuilder()).append("Exception saving dirty user attributes: ").append(set).toString());
          goto _L4
        context.edit().putString("dirty_user_attributes", jsonarray.toString()).commit();
          goto _L4
    }

    protected static void saveEventNumber(long l, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        getKahunaPreferences(context).edit().putLong("event_number", l).commit();
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    protected static void saveEvents(List list, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        context = getKahunaPreferences(context);
        if (list != null) goto _L2; else goto _L1
_L1:
        context.edit().putString("events", null).commit();
_L6:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
_L2:
        JSONArray jsonarray;
        int j;
        int k;
        jsonarray = new JSONArray();
        k = list.size();
        j = k - KahunaCommon.MAX_EVENTS_TO_ARCHIVE;
        int i;
        i = j;
        if (j < 0)
        {
            i = 0;
        }
_L8:
        if (i >= k) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject = ((Event)list.get(i)).getJSONRepresentation();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        try
        {
            jsonarray.put(jsonobject);
            break MISSING_BLOCK_LABEL_181;
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        finally
        {
            throw list;
        }
          goto _L5
_L4:
        context.edit().putString("events", jsonarray.toString()).commit();
          goto _L6
_L5:
        if (!KahunaCommon.mDebugEnabled) goto _L6; else goto _L7
_L7:
        Log.d("Kahuna", (new StringBuilder()).append("Exception saving events: ").append(list).toString());
          goto _L6
        i++;
          goto _L8
    }

    public static void saveGeofencesBeingMonitored(KahunaCommon kahunacommon, List list, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        if (kahunacommon == null) goto _L2; else goto _L1
_L1:
        if (kahunacommon instanceof KahunaCommon) goto _L3; else goto _L2
_L2:
        Log.e("Kahuna", "You cannot request to save any data to Kahuna preferences externally from the Kahuna SDK. Aborting!");
_L4:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
_L3:
        kahunacommon = getKahunaPreferences(context);
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        kahunacommon.edit().putString("geofencing_objects_list", null).commit();
          goto _L4
        try
        {
            context = new JSONArray();
            for (list = list.iterator(); list.hasNext(); context.put(((KahunaGeofence)list.next()).toJSONObject())) { }
            break MISSING_BLOCK_LABEL_145;
        }
        // Misplaced declaration of an exception variable
        catch (KahunaCommon kahunacommon) { }
        finally
        {
            throw kahunacommon;
        }
        if (!KahunaCommon.mDebugEnabled) goto _L4; else goto _L5
_L5:
        Log.d("Kahuna", (new StringBuilder()).append("Exception saving geofences: ").append(kahunacommon).toString());
          goto _L4
        kahunacommon.edit().putString("geofencing_objects_list", context.toString()).commit();
          goto _L4
    }

    public static void saveIBeacons(KahunaCommon kahunacommon, Context context, JSONArray jsonarray)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        if (kahunacommon == null) goto _L2; else goto _L1
_L1:
        if (kahunacommon instanceof KahunaCommon) goto _L3; else goto _L2
_L2:
        Log.e("Kahuna", "You cannot request to save any data to Kahuna preferences externally from the Kahuna SDK. Aborting!");
_L5:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
_L3:
        kahunacommon = getKahunaPreferences(context);
        try
        {
            kahunacommon.edit().putString("tracked_ibeacons", jsonarray.toString()).commit();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (KahunaCommon kahunacommon) { }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception saving tracked iBeacons: ").append(kahunacommon).toString());
        }
        if (true) goto _L5; else goto _L4
_L4:
        kahunacommon;
        throw kahunacommon;
    }

    protected static void saveInternalDebugManagerPreferences(JSONObject jsonobject, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        getKahunaPreferences(context).edit().putString("debug_manager_storage_object", jsonobject.toString()).commit();
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    public static void saveLastEnteredRegionId(KahunaCommon kahunacommon, Context context, String s)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        if (kahunacommon == null) goto _L2; else goto _L1
_L1:
        if (kahunacommon instanceof KahunaCommon) goto _L3; else goto _L2
_L2:
        Log.e("Kahuna", "You cannot request to save any data to Kahuna preferences externally from the Kahuna SDK. Aborting!");
_L5:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
_L3:
        getKahunaPreferences(context).edit().putString("last_entered_region_id", s).commit();
        if (true) goto _L5; else goto _L4
_L4:
        kahunacommon;
        throw kahunacommon;
    }

    protected static void saveLastFlushTimestamp(long l, Context context)
    {
        getKahunaPreferences(context).edit().putLong("last_flush_timestamp", l).commit();
    }

    protected static void savePreviousSDKVersion(String s, Context context)
    {
        getKahunaPreferences(context).edit().putString("prev_sdk_version", s).commit();
    }

    private static void savePrimitivesMapInternal(Map map, Context context, String s)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        context = getKahunaPreferences(context);
        if (map != null) goto _L2; else goto _L1
_L1:
        context.edit().putString(s, null).commit();
_L6:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
_L2:
        JSONObject jsonobject;
        Iterator iterator;
        jsonobject = new JSONObject();
        iterator = map.keySet().iterator();
_L5:
        String s1;
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_232;
        }
        s1 = (String)iterator.next();
        obj = map.get(s1);
        if (!(obj instanceof String) || !KahunaUtils.isNullOrEmpty((String)obj)) goto _L4; else goto _L3
_L3:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", "Ignoring attempt to save null or empty string value in internal hashmap");
        }
          goto _L5
        map;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception saving user map: ").append(map).toString());
        }
        context.edit().putString(s, null).commit();
          goto _L6
        map;
        throw map;
_L4:
label0:
        {
            if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject))
            {
                break label0;
            }
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", "Ignoring attempt to save JSON Objects in internal hashmap");
            }
        }
          goto _L5
        jsonobject.put(s1, obj);
          goto _L5
        context.edit().putString(s, jsonobject.toString()).commit();
          goto _L6
    }

    protected static void savePushDisplayIds(Map map, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        savePrimitivesMapInternal(map, context, "received_push_message_ids");
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
        map;
        throw map;
    }

    protected static void savePushEnabled(boolean flag, Context context)
    {
        getKahunaPreferences(context).edit().putBoolean("push_enabled", flag).commit();
    }

    protected static void savePushToken(String s, Context context)
    {
        getKahunaPreferences(context).edit().putString("prev_push_token", s).commit();
    }

    public static void saveRegionIds(KahunaCommon kahunacommon, Map map, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        if (kahunacommon == null) goto _L2; else goto _L1
_L1:
        if (kahunacommon instanceof KahunaCommon) goto _L3; else goto _L2
_L2:
        Log.e("Kahuna", "You cannot request to save any data to Kahuna preferences externally from the Kahuna SDK. Aborting!");
_L4:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
_L3:
        kahunacommon = getKahunaPreferences(context);
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        kahunacommon.edit().putString("geofencing_regions", null).commit();
          goto _L4
        try
        {
            context = new JSONObject();
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); context.put(s, map.get(s)))
            {
                s = (String)iterator.next();
            }

            break MISSING_BLOCK_LABEL_159;
        }
        // Misplaced declaration of an exception variable
        catch (KahunaCommon kahunacommon) { }
        finally
        {
            throw kahunacommon;
        }
        if (!KahunaCommon.mDebugEnabled) goto _L4; else goto _L5
_L5:
        Log.d("Kahuna", (new StringBuilder()).append("Exception saving region Ids: ").append(kahunacommon).toString());
          goto _L4
        kahunacommon.edit().putString("geofencing_regions", context.toString()).commit();
          goto _L4
    }

    protected static void saveSDKConfigurationObject(Context context, JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            context = getKahunaPreferences(context);
            try
            {
                context.edit().putString("sdk_configuration", jsonobject.toString()).commit();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Exception saving SDK configuration: ").append(context).toString());
                return;
            }
        }
    }

    protected static void saveSupportLibMissing(boolean flag, Context context)
    {
        getKahunaPreferences(context).edit().putBoolean("support_library_missing", flag).commit();
    }

    protected static void saveUserAttributes(Map map, Context context)
    {
        savePrimitivesMapInternal(map, context, "user_attributes");
    }

    protected static void saveUserCredentialsNew(Map map, Context context)
    {
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorenter ;
        context = getKahunaPreferences(context);
        if (map != null) goto _L2; else goto _L1
_L1:
        context.edit().putString("user_credentials_v2", null).commit();
_L7:
        com/kahuna/sdk/KahunaPreferences;
        JVM INSTR monitorexit ;
        return;
_L2:
        JSONObject jsonobject;
        Iterator iterator;
        jsonobject = new JSONObject();
        iterator = map.keySet().iterator();
_L9:
        String s;
        JSONArray jsonarray;
        Object obj;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_238;
            }
            s = (String)iterator.next();
            obj = (Set)map.get(s);
        } while (KahunaUtils.isNullOrEmpty(((Set) (obj))));
        jsonarray = new JSONArray();
        obj = ((Set) (obj)).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        String s1 = (String)((Iterator) (obj)).next();
        if (!KahunaUtils.isNullOrEmpty(s1))
        {
            jsonarray.put(s1);
        }
        if (true) goto _L6; else goto _L5
_L5:
        map;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.e("Kahuna", (new StringBuilder()).append("Exception saving user credentials: ").append(map).toString());
        }
        context.edit().putString("user_credentials_v2", null).commit();
          goto _L7
        map;
        throw map;
_L4:
        if (jsonarray.length() <= 0) goto _L9; else goto _L8
_L8:
        jsonobject.put(s, jsonarray);
          goto _L9
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Saving User Credentials: ").append(jsonobject).toString());
        }
        context.edit().putString("user_credentials_v2", jsonobject.toString()).commit();
          goto _L7
    }

    protected static void saveUserCredentialsOld(Map map, Context context)
    {
        savePrimitivesMapInternal(map, context, "user_credentials");
    }
}
