// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.d;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.c.b:
//            m, t, af

final class ad extends m
{

    final transient Object a;

    ad(Object obj)
    {
        a = d.a(obj);
    }

    int a(Object aobj[], int i)
    {
        aobj[i] = a;
        return i + 1;
    }

    public af a()
    {
        return t.a(a);
    }

    public m a(int i, int j)
    {
        d.a(i, j, 1);
        Object obj = this;
        if (i == j)
        {
            obj = m.e();
        }
        return ((m) (obj));
    }

    public boolean contains(Object obj)
    {
        return a.equals(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof List)
            {
                if (((List) (obj = (List)obj)).size() != 1 || !a.equals(((List) (obj)).get(0)))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public Object get(int i)
    {
        d.a(i, 1);
        return a;
    }

    public int hashCode()
    {
        return a.hashCode() + 31;
    }

    public int indexOf(Object obj)
    {
        return !a.equals(obj) ? -1 : 0;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int lastIndexOf(Object obj)
    {
        return indexOf(obj);
    }

    public int size()
    {
        return 1;
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    public String toString()
    {
        String s = a.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
