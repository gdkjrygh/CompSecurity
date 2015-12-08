// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, RegularImmutableSortedMap, ImmutableList, UnmodifiableIterator, 
//            ImmutableMap, ImmutableAsList, ImmutableSortedSet, Maps, 
//            ImmutableCollection

private class <init> extends ImmutableMapEntrySet
{

    final RegularImmutableSortedMap this$0;

    ImmutableList createAsList()
    {
        return new ImmutableAsList() {

            private final ImmutableList keyList;
            final RegularImmutableSortedMap.EntrySet this$1;

            ImmutableCollection delegateCollection()
            {
                return RegularImmutableSortedMap.EntrySet.this;
            }

            public volatile Object get(int i)
            {
                return get(i);
            }

            public java.util.Map.Entry get(int i)
            {
                return Maps.immutableEntry(keyList.get(i), RegularImmutableSortedMap.access$100(this$0).get(i));
            }

            
            {
                this$1 = RegularImmutableSortedMap.EntrySet.this;
                super();
                keyList = keySet().asList();
            }
        };
    }

    public UnmodifiableIterator iterator()
    {
        return asList().iterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    ImmutableMap map()
    {
        return RegularImmutableSortedMap.this;
    }

    private _cls1.keyList()
    {
        this$0 = RegularImmutableSortedMap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
