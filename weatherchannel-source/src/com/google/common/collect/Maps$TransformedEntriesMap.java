// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, Iterators

static class transformer extends transformer
{

    final Map fromMap;
    final fromMap transformer;

    public void clear()
    {
        fromMap.clear();
    }

    public boolean containsKey(Object obj)
    {
        return fromMap.containsKey(obj);
    }

    protected Set createEntrySet()
    {
        return new Maps.EntrySet() {

            final Maps.TransformedEntriesMap this$0;

            public Iterator iterator()
            {
                return Iterators.transform(fromMap.entrySet().iterator(), Maps.asEntryToEntryFunction(transformer));
            }

            Map map()
            {
                return Maps.TransformedEntriesMap.this;
            }

            
            {
                this$0 = Maps.TransformedEntriesMap.this;
                super();
            }
        };
    }

    public Object get(Object obj)
    {
        Object obj1 = fromMap.get(obj);
        if (obj1 != null || fromMap.containsKey(obj))
        {
            return transformer.formEntry(obj, obj1);
        } else
        {
            return null;
        }
    }

    public Set keySet()
    {
        return fromMap.keySet();
    }

    public Object remove(Object obj)
    {
        if (fromMap.containsKey(obj))
        {
            return transformer.formEntry(obj, fromMap.remove(obj));
        } else
        {
            return null;
        }
    }

    public int size()
    {
        return fromMap.size();
    }

    _cls1.this._cls0(Map map, _cls1.this._cls0 _pcls0)
    {
        fromMap = (Map)Preconditions.checkNotNull(map);
        transformer = (transformer)Preconditions.checkNotNull(_pcls0);
    }
}
