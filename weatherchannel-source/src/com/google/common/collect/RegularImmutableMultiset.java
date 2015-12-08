// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultiset, ImmutableMap, ImmutableSet, ImmutableList, 
//            Multisets

class RegularImmutableMultiset extends ImmutableMultiset
{

    private final transient ImmutableMap map;
    private final transient int size;

    RegularImmutableMultiset(ImmutableMap immutablemap, int i)
    {
        map = immutablemap;
        size = i;
    }

    public boolean contains(Object obj)
    {
        return map.containsKey(obj);
    }

    public int count(Object obj)
    {
        obj = (Integer)map.get(obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Integer) (obj)).intValue();
        }
    }

    public ImmutableSet elementSet()
    {
        return map.keySet();
    }

    public volatile Set elementSet()
    {
        return elementSet();
    }

    Multiset.Entry getEntry(int i)
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)map.entrySet().asList().get(i);
        return Multisets.immutableEntry(entry.getKey(), ((Integer)entry.getValue()).intValue());
    }

    public int hashCode()
    {
        return map.hashCode();
    }

    boolean isPartialView()
    {
        return map.isPartialView();
    }

    public int size()
    {
        return size;
    }
}
