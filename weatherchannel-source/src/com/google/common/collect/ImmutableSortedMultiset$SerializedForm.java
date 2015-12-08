// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMultiset, SortedMultiset

private static final class counts
    implements Serializable
{

    Comparator comparator;
    int counts[];
    Object elements[];

    Object readResolve()
    {
        int j = elements.length;
        counts counts1 = new elements(comparator);
        for (int i = 0; i < j; i++)
        {
            counts1.es(elements[i], counts[i]);
        }

        return counts1.counts();
    }

    (SortedMultiset sortedmultiset)
    {
        comparator = sortedmultiset.comparator();
        int i = sortedmultiset.entrySet().size();
        elements = (Object[])new Object[i];
        counts = new int[i];
        i = 0;
        for (sortedmultiset = sortedmultiset.entrySet().iterator(); sortedmultiset.hasNext();)
        {
              = (counts)sortedmultiset.next();
            elements[i] = .elements();
            counts[i] = .counts();
            i++;
        }

    }
}
