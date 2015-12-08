// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Deque;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, PeekingIterator, BinaryTreeTraverser

private final class stack extends UnmodifiableIterator
    implements PeekingIterator
{

    private final Deque stack = new ArrayDeque();
    final BinaryTreeTraverser this$0;

    public boolean hasNext()
    {
        return !stack.isEmpty();
    }

    public Object next()
    {
        Object obj = stack.removeLast();
        BinaryTreeTraverser.access$000(stack, rightChild(obj));
        BinaryTreeTraverser.access$000(stack, leftChild(obj));
        return obj;
    }

    public Object peek()
    {
        return stack.getLast();
    }

    (Object obj)
    {
        this$0 = BinaryTreeTraverser.this;
        super();
        stack.addLast(obj);
    }
}
