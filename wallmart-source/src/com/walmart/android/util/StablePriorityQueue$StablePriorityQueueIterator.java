// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

// Referenced classes of package com.walmart.android.util:
//            StablePriorityQueue

private class currPriority
    implements Iterator
{

    private Iterator currIterator;
    private int currPriority;
    final StablePriorityQueue this$0;

    public boolean hasNext()
    {
        if (currIterator == null)
        {
            return false;
        }
        if (currIterator.hasNext())
        {
            return true;
        }
        for (currPriority = currPriority + 1; currPriority < StablePriorityQueue.access$000(StablePriorityQueue.this); currPriority = currPriority + 1)
        {
            if (StablePriorityQueue.access$100(StablePriorityQueue.this)[currPriority] == null)
            {
                continue;
            }
            currIterator = StablePriorityQueue.access$100(StablePriorityQueue.this)[currPriority].iterator();
            if (currIterator.hasNext())
            {
                return true;
            }
        }

        currIterator = null;
        return false;
    }

    public currIterator next()
    {
        if (hasNext())
        {
            return (hasNext)currIterator.next();
        } else
        {
            throw new NoSuchElementException();
        }
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        if (currIterator != null)
        {
            currIterator.remove();
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public ()
    {
        this$0 = StablePriorityQueue.this;
        super();
        currPriority = 0;
        currIterator = null;
        do
        {
label0:
            {
                if (currPriority < StablePriorityQueue.access$000(StablePriorityQueue.this))
                {
                    if (StablePriorityQueue.access$100(StablePriorityQueue.this)[currPriority] == null)
                    {
                        break label0;
                    }
                    currIterator = StablePriorityQueue.access$100(StablePriorityQueue.this)[currPriority].iterator();
                }
                return;
            }
            currPriority = currPriority + 1;
        } while (true);
    }
}
