// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, BinaryTreeTraverser

private final class stack extends AbstractIterator
{

    private final BitSet hasExpandedLeft = new BitSet();
    private final Deque stack = new ArrayDeque();
    final BinaryTreeTraverser this$0;

    protected Object computeNext()
    {
        Object obj;
        for (; !stack.isEmpty(); BinaryTreeTraverser.access$000(stack, leftChild(obj)))
        {
            obj = stack.getLast();
            if (hasExpandedLeft.get(stack.size() - 1))
            {
                stack.removeLast();
                hasExpandedLeft.clear(stack.size());
                BinaryTreeTraverser.access$000(stack, rightChild(obj));
                return obj;
            }
            hasExpandedLeft.set(stack.size() - 1);
        }

        return endOfData();
    }

    (Object obj)
    {
        this$0 = BinaryTreeTraverser.this;
        super();
        stack.addLast(obj);
    }
}
