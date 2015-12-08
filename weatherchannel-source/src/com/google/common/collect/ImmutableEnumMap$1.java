// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableEnumMap, Iterators, UnmodifiableIterator

class  extends ImmutableSet
{

    final ImmutableEnumMap this$0;

    public boolean contains(Object obj)
    {
        return ImmutableEnumMap.access$000(ImmutableEnumMap.this).containsKey(obj);
    }

    boolean isPartialView()
    {
        return true;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.unmodifiableIterator(ImmutableEnumMap.access$000(ImmutableEnumMap.this).keySet().iterator());
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return ImmutableEnumMap.this.size();
    }

    r()
    {
        this$0 = ImmutableEnumMap.this;
        super();
    }
}
