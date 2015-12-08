// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public final class l
    implements Queue
{

    private final LinkedList a = new LinkedList();

    public l()
    {
    }

    public final Object a(Class class1)
    {
        return class1.cast(peek());
    }

    public final boolean add(Object obj)
    {
        a.add(0, obj);
        return true;
    }

    public final boolean addAll(Collection collection)
    {
        Object obj;
        for (collection = collection.iterator(); collection.hasNext(); a.add(0, obj))
        {
            obj = collection.next();
        }

        return true;
    }

    public final Object b(Class class1)
    {
        return class1.cast(poll());
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean containsAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final Object element()
    {
        if (a.size() > 0)
        {
            return a.get(0);
        } else
        {
            throw new NoSuchElementException();
        }
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
        a.add(0, obj);
        return true;
    }

    public final Object peek()
    {
        if (a.size() > 0)
        {
            return a.get(0);
        } else
        {
            return null;
        }
    }

    public final Object poll()
    {
        if (a.size() > 0)
        {
            return a.remove(0);
        } else
        {
            return null;
        }
    }

    public final Object remove()
    {
        if (a.size() > 0)
        {
            return a.remove(0);
        } else
        {
            throw new NoSuchElementException();
        }
    }

    public final boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final int size()
    {
        return a.size();
    }

    public final Object[] toArray()
    {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object aobj[])
    {
        throw new UnsupportedOperationException();
    }
}
