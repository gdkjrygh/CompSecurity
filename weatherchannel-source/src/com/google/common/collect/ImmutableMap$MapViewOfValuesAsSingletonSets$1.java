// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, ImmutableMap, ImmutableSet, UnmodifiableIterator, 
//            AbstractMapEntry

class this._cls0 extends ImmutableMapEntrySet
{

    final this._cls0 this$0;

    public UnmodifiableIterator iterator()
    {
        return new UnmodifiableIterator() {

            final ImmutableMap.MapViewOfValuesAsSingletonSets._cls1 this$1;
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
                this$1 = ImmutableMap.MapViewOfValuesAsSingletonSets._cls1.this;
                backingIterator = iterator1;
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
        return this._cls0.this;
    }

    _cls1.val.backingIterator()
    {
        this$0 = this._cls0.this;
        super();
    }
}
