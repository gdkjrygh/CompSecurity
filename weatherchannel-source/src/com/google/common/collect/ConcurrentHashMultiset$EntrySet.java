// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ConcurrentHashMultiset, Lists, Iterators, Multiset

private class <init> extends <init>
{

    final ConcurrentHashMultiset this$0;

    private List snapshot()
    {
        java.util.ArrayList arraylist = Lists.newArrayListWithExpectedSize(size());
        Iterators.addAll(arraylist, iterator());
        return arraylist;
    }

    ConcurrentHashMultiset multiset()
    {
        return ConcurrentHashMultiset.this;
    }

    volatile Multiset multiset()
    {
        return multiset();
    }

    public Object[] toArray()
    {
        return snapshot().toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return snapshot().toArray(aobj);
    }

    private ()
    {
        this$0 = ConcurrentHashMultiset.this;
        super(ConcurrentHashMultiset.this);
    }

    ( )
    {
        this();
    }
}
