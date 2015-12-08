// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, Iterables, Iterators

static final class e extends FluentIterable
{

    final Comparator val$comparator;
    final Iterable val$iterables;

    public Iterator iterator()
    {
        return Iterators.mergeSorted(Iterables.transform(val$iterables, Iterables.access$300()), val$comparator);
    }

    e(Iterable iterable, Comparator comparator1)
    {
        val$iterables = iterable;
        val$comparator = comparator1;
        super();
    }
}
