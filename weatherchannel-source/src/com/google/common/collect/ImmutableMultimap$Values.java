// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, ImmutableMultimap, ImmutableMap, UnmodifiableIterator

private static final class multimap extends ImmutableCollection
{

    private static final long serialVersionUID = 0L;
    private final transient ImmutableMultimap multimap;

    public boolean contains(Object obj)
    {
        return multimap.containsValue(obj);
    }

    int copyIntoArray(Object aobj[], int i)
    {
        for (Iterator iterator1 = multimap.map.values().iterator(); iterator1.hasNext();)
        {
            i = ((ImmutableCollection)iterator1.next()).copyIntoArray(aobj, i);
        }

        return i;
    }

    boolean isPartialView()
    {
        return true;
    }

    public UnmodifiableIterator iterator()
    {
        return multimap.valueIterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return multimap.size();
    }

    (ImmutableMultimap immutablemultimap)
    {
        multimap = immutablemultimap;
    }
}
