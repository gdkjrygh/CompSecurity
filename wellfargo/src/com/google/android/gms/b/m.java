// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.b:
//            o, p, r

abstract class m
{

    o b;
    p c;
    r d;

    m()
    {
    }

    public static boolean a(Map map, Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!map.containsKey(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean a(Set set, Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = false;
        if (set != obj) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        if (!(obj instanceof Set)) goto _L4; else goto _L3
_L3:
        obj = (Set)obj;
        if (set.size() != ((Set) (obj)).size()) goto _L6; else goto _L5
_L5:
        flag = set.containsAll(((Collection) (obj)));
        if (!flag) goto _L6; else goto _L7
_L7:
        flag = flag1;
_L9:
        return flag;
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        set;
        return false;
        set;
        return false;
    }

    public static boolean b(Map map, Collection collection)
    {
        int i = map.size();
        for (collection = collection.iterator(); collection.hasNext(); map.remove(collection.next())) { }
        return i != map.size();
    }

    public static boolean c(Map map, Collection collection)
    {
        int i = map.size();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!collection.contains(iterator.next()))
            {
                iterator.remove();
            }
        } while (true);
        return i != map.size();
    }

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i, int j);

    protected abstract Object a(int i, Object obj);

    protected abstract void a(int i);

    protected abstract void a(Object obj, Object obj1);

    public Object[] a(Object aobj[], int i)
    {
        int k = a();
        if (aobj.length < k)
        {
            aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), k);
        }
        for (int j = 0; j < k; j++)
        {
            aobj[j] = a(j, i);
        }

        if (aobj.length > k)
        {
            aobj[k] = null;
        }
        return aobj;
    }

    protected abstract int b(Object obj);

    protected abstract Map b();

    public Object[] b(int i)
    {
        int k = a();
        Object aobj[] = new Object[k];
        for (int j = 0; j < k; j++)
        {
            aobj[j] = a(j, i);
        }

        return aobj;
    }

    protected abstract void c();

    public Set d()
    {
        if (b == null)
        {
            b = new o(this);
        }
        return b;
    }

    public Set e()
    {
        if (c == null)
        {
            c = new p(this);
        }
        return c;
    }

    public Collection f()
    {
        if (d == null)
        {
            d = new r(this);
        }
        return d;
    }
}
