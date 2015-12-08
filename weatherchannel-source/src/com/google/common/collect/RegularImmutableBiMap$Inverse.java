// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, RegularImmutableBiMap, Hashing, ImmutableMapEntry, 
//            ImmutableSet, BiMap, ImmutableMapEntrySet, ImmutableList, 
//            UnmodifiableIterator, ImmutableMap, ImmutableAsList, Maps, 
//            ImmutableCollection

private final class <init> extends ImmutableBiMap
{
    final class InverseEntrySet extends ImmutableMapEntrySet
    {

        final RegularImmutableBiMap.Inverse this$1;

        ImmutableList createAsList()
        {
            return new ImmutableAsList() {

                final InverseEntrySet this$2;

                ImmutableCollection delegateCollection()
                {
                    return InverseEntrySet.this;
                }

                public volatile Object get(int i)
                {
                    return get(i);
                }

                public java.util.Map.Entry get(int i)
                {
                    ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.access$000(this$0)[i];
                    return Maps.immutableEntry(immutablemapentry.getValue(), immutablemapentry.getKey());
                }

            
            {
                this$2 = InverseEntrySet.this;
                super();
            }
            };
        }

        public int hashCode()
        {
            return RegularImmutableBiMap.access$100(this$0);
        }

        boolean isHashCodeFast()
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

        ImmutableMap map()
        {
            return RegularImmutableBiMap.Inverse.this;
        }

        InverseEntrySet()
        {
            this$1 = RegularImmutableBiMap.Inverse.this;
            super();
        }
    }


    final RegularImmutableBiMap this$0;

    ImmutableSet createEntrySet()
    {
        return new InverseEntrySet();
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int i = Hashing.smear(obj.hashCode());
            int j = RegularImmutableBiMap.access$300(RegularImmutableBiMap.this);
            ImmutableMapEntry immutablemapentry = RegularImmutableBiMap.access$400(RegularImmutableBiMap.this)[i & j];
            while (immutablemapentry != null) 
            {
                if (obj.equals(immutablemapentry.getValue()))
                {
                    return immutablemapentry.getKey();
                }
                immutablemapentry = immutablemapentry.getNextInValueBucket();
            }
        }
        return null;
    }

    public volatile BiMap inverse()
    {
        return inverse();
    }

    public ImmutableBiMap inverse()
    {
        return RegularImmutableBiMap.this;
    }

    boolean isPartialView()
    {
        return false;
    }

    public int size()
    {
        return inverse().size();
    }

    Object writeReplace()
    {
        return new erializedForm(RegularImmutableBiMap.this);
    }

    private InverseEntrySet.this._cls1()
    {
        this$0 = RegularImmutableBiMap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
