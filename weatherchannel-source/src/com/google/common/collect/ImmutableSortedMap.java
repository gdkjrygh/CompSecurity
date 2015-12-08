// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMapFauxverideShim, Ordering, EmptyImmutableSortedMap, ImmutableSortedSet, 
//            RegularImmutableSortedMap, RegularImmutableSortedSet, ImmutableList, Maps, 
//            ImmutableCollection, ImmutableSet, ImmutableMap

public abstract class ImmutableSortedMap extends ImmutableSortedMapFauxverideShim
    implements NavigableMap
{
    public static class Builder extends ImmutableMap.Builder
    {

        private final Comparator comparator;

        public volatile ImmutableMap build()
        {
            return build();
        }

        public ImmutableSortedMap build()
        {
            return ImmutableSortedMap.fromEntries(comparator, false, size, entries);
        }

        public volatile ImmutableMap.Builder put(Object obj, Object obj1)
        {
            return put(obj, obj1);
        }

        public volatile ImmutableMap.Builder put(java.util.Map.Entry entry)
        {
            return put(entry);
        }

        public Builder put(Object obj, Object obj1)
        {
            super.put(obj, obj1);
            return this;
        }

        public Builder put(java.util.Map.Entry entry)
        {
            super.put(entry);
            return this;
        }

        public volatile ImmutableMap.Builder putAll(Map map)
        {
            return putAll(map);
        }

        public Builder putAll(Map map)
        {
            super.putAll(map);
            return this;
        }

        public Builder(Comparator comparator1)
        {
            comparator = (Comparator)Preconditions.checkNotNull(comparator1);
        }
    }

    private static class SerializedForm extends ImmutableMap.SerializedForm
    {

        private static final long serialVersionUID = 0L;
        private final Comparator comparator;

        Object readResolve()
        {
            return createMap(new Builder(comparator));
        }

        SerializedForm(ImmutableSortedMap immutablesortedmap)
        {
            super(immutablesortedmap);
            comparator = immutablesortedmap.comparator();
        }
    }


    private static final ImmutableSortedMap NATURAL_EMPTY_MAP;
    private static final Comparator NATURAL_ORDER;
    private static final long serialVersionUID = 0L;
    private transient ImmutableSortedMap descendingMap;

    ImmutableSortedMap()
    {
    }

    ImmutableSortedMap(ImmutableSortedMap immutablesortedmap)
    {
        descendingMap = immutablesortedmap;
    }

    public static ImmutableSortedMap copyOf(Map map)
    {
        return copyOfInternal(map, Ordering.natural());
    }

    public static ImmutableSortedMap copyOf(Map map, Comparator comparator1)
    {
        return copyOfInternal(map, (Comparator)Preconditions.checkNotNull(comparator1));
    }

    private static ImmutableSortedMap copyOfInternal(Map map, Comparator comparator1)
    {
        boolean flag = false;
        if (map instanceof SortedMap)
        {
            Object obj = ((SortedMap)map).comparator();
            if (obj == null)
            {
                if (comparator1 == NATURAL_ORDER)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = comparator1.equals(obj);
            }
        }
        if (flag && (map instanceof ImmutableSortedMap))
        {
            obj = (ImmutableSortedMap)map;
            if (!((ImmutableSortedMap) (obj)).isPartialView())
            {
                return ((ImmutableSortedMap) (obj));
            }
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(new java.util.Map.Entry[0]);
        return fromEntries(comparator1, flag, map.length, map);
    }

    public static ImmutableSortedMap copyOfSorted(SortedMap sortedmap)
    {
        Comparator comparator2 = sortedmap.comparator();
        Comparator comparator1 = comparator2;
        if (comparator2 == null)
        {
            comparator1 = NATURAL_ORDER;
        }
        return copyOfInternal(sortedmap, comparator1);
    }

    static ImmutableSortedMap emptyMap(Comparator comparator1)
    {
        if (Ordering.natural().equals(comparator1))
        {
            return of();
        } else
        {
            return new EmptyImmutableSortedMap(comparator1);
        }
    }

    static ImmutableSortedMap from(ImmutableSortedSet immutablesortedset, ImmutableList immutablelist)
    {
        if (immutablesortedset.isEmpty())
        {
            return emptyMap(immutablesortedset.comparator());
        } else
        {
            return new RegularImmutableSortedMap((RegularImmutableSortedSet)immutablesortedset, immutablelist);
        }
    }

    static transient ImmutableSortedMap fromEntries(Comparator comparator1, boolean flag, int i, java.util.Map.Entry aentry[])
    {
        for (int j = 0; j < i; j++)
        {
            java.util.Map.Entry entry = aentry[j];
            aentry[j] = entryOf(entry.getKey(), entry.getValue());
        }

        if (!flag)
        {
            sortEntries(comparator1, i, aentry);
            validateEntries(i, aentry, comparator1);
        }
        return fromSortedEntries(comparator1, i, aentry);
    }

    static ImmutableSortedMap fromSortedEntries(Comparator comparator1, int i, java.util.Map.Entry aentry[])
    {
        if (i == 0)
        {
            return emptyMap(comparator1);
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder1 = ImmutableList.builder();
        for (int j = 0; j < i; j++)
        {
            java.util.Map.Entry entry = aentry[j];
            builder.add(entry.getKey());
            builder1.add(entry.getValue());
        }

        return new RegularImmutableSortedMap(new RegularImmutableSortedSet(builder.build(), comparator1), builder1.build());
    }

    public static Builder naturalOrder()
    {
        return new Builder(Ordering.natural());
    }

    public static ImmutableSortedMap of()
    {
        return NATURAL_EMPTY_MAP;
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj)
    {
        return from(ImmutableSortedSet.of(comparable), ImmutableList.of(obj));
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable1, Object obj1)
    {
        return fromEntries(Ordering.natural(), false, 2, new java.util.Map.Entry[] {
            entryOf(comparable, obj), entryOf(comparable1, obj1)
        });
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable1, Object obj1, Comparable comparable2, Object obj2)
    {
        return fromEntries(Ordering.natural(), false, 3, new java.util.Map.Entry[] {
            entryOf(comparable, obj), entryOf(comparable1, obj1), entryOf(comparable2, obj2)
        });
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable1, Object obj1, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3)
    {
        return fromEntries(Ordering.natural(), false, 4, new java.util.Map.Entry[] {
            entryOf(comparable, obj), entryOf(comparable1, obj1), entryOf(comparable2, obj2), entryOf(comparable3, obj3)
        });
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable1, Object obj1, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, 
            Comparable comparable4, Object obj4)
    {
        return fromEntries(Ordering.natural(), false, 5, new java.util.Map.Entry[] {
            entryOf(comparable, obj), entryOf(comparable1, obj1), entryOf(comparable2, obj2), entryOf(comparable3, obj3), entryOf(comparable4, obj4)
        });
    }

    public static Builder orderedBy(Comparator comparator1)
    {
        return new Builder(comparator1);
    }

    public static Builder reverseOrder()
    {
        return new Builder(Ordering.natural().reverse());
    }

    private static void sortEntries(Comparator comparator1, int i, java.util.Map.Entry aentry[])
    {
        Arrays.sort(aentry, 0, i, Ordering.from(comparator1).onKeys());
    }

    private static void validateEntries(int i, java.util.Map.Entry aentry[], Comparator comparator1)
    {
        int j = 1;
        while (j < i) 
        {
            boolean flag;
            if (comparator1.compare(aentry[j - 1].getKey(), aentry[j].getKey()) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            checkNoConflict(flag, "key", aentry[j - 1], aentry[j]);
            j++;
        }
    }

    public java.util.Map.Entry ceilingEntry(Object obj)
    {
        return tailMap(obj, true).firstEntry();
    }

    public Object ceilingKey(Object obj)
    {
        return Maps.keyOrNull(ceilingEntry(obj));
    }

    public Comparator comparator()
    {
        return keySet().comparator();
    }

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    abstract ImmutableSortedMap createDescendingMap();

    public ImmutableSortedSet descendingKeySet()
    {
        return keySet().descendingSet();
    }

    public volatile NavigableSet descendingKeySet()
    {
        return descendingKeySet();
    }

    public ImmutableSortedMap descendingMap()
    {
        ImmutableSortedMap immutablesortedmap1 = descendingMap;
        ImmutableSortedMap immutablesortedmap = immutablesortedmap1;
        if (immutablesortedmap1 == null)
        {
            immutablesortedmap = createDescendingMap();
            descendingMap = immutablesortedmap;
        }
        return immutablesortedmap;
    }

    public volatile NavigableMap descendingMap()
    {
        return descendingMap();
    }

    public ImmutableSet entrySet()
    {
        return super.entrySet();
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public java.util.Map.Entry firstEntry()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return (java.util.Map.Entry)entrySet().asList().get(0);
        }
    }

    public Object firstKey()
    {
        return keySet().first();
    }

    public java.util.Map.Entry floorEntry(Object obj)
    {
        return headMap(obj, true).lastEntry();
    }

    public Object floorKey(Object obj)
    {
        return Maps.keyOrNull(floorEntry(obj));
    }

    public ImmutableSortedMap headMap(Object obj)
    {
        return headMap(obj, false);
    }

    public abstract ImmutableSortedMap headMap(Object obj, boolean flag);

    public volatile NavigableMap headMap(Object obj, boolean flag)
    {
        return headMap(obj, flag);
    }

    public volatile SortedMap headMap(Object obj)
    {
        return headMap(obj);
    }

    public java.util.Map.Entry higherEntry(Object obj)
    {
        return tailMap(obj, false).firstEntry();
    }

    public Object higherKey(Object obj)
    {
        return Maps.keyOrNull(higherEntry(obj));
    }

    boolean isPartialView()
    {
        return keySet().isPartialView() || values().isPartialView();
    }

    public volatile ImmutableSet keySet()
    {
        return keySet();
    }

    public abstract ImmutableSortedSet keySet();

    public volatile Set keySet()
    {
        return keySet();
    }

    public java.util.Map.Entry lastEntry()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return (java.util.Map.Entry)entrySet().asList().get(size() - 1);
        }
    }

    public Object lastKey()
    {
        return keySet().last();
    }

    public java.util.Map.Entry lowerEntry(Object obj)
    {
        return headMap(obj, false).lastEntry();
    }

    public Object lowerKey(Object obj)
    {
        return Maps.keyOrNull(lowerEntry(obj));
    }

    public ImmutableSortedSet navigableKeySet()
    {
        return keySet();
    }

    public volatile NavigableSet navigableKeySet()
    {
        return navigableKeySet();
    }

    public final java.util.Map.Entry pollFirstEntry()
    {
        throw new UnsupportedOperationException();
    }

    public final java.util.Map.Entry pollLastEntry()
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return values().size();
    }

    public ImmutableSortedMap subMap(Object obj, Object obj1)
    {
        return subMap(obj, true, obj1, false);
    }

    public ImmutableSortedMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        boolean flag2;
        if (comparator().compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2, "expected fromKey <= toKey but %s > %s", new Object[] {
            obj, obj1
        });
        return headMap(obj1, flag1).tailMap(obj, flag);
    }

    public volatile NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return subMap(obj, flag, obj1, flag1);
    }

    public volatile SortedMap subMap(Object obj, Object obj1)
    {
        return subMap(obj, obj1);
    }

    public ImmutableSortedMap tailMap(Object obj)
    {
        return tailMap(obj, true);
    }

    public abstract ImmutableSortedMap tailMap(Object obj, boolean flag);

    public volatile NavigableMap tailMap(Object obj, boolean flag)
    {
        return tailMap(obj, flag);
    }

    public volatile SortedMap tailMap(Object obj)
    {
        return tailMap(obj);
    }

    public abstract ImmutableCollection values();

    public volatile Collection values()
    {
        return values();
    }

    Object writeReplace()
    {
        return new SerializedForm(this);
    }

    static 
    {
        NATURAL_ORDER = Ordering.natural();
        NATURAL_EMPTY_MAP = new EmptyImmutableSortedMap(NATURAL_ORDER);
    }
}
