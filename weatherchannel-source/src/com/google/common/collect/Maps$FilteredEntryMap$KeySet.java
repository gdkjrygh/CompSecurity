// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            Maps, Iterables, Lists

class this._cls0 extends this._cls0
{

    final iterator this$0;

    private boolean removeIf(Predicate predicate)
    {
        return Iterables.removeIf(red.entrySet(), Predicates.and(te, Maps.keyPredicateOnEntries(predicate)));
    }

    public boolean remove(Object obj)
    {
        if (sKey(obj))
        {
            red.remove(obj);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        return removeIf(Predicates.in(collection));
    }

    public boolean retainAll(Collection collection)
    {
        return removeIf(Predicates.not(Predicates.in(collection)));
    }

    public Object[] toArray()
    {
        return Lists.newArrayList(iterator()).toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return Lists.newArrayList(iterator()).toArray(aobj);
    }

    ()
    {
        this$0 = this._cls0.this;
        super(this._cls0.this);
    }
}
