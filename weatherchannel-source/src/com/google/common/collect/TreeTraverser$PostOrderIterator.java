// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, TreeTraverser

private final class expand extends AbstractIterator
{

    private final ArrayDeque stack = new ArrayDeque();
    final TreeTraverser this$0;

    private expand expand(Object obj)
    {
        return new t>(obj, children(obj).iterator());
    }

    protected Object computeNext()
    {
        while (!stack.isEmpty()) 
        {
            Object obj = (stack)stack.getLast();
            if (((stack) (obj)).dIterator.hasNext())
            {
                obj = ((dIterator) (obj)).dIterator.next();
                stack.addLast(expand(obj));
            } else
            {
                stack.removeLast();
                return ((stack) (obj)).;
            }
        }
        return endOfData();
    }

    (Object obj)
    {
        this$0 = TreeTraverser.this;
        super();
        stack.addLast(expand(obj));
    }
}
