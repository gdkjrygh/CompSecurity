// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.d;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.c.b:
//            m

class b extends m
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
        return super.a();
    }

    public ListIterator listIterator()
    {
        return super.f();
    }

    public ListIterator listIterator(int i)
    {
        return super.a(i);
    }

    public int size()
    {
        return b;
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    tor(m m1, int i, int j)
    {
        c = m1;
        super();
        a = i;
        b = j;
    }
}
