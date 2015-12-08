// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Maps

static class  extends 
    implements SortedSet
{

    public Comparator comparator()
    {
        return map().comparator();
    }

    public Object first()
    {
        return map().firstKey();
    }

    public SortedSet headSet(Object obj)
    {
        return new <init>(map().headMap(obj));
    }

    public Object last()
    {
        return map().lastKey();
    }

    volatile Map map()
    {
        return map();
    }

    SortedMap map()
    {
        return (SortedMap)super.map();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return new <init>(map().subMap(obj, obj1));
    }

    public SortedSet tailSet(Object obj)
    {
        return new <init>(map().tailMap(obj));
    }

    (SortedMap sortedmap)
    {
        super(sortedmap);
    }
}
