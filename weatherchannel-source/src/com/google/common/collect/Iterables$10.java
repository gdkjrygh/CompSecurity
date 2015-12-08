// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            FluentIterable, Iterables, Iterators, CollectPreconditions

static final class e extends FluentIterable
{

    final Iterable val$iterable;
    final int val$numberToSkip;

    public Iterator iterator()
    {
        final Iterator iterator = val$iterable.iterator();
        Iterators.advance(iterator, val$numberToSkip);
        return new Iterator() {

            boolean atStart;
            final Iterables._cls10 this$0;
            final Iterator val$iterator;

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public Object next()
            {
                Object obj = iterator.next();
                atStart = false;
                return obj;
            }

            public void remove()
            {
                boolean flag;
                if (!atStart)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                CollectPreconditions.checkRemove(flag);
                iterator.remove();
            }

            
            {
                this$0 = Iterables._cls10.this;
                iterator = iterator1;
                super();
                atStart = true;
            }
        };
    }

    _cls1.atStart(Iterable iterable1, int i)
    {
        val$iterable = iterable1;
        val$numberToSkip = i;
        super();
    }
}
