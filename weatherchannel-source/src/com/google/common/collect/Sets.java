// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.common.collect:
//            Platform, ImmutableEnumSet, ImmutableSet, Iterators, 
//            Iterables, Collections2, Lists, Maps, 
//            Multiset, Synchronized, ImmutableSortedSet, ForwardingCollection, 
//            CartesianList, ImmutableList, ForwardingNavigableSet, Ordering, 
//            ImmutableMap, AbstractIndexedListIterator, UnmodifiableIterator, ForwardingSortedSet

public final class Sets
{
    private static final class CartesianSet extends ForwardingCollection
        implements Set
    {

        private final transient ImmutableList axes;
        private final transient CartesianList _flddelegate;

        static Set create(List list)
        {
            ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
            ImmutableSet immutableset;
            for (list = list.iterator(); list.hasNext(); builder.add(immutableset))
            {
                immutableset = ImmutableSet.copyOf((Set)list.next());
                if (immutableset.isEmpty())
                {
                    return ImmutableSet.of();
                }
            }

            list = builder.build();
            return new CartesianSet(list, new CartesianList(new ImmutableList(list) {

                final ImmutableList val$axes;

                public volatile Object get(int i)
                {
                    return get(i);
                }

                public List get(int i)
                {
                    return ((ImmutableSet)axes.get(i)).asList();
                }

                boolean isPartialView()
                {
                    return true;
                }

                public int size()
                {
                    return axes.size();
                }

            
            {
                axes = immutablelist;
                super();
            }
            }));
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Collection _mthdelegate()
        {
            return _flddelegate;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof CartesianSet)
            {
                obj = (CartesianSet)obj;
                return axes.equals(((CartesianSet) (obj)).axes);
            } else
            {
                return super.equals(obj);
            }
        }

        public int hashCode()
        {
            int i = size() - 1;
            for (int j = 0; j < axes.size(); j++)
            {
                i = ~~(i * 31);
            }

            int k = 1;
            for (Iterator iterator = axes.iterator(); iterator.hasNext();)
            {
                Set set = (Set)iterator.next();
                k = ~~(k * 31 + (size() / set.size()) * set.hashCode());
            }

            return ~~(k + i);
        }

        private CartesianSet(ImmutableList immutablelist, CartesianList cartesianlist)
        {
            axes = immutablelist;
            _flddelegate = cartesianlist;
        }
    }

    static class DescendingSet extends ForwardingNavigableSet
    {

        private final NavigableSet forward;

        private static Ordering reverse(Comparator comparator1)
        {
            return Ordering.from(comparator1).reverse();
        }

        public Object ceiling(Object obj)
        {
            return forward.floor(obj);
        }

        public Comparator comparator()
        {
            Comparator comparator1 = forward.comparator();
            if (comparator1 == null)
            {
                return Ordering.natural().reverse();
            } else
            {
                return reverse(comparator1);
            }
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected NavigableSet _mthdelegate()
        {
            return forward;
        }

        protected volatile Set _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile SortedSet _mthdelegate()
        {
            return _mthdelegate();
        }

        public Iterator descendingIterator()
        {
            return forward.iterator();
        }

        public NavigableSet descendingSet()
        {
            return forward;
        }

        public Object first()
        {
            return forward.last();
        }

        public Object floor(Object obj)
        {
            return forward.ceiling(obj);
        }

        public NavigableSet headSet(Object obj, boolean flag)
        {
            return forward.tailSet(obj, flag).descendingSet();
        }

        public SortedSet headSet(Object obj)
        {
            return standardHeadSet(obj);
        }

        public Object higher(Object obj)
        {
            return forward.lower(obj);
        }

        public Iterator iterator()
        {
            return forward.descendingIterator();
        }

        public Object last()
        {
            return forward.first();
        }

        public Object lower(Object obj)
        {
            return forward.higher(obj);
        }

        public Object pollFirst()
        {
            return forward.pollLast();
        }

        public Object pollLast()
        {
            return forward.pollFirst();
        }

        public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return forward.subSet(obj1, flag1, obj, flag).descendingSet();
        }

        public SortedSet subSet(Object obj, Object obj1)
        {
            return standardSubSet(obj, obj1);
        }

        public NavigableSet tailSet(Object obj, boolean flag)
        {
            return forward.headSet(obj, flag).descendingSet();
        }

        public SortedSet tailSet(Object obj)
        {
            return standardTailSet(obj);
        }

        public Object[] toArray()
        {
            return standardToArray();
        }

        public Object[] toArray(Object aobj[])
        {
            return standardToArray(aobj);
        }

        public String toString()
        {
            return standardToString();
        }

        DescendingSet(NavigableSet navigableset)
        {
            forward = navigableset;
        }
    }

    private static class FilteredNavigableSet extends FilteredSortedSet
        implements NavigableSet
    {

        public Object ceiling(Object obj)
        {
            return Iterables.getFirst(tailSet(obj, true), null);
        }

        public Iterator descendingIterator()
        {
            return Iterators.filter(unfiltered().descendingIterator(), predicate);
        }

        public NavigableSet descendingSet()
        {
            return Sets.filter(unfiltered().descendingSet(), predicate);
        }

        public Object floor(Object obj)
        {
            return Iterators.getNext(headSet(obj, true).descendingIterator(), null);
        }

        public NavigableSet headSet(Object obj, boolean flag)
        {
            return Sets.filter(unfiltered().headSet(obj, flag), predicate);
        }

        public Object higher(Object obj)
        {
            return Iterables.getFirst(tailSet(obj, false), null);
        }

        public Object last()
        {
            return descendingIterator().next();
        }

        public Object lower(Object obj)
        {
            return Iterators.getNext(headSet(obj, false).descendingIterator(), null);
        }

        public Object pollFirst()
        {
            return Iterables.removeFirstMatching(unfiltered(), predicate);
        }

        public Object pollLast()
        {
            return Iterables.removeFirstMatching(unfiltered().descendingSet(), predicate);
        }

        public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return Sets.filter(unfiltered().subSet(obj, flag, obj1, flag1), predicate);
        }

        public NavigableSet tailSet(Object obj, boolean flag)
        {
            return Sets.filter(unfiltered().tailSet(obj, flag), predicate);
        }

        NavigableSet unfiltered()
        {
            return (NavigableSet)unfiltered;
        }

        FilteredNavigableSet(NavigableSet navigableset, Predicate predicate)
        {
            super(navigableset, predicate);
        }
    }

    private static class FilteredSet extends Collections2.FilteredCollection
        implements Set
    {

        public boolean equals(Object obj)
        {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode()
        {
            return Sets.hashCodeImpl(this);
        }

        FilteredSet(Set set, Predicate predicate)
        {
            super(set, predicate);
        }
    }

    private static class FilteredSortedSet extends FilteredSet
        implements SortedSet
    {

        public Comparator comparator()
        {
            return ((SortedSet)unfiltered).comparator();
        }

        public Object first()
        {
            return iterator().next();
        }

        public SortedSet headSet(Object obj)
        {
            return new FilteredSortedSet(((SortedSet)unfiltered).headSet(obj), predicate);
        }

        public Object last()
        {
            SortedSet sortedset = (SortedSet)unfiltered;
            do
            {
                Object obj = sortedset.last();
                if (predicate.apply(obj))
                {
                    return obj;
                }
                sortedset = sortedset.headSet(obj);
            } while (true);
        }

        public SortedSet subSet(Object obj, Object obj1)
        {
            return new FilteredSortedSet(((SortedSet)unfiltered).subSet(obj, obj1), predicate);
        }

        public SortedSet tailSet(Object obj)
        {
            return new FilteredSortedSet(((SortedSet)unfiltered).tailSet(obj), predicate);
        }

        FilteredSortedSet(SortedSet sortedset, Predicate predicate)
        {
            super(sortedset, predicate);
        }
    }

    static abstract class ImprovedAbstractSet extends AbstractSet
    {

        public boolean removeAll(Collection collection)
        {
            return Sets.removeAllImpl(this, collection);
        }

        public boolean retainAll(Collection collection)
        {
            return super.retainAll((Collection)Preconditions.checkNotNull(collection));
        }

        ImprovedAbstractSet()
        {
        }
    }

    private static final class PowerSet extends AbstractSet
    {

        final ImmutableMap inputSet;

        public boolean contains(Object obj)
        {
            if (obj instanceof Set)
            {
                obj = (Set)obj;
                return inputSet.keySet().containsAll(((Collection) (obj)));
            } else
            {
                return false;
            }
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof PowerSet)
            {
                obj = (PowerSet)obj;
                return inputSet.equals(((PowerSet) (obj)).inputSet);
            } else
            {
                return super.equals(obj);
            }
        }

        public int hashCode()
        {
            return inputSet.keySet().hashCode() << inputSet.size() - 1;
        }

        public boolean isEmpty()
        {
            return false;
        }

        public Iterator iterator()
        {
            return new AbstractIndexedListIterator(size()) {

                final PowerSet this$0;

                protected volatile Object get(int i)
                {
                    return get(i);
                }

                protected Set get(int i)
                {
                    return new SubSet(inputSet, i);
                }

            
            {
                this$0 = PowerSet.this;
                super(i);
            }
            };
        }

        public int size()
        {
            return 1 << inputSet.size();
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(inputSet));
            return (new StringBuilder(s.length() + 10)).append("powerSet(").append(s).append(")").toString();
        }

        PowerSet(Set set)
        {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            int i = 0;
            for (set = ((Set)Preconditions.checkNotNull(set)).iterator(); set.hasNext();)
            {
                builder.put(set.next(), Integer.valueOf(i));
                i++;
            }

            inputSet = builder.build();
            boolean flag;
            if (inputSet.size() <= 30)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Too many elements to create power set: %s > 30", new Object[] {
                Integer.valueOf(inputSet.size())
            });
        }
    }

    public static abstract class SetView extends AbstractSet
    {

        public Set copyInto(Set set)
        {
            set.addAll(this);
            return set;
        }

        public ImmutableSet immutableCopy()
        {
            return ImmutableSet.copyOf(this);
        }

        private SetView()
        {
        }

    }

    private static final class SubSet extends AbstractSet
    {

        private final ImmutableMap inputSet;
        private final int mask;

        public boolean contains(Object obj)
        {
            obj = (Integer)inputSet.get(obj);
            return obj != null && (mask & 1 << ((Integer) (obj)).intValue()) != 0;
        }

        public Iterator iterator()
        {
            return new UnmodifiableIterator() {

                final ImmutableList elements;
                int remainingSetBits;
                final SubSet this$0;

                public boolean hasNext()
                {
                    return remainingSetBits != 0;
                }

                public Object next()
                {
                    int i = Integer.numberOfTrailingZeros(remainingSetBits);
                    if (i == 32)
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        remainingSetBits = remainingSetBits & ~(1 << i);
                        return elements.get(i);
                    }
                }

            
            {
                this$0 = SubSet.this;
                super();
                elements = inputSet.keySet().asList();
                remainingSetBits = mask;
            }
            };
        }

        public int size()
        {
            return Integer.bitCount(mask);
        }



        SubSet(ImmutableMap immutablemap, int i)
        {
            inputSet = immutablemap;
            mask = i;
        }
    }

    static final class UnmodifiableNavigableSet extends ForwardingSortedSet
        implements NavigableSet, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final NavigableSet _flddelegate;
        private transient UnmodifiableNavigableSet descendingSet;

        public Object ceiling(Object obj)
        {
            return _flddelegate.ceiling(obj);
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Set _mthdelegate()
        {
            return _mthdelegate();
        }

        protected SortedSet _mthdelegate()
        {
            return Collections.unmodifiableSortedSet(_flddelegate);
        }

        public Iterator descendingIterator()
        {
            return Iterators.unmodifiableIterator(_flddelegate.descendingIterator());
        }

        public NavigableSet descendingSet()
        {
            UnmodifiableNavigableSet unmodifiablenavigableset1 = descendingSet;
            UnmodifiableNavigableSet unmodifiablenavigableset = unmodifiablenavigableset1;
            if (unmodifiablenavigableset1 == null)
            {
                unmodifiablenavigableset = new UnmodifiableNavigableSet(_flddelegate.descendingSet());
                descendingSet = unmodifiablenavigableset;
                unmodifiablenavigableset.descendingSet = this;
            }
            return unmodifiablenavigableset;
        }

        public Object floor(Object obj)
        {
            return _flddelegate.floor(obj);
        }

        public NavigableSet headSet(Object obj, boolean flag)
        {
            return Sets.unmodifiableNavigableSet(_flddelegate.headSet(obj, flag));
        }

        public Object higher(Object obj)
        {
            return _flddelegate.higher(obj);
        }

        public Object lower(Object obj)
        {
            return _flddelegate.lower(obj);
        }

        public Object pollFirst()
        {
            throw new UnsupportedOperationException();
        }

        public Object pollLast()
        {
            throw new UnsupportedOperationException();
        }

        public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return Sets.unmodifiableNavigableSet(_flddelegate.subSet(obj, flag, obj1, flag1));
        }

        public NavigableSet tailSet(Object obj, boolean flag)
        {
            return Sets.unmodifiableNavigableSet(_flddelegate.tailSet(obj, flag));
        }

        UnmodifiableNavigableSet(NavigableSet navigableset)
        {
            _flddelegate = (NavigableSet)Preconditions.checkNotNull(navigableset);
        }
    }


    private Sets()
    {
    }

    public static Set cartesianProduct(List list)
    {
        return CartesianSet.create(list);
    }

    public static transient Set cartesianProduct(Set aset[])
    {
        return cartesianProduct(Arrays.asList(aset));
    }

    public static EnumSet complementOf(Collection collection)
    {
        if (collection instanceof EnumSet)
        {
            return EnumSet.complementOf((EnumSet)collection);
        }
        boolean flag;
        if (!collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "collection is empty; use the other version of this method");
        return makeComplementByHand(collection, ((Enum)collection.iterator().next()).getDeclaringClass());
    }

    public static EnumSet complementOf(Collection collection, Class class1)
    {
        Preconditions.checkNotNull(collection);
        if (collection instanceof EnumSet)
        {
            return EnumSet.complementOf((EnumSet)collection);
        } else
        {
            return makeComplementByHand(collection, class1);
        }
    }

    public static SetView difference(Set set, Set set1)
    {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set1, "set2");
        return new SetView(set, Predicates.not(Predicates.in(set1)), set1) {

            final Predicate val$notInSet2;
            final Set val$set1;
            final Set val$set2;

            public boolean contains(Object obj)
            {
                return set1.contains(obj) && !set2.contains(obj);
            }

            public boolean isEmpty()
            {
                return set2.containsAll(set1);
            }

            public Iterator iterator()
            {
                return Iterators.filter(set1.iterator(), notInSet2);
            }

            public int size()
            {
                return Iterators.size(iterator());
            }

            
            {
                set1 = set;
                notInSet2 = predicate;
                set2 = set3;
                super();
            }
        };
    }

    static boolean equalsImpl(Set set, Object obj)
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
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        set;
        return false;
        set;
        return false;
    }

    public static NavigableSet filter(NavigableSet navigableset, Predicate predicate)
    {
        if (navigableset instanceof FilteredSet)
        {
            navigableset = (FilteredSet)navigableset;
            predicate = Predicates.and(((FilteredSet) (navigableset)).predicate, predicate);
            return new FilteredNavigableSet((NavigableSet)((FilteredSet) (navigableset)).unfiltered, predicate);
        } else
        {
            return new FilteredNavigableSet((NavigableSet)Preconditions.checkNotNull(navigableset), (Predicate)Preconditions.checkNotNull(predicate));
        }
    }

    public static Set filter(Set set, Predicate predicate)
    {
        if (set instanceof SortedSet)
        {
            return filter((SortedSet)set, predicate);
        }
        if (set instanceof FilteredSet)
        {
            set = (FilteredSet)set;
            predicate = Predicates.and(((FilteredSet) (set)).predicate, predicate);
            return new FilteredSet((Set)((FilteredSet) (set)).unfiltered, predicate);
        } else
        {
            return new FilteredSet((Set)Preconditions.checkNotNull(set), (Predicate)Preconditions.checkNotNull(predicate));
        }
    }

    public static SortedSet filter(SortedSet sortedset, Predicate predicate)
    {
        return Platform.setsFilterSortedSet(sortedset, predicate);
    }

    static SortedSet filterSortedIgnoreNavigable(SortedSet sortedset, Predicate predicate)
    {
        if (sortedset instanceof FilteredSet)
        {
            sortedset = (FilteredSet)sortedset;
            predicate = Predicates.and(((FilteredSet) (sortedset)).predicate, predicate);
            return new FilteredSortedSet((SortedSet)((FilteredSet) (sortedset)).unfiltered, predicate);
        } else
        {
            return new FilteredSortedSet((SortedSet)Preconditions.checkNotNull(sortedset), (Predicate)Preconditions.checkNotNull(predicate));
        }
    }

    static int hashCodeImpl(Set set)
    {
        int i = 0;
        set = set.iterator();
        while (set.hasNext()) 
        {
            Object obj = set.next();
            int j;
            if (obj != null)
            {
                j = obj.hashCode();
            } else
            {
                j = 0;
            }
            i = ~~(i + j);
        }
        return i;
    }

    public static transient ImmutableSet immutableEnumSet(Enum enum, Enum aenum[])
    {
        return ImmutableEnumSet.asImmutable(EnumSet.of(enum, aenum));
    }

    public static ImmutableSet immutableEnumSet(Iterable iterable)
    {
        if (iterable instanceof ImmutableEnumSet)
        {
            return (ImmutableEnumSet)iterable;
        }
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
            if (iterable.isEmpty())
            {
                return ImmutableSet.of();
            } else
            {
                return ImmutableEnumSet.asImmutable(EnumSet.copyOf(iterable));
            }
        }
        iterable = iterable.iterator();
        if (iterable.hasNext())
        {
            EnumSet enumset = EnumSet.of((Enum)iterable.next());
            Iterators.addAll(enumset, iterable);
            return ImmutableEnumSet.asImmutable(enumset);
        } else
        {
            return ImmutableSet.of();
        }
    }

    public static SetView intersection(Set set, Set set1)
    {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set1, "set2");
        return new SetView(set, Predicates.in(set1), set1) {

            final Predicate val$inSet2;
            final Set val$set1;
            final Set val$set2;

            public boolean contains(Object obj)
            {
                return set1.contains(obj) && set2.contains(obj);
            }

            public boolean containsAll(Collection collection)
            {
                return set1.containsAll(collection) && set2.containsAll(collection);
            }

            public boolean isEmpty()
            {
                return !iterator().hasNext();
            }

            public Iterator iterator()
            {
                return Iterators.filter(set1.iterator(), inSet2);
            }

            public int size()
            {
                return Iterators.size(iterator());
            }

            
            {
                set1 = set;
                inSet2 = predicate;
                set2 = set3;
                super();
            }
        };
    }

    private static EnumSet makeComplementByHand(Collection collection, Class class1)
    {
        class1 = EnumSet.allOf(class1);
        class1.removeAll(collection);
        return class1;
    }

    public static Set newConcurrentHashSet()
    {
        return newSetFromMap(new ConcurrentHashMap());
    }

    public static Set newConcurrentHashSet(Iterable iterable)
    {
        Set set = newConcurrentHashSet();
        Iterables.addAll(set, iterable);
        return set;
    }

    public static CopyOnWriteArraySet newCopyOnWriteArraySet()
    {
        return new CopyOnWriteArraySet();
    }

    public static CopyOnWriteArraySet newCopyOnWriteArraySet(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            iterable = Collections2.cast(iterable);
        } else
        {
            iterable = Lists.newArrayList(iterable);
        }
        return new CopyOnWriteArraySet(iterable);
    }

    public static EnumSet newEnumSet(Iterable iterable, Class class1)
    {
        class1 = EnumSet.noneOf(class1);
        Iterables.addAll(class1, iterable);
        return class1;
    }

    public static HashSet newHashSet()
    {
        return new HashSet();
    }

    public static HashSet newHashSet(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new HashSet(Collections2.cast(iterable));
        } else
        {
            return newHashSet(iterable.iterator());
        }
    }

    public static HashSet newHashSet(Iterator iterator)
    {
        HashSet hashset = newHashSet();
        Iterators.addAll(hashset, iterator);
        return hashset;
    }

    public static transient HashSet newHashSet(Object aobj[])
    {
        HashSet hashset = newHashSetWithExpectedSize(aobj.length);
        Collections.addAll(hashset, aobj);
        return hashset;
    }

    public static HashSet newHashSetWithExpectedSize(int i)
    {
        return new HashSet(Maps.capacity(i));
    }

    public static Set newIdentityHashSet()
    {
        return newSetFromMap(Maps.newIdentityHashMap());
    }

    public static LinkedHashSet newLinkedHashSet()
    {
        return new LinkedHashSet();
    }

    public static LinkedHashSet newLinkedHashSet(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new LinkedHashSet(Collections2.cast(iterable));
        } else
        {
            LinkedHashSet linkedhashset = newLinkedHashSet();
            Iterables.addAll(linkedhashset, iterable);
            return linkedhashset;
        }
    }

    public static LinkedHashSet newLinkedHashSetWithExpectedSize(int i)
    {
        return new LinkedHashSet(Maps.capacity(i));
    }

    public static Set newSetFromMap(Map map)
    {
        return Platform.newSetFromMap(map);
    }

    public static TreeSet newTreeSet()
    {
        return new TreeSet();
    }

    public static TreeSet newTreeSet(Iterable iterable)
    {
        TreeSet treeset = newTreeSet();
        Iterables.addAll(treeset, iterable);
        return treeset;
    }

    public static TreeSet newTreeSet(Comparator comparator)
    {
        return new TreeSet((Comparator)Preconditions.checkNotNull(comparator));
    }

    public static Set powerSet(Set set)
    {
        return new PowerSet(set);
    }

    static boolean removeAllImpl(Set set, Collection collection)
    {
        Preconditions.checkNotNull(collection);
        Object obj = collection;
        if (collection instanceof Multiset)
        {
            obj = ((Multiset)collection).elementSet();
        }
        if ((obj instanceof Set) && ((Collection) (obj)).size() > set.size())
        {
            return Iterators.removeAll(set.iterator(), ((Collection) (obj)));
        } else
        {
            return removeAllImpl(set, ((Collection) (obj)).iterator());
        }
    }

    static boolean removeAllImpl(Set set, Iterator iterator)
    {
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= set.remove(iterator.next())) { }
        return flag;
    }

    public static SetView symmetricDifference(Set set, Set set1)
    {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set1, "set2");
        return difference(union(set, set1), intersection(set, set1));
    }

    public static NavigableSet synchronizedNavigableSet(NavigableSet navigableset)
    {
        return Synchronized.navigableSet(navigableset);
    }

    public static SetView union(Set set, Set set1)
    {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set1, "set2");
        return new SetView(set, difference(set1, set), set1) {

            final Set val$set1;
            final Set val$set2;
            final Set val$set2minus1;

            public boolean contains(Object obj)
            {
                return set1.contains(obj) || set2.contains(obj);
            }

            public Set copyInto(Set set3)
            {
                set3.addAll(set1);
                set3.addAll(set2);
                return set3;
            }

            public ImmutableSet immutableCopy()
            {
                return (new ImmutableSet.Builder()).addAll(set1).addAll(set2).build();
            }

            public boolean isEmpty()
            {
                return set1.isEmpty() && set2.isEmpty();
            }

            public Iterator iterator()
            {
                return Iterators.unmodifiableIterator(Iterators.concat(set1.iterator(), set2minus1.iterator()));
            }

            public int size()
            {
                return set1.size() + set2minus1.size();
            }

            
            {
                set1 = set;
                set2minus1 = set3;
                set2 = set4;
                super();
            }
        };
    }

    public static NavigableSet unmodifiableNavigableSet(NavigableSet navigableset)
    {
        if ((navigableset instanceof ImmutableSortedSet) || (navigableset instanceof UnmodifiableNavigableSet))
        {
            return navigableset;
        } else
        {
            return new UnmodifiableNavigableSet(navigableset);
        }
    }
}
