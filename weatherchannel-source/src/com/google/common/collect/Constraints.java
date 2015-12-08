// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Lists, Constraint, ForwardingCollection, ForwardingList, 
//            ForwardingListIterator, ForwardingSet, ForwardingSortedSet

final class Constraints
{
    static class ConstrainedCollection extends ForwardingCollection
    {

        private final Constraint constraint;
        private final Collection _flddelegate;

        public boolean add(Object obj)
        {
            constraint.checkElement(obj);
            return _flddelegate.add(obj);
        }

        public boolean addAll(Collection collection)
        {
            return _flddelegate.addAll(Constraints.checkElements(collection, constraint));
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Collection _mthdelegate()
        {
            return _flddelegate;
        }

        public ConstrainedCollection(Collection collection, Constraint constraint1)
        {
            _flddelegate = (Collection)Preconditions.checkNotNull(collection);
            constraint = (Constraint)Preconditions.checkNotNull(constraint1);
        }
    }

    private static class ConstrainedList extends ForwardingList
    {

        final Constraint constraint;
        final List _flddelegate;

        public void add(int i, Object obj)
        {
            constraint.checkElement(obj);
            _flddelegate.add(i, obj);
        }

        public boolean add(Object obj)
        {
            constraint.checkElement(obj);
            return _flddelegate.add(obj);
        }

        public boolean addAll(int i, Collection collection)
        {
            return _flddelegate.addAll(i, Constraints.checkElements(collection, constraint));
        }

        public boolean addAll(Collection collection)
        {
            return _flddelegate.addAll(Constraints.checkElements(collection, constraint));
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected List _mthdelegate()
        {
            return _flddelegate;
        }

        public ListIterator listIterator()
        {
            return Constraints.constrainedListIterator(_flddelegate.listIterator(), constraint);
        }

        public ListIterator listIterator(int i)
        {
            return Constraints.constrainedListIterator(_flddelegate.listIterator(i), constraint);
        }

        public Object set(int i, Object obj)
        {
            constraint.checkElement(obj);
            return _flddelegate.set(i, obj);
        }

        public List subList(int i, int j)
        {
            return Constraints.constrainedList(_flddelegate.subList(i, j), constraint);
        }

        ConstrainedList(List list, Constraint constraint1)
        {
            _flddelegate = (List)Preconditions.checkNotNull(list);
            constraint = (Constraint)Preconditions.checkNotNull(constraint1);
        }
    }

    static class ConstrainedListIterator extends ForwardingListIterator
    {

        private final Constraint constraint;
        private final ListIterator _flddelegate;

        public void add(Object obj)
        {
            constraint.checkElement(obj);
            _flddelegate.add(obj);
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Iterator _mthdelegate()
        {
            return _mthdelegate();
        }

        protected ListIterator _mthdelegate()
        {
            return _flddelegate;
        }

        public void set(Object obj)
        {
            constraint.checkElement(obj);
            _flddelegate.set(obj);
        }

        public ConstrainedListIterator(ListIterator listiterator, Constraint constraint1)
        {
            _flddelegate = listiterator;
            constraint = constraint1;
        }
    }

    static class ConstrainedRandomAccessList extends ConstrainedList
        implements RandomAccess
    {

        ConstrainedRandomAccessList(List list, Constraint constraint)
        {
            super(list, constraint);
        }
    }

    static class ConstrainedSet extends ForwardingSet
    {

        private final Constraint constraint;
        private final Set _flddelegate;

        public boolean add(Object obj)
        {
            constraint.checkElement(obj);
            return _flddelegate.add(obj);
        }

        public boolean addAll(Collection collection)
        {
            return _flddelegate.addAll(Constraints.checkElements(collection, constraint));
        }

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Collection _mthdelegate()
        {
            return _mthdelegate();
        }

        protected Set _mthdelegate()
        {
            return _flddelegate;
        }

        public ConstrainedSet(Set set, Constraint constraint1)
        {
            _flddelegate = (Set)Preconditions.checkNotNull(set);
            constraint = (Constraint)Preconditions.checkNotNull(constraint1);
        }
    }

    private static class ConstrainedSortedSet extends ForwardingSortedSet
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
            return _flddelegate.addAll(Constraints.checkElements(collection, constraint));
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

        ConstrainedSortedSet(SortedSet sortedset, Constraint constraint1)
        {
            _flddelegate = (SortedSet)Preconditions.checkNotNull(sortedset);
            constraint = (Constraint)Preconditions.checkNotNull(constraint1);
        }
    }


    private Constraints()
    {
    }

    private static Collection checkElements(Collection collection, Constraint constraint)
    {
        collection = Lists.newArrayList(collection);
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); constraint.checkElement(iterator.next())) { }
        return collection;
    }

    public static Collection constrainedCollection(Collection collection, Constraint constraint)
    {
        return new ConstrainedCollection(collection, constraint);
    }

    public static List constrainedList(List list, Constraint constraint)
    {
        if (list instanceof RandomAccess)
        {
            return new ConstrainedRandomAccessList(list, constraint);
        } else
        {
            return new ConstrainedList(list, constraint);
        }
    }

    private static ListIterator constrainedListIterator(ListIterator listiterator, Constraint constraint)
    {
        return new ConstrainedListIterator(listiterator, constraint);
    }

    public static Set constrainedSet(Set set, Constraint constraint)
    {
        return new ConstrainedSet(set, constraint);
    }

    public static SortedSet constrainedSortedSet(SortedSet sortedset, Constraint constraint)
    {
        return new ConstrainedSortedSet(sortedset, constraint);
    }

    static Collection constrainedTypePreservingCollection(Collection collection, Constraint constraint)
    {
        if (collection instanceof SortedSet)
        {
            return constrainedSortedSet((SortedSet)collection, constraint);
        }
        if (collection instanceof Set)
        {
            return constrainedSet((Set)collection, constraint);
        }
        if (collection instanceof List)
        {
            return constrainedList((List)collection, constraint);
        } else
        {
            return constrainedCollection(collection, constraint);
        }
    }


}
