// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            DescendingMultiset, SortedMultiset, Multiset

class nit> extends nit>
{

    final DescendingMultiset this$0;

    public Iterator iterator()
    {
        return entryIterator();
    }

    Multiset multiset()
    {
        return DescendingMultiset.this;
    }

    public int size()
    {
        return forwardMultiset().entrySet().size();
    }

    ()
    {
        this$0 = DescendingMultiset.this;
        super();
    }
}
