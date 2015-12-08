// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, ImmutableCollection

public static final class rayBasedBuilder extends rayBasedBuilder
{

    public volatile rayBasedBuilder add(Object obj)
    {
        return add(obj);
    }

    public volatile ilder add(Object obj)
    {
        return add(obj);
    }

    public volatile ilder add(Object aobj[])
    {
        return add(aobj);
    }

    public add add(Object obj)
    {
        super.add(obj);
        return this;
    }

    public transient rayBasedBuilder.add add(Object aobj[])
    {
        super.add(aobj);
        return this;
    }

    public volatile ilder addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public volatile ilder addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public addAll addAll(Iterable iterable)
    {
        super.addAll(iterable);
        return this;
    }

    public rayBasedBuilder.addAll addAll(Iterator iterator)
    {
        super.addAll(iterator);
        return this;
    }

    public volatile ImmutableCollection build()
    {
        return build();
    }

    public ImmutableList build()
    {
        return ImmutableList.asImmutableList(contents, size);
    }

    public ilder()
    {
        this(4);
    }

    <init>(int i)
    {
        super(i);
    }
}
