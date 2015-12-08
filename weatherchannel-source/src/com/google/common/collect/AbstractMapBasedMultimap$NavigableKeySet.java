// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, Iterators

class it> extends it>
    implements NavigableSet
{

    final AbstractMapBasedMultimap this$0;

    public Object ceiling(Object obj)
    {
        return sortedMap().ceilingKey(obj);
    }

    public Iterator descendingIterator()
    {
        return descendingSet().iterator();
    }

    public NavigableSet descendingSet()
    {
        return new <init>(sortedMap().descendingMap());
    }

    public Object floor(Object obj)
    {
        return sortedMap().floorKey(obj);
    }

    public NavigableSet headSet(Object obj)
    {
        return headSet(obj, false);
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return new <init>(sortedMap().headMap(obj, flag));
    }

    public volatile SortedSet headSet(Object obj)
    {
        return headSet(obj);
    }

    public Object higher(Object obj)
    {
        return sortedMap().higherKey(obj);
    }

    public Object lower(Object obj)
    {
        return sortedMap().lowerKey(obj);
    }

    public Object pollFirst()
    {
        return Iterators.pollNext(iterator());
    }

    public Object pollLast()
    {
        return Iterators.pollNext(descendingIterator());
    }

    NavigableMap sortedMap()
    {
        return (NavigableMap)super.tedMap();
    }

    volatile SortedMap sortedMap()
    {
        return sortedMap();
    }

    public NavigableSet subSet(Object obj, Object obj1)
    {
        return subSet(obj, true, obj1, false);
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return new <init>(sortedMap().subMap(obj, flag, obj1, flag1));
    }

    public volatile SortedSet subSet(Object obj, Object obj1)
    {
        return subSet(obj, obj1);
    }

    public NavigableSet tailSet(Object obj)
    {
        return tailSet(obj, true);
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return new <init>(sortedMap().tailMap(obj, flag));
    }

    public volatile SortedSet tailSet(Object obj)
    {
        return tailSet(obj);
    }

    (NavigableMap navigablemap)
    {
        this$0 = AbstractMapBasedMultimap.this;
        super(AbstractMapBasedMultimap.this, navigablemap);
    }
}
