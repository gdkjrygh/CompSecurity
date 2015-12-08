// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, Multiset, Multisets, AbstractMultiset, 
//            Sets

class or extends AbstractIterator
{

    final computeNext this$0;
    final Iterator val$iterator1;
    final Iterator val$iterator2;

    protected  computeNext()
    {
        if (val$iterator1.hasNext())
        {
              = ()val$iterator1.next();
            Object obj = .getElement();
            return Multisets.immutableEntry(obj, Math.max(.getCount(), multiset2.count(obj)));
        }
        while (val$iterator2.hasNext()) 
        {
             1 = ()val$iterator2.next();
            Object obj1 = 1.getElement();
            if (!multiset1.contains(obj1))
            {
                return Multisets.immutableEntry(obj1, 1.getCount());
            }
        }
        return ()endOfData();
    }

    protected volatile Object computeNext()
    {
        return computeNext();
    }

    et()
    {
        this$0 = final_et;
        val$iterator1 = iterator;
        val$iterator2 = Iterator.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/Multisets$1

/* anonymous class */
    static final class Multisets._cls1 extends AbstractMultiset
    {

        final Multiset val$multiset1;
        final Multiset val$multiset2;

        public boolean contains(Object obj)
        {
            return multiset1.contains(obj) || multiset2.contains(obj);
        }

        public int count(Object obj)
        {
            return Math.max(multiset1.count(obj), multiset2.count(obj));
        }

        Set createElementSet()
        {
            return Sets.union(multiset1.elementSet(), multiset2.elementSet());
        }

        int distinctElements()
        {
            return elementSet().size();
        }

        Iterator entryIterator()
        {
            return multiset2.entrySet().iterator(). new Multisets._cls1._cls1();
        }

        public boolean isEmpty()
        {
            return multiset1.isEmpty() && multiset2.isEmpty();
        }

            
            {
                multiset1 = multiset;
                multiset2 = multiset3;
                super();
            }
    }

}
