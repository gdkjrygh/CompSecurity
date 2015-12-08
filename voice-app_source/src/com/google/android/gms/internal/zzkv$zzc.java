// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzkv

final class zzabx
    implements Set
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
        return zzabx.colIndexOfKey(obj) >= 0;
    }

    public boolean containsAll(Collection collection)
    {
        return zzkv.containsAllHelper(zzabx.colGetMap(), collection);
    }

    public boolean equals(Object obj)
    {
        return zzkv.equalsSetHelper(this, obj);
    }

    public int hashCode()
    {
        int i = zzabx.colGetSize() - 1;
        int j = 0;
        while (i >= 0) 
        {
            Object obj = zzabx.colGetEntry(i, 0);
            int k;
            if (obj == null)
            {
                k = 0;
            } else
            {
                k = obj.hashCode();
            }
            j += k;
            i--;
        }
        return j;
    }

    public boolean isEmpty()
    {
        return zzabx.colGetSize() == 0;
    }

    public Iterator iterator()
    {
        return new <init>(zzabx, 0);
    }

    public boolean remove(Object obj)
    {
        int i = zzabx.colIndexOfKey(obj);
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
        return zzkv.removeAllHelper(zzabx.colGetMap(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return zzkv.retainAllHelper(zzabx.colGetMap(), collection);
    }

    public int size()
    {
        return zzabx.colGetSize();
    }

    public Object[] toArray()
    {
        return zzabx.toArrayHelper(0);
    }

    public Object[] toArray(Object aobj[])
    {
        return zzabx.toArrayHelper(aobj, 0);
    }

    (zzkv zzkv1)
    {
        zzabx = zzkv1;
        super();
    }
}
