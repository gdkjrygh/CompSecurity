// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractNavigableMap, Maps, Collections2

private static final class function extends AbstractNavigableMap
{

    private final Function function;
    private final NavigableSet set;

    public void clear()
    {
        set.clear();
    }

    public Comparator comparator()
    {
        return set.comparator();
    }

    Iterator descendingEntryIterator()
    {
        return descendingMap().entrySet().iterator();
    }

    public NavigableMap descendingMap()
    {
        return Maps.asMap(set.descendingSet(), function);
    }

    Iterator entryIterator()
    {
        return Maps.asMapEntryIterator(set, function);
    }

    public Object get(Object obj)
    {
        if (Collections2.safeContains(set, obj))
        {
            return function.apply(obj);
        } else
        {
            return null;
        }
    }

    public NavigableMap headMap(Object obj, boolean flag)
    {
        return Maps.asMap(set.headSet(obj, flag), function);
    }

    public NavigableSet navigableKeySet()
    {
        return Maps.access$400(set);
    }

    public int size()
    {
        return set.size();
    }

    public NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return Maps.asMap(set.subSet(obj, flag, obj1, flag1), function);
    }

    public NavigableMap tailMap(Object obj, boolean flag)
    {
        return Maps.asMap(set.tailSet(obj, flag), function);
    }

    (NavigableSet navigableset, Function function1)
    {
        set = (NavigableSet)Preconditions.checkNotNull(navigableset);
        function = (Function)Preconditions.checkNotNull(function1);
    }
}
