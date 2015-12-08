// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            ForwardingSortedMap, Maps, Iterables, Iterators, 
//            CollectPreconditions

public abstract class ForwardingNavigableMap extends ForwardingSortedMap
    implements NavigableMap
{
    protected class StandardDescendingMap extends Maps.DescendingMap
    {

        final ForwardingNavigableMap this$0;

        protected Iterator entryIterator()
        {
            return new Iterator() {

                private java.util.Map.Entry nextOrNull;
                final StandardDescendingMap this$1;
                private java.util.Map.Entry toRemove;

                public boolean hasNext()
                {
                    return nextOrNull != null;
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    if (!hasNext())
                    {
                        throw new NoSuchElementException();
                    }
                    java.util.Map.Entry entry = nextOrNull;
                    toRemove = nextOrNull;
                    nextOrNull = forward().lowerEntry(nextOrNull.getKey());
                    return entry;
                    Exception exception;
                    exception;
                    toRemove = nextOrNull;
                    nextOrNull = forward().lowerEntry(nextOrNull.getKey());
                    throw exception;
                }

                public void remove()
                {
                    boolean flag;
                    if (toRemove != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    CollectPreconditions.checkRemove(flag);
                    forward().remove(toRemove.getKey());
                    toRemove = null;
                }

            
            {
                this$1 = StandardDescendingMap.this;
                super();
                toRemove = null;
                nextOrNull = forward().lastEntry();
            }
            };
        }

        NavigableMap forward()
        {
            return ForwardingNavigableMap.this;
        }

        public StandardDescendingMap()
        {
            this$0 = ForwardingNavigableMap.this;
            super();
        }
    }

    protected class StandardNavigableKeySet extends Maps.NavigableKeySet
    {

        final ForwardingNavigableMap this$0;

        public StandardNavigableKeySet()
        {
            this$0 = ForwardingNavigableMap.this;
            super(ForwardingNavigableMap.this);
        }
    }


    protected ForwardingNavigableMap()
    {
    }

    public java.util.Map.Entry ceilingEntry(Object obj)
    {
        return _mthdelegate().ceilingEntry(obj);
    }

    public Object ceilingKey(Object obj)
    {
        return _mthdelegate().ceilingKey(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Map _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract NavigableMap _mthdelegate();

    protected volatile SortedMap _mthdelegate()
    {
        return _mthdelegate();
    }

    public NavigableSet descendingKeySet()
    {
        return _mthdelegate().descendingKeySet();
    }

    public NavigableMap descendingMap()
    {
        return _mthdelegate().descendingMap();
    }

    public java.util.Map.Entry firstEntry()
    {
        return _mthdelegate().firstEntry();
    }

    public java.util.Map.Entry floorEntry(Object obj)
    {
        return _mthdelegate().floorEntry(obj);
    }

    public Object floorKey(Object obj)
    {
        return _mthdelegate().floorKey(obj);
    }

    public NavigableMap headMap(Object obj, boolean flag)
    {
        return _mthdelegate().headMap(obj, flag);
    }

    public java.util.Map.Entry higherEntry(Object obj)
    {
        return _mthdelegate().higherEntry(obj);
    }

    public Object higherKey(Object obj)
    {
        return _mthdelegate().higherKey(obj);
    }

    public java.util.Map.Entry lastEntry()
    {
        return _mthdelegate().lastEntry();
    }

    public java.util.Map.Entry lowerEntry(Object obj)
    {
        return _mthdelegate().lowerEntry(obj);
    }

    public Object lowerKey(Object obj)
    {
        return _mthdelegate().lowerKey(obj);
    }

    public NavigableSet navigableKeySet()
    {
        return _mthdelegate().navigableKeySet();
    }

    public java.util.Map.Entry pollFirstEntry()
    {
        return _mthdelegate().pollFirstEntry();
    }

    public java.util.Map.Entry pollLastEntry()
    {
        return _mthdelegate().pollLastEntry();
    }

    protected java.util.Map.Entry standardCeilingEntry(Object obj)
    {
        return tailMap(obj, true).firstEntry();
    }

    protected Object standardCeilingKey(Object obj)
    {
        return Maps.keyOrNull(ceilingEntry(obj));
    }

    protected NavigableSet standardDescendingKeySet()
    {
        return descendingMap().navigableKeySet();
    }

    protected java.util.Map.Entry standardFirstEntry()
    {
        return (java.util.Map.Entry)Iterables.getFirst(entrySet(), null);
    }

    protected Object standardFirstKey()
    {
        java.util.Map.Entry entry = firstEntry();
        if (entry == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return entry.getKey();
        }
    }

    protected java.util.Map.Entry standardFloorEntry(Object obj)
    {
        return headMap(obj, true).lastEntry();
    }

    protected Object standardFloorKey(Object obj)
    {
        return Maps.keyOrNull(floorEntry(obj));
    }

    protected SortedMap standardHeadMap(Object obj)
    {
        return headMap(obj, false);
    }

    protected java.util.Map.Entry standardHigherEntry(Object obj)
    {
        return tailMap(obj, false).firstEntry();
    }

    protected Object standardHigherKey(Object obj)
    {
        return Maps.keyOrNull(higherEntry(obj));
    }

    protected java.util.Map.Entry standardLastEntry()
    {
        return (java.util.Map.Entry)Iterables.getFirst(descendingMap().entrySet(), null);
    }

    protected Object standardLastKey()
    {
        java.util.Map.Entry entry = lastEntry();
        if (entry == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return entry.getKey();
        }
    }

    protected java.util.Map.Entry standardLowerEntry(Object obj)
    {
        return headMap(obj, false).lastEntry();
    }

    protected Object standardLowerKey(Object obj)
    {
        return Maps.keyOrNull(lowerEntry(obj));
    }

    protected java.util.Map.Entry standardPollFirstEntry()
    {
        return (java.util.Map.Entry)Iterators.pollNext(entrySet().iterator());
    }

    protected java.util.Map.Entry standardPollLastEntry()
    {
        return (java.util.Map.Entry)Iterators.pollNext(descendingMap().entrySet().iterator());
    }

    protected SortedMap standardSubMap(Object obj, Object obj1)
    {
        return subMap(obj, true, obj1, false);
    }

    protected SortedMap standardTailMap(Object obj)
    {
        return tailMap(obj, true);
    }

    public NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return _mthdelegate().subMap(obj, flag, obj1, flag1);
    }

    public NavigableMap tailMap(Object obj, boolean flag)
    {
        return _mthdelegate().tailMap(obj, flag);
    }
}
