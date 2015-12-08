// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.c.b:
//            j, d, k, v, 
//            r, s, q, w, 
//            aa

public abstract class n
    implements Serializable, Map
{
    public static class a
    {

        o.a a[];
        int b;

        private void a(int l)
        {
            if (l > a.length)
            {
                a = (o.a[])w.b(a, k.a.a(a.length, l));
            }
        }

        public a a(Object obj, Object obj1)
        {
            a(b + 1);
            obj = n.c(obj, obj1);
            obj1 = a;
            int l = b;
            b = l + 1;
            obj1[l] = obj;
            return this;
        }

        public n a()
        {
            switch (b)
            {
            default:
                return new aa(b, a);

            case 0: // '\0'
                return n.h();

            case 1: // '\001'
                return n.b(a[0].getKey(), a[0].getValue());
            }
        }

        public a()
        {
            this(4);
        }

        a(int l)
        {
            a = new o.a[l];
            b = 0;
        }
    }


    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient s b;
    private transient s c;
    private transient k d;

    n()
    {
    }

    static void a(boolean flag, String s1, java.util.Map.Entry entry, java.util.Map.Entry entry1)
    {
        if (!flag)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Multiple entries with same ").append(s1).append(": ").append(entry).append(" and ").append(entry1).toString());
        } else
        {
            return;
        }
    }

    public static n b(Object obj, Object obj1)
    {
        return j.a(obj, obj1);
    }

    static o.a c(Object obj, Object obj1)
    {
        com.google.c.b.d.a(obj, obj1);
        return new o.a(obj, obj1);
    }

    public static n h()
    {
        return j.e();
    }

    public s b()
    {
        s s2 = b;
        s s1 = s2;
        if (s2 == null)
        {
            s1 = c();
            b = s1;
        }
        return s1;
    }

    abstract s c();

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj)
    {
        return g().contains(obj);
    }

    public s d()
    {
        s s2 = c;
        s s1 = s2;
        if (s2 == null)
        {
            s1 = i();
            c = s1;
        }
        return s1;
    }

    public Set entrySet()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return v.a(this, obj);
    }

    public k g()
    {
        k k1 = d;
        Object obj = k1;
        if (k1 == null)
        {
            obj = new r(this);
            d = ((k) (obj));
        }
        return ((k) (obj));
    }

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return b().hashCode();
    }

    s i()
    {
        return new q(this);
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Set keySet()
    {
        return d();
    }

    public final Object put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return v.a(this);
    }

    public Collection values()
    {
        return g();
    }

}
