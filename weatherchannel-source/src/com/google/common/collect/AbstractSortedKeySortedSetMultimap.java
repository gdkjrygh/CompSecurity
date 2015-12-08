// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractSortedSetMultimap

abstract class AbstractSortedKeySortedSetMultimap extends AbstractSortedSetMultimap
{

    AbstractSortedKeySortedSetMultimap(SortedMap sortedmap)
    {
        super(sortedmap);
    }

    public volatile Map asMap()
    {
        return asMap();
    }

    public SortedMap asMap()
    {
        return (SortedMap)super.asMap();
    }

    volatile Map backingMap()
    {
        return backingMap();
    }

    SortedMap backingMap()
    {
        return (SortedMap)super.backingMap();
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public SortedSet keySet()
    {
        return (SortedSet)super.keySet();
    }
}
