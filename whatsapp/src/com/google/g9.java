// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google:
//            bM, cq, bD

class g9 extends AbstractSet
{

    final bM a;

    private g9(bM bm)
    {
        a = bm;
        super();
    }

    g9(bM bm, bD bd)
    {
        this(bm);
    }

    public boolean a(java.util.Map.Entry entry)
    {
        if (!contains(entry))
        {
            a.a((Comparable)entry.getKey(), entry.getValue());
            return true;
        } else
        {
            return false;
        }
    }

    public boolean add(Object obj)
    {
        return a((java.util.Map.Entry)obj);
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        Object obj1 = (java.util.Map.Entry)obj;
        obj = a.get(((java.util.Map.Entry) (obj1)).getKey());
        obj1 = ((java.util.Map.Entry) (obj1)).getValue();
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public Iterator iterator()
    {
        return new cq(a, null);
    }

    public boolean remove(Object obj)
    {
        obj = (java.util.Map.Entry)obj;
        if (contains(obj))
        {
            a.remove(((java.util.Map.Entry) (obj)).getKey());
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return a.size();
    }
}
