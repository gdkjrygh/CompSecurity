// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.NoSuchElementException;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, Iterables

private static class <init> extends AbstractIterator
{

    private final Queue queue;

    public Object computeNext()
    {
        Object obj;
        try
        {
            obj = queue.remove();
        }
        catch (NoSuchElementException nosuchelementexception)
        {
            return endOfData();
        }
        return obj;
    }

    private (Queue queue1)
    {
        queue = queue1;
    }

    queue(Queue queue1, queue queue2)
    {
        this(queue1);
    }
}
