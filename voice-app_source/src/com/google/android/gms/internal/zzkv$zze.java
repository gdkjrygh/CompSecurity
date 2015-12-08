// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            zzkv

final class zzabx
    implements Collection
{

    final zzkv zzabx;

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public void clear()
    {
        zzabx.colClear();
    }

    public boolean contains(Object obj)
    {
        return zzabx.colIndexOfValue(obj) >= 0;
    }

    public boolean containsAll(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public boolean isEmpty()
    {
        return zzabx.colGetSize() == 0;
    }

    public Iterator iterator()
    {
        return new <init>(zzabx, 1);
    }

    public boolean remove(Object obj)
    {
        int i = zzabx.colIndexOfValue(obj);
        if (i >= 0)
        {
            zzabx.colRemoveAt(i);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        int i = 0;
        int j = zzabx.colGetSize();
        boolean flag = false;
        int k;
        for (; i < j; j = k)
        {
            int l = i;
            k = j;
            if (collection.contains(zzabx.colGetEntry(i, 1)))
            {
                zzabx.colRemoveAt(i);
                l = i - 1;
                k = j - 1;
                flag = true;
            }
            i = l + 1;
        }

        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        int i = 0;
        int j = zzabx.colGetSize();
        boolean flag = false;
        int k;
        for (; i < j; j = k)
        {
            int l = i;
            k = j;
            if (!collection.contains(zzabx.colGetEntry(i, 1)))
            {
                zzabx.colRemoveAt(i);
                l = i - 1;
                k = j - 1;
                flag = true;
            }
            i = l + 1;
        }

        return flag;
    }

    public int size()
    {
        return zzabx.colGetSize();
    }

    public Object[] toArray()
    {
        return zzabx.toArrayHelper(1);
    }

    public Object[] toArray(Object aobj[])
    {
        return zzabx.toArrayHelper(aobj, 1);
    }

    (zzkv zzkv1)
    {
        zzabx = zzkv1;
        super();
    }
}
