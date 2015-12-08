// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Collections2, Iterables, Iterators, Lists

static class predicate extends AbstractCollection
{

    final Predicate predicate;
    final Collection unfiltered;

    public boolean add(Object obj)
    {
        Preconditions.checkArgument(predicate.apply(obj));
        return unfiltered.add(obj);
    }

    public boolean addAll(Collection collection)
    {
        Object obj;
        for (Iterator iterator1 = collection.iterator(); iterator1.hasNext(); Preconditions.checkArgument(predicate.apply(obj)))
        {
            obj = iterator1.next();
        }

        return unfiltered.addAll(collection);
    }

    public void clear()
    {
        Iterables.removeIf(unfiltered, predicate);
    }

    public boolean contains(Object obj)
    {
        if (Collections2.safeContains(unfiltered, obj))
        {
            return predicate.apply(obj);
        } else
        {
            return false;
        }
    }

    public boolean containsAll(Collection collection)
    {
        return Collections2.containsAllImpl(this, collection);
    }

    predicate createCombined(Predicate predicate1)
    {
        return new <init>(unfiltered, Predicates.and(predicate, predicate1));
    }

    public boolean isEmpty()
    {
        return !Iterables.any(unfiltered, predicate);
    }

    public Iterator iterator()
    {
        return Iterators.filter(unfiltered.iterator(), predicate);
    }

    public boolean remove(Object obj)
    {
        return contains(obj) && unfiltered.remove(obj);
    }

    public boolean removeAll(Collection collection)
    {
        return Iterables.removeIf(unfiltered, Predicates.and(predicate, Predicates.in(collection)));
    }

    public boolean retainAll(Collection collection)
    {
        return Iterables.removeIf(unfiltered, Predicates.and(predicate, Predicates.not(Predicates.in(collection))));
    }

    public int size()
    {
        return Iterators.size(iterator());
    }

    public Object[] toArray()
    {
        return Lists.newArrayList(iterator()).toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return Lists.newArrayList(iterator()).toArray(aobj);
    }

    (Collection collection, Predicate predicate1)
    {
        unfiltered = collection;
        predicate = predicate1;
    }
}
