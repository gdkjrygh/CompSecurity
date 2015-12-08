// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableCollection

public static class rrayBasedBuilder extends rrayBasedBuilder
{

    public volatile rrayBasedBuilder add(Object obj)
    {
        return add(obj);
    }

    public volatile uilder add(Object obj)
    {
        return add(obj);
    }

    public volatile uilder add(Object aobj[])
    {
        return add(aobj);
    }

    public add add(Object obj)
    {
        super.add(obj);
        return this;
    }

    public transient rrayBasedBuilder.add add(Object aobj[])
    {
        super.add(aobj);
        return this;
    }

    public volatile uilder addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public volatile uilder addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public addAll addAll(Iterable iterable)
    {
        super.addAll(iterable);
        return this;
    }

    public rrayBasedBuilder.addAll addAll(Iterator iterator)
    {
        super.addAll(iterator);
        return this;
    }

    public volatile ImmutableCollection build()
    {
        return build();
    }

    public ImmutableSet build()
    {
        ImmutableSet immutableset = ImmutableSet.access$000(size, contents);
        size = immutableset.size();
        return immutableset;
    }

    public uilder()
    {
        this(4);
    }

    <init>(int i)
    {
        super(i);
    }
}
