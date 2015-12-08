// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Sets

private static class  extends 
    implements SortedSet
{

    public Comparator comparator()
    {
        return ((SortedSet)unfiltered).comparator();
    }

    public Object first()
    {
        return iterator().next();
    }

    public SortedSet headSet(Object obj)
    {
        return new <init>(((SortedSet)unfiltered).headSet(obj), predicate);
    }

    public Object last()
    {
        SortedSet sortedset = (SortedSet)unfiltered;
        do
        {
            Object obj = sortedset.last();
            if (predicate.apply(obj))
            {
                return obj;
            }
            sortedset = sortedset.headSet(obj);
        } while (true);
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return new <init>(((SortedSet)unfiltered).subSet(obj, obj1), predicate);
    }

    public SortedSet tailSet(Object obj)
    {
        return new <init>(((SortedSet)unfiltered).tailSet(obj), predicate);
    }

    (SortedSet sortedset, Predicate predicate)
    {
        super(sortedset, predicate);
    }
}
