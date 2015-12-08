// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzlg

final class zzaeH
    implements Set
{

    final zzlg zzaeH;

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
        zzaeH.colClear();
    }

    public boolean contains(Object obj)
    {
        return zzaeH.colIndexOfKey(obj) >= 0;
    }

    public boolean containsAll(Collection collection)
    {
        return zzlg.containsAllHelper(zzaeH.colGetMap(), collection);
    }

    public boolean equals(Object obj)
    {
        return zzlg.equalsSetHelper(this, obj);
    }

    public int hashCode()
    {
        int i = zzaeH.colGetSize() - 1;
        int j = 0;
        while (i >= 0) 
        {
            Object obj = zzaeH.colGetEntry(i, 0);
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
        return zzaeH.colGetSize() == 0;
    }

    public Iterator iterator()
    {
        return new <init>(zzaeH, 0);
    }

    public boolean remove(Object obj)
    {
        int i = zzaeH.colIndexOfKey(obj);
        if (i >= 0)
        {
            zzaeH.colRemoveAt(i);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        return zzlg.removeAllHelper(zzaeH.colGetMap(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return zzlg.retainAllHelper(zzaeH.colGetMap(), collection);
    }

    public int size()
    {
        return zzaeH.colGetSize();
    }

    public Object[] toArray()
    {
        return zzaeH.toArrayHelper(0);
    }

    public Object[] toArray(Object aobj[])
    {
        return zzaeH.toArrayHelper(aobj, 0);
    }

    (zzlg zzlg1)
    {
        zzaeH = zzlg1;
        super();
    }
}
