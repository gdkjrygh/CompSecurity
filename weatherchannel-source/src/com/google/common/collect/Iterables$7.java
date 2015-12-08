// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, Iterables, Iterators

static final class le extends FluentIterable
{

    final Class val$type;
    final Iterable val$unfiltered;

    public Iterator iterator()
    {
        return Iterators.filter(val$unfiltered.iterator(), val$type);
    }

    le(Iterable iterable, Class class1)
    {
        val$unfiltered = iterable;
        val$type = class1;
        super();
    }
}
