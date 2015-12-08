// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.math.IntMath;
import com.google.common.math.LongMath;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Iterables, HashMultiset, Multiset, CollectPreconditions, 
//            Ordering, ImmutableList, Iterators, Lists, 
//            AbstractIterator

public final class Collections2
{
    static class FilteredCollection extends AbstractCollection
    {

        final Predicate predicate;
        final Collection unfiltered;

        public boolean add(Object obj)
        {
            Preconditions.checkArgument(predicate.apply(obj));
            return unfiltered.add(obj);
        }

        public boolean addAll(Collection collection)
        {
            Object obj;
            for (Iterator iterator1 = collection.iterator(); iterator1.hasNext(); Preconditions.checkArgument(predicate.apply(obj)))
            {
                obj = iterator1.next();
            }

            return unfiltered.addAll(collection);
        }

        public void clear()
        {
            Iterables.removeIf(unfiltered, predicate);
        }

        public boolean contains(Object obj)
        {
            if (Collections2.safeContains(unfiltered, obj))
            {
                return predicate.apply(obj);
            } else
            {
                return false;
            }
        }

        public boolean containsAll(Collection collection)
        {
            return Collections2.containsAllImpl(this, collection);
        }

        FilteredCollection createCombined(Predicate predicate1)
        {
            return new FilteredCollection(unfiltered, Predicates.and(predicate, predicate1));
        }

        public boolean isEmpty()
        {
            return !Iterables.any(unfiltered, predicate);
        }

        public Iterator iterator()
        {
            return Iterators.filter(unfiltered.iterator(), predicate);
        }

        public boolean remove(Object obj)
        {
            return contains(obj) && unfiltered.remove(obj);
        }

        public boolean removeAll(Collection collection)
        {
            return Iterables.removeIf(unfiltered, Predicates.and(predicate, Predicates.in(collection)));
        }

        public boolean retainAll(Collection collection)
        {
            return Iterables.removeIf(unfiltered, Predicates.and(predicate, Predicates.not(Predicates.in(collection))));
        }

        public int size()
        {
            return Iterators.size(iterator());
        }

        public Object[] toArray()
        {
            return Lists.newArrayList(iterator()).toArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return Lists.newArrayList(iterator()).toArray(aobj);
        }

        FilteredCollection(Collection collection, Predicate predicate1)
        {
            unfiltered = collection;
            predicate = predicate1;
        }
    }

    private static final class OrderedPermutationCollection extends AbstractCollection
    {

        final Comparator comparator;
        final ImmutableList inputList;
        final int size;

        private static int calculateSize(List list, Comparator comparator1)
        {
            int i;
            int j;
            long l2;
            l2 = 1L;
            j = 1;
            i = 1;
_L6:
            if (j >= list.size()) goto _L2; else goto _L1
_L1:
            int k;
            long l;
            l = l2;
            k = i;
            if (comparator1.compare(list.get(j - 1), list.get(j)) >= 0) goto _L4; else goto _L3
_L3:
            l2 *= LongMath.binomial(j, i);
            k = 0;
            l = l2;
            if (Collections2.isPositiveInt(l2)) goto _L4; else goto _L5
_L5:
            return 0x7fffffff;
_L4:
            j++;
            i = k + 1;
            l2 = l;
              goto _L6
_L2:
            long l1 = l2 * LongMath.binomial(j, i);
            if (Collections2.isPositiveInt(l1))
            {
                return (int)l1;
            }
              goto _L5
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof List)
            {
                obj = (List)obj;
                return Collections2.isPermutation(inputList, ((List) (obj)));
            } else
            {
                return false;
            }
        }

        public boolean isEmpty()
        {
            return false;
        }

        public Iterator iterator()
        {
            return new OrderedPermutationIterator(inputList, comparator);
        }

        public int size()
        {
            return size;
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(inputList));
            return (new StringBuilder(s.length() + 30)).append("orderedPermutationCollection(").append(s).append(")").toString();
        }

        OrderedPermutationCollection(Iterable iterable, Comparator comparator1)
        {
            inputList = Ordering.from(comparator1).immutableSortedCopy(iterable);
            comparator = comparator1;
            size = calculateSize(inputList, comparator1);
        }
    }

    private static final class OrderedPermutationIterator extends AbstractIterator
    {

        final Comparator comparator;
        List nextPermutation;

        void calculateNextPermutation()
        {
            int i = findNextJ();
            if (i == -1)
            {
                nextPermutation = null;
                return;
            } else
            {
                int j = findNextL(i);
                Collections.swap(nextPermutation, i, j);
                j = nextPermutation.size();
                Collections.reverse(nextPermutation.subList(i + 1, j));
                return;
            }
        }

        protected volatile Object computeNext()
        {
            return computeNext();
        }

        protected List computeNext()
        {
            if (nextPermutation == null)
            {
                return (List)endOfData();
            } else
            {
                ImmutableList immutablelist = ImmutableList.copyOf(nextPermutation);
                calculateNextPermutation();
                return immutablelist;
            }
        }

        int findNextJ()
        {
            for (int i = nextPermutation.size() - 2; i >= 0; i--)
            {
                if (comparator.compare(nextPermutation.get(i), nextPermutation.get(i + 1)) < 0)
                {
                    return i;
                }
            }

            return -1;
        }

        int findNextL(int i)
        {
            Object obj = nextPermutation.get(i);
            for (int j = nextPermutation.size() - 1; j > i; j--)
            {
                if (comparator.compare(obj, nextPermutation.get(j)) < 0)
                {
                    return j;
                }
            }

            throw new AssertionError("this statement should be unreachable");
        }

        OrderedPermutationIterator(List list, Comparator comparator1)
        {
            nextPermutation = Lists.newArrayList(list);
            comparator = comparator1;
        }
    }

    private static final class PermutationCollection extends AbstractCollection
    {

        final ImmutableList inputList;

        public boolean contains(Object obj)
        {
            if (obj instanceof List)
            {
                obj = (List)obj;
                return Collections2.isPermutation(inputList, ((List) (obj)));
            } else
            {
                return false;
            }
        }

        public boolean isEmpty()
        {
            return false;
        }

        public Iterator iterator()
        {
            return new PermutationIterator(inputList);
        }

        public int size()
        {
            return IntMath.factorial(inputList.size());
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(inputList));
            return (new StringBuilder(s.length() + 14)).append("permutations(").append(s).append(")").toString();
        }

        PermutationCollection(ImmutableList immutablelist)
        {
            inputList = immutablelist;
        }
    }

    private static class PermutationIterator extends AbstractIterator
    {

        final int c[];
        int j;
        final List list;
        final int o[];

        void calculateNextPermutation()
        {
            int i;
            j = list.size() - 1;
            i = 0;
            if (j != -1) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int k;
label0:
            do
            {
label1:
                {
                    k = c[j] + o[j];
                    if (k < 0)
                    {
                        switchDirection();
                        continue;
                    }
                    if (k != j + 1)
                    {
                        break label1;
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                    i++;
                    switchDirection();
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
            Collections.swap(list, (j - c[j]) + i, (j - k) + i);
            c[j] = k;
            return;
        }

        protected volatile Object computeNext()
        {
            return computeNext();
        }

        protected List computeNext()
        {
            if (j <= 0)
            {
                return (List)endOfData();
            } else
            {
                ImmutableList immutablelist = ImmutableList.copyOf(list);
                calculateNextPermutation();
                return immutablelist;
            }
        }

        void switchDirection()
        {
            o[j] = -o[j];
            j = j - 1;
        }

        PermutationIterator(List list1)
        {
            list = new ArrayList(list1);
            int i = list1.size();
            c = new int[i];
            o = new int[i];
            Arrays.fill(c, 0);
            Arrays.fill(o, 1);
            j = 0x7fffffff;
        }
    }

    static class TransformedCollection extends AbstractCollection
    {

        final Collection fromCollection;
        final Function function;

        public void clear()
        {
            fromCollection.clear();
        }

        public boolean isEmpty()
        {
            return fromCollection.isEmpty();
        }

        public Iterator iterator()
        {
            return Iterators.transform(fromCollection.iterator(), function);
        }

        public int size()
        {
            return fromCollection.size();
        }

        TransformedCollection(Collection collection, Function function1)
        {
            fromCollection = (Collection)Preconditions.checkNotNull(collection);
            function = (Function)Preconditions.checkNotNull(function1);
        }
    }


    static final Joiner STANDARD_JOINER = Joiner.on(", ").useForNull("null");

    private Collections2()
    {
    }

    static Collection cast(Iterable iterable)
    {
        return (Collection)iterable;
    }

    static boolean containsAllImpl(Collection collection, Collection collection1)
    {
        return Iterables.all(collection1, Predicates.in(collection));
    }

    public static Collection filter(Collection collection, Predicate predicate)
    {
        if (collection instanceof FilteredCollection)
        {
            return ((FilteredCollection)collection).createCombined(predicate);
        } else
        {
            return new FilteredCollection((Collection)Preconditions.checkNotNull(collection), (Predicate)Preconditions.checkNotNull(predicate));
        }
    }

    private static boolean isPermutation(List list, List list1)
    {
        if (list.size() != list1.size())
        {
            return false;
        } else
        {
            return HashMultiset.create(list).equals(HashMultiset.create(list1));
        }
    }

    private static boolean isPositiveInt(long l)
    {
        return l >= 0L && l <= 0x7fffffffL;
    }

    static StringBuilder newStringBuilderForCollection(int i)
    {
        CollectPreconditions.checkNonnegative(i, "size");
        return new StringBuilder((int)Math.min((long)i * 8L, 0x40000000L));
    }

    public static Collection orderedPermutations(Iterable iterable)
    {
        return orderedPermutations(iterable, ((Comparator) (Ordering.natural())));
    }

    public static Collection orderedPermutations(Iterable iterable, Comparator comparator)
    {
        return new OrderedPermutationCollection(iterable, comparator);
    }

    public static Collection permutations(Collection collection)
    {
        return new PermutationCollection(ImmutableList.copyOf(collection));
    }

    static boolean safeContains(Collection collection, Object obj)
    {
        Preconditions.checkNotNull(collection);
        boolean flag;
        try
        {
            flag = collection.contains(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        return flag;
    }

    static boolean safeRemove(Collection collection, Object obj)
    {
        Preconditions.checkNotNull(collection);
        boolean flag;
        try
        {
            flag = collection.remove(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        return flag;
    }

    static String toStringImpl(Collection collection)
    {
        StringBuilder stringbuilder = newStringBuilderForCollection(collection.size()).append('[');
        STANDARD_JOINER.appendTo(stringbuilder, Iterables.transform(collection, new Function(collection) {

            final Collection val$collection;

            public Object apply(Object obj)
            {
                Object obj1 = obj;
                if (obj == collection)
                {
                    obj1 = "(this Collection)";
                }
                return obj1;
            }

            
            {
                collection = collection1;
                super();
            }
        }));
        return stringbuilder.append(']').toString();
    }

    public static Collection transform(Collection collection, Function function)
    {
        return new TransformedCollection(collection, function);
    }



}
