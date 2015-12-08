// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMultimap, Multimaps, Multimap, Maps, 
//            Multisets, Multiset

private static class delegate extends ForwardingMultimap
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Multimap _flddelegate;
    transient Collection entries;
    transient Set keySet;
    transient Multiset keys;
    transient Map map;
    transient Collection values;

    public Map asMap()
    {
        Map map2 = map;
        Map map1 = map2;
        if (map2 == null)
        {
            map1 = Collections.unmodifiableMap(Maps.transformValues(_flddelegate.asMap(), new Function() {

                final Multimaps.UnmodifiableMultimap this$0;

                public volatile Object apply(Object obj)
                {
                    return apply((Collection)obj);
                }

                public Collection apply(Collection collection)
                {
                    return Multimaps.access$000(collection);
                }

            
            {
                this$0 = Multimaps.UnmodifiableMultimap.this;
                super();
            }
            }));
            map = map1;
        }
        return map1;
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    protected Multimap _mthdelegate()
    {
        return _flddelegate;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public Collection entries()
    {
        Collection collection1 = entries;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = Multimaps.access$100(_flddelegate.entries());
            entries = collection;
        }
        return collection;
    }

    public Collection get(Object obj)
    {
        return Multimaps.access$000(_flddelegate.get(obj));
    }

    public Set keySet()
    {
        Set set1 = keySet;
        Set set = set1;
        if (set1 == null)
        {
            set = Collections.unmodifiableSet(_flddelegate.keySet());
            keySet = set;
        }
        return set;
    }

    public Multiset keys()
    {
        Multiset multiset1 = keys;
        Multiset multiset = multiset1;
        if (multiset1 == null)
        {
            multiset = Multisets.unmodifiableMultiset(_flddelegate.keys());
            keys = multiset;
        }
        return multiset;
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
        throw new UnsupportedOperationException();
    }

    public Collection removeAll(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public Collection replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public Collection values()
    {
        Collection collection1 = values;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = Collections.unmodifiableCollection(_flddelegate.values());
            values = collection;
        }
        return collection;
    }

    _cls1.this._cls0(Multimap multimap)
    {
        _flddelegate = (Multimap)Preconditions.checkNotNull(multimap);
    }
}
