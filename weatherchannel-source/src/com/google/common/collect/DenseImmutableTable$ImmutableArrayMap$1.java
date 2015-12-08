// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, DenseImmutableTable, UnmodifiableIterator, ImmutableMap, 
//            AbstractIterator, Maps

class this._cls0 extends ImmutableMapEntrySet
{

    final this._cls0 this$0;

    public UnmodifiableIterator iterator()
    {
        return new AbstractIterator() {

            private int index;
            private final int maxIndex;
            final DenseImmutableTable.ImmutableArrayMap._cls1 this$1;

            protected volatile Object computeNext()
            {
                return computeNext();
            }

            protected java.util.Map.Entry computeNext()
            {
                for (index = index + 1; index < maxIndex; index = index + 1)
                {
                    Object obj = getValue(index);
                    if (obj != null)
                    {
                        return Maps.immutableEntry(getKey(index), obj);
                    }
                }

                return (java.util.Map.Entry)endOfData();
            }

            
            {
                this$1 = DenseImmutableTable.ImmutableArrayMap._cls1.this;
                super();
                index = -1;
                maxIndex = keyToIndex().size();
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

    yToIndex()
    {
        this$0 = this._cls0.this;
        super();
    }
}
