// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, CollectPreconditions, Maps, ImmutableSet, 
//            BiMap

final class SingletonImmutableBiMap extends ImmutableBiMap
{

    transient ImmutableBiMap inverse;
    final transient Object singleKey;
    final transient Object singleValue;

    SingletonImmutableBiMap(Object obj, Object obj1)
    {
        CollectPreconditions.checkEntryNotNull(obj, obj1);
        singleKey = obj;
        singleValue = obj1;
    }

    private SingletonImmutableBiMap(Object obj, Object obj1, ImmutableBiMap immutablebimap)
    {
        singleKey = obj;
        singleValue = obj1;
        inverse = immutablebimap;
    }

    SingletonImmutableBiMap(java.util.Map.Entry entry)
    {
        this(entry.getKey(), entry.getValue());
    }

    public boolean containsKey(Object obj)
    {
        return singleKey.equals(obj);
    }

    public boolean containsValue(Object obj)
    {
        return singleValue.equals(obj);
    }

    ImmutableSet createEntrySet()
    {
        return ImmutableSet.of(Maps.immutableEntry(singleKey, singleValue));
    }

    ImmutableSet createKeySet()
    {
        return ImmutableSet.of(singleKey);
    }

    public Object get(Object obj)
    {
        if (singleKey.equals(obj))
        {
            return singleValue;
        } else
        {
            return null;
        }
    }

    public volatile BiMap inverse()
    {
        return inverse();
    }

    public ImmutableBiMap inverse()
    {
        ImmutableBiMap immutablebimap = inverse;
        Object obj = immutablebimap;
        if (immutablebimap == null)
        {
            obj = new SingletonImmutableBiMap(singleValue, singleKey, this);
            inverse = ((ImmutableBiMap) (obj));
        }
        return ((ImmutableBiMap) (obj));
    }

    boolean isPartialView()
    {
        return false;
    }

    public int size()
    {
        return 1;
    }
}
