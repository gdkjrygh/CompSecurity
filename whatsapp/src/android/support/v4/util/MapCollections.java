// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.util:
//            LruCache

abstract class MapCollections
{

    EntrySet mEntrySet;
    KeySet mKeySet;
    ValuesCollection mValues;

    MapCollections()
    {
    }

    public static boolean containsAllHelper(Map map, Collection collection)
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

    public static boolean equalsSetHelper(Set set, Object obj)
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
        set;
        try
        {
            throw set;
        }
        // Misplaced declaration of an exception variable
        catch (Set set) { }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        throw set;
        set;
        return false;
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static boolean removeAllHelper(Map map, Collection collection)
    {
        boolean flag = LruCache.a;
        int i = map.size();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            map.remove(collection.next());
        } while (!flag);
        int j;
        try
        {
            j = map.size();
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map;
        }
        return i != j;
    }

    public static boolean retainAllHelper(Map map, Collection collection)
    {
        boolean flag = LruCache.a;
        int i = map.size();
        Iterator iterator = map.keySet().iterator();
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (collection.contains(iterator.next()));
            iterator.remove();
        } while (!flag);
        int j;
        try
        {
            j = map.size();
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map;
        }
        return i != j;
    }

    protected abstract void colClear();

    protected abstract Object colGetEntry(int i, int j);

    protected abstract Map colGetMap();

    protected abstract int colGetSize();

    protected abstract int colIndexOfKey(Object obj);

    protected abstract int colIndexOfValue(Object obj);

    protected abstract void colPut(Object obj, Object obj1);

    protected abstract void colRemoveAt(int i);

    protected abstract Object colSetValue(int i, Object obj);

    public Set getEntrySet()
    {
        try
        {
            if (mEntrySet == null)
            {
                mEntrySet = new EntrySet();
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return mEntrySet;
    }

    public Set getKeySet()
    {
        try
        {
            if (mKeySet == null)
            {
                mKeySet = new KeySet();
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return mKeySet;
    }

    public Collection getValues()
    {
        try
        {
            if (mValues == null)
            {
                mValues = new ValuesCollection();
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return mValues;
    }

    public Object[] toArrayHelper(int i)
    {
        boolean flag = LruCache.a;
        int k = colGetSize();
        Object aobj[] = new Object[k];
        int j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            aobj[j] = colGetEntry(j, i);
            j++;
        } while (!flag);
        return aobj;
    }

    public Object[] toArrayHelper(Object aobj[], int i)
    {
        int k;
        boolean flag = LruCache.a;
        k = colGetSize();
        if (aobj.length < k)
        {
            aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), k);
        }
        int j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            aobj[j] = colGetEntry(j, i);
            j++;
        } while (!flag);
        if (aobj.length > k)
        {
            aobj[k] = null;
        }
        return aobj;
        aobj;
        throw aobj;
    }

    private class EntrySet
        implements Set
    {

        final MapCollections this$0;

        public boolean add(Object obj)
        {
            return add((java.util.Map.Entry)obj);
        }

        public boolean add(java.util.Map.Entry entry)
        {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection)
        {
            boolean flag = LruCache.a;
            int i = colGetSize();
            collection = collection.iterator();
            do
            {
                if (!collection.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)collection.next();
                colPut(entry.getKey(), entry.getValue());
            } while (!flag);
            int j;
            try
            {
                j = colGetSize();
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                throw collection;
            }
            return i != j;
        }

        public void clear()
        {
            colClear();
        }

        public boolean contains(Object obj)
        {
            boolean flag;
            try
            {
                flag = obj instanceof java.util.Map.Entry;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag)
            {
                obj = (java.util.Map.Entry)obj;
                int i = colIndexOfKey(((java.util.Map.Entry) (obj)).getKey());
                if (i >= 0)
                {
                    return ContainerHelpers.equal(colGetEntry(i, 1), ((java.util.Map.Entry) (obj)).getValue());
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
                        Object obj1 = colGetEntry(j, 1);
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
                        i += l ^ k;
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
            return new MapIterator();
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
            return colGetSize();
        }

        public Object[] toArray()
        {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray(Object aobj[])
        {
            throw new UnsupportedOperationException();
        }

        EntrySet()
        {
            this$0 = MapCollections.this;
            super();
        }

        private class MapIterator
            implements Iterator, java.util.Map.Entry
        {

            private static final String z[];
            int mEnd;
            boolean mEntryValid;
            int mIndex;
            final MapCollections this$0;

            public final boolean equals(Object obj)
            {
                boolean flag;
                flag = true;
                try
                {
                    if (!mEntryValid)
                    {
                        throw new IllegalStateException(z[1]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                boolean flag1;
                try
                {
                    flag1 = obj instanceof java.util.Map.Entry;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (!flag1)
                {
                    return false;
                }
                obj = (java.util.Map.Entry)obj;
                try
                {
                    flag1 = ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getKey(), colGetEntry(mIndex, 0));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    try
                    {
                        throw obj;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                }
                if (!flag1)
                {
                    break MISSING_BLOCK_LABEL_103;
                }
                if (ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getValue(), colGetEntry(mIndex, 1)))
                {
                    break MISSING_BLOCK_LABEL_105;
                }
                flag = false;
                return flag;
            }

            public Object getKey()
            {
                try
                {
                    if (!mEntryValid)
                    {
                        throw new IllegalStateException(z[2]);
                    }
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                return colGetEntry(mIndex, 0);
            }

            public Object getValue()
            {
                try
                {
                    if (!mEntryValid)
                    {
                        throw new IllegalStateException(z[3]);
                    }
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                return colGetEntry(mIndex, 1);
            }

            public boolean hasNext()
            {
                int i;
                int j;
                try
                {
                    i = mIndex;
                    j = mEnd;
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                return i < j;
            }

            public final int hashCode()
            {
                int j = 0;
                try
                {
                    if (!mEntryValid)
                    {
                        throw new IllegalStateException(z[0]);
                    }
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                Object obj = colGetEntry(mIndex, 0);
                Object obj1 = colGetEntry(mIndex, 1);
                int i;
                if (obj == null)
                {
                    i = 0;
                } else
                {
                    i = obj.hashCode();
                }
                if (obj1 != null)
                {
                    j = obj1.hashCode();
                }
                return j ^ i;
            }

            public Object next()
            {
                return next();
            }

            public java.util.Map.Entry next()
            {
                mIndex = mIndex + 1;
                mEntryValid = true;
                return this;
            }

            public void remove()
            {
                try
                {
                    if (!mEntryValid)
                    {
                        throw new IllegalStateException();
                    }
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                colRemoveAt(mIndex);
                mIndex = mIndex - 1;
                mEnd = mEnd - 1;
                mEntryValid = false;
            }

            public Object setValue(Object obj)
            {
                try
                {
                    if (!mEntryValid)
                    {
                        throw new IllegalStateException(z[4]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                return colSetValue(mIndex, obj);
            }

            public final String toString()
            {
                return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
            }

            static 
            {
                String as[];
                byte byte0;
                int i;
                as = new String[5];
                byte0 = -1;
                i = 0;
_L2:
                String as1[];
                Object obj;
                int j;
                int k;
                as1 = as;
                obj = "!\025E\036J\026\022B\031\013\034\023I\037J\021\022I\036J\033\022XM\031\000\r\\\002\030\001]^\b\036\024\024B\004\004\022]a\f\032[8B\031\030\f]C\017\000\020\036X\036".toCharArray();
                k = obj.length;
                j = 0;
_L8:
label0:
                {
                    if (k > j)
                    {
                        break label0;
                    }
                    obj = (new String(((char []) (obj)))).intern();
                    switch (byte0)
                    {
                    default:
                        as1[i] = ((String) (obj));
                        i = 1;
                        byte0 = 0;
                        break;

                    case 0: // '\0'
                        as1[i] = ((String) (obj));
                        i = 2;
                        byte0 = 1;
                        break;

                    case 1: // '\001'
                        as1[i] = ((String) (obj));
                        i = 3;
                        byte0 = 2;
                        break;

                    case 2: // '\002'
                        as1[i] = ((String) (obj));
                        i = 4;
                        byte0 = 3;
                        break;

                    case 3: // '\003'
                        as1[i] = ((String) (obj));
                        z = as;
                        return;
                    }
                }
                if (true) goto _L2; else goto _L1
_L1:
                char c = obj[j];
                j % 5;
                JVM INSTR tableswitch 0 3: default 180
            //                           0 203
            //                           1 210
            //                           2 217
            //                           3 224;
                   goto _L3 _L4 _L5 _L6 _L7
_L7:
                break MISSING_BLOCK_LABEL_224;
_L3:
                byte byte1 = 106;
_L9:
                obj[j] = (char)(byte1 ^ c);
                j++;
                  goto _L8
_L4:
                byte1 = 117;
                  goto _L9
_L5:
                byte1 = 125;
                  goto _L9
_L6:
                byte1 = 44;
                  goto _L9
                byte1 = 109;
                  goto _L9
            }

            MapIterator()
            {
                this$0 = MapCollections.this;
                super();
                mEntryValid = false;
                mEnd = colGetSize() - 1;
                mIndex = -1;
            }
        }

    }


    private class KeySet
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
            return new ArrayIterator(0);
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

        KeySet()
        {
            this$0 = MapCollections.this;
            super();
        }

        private class ArrayIterator
            implements Iterator
        {

            boolean mCanRemove;
            int mIndex;
            final int mOffset;
            int mSize;
            final MapCollections this$0;

            public boolean hasNext()
            {
                int i;
                int j;
                try
                {
                    i = mIndex;
                    j = mSize;
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                return i < j;
            }

            public Object next()
            {
                Object obj = colGetEntry(mIndex, mOffset);
                mIndex = mIndex + 1;
                mCanRemove = true;
                return obj;
            }

            public void remove()
            {
                try
                {
                    if (!mCanRemove)
                    {
                        throw new IllegalStateException();
                    }
                }
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
                mIndex = mIndex - 1;
                mSize = mSize - 1;
                mCanRemove = false;
                colRemoveAt(mIndex);
            }

            ArrayIterator(int i)
            {
                this$0 = MapCollections.this;
                super();
                mCanRemove = false;
                mOffset = i;
                mSize = colGetSize();
            }
        }

    }


    private class ValuesCollection
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
            return new ArrayIterator(1);
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

        ValuesCollection()
        {
            this$0 = MapCollections.this;
            super();
        }
    }

}
