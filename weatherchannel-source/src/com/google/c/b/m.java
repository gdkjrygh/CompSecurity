// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.c.b:
//            k, z, w, ad, 
//            u, af, ag, a

public abstract class m extends k
    implements List, RandomAccess
{
    class a extends m
    {

        final transient int a;
        final transient int b;
        final m c;

        public m a(int i, int j)
        {
            d.a(i, j, b);
            return c.a(a + i, a + j);
        }

        public Object get(int i)
        {
            d.a(i, b);
            return c.get(a + i);
        }

        public Iterator iterator()
        {
            return a();
        }

        public ListIterator listIterator()
        {
            return f();
        }

        public ListIterator listIterator(int i)
        {
            return a(i);
        }

        public int size()
        {
            return b;
        }

        public List subList(int i, int j)
        {
            return a(i, j);
        }

        a(int i, int j)
        {
            c = m.this;
            super();
            a = i;
            b = j;
        }
    }


    private static final m a;

    m()
    {
    }

    public static m a(Object obj)
    {
        return new ad(obj);
    }

    static m a(Object aobj[])
    {
        return b(aobj, aobj.length);
    }

    static m b(Object aobj[], int i)
    {
        switch (i)
        {
        default:
            Object aobj1[] = aobj;
            if (i < aobj.length)
            {
                aobj1 = w.b(aobj, i);
            }
            return new z(aobj1);

        case 0: // '\0'
            return e();

        case 1: // '\001'
            return new ad(aobj[0]);
        }
    }

    public static m e()
    {
        return a;
    }

    int a(Object aobj[], int i)
    {
        int l = size();
        for (int j = 0; j < l; j++)
        {
            aobj[i + j] = get(j);
        }

        return i + l;
    }

    public af a()
    {
        return f();
    }

    public ag a(int i)
    {
        return new com.google.c.b.a(size(), i) {

            final m a;

            protected Object a(int j)
            {
                return a.get(j);
            }

            
            {
                a = m.this;
                super(i, j);
            }
        };
    }

    public m a(int i, int j)
    {
        d.a(i, j, size());
        switch (j - i)
        {
        default:
            return b(i, j);

        case 0: // '\0'
            return e();

        case 1: // '\001'
            return a(get(i));
        }
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final m b()
    {
        return this;
    }

    m b(int i, int j)
    {
        return new a(i, j - i);
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        return u.a(this, obj);
    }

    public ag f()
    {
        return a(0);
    }

    public int hashCode()
    {
        int j = 1;
        int l = size();
        for (int i = 0; i < l; i++)
        {
            j = ~~(j * 31 + get(i).hashCode());
        }

        return j;
    }

    public int indexOf(Object obj)
    {
        if (obj == null)
        {
            return -1;
        } else
        {
            return u.b(this, obj);
        }
    }

    public Iterator iterator()
    {
        return a();
    }

    public int lastIndexOf(Object obj)
    {
        if (obj == null)
        {
            return -1;
        } else
        {
            return u.c(this, obj);
        }
    }

    public ListIterator listIterator()
    {
        return f();
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public final Object remove(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    static 
    {
        a = new z(w.a);
    }
}
