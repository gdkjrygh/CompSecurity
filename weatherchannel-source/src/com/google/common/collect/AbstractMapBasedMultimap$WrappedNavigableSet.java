// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, Iterators

class it> extends it>
    implements NavigableSet
{

    final AbstractMapBasedMultimap this$0;

    private NavigableSet wrap(NavigableSet navigableset)
    {
        AbstractMapBasedMultimap abstractmapbasedmultimap = AbstractMapBasedMultimap.this;
        Object obj1 = key;
        Object obj;
        if (getAncestor() == null)
        {
            obj = this;
        } else
        {
            obj = getAncestor();
        }
        return abstractmapbasedmultimap. new <init>(obj1, navigableset, ((<init>) (obj)));
    }

    public Object ceiling(Object obj)
    {
        return getSortedSetDelegate().ceiling(obj);
    }

    public Iterator descendingIterator()
    {
        return new appedIterator(this, getSortedSetDelegate().descendingIterator());
    }

    public NavigableSet descendingSet()
    {
        return wrap(getSortedSetDelegate().descendingSet());
    }

    public Object floor(Object obj)
    {
        return getSortedSetDelegate().floor(obj);
    }

    NavigableSet getSortedSetDelegate()
    {
        return (NavigableSet)super.SortedSetDelegate();
    }

    volatile SortedSet getSortedSetDelegate()
    {
        return getSortedSetDelegate();
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return wrap(getSortedSetDelegate().headSet(obj, flag));
    }

    public Object higher(Object obj)
    {
        return getSortedSetDelegate().higher(obj);
    }

    public Object lower(Object obj)
    {
        return getSortedSetDelegate().lower(obj);
    }

    public Object pollFirst()
    {
        return Iterators.pollNext(iterator());
    }

    public Object pollLast()
    {
        return Iterators.pollNext(descendingIterator());
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return wrap(getSortedSetDelegate().subSet(obj, flag, obj1, flag1));
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return wrap(getSortedSetDelegate().tailSet(obj, flag));
    }

    appedIterator(Object obj, NavigableSet navigableset, appedIterator appediterator)
    {
        this$0 = AbstractMapBasedMultimap.this;
        super(AbstractMapBasedMultimap.this, obj, navigableset, appediterator);
    }
}
