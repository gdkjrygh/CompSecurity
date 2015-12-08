// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList

private static class forwardList extends ImmutableList
{

    private final transient ImmutableList forwardList;

    private int reverseIndex(int i)
    {
        return size() - 1 - i;
    }

    private int reversePosition(int i)
    {
        return size() - i;
    }

    public boolean contains(Object obj)
    {
        return forwardList.contains(obj);
    }

    public Object get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return forwardList.get(reverseIndex(i));
    }

    public int indexOf(Object obj)
    {
        int i = forwardList.lastIndexOf(obj);
        if (i >= 0)
        {
            return reverseIndex(i);
        } else
        {
            return -1;
        }
    }

    boolean isPartialView()
    {
        return forwardList.isPartialView();
    }

    public volatile Iterator iterator()
    {
        return super.iterator();
    }

    public int lastIndexOf(Object obj)
    {
        int i = forwardList.indexOf(obj);
        if (i >= 0)
        {
            return reverseIndex(i);
        } else
        {
            return -1;
        }
    }

    public volatile ListIterator listIterator()
    {
        return super.listIterator();
    }

    public volatile ListIterator listIterator(int i)
    {
        return super.listIterator(i);
    }

    public ImmutableList reverse()
    {
        return forwardList;
    }

    public int size()
    {
        return forwardList.size();
    }

    public ImmutableList subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size());
        return forwardList.subList(reversePosition(j), reversePosition(i)).reverse();
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    (ImmutableList immutablelist)
    {
        forwardList = immutablelist;
    }
}
