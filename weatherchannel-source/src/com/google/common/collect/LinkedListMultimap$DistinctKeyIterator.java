// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Sets, CollectPreconditions

private class <init>
    implements Iterator
{

    this._cls0 current;
    int expectedModCount;
    this._cls0 next;
    final Set seenKeys;
    final LinkedListMultimap this$0;

    private void checkForConcurrentModification()
    {
        if (LinkedListMultimap.access$000(LinkedListMultimap.this) != expectedModCount)
        {
            throw new ConcurrentModificationException();
        } else
        {
            return;
        }
    }

    public boolean hasNext()
    {
        checkForConcurrentModification();
        return next != null;
    }

    public Object next()
    {
        checkForConcurrentModification();
        LinkedListMultimap.access$300(next);
        current = next;
        seenKeys.add(current.current);
        do
        {
            next = next.next;
        } while (next != null && !seenKeys.add(next.next));
        return current.current;
    }

    public void remove()
    {
        checkForConcurrentModification();
        boolean flag;
        if (current != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CollectPreconditions.checkRemove(flag);
        LinkedListMultimap.access$500(LinkedListMultimap.this, current.current);
        current = null;
        expectedModCount = LinkedListMultimap.access$000(LinkedListMultimap.this);
    }

    private ()
    {
        this$0 = LinkedListMultimap.this;
        super();
        seenKeys = Sets.newHashSetWithExpectedSize(keySet().size());
        next = LinkedListMultimap.access$200(LinkedListMultimap.this);
        expectedModCount = LinkedListMultimap.access$000(LinkedListMultimap.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
