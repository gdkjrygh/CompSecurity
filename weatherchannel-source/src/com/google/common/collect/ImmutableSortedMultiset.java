// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMultisetFauxverideShim, SortedMultiset, Ordering, EmptyImmutableSortedMultiset, 
//            ImmutableSet, Lists, TreeMultiset, Iterables, 
//            RegularImmutableSortedMultiset, RegularImmutableSortedSet, ImmutableSortedSet, DescendingImmutableSortedMultiset, 
//            BoundType, ImmutableCollection, ImmutableMultiset

public abstract class ImmutableSortedMultiset extends ImmutableSortedMultisetFauxverideShim
    implements SortedMultiset
{
    public static class Builder extends ImmutableMultiset.Builder
    {

        public volatile ImmutableCollection.Builder add(Object obj)
        {
            return add(obj);
        }

        public volatile ImmutableCollection.Builder add(Object aobj[])
        {
            return add(aobj);
        }

        public volatile ImmutableMultiset.Builder add(Object obj)
        {
            return add(obj);
        }

        public volatile ImmutableMultiset.Builder add(Object aobj[])
        {
            return add(aobj);
        }

        public Builder add(Object obj)
        {
            super.add(obj);
            return this;
        }

        public transient Builder add(Object aobj[])
        {
            super.add(aobj);
            return this;
        }

        public volatile ImmutableCollection.Builder addAll(Iterable iterable)
        {
            return addAll(iterable);
        }

        public volatile ImmutableCollection.Builder addAll(Iterator iterator)
        {
            return addAll(iterator);
        }

        public volatile ImmutableMultiset.Builder addAll(Iterable iterable)
        {
            return addAll(iterable);
        }

        public volatile ImmutableMultiset.Builder addAll(Iterator iterator)
        {
            return addAll(iterator);
        }

        public Builder addAll(Iterable iterable)
        {
            super.addAll(iterable);
            return this;
        }

        public Builder addAll(Iterator iterator)
        {
            super.addAll(iterator);
            return this;
        }

        public volatile ImmutableMultiset.Builder addCopies(Object obj, int i)
        {
            return addCopies(obj, i);
        }

        public Builder addCopies(Object obj, int i)
        {
            super.addCopies(obj, i);
            return this;
        }

        public volatile ImmutableCollection build()
        {
            return build();
        }

        public volatile ImmutableMultiset build()
        {
            return build();
        }

        public ImmutableSortedMultiset build()
        {
            return ImmutableSortedMultiset.copyOfSorted((SortedMultiset)contents);
        }

        public volatile ImmutableMultiset.Builder setCount(Object obj, int i)
        {
            return setCount(obj, i);
        }

        public Builder setCount(Object obj, int i)
        {
            super.setCount(obj, i);
            return this;
        }

        public Builder(Comparator comparator1)
        {
            super(TreeMultiset.create((Comparator)Preconditions.checkNotNull(comparator1)));
        }
    }

    private static final class SerializedForm
        implements Serializable
    {

        Comparator comparator;
        int counts[];
        Object elements[];

        Object readResolve()
        {
            int j = elements.length;
            Builder builder = new Builder(comparator);
            for (int i = 0; i < j; i++)
            {
                builder.addCopies(elements[i], counts[i]);
            }

            return builder.build();
        }

        SerializedForm(SortedMultiset sortedmultiset)
        {
            comparator = sortedmultiset.comparator();
            int i = sortedmultiset.entrySet().size();
            elements = (Object[])new Object[i];
            counts = new int[i];
            i = 0;
            for (sortedmultiset = sortedmultiset.entrySet().iterator(); sortedmultiset.hasNext();)
            {
                Multiset.Entry entry = (Multiset.Entry)sortedmultiset.next();
                elements[i] = entry.getElement();
                counts[i] = entry.getCount();
                i++;
            }

        }
    }


    private static final ImmutableSortedMultiset NATURAL_EMPTY_MULTISET;
    private static final Comparator NATURAL_ORDER;
    transient ImmutableSortedMultiset descendingMultiset;

    ImmutableSortedMultiset()
    {
    }

    public static ImmutableSortedMultiset copyOf(Iterable iterable)
    {
        return copyOf(((Comparator) (Ordering.natural())), iterable);
    }

    public static ImmutableSortedMultiset copyOf(Comparator comparator1, Iterable iterable)
    {
        if (iterable instanceof ImmutableSortedMultiset)
        {
            ImmutableSortedMultiset immutablesortedmultiset = (ImmutableSortedMultiset)iterable;
            if (comparator1.equals(immutablesortedmultiset.comparator()))
            {
                iterable = immutablesortedmultiset;
                if (immutablesortedmultiset.isPartialView())
                {
                    iterable = copyOfSortedEntries(comparator1, immutablesortedmultiset.entrySet().asList());
                }
                return iterable;
            }
        }
        iterable = Lists.newArrayList(iterable);
        TreeMultiset treemultiset = TreeMultiset.create((Comparator)Preconditions.checkNotNull(comparator1));
        Iterables.addAll(treemultiset, iterable);
        return copyOfSortedEntries(comparator1, treemultiset.entrySet());
    }

    public static ImmutableSortedMultiset copyOf(Comparator comparator1, Iterator iterator)
    {
        Preconditions.checkNotNull(comparator1);
        return (new Builder(comparator1)).addAll(iterator).build();
    }

    public static ImmutableSortedMultiset copyOf(Iterator iterator)
    {
        return copyOf(((Comparator) (Ordering.natural())), iterator);
    }

    public static ImmutableSortedMultiset copyOf(Comparable acomparable[])
    {
        return copyOf(((Comparator) (Ordering.natural())), ((Iterable) (Arrays.asList(acomparable))));
    }

    public static ImmutableSortedMultiset copyOfSorted(SortedMultiset sortedmultiset)
    {
        return copyOfSortedEntries(sortedmultiset.comparator(), Lists.newArrayList(sortedmultiset.entrySet()));
    }

    private static ImmutableSortedMultiset copyOfSortedEntries(Comparator comparator1, Collection collection)
    {
        if (collection.isEmpty())
        {
            return emptyMultiset(comparator1);
        }
        ImmutableList.Builder builder = new ImmutableList.Builder(collection.size());
        int ai[] = new int[collection.size()];
        long al[] = new long[collection.size() + 1];
        int i = 0;
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            builder.add(entry.getElement());
            ai[i] = entry.getCount();
            al[i + 1] = al[i] + (long)ai[i];
            i++;
        }

        return new RegularImmutableSortedMultiset(new RegularImmutableSortedSet(builder.build(), comparator1), ai, al, 0, collection.size());
    }

    static ImmutableSortedMultiset emptyMultiset(Comparator comparator1)
    {
        if (NATURAL_ORDER.equals(comparator1))
        {
            return NATURAL_EMPTY_MULTISET;
        } else
        {
            return new EmptyImmutableSortedMultiset(comparator1);
        }
    }

    public static Builder naturalOrder()
    {
        return new Builder(Ordering.natural());
    }

    public static ImmutableSortedMultiset of()
    {
        return NATURAL_EMPTY_MULTISET;
    }

    public static ImmutableSortedMultiset of(Comparable comparable)
    {
        return new RegularImmutableSortedMultiset((RegularImmutableSortedSet)ImmutableSortedSet.of(comparable), new int[] {
            1
        }, new long[] {
            0L, 1L
        }, 0, 1);
    }

    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable1)
    {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[] {
            comparable, comparable1
        }));
    }

    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable1, Comparable comparable2)
    {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[] {
            comparable, comparable1, comparable2
        }));
    }

    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable1, Comparable comparable2, Comparable comparable3)
    {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[] {
            comparable, comparable1, comparable2, comparable3
        }));
    }

    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable1, Comparable comparable2, Comparable comparable3, Comparable comparable4)
    {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[] {
            comparable, comparable1, comparable2, comparable3, comparable4
        }));
    }

    public static transient ImmutableSortedMultiset of(Comparable comparable, Comparable comparable1, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable acomparable[])
    {
        java.util.ArrayList arraylist = Lists.newArrayListWithCapacity(acomparable.length + 6);
        Collections.addAll(arraylist, new Comparable[] {
            comparable, comparable1, comparable2, comparable3, comparable4, comparable5
        });
        Collections.addAll(arraylist, acomparable);
        return copyOf(Ordering.natural(), arraylist);
    }

    public static Builder orderedBy(Comparator comparator1)
    {
        return new Builder(comparator1);
    }

    public static Builder reverseOrder()
    {
        return new Builder(Ordering.natural().reverse());
    }

    public final Comparator comparator()
    {
        return elementSet().comparator();
    }

    public ImmutableSortedMultiset descendingMultiset()
    {
        ImmutableSortedMultiset immutablesortedmultiset = descendingMultiset;
        Object obj = immutablesortedmultiset;
        if (immutablesortedmultiset == null)
        {
            obj = new DescendingImmutableSortedMultiset(this);
            descendingMultiset = ((ImmutableSortedMultiset) (obj));
        }
        return ((ImmutableSortedMultiset) (obj));
    }

    public volatile SortedMultiset descendingMultiset()
    {
        return descendingMultiset();
    }

    public abstract ImmutableSortedSet elementSet();

    public volatile NavigableSet elementSet()
    {
        return elementSet();
    }

    public volatile Set elementSet()
    {
        return elementSet();
    }

    public volatile SortedSet elementSet()
    {
        return elementSet();
    }

    public abstract ImmutableSortedMultiset headMultiset(Object obj, BoundType boundtype);

    public volatile SortedMultiset headMultiset(Object obj, BoundType boundtype)
    {
        return headMultiset(obj, boundtype);
    }

    public final Multiset.Entry pollFirstEntry()
    {
        throw new UnsupportedOperationException();
    }

    public final Multiset.Entry pollLastEntry()
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableSortedMultiset subMultiset(Object obj, BoundType boundtype, Object obj1, BoundType boundtype1)
    {
        boolean flag;
        if (comparator().compare(obj, obj1) <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Expected lowerBound <= upperBound but %s > %s", new Object[] {
            obj, obj1
        });
        return tailMultiset(obj, boundtype).headMultiset(obj1, boundtype1);
    }

    public volatile SortedMultiset subMultiset(Object obj, BoundType boundtype, Object obj1, BoundType boundtype1)
    {
        return subMultiset(obj, boundtype, obj1, boundtype1);
    }

    public abstract ImmutableSortedMultiset tailMultiset(Object obj, BoundType boundtype);

    public volatile SortedMultiset tailMultiset(Object obj, BoundType boundtype)
    {
        return tailMultiset(obj, boundtype);
    }

    Object writeReplace()
    {
        return new SerializedForm(this);
    }

    static 
    {
        NATURAL_ORDER = Ordering.natural();
        NATURAL_EMPTY_MULTISET = new EmptyImmutableSortedMultiset(NATURAL_ORDER);
    }
}
