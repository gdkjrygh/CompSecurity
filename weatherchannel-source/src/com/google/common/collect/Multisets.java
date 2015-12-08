// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multiset, Iterators, Ordering, ImmutableMultiset, 
//            CollectPreconditions, UnmodifiableSortedMultiset, SortedMultiset, TransformedIterator, 
//            AbstractMultiset, Sets, UnmodifiableIterator, ForwardingMultiset, 
//            AbstractIterator

public final class Multisets
{
    static abstract class AbstractEntry
        implements Multiset.Entry
    {

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                flag = flag1;
                if (getCount() == ((Multiset.Entry) (obj)).getCount())
                {
                    flag = flag1;
                    if (Objects.equal(getElement(), ((Multiset.Entry) (obj)).getElement()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            Object obj = getElement();
            int i;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = obj.hashCode();
            }
            return i ^ getCount();
        }

        public String toString()
        {
            String s = String.valueOf(getElement());
            int i = getCount();
            if (i == 1)
            {
                return s;
            } else
            {
                s = String.valueOf(String.valueOf(s));
                return (new StringBuilder(s.length() + 14)).append(s).append(" x ").append(i).toString();
            }
        }

        AbstractEntry()
        {
        }
    }

    static abstract class ElementSet extends Sets.ImprovedAbstractSet
    {

        public void clear()
        {
            multiset().clear();
        }

        public boolean contains(Object obj)
        {
            return multiset().contains(obj);
        }

        public boolean containsAll(Collection collection)
        {
            return multiset().containsAll(collection);
        }

        public boolean isEmpty()
        {
            return multiset().isEmpty();
        }

        public Iterator iterator()
        {
            return new TransformedIterator(multiset().entrySet().iterator()) {

                final ElementSet this$0;

                Object transform(Multiset.Entry entry)
                {
                    return entry.getElement();
                }

                volatile Object transform(Object obj)
                {
                    return transform((Multiset.Entry)obj);
                }

            
            {
                this$0 = ElementSet.this;
                super(iterator);
            }
            };
        }

        abstract Multiset multiset();

        public boolean remove(Object obj)
        {
            int i = multiset().count(obj);
            if (i > 0)
            {
                multiset().remove(obj, i);
                return true;
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return multiset().entrySet().size();
        }

        ElementSet()
        {
        }
    }

    static abstract class EntrySet extends Sets.ImprovedAbstractSet
    {

        public void clear()
        {
            multiset().clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                break MISSING_BLOCK_LABEL_12;
            }
            do
            {
                return false;
            } while (((Multiset.Entry) (obj)).getCount() <= 0 || multiset().count(((Multiset.Entry) (obj)).getElement()) != ((Multiset.Entry) (obj)).getCount());
            return true;
        }

        abstract Multiset multiset();

        public boolean remove(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                Object obj1 = ((Multiset.Entry) (obj)).getElement();
                int i = ((Multiset.Entry) (obj)).getCount();
                flag = flag1;
                if (i != 0)
                {
                    flag = multiset().setCount(obj1, i, 0);
                }
            }
            return flag;
        }

        EntrySet()
        {
        }
    }

    private static final class FilteredMultiset extends AbstractMultiset
    {

        final Predicate predicate;
        final Multiset unfiltered;

        public int add(Object obj, int i)
        {
            Preconditions.checkArgument(predicate.apply(obj), "Element %s does not match predicate %s", new Object[] {
                obj, predicate
            });
            return unfiltered.add(obj, i);
        }

        public void clear()
        {
            elementSet().clear();
        }

        public int count(Object obj)
        {
            int i = unfiltered.count(obj);
            if (i > 0)
            {
                if (predicate.apply(obj))
                {
                    return i;
                } else
                {
                    return 0;
                }
            } else
            {
                return 0;
            }
        }

        Set createElementSet()
        {
            return Sets.filter(unfiltered.elementSet(), predicate);
        }

        Set createEntrySet()
        {
            return Sets.filter(unfiltered.entrySet(), new Predicate() {

                final FilteredMultiset this$0;

                public boolean apply(Multiset.Entry entry)
                {
                    return predicate.apply(entry.getElement());
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((Multiset.Entry)obj);
                }

            
            {
                this$0 = FilteredMultiset.this;
                super();
            }
            });
        }

        int distinctElements()
        {
            return elementSet().size();
        }

        Iterator entryIterator()
        {
            throw new AssertionError("should never be called");
        }

        public UnmodifiableIterator iterator()
        {
            return Iterators.filter(unfiltered.iterator(), predicate);
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int remove(Object obj, int i)
        {
            CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0)
            {
                return count(obj);
            }
            if (contains(obj))
            {
                return unfiltered.remove(obj, i);
            } else
            {
                return 0;
            }
        }

        FilteredMultiset(Multiset multiset, Predicate predicate1)
        {
            unfiltered = (Multiset)Preconditions.checkNotNull(multiset);
            predicate = (Predicate)Preconditions.checkNotNull(predicate1);
        }
    }

    static final class ImmutableEntry extends AbstractEntry
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final int count;
        final Object element;

        public int getCount()
        {
            return count;
        }

        public Object getElement()
        {
            return element;
        }

        ImmutableEntry(Object obj, int i)
        {
            element = obj;
            count = i;
            CollectPreconditions.checkNonnegative(i, "count");
        }
    }

    static final class MultisetIteratorImpl
        implements Iterator
    {

        private boolean canRemove;
        private Multiset.Entry currentEntry;
        private final Iterator entryIterator;
        private int laterCount;
        private final Multiset multiset;
        private int totalCount;

        public boolean hasNext()
        {
            return laterCount > 0 || entryIterator.hasNext();
        }

        public Object next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            }
            if (laterCount == 0)
            {
                currentEntry = (Multiset.Entry)entryIterator.next();
                int i = currentEntry.getCount();
                laterCount = i;
                totalCount = i;
            }
            laterCount = laterCount - 1;
            canRemove = true;
            return currentEntry.getElement();
        }

        public void remove()
        {
            CollectPreconditions.checkRemove(canRemove);
            if (totalCount == 1)
            {
                entryIterator.remove();
            } else
            {
                multiset.remove(currentEntry.getElement());
            }
            totalCount = totalCount - 1;
            canRemove = false;
        }

        MultisetIteratorImpl(Multiset multiset1, Iterator iterator)
        {
            multiset = multiset1;
            entryIterator = iterator;
        }
    }

    static class UnmodifiableMultiset extends ForwardingMultiset
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Multiset _flddelegate;
        transient Set elementSet;
        transient Set entrySet;

        public int add(Object obj, int i)
        {
            throw new UnsupportedOperationException();
        }

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
            throw new UnsupportedOperationException();
        }

        Set createElementSet()
        {
            return Collections.unmodifiableSet(_flddelegate.elementSet());
        }

        protected Multiset _mthdelegate()
        {
            return _flddelegate;
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        public Set elementSet()
        {
            Set set1 = elementSet;
            Set set = set1;
            if (set1 == null)
            {
                set = createElementSet();
                elementSet = set;
            }
            return set;
        }

        public Set entrySet()
        {
            Set set1 = entrySet;
            Set set = set1;
            if (set1 == null)
            {
                set = Collections.unmodifiableSet(_flddelegate.entrySet());
                entrySet = set;
            }
            return set;
        }

        public Iterator iterator()
        {
            return Iterators.unmodifiableIterator(_flddelegate.iterator());
        }

        public int remove(Object obj, int i)
        {
            throw new UnsupportedOperationException();
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

        public int setCount(Object obj, int i)
        {
            throw new UnsupportedOperationException();
        }

        public boolean setCount(Object obj, int i, int j)
        {
            throw new UnsupportedOperationException();
        }

        UnmodifiableMultiset(Multiset multiset)
        {
            _flddelegate = multiset;
        }
    }


    private static final Ordering DECREASING_COUNT_ORDERING = new Ordering() {

        public int compare(Multiset.Entry entry, Multiset.Entry entry1)
        {
            return Ints.compare(entry1.getCount(), entry.getCount());
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((Multiset.Entry)obj, (Multiset.Entry)obj1);
        }

    };

    private Multisets()
    {
    }

    static boolean addAllImpl(Multiset multiset, Collection collection)
    {
        if (collection.isEmpty())
        {
            return false;
        }
        if (collection instanceof Multiset)
        {
            Multiset.Entry entry;
            for (collection = cast(collection).entrySet().iterator(); collection.hasNext(); multiset.add(entry.getElement(), entry.getCount()))
            {
                entry = (Multiset.Entry)collection.next();
            }

        } else
        {
            Iterators.addAll(multiset, collection.iterator());
        }
        return true;
    }

    static Multiset cast(Iterable iterable)
    {
        return (Multiset)iterable;
    }

    public static boolean containsOccurrences(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        for (multiset1 = multiset1.entrySet().iterator(); multiset1.hasNext();)
        {
            Multiset.Entry entry = (Multiset.Entry)multiset1.next();
            if (multiset.count(entry.getElement()) < entry.getCount())
            {
                return false;
            }
        }

        return true;
    }

    public static ImmutableMultiset copyHighestCountFirst(Multiset multiset)
    {
        return ImmutableMultiset.copyFromEntries(DECREASING_COUNT_ORDERING.immutableSortedCopy(multiset.entrySet()));
    }

    public static Multiset difference(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        return new AbstractMultiset(multiset, multiset1) {

            final Multiset val$multiset1;
            final Multiset val$multiset2;

            public int count(Object obj)
            {
                int i = multiset1.count(obj);
                if (i == 0)
                {
                    return 0;
                } else
                {
                    return Math.max(0, i - multiset2.count(obj));
                }
            }

            int distinctElements()
            {
                return Iterators.size(entryIterator());
            }

            Iterator entryIterator()
            {
                return multiset1.entrySet().iterator(). new AbstractIterator() {

                    final _cls4 this$0;
                    final Iterator val$iterator1;

                    protected Multiset.Entry computeNext()
                    {
                        while (iterator1.hasNext()) 
                        {
                            Multiset.Entry entry = (Multiset.Entry)iterator1.next();
                            Object obj = entry.getElement();
                            int i = entry.getCount() - multiset2.count(obj);
                            if (i > 0)
                            {
                                return Multisets.immutableEntry(obj, i);
                            }
                        }
                        return (Multiset.Entry)endOfData();
                    }

                    protected volatile Object computeNext()
                    {
                        return computeNext();
                    }

            
            {
                this$0 = final__pcls4;
                iterator1 = Iterator.this;
                super();
            }
                };
            }

            
            {
                multiset1 = multiset;
                multiset2 = multiset3;
                super();
            }
        };
    }

    static boolean equalsImpl(Multiset multiset, Object obj)
    {
        if (obj != multiset) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj instanceof Multiset)
        {
            obj = (Multiset)obj;
            if (multiset.size() != ((Multiset) (obj)).size() || multiset.entrySet().size() != ((Multiset) (obj)).entrySet().size())
            {
                return false;
            }
            obj = ((Multiset) (obj)).entrySet().iterator();
            Multiset.Entry entry;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                entry = (Multiset.Entry)((Iterator) (obj)).next();
            } while (multiset.count(entry.getElement()) == entry.getCount());
            break; /* Loop/switch isn't completed */
        } else
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public static Multiset filter(Multiset multiset, Predicate predicate)
    {
        if (multiset instanceof FilteredMultiset)
        {
            multiset = (FilteredMultiset)multiset;
            predicate = Predicates.and(((FilteredMultiset) (multiset)).predicate, predicate);
            return new FilteredMultiset(((FilteredMultiset) (multiset)).unfiltered, predicate);
        } else
        {
            return new FilteredMultiset(multiset, predicate);
        }
    }

    public static Multiset.Entry immutableEntry(Object obj, int i)
    {
        return new ImmutableEntry(obj, i);
    }

    static int inferDistinctElements(Iterable iterable)
    {
        if (iterable instanceof Multiset)
        {
            return ((Multiset)iterable).elementSet().size();
        } else
        {
            return 11;
        }
    }

    public static Multiset intersection(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        return new AbstractMultiset(multiset, multiset1) {

            final Multiset val$multiset1;
            final Multiset val$multiset2;

            public int count(Object obj)
            {
                int i = multiset1.count(obj);
                if (i == 0)
                {
                    return 0;
                } else
                {
                    return Math.min(i, multiset2.count(obj));
                }
            }

            Set createElementSet()
            {
                return Sets.intersection(multiset1.elementSet(), multiset2.elementSet());
            }

            int distinctElements()
            {
                return elementSet().size();
            }

            Iterator entryIterator()
            {
                return multiset1.entrySet().iterator(). new AbstractIterator() {

                    final _cls2 this$0;
                    final Iterator val$iterator1;

                    protected Multiset.Entry computeNext()
                    {
                        while (iterator1.hasNext()) 
                        {
                            Multiset.Entry entry = (Multiset.Entry)iterator1.next();
                            Object obj = entry.getElement();
                            int i = Math.min(entry.getCount(), multiset2.count(obj));
                            if (i > 0)
                            {
                                return Multisets.immutableEntry(obj, i);
                            }
                        }
                        return (Multiset.Entry)endOfData();
                    }

                    protected volatile Object computeNext()
                    {
                        return computeNext();
                    }

            
            {
                this$0 = final__pcls2;
                iterator1 = Iterator.this;
                super();
            }
                };
            }

            
            {
                multiset1 = multiset;
                multiset2 = multiset3;
                super();
            }
        };
    }

    static Iterator iteratorImpl(Multiset multiset)
    {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static boolean removeAllImpl(Multiset multiset, Collection collection)
    {
        if (collection instanceof Multiset)
        {
            collection = ((Multiset)collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    public static boolean removeOccurrences(Multiset multiset, Iterable iterable)
    {
        if (iterable instanceof Multiset)
        {
            return removeOccurrencesImpl(multiset, (Multiset)iterable);
        } else
        {
            return removeOccurrencesImpl(multiset, iterable);
        }
    }

    private static boolean removeOccurrencesImpl(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        boolean flag = false;
        Iterator iterator = multiset.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            int i = multiset1.count(entry.getElement());
            if (i >= entry.getCount())
            {
                iterator.remove();
                flag = true;
            } else
            if (i > 0)
            {
                multiset.remove(entry.getElement(), i);
                flag = true;
            }
        } while (true);
        return flag;
    }

    private static boolean removeOccurrencesImpl(Multiset multiset, Iterable iterable)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(iterable);
        boolean flag = false;
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            flag |= multiset.remove(iterable.next());
        }

        return flag;
    }

    static boolean retainAllImpl(Multiset multiset, Collection collection)
    {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset)
        {
            collection = ((Multiset)collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    public static boolean retainOccurrences(Multiset multiset, Multiset multiset1)
    {
        return retainOccurrencesImpl(multiset, multiset1);
    }

    private static boolean retainOccurrencesImpl(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        Iterator iterator = multiset.entrySet().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            int i = multiset1.count(entry.getElement());
            if (i == 0)
            {
                iterator.remove();
                flag = true;
            } else
            if (i < entry.getCount())
            {
                multiset.setCount(entry.getElement(), i);
                flag = true;
            }
        } while (true);
        return flag;
    }

    static int setCountImpl(Multiset multiset, Object obj, int i)
    {
        CollectPreconditions.checkNonnegative(i, "count");
        int j = multiset.count(obj);
        i -= j;
        if (i > 0)
        {
            multiset.add(obj, i);
        } else
        if (i < 0)
        {
            multiset.remove(obj, -i);
            return j;
        }
        return j;
    }

    static boolean setCountImpl(Multiset multiset, Object obj, int i, int j)
    {
        CollectPreconditions.checkNonnegative(i, "oldCount");
        CollectPreconditions.checkNonnegative(j, "newCount");
        if (multiset.count(obj) == i)
        {
            multiset.setCount(obj, j);
            return true;
        } else
        {
            return false;
        }
    }

    static int sizeImpl(Multiset multiset)
    {
        long l = 0L;
        for (multiset = multiset.entrySet().iterator(); multiset.hasNext();)
        {
            l += ((Multiset.Entry)multiset.next()).getCount();
        }

        return Ints.saturatedCast(l);
    }

    public static Multiset sum(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        return new AbstractMultiset(multiset, multiset1) {

            final Multiset val$multiset1;
            final Multiset val$multiset2;

            public boolean contains(Object obj)
            {
                return multiset1.contains(obj) || multiset2.contains(obj);
            }

            public int count(Object obj)
            {
                return multiset1.count(obj) + multiset2.count(obj);
            }

            Set createElementSet()
            {
                return Sets.union(multiset1.elementSet(), multiset2.elementSet());
            }

            int distinctElements()
            {
                return elementSet().size();
            }

            Iterator entryIterator()
            {
                return multiset2.entrySet().iterator(). new AbstractIterator() {

                    final _cls3 this$0;
                    final Iterator val$iterator1;
                    final Iterator val$iterator2;

                    protected Multiset.Entry computeNext()
                    {
                        if (iterator1.hasNext())
                        {
                            Multiset.Entry entry = (Multiset.Entry)iterator1.next();
                            Object obj = entry.getElement();
                            return Multisets.immutableEntry(obj, entry.getCount() + multiset2.count(obj));
                        }
                        while (iterator2.hasNext()) 
                        {
                            Multiset.Entry entry1 = (Multiset.Entry)iterator2.next();
                            Object obj1 = entry1.getElement();
                            if (!multiset1.contains(obj1))
                            {
                                return Multisets.immutableEntry(obj1, entry1.getCount());
                            }
                        }
                        return (Multiset.Entry)endOfData();
                    }

                    protected volatile Object computeNext()
                    {
                        return computeNext();
                    }

            
            {
                this$0 = final__pcls3;
                iterator1 = iterator;
                iterator2 = Iterator.this;
                super();
            }
                };
            }

            public boolean isEmpty()
            {
                return multiset1.isEmpty() && multiset2.isEmpty();
            }

            public int size()
            {
                return multiset1.size() + multiset2.size();
            }

            
            {
                multiset1 = multiset;
                multiset2 = multiset3;
                super();
            }
        };
    }

    public static Multiset union(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        return new AbstractMultiset(multiset, multiset1) {

            final Multiset val$multiset1;
            final Multiset val$multiset2;

            public boolean contains(Object obj)
            {
                return multiset1.contains(obj) || multiset2.contains(obj);
            }

            public int count(Object obj)
            {
                return Math.max(multiset1.count(obj), multiset2.count(obj));
            }

            Set createElementSet()
            {
                return Sets.union(multiset1.elementSet(), multiset2.elementSet());
            }

            int distinctElements()
            {
                return elementSet().size();
            }

            Iterator entryIterator()
            {
                return multiset2.entrySet().iterator(). new AbstractIterator() {

                    final _cls1 this$0;
                    final Iterator val$iterator1;
                    final Iterator val$iterator2;

                    protected Multiset.Entry computeNext()
                    {
                        if (iterator1.hasNext())
                        {
                            Multiset.Entry entry = (Multiset.Entry)iterator1.next();
                            Object obj = entry.getElement();
                            return Multisets.immutableEntry(obj, Math.max(entry.getCount(), multiset2.count(obj)));
                        }
                        while (iterator2.hasNext()) 
                        {
                            Multiset.Entry entry1 = (Multiset.Entry)iterator2.next();
                            Object obj1 = entry1.getElement();
                            if (!multiset1.contains(obj1))
                            {
                                return Multisets.immutableEntry(obj1, entry1.getCount());
                            }
                        }
                        return (Multiset.Entry)endOfData();
                    }

                    protected volatile Object computeNext()
                    {
                        return computeNext();
                    }

            
            {
                this$0 = final__pcls1;
                iterator1 = iterator;
                iterator2 = Iterator.this;
                super();
            }
                };
            }

            public boolean isEmpty()
            {
                return multiset1.isEmpty() && multiset2.isEmpty();
            }

            
            {
                multiset1 = multiset;
                multiset2 = multiset3;
                super();
            }
        };
    }

    public static Multiset unmodifiableMultiset(ImmutableMultiset immutablemultiset)
    {
        return (Multiset)Preconditions.checkNotNull(immutablemultiset);
    }

    public static Multiset unmodifiableMultiset(Multiset multiset)
    {
        if ((multiset instanceof UnmodifiableMultiset) || (multiset instanceof ImmutableMultiset))
        {
            return multiset;
        } else
        {
            return new UnmodifiableMultiset((Multiset)Preconditions.checkNotNull(multiset));
        }
    }

    public static SortedMultiset unmodifiableSortedMultiset(SortedMultiset sortedmultiset)
    {
        return new UnmodifiableSortedMultiset((SortedMultiset)Preconditions.checkNotNull(sortedmultiset));
    }

}
