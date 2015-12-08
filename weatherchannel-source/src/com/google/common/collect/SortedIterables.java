// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Ordering, SortedIterable

final class SortedIterables
{

    private SortedIterables()
    {
    }

    public static Comparator comparator(SortedSet sortedset)
    {
        Comparator comparator1 = sortedset.comparator();
        sortedset = comparator1;
        if (comparator1 == null)
        {
            sortedset = Ordering.natural();
        }
        return sortedset;
    }

    public static boolean hasSameComparator(Comparator comparator1, Iterable iterable)
    {
        Preconditions.checkNotNull(comparator1);
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof SortedSet)
        {
            iterable = comparator((SortedSet)iterable);
        } else
        if (iterable instanceof SortedIterable)
        {
            iterable = ((SortedIterable)iterable).comparator();
        } else
        {
            return false;
        }
        return comparator1.equals(iterable);
    }
}
