// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, Sets, ImmutableMap, ImmutableSet, 
//            ImmutableList

class this._cls0 extends UnmodifiableIterator
{

    final ImmutableList elements;
    int remainingSetBits;
    final get this$0;

    public boolean hasNext()
    {
        return remainingSetBits != 0;
    }

    public Object next()
    {
        int i = Integer.numberOfTrailingZeros(remainingSetBits);
        if (i == 32)
        {
            throw new NoSuchElementException();
        } else
        {
            remainingSetBits = remainingSetBits & ~(1 << i);
            return elements.get(i);
        }
    }

    erator()
    {
        this$0 = this._cls0.this;
        super();
        elements = cess._mth100(this._cls0.this).keySet().asList();
        remainingSetBits = cess._mth200(this._cls0.this);
    }
}
