// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ForwardingMultiset, SortedMultiset, Multisets, Multiset, 
//            BoundType, DescendingMultiset

public abstract class ForwardingSortedMultiset extends ForwardingMultiset
    implements SortedMultiset
{
    protected abstract class StandardDescendingMultiset extends DescendingMultiset
    {

        final ForwardingSortedMultiset this$0;

        SortedMultiset forwardMultiset()
        {
            return ForwardingSortedMultiset.this;
        }

        public StandardDescendingMultiset()
        {
            this$0 = ForwardingSortedMultiset.this;
            super();
        }
    }

    protected class StandardElementSet extends SortedMultisets.NavigableElementSet
    {

        final ForwardingSortedMultiset this$0;

        public StandardElementSet()
        {
            this$0 = ForwardingSortedMultiset.this;
            super(ForwardingSortedMultiset.this);
        }
    }


    protected ForwardingSortedMultiset()
    {
    }

    public Comparator comparator()
    {
        return _mthdelegate().comparator();
    }

    protected volatile Multiset _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract SortedMultiset _mthdelegate();

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    public SortedMultiset descendingMultiset()
    {
        return _mthdelegate().descendingMultiset();
    }

    public NavigableSet elementSet()
    {
        return (NavigableSet)super.elementSet();
    }

    public volatile Set elementSet()
    {
        return elementSet();
    }

    public volatile SortedSet elementSet()
    {
        return elementSet();
    }

    public Multiset.Entry firstEntry()
    {
        return _mthdelegate().firstEntry();
    }

    public SortedMultiset headMultiset(Object obj, BoundType boundtype)
    {
        return _mthdelegate().headMultiset(obj, boundtype);
    }

    public Multiset.Entry lastEntry()
    {
        return _mthdelegate().lastEntry();
    }

    public Multiset.Entry pollFirstEntry()
    {
        return _mthdelegate().pollFirstEntry();
    }

    public Multiset.Entry pollLastEntry()
    {
        return _mthdelegate().pollLastEntry();
    }

    protected Multiset.Entry standardFirstEntry()
    {
        Object obj = entrySet().iterator();
        if (!((Iterator) (obj)).hasNext())
        {
            return null;
        } else
        {
            obj = (Multiset.Entry)((Iterator) (obj)).next();
            return Multisets.immutableEntry(((Multiset.Entry) (obj)).getElement(), ((Multiset.Entry) (obj)).getCount());
        }
    }

    protected Multiset.Entry standardLastEntry()
    {
        Object obj = descendingMultiset().entrySet().iterator();
        if (!((Iterator) (obj)).hasNext())
        {
            return null;
        } else
        {
            obj = (Multiset.Entry)((Iterator) (obj)).next();
            return Multisets.immutableEntry(((Multiset.Entry) (obj)).getElement(), ((Multiset.Entry) (obj)).getCount());
        }
    }

    protected Multiset.Entry standardPollFirstEntry()
    {
        Iterator iterator = entrySet().iterator();
        if (!iterator.hasNext())
        {
            return null;
        } else
        {
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            entry = Multisets.immutableEntry(entry.getElement(), entry.getCount());
            iterator.remove();
            return entry;
        }
    }

    protected Multiset.Entry standardPollLastEntry()
    {
        Iterator iterator = descendingMultiset().entrySet().iterator();
        if (!iterator.hasNext())
        {
            return null;
        } else
        {
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            entry = Multisets.immutableEntry(entry.getElement(), entry.getCount());
            iterator.remove();
            return entry;
        }
    }

    protected SortedMultiset standardSubMultiset(Object obj, BoundType boundtype, Object obj1, BoundType boundtype1)
    {
        return tailMultiset(obj, boundtype).headMultiset(obj1, boundtype1);
    }

    public SortedMultiset subMultiset(Object obj, BoundType boundtype, Object obj1, BoundType boundtype1)
    {
        return _mthdelegate().subMultiset(obj, boundtype, obj1, boundtype1);
    }

    public SortedMultiset tailMultiset(Object obj, BoundType boundtype)
    {
        return _mthdelegate().tailMultiset(obj, boundtype);
    }
}
