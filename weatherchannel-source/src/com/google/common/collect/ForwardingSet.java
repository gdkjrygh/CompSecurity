// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, Sets

public abstract class ForwardingSet extends ForwardingCollection
    implements Set
{

    protected ForwardingSet()
    {
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract Set _mthdelegate();

    public boolean equals(Object obj)
    {
        return obj == this || _mthdelegate().equals(obj);
    }

    public int hashCode()
    {
        return _mthdelegate().hashCode();
    }

    protected boolean standardEquals(Object obj)
    {
        return Sets.equalsImpl(this, obj);
    }

    protected int standardHashCode()
    {
        return Sets.hashCodeImpl(this);
    }

    protected boolean standardRemoveAll(Collection collection)
    {
        return Sets.removeAllImpl(this, (Collection)Preconditions.checkNotNull(collection));
    }
}
