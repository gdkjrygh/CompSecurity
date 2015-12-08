// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, Iterables, Iterators

static final class e extends FluentIterable
{

    final Iterable val$iterable;

    public Iterator iterator()
    {
        return Iterators.consumingIterator(val$iterable.iterator());
    }

    public String toString()
    {
        return "Iterables.consumingIterable(...)";
    }

    e(Iterable iterable1)
    {
        val$iterable = iterable1;
        super();
    }
}
