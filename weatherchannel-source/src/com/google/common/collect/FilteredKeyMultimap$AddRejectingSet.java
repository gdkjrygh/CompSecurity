// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, FilteredKeyMultimap

static class key extends ForwardingSet
{

    final Object key;

    public boolean add(Object obj)
    {
        obj = String.valueOf(String.valueOf(key));
        throw new IllegalArgumentException((new StringBuilder(((String) (obj)).length() + 32)).append("Key does not satisfy predicate: ").append(((String) (obj))).toString());
    }

    public boolean addAll(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        collection = String.valueOf(String.valueOf(key));
        throw new IllegalArgumentException((new StringBuilder(collection.length() + 32)).append("Key does not satisfy predicate: ").append(collection).toString());
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
        return Collections.emptySet();
    }

    (Object obj)
    {
        key = obj;
    }
}
