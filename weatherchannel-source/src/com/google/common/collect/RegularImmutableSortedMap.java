// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMap, RegularImmutableSortedSet, ImmutableList, ImmutableSet, 
//            ImmutableSortedSet, ImmutableCollection, ImmutableMapEntrySet, UnmodifiableIterator, 
//            ImmutableMap, ImmutableAsList, Maps

final class RegularImmutableSortedMap extends ImmutableSortedMap
{
    private class EntrySet extends ImmutableMapEntrySet
    {

        final RegularImmutableSortedMap this$0;

        ImmutableList createAsList()
        {
            return new ImmutableAsList() {

                private final ImmutableList keyList;
                final EntrySet this$1;

                ImmutableCollection delegateCollection()
                {
                    return EntrySet.this;
                }

                public volatile Object get(int i)
                {
                    return get(i);
                }

                public java.util.Map.Entry get(int i)
                {
                    return Maps.immutableEntry(keyList.get(i), valueList.get(i));
                }

            
            {
                this$1 = EntrySet.this;
                super();
                keyList = keySet().asList();
            }
            };
        }

        public UnmodifiableIterator iterator()
        {
            return asList().iterator();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        ImmutableMap map()
        {
            return RegularImmutableSortedMap.this;
        }

        private EntrySet()
        {
            this$0 = RegularImmutableSortedMap.this;
            super();
        }

    }


    private final transient RegularImmutableSortedSet keySet;
    private final transient ImmutableList valueList;

    RegularImmutableSortedMap(RegularImmutableSortedSet regularimmutablesortedset, ImmutableList immutablelist)
    {
        keySet = regularimmutablesortedset;
        valueList = immutablelist;
    }

    RegularImmutableSortedMap(RegularImmutableSortedSet regularimmutablesortedset, ImmutableList immutablelist, ImmutableSortedMap immutablesortedmap)
    {
        super(immutablesortedmap);
        keySet = regularimmutablesortedset;
        valueList = immutablelist;
    }

    private ImmutableSortedMap getSubMap(int i, int j)
    {
        if (i == 0 && j == size())
        {
            return this;
        }
        if (i == j)
        {
            return emptyMap(comparator());
        } else
        {
            return from(keySet.getSubSet(i, j), valueList.subList(i, j));
        }
    }

    ImmutableSortedMap createDescendingMap()
    {
        return new RegularImmutableSortedMap((RegularImmutableSortedSet)keySet.descendingSet(), valueList.reverse(), this);
    }

    ImmutableSet createEntrySet()
    {
        return new EntrySet();
    }

    public Object get(Object obj)
    {
        int i = keySet.indexOf(obj);
        if (i == -1)
        {
            return null;
        } else
        {
            return valueList.get(i);
        }
    }

    public ImmutableSortedMap headMap(Object obj, boolean flag)
    {
        return getSubMap(0, keySet.headIndex(Preconditions.checkNotNull(obj), flag));
    }

    public volatile NavigableMap headMap(Object obj, boolean flag)
    {
        return headMap(obj, flag);
    }

    public volatile ImmutableSet keySet()
    {
        return keySet();
    }

    public ImmutableSortedSet keySet()
    {
        return keySet;
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public ImmutableSortedMap tailMap(Object obj, boolean flag)
    {
        return getSubMap(keySet.tailIndex(Preconditions.checkNotNull(obj), flag), size());
    }

    public volatile NavigableMap tailMap(Object obj, boolean flag)
    {
        return tailMap(obj, flag);
    }

    public ImmutableCollection values()
    {
        return valueList;
    }

    public volatile Collection values()
    {
        return values();
    }

}
