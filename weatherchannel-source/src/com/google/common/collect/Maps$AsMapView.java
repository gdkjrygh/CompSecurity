// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, Collections2

private static class kNotNull extends stractMap
{

    final Function function;
    private final Set set;

    Set backingSet()
    {
        return set;
    }

    public void clear()
    {
        backingSet().clear();
    }

    public boolean containsKey(Object obj)
    {
        return backingSet().contains(obj);
    }

    protected Set createEntrySet()
    {
        return new Maps.EntrySet() {

            final Maps.AsMapView this$0;

            public Iterator iterator()
            {
                return Maps.asMapEntryIterator(backingSet(), function);
            }

            Map map()
            {
                return Maps.AsMapView.this;
            }

            
            {
                this$0 = Maps.AsMapView.this;
                super();
            }
        };
    }

    public Set createKeySet()
    {
        return Maps.access$200(backingSet());
    }

    Collection createValues()
    {
        return Collections2.transform(set, function);
    }

    public Object get(Object obj)
    {
        if (Collections2.safeContains(backingSet(), obj))
        {
            return function.apply(obj);
        } else
        {
            return null;
        }
    }

    public Object remove(Object obj)
    {
        if (backingSet().remove(obj))
        {
            return function.apply(obj);
        } else
        {
            return null;
        }
    }

    public int size()
    {
        return backingSet().size();
    }

    init>(Set set1, Function function1)
    {
        set = (Set)Preconditions.checkNotNull(set1);
        function = (Function)Preconditions.checkNotNull(function1);
    }
}
