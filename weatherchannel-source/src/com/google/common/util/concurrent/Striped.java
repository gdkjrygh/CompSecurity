// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class Striped
{
    private static class CompactStriped extends PowerOfTwoStriped
    {

        private final Object array[];

        public Object getAt(int i)
        {
            return array[i];
        }

        public int size()
        {
            return array.length;
        }

        private CompactStriped(int i, Supplier supplier)
        {
            super(i);
            boolean flag;
            if (i <= 0x40000000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Stripes must be <= 2^30)");
            array = new Object[mask + 1];
            for (i = 0; i < array.length; i++)
            {
                array[i] = supplier.get();
            }

        }

    }

    static class LargeLazyStriped extends PowerOfTwoStriped
    {

        final ConcurrentMap locks = (new MapMaker()).weakValues().makeMap();
        final int size;
        final Supplier supplier;

        public Object getAt(int i)
        {
            if (size != 0x7fffffff)
            {
                Preconditions.checkElementIndex(i, size());
            }
            Object obj = locks.get(Integer.valueOf(i));
            if (obj != null)
            {
                return obj;
            } else
            {
                Object obj1 = supplier.get();
                return MoreObjects.firstNonNull(locks.putIfAbsent(Integer.valueOf(i), obj1), obj1);
            }
        }

        public int size()
        {
            return size;
        }

        LargeLazyStriped(int i, Supplier supplier1)
        {
            super(i);
            if (mask == -1)
            {
                i = 0x7fffffff;
            } else
            {
                i = mask + 1;
            }
            size = i;
            supplier = supplier1;
        }
    }

    private static class PaddedLock extends ReentrantLock
    {

        long q1;
        long q2;
        long q3;

        PaddedLock()
        {
            super(false);
        }
    }

    private static class PaddedSemaphore extends Semaphore
    {

        long q1;
        long q2;
        long q3;

        PaddedSemaphore(int i)
        {
            super(i, false);
        }
    }

    private static abstract class PowerOfTwoStriped extends Striped
    {

        final int mask;

        public final Object get(Object obj)
        {
            return getAt(indexFor(obj));
        }

        final int indexFor(Object obj)
        {
            int i = Striped.smear(obj.hashCode());
            return mask & i;
        }

        PowerOfTwoStriped(int i)
        {
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Stripes must be positive");
            if (i > 0x40000000)
            {
                i = -1;
            } else
            {
                i = Striped.ceilToPowerOfTwo(i) - 1;
            }
            mask = i;
        }
    }

    static class SmallLazyStriped extends PowerOfTwoStriped
    {

        final AtomicReferenceArray locks;
        final ReferenceQueue queue = new ReferenceQueue();
        final int size;
        final Supplier supplier;

        private void drainQueue()
        {
            do
            {
                Object obj = queue.poll();
                if (obj != null)
                {
                    obj = (ArrayReference)obj;
                    locks.compareAndSet(((ArrayReference) (obj)).index, obj, null);
                } else
                {
                    return;
                }
            } while (true);
        }

        public Object getAt(int i)
        {
            if (size != 0x7fffffff)
            {
                Preconditions.checkElementIndex(i, size());
            }
            ArrayReference arrayreference = (ArrayReference)locks.get(i);
            Object obj;
            if (arrayreference == null)
            {
                obj = null;
            } else
            {
                obj = arrayreference.get();
            }
            if (obj != null)
            {
                return obj;
            }
            Object obj2 = supplier.get();
            for (ArrayReference arrayreference1 = new ArrayReference(obj2, i, queue); !locks.compareAndSet(i, arrayreference, arrayreference1);)
            {
                arrayreference = (ArrayReference)locks.get(i);
                Object obj1;
                if (arrayreference == null)
                {
                    obj1 = null;
                } else
                {
                    obj1 = arrayreference.get();
                }
                if (obj1 != null)
                {
                    return obj1;
                }
            }

            drainQueue();
            return obj2;
        }

        public int size()
        {
            return size;
        }

        SmallLazyStriped(int i, Supplier supplier1)
        {
            super(i);
            if (mask == -1)
            {
                i = 0x7fffffff;
            } else
            {
                i = mask + 1;
            }
            size = i;
            locks = new AtomicReferenceArray(size);
            supplier = supplier1;
        }
    }

    private static final class SmallLazyStriped.ArrayReference extends WeakReference
    {

        final int index;

        SmallLazyStriped.ArrayReference(Object obj, int i, ReferenceQueue referencequeue)
        {
            super(obj, referencequeue);
            index = i;
        }
    }


    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;
    private static final Supplier READ_WRITE_LOCK_SUPPLIER = new Supplier() {

        public volatile Object get()
        {
            return get();
        }

        public ReadWriteLock get()
        {
            return new ReentrantReadWriteLock();
        }

    };

    private Striped()
    {
    }


    private static int ceilToPowerOfTwo(int i)
    {
        return 1 << IntMath.log2(i, RoundingMode.CEILING);
    }

    private static Striped lazy(int i, Supplier supplier)
    {
        if (i < 1024)
        {
            return new SmallLazyStriped(i, supplier);
        } else
        {
            return new LargeLazyStriped(i, supplier);
        }
    }

    public static Striped lazyWeakLock(int i)
    {
        return lazy(i, new Supplier() {

            public volatile Object get()
            {
                return get();
            }

            public Lock get()
            {
                return new ReentrantLock(false);
            }

        });
    }

    public static Striped lazyWeakReadWriteLock(int i)
    {
        return lazy(i, READ_WRITE_LOCK_SUPPLIER);
    }

    public static Striped lazyWeakSemaphore(int i, int j)
    {
        return lazy(i, new Supplier(j) {

            final int val$permits;

            public volatile Object get()
            {
                return get();
            }

            public Semaphore get()
            {
                return new Semaphore(permits, false);
            }

            
            {
                permits = i;
                super();
            }
        });
    }

    public static Striped lock(int i)
    {
        return new CompactStriped(i, new Supplier() {

            public volatile Object get()
            {
                return get();
            }

            public Lock get()
            {
                return new PaddedLock();
            }

        });
    }

    public static Striped readWriteLock(int i)
    {
        return new CompactStriped(i, READ_WRITE_LOCK_SUPPLIER);
    }

    public static Striped semaphore(int i, int j)
    {
        return new CompactStriped(i, new Supplier(j) {

            final int val$permits;

            public volatile Object get()
            {
                return get();
            }

            public Semaphore get()
            {
                return new PaddedSemaphore(permits);
            }

            
            {
                permits = i;
                super();
            }
        });
    }

    private static int smear(int i)
    {
        i ^= i >>> 20 ^ i >>> 12;
        return i >>> 7 ^ i ^ i >>> 4;
    }

    public Iterable bulkGet(Iterable iterable)
    {
        iterable = ((Iterable) (Iterables.toArray(iterable, java/lang/Object)));
        if (iterable.length == 0)
        {
            return ImmutableList.of();
        }
        int ai[] = new int[iterable.length];
        for (int i = 0; i < iterable.length; i++)
        {
            ai[i] = indexFor(iterable[i]);
        }

        Arrays.sort(ai);
        int k = ai[0];
        iterable[0] = getAt(k);
        int j = 1;
        while (j < iterable.length) 
        {
            int l = ai[j];
            if (l == k)
            {
                iterable[j] = iterable[j - 1];
            } else
            {
                iterable[j] = getAt(l);
                k = l;
            }
            j++;
        }
        return Collections.unmodifiableList(Arrays.asList(iterable));
    }

    public abstract Object get(Object obj);

    public abstract Object getAt(int i);

    abstract int indexFor(Object obj);

    public abstract int size();



}
