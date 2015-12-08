// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, Iterables, Iterators

static final class le extends FluentIterable
{

    final Iterable val$inputs;

    public Iterator iterator()
    {
        return Iterators.concat(Iterables.access$100(val$inputs));
    }

    le(Iterable iterable)
    {
        val$inputs = iterable;
        super();
    }
}
