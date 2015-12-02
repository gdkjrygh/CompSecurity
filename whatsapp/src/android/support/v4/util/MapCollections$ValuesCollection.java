// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.support.v4.util:
//            MapCollections, LruCache

final class this._cls0
    implements Collection
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
            i = colIndexOfValue(obj);
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
        return new it>(MapCollections.this, 1);
    }

    public boolean remove(Object obj)
    {
        int i = colIndexOfValue(obj);
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
        int i = 0;
        boolean flag2 = LruCache.a;
        int k = colGetSize();
        boolean flag = false;
        boolean flag1;
        do
        {
            flag1 = flag;
            if (i >= k)
            {
                break;
            }
            flag1 = flag;
            int l = i;
            int j = k;
            if (collection.contains(colGetEntry(i, 1)))
            {
                colRemoveAt(i);
                j = k - 1;
                l = i - 1;
                flag1 = true;
            }
            i = l + 1;
            flag = flag1;
            k = j;
        } while (!flag2);
        return flag1;
    }

    public boolean retainAll(Collection collection)
    {
        int i = 0;
        boolean flag2 = LruCache.a;
        int k = colGetSize();
        boolean flag = false;
        boolean flag1;
        do
        {
            flag1 = flag;
            if (i >= k)
            {
                break;
            }
            flag1 = flag;
            int l = i;
            int j = k;
            if (!collection.contains(colGetEntry(i, 1)))
            {
                colRemoveAt(i);
                j = k - 1;
                l = i - 1;
                flag1 = true;
            }
            i = l + 1;
            flag = flag1;
            k = j;
        } while (!flag2);
        return flag1;
    }

    public int size()
    {
        return colGetSize();
    }

    public Object[] toArray()
    {
        return toArrayHelper(1);
    }

    public Object[] toArray(Object aobj[])
    {
        return toArrayHelper(aobj, 1);
    }

    ()
    {
        this$0 = MapCollections.this;
        super();
    }
}
