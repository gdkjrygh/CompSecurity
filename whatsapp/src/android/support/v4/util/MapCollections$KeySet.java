// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.util:
//            MapCollections, LruCache

final class this._cls0
    implements Set
{

    final MapCollections this$0;

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
        colClear();
    }

    public boolean contains(Object obj)
    {
        int i;
        try
        {
            i = colIndexOfKey(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return i >= 0;
    }

    public boolean containsAll(Collection collection)
    {
        return MapCollections.containsAllHelper(colGetMap(), collection);
    }

    public boolean equals(Object obj)
    {
        return MapCollections.equalsSetHelper(this, obj);
    }

    public int hashCode()
    {
        boolean flag = LruCache.a;
        int j = colGetSize() - 1;
        int i = 0;
        do
        {
label0:
            {
                int k = i;
                if (j >= 0)
                {
                    Object obj = colGetEntry(j, 0);
                    if (obj == null)
                    {
                        k = 0;
                    } else
                    {
                        k = obj.hashCode();
                    }
                    i += k;
                    if (!flag)
                    {
                        break label0;
                    }
                    k = i;
                }
                return k;
            }
            j--;
        } while (true);
    }

    public boolean isEmpty()
    {
        int i;
        try
        {
            i = colGetSize();
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            throw unsupportedoperationexception;
        }
        return i == 0;
    }

    public Iterator iterator()
    {
        return new erator(MapCollections.this, 0);
    }

    public boolean remove(Object obj)
    {
        int i = colIndexOfKey(obj);
        if (i >= 0)
        {
            try
            {
                colRemoveAt(i);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        return MapCollections.removeAllHelper(colGetMap(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return MapCollections.retainAllHelper(colGetMap(), collection);
    }

    public int size()
    {
        return colGetSize();
    }

    public Object[] toArray()
    {
        return toArrayHelper(0);
    }

    public Object[] toArray(Object aobj[])
    {
        return toArrayHelper(aobj, 0);
    }

    erator()
    {
        this$0 = MapCollections.this;
        super();
    }
}
