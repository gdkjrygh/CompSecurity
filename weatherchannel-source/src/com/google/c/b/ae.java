// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.d;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.c.b:
//            s, t, af

final class ae extends s
{

    final transient Object a;
    private transient int b;

    ae(Object obj)
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

    boolean c()
    {
        return b != 0;
    }

    public boolean contains(Object obj)
    {
        return a.equals(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof Set)
            {
                if (((Set) (obj = (Set)obj)).size() != 1 || !a.equals(((Set) (obj)).iterator().next()))
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

    public final int hashCode()
    {
        int j = b;
        int i = j;
        if (j == 0)
        {
            i = a.hashCode();
            b = i;
        }
        return i;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        return 1;
    }

    public String toString()
    {
        String s1 = a.toString();
        return (new StringBuilder(s1.length() + 2)).append('[').append(s1).append(']').toString();
    }
}
