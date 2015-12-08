// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;

// Referenced classes of package com.google.common.collect:
//            SortedMultisets, BoundType, SortedMultiset

static class  extends 
    implements NavigableSet
{

    public Object ceiling(Object obj)
    {
        return SortedMultisets.access$100(multiset().tailMultiset(obj, BoundType.CLOSED).firstEntry());
    }

    public Iterator descendingIterator()
    {
        return descendingSet().iterator();
    }

    public NavigableSet descendingSet()
    {
        return new <init>(multiset().descendingMultiset());
    }

    public Object floor(Object obj)
    {
        return SortedMultisets.access$100(multiset().headMultiset(obj, BoundType.CLOSED).lastEntry());
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return new <init>(multiset().headMultiset(obj, BoundType.forBoolean(flag)));
    }

    public Object higher(Object obj)
    {
        return SortedMultisets.access$100(multiset().tailMultiset(obj, BoundType.OPEN).firstEntry());
    }

    public Object lower(Object obj)
    {
        return SortedMultisets.access$100(multiset().headMultiset(obj, BoundType.OPEN).lastEntry());
    }

    public Object pollFirst()
    {
        return SortedMultisets.access$100(multiset().pollFirstEntry());
    }

    public Object pollLast()
    {
        return SortedMultisets.access$100(multiset().pollLastEntry());
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return new <init>(multiset().subMultiset(obj, BoundType.forBoolean(flag), obj1, BoundType.forBoolean(flag1)));
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return new <init>(multiset().tailMultiset(obj, BoundType.forBoolean(flag)));
    }

    (SortedMultiset sortedmultiset)
    {
        super(sortedmultiset);
    }
}
