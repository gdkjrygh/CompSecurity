// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, Iterators

static final class terator extends UnmodifiableIterator
{

    final Iterator val$iterator;

    public boolean hasNext()
    {
        return val$iterator.hasNext();
    }

    public Object next()
    {
        Object obj = val$iterator.next();
        val$iterator.remove();
        return obj;
    }

    public String toString()
    {
        return "Iterators.consumingIterator(...)";
    }

    terator(Iterator iterator1)
    {
        val$iterator = iterator1;
        super();
    }
}
