// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            BiMap, Maps

static final class inverse extends inverse
    implements BiMap
{

    private final BiMap inverse;

    private static Predicate inversePredicate(Predicate predicate)
    {
        return new Predicate(predicate) {

            final Predicate val$forwardPredicate;

            public volatile boolean apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public boolean apply(java.util.Map.Entry entry)
            {
                return forwardPredicate.apply(Maps.immutableEntry(entry.getValue(), entry.getKey()));
            }

            
            {
                forwardPredicate = predicate;
                super();
            }
        };
    }

    public Object forcePut(Object obj, Object obj1)
    {
        Preconditions.checkArgument(apply(obj, obj1));
        return unfiltered().forcePut(obj, obj1);
    }

    public BiMap inverse()
    {
        return inverse;
    }

    BiMap unfiltered()
    {
        return (BiMap)unfiltered;
    }

    public volatile Collection values()
    {
        return values();
    }

    public Set values()
    {
        return inverse.keySet();
    }

    _cls1.val.forwardPredicate(BiMap bimap, Predicate predicate)
    {
        super(bimap, predicate);
        inverse = new <init>(bimap.inverse(), inversePredicate(predicate), this);
    }

    private inversePredicate(BiMap bimap, Predicate predicate, BiMap bimap1)
    {
        super(bimap, predicate);
        inverse = bimap1;
    }
}
