// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.contextlogic.wish.http:
//            LinkedBlockingQueue

private abstract class advance
    implements Iterator
{

    private lastRet lastRet;
    lastRet next;
    Object nextItem;
    final LinkedBlockingQueue this$0;

    abstract void advance();

    public boolean hasNext()
    {
        return next != null;
    }

    public Object next()
    {
        if (next == null)
        {
            throw new NoSuchElementException();
        } else
        {
            lastRet = next;
            Object obj = nextItem;
            advance();
            return obj;
        }
    }

    public void remove()
    {
        advance advance1 = lastRet;
        if (advance1 == null)
        {
            throw new IllegalStateException();
        } else
        {
            lastRet = null;
            removeNode(advance1);
            return;
        }
    }

    ()
    {
        this$0 = LinkedBlockingQueue.this;
        super();
        advance();
    }
}
