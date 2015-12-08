// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMap, RegularImmutableMap, CollectPreconditions, ImmutableEnumMap, 
//            ImmutableSetMultimap, ImmutableBiMap, ImmutableCollection, ImmutableMapKeySet, 
//            Maps, ImmutableSet, ImmutableMapValues, ObjectArrays, 
//            ImmutableMapEntrySet, UnmodifiableIterator, AbstractMapEntry

public abstract class ImmutableMap
    implements Map, Serializable
{
    public static class Builder
    {

        ImmutableMapEntry.TerminalEntry entries[];
        int size;

        private void ensureCapacity(int i)
        {
            if (i > entries.length)
            {
                entries = (ImmutableMapEntry.TerminalEntry[])ObjectArrays.arraysCopyOf(entries, ImmutableCollection.Builder.expandedCapacity(entries.length, i));
            }
        }

        public ImmutableMap build()
        {
            switch (size)
            {
            default:
                return new RegularImmutableMap(size, entries);

            case 0: // '\0'
                return ImmutableMap.of();

            case 1: // '\001'
                return ImmutableMap.of(entries[0].getKey(), entries[0].getValue());
            }
        }

        public Builder put(Object obj, Object obj1)
        {
            ensureCapacity(size + 1);
            obj = ImmutableMap.entryOf(obj, obj1);
            obj1 = entries;
            int i = size;
            size = i + 1;
            obj1[i] = obj;
            return this;
        }

        public Builder put(java.util.Map.Entry entry)
        {
            return put(entry.getKey(), entry.getValue());
        }

        public Builder putAll(Map map)
        {
            ensureCapacity(size + map.size());
            for (map = map.entrySet().iterator(); map.hasNext(); put((java.util.Map.Entry)map.next())) { }
            return this;
        }

        public Builder()
        {
            this(4);
        }

        Builder(int i)
        {
            entries = new ImmutableMapEntry.TerminalEntry[i];
            size = 0;
        }
    }

    private static final class MapViewOfValuesAsSingletonSets extends ImmutableMap
    {

        private final ImmutableMap _flddelegate;

        public boolean containsKey(Object obj)
        {
            return _flddelegate.containsKey(obj);
        }

        ImmutableSet createEntrySet()
        {
            return new ImmutableMapEntrySet() {

                final MapViewOfValuesAsSingletonSets this$0;

                public UnmodifiableIterator iterator()
                {
                    return _flddelegate.entrySet().iterator(). new UnmodifiableIterator() {

                        final MapViewOfValuesAsSingletonSets._cls1 this$1;
                        final Iterator val$backingIterator;

                        public boolean hasNext()
                        {
                            return backingIterator.hasNext();
                        }

                        public volatile Object next()
                        {
                            return next();
                        }

                        public java.util.Map.Entry next()
                        {
                            return ((java.util.Map.Entry)backingIterator.next()). new AbstractMapEntry() {

                                final MapViewOfValuesAsSingletonSets._cls1._cls1 this$2;
                                final java.util.Map.Entry val$backingEntry;

                                public Object getKey()
                                {
                                    return backingEntry.getKey();
                                }

                                public ImmutableSet getValue()
                                {
                                    return ImmutableSet.of(backingEntry.getValue());
                                }

                                public volatile Object getValue()
                                {
                                    return getValue();
                                }

            
            {
                this$2 = final__pcls1;
                backingEntry = java.util.Map.Entry.this;
                super();
            }
                            };
                        }

            
            {
                this$1 = final__pcls1;
                backingIterator = Iterator.this;
                super();
            }
                    };
                }

                public volatile Iterator iterator()
                {
                    return iterator();
                }

                ImmutableMap map()
                {
                    return MapViewOfValuesAsSingletonSets.this;
                }

            
            {
                this$0 = MapViewOfValuesAsSingletonSets.this;
                super();
            }
            };
        }

        public volatile Set entrySet()
        {
            return entrySet();
        }

        public ImmutableSet get(Object obj)
        {
            obj = _flddelegate.get(obj);
            if (obj == null)
            {
                return null;
            } else
            {
                return ImmutableSet.of(obj);
            }
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        boolean isPartialView()
        {
            return false;
        }

        public volatile Set keySet()
        {
            return keySet();
        }

        public int size()
        {
            return _flddelegate.size();
        }

        public volatile Collection values()
        {
            return values();
        }


        MapViewOfValuesAsSingletonSets(ImmutableMap immutablemap)
        {
            _flddelegate = (ImmutableMap)Preconditions.checkNotNull(immutablemap);
        }
    }

    static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object keys[];
        private final Object values[];

        Object createMap(Builder builder1)
        {
            for (int i = 0; i < keys.length; i++)
            {
                builder1.put(keys[i], values[i]);
            }

            return builder1.build();
        }

        Object readResolve()
        {
            return createMap(new Builder());
        }

        SerializedForm(ImmutableMap immutablemap)
        {
            keys = new Object[immutablemap.size()];
            values = new Object[immutablemap.size()];
            int i = 0;
            for (immutablemap = immutablemap.entrySet().iterator(); immutablemap.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)immutablemap.next();
                keys[i] = entry.getKey();
                values[i] = entry.getValue();
                i++;
            }

        }
    }


    private static final java.util.Map.Entry EMPTY_ENTRY_ARRAY[] = new java.util.Map.Entry[0];
    private transient ImmutableSet entrySet;
    private transient ImmutableSet keySet;
    private transient ImmutableSetMultimap multimapView;
    private transient ImmutableCollection values;

    ImmutableMap()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    static void checkNoConflict(boolean flag, String s, java.util.Map.Entry entry, java.util.Map.Entry entry1)
    {
        if (!flag)
        {
            s = String.valueOf(String.valueOf(s));
            entry = String.valueOf(String.valueOf(entry));
            entry1 = String.valueOf(String.valueOf(entry1));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 34 + entry.length() + entry1.length())).append("Multiple entries with same ").append(s).append(": ").append(entry).append(" and ").append(entry1).toString());
        } else
        {
            return;
        }
    }

    public static ImmutableMap copyOf(Map map)
    {
        if ((map instanceof ImmutableMap) && !(map instanceof ImmutableSortedMap))
        {
            ImmutableMap immutablemap = (ImmutableMap)map;
            if (!immutablemap.isPartialView())
            {
                return immutablemap;
            }
        } else
        if (map instanceof EnumMap)
        {
            return copyOfEnumMapUnsafe(map);
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(EMPTY_ENTRY_ARRAY);
        switch (map.length)
        {
        default:
            return new RegularImmutableMap(map);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return of(map.getKey(), map.getValue());
    }

    private static ImmutableMap copyOfEnumMap(Map map)
    {
        map = new EnumMap(map);
        java.util.Map.Entry entry;
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); CollectPreconditions.checkEntryNotNull(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return ImmutableEnumMap.asImmutable(map);
    }

    private static ImmutableMap copyOfEnumMapUnsafe(Map map)
    {
        return copyOfEnumMap((EnumMap)map);
    }

    private ImmutableSetMultimap createMultimapView()
    {
        ImmutableMap immutablemap = viewMapValuesAsSingletonSets();
        return new ImmutableSetMultimap(immutablemap, immutablemap.size(), null);
    }

    static ImmutableMapEntry.TerminalEntry entryOf(Object obj, Object obj1)
    {
        CollectPreconditions.checkEntryNotNull(obj, obj1);
        return new ImmutableMapEntry.TerminalEntry(obj, obj1);
    }

    public static ImmutableMap of()
    {
        return ImmutableBiMap.of();
    }

    public static ImmutableMap of(Object obj, Object obj1)
    {
        return ImmutableBiMap.of(obj, obj1);
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3)
        });
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5)
        });
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7)
        });
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7), entryOf(obj8, obj9)
        });
    }

    private ImmutableMap viewMapValuesAsSingletonSets()
    {
        return new MapViewOfValuesAsSingletonSets(this);
    }

    public ImmutableSetMultimap asMultimap()
    {
        ImmutableSetMultimap immutablesetmultimap1 = multimapView;
        ImmutableSetMultimap immutablesetmultimap = immutablesetmultimap1;
        if (immutablesetmultimap1 == null)
        {
            immutablesetmultimap = createMultimapView();
            multimapView = immutablesetmultimap;
        }
        return immutablesetmultimap;
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    abstract ImmutableSet createEntrySet();

    ImmutableSet createKeySet()
    {
        return new ImmutableMapKeySet(this);
    }

    public ImmutableSet entrySet()
    {
        ImmutableSet immutableset1 = entrySet;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = createEntrySet();
            entrySet = immutableset;
        }
        return immutableset;
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        return Maps.equalsImpl(this, obj);
    }

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return entrySet().hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    abstract boolean isPartialView();

    public ImmutableSet keySet()
    {
        ImmutableSet immutableset1 = keySet;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = createKeySet();
            keySet = immutableset;
        }
        return immutableset;
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public final Object put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return Maps.toStringImpl(this);
    }

    public ImmutableCollection values()
    {
        ImmutableCollection immutablecollection = values;
        Object obj = immutablecollection;
        if (immutablecollection == null)
        {
            obj = new ImmutableMapValues(this);
            values = ((ImmutableCollection) (obj));
        }
        return ((ImmutableCollection) (obj));
    }

    public volatile Collection values()
    {
        return values();
    }

    Object writeReplace()
    {
        return new SerializedForm(this);
    }

}
