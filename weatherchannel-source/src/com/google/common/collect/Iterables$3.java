// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            TransformedIterator, Iterables

static final class terator extends TransformedIterator
{

    volatile Object transform(Object obj)
    {
        return transform((Iterable)obj);
    }

    Iterator transform(Iterable iterable)
    {
        return iterable.iterator();
    }

    terator(Iterator iterator)
    {
        super(iterator);
    }
}
