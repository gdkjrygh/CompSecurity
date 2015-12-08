// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, ConcurrentHashMultiset, Collections2

class val.delegate extends ForwardingSet
{

    final ConcurrentHashMultiset this$0;
    final Set val$delegate;

    public boolean contains(Object obj)
    {
        return obj != null && Collections2.safeContains(val$delegate, obj);
    }

    public boolean containsAll(Collection collection)
    {
        return standardContainsAll(collection);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Set _mthdelegate()
    {
        return val$delegate;
    }

    public boolean remove(Object obj)
    {
        return obj != null && Collections2.safeRemove(val$delegate, obj);
    }

    public boolean removeAll(Collection collection)
    {
        return standardRemoveAll(collection);
    }

    ()
    {
        this$0 = final_concurrenthashmultiset;
        val$delegate = Set.this;
        super();
    }
}
