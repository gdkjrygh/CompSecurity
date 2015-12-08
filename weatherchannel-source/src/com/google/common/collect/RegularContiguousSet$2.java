// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractSequentialIterator, RegularContiguousSet, DiscreteDomain

class rst extends AbstractSequentialIterator
{

    final Comparable first;
    final RegularContiguousSet this$0;

    protected Comparable computeNext(Comparable comparable)
    {
        if (RegularContiguousSet.access$000(comparable, first))
        {
            return null;
        } else
        {
            return domain.previous(comparable);
        }
    }

    protected volatile Object computeNext(Object obj)
    {
        return computeNext((Comparable)obj);
    }

    tor(Comparable comparable)
    {
        this$0 = RegularContiguousSet.this;
        super(comparable);
        first = RegularContiguousSet.this.first();
    }
}
