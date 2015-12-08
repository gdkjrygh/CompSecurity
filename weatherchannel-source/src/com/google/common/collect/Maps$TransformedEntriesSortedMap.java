// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            Maps

static class  extends 
    implements SortedMap
{

    public Comparator comparator()
    {
        return fromMap().comparator();
    }

    public Object firstKey()
    {
        return fromMap().firstKey();
    }

    protected SortedMap fromMap()
    {
        return (SortedMap)fromMap;
    }

    public SortedMap headMap(Object obj)
    {
        return Maps.transformEntries(fromMap().headMap(obj), transformer);
    }

    public Object lastKey()
    {
        return fromMap().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return Maps.transformEntries(fromMap().subMap(obj, obj1), transformer);
    }

    public SortedMap tailMap(Object obj)
    {
        return Maps.transformEntries(fromMap().tailMap(obj), transformer);
    }

    (SortedMap sortedmap,  )
    {
        super(sortedmap, );
    }
}
