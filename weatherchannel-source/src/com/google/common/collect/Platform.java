// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Maps, Sets, MapMaker

final class Platform
{

    private Platform()
    {
    }

    static SortedMap mapsAsMapSortedSet(SortedSet sortedset, Function function)
    {
        if (sortedset instanceof NavigableSet)
        {
            return Maps.asMap((NavigableSet)sortedset, function);
        } else
        {
            return Maps.asMapSortedIgnoreNavigable(sortedset, function);
        }
    }

    static SortedMap mapsFilterSortedMap(SortedMap sortedmap, Predicate predicate)
    {
        if (sortedmap instanceof NavigableMap)
        {
            return Maps.filterEntries((NavigableMap)sortedmap, predicate);
        } else
        {
            return Maps.filterSortedIgnoreNavigable(sortedmap, predicate);
        }
    }

    static SortedMap mapsTransformEntriesSortedMap(SortedMap sortedmap, Maps.EntryTransformer entrytransformer)
    {
        if (sortedmap instanceof NavigableMap)
        {
            return Maps.transformEntries((NavigableMap)sortedmap, entrytransformer);
        } else
        {
            return Maps.transformEntriesIgnoreNavigable(sortedmap, entrytransformer);
        }
    }

    static Object[] newArray(Object aobj[], int i)
    {
        return (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
    }

    static Set newSetFromMap(Map map)
    {
        return Collections.newSetFromMap(map);
    }

    static SortedSet setsFilterSortedSet(SortedSet sortedset, Predicate predicate)
    {
        if (sortedset instanceof NavigableSet)
        {
            return Sets.filter((NavigableSet)sortedset, predicate);
        } else
        {
            return Sets.filterSortedIgnoreNavigable(sortedset, predicate);
        }
    }

    static MapMaker tryWeakKeys(MapMaker mapmaker)
    {
        return mapmaker.weakKeys();
    }
}
