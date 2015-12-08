// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, Sets

private static class keyPredicate extends dMap
{

    Predicate keyPredicate;

    public boolean containsKey(Object obj)
    {
        return unfiltered.containsKey(obj) && keyPredicate.apply(obj);
    }

    protected Set createEntrySet()
    {
        return Sets.filter(unfiltered.entrySet(), predicate);
    }

    Set createKeySet()
    {
        return Sets.filter(unfiltered.keySet(), keyPredicate);
    }

    dMap(Map map, Predicate predicate, Predicate predicate1)
    {
        super(map, predicate1);
        keyPredicate = predicate;
    }
}
