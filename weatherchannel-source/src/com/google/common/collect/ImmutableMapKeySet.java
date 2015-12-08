// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableMap, ImmutableList, UnmodifiableIterator, 
//            ImmutableAsList, ImmutableCollection

final class ImmutableMapKeySet extends ImmutableSet
{
    private static class KeySetSerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMap map;

        Object readResolve()
        {
            return map.keySet();
        }

        KeySetSerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }


    private final ImmutableMap map;

    ImmutableMapKeySet(ImmutableMap immutablemap)
    {
        map = immutablemap;
    }

    public boolean contains(Object obj)
    {
        return map.containsKey(obj);
    }

    ImmutableList createAsList()
    {
        return new ImmutableAsList() {

            final ImmutableMapKeySet this$0;
            final ImmutableList val$entryList;

            ImmutableCollection delegateCollection()
            {
                return ImmutableMapKeySet.this;
            }

            public Object get(int i)
            {
                return ((java.util.Map.Entry)entryList.get(i)).getKey();
            }

            
            {
                this$0 = ImmutableMapKeySet.this;
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
        return asList().iterator();
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
        return new KeySetSerializedForm(map);
    }
}
