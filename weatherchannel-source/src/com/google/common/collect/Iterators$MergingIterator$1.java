// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            Iterators, PeekingIterator

class val.itemComparator
    implements Comparator
{

    final compare this$0;
    final Comparator val$itemComparator;

    public int compare(PeekingIterator peekingiterator, PeekingIterator peekingiterator1)
    {
        return val$itemComparator.compare(peekingiterator.peek(), peekingiterator1.peek());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((PeekingIterator)obj, (PeekingIterator)obj1);
    }

    ()
    {
        this$0 = final_;
        val$itemComparator = Comparator.this;
        super();
    }
}
