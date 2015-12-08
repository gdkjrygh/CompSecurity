// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk:
//            KahunaUtils, KahunaCommon

public class Event
    implements Comparable
{

    private static final String BUCKET_COUNT_KEY = "event_count";
    private static final String COUNT_KEY = "count";
    private static final String EVENT_HASH_KEY = "event_hash";
    protected static final String EVENT_KEY = "event";
    private static final String EVENT_NUMBER_KEY = "event_number";
    private static final String EVENT_PROPERTIES_KEY = "properties";
    private static final String EVENT_TIME_KEY = "time";
    private static final String LAUNCH_OVERRIDE_KEY = "push_launch_override";
    public static final String LOCATION_BEACON_MAJOR = "major";
    public static final String LOCATION_BEACON_MINOR = "minor";
    public static final String LOCATION_ID = "id";
    private static final String LOCATION_KEY = "location";
    public static final String LOCATION_STATUS = "status";
    public static final String LOCATION_TYPE = "type";
    public static final String LOCATION_TYPE_BEACON = "beacon";
    public static final String LOCATION_TYPE_CIRCLE = "circle";
    private static final String TRACKING_ID_KEY = "tracking_id";
    private static final String USER_ATTRIBUTES_KEY = "user_info";
    private static final String USER_CREDENTIALS_KEY = "credentials";
    private static final String VALUE_KEY = "value";
    private int mBucketCount;
    private long mCreationDate;
    private long mEventNumber;
    private String mEventPropertiesString;
    private String mLocationString;
    private String mName;
    private int mPurchaseCount;
    private int mPurchaseValue;
    private int mPushOverride;
    private String mTrackingIdString;
    private String mUserAttributesString;
    private String mUserCredentialsString;

    protected Event(Event event)
    {
        mPurchaseCount = -1;
        mPurchaseValue = -1;
        mPushOverride = -1;
        mBucketCount = 0;
        mEventNumber = -1L;
        mName = event.mName;
        mCreationDate = event.mCreationDate;
        mUserCredentialsString = event.mUserCredentialsString;
        mUserAttributesString = event.mUserAttributesString;
        mTrackingIdString = event.mTrackingIdString;
        mLocationString = event.mLocationString;
        mBucketCount = event.mBucketCount;
        mPurchaseCount = event.mPurchaseCount;
        mPurchaseValue = event.mPurchaseValue;
    }

    protected Event(String s)
    {
        mPurchaseCount = -1;
        mPurchaseValue = -1;
        mPushOverride = -1;
        mBucketCount = 0;
        mEventNumber = -1L;
        mName = s;
        mCreationDate = System.currentTimeMillis() / 1000L;
    }

    protected Event(String s, long l)
    {
        mPurchaseCount = -1;
        mPurchaseValue = -1;
        mPushOverride = -1;
        mBucketCount = 0;
        mEventNumber = -1L;
        mName = s;
        mCreationDate = l;
    }

    protected static Event buildEventFromSavedArchive(JSONObject jsonobject, boolean flag)
    {
        if (jsonobject == null)
        {
            return null;
        }
        String s2;
        String s6;
        long l1;
        s6 = jsonobject.getString("event");
        l1 = jsonobject.getLong("time");
        s2 = jsonobject.optString("credentials");
        String s = s2;
        if ("".equals(s2))
        {
            s = null;
        }
        String s3 = jsonobject.optString("user_info");
        s2 = s3;
        if ("".equals(s3))
        {
            s2 = null;
        }
        String s4 = jsonobject.optString("location");
        s3 = s4;
        if ("".equals(s4))
        {
            s3 = null;
        }
        String s5 = jsonobject.optString("properties");
        s4 = s5;
        if ("".equals(s5))
        {
            s4 = null;
        }
        Object obj = jsonobject.optString("tracking_id");
        s5 = ((String) (obj));
        if ("".equals(obj))
        {
            s5 = null;
        }
        int i;
        int j;
        int k;
        int l;
        long l2;
        i = jsonobject.optInt("count", -1);
        j = jsonobject.optInt("value", -1);
        k = jsonobject.optInt("push_launch_override", -1);
        l = jsonobject.optInt("event_count", 0);
        l2 = jsonobject.optLong("event_number", -1L);
        obj = new Event(s6, l1);
        obj.mTrackingIdString = s5;
        obj.mUserCredentialsString = s;
        obj.mUserAttributesString = s2;
        obj.mLocationString = s3;
        obj.mEventPropertiesString = s4;
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        obj.mPurchaseCount = i;
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        obj.mPurchaseValue = j;
        if (k == -1)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        obj.mPushOverride = k;
        if (l2 <= 0L)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        obj.mEventNumber = l2;
        obj.mBucketCount = l;
        if (flag) goto _L2; else goto _L1
_L1:
        String s1 = jsonobject.optString("event_hash");
    /* block-local class not found */
    class EventHashMismatchException {}

        if (!KahunaUtils.isNullOrEmpty(s1) && !getEventHashForObject(jsonobject).equals(s1))
        {
            throw new EventHashMismatchException((new StringBuilder()).append("Detected corrupted archived event: ").append(jsonobject.toString()).toString());
        }
          goto _L2
        Exception exception;
        exception;
_L4:
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception building KAEvent from JSONObject: ").append(jsonobject).append(" andException:").append(exception).toString());
        }
        return null;
_L2:
        return ((Event) (obj));
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static String getEventHashForObject(JSONObject jsonobject)
    {
        Object obj = new TreeMap();
        if (jsonobject != null)
        {
            if (jsonobject.has("count"))
            {
                ((TreeMap) (obj)).put("count", (new StringBuilder()).append("count:").append(jsonobject.optString("count")).toString());
            }
            if (jsonobject.optJSONObject("credentials") != null)
            {
                ((TreeMap) (obj)).putAll(getMapKeysAndValuesForObject(jsonobject.optJSONObject("credentials"), "credentials"));
            }
            if (jsonobject.has("event"))
            {
                ((TreeMap) (obj)).put("event", (new StringBuilder()).append("event:").append(jsonobject.optString("event")).toString());
            }
            if (jsonobject.has("event_count"))
            {
                ((TreeMap) (obj)).put("event_count", (new StringBuilder()).append("event_count:").append(jsonobject.optString("event_count")).toString());
            }
            if (jsonobject.has("event_number"))
            {
                ((TreeMap) (obj)).put("event_number", (new StringBuilder()).append("event_number:").append(jsonobject.optString("event_number")).toString());
            }
            if (jsonobject.optJSONObject("location") != null)
            {
                ((TreeMap) (obj)).putAll(getMapKeysAndValuesForObject(jsonobject.optJSONObject("location"), "location"));
            }
            if (jsonobject.optJSONObject("properties") != null)
            {
                ((TreeMap) (obj)).putAll(getMapKeysAndValuesForObject(jsonobject.optJSONObject("properties"), "properties"));
            }
            if (jsonobject.has("time"))
            {
                ((TreeMap) (obj)).put("time", (new StringBuilder()).append("time:").append(jsonobject.optString("time")).toString());
            }
            if (jsonobject.has("tracking_id"))
            {
                ((TreeMap) (obj)).put("tracking_id", (new StringBuilder()).append("tracking_id:").append(jsonobject.optString("tracking_id")).toString());
            }
            if (jsonobject.optJSONObject("user_info") != null)
            {
                ((TreeMap) (obj)).putAll(getMapKeysAndValuesForObject(jsonobject.optJSONObject("user_info"), "user_info"));
            }
            if (jsonobject.has("value"))
            {
                ((TreeMap) (obj)).put("value", (new StringBuilder()).append("value:").append(jsonobject.optString("value")).toString());
            }
        }
        jsonobject = new ArrayList();
        for (obj = ((TreeMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); jsonobject.add(((java.util.Map.Entry)((Iterator) (obj)).next()).getValue())) { }
        return KahunaUtils.getHashForString(TextUtils.join("|", jsonobject), "MD5", false);
    }

    private static Map getMapKeysAndValuesForObject(JSONObject jsonobject, String s)
    {
        HashMap hashmap = new HashMap();
        if (jsonobject != null)
        {
            JSONArray jsonarray = jsonobject.names();
            for (int i = 0; i < jsonarray.length(); i++)
            {
                String s2 = jsonarray.optString(i);
                if (s2.length() <= 0)
                {
                    continue;
                }
                String s1 = (new StringBuilder()).append(s).append("_").append(s2).toString();
                s2 = jsonobject.optString(s2);
                if (!KahunaUtils.isNullOrEmpty(s2))
                {
                    hashmap.put(s1, (new StringBuilder()).append(s1).append(":").append(s2).toString());
                }
            }

        }
        return hashmap;
    }

    public int compareTo(Event event)
    {
        if (mCreationDate < event.mCreationDate)
        {
            return -1;
        }
        return mCreationDate <= event.mCreationDate ? 0 : 1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Event)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Event)
        {
            obj = (Event)obj;
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (KahunaUtils.isNullOrEmpty(mName) || KahunaUtils.isNullOrEmpty(((Event) (obj)).mName) || !mName.equals(((Event) (obj)).mName) || mCreationDate != ((Event) (obj)).mCreationDate);
        return true;
    }

    protected long getCreationTime()
    {
        return mCreationDate;
    }

    protected long getEventNumber()
    {
        return mEventNumber;
    }

    protected JSONObject getEventPropertiesData()
    {
        JSONObject jsonobject;
        if (KahunaUtils.isNullOrEmpty(mEventPropertiesString))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        jsonobject = new JSONObject(mEventPropertiesString);
        return jsonobject;
        JSONException jsonexception;
        jsonexception;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Exception building EventProperties from JSON String: ").append(mEventPropertiesString).append(" andException:").append(jsonexception).toString());
        }
        return null;
    }

    protected boolean getIsAggregating()
    {
        return mBucketCount > 0;
    }

    protected JSONObject getJSONRepresentation()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("event", mName);
            jsonobject.put("time", mCreationDate);
            if (mUserCredentialsString != null)
            {
                jsonobject.put("credentials", new JSONObject(mUserCredentialsString));
            }
            if (mUserAttributesString != null)
            {
                jsonobject.put("user_info", new JSONObject(mUserAttributesString));
            }
            if (mLocationString != null)
            {
                jsonobject.put("location", new JSONObject(mLocationString));
            }
            if (mEventPropertiesString != null)
            {
                jsonobject.put("properties", new JSONObject(mEventPropertiesString));
            }
            if (mTrackingIdString != null)
            {
                jsonobject.put("tracking_id", mTrackingIdString);
            }
            if (mPurchaseCount != -1)
            {
                jsonobject.put("count", mPurchaseCount);
            }
            if (mPurchaseValue != -1)
            {
                jsonobject.put("value", mPurchaseValue);
            }
            if (mPushOverride != -1)
            {
                jsonobject.put("push_launch_override", mPushOverride);
            }
            if (mBucketCount > 0)
            {
                jsonobject.put("event_count", mBucketCount);
            }
            if (mEventNumber > 0L)
            {
                jsonobject.put("event_number", mEventNumber);
            }
            String s = getEventHashForObject(jsonobject);
            if (s.length() > 0)
            {
                jsonobject.put("event_hash", s);
            }
        }
        catch (Exception exception)
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.d("Kahuna", (new StringBuilder()).append("Exception getting JSON representation for KAEvent: ").append(exception).toString());
            }
            return null;
        }
        return jsonobject;
    }

    protected String getName()
    {
        return mName;
    }

    protected int getPurchaseCount()
    {
        return mPurchaseCount;
    }

    protected int getPurchaseValue()
    {
        return mPurchaseValue;
    }

    protected String getUserCredentialsString()
    {
        return mUserCredentialsString;
    }

    protected boolean hasEventProperties()
    {
        return !KahunaUtils.isNullOrEmpty(mEventPropertiesString);
    }

    protected boolean hasUserAttributes()
    {
        return !KahunaUtils.isNullOrEmpty(mUserAttributesString);
    }

    protected void incrementBucketCount()
    {
        mBucketCount = mBucketCount + 1;
    }

    protected void setEventNumber(long l)
    {
        mEventNumber = l;
    }

    protected void setEventPropertiesData(JSONObject jsonobject)
    {
        if (!KahunaUtils.isNullOrEmpty(jsonobject))
        {
            mEventPropertiesString = jsonobject.toString();
            return;
        } else
        {
            mEventPropertiesString = null;
            return;
        }
    }

    protected void setLocationMetadata(Map map)
    {
        if (!KahunaUtils.isNullOrEmpty(map))
        {
            mLocationString = (new JSONObject(map)).toString();
            return;
        } else
        {
            mLocationString = null;
            return;
        }
    }

    protected void setName(String s)
    {
        mName = s;
    }

    protected void setPurchaseCount(int i)
    {
        mPurchaseCount = i;
    }

    protected void setPurchaseValue(int i)
    {
        mPurchaseValue = i;
    }

    protected void setPushClickedOverride()
    {
        mPushOverride = 1;
    }

    protected void setTrackingId(String s)
    {
        mTrackingIdString = s;
    }

    protected void setUserAttributes(Map map)
    {
        if (!KahunaUtils.isNullOrEmpty(map))
        {
            mUserAttributesString = (new JSONObject(map)).toString();
            return;
        } else
        {
            mUserAttributesString = null;
            return;
        }
    }

    protected void setUserCredentials(Map map)
    {
        if (!KahunaUtils.isNullOrEmpty(map))
        {
            JSONObject jsonobject = new JSONObject();
            Iterator iterator = map.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                try
                {
                    jsonobject.put(s, new JSONArray((Set)map.get(s)));
                }
                catch (Exception exception)
                {
                    if (KahunaCommon.mDebugEnabled)
                    {
                        Log.d("Kahuna", (new StringBuilder()).append("Exception building user credentials string from Map: ").append(map).append(" andException:").append(exception).toString());
                    }
                }
            } while (true);
            mUserCredentialsString = jsonobject.toString();
            return;
        } else
        {
            mUserCredentialsString = null;
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("KAEvent: name: ").append(mName).append(" creationDate: ").append(mCreationDate).toString();
    }
}
