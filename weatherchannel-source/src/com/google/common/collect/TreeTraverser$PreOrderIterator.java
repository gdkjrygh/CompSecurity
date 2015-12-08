// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, TreeTraverser, Iterators

private final class stack extends UnmodifiableIterator
{

    private final Deque stack = new ArrayDeque();
    final TreeTraverser this$0;

    public boolean hasNext()
    {
        return !stack.isEmpty();
    }

    public Object next()
    {
        Iterator iterator = (Iterator)stack.getLast();
        Object obj = Preconditions.checkNotNull(iterator.next());
        if (!iterator.hasNext())
        {
            stack.removeLast();
        }
        iterator = children(obj).iterator();
        if (iterator.hasNext())
        {
            stack.addLast(iterator);
        }
        return obj;
    }

    (Object obj)
    {
        this$0 = TreeTraverser.this;
        super();
        stack.addLast(Iterators.singletonIterator(Preconditions.checkNotNull(obj)));
    }
}
