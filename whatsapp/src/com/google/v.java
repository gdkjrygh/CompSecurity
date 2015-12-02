// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google:
//            b, eV, dX, a3

public class v extends AbstractList
    implements b, RandomAccess
{

    private final b a;

    public v(b b1)
    {
        a = b1;
    }

    static b a(v v1)
    {
        return v1.a;
    }

    public a3 a(int i)
    {
        return a.a(i);
    }

    public String a(int i)
    {
        return (String)a.get(i);
    }

    public List a()
    {
        return a.a();
    }

    public void a(a3 a3)
    {
        throw new UnsupportedOperationException();
    }

    public Object get(int i)
    {
        return a(i);
    }

    public Iterator iterator()
    {
        return new eV(this);
    }

    public ListIterator listIterator(int i)
    {
        return new dX(this, i);
    }

    public int size()
    {
        return a.size();
    }
}
