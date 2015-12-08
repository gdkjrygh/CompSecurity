// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, Multisets, Multiset, Sets, 
//            Iterators, CollectPreconditions, UnmodifiableIterator

private static final class predicate extends AbstractMultiset
{

    final Predicate predicate;
    final Multiset unfiltered;

    public int add(Object obj, int i)
    {
        Preconditions.checkArgument(predicate.apply(obj), "Element %s does not match predicate %s", new Object[] {
            obj, predicate
        });
        return unfiltered.add(obj, i);
    }

    public void clear()
    {
        elementSet().clear();
    }

    public int count(Object obj)
    {
        int i = unfiltered.count(obj);
        if (i > 0)
        {
            if (predicate.apply(obj))
            {
                return i;
            } else
            {
                return 0;
            }
        } else
        {
            return 0;
        }
    }

    Set createElementSet()
    {
        return Sets.filter(unfiltered.elementSet(), predicate);
    }

    Set createEntrySet()
    {
        return Sets.filter(unfiltered.entrySet(), new Predicate() {

            final Multisets.FilteredMultiset this$0;

            public boolean apply(Multiset.Entry entry)
            {
                return predicate.apply(entry.getElement());
            }

            public volatile boolean apply(Object obj)
            {
                return apply((Multiset.Entry)obj);
            }

            
            {
                this$0 = Multisets.FilteredMultiset.this;
                super();
            }
        });
    }

    int distinctElements()
    {
        return elementSet().size();
    }

    Iterator entryIterator()
    {
        throw new AssertionError("should never be called");
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.filter(unfiltered.iterator(), predicate);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int remove(Object obj, int i)
    {
        CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0)
        {
            return count(obj);
        }
        if (contains(obj))
        {
            return unfiltered.remove(obj, i);
        } else
        {
            return 0;
        }
    }

    _cls1.this._cls0(Multiset multiset, Predicate predicate1)
    {
        unfiltered = (Multiset)Preconditions.checkNotNull(multiset);
        predicate = (Predicate)Preconditions.checkNotNull(predicate1);
    }
}
