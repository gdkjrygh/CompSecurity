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

    protected  computeNext()
    {
        while (val$iterator1.hasNext()) 
        {
              = ()val$iterator1.next();
            Object obj = .getElement();
            int i = Math.min(.getCount(), multiset2.count(obj));
            if (i > 0)
            {
                return Multisets.immutableEntry(obj, i);
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
        val$iterator1 = Iterator.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/Multisets$2

/* anonymous class */
    static final class Multisets._cls2 extends AbstractMultiset
    {

        final Multiset val$multiset1;
        final Multiset val$multiset2;

        public int count(Object obj)
        {
            int i = multiset1.count(obj);
            if (i == 0)
            {
                return 0;
            } else
            {
                return Math.min(i, multiset2.count(obj));
            }
        }

        Set createElementSet()
        {
            return Sets.intersection(multiset1.elementSet(), multiset2.elementSet());
        }

        int distinctElements()
        {
            return elementSet().size();
        }

        Iterator entryIterator()
        {
            return multiset1.entrySet().iterator(). new Multisets._cls2._cls1();
        }

            
            {
                multiset1 = multiset;
                multiset2 = multiset3;
                super();
            }
    }

}
