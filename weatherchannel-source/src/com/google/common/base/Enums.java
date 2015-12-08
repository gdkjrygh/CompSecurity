// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.google.common.base:
//            Preconditions, Platform, Optional, Converter

public final class Enums
{
    private static final class StringConverter extends Converter
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Class enumClass;

        protected volatile Object doBackward(Object obj)
        {
            return doBackward((Enum)obj);
        }

        protected String doBackward(Enum enum)
        {
            return enum.name();
        }

        protected Enum doForward(String s)
        {
            return Enum.valueOf(enumClass, s);
        }

        protected volatile Object doForward(Object obj)
        {
            return doForward((String)obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof StringConverter)
            {
                obj = (StringConverter)obj;
                return enumClass.equals(((StringConverter) (obj)).enumClass);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return enumClass.hashCode();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(enumClass.getName()));
            return (new StringBuilder(s.length() + 29)).append("Enums.stringConverter(").append(s).append(".class)").toString();
        }

        StringConverter(Class class1)
        {
            enumClass = (Class)Preconditions.checkNotNull(class1);
        }
    }


    private static final Map enumConstantCache = new WeakHashMap();

    private Enums()
    {
    }

    static Map getEnumConstants(Class class1)
    {
        Map map2 = enumConstantCache;
        map2;
        JVM INSTR monitorenter ;
        Map map1 = (Map)enumConstantCache.get(class1);
        Map map;
        map = map1;
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        map = populateCache(class1);
        map2;
        JVM INSTR monitorexit ;
        return map;
        class1;
        map2;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public static Field getField(Enum enum)
    {
        Class class1 = enum.getDeclaringClass();
        try
        {
            enum = class1.getDeclaredField(enum.name());
        }
        // Misplaced declaration of an exception variable
        catch (Enum enum)
        {
            throw new AssertionError(enum);
        }
        return enum;
    }

    public static Optional getIfPresent(Class class1, String s)
    {
        Preconditions.checkNotNull(class1);
        Preconditions.checkNotNull(s);
        return Platform.getEnumIfPresent(class1, s);
    }

    private static Map populateCache(Class class1)
    {
        HashMap hashmap = new HashMap();
        Enum enum;
        for (Iterator iterator = EnumSet.allOf(class1).iterator(); iterator.hasNext(); hashmap.put(enum.name(), new WeakReference(enum)))
        {
            enum = (Enum)iterator.next();
        }

        enumConstantCache.put(class1, hashmap);
        return hashmap;
    }

    public static Converter stringConverter(Class class1)
    {
        return new StringConverter(class1);
    }

}
