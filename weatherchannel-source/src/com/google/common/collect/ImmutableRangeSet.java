// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractRangeSet, ImmutableList, Range, RangeSet, 
//            SortedLists, ImmutableSet, RegularImmutableSortedSet, ImmutableSortedSet, 
//            DiscreteDomain, Ordering, Cut, BoundType, 
//            ContiguousSet, UnmodifiableIterator, AbstractIterator, Iterators, 
//            TreeRangeSet, Iterables

public final class ImmutableRangeSet extends AbstractRangeSet
    implements Serializable
{
    private final class AsSet extends ImmutableSortedSet
    {

        private final DiscreteDomain domain;
        private transient Integer size;
        final ImmutableRangeSet this$0;

        public boolean contains(Object obj)
        {
            if (obj == null)
            {
                return false;
            }
            boolean flag;
            try
            {
                obj = (Comparable)obj;
                flag = ImmutableRangeSet.this.contains(((Comparable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            return flag;
        }

        public UnmodifiableIterator descendingIterator()
        {
            return new AbstractIterator() {

                Iterator elemItr;
                final Iterator rangeItr;
                final AsSet this$1;

                protected Comparable computeNext()
                {
                    while (!elemItr.hasNext()) 
                    {
                        if (rangeItr.hasNext())
                        {
                            elemItr = ContiguousSet.create((Range)rangeItr.next(), domain).descendingIterator();
                        } else
                        {
                            return (Comparable)endOfData();
                        }
                    }
                    return (Comparable)elemItr.next();
                }

                protected volatile Object computeNext()
                {
                    return computeNext();
                }

            
            {
                this$1 = AsSet.this;
                super();
                rangeItr = ranges.reverse().iterator();
                elemItr = Iterators.emptyIterator();
            }
            };
        }

        public volatile Iterator descendingIterator()
        {
            return descendingIterator();
        }

        ImmutableSortedSet headSetImpl(Comparable comparable, boolean flag)
        {
            return subSet(Range.upTo(comparable, BoundType.forBoolean(flag)));
        }

        volatile ImmutableSortedSet headSetImpl(Object obj, boolean flag)
        {
            return headSetImpl((Comparable)obj, flag);
        }

        int indexOf(Object obj)
        {
            if (contains(obj))
            {
                obj = (Comparable)obj;
                long l = 0L;
                for (Iterator iterator1 = ranges.iterator(); iterator1.hasNext();)
                {
                    Range range = (Range)iterator1.next();
                    if (range.contains(((Comparable) (obj))))
                    {
                        return Ints.saturatedCast((long)ContiguousSet.create(range, domain).indexOf(obj) + l);
                    }
                    l += ContiguousSet.create(range, domain).size();
                }

                throw new AssertionError("impossible");
            } else
            {
                return -1;
            }
        }

        boolean isPartialView()
        {
            return ranges.isPartialView();
        }

        public UnmodifiableIterator iterator()
        {
            return new AbstractIterator() {

                Iterator elemItr;
                final Iterator rangeItr;
                final AsSet this$1;

                protected Comparable computeNext()
                {
                    while (!elemItr.hasNext()) 
                    {
                        if (rangeItr.hasNext())
                        {
                            elemItr = ContiguousSet.create((Range)rangeItr.next(), domain).iterator();
                        } else
                        {
                            return (Comparable)endOfData();
                        }
                    }
                    return (Comparable)elemItr.next();
                }

                protected volatile Object computeNext()
                {
                    return computeNext();
                }

            
            {
                this$1 = AsSet.this;
                super();
                rangeItr = ranges.iterator();
                elemItr = Iterators.emptyIterator();
            }
            };
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            Integer integer = size;
            Object obj = integer;
            if (integer == null)
            {
                long l = 0L;
                obj = ranges.iterator();
                long l1;
                do
                {
                    l1 = l;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    l1 = l + (long)ContiguousSet.create((Range)((Iterator) (obj)).next(), domain).size();
                    l = l1;
                } while (l1 < 0x7fffffffL);
                obj = Integer.valueOf(Ints.saturatedCast(l1));
                size = ((Integer) (obj));
            }
            return ((Integer) (obj)).intValue();
        }

        ImmutableSortedSet subSet(Range range)
        {
            return subRangeSet(range).asSet(domain);
        }

        ImmutableSortedSet subSetImpl(Comparable comparable, boolean flag, Comparable comparable1, boolean flag1)
        {
            if (!flag && !flag1 && Range.compareOrThrow(comparable, comparable1) == 0)
            {
                return ImmutableSortedSet.of();
            } else
            {
                return subSet(Range.range(comparable, BoundType.forBoolean(flag), comparable1, BoundType.forBoolean(flag1)));
            }
        }

        volatile ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return subSetImpl((Comparable)obj, flag, (Comparable)obj1, flag1);
        }

        ImmutableSortedSet tailSetImpl(Comparable comparable, boolean flag)
        {
            return subSet(Range.downTo(comparable, BoundType.forBoolean(flag)));
        }

        volatile ImmutableSortedSet tailSetImpl(Object obj, boolean flag)
        {
            return tailSetImpl((Comparable)obj, flag);
        }

        public String toString()
        {
            return ranges.toString();
        }

        Object writeReplace()
        {
            return new AsSetSerializedForm(ranges, domain);
        }


        AsSet(DiscreteDomain discretedomain)
        {
            this$0 = ImmutableRangeSet.this;
            super(Ordering.natural());
            domain = discretedomain;
        }
    }

    private static class AsSetSerializedForm
        implements Serializable
    {

        private final DiscreteDomain domain;
        private final ImmutableList ranges;

        Object readResolve()
        {
            return (new ImmutableRangeSet(ranges)).asSet(domain);
        }

        AsSetSerializedForm(ImmutableList immutablelist, DiscreteDomain discretedomain)
        {
            ranges = immutablelist;
            domain = discretedomain;
        }
    }

    public static class Builder
    {

        private final RangeSet rangeSet = TreeRangeSet.create();

        public Builder add(Range range)
        {
            if (range.isEmpty())
            {
                range = String.valueOf(String.valueOf(range));
                throw new IllegalArgumentException((new StringBuilder(range.length() + 33)).append("range must not be empty, but was ").append(range).toString());
            }
            if (!rangeSet.complement().encloses(range))
            {
                Iterator iterator = rangeSet.asRanges().iterator();
                while (iterator.hasNext()) 
                {
                    Range range1 = (Range)iterator.next();
                    boolean flag;
                    if (!range1.isConnected(range) || range1.intersection(range).isEmpty())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Preconditions.checkArgument(flag, "Ranges may not overlap, but received %s and %s", new Object[] {
                        range1, range
                    });
                }
                throw new AssertionError("should have thrown an IAE above");
            } else
            {
                rangeSet.add(range);
                return this;
            }
        }

        public Builder addAll(RangeSet rangeset)
        {
            for (rangeset = rangeset.asRanges().iterator(); rangeset.hasNext(); add((Range)rangeset.next())) { }
            return this;
        }

        public ImmutableRangeSet build()
        {
            return ImmutableRangeSet.copyOf(rangeSet);
        }

        public Builder()
        {
        }
    }

    private final class ComplementRanges extends ImmutableList
    {

        private final boolean positiveBoundedAbove;
        private final boolean positiveBoundedBelow;
        private final int size;
        final ImmutableRangeSet this$0;

        public Range get(int i)
        {
            Preconditions.checkElementIndex(i, size);
            Cut cut;
            Object obj;
            if (positiveBoundedBelow)
            {
                if (i == 0)
                {
                    cut = Cut.belowAll();
                } else
                {
                    cut = ((Range)ranges.get(i - 1)).upperBound;
                }
            } else
            {
                cut = ((Range)ranges.get(i)).upperBound;
            }
            if (positiveBoundedAbove && i == size - 1)
            {
                obj = Cut.aboveAll();
            } else
            {
                obj = ranges;
                int j;
                if (positiveBoundedBelow)
                {
                    j = 0;
                } else
                {
                    j = 1;
                }
                obj = ((Range)((ImmutableList) (obj)).get(j + i)).lowerBound;
            }
            return Range.create(cut, ((Cut) (obj)));
        }

        public volatile Object get(int i)
        {
            return get(i);
        }

        boolean isPartialView()
        {
            return true;
        }

        public int size()
        {
            return size;
        }

        ComplementRanges()
        {
            this$0 = ImmutableRangeSet.this;
            super();
            positiveBoundedBelow = ((Range)ranges.get(0)).hasLowerBound();
            positiveBoundedAbove = ((Range)Iterables.getLast(ranges)).hasUpperBound();
            int j = ranges.size() - 1;
            int i = j;
            if (positiveBoundedBelow)
            {
                i = j + 1;
            }
            j = i;
            if (positiveBoundedAbove)
            {
                j = i + 1;
            }
            size = j;
        }
    }

    private static final class SerializedForm
        implements Serializable
    {

        private final ImmutableList ranges;

        Object readResolve()
        {
            if (ranges.isEmpty())
            {
                return ImmutableRangeSet.of();
            }
            if (ranges.equals(ImmutableList.of(Range.all())))
            {
                return ImmutableRangeSet.all();
            } else
            {
                return new ImmutableRangeSet(ranges);
            }
        }

        SerializedForm(ImmutableList immutablelist)
        {
            ranges = immutablelist;
        }
    }


    private static final ImmutableRangeSet ALL = new ImmutableRangeSet(ImmutableList.of(Range.all()));
    private static final ImmutableRangeSet EMPTY = new ImmutableRangeSet(ImmutableList.of());
    private transient ImmutableRangeSet complement;
    private final transient ImmutableList ranges;

    ImmutableRangeSet(ImmutableList immutablelist)
    {
        ranges = immutablelist;
    }

    private ImmutableRangeSet(ImmutableList immutablelist, ImmutableRangeSet immutablerangeset)
    {
        ranges = immutablelist;
        complement = immutablerangeset;
    }

    static ImmutableRangeSet all()
    {
        return ALL;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableRangeSet copyOf(RangeSet rangeset)
    {
        Preconditions.checkNotNull(rangeset);
        if (!rangeset.isEmpty()) goto _L2; else goto _L1
_L1:
        ImmutableRangeSet immutablerangeset = of();
_L4:
        return immutablerangeset;
_L2:
        ImmutableRangeSet immutablerangeset1;
        if (rangeset.encloses(Range.all()))
        {
            return all();
        }
        if (!(rangeset instanceof ImmutableRangeSet))
        {
            break; /* Loop/switch isn't completed */
        }
        immutablerangeset1 = (ImmutableRangeSet)rangeset;
        immutablerangeset = immutablerangeset1;
        if (!immutablerangeset1.isPartialView()) goto _L4; else goto _L3
_L3:
        return new ImmutableRangeSet(ImmutableList.copyOf(rangeset.asRanges()));
    }

    private ImmutableList intersectRanges(final Range range)
    {
        if (ranges.isEmpty() || range.isEmpty())
        {
            return ImmutableList.of();
        }
        if (range.encloses(span()))
        {
            return ranges;
        }
        final int fromIndex;
        final int length;
        if (range.hasLowerBound())
        {
            fromIndex = SortedLists.binarySearch(ranges, Range.upperBoundFn(), range.lowerBound, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        } else
        {
            fromIndex = 0;
        }
        if (range.hasUpperBound())
        {
            length = SortedLists.binarySearch(ranges, Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        } else
        {
            length = ranges.size();
        }
        length -= fromIndex;
        if (length == 0)
        {
            return ImmutableList.of();
        } else
        {
            return new ImmutableList() {

                final ImmutableRangeSet this$0;
                final int val$fromIndex;
                final int val$length;
                final Range val$range;

                public Range get(int i)
                {
                    Preconditions.checkElementIndex(i, length);
                    if (i == 0 || i == length - 1)
                    {
                        return ((Range)ranges.get(fromIndex + i)).intersection(range);
                    } else
                    {
                        return (Range)ranges.get(fromIndex + i);
                    }
                }

                public volatile Object get(int i)
                {
                    return get(i);
                }

                boolean isPartialView()
                {
                    return true;
                }

                public int size()
                {
                    return length;
                }

            
            {
                this$0 = ImmutableRangeSet.this;
                length = i;
                fromIndex = j;
                range = range1;
                super();
            }
            };
        }
    }

    public static ImmutableRangeSet of()
    {
        return EMPTY;
    }

    public static ImmutableRangeSet of(Range range)
    {
        Preconditions.checkNotNull(range);
        if (range.isEmpty())
        {
            return of();
        }
        if (range.equals(Range.all()))
        {
            return all();
        } else
        {
            return new ImmutableRangeSet(ImmutableList.of(range));
        }
    }

    public void add(Range range)
    {
        throw new UnsupportedOperationException();
    }

    public void addAll(RangeSet rangeset)
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableSet asRanges()
    {
        if (ranges.isEmpty())
        {
            return ImmutableSet.of();
        } else
        {
            return new RegularImmutableSortedSet(ranges, Range.RANGE_LEX_ORDERING);
        }
    }

    public volatile Set asRanges()
    {
        return asRanges();
    }

    public ImmutableSortedSet asSet(DiscreteDomain discretedomain)
    {
        Preconditions.checkNotNull(discretedomain);
        if (isEmpty())
        {
            return ImmutableSortedSet.of();
        }
        Range range = span().canonical(discretedomain);
        if (!range.hasLowerBound())
        {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!range.hasUpperBound())
        {
            try
            {
                discretedomain.maxValue();
            }
            // Misplaced declaration of an exception variable
            catch (DiscreteDomain discretedomain)
            {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new AsSet(discretedomain);
    }

    public volatile void clear()
    {
        super.clear();
    }

    public ImmutableRangeSet complement()
    {
        ImmutableRangeSet immutablerangeset = complement;
        if (immutablerangeset != null)
        {
            return immutablerangeset;
        }
        if (ranges.isEmpty())
        {
            ImmutableRangeSet immutablerangeset1 = all();
            complement = immutablerangeset1;
            return immutablerangeset1;
        }
        if (ranges.size() == 1 && ((Range)ranges.get(0)).equals(Range.all()))
        {
            ImmutableRangeSet immutablerangeset2 = of();
            complement = immutablerangeset2;
            return immutablerangeset2;
        } else
        {
            ImmutableRangeSet immutablerangeset3 = new ImmutableRangeSet(new ComplementRanges(), this);
            complement = immutablerangeset3;
            return immutablerangeset3;
        }
    }

    public volatile RangeSet complement()
    {
        return complement();
    }

    public volatile boolean contains(Comparable comparable)
    {
        return super.contains(comparable);
    }

    public boolean encloses(Range range)
    {
        int i = SortedLists.binarySearch(ranges, Range.lowerBoundFn(), range.lowerBound, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return i != -1 && ((Range)ranges.get(i)).encloses(range);
    }

    public volatile boolean enclosesAll(RangeSet rangeset)
    {
        return super.enclosesAll(rangeset);
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public boolean isEmpty()
    {
        return ranges.isEmpty();
    }

    boolean isPartialView()
    {
        return ranges.isPartialView();
    }

    public Range rangeContaining(Comparable comparable)
    {
        int i = SortedLists.binarySearch(ranges, Range.lowerBoundFn(), Cut.belowValue(comparable), Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (i != -1)
        {
            Range range = (Range)ranges.get(i);
            if (range.contains(comparable))
            {
                return range;
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
    }

    public void remove(Range range)
    {
        throw new UnsupportedOperationException();
    }

    public void removeAll(RangeSet rangeset)
    {
        throw new UnsupportedOperationException();
    }

    public Range span()
    {
        if (ranges.isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            return Range.create(((Range)ranges.get(0)).lowerBound, ((Range)ranges.get(ranges.size() - 1)).upperBound);
        }
    }

    public ImmutableRangeSet subRangeSet(Range range)
    {
        if (!isEmpty())
        {
            Range range1 = span();
            if (range.encloses(range1))
            {
                return this;
            }
            if (range.isConnected(range1))
            {
                return new ImmutableRangeSet(intersectRanges(range));
            }
        }
        return of();
    }

    public volatile RangeSet subRangeSet(Range range)
    {
        return subRangeSet(range);
    }

    Object writeReplace()
    {
        return new SerializedForm(ranges);
    }


}
