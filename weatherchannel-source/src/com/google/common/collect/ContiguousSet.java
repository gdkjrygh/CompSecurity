// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, Ordering, Range, DiscreteDomain, 
//            Cut, EmptyContiguousSet, RegularContiguousSet, BoundType

public abstract class ContiguousSet extends ImmutableSortedSet
{

    final DiscreteDomain domain;

    ContiguousSet(DiscreteDomain discretedomain)
    {
        super(Ordering.natural());
        domain = discretedomain;
    }

    public static ImmutableSortedSet.Builder builder()
    {
        throw new UnsupportedOperationException();
    }

    public static ContiguousSet create(Range range1, DiscreteDomain discretedomain)
    {
        Range range3;
        Preconditions.checkNotNull(range1);
        Preconditions.checkNotNull(discretedomain);
        range3 = range1;
        Range range2 = range3;
        try
        {
            if (!range1.hasLowerBound())
            {
                range2 = range3.intersection(Range.atLeast(discretedomain.minValue()));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Range range1)
        {
            throw new IllegalArgumentException(range1);
        }
        range3 = range2;
        if (!range1.hasUpperBound())
        {
            range3 = range2.intersection(Range.atMost(discretedomain.maxValue()));
        }
        boolean flag;
        if (range3.isEmpty() || Range.compareOrThrow(range1.lowerBound.leastValueAbove(discretedomain), range1.upperBound.greatestValueBelow(discretedomain)) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return new EmptyContiguousSet(discretedomain);
        } else
        {
            return new RegularContiguousSet(range3, discretedomain);
        }
    }

    public ContiguousSet headSet(Comparable comparable)
    {
        return headSetImpl((Comparable)Preconditions.checkNotNull(comparable), false);
    }

    public ContiguousSet headSet(Comparable comparable, boolean flag)
    {
        return headSetImpl((Comparable)Preconditions.checkNotNull(comparable), flag);
    }

    public volatile ImmutableSortedSet headSet(Object obj)
    {
        return headSet((Comparable)obj);
    }

    public volatile ImmutableSortedSet headSet(Object obj, boolean flag)
    {
        return headSet((Comparable)obj, flag);
    }

    public volatile NavigableSet headSet(Object obj, boolean flag)
    {
        return headSet((Comparable)obj, flag);
    }

    public volatile SortedSet headSet(Object obj)
    {
        return headSet((Comparable)obj);
    }

    abstract ContiguousSet headSetImpl(Comparable comparable, boolean flag);

    volatile ImmutableSortedSet headSetImpl(Object obj, boolean flag)
    {
        return headSetImpl((Comparable)obj, flag);
    }

    public abstract ContiguousSet intersection(ContiguousSet contiguousset);

    public abstract Range range();

    public abstract Range range(BoundType boundtype, BoundType boundtype1);

    public ContiguousSet subSet(Comparable comparable, Comparable comparable1)
    {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable1);
        boolean flag;
        if (comparator().compare(comparable, comparable1) <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return subSetImpl(comparable, true, comparable1, false);
    }

    public ContiguousSet subSet(Comparable comparable, boolean flag, Comparable comparable1, boolean flag1)
    {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable1);
        boolean flag2;
        if (comparator().compare(comparable, comparable1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2);
        return subSetImpl(comparable, flag, comparable1, flag1);
    }

    public volatile ImmutableSortedSet subSet(Object obj, Object obj1)
    {
        return subSet((Comparable)obj, (Comparable)obj1);
    }

    public volatile ImmutableSortedSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return subSet((Comparable)obj, flag, (Comparable)obj1, flag1);
    }

    public volatile NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return subSet((Comparable)obj, flag, (Comparable)obj1, flag1);
    }

    public volatile SortedSet subSet(Object obj, Object obj1)
    {
        return subSet((Comparable)obj, (Comparable)obj1);
    }

    abstract ContiguousSet subSetImpl(Comparable comparable, boolean flag, Comparable comparable1, boolean flag1);

    volatile ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return subSetImpl((Comparable)obj, flag, (Comparable)obj1, flag1);
    }

    public ContiguousSet tailSet(Comparable comparable)
    {
        return tailSetImpl((Comparable)Preconditions.checkNotNull(comparable), true);
    }

    public ContiguousSet tailSet(Comparable comparable, boolean flag)
    {
        return tailSetImpl((Comparable)Preconditions.checkNotNull(comparable), flag);
    }

    public volatile ImmutableSortedSet tailSet(Object obj)
    {
        return tailSet((Comparable)obj);
    }

    public volatile ImmutableSortedSet tailSet(Object obj, boolean flag)
    {
        return tailSet((Comparable)obj, flag);
    }

    public volatile NavigableSet tailSet(Object obj, boolean flag)
    {
        return tailSet((Comparable)obj, flag);
    }

    public volatile SortedSet tailSet(Object obj)
    {
        return tailSet((Comparable)obj);
    }

    abstract ContiguousSet tailSetImpl(Comparable comparable, boolean flag);

    volatile ImmutableSortedSet tailSetImpl(Object obj, boolean flag)
    {
        return tailSetImpl((Comparable)obj, flag);
    }

    public String toString()
    {
        return range().toString();
    }
}
