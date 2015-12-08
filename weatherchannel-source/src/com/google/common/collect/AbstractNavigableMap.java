// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            Maps, Iterators

abstract class AbstractNavigableMap extends AbstractMap
    implements NavigableMap
{
    private final class DescendingMap extends Maps.DescendingMap
    {

        final AbstractNavigableMap this$0;

        Iterator entryIterator()
        {
            return descendingEntryIterator();
        }

        NavigableMap forward()
        {
            return AbstractNavigableMap.this;
        }

        private DescendingMap()
        {
            this$0 = AbstractNavigableMap.this;
            super();
        }

    }


    AbstractNavigableMap()
    {
    }

    public java.util.Map.Entry ceilingEntry(Object obj)
    {
        return tailMap(obj, true).firstEntry();
    }

    public Object ceilingKey(Object obj)
    {
        return Maps.keyOrNull(ceilingEntry(obj));
    }

    abstract Iterator descendingEntryIterator();

    public NavigableSet descendingKeySet()
    {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap descendingMap()
    {
        return new DescendingMap();
    }

    abstract Iterator entryIterator();

    public Set entrySet()
    {
        return new Maps.EntrySet() {

            final AbstractNavigableMap this$0;

            public Iterator iterator()
            {
                return entryIterator();
            }

            Map map()
            {
                return AbstractNavigableMap.this;
            }

            
            {
                this$0 = AbstractNavigableMap.this;
                super();
            }
        };
    }

    public java.util.Map.Entry firstEntry()
    {
        return (java.util.Map.Entry)Iterators.getNext(entryIterator(), null);
    }

    public Object firstKey()
    {
        java.util.Map.Entry entry = firstEntry();
        if (entry == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return entry.getKey();
        }
    }

    public java.util.Map.Entry floorEntry(Object obj)
    {
        return headMap(obj, true).lastEntry();
    }

    public Object floorKey(Object obj)
    {
        return Maps.keyOrNull(floorEntry(obj));
    }

    public abstract Object get(Object obj);

    public SortedMap headMap(Object obj)
    {
        return headMap(obj, false);
    }

    public java.util.Map.Entry higherEntry(Object obj)
    {
        return tailMap(obj, false).firstEntry();
    }

    public Object higherKey(Object obj)
    {
        return Maps.keyOrNull(higherEntry(obj));
    }

    public Set keySet()
    {
        return navigableKeySet();
    }

    public java.util.Map.Entry lastEntry()
    {
        return (java.util.Map.Entry)Iterators.getNext(descendingEntryIterator(), null);
    }

    public Object lastKey()
    {
        java.util.Map.Entry entry = lastEntry();
        if (entry == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return entry.getKey();
        }
    }

    public java.util.Map.Entry lowerEntry(Object obj)
    {
        return headMap(obj, false).lastEntry();
    }

    public Object lowerKey(Object obj)
    {
        return Maps.keyOrNull(lowerEntry(obj));
    }

    public NavigableSet navigableKeySet()
    {
        return new Maps.NavigableKeySet(this);
    }

    public java.util.Map.Entry pollFirstEntry()
    {
        return (java.util.Map.Entry)Iterators.pollNext(entryIterator());
    }

    public java.util.Map.Entry pollLastEntry()
    {
        return (java.util.Map.Entry)Iterators.pollNext(descendingEntryIterator());
    }

    public abstract int size();

    public SortedMap subMap(Object obj, Object obj1)
    {
        return subMap(obj, true, obj1, false);
    }

    public SortedMap tailMap(Object obj)
    {
        return tailMap(obj, true);
    }
}
