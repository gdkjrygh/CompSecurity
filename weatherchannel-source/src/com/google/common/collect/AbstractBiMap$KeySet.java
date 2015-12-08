// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, AbstractBiMap, Maps

private class <init> extends ForwardingSet
{

    final AbstractBiMap this$0;

    public void clear()
    {
        AbstractBiMap.this.clear();
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
        return AbstractBiMap.access$200(AbstractBiMap.this).keySet();
    }

    public Iterator iterator()
    {
        return Maps.keyIterator(entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        if (!contains(obj))
        {
            return false;
        } else
        {
            AbstractBiMap.access$300(AbstractBiMap.this, obj);
            return true;
        }
    }

    public boolean removeAll(Collection collection)
    {
        return standardRemoveAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return standardRetainAll(collection);
    }

    private ()
    {
        this$0 = AbstractBiMap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
