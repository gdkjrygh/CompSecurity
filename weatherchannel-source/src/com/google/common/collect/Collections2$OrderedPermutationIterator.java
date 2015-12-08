// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, Collections2, Lists, ImmutableList

private static final class comparator extends AbstractIterator
{

    final Comparator comparator;
    List nextPermutation;

    void calculateNextPermutation()
    {
        int i = findNextJ();
        if (i == -1)
        {
            nextPermutation = null;
            return;
        } else
        {
            int j = findNextL(i);
            Collections.swap(nextPermutation, i, j);
            j = nextPermutation.size();
            Collections.reverse(nextPermutation.subList(i + 1, j));
            return;
        }
    }

    protected volatile Object computeNext()
    {
        return computeNext();
    }

    protected List computeNext()
    {
        if (nextPermutation == null)
        {
            return (List)endOfData();
        } else
        {
            ImmutableList immutablelist = ImmutableList.copyOf(nextPermutation);
            calculateNextPermutation();
            return immutablelist;
        }
    }

    int findNextJ()
    {
        for (int i = nextPermutation.size() - 2; i >= 0; i--)
        {
            if (comparator.compare(nextPermutation.get(i), nextPermutation.get(i + 1)) < 0)
            {
                return i;
            }
        }

        return -1;
    }

    int findNextL(int i)
    {
        Object obj = nextPermutation.get(i);
        for (int j = nextPermutation.size() - 1; j > i; j--)
        {
            if (comparator.compare(obj, nextPermutation.get(j)) < 0)
            {
                return j;
            }
        }

        throw new AssertionError("this statement should be unreachable");
    }

    (List list, Comparator comparator1)
    {
        nextPermutation = Lists.newArrayList(list);
        comparator = comparator1;
    }
}
