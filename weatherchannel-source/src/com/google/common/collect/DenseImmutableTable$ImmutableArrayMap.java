// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, DenseImmutableTable, ImmutableSet, ImmutableList, 
//            ImmutableMapEntrySet, UnmodifiableIterator, AbstractIterator, Maps

private static abstract class size extends ImmutableMap
{

    private final int size;

    private boolean isFull()
    {
        return size == keyToIndex().size();
    }

    ImmutableSet createEntrySet()
    {
        return new ImmutableMapEntrySet() {

            final DenseImmutableTable.ImmutableArrayMap this$0;

            public UnmodifiableIterator iterator()
            {
                return new AbstractIterator() {

                    private int index;
                    private final int maxIndex;
                    final _cls1 this$1;

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
                this$1 = _cls1.this;
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
                return DenseImmutableTable.ImmutableArrayMap.this;
            }

            
            {
                this$0 = DenseImmutableTable.ImmutableArrayMap.this;
                super();
            }
        };
    }

    ImmutableSet createKeySet()
    {
        if (isFull())
        {
            return keyToIndex().keySet();
        } else
        {
            return super.createKeySet();
        }
    }

    public Object get(Object obj)
    {
        obj = (Integer)keyToIndex().get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return getValue(((Integer) (obj)).intValue());
        }
    }

    Object getKey(int i)
    {
        return keyToIndex().keySet().asList().get(i);
    }

    abstract Object getValue(int i);

    abstract ImmutableMap keyToIndex();

    public int size()
    {
        return size;
    }

    _cls1.this._cls0(int i)
    {
        size = i;
    }
}
