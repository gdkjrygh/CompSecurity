// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import java.util.ListIterator;

// Referenced classes of package com.google.c.b:
//            i, m, k, ag

class y extends i
{

    private final k a;
    private final m b;

    y(k k, m m1)
    {
        a = k;
        b = m1;
    }

    y(k k, Object aobj[])
    {
        this(k, m.a(aobj));
    }

    int a(Object aobj[], int j)
    {
        return b.a(aobj, j);
    }

    public ag a(int j)
    {
        return b.a(j);
    }

    k c()
    {
        return a;
    }

    public Object get(int j)
    {
        return b.get(j);
    }

    public ListIterator listIterator(int j)
    {
        return a(j);
    }
}
