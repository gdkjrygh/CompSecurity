// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Multisets, CollectPreconditions, Multiset

static final class entryIterator
    implements Iterator
{

    private boolean canRemove;
    private canRemove currentEntry;
    private final Iterator entryIterator;
    private int laterCount;
    private final Multiset multiset;
    private int totalCount;

    public boolean hasNext()
    {
        return laterCount > 0 || entryIterator.hasNext();
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        if (laterCount == 0)
        {
            currentEntry = (currentEntry)entryIterator.next();
            int i = currentEntry.currentEntry();
            laterCount = i;
            totalCount = i;
        }
        laterCount = laterCount - 1;
        canRemove = true;
        return currentEntry.currentEntry();
    }

    public void remove()
    {
        CollectPreconditions.checkRemove(canRemove);
        if (totalCount == 1)
        {
            entryIterator.remove();
        } else
        {
            multiset.remove(currentEntry.currentEntry());
        }
        totalCount = totalCount - 1;
        canRemove = false;
    }

    (Multiset multiset1, Iterator iterator)
    {
        multiset = multiset1;
        entryIterator = iterator;
    }
}
