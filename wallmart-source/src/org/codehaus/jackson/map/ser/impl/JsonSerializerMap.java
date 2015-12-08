// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.ser.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.codehaus.jackson.map.JsonSerializer;

public class JsonSerializerMap
{

    private final Bucket _buckets[];
    private final int _size;

    public JsonSerializerMap(Map map)
    {
        int i = findSize(map.size());
        _size = i;
    /* block-local class not found */
    class Bucket {}

        Bucket abucket[] = new Bucket[i];
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            SerializerCache.TypeKey typekey = (SerializerCache.TypeKey)entry.getKey();
            int j = typekey.hashCode() & i - 1;
            abucket[j] = new Bucket(abucket[j], typekey, (JsonSerializer)entry.getValue());
        }

        _buckets = abucket;
    }

    private static final int findSize(int i)
    {
        int j;
        if (i <= 64)
        {
            i += i;
        } else
        {
            i += i >> 2;
        }
        for (j = 8; j < i; j += j) { }
        return j;
    }

    public JsonSerializer find(SerializerCache.TypeKey typekey)
    {
        Bucket bucket1;
        int i = typekey.hashCode();
        int j = _buckets.length;
        bucket1 = _buckets[i & j - 1];
        if (bucket1 != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Bucket bucket = bucket1;
        if (typekey.equals(bucket1.key))
        {
            return bucket1.value;
        }
        do
        {
            Bucket bucket2 = bucket.next;
            if (bucket2 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            bucket = bucket2;
            if (typekey.equals(bucket2.key))
            {
                return bucket2.value;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public int size()
    {
        return _size;
    }
}
