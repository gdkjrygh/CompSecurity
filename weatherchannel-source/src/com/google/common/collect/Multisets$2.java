// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, Multisets, Multiset, Sets, 
//            AbstractIterator

static final class iset extends AbstractMultiset
{

    final Multiset val$multiset1;
    final Multiset val$multiset2;

    public int count(Object obj)
    {
        int i = val$multiset1.count(obj);
        if (i == 0)
        {
            return 0;
        } else
        {
            return Math.min(i, val$multiset2.count(obj));
        }
    }

    Set createElementSet()
    {
        return Sets.intersection(val$multiset1.elementSet(), val$multiset2.elementSet());
    }

    int distinctElements()
    {
        return elementSet().size();
    }

    Iterator entryIterator()
    {
        return new AbstractIterator() {

            final Multisets._cls2 this$0;
            final Iterator val$iterator1;

            protected Multiset.Entry computeNext()
            {
                while (iterator1.hasNext()) 
                {
                    Multiset.Entry entry = (Multiset.Entry)iterator1.next();
                    Object obj = entry.getElement();
                    int i = Math.min(entry.getCount(), multiset2.count(obj));
                    if (i > 0)
                    {
                        return Multisets.immutableEntry(obj, i);
                    }
                }
                return (Multiset.Entry)endOfData();
            }

            protected volatile Object computeNext()
            {
                return computeNext();
            }

            
            {
                this$0 = Multisets._cls2.this;
                iterator1 = iterator;
                super();
            }
        };
    }

    ator(Multiset multiset, Multiset multiset3)
    {
        val$multiset1 = multiset;
        val$multiset2 = multiset3;
        super();
    }
}
