// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, MapMaker, Iterables, Lists, 
//            Maps, CollectPreconditions, Iterators, Multiset, 
//            ForwardingSet, Collections2, Serialization, AbstractIterator, 
//            Multisets, ForwardingIterator

public final class ConcurrentHashMultiset extends AbstractMultiset
    implements Serializable
{
    private class EntrySet extends AbstractMultiset.EntrySet
    {

        final ConcurrentHashMultiset this$0;

        private List snapshot()
        {
            java.util.ArrayList arraylist = Lists.newArrayListWithExpectedSize(size());
            Iterators.addAll(arraylist, iterator());
            return arraylist;
        }

        ConcurrentHashMultiset multiset()
        {
            return ConcurrentHashMultiset.this;
        }

        volatile Multiset multiset()
        {
            return multiset();
        }

        public Object[] toArray()
        {
            return snapshot().toArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return snapshot().toArray(aobj);
        }

        private EntrySet()
        {
            this$0 = ConcurrentHashMultiset.this;
            super(ConcurrentHashMultiset.this);
        }

    }

    private static class FieldSettersHolder
    {

        static final Serialization.FieldSetter COUNT_MAP_FIELD_SETTER = Serialization.getFieldSetter(com/google/common/collect/ConcurrentHashMultiset, "countMap");


        private FieldSettersHolder()
        {
        }
    }


    private static final long serialVersionUID = 1L;
    private final transient ConcurrentMap countMap;

    ConcurrentHashMultiset(ConcurrentMap concurrentmap)
    {
        Preconditions.checkArgument(concurrentmap.isEmpty());
        countMap = concurrentmap;
    }

    public static ConcurrentHashMultiset create()
    {
        return new ConcurrentHashMultiset(new ConcurrentHashMap());
    }

    public static ConcurrentHashMultiset create(MapMaker mapmaker)
    {
        return new ConcurrentHashMultiset(mapmaker.makeMap());
    }

    public static ConcurrentHashMultiset create(Iterable iterable)
    {
        ConcurrentHashMultiset concurrenthashmultiset = create();
        Iterables.addAll(concurrenthashmultiset, iterable);
        return concurrenthashmultiset;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        objectinputstream = (ConcurrentMap)objectinputstream.readObject();
        FieldSettersHolder.COUNT_MAP_FIELD_SETTER.set(this, objectinputstream);
    }

    private List snapshot()
    {
        java.util.ArrayList arraylist = Lists.newArrayListWithExpectedSize(size());
        for (Iterator iterator1 = entrySet().iterator(); iterator1.hasNext();)
        {
            Multiset.Entry entry = (Multiset.Entry)iterator1.next();
            Object obj = entry.getElement();
            int i = entry.getCount();
            while (i > 0) 
            {
                arraylist.add(obj);
                i--;
            }
        }

        return arraylist;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(countMap);
    }

    public int add(Object obj, int i)
    {
        boolean flag;
        flag = false;
        Preconditions.checkNotNull(obj);
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j = count(obj);
_L4:
        return j;
_L2:
        AtomicInteger atomicinteger;
        AtomicInteger atomicinteger1;
        boolean flag1;
        if (i > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "Invalid occurrences: %s", new Object[] {
            Integer.valueOf(i)
        });
_L6:
        atomicinteger1 = (AtomicInteger)Maps.safeGet(countMap, obj);
        atomicinteger = atomicinteger1;
        if (atomicinteger1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        atomicinteger = (AtomicInteger)countMap.putIfAbsent(obj, new AtomicInteger(i));
        j = ((flag) ? 1 : 0);
        if (atomicinteger == null) goto _L4; else goto _L3
_L3:
        AtomicInteger atomicinteger2;
        do
        {
            j = atomicinteger.get();
            if (j == 0)
            {
                break;
            }
            try
            {
                flag1 = atomicinteger.compareAndSet(j, IntMath.checkedAdd(j, i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder(65)).append("Overflow adding ").append(i).append(" occurrences to a count of ").append(j).toString());
            }
            if (flag1)
            {
                return j;
            }
        } while (true);
        atomicinteger2 = new AtomicInteger(i);
        j = ((flag) ? 1 : 0);
        if (countMap.putIfAbsent(obj, atomicinteger2) == null) goto _L4; else goto _L5
_L5:
        if (countMap.replace(obj, atomicinteger, atomicinteger2))
        {
            return 0;
        }
          goto _L6
    }

    public volatile boolean add(Object obj)
    {
        return super.add(obj);
    }

    public volatile boolean addAll(Collection collection)
    {
        return super.addAll(collection);
    }

    public void clear()
    {
        countMap.clear();
    }

    public volatile boolean contains(Object obj)
    {
        return super.contains(obj);
    }

    public int count(Object obj)
    {
        obj = (AtomicInteger)Maps.safeGet(countMap, obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((AtomicInteger) (obj)).get();
        }
    }

    Set createElementSet()
    {
        return new ForwardingSet() {

            final ConcurrentHashMultiset this$0;
            final Set val$delegate;

            public boolean contains(Object obj)
            {
                return obj != null && Collections2.safeContains(delegate, obj);
            }

            public boolean containsAll(Collection collection)
            {
                return standardContainsAll(collection);
            }

            protected volatile Object _mthdelegate()
            {
                return _mthdelegate();
            }

            protected volatile Collection _mthdelegate()
            {
                return _mthdelegate();
            }

            protected Set _mthdelegate()
            {
                return delegate;
            }

            public boolean remove(Object obj)
            {
                return obj != null && Collections2.safeRemove(delegate, obj);
            }

            public boolean removeAll(Collection collection)
            {
                return standardRemoveAll(collection);
            }

            
            {
                this$0 = ConcurrentHashMultiset.this;
                delegate = set;
                super();
            }
        };
    }

    public Set createEntrySet()
    {
        return new EntrySet();
    }

    int distinctElements()
    {
        return countMap.size();
    }

    public volatile Set elementSet()
    {
        return super.elementSet();
    }

    Iterator entryIterator()
    {
        return new ForwardingIterator() {

            private Multiset.Entry last;
            final ConcurrentHashMultiset this$0;
            final Iterator val$readOnlyIterator;

            protected volatile Object _mthdelegate()
            {
                return _mthdelegate();
            }

            protected Iterator _mthdelegate()
            {
                return readOnlyIterator;
            }

            public Multiset.Entry next()
            {
                last = (Multiset.Entry)super.next();
                return last;
            }

            public volatile Object next()
            {
                return next();
            }

            public void remove()
            {
                boolean flag;
                if (last != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                CollectPreconditions.checkRemove(flag);
                setCount(last.getElement(), 0);
                last = null;
            }

            
            {
                this$0 = ConcurrentHashMultiset.this;
                readOnlyIterator = iterator1;
                super();
            }
        };
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public boolean isEmpty()
    {
        return countMap.isEmpty();
    }

    public volatile Iterator iterator()
    {
        return super.iterator();
    }

    public int remove(Object obj, int i)
    {
        boolean flag = false;
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j = count(obj);
_L4:
        return j;
_L2:
        AtomicInteger atomicinteger;
        boolean flag1;
        if (i > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "Invalid occurrences: %s", new Object[] {
            Integer.valueOf(i)
        });
        atomicinteger = (AtomicInteger)Maps.safeGet(countMap, obj);
        j = ((flag) ? 1 : 0);
        if (atomicinteger == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        do
        {
            int k = atomicinteger.get();
            j = ((flag) ? 1 : 0);
            if (k == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            j = Math.max(0, k - i);
            if (atomicinteger.compareAndSet(k, j))
            {
                if (j == 0)
                {
                    countMap.remove(obj, atomicinteger);
                }
                return k;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile boolean remove(Object obj)
    {
        return super.remove(obj);
    }

    public volatile boolean removeAll(Collection collection)
    {
        return super.removeAll(collection);
    }

    public boolean removeExactly(Object obj, int i)
    {
        if (i != 0)
        {
            AtomicInteger atomicinteger;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Invalid occurrences: %s", new Object[] {
                Integer.valueOf(i)
            });
            atomicinteger = (AtomicInteger)Maps.safeGet(countMap, obj);
            if (atomicinteger == null)
            {
                return false;
            }
            int j;
            int k;
            do
            {
                j = atomicinteger.get();
                if (j < i)
                {
                    return false;
                }
                k = j - i;
            } while (!atomicinteger.compareAndSet(j, k));
            if (k == 0)
            {
                countMap.remove(obj, atomicinteger);
                return true;
            }
        }
        return true;
    }

    public volatile boolean retainAll(Collection collection)
    {
        return super.retainAll(collection);
    }

    public int setCount(Object obj, int i)
    {
        Preconditions.checkNotNull(obj);
        CollectPreconditions.checkNonnegative(i, "count");
_L6:
        AtomicInteger atomicinteger;
        AtomicInteger atomicinteger1;
        atomicinteger1 = (AtomicInteger)Maps.safeGet(countMap, obj);
        atomicinteger = atomicinteger1;
        if (atomicinteger1 != null) goto _L2; else goto _L1
_L1:
        if (i != 0) goto _L4; else goto _L3
_L3:
        int j = 0;
_L8:
        return j;
_L4:
        atomicinteger1 = (AtomicInteger)countMap.putIfAbsent(obj, new AtomicInteger(i));
        atomicinteger = atomicinteger1;
        if (atomicinteger1 == null)
        {
            return 0;
        }
_L2:
        int k;
        k = atomicinteger.get();
        if (k != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == 0)
        {
            return 0;
        }
        atomicinteger1 = new AtomicInteger(i);
        if (countMap.putIfAbsent(obj, atomicinteger1) != null && !countMap.replace(obj, atomicinteger, atomicinteger1)) goto _L6; else goto _L5
_L5:
        return 0;
        if (!atomicinteger.compareAndSet(k, i)) goto _L2; else goto _L7
_L7:
        j = k;
        if (i == 0)
        {
            countMap.remove(obj, atomicinteger);
            return k;
        }
          goto _L8
    }

    public boolean setCount(Object obj, int i, int j)
    {
        AtomicInteger atomicinteger;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
        Preconditions.checkNotNull(obj);
        CollectPreconditions.checkNonnegative(i, "oldCount");
        CollectPreconditions.checkNonnegative(j, "newCount");
        atomicinteger = (AtomicInteger)Maps.safeGet(countMap, obj);
        if (atomicinteger != null) goto _L2; else goto _L1
_L1:
        if (i == 0) goto _L4; else goto _L3
_L3:
        flag = false;
_L6:
        return flag;
_L4:
        flag = flag1;
        if (j != 0)
        {
            flag = flag1;
            if (countMap.putIfAbsent(obj, new AtomicInteger(j)) != null)
            {
                return false;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        int k = atomicinteger.get();
        if (k != i)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k == 0)
        {
            if (j == 0)
            {
                countMap.remove(obj, atomicinteger);
                return true;
            }
            AtomicInteger atomicinteger1 = new AtomicInteger(j);
            if (countMap.putIfAbsent(obj, atomicinteger1) == null || countMap.replace(obj, atomicinteger, atomicinteger1))
            {
                flag = true;
            }
            return flag;
        }
        if (!atomicinteger.compareAndSet(k, j))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (j == 0)
        {
            countMap.remove(obj, atomicinteger);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        return false;
    }

    public int size()
    {
        long l = 0L;
        for (Iterator iterator1 = countMap.values().iterator(); iterator1.hasNext();)
        {
            l += ((AtomicInteger)iterator1.next()).get();
        }

        return Ints.saturatedCast(l);
    }

    public Object[] toArray()
    {
        return snapshot().toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return snapshot().toArray(aobj);
    }

    public volatile String toString()
    {
        return super.toString();
    }


    // Unreferenced inner class com/google/common/collect/ConcurrentHashMultiset$2

/* anonymous class */
    class _cls2 extends AbstractIterator
    {

        private Iterator mapEntries;
        final ConcurrentHashMultiset this$0;

        protected Multiset.Entry computeNext()
        {
            java.util.Map.Entry entry;
            int i;
            do
            {
                if (!mapEntries.hasNext())
                {
                    return (Multiset.Entry)endOfData();
                }
                entry = (java.util.Map.Entry)mapEntries.next();
                i = ((AtomicInteger)entry.getValue()).get();
            } while (i == 0);
            return Multisets.immutableEntry(entry.getKey(), i);
        }

        protected volatile Object computeNext()
        {
            return computeNext();
        }

            
            {
                this$0 = ConcurrentHashMultiset.this;
                super();
                mapEntries = countMap.entrySet().iterator();
            }
    }

}
