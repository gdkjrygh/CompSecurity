// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.util:
//            SimpleArrayMap, MapCollections, LruCache

public class ArrayMap extends SimpleArrayMap
    implements Map
{

    MapCollections mCollections;

    public ArrayMap()
    {
    }

    private MapCollections getCollection()
    {
        if (mCollections == null)
        {
            mCollections = new _cls1();
        }
        return mCollections;
    }

    public Set entrySet()
    {
        return getCollection().getEntrySet();
    }

    public Set keySet()
    {
        return getCollection().getKeySet();
    }

    public void putAll(Map map)
    {
        boolean flag = LruCache.a;
        ensureCapacity(mSize + map.size());
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            put(entry.getKey(), entry.getValue());
        } while (!flag);
    }

    public boolean retainAll(Collection collection)
    {
        return MapCollections.retainAllHelper(this, collection);
    }

    public Collection values()
    {
        return getCollection().getValues();
    }

    private class _cls1 extends MapCollections
    {

        final ArrayMap this$0;

        protected void colClear()
        {
            clear();
        }

        protected Object colGetEntry(int i, int j)
        {
            return mArray[(i << 1) + j];
        }

        protected Map colGetMap()
        {
            return ArrayMap.this;
        }

        protected int colGetSize()
        {
            return mSize;
        }

        protected int colIndexOfKey(Object obj)
        {
            return indexOfKey(obj);
        }

        protected int colIndexOfValue(Object obj)
        {
            return indexOfValue(obj);
        }

        protected void colPut(Object obj, Object obj1)
        {
            put(obj, obj1);
        }

        protected void colRemoveAt(int i)
        {
            removeAt(i);
        }

        protected Object colSetValue(int i, Object obj)
        {
            return setValueAt(i, obj);
        }

        _cls1()
        {
            this$0 = ArrayMap.this;
            super();
        }
    }

}
