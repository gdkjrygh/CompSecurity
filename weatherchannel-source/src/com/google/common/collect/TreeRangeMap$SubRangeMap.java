// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            RangeMap, TreeRangeMap, Range, Maps, 
//            Cut, Lists, Iterators, AbstractIterator

private class subRange
    implements RangeMap
{
    class SubRangeMapAsMap extends AbstractMap
    {

        final TreeRangeMap.SubRangeMap this$1;

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
            TreeRangeMap.SubRangeMap.this.clear();
        }

        public boolean containsKey(Object obj)
        {
            return get(obj) != null;
        }

        public Set entrySet()
        {
            return new Maps.EntrySet() {

                final SubRangeMapAsMap this$2;

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
                        Cut cut = (Cut)MoreObjects.firstNonNull(TreeRangeMap.access$100(this$0).floorKey(subRange.lowerBound), subRange.lowerBound);
                        return TreeRangeMap.access$100(this$0).tailMap(cut, true).values().iterator(). new AbstractIterator() {

                            final SubRangeMapAsMap._cls2 this$3;
                            final Iterator val$backingItr;

                            protected volatile Object computeNext()
                            {
                                return computeNext();
                            }

                            protected java.util.Map.Entry computeNext()
                            {
                                TreeRangeMap.RangeMapEntry rangemapentry;
                                do
                                {
                                    if (backingItr.hasNext())
                                    {
                                        rangemapentry = (TreeRangeMap.RangeMapEntry)backingItr.next();
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
                    return SubRangeMapAsMap.this;
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
                this$2 = SubRangeMapAsMap.this;
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
            entry = TreeRangeMap.access$100(this$0).floorEntry(range.lowerBound);
            if (entry == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            obj = (TreeRangeMap.RangeMapEntry)entry.getValue();
_L2:
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_165;
            }
            if (((TreeRangeMap.RangeMapEntry) (obj)).getKey().isConnected(subRange) && ((TreeRangeMap.RangeMapEntry) (obj)).getKey().intersection(subRange).equals(range))
            {
                return ((TreeRangeMap.RangeMapEntry) (obj)).getValue();
            }
            break MISSING_BLOCK_LABEL_165;
            obj = (TreeRangeMap.RangeMapEntry)TreeRangeMap.access$100(this$0).get(range.lowerBound);
            if (true) goto _L2; else goto _L1
_L1:
            obj;
            return null;
        }

        public Set keySet()
        {
            return new Maps.KeySet(this) {

                final SubRangeMapAsMap this$2;

                public boolean remove(Object obj)
                {
                    return SubRangeMapAsMap.this.remove(obj) != null;
                }

                public boolean retainAll(Collection collection)
                {
                    return removeEntryIf(Predicates.compose(Predicates.not(Predicates.in(collection)), Maps.keyFunction()));
                }

            
            {
                this$2 = SubRangeMapAsMap.this;
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

                final SubRangeMapAsMap this$2;

                public boolean removeAll(Collection collection)
                {
                    return removeEntryIf(Predicates.compose(Predicates.in(collection), Maps.valueFunction()));
                }

                public boolean retainAll(Collection collection)
                {
                    return removeEntryIf(Predicates.compose(Predicates.not(Predicates.in(collection)), Maps.valueFunction()));
                }

            
            {
                this$2 = SubRangeMapAsMap.this;
                super(map);
            }
            };
        }


        SubRangeMapAsMap()
        {
            this$1 = Tr