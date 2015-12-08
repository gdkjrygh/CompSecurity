// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            TransformedIterator, Iterators

abstract class TransformedListIterator extends TransformedIterator
    implements ListIterator
{

    TransformedListIterator(ListIterator listiterator)
    {
        super(listiterator);
    }

    private ListIterator backingIterator()
    {
        return Iterators.cast(backingIterator);
    }

    public void add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious()
    {
        return backingIterator().hasPrevious();
    }

    public final int nextIndex()
    {
        return backingIterator().nextIndex();
    }

    public final Object previous()
    {
        return transform(backingIterator().previous());
    }

    public final int previousIndex()
    {
        return backingIterator().previousIndex();
    }

    public void set(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
