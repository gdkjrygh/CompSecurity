// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMultiset, TreeMultiset, SortedMultiset, ImmutableCollection, 
//            ImmutableMultiset

public static class  extends 
{

    public volatile  add(Object obj)
    {
        return add(obj);
    }

    public volatile add add(Object aobj[])
    {
        return add(aobj);
    }

    public volatile add add(Object obj)
    {
        return add(obj);
    }

    public volatile add add(Object aobj[])
    {
        return add(aobj);
    }

    public add add(Object obj)
    {
        super.add(obj);
        return this;
    }

    public transient add add(Object aobj[])
    {
        super.add(aobj);
        return this;
    }

    public volatile add addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public volatile addAll addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public volatile addAll addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public volatile addAll addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public addAll addAll(Iterable iterable)
    {
        super.(iterable);
        return this;
    }

    public  addAll(Iterator iterator)
    {
        super.(iterator);
        return this;
    }

    public volatile  addCopies(Object obj, int i)
    {
        return addCopies(obj, i);
    }

    public addCopies addCopies(Object obj, int i)
    {
        super.ies(obj, i);
        return this;
    }

    public volatile ImmutableCollection build()
    {
        return build();
    }

    public volatile ImmutableMultiset build()
    {
        return build();
    }

    public ImmutableSortedMultiset build()
    {
        return ImmutableSortedMultiset.copyOfSorted((SortedMultiset)contents);
    }

    public volatile contents setCount(Object obj, int i)
    {
        return setCount(obj, i);
    }

    public setCount setCount(Object obj, int i)
    {
        super.nt(obj, i);
        return this;
    }

    public (Comparator comparator)
    {
        super(TreeMultiset.create((Comparator)Preconditions.checkNotNull(comparator)));
    }
}
