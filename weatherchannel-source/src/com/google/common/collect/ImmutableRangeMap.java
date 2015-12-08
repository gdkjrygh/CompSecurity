// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            RangeMap, ImmutableList, ImmutableMap, RegularImmutableSortedMap, 
//            RegularImmutableSortedSet, Range, Cut, SortedLists, 
//            Maps, TreeRangeSet, TreeRangeMap, RangeSet

public class ImmutableRangeMap
    implements RangeMap
{
    public static final class Builder
    {

        private final RangeSet keyRanges = TreeRangeSet.create();
        private final RangeMap rangeMap = TreeRangeMap.create();

        public ImmutableRangeMap build()
        {
            Object obj = rangeMap.asMapOfRanges();
            ImmutableList.Builder builder1 = new ImmutableList.Builder(((Map) (obj)).size());
            ImmutableList.Builder builder2 = new ImmutableList.Builder(((Map) (obj)).size());
            java.util.Map.Entry entry;
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); builder2.add(entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                builder1.add(entry.getKey());
            }

            return new ImmutableRangeMap(builder1.build(), builder2.build());
        }

        public Builder put(Range range, Object obj)
        {
label0:
            {
                Preconditions.checkNotNull(range);
                Preconditions.checkNotNull(obj);
                java.util.Map.Entry entry;
                Iterator iterator;
                Range range1;
                boolean flag;
                if (!range.isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Range must not be empty, but was %s", new Object[] {
                    range
                });
                if (keyRanges.complement().encloses(range))
                {
                    break label0;
                }
                iterator = rangeMap.asMapOfRanges().entrySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    entry = (java.util.Map.Entry)iterator.next();
                    range1 = (Range)entry.getKey();
                } while (!range1.isConnected(range) || range1.intersection(range).isEmpty());
                range = String.valueOf(String.valueOf(range));
                obj = String.valueOf(String.valueOf(entry));
                throw new IllegalArgumentException((new StringBuilder(range.length() + 47 + ((String) (obj)).length())).append("Overlapping ranges: range ").append(range).append(" overlaps with entry ").append(((String) (obj))).toString());
            }
            keyRanges.add(range);
            rangeMap.put(range, obj);
            return this;
        }

        public Builder putAll(RangeMap rangemap)
        {
            java.util.Map.Entry entry;
            for (rangemap = rangemap.asMapOfRanges().entrySet().iterator(); rangemap.hasNext(); put((Range)entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)rangemap.next();
            }

            return this;
        }

        public Builder()
        {
        }
    }


    private static final ImmutableRangeMap EMPTY = new ImmutableRangeMap(ImmutableList.of(), ImmutableList.of());
    private final ImmutableList ranges;
    private final ImmutableList values;

    ImmutableRangeMap(ImmutableList immutablelist, ImmutableList immutablelist1)
    {
        ranges = immutablelist;
        values = immutablelist1;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableRangeMap copyOf(RangeMap rangemap)
    {
        if (rangemap instanceof ImmutableRangeMap)
        {
            return (ImmutableRangeMap)rangemap;
        }
        Object obj = rangemap.asMapOfRanges();
        rangemap = new ImmutableList.Builder(((Map) (obj)).size());
        ImmutableList.Builder builder1 = new ImmutableList.Builder(((Map) (obj)).size());
        java.util.Map.Entry entry;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); builder1.add(entry.getValue()))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            rangemap.add(entry.getKey());
        }

        return new ImmutableRangeMap(rangemap.build(), builder1.build());
    }

    public static ImmutableRangeMap of()
    {
        return EMPTY;
    }

    public static ImmutableRangeMap of(Range range, Object obj)
    {
        return new ImmutableRangeMap(ImmutableList.of(range), ImmutableList.of(obj));
    }

    public ImmutableMap asMapOfRanges()
    {
        if (ranges.isEmpty())
        {
            return ImmutableMap.of();
        } else
        {
            return new RegularImmutableSortedMap(new RegularImmutableSortedSet(ranges, Range.RANGE_LEX_ORDERING), values);
        }
    }

    public volatile Map asMapOfRanges()
    {
        return asMapOfRanges();
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
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
        int i;
        for (i = SortedLists.binarySearch(ranges, Range.lowerBoundFn(), Cut.belowValue(comparable), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER); i == -1 || !((Range)ranges.get(i)).contains(comparable);)
        {
            return null;
        }

        return values.get(i);
    }

    public java.util.Map.Entry getEntry(Comparable comparable)
    {
        int i = SortedLists.binarySearch(ranges, Range.lowerBoundFn(), Cut.belowValue(comparable), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        Range range;
        if (i != -1)
        {
            if ((range = (Range)ranges.get(i)).contains(comparable))
            {
                return Maps.immutableEntry(range, values.get(i));
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
        throw new UnsupportedOperationException();
    }

    public void putAll(RangeMap rangemap)
    {
        throw new UnsupportedOperationException();
    }

    public void remove(Range range)
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
            Range range = (Range)ranges.get(0);
            Range range1 = (Range)ranges.get(ranges.size() - 1);
            return Range.create(range.lowerBound, range1.upperBound);
        }
    }

    public ImmutableRangeMap subRangeMap(Range range)
    {
        if (((Range)Preconditions.checkNotNull(range)).isEmpty())
        {
            return of();
        }
        if (ranges.isEmpty() || range.encloses(span()))
        {
            return this;
        }
        int i = SortedLists.binarySearch(ranges, Range.upperBoundFn(), range.lowerBound, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        int j = SortedLists.binarySearch(ranges, Range.lowerBoundFn(), range.upperBound, SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (i >= j)
        {
            return of();
        } else
        {
            return new ImmutableRangeMap(range, this) {

                final ImmutableRangeMap this$0;
                final ImmutableRangeMap val$outer;
                final Range val$range;

                public volatile Map asMapOfRanges()
                {
                    return asMapOfRanges();
                }

                public ImmutableRangeMap subRangeMap(Range range1)
                {
                    if (range.isConnected(range1))
                    {
                        return outer.subRangeMap(range1.intersection(range));
                    } else
                    {
                        return ImmutableRangeMap.of();
                    }
                }

                public volatile RangeMap subRangeMap(Range range1)
                {
                    return subRangeMap(range1);
                }

            
            {
                this$0 = ImmutableRangeMap.this;
                range = range1;
                outer = immutablerangemap1;
                super(final_immutablelist, final_immutablelist1);
            }
            };
        }
    }

    public volatile RangeMap subRangeMap(Range range)
    {
        return subRangeMap(range);
    }

    public String toString()
    {
        return asMapOfRanges().toString();
    }



    // Unreferenced inner class com/google/common/collect/ImmutableRangeMap$1

/* anonymous class */
    class _cls1 extends ImmutableList
    {

        final ImmutableRangeMap this$0;
        final int val$len;
        final int val$off;
        final Range val$range;

        public Range get(int i)
        {
            Preconditions.checkElementIndex(i, len);
            if (i == 0 || i == len - 1)
            {
                return ((Range)ranges.get(off + i)).intersection(range);
            } else
            {
                return (Range)ranges.get(off + i);
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
            return len;
        }

            
            {
                this$0 = ImmutableRangeMap.this;
                len = i;
                off = j;
                range = range1;
                super();
            }
    }

}
