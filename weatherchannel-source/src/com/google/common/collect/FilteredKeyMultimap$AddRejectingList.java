// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ForwardingList, FilteredKeyMultimap

static class key extends ForwardingList
{

    final Object key;

    public void add(int i, Object obj)
    {
        Preconditions.checkPositionIndex(i, 0);
        obj = String.valueOf(String.valueOf(key));
        throw new IllegalArgumentException((new StringBuilder(((String) (obj)).length() + 32)).append("Key does not satisfy predicate: ").append(((String) (obj))).toString());
    }

    public boolean add(Object obj)
    {
        add(0, obj);
        return true;
    }

    public boolean addAll(int i, Collection collection)
    {
        Preconditions.checkNotNull(collection);
        Preconditions.checkPositionIndex(i, 0);
        collection = String.valueOf(String.valueOf(key));
        throw new IllegalArgumentException((new StringBuilder(collection.length() + 32)).append("Key does not satisfy predicate: ").append(collection).toString());
    }

    public boolean addAll(Collection collection)
    {
        addAll(0, collection);
        return true;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected List _mthdelegate()
    {
        return Collections.emptyList();
    }

    (Object obj)
    {
        key = obj;
    }
}
