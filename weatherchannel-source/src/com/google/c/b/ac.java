// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;


// Referenced classes of package com.google.c.b:
//            j, d, v, s

final class ac extends j
{

    final transient Object a;
    final transient Object b;
    transient j c;

    ac(Object obj, Object obj1)
    {
        d.a(obj, obj1);
        a = obj;
        b = obj1;
    }

    private ac(Object obj, Object obj1, j j1)
    {
        a = obj;
        b = obj1;
        c = j1;
    }

    public j a()
    {
        j j1 = c;
        Object obj = j1;
        if (j1 == null)
        {
            obj = new ac(b, a, this);
            c = ((j) (obj));
        }
        return ((j) (obj));
    }

    s c()
    {
        return s.a(v.a(a, b));
    }

    public boolean containsKey(Object obj)
    {
        return a.equals(obj);
    }

    public boolean containsValue(Object obj)
    {
        return b.equals(obj);
    }

    public Object get(Object obj)
    {
        if (a.equals(obj))
        {
            return b;
        } else
        {
            return null;
        }
    }

    s i()
    {
        return s.a(a);
    }

    public int size()
    {
        return 1;
    }
}
