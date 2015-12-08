// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, Iterators, PeekingIterator

private static class queue extends UnmodifiableIterator
{

    final Queue queue;

    public boolean hasNext()
    {
        return !queue.isEmpty();
    }

    public Object next()
    {
        PeekingIterator peekingiterator = (PeekingIterator)queue.remove();
        Object obj = peekingiterator.next();
        if (peekingiterator.hasNext())
        {
            queue.add(peekingiterator);
        }
        return obj;
    }

    public _cls1.val.itemComparator(Iterable iterable, final Comparator itemComparator)
    {
        queue = new PriorityQueue(2, new Comparator() {

            final Iterators.MergingIterator this$0;
            final Comparator val$itemComparator;

            public int compare(PeekingIterator peekingiterator, PeekingIterator peekingiterator1)
            {
                return itemComparator.compare(peekingiterator.peek(), peekingiterator1.peek());
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((PeekingIterator)obj, (PeekingIterator)obj1);
            }

            
            {
                this$0 = Iterators.MergingIterator.this;
                itemComparator = comparator;
                super();
            }
        });
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            itemComparator = (Iterator)iterable.next();
            if (itemComparator.hasNext())
            {
                queue.add(Iterators.peekingIterator(itemComparator));
            }
        } while (true);
    }
}
