// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, Multimaps, Multimap, Maps, 
//            Collections2, Iterators, Lists, Multiset

private static class transformer extends AbstractMultimap
{

    final Multimap fromMultimap;
    final transformer transformer;

    public void clear()
    {
        fromMultimap.clear();
    }

    public boolean containsKey(Object obj)
    {
        return fromMultimap.containsKey(obj);
    }

    Map createAsMap()
    {
        return Maps.transformEntries(fromMultimap.asMap(), new Maps.EntryTransformer() {

            final Multimaps.TransformedEntriesMultimap this$0;

            public volatile Object transformEntry(Object obj, Object obj1)
            {
                return transformEntry(obj, (Collection)obj1);
            }

            public Collection transformEntry(Object obj, Collection collection)
            {
                return transform(obj, collection);
            }

            
            {
                this$0 = Multimaps.TransformedEntriesMultimap.this;
                super();
            }
        });
    }

    Collection createValues()
    {
        return Collections2.transform(fromMultimap.entries(), Maps.asEntryToValueFunction(transformer));
    }

    Iterator entryIterator()
    {
        return Iterators.transform(fromMultimap.entries().iterator(), Maps.asEntryToEntryFunction(transformer));
    }

    public Collection get(Object obj)
    {
        return transform(obj, fromMultimap.get(obj));
    }

    public boolean isEmpty()
    {
        return fromMultimap.isEmpty();
    }

    public Set keySet()
    {
        return fromMultimap.keySet();
    }

    public Multiset keys()
    {
        return fromMultimap.keys();
    }

    public boolean put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Multimap multimap)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj, Object obj1)
    {
        return get(obj).remove(obj1);
    }

    public Collection removeAll(Object obj)
    {
        return transform(obj, fromMultimap.removeAll(obj));
    }

    public Collection replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return fromMultimap.size();
    }

    Collection transform(Object obj, Collection collection)
    {
        obj = Maps.asValueToValueFunction(transformer, obj);
        if (collection instanceof List)
        {
            return Lists.transform((List)collection, ((com.google.common.base.Function) (obj)));
        } else
        {
            return Collections2.transform(collection, ((com.google.common.base.Function) (obj)));
        }
    }

    _cls1.this._cls0(Multimap multimap, _cls1.this._cls0 _pcls0)
    {
        fromMultimap = (Multimap)Preconditions.checkNotNull(multimap);
        transformer = (transformer)Preconditions.checkNotNull(_pcls0);
    }
}
