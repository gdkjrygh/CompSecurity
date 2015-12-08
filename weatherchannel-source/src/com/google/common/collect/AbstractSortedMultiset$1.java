// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            DescendingMultiset, AbstractSortedMultiset, SortedMultiset

class  extends DescendingMultiset
{

    final AbstractSortedMultiset this$0;

    Iterator entryIterator()
    {
        return descendingEntryIterator();
    }

    SortedMultiset forwardMultiset()
    {
        return AbstractSortedMultiset.this;
    }

    public Iterator iterator()
    {
        return descendingIterator();
    }

    ()
    {
        this$0 = AbstractSortedMultiset.this;
        super();
    }
}
