// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, Maps, UnmodifiableIterator

static class entries extends ForwardingCollection
{

    private final Collection entries;

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
        return new UnmodifiableIterator() {

            final Maps.UnmodifiableEntries this$0;
            final Iterator val$delegate;

            public boolean hasNext()
            {
                return delegate.hasNext();
            }

            public volatile Object next()
            {
                return next();
            }

            public java.util.Map.Entry next()
            {
                return Maps.unmodifiableEntry((java.util.Map.Entry)delegate.next());
            }

            
            {
                this$0 = Maps.UnmodifiableEntries.this;
                delegate = iterator1;
                super();
            }
        };
    }

    public Object[] toArray()
    {
        return standardToArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return standardToArray(aobj);
    }

    t>(Collection collection)
    {
        entries = collection;
    }
}
