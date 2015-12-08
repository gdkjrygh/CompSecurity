// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.d;
import java.util.ListIterator;

// Referenced classes of package com.google.c.b:
//            m, t, ag

class z extends m
{

    private final transient int a;
    private final transient int b;
    private final transient Object c[];

    z(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    z(Object aobj[], int i, int j)
    {
        a = i;
        b = j;
        c = aobj;
    }

    int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (c)), a, ((Object) (aobj)), i, b);
        return b + i;
    }

    public ag a(int i)
    {
        return t.a(c, a, b, i);
    }

    m b(int i, int j)
    {
        return new z(c, a + i, j - i);
    }

    public Object get(int i)
    {
        d.a(i, b);
        return c[a + i];
    }

    public int indexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= b)
                {
                    break label1;
                }
                j = i;
                if (c[a + i].equals(obj))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj != null)
        {
            int i = b - 1;
            while (i >= 0) 
            {
                if (c[a + i].equals(obj))
                {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public int size()
    {
        return b;
    }
}
