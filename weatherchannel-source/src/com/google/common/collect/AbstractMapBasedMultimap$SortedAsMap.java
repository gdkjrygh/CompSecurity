// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap

private class  extends 
    implements SortedMap
{

    SortedSet sortedKeySet;
    final AbstractMapBasedMultimap this$0;

    public Comparator comparator()
    {
        return sortedMap().comparator();
    }

    volatile Set createKeySet()
    {
        return createKeySet();
    }

    SortedSet createKeySet()
    {
        return new (AbstractMapBasedMultimap.this, sortedMap());
    }

    public Object firstKey()
    {
        return sortedMap().firstKey();
    }

    public SortedMap headMap(Object obj)
    {
        return new <init>(sortedMap().headMap(obj));
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public SortedSet keySet()
    {
        SortedSet sortedset1 = sortedKeySet;
        SortedSet sortedset = sortedset1;
        if (sortedset1 == null)
        {
            sortedset = createKeySet();
            sortedKeySet = sortedset;
        }
        return sortedset;
    }

    public Object lastKey()
    {
        return sortedMap().lastKey();
    }

    SortedMap sortedMap()
    {
        return (SortedMap)submap;
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return new <init>(sortedMap().subMap(obj, obj1));
    }

    public SortedMap tailMap(Object obj)
    {
        return new <init>(sortedMap().tailMap(obj));
    }

    (SortedMap sortedmap)
    {
        this$0 = AbstractMapBasedMultimap.this;
        super(AbstractMapBasedMultimap.this, sortedmap);
    }
}
