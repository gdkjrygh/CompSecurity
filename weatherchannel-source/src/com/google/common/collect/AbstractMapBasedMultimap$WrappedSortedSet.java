// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap

private class  extends 
    implements SortedSet
{

    final AbstractMapBasedMultimap this$0;

    public Comparator comparator()
    {
        return getSortedSetDelegate().comparator();
    }

    public Object first()
    {
        refreshIfEmpty();
        return getSortedSetDelegate().first();
    }

    SortedSet getSortedSetDelegate()
    {
        return (SortedSet)getDelegate();
    }

    public SortedSet headSet(Object obj)
    {
        refreshIfEmpty();
        AbstractMapBasedMultimap abstractmapbasedmultimap = AbstractMapBasedMultimap.this;
        Object obj1 = getKey();
        SortedSet sortedset = getSortedSetDelegate().headSet(obj);
        if (getAncestor() == null)
        {
            obj = this;
        } else
        {
            obj = getAncestor();
        }
        return abstractmapbasedmultimap. new <init>(obj1, sortedset, (() (obj)));
    }

    public Object last()
    {
        refreshIfEmpty();
        return getSortedSetDelegate().last();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        refreshIfEmpty();
        AbstractMapBasedMultimap abstractmapbasedmultimap = AbstractMapBasedMultimap.this;
        Object obj2 = getKey();
        obj1 = getSortedSetDelegate().subSet(obj, obj1);
        if (getAncestor() == null)
        {
            obj = this;
        } else
        {
            obj = getAncestor();
        }
        return abstractmapbasedmultimap. new <init>(obj2, ((SortedSet) (obj1)), (() (obj)));
    }

    public SortedSet tailSet(Object obj)
    {
        refreshIfEmpty();
        AbstractMapBasedMultimap abstractmapbasedmultimap = AbstractMapBasedMultimap.this;
        Object obj1 = getKey();
        SortedSet sortedset = getSortedSetDelegate().tailSet(obj);
        if (getAncestor() == null)
        {
            obj = this;
        } else
        {
            obj = getAncestor();
        }
        return abstractmapbasedmultimap. new <init>(obj1, sortedset, (() (obj)));
    }

    (Object obj, SortedSet sortedset,  )
    {
        this$0 = AbstractMapBasedMultimap.this;
        super(AbstractMapBasedMultimap.this, obj, sortedset, );
    }
}
