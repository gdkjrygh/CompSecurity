// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Primitives
{

    private static final Map PRIMITIVE_TO_WRAPPER_TYPE;
    private static final Map WRAPPER_TO_PRIMITIVE_TYPE;

    private Primitives()
    {
    }

    private static void add(Map map, Map map1, Class class1, Class class2)
    {
        map.put(class1, class2);
        map1.put(class2, class1);
    }

    public static boolean isPrimitive(Type type)
    {
        return PRIMITIVE_TO_WRAPPER_TYPE.containsKey(type);
    }

    public static boolean isWrapperType(Type type)
    {
        return WRAPPER_TO_PRIMITIVE_TYPE.containsKey(.Gson.Preconditions.checkNotNull(type));
    }

    public static Class unwrap(Class class1)
    {
        Class class2 = (Class)WRAPPER_TO_PRIMITIVE_TYPE.get(.Gson.Preconditions.checkNotNull(class1));
        if (class2 == null)
        {
            return class1;
        } else
        {
            return class2;
        }
    }

    public static Class wrap(Class class1)
    {
        Class class2 = (Class)PRIMITIVE_TO_WRAPPER_TYPE.get(.Gson.Preconditions.checkNotNull(class1));
        if (class2 == null)
        {
            return class1;
        } else
        {
            return class2;
        }
    }

    static 
    {
        HashMap hashmap = new HashMap(16);
        HashMap hashmap1 = new HashMap(16);
        add(hashmap, hashmap1, Boolean.TYPE, java/lang/Boolean);
        add(hashmap, hashmap1, Byte.TYPE, java/lang/Byte);
        add(hashmap, hashmap1, Character.TYPE, java/lang/Character);
        add(hashmap, hashmap1, Double.TYPE, java/lang/Double);
        add(hashmap, hashmap1, Float.TYPE, java/lang/Float);
        add(hashmap, hashmap1, Integer.TYPE, java/lang/Integer);
        add(hashmap, hashmap1, Long.TYPE, java/lang/Long);
        add(hashmap, hashmap1, Short.TYPE, java/lang/Short);
        add(hashmap, hashmap1, Void.TYPE, java/lang/Void);
        PRIMITIVE_TO_WRAPPER_TYPE = Collections.unmodifiableMap(hashmap);
        WRAPPER_TO_PRIMITIVE_TYPE = Collections.unmodifiableMap(hashmap1);
    }
}
