// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Sets, ImmutableMap, UnmodifiableIterator, ImmutableSet, 
//            ImmutableList

private static final class mask extends AbstractSet
{

    private final ImmutableMap inputSet;
    private final int mask;

    public boolean contains(Object obj)
    {
        obj = (Integer)inputSet.get(obj);
        return obj != null && (mask & 1 << ((Integer) (obj)).intValue()) != 0;
    }

    public Iterator iterator()
    {
        return new UnmodifiableIterator() {

            final ImmutableList elements;
            int remainingSetBits;
            final Sets.SubSet this$0;

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

            
            {
                this$0 = Sets.SubSet.this;
                super();
                elements = inputSet.keySet().asList();
                remainingSetBits = mask;
            }
        };
    }

    public int size()
    {
        return Integer.bitCount(mask);
    }



    (ImmutableMap immutablemap, int i)
    {
        inputSet = immutablemap;
        mask = i;
    }
}
