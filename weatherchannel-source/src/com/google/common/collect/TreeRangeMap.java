// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            RangeMap, Maps, Cut, Range, 
//            AbstractMapEntry, Lists, Iterators, AbstractIterator

public final class TreeRangeMap
    implements RangeMap
{
    private final class AsMapOfRanges extends AbstractMap
    {

        final TreeRangeMap this$0;

        public boolean containsKey(Object obj)
        {
            return get(obj) != null;
        }

        public Set entrySet()
        {
            return new AbstractSet() {

                final AsMapOfRanges this$1;

                public Iterator iterator()
                {
                    return entriesByLowerBound.values().iterator();
                }

                public int size()
                {
                    return entriesByLowerBound.size();
                }

            
            {
                this$1 = AsMapOfRanges.this;
                super();
            }
            };
        }

        public Object get(Object obj)
        {
            if (obj instanceof Range)
            {
                obj = (Range)obj;
                RangeMapEntry rangemapentry = (RangeMapEntry)entriesByLowerBound.get(((Range) (obj)).lowerBound);
                if (rangemapentry != null && rangemapentry.getKey().equals(obj))
                {
                    return rangemapentry.getValue();
                }
            }
            return null;
        }

        private AsMapOfRanges()
        {
            this$0 = TreeRangeMap.this;
            super();
        }

    }

    private static final class RangeMapEntry extends AbstractMapEntry
    {

        private final Range range;
        private final Object value;

        public boolean contains(Comparable comparable)
        {
            return range.contains(comparable);
        }

        public Range getKey()
        {
            return range;
        }

        public volatile Object getKey()
        {
            return getKey();
        }

        Cut getLowerBound()
        {
            return range.lowerBound;
        }

        Cut getUpperBound()
        {
            return range.upperBound;
        }

        public Object getValue()
        {
            return value;
        }

        RangeMapEntry(Cut cut, Cut cut1, Object obj)
        {
            this(Range.create(cut, cut1), obj);
        }

        RangeMapEntry(Range range1, Object obj)
        {
            range = range1;
            value = obj;
        }
    }

    private class SubRangeMap
        implements RangeMap
    {

        private final Range subRange;
        final TreeRangeMap this$0;

        public Map asMapOfRanges()
        {
            return new SubRangeMapAsMap();
        }

        public void clear()
        {
            TreeRangeMap.this.remove(subRange);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof RangeMap)
            {
                obj = (RangeMap)obj;
                return asMapOfRanges().equals(((RangeMap) (obj)).asMapOfRanges());
            } else
            {
                return false;
            }
        }

        public Object get(Comparable comparable)
        {
            if (subRange.contains(comparable))
            {
                return TreeRangeMap.this.get(comparable);
            } else
            {
                return null;
            }
        }

        public java.util.Map.Entry getEntry(Comparable comparable)
        {
            if (subRange.contains(comparable))
            {
                comparable = TreeRangeMap.this.getEntry(comparable);
                if (comparable != null)
                {
                    return Maps.immutableEntry(((Range)comparable.getKey()).intersection(subRange), comparable.getValue());
                }
            }
            return null;
        }

        public int hashCode()
        {
            return asMapOfRanges().hashCode();
        }

        public void put(Range range, Object obj)
        {
            Preconditions.checkArgument(subRange.encloses(range), "Cannot put range %s into a subRangeMap(%s)", new Object[] {
                range, subRange
            });
            TreeRangeMap.this.put(range, obj);
        }

        public void putAll(RangeMap rangemap)
        {
            if (rangemap.asMapOfRanges().isEmpty())
            {
                return;
            } else
            {
                Range range = rangemap.span();
                Preconditions.checkArgument(subRange.encloses(range), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", new Object[] {
                    range, subRange
                });
                TreeRangeMap.this.putAll(rangemap);
                return;
            }
        }

        public void remove(Range range)
        {
            if (range.isConnected(subRange))
            {
                TreeRangeMap.this.remove(range.intersection(subRange));
            }
        }

        public Range span()
        {
            Object obj = entriesByLowerBound.floorEntry(subRange.lowerBound);
            if (obj == null || ((RangeMapEntry)((java.util.Map.Entry) (obj)).getValue()).getUpperBound().compareTo(subRange.lowerBound) <= 0) goto _L2; else goto _L1
_L1:
            obj = subRange.lowerBound;
_L4:
            Object obj1;
            obj1 = entriesByLowerBound.lowerEntry(subRange.upperBound);
            if (obj1 == null)
            {
                throw new NoSuchElementException();
            }
            break MISSING_BLOCK_LABEL_140;
_L2:
            obj1 = (Cut)entriesByLowerBound.ceilingKey(subRange.lowerBound);
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = obj1;
            if (((Cut) (obj1)).compareTo(subRange.upperBound) < 0) goto _L4; else goto _L3
_L3:
            throw new NoSuchElementException();
            if (((RangeMapEntry)((java.util.Map.Entry) (obj1)).getValue()).getUpperBound().compareTo(subRange.upperBound) >= 0)
            {
                obj1 = subRange.upperBound;
            } else
            {
                obj1 = ((RangeMapEntry)((java.util.Map.Entry) (obj1)).getValue()).getUpperBound();
            }
            return Range.create(((Cut) (obj)), ((Cut) (obj1)));
        }

        public RangeMap subRangeMap(Range range)
        {
            if (!range.isConnected(subRange))
            {
                return emptySubRangeMap();
            } else
            {
                return TreeRangeMap.this.subRangeMap(range.intersection(subRange));
            }
        }

        public String toString()
        {
            return asMapOfRanges().toString();
        }


        SubRangeMap(Range range)
        {
            this$0 = TreeRangeMap.this;
            super();
            subRange = range;
        }
    }

    class SubRangeMap.SubRangeMapAsMap extends AbstractMap
    {

        final SubRangeMap this$1;

        private boolean removeEntryIf(Predicate predicate)
        {
            java.util.ArrayList arraylist = Lists.newArrayList();
            Iterator iterator = entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (predicate.apply(entry))
                {
                    arraylist.add(entry.getKey());
                }
            } while (true);
            Range range;
            for (predicate = arraylist.iterator(); predicate.hasNext(); TreeRangeMap.this.remove(range))
            {
                range = (Range)predicate.next();
            }

            return !arraylist.isEmpty();
        }

        public void clear()
        {
            SubRangeMap.this.clear();
        }

        public boolean containsKey(Object obj)
        {
            return get(obj) != null;
        }

        public Set entrySet()
        {
            return new Maps.EntrySet() {

                final SubRangeMap.SubRangeMapAsMap this$2;

                public boolean isEmpty()
                {
                    return !iterator().hasNext();
                }

                public Iterator iterator()
                {
                    if (subRange.isEmpty())
                    {
                        return Iterators.emptyIterator();
                    } else
                    {
                        Cut cut = (Cut)MoreObjects.firstNonNull(entriesByLowerBound.floorKey(subRange.lowerBound), subRange.lowerBound);
                        return entriesByLowerBound.tailMap(cut, true).values().iterator(). new AbstractIterator() {

                            final SubRangeMap.SubRangeMapAsMap._cls2 this$3;
                            final Iterator val$backingItr;

                            protected volatile Object computeNext()
                            {
                                return computeNext();
                            }

                            protected java.util.Map.Entry computeNext()
                            {
                                RangeMapEntry rangemapentry;
                                do
                                {
                                    if (backingItr.hasNext())
                                    {
                                        rangemapentry = (RangeMapEntry)backingItr.next();
                                        if (rangemapentry.getLowerBound().compareTo(subRange.upperBound) < 0)
                                        {
                                            continue;
                                        }
                                    }
                                    return (java.util.Map.Entry)endOfData();
                                } while (rangemapentry.getUpperBound().compareTo(subRange.lowerBound) <= 0);
                                return Maps.immutableEntry(rangemapentry.getKey().intersection(subRange), rangemapentry.getValue());
                            }

            
            {
                this$3 = final__pcls2;
                backingItr = Iterator.this;
                super();
            }
                        };
                    }
                }

                Map map()
                {
                    return SubRangeMap.SubRangeMapAsMap.this;
                }

                public boolean retainAll(Collection collection)
                {
                    return removeEntryIf(Predicates.not(Predicates.in(collection)));
                }

                public int size()
                {
                    return Iterators.size(iterator());
                }

            
            {
                this$2 = SubRangeMap.SubRangeMapAsMap.this;
                super();
            }
            };
        }

        public Object get(Object obj)
        {
            Range range;
            if (!(obj instanceof Range))
            {
                break MISSING_BLOCK_LABEL_165;
            }
            range = (Range)obj;
            if (!subRange.encloses(range))
            {
                break MISSING_BLOCK_LABEL_165;
            }
            if (range.isEmpty())
            {
                return null;
            }
            obj = null;
            java.util.Map.Entry entry;
            if (range.lowerBound.compareTo(subRange.lowerBound) != 0)
            {
                break MISSING_BLOCK_LABEL_138;
            }
            entry = entriesByLowerBound.floorEntry(range.lowerBound);
            if (entry == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            obj = (RangeMapEntry)entry.getValue();
_L2:
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_165;
            }
            if (((RangeMapEntry) (obj)).getKey().isConnected(subRange) && ((RangeMapEntry) (obj)).getKey().intersection(subRange).equals(range))
            {
                return ((RangeMapEntry) (obj)).getValue();
            }
            break MISSING_BLOCK_LABEL_165;
            obj = (RangeMapEntry)entriesByLowerBound.get(range.lowerBound);
            if (true) goto _L2; else goto _L1
_L1:
            obj;
            return null;
        }

        public Set keySet()
        {
            return new Maps.KeySet(this) {

                final SubRangeMap.SubRangeMapAsMap this$2;

                public boolean remove(Object obj)
                {
                    return SubRangeMap.SubRangeMapAsMap.this.remove(obj) != null;
                }

                public boolean retainAll(Collection collection)
                {
                    return removeEntryIf(Predicates.compose(Predicates.not(Predicates.in(collection)), Maps.keyFunction()));
                }

            
            {
                this$2 = SubRangeMap.SubRangeMapAsMap.this;
                super(map);
            }
            };
        }

        public Object remove(Object obj)
        {
            Object obj1 = get(obj);
            if (obj1 != null)
            {
                obj = (Range)obj;
                TreeRangeMap.this.remove(((Range) (obj)));
                return obj1;
            } else
            {
                return null;
            }
        }

        public Collection values()
        {
            return new Maps.Values(this) {

                final SubRangeMap.SubRangeMapAsMap this$2;

                public boolean removeAll(Collection collection)
                {
                    return removeEntryIf(Predicates.compose(Predicates.in(collection), Maps.valueFunction()));
                }

                public boolean retainAll(Collection collection)
                {
                    return removeEntryIf(Predicates.compose(Predicates.not(Predicates.in(collection)), Maps.valueFunction()));
                }

            
            {
                this$2 = SubRangeMap.SubRangeMapAsMap.this;
                super(map);
            }
            };
        }


        SubRangeMap.SubRangeMapAsMap()
        {
            this$1 = SubRangeMap.this;
            super();
        }
    }


    private static final RangeMap EMPTY_SUB_RANGE_MAP = new RangeMap() {

        public Map asMapOfRanges()
        {
            return Collections.emptyMap();
        }

        public void clear()
        {
        }

        public Object get(Comparable comparable)
        {
            return null;
        }

        public java.util.Map.Entry getEntry(Comparable comparable)
        {
            return null;
        }

        public void put(Range range, Object obj)
        {
            Preconditions.checkNotNull(range);
            range = String.valueOf(String.valueOf(range));
            throw new IllegalArgumentException((new StringBuilder(range.length() + 46)).append("Cannot insert range ").append(range).append(" into an empty subRangeMap").toString());
        }

        public void putAll(RangeMap rangemap)
        {
            if (!rangemap.asMapOfRanges().isEmpty())
            {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            } else
            {
                return;
            }
        }

        public void remove(Range range)
        {
            Preconditions.checkNotNull(range);
        }

        public Range span()
        {
            throw new NoSuchElementException();
        }

        public RangeMap subRangeMap(Range range)
        {
            Preconditions.checkNotNull(range);
            return this;
        }

    };
    private final NavigableMap entriesByLowerBound = Maps.newTreeMap();

    private TreeRangeMap()
    {
    }

    public static TreeRangeMap create()
    {
        return new TreeRangeMap();
    }

    private RangeMap emptySubRangeMap()
    {
        return EMPTY_SUB_RANGE_MAP;
    }

    private void putRangeMapEntry(Cut cut, Cut cut1, Object obj)
    {
        entriesByLowerBound.put(cut, new RangeMapEntry(cut, cut1, obj));
    }

    public Map asMapOfRanges()
    {
        return new AsMapOfRanges();
    }

    public void clear()
    {
        entriesByLowerBound.clear();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof RangeMap)
        {
            obj = (RangeMap)obj;
            return asMapOfRanges().equals(((RangeMap) (obj)).asMapOfRanges());
        } else
        {
            return false;
        }
    }

    public Object get(Comparable comparable)
    {
        comparable = getEntry(comparable);
        if (comparable == null)
        {
            return null;
        } else
        {
            return comparable.getValue();
        }
    }

    public java.util.Map.Entry getEntry(Comparable comparable)
    {
        java.util.Map.Entry entry = entriesByLowerBound.floorEntry(Cut.belowValue(comparable));
        if (entry != null && ((RangeMapEntry)entry.getValue()).contains(comparable))
        {
            return (java.util.Map.Entry)entry.getValue();
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        return asMapOfRanges().hashCode();
    }

    public void put(Range range, Object obj)
    {
        if (!range.isEmpty())
        {
            Preconditions.checkNotNull(obj);
            remove(range);
            entriesByLowerBound.put(range.lowerBound, new RangeMapEntry(range, obj));
        }
    }

    public void putAll(RangeMap rangemap)
    {
        java.util.Map.Entry entry;
        for (rangemap = rangemap.asMapOfRanges().entrySet().iterator(); rangemap.hasNext(); put((Range)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)rangemap.next();
        }

    }

    public void remove(Range range)
    {
        if (range.isEmpty())
        {
            return;
        }
        java.util.Map.Entry entry = entriesByLowerBound.lowerEntry(range.lowerBound);
        if (entry != null)
        {
            RangeMapEntry rangemapentry = (RangeMapEntry)entry.getValue();
            if (rangemapentry.getUpperBound().compareTo(range.lowerBound) > 0)
            {
                if (rangemapentry.getUpperBound().compareTo(range.upperBound) > 0)
                {
                    putRangeMapEntry(range.upperBound, rangemapentry.getUpperBound(), ((RangeMapEntry)entry.getValue()).getValue());
                }
                putRangeMapEntry(rangemapentry.getLowerBound(), range.lowerBound, ((RangeMapEntry)entry.getValue()).getValue());
            }
        }
        entry = entriesByLowerBound.lowerEntry(range.upperBound);
        if (entry != null)
        {
            RangeMapEntry rangemapentry1 = (RangeMapEntry)entry.getValue();
            if (rangemapentry1.getUpperBound().compareTo(range.upperBound) > 0)
            {
                putRangeMapEntry(range.upperBound, rangemapentry1.getUpperBound(), ((RangeMapEntry)entry.getValue()).getValue());
                entriesByLowerBound.remove(range.lowerBound);
            }
        }
        entriesByLowerBound.subMap(range.lowerBound, range.upperBound).clear();
    }

    public Range span()
    {
        java.util.Map.Entry entry = entriesByLowerBound.firstEntry();
        java.util.Map.Entry entry1 = entriesByLowerBound.lastEntry();
        if (entry == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return Range.create(((RangeMapEntry)entry.getValue()).getKey().lowerBound, ((RangeMapEntry)entry1.getValue()).getKey().upperBound);
        }
    }

    public RangeMap subRangeMap(Range range)
    {
        if (range.equals(Range.all()))
        {
            return this;
        } else
        {
            return new SubRangeMap(range);
        }
    }

    public String toString()
    {
        return entriesByLowerBound.values().toString();
    }



}
