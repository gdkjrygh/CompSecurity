// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, PeekingIterator, TreeTraverser, Iterables

private final class queue extends UnmodifiableIterator
    implements PeekingIterator
{

    private final Queue queue = new ArrayDeque();
    final TreeTraverser this$0;

    public boolean hasNext()
    {
        return !queue.isEmpty();
    }

    public Object next()
    {
        Object obj = queue.remove();
        Iterables.addAll(queue, children(obj));
        return obj;
    }

    public Object peek()
    {
        return queue.element();
    }

    (Object obj)
    {
        this$0 = TreeTraverser.this;
        super();
        queue.add(obj);
    }
}
