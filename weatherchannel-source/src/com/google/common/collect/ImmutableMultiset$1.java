// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, ImmutableMultiset

class  extends UnmodifiableIterator
{

    Object element;
    int remaining;
    final ImmutableMultiset this$0;
    final Iterator val$entryIterator;

    public boolean hasNext()
    {
        return remaining > 0 || val$entryIterator.hasNext();
    }

    public Object next()
    {
        if (remaining <= 0)
        {
            val.entryIterator entryiterator = (remaining)val$entryIterator.next();
            element = entryiterator.ement();
            remaining = entryiterator.unt();
        }
        remaining = remaining - 1;
        return element;
    }

    ()
    {
        this$0 = final_immutablemultiset;
        val$entryIterator = Iterator.this;
        super();
    }
}
