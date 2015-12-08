// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// Referenced classes of package com.google.common.collect:
//            AbstractRangeSet, Range, Cut, RangeSet, 
//            ForwardingCollection, Sets, AbstractNavigableMap, ImmutableSortedMap, 
//            Ordering, BoundType, Iterators, PeekingIterator, 
//            AbstractIterator, Maps, ImmutableRangeSet

public class TreeRangeSet extends AbstractRangeSet
{
    final class AsRanges extends ForwardingCollection
        implements Set
    {

        final TreeRangeSet this$0;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Collection _mthdelegate()
        {
            return rangesByLowerBound.values();
        }

        public boolean equals(Object obj)
        {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode()
        {
            return Sets.hashCodeImpl(this);
        }

        AsRanges()
        {
            this$0 = TreeRangeSet.this;
            super();
        }
    }

    private final class Complement extends TreeRangeSet
    {

        final TreeRangeSet this$0;

        public void add(Range range)
        {
            TreeRangeSet.this.remove(range);
        }

        public RangeSet complement()
        {
            return TreeRangeSet.this;
        }

        public boolean contains(Comparable comparable)
        {
            return !TreeRangeSet.this.contains(comparable);
        }

        public void remove(Range range)
        {
            TreeRangeSet.this.add(range);
        }

        Complement()
        {
            this$0 = TreeRangeSet.this;
            super(new ComplementRangesByLowerBound(rangesByLowerBound), null);
        }
    }

    private static final class ComplementRangesByLowerBound extends AbstractNavigableMap
    {

        private final Range complementLowerBoundWindow;
        private final NavigableMap positiveRangesByLowerBound;
        private final NavigableMap positiveRangesByUpperBound;

        private NavigableMap subMap(Range range)
        {
            if (!complementLowerBoundWindow.isConnected(range))
            {
                return ImmutableSortedMap.of();
            } else
            {
                range = range.intersection(complementLowerBoundWindow);
                return new ComplementRangesByLowerBound(positiveRangesByLowerBound, range);
            }
        }

        public Comparator comparator()
        {
            return Ordering.natural();
        }

        public boolean containsKey(Object obj)
        {
            return get(obj) != null;
        }

        Iterator descendingEntryIterator()
        {
            Cut cut;
            PeekingIterator peekingiterator;
            boolean flag;
            if (complementLowerBoundWindow.hasUpperBound())
            {
                cut = (Cut)complementLowerBoundWindow.upperEndpoint();
            } else
            {
                cut = Cut.aboveAll();
            }
            if (complementLowerBoundWindow.hasUpperBound() && complementLowerBoundWindow.upperBoundType() == BoundType.CLOSED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            peekingiterator = Iterators.peekingIterator(positiveRangesByUpperBound.headMap(cut, flag).descendingMap().values().iterator());
            if (peekingiterator.hasNext())
            {
                if (((Range)peekingiterator.peek()).upperBound == Cut.aboveAll())
                {
                    cut = ((Range)peekingiterator.next()).lowerBound;
                } else
                {
                    cut = (Cut)positiveRangesByLowerBound.higherKey(((Range)peekingiterator.peek()).upperBound);
                }
            } else
            {
                if (!complementLowerBoundWindow.contains(Cut.belowAll()) || positiveRangesByLowerBound.containsKey(Cut.belowAll()))
                {
                    return Iterators.emptyIterator();
                }
                cut = (Cut)positiveRangesByLowerBound.higherKey(Cut.belowAll());
            }
            return peekingiterator. new AbstractIterator() {

                Cut nextComplementRangeUpperBound;
                final ComplementRangesByLowerBound this$0;
                final Cut val$firstComplementRangeUpperBound;
                final PeekingIterator val$positiveItr;

                protected volatile Object computeNext()
                {
                    return computeNext();
                }

                protected java.util.Map.Entry computeNext()
                {
                    if (nextComplementRangeUpperBound == Cut.belowAll())
                    {
                        return (java.util.Map.Entry)endOfData();
                    }
                    if (positiveItr.hasNext())
                    {
                        Range range = (Range)positiveItr.next();
                        Range range2 = Range.create(range.upperBound, nextComplementRangeUpperBound);
                        nextComplementRangeUpperBound = range.lowerBound;
                        if (complementLowerBoundWindow.lowerBound.isLessThan(range2.lowerBound))
                        {
                            return Maps.immutableEntry(range2.lowerBound, range2);
                        }
                    } else
                    if (complementLowerBoundWindow.lowerBound.isLessThan(Cut.belowAll()))
                    {
                        Range range1 = Range.create(Cut.belowAll(), nextComplementRangeUpperBound);
                        nextComplementRangeUpperBound = Cut.belowAll();
                        return Maps.immutableEntry(Cut.belowAll(), range1);
                    }
                    return (java.util.Map.Entry)endOfData();
                }

            
            {
                this$0 = final_complementrangesbylowerbound;
                firstComplementRangeUpperBound = cut;
                positiveItr = PeekingIterator.this;
                super();
                nextComplementRangeUpperBound = firstComplementRangeUpperBound;
            }
            };
        }

        Iterator entryIterator()
        {
            final Object firstComplementRangeLowerBound;
            Object obj;
            if (complementLowerBoundWindow.hasLowerBound())
            {
                firstComplementRangeLowerBound = positiveRangesByUpperBound;
                obj = complementLowerBoundWindow.lowerEndpoint();
                boolean flag;
                if (complementLowerBoundWindow.lowerBoundType() == BoundType.CLOSED)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                firstComplementRangeLowerBound = ((NavigableMap) (firstComplementRangeLowerBound)).tailMap(obj, flag).values();
            } else
            {
                firstComplementRangeLowerBound = positiveRangesByUpperBound.values();
            }
            obj = Iterators.peekingIterator(((Collection) (firstComplementRangeLowerBound)).iterator());
            if (complementLowerBoundWindow.contains(Cut.belowAll()) && (!((PeekingIterator) (obj)).hasNext() || ((Range)((PeekingIterator) (obj)).peek()).lowerBound != Cut.belowAll()))
            {
                firstComplementRangeLowerBound = Cut.belowAll();
            } else
            if (((PeekingIterator) (obj)).hasNext())
            {
                firstComplementRangeLowerBound = ((Range)((PeekingIterator) (obj)).next()).upperBound;
            } else
            {
                return Iterators.emptyIterator();
            }
            return ((_cls1) (obj)). new AbstractIterator() {

                Cut nextComplementRangeLowerBound;
                final ComplementRangesByLowerBound this$0;
                final Cut val$firstComplementRangeLowerBound;
                final PeekingIterator val$positiveItr;

                protected volatile Object computeNext()
                {
                    return computeNext();
                }

                protected java.util.Map.Entry computeNext()
                {
                    if (complementLowerBoundWindow.upperBound.isLessThan(nextComplementRangeLowerBound) || nextComplementRangeLowerBound == Cut.aboveAll())
                    {
                        return (java.util.Map.Entry)endOfData();
                    }
                    Range range;
                    if (positiveItr.hasNext())
                    {
                        Range range1 = (Range)positiveItr.next();
                        range = Range.create(nextComplementRangeLowerBound, range1.lowerBound);
                        nextComplementRangeLowerBound = range1.upperBound;
                    } else
                    {
                        range = Range.create(nextComplementRangeLowerBound, Cut.aboveAll());
                        nextComplementRangeLowerBound = Cut.aboveAll();
                    }
                    return Maps.immutableEntry(range.lowerBound, range);
                }

            
            {
                this$0 = final_complementrangesbylowerbound;
                firstComplementRangeLowerBound = cut;
                positiveItr = PeekingIterator.this;
                super();
                nextComplementRangeLowerBound = firstComplementRangeLowerBound;
            }
            };
        }

        public Range get(Object obj)
        {
            if (!(obj instanceof Cut))
            {
                break MISSING_BLOCK_LABEL_59;
            }
            java.util.Map.Entry entry;
            try
            {
                obj = (Cut)obj;
                entry = tailMap(((Cut) (obj)), true).firstEntry();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
            if (entry == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            if (!((Cut)entry.getKey()).equals(obj))
            {
                break MISSING_BLOCK_LABEL_59;
            }
            obj = (Range)entry.getValue();
            return ((Range) (obj));
            return null;
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public NavigableMap headMap(Cut cut, boolean flag)
        {
            return subMap(Range.upTo(cut, BoundType.forBoolean(flag)));
        }

        public volatile NavigableMap headMap(Object obj, boolean flag)
        {
            return headMap((Cut)obj, flag);
        }

        public int size()
        {
            return Iterators.size(entryIterator());
        }

        public NavigableMap subMap(Cut cut, boolean flag, Cut cut1, boolean flag1)
        {
            return subMap(Range.range(cut, BoundType.forBoolean(flag), cut1, BoundType.forBoolean(flag1)));
        }

        public volatile NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return subMap((Cut)obj, flag, (Cut)obj1, flag1);
        }

        public NavigableMap tailMap(Cut cut, boolean flag)
        {
            return subMap(Range.downTo(cut, BoundType.forBoolean(flag)));
        }

        public volatile NavigableMap tailMap(Object obj, boolean flag)
        {
            return tailMap((Cut)obj, flag);
        }


        ComplementRangesByLowerBound(NavigableMap navigablemap)
        {
            this(navigablemap, Range.all());
        }

        private ComplementRangesByLowerBound(NavigableMap navigablemap, Range range)
        {
            positiveRangesByLowerBound = navigablemap;
            positiveRangesByUpperBound = new RangesByUpperBound(navigablemap);
            complementLowerBoundWindow = range;
        }
    }

    static final class RangesByUpperBound extends AbstractNavigableMap
    {

        private final NavigableMap rangesByLowerBound;
        private final Range upperBoundWindow;

        private NavigableMap subMap(Range range)
        {
            if (range.isConnected(upperBoundWindow))
            {
                return new RangesByUpperBound(rangesByLowerBound, range.intersection(upperBoundWindow));
            } else
            {
                return ImmutableSortedMap.of();
            }
        }

        public Comparator comparator()
        {
            return Ordering.natural();
        }

        public boolean containsKey(Object obj)
        {
            return get(obj) != null;
        }

        Iterator descendingEntryIterator()
        {
            Object obj;
            if (upperBoundWindow.hasUpperBound())
            {
                obj = rangesByLowerBound.headMap(upperBoundWindow.upperEndpoint(), false).descendingMap().values();
            } else
            {
                obj = rangesByLowerBound.descendingMap().values();
            }
            obj = Iterators.peekingIterator(((Collection) (obj)).iterator());
            if (((PeekingIterator) (obj)).hasNext() && upperBoundWindow.upperBound.isLessThan(((Range)((PeekingIterator) (obj)).peek()).upperBound))
            {
                ((PeekingIterator) (obj)).next();
            }
            return ((_cls2) (obj)). new AbstractIterator() {

                final RangesByUpperBound this$0;
                final PeekingIterator val$backingItr;

                protected volatile Object computeNext()
                {
                    return computeNext();
                }

                protected java.util.Map.Entry computeNext()
                {
                    if (!backingItr.hasNext())
                    {
                        return (java.util.Map.Entry)endOfData();
                    }
                    Range range = (Range)backingItr.next();
                    if (upperBoundWindow.lowerBound.isLessThan(range.upperBound))
                    {
                        return Maps.immutableEntry(range.upperBound, range);
                    } else
                    {
                        return (java.util.Map.Entry)endOfData();
                    }
                }

            
            {
                this$0 = final_rangesbyupperbound;
                backingItr = PeekingIterator.this;
                super();
            }
            };
        }

        Iterator entryIterator()
        {
            Object obj;
            if (!upperBoundWindow.hasLowerBound())
            {
                obj = rangesByLowerBound.values().iterator();
            } else
            {
                obj = rangesByLowerBound.lowerEntry(upperBoundWindow.lowerEndpoint());
                if (obj == null)
                {
                    obj = rangesByLowerBound.values().iterator();
                } else
                if (upperBoundWindow.lowerBound.isLessThan(((Range)((java.util.Map.Entry) (obj)).getValue()).upperBound))
                {
                    obj = rangesByLowerBound.tailMap(((java.util.Map.Entry) (obj)).getKey(), true).values().iterator();
                } else
                {
                    obj = rangesByLowerBound.tailMap(upperBoundWindow.lowerEndpoint(), true).values().iterator();
                }
            }
            return ((_cls1) (obj)). new AbstractIterator() {

                final RangesByUpperBound this$0;
                final Iterator val$backingItr;

                protected volatile Object computeNext()
                {
                    return computeNext();
                }

                protected java.util.Map.Entry computeNext()
                {
                    if (!backingItr.hasNext())
                    {
                        return (java.util.Map.Entry)endOfData();
                    }
                    Range range = (Range)backingItr.next();
                    if (upperBoundWindow.upperBound.isLessThan(range.upperBound))
                    {
                        return (java.util.Map.Entry)endOfData();
                    } else
                    {
                        return Maps.immutableEntry(range.upperBound, range);
                    }
                }

            
            {
                this$0 = final_rangesbyupperbound;
                backingItr = Iterator.this;
                super();
            }
            };
        }

        public Range get(Object obj)
        {
            if (!(obj instanceof Cut))
            {
                break MISSING_BLOCK_LABEL_74;
            }
            obj = (Cut)obj;
            if (!upperBoundWindow.contains(((Comparable) (obj))))
            {
                return null;
            }
            java.util.Map.Entry entry;
            try
            {
                entry = rangesByLowerBound.lowerEntry(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
            if (entry == null)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            if (!((Range)entry.getValue()).upperBound.equals(obj))
            {
                break MISSING_BLOCK_LABEL_74;
            }
            obj = (Range)entry.getValue();
            return ((Range) (obj));
            return null;
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public NavigableMap headMap(Cut cut, boolean flag)
        {
            return subMap(Range.upTo(cut, BoundType.forBoolean(flag)));
        }

        public volatile NavigableMap headMap(Object obj, boolean flag)
        {
            return headMap((Cut)obj, flag);
        }

        public boolean isEmpty()
        {
            if (upperBoundWindow.equals(Range.all()))
            {
                return rangesByLowerBound.isEmpty();
            }
            return !entryIterator().hasNext();
        }

        public int size()
        {
            if (upperBoundWindow.equals(Range.all()))
            {
                return rangesByLowerBound.size();
            } else
            {
                return Iterators.size(entryIterator());
            }
        }

        public NavigableMap subMap(Cut cut, boolean flag, Cut cut1, boolean flag1)
        {
            return subMap(Range.range(cut, BoundType.forBoolean(flag), cut1, BoundType.forBoolean(flag1)));
        }

        public volatile NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return subMap((Cut)obj, flag, (Cut)obj1, flag1);
        }

        public NavigableMap tailMap(Cut cut, boolean flag)
        {
            return subMap(Range.downTo(cut, BoundType.forBoolean(flag)));
        }

        public volatile NavigableMap tailMap(Object obj, boolean flag)
        {
            return tailMap((Cut)obj, flag);
        }


        RangesByUpperBound(NavigableMap navigablemap)
        {
            rangesByLowerBound = navigablemap;
            upperBoundWindow = Range.all();
        }

        private RangesByUpperBound(NavigableMap navigablemap, Range range)
        {
            rangesByLowerBound = navigablemap;
            upperBoundWindow = range;
        }
    }

    private final class SubRangeSet extends TreeRangeSet
    {

        private final Range restriction;
        final TreeRangeSet this$0;

        public void add(Range range)
        {
            Preconditions.checkArgument(restriction.encloses(range), "Cannot add range %s to subRangeSet(%s)", new Object[] {
                range, restriction
            });
            add(range);
        }

        public void clear()
        {
            TreeRangeSet.this.remove(restriction);
        }

        public boolean contains(Comparable comparable)
        {
            return restriction.contains(comparable) && TreeRangeSet.this.contains(comparable);
        }

        public boolean encloses(Range range)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (!restriction.isEmpty())
            {
                flag = flag1;
                if (restriction.encloses(range))
                {
                    range = rangeEnclosing(range);
                    flag = flag1;
                    if (range != null)
                    {
                        flag = flag1;
                        if (!range.intersection(restriction).isEmpty())
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public Range rangeContaining(Comparable comparable)
        {
            if (restriction.contains(comparable))
            {
                if ((comparable = TreeRangeSet.this.rangeContaining(comparable)) != null)
                {
                    return comparable.intersection(restriction);
                }
            }
            return null;
        }

        public void remove(Range range)
        {
            if (range.isConnected(restriction))
            {
                TreeRangeSet.this.remove(range.intersection(restriction));
            }
        }

        public RangeSet subRangeSet(Range range)
        {
            if (range.encloses(restriction))
            {
                return this;
            }
            if (range.isConnected(restriction))
            {
                return new SubRangeSet(restriction.intersection(range));
            } else
            {
                return ImmutableRangeSet.of();
            }
        }

        SubRangeSet(Range range)
        {
            this$0 = TreeRangeSet.this;
            super(new SubRangeSetRangesByLowerBound(Range.all(), range, rangesByLowerBound), null);
            restriction = range;
        }
    }

    private static final class SubRangeSetRangesByLowerBound extends AbstractNavigableMap
    {

        private final Range lowerBoundWindow;
        private final NavigableMap rangesByLowerBound;
        private final NavigableMap rangesByUpperBound;
        private final Range restriction;

        private NavigableMap subMap(Range range)
        {
            if (!range.isConnected(lowerBoundWindow))
            {
                return ImmutableSortedMap.of();
            } else
            {
                return new SubRangeSetRangesByLowerBound(lowerBoundWindow.intersection(range), restriction, rangesByLowerBound);
            }
        }

        public Comparator comparator()
        {
            return Ordering.natural();
        }

        public boolean containsKey(Object obj)
        {
            return get(obj) != null;
        }

        Iterator descendingEntryIterator()
        {
            if (restriction.isEmpty())
            {
                return Iterators.emptyIterator();
            }
            Cut cut = (Cut)Ordering.natural().min(lowerBoundWindow.upperBound, Cut.belowValue(restriction.upperBound));
            NavigableMap navigablemap = rangesByLowerBound;
            Comparable comparable = cut.endpoint();
            boolean flag;
            if (cut.typeAsUpperBound() == BoundType.CLOSED)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return navigablemap.headMap(comparable, flag).descendingMap().values().iterator(). new AbstractIterator() {

                final SubRangeSetRangesByLowerBound this$0;
                final Iterator val$completeRangeItr;

                protected volatile Object computeNext()
                {
                    return computeNext();
                }

                protected java.util.Map.Entry computeNext()
                {
                    if (!completeRangeItr.hasNext())
                    {
                        return (java.util.Map.Entry)endOfData();
                    }
                    Range range = (Range)completeRangeItr.next();
                    if (restriction.lowerBound.compareTo(range.upperBound) >= 0)
                    {
                        return (java.util.Map.Entry)endOfData();
                    }
                    range = range.intersection(restriction);
                    if (lowerBoundWindow.contains(range.lowerBound))
                    {
                        return Maps.immutableEntry(range.lowerBound, range);
                    } else
                    {
                        return (java.util.Map.Entry)endOfData();
                    }
                }

            
            {
                this$0 = final_subrangesetrangesbylowerbound;
                completeRangeItr = Iterator.this;
                super();
            }
            };
        }

        Iterator entryIterator()
        {
            boolean flag = false;
            if (restriction.isEmpty())
            {
                return Iterators.emptyIterator();
            }
            if (lowerBoundWindow.upperBound.isLessThan(restriction.lowerBound))
            {
                return Iterators.emptyIterator();
            }
            final Object completeRangeItr;
            if (lowerBoundWindow.lowerBound.isLessThan(restriction.lowerBound))
            {
                completeRangeItr = rangesByUpperBound.tailMap(restriction.lowerBound, false).values().iterator();
            } else
            {
                completeRangeItr = rangesByLowerBound;
                Comparable comparable = lowerBoundWindow.lowerBound.endpoint();
                if (lowerBoundWindow.lowerBoundType() == BoundType.CLOSED)
                {
                    flag = true;
                }
                completeRangeItr = ((NavigableMap) (completeRangeItr)).tailMap(comparable, flag).values().iterator();
            }
            return ((Cut)Ordering.natural().min(lowerBoundWindow.upperBound, Cut.belowValue(restriction.upperBound))). new AbstractIterator() {

                final SubRangeSetRangesByLowerBound this$0;
                final Iterator val$completeRangeItr;
                final Cut val$upperBoundOnLowerBounds;

                protected volatile Object computeNext()
                {
                    return computeNext();
                }

                protected java.util.Map.Entry computeNext()
                {
                    if (!completeRangeItr.hasNext())
                    {
                        return (java.util.Map.Entry)endOfData();
                    }
                    Range range = (Range)completeRangeItr.next();
                    if (upperBoundOnLowerBounds.isLessThan(range.lowerBound))
                    {
                        return (java.util.Map.Entry)endOfData();
                    } else
                    {
                        range = range.intersection(restriction);
                        return Maps.immutableEntry(range.lowerBound, range);
                    }
                }

            
            {
                this$0 = final_subrangesetrangesbylowerbound;
                completeRangeItr = iterator;
                upperBoundOnLowerBounds = Cut.this;
                super();
            }
            };
        }

        public Range get(Object obj)
        {
            if (!(obj instanceof Cut))
            {
                break MISSING_BLOCK_LABEL_144;
            }
            obj = (Cut)obj;
            if (!lowerBoundWindow.contains(((Comparable) (obj))) || ((Cut) (obj)).compareTo(restriction.lowerBound) < 0)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            if (((Cut) (obj)).compareTo(restriction.upperBound) >= 0)
            {
                return null;
            }
            if (!((Cut) (obj)).equals(restriction.lowerBound))
            {
                break MISSING_BLOCK_LABEL_114;
            }
            obj = (Range)Maps.valueOrNull(rangesByLowerBound.floorEntry(obj));
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            if (((Range) (obj)).upperBound.compareTo(restriction.lowerBound) > 0)
            {
                return ((Range) (obj)).intersection(restriction);
            }
            break MISSING_BLOCK_LABEL_144;
            obj = (Range)rangesByLowerBound.get(obj);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            obj = ((Range) (obj)).intersection(restriction);
            return ((Range) (obj));
            obj;
            return null;
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public NavigableMap headMap(Cut cut, boolean flag)
        {
            return subMap(Range.upTo(cut, BoundType.forBoolean(flag)));
        }

        public volatile NavigableMap headMap(Object obj, boolean flag)
        {
            return headMap((Cut)obj, flag);
        }

        public int size()
        {
            return Iterators.size(entryIterator());
        }

        public NavigableMap subMap(Cut cut, boolean flag, Cut cut1, boolean flag1)
        {
            return subMap(Range.range(cut, BoundType.forBoolean(flag), cut1, BoundType.forBoolean(flag1)));
        }

        public volatile NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
        {
            return subMap((Cut)obj, flag, (Cut)obj1, flag1);
        }

        public NavigableMap tailMap(Cut cut, boolean flag)
        {
            return subMap(Range.downTo(cut, BoundType.forBoolean(flag)));
        }

        public volatile NavigableMap tailMap(Object obj, boolean flag)
        {
            return tailMap((Cut)obj, flag);
        }



        private SubRangeSetRangesByLowerBound(Range range, Range range1, NavigableMap navigablemap)
        {
            lowerBoundWindow = (Range)Preconditions.checkNotNull(range);
            restriction = (Range)Preconditions.checkNotNull(range1);
            rangesByLowerBound = (NavigableMap)Preconditions.checkNotNull(navigablemap);
            rangesByUpperBound = new RangesByUpperBound(navigablemap);
        }

    }


    private transient Set asRanges;
    private transient RangeSet complement;
    final NavigableMap rangesByLowerBound;

    private TreeRangeSet(NavigableMap navigablemap)
    {
        rangesByLowerBound = navigablemap;
    }


    public static TreeRangeSet create()
    {
        return new TreeRangeSet(new TreeMap());
    }

    public static TreeRangeSet create(RangeSet rangeset)
    {
        TreeRangeSet treerangeset = create();
        treerangeset.addAll(rangeset);
        return treerangeset;
    }

    private Range rangeEnclosing(Range range)
    {
        Preconditions.checkNotNull(range);
        java.util.Map.Entry entry = rangesByLowerBound.floorEntry(range.lowerBound);
        if (entry != null && ((Range)entry.getValue()).encloses(range))
        {
            return (Range)entry.getValue();
        } else
        {
            return null;
        }
    }

    private void replaceRangeWithSameLowerBound(Range range)
    {
        if (range.isEmpty())
        {
            rangesByLowerBound.remove(range.lowerBound);
            return;
        } else
        {
            rangesByLowerBound.put(range.lowerBound, range);
            return;
        }
    }

    public void add(Range range)
    {
        Preconditions.checkNotNull(range);
        if (range.isEmpty())
        {
            return;
        }
        Object obj1 = range.lowerBound;
        Object obj = range.upperBound;
        Object obj2 = rangesByLowerBound.lowerEntry(obj1);
        Cut cut = ((Cut) (obj1));
        range = ((Range) (obj));
        if (obj2 != null)
        {
            obj2 = (Range)((java.util.Map.Entry) (obj2)).getValue();
            cut = ((Cut) (obj1));
            range = ((Range) (obj));
            if (((Range) (obj2)).upperBound.compareTo(((Cut) (obj1))) >= 0)
            {
                range = ((Range) (obj));
                if (((Range) (obj2)).upperBound.compareTo(((Cut) (obj))) >= 0)
                {
                    range = ((Range) (obj2)).upperBound;
                }
                cut = ((Range) (obj2)).lowerBound;
            }
        }
        obj1 = rangesByLowerBound.floorEntry(range);
        obj = range;
        if (obj1 != null)
        {
            obj1 = (Range)((java.util.Map.Entry) (obj1)).getValue();
            obj = range;
            if (((Range) (obj1)).upperBound.compareTo(range) >= 0)
            {
                obj = ((Range) (obj1)).upperBound;
            }
        }
        rangesByLowerBound.subMap(cut, obj).clear();
        replaceRangeWithSameLowerBound(Range.create(cut, ((Cut) (obj))));
    }

    public volatile void addAll(RangeSet rangeset)
    {
        super.addAll(rangeset);
    }

    public Set asRanges()
    {
        Set set = asRanges;
        Object obj = set;
        if (set == null)
        {
            obj = new AsRanges();
            asRanges = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public volatile void clear()
    {
        super.clear();
    }

    public RangeSet complement()
    {
        RangeSet rangeset = complement;
        Object obj = rangeset;
        if (rangeset == null)
        {
            obj = new Complement();
            complement = ((RangeSet) (obj));
        }
        return ((RangeSet) (obj));
    }

    public volatile boolean contains(Comparable comparable)
    {
        return super.contains(comparable);
    }

    public boolean encloses(Range range)
    {
        Preconditions.checkNotNull(range);
        java.util.Map.Entry entry = rangesByLowerBound.floorEntry(range.lowerBound);
        return entry != null && ((Range)entry.getValue()).encloses(range);
    }

    public volatile boolean enclosesAll(RangeSet rangeset)
    {
        return super.enclosesAll(rangeset);
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile boolean isEmpty()
    {
        return super.isEmpty();
    }

    public Range rangeContaining(Comparable comparable)
    {
        Preconditions.checkNotNull(comparable);
        java.util.Map.Entry entry = rangesByLowerBound.floorEntry(Cut.belowValue(comparable));
        if (entry != null && ((Range)entry.getValue()).contains(comparable))
        {
            return (Range)entry.getValue();
        } else
        {
            return null;
        }
    }

    public void remove(Range range)
    {
        Preconditions.checkNotNull(range);
        if (range.isEmpty())
        {
            return;
        }
        Object obj = rangesByLowerBound.lowerEntry(range.lowerBound);
        if (obj != null)
        {
            obj = (Range)((java.util.Map.Entry) (obj)).getValue();
            if (((Range) (obj)).upperBound.compareTo(range.lowerBound) >= 0)
            {
                if (range.hasUpperBound() && ((Range) (obj)).upperBound.compareTo(range.upperBound) >= 0)
                {
                    replaceRangeWithSameLowerBound(Range.create(range.upperBound, ((Range) (obj)).upperBound));
                }
                replaceRangeWithSameLowerBound(Range.create(((Range) (obj)).lowerBound, range.lowerBound));
            }
        }
        obj = rangesByLowerBound.floorEntry(range.upperBound);
        if (obj != null)
        {
            obj = (Range)((java.util.Map.Entry) (obj)).getValue();
            if (range.hasUpperBound() && ((Range) (obj)).upperBound.compareTo(range.upperBound) >= 0)
            {
                replaceRangeWithSameLowerBound(Range.create(range.upperBound, ((Range) (obj)).upperBound));
            }
        }
        rangesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    public volatile void removeAll(RangeSet rangeset)
    {
        super.removeAll(rangeset);
    }

    public Range span()
    {
        java.util.Map.Entry entry = rangesByLowerBound.firstEntry();
        java.util.Map.Entry entry1 = rangesByLowerBound.lastEntry();
        if (entry == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return Range.create(((Range)entry.getValue()).lowerBound, ((Range)entry1.getValue()).upperBound);
        }
    }

    public RangeSet subRangeSet(Range range)
    {
        if (range.equals(Range.all()))
        {
            return this;
        } else
        {
            return new SubRangeSet(range);
        }
    }

}
