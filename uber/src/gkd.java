// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public final class gkd
    implements Queue
{

    final Queue a;
    final int b;

    private gkd(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        a = new ArrayDeque(i);
        b = i;
    }

    public static gkd a(int i)
    {
        return new gkd(i);
    }

    public final boolean add(Object obj)
    {
        gjz.a(obj);
        if (b == 0)
        {
            return true;
        }
        if (size() == b)
        {
            a.remove();
        }
        a.add(obj);
        return true;
    }

    public final boolean addAll(Collection collection)
    {
        collection = collection.iterator();
        boolean flag;
        for (flag = false; collection.hasNext(); flag |= add(collection.next())) { }
        return flag;
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    public final Object element()
    {
        return a.element();
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }

    public final boolean offer(Object obj)
    {
        return add(obj);
    }

    public final Object peek()
    {
        return a.peek();
    }

    public final Object poll()
    {
        return a.poll();
    }

    public final Object remove()
    {
        return a.remove();
    }

    public final boolean remove(Object obj)
    {
        return a.remove(obj);
    }

    public final boolean removeAll(Collection collection)
    {
        return a.removeAll(collection);
    }

    public final boolean retainAll(Collection collection)
    {
        return a.retainAll(collection);
    }

    public final int size()
    {
        return a.size();
    }

    public final Object[] toArray()
    {
        return a.toArray();
    }

    public final Object[] toArray(Object aobj[])
    {
        return (Object[])a.toArray();
    }
}
