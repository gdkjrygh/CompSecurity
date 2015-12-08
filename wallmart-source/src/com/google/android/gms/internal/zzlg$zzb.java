// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzlg, zzle

final class zzaeH
    implements Set
{

    final zzlg zzaeH;

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
        int i = zzaeH.colGetSize();
        java.util. ;
        for (collection = collection.iterator(); collection.hasNext(); zzaeH.colPut(.getKey(), .getValue()))
        {
             = (java.util.)collection.next();
        }

        return i != zzaeH.colGetSize();
    }

    public void clear()
    {
        zzaeH.colClear();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof java.util.)
        {
            obj = (java.util.)obj;
            int i = zzaeH.colIndexOfKey(((java.util.) (obj)).getKey());
            if (i >= 0)
            {
                return zzle.equal(zzaeH.colGetEntry(i, 1), ((java.util.) (obj)).getValue());
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
        return zzlg.equalsSetHelper(this, obj);
    }

    public int hashCode()
    {
        int j = zzaeH.colGetSize() - 1;
        int i = 0;
        while (j >= 0) 
        {
            Object obj = zzaeH.colGetEntry(j, 0);
            Object obj1 = zzaeH.colGetEntry(j, 1);
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
        return zzaeH.colGetSize() == 0;
    }

    public Iterator iterator()
    {
        return new <init>(zzaeH);
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
        return zzaeH.colGetSize();
    }

    public Object[] toArray()
    {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray(Object aobj[])
    {
        throw new UnsupportedOperationException();
    }

    (zzlg zzlg1)
    {
        zzaeH = zzlg1;
        super();
    }
}
