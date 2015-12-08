// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaUtils, Event

public class EventBucketManager
{

    private static final long MAX_EVENT_BUCKET_INTERVAL_SECONDS = 0xed4e00L;
    private static final long MIN_EVENT_BUCKET_INTERVAL_SECONDS = 30L;
    private static EventBucketManager instance = new EventBucketManager();
    private HashMap mBucketConfig;
    private Object mBucketConfigLock;
    private HashMap mBucketMappings;
    private Object mBucketMappingsLock;

    private EventBucketManager()
    {
        mBucketConfigLock = new Object();
        mBucketConfig = new HashMap();
        mBucketMappingsLock = new Object();
        mBucketMappings = new HashMap();
    }

    protected static void clearBucketMappings()
    {
        synchronized (instance.mBucketMappingsLock)
        {
            instance.mBucketMappings.clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String getBucketKeyForEventAndTime(String s, long l)
    {
        Object obj = null;
        HashMap hashmap = mBucketConfig;
        hashmap;
        JVM INSTR monitorenter ;
        String s1 = s.toLowerCase();
        if (!mBucketConfig.containsKey(s1)) goto _L2; else goto _L1
_L1:
        long l1 = ((Long)mBucketConfig.get(s1)).longValue();
        s = (new StringBuilder()).append(s1).append("_").append((int)(l / l1)).toString();
_L4:
        return s;
_L2:
        s = obj;
        if (!KahunaCommon.mDebugEnabled)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.w("Kahuna", (new StringBuilder()).append("Attempted to obtain a bucket mapping for event not in bucketConfig: ").append(s1).toString());
        s = obj;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected static Event getEventForBucketName(String s, long l)
    {
        Object obj;
        while (KahunaUtils.isNullOrEmpty(s) || (obj = instance.getBucketKeyForEventAndTime(s, l)) == null) 
        {
            return null;
        }
        s = ((String) (instance.mBucketMappingsLock));
        s;
        JVM INSTR monitorenter ;
        if (!instance.mBucketMappings.containsKey(obj))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj = (Event)instance.mBucketMappings.get(obj);
        return ((Event) (obj));
        Exception exception;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
        s;
        JVM INSTR monitorexit ;
        return null;
    }

    protected static boolean getHasBucketConfig(String s)
    {
        if (KahunaUtils.isNullOrEmpty(s))
        {
            return false;
        }
        boolean flag;
        synchronized (instance.mBucketConfigLock)
        {
            flag = instance.mBucketConfig.containsKey(s.toLowerCase());
        }
        return flag;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected static void insertEventBucketForEvent(Event event)
    {
        String s;
        while (event == null || KahunaUtils.isNullOrEmpty(event.getName()) || (s = instance.getBucketKeyForEventAndTime(event.getName(), event.getCreationTime())) == null) 
        {
            return;
        }
        Object obj = instance.mBucketMappingsLock;
        obj;
        JVM INSTR monitorenter ;
        if (instance.mBucketMappings.containsKey(s)) goto _L2; else goto _L1
_L1:
        instance.mBucketMappings.put(s, event);
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Inserted new bucket mapping '").append(s).append("'").toString());
        }
_L4:
        return;
        event;
        obj;
        JVM INSTR monitorexit ;
        throw event;
_L2:
        if (!KahunaCommon.mDebugEnabled) goto _L4; else goto _L3
_L3:
        Log.d("Kahuna", (new StringBuilder()).append("Attempted to insert bucket mapping that already exists '").append(s).append("', aborting.").toString());
          goto _L4
    }

    private Long normalizeBucketInterval(Long long1)
    {
        Long long2;
        if (long1.longValue() < 30L)
        {
            long2 = Long.valueOf(30L);
        } else
        {
            long2 = long1;
            if (long1.longValue() > 0xed4e00L)
            {
                return Long.valueOf(0xed4e00L);
            }
        }
        return long2;
    }

    protected static void rebuildBucketMappingsFromEvents(List list)
    {
        Object obj = instance.mBucketMappingsLock;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = instance.mBucketConfigLock;
        obj1;
        JVM INSTR monitorenter ;
        int j;
        instance.mBucketMappings.clear();
        j = list.size();
        int i = 0;
_L4:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        Event event = (Event)list.get(i);
        String s = event.getName().toLowerCase();
        if (event.getIsAggregating() && instance.mBucketConfig.containsKey(s))
        {
            long l = System.currentTimeMillis() / 1000L;
            long l1 = ((Long)instance.mBucketConfig.get(s)).longValue();
            if (l < event.getCreationTime() + l1)
            {
                String s1 = instance.getBucketKeyForEventAndTime(event.getName(), event.getCreationTime());
                if (!instance.mBucketMappings.containsKey(s1))
                {
                    instance.mBucketMappings.put(s1, event);
                    if (KahunaCommon.mDebugEnabled)
                    {
                        Log.d("Kahuna", (new StringBuilder()).append("Rebuilt new bucket mapping '").append(s1).append("'").toString());
                    }
                }
            }
        }
        break MISSING_BLOCK_LABEL_259;
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
        list;
        obj1;
        JVM INSTR monitorexit ;
        throw list;
        list;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw list;
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        if (!KahunaCommon.mDebugEnabled) goto _L2; else goto _L1
_L1:
        Log.w("Kahuna", (new StringBuilder()).append("Caught exception rebuilding event bucket mappings: ").append(list).toString());
        return;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static void updateBucketConfig(JSONObject jsonobject)
    {
        Object obj = instance.mBucketConfigLock;
        obj;
        JVM INSTR monitorenter ;
        instance.mBucketConfig.clear();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        String s;
        long l;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); instance.mBucketConfig.put(s.toLowerCase(), instance.normalizeBucketInterval(Long.valueOf(l))))
        {
            s = (String)iterator.next();
            l = (long)(Double.valueOf(jsonobject.optDouble(s, 0.5D)).doubleValue() * 60D);
        }

        break MISSING_BLOCK_LABEL_133;
        jsonobject;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw jsonobject;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.w("Kahuna", (new StringBuilder()).append("Caught exception loading bucket mappings from persistent store: ").append(jsonobject).toString());
        }
        return;
        obj;
        JVM INSTR monitorexit ;
    }

}
