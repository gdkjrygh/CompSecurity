// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ForwardingSortedSet, Constraints, Constraint

private static class constraint extends ForwardingSortedSet
{

    final Constraint constraint;
    final SortedSet _flddelegate;

    public boolean add(Object obj)
    {
        constraint.checkElement(obj);
        return _flddelegate.add(obj);
    }

    public boolean addAll(Collection collection)
    {
        return _flddelegate.addAll(Constraints.access$000(collection, constraint));
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
        return _flddelegate;
    }

    public SortedSet headSet(Object obj)
    {
        return Constraints.constrainedSortedSet(_flddelegate.headSet(obj), constraint);
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return Constraints.constrainedSortedSet(_flddelegate.subSet(obj, obj1), constraint);
    }

    public SortedSet tailSet(Object obj)
    {
        return Constraints.constrainedSortedSet(_flddelegate.tailSet(obj), constraint);
    }

    (SortedSet sortedset, Constraint constraint1)
    {
        _flddelegate = (SortedSet)Preconditions.checkNotNull(sortedset);
        constraint = (Constraint)Preconditions.checkNotNull(constraint1);
    }
}
