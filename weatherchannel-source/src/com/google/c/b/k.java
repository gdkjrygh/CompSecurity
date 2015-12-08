// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.d;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.c.b:
//            y, m, af, w

public abstract class k extends AbstractCollection
    implements Serializable
{
    public static abstract class a
    {

        static int a(int i, int j)
        {
            if (j < 0)
            {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int l = (i >> 1) + i + 1;
            i = l;
            if (l < j)
            {
                i = Integer.highestOneBit(j - 1) << 1;
            }
            j = i;
            if (i < 0)
            {
                j = 0x7fffffff;
            }
            return j;
        }
    }


    private transient m a;

    k()
    {
    }

    int a(Object aobj[], int i)
    {
        for (Iterator iterator1 = iterator(); iterator1.hasNext();)
        {
            aobj[i] = iterator1.next();
            i++;
        }

        return i;
    }

    public abstract af a();

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public m b()
    {
        m m2 = a;
        m m1 = m2;
        if (m2 == null)
        {
            m1 = d();
            a = m1;
        }
        return m1;
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return obj != null && super.contains(obj);
    }

    m d()
    {
        switch (size())
        {
        default:
            return new y(this, toArray());

        case 0: // '\0'
            return m.e();

        case 1: // '\001'
            return m.a(a().next());
        }
    }

    public Iterator iterator()
    {
        return a();
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

    public final Object[] toArray()
    {
        int i = size();
        if (i == 0)
        {
            return w.a;
        } else
        {
            Object aobj[] = new Object[i];
            a(aobj, 0);
            return aobj;
        }
    }

    public final Object[] toArray(Object aobj[])
    {
        int i;
        com.google.c.a.d.a(((Object) (aobj)));
        i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = w.a(aobj, i);
_L4:
        a(aobj1, 0);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
