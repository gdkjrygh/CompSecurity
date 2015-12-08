// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            HashBiMap, CollectPreconditions

abstract class this._cls0
    implements Iterator
{

    int expectedModCount;
    try next;
    int nextBucket;
    final HashBiMap this$0;
    try toRemove;

    private void checkForConcurrentModification()
    {
        if (HashBiMap.access$000(HashBiMap.this) != expectedModCount)
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
        if (next != null)
        {
            return true;
        }
_L3:
        if (nextBucket < HashBiMap.access$100(HashBiMap.this).length)
        {
            if (HashBiMap.access$100(HashBiMap.this)[nextBucket] != null)
            {
                try atry[] = HashBiMap.access$100(HashBiMap.this);
                int i = nextBucket;
                nextBucket = i + 1;
                next = atry[i];
                return true;
            }
        } else
        {
            return false;
        }
        if (true) goto _L2; else goto _L1
_L2:
        nextBucket = nextBucket + 1;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public Object next()
    {
        checkForConcurrentModification();
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            try try1 = next;
            next = try1.nextInKToVBucket;
            toRemove = try1;
            return output(try1);
        }
    }

    abstract Object output(try try1);

    public void remove()
    {
        checkForConcurrentModification();
        boolean flag;
        if (toRemove != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CollectPreconditions.checkRemove(flag);
        HashBiMap.access$200(HashBiMap.this, toRemove);
        expectedModCount = HashBiMap.access$000(HashBiMap.this);
        toRemove = null;
    }

    try()
    {
        this$0 = HashBiMap.this;
        super();
        nextBucket = 0;
        next = null;
        toRemove = null;
        expectedModCount = HashBiMap.access$000(HashBiMap.this);
    }
}
