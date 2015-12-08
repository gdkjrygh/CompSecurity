// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Maps

private static class  extends 
    implements SortedMap
{

    volatile Set backingSet()
    {
        return backingSet();
    }

    SortedSet backingSet()
    {
        return (SortedSet)super.gSet();
    }

    public Comparator comparator()
    {
        return backingSet().comparator();
    }

    public Object firstKey()
    {
        return backingSet().first();
    }

    public SortedMap headMap(Object obj)
    {
        return Maps.asMap(backingSet().headSet(obj), function);
    }

    public Set keySet()
    {
        return Maps.access$300(backingSet());
    }

    public Object lastKey()
    {
        return backingSet().last();
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return Maps.asMap(backingSet().subSet(obj, obj1), function);
    }

    public SortedMap tailMap(Object obj)
    {
        return Maps.asMap(backingSet().tailSet(obj), function);
    }

    (SortedSet sortedset, Function function)
    {
        super(sortedset, function);
    }
}
