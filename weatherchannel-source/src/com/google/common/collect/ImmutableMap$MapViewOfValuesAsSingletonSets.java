// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, ImmutableSet, ImmutableMapEntrySet, UnmodifiableIterator, 
//            AbstractMapEntry

private static final class delegate extends ImmutableMap
{

    private final ImmutableMap _flddelegate;

    public boolean containsKey(Object obj)
    {
        return _flddelegate.containsKey(obj);
    }

    ImmutableSet createEntrySet()
    {
        return new ImmutableMapEntrySet() {

            final ImmutableMap.MapViewOfValuesAsSingletonSets this$0;

            public UnmodifiableIterator iterator()
            {
                return _flddelegate.entrySet().iterator(). new UnmodifiableIterator() {

                    final _cls1 this$1;
                    final Iterator val$backingIterator;

                    public boolean hasNext()
                    {
                        return backingIterator.hasNext();
                    }

                    public volatile Object next()
                    {
                        return next();
                    }

                    public java.util.Map.Entry next()
                    {
                        return ((java.util.Map.Entry)backingIterator.next()). new AbstractMapEntry() {

                            final _cls1 this$2;
                            final java.util.Map.Entry val$backingEntry;

                            public Object getKey()
                            {
                                return backingEntry.getKey();
                            }

                            public ImmutableSet getValue()
                            {
                                return ImmutableSet.of(backingEntry.getValue());
                            }

                            public volatile Object getValue()
                            {
                                return getValue();
                            }

            
            {
                this$2 = final__pcls1;
                backingEntry = java.util.Map.Entry.this;
                super();
            }
                        };
                    }

            
            {
                this$1 = final__pcls1;
                backingIterator = Iterator.this;
                super();
            }
                };
            }

            public volatile Iterator iterator()
            {
                return iterator();
            }

            ImmutableMap map()
            {
                return ImmutableMap.MapViewOfValuesAsSingletonSets.this;
            }

            
            {
                this$0 = ImmutableMap.MapViewOfValuesAsSingletonSets.this;
                super();
            }
        };
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public ImmutableSet get(Object obj)
    {
        obj = _flddelegate.get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return ImmutableSet.of(obj);
        }
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    boolean isPartialView()
    {
        return false;
    }

    public volatile Set keySet()
    {
        return super.keySet();
    }

    public int size()
    {
        return _flddelegate.size();
    }

    public volatile Collection values()
    {
        return super.values();
    }


    _cls1.this._cls0(ImmutableMap immutablemap)
    {
        _flddelegate = (ImmutableMap)Preconditions.checkNotNull(immutablemap);
    }
}
