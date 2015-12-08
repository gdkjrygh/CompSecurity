// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class CollectionsUtil
{

    private CollectionsUtil()
    {
    }

    public static Map mergeMaps(Map map, Map map1, String s)
    {
        HashMap hashmap = new HashMap(map);
        Iterator iterator = map1.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            map1 = (String)map.get(entry.getKey());
            StringBuilder stringbuilder = new StringBuilder();
            if (map1 == null)
            {
                map1 = "";
            } else
            {
                map1 = (new StringBuilder()).append(map1).append(s).toString();
            }
            map1 = stringbuilder.append(map1).append((String)entry.getValue()).toString();
            hashmap.put(entry.getKey(), map1);
        }
        return hashmap;
    }
}
