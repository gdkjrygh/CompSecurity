// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

// Referenced classes of package com.google.common.collect:
//            TreeRangeMap, Range, Iterators, Cut, 
//            AbstractIterator, Maps

class this._cls2 extends this._cls2
{

    final iterator this$2;

    public boolean isEmpty()
    {
        return !iterator().hasNext();
    }

    public Iterator iterator()
    {
        if (iterator(_fld1).isEmpty())
        {
            return Iterators.emptyIterator();
        } else
        {
            Cut cut = (Cut)MoreObjects.firstNonNull(TreeRangeMap.access$100(_fld1).floorKey(is._mth1(_fld1).lowerBound), is._mth1(_fld1).lowerBound);
            return new AbstractIterator() {

                final TreeRangeMap.SubRangeMap.SubRangeMapAsMap._cls2 this$3;
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
                            if (rangemapentry.getLowerBound().compareTo(TreeRangeMap.SubRangeMap.access$300(this$1).upperBound) < 0)
                            {
                                continue;
                            }
                        }
                        return (java.util.Map.Entry)endOfData();
                    } while (rangemapentry.getUpperBound().compareTo(TreeRangeMap.SubRangeMap.access$300(this$1).lowerBound) <= 0);
                    return Maps.immutableEntry(rangemapentry.getKey().intersection(TreeRangeMap.SubRangeMap.access$300(this$1)), rangemapentry.getValue());
                }

            
            {
                this$3 = TreeRangeMap.SubRangeMap.SubRangeMapAsMap._cls2.this;
                backingItr = iterator1;
                super();
            }
            };
        }
    }

    Map map()
    {
        return this._cls2.this;
    }

    public boolean retainAll(Collection collection)
    {
        return cess._mth400(this._cls2.this, Predicates.not(Predicates.in(collection)));
    }

    public int size()
    {
        return Iterators.size(iterator());
    }

    _cls1.val.backingItr()
    {
        this$2 = this._cls2.this;
        super();
    }
}
