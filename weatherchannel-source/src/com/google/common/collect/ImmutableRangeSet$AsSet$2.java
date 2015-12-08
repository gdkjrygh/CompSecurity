// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, ImmutableRangeSet, ImmutableList, Iterators, 
//            Range, ContiguousSet

class elemItr extends AbstractIterator
{

    Iterator elemItr;
    final Iterator rangeItr;
    final computeNext this$1;

    protected Comparable computeNext()
    {
        while (!elemItr.hasNext()) 
        {
            if (rangeItr.hasNext())
            {
                elemItr = ContiguousSet.create((Range)rangeItr.next(), cess._mth100(this._cls1.this)).descendingIterator();
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

    _cls9()
    {
        this$1 = this._cls1.this;
        super();
        rangeItr = ImmutableRangeSet.access$000(_fld0).reverse().iterator();
        elemItr = Iterators.emptyIterator();
    }
}
