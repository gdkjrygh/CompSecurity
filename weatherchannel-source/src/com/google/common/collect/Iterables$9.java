// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, Iterables

static final class le extends FluentIterable
{

    final List val$list;
    final int val$numberToSkip;

    public Iterator iterator()
    {
        int i = Math.min(val$list.size(), val$numberToSkip);
        return val$list.subList(i, val$list.size()).iterator();
    }

    le(List list1, int i)
    {
        val$list = list1;
        val$numberToSkip = i;
        super();
    }
}
