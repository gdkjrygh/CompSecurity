// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, Iterables, Iterators

private static final class <init> extends FluentIterable
{

    private final Iterable iterable;

    public Iterator iterator()
    {
        return Iterators.unmodifiableIterator(iterable.iterator());
    }

    public String toString()
    {
        return iterable.toString();
    }

    private (Iterable iterable1)
    {
        iterable = iterable1;
    }

    iterable(Iterable iterable1, iterable iterable2)
    {
        this(iterable1);
    }
}
