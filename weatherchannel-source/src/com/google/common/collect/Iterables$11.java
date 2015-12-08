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
    final int val$limitSize;

    public Iterator iterator()
    {
        return Iterators.limit(val$iterable.iterator(), val$limitSize);
    }

    e(Iterable iterable1, int i)
    {
        val$iterable = iterable1;
        val$limitSize = i;
        super();
    }
}
