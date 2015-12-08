// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, MapConstraints, Maps, MapConstraint, 
//            ForwardingIterator

private static class constraint extends ForwardingCollection
{

    final MapConstraint constraint;
    final Collection entries;

    public boolean contains(Object obj)
    {
        return Maps.containsEntryImpl(_mthdelegate(), obj);
    }

    public boolean containsAll(Collection collection)
    {
        return standardContainsAll(collection);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Collection _mthdelegate()
    {
        return entries;
    }

    public Iterator iterator()
    {
        return new ForwardingIterator() {

            final MapConstraints.ConstrainedEntries this$0;
            final Iterator val$iterator;

            protected volatile Object _mthdelegate()
            {
                return _mthdelegate();
            }

            protected Iterator _mthdelegate()
            {
                return iterator;
            }

            public volatile Object next()
            {
                return next();
            }

            public java.util.Map.Entry next()
            {
                return MapConstraints.access$500((java.util.Map.Entry)iterator.next(), constraint);
            }

            
            {
                this$0 = MapConstraints.ConstrainedEntries.this;
                iterator = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        return Maps.removeEntryImpl(_mthdelegate(), obj);
    }

    public boolean removeAll(Collection collection)
    {
        return standardRemoveAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return standardRetainAll(collection);
    }

    public Object[] toArray()
    {
        return standardToArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return standardToArray(aobj);
    }

    _cls1.val.iterator(Collection collection, MapConstraint mapconstraint)
    {
        entries = collection;
        constraint = mapconstraint;
    }
}
