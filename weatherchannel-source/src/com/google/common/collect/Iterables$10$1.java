// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            CollectPreconditions, FluentIterable, Iterables, Iterators

class atStart
    implements Iterator
{

    boolean atStart;
    final val.iterator this$0;
    final Iterator val$iterator;

    public boolean hasNext()
    {
        return val$iterator.hasNext();
    }

    public Object next()
    {
        Object obj = val$iterator.next();
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
        val$iterator.remove();
    }

    <init>()
    {
        this$0 = final_<init>1;
        val$iterator = Iterator.this;
        super();
        atStart = true;
    }

    // Unreferenced inner class com/google/common/collect/Iterables$10

/* anonymous class */
    static final class Iterables._cls10 extends FluentIterable
    {

        final Iterable val$iterable;
        final int val$numberToSkip;

        public Iterator iterator()
        {
            Iterator iterator1 = iterable.iterator();
            Iterators.advance(iterator1, numberToSkip);
            return iterator1. new Iterables._cls10._cls1();
        }

            
            {
                iterable = iterable1;
                numberToSkip = i;
                super();
            }
    }

}
