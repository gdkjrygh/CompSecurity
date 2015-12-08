// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, AbstractBiMap, Maps

private class <init> extends ForwardingSet
{

    final AbstractBiMap this$0;
    final Set valuesDelegate;

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
        return valuesDelegate;
    }

    public Iterator iterator()
    {
        return Maps.valueIterator(entrySet().iterator());
    }

    public Object[] toArray()
    {
        return standardToArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return standardToArray(aobj);
    }

    public String toString()
    {
        return standardToString();
    }

    private ()
    {
        this$0 = AbstractBiMap.this;
        super();
        valuesDelegate = inverse.keySet();
    }

    valuesDelegate(valuesDelegate valuesdelegate)
    {
        this();
    }
}
