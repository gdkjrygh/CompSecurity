// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            MinMaxPriorityQueue, CollectPreconditions

private class <init>
    implements Iterator
{

    private boolean canRemove;
    private int cursor;
    private int expectedModCount;
    private Queue forgetMeNot;
    private Object lastFromForgetMeNot;
    private List skipMe;
    final MinMaxPriorityQueue this$0;

    private boolean containsExact(Iterable iterable, Object obj)
    {
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (iterable.next() == obj)
            {
                return true;
            }
        }

        return false;
    }

    private int nextNotInSkipMe(int i)
    {
        int j = i;
        if (skipMe != null)
        {
            do
            {
                j = i;
                if (i >= size())
                {
                    break;
                }
                j = i;
                if (!containsExact(skipMe, elementData(i)))
                {
                    break;
                }
                i++;
            } while (true);
        }
        return j;
    }

    void checkModCount()
    {
        if (MinMaxPriorityQueue.access$700(MinMaxPriorityQueue.this) != expectedModCount)
        {
            throw new ConcurrentModificationException();
        } else
        {
            return;
        }
    }

    public boolean hasNext()
    {
        checkModCount();
        return nextNotInSkipMe(cursor + 1) < size() || forgetMeNot != null && !forgetMeNot.isEmpty();
    }

    public Object next()
    {
        checkModCount();
        int i = nextNotInSkipMe(cursor + 1);
        if (i < size())
        {
            cursor = i;
            canRemove = true;
            return elementData(cursor);
        }
        if (forgetMeNot != null)
        {
            cursor = size();
            lastFromForgetMeNot = forgetMeNot.poll();
            if (lastFromForgetMeNot != null)
            {
                canRemove = true;
                return lastFromForgetMeNot;
            }
        }
        throw new NoSuchElementException("iterator moved past last element in queue.");
    }

    public void remove()
    {
        CollectPreconditions.checkRemove(canRemove);
        checkModCount();
        canRemove = false;
        expectedModCount = expectedModCount + 1;
        if (cursor < size())
        {
            lastFromForgetMeNot lastfromforgetmenot = removeAt(cursor);
            if (lastfromforgetmenot != null)
            {
                if (forgetMeNot == null)
                {
                    forgetMeNot = new ArrayDeque();
                    skipMe = new ArrayList(3);
                }
                forgetMeNot.add(lastfromforgetmenot.ckle);
                skipMe.add(lastfromforgetmenot.ced);
            }
            cursor = cursor - 1;
            return;
        } else
        {
            Preconditions.checkState(removeExact(lastFromForgetMeNot));
            lastFromForgetMeNot = null;
            return;
        }
    }

    boolean removeExact(Object obj)
    {
        for (int i = 0; i < MinMaxPriorityQueue.access$600(MinMaxPriorityQueue.this); i++)
        {
            if (MinMaxPriorityQueue.access$500(MinMaxPriorityQueue.this)[i] == obj)
            {
                removeAt(i);
                return true;
            }
        }

        return false;
    }

    private A()
    {
        this$0 = MinMaxPriorityQueue.this;
        super();
        cursor = -1;
        expectedModCount = MinMaxPriorityQueue.access$700(MinMaxPriorityQueue.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
