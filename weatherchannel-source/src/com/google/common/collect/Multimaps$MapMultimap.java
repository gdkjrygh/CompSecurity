// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, SetMultimap, Multimaps, Maps, 
//            Multimap, CollectPreconditions

private static class l extends AbstractMultimap
    implements SetMultimap, Serializable
{

    private static final long serialVersionUID = 0x6cdfd44a398c560fL;
    final Map map;

    public void clear()
    {
        map.clear();
    }

    public boolean containsEntry(Object obj, Object obj1)
    {
        return map.entrySet().contains(Maps.immutableEntry(obj, obj1));
    }

    public boolean containsKey(Object obj)
    {
        return map.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return map.containsValue(obj);
    }

    Map createAsMap()
    {
        return new (this);
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        return map.entrySet();
    }

    Iterator entryIterator()
    {
        return map.entrySet().iterator();
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public Set get(final Object key)
    {
        return new Sets.ImprovedAbstractSet() {

            final Multimaps.MapMultimap this$0;
            final Object val$key;

            public Iterator iterator()
            {
                return new Iterator() {

                    int i;
                    final _cls1 this$1;

                    public boolean hasNext()
                    {
                        return i == 0 && map.containsKey(key);
                    }

                    public Object next()
                    {
                        if (!hasNext())
                        {
                            throw new NoSuchElementException();
                        } else
                        {
                            i = i + 1;
                            return map.get(key);
                        }
                    }

                    public void remove()
                    {
                        boolean flag = true;
                        if (i != 1)
                        {
                            flag = false;
                        }
                        CollectPreconditions.checkRemove(flag);
                        i = -1;
                        map.remove(key);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                };
            }

            public int size()
            {
                return !map.containsKey(key) ? 0 : 1;
            }

            
            {
                this$0 = Multimaps.MapMultimap.this;
                key = obj;
                super();
            }
        };
    }

    public int hashCode()
    {
        return map.hashCode();
    }

    public Set keySet()
    {
        return map.keySet();
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
        return map.entrySet().remove(Maps.immutableEntry(obj, obj1));
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public Set removeAll(Object obj)
    {
        HashSet hashset = new HashSet(2);
        if (!map.containsKey(obj))
        {
            return hashset;
        } else
        {
            hashset.add(map.remove(obj));
            return hashset;
        }
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public Set replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return map.size();
    }

    public Collection values()
    {
        return map.values();
    }

    et(Map map1)
    {
        map = (Map)Preconditions.checkNotNull(map1);
    }
}
