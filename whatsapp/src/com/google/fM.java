// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google:
//            b, v, a3

public class fM extends AbstractList
    implements b, RandomAccess
{

    public static final b a = new v(new fM());
    private final List b;

    public fM()
    {
        b = new ArrayList();
    }

    public fM(b b1)
    {
        b = new ArrayList(b1.size());
        addAll(b1);
    }

    private String a(Object obj)
    {
        if (obj instanceof String)
        {
            return (String)obj;
        } else
        {
            return ((a3)obj).h();
        }
    }

    public a3 a(int i)
    {
        Object obj = b.get(i);
        if (obj instanceof String)
        {
            obj = a3.a((String)obj);
            b.set(i, obj);
            return ((a3) (obj));
        } else
        {
            return (a3)obj;
        }
    }

    public String a(int i)
    {
        Object obj = b.get(i);
        if (obj instanceof String)
        {
            return (String)obj;
        }
        obj = (a3)obj;
        String s = ((a3) (obj)).h();
        if (((a3) (obj)).i())
        {
            b.set(i, s);
        }
        return s;
    }

    public List a()
    {
        return Collections.unmodifiableList(b);
    }

    public void a(int i, String s)
    {
        b.add(i, s);
        modCount = modCount + 1;
    }

    public void a(a3 a3_1)
    {
        b.add(a3_1);
        modCount = modCount + 1;
    }

    public void add(int i, Object obj)
    {
        a(i, (String)obj);
    }

    public boolean addAll(int i, Collection collection)
    {
        Object obj = collection;
        if (collection instanceof b)
        {
            obj = ((b)collection).a();
        }
        boolean flag = b.addAll(i, ((Collection) (obj)));
        modCount = modCount + 1;
        return flag;
    }

    public boolean addAll(Collection collection)
    {
        return addAll(size(), collection);
    }

    public String b(int i)
    {
        Object obj = b.remove(i);
        modCount = modCount + 1;
        return a(obj);
    }

    public String b(int i, String s)
    {
        return a(b.set(i, s));
    }

    public void clear()
    {
        b.clear();
        modCount = modCount + 1;
    }

    public Object get(int i)
    {
        return a(i);
    }

    public Object remove(int i)
    {
        return b(i);
    }

    public Object set(int i, Object obj)
    {
        return b(i, (String)obj);
    }

    public int size()
    {
        return b.size();
    }

}
