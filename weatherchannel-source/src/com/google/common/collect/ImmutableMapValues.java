// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, Iterators, ImmutableMap, ImmutableSet, 
//            Maps, ImmutableList, UnmodifiableIterator, ImmutableAsList

final class ImmutableMapValues extends ImmutableCollection
{
    private static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMap map;

        Object readResolve()
        {
            return map.values();
        }

        SerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }


    private final ImmutableMap map;

    ImmutableMapValues(ImmutableMap immutablemap)
    {
        map = immutablemap;
    }

    public boolean contains(Object obj)
    {
        return obj != null && Iterators.contains(iterator(), obj);
    }

    ImmutableList createAsList()
    {
        return new ImmutableAsList() {

            final ImmutableMapValues this$0;
            final ImmutableList val$entryList;

            ImmutableCollection delegateCollection()
            {
                return ImmutableMapValues.this;
            }

            public Object get(int i)
            {
                return ((java.util.Map.Entry)entryList.get(i)).getValue();
            }

            
            {
                this$0 = ImmutableMapValues.this;
                entryList = immutablelist;
                super();
            }
        };
    }

    boolean isPartialView()
    {
        return true;
    }

    public UnmodifiableIterator iterator()
    {
        return Maps.valueIterator(map.entrySet().iterator());
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return map.size();
    }

    Object writeReplace()
    {
        return new SerializedForm(map);
    }
}
