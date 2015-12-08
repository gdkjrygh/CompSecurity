// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            Maps, Iterables, Lists

private static final class predicate extends predicate
{

    Predicate predicate;
    Map unfiltered;

    private boolean removeIf(Predicate predicate1)
    {
        return Iterables.removeIf(unfiltered.entrySet(), Predicates.and(predicate, Maps.valuePredicateOnEntries(predicate1)));
    }

    public boolean remove(Object obj)
    {
        return Iterables.removeFirstMatching(unfiltered.entrySet(), Predicates.and(predicate, Maps.valuePredicateOnEntries(Predicates.equalTo(obj)))) != null;
    }

    public boolean removeAll(Collection collection)
    {
        return removeIf(Predicates.in(collection));
    }

    public boolean retainAll(Collection collection)
    {
        return removeIf(Predicates.not(Predicates.in(collection)));
    }

    public Object[] toArray()
    {
        return Lists.newArrayList(iterator()).toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return Lists.newArrayList(iterator()).toArray(aobj);
    }

    (Map map, Map map1, Predicate predicate1)
    {
        super(map);
        unfiltered = map1;
        predicate = predicate1;
    }
}
