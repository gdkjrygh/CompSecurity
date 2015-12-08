// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.b:
//            m, k, q

final class o
    implements Set
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    public boolean a(java.util.Map.Entry entry)
    {
        throw new UnsupportedOperationException();
    }

    public boolean add(Object obj)
    {
        return a((java.util.Map.Entry)obj);
    }

    public boolean addAll(Collection collection)
    {
        int i = a.a();
        java.util.Map.Entry entry;
        for (collection = collection.iterator(); collection.hasNext(); a.a(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)collection.next();
        }

        return i != a.a();
    }

    public void clear()
    {
        a.c();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            int i = a.a(((java.util.Map.Entry) (obj)).getKey());
            if (i >= 0)
            {
                return k.a(a.a(i, 1), ((java.util.Map.Entry) (obj)).getValue());
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public boolean equals(Object obj)
    {
        return m.a(this, obj);
    }

    public int hashCode()
    {
        int j = a.a() - 1;
        int i = 0;
        while (j >= 0) 
        {
            Object obj = a.a(j, 0);
            Object obj1 = a.a(j, 1);
            int l;
            int i1;
            if (obj == null)
            {
                l = 0;
            } else
            {
                l = obj.hashCode();
            }
            if (obj1 == null)
            {
                i1 = 0;
            } else
            {
                i1 = obj1.hashCode();
            }
            j--;
            i += i1 ^ l;
        }
        return i;
    }

    public boolean isEmpty()
    {
        return a.a() == 0;
    }

    public Iterator iterator()
    {
        return new q(a);
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return a.a();
    }

    public Object[] toArray()
    {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray(Object aobj[])
    {
        throw new UnsupportedOperationException();
    }
}
