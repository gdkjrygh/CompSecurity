// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class gke
    implements List
{

    private final List a;

    private gke(List list)
    {
        a = list;
    }

    gke(List list, byte byte0)
    {
        this(list);
    }

    public static gke a(Object obj)
    {
        return (new gkf()).a(obj).a();
    }

    public static gke a(Object obj, Object obj1)
    {
        return (new gkf()).a(new Object[] {
            obj, obj1
        }).a();
    }

    public static gke a(Object obj, Object obj1, Object obj2)
    {
        return (new gkf()).a(new Object[] {
            obj, obj1, obj2
        }).a();
    }

    public static gke a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return (new gkf()).a(new Object[] {
            obj, obj1, obj2, obj3, obj4
        }).a();
    }

    public static gke a(Collection collection)
    {
        return (new gkf()).a((Object[])collection.toArray()).a();
    }

    private gko a(int i)
    {
        return new gko(a.listIterator(i));
    }

    public static gke b()
    {
        return (new gkf()).a();
    }

    private gko c()
    {
        return a(0);
    }

    public final gkn a()
    {
        return c();
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    public final Object get(int i)
    {
        return a.get(i);
    }

    public final int indexOf(Object obj)
    {
        return a.indexOf(obj);
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return a();
    }

    public final int lastIndexOf(Object obj)
    {
        return a.lastIndexOf(obj);
    }

    public final ListIterator listIterator()
    {
        return c();
    }

    public final ListIterator listIterator(int i)
    {
        return a(i);
    }

    public final Object remove(int i)
    {
        throw new UnsupportedOperationException();
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

    public final Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final int size()
    {
        return a.size();
    }

    public final List subList(int i, int j)
    {
        return new ArrayList(a.subList(i, j));
    }

    public final Object[] toArray()
    {
        return (Object[])((Object []) (a.toArray())).clone();
    }

    public final Object[] toArray(Object aobj[])
    {
        return (Object[])toArray();
    }
}
