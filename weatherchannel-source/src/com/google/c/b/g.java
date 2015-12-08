// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.c.b:
//            s, t, m, af

final class g extends s
{

    static final g a = new g();

    private g()
    {
    }

    int a(Object aobj[], int i)
    {
        return i;
    }

    public af a()
    {
        return t.a();
    }

    public m b()
    {
        return m.e();
    }

    boolean c()
    {
        return true;
    }

    public boolean contains(Object obj)
    {
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        return 0;
    }

    public String toString()
    {
        return "[]";
    }

}
