// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Synchronized, Maps, Collections2, Sets, 
//            Iterators, ObjectArrays, ForwardingIterator, ForwardingMapEntry

private static class _cls1.val.iterator extends _cls1.val.iterator
{

    private static final long serialVersionUID = 0L;

    public boolean contains(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = Maps.containsEntryImpl(_mthdelegate(), obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean containsAll(Collection collection)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = Collections2.containsAllImpl(_mthdelegate(), collection);
        }
        return flag;
        collection;
        obj;
        JVM INSTR monitorexit ;
        throw collection;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        boolean flag;
        synchronized (mutex)
        {
            flag = Sets.equalsImpl(_mthdelegate(), obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Iterator iterator()
    {
        return new ForwardingIterator() {

            final Synchronized.SynchronizedAsMapEntries this$0;
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
                return ((java.util.Map.Entry)super.next()). new ForwardingMapEntry() {

                    final _cls1 this$1;
                    final java.util.Map.Entry val$entry;

                    protected volatile Object _mthdelegate()
                    {
                        return _mthdelegate();
                    }

                    protected java.util.Map.Entry _mthdelegate()
                    {
                        return entry;
                    }

                    public volatile Object getValue()
                    {
                        return getValue();
                    }

                    public Collection getValue()
                    {
                        return Synchronized.access$400((Collection)entry.getValue(), mutex);
                    }

            
            {
                this$1 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                };
            }

            
            {
                this$0 = Synchronized.SynchronizedAsMapEntries.this;
                iterator = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = Maps.removeEntryImpl(_mthdelegate(), obj);
        }
        return flag;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = Iterators.removeAll(_mthdelegate().iterator(), collection);
        }
        return flag;
        collection;
        obj;
        JVM INSTR monitorexit ;
        throw collection;
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag;
        synchronized (mutex)
        {
            flag = Iterators.retainAll(_mthdelegate().iterator(), collection);
        }
        return flag;
        collection;
        obj;
        JVM INSTR monitorexit ;
        throw collection;
    }

    public Object[] toArray()
    {
        Object aobj[];
        synchronized (mutex)
        {
            aobj = ObjectArrays.toArrayImpl(_mthdelegate());
        }
        return aobj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object[] toArray(Object aobj[])
    {
        synchronized (mutex)
        {
            aobj = ObjectArrays.toArrayImpl(_mthdelegate(), aobj);
        }
        return aobj;
        aobj;
        obj;
        JVM INSTR monitorexit ;
        throw aobj;
    }

    _cls1.val.iterator(Set set, Object obj)
    {
        super(set, obj);
    }
}
