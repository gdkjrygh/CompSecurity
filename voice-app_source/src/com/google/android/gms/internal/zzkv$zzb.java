// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzkv, zzkt

final class zzabx
    implements Set
{

    final zzkv zzabx;

    public volatile boolean add(Object obj)
    {
        return add((java.util.)obj);
    }

    public boolean add(java.util. )
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection)
    {
        int i = zzabx.colGetSize();
        java.util. ;
        for (collection = collection.iterator(); collection.hasNext(); zzabx.colPut(.getKey(), .getValue()))
        {
             = (java.util.)collection.next();
        }

        return i != zzabx.colGetSize();
    }

    public void clear()
    {
        zzabx.colClear();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof java.util.)
        {
            obj = (java.util.)obj;
            int i = zzabx.colIndexOfKey(((java.util.) (obj)).getKey());
            if (i >= 0)
            {
                return zzkt.equal(zzabx.colGetEntry(i, 1), ((java.util.) (obj)).getValue());
            }
        }
        return false;
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

    public boolean equals(Object obj)
    {
        return zzkv.equalsSetHelper(this, obj);
    }

    public int hashCode()
    {
        int j = zzabx.colGetSize() - 1;
        int i = 0;
        while (j >= 0) 
        {
            Object obj = zzabx.colGetEntry(j, 0);
            Object obj1 = zzabx.colGetEntry(j, 1);
            int k;
            int l;
            if (obj == null)
            {
                k = 0;
            } else
            {
                k = obj.hashCode();
            }
            if (obj1 == null)
            {
                l = 0;
            } else
            {
                l = obj1.hashCode();
            }
            j--;
            i += l ^ k;
        }
        return i;
    }

    public boolean isEmpty()
    {
        return zzabx.colGetSize() == 0;
    }

    public Iterator iterator()
    {
        return new <init>(zzabx);
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return zzabx.colGetSize();
    }

    public Object[] toArray()
    {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray(Object aobj[])
    {
        throw new UnsupportedOperationException();
    }

    (zzkv zzkv1)
    {
        zzabx = zzkv1;
        super();
    }
}
