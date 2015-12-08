// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, BinaryTreeTraverser

private final class stack extends UnmodifiableIterator
{

    private final BitSet hasExpanded = new BitSet();
    private final Deque stack = new ArrayDeque();
    final BinaryTreeTraverser this$0;

    public boolean hasNext()
    {
        return !stack.isEmpty();
    }

    public Object next()
    {
        do
        {
            Object obj = stack.getLast();
            if (hasExpanded.get(stack.size() - 1))
            {
                stack.removeLast();
                hasExpanded.clear(stack.size());
                return obj;
            }
            hasExpanded.set(stack.size() - 1);
            BinaryTreeTraverser.access$000(stack, rightChild(obj));
            BinaryTreeTraverser.access$000(stack, leftChild(obj));
        } while (true);
    }

    (Object obj)
    {
        this$0 = BinaryTreeTraverser.this;
        super();
        stack.addLast(obj);
    }
}
