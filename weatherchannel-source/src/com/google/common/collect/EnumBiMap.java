// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractBiMap, WellBehavedMap, EnumHashBiMap, Serialization, 
//            BiMap

public final class EnumBiMap extends AbstractBiMap
{

    private static final long serialVersionUID = 0L;
    private transient Class keyType;
    private transient Class valueType;

    private EnumBiMap(Class class1, Class class2)
    {
        super(WellBehavedMap.wrap(new EnumMap(class1)), WellBehavedMap.wrap(new EnumMap(class2)));
        keyType = class1;
        valueType = class2;
    }

    public static EnumBiMap create(Class class1, Class class2)
    {
        return new EnumBiMap(class1, class2);
    }

    public static EnumBiMap create(Map map)
    {
        EnumBiMap enumbimap = create(inferKeyType(map), inferValueType(map));
        enumbimap.putAll(map);
        return enumbimap;
    }

    static Class inferKeyType(Map map)
    {
        if (map instanceof EnumBiMap)
        {
            return ((EnumBiMap)map).keyType();
        }
        if (map instanceof EnumHashBiMap)
        {
            return ((EnumHashBiMap)map).keyType();
        }
        boolean flag;
        if (!map.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return ((Enum)map.keySet().iterator().next()).getDeclaringClass();
    }

    private static Class inferValueType(Map map)
    {
        if (map instanceof EnumBiMap)
        {
            return ((EnumBiMap)map).valueType;
        }
        boolean flag;
        if (!map.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return ((Enum)map.values().iterator().next()).getDeclaringClass();
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        keyType = (Class)objectinputstream.readObject();
        valueType = (Class)objectinputstream.readObject();
        setDelegates(WellBehavedMap.wrap(new EnumMap(keyType)), WellBehavedMap.wrap(new EnumMap(valueType)));
        Serialization.populateMap(this, objectinputstream);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(keyType);
        objectoutputstream.writeObject(valueType);
        Serialization.writeMap(this, objectoutputstream);
    }

    Enum checkKey(Enum enum)
    {
        return (Enum)Preconditions.checkNotNull(enum);
    }

    volatile Object checkKey(Object obj)
    {
        return checkKey((Enum)obj);
    }

    Enum checkValue(Enum enum)
    {
        return (Enum)Preconditions.checkNotNull(enum);
    }

    volatile Object checkValue(Object obj)
    {
        return checkValue((Enum)obj);
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile boolean containsValue(Object obj)
    {
        return super.containsValue(obj);
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public volatile BiMap inverse()
    {
        return super.inverse();
    }

    public volatile Set keySet()
    {
        return super.keySet();
    }

    public Class keyType()
    {
        return keyType;
    }

    public volatile void putAll(Map map)
    {
        super.putAll(map);
    }

    public Class valueType()
    {
        return valueType;
    }

    public volatile Set values()
    {
        return super.values();
    }
}
