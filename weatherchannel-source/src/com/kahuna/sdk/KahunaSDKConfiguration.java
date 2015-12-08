// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.Context;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk:
//            KahunaUtils, KahunaPreferences, KahunaCommon

public class KahunaSDKConfiguration
{

    private static final String BATCH_SIZE_CONFIG_KEY = "bs";
    protected static final int DEFAULT_BATCH_SIZE = 100;
    protected static final double DEFAULT_EVENT_BUCKET_INTERVAL = 0.5D;
    protected static final int DEFAULT_EVENT_PROPERTIES_MAX_COUNT = 25;
    private static final long DEFAULT_FLUSH_EVENT_COUNT = 100L;
    private static final HashSet DEFAULT_FLUSH_IMMEDIATELY_LIST = new HashSet(Arrays.asList(new String[] {
        "k_app_bg", "k_user_logout"
    }));
    private static final double DEFAULT_FLUSH_INTERVAL_MINS = 5D;
    private static final double DEFAULT_FLUSH_SOON_DELAY_MINS = 0.5D;
    private static final HashSet DEFAULT_FLUSH_SOON_EVENTS_LIST = new HashSet();
    protected static final int DEFAULT_RETRY_ATTEMPT_COUNT = 5;
    private static final String EVENT_BUCKET_CONFIG_KEY = "bckev";
    private static final String EVENT_PROPERTIES_EXCLUDE_PROPERTIES_KEY = "execv_p";
    private static final String EVENT_PROPERTIES_INCLUDE_PROPERTIES_KEY = "incev_p";
    private static final String EVENT_PROPERTIES_MAX_COUNT_KEY = "epmc";
    private static final String EXCLUDE_EVENTS_ARRAY_KEY = "excev";
    private static final String FLUSH_EVENT_COUNT_KEY = "n";
    private static final String FLUSH_IMMEDIATE_KEY = "fi";
    private static final String FLUSH_INTERVAL_TIME_KEY = "t";
    private static final String FLUSH_SOON_ARRAY_KEY = "fs";
    private static final String FLUSH_SOON_WITH_DELAY_KEY = "fsd";
    private static final String INCLUDE_EVENTS_ARRAY_KEY = "incev";
    protected static final Set MAPPING_FILTERING_BLACKLIST_EVENTS = new HashSet(Arrays.asList(new String[] {
        "Start".toLowerCase()
    }));
    private static final String MAP_EVENTS_KEY = "mapev";
    private static final int MAX_BATCH_SIZE = 5000;
    protected static final double MAX_EVENT_BUCKET_INTERVAL = 259200D;
    private static final long MAX_EVENT_COUNT = 5000L;
    private static final double MAX_FLUSH_INTERVAL = 259200D;
    private static final double MAX_FLUSH_SOON_DELAY_INTERVAL = 259200D;
    private static final int MAX_RETRY_ATTEMPT_COUNT = 30;
    private static final int MIN_BATCH_SIZE = 1;
    protected static final double MIN_EVENT_BUCKET_INTERVAL = 0.5D;
    private static final long MIN_EVENT_COUNT = 1L;
    private static final double MIN_FLUSH_INTERVAL = 0.5D;
    private static final double MIN_FLUSH_SOON_DELAY_INTERVAL = 0.5D;
    private static final int MIN_RETRY_ATTEMPT_COUNT = 0;
    private static final String PREFS_BATCH_SIZE_KEY = "event_batch_size";
    private static final String PREFS_EVENT_BUCKET_CONFIG_KEY = "event_bucket_config";
    private static final String PREFS_EVENT_EXCLUDE_LIST_KEY = "events_to_exclude";
    private static final String PREFS_EVENT_INCLUDE_LIST_KEY = "events_to_include";
    private static final String PREFS_EVENT_MAPPING_KEY = "event_remapping";
    private static final String PREFS_EVENT_PROPERTIES_EXCLUDE_MAP_KEY = "event_properties_to_exclude";
    private static final String PREFS_EVENT_PROPERTIES_INCLUDE_MAP_KEY = "event_properties_to_include";
    private static final String PREFS_EVENT_PROPERTIES_MAX_COUNT_KEY = "event_properties_max_count";
    private static final String PREFS_FLUSH_INTERVAL_MINUTES_KEY = "flush_interval_min";
    private static final String PREFS_FLUSH_ON_EVENT_KEY = "flush_on_event_count";
    private static final String PREFS_FLUSH_SOON_DELAY_MINUTES_KEY = "flush_soon_delay_min";
    private static final String PREFS_FLUSH_SOON_EVENTS_KEY = "flush_soon_events";
    private static final String PREFS_MAX_RETRY_ATTEMPTS_KEY = "retry_attempts";
    private static final String PREFS_TRIGGER_EVENTS_KEY = "trigger_events";
    private static final String PREFS_VERSION_KEY = "version";
    private static final String RETRY_OVERRIDE_KEY = "ro";
    private static final String VERSION_KEY = "v";
    private int mBatchSize;
    private JSONObject mEventBucketConfig;
    private Map mEventPropertiesExcludeMap;
    private Map mEventPropertiesIncludeMap;
    private int mEventPropertiesMaxCount;
    private Set mExcludeList;
    private double mFlushIntervalMinutes;
    private long mFlushOnEventCount;
    private double mFlushSoonDelayIntervalMinutes;
    private Set mFlushSoonEvents;
    private Set mIncludeList;
    private Map mMappedEvents;
    private int mMaxRetryAttempts;
    private Set mTriggerEvents;
    private long mVersion;

    public KahunaSDKConfiguration()
    {
        mEventPropertiesMaxCount = 25;
        mVersion = 0L;
        mFlushIntervalMinutes = 5D;
        mFlushOnEventCount = 100L;
        mTriggerEvents = DEFAULT_FLUSH_IMMEDIATELY_LIST;
        mMaxRetryAttempts = 5;
        mFlushSoonDelayIntervalMinutes = 0.5D;
        mFlushSoonEvents = DEFAULT_FLUSH_SOON_EVENTS_LIST;
        mMappedEvents = null;
        mExcludeList = null;
        mIncludeList = null;
        mEventBucketConfig = null;
        mBatchSize = 100;
    }

    private static Map buildMapFromJSONObject(JSONObject jsonobject, Map map)
    {
        if (jsonobject != null)
        {
            HashMap hashmap = new HashMap();
            Iterator iterator = jsonobject.keys();
            do
            {
                map = hashmap;
                if (!iterator.hasNext())
                {
                    break;
                }
                map = (String)iterator.next();
                hashmap.put(map, jsonobject.optString(map));
            } while (true);
        }
        return map;
    }

    private static Map buildMapOfMapFromJSONObject(JSONObject jsonobject, Map map)
    {
        if (jsonobject != null)
        {
            HashMap hashmap = new HashMap();
            Iterator iterator = jsonobject.keys();
            do
            {
                map = hashmap;
                if (!iterator.hasNext())
                {
                    break;
                }
                map = (String)iterator.next();
                hashmap.put(map, buildMapFromJSONObject(jsonobject.optJSONObject(map), new HashMap()));
            } while (true);
        }
        return map;
    }

    private static Set buildSetFromJSONArray(JSONArray jsonarray, Set set, boolean flag)
    {
        if (jsonarray != null)
        {
            HashSet hashset = new HashSet();
            int j = jsonarray.length();
            int i = 0;
            do
            {
                set = hashset;
                if (i >= j)
                {
                    break;
                }
                String s = jsonarray.optString(i);
                if (!KahunaUtils.isNullOrEmpty(s))
                {
                    set = s;
                    if (flag)
                    {
                        set = s.toLowerCase();
                    }
                    hashset.add(set);
                }
                i++;
            } while (true);
        }
        return set;
    }

    protected static KahunaSDKConfiguration getSavedSDKConfiguration(Context context)
    {
        Object obj = null;
        if (context == null) goto _L2; else goto _L1
_L1:
        double d;
        JSONObject jsonobject;
        long l;
        long l1;
        jsonobject = KahunaPreferences.getSavedSDKConfigurationObject(context);
        l = jsonobject.optLong("version", 0L);
        d = jsonobject.optDouble("flush_interval_min", 5D);
        l1 = jsonobject.optLong("flush_on_event_count", 100L);
        context = jsonobject.optJSONArray("trigger_events");
        if (context == null) goto _L4; else goto _L3
_L3:
        context = buildSetFromJSONArray(context, new HashSet(), true);
_L7:
        double d1;
        int i;
        i = jsonobject.optInt("retry_attempts", 5);
        d1 = jsonobject.optDouble("flush_soon_delay_min", 0.5D);
        obj = jsonobject.optJSONArray("flush_soon_events");
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = buildSetFromJSONArray(((JSONArray) (obj)), new HashSet(), true);
_L8:
        KahunaSDKConfiguration kahunasdkconfiguration = new KahunaSDKConfiguration();
        kahunasdkconfiguration.setVersion(l);
        kahunasdkconfiguration.setFlushIntervalMinutes(d);
        kahunasdkconfiguration.setFlushOnEventCount(l1);
        kahunasdkconfiguration.setTriggerEvents(context);
        kahunasdkconfiguration.setMaxRetryAttempts(i);
        kahunasdkconfiguration.setFlushSoonDelayIntervalMinutes(d1);
        kahunasdkconfiguration.setFlushSoonEvents(((Set) (obj)));
        kahunasdkconfiguration.setEventMapping(buildMapFromJSONObject(jsonobject.optJSONObject("event_remapping"), new HashMap()));
        kahunasdkconfiguration.setEventIncludeList(buildSetFromJSONArray(jsonobject.optJSONArray("events_to_include"), null, false));
        kahunasdkconfiguration.setEventExcludeList(buildSetFromJSONArray(jsonobject.optJSONArray("events_to_exclude"), null, false));
        kahunasdkconfiguration.setEventPropertiesMaxCount(jsonobject.optInt("event_properties_max_count", 25));
        kahunasdkconfiguration.setEventPropertiesIncludeMap(buildMapOfMapFromJSONObject(jsonobject.optJSONObject("event_properties_to_include"), new HashMap()));
        kahunasdkconfiguration.setEventPropertiesExcludeMap(buildMapOfMapFromJSONObject(jsonobject.optJSONObject("event_properties_to_exclude"), new HashMap()));
        kahunasdkconfiguration.setEventBucketConfig(jsonobject.optJSONObject("event_bucket_config"));
        kahunasdkconfiguration.setBatchSize(jsonobject.optInt("event_batch_size", 100));
        obj = kahunasdkconfiguration;
        KahunaUtils.clearRegexPatternCache();
_L2:
        context = ((Context) (obj));
        if (obj == null)
        {
            context = new KahunaSDKConfiguration();
        }
        return context;
_L4:
        context = DEFAULT_FLUSH_IMMEDIATELY_LIST;
          goto _L7
_L6:
        obj = DEFAULT_FLUSH_SOON_EVENTS_LIST;
          goto _L8
        context;
_L9:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception getting SDK configurations: ").append(context).toString());
        }
        obj = null;
        KahunaUtils.clearRegexPatternCache();
          goto _L2
        context;
          goto _L9
    }

    protected static KahunaSDKConfiguration handleSDKConfigResponse(JSONObject jsonobject)
    {
        KahunaSDKConfiguration kahunasdkconfiguration = new KahunaSDKConfiguration();
        if (jsonobject != null)
        {
            kahunasdkconfiguration.setVersion(jsonobject.optLong("v", 0L));
            kahunasdkconfiguration.setFlushIntervalMinutes(jsonobject.optDouble("t", 5D));
            kahunasdkconfiguration.setFlushOnEventCount(jsonobject.optLong("n", 100L));
            kahunasdkconfiguration.setMaxRetryAttempts(jsonobject.optInt("ro", 5));
            kahunasdkconfiguration.setFlushSoonDelayIntervalMinutes(jsonobject.optDouble("fsd", 0.5D));
            if (jsonobject.has("fi"))
            {
                kahunasdkconfiguration.setTriggerEvents(buildSetFromJSONArray(jsonobject.optJSONArray("fi"), DEFAULT_FLUSH_IMMEDIATELY_LIST, true));
            }
            if (jsonobject.has("fs"))
            {
                kahunasdkconfiguration.setFlushSoonEvents(buildSetFromJSONArray(jsonobject.optJSONArray("fs"), DEFAULT_FLUSH_SOON_EVENTS_LIST, true));
            }
            kahunasdkconfiguration.setEventMapping(buildMapFromJSONObject(jsonobject.optJSONObject("mapev"), new HashMap()));
            if (jsonobject.has("incev"))
            {
                kahunasdkconfiguration.setEventIncludeList(buildSetFromJSONArray(jsonobject.optJSONArray("incev"), null, false));
            } else
            {
                kahunasdkconfiguration.setEventExcludeList(buildSetFromJSONArray(jsonobject.optJSONArray("excev"), null, false));
            }
            if (jsonobject.has("epmc"))
            {
                kahunasdkconfiguration.setEventPropertiesMaxCount(jsonobject.optInt("epmc", 25));
            }
            if (jsonobject.has("incev_p"))
            {
                kahunasdkconfiguration.setEventPropertiesIncludeMap(buildMapOfMapFromJSONObject(jsonobject.optJSONObject("incev_p"), new HashMap()));
            }
            if (jsonobject.has("execv_p"))
            {
                kahunasdkconfiguration.setEventPropertiesExcludeMap(buildMapOfMapFromJSONObject(jsonobject.optJSONObject("execv_p"), new HashMap()));
            }
            kahunasdkconfiguration.setEventBucketConfig(jsonobject.optJSONObject("bckev"));
            kahunasdkconfiguration.setBatchSize(jsonobject.optInt("bs", 100));
        }
        KahunaUtils.clearRegexPatternCache();
        return kahunasdkconfiguration;
    }

    private boolean hasEventPropertyDefinition(String s, Map map)
    {
        if (!KahunaUtils.isNullOrEmpty(map))
        {
            map = map.keySet().iterator();
            while (map.hasNext()) 
            {
                if (KahunaUtils.getRegexMatches((String)map.next(), s))
                {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isEventPropertyInMap(String s, String s1, String s2, Map map)
    {
        if (!KahunaUtils.isNullOrEmpty(map) && !KahunaUtils.isNullOrEmpty(s) && !KahunaUtils.isNullOrEmpty(s1) && !KahunaUtils.isNullOrEmpty(s2)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator = map.keySet().iterator();
_L5:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj = (String)iterator.next();
        if (!KahunaUtils.getRegexMatches(((String) (obj)), s))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (Map)map.get(obj);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Iterator iterator1 = ((Map) (obj)).keySet().iterator();
        String s3;
        String s4;
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s3 = (String)iterator1.next();
            s4 = (String)((Map) (obj)).get(s3);
        } while (!KahunaUtils.getRegexMatches(s3, s1) || !KahunaUtils.getRegexMatches(s4, s2));
        break; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        return true;
    }

    private boolean isValidKey(String s)
    {
        if (!KahunaUtils.isNullOrEmpty(s))
        {
            if ("Start".equalsIgnoreCase(s))
            {
                if (KahunaCommon.mDebugEnabled)
                {
                    Log.d("Kahuna", "Can't process event filterings or mappings if the name is start");
                    return false;
                }
            } else
            {
                return KahunaUtils.getIsValidRegex(s);
            }
        }
        return false;
    }

    protected static void saveSDKConfiguration(Context context, KahunaSDKConfiguration kahunasdkconfiguration)
    {
        if (kahunasdkconfiguration != null && context != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        JSONObject jsonobject;
        Object obj;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("version", kahunasdkconfiguration.getVersion());
            jsonobject.put("flush_interval_min", kahunasdkconfiguration.getFlushIntervalMinutes());
            jsonobject.put("flush_on_event_count", kahunasdkconfiguration.getFlushOnEventCount());
            obj = new JSONArray();
            for (Iterator iterator = kahunasdkconfiguration.getTriggerEvents().iterator(); iterator.hasNext(); ((JSONArray) (obj)).put((String)iterator.next())) { }
            break MISSING_BLOCK_LABEL_132;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (!KahunaCommon.mDebugEnabled) goto _L1; else goto _L3
_L3:
        Log.d("Kahuna", (new StringBuilder()).append("Exception serializing SDK config to save: ").append(context).toString());
        return;
        jsonobject.put("trigger_events", obj);
        jsonobject.put("retry_attempts", kahunasdkconfiguration.getMaxRetryAttempts());
        jsonobject.put("flush_soon_delay_min", kahunasdkconfiguration.getFlushSoonDelayIntervalMinutes());
        obj = new JSONArray();
        for (Iterator iterator1 = kahunasdkconfiguration.getFlushSoonEvents().iterator(); iterator1.hasNext(); ((JSONArray) (obj)).put((String)iterator1.next())) { }
        Object obj1;
        jsonobject.put("flush_soon_events", obj);
        obj = new JSONObject();
        obj1 = kahunasdkconfiguration.getEventMapping();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        String s;
        for (Iterator iterator2 = ((Map) (obj1)).keySet().iterator(); iterator2.hasNext(); ((JSONObject) (obj)).put(s, ((Map) (obj1)).get(s)))
        {
            s = (String)iterator2.next();
        }

        jsonobject.put("event_remapping", obj);
        obj = new JSONArray();
        obj1 = kahunasdkconfiguration.getEventIncludeList();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_363;
        }
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((JSONArray) (obj)).put((String)((Iterator) (obj1)).next())) { }
        jsonobject.put("events_to_include", obj);
        obj = new JSONArray();
        obj1 = kahunasdkconfiguration.getEventExcludeList();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((JSONArray) (obj)).put((String)((Iterator) (obj1)).next())) { }
        jsonobject.put("events_to_exclude", obj);
        jsonobject.put("event_properties_max_count", kahunasdkconfiguration.getEventPropertiesMaxCount());
        jsonobject.put("event_properties_to_include", new JSONObject(kahunasdkconfiguration.getEventPropertiesIncludeMap()));
        jsonobject.put("event_properties_to_exclude", new JSONObject(kahunasdkconfiguration.getEventPropertiesExcludeMap()));
        if (kahunasdkconfiguration.mEventBucketConfig == null)
        {
            kahunasdkconfiguration.mEventBucketConfig = new JSONObject();
        }
        jsonobject.put("event_bucket_config", kahunasdkconfiguration.mEventBucketConfig);
        jsonobject.put("event_batch_size", kahunasdkconfiguration.getBatchSize());
        KahunaPreferences.saveSDKConfigurationObject(context, jsonobject);
        return;
    }

    private void setEventExcludeList(Set set)
    {
        if (set != null)
        {
            HashSet hashset = new HashSet();
            set = set.iterator();
            do
            {
                if (!set.hasNext())
                {
                    break;
                }
                String s = (String)set.next();
                if (isValidKey(s))
                {
                    hashset.add(s);
                }
            } while (true);
            mExcludeList = hashset;
            return;
        } else
        {
            mExcludeList = set;
            return;
        }
    }

    private void setEventIncludeList(Set set)
    {
        if (set != null)
        {
            HashSet hashset = new HashSet();
            set = set.iterator();
            do
            {
                if (!set.hasNext())
                {
                    break;
                }
                String s = (String)set.next();
                if (isValidKey(s))
                {
                    hashset.add(s);
                }
            } while (true);
            mIncludeList = hashset;
            return;
        } else
        {
            mIncludeList = set;
            return;
        }
    }

    private void setEventMapping(Map map)
    {
        if (map != null)
        {
            HashMap hashmap = new HashMap();
            Iterator iterator = map.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                if (isValidKey(s) && !KahunaUtils.isNullOrEmpty((String)map.get(s)))
                {
                    hashmap.put(s, map.get(s));
                }
            } while (true);
            mMappedEvents = hashmap;
            return;
        } else
        {
            mMappedEvents = map;
            return;
        }
    }

    private void setEventPropertiesExcludeMap(Map map)
    {
        if (map != null)
        {
            mEventPropertiesExcludeMap = validateEventPropertiesMap(map);
            return;
        } else
        {
            mEventPropertiesExcludeMap = map;
            return;
        }
    }

    private void setEventPropertiesIncludeMap(Map map)
    {
        if (map != null)
        {
            mEventPropertiesIncludeMap = validateEventPropertiesMap(map);
            return;
        } else
        {
            mEventPropertiesIncludeMap = null;
            return;
        }
    }

    private void setEventPropertiesMaxCount(int i)
    {
        if (i >= 0)
        {
            mEventPropertiesMaxCount = i;
        }
    }

    private void setFlushIntervalMinutes(double d)
    {
        mFlushIntervalMinutes = d;
        if (mFlushIntervalMinutes == (0.0D / 0.0D))
        {
            mFlushIntervalMinutes = 5D;
        }
        if (mFlushIntervalMinutes < 0.5D)
        {
            mFlushIntervalMinutes = 0.5D;
        } else
        if (mFlushIntervalMinutes > 259200D)
        {
            mFlushIntervalMinutes = 259200D;
            return;
        }
    }

    private void setFlushOnEventCount(long l)
    {
        mFlushOnEventCount = l;
        if (mFlushOnEventCount < 1L)
        {
            mFlushOnEventCount = 1L;
        } else
        if (mFlushOnEventCount > 5000L)
        {
            mFlushOnEventCount = 5000L;
            return;
        }
    }

    private void setFlushSoonEvents(Set set)
    {
        mFlushSoonEvents = set;
    }

    private void setMaxRetryAttempts(int i)
    {
        mMaxRetryAttempts = i;
        if (mMaxRetryAttempts < 0)
        {
            mMaxRetryAttempts = 0;
        } else
        if (mMaxRetryAttempts > 30)
        {
            mMaxRetryAttempts = 30;
            return;
        }
    }

    private void setTriggerEvents(Set set)
    {
        mTriggerEvents = set;
    }

    private Map validateEventPropertiesMap(Map map)
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Map map1 = (Map)map.get(s);
            if (!KahunaUtils.isNullOrEmpty(s) && !KahunaUtils.isNullOrEmpty(map1) && KahunaUtils.getIsValidRegex(s))
            {
                HashMap hashmap1 = new HashMap();
                Iterator iterator1 = map1.keySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s1 = (String)iterator1.next();
                    String s2 = (String)map1.get(s1);
                    if (!KahunaUtils.isNullOrEmpty(s1) && !KahunaUtils.isNullOrEmpty(s2) && KahunaUtils.getIsValidRegex(s1) && KahunaUtils.getIsValidRegex(s2))
                    {
                        hashmap1.put(s1, s2);
                    }
                } while (true);
                if (!KahunaUtils.isNullOrEmpty(hashmap1))
                {
                    hashmap.put(s, hashmap1);
                }
            }
        } while (true);
        return hashmap;
    }

    protected int getBatchSize()
    {
        return mBatchSize;
    }

    protected JSONObject getEventBucketConfig()
    {
        if (mEventBucketConfig != null)
        {
            return mEventBucketConfig;
        } else
        {
            return new JSONObject();
        }
    }

    protected Set getEventExcludeList()
    {
        if (mExcludeList != null)
        {
            return new HashSet(mExcludeList);
        } else
        {
            return new HashSet();
        }
    }

    protected Set getEventIncludeList()
    {
        if (mIncludeList != null)
        {
            return new HashSet(mIncludeList);
        } else
        {
            return new HashSet();
        }
    }

    protected Map getEventMapping()
    {
        if (mMappedEvents != null)
        {
            return new HashMap(mMappedEvents);
        } else
        {
            return new HashMap();
        }
    }

    protected Map getEventPropertiesExcludeMap()
    {
        if (mEventPropertiesExcludeMap != null)
        {
            return mEventPropertiesExcludeMap;
        } else
        {
            return new HashMap();
        }
    }

    protected Map getEventPropertiesIncludeMap()
    {
        if (mEventPropertiesIncludeMap != null)
        {
            return mEventPropertiesIncludeMap;
        } else
        {
            return new HashMap();
        }
    }

    protected int getEventPropertiesMaxCount()
    {
        return mEventPropertiesMaxCount;
    }

    protected double getFlushIntervalMinutes()
    {
        return mFlushIntervalMinutes;
    }

    protected long getFlushIntervalSeconds()
    {
        return (long)(mFlushIntervalMinutes * 60D);
    }

    protected long getFlushOnEventCount()
    {
        return mFlushOnEventCount;
    }

    protected double getFlushSoonDelayIntervalMinutes()
    {
        return mFlushSoonDelayIntervalMinutes;
    }

    protected long getFlushSoonDelayIntervalSeconds()
    {
        return (long)(mFlushSoonDelayIntervalMinutes * 60D);
    }

    protected Set getFlushSoonEvents()
    {
        if (mFlushSoonEvents != null)
        {
            return new HashSet(mFlushSoonEvents);
        } else
        {
            return new HashSet();
        }
    }

    protected int getMaxRetryAttempts()
    {
        return mMaxRetryAttempts;
    }

    protected Set getTriggerEvents()
    {
        if (mTriggerEvents != null)
        {
            return new HashSet(mTriggerEvents);
        } else
        {
            return new HashSet();
        }
    }

    protected long getVersion()
    {
        return mVersion;
    }

    protected boolean isValidEventProperty(String s, String s1, String s2)
    {
        if (hasEventPropertyDefinition(s, mEventPropertiesIncludeMap) || hasEventPropertyDefinition(s, mEventPropertiesExcludeMap)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!KahunaUtils.isNullOrEmpty(mEventPropertiesIncludeMap))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!KahunaUtils.isNullOrEmpty(mEventPropertiesExcludeMap) && isEventPropertyInMap(s, s1, s2, mEventPropertiesExcludeMap))
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (KahunaUtils.isNullOrEmpty(mEventPropertiesExcludeMap))
        {
            return isEventPropertyInMap(s, s1, s2, mEventPropertiesIncludeMap);
        }
        if (!isEventPropertyInMap(s, s1, s2, mEventPropertiesIncludeMap) || isEventPropertyInMap(s, s1, s2, mEventPropertiesExcludeMap))
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void setBatchSize(int i)
    {
        mBatchSize = i;
        if (mBatchSize >= 1) goto _L2; else goto _L1
_L1:
        mBatchSize = 1;
_L4:
        if ((long)mBatchSize > mFlushOnEventCount)
        {
            mBatchSize = (int)mFlushOnEventCount;
        }
        return;
_L2:
        if (mBatchSize > 5000)
        {
            mBatchSize = 5000;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void setEventBucketConfig(JSONObject jsonobject)
    {
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        mEventBucketConfig = new JSONObject();
        Iterator iterator = jsonobject.keys();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        double d1;
        String s;
        s = (String)iterator.next();
        d1 = jsonobject.optDouble(s, 0.5D);
        double d;
        d = d1;
        if (d1 == (0.0D / 0.0D))
        {
            d = 0.5D;
        }
          goto _L5
_L7:
        mEventBucketConfig.put(s.toLowerCase(), d1);
          goto _L6
        jsonobject;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.w("Kahuna", (new StringBuilder()).append("Caught exception while trying to set event bucket config: ").append(jsonobject).toString());
        }
_L4:
        return;
_L9:
        d1 = d;
        if (d > 259200D)
        {
            d1 = 259200D;
        }
          goto _L7
_L2:
        mEventBucketConfig = null;
        return;
_L5:
        if (d >= 0.5D) goto _L9; else goto _L8
_L8:
        d1 = 0.5D;
          goto _L7
    }

    protected void setFlushSoonDelayIntervalMinutes(double d)
    {
        mFlushSoonDelayIntervalMinutes = d;
        if (mFlushSoonDelayIntervalMinutes == (0.0D / 0.0D))
        {
            mFlushSoonDelayIntervalMinutes = 0.5D;
        }
        if (mFlushSoonDelayIntervalMinutes < 0.5D)
        {
            mFlushSoonDelayIntervalMinutes = 0.5D;
        } else
        if (mFlushSoonDelayIntervalMinutes > 259200D)
        {
            mFlushSoonDelayIntervalMinutes = 259200D;
            return;
        }
    }

    protected void setVersion(long l)
    {
        mVersion = l;
    }

}
