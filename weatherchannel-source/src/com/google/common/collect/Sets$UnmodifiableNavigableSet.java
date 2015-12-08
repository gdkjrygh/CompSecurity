// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ForwardingSortedSet, Sets, Iterators

static final class delegate extends ForwardingSortedSet
    implements NavigableSet, Serializable
{

    private static final long serialVersionUID = 0L;
    private final NavigableSet _flddelegate;
    private transient delegate descendingSet;

    public Object ceiling(Object obj)
    {
        return _flddelegate.ceiling(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Set _mthdelegate()
    {
        return _mthdelegate();
    }

    protected SortedSet _mthdelegate()
    {
        return Collections.unmodifiableSortedSet(_flddelegate);
    }

    public Iterator descendingIterator()
    {
        return Iterators.unmodifiableIterator(_flddelegate.descendingIterator());
    }

    public NavigableSet descendingSet()
    {
        delegate delegate2 = descendingSet;
        delegate delegate1 = delegate2;
        if (delegate2 == null)
        {
            delegate1 = new <init>(_flddelegate.descendingSet());
            descendingSet = delegate1;
            delegate1.descendingSet = this;
        }
        return delegate1;
    }

    public Object floor(Object obj)
    {
        return _flddelegate.floor(obj);
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return Sets.unmodifiableNavigableSet(_flddelegate.headSet(obj, flag));
    }

    public Object higher(Object obj)
    {
        return _flddelegate.higher(obj);
    }

    public Object lower(Object obj)
    {
        return _flddelegate.lower(obj);
    }

    public Object pollFirst()
    {
        throw new UnsupportedOperationException();
    }

    public Object pollLast()
    {
        throw new UnsupportedOperationException();
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return Sets.unmodifiableNavigableSet(_flddelegate.subSet(obj, flag, obj1, flag1));
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return Sets.unmodifiableNavigableSet(_flddelegate.tailSet(obj, flag));
    }

    (NavigableSet navigableset)
    {
        _flddelegate = (NavigableSet)Preconditions.checkNotNull(navigableset);
    }
}
