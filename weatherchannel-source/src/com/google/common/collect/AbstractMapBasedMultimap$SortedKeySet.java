// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap

private class  extends 
    implements SortedSet
{

    final AbstractMapBasedMultimap this$0;

    public Comparator comparator()
    {
        return sortedMap().comparator();
    }

    public Object first()
    {
        return sortedMap().firstKey();
    }

    public SortedSet headSet(Object obj)
    {
        return new <init>(sortedMap().headMap(obj));
    }

    public Object last()
    {
        return sortedMap().lastKey();
    }

    SortedMap sortedMap()
    {
        return (SortedMap)super.sortedMap();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return new <init>(sortedMap().subMap(obj, obj1));
    }

    public SortedSet tailSet(Object obj)
    {
        return new <init>(sortedMap().tailMap(obj));
    }

    (SortedMap sortedmap)
    {
        this$0 = AbstractMapBasedMultimap.this;
        super(AbstractMapBasedMultimap.this, sortedmap);
    }
}
