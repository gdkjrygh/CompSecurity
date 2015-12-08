// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultiset, ImmutableMultimap, ImmutableMap, ImmutableSet, 
//            ImmutableList, Multisets

class > extends ImmutableMultiset
{

    final ImmutableMultimap this$0;

    public boolean contains(Object obj)
    {
        return containsKey(obj);
    }

    public int count(Object obj)
    {
        obj = (Collection)map.get(obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Collection) (obj)).size();
        }
    }

    public Set elementSet()
    {
        return keySet();
    }

    t getEntry(int i)
    {
        java.util.t.Entry entry = (java.util.t.Entry)map.entrySet().asList().get(i);
        return Multisets.immutableEntry(entry.immutableEntry(), ((Collection)entry.immutableEntry()).size());
    }

    boolean isPartialView()
    {
        return true;
    }

    public int size()
    {
        return ImmutableMultimap.this.size();
    }

    ()
    {
        this$0 = ImmutableMultimap.this;
        super();
    }
}
