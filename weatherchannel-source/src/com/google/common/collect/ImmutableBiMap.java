// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, BiMap, RegularImmutableBiMap, EmptyImmutableBiMap, 
//            SingletonImmutableBiMap, ImmutableCollection, ImmutableSet

public abstract class ImmutableBiMap extends ImmutableMap
    implements BiMap
{
    public static final class Builder extends ImmutableMap.Builder
    {

        public ImmutableBiMap build()
        {
            switch (size)
            {
            default:
                return new RegularImmutableBiMap(size, entries);

            case 0: // '\0'
                return ImmutableBiMap.of();

            case 1: // '\001'
                return ImmutableBiMap.of(entries[0].getKey(), entries[0].getValue());
            }
        }

        public volatile ImmutableMap build()
        {
            return build();
        }

        public Builder put(Object obj, Object obj1)
        {
            super.put(obj, obj1);
            return this;
        }

        public volatile ImmutableMap.Builder put(Object obj, Object obj1)
        {
            return put(obj, obj1);
        }

        public Builder putAll(Map map)
        {
            super.putAll(map);
            return this;
        }

        public volatile ImmutableMap.Builder putAll(Map map)
        {
            return putAll(map);
        }

        public Builder()
        {
        }
    }

    private static class SerializedForm extends ImmutableMap.SerializedForm
    {

        private static final long serialVersionUID = 0L;

        Object readResolve()
        {
            return createMap(new Builder());
        }

        SerializedForm(ImmutableBiMap immutablebimap)
        {
            super(immutablebimap);
        }
    }


    private static final java.util.Map.Entry EMPTY_ENTRY_ARRAY[] = new java.util.Map.Entry[0];

    ImmutableBiMap()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableBiMap copyOf(Map map)
    {
        if (map instanceof ImmutableBiMap)
        {
            ImmutableBiMap immutablebimap = (ImmutableBiMap)map;
            if (!immutablebimap.isPartialView())
            {
                return immutablebimap;
            }
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(EMPTY_ENTRY_ARRAY);
        switch (map.length)
        {
        default:
            return new RegularImmutableBiMap(map);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return of(map.getKey(), map.getValue());
    }

    public static ImmutableBiMap of()
    {
        return EmptyImmutableBiMap.INSTANCE;
    }

    public static ImmutableBiMap of(Object obj, Object obj1)
    {
        return new SingletonImmutableBiMap(obj, obj1);
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new RegularImmutableBiMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3)
        });
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return new RegularImmutableBiMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5)
        });
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return new RegularImmutableBiMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7)
        });
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return new RegularImmutableBiMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7), entryOf(obj8, obj9)
        });
    }

    public Object forcePut(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public volatile BiMap inverse()
    {
        return inverse();
    }

    public abstract ImmutableBiMap inverse();

    public volatile ImmutableCollection values()
    {
        return values();
    }

    public ImmutableSet values()
    {
        return inverse().keySet();
    }

    public volatile Collection values()
    {
        return values();
    }

    public volatile Set values()
    {
        return values();
    }

    Object writeReplace()
    {
        return new SerializedForm(this);
    }

}
