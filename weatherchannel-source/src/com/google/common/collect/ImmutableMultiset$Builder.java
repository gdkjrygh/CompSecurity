// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultiset, LinkedHashMultiset, Multiset, Multisets, 
//            ImmutableCollection

public static class contents extends r
{

    final Multiset contents;

    public volatile r add(Object obj)
    {
        return add(obj);
    }

    public volatile r add(Object aobj[])
    {
        return add(aobj);
    }

    public add add(Object obj)
    {
        contents.add(Preconditions.checkNotNull(obj));
        return this;
    }

    public transient contents add(Object aobj[])
    {
        super.add(aobj);
        return this;
    }

    public volatile r addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public volatile r addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public addAll addAll(Iterable iterable)
    {
        if (iterable instanceof Multiset)
        {
            addAll addall;
            for (iterable = Multisets.cast(iterable).entrySet().iterator(); iterable.hasNext(); addCopies(addall.addCopies(), addall.addCopies()))
            {
                addall = (addCopies)iterable.next();
            }

        } else
        {
            super.addAll(iterable);
        }
        return this;
    }

    public r.addAll addAll(Iterator iterator)
    {
        super.addAll(iterator);
        return this;
    }

    public r.addAll addCopies(Object obj, int i)
    {
        contents.add(Preconditions.checkNotNull(obj), i);
        return this;
    }

    public volatile ImmutableCollection build()
    {
        return build();
    }

    public ImmutableMultiset build()
    {
        return ImmutableMultiset.copyOf(contents);
    }

    public contents setCount(Object obj, int i)
    {
        contents.setCount(Preconditions.checkNotNull(obj), i);
        return this;
    }

    public r()
    {
        this(((Multiset) (LinkedHashMultiset.create())));
    }

    <init>(Multiset multiset)
    {
        contents = multiset;
    }
}
