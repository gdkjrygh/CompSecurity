// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, CollectPreconditions

abstract class advance
    implements Iterator
{

    lastReturned currentSegment;
    AtomicReferenceArray currentTable;
    ntry lastReturned;
    y nextEntry;
    ntry nextExternal;
    int nextSegmentIndex;
    int nextTableIndex;
    final MapMakerInternalMap this$0;

    final void advance()
    {
        nextExternal = null;
        break MISSING_BLOCK_LABEL_5;
        if (!nextInChain() && !nextInTable())
        {
            while (nextSegmentIndex >= 0) 
            {
                advance aadvance[] = segments;
                int i = nextSegmentIndex;
                nextSegmentIndex = i - 1;
                currentSegment = aadvance[i];
                if (currentSegment. != 0)
                {
                    currentTable = currentSegment.;
                    nextTableIndex = currentTable.length() - 1;
                    if (nextInTable())
                    {
                        return;
                    }
                }
            }
        }
        return;
    }

    boolean advanceTo(y y)
    {
        Object obj;
        obj = y.getKey();
        y = ((y) (getLiveValue(y)));
        if (y == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        nextExternal = new ntry(MapMakerInternalMap.this, obj, y);
        currentSegment.eadCleanup();
        return true;
        currentSegment.eadCleanup();
        return false;
        y;
        currentSegment.eadCleanup();
        throw y;
    }

    public boolean hasNext()
    {
        return nextExternal != null;
    }

    public abstract Object next();

    ntry nextEntry()
    {
        if (nextExternal == null)
        {
            throw new NoSuchElementException();
        } else
        {
            lastReturned = nextExternal;
            advance();
            return lastReturned;
        }
    }

    boolean nextInChain()
    {
        if (nextEntry != null)
        {
            for (nextEntry = nextEntry.getNext(); nextEntry != null; nextEntry = nextEntry.getNext())
            {
                if (advanceTo(nextEntry))
                {
                    return true;
                }
            }

        }
        return false;
    }

    boolean nextInTable()
    {
        while (nextTableIndex >= 0) 
        {
            Object obj = currentTable;
            int i = nextTableIndex;
            nextTableIndex = i - 1;
            obj = (y)((AtomicReferenceArray) (obj)).get(i);
            nextEntry = ((y) (obj));
            if (obj != null && (advanceTo(nextEntry) || nextInChain()))
            {
                return true;
            }
        }
        return false;
    }

    public void remove()
    {
        boolean flag;
        if (lastReturned != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CollectPreconditions.checkRemove(flag);
        MapMakerInternalMap.this.remove(lastReturned.getKey());
        lastReturned = null;
    }

    ntry()
    {
        this$0 = MapMakerInternalMap.this;
        super();
        nextSegmentIndex = segments.length - 1;
        nextTableIndex = -1;
        advance();
    }
}
