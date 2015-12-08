// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.collect:
//            AllEqualOrdering, CompoundOrdering, Lists, ExplicitOrdering, 
//            ComparatorOrdering, NaturalOrdering, ObjectArrays, UsingToStringOrdering, 
//            Iterables, ImmutableList, CollectPreconditions, LexicographicalOrdering, 
//            NullsFirstOrdering, NullsLastOrdering, Maps, ByFunctionOrdering, 
//            ReverseOrdering, MapMaker, Platform

public abstract class Ordering
    implements Comparator
{
    static class ArbitraryOrdering extends Ordering
    {

        private Map uids;

        public int compare(Object obj, Object obj1)
        {
            byte byte0 = -1;
            int i;
            if (obj == obj1)
            {
                i = 0;
            } else
            {
                i = byte0;
                if (obj != null)
                {
                    if (obj1 == null)
                    {
                        return 1;
                    }
                    int k = identityHashCode(obj);
                    int l = identityHashCode(obj1);
                    if (k != l)
                    {
                        i = byte0;
                        if (k >= l)
                        {
                            return 1;
                        }
                    } else
                    {
                        int j = ((Integer)uids.get(obj)).compareTo((Integer)uids.get(obj1));
                        if (j == 0)
                        {
                            throw new AssertionError();
                        } else
                        {
                            return j;
                        }
                    }
                }
            }
            return i;
        }

        int identityHashCode(Object obj)
        {
            return System.identityHashCode(obj);
        }

        public String toString()
        {
            return "Ordering.arbitrary()";
        }

        ArbitraryOrdering()
        {
            uids = Platform.tryWeakKeys(new MapMaker()).makeComputingMap(new _cls1());
        }
    }

    private static class ArbitraryOrderingHolder
    {

        static final Ordering ARBITRARY_ORDERING = new ArbitraryOrdering();


        private ArbitraryOrderingHolder()
        {
        }
    }

    static class IncomparableValueException extends ClassCastException
    {

        private static final long serialVersionUID = 0L;
        final Object value;

        IncomparableValueException(Object obj)
        {
            String s = String.valueOf(String.valueOf(obj));
            super((new StringBuilder(s.length() + 22)).append("Cannot compare value: ").append(s).toString());
            value = obj;
        }
    }


    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    protected Ordering()
    {
    }

    public static Ordering allEqual()
    {
        return AllEqualOrdering.INSTANCE;
    }

    public static Ordering arbitrary()
    {
        return ArbitraryOrderingHolder.ARBITRARY_ORDERING;
    }

    public static Ordering compound(Iterable iterable)
    {
        return new CompoundOrdering(iterable);
    }

    public static transient Ordering explicit(Object obj, Object aobj[])
    {
        return explicit(Lists.asList(obj, aobj));
    }

    public static Ordering explicit(List list)
    {
        return new ExplicitOrdering(list);
    }

    public static Ordering from(Ordering ordering)
    {
        return (Ordering)Preconditions.checkNotNull(ordering);
    }

    public static Ordering from(Comparator comparator)
    {
        if (comparator instanceof Ordering)
        {
            return (Ordering)comparator;
        } else
        {
            return new ComparatorOrdering(comparator);
        }
    }

    public static Ordering natural()
    {
        return NaturalOrdering.INSTANCE;
    }

    private int partition(Object aobj[], int i, int j, int k)
    {
        Object obj = aobj[k];
        aobj[k] = aobj[j];
        aobj[j] = obj;
        int l;
        for (k = i; i < j; k = l)
        {
            l = k;
            if (compare(aobj[i], obj) < 0)
            {
                ObjectArrays.swap(aobj, k, i);
                l = k + 1;
            }
            i++;
        }

        ObjectArrays.swap(aobj, j, k);
        return k;
    }

    public static Ordering usingToString()
    {
        return UsingToStringOrdering.INSTANCE;
    }

    public int binarySearch(List list, Object obj)
    {
        return Collections.binarySearch(list, obj, this);
    }

    public abstract int compare(Object obj, Object obj1);

    public Ordering compound(Comparator comparator)
    {
        return new CompoundOrdering(this, (Comparator)Preconditions.checkNotNull(comparator));
    }

    public List greatestOf(Iterable iterable, int i)
    {
        return reverse().leastOf(iterable, i);
    }

    public List greatestOf(Iterator iterator, int i)
    {
        return reverse().leastOf(iterator, i);
    }

    public ImmutableList immutableSortedCopy(Iterable iterable)
    {
        iterable = ((Iterable) ((Object[])Iterables.toArray(iterable)));
        int j = iterable.length;
        for (int i = 0; i < j; i++)
        {
            Preconditions.checkNotNull(iterable[i]);
        }

        Arrays.sort(iterable, this);
        return ImmutableList.asImmutableList(iterable);
    }

    public boolean isOrdered(Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext())
        {
            Object obj;
            for (iterable = ((Iterable) (iterator.next())); iterator.hasNext(); iterable = ((Iterable) (obj)))
            {
                obj = iterator.next();
                if (compare(iterable, obj) > 0)
                {
                    return false;
                }
            }

        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext())
        {
            Object obj;
            for (iterable = ((Iterable) (iterator.next())); iterator.hasNext(); iterable = ((Iterable) (obj)))
            {
                obj = iterator.next();
                if (compare(iterable, obj) >= 0)
                {
                    return false;
                }
            }

        }
        return true;
    }

    public List leastOf(Iterable iterable, int i)
    {
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            if ((long)collection.size() <= 2L * (long)i)
            {
                Object aobj[] = (Object[])collection.toArray();
                Arrays.sort(aobj, this);
                iterable = ((Iterable) (aobj));
                if (aobj.length > i)
                {
                    iterable = ((Iterable) (ObjectArrays.arraysCopyOf(aobj, i)));
                }
                return Collections.unmodifiableList(Arrays.asList(iterable));
            }
        }
        return leastOf(iterable.iterator(), i);
    }

    public List leastOf(Iterator iterator, int i)
    {
        Object obj3;
        Object aobj[];
        int j;
        int l1;
        Preconditions.checkNotNull(iterator);
        CollectPreconditions.checkNonnegative(i, "k");
        if (i == 0 || !iterator.hasNext())
        {
            return ImmutableList.of();
        }
        if (i >= 0x3fffffff)
        {
            iterator = Lists.newArrayList(iterator);
            Collections.sort(iterator, this);
            if (iterator.size() > i)
            {
                iterator.subList(i, iterator.size()).clear();
            }
            iterator.trimToSize();
            return Collections.unmodifiableList(iterator);
        }
        l1 = i * 2;
        aobj = (Object[])new Object[l1];
        Object obj = iterator.next();
        aobj[0] = obj;
        int k = 1;
        do
        {
            j = k;
            obj3 = obj;
            if (k >= i)
            {
                break;
            }
            j = k;
            obj3 = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            obj3 = iterator.next();
            aobj[k] = obj3;
            obj = max(obj, obj3);
            k++;
        } while (true);
          goto _L1
_L3:
        int l;
        if (iterator.hasNext())
        {
            Object obj1 = iterator.next();
            if (compare(obj1, obj3) >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            int i1 = l + 1;
            aobj[l] = obj1;
            j = i1;
            if (i1 == l1)
            {
                int j1 = 0;
                j = l1 - 1;
                l = 0;
                do
                {
                    if (j1 >= j)
                    {
                        break;
                    }
                    int k1 = partition(aobj, j1, j, j1 + j + 1 >>> 1);
                    if (k1 > i)
                    {
                        j = k1 - 1;
                        continue;
                    }
                    if (k1 >= i)
                    {
                        break;
                    }
                    j1 = Math.max(k1, j1 + 1);
                    l = k1;
                } while (true);
                j = i;
                Object obj2 = aobj[l];
                j1 = l + 1;
                do
                {
                    l = j;
                    obj3 = obj2;
                    if (j1 >= j)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    obj2 = max(obj2, aobj[j1]);
                    j1++;
                } while (true);
            }
        } else
        {
            Arrays.sort(aobj, 0, l, this);
            return Collections.unmodifiableList(Arrays.asList(ObjectArrays.arraysCopyOf(aobj, Math.min(l, i))));
        }
_L1:
        l = j;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public Ordering lexicographical()
    {
        return new LexicographicalOrdering(this);
    }

    public Object max(Iterable iterable)
    {
        return max(iterable.iterator());
    }

    public Object max(Object obj, Object obj1)
    {
        if (compare(obj, obj1) >= 0)
        {
            return obj;
        } else
        {
            return obj1;
        }
    }

    public transient Object max(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        obj = max(max(obj, obj1), obj2);
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            obj = max(obj, aobj[i]);
        }

        return obj;
    }

    public Object max(Iterator iterator)
    {
        Object obj;
        for (obj = iterator.next(); iterator.hasNext(); obj = max(obj, iterator.next())) { }
        return obj;
    }

    public Object min(Iterable iterable)
    {
        return min(iterable.iterator());
    }

    public Object min(Object obj, Object obj1)
    {
        if (compare(obj, obj1) <= 0)
        {
            return obj;
        } else
        {
            return obj1;
        }
    }

    public transient Object min(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        obj = min(min(obj, obj1), obj2);
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            obj = min(obj, aobj[i]);
        }

        return obj;
    }

    public Object min(Iterator iterator)
    {
        Object obj;
        for (obj = iterator.next(); iterator.hasNext(); obj = min(obj, iterator.next())) { }
        return obj;
    }

    public Ordering nullsFirst()
    {
        return new NullsFirstOrdering(this);
    }

    public Ordering nullsLast()
    {
        return new NullsLastOrdering(this);
    }

    Ordering onKeys()
    {
        return onResultOf(Maps.keyFunction());
    }

    public Ordering onResultOf(Function function)
    {
        return new ByFunctionOrdering(function, this);
    }

    public Ordering reverse()
    {
        return new ReverseOrdering(this);
    }

    public List sortedCopy(Iterable iterable)
    {
        iterable = ((Iterable) ((Object[])Iterables.toArray(iterable)));
        Arrays.sort(iterable, this);
        return Lists.newArrayList(Arrays.asList(iterable));
    }

    // Unreferenced inner class com/google/common/collect/Ordering$ArbitraryOrdering$1

/* anonymous class */
    class ArbitraryOrdering._cls1
        implements Function
    {

        final AtomicInteger counter = new AtomicInteger(0);
        final ArbitraryOrdering this$0;

        public Integer apply(Object obj)
        {
            return Integer.valueOf(counter.getAndIncrement());
        }

        public volatile Object apply(Object obj)
        {
            return apply(obj);
        }

            
            {
                this$0 = ArbitraryOrdering.this;
                super();
            }
    }

}
