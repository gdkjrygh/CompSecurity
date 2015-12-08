// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.math.LongMath;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Collections2, Ordering, ImmutableList

private static final class inputList extends AbstractCollection
{

    final Comparator comparator;
    final ImmutableList inputList;
    final int size;

    private static int calculateSize(List list, Comparator comparator1)
    {
        int i;
        int j;
        long l2;
        l2 = 1L;
        j = 1;
        i = 1;
_L6:
        if (j >= list.size()) goto _L2; else goto _L1
_L1:
        int k;
        long l;
        l = l2;
        k = i;
        if (comparator1.compare(list.get(j - 1), list.get(j)) >= 0) goto _L4; else goto _L3
_L3:
        l2 *= LongMath.binomial(j, i);
        k = 0;
        l = l2;
        if (Collections2.access$000(l2)) goto _L4; else goto _L5
_L5:
        return 0x7fffffff;
_L4:
        j++;
        i = k + 1;
        l2 = l;
          goto _L6
_L2:
        long l1 = l2 * LongMath.binomial(j, i);
        if (Collections2.access$000(l1))
        {
            return (int)l1;
        }
          goto _L5
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof List)
        {
            obj = (List)obj;
            return Collections2.access$100(inputList, ((List) (obj)));
        } else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return new nit>(inputList, comparator);
    }

    public int size()
    {
        return size;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(inputList));
        return (new StringBuilder(s.length() + 30)).append("orderedPermutationCollection(").append(s).append(")").toString();
    }

    I(Iterable iterable, Comparator comparator1)
    {
        inputList = Ordering.from(comparator1).immutableSortedCopy(iterable);
        comparator = comparator1;
        size = calculateSize(inputList, comparator1);
    }
}
