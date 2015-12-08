// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, ImmutableEnumMap, UnmodifiableIterator, ImmutableMap, 
//            Maps

class t extends ImmutableMapEntrySet
{

    final ImmutableEnumMap this$0;

    public UnmodifiableIterator iterator()
    {
        return new UnmodifiableIterator() {

            private final Iterator backingIterator;
            final ImmutableEnumMap._cls2 this$1;

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
                java.util.Map.Entry entry = (java.util.Map.Entry)backingIterator.next();
                return Maps.immutableEntry(entry.getKey(), entry.getValue());
            }

            
            {
                this$1 = ImmutableEnumMap._cls2.this;
                super();
                backingIterator = ImmutableEnumMap.access$000(this$0).entrySet().iterator();
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    ImmutableMap map()
    {
        return ImmutableEnumMap.this;
    }

    this._cls0()
    {
        this$0 = ImmutableEnumMap.this;
        super();
    }
}
