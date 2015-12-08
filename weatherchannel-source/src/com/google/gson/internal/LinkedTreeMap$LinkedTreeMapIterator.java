// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.gson.internal:
//            LinkedTreeMap

private abstract class <init>
    implements Iterator
{

    int expectedModCount;
    expectedModCount lastReturned;
    expectedModCount next;
    final LinkedTreeMap this$0;

    public final boolean hasNext()
    {
        return next != header;
    }

    final next nextNode()
    {
        next next1 = next;
        if (next1 == header)
        {
            throw new NoSuchElementException();
        }
        if (modCount != expectedModCount)
        {
            throw new ConcurrentModificationException();
        } else
        {
            next = next1.next;
            lastReturned = next1;
            return next1;
        }
    }

    public final void remove()
    {
        if (lastReturned == null)
        {
            throw new IllegalStateException();
        } else
        {
            removeInternal(lastReturned, true);
            lastReturned = null;
            expectedModCount = modCount;
            return;
        }
    }

    private ()
    {
        this$0 = LinkedTreeMap.this;
        super();
        next = header.next;
        lastReturned = null;
        expectedModCount = modCount;
    }

    expectedModCount(expectedModCount expectedmodcount)
    {
        this();
    }
}
