// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.common.base:
//            Preconditions

public final class Defaults
{

    private static final Map DEFAULTS;

    private Defaults()
    {
    }

    public static Object defaultValue(Class class1)
    {
        return DEFAULTS.get(Preconditions.checkNotNull(class1));
    }

    private static void put(Map map, Class class1, Object obj)
    {
        map.put(class1, obj);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        put(hashmap, Boolean.TYPE, Boolean.valueOf(false));
        put(hashmap, Character.TYPE, Character.valueOf('\0'));
        put(hashmap, Byte.TYPE, Byte.valueOf((byte)0));
        put(hashmap, Short.TYPE, Short.valueOf((short)0));
        put(hashmap, Integer.TYPE, Integer.valueOf(0));
        put(hashmap, Long.TYPE, Long.valueOf(0L));
        put(hashmap, Float.TYPE, Float.valueOf(0.0F));
        put(hashmap, Double.TYPE, Double.valueOf(0.0D));
        DEFAULTS = Collections.unmodifiableMap(hashmap);
    }
}
